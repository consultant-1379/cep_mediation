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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CipheringStatusCNdomain_r4 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class CipheringStatusCNdomain_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CipheringStatusCNdomain_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CipheringStatusCNdomain_r4(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity, 
		    CipheringStatus cipheringStatus, 
		    rrc.informationelements.START_Value start_Value)
    {
	setCn_DomainIdentity(cn_DomainIdentity);
	setCipheringStatus(cipheringStatus);
	setStart_Value(start_Value);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.CN_DomainIdentity.cs_domain;
	mComponents[1] = CipheringStatus.started;
	mComponents[2] = new rrc.informationelements.START_Value();
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
		return rrc.informationelements.CN_DomainIdentity.cs_domain;
	    case 1:
		return CipheringStatus.started;
	    case 2:
		return new rrc.informationelements.START_Value();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cn_DomainIdentity"
    public rrc.informationelements.CN_DomainIdentity getCn_DomainIdentity()
    {
	return (rrc.informationelements.CN_DomainIdentity)mComponents[0];
    }
    
    public void setCn_DomainIdentity(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity)
    {
	mComponents[0] = cn_DomainIdentity;
    }
    
    
    // Methods for field "cipheringStatus"
    public CipheringStatus getCipheringStatus()
    {
	return (CipheringStatus)mComponents[1];
    }
    
    public void setCipheringStatus(CipheringStatus cipheringStatus)
    {
	mComponents[1] = cipheringStatus;
    }
    
    
    // Methods for field "start_Value"
    public rrc.informationelements.START_Value getStart_Value()
    {
	return (rrc.informationelements.START_Value)mComponents[2];
    }
    
    public void setStart_Value(rrc.informationelements.START_Value start_Value)
    {
	mComponents[2] = start_Value;
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
	    "rrc.internode_definitions",
	    "CipheringStatusCNdomain_r4"
	),
	new QName (
	    "Internode-definitions",
	    "CipheringStatusCNdomain-r4"
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
			    rrc.informationelements.CN_DomainIdentity.cs_domain
			)
		    ),
		    "cn-DomainIdentity",
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
				"rrc.internode_definitions",
				"CipheringStatus"
			    ),
			    new QName (
				"Internode-definitions",
				"CipheringStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"started",
					0
				    ),
				    new MemberListElement (
					"notStarted",
					1
				    )
				}
			    ),
			    0,
			    CipheringStatus.started
			)
		    ),
		    "cipheringStatus",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
     * Get the type descriptor (TypeInfo) of 'this' CipheringStatusCNdomain_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CipheringStatusCNdomain_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CipheringStatusCNdomain_r4
