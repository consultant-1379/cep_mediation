package com.ericsson.cepmediation.base.util;

/**
 * This class is a bean that contains the data required to access a file server
 * @author eeilfn
 *
 */
public class FileServerData {
    private String serverIP;

    private String serverUser;

    private String serverPassword;

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(final String serverIP) {
        this.serverIP = serverIP;
    }

    public String getServerUser() {
        return serverUser;
    }

    public void setServerUser(final String serverUser) {
        this.serverUser = serverUser;
    }

    public String getServerPassword() {
        return serverPassword;
    }

    public void setServerPassword(final String serverPassword) {
        this.serverPassword = serverPassword;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(serverUser);
        stringBuilder.append("@");
        stringBuilder.append(serverIP);
        return stringBuilder.toString();
    }
}
