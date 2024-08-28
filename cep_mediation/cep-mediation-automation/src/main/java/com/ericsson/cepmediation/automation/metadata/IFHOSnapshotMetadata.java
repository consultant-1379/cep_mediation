package com.ericsson.cepmediation.automation.metadata;

import java.sql.SQLException;
import java.util.Arrays;

public class IFHOSnapshotMetadata extends SnapshotMetadata {

    public IFHOSnapshotMetadata() throws MetadataException, SQLException {
        super(Arrays.asList("DATETIME_ID"), "IFHO");
    }

    @Override
    public String getViewName() {
        return "event_e_ran_hfa_ifho_err_raw";
    }
}


