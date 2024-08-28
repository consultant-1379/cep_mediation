package com.ericsson.cepmediation.base.statistics;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.statistics.impl.DefaultStatistics;

/**
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

public class StatisticsCollector implements Runnable {

    private static Map<String, StatisticsAware> statisticsMap = new HashMap<String, StatisticsAware>();

    private static Statistics statistics = new DefaultStatistics();

    private static final Logger logger = LoggerFactory.getLogger(StatisticsCollector.class);

    private static long STATISTICS_COLLECTION_PERIOD = CepMediationProperties
            .getLongProperty(CepMediationProperty.STATS_COLLECTION_PERIOD);

    private static final boolean STATISTIC_COLLECTION_IS_ON = CepMediationProperties
            .getBooleanProperty(CepMediationProperty.STATS_COLLECTION_ACTIVE);

    @Override
    public void run() {
        logger.trace("Statistics Collector is prepeared to Collect Statistics.");

        while (true) {
            printStatistics();
            sleep();
            collectStatistics();

        }
    }

    private void printStatistics() {
        logger.trace("statistic is printing");
        logger.trace("************\n" + statistics.toString() + "\n\n");
    }

    private void collectStatistics() {
        logger.trace("collect statistics from Entities below");
        StatisticsAware statisticsAware = null;
        for (final Map.Entry<String, StatisticsAware> e : statisticsMap.entrySet()) {
            logger.trace(" ENTITY : " + e.getKey());
            statisticsAware = e.getValue();
            export(statisticsAware);
        }
        logger.trace("Statistics Collected.");
    }

    /**
     * This method is needed in order not to crash the StatisticsCollector
     * in case some run time exception occurred at one of export method Implementation
     * @param statisticsAware
     */
    private void export(final StatisticsAware statisticsAware) {
        try {
            statisticsAware.exportTo(statistics);
        } catch (final Exception e) {
            printErr(e);
        }
    }

    private void printErr(final Exception e) {
        logger.error(e.getMessage(), e);
    }

    private void sleep() {
        try {
            Thread.sleep(STATISTICS_COLLECTION_PERIOD);
        } catch (final Exception e) {
            printErr(e);
        }
    }

    public static <T extends StatisticsAware> void registerMe(final T statisticsAware) {
        logger.trace("Registration attempt from " + statisticsAware.getClass().getName());
        if (STATISTIC_COLLECTION_IS_ON && statisticsMap.get(statisticsAware.getClass().getName()) == null) {
            statisticsMap.put(statisticsAware.getClass().getName(), statisticsAware);
            logger.trace(statisticsAware.getClass().getName() + " is registered.");
        }
    }

    public static boolean isStatsCollectOn() {
        final String statisticsOnorOffMessage = STATISTIC_COLLECTION_IS_ON ? activeMessage() : " PASSIVE ";
        logger.trace("Statistics Collection is " + statisticsOnorOffMessage);
        return STATISTIC_COLLECTION_IS_ON;
    }

    private static String activeMessage() {
        return " ACTIVE and statistics is being collected with the **" + minute() + " MINUTE** intervals";
    }

    private static String minute() {
        return String.valueOf(STATISTICS_COLLECTION_PERIOD / (60000));
    }

}
