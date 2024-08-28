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
 * Define the ASN1 Type MeasurementControl_v5b0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementControl_v5b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementControl_v5b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementControl_v5b0ext_IEs(rrc.informationelements.InterRATCellInfoIndication interRATCellInfoIndication)
    {
	setInterRATCellInfoIndication(interRATCellInfoIndication);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.InterRATCellInfoIndication();
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
		return new rrc.informationelements.InterRATCellInfoIndication();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interRATCellInfoIndication"
    public rrc.informationelements.InterRATCellInfoIndication getInterRATCellInfoIndication()
    {
	return (rrc.informationelements.InterRATCellInfoIndication)mComponents[0];
    }
    
    public void setInterRATCellInfoIndication(rrc.informationelements.InterRATCellInfoIndication interRATCellInfoIndication)
    {
	mComponents[0] = interRATCellInfoIndication;
    }
    
    public boolean hasInterRATCellInfoIndication()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInterRATCellInfoIndication()
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
	    "MeasurementControl_v5b0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementControl-v5b0ext-IEs"
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
				"InterRATCellInfoIndication"
			    ),
			    new QName (
				"InformationElements",
				"InterRATCellInfoIndication"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.InterRATCellInfoIndication(0), 
				    new rrc.informationelements.InterRATCellInfoIndication(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "interRATCellInfoIndication",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementControl_v5b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementControl_v5b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementControl_v5b0ext_IEs
