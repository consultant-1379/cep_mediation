package com.ericsson.cepmediation.datagen.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.loading.filerecords.NEFileReader;
import com.ericsson.cepmediation.loading.filerecords.Record;
import com.ericsson.cepmediation.loading.filerecords.RecordDescriptor;
import com.ericsson.cepmediation.loading.filerecords.RecordFactory;
import com.ericsson.cepmediation.loading.gpeh.GPEHFooterRecordHandler;

public class Util {

    public static List<Record> getRecords(RecordDescriptor recordDescriptor, File neFile) throws FileNotFoundException, IOException{
        InputStream neFileInputStream = new NEFileReader().getInputStreamForNeFile(neFile);
        List<Record> recordList = new ArrayList<Record>();
        // Read the file
        for (int recordNo = 0;; recordNo++) {
            try {
                // Read the next record
                final Record newRecord = RecordFactory.getNextRecord(neFileInputStream, recordDescriptor);

                // Add the record to the record array
                recordList.add(newRecord);

                // File reading has been completed
                if (newRecord.getType() == new GPEHFooterRecordHandler().getRecordType()) {
                    neFileInputStream.close();
                    return recordList;
                }
            }
            // Catch IO exceptions, add the file name and the record number and rethrow
            catch (final IOException e) {
                neFileInputStream.close();
                throw new IOException("processing of \"" + neFile + "\" failed at line (" + recordNo + "): ", e);
            }
        }
    }
}
