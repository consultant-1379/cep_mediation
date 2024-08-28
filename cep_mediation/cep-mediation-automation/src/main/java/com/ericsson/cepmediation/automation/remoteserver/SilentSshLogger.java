package com.ericsson.cepmediation.automation.remoteserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class decreases the verbosity of the default JSCH logger.
 * 
 * @author emicned
 *
 */
public class SilentSshLogger implements com.jcraft.jsch.Logger {
	private static final Logger logger = LoggerFactory.getLogger(RemoteCommandInvoker.class);
	
	@Override
	public boolean isEnabled(final int level) {
		switch (level) {
		case com.jcraft.jsch.Logger.DEBUG:
			return logger.isTraceEnabled();

		case com.jcraft.jsch.Logger.ERROR:
			return logger.isErrorEnabled();

		case com.jcraft.jsch.Logger.FATAL:
			return logger.isErrorEnabled();

		case com.jcraft.jsch.Logger.INFO:
			return logger.isTraceEnabled();

		case com.jcraft.jsch.Logger.WARN:
			return logger.isDebugEnabled();	
		}

		return false;
	}

	@Override
	public void log(final int level, final String message) {
		switch (level) {
		case com.jcraft.jsch.Logger.DEBUG:
			logger.trace(message);
			return;

		case com.jcraft.jsch.Logger.ERROR:
			logger.error(message);
			return;

		case com.jcraft.jsch.Logger.FATAL:
			logger.error(message);
			return;

		case com.jcraft.jsch.Logger.INFO:
			logger.trace(message);
			return;

		case com.jcraft.jsch.Logger.WARN:
			logger.debug(message);
			return;
		}

		logger.trace(message);
	}

}
