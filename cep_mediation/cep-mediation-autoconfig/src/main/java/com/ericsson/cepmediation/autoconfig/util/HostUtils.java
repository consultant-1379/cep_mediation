package com.ericsson.cepmediation.autoconfig.util;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.model.Host;

/**
 * This is an utility class to read the host information from cep_mediation.ini
 * Also to get available memory and cpu of each host
 * @author evikkua
 *
 */
public class HostUtils {
    private static final Logger logger = LoggerFactory.getLogger(HostUtils.class);

    public static HostUtils instance = new HostUtils();

    private static final String cepIni = "/eniq/sw/conf/cep_mediation.ini";

    /**
     * This method reads host information from cep_mediation.ini file
     * @return List of Host with IP address, available memory and cpus
     */
    public List<Host> getHosts() {

        List<Host> hosts = new ArrayList<Host>();
        // To-Do Can we make it configurable?
        // Using dcuser to execute SSH commands on hosts. Assuming dcuser with below credentials will be available on all the hosts.
        final String UNAME = "dcuser";
        final String PASSWD = "dcuser";
        final String HOME = "/eniq/home/dcuser";

        try {
            Map<String, Map<String, String>> parameters = IniUtils.instance.readIniFile(new File(cepIni));

            Map<String, String> servers = parameters.get("CEP_MEDIATION");

            if (servers != null && servers.size() >= 1) {

                for (String server : servers.keySet()) {

                    Map<String, String> serverInfo = parameters.get(server);

                    if (serverInfo != null) {
                        String name = serverInfo.get("CEP_MED_HOSTNAME");
                        String ipAddr = serverInfo.get("SERVICES_IP");

                        if (Utils.validateIP(ipAddr) == false) {
                            logger.error("Host " + name + " IP address format is incorrect!! " + ipAddr);
                            return null;
                        }

                        //Initializing SSH agent with credentials
                        HostSSHAgent hostSSHAgent = new HostSSHAgent(ipAddr, UNAME, PASSWD, HOME);

                        String[] outputResult = hostSSHAgent.getMemoryAndCPUs();

                        if (outputResult != null && outputResult.length == 2) {
                            //Adding hosts to the list
                            hosts.add(new Host(name, ipAddr, isLocal(ipAddr), safeParseLong(outputResult[0]), safeParseInt(outputResult[1])));
                        } else {
                            return null;
                        }

                    }
                }
            }
        } catch (IOException e) {
            logger.error("Error in reading " + cepIni + " file" + e.getMessage());
            throw new RuntimeException(e);
        }
        return hosts;
    }

    /**
     * 
     * @param ipAddr
     * @return
     */

    private boolean isLocal(String ipAddr) {

        List<InetAddress> addrs = findNetworkInterfaces();

        for (InetAddress addr : addrs) {

            if (addr.getHostAddress().equals(ipAddr)) {

                return true;
            }
        }
        return false;
    }

    /**
     * 
     * @return
     */
    public List<InetAddress> findNetworkInterfaces() {
        List<InetAddress> res = new ArrayList<InetAddress>();

        try {
            // Get all the network interfaces on this machine
            Enumeration<NetworkInterface> networkInterfaceEnum = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaceEnum.hasMoreElements()) {
                final NetworkInterface networkInterface = networkInterfaceEnum.nextElement();
                logger.debug("found local interface:" + networkInterface.getDisplayName());

                final boolean hardwareAddressesOK = checkHardwareAddress(networkInterface);
                if (hardwareAddressesOK) {
                    Enumeration<InetAddress> inetAddressEnum = networkInterface.getInetAddresses();
                    while (inetAddressEnum.hasMoreElements()) {
                        res.add(inetAddressEnum.nextElement());
                    }
                }
            }
        } catch (final SocketException e) {
            // just log the exception
            logger.error("Error geting network interfaces", e);
        }

        return res;
    }

    /**
     * 
     * @param networkInterface
     * @return
     */
    private boolean checkHardwareAddress(final NetworkInterface networkInterface) {
        try {
            if (networkInterface.getHardwareAddress() != null) {
                return true;
            }
        } catch (final SocketException e) {
            logger.warn("Exception getting hardward addresses of interface " + networkInterface, e);
        }
        return false;
    }

    /**
     * Safely parseLong from String
     * @param s
     * @return
     */

    private Long safeParseLong(String s) {
        if (s == null || s.isEmpty()) {
            return 0L;
        }
        try {
            return Long.parseLong(s);
        } catch (Exception e) {
            logger.debug("Unparseable long: " + s, e);
            return 0L;
        }
    }

    /**
     * Safely parseInt from String
     * @param s
     * @return
     */
    private Integer safeParseInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            logger.debug("Unparseable int: " + s, e);
            return 0;
        }
    }

}
