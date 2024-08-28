package com.ericsson.cepmediation.datagen.mme;

import com.ericsson.cepmediation.datagen.common.XRecord;

public class MMEFooterRecord extends XRecord {
    private XMMELoader mmeloader;

    private int recordType = 3;

    public MMEFooterRecord(XMMELoader mmeloader) {
        super();
        this.mmeloader = mmeloader;
    }

    @Override
    protected void buildRecord() {
        setRecordType((mmeloader.getmMMFooterRecordHandler()).getRecordType());

        int terminationCause = (mmeloader.getmMMFooterRecordHandler()).getFileTerminationCause().ordinal();

        if (terminationCause != 4) {
            insertByte((byte) terminationCause, 0);
        } else {
            throw new IllegalArgumentException("Illegal termination cause : " + terminationCause);
        }
    }

    @Override
    protected int getRecordLength() {
        return 1;
    }

    protected int getRecordType() {
        return recordType;
    }

    protected void setRecordType(int recordType) {
        this.recordType = recordType;
    }
}
