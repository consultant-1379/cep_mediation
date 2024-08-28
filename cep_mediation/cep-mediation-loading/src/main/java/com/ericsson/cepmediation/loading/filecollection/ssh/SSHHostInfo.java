package com.ericsson.cepmediation.loading.filecollection.ssh;

/**
 * This class holds information about the SSH host to connect to
 */
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserInfo;

public class SSHHostInfo implements UserInfo, UIKeyboardInteractive {
    // Instantiate the logger
    private static final Logger logger = LoggerFactory.getLogger(SSHHostInfo.class);

    // Hold information on the host to connect to
    private final String host;

    private final int port;

    private final String user;

    private final String password;

    /**
     * Constructor, set the SSH Host information
     * @param host
     * @param port
     * @param user
     * @param password
     */
    protected SSHHostInfo(final String host, final int port, final String user, final String password) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getUser() {
        return user;
    }

    /*
     * From here, the methods are overridden from the UserInfo interface
     */

    /**
     * Get the pass phrase for the SSH session
     */
    @Override
    public String getPassphrase() {
        logger.trace("SSHHostInfo.getPassphrase<--->");
        return null;
    }

    /**
     * Return the password for the host to the SSH connection
     */
    @Override
    public String getPassword() {
        logger.trace("SSHHostInfo.getPassword<--->, return " + password);
        return password;
    }

    /**
     * Tells the SSH connection to prompt for pass phrases
     */
    @Override
    public boolean promptPassphrase(final String message) {
        logger.trace("SSHHostInfo.promptPassphrase--->, message=" + message);
        final boolean result = false;
        logger.trace("SSHHostInfo.promptPassphrase--->, return: " + result);
        return result;
    }

    /**
     * Tells the SSH connection to prompt for passwords
     */
    @Override
    public boolean promptPassword(final String message) {
        logger.trace("SSHHostInfo.promptPassword--->, message=" + message);
        final boolean result = false;
        logger.trace("SSHHostInfo.promptPassword--->, return: " + result);
        return result;
    }

    /**
     * Answer a SSH connection Yes/No question, always answer yes
     */
    @Override
    public boolean promptYesNo(final String message) {
        logger.trace("SSHHostInfo.promptYesNo--->, message=" + message);
        final boolean result = true;
        logger.trace("SSHHostInfo.promptYesNo--->, return: " + result);
        return result;
    }

    @Override
    public void showMessage(final String message) {
        logger.trace("SSHHostInfo.showMessage<--->, message=" + message);
    }

    /*
     * From here, the methods are overridden from the UIKeyboardInteractive interface
     */

    @Override
    public String[] promptKeyboardInteractive(final String destination, final String name, final String instruction,
            final String[] prompt, final boolean[] echo) {

        logger.trace("SSHHostInfo.promptKeyboardInteractive(" + destination + ',' + name + ',' + instruction + ','
                + Arrays.toString(prompt) + ',' + Arrays.toString(echo));

        // Check if it is a request for a password
        if (prompt != null && prompt.length > 0 && prompt[0].equals("Password:")) {
            return new String[] { password };
        } else {
            return null;
        }
    }
}
