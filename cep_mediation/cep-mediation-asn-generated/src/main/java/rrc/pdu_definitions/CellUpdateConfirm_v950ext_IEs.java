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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CellUpdateConfirm_v950ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellUpdateConfirm_v950ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellUpdateConfirm_v950ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellUpdateConfirm_v950ext_IEs(rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext secondaryCellMimoParameters)
    {
	setSecondaryCellMimoParameters(secondaryCellMimoParameters);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext();
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
		return new rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondaryCellMimoParameters"
    public rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext getSecondaryCellMimoParameters()
    {
	return (rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext)mComponents[0];
    }
    
    public void setSecondaryCellMimoParameters(rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext secondaryCellMimoParameters)
    {
	mComponents[0] = secondaryCellMimoParameters;
    }
    
    public boolean hasSecondaryCellMimoParameters()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSecondaryCellMimoParameters()
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
	    "rrc.pdu_definitions",
	    "CellUpdateConfirm_v950ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdateConfirm-v950ext-IEs"
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
				"SecondaryCellMIMOparametersFDD_v950ext"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryCellMIMOparametersFDD-v950ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCellMIMOparametersFDD_v950ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCellMIMOparametersFDD_v950ext"
				)
			    ),
			    0
			)
		    ),
		    "secondaryCellMimoParameters",
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
     * Get the type descriptor (TypeInfo) of 'this' CellUpdateConfirm_v950ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdateConfirm_v950ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdateConfirm_v950ext_IEs
