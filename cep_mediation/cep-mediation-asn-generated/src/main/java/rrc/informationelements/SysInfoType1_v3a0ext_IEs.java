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
 * Define the ASN1 Type SysInfoType1_v3a0ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType1_v3a0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType1_v3a0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType1_v3a0ext_IEs(UE_ConnTimersAndConstants_v3a0ext ue_ConnTimersAndConstants_v3a0ext, 
		    UE_IdleTimersAndConstants_v3a0ext ue_IdleTimersAndConstants_v3a0ext)
    {
	setUe_ConnTimersAndConstants_v3a0ext(ue_ConnTimersAndConstants_v3a0ext);
	setUe_IdleTimersAndConstants_v3a0ext(ue_IdleTimersAndConstants_v3a0ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_ConnTimersAndConstants_v3a0ext();
	mComponents[1] = new UE_IdleTimersAndConstants_v3a0ext();
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
		return new UE_ConnTimersAndConstants_v3a0ext();
	    case 1:
		return new UE_IdleTimersAndConstants_v3a0ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_ConnTimersAndConstants_v3a0ext"
    public UE_ConnTimersAndConstants_v3a0ext getUe_ConnTimersAndConstants_v3a0ext()
    {
	return (UE_ConnTimersAndConstants_v3a0ext)mComponents[0];
    }
    
    public void setUe_ConnTimersAndConstants_v3a0ext(UE_ConnTimersAndConstants_v3a0ext ue_ConnTimersAndConstants_v3a0ext)
    {
	mComponents[0] = ue_ConnTimersAndConstants_v3a0ext;
    }
    
    
    // Methods for field "ue_IdleTimersAndConstants_v3a0ext"
    public UE_IdleTimersAndConstants_v3a0ext getUe_IdleTimersAndConstants_v3a0ext()
    {
	return (UE_IdleTimersAndConstants_v3a0ext)mComponents[1];
    }
    
    public void setUe_IdleTimersAndConstants_v3a0ext(UE_IdleTimersAndConstants_v3a0ext ue_IdleTimersAndConstants_v3a0ext)
    {
	mComponents[1] = ue_IdleTimersAndConstants_v3a0ext;
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
	    "SysInfoType1_v3a0ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType1-v3a0ext-IEs"
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
				"UE_ConnTimersAndConstants_v3a0ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-ConnTimersAndConstants-v3a0ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_ConnTimersAndConstants_v3a0ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_ConnTimersAndConstants_v3a0ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-ConnTimersAndConstants-v3a0ext",
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
				"UE_IdleTimersAndConstants_v3a0ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-IdleTimersAndConstants-v3a0ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_IdleTimersAndConstants_v3a0ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_IdleTimersAndConstants_v3a0ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-IdleTimersAndConstants-v3a0ext",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType1_v3a0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType1_v3a0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType1_v3a0ext_IEs
