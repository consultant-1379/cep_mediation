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


package rrc.informationelements;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CellMeasuredResults_r9 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellMeasuredResults_r9 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellMeasuredResults_r9()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellMeasuredResults_r9(CellIdentity cellIdentity, 
		    CellSynchronisationInfo cellSynchronisationInfo, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setCellIdentity(cellIdentity);
	setCellSynchronisationInfo(cellSynchronisationInfo);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public CellMeasuredResults_r9(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellIdentity();
	mComponents[1] = new CellSynchronisationInfo();
	mComponents[2] = new ModeSpecificInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new CellIdentity();
	    case 1:
		return new CellSynchronisationInfo();
	    case 2:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cellIdentity"
    public CellIdentity getCellIdentity()
    {
	return (CellIdentity)mComponents[0];
    }
    
    public void setCellIdentity(CellIdentity cellIdentity)
    {
	mComponents[0] = cellIdentity;
    }
    
    public boolean hasCellIdentity()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCellIdentity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "cellSynchronisationInfo"
    public CellSynchronisationInfo getCellSynchronisationInfo()
    {
	return (CellSynchronisationInfo)mComponents[1];
    }
    
    public void setCellSynchronisationInfo(CellSynchronisationInfo cellSynchronisationInfo)
    {
	mComponents[1] = cellSynchronisationInfo;
    }
    
    public boolean hasCellSynchronisationInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCellSynchronisationInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[2];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[2] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Fdd fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Fdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Fdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info, 
			    CPICH_Ec_N0 cpich_Ec_N0, CPICH_RSCP cpich_RSCP, 
			    DeltaRSCPPerCell deltaRSCPPerCell, 
			    Pathloss pathloss)
	    {
		setPrimaryCPICH_Info(primaryCPICH_Info);
		setCpich_Ec_N0(cpich_Ec_N0);
		setCpich_RSCP(cpich_RSCP);
		setDeltaRSCPPerCell(deltaRSCPPerCell);
		setPathloss(pathloss);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info)
	    {
		setPrimaryCPICH_Info(primaryCPICH_Info);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PrimaryCPICH_Info();
		mComponents[1] = new CPICH_Ec_N0();
		mComponents[2] = new CPICH_RSCP();
		mComponents[3] = new DeltaRSCPPerCell();
		mComponents[4] = new Pathloss();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[5];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new PrimaryCPICH_Info();
		    case 1:
			return new CPICH_Ec_N0();
		    case 2:
			return new CPICH_RSCP();
		    case 3:
			return new DeltaRSCPPerCell();
		    case 4:
			return new Pathloss();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "primaryCPICH_Info"
	    public PrimaryCPICH_Info getPrimaryCPICH_Info()
	    {
		return (PrimaryCPICH_Info)mComponents[0];
	    }
	    
	    public void setPrimaryCPICH_Info(PrimaryCPICH_Info primaryCPICH_Info)
	    {
		mComponents[0] = primaryCPICH_Info;
	    }
	    
	    
	    // Methods for field "cpich_Ec_N0"
	    public CPICH_Ec_N0 getCpich_Ec_N0()
	    {
		return (CPICH_Ec_N0)mComponents[1];
	    }
	    
	    public void setCpich_Ec_N0(CPICH_Ec_N0 cpich_Ec_N0)
	    {
		mComponents[1] = cpich_Ec_N0;
	    }
	    
	    public boolean hasCpich_Ec_N0()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteCpich_Ec_N0()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "cpich_RSCP"
	    public CPICH_RSCP getCpich_RSCP()
	    {
		return (CPICH_RSCP)mComponents[2];
	    }
	    
	    public void setCpich_RSCP(CPICH_RSCP cpich_RSCP)
	    {
		mComponents[2] = cpich_RSCP;
	    }
	    
	    public boolean hasCpich_RSCP()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteCpich_RSCP()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "deltaRSCPPerCell"
	    public DeltaRSCPPerCell getDeltaRSCPPerCell()
	    {
		return (DeltaRSCPPerCell)mComponents[3];
	    }
	    
	    public void setDeltaRSCPPerCell(DeltaRSCPPerCell deltaRSCPPerCell)
	    {
		mComponents[3] = deltaRSCPPerCell;
	    }
	    
	    public boolean hasDeltaRSCPPerCell()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteDeltaRSCPPerCell()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "pathloss"
	    public Pathloss getPathloss()
	    {
		return (Pathloss)mComponents[4];
	    }
	    
	    public void setPathloss(Pathloss pathloss)
	    {
		mComponents[4] = pathloss;
	    }
	    
	    public boolean hasPathloss()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deletePathloss()
	    {
		setComponentAbsent(4);
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "CellMeasuredResults_r9$ModeSpecificInfo$Fdd"
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
					"rrc.informationelements",
					"PrimaryCPICH_Info"
				    ),
				    new QName (
					"InformationElements",
					"PrimaryCPICH-Info"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCPICH_Info"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCPICH_Info"
					)
				    ),
				    0
				)
			    ),
			    "primaryCPICH-Info",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"CPICH_Ec_N0"
				    ),
				    new QName (
					"InformationElements",
					"CPICH-Ec-N0"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new CPICH_Ec_N0(0), 
					    new CPICH_Ec_N0(63),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(63)
				    ),
				    null
				)
			    ),
			    "cpich-Ec-N0",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"CPICH_RSCP"
				    ),
				    new QName (
					"InformationElements",
					"CPICH-RSCP"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new CPICH_RSCP(0), 
					    new CPICH_RSCP(127),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(127)
				    ),
				    null
				)
			    ),
			    "cpich-RSCP",
			    2,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DeltaRSCPPerCell"
				    ),
				    new QName (
					"InformationElements",
					"DeltaRSCPPerCell"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DeltaRSCPPerCell"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DeltaRSCPPerCell"
					)
				    ),
				    0
				)
			    ),
			    "deltaRSCPPerCell",
			    3,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"Pathloss"
				    ),
				    new QName (
					"InformationElements",
					"Pathloss"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Pathloss(46), 
					    new Pathloss(173),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(46),
					new java.lang.Long(173)
				    ),
				    null
				)
			    ),
			    "pathloss",
			    4,
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Fdd

	// Methods for field "tdd"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Tdd tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd(CellParametersID cellParametersID, TGSN proposedTGSN, 
			    PrimaryCCPCH_RSCP primaryCCPCH_RSCP, 
			    Pathloss pathloss, 
			    TimeslotISCP_List timeslotISCP_List)
	    {
		setCellParametersID(cellParametersID);
		setProposedTGSN(proposedTGSN);
		setPrimaryCCPCH_RSCP(primaryCCPCH_RSCP);
		setPathloss(pathloss);
		setTimeslotISCP_List(timeslotISCP_List);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Tdd(CellParametersID cellParametersID)
	    {
		setCellParametersID(cellParametersID);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CellParametersID();
		mComponents[1] = new TGSN();
		mComponents[2] = new PrimaryCCPCH_RSCP();
		mComponents[3] = new Pathloss();
		mComponents[4] = new TimeslotISCP_List();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[5];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new CellParametersID();
		    case 1:
			return new TGSN();
		    case 2:
			return new PrimaryCCPCH_RSCP();
		    case 3:
			return new Pathloss();
		    case 4:
			return new TimeslotISCP_List();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cellParametersID"
	    public CellParametersID getCellParametersID()
	    {
		return (CellParametersID)mComponents[0];
	    }
	    
	    public void setCellParametersID(CellParametersID cellParametersID)
	    {
		mComponents[0] = cellParametersID;
	    }
	    
	    
	    // Methods for field "proposedTGSN"
	    public TGSN getProposedTGSN()
	    {
		return (TGSN)mComponents[1];
	    }
	    
	    public void setProposedTGSN(TGSN proposedTGSN)
	    {
		mComponents[1] = proposedTGSN;
	    }
	    
	    public boolean hasProposedTGSN()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteProposedTGSN()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "primaryCCPCH_RSCP"
	    public PrimaryCCPCH_RSCP getPrimaryCCPCH_RSCP()
	    {
		return (PrimaryCCPCH_RSCP)mComponents[2];
	    }
	    
	    public void setPrimaryCCPCH_RSCP(PrimaryCCPCH_RSCP primaryCCPCH_RSCP)
	    {
		mComponents[2] = primaryCCPCH_RSCP;
	    }
	    
	    public boolean hasPrimaryCCPCH_RSCP()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deletePrimaryCCPCH_RSCP()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "pathloss"
	    public Pathloss getPathloss()
	    {
		return (Pathloss)mComponents[3];
	    }
	    
	    public void setPathloss(Pathloss pathloss)
	    {
		mComponents[3] = pathloss;
	    }
	    
	    public boolean hasPathloss()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deletePathloss()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "timeslotISCP_List"
	    public TimeslotISCP_List getTimeslotISCP_List()
	    {
		return (TimeslotISCP_List)mComponents[4];
	    }
	    
	    public void setTimeslotISCP_List(TimeslotISCP_List timeslotISCP_List)
	    {
		mComponents[4] = timeslotISCP_List;
	    }
	    
	    public boolean hasTimeslotISCP_List()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteTimeslotISCP_List()
	    {
		setComponentAbsent(4);
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
		    "rrc.informationelements",
		    "CellMeasuredResults_r9$ModeSpecificInfo$Tdd"
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
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"CellParametersID"
				    ),
				    new QName (
					"InformationElements",
					"CellParametersID"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new CellParametersID(0), 
					    new CellParametersID(127),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(127)
				    ),
				    null
				)
			    ),
			    "cellParametersID",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"TGSN"
				    ),
				    new QName (
					"InformationElements",
					"TGSN"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new TGSN(0), 
					    new TGSN(14),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(14)
				    ),
				    null
				)
			    ),
			    "proposedTGSN",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PrimaryCCPCH_RSCP"
				    ),
				    new QName (
					"InformationElements",
					"PrimaryCCPCH-RSCP"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new PrimaryCCPCH_RSCP(0), 
					    new PrimaryCCPCH_RSCP(127),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(127)
				    ),
				    null
				)
			    ),
			    "primaryCCPCH-RSCP",
			    2,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"Pathloss"
				    ),
				    new QName (
					"InformationElements",
					"Pathloss"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Pathloss(46), 
					    new Pathloss(173),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(46),
					new java.lang.Long(173)
				    ),
				    null
				)
			    ),
			    "pathloss",
			    3,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"TimeslotISCP_List"
				    ),
				    new QName (
					"InformationElements",
					"TimeslotISCP-List"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(14),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(14)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "TimeslotISCP"
					)
				    )
				)
			    ),
			    "timeslotISCP-List",
			    4,
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Tdd();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CellMeasuredResults_r9$ModeSpecificInfo"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"CellMeasuredResults_r9$ModeSpecificInfo$Fdd"
			    )
			),
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"CellMeasuredResults_r9$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

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
	    "rrc.informationelements",
	    "CellMeasuredResults_r9"
	),
	new QName (
	    "InformationElements",
	    "CellMeasuredResults-r9"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CellIdentity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "cellIdentity",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellSynchronisationInfo"
			    ),
			    new QName (
				"InformationElements",
				"CellSynchronisationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellSynchronisationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellSynchronisationInfo"
				)
			    ),
			    0
			)
		    ),
		    "cellSynchronisationInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CellMeasuredResults_r9$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    2,
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellMeasuredResults_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellMeasuredResults_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellMeasuredResults_r9
