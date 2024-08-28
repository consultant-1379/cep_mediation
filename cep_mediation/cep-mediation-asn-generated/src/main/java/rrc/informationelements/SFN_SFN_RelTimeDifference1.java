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
 * Define the ASN1 Type SFN_SFN_RelTimeDifference1 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SFN_SFN_RelTimeDifference1 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SFN_SFN_RelTimeDifference1()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SFN_SFN_RelTimeDifference1(INTEGER sfn_Offset, 
		    INTEGER sfn_sfn_Reltimedifference)
    {
	setSfn_Offset(sfn_Offset);
	setSfn_sfn_Reltimedifference(sfn_sfn_Reltimedifference);
    }
    
    /**
     * Construct with components.
     */
    public SFN_SFN_RelTimeDifference1(long sfn_Offset, 
		    long sfn_sfn_Reltimedifference)
    {
	this(new INTEGER(sfn_Offset), 
	     new INTEGER(sfn_sfn_Reltimedifference));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
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
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sfn_Offset"
    public long getSfn_Offset()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSfn_Offset(long sfn_Offset)
    {
	setSfn_Offset(new INTEGER(sfn_Offset));
    }
    
    public void setSfn_Offset(INTEGER sfn_Offset)
    {
	mComponents[0] = sfn_Offset;
    }
    
    
    // Methods for field "sfn_sfn_Reltimedifference"
    public long getSfn_sfn_Reltimedifference()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setSfn_sfn_Reltimedifference(long sfn_sfn_Reltimedifference)
    {
	setSfn_sfn_Reltimedifference(new INTEGER(sfn_sfn_Reltimedifference));
    }
    
    public void setSfn_sfn_Reltimedifference(INTEGER sfn_sfn_Reltimedifference)
    {
	mComponents[1] = sfn_sfn_Reltimedifference;
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
	    "SFN_SFN_RelTimeDifference1"
	),
	new QName (
	    "InformationElements",
	    "SFN-SFN-RelTimeDifference1"
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "sfn-Offset",
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
				    new com.oss.asn1.INTEGER(38399),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(38399)
			    ),
			    null
			)
		    ),
		    "sfn-sfn-Reltimedifference",
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
     * Get the type descriptor (TypeInfo) of 'this' SFN_SFN_RelTimeDifference1 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SFN_SFN_RelTimeDifference1 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SFN_SFN_RelTimeDifference1
