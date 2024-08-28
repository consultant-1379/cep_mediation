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
 * Define the ASN1 Type SecondaryServingEDCHCell_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SecondaryServingEDCHCell_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecondaryServingEDCHCell_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecondaryServingEDCHCell_Info(E_RNTI primary_E_RNTI, 
		    E_RNTI secondary_E_RNTI)
    {
	setPrimary_E_RNTI(primary_E_RNTI);
	setSecondary_E_RNTI(secondary_E_RNTI);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_RNTI();
	mComponents[1] = new E_RNTI();
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
		return new E_RNTI();
	    case 1:
		return new E_RNTI();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primary_E_RNTI"
    public E_RNTI getPrimary_E_RNTI()
    {
	return (E_RNTI)mComponents[0];
    }
    
    public void setPrimary_E_RNTI(E_RNTI primary_E_RNTI)
    {
	mComponents[0] = primary_E_RNTI;
    }
    
    public boolean hasPrimary_E_RNTI()
    {
	return componentIsPresent(0);
    }
    
    public void deletePrimary_E_RNTI()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "secondary_E_RNTI"
    public E_RNTI getSecondary_E_RNTI()
    {
	return (E_RNTI)mComponents[1];
    }
    
    public void setSecondary_E_RNTI(E_RNTI secondary_E_RNTI)
    {
	mComponents[1] = secondary_E_RNTI;
    }
    
    public boolean hasSecondary_E_RNTI()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSecondary_E_RNTI()
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
	    "SecondaryServingEDCHCell_Info"
	),
	new QName (
	    "InformationElements",
	    "SecondaryServingEDCHCell-Info"
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
				"E_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"E-RNTI"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "primary-E-RNTI",
		    0,
		    3,
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
				"E_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"E-RNTI"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "secondary-E-RNTI",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' SecondaryServingEDCHCell_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecondaryServingEDCHCell_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecondaryServingEDCHCell_Info
