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
 * Define the ASN1 Type TMSI_and_LAI_GSM_MAP from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TMSI_and_LAI_GSM_MAP extends Sequence {
    
    /**
     * The default constructor.
     */
    public TMSI_and_LAI_GSM_MAP()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TMSI_and_LAI_GSM_MAP(TMSI_GSM_MAP tmsi, LAI lai)
    {
	setTmsi(tmsi);
	setLai(lai);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TMSI_GSM_MAP();
	mComponents[1] = new LAI();
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
		return new TMSI_GSM_MAP();
	    case 1:
		return new LAI();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tmsi"
    public TMSI_GSM_MAP getTmsi()
    {
	return (TMSI_GSM_MAP)mComponents[0];
    }
    
    public void setTmsi(TMSI_GSM_MAP tmsi)
    {
	mComponents[0] = tmsi;
    }
    
    
    // Methods for field "lai"
    public LAI getLai()
    {
	return (LAI)mComponents[1];
    }
    
    public void setLai(LAI lai)
    {
	mComponents[1] = lai;
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
	    "TMSI_and_LAI_GSM_MAP"
	),
	new QName (
	    "InformationElements",
	    "TMSI-and-LAI-GSM-MAP"
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
				"TMSI_GSM_MAP"
			    ),
			    new QName (
				"InformationElements",
				"TMSI-GSM-MAP"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(32)
				)
			    ),
			    new Bounds (
				new java.lang.Long(32),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "tmsi",
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
				"LAI"
			    ),
			    new QName (
				"InformationElements",
				"LAI"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LAI"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "LAI"
				)
			    ),
			    0
			)
		    ),
		    "lai",
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
     * Get the type descriptor (TypeInfo) of 'this' TMSI_and_LAI_GSM_MAP object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TMSI_and_LAI_GSM_MAP object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TMSI_and_LAI_GSM_MAP
