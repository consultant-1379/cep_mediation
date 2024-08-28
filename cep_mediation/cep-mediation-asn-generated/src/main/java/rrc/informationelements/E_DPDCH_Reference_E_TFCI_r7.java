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
 * Define the ASN1 Type E_DPDCH_Reference_E_TFCI_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DPDCH_Reference_E_TFCI_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DPDCH_Reference_E_TFCI_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DPDCH_Reference_E_TFCI_r7(INTEGER reference_E_TFCI, 
		    INTEGER reference_E_TFCI_PO_r7)
    {
	setReference_E_TFCI(reference_E_TFCI);
	setReference_E_TFCI_PO_r7(reference_E_TFCI_PO_r7);
    }
    
    /**
     * Construct with components.
     */
    public E_DPDCH_Reference_E_TFCI_r7(long reference_E_TFCI, 
		    long reference_E_TFCI_PO_r7)
    {
	this(new INTEGER(reference_E_TFCI), 
	     new INTEGER(reference_E_TFCI_PO_r7));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "reference_E_TFCI"
    public long getReference_E_TFCI()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setReference_E_TFCI(long reference_E_TFCI)
    {
	setReference_E_TFCI(new INTEGER(reference_E_TFCI));
    }
    
    public void setReference_E_TFCI(INTEGER reference_E_TFCI)
    {
	mComponents[0] = reference_E_TFCI;
    }
    
    
    // Methods for field "reference_E_TFCI_PO_r7"
    public long getReference_E_TFCI_PO_r7()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setReference_E_TFCI_PO_r7(long reference_E_TFCI_PO_r7)
    {
	setReference_E_TFCI_PO_r7(new INTEGER(reference_E_TFCI_PO_r7));
    }
    
    public void setReference_E_TFCI_PO_r7(INTEGER reference_E_TFCI_PO_r7)
    {
	mComponents[1] = reference_E_TFCI_PO_r7;
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
	    "E_DPDCH_Reference_E_TFCI_r7"
	),
	new QName (
	    "InformationElements",
	    "E-DPDCH-Reference-E-TFCI-r7"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "reference-E-TFCI",
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "reference-E-TFCI-PO-r7",
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
     * Get the type descriptor (TypeInfo) of 'this' E_DPDCH_Reference_E_TFCI_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DPDCH_Reference_E_TFCI_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DPDCH_Reference_E_TFCI_r7
