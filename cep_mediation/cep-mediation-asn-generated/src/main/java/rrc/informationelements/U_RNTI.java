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
 * Define the ASN1 Type U_RNTI from ASN1 Module InformationElements.
 * @see Sequence
 */

public class U_RNTI extends Sequence {
    
    /**
     * The default constructor.
     */
    public U_RNTI()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public U_RNTI(SRNC_Identity srnc_Identity, S_RNTI s_RNTI)
    {
	setSrnc_Identity(srnc_Identity);
	setS_RNTI(s_RNTI);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SRNC_Identity();
	mComponents[1] = new S_RNTI();
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
		return new SRNC_Identity();
	    case 1:
		return new S_RNTI();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "srnc_Identity"
    public SRNC_Identity getSrnc_Identity()
    {
	return (SRNC_Identity)mComponents[0];
    }
    
    public void setSrnc_Identity(SRNC_Identity srnc_Identity)
    {
	mComponents[0] = srnc_Identity;
    }
    
    
    // Methods for field "s_RNTI"
    public S_RNTI getS_RNTI()
    {
	return (S_RNTI)mComponents[1];
    }
    
    public void setS_RNTI(S_RNTI s_RNTI)
    {
	mComponents[1] = s_RNTI;
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
	    "U_RNTI"
	),
	new QName (
	    "InformationElements",
	    "U-RNTI"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SRNC_Identity"
			    ),
			    new QName (
				"InformationElements",
				"SRNC-Identity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(12)
				)
			    ),
			    new Bounds (
				new java.lang.Long(12),
				new java.lang.Long(12)
			    ),
			    null
			)
		    ),
		    "srnc-Identity",
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
				"S_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"S-RNTI"
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
		    "s-RNTI",
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
     * Get the type descriptor (TypeInfo) of 'this' U_RNTI object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' U_RNTI object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for U_RNTI
