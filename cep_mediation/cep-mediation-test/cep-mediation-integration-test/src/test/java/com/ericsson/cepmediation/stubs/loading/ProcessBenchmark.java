package com.ericsson.cepmediation.stubs.loading;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class benchmarks CEP Mediation processing, it reads a list of files from a directory and
 * processes them through CEP Mediation. It starts a process that calls ThreadBenchmark to process a
 * group of ROPs to load cell trace files
 * 
 * @author eeilfn
 *
 */
public class ProcessBenchmark {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(ProcessBenchmark.class);

    // The list of processes spawned
    private BenchmarkProcess[] benchmarkProcessList = null;

    /**
     * Take a set of ROP files and initialise a set of processes to process those files
     * @param args The program arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
	// Declare variables to hold the arguments
	String classpath = null;
	String directoryName = null;
	int ropStart = 0;
	int rops = 0;
	int processCount = 0;

	// Get the arguments
	if (args.length == 5) {
	    classpath = args[0];
	    directoryName = args[1];
	    ropStart = Integer.valueOf(args[2]);
	    rops = Integer.valueOf(args[3]) - ropStart + 1;
	    processCount = Integer.valueOf(args[4]);
	}
	else {
	    logger.error("usage: ProcessBenchmark classpath <directory name> ROP_START ROP_END processes");
	    logger.error("       ROP_START/ROP_END Rop Period in day (hour * 4)");
	    System.exit(1);
	}

	// Check that the argument is a directory
	File fileDir = new File(directoryName);
	if (!fileDir.isDirectory()) {
	    logger.error("\"" + directoryName + "\" is not a directory");
	    System.exit(1);
	}

	// Sanity check the process count
	if (processCount > rops) {
	    logger.error("too many process " + processCount + " specified for " + rops + " ROPs");
	    System.exit(1);
	}

	new ProcessBenchmark(classpath, directoryName, ropStart, rops, processCount);
    }

    /**
     * Kick off the processes
     * @param classpath The class path to use to start sub processes
     * @param directoryName The directory name
     * @param ropStart The starting ROP number
     * @param rops The number of ROPs
     * @param processCount The number of processes
     * @throws IOException 
     */
    private ProcessBenchmark(String classpath, String directoryName, int ropStart, int rops, int processCount) throws IOException {

	benchmarkProcessList = new BenchmarkProcess[processCount];

	// Iterate for the number of processes requested and set up the processes
	for (int i = 0; i < processCount; i++) {
	    int processRopStart = ropStart + i*rops/processCount;
	    int processRopEnd = ropStart + (i+1)*rops/processCount - 1;

	    benchmarkProcessList[i] = new BenchmarkProcess(classpath, directoryName, processRopStart, processRopEnd);
	}

	// Start each process, do this in a separate loop so that process startup is not included in timings
	for (BenchmarkProcess benchmarkProcess : benchmarkProcessList) {
	    benchmarkProcess.startProcess();
	}

	// Wait for all benchmark processes to finish
	boolean finished = false;
	while (!finished) {
	    // Wait for 3 seconds
	    try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		// Do nothing on interrupt
	    }

	    // If at least one process is running, we are not finished
	    finished = true;
	    for (BenchmarkProcess benchmarkProcess: benchmarkProcessList) {
		// Check the status of this process
		if (benchmarkProcess.isAlive()) {
		    finished = false;
		    break;
		}
	    }
	}

	logger.debug("all processes finished");
    }
}
