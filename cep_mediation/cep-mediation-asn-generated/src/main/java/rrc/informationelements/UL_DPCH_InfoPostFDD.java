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
 * Define the ASN1 Type UL_DPCH_InfoPostFDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_DPCH_InfoPostFDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_DPCH_InfoPostFDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_DPCH_InfoPostFDD(UL_DPCH_PowerControlInfoPostFDD ul_DPCH_PowerControlInfo, 
		    ScramblingCodeType scramblingCodeType, 
		    ReducedScramblingCodeNumber reducedScramblingCodeNumber, 
		    SpreadingFactor spreadingFactor)
    {
	setUl_DPCH_PowerControlInfo(ul_DPCH_PowerControlInfo);
	setScramblingCodeType(scramblingCodeType);
	setReducedScramblingCodeNumber(reducedScramblingCodeNumber);
	setSpreadingFactor(spreadingFactor);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_DPCH_PowerControlInfoPostFDD();
	mComponents[1] = ScramblingCodeType.shortSC;
	mComponents[2] = new ReducedScramblingCodeNumber();
	mComponents[3] = SpreadingFactor.sf4;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UL_DPCH_PowerControlInfoPostFDD();
	    case 1:
		return ScramblingCodeType.shortSC;
	    case 2:
		return new ReducedScramblingCodeNumber();
	    case 3:
		return SpreadingFactor.sf4;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_DPCH_PowerControlInfo"
    public UL_DPCH_PowerControlInfoPostFDD getUl_DPCH_PowerControlInfo()
    {
	return (UL_DPCH_PowerControlInfoPostFDD)mComponents[0];
    }
    
    public void setUl_DPCH_PowerControlInfo(UL_DPCH_PowerControlInfoPostFDD ul_DPCH_PowerControlInfo)
    {
	mComponents[0] = ul_DPCH_PowerControlInfo;
    }
    
    
    // Methods for field "scramblingCodeType"
    public ScramblingCodeType getScramblingCodeType()
    {
	return (ScramblingCodeType)mComponents[1];
    }
    
    public void setScramblingCodeType(ScramblingCodeType scramblingCodeType)
    {
	mComponents[1] = scramblingCodeType;
    }
    
    
    // Methods for field "reducedScramblingCodeNumber"
    public ReducedScramblingCodeNumber getReducedScramblingCodeNumber()
    {
	return (ReducedScramblingCodeNumber)mComponents[2];
    }
    
    public void setReducedScramblingCodeNumber(ReducedScramblingCodeNumber reducedScramblingCodeNumber)
    {
	mComponents[2] = reducedScramblingCodeNumber;
    }
    
    
    // Methods for field "spreadingFactor"
    public SpreadingFactor getSpreadingFactor()
    {
	return (SpreadingFactor)mComponents[3];
    }
    
    public void setSpreadingFactor(SpreadingFactor spreadingFactor)
    {
	mComponents[3] = spreadingFactor;
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
	    "UL_DPCH_InfoPostFDD"
	),
	new QName (
	    "InformationElements",
	    "UL-DPCH-InfoPostFDD"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_DPCH_PowerControlInfoPostFDD"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCH-PowerControlInfoPostFDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_PowerControlInfoPostFDD"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_PowerControlInfoPostFDD"
				)
			    ),
			    0
			)
		    ),
		    "ul-DPCH-PowerControlInfo",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ScramblingCodeType"
			    ),
			    new QName (
				"InformationElements",
				"ScramblingCodeType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"shortSC",
					0
				    ),
				    new MemberListElement (
					"longSC",
					1
				    )
				}
			    ),
			    0,
			    ScramblingCodeType.shortSC
			)
		    ),
		    "scramblingCodeType",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReducedScramblingCodeNumber"
			    ),
			    new QName (
				"InformationElements",
				"ReducedScramblingCodeNumber"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ReducedScramblingCodeNumber(0), 
				    new ReducedScramblingCodeNumber(8191),
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
		    "reducedScramblingCodeNumber",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SpreadingFactor"
			    ),
			    new QName (
				"InformationElements",
				"SpreadingFactor"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sf4",
					0
				    ),
				    new MemberListElement (
					"sf8",
					1
				    ),
				    new MemberListElement (
					"sf16",
					2
				    ),
				    new MemberListElement (
					"sf32",
					3
				    ),
				    new MemberListElement (
					"sf64",
					4
				    ),
				    new MemberListElement (
					"sf128",
					5
				    ),
				    new MemberListElement (
					"sf256",
					6
				    )
				}
			    ),
			    0,
			    SpreadingFactor.sf4
			)
		    ),
		    "spreadingFactor",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_DPCH_InfoPostFDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DPCH_InfoPostFDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DPCH_InfoPostFDD
