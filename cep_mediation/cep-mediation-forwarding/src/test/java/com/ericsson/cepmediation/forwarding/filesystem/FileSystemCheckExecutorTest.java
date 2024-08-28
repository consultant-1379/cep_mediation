package com.ericsson.cepmediation.forwarding.filesystem;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.forwarding.ForwarderUtilityHelper;
import com.ericsson.cepmediation.forwarding.filesystem.FileSystemCheckExecutor;
import com.ericsson.cepmediation.forwarding.filesystem.FileSystemCheckResultHolder;

public class FileSystemCheckExecutorTest {

    private static final String FILE_SEPERATOR = File.separator;

    private static String binaryDirectory = CepMediationProperties.getFileProperty(CepMediationProperty.IQ_BINARY_DIRECTORY);
    private static final int percentage = CepMediationProperties.getIntProperty(CepMediationProperty.MAX_PERCENTAGE_USED_SPACE);
    private static final int diskSpace = CepMediationProperties.getIntProperty(CepMediationProperty.MAX_DISKSPACE_FILES);

    FileSystemCheckExecutor instance;
    
    private static Set<String> techPackNames = new HashSet<String>(ForwarderUtilityHelper.getMeasTypes());

    @Before
    public void setUp() {
        ForwarderUtilityHelper.setInitialData(null, "1.1.1.1", 1);
        instance = new FileSystemCheckExecutor();
    }

    //@Test
    public void testFileSystemChecks() {
        String dir00 = binaryDirectory + FILE_SEPERATOR + ForwarderUtilityHelper.getFileSystemMountDirNames()[0];
        FileSystemCheckResultHolder result = new FileSystemCheckResultHolder(dir00, techPackNames, percentage, diskSpace);
        instance.runChecks(result);
        //System.out.println(result.getResultDetails());
    }
}
