package com.ericsson.cepmediation.loading.filecollection.ssh;

import org.slf4j.LoggerFactory;

public class SSHLogger implements com.jcraft.jsch.Logger {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SSHLogger.class);

	@Override
	public boolean isEnabled(final int level) {
		switch (level) {
		case com.jcraft.jsch.Logger.DEBUG:
			return logger.isDebugEnabled();

		case com.jcraft.jsch.Logger.ERROR:
			return logger.isErrorEnabled();

		case com.jcraft.jsch.Logger.FATAL:
			return logger.isErrorEnabled();

			// SSH Logger is verbose at INFO level, so log at DEBUG
		case com.jcraft.jsch.Logger.INFO:
			return logger.isDebugEnabled();

			// SSH Logger is verbose at INFO level, so log at DEBUG
		case com.jcraft.jsch.Logger.WARN:
			return logger.isDebugEnabled();	
		}

		return false;
	}

	@Override
	public void log(final int level, final String message) {
		switch (level) {
		case com.jcraft.jsch.Logger.DEBUG:
			logger.debug(message);
			return;

		case com.jcraft.jsch.Logger.ERROR:
			logger.error(message);
			return;

		case com.jcraft.jsch.Logger.FATAL:
			logger.error(message);
			return;

			// SSH Logger is verbose at INFO level, so log at DEBUG
		case com.jcraft.jsch.Logger.INFO:
			logger.debug(message);
			return;

			// SSH Logger is verbose at INFO level, so log at DEBUG
		case com.jcraft.jsch.Logger.WARN:
			logger.debug(message);
			return;
		}

		logger.trace(message);
	}

}
