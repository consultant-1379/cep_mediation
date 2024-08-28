package com.ericsson.cepmediation.correlation.core;

import java.io.File;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.loading.exception.ParsingFailedException;

/**
 * Core correlation perfomance testing class
 *
 * @author exuexie
 */
@Ignore("requires files in private directory")
public class CoreCorrelationSessionPerformanceTest extends CoreCorrelationPerformanceTesterBase {

    //out put folder
    protected String directoryPath = "e:\\exuexie\\ebm";

    @Before
    public void setUp() {

        init();

        //start parse service
        configureParser();

        //start the esper service
        configureEsperService();

        //configure the forwarder
        configureForwarder();

    }

    @Test
    public void coreCorrelationFunctionTest() {

        List<File> files = getFiles(directoryPath);

        //execute the parser to parse files
        try {
            parser.execute(files);

            Thread.sleep(300000);
        } catch (ParsingFailedException e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        } catch (InterruptedException e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        }

    }

}