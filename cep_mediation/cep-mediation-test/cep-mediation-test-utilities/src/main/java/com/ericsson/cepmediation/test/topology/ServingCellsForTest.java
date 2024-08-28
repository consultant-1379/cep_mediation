/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.topology;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.test.util.FileUtilsForTest;

/**
 * @author eemecoy
 *
 */
public class ServingCellsForTest {

    public static final int RNC_FOR_SERVING_CELL = 308;

    public static final int CELL_FOR_SERVING_CELL = 309;

    public static final int SCRAMBLING_CODE_FOR_SERVING_CELL = 310;

    private final static List<CellScramblingCodeDetails> servingCells = new ArrayList<CellScramblingCodeDetails>();

    static {
        addCellScramblingCodeForTestCell();
    }

    private static void addCellScramblingCodeForTestCell() {
        final CellScramblingCodeDetails cellScramblingCodeDetails = new CellScramblingCodeDetails();
        cellScramblingCodeDetails.setRnc(RNC_FOR_SERVING_CELL);
        cellScramblingCodeDetails.setCell(CELL_FOR_SERVING_CELL);
        cellScramblingCodeDetails.setScramblingCode(SCRAMBLING_CODE_FOR_SERVING_CELL);
        addCellScramblingCode(cellScramblingCodeDetails);
    }

    public static void addCellScramblingCodesSavedFromDatabase() {
        try {
            List<List<String>> csvValues = FileUtilsForTest
                    .readCSVFileFromClasspath("topology/rnc_ids_cell_ids_scramblingcodes.csv");
            for (List<String> topologyRow : csvValues) {
                String rncId = topologyRow.get(0);
                String cellId = topologyRow.get(1);
                String scramblingCode = topologyRow.get(2);
                CellScramblingCodeDetails cellScramblingCodeDetails = new CellScramblingCodeDetails();
                cellScramblingCodeDetails.setCell(Integer.parseInt(cellId));
                cellScramblingCodeDetails.setRnc(Integer.parseInt(rncId));
                cellScramblingCodeDetails.setScramblingCode(Integer.parseInt(scramblingCode));
                addCellScramblingCode(cellScramblingCodeDetails);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isForServingCell(final int rnc, final int cell, final int scramblingCode) {
        final CellScramblingCodeDetails CellScramblingCodeDetails = new CellScramblingCodeDetails();
        CellScramblingCodeDetails.setRnc(rnc);
        CellScramblingCodeDetails.setCell(cell);
        CellScramblingCodeDetails.setScramblingCode(scramblingCode);
        return servingCells.contains(CellScramblingCodeDetails);
    }

    public static void addCellScramblingCode(final CellScramblingCodeDetails... cellScramblingCodeDetails) {
        for (final CellScramblingCodeDetails element : cellScramblingCodeDetails) {
            servingCells.add(element);
        }
    }

}
