package com.ericsson.cepmediation.correlation.gpeh;

import java.io.File;
import java.io.FileFilter;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicLong;

import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.correlation.EventCountingPublisher;

/**
 * Can be used to print number of occurrences for each event type.
 * 
 * @author evelziv
 */
public final class GpehEventCountDetector extends AbstractGpehParserTestCase {

	private final EventCountingPublisher publisher = new EventCountingPublisher();
	
	public void test() throws Exception {
		super.parseFiles();
		
		for(Entry<String, AtomicLong> entry : publisher.getEventCounts().entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		System.out.println("TOTAL=" + publisher.getTotal());
	}
	
	@Override
	protected Publisher getPublisher() {
		return publisher;
	}

	@Override
	protected FileFilter getFileFilter() {
		return new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.isFile();// && (file.getName().contains("A20111003.1200"));
			}
		};
	}

	@Override
	protected String getDirectoryName() {
		return "/home/evelziv/data/ram-disk-work/gpeh-temp/";
	}
}
