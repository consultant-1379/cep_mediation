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

/**
 * This factory class creates parser instances
 * @author eachsaj
 */

public abstract class ParserFactory {
    private static final Logger logger = LoggerFactory.getLogger(ParserFactory.class);

    /**
     * Create a parser for the requested parser type
     * @param parserType The type of parser to create
     * @return   parser instance 
     */
    public static ParserService create(final InputType parserType) {
        logger.debug(parserType.toString());
        switch (parserType) {

        case EBS://EBM parser
            logger.debug("Creating EBMParser");
            return new EBMParser();

        case STAPLE://Staple parser
            logger.debug("Creating Staple Parser");
            return new StapleParser();

        case CAPTOOL://Captool parser
            logger.debug("Creating Captool Parser");
            return new CaptoolParser();

        case GPEH://Staple parser
            logger.debug("Creating GPEH Parser");
            return new GPEHParser();

        default://otherwise illegal type parser
            throw new IllegalArgumentException("Unknown parser type requested of " + parserType);
        }

    }
}
