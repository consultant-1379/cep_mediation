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
 * Define the ASN1 Type NewTiming from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NewTiming extends Sequence {
    
    /**
     * The default constructor.
     */
    public NewTiming()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NewTiming(EnablingDelay enablingDelay, 
		    UE_DTX_DRX_Offset ue_dtx_drx_Offset)
    {
	setEnablingDelay(enablingDelay);
	setUe_dtx_drx_Offset(ue_dtx_drx_Offset);
    }
    
    public void initComponents()
    {
	mComponents[0] = EnablingDelay.radio_frames_0;
	mComponents[1] = new UE_DTX_DRX_Offset();
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
		return EnablingDelay.radio_frames_0;
	    case 1:
		return new UE_DTX_DRX_Offset();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "enablingDelay"
    public EnablingDelay getEnablingDelay()
    {
	return (EnablingDelay)mComponents[0];
    }
    
    public void setEnablingDelay(EnablingDelay enablingDelay)
    {
	mComponents[0] = enablingDelay;
    }
    
    
    // Methods for field "ue_dtx_drx_Offset"
    public UE_DTX_DRX_Offset getUe_dtx_drx_Offset()
    {
	return (UE_DTX_DRX_Offset)mComponents[1];
    }
    
    public void setUe_dtx_drx_Offset(UE_DTX_DRX_Offset ue_dtx_drx_Offset)
    {
	mComponents[1] = ue_dtx_drx_Offset;
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
	    "NewTiming"
	),
	new QName (
	    "InformationElements",
	    "NewTiming"
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
				"EnablingDelay"
			    ),
			    new QName (
				"InformationElements",
				"EnablingDelay"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"radio-frames-0",
					0
				    ),
				    new MemberListElement (
					"radio-frames-1",
					1
				    ),
				    new MemberListElement (
					"radio-frames-2",
					2
				    ),
				    new MemberListElement (
					"radio-frames-4",
					3
				    ),
				    new MemberListElement (
					"radio-frames-8",
					4
				    ),
				    new MemberListElement (
					"radio-frames-16",
					5
				    ),
				    new MemberListElement (
					"radio-frames-32",
					6
				    ),
				    new MemberListElement (
					"radio-frames-64",
					7
				    ),
				    new MemberListElement (
					"radio-frames-128",
					8
				    ),
				    new MemberListElement (
					"spare7",
					9
				    ),
				    new MemberListElement (
					"spare6",
					10
				    ),
				    new MemberListElement (
					"spare5",
					11
				    ),
				    new MemberListElement (
					"spare4",
					12
				    ),
				    new MemberListElement (
					"spare3",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    EnablingDelay.radio_frames_0
			)
		    ),
		    "enablingDelay",
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
				"UE_DTX_DRX_Offset"
			    ),
			    new QName (
				"InformationElements",
				"UE-DTX-DRX-Offset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UE_DTX_DRX_Offset(0), 
				    new UE_DTX_DRX_Offset(159),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(159)
			    ),
			    null
			)
		    ),
		    "ue-dtx-drx-Offset",
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
     * Get the type descriptor (TypeInfo) of 'this' NewTiming object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NewTiming object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NewTiming
