/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.common;

/**
 * @author eemecoy
 *
 */
public class RadioUser {

    private short ueContextForUser;

    private int rncModuleIdForUser;

    private long imsi;

    /**
     * @return the ueContextForUser
     */
    public short getUeContextForUser() {
        return ueContextForUser;
    }

    /**
     * @return the rncModuleIdForUser
     */
    public int getRncModuleIdForUser() {
        return rncModuleIdForUser;
    }

    @Override
    public boolean equals(final Object other) {
        final RadioUser otherUser = (RadioUser) other;
        final int otherUserRncModuleIdAsInt = otherUser.getRncModuleIdForUser();
        final int rncModuleIdAsInt = getRncModuleIdForUser();
        return otherUser.getUeContextForUser() == getUeContextForUser() && otherUserRncModuleIdAsInt == rncModuleIdAsInt;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (ueContextForUser ^ (ueContextForUser >>> 32));
        result = prime * result + (rncModuleIdForUser ^ (rncModuleIdForUser >>> 32));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RncModuleID: ");
        stringBuilder.append(getRncModuleIdForUser());
        stringBuilder.append(", ueContext: ");
        stringBuilder.append(getUeContextForUser());
        if (imsi != 0) {
            stringBuilder.append(", imsi: ");
            stringBuilder.append(imsi);
        }
        return stringBuilder.toString();
    }

    /**
     * @param ueContextForUser the ueContextForUser to set
     */
    public void setUeContextForUser(final short ueContextForUser) {
        this.ueContextForUser = ueContextForUser;
    }

    /**
     * @param rncModuleIdForUser the rncModuleIdForUser to set
     */
    public void setRncModuleIdForUser(final int rncModuleIdForUser) {
        this.rncModuleIdForUser = rncModuleIdForUser;
    }

    /**
     * @return the imsi
     */
    public long getImsi() {
        return imsi;
    }

    /**
     * @param imsi the imsi to set
     */
    public void setImsi(final long imsi) {
        this.imsi = imsi;
    }

    public String getImsiAsString() {
        return Long.toString(imsi);
    }

    public void setImsiAsString(final String imsi) {
        this.imsi = Long.parseLong(imsi);
    }
}
