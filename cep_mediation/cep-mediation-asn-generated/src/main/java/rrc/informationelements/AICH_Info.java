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
 * Define the ASN1 Type AICH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AICH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public AICH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AICH_Info(ChannelisationCode256 channelisationCode256, 
		    BOOLEAN sttd_Indicator, 
		    AICH_TransmissionTiming aich_TransmissionTiming)
    {
	setChannelisationCode256(channelisationCode256);
	setSttd_Indicator(sttd_Indicator);
	setAich_TransmissionTiming(aich_TransmissionTiming);
    }
    
    /**
     * Construct with components.
     */
    public AICH_Info(ChannelisationCode256 channelisationCode256, 
		    boolean sttd_Indicator, 
		    AICH_TransmissionTiming aich_TransmissionTiming)
    {
	this(channelisationCode256, new BOOLEAN(sttd_Indicator), 
	     aich_TransmissionTiming);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ChannelisationCode256();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = AICH_TransmissionTiming.e0;
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
		return new ChannelisationCode256();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return AICH_TransmissionTiming.e0;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "channelisationCode256"
    public ChannelisationCode256 getChannelisationCode256()
    {
	return (ChannelisationCode256)mComponents[0];
    }
    
    public void setChannelisationCode256(ChannelisationCode256 channelisationCode256)
    {
	mComponents[0] = channelisationCode256;
    }
    
    
    // Methods for field "sttd_Indicator"
    public boolean getSttd_Indicator()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setSttd_Indicator(boolean sttd_Indicator)
    {
	setSttd_Indicator(new BOOLEAN(sttd_Indicator));
    }
    
    public void setSttd_Indicator(BOOLEAN sttd_Indicator)
    {
	mComponents[1] = sttd_Indicator;
    }
    
    
    // Methods for field "aich_TransmissionTiming"
    public AICH_TransmissionTiming getAich_TransmissionTiming()
    {
	return (AICH_TransmissionTiming)mComponents[2];
    }
    
    public void setAich_TransmissionTiming(AICH_TransmissionTiming aich_TransmissionTiming)
    {
	mComponents[2] = aich_TransmissionTiming;
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
	    "AICH_Info"
	),
	new QName (
	    "InformationElements",
	    "AICH-Info"
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
				"ChannelisationCode256"
			    ),
			    new QName (
				"InformationElements",
				"ChannelisationCode256"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ChannelisationCode256(0), 
				    new ChannelisationCode256(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "channelisationCode256",
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
		    "sttd-Indicator",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AICH_TransmissionTiming"
			    ),
			    new QName (
				"InformationElements",
				"AICH-TransmissionTiming"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e0",
					0
				    ),
				    new MemberListElement (
					"e1",
					1
				    )
				}
			    ),
			    0,
			    AICH_TransmissionTiming.e0
			)
		    ),
		    "aich-TransmissionTiming",
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
     * Get the type descriptor (TypeInfo) of 'this' AICH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AICH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AICH_Info
