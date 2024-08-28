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
 * Define the ASN1 Type UL_TransChCapability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_TransChCapability extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_TransChCapability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_TransChCapability(MaxNoBits maxNoBitsTransmitted, 
		    MaxNoBits maxConvCodeBitsTransmitted, 
		    TurboSupport turboEncodingSupport, 
		    MaxSimultaneousTransChsUL maxSimultaneousTransChs, 
		    ModeSpecificInfo modeSpecificInfo, 
		    MaxTransportBlocksUL maxTransmittedBlocks, 
		    MaxNumberOfTFC_UL maxNumberOfTFC, 
		    MaxNumberOfTF maxNumberOfTF)
    {
	setMaxNoBitsTransmitted(maxNoBitsTransmitted);
	setMaxConvCodeBitsTransmitted(maxConvCodeBitsTransmitted);
	setTurboEncodingSupport(turboEncodingSupport);
	setMaxSimultaneousTransChs(maxSimultaneousTransChs);
	setModeSpecificInfo(modeSpecificInfo);
	setMaxTransmittedBlocks(maxTransmittedBlocks);
	setMaxNumberOfTFC(maxNumberOfTFC);
	setMaxNumberOfTF(maxNumberOfTF);
    }
    
    public void initComponents()
    {
	mComponents[0] = MaxNoBits.b640;
	mComponents[1] = MaxNoBits.b640;
	mComponents[2] = new TurboSupport();
	mComponents[3] = MaxSimultaneousTransChsUL.dummy;
	mComponents[4] = new ModeSpecificInfo();
	mComponents[5] = MaxTransportBlocksUL.dummy;
	mComponents[6] = MaxNumberOfTFC_UL.dummy1;
	mComponents[7] = MaxNumberOfTF.tf32;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return MaxNoBits.b640;
	    case 1:
		return MaxNoBits.b640;
	    case 2:
		return new TurboSupport();
	    case 3:
		return MaxSimultaneousTransChsUL.dummy;
	    case 4:
		return new ModeSpecificInfo();
	    case 5:
		return MaxTransportBlocksUL.dummy;
	    case 6:
		return MaxNumberOfTFC_UL.dummy1;
	    case 7:
		return MaxNumberOfTF.tf32;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxNoBitsTransmitted"
    public MaxNoBits getMaxNoBitsTransmitted()
    {
	return (MaxNoBits)mComponents[0];
    }
    
    public void setMaxNoBitsTransmitted(MaxNoBits maxNoBitsTransmitted)
    {
	mComponents[0] = maxNoBitsTransmitted;
    }
    
    
    // Methods for field "maxConvCodeBitsTransmitted"
    public MaxNoBits getMaxConvCodeBitsTransmitted()
    {
	return (MaxNoBits)mComponents[1];
    }
    
    public void setMaxConvCodeBitsTransmitted(MaxNoBits maxConvCodeBitsTransmitted)
    {
	mComponents[1] = maxConvCodeBitsTransmitted;
    }
    
    
    // Methods for field "turboEncodingSupport"
    public TurboSupport getTurboEncodingSupport()
    {
	return (TurboSupport)mComponents[2];
    }
    
    public void setTurboEncodingSupport(TurboSupport turboEncodingSupport)
    {
	mComponents[2] = turboEncodingSupport;
    }
    
    
    // Methods for field "maxSimultaneousTransChs"
    public MaxSimultaneousTransChsUL getMaxSimultaneousTransChs()
    {
	return (MaxSimultaneousTransChsUL)mComponents[3];
    }
    
    public void setMaxSimultaneousTransChs(MaxSimultaneousTransChsUL maxSimultaneousTransChs)
    {
	mComponents[3] = maxSimultaneousTransChs;
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[4];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[4] = modeSpecificInfo;
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
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Null fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Null fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
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
	    public Tdd(MaxSimultaneousCCTrCH_Count maxSimultaneousCCTrCH_Count)
	    {
		setMaxSimultaneousCCTrCH_Count(maxSimultaneousCCTrCH_Count);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MaxSimultaneousCCTrCH_Count();
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
			return new MaxSimultaneousCCTrCH_Count();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "maxSimultaneousCCTrCH_Count"
	    public MaxSimultaneousCCTrCH_Count getMaxSimultaneousCCTrCH_Count()
	    {
		return (MaxSimultaneousCCTrCH_Count)mComponents[0];
	    }
	    
	    public void setMaxSimultaneousCCTrCH_Count(MaxSimultaneousCCTrCH_Count maxSimultaneousCCTrCH_Count)
	    {
		mComponents[0] = maxSimultaneousCCTrCH_Count;
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
		    "UL_TransChCapability$ModeSpecificInfo$Tdd"
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
					"MaxSimultaneousCCTrCH_Count"
				    ),
				    new QName (
					"InformationElements",
					"MaxSimultaneousCCTrCH-Count"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new MaxSimultaneousCCTrCH_Count(1), 
					    new MaxSimultaneousCCTrCH_Count(8),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(8)
				    ),
				    null
				)
			    ),
			    "maxSimultaneousCCTrCH-Count",
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
		    return new Null();
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UL_TransChCapability$ModeSpecificInfo"
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
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
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
				"UL_TransChCapability$ModeSpecificInfo$Tdd"
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

    // Methods for field "maxTransmittedBlocks"
    public MaxTransportBlocksUL getMaxTransmittedBlocks()
    {
	return (MaxTransportBlocksUL)mComponents[5];
    }
    
    public void setMaxTransmittedBlocks(MaxTransportBlocksUL maxTransmittedBlocks)
    {
	mComponents[5] = maxTransmittedBlocks;
    }
    
    
    // Methods for field "maxNumberOfTFC"
    public MaxNumberOfTFC_UL getMaxNumberOfTFC()
    {
	return (MaxNumberOfTFC_UL)mComponents[6];
    }
    
    public void setMaxNumberOfTFC(MaxNumberOfTFC_UL maxNumberOfTFC)
    {
	mComponents[6] = maxNumberOfTFC;
    }
    
    
    // Methods for field "maxNumberOfTF"
    public MaxNumberOfTF getMaxNumberOfTF()
    {
	return (MaxNumberOfTF)mComponents[7];
    }
    
    public void setMaxNumberOfTF(MaxNumberOfTF maxNumberOfTF)
    {
	mComponents[7] = maxNumberOfTF;
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
	    "UL_TransChCapability"
	),
	new QName (
	    "InformationElements",
	    "UL-TransChCapability"
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
				"MaxNoBits"
			    ),
			    new QName (
				"InformationElements",
				"MaxNoBits"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"b640",
					0
				    ),
				    new MemberListElement (
					"b1280",
					1
				    ),
				    new MemberListElement (
					"b2560",
					2
				    ),
				    new MemberListElement (
					"b3840",
					3
				    ),
				    new MemberListElement (
					"b5120",
					4
				    ),
				    new MemberListElement (
					"b6400",
					5
				    ),
				    new MemberListElement (
					"b7680",
					6
				    ),
				    new MemberListElement (
					"b8960",
					7
				    ),
				    new MemberListElement (
					"b10240",
					8
				    ),
				    new MemberListElement (
					"b20480",
					9
				    ),
				    new MemberListElement (
					"b40960",
					10
				    ),
				    new MemberListElement (
					"b81920",
					11
				    ),
				    new MemberListElement (
					"b163840",
					12
				    )
				}
			    ),
			    0,
			    MaxNoBits.b640
			)
		    ),
		    "maxNoBitsTransmitted",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNoBits"
			    ),
			    new QName (
				"InformationElements",
				"MaxNoBits"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"b640",
					0
				    ),
				    new MemberListElement (
					"b1280",
					1
				    ),
				    new MemberListElement (
					"b2560",
					2
				    ),
				    new MemberListElement (
					"b3840",
					3
				    ),
				    new MemberListElement (
					"b5120",
					4
				    ),
				    new MemberListElement (
					"b6400",
					5
				    ),
				    new MemberListElement (
					"b7680",
					6
				    ),
				    new MemberListElement (
					"b8960",
					7
				    ),
				    new MemberListElement (
					"b10240",
					8
				    ),
				    new MemberListElement (
					"b20480",
					9
				    ),
				    new MemberListElement (
					"b40960",
					10
				    ),
				    new MemberListElement (
					"b81920",
					11
				    ),
				    new MemberListElement (
					"b163840",
					12
				    )
				}
			    ),
			    0,
			    MaxNoBits.b640
			)
		    ),
		    "maxConvCodeBitsTransmitted",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TurboSupport"
			    ),
			    new QName (
				"InformationElements",
				"TurboSupport"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TurboSupport"
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
		    "turboEncodingSupport",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxSimultaneousTransChsUL"
			    ),
			    new QName (
				"InformationElements",
				"MaxSimultaneousTransChsUL"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dummy",
					0
				    ),
				    new MemberListElement (
					"e4",
					1
				    ),
				    new MemberListElement (
					"e8",
					2
				    ),
				    new MemberListElement (
					"e16",
					3
				    ),
				    new MemberListElement (
					"e32",
					4
				    )
				}
			    ),
			    0,
			    MaxSimultaneousTransChsUL.dummy
			)
		    ),
		    "maxSimultaneousTransChs",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_TransChCapability$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxTransportBlocksUL"
			    ),
			    new QName (
				"InformationElements",
				"MaxTransportBlocksUL"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dummy",
					0
				    ),
				    new MemberListElement (
					"tb4",
					1
				    ),
				    new MemberListElement (
					"tb8",
					2
				    ),
				    new MemberListElement (
					"tb16",
					3
				    ),
				    new MemberListElement (
					"tb32",
					4
				    ),
				    new MemberListElement (
					"tb48",
					5
				    ),
				    new MemberListElement (
					"tb64",
					6
				    ),
				    new MemberListElement (
					"tb96",
					7
				    ),
				    new MemberListElement (
					"tb128",
					8
				    ),
				    new MemberListElement (
					"tb256",
					9
				    ),
				    new MemberListElement (
					"tb512",
					10
				    )
				}
			    ),
			    0,
			    MaxTransportBlocksUL.dummy
			)
		    ),
		    "maxTransmittedBlocks",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfTFC_UL"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfTFC-UL"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dummy1",
					0
				    ),
				    new MemberListElement (
					"dummy2",
					1
				    ),
				    new MemberListElement (
					"tfc16",
					2
				    ),
				    new MemberListElement (
					"tfc32",
					3
				    ),
				    new MemberListElement (
					"tfc48",
					4
				    ),
				    new MemberListElement (
					"tfc64",
					5
				    ),
				    new MemberListElement (
					"tfc96",
					6
				    ),
				    new MemberListElement (
					"tfc128",
					7
				    ),
				    new MemberListElement (
					"tfc256",
					8
				    ),
				    new MemberListElement (
					"tfc512",
					9
				    ),
				    new MemberListElement (
					"tfc1024",
					10
				    )
				}
			    ),
			    0,
			    MaxNumberOfTFC_UL.dummy1
			)
		    ),
		    "maxNumberOfTFC",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfTF"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfTF"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tf32",
					0
				    ),
				    new MemberListElement (
					"tf64",
					1
				    ),
				    new MemberListElement (
					"tf128",
					2
				    ),
				    new MemberListElement (
					"tf256",
					3
				    ),
				    new MemberListElement (
					"tf512",
					4
				    ),
				    new MemberListElement (
					"tf1024",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfTF.tf32
			)
		    ),
		    "maxNumberOfTF",
		    7,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_TransChCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TransChCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TransChCapability
