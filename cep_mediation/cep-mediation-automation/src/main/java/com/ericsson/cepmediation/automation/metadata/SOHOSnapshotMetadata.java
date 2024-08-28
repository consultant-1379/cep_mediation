package com.ericsson.cepmediation.automation.metadata;

import java.sql.SQLException;
import java.util.Arrays;

public class SOHOSnapshotMetadata extends SnapshotMetadata {

    public SOHOSnapshotMetadata() throws MetadataException, SQLException {
        super(Arrays.asList("DATETIME_ID"), "SOHO");
    }

    @Override
    public String getViewName() {
        return "event_e_ran_hfa_soho_err_raw";
    }
}
