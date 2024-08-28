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
 * Define the ASN1 Type FACH_PCH_Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class FACH_PCH_Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public FACH_PCH_Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public FACH_PCH_Information(TransportFormatSet transportFormatSet, 
		    TransportChannelIdentity transportChannelIdentity, 
		    BOOLEAN ctch_Indicator)
    {
	setTransportFormatSet(transportFormatSet);
	setTransportChannelIdentity(transportChannelIdentity);
	setCtch_Indicator(ctch_Indicator);
    }
    
    /**
     * Construct with components.
     */
    public FACH_PCH_Information(TransportFormatSet transportFormatSet, 
		    TransportChannelIdentity transportChannelIdentity, 
		    boolean ctch_Indicator)
    {
	this(transportFormatSet, transportChannelIdentity, 
	     new BOOLEAN(ctch_Indicator));
    }
    
    public void initComponents()
    {
	mComponents[0] = new TransportFormatSet();
	mComponents[1] = new TransportChannelIdentity();
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
		return new TransportFormatSet();
	    case 1:
		return new TransportChannelIdentity();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transportFormatSet"
    public TransportFormatSet getTransportFormatSet()
    {
	return (TransportFormatSet)mComponents[0];
    }
    
    public void setTransportFormatSet(TransportFormatSet transportFormatSet)
    {
	mComponents[0] = transportFormatSet;
    }
    
    
    // Methods for field "transportChannelIdentity"
    public TransportChannelIdentity getTransportChannelIdentity()
    {
	return (TransportChannelIdentity)mComponents[1];
    }
    
    public void setTransportChannelIdentity(TransportChannelIdentity transportChannelIdentity)
    {
	mComponents[1] = transportChannelIdentity;
    }
    
    
    // Methods for field "ctch_Indicator"
    public boolean getCtch_Indicator()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setCtch_Indicator(boolean ctch_Indicator)
    {
	setCtch_Indicator(new BOOLEAN(ctch_Indicator));
    }
    
    public void setCtch_Indicator(BOOLEAN ctch_Indicator)
    {
	mComponents[2] = ctch_Indicator;
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
	    "FACH_PCH_Information"
	),
	new QName (
	    "InformationElements",
	    "FACH-PCH-Information"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportFormatSet"
			    ),
			    new QName (
				"InformationElements",
				"TransportFormatSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TransportFormatSet"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "transportFormatSet",
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
		    "ctch-Indicator",
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
     * Get the type descriptor (TypeInfo) of 'this' FACH_PCH_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FACH_PCH_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FACH_PCH_Information
