package com.ericsson.eniq.events.cepmediation.datagen_precook.common;



public abstract class XRecord {
	public final static int MAX_RECORD_LENGTH = 65535;
	
	private byte[] record;
	
	protected abstract void buildRecord();
	
	protected abstract int getRecordLength();
	
	protected void insertString(String string, int pos) {
		if (string != null && string.length() > 0) {
			byte[] bytes = string.getBytes();
			check(bytes.length, pos);
			System.arraycopy(bytes, 0, record, pos, bytes.length);
		}
	}

	protected void insertShort(short value, int pos) {
		check(2, pos);
		record[pos] = (byte)(value >> 8);
		record[pos+1] = (byte)(value & 0xff);
	}
	
	protected void insertByte(byte value, int pos) {
		check(1, pos);
		record[pos] = value;
	}
	
	protected void insertBytes(byte[] bytes, int pos) {
		check(bytes.length, pos);
		System.arraycopy(bytes, 0, record, pos, bytes.length);
	}
	
	private void check(int length, int pos) {
		if (record == null || record.length == 0) {
			throw new IllegalStateException("need to call toByteArray to initialise record");
		}
//		if (record.length < pos + length) {
//			throw new IllegalArgumentException("record out of space");
//		}
	}

	public byte[] toByteArray() {
		record = new byte[getRecordLength()];
		buildRecord();
		return record;
	}
	

}
