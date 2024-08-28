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
 * Define the ASN1 Type DataBitAssistance from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DataBitAssistance extends Sequence {
    
    /**
     * The default constructor.
     */
    public DataBitAssistance()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataBitAssistance(GANSS_Signal_Id ganss_signal_id, 
		    BitString data_bits)
    {
	setGanss_signal_id(ganss_signal_id);
	setData_bits(data_bits);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GANSS_Signal_Id();
	mComponents[1] = new BitString();
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
		return new GANSS_Signal_Id();
	    case 1:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganss_signal_id"
    public GANSS_Signal_Id getGanss_signal_id()
    {
	return (GANSS_Signal_Id)mComponents[0];
    }
    
    public void setGanss_signal_id(GANSS_Signal_Id ganss_signal_id)
    {
	mComponents[0] = ganss_signal_id;
    }
    
    
    // Methods for field "data_bits"
    public BitString getData_bits()
    {
	return (BitString)mComponents[1];
    }
    
    public void setData_bits(BitString data_bits)
    {
	mComponents[1] = data_bits;
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
	    "DataBitAssistance"
	),
	new QName (
	    "InformationElements",
	    "DataBitAssistance"
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
				"GANSS_Signal_Id"
			    ),
			    new QName (
				"InformationElements",
				"GANSS-Signal-Id"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new GANSS_Signal_Id(0), 
				    new GANSS_Signal_Id(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "ganss-signal-id",
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
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(1024),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1024)
			    ),
			    null
			)
		    ),
		    "data-bits",
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
     * Get the type descriptor (TypeInfo) of 'this' DataBitAssistance object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DataBitAssistance object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DataBitAssistance
