/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.correlation.enrichment;

import java.io.Serializable;

public class InternalNormalReleaseSetValue implements Serializable {

	public static final String ABSOLUTE_NAME = "correlation.INR_SESSION_EVENT";

	public String rncId;

	public String rncName;

	public InternalNormalReleaseSetValue() {

	}

	public InternalNormalReleaseSetValue(String rncId) {

		this.rncId = rncId;
	}

	public String getRncId() {
		return rncId;
	}

	public String getRncName() {
		return rncName;
	}

}
