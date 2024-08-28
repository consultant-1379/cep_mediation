package com.ericsson.cepmediation.autoconfig.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.CepAutoconfig;
import com.ericsson.cepmediation.loading.filecollection.ssh.SSHCommandResult;
import com.ericsson.cepmediation.loading.filecollection.ssh.SSHExecuter;

/**
 * This class open SSH connection for given host and execute commands
 * @author evikkua
 *
 */
public class HostSSHAgent {

    private static final Logger logger = LoggerFactory.getLogger(CepAutoconfig.class);

    // SSH executer instance for this class
    SSHExecuter sshExecuter = null;

    String home = null;

    /**
     * Constructor, use the configuration data to set up a SSH executer
     * @param ipaddress
     * @param username
     * @param password
     */
    public HostSSHAgent(String ipaddress, String username, String password, String home) {
        // Instantiate the SSH executer for this class
        sshExecuter = new SSHExecuter(ipaddress, username, password);
        this.home = home;
    }

    /**
     * Open SSH connection and execute commands to get available memory and cpus of the host
     * @return String array where first element is available memory and second is number of available cpus
     */
    public String[] getMemoryAndCPUs() {
        String[] memProc = new String[2];
        //        String commandMemory = "awk '/MemFree/ { print $2 }' /proc/meminfo";
        String commandMemory = "awk '/MemTotal/ { print $2 }' /proc/meminfo";
        String commandCPUs = "nproc";
        try {
            // Open the SSH connection
            SSHCommandResult sshCommandResult = sshExecuter.open(home);
            if (sshCommandResult.getResultCode() != 0) {
                logger.error("Unable to open SSH connection" + sshCommandResult);
                return null;
            }

            // Get available memory
            sshCommandResult = sshExecuter.execute(commandMemory);
            if (sshCommandResult.getResultCode() != 0) {
                logger.error("Unable to execute command to retrive total memory" + sshCommandResult);
                return null;
            }
            memProc[0] = sshCommandResult.getRemoteOutput()[0];
            // Get cpus
            sshCommandResult = sshExecuter.execute(commandCPUs);

            if (sshCommandResult.getResultCode() != 0) {
                logger.error("Unable to execute command to retrive total cpus" + sshCommandResult);
                return null;
            }
            memProc[1] = sshCommandResult.getRemoteOutput()[0];

            return memProc;
        } catch (Exception e) {
            logger.error("Error is SSH connection " + e.getMessage());
            new RuntimeException(e);
            return null;
        } finally {
            sshExecuter.close();
        }
    }
}
