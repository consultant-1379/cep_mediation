package com.ericsson.cepmediation.autoconfig.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is responsible for reading autoconfig.properties file 
 * @author evikkua
 *
 */
public class AutoconfigProperties {
    public static final String EXCLUDED_RNC_LIST = "excluded.rnc.list";

    public static final String EXCLUDED_SGSN_LIST = "excluded.sgsn.list";

    private static final Logger logger = LoggerFactory.getLogger(AutoconfigProperties.class);

    private static final String AUTOCONFIG_PROPERTIES_FILE = "/opt/ericsson/cep-mediation/cep-mediation/bin/autoconfig.properties";

    private static final String PCP_CONFIG_FILE = "/opt/ericsson/cep-mediation/cep-mediation/etc/app-config/pcp-config.xml";

    private static final String UP_ROOT_PATH_DEFAULT = "/var/opt/ericsson/pcp/output/";

    private static final String UP_ROOT_PATH_PROP = "up.root.path";

    private static final String GPEH_FIXED_MEMORY = "gpeh.fixed.memory";

    private static final String SGEH_FIXED_MEMORY = "sgeh.fixed.memory";

    private static final String UP_FIXED_MEMORY = "up.fixed.memory";

    private static final String MEMORY_UPPER_LIMIT = "memory.upper.limit";

    private static final String MAX_RNCS_PROCESS = "max.rncs.process";

    private static final String OUTPUT_NE_XML = "networkelement.xml.path";

    private static final String OUTPUT_NE_XML_DEFAULT = "/opt/ericsson/cep-mediation/cep-mediation/etc/app-config/network_elements.xml";

    private static final String STANDALONE_XML_PATH = "standalone.xml.path";

    private static final String STANDALONE_XML_PATH_DEFAULT = "/opt/ericsson/cep-mediation/cep-mediation/etc/app-config/standalone.xml";

    private static final String HAZELCAST_XML_PATH = "hazelcast.xml.path";

    private static final String HAZELCAST_XML_PATH_DEFAULT = "/opt/ericsson/cep-mediation/cep-mediation/etc/app-config/hazelcast.xml";

    public static AutoconfigProperties instance = new AutoconfigProperties();

    private final Properties props;

    private AutoconfigProperties() {
        props = new Properties();
        try {
            props.load(new FileInputStream(new File(AUTOCONFIG_PROPERTIES_FILE)));
        } catch (FileNotFoundException e) {
            logger.warn("Could not find file: " + AUTOCONFIG_PROPERTIES_FILE, e);
        } catch (IOException e) {
            logger.warn("Could read file: " + AUTOCONFIG_PROPERTIES_FILE, e);
        }
    }

    public NEPath getGpehPath() {
        NEPath res = new NEPath();

        String rootPath = props.getProperty("gpeh.ne.path.root", "/eniq/data/eventdata/");
        if (rootPath.lastIndexOf(File.separator) != (rootPath.length() - 1)) {
            rootPath += File.separator;
        }
        res.setRootPath(rootPath);
        res.setPathregexCep(props.getProperty("gpeh.ne.pathregex.cep", "gpeh.*_cep"));

        return res;
    }

    public NEPath getSgehPath() {
        NEPath res = new NEPath();
        String rootPath = props.getProperty("sgeh.ne.path.root", "/eniq/data/eventdata/");
        if (rootPath.lastIndexOf(File.separator) != (rootPath.length() - 1)) {
            rootPath += File.separator;
        }
        res.setRootPath(rootPath);
        res.setPathregexOss(props.getProperty("sgeh.ne.pathregex.oss", "events_oss_\\d"));
        res.setPathregexCep(props.getProperty("sgeh.ne.pathregex.cep", "sgeh.*_cep"));

        return res;
    }

    public String getUpRootPath() {
        return getProperty(UP_ROOT_PATH_PROP, UP_ROOT_PATH_DEFAULT);
    }

    private String getProperty(String property, String defaultValue) {
        String res = props.getProperty(property);
        if (res != null && res.length() > 0) {
            return res;
        } else {
            logger.warn("Property not found: " + property + " Using default: " + defaultValue);
            return defaultValue;
        }
    }

    private Set<String> getListProperty(String prop) {
        Set<String> res = new HashSet<String>();
        String list = getProperty(prop, "");
        if (list.length() > 0) {
            String[] tokens = list.split(",");
            for (String token : tokens) {
                token = token.trim();
                if (!token.isEmpty()) {
                    res.add(token.toLowerCase());
                }
            }
        }

        return res;
    }

    public int getGpehFixedMemory() {
        try {
            return Integer.valueOf(getProperty(GPEH_FIXED_MEMORY, "6"));
        } catch (Exception e) {
            return 6;
        }
    }

    public int getSgehFixedMemory() {
        try {
            return Integer.valueOf(getProperty(SGEH_FIXED_MEMORY, "4"));
        } catch (Exception e) {
            return 4;
        }
    }

    public int getUpFixedMemory() {
        try {
            return Integer.valueOf(getProperty(UP_FIXED_MEMORY, "9"));
        } catch (Exception e) {
            return 9;
        }
    }

    public String getOutputNeXml() {
        return getProperty(OUTPUT_NE_XML, OUTPUT_NE_XML_DEFAULT);
    }

    public String getStandaloneXmlPath() {
        return getProperty(STANDALONE_XML_PATH, STANDALONE_XML_PATH_DEFAULT);
    }

    public String getHazelcastXmlPath() {
        return getProperty(HAZELCAST_XML_PATH, HAZELCAST_XML_PATH_DEFAULT);
    }

    public String getPcpConfigFile() {
        return PCP_CONFIG_FILE;
    }

    public int getMemoryUpperLimit() {
        try {
            return Integer.valueOf(getProperty(MEMORY_UPPER_LIMIT, "8"));
        } catch (Exception e) {
            return 8;
        }
    }

    public int getMaxRncsProcess() {
        try {
            return Integer.valueOf(getProperty(MAX_RNCS_PROCESS, "8"));
        } catch (Exception e) {
            return 8;
        }
    }

    public Set<String> getExcludedRncs() {
        return getListProperty(EXCLUDED_RNC_LIST);
    }

    public Set<String> getExcludedSgsns() {
        return getListProperty(EXCLUDED_SGSN_LIST);
    }

    public static class NEPath {
        private String rootPath;

        private String pathregexOss;

        private String pathregexCep;

        public String getRootPath() {
            return rootPath;
        }

        public void setRootPath(String rootPath) {
            if (!rootPath.endsWith(File.separator)) {
                rootPath += File.separator;
            }
            this.rootPath = rootPath;
        }

        public String getPathregexOss() {
            return pathregexOss;
        }

        public void setPathregexOss(String pathregexOss) {
            this.pathregexOss = pathregexOss;
        }

        public String getPathregexCep() {
            return pathregexCep;
        }

        public void setPathregexCep(String pathregexCep) {
            this.pathregexCep = pathregexCep;
        }

        @Override
        public String toString() {
            return "NEPath [rootPath=" + rootPath + ", pathregexOss=" + pathregexOss + ", pathregexCep=" + pathregexCep + "]";
        }
    }
}