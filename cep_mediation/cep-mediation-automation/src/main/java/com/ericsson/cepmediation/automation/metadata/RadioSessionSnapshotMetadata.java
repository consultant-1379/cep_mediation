package com.ericsson.cepmediation.automation.metadata;

import java.sql.SQLException;
import java.util.Arrays;

public class RadioSessionSnapshotMetadata extends SnapshotMetadata {
    public RadioSessionSnapshotMetadata() throws MetadataException, SQLException {
        super(Arrays.asList("DATETIME_ID"), "GPEH_SESSION");
    }

    @Override
    public String getViewName() {
        return "event_e_ran_session_raw";
    }

}
