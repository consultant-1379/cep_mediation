package com.ericsson.cepmediation.automation.metadata;

import java.sql.SQLException;
import java.util.Arrays;

public class HSDSCHSnapshotMetadata extends SnapshotMetadata {

    public HSDSCHSnapshotMetadata() throws MetadataException, SQLException {
        super(Arrays.asList("DATETIME_ID"), "HSDSCH");
    }

    @Override
    public String getViewName() {
        return "event_e_ran_hfa_hsdsch_err_raw";
    }
}
