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
 * Define the ASN1 Type PDSCH_CodeInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDSCH_CodeInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDSCH_CodeInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDSCH_CodeInfo(SF_PDSCH spreadingFactor, CodeNumberDSCH codeNumber, 
		    MultiCodeInfo multiCodeInfo)
    {
	setSpreadingFactor(spreadingFactor);
	setCodeNumber(codeNumber);
	setMultiCodeInfo(multiCodeInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = SF_PDSCH.sfp4;
	mComponents[1] = new CodeNumberDSCH();
	mComponents[2] = new MultiCodeInfo();
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
		return SF_PDSCH.sfp4;
	    case 1:
		return new CodeNumberDSCH();
	    case 2:
		return new MultiCodeInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "spreadingFactor"
    public SF_PDSCH getSpreadingFactor()
    {
	return (SF_PDSCH)mComponents[0];
    }
    
    public void setSpreadingFactor(SF_PDSCH spreadingFactor)
    {
	mComponents[0] = spreadingFactor;
    }
    
    
    // Methods for field "codeNumber"
    public CodeNumberDSCH getCodeNumber()
    {
	return (CodeNumberDSCH)mComponents[1];
    }
    
    public void setCodeNumber(CodeNumberDSCH codeNumber)
    {
	mComponents[1] = codeNumber;
    }
    
    
    // Methods for field "multiCodeInfo"
    public MultiCodeInfo getMultiCodeInfo()
    {
	return (MultiCodeInfo)mComponents[2];
    }
    
    public void setMultiCodeInfo(MultiCodeInfo multiCodeInfo)
    {
	mComponents[2] = multiCodeInfo;
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
	    "PDSCH_CodeInfo"
	),
	new QName (
	    "InformationElements",
	    "PDSCH-CodeInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SF_PDSCH"
			    ),
			    new QName (
				"InformationElements",
				"SF-PDSCH"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sfp4",
					0
				    ),
				    new MemberListElement (
					"sfp8",
					1
				    ),
				    new MemberListElement (
					"sfp16",
					2
				    ),
				    new MemberListElement (
					"sfp32",
					3
				    ),
				    new MemberListElement (
					"sfp64",
					4
				    ),
				    new MemberListElement (
					"sfp128",
					5
				    ),
				    new MemberListElement (
					"sfp256",
					6
				    )
				}
			    ),
			    0,
			    SF_PDSCH.sfp4
			)
		    ),
		    "spreadingFactor",
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
				"CodeNumberDSCH"
			    ),
			    new QName (
				"InformationElements",
				"CodeNumberDSCH"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CodeNumberDSCH(0), 
				    new CodeNumberDSCH(255),
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
		    "codeNumber",
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
				"MultiCodeInfo"
			    ),
			    new QName (
				"InformationElements",
				"MultiCodeInfo"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MultiCodeInfo(1), 
				    new MultiCodeInfo(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "multiCodeInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' PDSCH_CodeInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDSCH_CodeInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDSCH_CodeInfo
