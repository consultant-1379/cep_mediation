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
 * Define the ASN1 Type E_PUCH_TS_Slots from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_PUCH_TS_Slots extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_PUCH_TS_Slots()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_PUCH_TS_Slots(INTEGER ts_Number, 
		    MidambleShiftAndBurstType_EDCH midambleShiftAndBurstType)
    {
	setTs_Number(ts_Number);
	setMidambleShiftAndBurstType(midambleShiftAndBurstType);
    }
    
    /**
     * Construct with components.
     */
    public E_PUCH_TS_Slots(long ts_Number, 
		    MidambleShiftAndBurstType_EDCH midambleShiftAndBurstType)
    {
	this(new INTEGER(ts_Number), midambleShiftAndBurstType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new MidambleShiftAndBurstType_EDCH();
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
		return new INTEGER();
	    case 1:
		return new MidambleShiftAndBurstType_EDCH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ts_Number"
    public long getTs_Number()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setTs_Number(long ts_Number)
    {
	setTs_Number(new INTEGER(ts_Number));
    }
    
    public void setTs_Number(INTEGER ts_Number)
    {
	mComponents[0] = ts_Number;
    }
    
    
    // Methods for field "midambleShiftAndBurstType"
    public MidambleShiftAndBurstType_EDCH getMidambleShiftAndBurstType()
    {
	return (MidambleShiftAndBurstType_EDCH)mComponents[1];
    }
    
    public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType_EDCH midambleShiftAndBurstType)
    {
	mComponents[1] = midambleShiftAndBurstType;
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
	    "E_PUCH_TS_Slots"
	),
	new QName (
	    "InformationElements",
	    "E-PUCH-TS-Slots"
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
				    new com.oss.asn1.INTEGER(14),
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
		    "ts-Number",
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
				"MidambleShiftAndBurstType_EDCH"
			    ),
			    new QName (
				"InformationElements",
				"MidambleShiftAndBurstType-EDCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_EDCH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_EDCH"
				)
			    ),
			    0
			)
		    ),
		    "midambleShiftAndBurstType",
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
     * Get the type descriptor (TypeInfo) of 'this' E_PUCH_TS_Slots object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_PUCH_TS_Slots object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_PUCH_TS_Slots
