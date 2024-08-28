package com.ericsson.cepmediation.datagen.utils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.datagen.common.DatagenProperties;

public class FilesMover extends Thread {
    private final String DATE_REGEX = "\\^*[0-9]{8}";

    private final String DELIMITER = "/";

    private final String RNC09 = "RNC09";

    private File masterDatasetPath = DatagenProperties.instance.getMasterDatasetPath(DatagenProperties.Node.GPEH);

    private final boolean isLivePlayback = DatagenProperties.instance.getLivePlayBackFlag();

    private boolean generateOrginalDataFlag;

    private Set<String> nodeNames;

    private final Logger logger = LoggerFactory.getLogger(FilesMover.class);

    private String fileregex;

    private String destinationDirectory;

    private String sourceDirectory;

    private boolean isGpeh;

    /**
     * Default constructor
     */
    public FilesMover() {
    }

    public FilesMover(String regex, String sourceDirectory, String destinationDirectory, Set<String> nodeNames,
            boolean generateOrginalDataFlag, boolean isGpeh) {
        this.fileregex = regex;
        this.sourceDirectory = sourceDirectory;
        this.destinationDirectory = destinationDirectory;
        this.nodeNames = nodeNames;
        this.generateOrginalDataFlag = generateOrginalDataFlag;
        this.isGpeh = isGpeh;
    }

    @Override
    public void run() {
        createDirectories(destinationDirectory);

        for (String node : nodeNames) {
            movieFiles(destinationDirectory, sourceDirectory, node);
        }

        if (generateOrginalDataFlag && isGpeh) {
            generateOrginalData(destinationDirectory);
        }
    }

    /**
     * @param directory
     */
    private void createDirectories(String directory) {
        if (!isDirectoryExists(directory)) {
            new File(directory).mkdir();
            logger.debug("Creating " + directory);
        }

        for (String node : nodeNames) {
            String foldername;
            if (isGpeh) {
                foldername = "SubNetwork=" + node.toUpperCase() + DELIMITER + "MeContext=" + node.toUpperCase();
            } else {
                foldername = "ManagedElement=" + node.toUpperCase();
            }
            String d = directory + DELIMITER + foldername;
            if (!isDirectoryExists(d)) {
                new File(d).mkdirs();
                logger.debug("Creating " + d);
            }
        }
    }

    public void movieFiles(String destinationDirectory1, String sourceDirectory1, String node) {

        File rncFiles = new File(sourceDirectory1 + DELIMITER + node);

        File[] files = rncFiles.listFiles();

        String foldername;
        if (isGpeh) {
            foldername = "SubNetwork=" + node.toUpperCase() + DELIMITER + "MeContext=" + node.toUpperCase();
        } else {
            foldername = "ManagedElement=" + node.toUpperCase();
        }
        for (int i = 0; i < files.length; i++) {

            boolean result = files[i].renameTo(new File(destinationDirectory1 + DELIMITER + foldername + DELIMITER,
                    files[i].getName()));
            if (result) {
                logger.debug("Moving " + files[i].getName() + " To " + destinationDirectory1 + DELIMITER + foldername
                        + " was " + "successfull");
            } else {
                logger.error("Moving " + files[i].getName() + " To " + destinationDirectory1 + DELIMITER + foldername
                        + DELIMITER + files[i].getName() + " failed");
            }
        }
    }

    /**
     * @param directory
     */
    private void generateOrginalData(String directory) {
        FileCopier fileCopier = new FileCopier();
        String rncPath = masterDatasetPath.getAbsolutePath();
        String rnc09 = directory + DELIMITER + "SubNetwork=" + RNC09.toUpperCase() + DELIMITER + "MeContext="
                + RNC09.toUpperCase();
        if (!isDirectoryExists(rnc09)) {
            new File(rnc09).mkdirs();
        }
        File rncFiles = new File(rncPath);

        File[] files = rncFiles.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return file.isFile() && file.getName().matches(fileregex);
            }
        });
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String filename = files[i].getName();

                if (isLivePlayback) {
                    filename = changeFileName(filename);
                }

                try {
                    fileCopier.copy(files[i].getAbsoluteFile(),
                            new File(directory + DELIMITER + "SubNetwork=" + RNC09.toUpperCase() + DELIMITER
                                    + "MeContext=" + RNC09.toUpperCase(), filename));
                } catch (IOException e) {
                    logger.error(e.getMessage() + ":" + e.toString());
                    e.printStackTrace();
                }
                logger.debug("Copied " + files[i].getAbsoluteFile() + " To " + directory + DELIMITER + "SubNetwork="
                        + RNC09.toUpperCase() + DELIMITER + "MeContext=" + RNC09.toUpperCase() + DELIMITER + filename);
            }
        }
    }

    public boolean isDirectoryExists(String dir) {
        return new File(dir).exists();
    }

    /**
     * @param filename
     * @return
     */
    protected String changeFileName(String filename) {
        String fileprefix = "";
        Calendar date = Calendar.getInstance();
        fileprefix = (String.format("%4d%02d%02d", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1,
                date.get(Calendar.DAY_OF_MONTH)));
        filename = filename.replaceAll(DATE_REGEX, fileprefix);
        return filename;
    }

}
