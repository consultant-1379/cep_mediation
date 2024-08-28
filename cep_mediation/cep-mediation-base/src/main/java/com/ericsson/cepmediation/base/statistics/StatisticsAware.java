package com.ericsson.cepmediation.base.statistics;


/**
 * There should be one global statistics collection thread 
 * which will every N time units (i.e. every 5 minutes) iterate
 * over all objects which export some statistics, and collect them.<p>
 * 
 * Subclasses do not have to be thread safe with respect to this method being
 * called with multiple threads at the same time. They should provide reasonable
 * level of thread safety regarding statistics collection thread calling
 * this method and other business level threads invoking other methods
 * of statistics aware objects at the same time.
 * 
 *
 * if one would like to export statistics belongs to an entity , it is sufficient to add statement below, inside the constructor of the related entity
 *     StatisticsCollector.registerMe(this);
 *               
 * then implementing StatisticsAware Interface by overriding exportTo(Statistics statistics) method 
 * as below will enable the logging of statistics of the related entity.
 * 
 *      @Override
 *		public void exportTo(Statistics statistics) {	
 *		 	statistics.add(Statistics.Keys.RNC_ROUTER_NUMBER_OF_ROUTED_EVENTS, numberOfRoutedEvents);
 *		 	numberOfRoutedEvents.set(0);
 *      }                
 * 
 * @author ecamosm
 * 
 **/
public interface StatisticsAware {

	public void exportTo(Statistics statistics);
	
}
