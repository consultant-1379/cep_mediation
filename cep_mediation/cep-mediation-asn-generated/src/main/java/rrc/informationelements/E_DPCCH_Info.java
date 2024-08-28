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
 * Define the ASN1 Type E_DPCCH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DPCCH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DPCCH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DPCCH_Info(E_DPCCH_DPCCH_PowerOffset e_DPCCH_DPCCH_PowerOffset, 
		    HappyBit_DelayCondition happyBit_DelayCondition)
    {
	setE_DPCCH_DPCCH_PowerOffset(e_DPCCH_DPCCH_PowerOffset);
	setHappyBit_DelayCondition(happyBit_DelayCondition);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_DPCCH_DPCCH_PowerOffset();
	mComponents[1] = HappyBit_DelayCondition.ms2;
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
		return new E_DPCCH_DPCCH_PowerOffset();
	    case 1:
		return HappyBit_DelayCondition.ms2;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_DPCCH_DPCCH_PowerOffset"
    public E_DPCCH_DPCCH_PowerOffset getE_DPCCH_DPCCH_PowerOffset()
    {
	return (E_DPCCH_DPCCH_PowerOffset)mComponents[0];
    }
    
    public void setE_DPCCH_DPCCH_PowerOffset(E_DPCCH_DPCCH_PowerOffset e_DPCCH_DPCCH_PowerOffset)
    {
	mComponents[0] = e_DPCCH_DPCCH_PowerOffset;
    }
    
    
    // Methods for field "happyBit_DelayCondition"
    public HappyBit_DelayCondition getHappyBit_DelayCondition()
    {
	return (HappyBit_DelayCondition)mComponents[1];
    }
    
    public void setHappyBit_DelayCondition(HappyBit_DelayCondition happyBit_DelayCondition)
    {
	mComponents[1] = happyBit_DelayCondition;
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
	    "E_DPCCH_Info"
	),
	new QName (
	    "InformationElements",
	    "E-DPCCH-Info"
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
				"E_DPCCH_DPCCH_PowerOffset"
			    ),
			    new QName (
				"InformationElements",
				"E-DPCCH-DPCCH-PowerOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DPCCH_DPCCH_PowerOffset(0), 
				    new E_DPCCH_DPCCH_PowerOffset(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "e-DPCCH-DPCCH-PowerOffset",
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
				"HappyBit_DelayCondition"
			    ),
			    new QName (
				"InformationElements",
				"HappyBit-DelayCondition"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms2",
					0
				    ),
				    new MemberListElement (
					"ms10",
					1
				    ),
				    new MemberListElement (
					"ms20",
					2
				    ),
				    new MemberListElement (
					"ms50",
					3
				    ),
				    new MemberListElement (
					"ms100",
					4
				    ),
				    new MemberListElement (
					"ms200",
					5
				    ),
				    new MemberListElement (
					"ms500",
					6
				    ),
				    new MemberListElement (
					"ms1000",
					7
				    )
				}
			    ),
			    0,
			    HappyBit_DelayCondition.ms2
			)
		    ),
		    "happyBit-DelayCondition",
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
     * Get the type descriptor (TypeInfo) of 'this' E_DPCCH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DPCCH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DPCCH_Info
