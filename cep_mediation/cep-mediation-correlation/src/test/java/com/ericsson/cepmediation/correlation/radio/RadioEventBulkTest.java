package com.ericsson.cepmediation.correlation.radio;

import com.oss.asn1.ASN1Project;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;
import com.oss.asn1.PERUnalignedCoder;
import org.junit.Ignore;
import rrc.Rrc;
import rrc.class_definitions.UL_DCCH_Message;

import java.io.ByteArrayInputStream;

@Ignore("taking too long to run in jenkins")
public class RadioEventBulkTest {

    //@Test
    public void shouldDecodeAllEventsInARop() throws DecodeFailedException, DecodeNotSupportedException, InterruptedException {
        new Thread(new AsnDecoder()).start();
        new Thread(new AsnDecoder()).start();
        new Thread(new AsnDecoder()).start();
        new Thread(new AsnDecoder()).start();
        new Thread(new AsnDecoder()).start();
        Thread.currentThread().join();
    }

    private class AsnDecoder implements Runnable {
        private PERUnalignedCoder rrcCoder = null;

        private final byte[][] asnArray = {
                { -128, 0, 0, 1, 2, 36, 0, 101, 0, 34, -128, 6, -79, -78, 24, -95, -12, 41, 104, -54, -12, -63, -108, 59, -34, 26, -39, -12, -120, 18, -126, -21, -41, -125, 84, 80, 2, 0, 5, 120 },
                { -128, 0, 0, 1, 2, 38, 0, 69, -5, -43, -103, 70, 111, -84, 32, -78, 10, 4, 0, -52, 85, 68, 21, -55, 22, -20, 26, 64, -128, 80, 0, -73, -28, 19, 8, 64 },
                { -128, 0, 0, 1, 2, 52, 108, -112, 0, -127, 4, 16, 32, -63, 30, -112, 121, -96 },
                { -128, 0, 0, 1, 2, 36, 0, 37, 0, 68, 2, -58, 115, 74, -120, -95, -97, 35, -98, -58, 101, 76, -127, 0, -52 },
                { -128, 0, 0, 1, 2, 5, -123, 64 },
                { -128, 0, 0, 1, 2, 36, 0, 101, 0, 32, -128, 6, 79, -76, -124, -95, 58, 24, 4, -45, -43, 15, 20, 50, -28, -41, -37, 4, -127, -46, -124, 115, 28, 67, 91, -114, 50, 0, 9, -24 },
                { -128, 0, 0, 1, 2, 36, -96, 65, -115, 102, 17, 13, 22, 48, -120, 103, 0, -93, 65, -128, 107 },
                { -128, 0, 0, 1, 2, 38, 0, -123, 14, -78, 118, 102, 125, -82, -128, -96, -40, 101, -28, -45, 100, -114, -108, 58, -54, 89, 88, -40, -119, -30, -122, 58, -34, 115, 79, 78, 56, 80, 41,
                        36 },
                { -128, 0, 0, 1, 2, 36, 0, 101, 0, 34, -128, 6, -79, -78, 24, -95, -12, 41, 104, -54, -12, -63, -108, 59, -34, 26, -39, -12, -120, 18, -126, -21, -41, -125, 84, 80, 2, 0, 5, 120 } };

        public AsnDecoder() {
            try {
                ASN1Project.initialize();
                rrcCoder = Rrc.getPERUnalignedCoder();
                initRrcCoder();
            } catch (final Exception e) {
                e.printStackTrace();
            }
        }

        void initRrcCoder() {
            rrcCoder.enableAutomaticDecoding();
            rrcCoder.enableAutomaticEncoding();
            rrcCoder.disableDecoderConstraints();
            rrcCoder.disableEncoderConstraints();
            rrcCoder.disableContainedValueDecoding();
            rrcCoder.enableRelaxedDecoding();
            //   rrcCoder.enableDecoderDebugging();
            //   rrcCoder.enableEncoderDebugging();
        }

        public void run() {
            for (int i = 0; i < asnArray.length; i++) {
                try {
                    rrcCoder.decode(new ByteArrayInputStream(asnArray[i]), new UL_DCCH_Message());
                } catch (final Exception e) {
                    e.printStackTrace();
                }
            }
            return;
        }

    }

}
