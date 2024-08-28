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
 * Define the ASN1 Type SCCPCH_InfoForFACH from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SCCPCH_InfoForFACH extends Sequence {
    
    /**
     * The default constructor.
     */
    public SCCPCH_InfoForFACH()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SCCPCH_InfoForFACH(SecondaryCCPCH_Info secondaryCCPCH_Info, 
		    TFCS tfcs, ModeSpecificInfo modeSpecificInfo)
    {
	setSecondaryCCPCH_Info(secondaryCCPCH_Info);
	setTfcs(tfcs);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondaryCCPCH_Info();
	mComponents[1] = new TFCS();
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
		return new SecondaryCCPCH_Info();
	    case 1:
		return new TFCS();
	    case 2:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondaryCCPCH_Info"
    public SecondaryCCPCH_Info getSecondaryCCPCH_Info()
    {
	return (SecondaryCCPCH_Info)mComponents[0];
    }
    
    public void setSecondaryCCPCH_Info(SecondaryCCPCH_Info secondaryCCPCH_Info)
    {
	mComponents[0] = secondaryCCPCH_Info;
    }
    
    
    // Methods for field "tfcs"
    public TFCS getTfcs()
    {
	return (TFCS)mComponents[1];
    }
    
    public void setTfcs(TFCS tfcs)
    {
	mComponents[1] = tfcs;
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
	    public Fdd(FACH_PCH_InformationList fach_PCH_InformationList, 
			    SIB_ReferenceListFACH sib_ReferenceListFACH)
	    {
		setFach_PCH_InformationList(fach_PCH_InformationList);
		setSib_ReferenceListFACH(sib_ReferenceListFACH);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new FACH_PCH_InformationList();
		mComponents[1] = new SIB_ReferenceListFACH();
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
			return new FACH_PCH_InformationList();
		    case 1:
			return new SIB_ReferenceListFACH();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "fach_PCH_InformationList"
	    public FACH_PCH_InformationList getFach_PCH_InformationList()
	    {
		return (FACH_PCH_InformationList)mComponents[0];
	    }
	    
	    public void setFach_PCH_InformationList(FACH_PCH_InformationList fach_PCH_InformationList)
	    {
		mComponents[0] = fach_PCH_InformationList;
	    }
	    
	    
	    // Methods for field "sib_ReferenceListFACH"
	    public SIB_ReferenceListFACH getSib_ReferenceListFACH()
	    {
		return (SIB_ReferenceListFACH)mComponents[1];
	    }
	    
	    public void setSib_ReferenceListFACH(SIB_ReferenceListFACH sib_ReferenceListFACH)
	    {
		mComponents[1] = sib_ReferenceListFACH;
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
		    "SCCPCH_InfoForFACH$ModeSpecificInfo$Fdd"
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
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"FACH_PCH_InformationList"
				    ),
				    new QName (
					"InformationElements",
					"FACH-PCH-InformationList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(8)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "FACH_PCH_Information"
					)
				    )
				)
			    ),
			    "fach-PCH-InformationList",
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
					"SIB_ReferenceListFACH"
				    ),
				    new QName (
					"InformationElements",
					"SIB-ReferenceListFACH"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(8)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "SchedulingInformationSIB"
					)
				    )
				)
			    ),
			    "sib-ReferenceListFACH",
			    1,
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
	    public Tdd(FACH_PCH_InformationList fach_PCH_InformationList)
	    {
		setFach_PCH_InformationList(fach_PCH_InformationList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new FACH_PCH_InformationList();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[1];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new FACH_PCH_InformationList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "fach_PCH_InformationList"
	    public FACH_PCH_InformationList getFach_PCH_InformationList()
	    {
		return (FACH_PCH_InformationList)mComponents[0];
	    }
	    
	    public void setFach_PCH_InformationList(FACH_PCH_InformationList fach_PCH_InformationList)
	    {
		mComponents[0] = fach_PCH_InformationList;
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
		    "SCCPCH_InfoForFACH$ModeSpecificInfo$Tdd"
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
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"FACH_PCH_InformationList"
				    ),
				    new QName (
					"InformationElements",
					"FACH-PCH-InformationList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(8)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "FACH_PCH_Information"
					)
				    )
				)
			    ),
			    "fach-PCH-InformationList",
			    0,
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
		"SCCPCH_InfoForFACH$ModeSpecificInfo"
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
				"SCCPCH_InfoForFACH$ModeSpecificInfo$Fdd"
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
				"SCCPCH_InfoForFACH$ModeSpecificInfo$Tdd"
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
	    "SCCPCH_InfoForFACH"
	),
	new QName (
	    "InformationElements",
	    "SCCPCH-InfoForFACH"
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
				"SecondaryCCPCH_Info"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryCCPCH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCH_Info"
				)
			    ),
			    0
			)
		    ),
		    "secondaryCCPCH-Info",
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
				"TFCS"
			    ),
			    new QName (
				"InformationElements",
				"TFCS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS"
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
		    "tfcs",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SCCPCH_InfoForFACH$ModeSpecificInfo"
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
     * Get the type descriptor (TypeInfo) of 'this' SCCPCH_InfoForFACH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SCCPCH_InfoForFACH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SCCPCH_InfoForFACH
