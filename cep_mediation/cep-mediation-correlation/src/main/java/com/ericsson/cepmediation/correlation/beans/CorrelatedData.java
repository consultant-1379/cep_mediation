package com.ericsson.cepmediation.correlation.beans;

import java.util.List;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_VISITED_CELL;
import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED;

public class CorrelatedData {
	private GPEH_SESSION session;
	
	private List<EE_VISITED_CELL> visitedCellList;
	
	private List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> sucHsdschCellList;
	
	private List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> interOutHHOFailList;
	
	public GPEH_SESSION getSession() {
		return session;
	}

	public void setSession(final GPEH_SESSION session) {
		this.session = session;
	}

	public List<EE_VISITED_CELL> getVisitedCellList() {
		return visitedCellList;
	}

	public void setVisitedCellList(final List<EE_VISITED_CELL> visitedCellList) {
		this.visitedCellList = visitedCellList;
	}

	public List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> getSucHsdschCellList() {
		return sucHsdschCellList;
	}

	public void setSucHsdschCellList(
			final List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> sucHsdschCellList) {
		this.sucHsdschCellList = sucHsdschCellList;
	}

	public List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> getInterOutHHOFailList() {
		return interOutHHOFailList;
	}

	public void setInterOutHHOFailList(
			final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> interOutHHOFailList) {
		this.interOutHHOFailList = interOutHHOFailList;
	}
}
