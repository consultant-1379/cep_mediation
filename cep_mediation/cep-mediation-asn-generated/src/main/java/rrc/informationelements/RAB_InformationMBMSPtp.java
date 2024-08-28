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
 * Define the ASN1 Type RAB_InformationMBMSPtp from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RAB_InformationMBMSPtp extends Sequence {
    
    /**
     * The default constructor.
     */
    public RAB_InformationMBMSPtp()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RAB_InformationMBMSPtp(RB_Identity rb_Identity, 
		    OctetString mbms_ServiceIdentity, 
		    MBMS_SessionIdentity mbms_SessionIdentity)
    {
	setRb_Identity(rb_Identity);
	setMbms_ServiceIdentity(mbms_ServiceIdentity);
	setMbms_SessionIdentity(mbms_SessionIdentity);
    }
    
    /**
     * Construct with required components.
     */
    public RAB_InformationMBMSPtp(RB_Identity rb_Identity, 
		    OctetString mbms_ServiceIdentity)
    {
	setRb_Identity(rb_Identity);
	setMbms_ServiceIdentity(mbms_ServiceIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RB_Identity();
	mComponents[1] = new OctetString();
	mComponents[2] = new MBMS_SessionIdentity();
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
		return new RB_Identity();
	    case 1:
		return new OctetString();
	    case 2:
		return new MBMS_SessionIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rb_Identity"
    public RB_Identity getRb_Identity()
    {
	return (RB_Identity)mComponents[0];
    }
    
    public void setRb_Identity(RB_Identity rb_Identity)
    {
	mComponents[0] = rb_Identity;
    }
    
    
    // Methods for field "mbms_ServiceIdentity"
    public OctetString getMbms_ServiceIdentity()
    {
	return (OctetString)mComponents[1];
    }
    
    public void setMbms_ServiceIdentity(OctetString mbms_ServiceIdentity)
    {
	mComponents[1] = mbms_ServiceIdentity;
    }
    
    
    // Methods for field "mbms_SessionIdentity"
    public MBMS_SessionIdentity getMbms_SessionIdentity()
    {
	return (MBMS_SessionIdentity)mComponents[2];
    }
    
    public void setMbms_SessionIdentity(MBMS_SessionIdentity mbms_SessionIdentity)
    {
	mComponents[2] = mbms_SessionIdentity;
    }
    
    public boolean hasMbms_SessionIdentity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMbms_SessionIdentity()
    {
	setComponentAbsent(2);
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
	    "RAB_InformationMBMSPtp"
	),
	new QName (
	    "InformationElements",
	    "RAB-InformationMBMSPtp"
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
				"RB_Identity"
			    ),
			    new QName (
				"InformationElements",
				"RB-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RB_Identity(1), 
				    new RB_Identity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "rb-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(3)
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(3)
			    )
			)
		    ),
		    "mbms-ServiceIdentity",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_SessionIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-SessionIdentity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(1)
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1)
			    )
			)
		    ),
		    "mbms-SessionIdentity",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' RAB_InformationMBMSPtp object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RAB_InformationMBMSPtp object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RAB_InformationMBMSPtp
