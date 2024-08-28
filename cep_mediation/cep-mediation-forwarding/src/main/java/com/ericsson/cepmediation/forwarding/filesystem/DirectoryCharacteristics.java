package com.ericsson.cepmediation.forwarding.filesystem;

public class DirectoryCharacteristics {

    private int numFiles = 0;

    private long size = 0;

    private int numBinaryFiles = 0;

    public DirectoryCharacteristics() {

    }

    public void increaseNumFiles(int numFilesToIncrease) {
        numFiles = numFiles + numFilesToIncrease;
    }

    public void increaseSize(long sizeToIncrese) {
        size = size + sizeToIncrese;
    }

    public void increaseNumBinaryFiles(int numBinaryFilesToIncrease) {
        numBinaryFiles = numBinaryFiles + numBinaryFilesToIncrease;
    }

    public int getNumFiles() {
        return numFiles;
    }

    public long getSize() {
        return size;
    }

    public int getNumBinaryFiles() {
        return numBinaryFiles;
    }

    public void addDirectoryCharacteristics(DirectoryCharacteristics dirChars) {
        numFiles = numFiles + dirChars.getNumFiles();
        size = size + dirChars.getSize();
        numBinaryFiles = numBinaryFiles + dirChars.getNumBinaryFiles();
    }
}
