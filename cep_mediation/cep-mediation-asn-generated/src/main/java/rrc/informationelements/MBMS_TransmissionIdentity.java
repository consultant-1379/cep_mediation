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
 * Define the ASN1 Type MBMS_TransmissionIdentity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_TransmissionIdentity extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_TransmissionIdentity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_TransmissionIdentity(MBMS_ServiceIdentity_r6 mbms_ServiceIdentity, 
		    MBMS_SessionIdentity mbms_SessionIdentity)
    {
	setMbms_ServiceIdentity(mbms_ServiceIdentity);
	setMbms_SessionIdentity(mbms_SessionIdentity);
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_TransmissionIdentity(MBMS_ServiceIdentity_r6 mbms_ServiceIdentity)
    {
	setMbms_ServiceIdentity(mbms_ServiceIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_ServiceIdentity_r6();
	mComponents[1] = new MBMS_SessionIdentity();
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
		return new MBMS_ServiceIdentity_r6();
	    case 1:
		return new MBMS_SessionIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_ServiceIdentity"
    public MBMS_ServiceIdentity_r6 getMbms_ServiceIdentity()
    {
	return (MBMS_ServiceIdentity_r6)mComponents[0];
    }
    
    public void setMbms_ServiceIdentity(MBMS_ServiceIdentity_r6 mbms_ServiceIdentity)
    {
	mComponents[0] = mbms_ServiceIdentity;
    }
    
    
    // Methods for field "mbms_SessionIdentity"
    public MBMS_SessionIdentity getMbms_SessionIdentity()
    {
	return (MBMS_SessionIdentity)mComponents[1];
    }
    
    public void setMbms_SessionIdentity(MBMS_SessionIdentity mbms_SessionIdentity)
    {
	mComponents[1] = mbms_SessionIdentity;
    }
    
    public boolean hasMbms_SessionIdentity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMbms_SessionIdentity()
    {
	setComponentAbsent(1);
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
	    "MBMS_TransmissionIdentity"
	),
	new QName (
	    "InformationElements",
	    "MBMS-TransmissionIdentity"
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
				"MBMS_ServiceIdentity_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-ServiceIdentity-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_ServiceIdentity_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_ServiceIdentity_r6"
				)
			    ),
			    0
			)
		    ),
		    "mbms-ServiceIdentity",
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
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_TransmissionIdentity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_TransmissionIdentity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_TransmissionIdentity
