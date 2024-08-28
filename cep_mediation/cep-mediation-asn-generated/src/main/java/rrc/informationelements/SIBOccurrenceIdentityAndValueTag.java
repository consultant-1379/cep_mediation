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
 * Define the ASN1 Type SIBOccurrenceIdentityAndValueTag from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SIBOccurrenceIdentityAndValueTag extends Sequence {
    
    /**
     * The default constructor.
     */
    public SIBOccurrenceIdentityAndValueTag()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SIBOccurrenceIdentityAndValueTag(SIBOccurIdentity sibOccurIdentity, 
		    SIBOccurValueTag sibOccurValueTag)
    {
	setSibOccurIdentity(sibOccurIdentity);
	setSibOccurValueTag(sibOccurValueTag);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SIBOccurIdentity();
	mComponents[1] = new SIBOccurValueTag();
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
		return new SIBOccurIdentity();
	    case 1:
		return new SIBOccurValueTag();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sibOccurIdentity"
    public SIBOccurIdentity getSibOccurIdentity()
    {
	return (SIBOccurIdentity)mComponents[0];
    }
    
    public void setSibOccurIdentity(SIBOccurIdentity sibOccurIdentity)
    {
	mComponents[0] = sibOccurIdentity;
    }
    
    
    // Methods for field "sibOccurValueTag"
    public SIBOccurValueTag getSibOccurValueTag()
    {
	return (SIBOccurValueTag)mComponents[1];
    }
    
    public void setSibOccurValueTag(SIBOccurValueTag sibOccurValueTag)
    {
	mComponents[1] = sibOccurValueTag;
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
	    "SIBOccurrenceIdentityAndValueTag"
	),
	new QName (
	    "InformationElements",
	    "SIBOccurrenceIdentityAndValueTag"
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
				"SIBOccurIdentity"
			    ),
			    new QName (
				"InformationElements",
				"SIBOccurIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SIBOccurIdentity(0), 
				    new SIBOccurIdentity(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "sibOccurIdentity",
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
				"rrc.informationelements",
				"SIBOccurValueTag"
			    ),
			    new QName (
				"InformationElements",
				"SIBOccurValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SIBOccurValueTag(0), 
				    new SIBOccurValueTag(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "sibOccurValueTag",
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
     * Get the type descriptor (TypeInfo) of 'this' SIBOccurrenceIdentityAndValueTag object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SIBOccurrenceIdentityAndValueTag object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SIBOccurrenceIdentityAndValueTag
