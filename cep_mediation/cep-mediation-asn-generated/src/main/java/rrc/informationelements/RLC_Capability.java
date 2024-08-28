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
 * Define the ASN1 Type RLC_Capability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RLC_Capability extends Sequence {
    
    /**
     * The default constructor.
     */
    public RLC_Capability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RLC_Capability(TotalRLC_AM_BufferSize totalRLC_AM_BufferSize, 
		    MaximumRLC_WindowSize maximumRLC_WindowSize, 
		    MaximumAM_EntityNumberRLC_Cap maximumAM_EntityNumber)
    {
	setTotalRLC_AM_BufferSize(totalRLC_AM_BufferSize);
	setMaximumRLC_WindowSize(maximumRLC_WindowSize);
	setMaximumAM_EntityNumber(maximumAM_EntityNumber);
    }
    
    public void initComponents()
    {
	mComponents[0] = TotalRLC_AM_BufferSize.dummy;
	mComponents[1] = MaximumRLC_WindowSize.mws2047;
	mComponents[2] = MaximumAM_EntityNumberRLC_Cap.dummy;
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
		return TotalRLC_AM_BufferSize.dummy;
	    case 1:
		return MaximumRLC_WindowSize.mws2047;
	    case 2:
		return MaximumAM_EntityNumberRLC_Cap.dummy;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "totalRLC_AM_BufferSize"
    public TotalRLC_AM_BufferSize getTotalRLC_AM_BufferSize()
    {
	return (TotalRLC_AM_BufferSize)mComponents[0];
    }
    
    public void setTotalRLC_AM_BufferSize(TotalRLC_AM_BufferSize totalRLC_AM_BufferSize)
    {
	mComponents[0] = totalRLC_AM_BufferSize;
    }
    
    
    // Methods for field "maximumRLC_WindowSize"
    public MaximumRLC_WindowSize getMaximumRLC_WindowSize()
    {
	return (MaximumRLC_WindowSize)mComponents[1];
    }
    
    public void setMaximumRLC_WindowSize(MaximumRLC_WindowSize maximumRLC_WindowSize)
    {
	mComponents[1] = maximumRLC_WindowSize;
    }
    
    
    // Methods for field "maximumAM_EntityNumber"
    public MaximumAM_EntityNumberRLC_Cap getMaximumAM_EntityNumber()
    {
	return (MaximumAM_EntityNumberRLC_Cap)mComponents[2];
    }
    
    public void setMaximumAM_EntityNumber(MaximumAM_EntityNumberRLC_Cap maximumAM_EntityNumber)
    {
	mComponents[2] = maximumAM_EntityNumber;
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
	    "RLC_Capability"
	),
	new QName (
	    "InformationElements",
	    "RLC-Capability"
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
				"TotalRLC_AM_BufferSize"
			    ),
			    new QName (
				"InformationElements",
				"TotalRLC-AM-BufferSize"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dummy",
					0
				    ),
				    new MemberListElement (
					"kb10",
					1
				    ),
				    new MemberListElement (
					"kb50",
					2
				    ),
				    new MemberListElement (
					"kb100",
					3
				    ),
				    new MemberListElement (
					"kb150",
					4
				    ),
				    new MemberListElement (
					"kb500",
					5
				    ),
				    new MemberListElement (
					"kb1000",
					6
				    ),
				    new MemberListElement (
					"spare",
					7
				    )
				}
			    ),
			    0,
			    TotalRLC_AM_BufferSize.dummy
			)
		    ),
		    "totalRLC-AM-BufferSize",
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
				"MaximumRLC_WindowSize"
			    ),
			    new QName (
				"InformationElements",
				"MaximumRLC-WindowSize"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mws2047",
					0
				    ),
				    new MemberListElement (
					"mws4095",
					1
				    )
				}
			    ),
			    0,
			    MaximumRLC_WindowSize.mws2047
			)
		    ),
		    "maximumRLC-WindowSize",
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
				"MaximumAM_EntityNumberRLC_Cap"
			    ),
			    new QName (
				"InformationElements",
				"MaximumAM-EntityNumberRLC-Cap"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dummy",
					0
				    ),
				    new MemberListElement (
					"am4",
					1
				    ),
				    new MemberListElement (
					"am5",
					2
				    ),
				    new MemberListElement (
					"am6",
					3
				    ),
				    new MemberListElement (
					"am8",
					4
				    ),
				    new MemberListElement (
					"am16",
					5
				    ),
				    new MemberListElement (
					"am30",
					6
				    )
				}
			    ),
			    0,
			    MaximumAM_EntityNumberRLC_Cap.dummy
			)
		    ),
		    "maximumAM-EntityNumber",
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
     * Get the type descriptor (TypeInfo) of 'this' RLC_Capability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RLC_Capability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RLC_Capability
