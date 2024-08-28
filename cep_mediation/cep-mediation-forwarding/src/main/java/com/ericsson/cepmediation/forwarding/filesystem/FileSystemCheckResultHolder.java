package com.ericsson.cepmediation.forwarding.filesystem;

import java.util.Set;


public class FileSystemCheckResultHolder {

    private int maxPercentageUsedSpaceFileSystem;

    private int maxDiskSpaceToBeUsedByFiles;

    private String fileSystemName;

    private Set<String> techPackDirNames;

    // The following attributes store the values of the last poll
    private boolean canFileBeWritten = true;

    private float percentageOfDiskSpaceUsed = 0f;

    // Stores the total number and total size of all files in all tech pack directories for the fileSystem 
    private DirectoryCharacteristics techPackDirectoriesCharacteristics = new DirectoryCharacteristics();

    FileSystemCheckResultHolder(String name, Set<String> dirNames, int percentage, int diskSpace) {
        fileSystemName = name;
        techPackDirNames = dirNames;
        maxPercentageUsedSpaceFileSystem = percentage;
        maxDiskSpaceToBeUsedByFiles = diskSpace;
    }

    void setCanFileBeWritten(boolean result) {
        canFileBeWritten = result;
    }

    void setPercentageOfDiskSpaceUsed(float percentage) {
        percentageOfDiskSpaceUsed = percentage;
    }

    void setTechPackDirectoriesCharacteristics(DirectoryCharacteristics directoryCharacteristics) {
        techPackDirectoriesCharacteristics = directoryCharacteristics;
    }
    
    String getFilesystemName() {
        return fileSystemName;
    }
    
    Set<String> getTechPackDirNames() {
        return techPackDirNames;
    }

    private boolean getCanFileBeWritten() {
        return canFileBeWritten;
    }

    private boolean getResultOfIsThereFreeSpace() {
        return percentageOfDiskSpaceUsed < maxPercentageUsedSpaceFileSystem;
    }

    private boolean getResultOfSizeTechPackFiles() {
        double sizeMB = techPackDirectoriesCharacteristics.getSize() / (1024.0 * 1024.0);
        return sizeMB < maxDiskSpaceToBeUsedByFiles;
    }

    boolean getResult() {
        return getCanFileBeWritten() && getResultOfIsThereFreeSpace() && getResultOfSizeTechPackFiles();
    }

    String getResultDetails() {
        StringBuilder resultDetails = new StringBuilder();
        resultDetails.append("Results of checking file system ").append(fileSystemName);
        resultDetails.append(" are - canFileBeWritten: ").append(getCanFileBeWritten());
        resultDetails.append(" , isThereFreeSpace: ").append(getResultOfIsThereFreeSpace());
        resultDetails.append(" , isSizeOfFilesInTechPackDirsLessThanMaxSizeOfFiles: ").append(getResultOfSizeTechPackFiles());
        return resultDetails.toString();
    }

}
