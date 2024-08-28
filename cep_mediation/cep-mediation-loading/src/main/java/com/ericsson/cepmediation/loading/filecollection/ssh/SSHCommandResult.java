package com.ericsson.cepmediation.loading.filecollection.ssh;

/**
 * This class is a bean that contains the result of the execution of a command on a remote host
 * @author eeilfn
 *
 */
public class SSHCommandResult {
	// The result code of the remote command
	private int resultCode = 0;
	
	// The remote output and remote error produced by the remote command
	private String[] remoteOutput = null;
	private String[] remoteError = null;

	/**
	 * Print the result of the command
	 * @return The result of the command
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		
		builder.append("result code: ");
		builder.append(resultCode);

		builder.append("\n***remote output***");
		if (remoteOutput != null) {
			for (final String line : remoteOutput) {
				builder.append('\n');
				builder.append(line);
			}
		}

		builder.append("\n***remote error***");
		if (remoteError != null) {
			for (final String line : remoteError) {
				builder.append('\n');
				builder.append(line);
			}
		}

		builder.append("\n******");
		
		return builder.toString();
	}
	
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(final int resultCode) {
		this.resultCode = resultCode;
	}
	public String[] getRemoteOutput() {
		return remoteOutput;
	}
	public void setRemoteOutput(final String[] RemoteOutput) {
		this.remoteOutput = RemoteOutput;
	}
	public String[] getRemoteError() {
		return remoteError;
	}
	public void setRemoteError(final String[] RemoteError) {
		this.remoteError = RemoteError;
	}
}
