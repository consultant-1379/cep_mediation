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
 * Define the ASN1 Type DL_InformationPerRL_r5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_InformationPerRL_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_InformationPerRL_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_InformationPerRL_r5(ModeSpecificInfo modeSpecificInfo, 
		    DL_DPCH_InfoPerRL_r5 dl_DPCH_InfoPerRL, 
		    SCCPCH_InfoForFACH_r4 dummy, CellIdentity cell_id)
    {
	setModeSpecificInfo(modeSpecificInfo);
	setDl_DPCH_InfoPerRL(dl_DPCH_InfoPerRL);
	setDummy(dummy);
	setCell_id(cell_id);
    }
    
    /**
     * Construct with required components.
     */
    public DL_InformationPerRL_r5(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
	mComponents[1] = new DL_DPCH_InfoPerRL_r5();
	mComponents[2] = new SCCPCH_InfoForFACH_r4();
	mComponents[3] = new CellIdentity();
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
		return new ModeSpecificInfo();
	    case 1:
		return new DL_DPCH_InfoPerRL_r5();
	    case 2:
		return new SCCPCH_InfoForFACH_r4();
	    case 3:
		return new CellIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[0];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[0] = modeSpecificInfo;
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
			    PDSCH_SHO_DCH_Info dummy1, 
			    PDSCH_CodeMapping dummy2, 
			    BOOLEAN servingHSDSCH_RL_indicator)
	    {
		setPrimaryCPICH_Info(primaryCPICH_Info);
		setDummy1(dummy1);
		setDummy2(dummy2);
		setServingHSDSCH_RL_indicator(servingHSDSCH_RL_indicator);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info, 
			    PDSCH_SHO_DCH_Info dummy1, 
			    PDSCH_CodeMapping dummy2, 
			    boolean servingHSDSCH_RL_indicator)
	    {
		this(primaryCPICH_Info, dummy1, dummy2, 
		     new BOOLEAN(servingHSDSCH_RL_indicator));
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info, 
			    boolean servingHSDSCH_RL_indicator)
	    {
		setPrimaryCPICH_Info(primaryCPICH_Info);
		setServingHSDSCH_RL_indicator(servingHSDSCH_RL_indicator);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PrimaryCPICH_Info();
		mComponents[1] = new PDSCH_SHO_DCH_Info();
		mComponents[2] = new PDSCH_CodeMapping();
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
			return new PrimaryCPICH_Info();
		    case 1:
			return new PDSCH_SHO_DCH_Info();
		    case 2:
			return new PDSCH_CodeMapping();
		    case 3:
			return new BOOLEAN();
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
	    
	    
	    // Methods for field "dummy1"
	    public PDSCH_SHO_DCH_Info getDummy1()
	    {
		return (PDSCH_SHO_DCH_Info)mComponents[1];
	    }
	    
	    public void setDummy1(PDSCH_SHO_DCH_Info dummy1)
	    {
		mComponents[1] = dummy1;
	    }
	    
	    public boolean hasDummy1()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteDummy1()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "dummy2"
	    public PDSCH_CodeMapping getDummy2()
	    {
		return (PDSCH_CodeMapping)mComponents[2];
	    }
	    
	    public void setDummy2(PDSCH_CodeMapping dummy2)
	    {
		mComponents[2] = dummy2;
	    }
	    
	    public boolean hasDummy2()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteDummy2()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "servingHSDSCH_RL_indicator"
	    public boolean getServingHSDSCH_RL_indicator()
	    {
		return ((BOOLEAN)mComponents[3]).booleanValue();
	    }
	    
	    public void setServingHSDSCH_RL_indicator(boolean servingHSDSCH_RL_indicator)
	    {
		setServingHSDSCH_RL_indicator(new BOOLEAN(servingHSDSCH_RL_indicator));
	    }
	    
	    public void setServingHSDSCH_RL_indicator(BOOLEAN servingHSDSCH_RL_indicator)
	    {
		mComponents[3] = servingHSDSCH_RL_indicator;
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
		    "DL_InformationPerRL_r5$ModeSpecificInfo$Fdd"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PDSCH_SHO_DCH_Info"
				    ),
				    new QName (
					"InformationElements",
					"PDSCH-SHO-DCH-Info"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PDSCH_SHO_DCH_Info"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PDSCH_SHO_DCH_Info"
					)
				    ),
				    0
				)
			    ),
			    "dummy1",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PDSCH_CodeMapping"
				    ),
				    new QName (
					"InformationElements",
					"PDSCH-CodeMapping"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PDSCH_CodeMapping"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PDSCH_CodeMapping"
					)
				    ),
				    0
				)
			    ),
			    "dummy2",
			    2,
			    3,
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
			    "servingHSDSCH-RL-indicator",
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3)
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
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(PrimaryCCPCH_Info_r4 tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(PrimaryCCPCH_Info_r4 tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new PrimaryCCPCH_Info_r4();
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_InformationPerRL_r5$ModeSpecificInfo"
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
				"DL_InformationPerRL_r5$ModeSpecificInfo$Fdd"
			    )
			),
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "PrimaryCCPCH_Info_r4"
				),
				new QName (
				    "InformationElements",
				    "PrimaryCCPCH-Info-r4"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PrimaryCCPCH_Info_r4"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1)
				    }
				)
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

    // Methods for field "dl_DPCH_InfoPerRL"
    public DL_DPCH_InfoPerRL_r5 getDl_DPCH_InfoPerRL()
    {
	return (DL_DPCH_InfoPerRL_r5)mComponents[1];
    }
    
    public void setDl_DPCH_InfoPerRL(DL_DPCH_InfoPerRL_r5 dl_DPCH_InfoPerRL)
    {
	mComponents[1] = dl_DPCH_InfoPerRL;
    }
    
    public boolean hasDl_DPCH_InfoPerRL()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_DPCH_InfoPerRL()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dummy"
    public SCCPCH_InfoForFACH_r4 getDummy()
    {
	return (SCCPCH_InfoForFACH_r4)mComponents[2];
    }
    
    public void setDummy(SCCPCH_InfoForFACH_r4 dummy)
    {
	mComponents[2] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "cell_id"
    public CellIdentity getCell_id()
    {
	return (CellIdentity)mComponents[3];
    }
    
    public void setCell_id(CellIdentity cell_id)
    {
	mComponents[3] = cell_id;
    }
    
    public boolean hasCell_id()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCell_id()
    {
	setComponentAbsent(3);
    }
    
    
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
	    "DL_InformationPerRL_r5"
	),
	new QName (
	    "InformationElements",
	    "DL-InformationPerRL-r5"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_InformationPerRL_r5$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_DPCH_InfoPerRL_r5"
			    ),
			    new QName (
				"InformationElements",
				"DL-DPCH-InfoPerRL-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_InfoPerRL_r5"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "dl-DPCH-InfoPerRL",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SCCPCH_InfoForFACH_r4"
			    ),
			    new QName (
				"InformationElements",
				"SCCPCH-InfoForFACH-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SCCPCH_InfoForFACH_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SCCPCH_InfoForFACH_r4"
				)
			    ),
			    0
			)
		    ),
		    "dummy",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "cell-id",
		    3,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' DL_InformationPerRL_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_InformationPerRL_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_InformationPerRL_r5
