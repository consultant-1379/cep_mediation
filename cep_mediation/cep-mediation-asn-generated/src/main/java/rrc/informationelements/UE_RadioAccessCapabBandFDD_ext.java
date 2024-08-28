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
 * Define the ASN1 Type UE_RadioAccessCapabBandFDD_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabBandFDD_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabBandFDD_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabBandFDD_ext(RadioFrequencyBandFDD radioFrequencyBandFDD, 
		    CompressedModeMeasCapabFDDList_ext compressedModeMeasCapabFDDList_ext)
    {
	setRadioFrequencyBandFDD(radioFrequencyBandFDD);
	setCompressedModeMeasCapabFDDList_ext(compressedModeMeasCapabFDDList_ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = RadioFrequencyBandFDD.fdd2100;
	mComponents[1] = new CompressedModeMeasCapabFDDList_ext();
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
		return RadioFrequencyBandFDD.fdd2100;
	    case 1:
		return new CompressedModeMeasCapabFDDList_ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "radioFrequencyBandFDD"
    public RadioFrequencyBandFDD getRadioFrequencyBandFDD()
    {
	return (RadioFrequencyBandFDD)mComponents[0];
    }
    
    public void setRadioFrequencyBandFDD(RadioFrequencyBandFDD radioFrequencyBandFDD)
    {
	mComponents[0] = radioFrequencyBandFDD;
    }
    
    
    // Methods for field "compressedModeMeasCapabFDDList_ext"
    public CompressedModeMeasCapabFDDList_ext getCompressedModeMeasCapabFDDList_ext()
    {
	return (CompressedModeMeasCapabFDDList_ext)mComponents[1];
    }
    
    public void setCompressedModeMeasCapabFDDList_ext(CompressedModeMeasCapabFDDList_ext compressedModeMeasCapabFDDList_ext)
    {
	mComponents[1] = compressedModeMeasCapabFDDList_ext;
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
	    "UE_RadioAccessCapabBandFDD_ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabBandFDD-ext"
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
				"RadioFrequencyBandFDD"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandFDD"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"fdd2100",
					0
				    ),
				    new MemberListElement (
					"fdd1900",
					1
				    ),
				    new MemberListElement (
					"fdd1800",
					2
				    ),
				    new MemberListElement (
					"bandVI",
					3
				    ),
				    new MemberListElement (
					"bandIV",
					4
				    ),
				    new MemberListElement (
					"bandV",
					5
				    ),
				    new MemberListElement (
					"bandVII",
					6
				    ),
				    new MemberListElement (
					"extension-indicator",
					7
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandFDD.fdd2100
			)
		    ),
		    "radioFrequencyBandFDD",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CompressedModeMeasCapabFDDList_ext"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapabFDDList-ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapabFDD_ext"
				)
			    )
			)
		    ),
		    "compressedModeMeasCapabFDDList-ext",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabBandFDD_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabBandFDD_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabBandFDD_ext
