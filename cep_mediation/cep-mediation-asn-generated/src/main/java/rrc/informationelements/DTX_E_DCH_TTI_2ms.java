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
 * Define the ASN1 Type DTX_E_DCH_TTI_2ms from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DTX_E_DCH_TTI_2ms extends Sequence {
    
    /**
     * The default constructor.
     */
    public DTX_E_DCH_TTI_2ms()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DTX_E_DCH_TTI_2ms(UE_DTX_Cycle1_2ms ue_dtx_Cycle1_2ms, 
		    UE_DTX_Cycle2_2ms ue_dtx_Cycle2_2ms, 
		    MAC_DTX_Cycle_2ms mac_dtx_Cycle_2ms)
    {
	setUe_dtx_Cycle1_2ms(ue_dtx_Cycle1_2ms);
	setUe_dtx_Cycle2_2ms(ue_dtx_Cycle2_2ms);
	setMac_dtx_Cycle_2ms(mac_dtx_Cycle_2ms);
    }
    
    public void initComponents()
    {
	mComponents[0] = UE_DTX_Cycle1_2ms.sub_frames_1;
	mComponents[1] = UE_DTX_Cycle2_2ms.sub_frames_4;
	mComponents[2] = MAC_DTX_Cycle_2ms.sub_frames_1;
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
		return UE_DTX_Cycle1_2ms.sub_frames_1;
	    case 1:
		return UE_DTX_Cycle2_2ms.sub_frames_4;
	    case 2:
		return MAC_DTX_Cycle_2ms.sub_frames_1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_dtx_Cycle1_2ms"
    public UE_DTX_Cycle1_2ms getUe_dtx_Cycle1_2ms()
    {
	return (UE_DTX_Cycle1_2ms)mComponents[0];
    }
    
    public void setUe_dtx_Cycle1_2ms(UE_DTX_Cycle1_2ms ue_dtx_Cycle1_2ms)
    {
	mComponents[0] = ue_dtx_Cycle1_2ms;
    }
    
    
    // Methods for field "ue_dtx_Cycle2_2ms"
    public UE_DTX_Cycle2_2ms getUe_dtx_Cycle2_2ms()
    {
	return (UE_DTX_Cycle2_2ms)mComponents[1];
    }
    
    public void setUe_dtx_Cycle2_2ms(UE_DTX_Cycle2_2ms ue_dtx_Cycle2_2ms)
    {
	mComponents[1] = ue_dtx_Cycle2_2ms;
    }
    
    
    // Methods for field "mac_dtx_Cycle_2ms"
    public MAC_DTX_Cycle_2ms getMac_dtx_Cycle_2ms()
    {
	return (MAC_DTX_Cycle_2ms)mComponents[2];
    }
    
    public void setMac_dtx_Cycle_2ms(MAC_DTX_Cycle_2ms mac_dtx_Cycle_2ms)
    {
	mComponents[2] = mac_dtx_Cycle_2ms;
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
	    "DTX_E_DCH_TTI_2ms"
	),
	new QName (
	    "InformationElements",
	    "DTX-E-DCH-TTI-2ms"
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
				"UE_DTX_Cycle1_2ms"
			    ),
			    new QName (
				"InformationElements",
				"UE-DTX-Cycle1-2ms"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-1",
					0
				    ),
				    new MemberListElement (
					"sub-frames-4",
					1
				    ),
				    new MemberListElement (
					"sub-frames-5",
					2
				    ),
				    new MemberListElement (
					"sub-frames-8",
					3
				    ),
				    new MemberListElement (
					"sub-frames-10",
					4
				    ),
				    new MemberListElement (
					"sub-frames-16",
					5
				    ),
				    new MemberListElement (
					"sub-frames-20",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    UE_DTX_Cycle1_2ms.sub_frames_1
			)
		    ),
		    "ue-dtx-Cycle1-2ms",
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
				"UE_DTX_Cycle2_2ms"
			    ),
			    new QName (
				"InformationElements",
				"UE-DTX-Cycle2-2ms"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-4",
					0
				    ),
				    new MemberListElement (
					"sub-frames-5",
					1
				    ),
				    new MemberListElement (
					"sub-frames-8",
					2
				    ),
				    new MemberListElement (
					"sub-frames-10",
					3
				    ),
				    new MemberListElement (
					"sub-frames-16",
					4
				    ),
				    new MemberListElement (
					"sub-frames-20",
					5
				    ),
				    new MemberListElement (
					"sub-frames-32",
					6
				    ),
				    new MemberListElement (
					"sub-frames-40",
					7
				    ),
				    new MemberListElement (
					"sub-frames-64",
					8
				    ),
				    new MemberListElement (
					"sub-frames-80",
					9
				    ),
				    new MemberListElement (
					"sub-frames-128",
					10
				    ),
				    new MemberListElement (
					"sub-frames-160",
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
			    UE_DTX_Cycle2_2ms.sub_frames_4
			)
		    ),
		    "ue-dtx-Cycle2-2ms",
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
				"MAC_DTX_Cycle_2ms"
			    ),
			    new QName (
				"InformationElements",
				"MAC-DTX-Cycle-2ms"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-1",
					0
				    ),
				    new MemberListElement (
					"sub-frames-4",
					1
				    ),
				    new MemberListElement (
					"sub-frames-5",
					2
				    ),
				    new MemberListElement (
					"sub-frames-8",
					3
				    ),
				    new MemberListElement (
					"sub-frames-10",
					4
				    ),
				    new MemberListElement (
					"sub-frames-16",
					5
				    ),
				    new MemberListElement (
					"sub-frames-20",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    MAC_DTX_Cycle_2ms.sub_frames_1
			)
		    ),
		    "mac-dtx-Cycle-2ms",
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
     * Get the type descriptor (TypeInfo) of 'this' DTX_E_DCH_TTI_2ms object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DTX_E_DCH_TTI_2ms object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DTX_E_DCH_TTI_2ms
