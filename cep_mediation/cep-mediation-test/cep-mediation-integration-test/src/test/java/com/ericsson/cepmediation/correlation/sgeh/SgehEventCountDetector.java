//package com.ericsson.cepmediation.correlation.sgeh;
//
//import java.io.File;
//import java.io.FileFilter;
//import java.util.Collection;
//import java.util.List;
//import java.util.Map.Entry;
//
//import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
//import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
//import com.ericsson.cepmediation.base.publishing.Publisher;
//
///**
// * Can be used to print number of occurrences for each event type.
// * 
// * @author evelziv
// */
//public final class SgehEventCountDetector extends AbstractSgehParserTestCase {
//
//	private DefaultImsiRouter imsiRouter;
//	private Publisher publisher = new RoutingPublisher();
//	
//	@Override
//	protected void setUp() throws Exception {
//		super.setUp();
//		imsiRouter = new DefaultImsiRouter();
//	}
//
//	@Override
//	protected void tearDown() throws Exception {
//		super.tearDown();
//	}
//
//	public void test() throws Exception {
//		super.parseFiles();
//		
//		for(Entry<Long, ImsiPartition> entry : imsiRouter.getPartitions().entrySet()) {
//			long imsi = entry.getKey();
//			DefaultImsiPartition partition = (DefaultImsiPartition) entry.getValue();
////			List<ApEventBean> events = partition.getSortedEvents();
//			List<ApEventBean> events = partition.getEvents();
//			System.out.println("imsi " + imsi + "' had " + events.size() + " events");
//			System.out.println();
//		}
//		System.out.println(imsiRouter);
//	}
//	
//	@Override
//	protected Publisher getPublisher() {
//		return publisher;
//	}
//
//	@Override
//	protected FileFilter getFileFilter() {
//		return new FileFilter() {
//			@Override
//			public boolean accept(File file) {
//				return file.isFile() && file.getName().contains("A20111003.1200"); 
//			}
//		};
//	}
//
//	@Override
//	protected String getDirectoryName() {
//		return "/home/akrios/data/ram-disk-work/sgeh-temp/";
//	}
//	
//	private final class RoutingPublisher implements Publisher {
//
//		@Override
//		public void publishMessage(ApEventBean event) {
//			imsiRouter.onEvent(event);
//		}
//		
//		@Override
//		public void addEvents(String schemaType, Collection<MappedEvent> events, String message) {
//		}
//
//		@Override
//		public void removeEvents(String schemaType,
//				Collection<MappedEvent> events) {
//		}
//
//		@Override
//		public Thread start() {
//			return null;
//		}
//
//		@Override
//		public void flush(boolean activeFlushFlag) {
//		}
//
//		@Override
//		public void close() {
//		}
//	}
//}
