package com.ericsson.cepmediation.evolution.network;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.config.bean.AppConfigType;
import com.ericsson.cepmediation.config.bean.HostType;
import com.ericsson.cepmediation.config.bean.HostsType;
import com.ericsson.cepmediation.config.bean.NetworkElement;
import com.ericsson.cepmediation.config.bean.NetworkElementsType;
import com.ericsson.cepmediation.config.bean.ObjectFactory;
import com.ericsson.cepmediation.config.bean.ProcessType;
import com.ericsson.cepmediation.evolution.common.Host;

public class XmlGenerator {

    private static final Logger logger = LoggerFactory.getLogger(XmlGenerator.class);

    private JAXBContext context;

    private Marshaller marshaller;

    private final Host host;

    private final String location;

    private final Map<Integer, List<String>> rncs;

    private final ObjectFactory objectFactory = new ObjectFactory();

    private OutputStream outputStream;

    private final String mountPoint;

    private final String memory;

    public XmlGenerator(Host host, long memory, Map<Integer, List<String>> rncs, String location) {

        this.host = host;
        this.rncs = rncs;
        this.location = location;
        this.memory = String.valueOf(memory);

        //get the gpeh file mount point
        mountPoint = getMountPoint();

        start();
        processing();

    }

    private String getMountPoint() {

        return CepMediationProperties.getProperty(CepMediationProperty.GPEH_MOUNT_POINT);
    }

    private void start() {

        try {
            outputStream = new FileOutputStream(getFileName());
        } catch (FileNotFoundException e1) {
            logger.error(e1.getMessage(), e1);
        }

        try {
            context = JAXBContext.newInstance(AppConfigType.class);
            marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        } catch (JAXBException e) {
            logger.error(e.getMessage(), e);
        }
    }

    private String getFileName() {

        return location + File.separator + host.getName() + ".xml";
    }

    private void processing() {

        AppConfigType appConfig = objectFactory.createAppConfigType();

        HostsType hosts = objectFactory.createHostsType();
        appConfig.setHosts(hosts);

        HostType hostType = objectFactory.createHostType();
        hostType.setMaster(host.isMaster());
        hostType.setIp(host.getIp());
        hosts.getHost().add(hostType);

        for (Integer pId : rncs.keySet()) {

            ProcessType process = objectFactory.createProcessType();
            process.setProcid(pId);
            process.setMemorySize(memory);
            hostType.getProcess().add(process);

            NetworkElementsType nes = objectFactory.createNetworkElementsType();
            process.setNetworkElements(nes);

            for (String neName : rncs.get(pId)) {

                NetworkElement ne = objectFactory.createNetworkElement();
                nes.getNetworkElement().add(ne);

                ne.setNeType(1);
                ne.setLabel(neName);
                ne.setDirectory(mountPoint + File.separator + "SubNetwork=" + neName);

            }

        }

        JAXBElement<AppConfigType> element = new ObjectFactory().createAppconfig(appConfig);

        try {
            marshaller.marshal(element, outputStream);
        } catch (JAXBException e) {
            logger.error("JAXBException", e);
        }

    }

}
