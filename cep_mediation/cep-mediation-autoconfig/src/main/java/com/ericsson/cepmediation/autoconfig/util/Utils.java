package com.ericsson.cepmediation.autoconfig.util;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.model.Config;
import com.ericsson.cepmediation.autoconfig.model.Host;
import com.ericsson.cepmediation.autoconfig.model.Rnc;
import com.ericsson.cepmediation.autoconfig.model.Sgsn;
import com.ericsson.cepmediation.autoconfig.model.UserPlane;
import com.ericsson.cepmediation.autoconfig.properties.AutoconfigProperties;
import com.ericsson.cepmediation.base.database.iq.IqDatabaseManager;
import com.ericsson.cepmediation.base.licensing.CannotAccessLicensingServiceException;
import com.ericsson.cepmediation.base.licensing.LicensingService;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.util.FileUtils;
import com.ericsson.cepmediation.config.bean.FeaturesEnum;
import com.ericsson.cepmediation.loading.filecollection.local.LocalFileAgent;

/**
 * This is an utility class to populate list of RNCs,SGSNs and UserPlanes
 * Populates available Memory and CPUs from each Host and sum them up
 * Checks License for Session Browser and also checks if it is enabled in config.xml
 * 
 * @author evikkua
 *
 */
public class Utils {
    private static final Logger logger = LoggerFactory.getLogger(Utils.class);

    static GpehPathHelper gpehPathHelper = new GpehPathHelper();
    
    static SgehPathHelper sgehPathHelper = new SgehPathHelper();
    
    /**
     * This method returns the summation of available memory of each host
     * @param config
     * @return Available memory on all the hosts
     */
    public static long getAvailableMemory(Config config) {
        long avilableMemory = 0;
        try {
            for (Host host : config.getHosts()) {
                avilableMemory = avilableMemory + host.getRemainingMemory();
            }
            return avilableMemory;
        } catch (Throwable e) {
            logger.error("Error retrieving total memory!", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * This method returns the summation of available CPUs of each host
     * @param config
     * @return Available CPUs on all the hosts
     */
    public static int getAvailableCPUs(Config config) {
        int cpus = 0;
        try {
            for (Host host : config.getHosts()) {
                cpus = cpus + host.getRemainingCPUs();
            }
            return cpus;
        } catch (Throwable e) {
            logger.error("Error retrieving available cpus!", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * This method returns sorted list of RNCs based on number of cells per RNC
     * @param config
     * @return RNC list
     */
    public static List<Rnc> getRncList(Config config) {
        //getRNCList method of IqDatabaseManager returns Map which is also used by evolution module
        Map<String, Integer> rncs = IqDatabaseManager.getInstance().getRNCList();
        return getRNCs(config, rncs);
    }

    /**
     * @param config
     * @param rncs
     * @return RNC list
     * @throws RuntimeException
     */
    public static List<Rnc> getRNCs(Config config, Map<String, Integer> rncs) throws RuntimeException {
        try {
            if (rncs == null || rncs.isEmpty()) {
                logger.error("Unable to retrive active RNCs from Database");
                return new ArrayList<Rnc>(0);
            }

            List<Rnc> res = new ArrayList<Rnc>(rncs.size());
            Set<String> excludedRncs = AutoconfigProperties.instance.getExcludedRncs();
            for (String key : rncs.keySet()) {
                String nePath = gpehPathHelper.getNEPath(key);
                if (nePath == null || nePath.isEmpty() || excludedRncs.contains(key.toLowerCase())) {
                    continue;
                }
                Rnc rnc = new Rnc();
                rnc.setRootPath(nePath);
                rnc.setName(key);
                rnc.setCells(rncs.get(key));
                rnc.setRopOneMin(isOneMinRop(rnc.getRootPath()));
                res.add(rnc);
            }
            Collections.sort(res);
            return res;
        } catch (Throwable e) {
            logger.error("Unable to retrieve active RNCs from Database!", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * This method returns list of SGSNs
     * Using SGSN class to just store SGSN name and rootPath as of now
     * @param config
     * @return SGSN list
     */
    public static List<Sgsn> getSgsnList(Config config) {
        List<String> sgsns = IqDatabaseManager.getInstance().getSGSNList();
        return getSGSNs(config, sgsns);
    }

    /**
     * @param config
     * @param sgsns
     * @return SGSN list
     * @throws RuntimeException
     */
    public static List<Sgsn> getSGSNs(Config config, List<String> sgsns) throws RuntimeException {
        try {
            if (sgsns == null || sgsns.isEmpty()) {
                logger.warn("Unable to retrive active SGSNs from Database");
                return new ArrayList<Sgsn>(0);
            }

            List<Sgsn> resgsn = new ArrayList<Sgsn>(sgsns.size());
            Set<String> excludedSgsns = AutoconfigProperties.instance.getExcludedSgsns();
            for (String sgsn : sgsns) {
                String nePath = sgehPathHelper.getNEPath(sgsn);
                if (nePath == null || nePath.isEmpty() || excludedSgsns.contains(sgsn.toLowerCase())) {
                    continue;
                }
                Sgsn sgsnNe = new Sgsn();
                sgsnNe.setRootPath(nePath);
                sgsnNe.setName(sgsn);
                resgsn.add(sgsnNe);
            }

            return resgsn;
        } catch (Throwable e) {
            logger.error("Unable to retrieve active SGSNs from Database " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /**
     * This method returns list of UserPlane after getting user plane information from pcp hint file (pcp-config.xml)
     * Using Jdom parser to read the hint file
     * @param config
     * @return User Plane List
     */
    public static List<UserPlane> getUPList(Config config) {
        String pcpConfigXML = config.getPcapXML();
        List<UserPlane> userPlaneList = new ArrayList<UserPlane>();
        UserPlane up;
        try {
            XMLParser parser = new XMLParser();
            Document doc = parser.readXML(pcpConfigXML);

            if (doc == null) {
                logger.error("Unable to read pcp-config.xml file");
                return null;
            }
            Element rootNode = doc.getRootElement();
            List<Element> ne = castList(Element.class, rootNode.getChildren("network-element"));
            String path = config.getUpRootPath();
            int i = 1;
            for (Element e : ne) {
                up = new UserPlane();
                up.setName("PCP" + i);
                up.setPath(path);
                up.setIp(e.getChild("ip").getValue());
                up.setUserName(e.getChild("uname").getValue());
                up.setPassword(e.getChild("password").getValue());
                userPlaneList.add(up);
                i++;
            }
            return userPlaneList;
        } catch (IOException io) {
            logger.error("Input Output exception happened, please check read permision of " + pcpConfigXML);
            throw new RuntimeException(io);
        } catch (JDOMException e) {
            logger.error("Parsing failed, error occurred in JDOM application");
            throw new RuntimeException(e);
        } catch (Throwable e) {
            logger.error("Unable to retrive User Plane list!" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /**
     * This method checks Session Browser license and enabled/disabled status in config.xml
     * @return boolean
     */
    public static boolean isSBEnabled() {
        try {
            List<FeaturesEnum> enabledFeatures = ConfigBinder.getInstance().getEnabledFeatures();
            return LicensingService.getInstance().hasSessionBrowserLicense() && enabledFeatures.contains(FeaturesEnum.SESSION_BROWSER);
        } catch (CannotAccessLicensingServiceException e) {
            logger.warn("Error accessing licensing service", e);
            return false;
        } catch (Exception e) {
            logger.error("Error accessing licensing service", e);
            return false;
        }
    }

    /**
     * To ignore SuppressWarnings while accessing Elements from JDOM parser
     * @param clazz
     * @param c
     * @return
     */

    private static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
        List<T> r = new ArrayList<T>(c.size());
        for (Object o : c)
            r.add(clazz.cast(o));
        return r;
    }

    /**
     * This mehtod validates the IP address format (ex. XXX.XXX.XXX.XXX) and also the range
     * @param ip
     * @return boolean
     */
    public static boolean validateIP(final String ip) {

        final String PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    /**
     * 
     * @param directoryPath
     * @param fileFilter
     * @return
     */
    public static boolean isOneMinRop(String directoryPath) {
        try {
            File dir = new File(directoryPath);
            if (!dir.exists()) {
                return false;
            }
            LocalFileAgent localFileAgent = new LocalFileAgent();
            String[] paths = localFileAgent.listDirectories(directoryPath);
            for (String path : paths) {
                final File directory = new File(path);
                final File[] files = directory.listFiles(getFileFilter("A(.*)"));
                if (files != null && files.length > 0) {
                    String fileName = files[0].getName();
                    fileName = fileName.replaceAll("\\+\\d\\d\\d\\d", "");
                    Pattern p = Pattern.compile("(\\d+)-(\\d+)");
                    Matcher m = p.matcher(fileName);
                    if (m.find()) {
                        DateFormat formatter = new SimpleDateFormat("HHmm");
                        Date d1 = formatter.parse(m.group(1));
                        Date d2 = formatter.parse(m.group(2));

                        long duration;
                        if (m.group(2).equals("0000")) { // for 0000 add one day
                            duration = ((d2.getTime() + (1000 * 60 * 60 * 24)) - d1.getTime()) / (1000 * 60);
                        } else {
                            duration = (d2.getTime() - d1.getTime()) / (1000 * 60);
                        }
                        if (duration == 1) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.warn("Could not determine whether rop is one minute: " + directoryPath + ". Defaulting to false");
            return false;
        }
        return false;
    }

    /**
     * 
     * @param fileFilter
     * @return
     */
    private static FileFilter getFileFilter(final String fileFilter) {
        return new FileFilter() {
            Pattern filePattern = Pattern.compile(".*" + fileFilter + ".*");

            @Override
            public boolean accept(final File file) {
                final String name = file.getName();
                return file.isFile() && (filePattern.matcher(name).matches());
            }

        };
    }

    /**
     * 
     * @param rncs
     * @param isOneMinRop
     * @return
     */
    public static List<Rnc> getRncROP(List<Rnc> rncs, boolean isOneMinRop) {
        List<Rnc> res = new ArrayList<Rnc>();
        for (Rnc rnc : rncs) {
            if (isOneMinRop == rnc.isRopOneMin()) {
                res.add(rnc);
            }
        }
        Collections.sort(res);
        return res;
    }
    
    public static List<File> getMatchingSubDirs(File parent, final String regex) {
        File[] matches = parent.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()) {
                    return pathname.getName().toLowerCase().matches(regex.trim().toLowerCase());
                }
                
                return false;
            }
        });

        if (matches == null || matches.length == 0) {
            return null;
        }
        
        return Arrays.asList(matches);
    }
}