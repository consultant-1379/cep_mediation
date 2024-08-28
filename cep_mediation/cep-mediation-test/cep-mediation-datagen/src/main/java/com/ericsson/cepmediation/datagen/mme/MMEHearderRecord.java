package com.ericsson.cepmediation.datagen.mme;

import java.util.Calendar;
import java.util.TimeZone;

import com.ericsson.cepmediation.datagen.common.DatagenPropertiesConstants;
import com.ericsson.cepmediation.datagen.common.XRecord;

public class MMEHearderRecord extends XRecord {

    XMMELoader mmeloader;

    private int recordType = 0;

    public MMEHearderRecord(XMMELoader mmeloader) {
        super();
        this.mmeloader = mmeloader;
    }

    @Override
    protected void buildRecord() {
        setRecordType((mmeloader.getMmeHeaderRecordHandler()).getRecordType());

        insertByte((byte) Integer.parseInt((mmeloader.getMmeHeaderRecordHandler()).getFileFormatVersion()), 0);
        insertByte((byte) Integer.parseInt((mmeloader.getMmeHeaderRecordHandler()).getFileInformationVersion()), 1);
        Calendar timestamp = (mmeloader.getMmeHeaderRecordHandler()).getTimestamp();

        // Change Header Date to current date
        Calendar currentDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        //add 8 hour offset to the current date because CEP change the header to UTC, it should have local Time in Header
        currentDate.add(Calendar.HOUR_OF_DAY, DatagenPropertiesConstants.ROPOFFSET);

        timestamp.set(Calendar.YEAR, currentDate.get(Calendar.YEAR));
        timestamp.set(Calendar.MONTH, currentDate.get(Calendar.MONTH));
        timestamp.set(Calendar.DAY_OF_MONTH, currentDate.get(Calendar.DAY_OF_MONTH));
        timestamp.set(Calendar.HOUR_OF_DAY, currentDate.get(Calendar.HOUR_OF_DAY));

        insertShort((short) timestamp.get(Calendar.YEAR), 2);
        insertByte((byte) (timestamp.get(Calendar.MONTH) + 1), 4);
        insertByte((byte) timestamp.get(Calendar.DAY_OF_MONTH), 5);
        insertByte((byte) timestamp.get(Calendar.HOUR_OF_DAY), 6);
        insertByte((byte) timestamp.get(Calendar.MINUTE), 7);
        insertByte((byte) timestamp.get(Calendar.SECOND), 8);
    }

    @Override
    protected int getRecordLength() {
        return 9;
    }

    protected int getRecordType() {
        return recordType;
    }

    protected void setRecordType(int recordType) {
        this.recordType = recordType;
    }
}
