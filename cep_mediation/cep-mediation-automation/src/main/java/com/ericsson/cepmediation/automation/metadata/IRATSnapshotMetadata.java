package com.ericsson.cepmediation.automation.metadata;

import java.sql.SQLException;
import java.util.Arrays;

public class IRATSnapshotMetadata extends SnapshotMetadata {

    public IRATSnapshotMetadata() throws MetadataException, SQLException {
        super(Arrays.asList("DATETIME_ID"), "IRAT");
    }

    @Override
    public String getViewName() {
        return "event_e_ran_hfa_irat_err_raw";
    }
}
