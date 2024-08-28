package com.ericsson.cepmediation.loading.asn1;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import rrc.Rrc;
import rrc.class_definitions.UL_DCCH_Message;

import com.oss.asn1.ASN1Project;
import com.oss.asn1.AbstractData;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;
import com.oss.asn1.PERUnalignedCoder;

public class AsnDecoderForTest {

    private List<byte[]> asn1DataList;

    private PERUnalignedCoder rrcCoder;

    private Asn1Decoder decoder;

    @Before
    public void setup() throws Exception {
        asn1DataList = new Asn1RealFiles().getSampleAsnData();

        ASN1Project.initialize();
        rrcCoder = Rrc.getPERUnalignedCoder();
        decoder = new Asn1Decoder();

    }

    @Test
    public void testAsnDecoder() throws DecodeFailedException, DecodeNotSupportedException {
        for (final byte[] data : asn1DataList) {
            final List<Map<String, String>> asn1MessageList = decodeByteCode(data);
            for (final Map<String, String> asn1Message : asn1MessageList) {
                System.out.println(asn1Message);
            }
        }
    }

    /**
     * @author epstvxj
     * This method is only used for testing purpose, to test decoding of the byte data
     * @param asn1Data
     * @throws DecodeNotSupportedException 
     * @throws DecodeFailedException 
     */
    private List<Map<String, String>> decodeByteCode(final byte[] asn1Data) throws DecodeFailedException, DecodeNotSupportedException {
        final AbstractData abstractData = rrcCoder.decode(new ByteArrayInputStream(asn1Data), new UL_DCCH_Message());
        final List<Map<String, String>> resultList = decoder.getRrcMeasurementReportAsn1Decoder().handleUlDcchMessage((UL_DCCH_Message) abstractData);
        return resultList;
    }

}
