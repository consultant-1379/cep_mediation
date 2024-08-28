package com.ericsson.cepmediation.test.eventcreation;

import java.util.Random;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;

public class Randomizer {

    private static Random randomGenerator = new Random();

    private short numberOfRNC;

    private int numberOfCellInaRNC;

    private byte numberOfRncModuleId;

    private short numberOfUeContext;

    public Randomizer() {
    }

    public Randomizer(short numberOfRNC, int numberOfCell, byte rncModuleNumber, short numberOfUe) {
        this.numberOfRNC = numberOfRNC;
        this.numberOfCellInaRNC = numberOfCell;
        this.numberOfRncModuleId = rncModuleNumber;
        this.numberOfUeContext = numberOfUe;
    }

    public short getNumberOfRNC() {
        return numberOfRNC;
    }

    public void setNumberOfRNC(short numberOfRNC) {
        this.numberOfRNC = numberOfRNC;
    }

    public int getNumberOfCellInaRNC() {
        return numberOfCellInaRNC;
    }

    public void setNumberOfCellInaRNC(int numberOfCellInaRNC) {
        this.numberOfCellInaRNC = numberOfCellInaRNC;
    }

    public byte getNumberOfRncModuleId() {
        return numberOfRncModuleId;
    }

    public void setNumberOfRncModuleId(byte numberOfRncModuleId) {
        this.numberOfRncModuleId = numberOfRncModuleId;
    }

    public short getNumberOfUeContext() {
        return numberOfUeContext;
    }

    public void setNumberOfUeContext(short numberOfUeContext) {
        this.numberOfUeContext = numberOfUeContext;
    }

    public short getRandomRnc() {
        return 0;
    }

    public int getRandomCellId() {
        return 0;
    }

    public byte getRandomRncMdouleId() {
        return -1;
    }

    public short getRandomUeContext() {
        return 1;
    }

    public static GpehBase getAnImsi() {
        INTERNAL_IMSI imsi = new INTERNAL_IMSI();
        imsi.setIMSI(generateImsi());
        return imsi;
    }

    private static String generateImsi() {
        return (("45406" + randomLong()).substring(0, 15)).replace('-', '0');
    }

    private static String randomLong() {
        return String.valueOf(randomGenerator.nextLong());
    }

    public static int rand(int randomizeNumber) {
        return Math.abs(randomGenerator.nextInt() % randomizeNumber);
    }

}
