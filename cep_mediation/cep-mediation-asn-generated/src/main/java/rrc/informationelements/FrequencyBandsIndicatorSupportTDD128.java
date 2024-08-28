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
 * Define the ASN1 Type FrequencyBandsIndicatorSupportTDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class FrequencyBandsIndicatorSupportTDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public FrequencyBandsIndicatorSupportTDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public FrequencyBandsIndicatorSupportTDD128(RadioFrequencyBandTDD_r10 frequencyBandsIndicatorTDD)
    {
	setFrequencyBandsIndicatorTDD(frequencyBandsIndicatorTDD);
    }
    
    public void initComponents()
    {
	mComponents[0] = RadioFrequencyBandTDD_r10.a;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return RadioFrequencyBandTDD_r10.a;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "frequencyBandsIndicatorTDD"
    public RadioFrequencyBandTDD_r10 getFrequencyBandsIndicatorTDD()
    {
	return (RadioFrequencyBandTDD_r10)mComponents[0];
    }
    
    public void setFrequencyBandsIndicatorTDD(RadioFrequencyBandTDD_r10 frequencyBandsIndicatorTDD)
    {
	mComponents[0] = frequencyBandsIndicatorTDD;
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
	    "FrequencyBandsIndicatorSupportTDD128"
	),
	new QName (
	    "InformationElements",
	    "FrequencyBandsIndicatorSupportTDD128"
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
				"RadioFrequencyBandTDD_r10"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandTDD-r10"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"a",
					0
				    ),
				    new MemberListElement (
					"b",
					1
				    ),
				    new MemberListElement (
					"c",
					2
				    ),
				    new MemberListElement (
					"d",
					3
				    ),
				    new MemberListElement (
					"e",
					4
				    ),
				    new MemberListElement (
					"f",
					5
				    ),
				    new MemberListElement (
					"spare2",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandTDD_r10.a
			)
		    ),
		    "frequencyBandsIndicatorTDD",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' FrequencyBandsIndicatorSupportTDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FrequencyBandsIndicatorSupportTDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FrequencyBandsIndicatorSupportTDD128
