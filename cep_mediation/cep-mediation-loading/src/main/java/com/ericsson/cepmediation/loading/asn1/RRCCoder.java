/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1;

import java.io.ByteArrayInputStream;

import rrc.Rrc;
import rrc.class_definitions.UL_DCCH_Message;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.oss.asn1.ASN1Project;
import com.oss.asn1.AbstractData;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;
import com.oss.asn1.PERUnalignedCoder;

/**
 * Wrapper around the Asn1 decoder
 * 
 * @author eemecoy
 *
 */
public class RRCCoder {

    private static final boolean DEBUG_ON = false;

    private final PERUnalignedCoder perUnalignedCoder;

    public RRCCoder() {
        try {
            ASN1Project.initialize();
            perUnalignedCoder = Rrc.getPERUnalignedCoder();
            initRrcCoder();
        } catch (final Exception e) {
            throw new RuntimeException("Unable to initialize ASN runtime", e);
        }
    }

    public AbstractData decodeByteArrayIntoAbstractData(final ApEventBean apEventBean) throws DecodeNotSupportedException, DecodeFailedException {
        return perUnalignedCoder.decode(new ByteArrayInputStream(apEventBean.getAsn1Data()), new UL_DCCH_Message());
    }

    /**
     * Has default access to allow use by test decoder
     */
    void initRrcCoder() {
        perUnalignedCoder.enableAutomaticDecoding();
        perUnalignedCoder.enableAutomaticEncoding();
        perUnalignedCoder.disableDecoderConstraints();
        perUnalignedCoder.disableEncoderConstraints();
        perUnalignedCoder.disableContainedValueDecoding();
        perUnalignedCoder.enableRelaxedDecoding();
        if (DEBUG_ON) {
            perUnalignedCoder.enableDecoderDebugging();
            perUnalignedCoder.enableEncoderDebugging();
        }
    }

}
