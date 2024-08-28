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
 * Define the ASN1 Type UL_PhysChCapabilityFDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_PhysChCapabilityFDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_PhysChCapabilityFDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_PhysChCapabilityFDD(MaxNoDPDCH_BitsTransmitted maxNoDPDCH_BitsTransmitted, 
		    BOOLEAN dummy)
    {
	setMaxNoDPDCH_BitsTransmitted(maxNoDPDCH_BitsTransmitted);
	setDummy(dummy);
    }
    
    /**
     * Construct with components.
     */
    public UL_PhysChCapabilityFDD(MaxNoDPDCH_BitsTransmitted maxNoDPDCH_BitsTransmitted, 
		    boolean dummy)
    {
	this(maxNoDPDCH_BitsTransmitted, new BOOLEAN(dummy));
    }
    
    public void initComponents()
    {
	mComponents[0] = MaxNoDPDCH_BitsTransmitted.b600;
	mComponents[1] = new BOOLEAN();
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
		return MaxNoDPDCH_BitsTransmitted.b600;
	    case 1:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxNoDPDCH_BitsTransmitted"
    public MaxNoDPDCH_BitsTransmitted getMaxNoDPDCH_BitsTransmitted()
    {
	return (MaxNoDPDCH_BitsTransmitted)mComponents[0];
    }
    
    public void setMaxNoDPDCH_BitsTransmitted(MaxNoDPDCH_BitsTransmitted maxNoDPDCH_BitsTransmitted)
    {
	mComponents[0] = maxNoDPDCH_BitsTransmitted;
    }
    
    
    // Methods for field "dummy"
    public boolean getDummy()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setDummy(boolean dummy)
    {
	setDummy(new BOOLEAN(dummy));
    }
    
    public void setDummy(BOOLEAN dummy)
    {
	mComponents[1] = dummy;
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
	    "UL_PhysChCapabilityFDD"
	),
	new QName (
	    "InformationElements",
	    "UL-PhysChCapabilityFDD"
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
				"MaxNoDPDCH_BitsTransmitted"
			    ),
			    new QName (
				"InformationElements",
				"MaxNoDPDCH-BitsTransmitted"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"b600",
					0
				    ),
				    new MemberListElement (
					"b1200",
					1
				    ),
				    new MemberListElement (
					"b2400",
					2
				    ),
				    new MemberListElement (
					"b4800",
					3
				    ),
				    new MemberListElement (
					"b9600",
					4
				    ),
				    new MemberListElement (
					"b19200",
					5
				    ),
				    new MemberListElement (
					"b28800",
					6
				    ),
				    new MemberListElement (
					"b38400",
					7
				    ),
				    new MemberListElement (
					"b48000",
					8
				    ),
				    new MemberListElement (
					"b57600",
					9
				    )
				}
			    ),
			    0,
			    MaxNoDPDCH_BitsTransmitted.b600
			)
		    ),
		    "maxNoDPDCH-BitsTransmitted",
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
		    "dummy",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityFDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityFDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_PhysChCapabilityFDD
