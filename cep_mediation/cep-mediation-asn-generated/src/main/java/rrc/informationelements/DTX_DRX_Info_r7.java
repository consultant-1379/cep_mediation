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
 * Define the ASN1 Type DTX_DRX_Info_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DTX_DRX_Info_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DTX_DRX_Info_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DTX_DRX_Info_r7(DTX_Info dtx_Info, DRX_Info drx_Info, 
		    Uplink_DPCCH_Slot_Format_Information uplink_DPCCHSlotFormatInformation)
    {
	setDtx_Info(dtx_Info);
	setDrx_Info(drx_Info);
	setUplink_DPCCHSlotFormatInformation(uplink_DPCCHSlotFormatInformation);
    }
    
    /**
     * Construct with required components.
     */
    public DTX_DRX_Info_r7(Uplink_DPCCH_Slot_Format_Information uplink_DPCCHSlotFormatInformation)
    {
	setUplink_DPCCHSlotFormatInformation(uplink_DPCCHSlotFormatInformation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DTX_Info();
	mComponents[1] = new DRX_Info();
	mComponents[2] = Uplink_DPCCH_Slot_Format_Information.slot_format_1;
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
		return new DTX_Info();
	    case 1:
		return new DRX_Info();
	    case 2:
		return Uplink_DPCCH_Slot_Format_Information.slot_format_1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dtx_Info"
    public DTX_Info getDtx_Info()
    {
	return (DTX_Info)mComponents[0];
    }
    
    public void setDtx_Info(DTX_Info dtx_Info)
    {
	mComponents[0] = dtx_Info;
    }
    
    public boolean hasDtx_Info()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDtx_Info()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "drx_Info"
    public DRX_Info getDrx_Info()
    {
	return (DRX_Info)mComponents[1];
    }
    
    public void setDrx_Info(DRX_Info drx_Info)
    {
	mComponents[1] = drx_Info;
    }
    
    public boolean hasDrx_Info()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDrx_Info()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "uplink_DPCCHSlotFormatInformation"
    public Uplink_DPCCH_Slot_Format_Information getUplink_DPCCHSlotFormatInformation()
    {
	return (Uplink_DPCCH_Slot_Format_Information)mComponents[2];
    }
    
    public void setUplink_DPCCHSlotFormatInformation(Uplink_DPCCH_Slot_Format_Information uplink_DPCCHSlotFormatInformation)
    {
	mComponents[2] = uplink_DPCCHSlotFormatInformation;
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
	    "DTX_DRX_Info_r7"
	),
	new QName (
	    "InformationElements",
	    "DTX-DRX-Info-r7"
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
				"DTX_Info"
			    ),
			    new QName (
				"InformationElements",
				"DTX-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DTX_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DTX_Info"
				)
			    ),
			    0
			)
		    ),
		    "dtx-Info",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DRX_Info"
			    ),
			    new QName (
				"InformationElements",
				"DRX-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DRX_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DRX_Info"
				)
			    ),
			    0
			)
		    ),
		    "drx-Info",
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
				"Uplink_DPCCH_Slot_Format_Information"
			    ),
			    new QName (
				"InformationElements",
				"Uplink-DPCCH-Slot-Format-Information"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"slot-format-1",
					0
				    ),
				    new MemberListElement (
					"dummy",
					1
				    ),
				    new MemberListElement (
					"slot-format-4",
					2
				    ),
				    new MemberListElement (
					"spare1",
					3
				    )
				}
			    ),
			    0,
			    Uplink_DPCCH_Slot_Format_Information.slot_format_1
			)
		    ),
		    "uplink-DPCCHSlotFormatInformation",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' DTX_DRX_Info_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DTX_DRX_Info_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DTX_DRX_Info_r7
