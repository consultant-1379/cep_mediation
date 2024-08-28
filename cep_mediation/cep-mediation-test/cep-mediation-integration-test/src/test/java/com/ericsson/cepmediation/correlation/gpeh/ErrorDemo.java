package com.ericsson.cepmediation.correlation.gpeh;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

import rrc.Rrc;
import rrc.class_definitions.UL_DCCH_Message;

import com.oss.asn1.AbstractData;
import com.oss.asn1.PERUnalignedCoder;

public class ErrorDemo {
	
	private static final String FILE_NAME = "/home/akrios/temp/1326879679788";

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(FILE_NAME);
			byte[] data = new byte[18];
			int read = fis.read(data);
			System.out.println("read bytes: " + read);
			parseMeasurementReport(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void parseMeasurementReport(byte[] data) {
		try {
			Rrc.initialize();
			PERUnalignedCoder coder = Rrc.getPERUnalignedCoder();
			
			// i tried various variations of below options without success
			coder.enableAutomaticDecoding();
			coder.enableAutomaticEncoding();
			coder.enableDecoderDebugging();
			coder.enableEncoderDebugging();
			coder.disableDecoderConstraints();
			coder.disableEncoderConstraints();
			coder.disableContainedValueDecoding();
			coder.enableRelaxedDecoding();
			
			AbstractData other = coder.decode(new ByteArrayInputStream(data), new UL_DCCH_Message());
			System.out.println(other);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
