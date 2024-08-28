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
 * Define the ASN1 Type DL_AM_RLC_Mode_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_AM_RLC_Mode_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_AM_RLC_Mode_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_AM_RLC_Mode_r7(Dl_RLC_PDU_size dl_RLC_PDU_size, 
		    BOOLEAN inSequenceDelivery, 
		    ReceivingWindowSize receivingWindowSize, 
		    DL_RLC_StatusInfo dl_RLC_StatusInfo)
    {
	setDl_RLC_PDU_size(dl_RLC_PDU_size);
	setInSequenceDelivery(inSequenceDelivery);
	setReceivingWindowSize(receivingWindowSize);
	setDl_RLC_StatusInfo(dl_RLC_StatusInfo);
    }
    
    /**
     * Construct with components.
     */
    public DL_AM_RLC_Mode_r7(Dl_RLC_PDU_size dl_RLC_PDU_size, 
		    boolean inSequenceDelivery, 
		    ReceivingWindowSize receivingWindowSize, 
		    DL_RLC_StatusInfo dl_RLC_StatusInfo)
    {
	this(dl_RLC_PDU_size, new BOOLEAN(inSequenceDelivery), 
	     receivingWindowSize, dl_RLC_StatusInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Dl_RLC_PDU_size();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = ReceivingWindowSize.rw1;
	mComponents[3] = new DL_RLC_StatusInfo();
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
		return new Dl_RLC_PDU_size();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return ReceivingWindowSize.rw1;
	    case 3:
		return new DL_RLC_StatusInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_RLC_PDU_size"
    public Dl_RLC_PDU_size getDl_RLC_PDU_size()
    {
	return (Dl_RLC_PDU_size)mComponents[0];
    }
    
    public void setDl_RLC_PDU_size(Dl_RLC_PDU_size dl_RLC_PDU_size)
    {
	mComponents[0] = dl_RLC_PDU_size;
    }
    
    
    
    /**
     * Define the ASN1 Type Dl_RLC_PDU_size from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Dl_RLC_PDU_size extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Dl_RLC_PDU_size()
	{
	}
	
	public static final  int  fixedSize_chosen = 1;
	public static final  int  flexibleSize_chosen = 2;
	
	// Methods for field "fixedSize"
	public static Dl_RLC_PDU_size createDl_RLC_PDU_sizeWithFixedSize(OctetModeRLC_SizeInfoType1 fixedSize)
	{
	    Dl_RLC_PDU_size __object = new Dl_RLC_PDU_size();

	    __object.setFixedSize(fixedSize);
	    return __object;
	}
	
	public boolean hasFixedSize()
	{
	    return getChosenFlag() == fixedSize_chosen;
	}
	
	public void setFixedSize(OctetModeRLC_SizeInfoType1 fixedSize)
	{
	    setChosenValue(fixedSize);
	    setChosenFlag(fixedSize_chosen);
	}
	
	
	// Methods for field "flexibleSize"
	public static Dl_RLC_PDU_size createDl_RLC_PDU_sizeWithFlexibleSize(FlexibleSize flexibleSize)
	{
	    Dl_RLC_PDU_size __object = new Dl_RLC_PDU_size();

	    __object.setFlexibleSize(flexibleSize);
	    return __object;
	}
	
	public boolean hasFlexibleSize()
	{
	    return getChosenFlag() == flexibleSize_chosen;
	}
	
	public void setFlexibleSize(FlexibleSize flexibleSize)
	{
	    setChosenValue(flexibleSize);
	    setChosenFlag(flexibleSize_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type FlexibleSize from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class FlexibleSize extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private FlexibleSize()
	    {
		super(cFirstNumber);
	    }
	    
	    protected FlexibleSize(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final FlexibleSize size7 =
		new FlexibleSize(0);
	    public static final FlexibleSize size15 =
		new FlexibleSize(1);
	    private final static FlexibleSize cNamedNumbers[] = {
		 size7, 
		 size15
	    };
	    protected final static long cFirstNumber = 0;
	    protected final static boolean cLinearNumbers = false;
	    
	    public Enumerated[] getNamedNumbers()
	    {
		return cNamedNumbers;
	    }
	    
	    public boolean hasLinearNumbers()
	    {
		return cLinearNumbers;
	    }
	    
	    public long getFirstNumber()
	    {
		return cFirstNumber;
	    }
	    
	    public static FlexibleSize valueOf(long value)
	    {
		return (FlexibleSize)size7.lookupValue(value);
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "DL_AM_RLC_Mode_r7$Dl_RLC_PDU_size$FlexibleSize"
		),
		new QName (
		    "builtin",
		    "ENUMERATED"
		),
		12314,
		null,
		new MemberList (
		    new MemberListElement[] {
			new MemberListElement (
			    "size7",
			    0
			),
			new MemberListElement (
			    "size15",
			    1
			)
		    }
		),
		0,
		size7
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' FlexibleSize object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' FlexibleSize object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for FlexibleSize

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fixedSize_chosen:
		    return new OctetModeRLC_SizeInfoType1();
		case flexibleSize_chosen:
		    return FlexibleSize.size7;
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
		"DL_AM_RLC_Mode_r7$Dl_RLC_PDU_size"
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
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "OctetModeRLC_SizeInfoType1"
				),
				new QName (
				    "InformationElements",
				    "OctetModeRLC-SizeInfoType1"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"OctetModeRLC_SizeInfoType1"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1),
					new TagDecoderElement((short)0x8002, 2)
				    }
				)
			    )
			),
			"fixedSize",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"DL_AM_RLC_Mode_r7$Dl_RLC_PDU_size$FlexibleSize"
			    )
			),
			"flexibleSize",
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
	 * Get the type descriptor (TypeInfo) of 'this' Dl_RLC_PDU_size object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dl_RLC_PDU_size object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dl_RLC_PDU_size

    // Methods for field "inSequenceDelivery"
    public boolean getInSequenceDelivery()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setInSequenceDelivery(boolean inSequenceDelivery)
    {
	setInSequenceDelivery(new BOOLEAN(inSequenceDelivery));
    }
    
    public void setInSequenceDelivery(BOOLEAN inSequenceDelivery)
    {
	mComponents[1] = inSequenceDelivery;
    }
    
    
    // Methods for field "receivingWindowSize"
    public ReceivingWindowSize getReceivingWindowSize()
    {
	return (ReceivingWindowSize)mComponents[2];
    }
    
    public void setReceivingWindowSize(ReceivingWindowSize receivingWindowSize)
    {
	mComponents[2] = receivingWindowSize;
    }
    
    
    // Methods for field "dl_RLC_StatusInfo"
    public DL_RLC_StatusInfo getDl_RLC_StatusInfo()
    {
	return (DL_RLC_StatusInfo)mComponents[3];
    }
    
    public void setDl_RLC_StatusInfo(DL_RLC_StatusInfo dl_RLC_StatusInfo)
    {
	mComponents[3] = dl_RLC_StatusInfo;
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
	    "DL_AM_RLC_Mode_r7"
	),
	new QName (
	    "InformationElements",
	    "DL-AM-RLC-Mode-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_AM_RLC_Mode_r7$Dl_RLC_PDU_size"
			)
		    ),
		    "dl-RLC-PDU-size",
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
		    "inSequenceDelivery",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReceivingWindowSize"
			    ),
			    new QName (
				"InformationElements",
				"ReceivingWindowSize"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"rw1",
					0
				    ),
				    new MemberListElement (
					"rw8",
					1
				    ),
				    new MemberListElement (
					"rw16",
					2
				    ),
				    new MemberListElement (
					"rw32",
					3
				    ),
				    new MemberListElement (
					"rw64",
					4
				    ),
				    new MemberListElement (
					"rw128",
					5
				    ),
				    new MemberListElement (
					"rw256",
					6
				    ),
				    new MemberListElement (
					"rw512",
					7
				    ),
				    new MemberListElement (
					"rw768",
					8
				    ),
				    new MemberListElement (
					"rw1024",
					9
				    ),
				    new MemberListElement (
					"rw1536",
					10
				    ),
				    new MemberListElement (
					"rw2047",
					11
				    ),
				    new MemberListElement (
					"rw2560",
					12
				    ),
				    new MemberListElement (
					"rw3072",
					13
				    ),
				    new MemberListElement (
					"rw3584",
					14
				    ),
				    new MemberListElement (
					"rw4095",
					15
				    )
				}
			    ),
			    0,
			    ReceivingWindowSize.rw1
			)
		    ),
		    "receivingWindowSize",
		    2,
		    2,
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
				"DL_RLC_StatusInfo"
			    ),
			    new QName (
				"InformationElements",
				"DL-RLC-StatusInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_RLC_StatusInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_RLC_StatusInfo"
				)
			    ),
			    0
			)
		    ),
		    "dl-RLC-StatusInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_AM_RLC_Mode_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_AM_RLC_Mode_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_AM_RLC_Mode_r7
