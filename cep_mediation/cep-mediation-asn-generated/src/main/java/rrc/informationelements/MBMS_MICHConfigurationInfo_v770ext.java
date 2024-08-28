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
 * Define the ASN1 Type MBMS_MICHConfigurationInfo_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_MICHConfigurationInfo_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_MICHConfigurationInfo_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_MICHConfigurationInfo_v770ext(Mode mode)
    {
	setMode(mode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Mode();
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
		return new Mode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mode"
    public Mode getMode()
    {
	return (Mode)mComponents[0];
    }
    
    public void setMode(Mode mode)
    {
	mComponents[0] = mode;
    }
    
    
    
    /**
     * Define the ASN1 Type Mode from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Mode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Mode()
	{
	}
	
	public static final  int  tdd384_chosen = 1;
	public static final  int  tdd768_chosen = 2;
	public static final  int  tdd128_chosen = 3;
	
	// Methods for field "tdd384"
	public static Mode createModeWithTdd384(Tdd384 tdd384)
	{
	    Mode __object = new Mode();

	    __object.setTdd384(tdd384);
	    return __object;
	}
	
	public boolean hasTdd384()
	{
	    return getChosenFlag() == tdd384_chosen;
	}
	
	public void setTdd384(Tdd384 tdd384)
	{
	    setChosenValue(tdd384);
	    setChosenFlag(tdd384_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd384 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd384 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd384()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd384(MidambleShiftAndBurstType_r7 midambleShiftAndBurstType)
	    {
		setMidambleShiftAndBurstType(midambleShiftAndBurstType);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MidambleShiftAndBurstType_r7();
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
			return new MidambleShiftAndBurstType_r7();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "midambleShiftAndBurstType"
	    public MidambleShiftAndBurstType_r7 getMidambleShiftAndBurstType()
	    {
		return (MidambleShiftAndBurstType_r7)mComponents[0];
	    }
	    
	    public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType_r7 midambleShiftAndBurstType)
	    {
		mComponents[0] = midambleShiftAndBurstType;
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
		    "MBMS_MICHConfigurationInfo_v770ext$Mode$Tdd384"
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
					"MidambleShiftAndBurstType_r7"
				    ),
				    new QName (
					"InformationElements",
					"MidambleShiftAndBurstType-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "MidambleShiftAndBurstType_r7"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "MidambleShiftAndBurstType_r7"
					)
				    ),
				    0
				)
			    ),
			    "midambleShiftAndBurstType",
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd384 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd384 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd384

	// Methods for field "tdd768"
	public static Mode createModeWithTdd768(Tdd768 tdd768)
	{
	    Mode __object = new Mode();

	    __object.setTdd768(tdd768);
	    return __object;
	}
	
	public boolean hasTdd768()
	{
	    return getChosenFlag() == tdd768_chosen;
	}
	
	public void setTdd768(Tdd768 tdd768)
	{
	    setChosenValue(tdd768);
	    setChosenFlag(tdd768_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd768 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd768 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd768()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd768(MidambleShiftAndBurstType_VHCR midambleShiftAndBurstType)
	    {
		setMidambleShiftAndBurstType(midambleShiftAndBurstType);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MidambleShiftAndBurstType_VHCR();
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
			return new MidambleShiftAndBurstType_VHCR();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "midambleShiftAndBurstType"
	    public MidambleShiftAndBurstType_VHCR getMidambleShiftAndBurstType()
	    {
		return (MidambleShiftAndBurstType_VHCR)mComponents[0];
	    }
	    
	    public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType_VHCR midambleShiftAndBurstType)
	    {
		mComponents[0] = midambleShiftAndBurstType;
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
		    "MBMS_MICHConfigurationInfo_v770ext$Mode$Tdd768"
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
					"MidambleShiftAndBurstType_VHCR"
				    ),
				    new QName (
					"InformationElements",
					"MidambleShiftAndBurstType-VHCR"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "MidambleShiftAndBurstType_VHCR"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "MidambleShiftAndBurstType_VHCR"
					)
				    ),
				    0
				)
			    ),
			    "midambleShiftAndBurstType",
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd768 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd768 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd768

	// Methods for field "tdd128"
	public static Mode createModeWithTdd128(Tdd128 tdd128)
	{
	    Mode __object = new Mode();

	    __object.setTdd128(tdd128);
	    return __object;
	}
	
	public boolean hasTdd128()
	{
	    return getChosenFlag() == tdd128_chosen;
	}
	
	public void setTdd128(Tdd128 tdd128)
	{
	    setChosenValue(tdd128);
	    setChosenFlag(tdd128_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd128 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd128 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd128()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd128(TimeSlotLCR_ext mbsfnSpecialTimeSlot)
	    {
		setMbsfnSpecialTimeSlot(mbsfnSpecialTimeSlot);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = TimeSlotLCR_ext.ts7;
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
			return TimeSlotLCR_ext.ts7;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "mbsfnSpecialTimeSlot"
	    public TimeSlotLCR_ext getMbsfnSpecialTimeSlot()
	    {
		return (TimeSlotLCR_ext)mComponents[0];
	    }
	    
	    public void setMbsfnSpecialTimeSlot(TimeSlotLCR_ext mbsfnSpecialTimeSlot)
	    {
		mComponents[0] = mbsfnSpecialTimeSlot;
	    }
	    
	    public boolean hasMbsfnSpecialTimeSlot()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteMbsfnSpecialTimeSlot()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "MBMS_MICHConfigurationInfo_v770ext$Mode$Tdd128"
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
					"TimeSlotLCR_ext"
				    ),
				    new QName (
					"InformationElements",
					"TimeSlotLCR-ext"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"ts7",
						0
					    ),
					    new MemberListElement (
						"spare3",
						1
					    ),
					    new MemberListElement (
						"spare2",
						2
					    ),
					    new MemberListElement (
						"spare1",
						3
					    )
					}
				    ),
				    0,
				    TimeSlotLCR_ext.ts7
				)
			    ),
			    "mbsfnSpecialTimeSlot",
			    0,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Tdd128 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd128 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd128

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case tdd384_chosen:
		    return new Tdd384();
		case tdd768_chosen:
		    return new Tdd768();
		case tdd128_chosen:
		    return new Tdd128();
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
		"MBMS_MICHConfigurationInfo_v770ext$Mode"
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
				"MBMS_MICHConfigurationInfo_v770ext$Mode$Tdd384"
			    )
			),
			"tdd384",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"MBMS_MICHConfigurationInfo_v770ext$Mode$Tdd768"
			    )
			),
			"tdd768",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"MBMS_MICHConfigurationInfo_v770ext$Mode$Tdd128"
			    )
			),
			"tdd128",
			2,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mode

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
	    "MBMS_MICHConfigurationInfo_v770ext"
	),
	new QName (
	    "InformationElements",
	    "MBMS-MICHConfigurationInfo-v770ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_MICHConfigurationInfo_v770ext$Mode"
			)
		    ),
		    "mode",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_MICHConfigurationInfo_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_MICHConfigurationInfo_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_MICHConfigurationInfo_v770ext
