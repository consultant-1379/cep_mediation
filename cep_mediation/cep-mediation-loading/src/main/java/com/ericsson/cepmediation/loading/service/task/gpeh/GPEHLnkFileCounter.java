package com.ericsson.cepmediation.loading.service.task.gpeh;

import java.io.File;
import java.io.IOException;

import com.ericsson.cepmediation.loading.filerecords.Record;
import com.ericsson.cepmediation.loading.filerecords.RecordBuffer;
import com.ericsson.cepmediation.loading.filerecords.RecordDescriptor;
import com.ericsson.cepmediation.loading.gpeh.GPEHLinkRecordHandler;

public class GPEHLnkFileCounter {
    // Name of the file to be read
    private final File mp0File;

    // The descriptor of this record and its handlers
    private final RecordDescriptor recordDescriptor;


    public GPEHLnkFileCounter(final File neFile, final RecordDescriptor recordDescriptor) {
        // Save the record buffer member data
        this.mp0File = neFile;
        this.recordDescriptor = recordDescriptor;
    }

    /**
     * Count the number of link files 
     * @return
     */
    public int countLnkFiles() {
        int ropFileCount = 0;
        RecordBuffer recordBuffer = null;
        try {
            recordBuffer = new RecordBuffer(mp0File, recordDescriptor);
            for (final Record record : recordBuffer.getRecordList()) {
                if (record.getType() == GPEHLinkRecordHandler.RECORD_TYPE) {
                    ropFileCount++;
                }
            }
        } catch (final IOException e) {

        }

        return ropFileCount;
    }
}
