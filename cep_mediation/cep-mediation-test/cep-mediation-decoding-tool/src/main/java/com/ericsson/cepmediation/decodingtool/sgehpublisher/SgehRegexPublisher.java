package com.ericsson.cepmediation.decodingtool.sgehpublisher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.decodingtool.publisher.PublisherAdapter;

public class SgehRegexPublisher extends PublisherAdapter {
	private static final Logger logger = LoggerFactory.getLogger(SgehRegexPublisher.class);
	private final Pattern pattern;

	final List<ApEventBean> matches = new ArrayList<ApEventBean>();

	public SgehRegexPublisher(final String regex) {
		this.pattern = Pattern.compile(".*" + regex + ".*");
	}

	@Override
	public void publishMessage(final ApEventBean e) {
		final String decodedString = e.getDecodedString();
		if (pattern.matcher(decodedString).matches()) {
			matches.add(e);
		}
	}

	@Override
	public void flush() {
		Collections.sort(matches);
		for (final ApEventBean m : matches) {
			logger.info(m.getDecodedString());
		}

	}
}
