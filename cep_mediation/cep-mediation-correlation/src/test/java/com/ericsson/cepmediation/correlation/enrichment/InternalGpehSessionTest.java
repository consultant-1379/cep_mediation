/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.enrichment;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_RRC_MEASUREMENT;

/**
 * @author eemecoy
 *
 */
public class InternalGpehSessionTest {

    private InternalGpehSession internalGpehSession;

    @Before
    public void setup() {
        internalGpehSession = new InternalGpehSession();
    }

    @Test
    public void testCalculatingAverageRscp_RscValuesAlreadyMapped() {
        final List<EE_RRC_MEASUREMENT> listOfRrcMeasurements = setupRrcMeasurementsWithRscps(-24, -7, -34, Integer.MIN_VALUE);
        internalGpehSession.setRrcMeasurementList(listOfRrcMeasurements);
        final int averageRscp = internalGpehSession.getAverageRscp();
        assertThat(averageRscp, is(-11));
    }

    private List<EE_RRC_MEASUREMENT> setupRrcMeasurementsWithRscps(final int... rscps) {
        final List<EE_RRC_MEASUREMENT> listOfRrcMeasurements = new ArrayList<EE_RRC_MEASUREMENT>();
        for (final int rscp : rscps) {
            final EE_RRC_MEASUREMENT rrcMeasurement = new EE_RRC_MEASUREMENT();
            rrcMeasurement.setRSCP(rscp);
            listOfRrcMeasurements.add(rrcMeasurement);
        }
        return listOfRrcMeasurements;
    }

    @Test
    public void testCalculatingAverageEcno_EcnoValuesAlreadyMapped() {
        final List<EE_RRC_MEASUREMENT> listOfRrcMeasurements = setupRrcMeasurementsWithEcnos(-24, -7, -34, Integer.MIN_VALUE);
        internalGpehSession.setRrcMeasurementList(listOfRrcMeasurements);
        assertThat(internalGpehSession.getAverageEcno(), is(-11));
    }

    private List<EE_RRC_MEASUREMENT> setupRrcMeasurementsWithEcnos(final int... ecnos) {
        final List<EE_RRC_MEASUREMENT> listOfRrcMeasurements = new ArrayList<EE_RRC_MEASUREMENT>();
        for (final int ecno : ecnos) {
            final EE_RRC_MEASUREMENT rrcMeasurement = new EE_RRC_MEASUREMENT();
            rrcMeasurement.setECNO(ecno);
            listOfRrcMeasurements.add(rrcMeasurement);
        }
        return listOfRrcMeasurements;
    }

}
