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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type RLC_Capability_r5 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class RLC_Capability_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RLC_Capability_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RLC_Capability_r5(TotalRLC_AM_BufferSize_r5 totalRLC_AM_BufferSize, 
		    rrc.informationelements.MaximumRLC_WindowSize maximumRLC_WindowSize, 
		    rrc.informationelements.MaximumAM_EntityNumberRLC_Cap maximumAM_EntityNumber)
    {
	setTotalRLC_AM_BufferSize(totalRLC_AM_BufferSize);
	setMaximumRLC_WindowSize(maximumRLC_WindowSize);
	setMaximumAM_EntityNumber(maximumAM_EntityNumber);
    }
    
    public void initComponents()
    {
	mComponents[0] = TotalRLC_AM_BufferSize_r5.kb10;
	mComponents[1] = rrc.informationelements.MaximumRLC_WindowSize.mws2047;
	mComponents[2] = rrc.informationelements.MaximumAM_EntityNumberRLC_Cap.dummy;
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
		return TotalRLC_AM_BufferSize_r5.kb10;
	    case 1:
		return rrc.informationelements.MaximumRLC_WindowSize.mws2047;
	    case 2:
		return rrc.informationelements.MaximumAM_EntityNumberRLC_Cap.dummy;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "totalRLC_AM_BufferSize"
    public TotalRLC_AM_BufferSize_r5 getTotalRLC_AM_BufferSize()
    {
	return (TotalRLC_AM_BufferSize_r5)mComponents[0];
    }
    
    public void setTotalRLC_AM_BufferSize(TotalRLC_AM_BufferSize_r5 totalRLC_AM_BufferSize)
    {
	mComponents[0] = totalRLC_AM_BufferSize;
    }
    
    
    // Methods for field "maximumRLC_WindowSize"
    public rrc.informationelements.MaximumRLC_WindowSize getMaximumRLC_WindowSize()
    {
	return (rrc.informationelements.MaximumRLC_WindowSize)mComponents[1];
    }
    
    public void setMaximumRLC_WindowSize(rrc.informationelements.MaximumRLC_WindowSize maximumRLC_WindowSize)
    {
	mComponents[1] = maximumRLC_WindowSize;
    }
    
    
    // Methods for field "maximumAM_EntityNumber"
    public rrc.informationelements.MaximumAM_EntityNumberRLC_Cap getMaximumAM_EntityNumber()
    {
	return (rrc.informationelements.MaximumAM_EntityNumberRLC_Cap)mComponents[2];
    }
    
    public void setMaximumAM_EntityNumber(rrc.informationelements.MaximumAM_EntityNumberRLC_Cap maximumAM_EntityNumber)
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
	    "rrc.internode_definitions",
	    "RLC_Capability_r5"
	),
	new QName (
	    "Internode-definitions",
	    "RLC-Capability-r5"
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
				"rrc.internode_definitions",
				"TotalRLC_AM_BufferSize_r5"
			    ),
			    new QName (
				"Internode-definitions",
				"TotalRLC-AM-BufferSize-r5"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"kb10",
					0
				    ),
				    new MemberListElement (
					"kb50",
					1
				    ),
				    new MemberListElement (
					"kb100",
					2
				    ),
				    new MemberListElement (
					"kb150",
					3
				    ),
				    new MemberListElement (
					"kb200",
					4
				    ),
				    new MemberListElement (
					"kb300",
					5
				    ),
				    new MemberListElement (
					"kb400",
					6
				    ),
				    new MemberListElement (
					"kb500",
					7
				    ),
				    new MemberListElement (
					"kb750",
					8
				    ),
				    new MemberListElement (
					"kb1000",
					9
				    )
				}
			    ),
			    0,
			    TotalRLC_AM_BufferSize_r5.kb10
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
			    rrc.informationelements.MaximumRLC_WindowSize.mws2047
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
			    rrc.informationelements.MaximumAM_EntityNumberRLC_Cap.dummy
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
     * Get the type descriptor (TypeInfo) of 'this' RLC_Capability_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RLC_Capability_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RLC_Capability_r5
