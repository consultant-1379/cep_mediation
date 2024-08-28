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
 * Define the ASN1 Type CommonTimeslotInfoMBMS from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CommonTimeslotInfoMBMS extends Sequence {
    
    /**
     * The default constructor.
     */
    public CommonTimeslotInfoMBMS()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CommonTimeslotInfoMBMS(SecondInterleavingMode secondInterleavingMode, 
		    TFCI_Coding tfci_Coding, PuncturingLimit puncturingLimit)
    {
	setSecondInterleavingMode(secondInterleavingMode);
	setTfci_Coding(tfci_Coding);
	setPuncturingLimit(puncturingLimit);
    }
    
    /**
     * Construct with required components.
     */
    public CommonTimeslotInfoMBMS(SecondInterleavingMode secondInterleavingMode, 
		    PuncturingLimit puncturingLimit)
    {
	setSecondInterleavingMode(secondInterleavingMode);
	setPuncturingLimit(puncturingLimit);
    }
    
    public void initComponents()
    {
	mComponents[0] = SecondInterleavingMode.frameRelated;
	mComponents[1] = TFCI_Coding.tfci_bits_4;
	mComponents[2] = PuncturingLimit.pl0_40;
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
		return SecondInterleavingMode.frameRelated;
	    case 1:
		return TFCI_Coding.tfci_bits_4;
	    case 2:
		return PuncturingLimit.pl0_40;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondInterleavingMode"
    public SecondInterleavingMode getSecondInterleavingMode()
    {
	return (SecondInterleavingMode)mComponents[0];
    }
    
    public void setSecondInterleavingMode(SecondInterleavingMode secondInterleavingMode)
    {
	mComponents[0] = secondInterleavingMode;
    }
    
    
    // Methods for field "tfci_Coding"
    public TFCI_Coding getTfci_Coding()
    {
	return (TFCI_Coding)mComponents[1];
    }
    
    public void setTfci_Coding(TFCI_Coding tfci_Coding)
    {
	mComponents[1] = tfci_Coding;
    }
    
    public boolean hasTfci_Coding()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTfci_Coding()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "puncturingLimit"
    public PuncturingLimit getPuncturingLimit()
    {
	return (PuncturingLimit)mComponents[2];
    }
    
    public void setPuncturingLimit(PuncturingLimit puncturingLimit)
    {
	mComponents[2] = puncturingLimit;
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
	    "CommonTimeslotInfoMBMS"
	),
	new QName (
	    "InformationElements",
	    "CommonTimeslotInfoMBMS"
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
				"SecondInterleavingMode"
			    ),
			    new QName (
				"InformationElements",
				"SecondInterleavingMode"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"frameRelated",
					0
				    ),
				    new MemberListElement (
					"timeslotRelated",
					1
				    )
				}
			    ),
			    0,
			    SecondInterleavingMode.frameRelated
			)
		    ),
		    "secondInterleavingMode",
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
				"TFCI_Coding"
			    ),
			    new QName (
				"InformationElements",
				"TFCI-Coding"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tfci-bits-4",
					0
				    ),
				    new MemberListElement (
					"tfci-bits-8",
					1
				    ),
				    new MemberListElement (
					"tfci-bits-16",
					2
				    ),
				    new MemberListElement (
					"tfci-bits-32",
					3
				    )
				}
			    ),
			    0,
			    TFCI_Coding.tfci_bits_4
			)
		    ),
		    "tfci-Coding",
		    1,
		    3,
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
				"PuncturingLimit"
			    ),
			    new QName (
				"InformationElements",
				"PuncturingLimit"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pl0-40",
					0
				    ),
				    new MemberListElement (
					"pl0-44",
					1
				    ),
				    new MemberListElement (
					"pl0-48",
					2
				    ),
				    new MemberListElement (
					"pl0-52",
					3
				    ),
				    new MemberListElement (
					"pl0-56",
					4
				    ),
				    new MemberListElement (
					"pl0-60",
					5
				    ),
				    new MemberListElement (
					"pl0-64",
					6
				    ),
				    new MemberListElement (
					"pl0-68",
					7
				    ),
				    new MemberListElement (
					"pl0-72",
					8
				    ),
				    new MemberListElement (
					"pl0-76",
					9
				    ),
				    new MemberListElement (
					"pl0-80",
					10
				    ),
				    new MemberListElement (
					"pl0-84",
					11
				    ),
				    new MemberListElement (
					"pl0-88",
					12
				    ),
				    new MemberListElement (
					"pl0-92",
					13
				    ),
				    new MemberListElement (
					"pl0-96",
					14
				    ),
				    new MemberListElement (
					"pl1",
					15
				    )
				}
			    ),
			    0,
			    PuncturingLimit.pl0_40
			)
		    ),
		    "puncturingLimit",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' CommonTimeslotInfoMBMS object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CommonTimeslotInfoMBMS object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CommonTimeslotInfoMBMS
