package com.ericsson.cepmediation.automation.metadata;

import java.sql.SQLException;
import java.util.Arrays;

public class CFASnapshotMetadata extends SnapshotMetadata {

    public CFASnapshotMetadata() throws MetadataException, SQLException {
        super(Arrays.asList("DATETIME_ID"), "CFA");
    }

    @Override
    public String getViewName() {
        return "event_e_ran_cfa_err_raw";
    }
}
