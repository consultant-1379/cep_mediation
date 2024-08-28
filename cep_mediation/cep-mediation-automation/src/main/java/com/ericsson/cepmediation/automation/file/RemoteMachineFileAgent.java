/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.automation.file;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.automation.remoteserver.RemoteCommandInvoker;

/**
 * @author eemecoy
 * 
 */
public class RemoteMachineFileAgent implements FileAgent {

	private RemoteCommandInvoker remoteCommandInvoker;

	public RemoteMachineFileAgent() {
		remoteCommandInvoker = new RemoteCommandInvoker();
	}

	@Override
	public void renameFile(String fileName, String rename) {
		runRemoteCommand("mv " + fileName + " " + rename);
	}

	private String[] runRemoteCommand(String command) {
		return remoteCommandInvoker.runCommand(command);
	}

	@Override
	public String[] listFiles(String path) {
		String[] elements = runRemoteCommand("ls " + path);
		String[] absolutePaths = new String[elements.length];
		for (int i = 0; i < absolutePaths.length; i++) {
			absolutePaths[i] = path + "/" + elements[i];
		}
		return absolutePaths;
	}

	@Override
	public void deleteAllFilesInFolder(String path) {
		runRemoteCommand("rm -rf " + path);
	}

	@Override
	public List<String> readFile(String fileName) {
		String[] fileContents = runRemoteCommand("cat " + fileName);
		List<String> linesInFile = new ArrayList<String>();
		for (String line : fileContents) {
			linesInFile.add(line);
		}
		return linesInFile;
	}

	@Override
	public boolean doesFileExist(String file) {
		String[] checkIfFileExists = runRemoteCommand(String.format("test -e %s && echo yes || (test ! -e %s && echo no)", file, file));
		if (checkIfFileExists.length > 0 && checkIfFileExists[0].trim().equalsIgnoreCase("yes")) {
			return true;
		}
		return false;
	}

	@Override
	public void createFolder(String folderName) {
		runRemoteCommand("mkdir -p " + folderName);
	}
	

	@Override
	public void writeFile(String path, List<String> contents) throws Exception {
		String name = path;
		
		// create the folder if necessary
		int pos = path.lastIndexOf(File.separator);
		if (pos > -1) {
			name = path.substring(pos + 1); 
			String dir = path.substring(0, pos);
			if (!doesFileExist(dir)) {
				createFolder(dir);
			}
		}
		
		// write a temporary local file
		File snapshotsFile = File.createTempFile(name, ".tmp");
		try {
			PrintWriter pw = new PrintWriter(snapshotsFile);
			for (String line : contents) {
				pw.println(line);
			}
			pw.close();
			
			// copy to the remote server
			remoteCommandInvoker.copyFileToRemoteHost(snapshotsFile.getAbsolutePath(), path);
		} finally {
			// cleanup the temp local file
			snapshotsFile.delete();
		}
	}
	
}
