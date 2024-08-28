package com.ericsson.cepmediation.correlation.enrichment.listeners.beans;

import com.espertech.esper.client.EventBean;


public class UeRbTraffic {
	private String ne;
	private String name;	
    private byte BEARER_ID = -1;
    private byte BEARER_TYPE = -1;
    private byte ERAB_ID = -1;
    private int PER_DRB_PDCP_TRANSVOL_DL = -1;
    private int PER_DRB_PDCP_RECVOL_UL = -1;
    private int PER_DRB_DL_RLC_DELAY = -1;
    private int PER_DRB_DL_RLC_DELAY_SAMPL = -1;
    private int PER_DRB_LAT_TIME_DL = -1;
    private int PER_DRB_LAT_SAMPL_DL = -1;
    private int PER_PDCPVOL_DL_RB = -1;
    
    
	public UeRbTraffic(final EventBean event) {
		setBEARER_ID((Byte) event.get("BEARER_ID"));
		setBEARER_TYPE((Byte) event.get("BEARER_TYPE"));
		setERAB_ID((Byte) event.get("ERAB_ID"));
		setPER_PDCPVOL_DL_RB((Integer) event.get("PER_PDCPVOL_DL_RB"));
		setPER_DRB_PDCP_TRANSVOL_DL((Integer) event.get("PER_DRB_PDCP_TRANSVOL_DL"));
		setPER_DRB_PDCP_RECVOL_UL((Integer) event.get("PER_DRB_PDCP_RECVOL_UL"));
		setPER_DRB_LAT_TIME_DL((Integer) event.get("PER_DRB_LAT_TIME_DL"));
		setPER_DRB_LAT_SAMPL_DL((Integer) event.get("PER_DRB_LAT_SAMPL_DL"));
		setPER_DRB_DL_RLC_DELAY((Integer) event.get("PER_DRB_DL_RLC_DELAY"));
		setPER_DRB_DL_RLC_DELAY_SAMPL((Integer) event.get("PER_DRB_DL_RLC_DELAY_SAMPL"));
	}
	
    public String getNe() {
		return ne;
	}
    
	public void setNe(final String ne) {
		this.ne = ne;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}

	public byte getBEARER_ID() {
		return BEARER_ID;
	}
	
	public void setBEARER_ID(final byte bEARER_ID) {
		BEARER_ID = bEARER_ID;
	}
	
	public byte getBEARER_TYPE() {
		return BEARER_TYPE;
	}
	
	public void setBEARER_TYPE(final byte bEARER_TYPE) {
		BEARER_TYPE = bEARER_TYPE;
	}
	
	public byte getERAB_ID() {
		return ERAB_ID;
	}
	
	public void setERAB_ID(final byte eRAB_ID) {
		ERAB_ID = eRAB_ID;
	}

	public int getPER_DRB_PDCP_TRANSVOL_DL() {
		return PER_DRB_PDCP_TRANSVOL_DL;
	}
	
	public void setPER_DRB_PDCP_TRANSVOL_DL(final int pER_DRB_PDCP_TRANSVOL_DL) {
		PER_DRB_PDCP_TRANSVOL_DL = pER_DRB_PDCP_TRANSVOL_DL;
	}
	
	public int getPER_DRB_PDCP_RECVOL_UL() {
		return PER_DRB_PDCP_RECVOL_UL;
	}
 
	public void setPER_DRB_PDCP_RECVOL_UL(final int pER_DRB_PDCP_RECVOL_UL) {
		PER_DRB_PDCP_RECVOL_UL = pER_DRB_PDCP_RECVOL_UL;
	}
	
	public int getPER_DRB_DL_RLC_DELAY() {
		return PER_DRB_DL_RLC_DELAY;
	}
	
	public void setPER_DRB_DL_RLC_DELAY(final int pER_DRB_DL_RLC_DELAY) {
		PER_DRB_DL_RLC_DELAY = pER_DRB_DL_RLC_DELAY;
	}
	
	public int getPER_DRB_DL_RLC_DELAY_SAMPL() {
		return PER_DRB_DL_RLC_DELAY_SAMPL;
	}

	public void setPER_DRB_DL_RLC_DELAY_SAMPL(final int pER_DRB_DL_RLC_DELAY_SAMPL) {
		PER_DRB_DL_RLC_DELAY_SAMPL = pER_DRB_DL_RLC_DELAY_SAMPL;
	}

	public int getPER_DRB_LAT_TIME_DL() {
		return PER_DRB_LAT_TIME_DL;
	}
	
	public void setPER_DRB_LAT_TIME_DL(final int pER_DRB_LAT_TIME_DL) {
		PER_DRB_LAT_TIME_DL = pER_DRB_LAT_TIME_DL;
	}
	
	public int getPER_DRB_LAT_SAMPL_DL() {
		return PER_DRB_LAT_SAMPL_DL;
	}
	
	public void setPER_DRB_LAT_SAMPL_DL(final int pER_DRB_LAT_SAMPL_DL) {
		PER_DRB_LAT_SAMPL_DL = pER_DRB_LAT_SAMPL_DL;
	}
	
	public int getPER_PDCPVOL_DL_RB() {
		return PER_PDCPVOL_DL_RB;
	}
	
	public void setPER_PDCPVOL_DL_RB(final int pER_PDCPVOL_DL_RB) {
		PER_PDCPVOL_DL_RB = pER_PDCPVOL_DL_RB;
	}
}
