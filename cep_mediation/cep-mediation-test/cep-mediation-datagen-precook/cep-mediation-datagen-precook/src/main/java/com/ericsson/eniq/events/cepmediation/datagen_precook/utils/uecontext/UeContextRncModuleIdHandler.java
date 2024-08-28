/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.RncType;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.fileutils.OutputHelper;

/**
 * @author eeikonl
 * @since 2013
 *
 */
public class UeContextRncModuleIdHandler {
    public static final RncType type = DatagenProperties.getInstance().getType();

    public static final String masterSetfilePath = DatagenProperties.getInstance().getUeContextModuleIDFilePath();

    public static final String userdefinedfilePath = DatagenProperties.getInstance().getUeContextModudleIdPath();

    public static final int noOfUeContextModuleIdtoGen = type.getNoOfUeContextModleIDs();

    public HashSet<UeContextModuleID> getUeContextModuleIDs(final HashSet<UeContextModuleID> fileContext) {

        final HashSet<UeContextModuleID> randomUeContextModuleIds = new HashSet<UeContextModuleID>();

        final ArrayList<UeContextModuleID> x = new ArrayList<UeContextModuleID>(fileContext);

        final int totalSize = type.getTotalUeContextModuleIdSize();

        while (randomUeContextModuleIds.size() < totalSize) {
            final int key = (int) (Math.random() * fileContext.size());
            randomUeContextModuleIds.add(x.get(key));
        }

        OutputHelper.init(new File(masterSetfilePath).getParent().toString(),
                "/" + Long.toString(System.currentTimeMillis()) + type.name(), ".txt");

        for (final UeContextModuleID key : randomUeContextModuleIds) {
            OutputHelper.writeToFile(key.toString());
        }

        OutputHelper.close();

        return randomUeContextModuleIds;
    }
}
