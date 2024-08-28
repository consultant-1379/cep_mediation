/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.measreport;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.test.tools.calculators.RRCMeasurementEcnoRscp;

/**
 * These are the RRC measurements for
 * Path to files: cep_mediation\cep-mediation-correlation\src\test\resources\input_files\smartone_data
 * ROP Id: A20120516.1645-1700
 * IMSI: 454063302963615
 * this user in this ROP that are applicable for the calculations
 * ie the measurements with the correct trigger event type and are for the serving cell
 * @author eemecoy
 *
 */
public class RealFileRRCMeasurements {

    private final List<RRCMeasurementEcnoRscp> applicableRRCMeasurements = new ArrayList<RRCMeasurementEcnoRscp>();

    public final static long STORED_IMSI = 454063302963615L;

    /**
     * These are the RRC measurements for
     * Path to ROP files:  
     * this user in this ROP that are applicable for the calculations
     * ie the measurements with the correct trigger event type and are for the serving cell
     */
    public void storeApplicableRRCMeasurements() {
        //for timestamp 1337187481303
        final RRCMeasurementEcnoRscp measurement1 = new RRCMeasurementEcnoRscp();
        measurement1.setRscp(12);
        measurement1.setEcno(17);
        measurement1.setForServingCell(true);
        getApplicableRRCMeasurements().add(measurement1);

        ////////timestamp 1337187481533

        //for timestamp 1337187481533 and serving cell 173
        final RRCMeasurementEcnoRscp measurement2 = new RRCMeasurementEcnoRscp();
        measurement2.setRscp(12);
        measurement2.setEcno(17);
        measurement2.setForServingCell(true);
        getApplicableRRCMeasurements().add(measurement2);

        //for timestamp 1337187481533 and 346
        final RRCMeasurementEcnoRscp measurement3 = new RRCMeasurementEcnoRscp();
        measurement3.setRscp(13);
        measurement3.setEcno(19);
        measurement3.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement3);

        //for timestamp 1337187481533 and 140
        final RRCMeasurementEcnoRscp measurement4 = new RRCMeasurementEcnoRscp();
        measurement4.setRscp(12);
        measurement4.setEcno(17);
        measurement4.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement4);

        //for timestamp 1337187481533 and 184
        final RRCMeasurementEcnoRscp measurement5 = new RRCMeasurementEcnoRscp();
        measurement5.setRscp(12);
        measurement5.setEcno(16);
        measurement5.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement5);

        ////////new event

        //for timestamp 1337187481553 and sole measurement is for the serving cell
        final RRCMeasurementEcnoRscp measurement6 = new RRCMeasurementEcnoRscp();
        measurement6.setRscp(12);
        measurement6.setEcno(17);
        measurement6.setForServingCell(true);
        getApplicableRRCMeasurements().add(measurement6);

        /////////////new event

        //for timestamp 1337187482491 and scrambling code 346
        final RRCMeasurementEcnoRscp measurement7 = new RRCMeasurementEcnoRscp();
        measurement7.setRscp(13);
        measurement7.setEcno(19);
        measurement7.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement7);

        //for timestamp 1337187482491 and scrambling code 173 (which is serving cell)
        final RRCMeasurementEcnoRscp measurement8 = new RRCMeasurementEcnoRscp();
        measurement8.setRscp(11);
        measurement8.setEcno(16);
        measurement8.setForServingCell(true);
        getApplicableRRCMeasurements().add(measurement8);

        //for timestamp 1337187482491 and scrambling code 184
        final RRCMeasurementEcnoRscp measurement9 = new RRCMeasurementEcnoRscp();
        measurement9.setRscp(12);
        measurement9.setEcno(16);
        measurement9.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement9);

        //for timestamp 1337187482491 and scrambling code 140
        final RRCMeasurementEcnoRscp measurement10 = new RRCMeasurementEcnoRscp();
        measurement10.setRscp(12);
        measurement10.setEcno(16);
        measurement10.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement10);

        ///////////////new event

        //for timestamp 1337187483584 and scrambling code 346
        final RRCMeasurementEcnoRscp measurement11 = new RRCMeasurementEcnoRscp();
        measurement11.setRscp(13);
        measurement11.setEcno(18);
        measurement11.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement11);

        //for timestamp 1337187483584 and scrambling code 173 which is for the serving cell
        final RRCMeasurementEcnoRscp measurement12 = new RRCMeasurementEcnoRscp();
        measurement12.setRscp(12);
        measurement12.setEcno(16);
        measurement12.setForServingCell(true);
        getApplicableRRCMeasurements().add(measurement12);

        //for timestamp 1337187483584 and scrambling code 184
        final RRCMeasurementEcnoRscp measurement13 = new RRCMeasurementEcnoRscp();
        measurement13.setRscp(12);
        measurement13.setEcno(15);
        measurement13.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement13);

        //for timestamp 1337187483584 and scrambling code 140
        final RRCMeasurementEcnoRscp measurement14 = new RRCMeasurementEcnoRscp();
        measurement14.setRscp(12);
        measurement14.setEcno(15);
        measurement14.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement14);

        //////////////////new event

        //for timestamp 1337187484144 and scrambling code 173 but on a different cell/rnc so not serving cell
        final RRCMeasurementEcnoRscp measurement15 = new RRCMeasurementEcnoRscp();
        measurement15.setRscp(15);
        measurement15.setEcno(20);
        measurement15.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement15);

        //for timestamp 1337187484144 and scrambling code 346
        final RRCMeasurementEcnoRscp measurement16 = new RRCMeasurementEcnoRscp();
        measurement16.setRscp(13);
        measurement16.setEcno(16);
        measurement16.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement16);

        //for timestamp 1337187484144 and scrambling code 140
        final RRCMeasurementEcnoRscp measurement17 = new RRCMeasurementEcnoRscp();
        measurement17.setRscp(12);
        measurement17.setEcno(14);
        measurement17.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement17);

        //for timestamp 1337187484144 and scrambling code 184
        final RRCMeasurementEcnoRscp measurement18 = new RRCMeasurementEcnoRscp();
        measurement18.setRscp(9);
        measurement18.setEcno(10);
        measurement18.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement18);

        ///////////////////////

        //for timestamp 1337187485994 and scrambling code 346
        final RRCMeasurementEcnoRscp measurement19 = new RRCMeasurementEcnoRscp();
        measurement19.setRscp(14);
        measurement19.setEcno(20);
        measurement19.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement19);

        //for timestamp 1337187485994 and scrambling code 184
        final RRCMeasurementEcnoRscp measurement20 = new RRCMeasurementEcnoRscp();
        measurement20.setRscp(12);
        measurement20.setEcno(16);
        measurement20.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement20);

        //for timestamp 1337187485994 and scrambling code 140
        final RRCMeasurementEcnoRscp measurement21 = new RRCMeasurementEcnoRscp();
        measurement21.setRscp(12);
        measurement21.setEcno(16);
        measurement21.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement21);

        //for timestamp 1337187485994 and scrambling code 173 ie for serving cell
        final RRCMeasurementEcnoRscp measurement22 = new RRCMeasurementEcnoRscp();
        measurement22.setRscp(9);
        measurement22.setEcno(10);
        measurement22.setForServingCell(true);
        getApplicableRRCMeasurements().add(measurement22);

        //for timestamp 1337187485994 and scrambling code 366
        final RRCMeasurementEcnoRscp measurement23 = new RRCMeasurementEcnoRscp();
        measurement23.setRscp(8);
        measurement23.setEcno(8);
        measurement23.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement23);

        //////////////////

        //for timestamp 1337187486014 and scrambling code 346
        final RRCMeasurementEcnoRscp measurement24 = new RRCMeasurementEcnoRscp();
        measurement24.setRscp(14);
        measurement24.setEcno(20);
        measurement24.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement24);

        //for timestamp 1337187486014 and scrambling code 184
        final RRCMeasurementEcnoRscp measurement25 = new RRCMeasurementEcnoRscp();
        measurement25.setRscp(12);
        measurement25.setEcno(16);
        measurement25.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement25);

        //for timestamp 1337187486014 and scrambling code 140
        final RRCMeasurementEcnoRscp measurement26 = new RRCMeasurementEcnoRscp();
        measurement26.setRscp(12);
        measurement26.setEcno(16);
        measurement26.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement26);

        //for timestamp 1337187486014 and scrambling code 173, so is serving cell
        final RRCMeasurementEcnoRscp measurement27 = new RRCMeasurementEcnoRscp();
        measurement27.setRscp(9);
        measurement27.setEcno(10);
        measurement27.setForServingCell(false);
        getApplicableRRCMeasurements().add(measurement27);

        //////////////////

        //for timestamp 1337187486024 and scrambling code 346
        final RRCMeasurementEcnoRscp measurement28 = new RRCMeasurementEcnoRscp();
        measurement28.setRscp(14);
        measurement28.setEcno(20);
        measurement28.setForServingCell(false);
        applicableRRCMeasurements.add(measurement28);

        //for timestamp 1337187486024 and scrambling code 140
        final RRCMeasurementEcnoRscp measurement29 = new RRCMeasurementEcnoRscp();
        measurement29.setRscp(12);
        measurement29.setEcno(16);
        measurement29.setForServingCell(false);
        applicableRRCMeasurements.add(measurement29);

        //for timestamp 1337187486024 and scrambling code 173, but different cell/rnc
        final RRCMeasurementEcnoRscp measurement30 = new RRCMeasurementEcnoRscp();
        measurement30.setRscp(9);
        measurement30.setEcno(10);
        measurement30.setForServingCell(false);
        applicableRRCMeasurements.add(measurement30);

        ////////////////////////
        //for timestamp 1337187487004 and scrambling code 346
        final RRCMeasurementEcnoRscp measurement31 = new RRCMeasurementEcnoRscp();
        measurement31.setRscp(14);
        measurement31.setEcno(23);
        measurement31.setForServingCell(false);
        applicableRRCMeasurements.add(measurement31);

        //for timestamp 1337187487004 and scrambling code 184
        final RRCMeasurementEcnoRscp measurement32 = new RRCMeasurementEcnoRscp();
        measurement32.setRscp(12);
        measurement32.setEcno(19);
        measurement32.setForServingCell(false);
        applicableRRCMeasurements.add(measurement32);

        //for timestamp 1337187487004 and scrambling code 140
        final RRCMeasurementEcnoRscp measurement33 = new RRCMeasurementEcnoRscp();
        measurement33.setRscp(12);
        measurement33.setEcno(19);
        measurement33.setForServingCell(false);
        applicableRRCMeasurements.add(measurement33);

        //for timestamp 1337187487004 and scrambling code 366
        final RRCMeasurementEcnoRscp measurement34 = new RRCMeasurementEcnoRscp();
        measurement34.setRscp(8);
        measurement34.setEcno(11);
        measurement34.setForServingCell(false);
        applicableRRCMeasurements.add(measurement34);

        //for timestamp 1337187487004 and scrambling code 173, which is scrambling code for serving cell for wrong cell
        final RRCMeasurementEcnoRscp measurement35 = new RRCMeasurementEcnoRscp();
        measurement35.setRscp(7);
        measurement35.setEcno(10);
        measurement35.setForServingCell(false);
        applicableRRCMeasurements.add(measurement35);

    }

    /**
     * @return the applicableRRCMeasurements
     */
    public List<RRCMeasurementEcnoRscp> getApplicableRRCMeasurements() {
        return applicableRRCMeasurements;
    }

}
