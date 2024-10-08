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
 * Define the ASN1 Type RAB_Info_r6_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RAB_Info_r6_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public RAB_Info_r6_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RAB_Info_r6_ext(MBMS_SessionIdentity mbms_SessionIdentity)
    {
	setMbms_SessionIdentity(mbms_SessionIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_SessionIdentity();
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
		return new MBMS_SessionIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_SessionIdentity"
    public MBMS_SessionIdentity getMbms_SessionIdentity()
    {
	return (MBMS_SessionIdentity)mComponents[0];
    }
    
    public void setMbms_SessionIdentity(MBMS_SessionIdentity mbms_SessionIdentity)
    {
	mComponents[0] = mbms_SessionIdentity;
    }
    
    public boolean hasMbms_SessionIdentity()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMbms_SessionIdentity()
    {
	setComponentAbsent(0);
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
	    "RAB_Info_r6_ext"
	),
	new QName (
	    "InformationElements",
	    "RAB-Info-r6-ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
     * Get the type descriptor (TypeInfo) of 'this' RAB_Info_r6_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RAB_Info_r6_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RAB_Info_r6_ext
