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
 * Define the ASN1 Type UE_RX_TX_TimeDifferenceType2Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RX_TX_TimeDifferenceType2Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RX_TX_TimeDifferenceType2Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RX_TX_TimeDifferenceType2Info(UE_RX_TX_TimeDifferenceType2 ue_RX_TX_TimeDifferenceType2, 
		    NeighbourQuality neighbourQuality)
    {
	setUe_RX_TX_TimeDifferenceType2(ue_RX_TX_TimeDifferenceType2);
	setNeighbourQuality(neighbourQuality);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_RX_TX_TimeDifferenceType2();
	mComponents[1] = new NeighbourQuality();
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
		return new UE_RX_TX_TimeDifferenceType2();
	    case 1:
		return new NeighbourQuality();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RX_TX_TimeDifferenceType2"
    public UE_RX_TX_TimeDifferenceType2 getUe_RX_TX_TimeDifferenceType2()
    {
	return (UE_RX_TX_TimeDifferenceType2)mComponents[0];
    }
    
    public void setUe_RX_TX_TimeDifferenceType2(UE_RX_TX_TimeDifferenceType2 ue_RX_TX_TimeDifferenceType2)
    {
	mComponents[0] = ue_RX_TX_TimeDifferenceType2;
    }
    
    
    // Methods for field "neighbourQuality"
    public NeighbourQuality getNeighbourQuality()
    {
	return (NeighbourQuality)mComponents[1];
    }
    
    public void setNeighbourQuality(NeighbourQuality neighbourQuality)
    {
	mComponents[1] = neighbourQuality;
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
	    "UE_RX_TX_TimeDifferenceType2Info"
	),
	new QName (
	    "InformationElements",
	    "UE-RX-TX-TimeDifferenceType2Info"
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
				"UE_RX_TX_TimeDifferenceType2"
			    ),
			    new QName (
				"InformationElements",
				"UE-RX-TX-TimeDifferenceType2"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UE_RX_TX_TimeDifferenceType2(0), 
				    new UE_RX_TX_TimeDifferenceType2(8191),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8191)
			    ),
			    null
			)
		    ),
		    "ue-RX-TX-TimeDifferenceType2",
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
				"NeighbourQuality"
			    ),
			    new QName (
				"InformationElements",
				"NeighbourQuality"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "NeighbourQuality"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "NeighbourQuality"
				)
			    ),
			    0
			)
		    ),
		    "neighbourQuality",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RX_TX_TimeDifferenceType2Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RX_TX_TimeDifferenceType2Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RX_TX_TimeDifferenceType2Info
