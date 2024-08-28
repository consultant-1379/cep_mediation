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
 * Define the ASN1 Type TrafficVolumeReportingQuantity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TrafficVolumeReportingQuantity extends Sequence {
    
    /**
     * The default constructor.
     */
    public TrafficVolumeReportingQuantity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrafficVolumeReportingQuantity(BOOLEAN rlc_RB_BufferPayload, 
		    BOOLEAN rlc_RB_BufferPayloadAverage, 
		    BOOLEAN rlc_RB_BufferPayloadVariance)
    {
	setRlc_RB_BufferPayload(rlc_RB_BufferPayload);
	setRlc_RB_BufferPayloadAverage(rlc_RB_BufferPayloadAverage);
	setRlc_RB_BufferPayloadVariance(rlc_RB_BufferPayloadVariance);
    }
    
    /**
     * Construct with components.
     */
    public TrafficVolumeReportingQuantity(boolean rlc_RB_BufferPayload, 
		    boolean rlc_RB_BufferPayloadAverage, 
		    boolean rlc_RB_BufferPayloadVariance)
    {
	this(new BOOLEAN(rlc_RB_BufferPayload), 
	     new BOOLEAN(rlc_RB_BufferPayloadAverage), 
	     new BOOLEAN(rlc_RB_BufferPayloadVariance));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rlc_RB_BufferPayload"
    public boolean getRlc_RB_BufferPayload()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setRlc_RB_BufferPayload(boolean rlc_RB_BufferPayload)
    {
	setRlc_RB_BufferPayload(new BOOLEAN(rlc_RB_BufferPayload));
    }
    
    public void setRlc_RB_BufferPayload(BOOLEAN rlc_RB_BufferPayload)
    {
	mComponents[0] = rlc_RB_BufferPayload;
    }
    
    
    // Methods for field "rlc_RB_BufferPayloadAverage"
    public boolean getRlc_RB_BufferPayloadAverage()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setRlc_RB_BufferPayloadAverage(boolean rlc_RB_BufferPayloadAverage)
    {
	setRlc_RB_BufferPayloadAverage(new BOOLEAN(rlc_RB_BufferPayloadAverage));
    }
    
    public void setRlc_RB_BufferPayloadAverage(BOOLEAN rlc_RB_BufferPayloadAverage)
    {
	mComponents[1] = rlc_RB_BufferPayloadAverage;
    }
    
    
    // Methods for field "rlc_RB_BufferPayloadVariance"
    public boolean getRlc_RB_BufferPayloadVariance()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setRlc_RB_BufferPayloadVariance(boolean rlc_RB_BufferPayloadVariance)
    {
	setRlc_RB_BufferPayloadVariance(new BOOLEAN(rlc_RB_BufferPayloadVariance));
    }
    
    public void setRlc_RB_BufferPayloadVariance(BOOLEAN rlc_RB_BufferPayloadVariance)
    {
	mComponents[2] = rlc_RB_BufferPayloadVariance;
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
	    "TrafficVolumeReportingQuantity"
	),
	new QName (
	    "InformationElements",
	    "TrafficVolumeReportingQuantity"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "rlc-RB-BufferPayload",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "rlc-RB-BufferPayloadAverage",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "rlc-RB-BufferPayloadVariance",
		    2,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TrafficVolumeReportingQuantity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrafficVolumeReportingQuantity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrafficVolumeReportingQuantity
