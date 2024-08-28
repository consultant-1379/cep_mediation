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
 * Define the ASN1 Type CellReportingQuantities from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellReportingQuantities extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellReportingQuantities()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellReportingQuantities(SFN_SFN_OTD_Type dummy, 
		    BOOLEAN cellIdentity_reportingIndicator, 
		    BOOLEAN cellSynchronisationInfoReportingIndicator, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setDummy(dummy);
	setCellIdentity_reportingIndicator(cellIdentity_reportingIndicator);
	setCellSynchronisationInfoReportingIndicator(cellSynchronisationInfoReportingIndicator);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with components.
     */
    public CellReportingQuantities(SFN_SFN_OTD_Type dummy, 
		    boolean cellIdentity_reportingIndicator, 
		    boolean cellSynchronisationInfoReportingIndicator, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	this(dummy, new BOOLEAN(cellIdentity_reportingIndicator), 
	     new BOOLEAN(cellSynchronisationInfoReportingIndicator), 
	     modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = SFN_SFN_OTD_Type.noReport;
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new ModeSpecificInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return SFN_SFN_OTD_Type.noReport;
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dummy"
    public SFN_SFN_OTD_Type getDummy()
    {
	return (SFN_SFN_OTD_Type)mComponents[0];
    }
    
    public void setDummy(SFN_SFN_OTD_Type dummy)
    {
	mComponents[0] = dummy;
    }
    
    
    // Methods for field "cellIdentity_reportingIndicator"
    public boolean getCellIdentity_reportingIndicator()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setCellIdentity_reportingIndicator(boolean cellIdentity_reportingIndicator)
    {
	setCellIdentity_reportingIndicator(new BOOLEAN(cellIdentity_reportingIndicator));
    }
    
    public void setCellIdentity_reportingIndicator(BOOLEAN cellIdentity_reportingIndicator)
    {
	mComponents[1] = cellIdentity_reportingIndicator;
    }
    
    
    // Methods for field "cellSynchronisationInfoReportingIndicator"
    public boolean getCellSynchronisationInfoReportingIndicator()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setCellSynchronisationInfoReportingIndicator(boolean cellSynchronisationInfoReportingIndicator)
    {
	setCellSynchronisationInfoReportingIndicator(new BOOLEAN(cellSynchronisationInfoReportingIndicator));
    }
    
    public void setCellSynchronisationInfoReportingIndicator(BOOLEAN cellSynchronisationInfoReportingIndicator)
    {
	mComponents[2] = cellSynchronisationInfoReportingIndicator;
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[3];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[3] = modeSpecificInfo;
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
	    public Fdd(BOOLEAN cpich_Ec_N0_reportingIndicator, 
			    BOOLEAN cpich_RSCP_reportingIndicator, 
			    BOOLEAN pathloss_reportingIndicator)
	    {
		setCpich_Ec_N0_reportingIndicator(cpich_Ec_N0_reportingIndicator);
		setCpich_RSCP_reportingIndicator(cpich_RSCP_reportingIndicator);
		setPathloss_reportingIndicator(pathloss_reportingIndicator);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Fdd(boolean cpich_Ec_N0_reportingIndicator, 
			    boolean cpich_RSCP_reportingIndicator, 
			    boolean pathloss_reportingIndicator)
	    {
		this(new BOOLEAN(cpich_Ec_N0_reportingIndicator), 
		     new BOOLEAN(cpich_RSCP_reportingIndicator), 
		     new BOOLEAN(pathloss_reportingIndicator));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BOOLEAN();
		mComponents[1] = new BOOLEAN();
		mComponents[2] = new BOOLEAN();
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
			return new BOOLEAN();
		    case 1:
			return new BOOLEAN();
		    case 2:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cpich_Ec_N0_reportingIndicator"
	    public boolean getCpich_Ec_N0_reportingIndicator()
	    {
		return ((BOOLEAN)mComponents[0]).booleanValue();
	    }
	    
	    public void setCpich_Ec_N0_reportingIndicator(boolean cpich_Ec_N0_reportingIndicator)
	    {
		setCpich_Ec_N0_reportingIndicator(new BOOLEAN(cpich_Ec_N0_reportingIndicator));
	    }
	    
	    public void setCpich_Ec_N0_reportingIndicator(BOOLEAN cpich_Ec_N0_reportingIndicator)
	    {
		mComponents[0] = cpich_Ec_N0_reportingIndicator;
	    }
	    
	    
	    // Methods for field "cpich_RSCP_reportingIndicator"
	    public boolean getCpich_RSCP_reportingIndicator()
	    {
		return ((BOOLEAN)mComponents[1]).booleanValue();
	    }
	    
	    public void setCpich_RSCP_reportingIndicator(boolean cpich_RSCP_reportingIndicator)
	    {
		setCpich_RSCP_reportingIndicator(new BOOLEAN(cpich_RSCP_reportingIndicator));
	    }
	    
	    public void setCpich_RSCP_reportingIndicator(BOOLEAN cpich_RSCP_reportingIndicator)
	    {
		mComponents[1] = cpich_RSCP_reportingIndicator;
	    }
	    
	    
	    // Methods for field "pathloss_reportingIndicator"
	    public boolean getPathloss_reportingIndicator()
	    {
		return ((BOOLEAN)mComponents[2]).booleanValue();
	    }
	    
	    public void setPathloss_reportingIndicator(boolean pathloss_reportingIndicator)
	    {
		setPathloss_reportingIndicator(new BOOLEAN(pathloss_reportingIndicator));
	    }
	    
	    public void setPathloss_reportingIndicator(BOOLEAN pathloss_reportingIndicator)
	    {
		mComponents[2] = pathloss_reportingIndicator;
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
		    "CellReportingQuantities$ModeSpecificInfo$Fdd"
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
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
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
			    "cpich-Ec-N0-reportingIndicator",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
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
			    "cpich-RSCP-reportingIndicator",
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
			    "pathloss-reportingIndicator",
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
	    public Tdd(BOOLEAN timeslotISCP_reportingIndicator, 
			    BOOLEAN proposedTGSN_ReportingRequired, 
			    BOOLEAN primaryCCPCH_RSCP_reportingIndicator, 
			    BOOLEAN pathloss_reportingIndicator)
	    {
		setTimeslotISCP_reportingIndicator(timeslotISCP_reportingIndicator);
		setProposedTGSN_ReportingRequired(proposedTGSN_ReportingRequired);
		setPrimaryCCPCH_RSCP_reportingIndicator(primaryCCPCH_RSCP_reportingIndicator);
		setPathloss_reportingIndicator(pathloss_reportingIndicator);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Tdd(boolean timeslotISCP_reportingIndicator, 
			    boolean proposedTGSN_ReportingRequired, 
			    boolean primaryCCPCH_RSCP_reportingIndicator, 
			    boolean pathloss_reportingIndicator)
	    {
		this(new BOOLEAN(timeslotISCP_reportingIndicator), 
		     new BOOLEAN(proposedTGSN_ReportingRequired), 
		     new BOOLEAN(primaryCCPCH_RSCP_reportingIndicator), 
		     new BOOLEAN(pathloss_reportingIndicator));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BOOLEAN();
		mComponents[1] = new BOOLEAN();
		mComponents[2] = new BOOLEAN();
		mComponents[3] = new BOOLEAN();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[4];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new BOOLEAN();
		    case 1:
			return new BOOLEAN();
		    case 2:
			return new BOOLEAN();
		    case 3:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "timeslotISCP_reportingIndicator"
	    public boolean getTimeslotISCP_reportingIndicator()
	    {
		return ((BOOLEAN)mComponents[0]).booleanValue();
	    }
	    
	    public void setTimeslotISCP_reportingIndicator(boolean timeslotISCP_reportingIndicator)
	    {
		setTimeslotISCP_reportingIndicator(new BOOLEAN(timeslotISCP_reportingIndicator));
	    }
	    
	    public void setTimeslotISCP_reportingIndicator(BOOLEAN timeslotISCP_reportingIndicator)
	    {
		mComponents[0] = timeslotISCP_reportingIndicator;
	    }
	    
	    
	    // Methods for field "proposedTGSN_ReportingRequired"
	    public boolean getProposedTGSN_ReportingRequired()
	    {
		return ((BOOLEAN)mComponents[1]).booleanValue();
	    }
	    
	    public void setProposedTGSN_ReportingRequired(boolean proposedTGSN_ReportingRequired)
	    {
		setProposedTGSN_ReportingRequired(new BOOLEAN(proposedTGSN_ReportingRequired));
	    }
	    
	    public void setProposedTGSN_ReportingRequired(BOOLEAN proposedTGSN_ReportingRequired)
	    {
		mComponents[1] = proposedTGSN_ReportingRequired;
	    }
	    
	    
	    // Methods for field "primaryCCPCH_RSCP_reportingIndicator"
	    public boolean getPrimaryCCPCH_RSCP_reportingIndicator()
	    {
		return ((BOOLEAN)mComponents[2]).booleanValue();
	    }
	    
	    public void setPrimaryCCPCH_RSCP_reportingIndicator(boolean primaryCCPCH_RSCP_reportingIndicator)
	    {
		setPrimaryCCPCH_RSCP_reportingIndicator(new BOOLEAN(primaryCCPCH_RSCP_reportingIndicator));
	    }
	    
	    public void setPrimaryCCPCH_RSCP_reportingIndicator(BOOLEAN primaryCCPCH_RSCP_reportingIndicator)
	    {
		mComponents[2] = primaryCCPCH_RSCP_reportingIndicator;
	    }
	    
	    
	    // Methods for field "pathloss_reportingIndicator"
	    public boolean getPathloss_reportingIndicator()
	    {
		return ((BOOLEAN)mComponents[3]).booleanValue();
	    }
	    
	    public void setPathloss_reportingIndicator(boolean pathloss_reportingIndicator)
	    {
		setPathloss_reportingIndicator(new BOOLEAN(pathloss_reportingIndicator));
	    }
	    
	    public void setPathloss_reportingIndicator(BOOLEAN pathloss_reportingIndicator)
	    {
		mComponents[3] = pathloss_reportingIndicator;
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
		    "CellReportingQuantities$ModeSpecificInfo$Tdd"
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
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
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
			    "timeslotISCP-reportingIndicator",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
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
			    "proposedTGSN-ReportingRequired",
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
			    "primaryCCPCH-RSCP-reportingIndicator",
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
			    "pathloss-reportingIndicator",
			    3,
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CellReportingQuantities$ModeSpecificInfo"
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
				"CellReportingQuantities$ModeSpecificInfo$Fdd"
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
				"CellReportingQuantities$ModeSpecificInfo$Tdd"
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
	    "CellReportingQuantities"
	),
	new QName (
	    "InformationElements",
	    "CellReportingQuantities"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SFN_SFN_OTD_Type"
			    ),
			    new QName (
				"InformationElements",
				"SFN-SFN-OTD-Type"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"noReport",
					0
				    ),
				    new MemberListElement (
					"type1",
					1
				    ),
				    new MemberListElement (
					"type2",
					2
				    )
				}
			    ),
			    0,
			    SFN_SFN_OTD_Type.noReport
			)
		    ),
		    "dummy",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "cellIdentity-reportingIndicator",
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
		    "cellSynchronisationInfoReportingIndicator",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CellReportingQuantities$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    3,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellReportingQuantities object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellReportingQuantities object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellReportingQuantities
