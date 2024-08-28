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
 * Define the ASN1 Type DL_ChannelisationCode from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_ChannelisationCode extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_ChannelisationCode()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_ChannelisationCode(SecondaryScramblingCode secondaryScramblingCode, 
		    SF512_AndCodeNumber sf_AndCodeNumber, 
		    ScramblingCodeChange scramblingCodeChange)
    {
	setSecondaryScramblingCode(secondaryScramblingCode);
	setSf_AndCodeNumber(sf_AndCodeNumber);
	setScramblingCodeChange(scramblingCodeChange);
    }
    
    /**
     * Construct with required components.
     */
    public DL_ChannelisationCode(SF512_AndCodeNumber sf_AndCodeNumber)
    {
	setSf_AndCodeNumber(sf_AndCodeNumber);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondaryScramblingCode();
	mComponents[1] = new SF512_AndCodeNumber();
	mComponents[2] = ScramblingCodeChange.codeChange;
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
		return new SecondaryScramblingCode();
	    case 1:
		return new SF512_AndCodeNumber();
	    case 2:
		return ScramblingCodeChange.codeChange;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondaryScramblingCode"
    public SecondaryScramblingCode getSecondaryScramblingCode()
    {
	return (SecondaryScramblingCode)mComponents[0];
    }
    
    public void setSecondaryScramblingCode(SecondaryScramblingCode secondaryScramblingCode)
    {
	mComponents[0] = secondaryScramblingCode;
    }
    
    public boolean hasSecondaryScramblingCode()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSecondaryScramblingCode()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "sf_AndCodeNumber"
    public SF512_AndCodeNumber getSf_AndCodeNumber()
    {
	return (SF512_AndCodeNumber)mComponents[1];
    }
    
    public void setSf_AndCodeNumber(SF512_AndCodeNumber sf_AndCodeNumber)
    {
	mComponents[1] = sf_AndCodeNumber;
    }
    
    
    // Methods for field "scramblingCodeChange"
    public ScramblingCodeChange getScramblingCodeChange()
    {
	return (ScramblingCodeChange)mComponents[2];
    }
    
    public void setScramblingCodeChange(ScramblingCodeChange scramblingCodeChange)
    {
	mComponents[2] = scramblingCodeChange;
    }
    
    public boolean hasScramblingCodeChange()
    {
	return componentIsPresent(2);
    }
    
    public void deleteScramblingCodeChange()
    {
	setComponentAbsent(2);
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
	    "DL_ChannelisationCode"
	),
	new QName (
	    "InformationElements",
	    "DL-ChannelisationCode"
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
		    "secondaryScramblingCode",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SF512_AndCodeNumber"
			    ),
			    new QName (
				"InformationElements",
				"SF512-AndCodeNumber"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SF512_AndCodeNumber"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7)
				}
			    )
			)
		    ),
		    "sf-AndCodeNumber",
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
				"ScramblingCodeChange"
			    ),
			    new QName (
				"InformationElements",
				"ScramblingCodeChange"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"codeChange",
					0
				    ),
				    new MemberListElement (
					"noCodeChange",
					1
				    )
				}
			    ),
			    0,
			    ScramblingCodeChange.codeChange
			)
		    ),
		    "scramblingCodeChange",
		    2,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' DL_ChannelisationCode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_ChannelisationCode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_ChannelisationCode
