package com.ericsson.cepmediation.evolution.os;

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

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.util.DataConverters;
import com.ericsson.cepmediation.evolution.common.Host;
import com.ericsson.cepmediation.evolution.common.IniGet;

/**
 * 
 * This singleton class is used to retrive cep mediation server information
 * 
 * @author exuexie
 *
 */
public class HostManager {

    private static final Logger logger = LoggerFactory.getLogger(HostManager.class);

    private static HostManager instance;

    private String cepIni;

    private final List<Host> hosts;


    private HostManager() {

        hosts = new ArrayList<Host>();

        cepIni = getCepIni();

    }

    /**
     * Read the cep mediation ini file location information
     * @return
     */
    private String getCepIni() {

        return CepMediationProperties.getProperty(CepMediationProperty.CEP_MEDIATION_INI);
    }

    /**
     * 
     * Set the cep ini location, mainly for testing purpose
     *     
     * @param cepIni
     */
    public void setCepIni(String cepIni) {

        this.cepIni = cepIni;

    }

    public static HostManager getInstance() {

        if (instance == null) {

            instance = new HostManager();
        }

        return instance;
    }

    public List<Host> getHosts() {

        List<Host> hosts = new ArrayList<Host>();

        try {
            Map<String, Map<String, String>> parameters = IniGet.getInstance().readIniFile(new File(cepIni));

            Map<String, String> servers = parameters.get("CEP_MEDIATION");

            if (servers != null && servers.size() >= 1) {

                for (String server : servers.keySet()) {

                    Map<String, String> serverInfo = parameters.get(server);

                    String name = serverInfo.get("CEP_MED_HOSTNAME");
                    String ipAddr = serverInfo.get("SERVICES_IP");

                    hosts.add(new Host(name, ipAddr, isLocal(ipAddr)));
                }

            }

        } catch (IOException e) {

            logger.error(e.getMessage(), e);
        }

        return hosts;

    }

    private boolean isLocal(String ipAddr) {

        List<InetAddress> addrs = findNetworkInterfaces();

        for (InetAddress addr : addrs) {

            if (addr.getHostAddress().equals(ipAddr)) {

                return true;
            }
        }

        return false;

    }

    public List<InetAddress> findNetworkInterfaces() throws ConfigurationException {
        List<InetAddress> res = new ArrayList<InetAddress>();

        try {
            // Get all the network interfaces on this machine
            Enumeration<NetworkInterface> networkInterfaceEnum = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaceEnum.hasMoreElements()) {
                final NetworkInterface networkInterface = networkInterfaceEnum.nextElement();
                logger.info("found local interface:" + networkInterface.getDisplayName());

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

    private boolean checkHardwareAddress(final NetworkInterface networkInterface) {
        try {
            if (networkInterface.getHardwareAddress() != null) {
                logger.debug("setLocalNetworkInterface:MACAddress:"
                        + DataConverters.byteArray2String(networkInterface.getHardwareAddress()));
                return true;
            }
        } catch (final SocketException e) {
            logger.warn("Exception getting hardward addresses of interface " + networkInterface, e);
        }
        return false;
    }

}
