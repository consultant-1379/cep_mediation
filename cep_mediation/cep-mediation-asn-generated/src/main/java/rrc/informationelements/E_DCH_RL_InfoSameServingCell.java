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
 * Define the ASN1 Type E_DCH_RL_InfoSameServingCell from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DCH_RL_InfoSameServingCell extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DCH_RL_InfoSameServingCell()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DCH_RL_InfoSameServingCell(E_DPCCH_DPCCH_PowerOffset e_DPCCH_DPCCH_PowerOffset, 
		    E_DPDCH_Reference_E_TFCIList_r7 reference_E_TFCIs)
    {
	setE_DPCCH_DPCCH_PowerOffset(e_DPCCH_DPCCH_PowerOffset);
	setReference_E_TFCIs(reference_E_TFCIs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_DPCCH_DPCCH_PowerOffset();
	mComponents[1] = new E_DPDCH_Reference_E_TFCIList_r7();
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
		return new E_DPCCH_DPCCH_PowerOffset();
	    case 1:
		return new E_DPDCH_Reference_E_TFCIList_r7();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_DPCCH_DPCCH_PowerOffset"
    public E_DPCCH_DPCCH_PowerOffset getE_DPCCH_DPCCH_PowerOffset()
    {
	return (E_DPCCH_DPCCH_PowerOffset)mComponents[0];
    }
    
    public void setE_DPCCH_DPCCH_PowerOffset(E_DPCCH_DPCCH_PowerOffset e_DPCCH_DPCCH_PowerOffset)
    {
	mComponents[0] = e_DPCCH_DPCCH_PowerOffset;
    }
    
    public boolean hasE_DPCCH_DPCCH_PowerOffset()
    {
	return componentIsPresent(0);
    }
    
    public void deleteE_DPCCH_DPCCH_PowerOffset()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "reference_E_TFCIs"
    public E_DPDCH_Reference_E_TFCIList_r7 getReference_E_TFCIs()
    {
	return (E_DPDCH_Reference_E_TFCIList_r7)mComponents[1];
    }
    
    public void setReference_E_TFCIs(E_DPDCH_Reference_E_TFCIList_r7 reference_E_TFCIs)
    {
	mComponents[1] = reference_E_TFCIs;
    }
    
    public boolean hasReference_E_TFCIs()
    {
	return componentIsPresent(1);
    }
    
    public void deleteReference_E_TFCIs()
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
	    "E_DCH_RL_InfoSameServingCell"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-RL-InfoSameServingCell"
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
				"E_DPCCH_DPCCH_PowerOffset"
			    ),
			    new QName (
				"InformationElements",
				"E-DPCCH-DPCCH-PowerOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DPCCH_DPCCH_PowerOffset(0), 
				    new E_DPCCH_DPCCH_PowerOffset(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "e-DPCCH-DPCCH-PowerOffset",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DPDCH_Reference_E_TFCIList_r7"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-Reference-E-TFCIList-r7"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPDCH_Reference_E_TFCI_r7"
				)
			    )
			)
		    ),
		    "reference-E-TFCIs",
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
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_RL_InfoSameServingCell object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_RL_InfoSameServingCell object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_RL_InfoSameServingCell
