package com.ericsson.cepmediation.correlation.enrichment;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_RRC_MEASUREMENT;
import com.ericsson.cepmediation.apeventbeans.correlation.EE_VISITED_CELL;
import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION_START_MARKER;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CHANNEL_SWITCHING;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CMODE_ACTIVATE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CMODE_DEACTIVATE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.util.Pair;
import com.ericsson.cepmediation.base.util.Triple;
import com.ericsson.cepmediation.correlation.beans.VisitedCellData;
import com.ericsson.cepmediation.correlation.support.CellUtil;
import com.ericsson.cepmediation.correlation.support.InternalSystemUtilization;
import com.ericsson.cepmediation.correlation.support.InternalSystemUtilization.InternalSystemUtilizationData;
import com.ericsson.cepmediation.correlation.support.MeasurementCategory;
import com.ericsson.cepmediation.correlation.support.TimeOnlyApEventBeanComparator;
import com.ericsson.cepmediation.correlation.support.Util;

/**
 * @author evelziv
 */
public final class InternalGpehSession {
    private static final short RAB_SESS_EVENT_ID = 20000;

    private static final Triple<Float, Float, Float> DEFAULT_RATIOS = new Triple<Float, Float, Float>(-1f, -1f, -1f);

    private List<ApEventBean> allEvents; // for testing only

    private boolean reset;

    private long sessionId;

    private long initTime = 0;

    private long expectedEventCount = 0;

    private long arrivedEventCount = 0;

    private String imsi = null;

    private Set<Integer> servingCells;

    private List<VisitedCellData> visitedCellList;

    private List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> sucHsdschCellList;

    private List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> interOutHHOFailList;

    private List<EE_RRC_MEASUREMENT> rrcMeasurementList;

    private ApEventBean first;

    private ApEventBean last;

    private int hsUeCategory = -1;

    private int eulUeCategory = -1;

    private int cause = -1;

    private int disconnectCause = -1;

    private int disconnectSubCause = -1;

    private int hsCellChangeErrCount = 0;

    private int hsCellChangeSucCount = 0;

    private int hsNoSelectionCount = 0;

    private int iratExecErrCount = 0;

    private int ifhoExecErrCount = 0;

    private int ifhoExecSucCount = 0;

    private int sohoExecSucCount = 0;

    private int sohoExecErrCount = 0;

    private boolean hasContinuation;

    private int cmCount = 0;

    private int cmUlCount = 0;

    private int cmDlCount = 0;

    private int cmUlDlCount = 0;

    private List<ApEventBean> cmEvents;

    private int rrcMeasurements = 0; // number of RRC measurement reports

    private int gcGsCount = 0;

    private int gcBsCount = 0;

    private int bcGsCount = 0;

    private int bcBsCount = 0;

    private int cusCount = 0;

    private int cdsCount = 0;

    private int csReasonOther = 0;

    private int csReasonQueue = 0;

    private int csReasonQosDch = 0;

    private int csReasonMobilityCoverage = 0;

    private int csReasonCapacity = 0;

    private int csReasonUeActivity = 0;

    private int cmUserCount = 0;

    private int hsdschUsersAvg = 0;

    private int dlNonHsTxPowerAvg = 0;

    private int ulInterferenceAvg = 0;

    private List<INTERNAL_CHANNEL_SWITCHING> switches;

    private List<Pair<Long, Short>> timestamp2Rab;

    private boolean enrichComplete = false;

    private ApEventBean startCellRncEvent;

    private ApEventBean endCellRncEvent;

    private static final Comparator<VisitedCellData> visitedCellTimestampComp = new Comparator<VisitedCellData>() {
        @Override
        public int compare(final VisitedCellData o1, final VisitedCellData o2) {
            return (int) (o1.getTimestamp() - o2.getTimestamp());
        }
    };

    private static final Comparator<Pair<Long, Short>> rabTimestampComp = new Comparator<Pair<Long, Short>>() {
        @Override
        public int compare(final Pair<Long, Short> o1, final Pair<Long, Short> o2) {
            return (int) (o1.getFirst() - o2.getFirst());
        }
    };

    public InternalGpehSession() {
        resetState();
    }

    private void resetState() {
        servingCells = new HashSet<Integer>(4);
        visitedCellList = new ArrayList<VisitedCellData>();
        cmEvents = new ArrayList<ApEventBean>();
        switches = new ArrayList<INTERNAL_CHANNEL_SWITCHING>();
        timestamp2Rab = new ArrayList<Pair<Long, Short>>();
        allEvents = new ArrayList<ApEventBean>(0);
        rrcMeasurementList = new ArrayList<EE_RRC_MEASUREMENT>();
        sucHsdschCellList = new ArrayList<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED>();
        interOutHHOFailList = new ArrayList<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED>();

    }

    /**
     * For now this method has to be updated manually. Later on we will make it
     * automatic, so it is an important TODO
     */
    /**
     * For now this method has to be updated manually. Later on we will make it
     * automatic, so it is an important TODO
     */
    public GPEH_SESSION transformInto() {

        return transformIntoImpl();

    }

    private GPEH_SESSION transformIntoImpl() {
        final GPEH_SESSION session = new GPEH_SESSION();
        session.setRSCP_AVG(Short.MIN_VALUE);
        session.setECNO_AVG(Integer.MIN_VALUE);
        session.setUL_INTERFERENCE_AVG(Integer.MIN_VALUE);
        /*final String[] pair = DefaultLookupService.getInstance().extractMccAndMnc(getImsiLong());
        if (pair != null) {
            session.setIMSI_MCC(pair[0]);
            session.setIMSI_MNC(pair[1]);
        }*/

        session.setEVENT_CNT((int) arrivedEventCount);
        session.setRRC_DURATION(getDuration());

        session.setSTART_RNC(getServingRncId(startCellRncEvent));
        session.setEND_RNC(getServingRncId(endCellRncEvent));

        session.setSTART_C_ID(CellUtil.getUnsignedCellId(getServingCellId(startCellRncEvent)));
        session.setEND_C_ID(CellUtil.getUnsignedCellId(getServingCellId(endCellRncEvent)));

        session.setDISTINCT_CELL_CNT(servingCells.size());

        session.setRRC_MEAS_REP_SAMPLES(rrcMeasurements);
        session.setRRC_SAMPLES_BC_BS(bcBsCount);
        session.setRRC_SAMPLES_GC_GS(gcGsCount);
        session.setRRC_SAMPLES_BC_GS(bcGsCount);
        session.setRRC_SAMPLES_GC_BS(gcBsCount);

        session.setECNO_AVG(getAverageEcno());
        session.setRSCP_AVG(getAverageRscp());

        session.setHSDPA_UE_CATEGORY((short) hsUeCategory);
        session.setEUL_UE_CATEGORY((short) eulUeCategory);

        final Pair<Short, Short> startAndEndRab = getStartAndEndRab();
        session.setSTART_RAB(startAndEndRab.getFirst());
        session.setEND_RAB(startAndEndRab.getSecond());

        final Triple<Float, Float, Float> triple = getRatios();
        session.setACTIVITY(triple.getFirst());
        session.setHS_RATIO(triple.getSecond());
        session.setEUL_RATIO(triple.getThird());

        session.setHSDSCH_USERS_AVG((short) hsdschUsersAvg);
        session.setDL_NON_HS_TX_POWER_AVG(dlNonHsTxPowerAvg);
        session.setUL_INTERFERENCE_AVG(ulInterferenceAvg);

        session.setCDS_SUCC_CNT((short) cdsCount);
        session.setCUS_SUCC_CNT((short) cusCount);
        session.setCS_REASON_CAPACITY((short) csReasonCapacity);
        session.setCS_REASON_MOBILITY_COVERAGE((short) csReasonMobilityCoverage);
        session.setCS_REASON_OTHER((short) csReasonOther);
        session.setCS_REASON_QOS_DCH((short) csReasonQosDch);
        session.setCS_REASON_QUEUE((short) csReasonQueue);
        session.setCS_REASON_UE_ACTIVITY((short) csReasonUeActivity);

        session.setHS_CELL_CHANGE_ERR_CNT(hsCellChangeErrCount);
        session.setHS_CELL_CHANGE_SUC_CNT(hsCellChangeSucCount);
        session.setHS_NO_SELECTION_CNT(hsNoSelectionCount);

        session.setIRAT_EXEC_ERR_CNT(iratExecErrCount);

        session.setIFHO_EXEC_ERR_CNT(ifhoExecErrCount);
        session.setIFHO_EXEC_SUC_CNT(ifhoExecSucCount);

        session.setSOHO_EXEC_ERR_CNT(sohoExecErrCount);
        session.setSOHO_EXEC_SUC_CNT(sohoExecSucCount);

        session.setCM_CNT(cmCount);
        session.setCM_DURATION(getCmDuration());
        session.setCM_DL_CNT(cmDlCount);
        session.setCM_UL_CNT(cmUlCount);
        session.setCM_ULDL_CNT(cmUlDlCount);
        session.setCM_USER_CNT(cmUserCount);

        session.setIMSI(getImsiLong());

        session.setEVENT_ID(RAB_SESS_EVENT_ID);

        session.setSessionId(sessionId);
        session.setName("GPEH_SESSION");
        session.setVersion("1.0");
        session.setTimestamp(getStartTime());

        return session;
    }

    private Pair<Short, Short> getStartAndEndRab() {
        if (timestamp2Rab.isEmpty()) {
            return new Pair<Short, Short>((short) -1, (short) -1);
        }

        int startIdx = -1;
        int endIdx = -1;
        for (int i = 0, n = timestamp2Rab.size(); i < n; i++) {
            if (!isNonFachNonDchNonHs(timestamp2Rab.get(i).getSecond())) {
                if (startIdx == -1) {
                    startIdx = i;
                }

                endIdx = i;
            }
        }
        short startRab = -1;
        short endRab = -1;
        if (startIdx > -1) {
            startRab = timestamp2Rab.get(startIdx).getSecond();
            endRab = timestamp2Rab.get(endIdx).getSecond();
        } else {
            startRab = timestamp2Rab.get(0).getSecond();
            endRab = timestamp2Rab.get(timestamp2Rab.size() - 1).getSecond();
        }
        return new Pair<Short, Short>(startRab, endRab);
    }

    private Long getImsiLong() {
        return imsi != null ? Long.valueOf(imsi) : -1L;
    }

    /**
     * For testing only.
     */
    public List<ApEventBean> getAllEventsSorted() {
        Collections.sort(allEvents, TimeOnlyApEventBeanComparator.COMPARATOR);
        return allEvents;
    }

    public void addEvent(final ApEventBean event) {
        allEvents.add(event);
    }

    public void addChannelSwitching(final INTERNAL_CHANNEL_SWITCHING event) {
        switches.add(event);
    }

    public List<INTERNAL_CHANNEL_SWITCHING> getSwitches() {
        return switches;
    }

    public void updateRabList(final long timestamp, final short rab) {
        timestamp2Rab.add(new Pair<Long, Short>(timestamp, rab));
    }

    public void updateServingRncAndCell(final ApEventBean event) {
        final Pair<Short, Integer> rncCell = Util.getRncAndCell(event);
        if (rncCell != null && rncCell.getSecond() != -1 && rncCell.getSecond() != 0) {
            servingCells.add(rncCell.getSecond());
            final VisitedCellData data = VisitedCellData.getInstance(rncCell.getFirst(), rncCell.getSecond(),
                    event.getTimestamp());
            visitedCellList.add(data);
        }
    }

    public boolean isReset() {
        return reset;
    }

    public void setReset(final boolean reset) {
        this.reset = reset;
    }

    public boolean isEnrichComplete() {
        return enrichComplete;
    }

    public void setEnrichComplete(final boolean enrichComplete) {
        this.enrichComplete = enrichComplete;
    }

    public int getCmUserCount() {
        return cmUserCount;
    }

    public void setCmUserCount(final int cmUserCount) {
        this.cmUserCount = cmUserCount;
    }

    public int getHsdschUsersAvg() {
        return hsdschUsersAvg;
    }

    public void setHsdschUsersAvg(final int hsdschUsersAvg) {
        this.hsdschUsersAvg = hsdschUsersAvg;
    }

    public int getDlNonHsTxPowerAvg() {
        return dlNonHsTxPowerAvg;
    }

    public void setDlNonHsTxPowerAvg(final int dlNonHsTxPowerAvg) {
        this.dlNonHsTxPowerAvg = dlNonHsTxPowerAvg;
    }

    public int getUlInterferenceAvg() {
        return ulInterferenceAvg;
    }

    public void setUlInterferenceAvg(final int ulInterferenceAvg) {
        this.ulInterferenceAvg = ulInterferenceAvg;
    }

    public long getInitTime() {
        return initTime;
    }

    public void setInitTime(final long initTime) {
        this.initTime = initTime;
    }

    public long getExpectedEventCount() {
        return expectedEventCount;
    }

    public void setExpectedEventCount(final long expectedEventCount) {
        this.expectedEventCount = expectedEventCount;
    }

    public long getArrivedEventCount() {
        return arrivedEventCount;
    }

    public void setArrivedEventCount(final long arrivedEventCount) {
        this.arrivedEventCount = arrivedEventCount;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(final long sessionId) {
        this.sessionId = sessionId;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(final String imsi) {
        this.imsi = imsi;
    }

    public int getHsUeCategory() {
        return hsUeCategory;
    }

    public void setHsUeCategory(final int hsUeCategory) {
        this.hsUeCategory = hsUeCategory;
    }

    public int getEulUeCategory() {
        return eulUeCategory;
    }

    public void setEulUeCategory(final int eulUeCategory) {
        this.eulUeCategory = eulUeCategory;
    }

    public int getCause() {
        return cause;
    }

    public void setCause(final int cause) {
        this.cause = cause;
    }

    public int getDisconnectCause() {
        return disconnectCause;
    }

    public void setDisconnectCause(final int disconnectCause) {
        this.disconnectCause = disconnectCause;
    }

    public int getDisconnectSubCause() {
        return disconnectSubCause;
    }

    public void setDisconnectSubCause(final int disconnectSubCause) {
        this.disconnectSubCause = disconnectSubCause;
    }

    public int getHsCellChangeErrCount() {
        return hsCellChangeErrCount;
    }

    public void setHsCellChangeErrCount(final int hsCellChangeErrCount) {
        this.hsCellChangeErrCount = hsCellChangeErrCount;
    }

    public int getHsCellChangeSucCount() {
        return hsCellChangeSucCount;
    }

    public void setHsCellChangeSucCount(final int hsCellChangeSucCount) {
        this.hsCellChangeSucCount = hsCellChangeSucCount;
    }

    public int getHsNoSelectionCount() {
        return hsNoSelectionCount;
    }

    public void setHsNoSelectionCount(final int hsNoSelectionCount) {
        this.hsNoSelectionCount = hsNoSelectionCount;
    }

    public int getIratExecErrCount() {
        return iratExecErrCount;
    }

    public void setIratExecErrCount(final int iratExecErrCount) {
        this.iratExecErrCount = iratExecErrCount;
    }

    public int getIfhoExecErrCount() {
        return ifhoExecErrCount;
    }

    public void setIfhoExecErrCount(final int ifhoExecErrCount) {
        this.ifhoExecErrCount = ifhoExecErrCount;
    }

    public int getIfhoExecSucCount() {
        return ifhoExecSucCount;
    }

    public void setIfhoExecSucCount(final int ifhoExecSucCount) {
        this.ifhoExecSucCount = ifhoExecSucCount;
    }

    public int getSohoExecSucCount() {
        return sohoExecSucCount;
    }

    public void setSohoExecSucCount(final int sohoExecSucCount) {
        this.sohoExecSucCount = sohoExecSucCount;
    }

    public int getSohoExecErrCount() {
        return sohoExecErrCount;
    }

    public void setSohoExecErrCount(final int sohoExecErrCount) {
        this.sohoExecErrCount = sohoExecErrCount;
    }

    public boolean isHasContinuation() {
        return hasContinuation;
    }

    public void setHasContinuation(final boolean hasContinuation) {
        this.hasContinuation = hasContinuation;
    }

    public int getCmCount() {
        return cmCount;
    }

    public void setCmCount(final int cmCount) {
        this.cmCount = cmCount;
    }

    public int getCmUlCount() {
        return cmUlCount;
    }

    public void setCmUlCount(final int cmUlCount) {
        this.cmUlCount = cmUlCount;
    }

    public int getCmDlCount() {
        return cmDlCount;
    }

    public void setCmDlCount(final int cmDlCount) {
        this.cmDlCount = cmDlCount;
    }

    public int getCmUlDlCount() {
        return cmUlDlCount;
    }

    public void setCmUlDlCount(final int cmUlDlCount) {
        this.cmUlDlCount = cmUlDlCount;
    }

    public int getRrcMeasurements() {
        return rrcMeasurements;
    }

    public void setRrcMeasurements(final int rrcMeasurements) {
        this.rrcMeasurements = rrcMeasurements;
    }

    public int getCusCount() {
        return cusCount;
    }

    public void setCusCount(final int cusCount) {
        this.cusCount = cusCount;
    }

    public int getCdsCount() {
        return cdsCount;
    }

    public void setCdsCount(final int cdsCount) {
        this.cdsCount = cdsCount;
    }

    public int getCsReasonOther() {
        return csReasonOther;
    }

    public void setCsReasonOther(final int csReasonOther) {
        this.csReasonOther = csReasonOther;
    }

    public int getCsReasonQueue() {
        return csReasonQueue;
    }

    public void setCsReasonQueue(final int csReasonQueue) {
        this.csReasonQueue = csReasonQueue;
    }

    public int getCsReasonQosDch() {
        return csReasonQosDch;
    }

    public void setCsReasonQosDch(final int csReasonQosDch) {
        this.csReasonQosDch = csReasonQosDch;
    }

    public int getCsReasonMobilityCoverage() {
        return csReasonMobilityCoverage;
    }

    public void setCsReasonMobilityCoverage(final int csReasonMobilityCoverage) {
        this.csReasonMobilityCoverage = csReasonMobilityCoverage;
    }

    public int getCsReasonCapacity() {
        return csReasonCapacity;
    }

    public void setCsReasonCapacity(final int csReasonCapacity) {
        this.csReasonCapacity = csReasonCapacity;
    }

    public int getCsReasonUeActivity() {
        return csReasonUeActivity;
    }

    public void setCsReasonUeActivity(final int csReasonUeActivity) {
        this.csReasonUeActivity = csReasonUeActivity;
    }

    public List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> getSucHsdschCellList() {
        return sucHsdschCellList;
    }

    public List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> getInterOutHHOFailList() {
        return interOutHHOFailList;
    }

    public void setRrcMeasurementList(final List<EE_RRC_MEASUREMENT> listOfRrcMeasurements) {
        this.rrcMeasurementList = listOfRrcMeasurements;
    }

    // methods callable from EPL

    public void handleEventForFirstLast(final ApEventBean event) {
        // excluding INTERNAL_IMSI as well due to strange event pattern received from the network
        if (event == null || event instanceof GPEH_SESSION_START_MARKER || event instanceof INTERNAL_IMSI) {
            return;
        }
        if (first == null || event.getTimestamp() < first.getTimestamp()) {
            first = event;
        }
        if (last == null || event.getTimestamp() > last.getTimestamp()) {
            last = event;
        }
    }

    public void incGcGsCount() {
        ++gcGsCount;
    }

    public void incGcBsCount() {
        ++gcBsCount;
    }

    public void incBcGsCount() {
        ++bcGsCount;
    }

    public void incBcBsCount() {
        ++bcBsCount;
    }

    public void addCmActivate(final ApEventBean event) {
        cmEvents.add(event);
    }

    public void addCmDeactivate(final ApEventBean event) {
        cmEvents.add(event);
    }

    public void setServingCells(final Set<Integer> servingCells) {
        this.servingCells = servingCells;
    }

    public void setSucHsdschCellList(final List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> sucHsdschCellList) {
        this.sucHsdschCellList = sucHsdschCellList;
    }

    public void setInterOutHHOFailList(final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> interOutHHOFailList) {
        this.interOutHHOFailList = interOutHHOFailList;
    }

    public void setAllEvents(final List<ApEventBean> allEvents) {
        this.allEvents = allEvents;
    }

    public InternalGpehSession cloneMe() {
        final InternalGpehSession newSession = new InternalGpehSession();
        newSession.setAllEvents(this.allEvents);
        newSession.setSessionId(this.sessionId);
        newSession.setInitTime(this.initTime);
        newSession.setExpectedEventCount(this.expectedEventCount);
        newSession.setArrivedEventCount(this.arrivedEventCount);
        newSession.setImsi(this.imsi);
        newSession.setServingCells(this.servingCells);
        newSession.setVisitedCellList(this.visitedCellList);
        newSession.setSucHsdschCellList(this.sucHsdschCellList);
        newSession.setInterOutHHOFailList(this.interOutHHOFailList);
        newSession.setFirst(this.first);
        newSession.setLast(this.last);
        newSession.setHsUeCategory(this.hsUeCategory);
        newSession.setEulUeCategory(this.eulUeCategory);
        newSession.setCause(this.cause);
        newSession.setDisconnectCause(this.disconnectCause);
        newSession.setDisconnectSubCause(this.disconnectSubCause);
        newSession.setHsCellChangeErrCount(this.hsCellChangeErrCount);
        newSession.setHsCellChangeSucCount(this.hsCellChangeSucCount);
        newSession.setHsNoSelectionCount(this.hsNoSelectionCount);
        newSession.setIratExecErrCount(this.iratExecErrCount);
        newSession.setIfhoExecErrCount(this.ifhoExecErrCount);
        newSession.setIfhoExecSucCount(this.ifhoExecSucCount);
        newSession.setSohoExecSucCount(this.sohoExecSucCount);
        newSession.setSohoExecErrCount(this.sohoExecErrCount);
        newSession.setHasContinuation(this.hasContinuation);
        newSession.setCmCount(this.cmCount);
        newSession.setCmUlCount(this.cmUlCount);
        newSession.setCmDlCount(this.cmDlCount);
        newSession.setCmUlDlCount(this.cmUlDlCount);
        newSession.setCmEvents(this.cmEvents);

        newSession.setRrcMeasurements(this.rrcMeasurements);
        newSession.setGcGsCount(this.gcGsCount);
        newSession.setGcBsCount(this.gcBsCount);
        newSession.setBcGsCount(this.bcGsCount);
        newSession.setBcBsCount(this.bcBsCount);

        newSession.setCusCount(this.cusCount);
        newSession.setCdsCount(this.cdsCount);
        newSession.setCsReasonOther(this.csReasonOther);
        newSession.setCsReasonQueue(this.csReasonQueue);
        newSession.setCsReasonQosDch(this.csReasonQosDch);
        newSession.setCsReasonMobilityCoverage(this.csReasonMobilityCoverage);
        newSession.setCsReasonCapacity(this.csReasonCapacity);
        newSession.setCsReasonUeActivity(this.csReasonUeActivity);

        newSession.setCmUserCount(this.cmUserCount);
        newSession.setHsdschUsersAvg(this.hsdschUsersAvg);
        newSession.setDlNonHsTxPowerAvg(this.dlNonHsTxPowerAvg);
        newSession.setUlInterferenceAvg(this.ulInterferenceAvg);

        newSession.setSwitches(this.switches);
        newSession.setTimestamp2Rab(this.timestamp2Rab);
        newSession.setEnrichComplete(this.enrichComplete);
        newSession.setRrcMeasurementList(this.rrcMeasurementList);
        newSession.setStartCellRncEvent(this.startCellRncEvent);
        newSession.setEndCellRncEvent(this.endCellRncEvent);

        resetState();

        return newSession;
    }

    private void setVisitedCellList(final List<VisitedCellData> visitedCellList) {
        this.visitedCellList = visitedCellList;
    }

    public void setFirst(final ApEventBean first) {
        this.first = first;
    }

    public void setLast(final ApEventBean last) {
        this.last = last;
    }

    public void setCmEvents(final List<ApEventBean> cmEvents) {
        this.cmEvents = cmEvents;
    }

    public void setGcGsCount(final int gcGsCount) {
        this.gcGsCount = gcGsCount;
    }

    public void setGcBsCount(final int gcBsCount) {
        this.gcBsCount = gcBsCount;
    }

    public void setBcGsCount(final int bcGsCount) {
        this.bcGsCount = bcGsCount;
    }

    public void setBcBsCount(final int bcBsCount) {
        this.bcBsCount = bcBsCount;
    }

    public void setSwitches(final List<INTERNAL_CHANNEL_SWITCHING> switches) {
        this.switches = switches;
    }

    public void setTimestamp2Rab(final List<Pair<Long, Short>> timestamp2Rab) {
        this.timestamp2Rab = timestamp2Rab;
    }

    public void setStartCellRncEvent(final ApEventBean startCellRncEvent) {
        this.startCellRncEvent = startCellRncEvent;
    }

    public void setEndCellRncEvent(final ApEventBean endCellRncEvent) {
        this.endCellRncEvent = endCellRncEvent;
    }

    private long getStartTime() {
        if (first == null) {
            return 0;
        }
        return first.getTimestamp();
    }

    private int getDuration() {
        if (first == null || last == null) {
            return 0;
        }
        return (int) (last.getTimestamp() - first.getTimestamp());
    }

    private short getServingRncId(final ApEventBean event) {
        try {
            if (event == null) {
                return -1;
            }
            final Method method = event.getClass().getMethod("getRNC_ID_1", new Class<?>[] {});
            final Object result = method.invoke(event, new Object[] {});
            return ((Short) result);
        } catch (final Throwable e) {
            return -1;
        }
    }

    private short getServingCellId(final ApEventBean event) {
        try {
            if (event == null) {
                return -1;
            }
            final Method method = event.getClass().getMethod("getC_ID_1", new Class<?>[] {});
            final Object result = method.invoke(event, new Object[] {});
            return ((Short) result);
        } catch (final Throwable e) {
            return -1;
        }
    }

    private int getCmDuration() {
        Collections.sort(cmEvents, TimeOnlyApEventBeanComparator.COMPARATOR);
        long duration = 0;
        while (cmEvents.size() > 0) {
            final ApEventBean first = cmEvents.remove(0);
            if (cmEvents.size() == 0) {
                break;
            }
            final ApEventBean second = cmEvents.remove(0);
            if (first instanceof INTERNAL_CMODE_ACTIVATE && second instanceof INTERNAL_CMODE_DEACTIVATE) {
                duration += (second.getTimestamp() - first.getTimestamp());
            }
        }
        return (int) duration;
    }

    public void updateStartEndCellRnc(final ApEventBean event) {
        final int servingCell = getServingCellId(event);
        final int servingRnc = getServingRncId(event);
        if (servingCell != -1 && servingRnc != -1) {
            if (endCellRncEvent == null) {
                endCellRncEvent = event;
            } else if ((event.getTimestamp() > endCellRncEvent.getTimestamp())) {
                endCellRncEvent = event;
            }

            if (startCellRncEvent == null) {
                startCellRncEvent = event;
            } else if ((event.getTimestamp() < startCellRncEvent.getTimestamp())) {
                startCellRncEvent = event;
            }
        }
    }

    public void addRrcMeasurement(final EE_RRC_MEASUREMENT measurement) {
        rrcMeasurementList.add(measurement);
    }

    public List<EE_VISITED_CELL> computeVisitedCells() {
        final List<EE_VISITED_CELL> res = new ArrayList<EE_VISITED_CELL>();

        if (!visitedCellList.isEmpty()) {
            if (rrcMeasurementList.isEmpty()) {
                for (final VisitedCellData cell : visitedCellList) {
                    res.add(createEmptyReport(cell));
                }
            } else {
                Collections.sort(rrcMeasurementList, new TimeOnlyApEventBeanComparator());

                for (int i = 0, n = visitedCellList.size(); i < n; i++) {
                    final VisitedCellData curr = visitedCellList.get(i);
                    final List<EE_RRC_MEASUREMENT> rrcReports = getReportsForCell(curr);
                    if (rrcReports.isEmpty()) {
                        res.add(createEmptyReport(curr));
                    } else {
                        final EE_VISITED_CELL visitedCell = new EE_VISITED_CELL();
                        visitedCell.setIMSI(getImsiLong());
                        visitedCell.setRNC_ID(curr.getRncId());
                        visitedCell.setC_ID(curr.getCellId());
                        visitedCell.setTimestamp(curr.getStart());
                        visitedCell.setDURATION((int) (curr.getEnd() - curr.getStart()));

                        updateMeasurements(rrcReports, visitedCell);

                        res.add(visitedCell);
                    }
                }
            }
        }

        return res;
    }

    private EE_VISITED_CELL createEmptyReport(final VisitedCellData data) {
        final EE_VISITED_CELL visitedCell = new EE_VISITED_CELL();
        visitedCell.setIMSI(getImsiLong());
        visitedCell.setRNC_ID(data.getRncId());
        visitedCell.setC_ID(data.getCellId());
        visitedCell.setTimestamp(data.getStart());
        visitedCell.setDURATION((int) (data.getEnd() - data.getStart()));
        visitedCell.setRRC_SAMPLES_BC_BS(0);
        visitedCell.setRRC_SAMPLES_BC_GS(0);
        visitedCell.setRRC_SAMPLES_GC_BS(0);
        visitedCell.setRRC_SAMPLES_GC_GS(0);
        return visitedCell;
    }

    private void updateMeasurements(final List<EE_RRC_MEASUREMENT> rrcReports, final EE_VISITED_CELL cellRrc) {
        int gcbs = 0;
        int gcgs = 0;
        int bcbs = 0;
        int bcgs = 0;
        for (final EE_RRC_MEASUREMENT meas : rrcReports) {
            final MeasurementCategory cat = Util.getMeasurementCategory(meas);
            if (cat == null) {
                continue;
            }
            switch (cat) {
            case GCGS:
                gcgs++;
                break;
            case GCBS:
                gcbs++;
                break;
            case BCGS:
                bcgs++;
                break;
            case BCBS:
                bcbs++;
                break;
            }
        }
        cellRrc.setRRC_SAMPLES_GC_BS(gcbs);
        cellRrc.setRRC_SAMPLES_GC_GS(gcgs);
        cellRrc.setRRC_SAMPLES_BC_BS(bcbs);
        cellRrc.setRRC_SAMPLES_BC_GS(bcgs);
    }

    private List<EE_RRC_MEASUREMENT> getReportsForCell(final VisitedCellData visitedCell) {
        final List<EE_RRC_MEASUREMENT> res = new ArrayList<EE_RRC_MEASUREMENT>(5);
        for (final EE_RRC_MEASUREMENT curr : rrcMeasurementList) {
            if (curr.getTimestamp() > visitedCell.getEnd()) {
                break;
            } else if (curr.getTimestamp() >= visitedCell.getStart() && curr.getRNC_ID_1() == visitedCell.getRncId()
                    && curr.getC_ID_1() == visitedCell.getCellId()) {
                res.add(curr);
            }
        }

        return res;
    }

    short getAverageRscp() {

        float rscpSum = 0;
        int rscpCount = 0;

        for (final EE_RRC_MEASUREMENT measurement : rrcMeasurementList) {

            if (measurement.getRSCP() != Integer.MIN_VALUE) {
                final float rscp = measurement.getRSCP();
                rscpSum += Math.pow(10, (rscp / 10f));
                ++rscpCount;
            }
        }

        final float rscpAvg = rscpCount > 0 ? (float) (10 * Math.log10((rscpSum / rscpCount))) : Integer.MIN_VALUE;
        return (short) rscpAvg;
    }

    int getAverageEcno() {
        float ecnoSum = 0;
        int ecnoCount = 0;

        for (final EE_RRC_MEASUREMENT measurement : rrcMeasurementList) {
            if (measurement.getECNO() != Integer.MIN_VALUE) {
                final float ecno = measurement.getECNO();
                final double ecnoCalculation = Math.pow(10, (ecno / 10f));
                ecnoSum += ecnoCalculation;
                ++ecnoCount;
            }
        }

        if (ecnoCount > 0) {
            final float ecnoAverage = (float) (10 * Math.log10((ecnoSum / ecnoCount)));
            return (int) ecnoAverage;
        }
        return Integer.MIN_VALUE;

    }

    private Triple<Float, Float, Float> getRatios() {
        if (timestamp2Rab.isEmpty()) {
            return DEFAULT_RATIOS;
        }

        Pair<Long, Short> current = timestamp2Rab.get(0);
        long prevTimestamp = current.getFirst();
        short prevRab = current.getSecond();
        if (!Util.isPsRab(prevRab)) {
            return DEFAULT_RATIOS;
        }

        long hsdpaTime = 0;
        long hsupaTime = 0;
        long dchTime = 0;
        for (int i = 1, n = timestamp2Rab.size(); i < n; i++) {
            current = timestamp2Rab.get(i);
            final long duration = current.getFirst() - prevTimestamp;
            if (!isFachRach(prevRab)) {
                if (Util.isHsdpaBearer(prevRab)) {
                    hsdpaTime += duration;
                }
                if (Util.isHsupaBearer(prevRab)) {
                    hsupaTime += duration;
                }
                dchTime += duration;
            }
            prevTimestamp = current.getFirst();
            prevRab = current.getSecond();
        }

        final long sessionDuration = getDuration();
        if (!isFachRach(prevRab)) {
            final long endTimestamp = getStartTime() + sessionDuration;
            if (prevTimestamp != endTimestamp) {
                final long duration = endTimestamp - prevTimestamp;
                if (Util.isHsdpaBearer(prevRab)) {
                    hsdpaTime += duration;
                }
                if (Util.isHsupaBearer(prevRab)) {
                    hsupaTime += duration;
                }
                dchTime += duration;
            }
        }

        if (dchTime > 0) {
            final float dchRatio = (float) dchTime / (float) sessionDuration;
            final float hsupaRatio = (float) hsupaTime / (float) dchTime;
            final float hsdpaRatio = (float) hsdpaTime / (float) dchTime;
            return new Triple<Float, Float, Float>(dchRatio, hsdpaRatio, hsupaRatio);
        }

        return new Triple<Float, Float, Float>(0f, 0f, 0f);

    }

    public void addInterOutHHOFail(final INTERNAL_OUT_HARD_HANDOVER_FAILURE event) {
        interOutHHOFailList.add(new INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED(event));
    }

    public void addSucHsdschCell(final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE event) {
        sucHsdschCellList.add(new INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED(event));
    }

    public void sessionClosing() {
        // update cell visited data
        if (visitedCellList.size() > 0) {
            Collections.sort(visitedCellList, visitedCellTimestampComp);

            final Iterator<VisitedCellData> iter = visitedCellList.iterator();
            VisitedCellData prev = iter.next();
            while (iter.hasNext()) {
                final VisitedCellData curr = iter.next();
                if (prev.getCellId() == curr.getCellId() || prev.getStart() == curr.getStart()) {
                    iter.remove();
                } else {
                    prev.setEnd(curr.getStart());
                    prev.setTimestampForComparison(Util.floorTime(curr.getStart()));
                    prev = curr;
                }
            }

            final long sessionEnd = getStartTime() + getDuration();
            final VisitedCellData lastCell = visitedCellList.get(visitedCellList.size() - 1);
            if (lastCell.getEnd() == 0) {
                lastCell.setEnd(sessionEnd);
                prev.setTimestampForComparison(Util.floorTime(sessionEnd));
            }
        }

        if (!timestamp2Rab.isEmpty()) {
            Collections.sort(timestamp2Rab, rabTimestampComp);
        }

        if (!rrcMeasurementList.isEmpty()) {
            Collections.sort(rrcMeasurementList, new TimeOnlyApEventBeanComparator());
        }

        // update hsdsch cell data
        for (final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED event : sucHsdschCellList) {
            event.setIMSI(getImsiLong());
        }

        // update inter hho fail data
        for (final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED event : interOutHHOFailList) {
            event.setIMSI(getImsiLong());
        }

        if (visitedCellList.size() > 0) {
            int countCm = 0;
            int countHs = 0;
            int countPower = 0;
            int countUi = 0;
            for (final VisitedCellData data : visitedCellList) {
                final InternalSystemUtilizationData sysUtil = InternalSystemUtilization.getSysUtil(
                        data.getTimestampForComparison(), data.getRncId(), data.getCellId());
                if (sysUtil != null) {
                    if (sysUtil.getCmUserCount() >= 0) {
                        ++countCm;
                        cmUserCount += sysUtil.getCmUserCount();
                    }
                    if (sysUtil.getHsdschUserCount() >= 0) {
                        ++countHs;
                        hsdschUsersAvg += sysUtil.getHsdschUserCount();
                    }
                    if (sysUtil.getDlNonHsTxPower() >= 0) {
                        ++countPower;
                        dlNonHsTxPowerAvg += sysUtil.getDlNonHsTxPower();
                    }
                    if (sysUtil.getUlInterference() >= 0) {
                        ++countUi;
                        ulInterferenceAvg += sysUtil.getUlInterference();
                    }
                }
            }

            if (countCm > 0) {
                cmUserCount = cmUserCount / countCm;
            } else {
                cmUserCount = -1;
            }
            if (countHs > 0) {
                hsdschUsersAvg = hsdschUsersAvg / countHs;
            } else {
                hsdschUsersAvg = -1;
            }
            if (countUi > 0) {
                ulInterferenceAvg = (int) (-112.1 + 0.1 * (ulInterferenceAvg / countUi));
            } else {
                ulInterferenceAvg = Integer.MIN_VALUE;
            }
            if (countPower > 0) {
                dlNonHsTxPowerAvg = dlNonHsTxPowerAvg / countPower;
            } else {
                dlNonHsTxPowerAvg = -1;
            }

        }
    }

    private boolean isNonFachNonDchNonHs(final int rab) {
        return rab == -1 || rab == 0 || rab == 1;
    }

    private boolean isFachRach(final int rab) {
        return rab == -1 || rab == 0 || rab == 1 || rab == 4;
    }
}
