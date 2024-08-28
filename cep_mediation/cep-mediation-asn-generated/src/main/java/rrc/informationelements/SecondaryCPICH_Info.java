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
 * Define the ASN1 Type SecondaryCPICH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SecondaryCPICH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecondaryCPICH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecondaryCPICH_Info(SecondaryScramblingCode secondaryDL_ScramblingCode, 
		    ChannelisationCode256 channelisationCode)
    {
	setSecondaryDL_ScramblingCode(secondaryDL_ScramblingCode);
	setChannelisationCode(channelisationCode);
    }
    
    /**
     * Construct with required components.
     */
    public SecondaryCPICH_Info(ChannelisationCode256 channelisationCode)
    {
	setChannelisationCode(channelisationCode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondaryScramblingCode();
	mComponents[1] = new ChannelisationCode256();
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
		return new SecondaryScramblingCode();
	    case 1:
		return new ChannelisationCode256();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondaryDL_ScramblingCode"
    public SecondaryScramblingCode getSecondaryDL_ScramblingCode()
    {
	return (SecondaryScramblingCode)mComponents[0];
    }
    
    public void setSecondaryDL_ScramblingCode(SecondaryScramblingCode secondaryDL_ScramblingCode)
    {
	mComponents[0] = secondaryDL_ScramblingCode;
    }
    
    public boolean hasSecondaryDL_ScramblingCode()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSecondaryDL_ScramblingCode()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "channelisationCode"
    public ChannelisationCode256 getChannelisationCode()
    {
	return (ChannelisationCode256)mComponents[1];
    }
    
    public void setChannelisationCode(ChannelisationCode256 channelisationCode)
    {
	mComponents[1] = channelisationCode;
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
	    "SecondaryCPICH_Info"
	),
	new QName (
	    "InformationElements",
	    "SecondaryCPICH-Info"
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
				"SecondaryScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondaryScramblingCode(1), 
				    new SecondaryScramblingCode(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "secondaryDL-ScramblingCode",
		    0,
		    3,
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
		    "channelisationCode",
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
     * Get the type descriptor (TypeInfo) of 'this' SecondaryCPICH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecondaryCPICH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecondaryCPICH_Info
