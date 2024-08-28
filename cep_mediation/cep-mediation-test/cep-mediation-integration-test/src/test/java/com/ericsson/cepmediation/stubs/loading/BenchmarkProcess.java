package com.ericsson.cepmediation.stubs.loading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class manages a benchmark process
 * @author eeilfn
 *
 */
public class BenchmarkProcess implements Runnable {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(BenchmarkProcess.class);

    // The benchmark process name
    private String processName = null;

    // Hold a reference to the process builder and process that we are running
    private ProcessBuilder processBuilder = null;
    private Process process = null;

    // Hold a reference to the process reading and waiting thread
    Thread readingThread = null;
    Thread waitingThread = null;

    /**
     * Instantiate a benchmark process
     * @param classpath The class path to use on the process
     * @param directoryName Where the ROP files are
     * @param ropStart The starting ROP number
     * @param ropEnd The ROP number to stop before
     */
    public BenchmarkProcess(String classpath, String directoryName, int ropStart, int ropEnd) {
	// Build the process
	processBuilder = new ProcessBuilder("java", "-cp", classpath, "com.ericsson.cepmediation.stubs.loading.ThreadBenchmark", directoryName, Integer.toString(ropStart), Integer.toString(ropEnd));
	processBuilder.redirectErrorStream(true);

	// Set the process name
	processName = BenchmarkProcess.class.getSimpleName() + '(' + ropStart + ":" + ropEnd + ')';
    }

    public void startProcess() throws IOException  {
	// Start the process
	logger.debug("starting process: " + Arrays.toString(processBuilder.command().toArray()));
	process = processBuilder.start();

	// Set off a thread to wait for the processes to finish
	waitingThread = new Thread(this);
	waitingThread.setName(processName + ":wait");
	waitingThread.start();

	// Set off a thread to read the output of the process
	readingThread = new Thread(new BenchmarkProcessReader());
	readingThread.setName(processName + ":read");
	readingThread.start();
    }

    /**
     * Check if this benchmark process is still running
     * @return true if the process is running
     */
    public boolean isAlive() {
	if (waitingThread != null) {
	    return waitingThread.isAlive();
	}
	else {
	    return false;
	}
    }

    @Override
    public void run() {
	logger.debug("waiting thread started");

	// Wait for this process to finish
	try {
	    process.waitFor();
	} catch (Exception e) {
	    // If we're interrupted, carry on
	}

	readingThread.interrupt();
	logger.debug("process finished, exit code: " + process.exitValue());
	logger.debug("waiting thread finished");	
    }

    /**
     * Inner class used to read output from a process and log it
     */
    private class BenchmarkProcessReader implements Runnable {
	/**
	 * Method to read output from a process
	 */
	@Override
	public void run() {
	    logger.debug("reading thread started");

	    try {
		// Read the output of the process
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;

		// Loop until the process has completed
		while (!readingThread.isInterrupted()) {
		    // Get the output of the process
		    while (reader.ready() && (line = reader.readLine()) != null) {
			logger.info(line);
		    }

		    // No input ready so sleep for 1 second
		    try {
			Thread.sleep(1000);
		    } catch (InterruptedException e) {
			// The next loop around checks for interruption
			readingThread.interrupt();
		    }
		}

		// Check if there is any final unread output from the process
		while (reader.ready() && (line = reader.readLine()) != null) {
		    logger.info(line);
		}

	    }
	    catch (IOException e) {
		logger.warn("read error on process", e);
	    }

	    logger.debug("reading thread finished");	
	}
    }
}

