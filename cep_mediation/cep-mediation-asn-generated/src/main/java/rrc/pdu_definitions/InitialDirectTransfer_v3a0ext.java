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
 * Define the ASN1 Type InitialDirectTransfer_v3a0ext from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InitialDirectTransfer_v3a0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public InitialDirectTransfer_v3a0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InitialDirectTransfer_v3a0ext(rrc.informationelements.START_Value start_Value)
    {
	setStart_Value(start_Value);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.START_Value();
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
		return new rrc.informationelements.START_Value();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "start_Value"
    public rrc.informationelements.START_Value getStart_Value()
    {
	return (rrc.informationelements.START_Value)mComponents[0];
    }
    
    public void setStart_Value(rrc.informationelements.START_Value start_Value)
    {
	mComponents[0] = start_Value;
    }
    
    public boolean hasStart_Value()
    {
	return componentIsPresent(0);
    }
    
    public void deleteStart_Value()
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
	    "InitialDirectTransfer_v3a0ext"
	),
	new QName (
	    "PDU-definitions",
	    "InitialDirectTransfer-v3a0ext"
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
				"START_Value"
			    ),
			    new QName (
				"InformationElements",
				"START-Value"
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
		    "start-Value",
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
     * Get the type descriptor (TypeInfo) of 'this' InitialDirectTransfer_v3a0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InitialDirectTransfer_v3a0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InitialDirectTransfer_v3a0ext
