package com.ericsson.cepmediation.correlation.enrichment;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;

public class GpehSession extends GPEH_SESSION implements Cloneable{
 
	private static final long serialVersionUID = 1L;
	
	public GpehSession clone(){
		GpehSession cloned = (GpehSession)super.clone();
		return cloned;
	}	  
	public GpehSession cloneMe(){
        final GpehSession gpehSession = (GpehSession)this.clone();
        return gpehSession;
//        gpehSession.setIMSI_MCC(this.getIMSI_MCC());
//        gpehSession.setIMSI_MNC(this.getIMSI_MNC());
//        gpehSession.setEVENT_ID(this.getEVENT_ID());
//        gpehSession.setEVENT_CNT(this.getEVENT_CNT());
//        gpehSession.setRRC_DURATION(this.getRRC_DURATION());
//        gpehSession.setPS_RAB_DURATION(this.getPS_RAB_DURATION());
//        gpehSession.setSTART_RNC(this.getSTART_RNC());
//        gpehSession.setEND_RNC(this.getEND_RNC());
//        gpehSession.setSTART_C_ID(this.getSTART_C_ID());
//        gpehSession.setEND_C_ID(this.getEND_C_ID());
//        gpehSession.setDISTINCT_CELL_CNT(this.getDISTINCT_CELL_CNT());
//        gpehSession.setRRC_MEAS_REP_SAMPLES(this.getRRC_MEAS_REP_SAMPLES());
//        gpehSession.setRRC_SAMPLES_BC_BS(this.getRRC_SAMPLES_BC_BS());
//        gpehSession.setRRC_SAMPLES_BC_GS(this.getRRC_SAMPLES_BC_GS());
//        gpehSession.setRRC_SAMPLES_GC_BS(this.getRRC_SAMPLES_GC_BS());
//        gpehSession.setRRC_SAMPLES_GC_GS(this.getRRC_SAMPLES_GC_GS());
//        gpehSession.setECNO_AVG(this.getECNO_AVG());
//        gpehSession.setRSCP_AVG(this.getRSCP_AVG());
//        gpehSession.setHSDPA_UE_CATEGORY(this.getHSDPA_UE_CATEGORY());
//        gpehSession.setEUL_UE_CATEGORY(this.getEUL_UE_CATEGORY());
//        gpehSession.setHS_RATIO(this.getHS_RATIO());
//        gpehSession.setEUL_RATIO(this.getEUL_RATIO());
//        gpehSession.setDCH_ACTIVITY(this.getDCH_ACTIVITY());
//        gpehSession.setUL_INTERFERENCE_AVG(this.getUL_INTERFERENCE_AVG());
//        gpehSession.setDL_NON_HS_TX_POWER_AVG(this.getDL_NON_HS_TX_POWER_AVG());
//        gpehSession.setHSDSCH_USERS_AVG(this.getHSDSCH_USERS_AVG());
//        gpehSession.setCUS_SUCC_CNT(this.getCUS_SUCC_CNT());
//        gpehSession.setCDS_SUCC_CNT(this.getCDS_SUCC_CNT());
//        gpehSession.setCS_REASON_UE_ACTIVITY(this.getCS_REASON_UE_ACTIVITY());
//        gpehSession.setCS_REASON_CAPACITY(this.getCS_REASON_CAPACITY());
//        gpehSession.setCS_REASON_MOBILITY_COVERAGE(this.getCS_REASON_MOBILITY_COVERAGE());
//        gpehSession.setCS_REASON_QOS_DCH(this.getCS_REASON_QOS_DCH());
//        gpehSession.setCS_REASON_QUEUE(this.getCS_REASON_QUEUE());
//        gpehSession.setCS_REASON_OTHER(this.getCS_REASON_OTHER());
//        gpehSession.setHS_CELL_CHANGE_ERR_CNT(this.getHS_CELL_CHANGE_ERR_CNT());
//        gpehSession.setHS_CELL_CHANGE_SUC_CNT(this.getHS_CELL_CHANGE_SUC_CNT());
//        gpehSession.setHS_NO_SELECTION_CNT(this.getHS_NO_SELECTION_CNT());
//        gpehSession.setIRAT_EXEC_ERR_CNT(this.getIRAT_EXEC_ERR_CNT());
//        gpehSession.setIFHO_EXEC_ERR_CNT(this.getIFHO_EXEC_ERR_CNT());
//        gpehSession.setIFHO_EXEC_SUC_CNT(this.getIFHO_EXEC_SUC_CNT());
//        gpehSession.setSOHO_EXEC_SUC_CNT(this.getSOHO_EXEC_SUC_CNT());
//        gpehSession.setSOHO_EXEC_ERR_CNT(this.getSOHO_EXEC_ERR_CNT());
//        gpehSession.setCM_CNT(this.getCM_CNT());
//        gpehSession.setCM_DURATION(this.getCM_DURATION());
//        gpehSession.setCM_UL_CNT(this.getCM_UL_CNT());
//        gpehSession.setCM_DL_CNT(this.getCM_DL_CNT());
//        gpehSession.setCM_ULDL_CNT(this.getCM_ULDL_CNT());
//        gpehSession.setCM_USER_CNT(this.getCM_USER_CNT());
//        gpehSession.setSTART_RAB(this.getSTART_RAB());
//        gpehSession.setEND_RAB(this.getEND_RAB());
//        gpehSession.setIMSI(this.getIMSI());
//        gpehSession.setDATETIME_ID(this.getDATETIME_ID());
//        gpehSession.setPS_RAB_ACTIVITY_START_TIME(this.getPS_RAB_ACTIVITY_START_TIME());
//        gpehSession.setRRC_CONNECTION_CNT(this.getRRC_CONNECTION_CNT());
//        gpehSession.setPS_RAB_ESTABLISH_CNT(this.getPS_RAB_ESTABLISH_CNT());
//        gpehSession.setCS_RAB_ESTABLISH_CNT(this.getCS_RAB_ESTABLISH_CNT());
//        gpehSession.setCUS_ATT_CNT(this.getCUS_ATT_CNT());
//        gpehSession.setCDS_SUCC_CNT(this.getCDS_ATT_CNT());
//        gpehSession.setDROPS_CNT(this.getDROPS_CNT());
//        gpehSession.setSESSION_DURATION(this.getSESSION_DURATION());
//        gpehSession.setRRC_CONN_END(this.getRRC_CONN_END());
//        gpehSession.setPS_RAB_ACTIVITY_END_TIME(this.getPS_RAB_ACTIVITY_END_TIME());
//        gpehSession.setSTART_HIER3_ID(this.getSTART_HIER3_ID());
//        gpehSession.setEND_HIER3_ID(this.getEND_HIER3_ID());
//        gpehSession.setSTART_HIER321_ID(this.getSTART_HIER321_ID());
//        gpehSession.setEND_HIER321_ID(this.getEND_HIER321_ID());
//        gpehSession.setSTART_HIER3_CELL_ID(this.getSTART_HIER3_CELL_ID());
//        gpehSession.setEND_HIER3_CELL_ID(this.getEND_HIER3_CELL_ID());
//        gpehSession.setSTART_CELL_ID(this.getSTART_CELL_ID());
//        gpehSession.setEND_CELL_ID(this.getEND_CELL_ID());
//        gpehSession.setSESSION_END(this.getSESSION_END());
//        gpehSession.setRAB_ACTIVITY_ON(this.getRAB_ACTIVITY_ON());
//        gpehSession.setRRC_ACTIVITY_ON(this.getRRC_ACTIVITY_ON());
//        gpehSession.setCM_START(this.getCM_START());
//        gpehSession.setDCH_START(this.getDCH_START());
//        gpehSession.setHS_START(this.getHS_START());
//        gpehSession.setEUL_START(this.getEUL_START());
//        gpehSession.setDCH_DURATION(this.getDCH_DURATION());
//        gpehSession.setHS_DURATION(this.getHS_DURATION());
//        gpehSession.setEUL_DURATION(this.getEUL_DURATION());
//        gpehSession.setHSDSCH_USERS_TOTAL(this.getHSDSCH_USERS_TOTAL());
//        gpehSession.setHSDSCH_USERS_SAMPLES(this.getHSDSCH_USERS_SAMPLES());
//        gpehSession.setUL_INTERFERENCE_TOTAL(this.getUL_INTERFERENCE_TOTAL());
//        gpehSession.setUL_INTERFERENCE_SAMPLES(this.getUL_INTERFERENCE_SAMPLES());
//        gpehSession.setDL_NON_HS_TX_POWER_TOTAL(this.getDL_NON_HS_TX_POWER_TOTAL());
//        gpehSession.setDL_NON_HS_TX_POWER_SAMPLES(this.getDL_NON_HS_TX_POWER_SAMPLES());
//        gpehSession.setCM_USER_TOTAL(this.getCM_USER_TOTAL());
//        gpehSession.setCM_USER_SAMPLES(this.getCM_USER_SAMPLES());
//        resetState();
       
	}
	private void resetState() {
		
	}

	
	 
}
