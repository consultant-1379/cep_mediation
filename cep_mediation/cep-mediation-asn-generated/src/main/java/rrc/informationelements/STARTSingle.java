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
 * Define the ASN1 Type STARTSingle from ASN1 Module InformationElements.
 * @see Sequence
 */

public class STARTSingle extends Sequence {
    
    /**
     * The default constructor.
     */
    public STARTSingle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public STARTSingle(CN_DomainIdentity cn_DomainIdentity, 
		    START_Value start_Value)
    {
	setCn_DomainIdentity(cn_DomainIdentity);
	setStart_Value(start_Value);
    }
    
    public void initComponents()
    {
	mComponents[0] = CN_DomainIdentity.cs_domain;
	mComponents[1] = new START_Value();
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
		return CN_DomainIdentity.cs_domain;
	    case 1:
		return new START_Value();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cn_DomainIdentity"
    public CN_DomainIdentity getCn_DomainIdentity()
    {
	return (CN_DomainIdentity)mComponents[0];
    }
    
    public void setCn_DomainIdentity(CN_DomainIdentity cn_DomainIdentity)
    {
	mComponents[0] = cn_DomainIdentity;
    }
    
    
    // Methods for field "start_Value"
    public START_Value getStart_Value()
    {
	return (START_Value)mComponents[1];
    }
    
    public void setStart_Value(START_Value start_Value)
    {
	mComponents[1] = start_Value;
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
	    "STARTSingle"
	),
	new QName (
	    "InformationElements",
	    "STARTSingle"
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
				"CN_DomainIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CN-DomainIdentity"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cs-domain",
					0
				    ),
				    new MemberListElement (
					"ps-domain",
					1
				    )
				}
			    ),
			    0,
			    CN_DomainIdentity.cs_domain
			)
		    ),
		    "cn-DomainIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"START_Value"
			    ),
			    new QName (
				"InformationElements",
				"START-Value"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(20)
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    null
			)
		    ),
		    "start-Value",
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
     * Get the type descriptor (TypeInfo) of 'this' STARTSingle object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' STARTSingle object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for STARTSingle
