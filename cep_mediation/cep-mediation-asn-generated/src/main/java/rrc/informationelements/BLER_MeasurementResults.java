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
 * Define the ASN1 Type BLER_MeasurementResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class BLER_MeasurementResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public BLER_MeasurementResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BLER_MeasurementResults(TransportChannelIdentity transportChannelIdentity, 
		    DL_TransportChannelBLER dl_TransportChannelBLER)
    {
	setTransportChannelIdentity(transportChannelIdentity);
	setDl_TransportChannelBLER(dl_TransportChannelBLER);
    }
    
    /**
     * Construct with required components.
     */
    public BLER_MeasurementResults(TransportChannelIdentity transportChannelIdentity)
    {
	setTransportChannelIdentity(transportChannelIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TransportChannelIdentity();
	mComponents[1] = new DL_TransportChannelBLER();
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
		return new TransportChannelIdentity();
	    case 1:
		return new DL_TransportChannelBLER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transportChannelIdentity"
    public TransportChannelIdentity getTransportChannelIdentity()
    {
	return (TransportChannelIdentity)mComponents[0];
    }
    
    public void setTransportChannelIdentity(TransportChannelIdentity transportChannelIdentity)
    {
	mComponents[0] = transportChannelIdentity;
    }
    
    
    // Methods for field "dl_TransportChannelBLER"
    public DL_TransportChannelBLER getDl_TransportChannelBLER()
    {
	return (DL_TransportChannelBLER)mComponents[1];
    }
    
    public void setDl_TransportChannelBLER(DL_TransportChannelBLER dl_TransportChannelBLER)
    {
	mComponents[1] = dl_TransportChannelBLER;
    }
    
    public boolean hasDl_TransportChannelBLER()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_TransportChannelBLER()
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
	    "BLER_MeasurementResults"
	),
	new QName (
	    "InformationElements",
	    "BLER-MeasurementResults"
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
				"TransportChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransportChannelIdentity(1), 
				    new TransportChannelIdentity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "transportChannelIdentity",
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
				"rrc.informationelements",
				"DL_TransportChannelBLER"
			    ),
			    new QName (
				"InformationElements",
				"DL-TransportChannelBLER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DL_TransportChannelBLER(0), 
				    new DL_TransportChannelBLER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "dl-TransportChannelBLER",
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
     * Get the type descriptor (TypeInfo) of 'this' BLER_MeasurementResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BLER_MeasurementResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BLER_MeasurementResults
