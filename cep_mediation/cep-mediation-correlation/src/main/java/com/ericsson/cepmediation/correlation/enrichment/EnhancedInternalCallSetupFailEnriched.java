package com.ericsson.cepmediation.correlation.enrichment;

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_SETUP_FAIL_ENRICHED;

public class EnhancedInternalCallSetupFailEnriched extends INTERNAL_CALL_SETUP_FAIL_ENRICHED {

	public static final String ABSOLUTE_NAME = "correlation.ENHANCED_INTERNAL_CALL_SETUP_FAIL_ENRICHED";
	
	@Override
	public void setPS_RAB_FAIL_CNT(final byte PS_RAB_FAIL_CNT) {
		super.setPS_RAB_FAIL_CNT(PS_RAB_FAIL_CNT);
		
		// Also set the error count
		if (PS_RAB_FAIL_CNT > 0) {
			super.setPS_ERR_CNT((byte) 1);
		} else {
			super.setPS_ERR_CNT((byte) 0);
		}
    }
	
	@Override
	public void setCS_RAB_FAIL_CNT(final byte CS_RAB_FAIL_CNT) {
		super.setCS_RAB_FAIL_CNT(CS_RAB_FAIL_CNT);
		
		// Also set the error count
		if (CS_RAB_FAIL_CNT > 0) {
			super.setCS_ERR_CNT((byte) 1);
		} else {
			super.setCS_ERR_CNT((byte) 0);
		}
    }
	
	@Override
	public void setMULTI_RAB_FAIL_CNT(final byte MULTI_RAB_FAIL_CNT) {
		super.setMULTI_RAB_FAIL_CNT(MULTI_RAB_FAIL_CNT);
		
		// Also set the error count
		if (MULTI_RAB_FAIL_CNT > 0) {
			super.setMULTI_ERR_CNT((byte) 1);
		} else {
			super.setMULTI_ERR_CNT((byte) 0);
		}
    }
	
}
