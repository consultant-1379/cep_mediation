package com.ericsson.eniq.events.cepmediation.datagen_precook.utils.fileutils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DataGenPropertiesConstants;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.UeContextModuleID;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.UeContextRncModuleIdHandler;

public class FileLoaderUeContextModuleID {
    private static final Logger logger = LoggerFactory.getLogger(FileLoaderUeContextModuleID.class);

    private static final String masterSetfilePath = DatagenProperties.getInstance().getUeContextModuleIDFilePath();

    private static final String userdefinedfilePath = DatagenProperties.getInstance().getUeContextModudleIdPath();

    public HashSet<UeContextModuleID> getUeContextModuleIDs() {

        final boolean createRandomUeContextModuleId = createRandomUeContextModuleId();

        if (createRandomUeContextModuleId) {
            final File file = new File(masterSetfilePath);
            final HashSet<UeContextModuleID> filecontent = LoadFileContext(file, createRandomUeContextModuleId);
            return getRandomUeContextModuleID(filecontent);
        }

        final File file = new File(userdefinedfilePath);
        return LoadFileContext(file, createRandomUeContextModuleId);
    }

    private boolean createRandomUeContextModuleId() {
        final String propertyValue = System.getProperty(
                DataGenPropertiesConstants.CREATE_RANDOM_UECONTEXT_MODULEID_SET, Boolean.toString(false));
        return Boolean.parseBoolean(propertyValue);
    }

    private HashSet<UeContextModuleID> getRandomUeContextModuleID(final HashSet<UeContextModuleID> fileContext) {
        UeContextRncModuleIdHandler ueContextRncModuleIdHandler = new UeContextRncModuleIdHandler();
        return ueContextRncModuleIdHandler.getUeContextModuleIDs(fileContext);
    }

    private HashSet<UeContextModuleID> LoadFileContext(final File file, final boolean createrandomSet) {
        final HashSet<UeContextModuleID> fileContant = new HashSet<UeContextModuleID>();
        logger.debug("Loading File :" + file.getName() + "...");
        FileInputStream fstream = null;
        try {
            try {
                fstream = new FileInputStream(file);
            } catch (final FileNotFoundException e) {
                e.printStackTrace();
            }

            final DataInputStream in = new DataInputStream(fstream);

            final BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            while ((strLine = br.readLine()) != null) {
                if (strLine.length() > 0) {
                    final String[] tokens = strLine.split(",");
                    final short ueContext = (short) Integer.parseInt(tokens[0]);
                    final int moduleID = Integer.parseInt(tokens[1]);
                    final UeContextModuleID ueContextModuleID = new UeContextModuleID(ueContext, moduleID);

                    fileContant.add(ueContextModuleID);
                }
            }

            in.close();
        } catch (final Throwable e) {
            logger.error(e.getMessage() + ":" + e.toString());
            System.exit(0);
        }
        return fileContant;
    }
}
