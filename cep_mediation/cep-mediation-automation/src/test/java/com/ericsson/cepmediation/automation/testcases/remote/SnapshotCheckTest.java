/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.automation.testcases.remote;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.automation.launcher.ApplicationLauncher;
import com.ericsson.cepmediation.automation.metadata.CFASnapshotMetadata;
import com.ericsson.cepmediation.automation.metadata.HSDSCHSnapshotMetadata;
import com.ericsson.cepmediation.automation.metadata.IFHOSnapshotMetadata;
import com.ericsson.cepmediation.automation.metadata.IRATSnapshotMetadata;
import com.ericsson.cepmediation.automation.metadata.MetadataException;
import com.ericsson.cepmediation.automation.metadata.RadioSessionSnapshotMetadata;
import com.ericsson.cepmediation.automation.metadata.SOHOSnapshotMetadata;
import com.ericsson.cepmediation.automation.metadata.SnapshotMetadata;
import com.ericsson.cepmediation.automation.snapshot.Snapshot;
import com.ericsson.cepmediation.automation.snapshot.SnapshotException;
import com.ericsson.cepmediation.automation.snapshot.SnapshotExtraColumns;
import com.ericsson.cepmediation.automation.snapshot.SnapshotFileException;
import com.ericsson.cepmediation.automation.snapshot.SnapshotManager;

@RunWith(Parameterized.class)
public class SnapshotCheckTest {
    private static final Logger logger = LoggerFactory.getLogger(SnapshotCheckTest.class);

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private static SnapshotManager manager;

    private static List<Snapshot<?>> lastSnapshots = new ArrayList<Snapshot<?>>();

    private static List<Snapshot<?>> newSnapshots = new ArrayList<Snapshot<?>>();

    private Snapshot<?> snapshot;

    private SnapshotComparisonData compData;

    private String viewName;

    private static final ApplicationLauncher launcher = new ApplicationLauncher();

    public static void init() throws Exception {
        logger.info("Running application...");
        launcher.runApplication();

        int waitInterval = 10 * 60 * 1000;
        logger.info("Waiting for " + (waitInterval / (60 * 1000)) + " minutes for the application to finish.");
        Thread.sleep(waitInterval);

        logger.info("Application stopped, Snapshoting...");
        launcher.stopApplication();

        manager = new SnapshotManager();

        createSnapshot(new RadioSessionSnapshotMetadata());
        createSnapshot(new CFASnapshotMetadata());
        createSnapshot(new HSDSCHSnapshotMetadata());
        createSnapshot(new IFHOSnapshotMetadata());
        createSnapshot(new IRATSnapshotMetadata());
        createSnapshot(new SOHOSnapshotMetadata());
    }

    private static void createSnapshot(SnapshotMetadata metaData) throws IOException, SnapshotFileException, MetadataException, SQLException, SnapshotException {
        Snapshot<?> lastSnapshot = manager.getLastSnapshot(metaData);
        logger.info("Loaded last snapshot: " + lastSnapshot);
        Snapshot<?> newSnapshot = manager.createSnapshot(metaData);
        logger.info("Created new snapshot: " + newSnapshot);
        if (lastSnapshot == null) {
            manager.save(newSnapshot);
        } else {
            lastSnapshots.add(lastSnapshot);
            newSnapshots.add(newSnapshot);
        }
    }

    @AfterClass
    public static void saveSnapshot() throws IOException, SnapshotFileException {
        for (Snapshot<?> s : newSnapshots) {
            logger.info("Saving snapshot: " + s);
            manager.save(s);
        }
    }

    public SnapshotCheckTest(SnapshotComparisonData compData, Snapshot<?> newSnapshot) {
        this.compData = compData;
        this.snapshot = newSnapshot;
        this.viewName = newSnapshot.getMetaData().getViewName();
    }

    @Test
    public void checkRadioSessionSnapshots() {
        if (compData.getLastSnapshotFieldName() == null) {
            logger.info(viewName + " A column from the snapshot is not present in the previous snapshot: " + compData.getNewSnapshotFieldName());
        } else if (compData.getNewSnapshotFieldName() == null) {
            logger.info(viewName + " A column from the last snapshot is not present in the new snapshot: " + compData.getLastSnapshotFieldName());
        } else if (!compData.getLastSnapshotFieldValue().equalsIgnoreCase(compData.getNewSnapshotFieldValue())) {
            logger.info(viewName + " Deviation in column: " + compData.getLastSnapshotFieldName() + ". Old value: " + compData.getLastSnapshotFieldValue()
                    + "; New value: " + compData.getNewSnapshotFieldValue());
            snapshot.setDeviating(true);
            assertEquals("Deviation in " + viewName + ".field: " + compData.getLastSnapshotFieldName(), compData.getLastSnapshotFieldValue(),
                    compData.getNewSnapshotFieldValue());
        }
    }

    @Parameters
    public static Collection<Object[]> data() throws Exception {
        init();
        List<Object[]> res = new ArrayList<Object[]>();

        for (int i = 0, n = lastSnapshots.size(); i < n; i++) {
            Snapshot<?> lastSnapshot = lastSnapshots.get(i);
            Snapshot<?> newSnapshot = newSnapshots.get(i);
            Set<String> lastFields = lastSnapshot.getField2Value().keySet();
            Set<String> newFields = newSnapshot.getField2Value().keySet();

            Set<String> allFields = new HashSet<String>(lastFields);
            allFields.addAll(newFields);
            for (String field : allFields) {
                if (SnapshotExtraColumns.DATE_TAKEN.name().equals(field)) {
                    continue;
                }
                SnapshotComparisonData compData = new SnapshotComparisonData();
                if (lastFields.contains(field)) {
                    compData.setLastSnapshotFieldName(field);
                    compData.setLastSnapshotFieldValue(lastSnapshot.getField2Value().get(field));
                }

                if (newFields.contains(field)) {
                    compData.setNewSnapshotFieldName(field);
                    compData.setNewSnapshotFieldValue(newSnapshot.getField2Value().get(field));
                }

                res.add(new Object[] { compData, newSnapshot });
            }
        }

        return res;
    }
}

class SnapshotComparisonData {
    private String lastSnapshotFieldName;

    private String lastSnapshotFieldValue;

    private String newSnapshotFieldName;

    private String newSnapshotFieldValue;

    public String getLastSnapshotFieldName() {
        return lastSnapshotFieldName;
    }

    public void setLastSnapshotFieldName(String lastSnapshotFieldName) {
        this.lastSnapshotFieldName = lastSnapshotFieldName;
    }

    public String getLastSnapshotFieldValue() {
        return lastSnapshotFieldValue;
    }

    public void setLastSnapshotFieldValue(String lastSnapshotFieldValue) {
        this.lastSnapshotFieldValue = lastSnapshotFieldValue;
    }

    public String getNewSnapshotFieldName() {
        return newSnapshotFieldName;
    }

    public void setNewSnapshotFieldName(String newSnapshotFieldName) {
        this.newSnapshotFieldName = newSnapshotFieldName;
    }

    public String getNewSnapshotFieldValue() {
        return newSnapshotFieldValue;
    }

    public void setNewSnapshotFieldValue(String newSnapshotFieldValue) {
        this.newSnapshotFieldValue = newSnapshotFieldValue;
    }
}
