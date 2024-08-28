/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */
package com.ericsson.cepmediation.loading.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.base.util.threadpool.Worker;
import com.ericsson.cepmediation.loading.service.task.CaptoolParsingJob;
import com.ericsson.cepmediation.loading.service.task.EBSParsingJob;
import com.ericsson.cepmediation.loading.service.task.ParsingJob;
import com.ericsson.cepmediation.loading.service.task.StapleParsingJob;
import com.ericsson.cepmediation.loading.service.task.gpeh.GPEHParsingJob;

/**
 * A Factory for parsing jobs.
 * @author eachsaj
 * @category Loading
 */
public abstract class ParsingJobFactory {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(ParsingJobFactory.class);

    /**This method creates a parsing job base on the request.
     * @param parserType enum InputType type
     * @param jobCounter, int type thread count
     * @param config, an instance of {@link ConfigData}
     * @param serviceData, an instance {@link ServiceConfigBean}
     * @return instance of {@link Worker}
     */
    public static Worker create(final InputType parserType, final int jobCounter, final ConfigData config, final ServiceConfigBean serviceData) {
        logger.trace("create(" + parserType + ", " + jobCounter, ", " + "configData" + "," + serviceData.toString() + "-->");

        ParsingJob res = null;
        switch (parserType) {
        case EBS:
            res = new EBSParsingJob(jobCounter, config, serviceData);
            break;
        case STAPLE:
            res = new StapleParsingJob(jobCounter, config, serviceData);
            break;
        case CAPTOOL:
            res = new CaptoolParsingJob(jobCounter, config, serviceData);
            break;
        case GPEH:
            res = new GPEHParsingJob(jobCounter, config, serviceData);
            break;
        default:
            logger.warn("Unknow type parser requested");
            throw new IllegalArgumentException("Unknow type parser requested");
        }

        res.init();

        return res;

    }
}
