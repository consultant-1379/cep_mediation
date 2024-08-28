/*************************************************************/
/* Copyright (C) 2012 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED. */

/* Generated for: LM Ericsson Ltd, Athlone, Ireland - License 11536 for Solaris x86 */
/* Abstract syntax: class-definitions */
/* ASN.1 Java project: rrc.Rrc */
/* Created: Wed Feb 15 12:27:03 2012 */
/* ASN.1 Compiler for Java version: 4.1 */
/* ASN.1 compiler options and file names specified:
 * -output rrc -uper -root constants.asn ie-definitions.asn internode.asn
 * pdu-definitions.asn class-definitions.asn
 */


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CellUpdate from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellUpdate extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellUpdate()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellUpdate(rrc.informationelements.U_RNTI u_RNTI, 
		    rrc.informationelements.STARTList startList, 
		    BOOLEAN am_RLC_ErrorIndicationRb2_3or4, 
		    BOOLEAN am_RLC_ErrorIndicationRb5orAbove, 
		    rrc.informationelements.CellUpdateCause cellUpdateCause, 
		    rrc.informationelements.FailureCauseWithProtErrTrId failureCause, 
		    rrc.informationelements.Rb_timer_indicator rb_timer_indicator, 
		    rrc.informationelements.MeasuredResultsOnRACH measuredResultsOnRACH, 
		    LaterNCEs laterNCEs)
    {
	setU_RNTI(u_RNTI);
	setStartList(startList);
	setAm_RLC_ErrorIndicationRb2_3or4(am_RLC_ErrorIndicationRb2_3or4);
	setAm_RLC_ErrorIndicationRb5orAbove(am_RLC_ErrorIndicationRb5orAbove);
	setCellUpdateCause(cellUpdateCause);
	setFailureCause(failureCause);
	setRb_timer_indicator(rb_timer_indicator);
	setMeasuredResultsOnRACH(measuredResultsOnRACH);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with components.
     */
    public CellUpdate(rrc.informationelements.U_RNTI u_RNTI, 
		    rrc.informationelements.STARTList startList, 
		    boolean am_RLC_ErrorIndicationRb2_3or4, 
		    boolean am_RLC_ErrorIndicationRb5orAbove, 
		    rrc.informationelements.CellUpdateCause cellUpdateCause, 
		    rrc.informationelements.FailureCauseWithProtErrTrId failureCause, 
		    rrc.informationelements.Rb_timer_indicator rb_timer_indicator, 
		    rrc.informationelements.MeasuredResultsOnRACH measuredResultsOnRACH, 
		    LaterNCEs laterNCEs)
    {
	this(u_RNTI, startList, 
	     new BOOLEAN(am_RLC_ErrorIndicationRb2_3or4), 
	     new BOOLEAN(am_RLC_ErrorIndicationRb5orAbove), cellUpdateCause, 
	     failureCause, rb_timer_indicator, measuredResultsOnRACH, 
	     laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public CellUpdate(rrc.informationelements.U_RNTI u_RNTI, 
		    rrc.informationelements.STARTList startList, 
		    boolean am_RLC_ErrorIndicationRb2_3or4, 
		    boolean am_RLC_ErrorIndicationRb5orAbove, 
		    rrc.informationelements.CellUpdateCause cellUpdateCause, 
		    rrc.informationelements.Rb_timer_indicator rb_timer_indicator)
    {
	setU_RNTI(u_RNTI);
	setStartList(startList);
	setAm_RLC_ErrorIndicationRb2_3or4(am_RLC_ErrorIndicationRb2_3or4);
	setAm_RLC_ErrorIndicationRb5orAbove(am_RLC_ErrorIndicationRb5orAbove);
	setCellUpdateCause(cellUpdateCause);
	setRb_timer_indicator(rb_timer_indicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.U_RNTI();
	mComponents[1] = new rrc.informationelements.STARTList();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new BOOLEAN();
	mComponents[4] = rrc.informationelements.CellUpdateCause.cellReselection;
	mComponents[5] = new rrc.informationelements.FailureCauseWithProtErrTrId();
	mComponents[6] = new rrc.informationelements.Rb_timer_indicator();
	mComponents[7] = new rrc.informationelements.MeasuredResultsOnRACH();
	mComponents[8] = new LaterNCEs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.U_RNTI();
	    case 1:
		return new rrc.informationelements.STARTList();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new BOOLEAN();
	    case 4:
		return rrc.informationelements.CellUpdateCause.cellReselection;
	    case 5:
		return new rrc.informationelements.FailureCauseWithProtErrTrId();
	    case 6:
		return new rrc.informationelements.Rb_timer_indicator();
	    case 7:
		return new rrc.informationelements.MeasuredResultsOnRACH();
	    case 8:
		return new LaterNCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "u_RNTI"
    public rrc.informationelements.U_RNTI getU_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[0];
    }
    
    public void setU_RNTI(rrc.informationelements.U_RNTI u_RNTI)
    {
	mComponents[0] = u_RNTI;
    }
    
    
    // Methods for field "startList"
    public rrc.informationelements.STARTList getStartList()
    {
	return (rrc.informationelements.STARTList)mComponents[1];
    }
    
    public void setStartList(rrc.informationelements.STARTList startList)
    {
	mComponents[1] = startList;
    }
    
    
    // Methods for field "am_RLC_ErrorIndicationRb2_3or4"
    public boolean getAm_RLC_ErrorIndicationRb2_3or4()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setAm_RLC_ErrorIndicationRb2_3or4(boolean am_RLC_ErrorIndicationRb2_3or4)
    {
	setAm_RLC_ErrorIndicationRb2_3or4(new BOOLEAN(am_RLC_ErrorIndicationRb2_3or4));
    }
    
    public void setAm_RLC_ErrorIndicationRb2_3or4(BOOLEAN am_RLC_ErrorIndicationRb2_3or4)
    {
	mComponents[2] = am_RLC_ErrorIndicationRb2_3or4;
    }
    
    
    // Methods for field "am_RLC_ErrorIndicationRb5orAbove"
    public boolean getAm_RLC_ErrorIndicationRb5orAbove()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setAm_RLC_ErrorIndicationRb5orAbove(boolean am_RLC_ErrorIndicationRb5orAbove)
    {
	setAm_RLC_ErrorIndicationRb5orAbove(new BOOLEAN(am_RLC_ErrorIndicationRb5orAbove));
    }
    
    public void setAm_RLC_ErrorIndicationRb5orAbove(BOOLEAN am_RLC_ErrorIndicationRb5orAbove)
    {
	mComponents[3] = am_RLC_ErrorIndicationRb5orAbove;
    }
    
    
    // Methods for field "cellUpdateCause"
    public rrc.informationelements.CellUpdateCause getCellUpdateCause()
    {
	return (rrc.informationelements.CellUpdateCause)mComponents[4];
    }
    
    public void setCellUpdateCause(rrc.informationelements.CellUpdateCause cellUpdateCause)
    {
	mComponents[4] = cellUpdateCause;
    }
    
    
    // Methods for field "failureCause"
    public rrc.informationelements.FailureCauseWithProtErrTrId getFailureCause()
    {
	return (rrc.informationelements.FailureCauseWithProtErrTrId)mComponents[5];
    }
    
    public void setFailureCause(rrc.informationelements.FailureCauseWithProtErrTrId failureCause)
    {
	mComponents[5] = failureCause;
    }
    
    public boolean hasFailureCause()
    {
	return componentIsPresent(5);
    }
    
    public void deleteFailureCause()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "rb_timer_indicator"
    public rrc.informationelements.Rb_timer_indicator getRb_timer_indicator()
    {
	return (rrc.informationelements.Rb_timer_indicator)mComponents[6];
    }
    
    public void setRb_timer_indicator(rrc.informationelements.Rb_timer_indicator rb_timer_indicator)
    {
	mComponents[6] = rb_timer_indicator;
    }
    
    
    // Methods for field "measuredResultsOnRACH"
    public rrc.informationelements.MeasuredResultsOnRACH getMeasuredResultsOnRACH()
    {
	return (rrc.informationelements.MeasuredResultsOnRACH)mComponents[7];
    }
    
    public void setMeasuredResultsOnRACH(rrc.informationelements.MeasuredResultsOnRACH measuredResultsOnRACH)
    {
	mComponents[7] = measuredResultsOnRACH;
    }
    
    public boolean hasMeasuredResultsOnRACH()
    {
	return componentIsPresent(7);
    }
    
    public void deleteMeasuredResultsOnRACH()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "laterNCEs"
    public LaterNCEs getLaterNCEs()
    {
	return (LaterNCEs)mComponents[8];
    }
    
    public void setLaterNCEs(LaterNCEs laterNCEs)
    {
	mComponents[8] = laterNCEs;
    }
    
    public boolean hasLaterNCEs()
    {
	return componentIsPresent(8);
    }
    
    public void deleteLaterNCEs()
    {
	setComponentAbsent(8);
    }
    
    
    
    /**
     * Define the ASN1 Type LaterNCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class LaterNCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public LaterNCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public LaterNCEs(CellUpdate_r3_add_ext cellUpdate_r3_add_ext, 
			V590NCEs v590NCEs)
	{
	    setCellUpdate_r3_add_ext(cellUpdate_r3_add_ext);
	    setV590NCEs(v590NCEs);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new CellUpdate_r3_add_ext();
	    mComponents[1] = new V590NCEs();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[2];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new CellUpdate_r3_add_ext();
		case 1:
		    return new V590NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "cellUpdate_r3_add_ext"
	public CellUpdate_r3_add_ext getCellUpdate_r3_add_ext()
	{
	    return (CellUpdate_r3_add_ext)mComponents[0];
	}
	
	public void setCellUpdate_r3_add_ext(CellUpdate_r3_add_ext cellUpdate_r3_add_ext)
	{
	    mComponents[0] = cellUpdate_r3_add_ext;
	}
	
	public boolean hasCellUpdate_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteCellUpdate_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	
	/**
	 * Define the ASN1 Type CellUpdate_r3_add_ext from ASN1 Module PDU_definitions.
	 * @see ContainingBitString
	 */
	public static class CellUpdate_r3_add_ext extends ContainingBitString {
	    
	    /**
	     * The default constructor.
	     */
	    public CellUpdate_r3_add_ext()
	    {
	    }
	    
	    /**
	     * Construct Bit String from a byte array.
	     * All bits considered significant.
	     * @param value the byte array to set this object to.
	     */
	    public CellUpdate_r3_add_ext(byte[] value)
	    {
		super(value);
	    }
	    
	    
	    /**
	     * Construct Bit String from a byte array and significant bits.
	     * @param value the byte array to set this object to.
	     * @param sigBits the number of significant bits.
	     */
	    public CellUpdate_r3_add_ext(byte[] value, int sigBits)
	    {
		super(value, sigBits);
	    }
	    
	    /**
	     * Construct from a contained type value.
	     */
	    public CellUpdate_r3_add_ext(CellUpdate_r3_add_ext_IEs decoded)
	    {
		super(decoded);
	    }
	    
	    // Methods for getting and setting a contained value
	    public CellUpdate_r3_add_ext_IEs getContainedValue()
	    {
		return (CellUpdate_r3_add_ext_IEs)getDecodedValue();
	    }
	    
	    public void setContainedValue(CellUpdate_r3_add_ext_IEs value)
	    {
		setDecodedValue(value);
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "CellUpdate$LaterNCEs$CellUpdate_r3_add_ext"
		),
		new QName (
		    "builtin",
		    "BIT STRING"
		),
		12314,
		null,
		null,
		null,
		new TypeInfoRef (
		    new QName (
			"rrc.pdu_definitions",
			"CellUpdate_r3_add_ext_IEs"
		    )
		),
		null
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' CellUpdate_r3_add_ext object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' CellUpdate_r3_add_ext object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for CellUpdate_r3_add_ext

	// Methods for field "v590NCEs"
	public V590NCEs getV590NCEs()
	{
	    return (V590NCEs)mComponents[1];
	}
	
	public void setV590NCEs(V590NCEs v590NCEs)
	{
	    mComponents[1] = v590NCEs;
	}
	
	public boolean hasV590NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV590NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V590NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V590NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V590NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V590NCEs(CellUpdate_v590ext cellUpdate_v590ext, 
			    V690NCEs v690NCEs)
	    {
		setCellUpdate_v590ext(cellUpdate_v590ext);
		setV690NCEs(v690NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V590NCEs(CellUpdate_v590ext cellUpdate_v590ext)
	    {
		setCellUpdate_v590ext(cellUpdate_v590ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CellUpdate_v590ext();
		mComponents[1] = new V690NCEs();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[2];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new CellUpdate_v590ext();
		    case 1:
			return new V690NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cellUpdate_v590ext"
	    public CellUpdate_v590ext getCellUpdate_v590ext()
	    {
		return (CellUpdate_v590ext)mComponents[0];
	    }
	    
	    public void setCellUpdate_v590ext(CellUpdate_v590ext cellUpdate_v590ext)
	    {
		mComponents[0] = cellUpdate_v590ext;
	    }
	    
	    
	    // Methods for field "v690NCEs"
	    public V690NCEs getV690NCEs()
	    {
		return (V690NCEs)mComponents[1];
	    }
	    
	    public void setV690NCEs(V690NCEs v690NCEs)
	    {
		mComponents[1] = v690NCEs;
	    }
	    
	    public boolean hasV690NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV690NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V690NCEs from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class V690NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V690NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V690NCEs(CellUpdate_v690ext_IEs cellUpdate_v690ext, 
				V6b0NCEs v6b0NCEs)
		{
		    setCellUpdate_v690ext(cellUpdate_v690ext);
		    setV6b0NCEs(v6b0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V690NCEs(CellUpdate_v690ext_IEs cellUpdate_v690ext)
		{
		    setCellUpdate_v690ext(cellUpdate_v690ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new CellUpdate_v690ext_IEs();
		    mComponents[1] = new V6b0NCEs();
		}
		
		// Instance initializer
		{
		    mComponents = new AbstractData[2];
		}
		
		// Method to create a specific component instance
		public AbstractData createInstance(int index)
		{
		    switch (index) {
			case 0:
			    return new CellUpdate_v690ext_IEs();
			case 1:
			    return new V6b0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "cellUpdate_v690ext"
		public CellUpdate_v690ext_IEs getCellUpdate_v690ext()
		{
		    return (CellUpdate_v690ext_IEs)mComponents[0];
		}
		
		public void setCellUpdate_v690ext(CellUpdate_v690ext_IEs cellUpdate_v690ext)
		{
		    mComponents[0] = cellUpdate_v690ext;
		}
		
		
		// Methods for field "v6b0NCEs"
		public V6b0NCEs getV6b0NCEs()
		{
		    return (V6b0NCEs)mComponents[1];
		}
		
		public void setV6b0NCEs(V6b0NCEs v6b0NCEs)
		{
		    mComponents[1] = v6b0NCEs;
		}
		
		public boolean hasV6b0NCEs()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV6b0NCEs()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V6b0NCEs from ASN1 Module PDU_definitions.
		 * @see Sequence
		 */
		public static class V6b0NCEs extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V6b0NCEs()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V6b0NCEs(CellUpdate_v6b0ext_IEs cellUpdate_v6b0ext, 
				    V770NCEs v770NCEs)
		    {
			setCellUpdate_v6b0ext(cellUpdate_v6b0ext);
			setV770NCEs(v770NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V6b0NCEs(CellUpdate_v6b0ext_IEs cellUpdate_v6b0ext)
		    {
			setCellUpdate_v6b0ext(cellUpdate_v6b0ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new CellUpdate_v6b0ext_IEs();
			mComponents[1] = new V770NCEs();
		    }
		    
		    // Instance initializer
		    {
			mComponents = new AbstractData[2];
		    }
		    
		    // Method to create a specific component instance
		    public AbstractData createInstance(int index)
		    {
			switch (index) {
			    case 0:
				return new CellUpdate_v6b0ext_IEs();
			    case 1:
				return new V770NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "cellUpdate_v6b0ext"
		    public CellUpdate_v6b0ext_IEs getCellUpdate_v6b0ext()
		    {
			return (CellUpdate_v6b0ext_IEs)mComponents[0];
		    }
		    
		    public void setCellUpdate_v6b0ext(CellUpdate_v6b0ext_IEs cellUpdate_v6b0ext)
		    {
			mComponents[0] = cellUpdate_v6b0ext;
		    }
		    
		    
		    // Methods for field "v770NCEs"
		    public V770NCEs getV770NCEs()
		    {
			return (V770NCEs)mComponents[1];
		    }
		    
		    public void setV770NCEs(V770NCEs v770NCEs)
		    {
			mComponents[1] = v770NCEs;
		    }
		    
		    public boolean hasV770NCEs()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV770NCEs()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V770NCEs from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class V770NCEs extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V770NCEs()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V770NCEs(CellUpdate_v770ext_IEs cellUpdate_v770ext, 
					V860NCEs v860NCEs)
			{
			    setCellUpdate_v770ext(cellUpdate_v770ext);
			    setV860NCEs(v860NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V770NCEs(CellUpdate_v770ext_IEs cellUpdate_v770ext)
			{
			    setCellUpdate_v770ext(cellUpdate_v770ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new CellUpdate_v770ext_IEs();
			    mComponents[1] = new V860NCEs();
			}
			
			// Instance initializer
			{
			    mComponents = new AbstractData[2];
			}
			
			// Method to create a specific component instance
			public AbstractData createInstance(int index)
			{
			    switch (index) {
				case 0:
				    return new CellUpdate_v770ext_IEs();
				case 1:
				    return new V860NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "cellUpdate_v770ext"
			public CellUpdate_v770ext_IEs getCellUpdate_v770ext()
			{
			    return (CellUpdate_v770ext_IEs)mComponents[0];
			}
			
			public void setCellUpdate_v770ext(CellUpdate_v770ext_IEs cellUpdate_v770ext)
			{
			    mComponents[0] = cellUpdate_v770ext;
			}
			
			
			// Methods for field "v860NCEs"
			public V860NCEs getV860NCEs()
			{
			    return (V860NCEs)mComponents[1];
			}
			
			public void setV860NCEs(V860NCEs v860NCEs)
			{
			    mComponents[1] = v860NCEs;
			}
			
			public boolean hasV860NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV860NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V860NCEs from ASN1 Module PDU_definitions.
			 * @see Sequence
			 */
			public static class V860NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V860NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V860NCEs(CellUpdate_v860ext_IEs cellUpdate_v860ext, 
					    Va40NCEs va40NCEs)
			    {
				setCellUpdate_v860ext(cellUpdate_v860ext);
				setVa40NCEs(va40NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V860NCEs(CellUpdate_v860ext_IEs cellUpdate_v860ext)
			    {
				setCellUpdate_v860ext(cellUpdate_v860ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new CellUpdate_v860ext_IEs();
				mComponents[1] = new Va40NCEs();
			    }
			    
			    // Instance initializer
			    {
				mComponents = new AbstractData[2];
			    }
			    
			    // Method to create a specific component instance
			    public AbstractData createInstance(int index)
			    {
				switch (index) {
				    case 0:
					return new CellUpdate_v860ext_IEs();
				    case 1:
					return new Va40NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "cellUpdate_v860ext"
			    public CellUpdate_v860ext_IEs getCellUpdate_v860ext()
			    {
				return (CellUpdate_v860ext_IEs)mComponents[0];
			    }
			    
			    public void setCellUpdate_v860ext(CellUpdate_v860ext_IEs cellUpdate_v860ext)
			    {
				mComponents[0] = cellUpdate_v860ext;
			    }
			    
			    
			    // Methods for field "va40NCEs"
			    public Va40NCEs getVa40NCEs()
			    {
				return (Va40NCEs)mComponents[1];
			    }
			    
			    public void setVa40NCEs(Va40NCEs va40NCEs)
			    {
				mComponents[1] = va40NCEs;
			    }
			    
			    public boolean hasVa40NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteVa40NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type Va40NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class Va40NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public Va40NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public Va40NCEs(CellUpdate_va40ext_IEs cellUpdate_va40ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setCellUpdate_va40ext(cellUpdate_va40ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public Va40NCEs(CellUpdate_va40ext_IEs cellUpdate_va40ext)
				{
				    setCellUpdate_va40ext(cellUpdate_va40ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new CellUpdate_va40ext_IEs();
				    mComponents[1] = new NonCriticalExtensions();
				}
				
				// Instance initializer
				{
				    mComponents = new AbstractData[2];
				}
				
				// Method to create a specific component instance
				public AbstractData createInstance(int index)
				{
				    switch (index) {
					case 0:
					    return new CellUpdate_va40ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "cellUpdate_va40ext"
				public CellUpdate_va40ext_IEs getCellUpdate_va40ext()
				{
				    return (CellUpdate_va40ext_IEs)mComponents[0];
				}
				
				public void setCellUpdate_va40ext(CellUpdate_va40ext_IEs cellUpdate_va40ext)
				{
				    mComponents[0] = cellUpdate_va40ext;
				}
				
				
				// Methods for field "nonCriticalExtensions"
				public NonCriticalExtensions getNonCriticalExtensions()
				{
				    return (NonCriticalExtensions)mComponents[1];
				}
				
				public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
				{
				    mComponents[1] = nonCriticalExtensions;
				}
				
				public boolean hasNonCriticalExtensions()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteNonCriticalExtensions()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module PDU_definitions.
				 * @see Sequence
				 */
				public static class NonCriticalExtensions extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public NonCriticalExtensions()
				    {
				    }
				    
				    public void initComponents()
				    {
					
				    }
				    
				    // Instance initializer
				    {
					mComponents = new AbstractData[0];
				    }
				    
				    // Method to create a specific component instance
				    public AbstractData createInstance(int index)
				    {
					return null;
				    }
				    
				    
				    /**
				     * Initialize the type descriptor.
				     */
				    private static final SequenceInfo c_typeinfo = new SequenceInfo (
					new Tags (
					    new short[] {
						(short)0x8001
					    }
					),
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdate$LaterNCEs$V590NCEs$V690NCEs$V6b0NCEs$V770NCEs$V860NCEs$Va40NCEs$NonCriticalExtensions"
					),
					new QName (
					    "builtin",
					    "SEQUENCE"
					),
					12314,
					null,
					new Fields (
					    new SequenceFieldInfo[] {
					    }
					),
					0,
					null,
					0
				    );
				    
				    /**
				     * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for NonCriticalExtensions

				/**
				 * Initialize the type descriptor.
				 */
				private static final SequenceInfo c_typeinfo = new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdate$LaterNCEs$V590NCEs$V690NCEs$V6b0NCEs$V770NCEs$V860NCEs$Va40NCEs"
				    ),
				    new QName (
					"builtin",
					"SEQUENCE"
				    ),
				    12314,
				    null,
				    new Fields (
					new SequenceFieldInfo[] {
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new SequenceInfo (
							new Tags (
							    new short[] {
								(short)0x8000
							    }
							),
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdate_va40ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "CellUpdate-va40ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"CellUpdate_va40ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"CellUpdate_va40ext_IEs"
							    )
							),
							0
						    )
						),
						"cellUpdate-va40ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdate$LaterNCEs$V590NCEs$V690NCEs$V6b0NCEs$V770NCEs$V860NCEs$Va40NCEs$NonCriticalExtensions"
						    )
						),
						"nonCriticalExtensions",
						1,
						3,
						null
					    )
					}
				    ),
				    0,
				    new TagDecoders (
					new TagDecoder[] {
					    new TagDecoder (
						new TagDecoderElement[] {
						    new TagDecoderElement((short)0x8000, 0)
						}
					    ),
					    new TagDecoder (
						new TagDecoderElement[] {
						    new TagDecoderElement((short)0x8001, 1)
						}
					    )
					}
				    ),
				    0
				);
				
				/**
				 * Get the type descriptor (TypeInfo) of 'this' Va40NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' Va40NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for Va40NCEs

			    /**
			     * Initialize the type descriptor.
			     */
			    private static final SequenceInfo c_typeinfo = new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdate$LaterNCEs$V590NCEs$V690NCEs$V6b0NCEs$V770NCEs$V860NCEs"
				),
				new QName (
				    "builtin",
				    "SEQUENCE"
				),
				12314,
				null,
				new Fields (
				    new SequenceFieldInfo[] {
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new SequenceInfo (
						    new Tags (
							new short[] {
							    (short)0x8000
							}
						    ),
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdate_v860ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"CellUpdate-v860ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdate_v860ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdate_v860ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "cellUpdate-v860ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdate$LaterNCEs$V590NCEs$V690NCEs$V6b0NCEs$V770NCEs$V860NCEs$Va40NCEs"
						)
					    ),
					    "va40NCEs",
					    1,
					    3,
					    null
					)
				    }
				),
				0,
				new TagDecoders (
				    new TagDecoder[] {
					new TagDecoder (
					    new TagDecoderElement[] {
						new TagDecoderElement((short)0x8000, 0)
					    }
					),
					new TagDecoder (
					    new TagDecoderElement[] {
						new TagDecoderElement((short)0x8001, 1)
					    }
					)
				    }
				),
				0
			    );
			    
			    /**
			     * Get the type descriptor (TypeInfo) of 'this' V860NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V860NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V860NCEs

			/**
			 * Initialize the type descriptor.
			 */
			private static final SequenceInfo c_typeinfo = new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"CellUpdate$LaterNCEs$V590NCEs$V690NCEs$V6b0NCEs$V770NCEs"
			    ),
			    new QName (
				"builtin",
				"SEQUENCE"
			    ),
			    12314,
			    null,
			    new Fields (
				new SequenceFieldInfo[] {
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new SequenceInfo (
						new Tags (
						    new short[] {
							(short)0x8000
						    }
						),
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdate_v770ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "CellUpdate-v770ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdate_v770ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdate_v770ext_IEs"
						    )
						),
						0
					    )
					),
					"cellUpdate-v770ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdate$LaterNCEs$V590NCEs$V690NCEs$V6b0NCEs$V770NCEs$V860NCEs"
					    )
					),
					"v860NCEs",
					1,
					3,
					null
				    )
				}
			    ),
			    0,
			    new TagDecoders (
				new TagDecoder[] {
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8000, 0)
					}
				    ),
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8001, 1)
					}
				    )
				}
			    ),
			    0
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' V770NCEs object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V770NCEs object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V770NCEs

		    /**
		     * Initialize the type descriptor.
		     */
		    private static final SequenceInfo c_typeinfo = new SequenceInfo (
			new Tags (
			    new short[] {
				(short)0x8001
			    }
			),
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate$LaterNCEs$V590NCEs$V690NCEs$V6b0NCEs"
			),
			new QName (
			    "builtin",
			    "SEQUENCE"
			),
			12314,
			null,
			new Fields (
			    new SequenceFieldInfo[] {
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new SequenceInfo (
					    new Tags (
						new short[] {
						    (short)0x8000
						}
					    ),
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdate_v6b0ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"CellUpdate-v6b0ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdate_v6b0ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdate_v6b0ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "cellUpdate-v6b0ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdate$LaterNCEs$V590NCEs$V690NCEs$V6b0NCEs$V770NCEs"
					)
				    ),
				    "v770NCEs",
				    1,
				    3,
				    null
				)
			    }
			),
			0,
			new TagDecoders (
			    new TagDecoder[] {
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0)
				    }
				),
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8001, 1)
				    }
				)
			    }
			),
			0
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' V6b0NCEs object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V6b0NCEs object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V6b0NCEs

		/**
		 * Initialize the type descriptor.
		 */
		private static final SequenceInfo c_typeinfo = new SequenceInfo (
		    new Tags (
			new short[] {
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"CellUpdate$LaterNCEs$V590NCEs$V690NCEs"
		    ),
		    new QName (
			"builtin",
			"SEQUENCE"
		    ),
		    12314,
		    null,
		    new Fields (
			new SequenceFieldInfo[] {
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new SequenceInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdate_v690ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "CellUpdate-v690ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdate_v690ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdate_v690ext_IEs"
					    )
					),
					0
				    )
				),
				"cellUpdate-v690ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdate$LaterNCEs$V590NCEs$V690NCEs$V6b0NCEs"
				    )
				),
				"v6b0NCEs",
				1,
				3,
				null
			    )
			}
		    ),
		    0,
		    new TagDecoders (
			new TagDecoder[] {
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			}
		    ),
		    0
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' V690NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V690NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V690NCEs

	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "CellUpdate$LaterNCEs$V590NCEs"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		12314,
		null,
		new Fields (
		    new SequenceFieldInfo[] {
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdate_v590ext"
				    ),
				    new QName (
					"PDU-definitions",
					"CellUpdate-v590ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdate_v590ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdate_v590ext"
					)
				    ),
				    0
				)
			    ),
			    "cellUpdate-v590ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdate$LaterNCEs$V590NCEs$V690NCEs"
				)
			    ),
			    "v690NCEs",
			    1,
			    3,
			    null
			)
		    }
		),
		0,
		new TagDecoders (
		    new TagDecoder[] {
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8000, 0)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' V590NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V590NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V590NCEs

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8008
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellUpdate$LaterNCEs"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"CellUpdate$LaterNCEs$CellUpdate_r3_add_ext"
			    )
			),
			"cellUpdate-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"CellUpdate$LaterNCEs$V590NCEs"
			    )
			),
			"v590NCEs",
			1,
			3,
			null
		    )
		}
	    ),
	    0,
	    new TagDecoders (
		new TagDecoder[] {
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8000, 0),
			    new TagDecoderElement((short)0x8001, 1)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' LaterNCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LaterNCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LaterNCEs

    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.pdu_definitions",
	    "CellUpdate"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdate"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"U_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"U-RNTI"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI"
				)
			    ),
			    0
			)
		    ),
		    "u-RNTI",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"STARTList"
			    ),
			    new QName (
				"InformationElements",
				"STARTList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "STARTSingle"
				)
			    )
			)
		    ),
		    "startList",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "am-RLC-ErrorIndicationRb2-3or4",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "am-RLC-ErrorIndicationRb5orAbove",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellUpdateCause"
			    ),
			    new QName (
				"InformationElements",
				"CellUpdateCause"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cellReselection",
					0
				    ),
				    new MemberListElement (
					"periodicalCellUpdate",
					1
				    ),
				    new MemberListElement (
					"uplinkDataTransmission",
					2
				    ),
				    new MemberListElement (
					"utran-pagingResponse",
					3
				    ),
				    new MemberListElement (
					"re-enteredServiceArea",
					4
				    ),
				    new MemberListElement (
					"radiolinkFailure",
					5
				    ),
				    new MemberListElement (
					"rlc-unrecoverableError",
					6
				    ),
				    new MemberListElement (
					"cellUpdateCause-ext",
					7
				    )
				}
			    ),
			    0,
			    rrc.informationelements.CellUpdateCause.cellReselection
			)
		    ),
		    "cellUpdateCause",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"FailureCauseWithProtErrTrId"
			    ),
			    new QName (
				"InformationElements",
				"FailureCauseWithProtErrTrId"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FailureCauseWithProtErrTrId"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FailureCauseWithProtErrTrId"
				)
			    ),
			    0
			)
		    ),
		    "failureCause",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Rb_timer_indicator"
			    ),
			    new QName (
				"InformationElements",
				"Rb-timer-indicator"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Rb_timer_indicator"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Rb_timer_indicator"
				)
			    ),
			    0
			)
		    ),
		    "rb-timer-indicator",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResultsOnRACH"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsOnRACH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACH"
				)
			    ),
			    0
			)
		    ),
		    "measuredResultsOnRACH",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate$LaterNCEs"
			)
		    ),
		    "laterNCEs",
		    8,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellUpdate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdate
