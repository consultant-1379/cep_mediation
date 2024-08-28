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
 * Define the ASN1 Type E_AGCH_DRX_Info_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_AGCH_DRX_Info_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_AGCH_DRX_Info_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_AGCH_DRX_Info_TDD128(E_AGCH_DRX_InfoType e_AGCH_DRX_InfoType)
    {
	setE_AGCH_DRX_InfoType(e_AGCH_DRX_InfoType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_AGCH_DRX_InfoType();
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
		return new E_AGCH_DRX_InfoType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_AGCH_DRX_InfoType"
    public E_AGCH_DRX_InfoType getE_AGCH_DRX_InfoType()
    {
	return (E_AGCH_DRX_InfoType)mComponents[0];
    }
    
    public void setE_AGCH_DRX_InfoType(E_AGCH_DRX_InfoType e_AGCH_DRX_InfoType)
    {
	mComponents[0] = e_AGCH_DRX_InfoType;
    }
    
    
    
    /**
     * Define the ASN1 Type E_AGCH_DRX_InfoType from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class E_AGCH_DRX_InfoType extends Choice {
	
	/**
	 * The default constructor.
	 */
	public E_AGCH_DRX_InfoType()
	{
	}
	
	public static final  int  sameAsHS_SCCH_chosen = 1;
	public static final  int  e_AGCH_DRX_Parameters_chosen = 2;
	
	// Methods for field "sameAsHS_SCCH"
	public static E_AGCH_DRX_InfoType createE_AGCH_DRX_InfoTypeWithSameAsHS_SCCH(Null sameAsHS_SCCH)
	{
	    E_AGCH_DRX_InfoType __object = new E_AGCH_DRX_InfoType();

	    __object.setSameAsHS_SCCH(sameAsHS_SCCH);
	    return __object;
	}
	
	public boolean hasSameAsHS_SCCH()
	{
	    return getChosenFlag() == sameAsHS_SCCH_chosen;
	}
	
	public void setSameAsHS_SCCH(Null sameAsHS_SCCH)
	{
	    setChosenValue(sameAsHS_SCCH);
	    setChosenFlag(sameAsHS_SCCH_chosen);
	}
	
	
	// Methods for field "e_AGCH_DRX_Parameters"
	public static E_AGCH_DRX_InfoType createE_AGCH_DRX_InfoTypeWithE_AGCH_DRX_Parameters(E_AGCH_DRX_Parameters e_AGCH_DRX_Parameters)
	{
	    E_AGCH_DRX_InfoType __object = new E_AGCH_DRX_InfoType();

	    __object.setE_AGCH_DRX_Parameters(e_AGCH_DRX_Parameters);
	    return __object;
	}
	
	public boolean hasE_AGCH_DRX_Parameters()
	{
	    return getChosenFlag() == e_AGCH_DRX_Parameters_chosen;
	}
	
	public void setE_AGCH_DRX_Parameters(E_AGCH_DRX_Parameters e_AGCH_DRX_Parameters)
	{
	    setChosenValue(e_AGCH_DRX_Parameters);
	    setChosenFlag(e_AGCH_DRX_Parameters_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type E_AGCH_DRX_Parameters from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class E_AGCH_DRX_Parameters extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public E_AGCH_DRX_Parameters()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public E_AGCH_DRX_Parameters(ControlChannelDRXCycle_TDD128 e_AGCH_DRX_Cycle, 
			    E_AGCH_InactivityMonitorThreshold_TDD128 e_AGCH_InactivityMonitorThreshold, 
			    INTEGER e_AGCH_DRX_Offset)
	    {
		setE_AGCH_DRX_Cycle(e_AGCH_DRX_Cycle);
		setE_AGCH_InactivityMonitorThreshold(e_AGCH_InactivityMonitorThreshold);
		setE_AGCH_DRX_Offset(e_AGCH_DRX_Offset);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public E_AGCH_DRX_Parameters(ControlChannelDRXCycle_TDD128 e_AGCH_DRX_Cycle, 
			    E_AGCH_InactivityMonitorThreshold_TDD128 e_AGCH_InactivityMonitorThreshold, 
			    long e_AGCH_DRX_Offset)
	    {
		this(e_AGCH_DRX_Cycle, e_AGCH_InactivityMonitorThreshold, 
		     new INTEGER(e_AGCH_DRX_Offset));
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public E_AGCH_DRX_Parameters(ControlChannelDRXCycle_TDD128 e_AGCH_DRX_Cycle, 
			    long e_AGCH_DRX_Offset)
	    {
		setE_AGCH_DRX_Cycle(e_AGCH_DRX_Cycle);
		setE_AGCH_DRX_Offset(e_AGCH_DRX_Offset);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = ControlChannelDRXCycle_TDD128.sub_frames_1;
		mComponents[1] = E_AGCH_InactivityMonitorThreshold_TDD128.radio_frames_0;
		mComponents[2] = new INTEGER();
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
			return ControlChannelDRXCycle_TDD128.sub_frames_1;
		    case 1:
			return E_AGCH_InactivityMonitorThreshold_TDD128.radio_frames_0;
		    case 2:
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "e_AGCH_DRX_Cycle"
	    public ControlChannelDRXCycle_TDD128 getE_AGCH_DRX_Cycle()
	    {
		return (ControlChannelDRXCycle_TDD128)mComponents[0];
	    }
	    
	    public void setE_AGCH_DRX_Cycle(ControlChannelDRXCycle_TDD128 e_AGCH_DRX_Cycle)
	    {
		mComponents[0] = e_AGCH_DRX_Cycle;
	    }
	    
	    
	    // Methods for field "e_AGCH_InactivityMonitorThreshold"
	    public E_AGCH_InactivityMonitorThreshold_TDD128 getE_AGCH_InactivityMonitorThreshold()
	    {
		return (E_AGCH_InactivityMonitorThreshold_TDD128)mComponents[1];
	    }
	    
	    public void setE_AGCH_InactivityMonitorThreshold(E_AGCH_InactivityMonitorThreshold_TDD128 e_AGCH_InactivityMonitorThreshold)
	    {
		mComponents[1] = e_AGCH_InactivityMonitorThreshold;
	    }
	    
	    public boolean hasE_AGCH_InactivityMonitorThreshold()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteE_AGCH_InactivityMonitorThreshold()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "e_AGCH_DRX_Offset"
	    public long getE_AGCH_DRX_Offset()
	    {
		return ((INTEGER)mComponents[2]).longValue();
	    }
	    
	    public void setE_AGCH_DRX_Offset(long e_AGCH_DRX_Offset)
	    {
		setE_AGCH_DRX_Offset(new INTEGER(e_AGCH_DRX_Offset));
	    }
	    
	    public void setE_AGCH_DRX_Offset(INTEGER e_AGCH_DRX_Offset)
	    {
		mComponents[2] = e_AGCH_DRX_Offset;
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
		    "E_AGCH_DRX_Info_TDD128$E_AGCH_DRX_InfoType$E_AGCH_DRX_Parameters"
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
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"ControlChannelDRXCycle_TDD128"
				    ),
				    new QName (
					"InformationElements",
					"ControlChannelDRXCycle-TDD128"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"sub-frames-1",
						0
					    ),
					    new MemberListElement (
						"sub-frames-2",
						1
					    ),
					    new MemberListElement (
						"sub-frames-4",
						2
					    ),
					    new MemberListElement (
						"sub-frames-8",
						3
					    ),
					    new MemberListElement (
						"sub-frames-16",
						4
					    ),
					    new MemberListElement (
						"sub-frames-32",
						5
					    ),
					    new MemberListElement (
						"sub-frames-64",
						6
					    ),
					    new MemberListElement (
						"spare1",
						7
					    )
					}
				    ),
				    0,
				    ControlChannelDRXCycle_TDD128.sub_frames_1
				)
			    ),
			    "e-AGCH-DRX-Cycle",
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
					"E_AGCH_InactivityMonitorThreshold_TDD128"
				    ),
				    new QName (
					"InformationElements",
					"E-AGCH-InactivityMonitorThreshold-TDD128"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"radio-frames-0",
						0
					    ),
					    new MemberListElement (
						"radio-frames-1",
						1
					    ),
					    new MemberListElement (
						"radio-frames-2",
						2
					    ),
					    new MemberListElement (
						"radio-frames-4",
						3
					    ),
					    new MemberListElement (
						"radio-frames-8",
						4
					    ),
					    new MemberListElement (
						"radio-frames-16",
						5
					    ),
					    new MemberListElement (
						"radio-frames-32",
						6
					    ),
					    new MemberListElement (
						"radio-frames-64",
						7
					    ),
					    new MemberListElement (
						"radio-frames-128",
						8
					    ),
					    new MemberListElement (
						"radio-frames-256",
						9
					    ),
					    new MemberListElement (
						"radio-frames-512",
						10
					    ),
					    new MemberListElement (
						"spare5",
						11
					    ),
					    new MemberListElement (
						"spare4",
						12
					    ),
					    new MemberListElement (
						"spare3",
						13
					    ),
					    new MemberListElement (
						"spare2",
						14
					    ),
					    new MemberListElement (
						"infinity",
						15
					    )
					}
				    ),
				    0,
				    E_AGCH_InactivityMonitorThreshold_TDD128.radio_frames_0
				)
			    ),
			    "e-AGCH-InactivityMonitorThreshold",
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
					"com.oss.asn1",
					"INTEGER"
				    ),
				    new QName (
					"builtin",
					"INTEGER"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(0), 
					    new com.oss.asn1.INTEGER(63),
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
			    "e-AGCH-DRX-Offset",
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
	     * Get the type descriptor (TypeInfo) of 'this' E_AGCH_DRX_Parameters object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' E_AGCH_DRX_Parameters object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for E_AGCH_DRX_Parameters

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case sameAsHS_SCCH_chosen:
		    return new Null();
		case e_AGCH_DRX_Parameters_chosen:
		    return new E_AGCH_DRX_Parameters();
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
		"E_AGCH_DRX_Info_TDD128$E_AGCH_DRX_InfoType"
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
			"sameAsHS-SCCH",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"E_AGCH_DRX_Info_TDD128$E_AGCH_DRX_InfoType$E_AGCH_DRX_Parameters"
			    )
			),
			"e-AGCH-DRX-Parameters",
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
	 * Get the type descriptor (TypeInfo) of 'this' E_AGCH_DRX_InfoType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' E_AGCH_DRX_InfoType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for E_AGCH_DRX_InfoType

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
	    "E_AGCH_DRX_Info_TDD128"
	),
	new QName (
	    "InformationElements",
	    "E-AGCH-DRX-Info-TDD128"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_AGCH_DRX_Info_TDD128$E_AGCH_DRX_InfoType"
			)
		    ),
		    "e-AGCH-DRX-InfoType",
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
     * Get the type descriptor (TypeInfo) of 'this' E_AGCH_DRX_Info_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_AGCH_DRX_Info_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_AGCH_DRX_Info_TDD128
