package com.ericsson.cepmediation.autoconfig.processbalancing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.model.Config;
import com.ericsson.cepmediation.autoconfig.model.Host;
import com.ericsson.cepmediation.autoconfig.model.NetworkElementDefinition;
import com.ericsson.cepmediation.autoconfig.model.ProcessDefinition;
import com.ericsson.cepmediation.autoconfig.model.Rnc;
import com.ericsson.cepmediation.autoconfig.model.RncRopList;
import com.ericsson.cepmediation.autoconfig.util.Utils;
import com.ericsson.cepmediation.base.proc.config.NE_TYPE;

/**
 * This class is responsible to allocate process (JVMs) to RNC nodes
 * Algorithm used to balance RNCs among hosts and JVMs:
 * Step 1 : Balance JVMs
 * -Compute the ratio between available memory and available jvms of each host
 * -Sort the host in decreasing order to select the highest host
 * -Compute a formula to maintain the same (highest) ratio among other hosts by decreasing available jvms
 * -Now all the host will have almost equal ratio between memory and jvms
 * Step2:
 * - Split RNC list into 15 min and 1 min rop list
 * - Allocate number of JVMs to each rop list by calculating JVM ratio. It is calculated by dividing total cells in ROP list by total cells in full RNC list.
 * - Fist trigger process balancing for 15 min rop RNC list
 * - Second trigger process balancing for 1 min rop RNC list
 * Step 3 : Balance RNCs and allocate memory
 * - Get RNC list sorted based on cells in decreasing order (largest RNC first)
 * - Get number of hosts available
 * - Calculate total number of JVMs (cpus) available from hosts
 * - Now start iterating over sorted RNC list and assign each RNC to single process (jvm) by also iterating over hosts list. Assign host to that process
 * - Do this until available JVMs = 0
 * - If RNCs are still left, now share the process
 * - Continue iterating over RNC list and assign the RNC to smallest process (process list sorted based on cells in increasing order) 
 * - Sort the process list on each iteration and assign RNC to smallest process until last RNC
 * - Allocate memory to each process by computing memoryPerCell multiplied by total cells in that process
 * Step 4: Balance memory benchmark, If memory of any process is less than RNC_FIXED_MEMORY
 * - Sort the process list increasing order and select the first process to check if it is less than RNC_FIXED_MEMORY
 * - If yes, then check if the host of that process has enough memory left to allocate more, so that process memory become RNC_FIXED_MEMORY.
 * - If not, then remove that process from the process list and share the RNCs of that process with other process in the process list
 * - Do this until all the process in the process list are greater than RNC_FIXED_MEMORY.
 * @author evikkua
 *
 */
public class ProcessRNC {
    private static final Logger logger = LoggerFactory.getLogger(ProcessRNC.class);

    Config config;

    private List<ProcessDefinition> processDefinitionsList;

    private final int RNC_FIXED_MEMORY;

    private float memoryPerCell = 0f;

    private int processId = 0;

    /**
     * Initialize config and processDefinitionsList
     * Calculated the RNC process fixed memory in KB
     * @param config
     * @param processDefinitionsList
     */
    public ProcessRNC(Config config) {
        this.config = config;
        RNC_FIXED_MEMORY = config.getGpehFixedMemory() * 1024 * 1024;
    }

    /**
     * Start balancing RNCs based on algorithm mentioned above
     * @return Process List
     */
    public List<ProcessDefinition> process() {
        if (Utils.getAvailableCPUs(config) <= 0) {
            logger.error("No JVM left to allocate RNC processes");
            return null;
        }
        List<ProcessDefinition> processDefinitionsResult = new ArrayList<ProcessDefinition>();
        List<Rnc> rncs = config.getRncs(); //Get RNC list which is sorted based on cells in decreasing order (largest RNC first)

        List<Host> hosts = config.getHosts(); // Get list of hosts available

        balanceJVMs(hosts);

        int totalJVMs = Utils.getAvailableCPUs(config);
        totalJVMs = config.isSBEnabled() ? totalJVMs / 2 : totalJVMs;

        try {
            memoryPerCell = calculateMemoryPerCell(rncs); //Total cells divided by memory available

            RncRopList rncRop1Min = null;
            RncRopList rncRop15Min = null;

            List<Rnc> rnc15MinRop = config.getRncs15Min(); //Get RNC list 15 mins rop which is sorted based on cells in decreasing order
            List<Rnc> rnc1MinRop = config.getRncs1Min(); //Get RNC list 1 min rop which is sorted based on cells in decreasing order
            int countCell15Min = countCells(rnc15MinRop); // Total count of cells in RNC list of 15 mins
            int countCell1Min = countCells(rnc1MinRop); // Total count of cells in RNC list of 1 min
            int totalCellCount = countCell15Min + countCell1Min;
            float jvmRatio = Float.valueOf(countCell15Min) / Float.valueOf(totalCellCount);
            int jvm15MinRop = Math.round(jvmRatio * totalJVMs);
            int jvm1MinRop = totalJVMs - jvm15MinRop;
            // if roundoff returns nearest value 0, then check if ROP has any cell or not
            if (jvm1MinRop <= 0 && countCell1Min > 0) {
                jvm15MinRop = totalJVMs - 1;
                jvm1MinRop = 1;
            } else if (jvm15MinRop <= 0 && countCell15Min > 0) {
                jvm1MinRop = totalJVMs - 1;
                jvm15MinRop = 1;
            }

            if (rnc15MinRop != null && !rnc15MinRop.isEmpty()) {
                rncRop15Min = new RncRopList();
                rncRop15Min.setRncs(rnc15MinRop);
                rncRop15Min.setCells(countCell15Min);
                rncRop15Min.setJvms(jvm15MinRop);
                rncRop15Min.setMemory(memoryPerCell * countCell15Min);
            }

            if (rnc1MinRop != null && !rnc1MinRop.isEmpty()) {
                rncRop1Min = new RncRopList();
                rncRop1Min.setRncs(rnc1MinRop);
                rncRop1Min.setCells(countCell1Min);
                rncRop1Min.setJvms(jvm1MinRop);
                rncRop1Min.setMemory(memoryPerCell * countCell1Min);
            }

            // Setting the upper limit of memory per cell
            if (memoryPerCell > (config.getMemoryUpperLimit() * 1024)) {
                memoryPerCell = config.getMemoryUpperLimit() * 1024;
            }

            if (rncRop15Min != null) {
                processDefinitionsList = balanceRNCProcess(rncRop15Min, hosts);
                processDefinitionsResult.addAll(processDefinitionsList);
            }

            if (rncRop1Min != null) {
                processDefinitionsList = balanceRNCProcess(rncRop1Min, hosts);
                processDefinitionsResult.addAll(processDefinitionsList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error in processing " + e.getMessage());
            throw new RuntimeException(e);
        }

        return processDefinitionsResult;
    }

    /**
     * Balance the RNCs based of algorithm mentioned above
     * @param rncRopList
     * @param hosts
     * @return
     */
    private List<ProcessDefinition> balanceRNCProcess(RncRopList rncRopList, List<Host> hosts) {
        try {
            processDefinitionsList = new ArrayList<ProcessDefinition>();
            List<Rnc> rncs = rncRopList.getRncs();
            ProcessDefinition processDefinition;
            final boolean isSBEnabled = config.isSBEnabled();
            for (int i = 0; i < rncs.size();) { // Start iterating over RNC list
                if (rncRopList.getJvms() > 0) { // Check if available cpus (JVMs) are greater than 0 and assign single jvm to each RNC first
                    for (Host host : hosts) { // Start iterating over hosts list to assign host to the process
                        if (host.getRemainingCPUs() > 0 && i < rncs.size()) { // Check if remaining cpus of current host is greater than 0
                            Rnc rnc = rncs.get(i);
                            ++processId;
                            processDefinition = createNewProcess(processId, isSBEnabled, host, rnc, rncRopList);
                            processDefinitionsList.add(processDefinition); // Add process to process list
                            i++;
                        }
                    }
                } else { // If jvms are over and RNCs are still left, share process (jvm)
                    Rnc rnc = rncs.get(i);
                    shareProcess(rnc, rncRopList);
                    i++;
                }
            }
            balanceMemoryBenchmark(rncRopList);
            return processDefinitionsList;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error in balancing RNC processes " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /**
     * Create new process and add network element
     * @param processId
     * @param isSBEnabled
     * @param host
     * @param rnc
     * @param rncRopList 
     * @return ProcessDefinition
     * @throws Exception
     */
    private ProcessDefinition createNewProcess(int processId, final boolean isSBEnabled, Host host, Rnc rnc, RncRopList rncRopList) throws Exception {
        ProcessDefinition processDefinition;
        processDefinition = new ProcessDefinition();
        processDefinition.setHost(host);
        processDefinition.setProcessId(processId);

        addNetworkElement(processDefinition, rnc, rncRopList); // Call this method to assign the current RNC to jvm of current host
        int jvmsUsed = isSBEnabled ? 2 : 1; // In case of Session Browser reserve 2 jvms per process
        host.setRemainingCPUs(host.getRemainingCPUs() - jvmsUsed); // Decrease the jvms available for current host
        rncRopList.setJvms(rncRopList.getJvms() - jvmsUsed);
        host.setCells(host.getCells() + rnc.getCells()); // Add cells to host
        return processDefinition;
    }

    /**
     * 
     * @param rncs
     * @return Calculated memory
     */

    private float calculateMemoryPerCell(List<Rnc> rncs) throws Exception {
        int cells = countCells(rncs);
        if (cells > 0) {
            return Float.valueOf(Utils.getAvailableMemory(config)) / Float.valueOf(cells);
        } else {
            return 0;
        }
    }

    /**
     * 
     * @param rncs
     * @return cells
     */
    private int countCells(List<Rnc> rncs) throws Exception {
        int cells = 0;
        if (rncs != null && !rncs.isEmpty()) {
            for (Rnc rnc : rncs) {
                cells = cells + rnc.getCells();
            }
        }
        return cells;
    }

    /**
     * This class balance JVMs based on ratio between memory and jvms between each host. And compute a formula to maintain highest ratio in the list among other hosts.
     * Algorithm:
     * -Compute the ratio between available memory and available jvms of each host. (It is already done while adding host to hosts list)
     * -Sort the host in decreasing order to select the highest host
     * -Compute a formula to maintain the same (highest) ratio among other hosts by decreasing available jvms
     * -Now all the host will have almost equal ratio between memory and jvms.
     * @param hosts
     */

    private void balanceJVMs(List<Host> hosts) {
        try {
            Collections.sort(hosts);
            float highestRatio = hosts.get(0).getRatio();
            for (Host host : hosts) {
                int cpus = host.getRemainingCPUs();
                float formulaRsult = ((highestRatio - host.getRatio()) * cpus) / highestRatio; // Formula to maintain the same (highest) ratio among other hosts.
                host.setRemainingCPUs(cpus - Math.round(formulaRsult));
            }
        } catch (Exception e) {
            logger.error("Unable to balance JVMs properly!!" + e.getMessage());
        }
    }

    /**
     * Start sharing process based on algorithm mentioned above
     * @param rnc
     * @param rncRopList 
     * @throws Exception
     */
    private void shareProcess(Rnc rnc, RncRopList rncRopList) throws Exception {
        final int FIXEDRNCS = config.getMaxRncsProcess(); // Fixed number of RNCs per process
        ProcessDefinition processDefinition;
        Collections.sort(processDefinitionsList); // Sort the process (jvm) list in increasing order (smallest process first)
        int i = 0;
        while (!processDefinitionsList.isEmpty()) {
            processDefinition = processDefinitionsList.get(i); // select the first process
            if (processDefinition.getRncs().size() >= FIXEDRNCS) {
                i++;
            } else {
                addNE(rnc, rncRopList, processDefinition);
                break;
            }
            if (i >= processDefinitionsList.size()) {
                processDefinition = processDefinitionsList.get(0);
                addNE(rnc, rncRopList, processDefinition);
                logger.warn("All the processes have more than 8 RNCs. Unable to balance " + rnc.getName() + " properly");
                break;
            }
        }
    }

    /**
     * 
     * @param rnc
     * @param rncRopList
     * @param processDefinition
     * @throws Exception
     */
    private void addNE(Rnc rnc, RncRopList rncRopList, ProcessDefinition processDefinition) throws Exception {
        addNetworkElement(processDefinition, rnc, rncRopList); // Call this method to assign the current RNC to first process
        Host host = processDefinition.getHost();
        host.setCells(host.getCells() + rnc.getCells()); //Add cells to host
    }

    /**
     * This method checks if individual process total memory is greater than RNC_FIXED_MEMORY or not
     * If not then either assign RNC_FIXED_MEMORY (if remaining memory for that host is available) to the process or remove that process from process list and distribute it's rncs among other processes.
     * @param rncRopList 
     * 
     * @throws Exception
     */
    public void balanceMemoryBenchmark(RncRopList rncRopList) throws Exception {
        while (!processDefinitionsList.isEmpty()) {
            ProcessDefinition processDefinition;
            Collections.sort(processDefinitionsList, new Comparator<ProcessDefinition>() {

                @Override
                public int compare(ProcessDefinition o1, ProcessDefinition o2) {
                    return (int) (o1.getMemory() - o2.getMemory());
                }
            }); // Sort the process (jvm) list in increasing order based on memory (smallest process first)
            processDefinition = processDefinitionsList.get(0); // select the first process
            Host host = processDefinition.getHost();
            if (processDefinition.getMemory() < RNC_FIXED_MEMORY) {
                long extraMemory = RNC_FIXED_MEMORY - processDefinition.getMemory();
                if (host.getRemainingMemory() > extraMemory && rncRopList.getMemory() > extraMemory) {
                    processDefinition.setMemory(RNC_FIXED_MEMORY);
                    host.setRemainingMemory(host.getRemainingMemory() - extraMemory); // Adjust the host remaining memory
                    rncRopList.setMemory(rncRopList.getMemory() - extraMemory);
                } else if (processDefinitionsList.size() > 1) {
                    host.setRemainingMemory(host.getRemainingMemory() + processDefinition.getMemory());
                    rncRopList.setMemory(rncRopList.getMemory() + processDefinition.getMemory());
                    host.setRemainingCPUs(host.getRemainingCPUs() + (config.isSBEnabled() ? 2 : 1));
                    rncRopList.setJvms(rncRopList.getJvms() + 1);
                    ProcessDefinition prDefinition = processDefinitionsList.remove(0);
                    List<Rnc> rncList = prDefinition.getRncs();
                    for (Rnc rnc : rncList) {
                        prDefinition.getHost().setCells(prDefinition.getHost().getCells() - rnc.getCells());
                        shareProcess(rnc, rncRopList);
                    }
                } else {
                    processDefinition.setMemory(RNC_FIXED_MEMORY);
                    break;
                }
            } else {
                break;
            }
        }
    }

    /** 
     * Add RNC to process 
     * Set RNC information to Network Element
     * @param processDefinition
     * @param rnc
     * @param rncRopList 
     */
    private void addNetworkElement(ProcessDefinition processDefinition, Rnc rnc, RncRopList rncRopList) throws Exception {
        processDefinition.getRncs().add(rnc);
        NetworkElementDefinition networkElement;
        List<NetworkElementDefinition> networkElementList;
        networkElementList = processDefinition.getNetworkElementDefinitionList();
        processDefinition.setCellsused(processDefinition.getCellsused() + rnc.getCells()); // Increasing the cells used of the process
        long calculatedMemory = Math.round(memoryPerCell * rnc.getCells()); // Calculate memory to allocated to current process
        processDefinition.setMemory(processDefinition.getMemory() + calculatedMemory);
        processDefinition.getHost().setRemainingMemory(processDefinition.getHost().getRemainingMemory() - calculatedMemory);
        rncRopList.setMemory(rncRopList.getMemory() - calculatedMemory);
        networkElement = new NetworkElementDefinition();
        networkElement.setLabel(rnc.getName());
        networkElement.setNeType(NE_TYPE.GPEH.getValue());
        networkElement.setDirectory(rnc.getRootPath());
        networkElementList.add(networkElement);
    }
}