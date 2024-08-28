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
 * Define the ASN1 Type MBMS_MSCH_ConfigurationInfo_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_MSCH_ConfigurationInfo_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_MSCH_ConfigurationInfo_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_MSCH_ConfigurationInfo_r6(MBMS_MSCHSchedulingInfo mschShedulingInfo, 
		    RLC_Info_MSCH_r6 rlc_Info, 
		    MBMS_TCTF_Presence tctf_Presence)
    {
	setMschShedulingInfo(mschShedulingInfo);
	setRlc_Info(rlc_Info);
	setTctf_Presence(tctf_Presence);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_MSCHSchedulingInfo();
	mComponents[1] = new RLC_Info_MSCH_r6();
	mComponents[2] = MBMS_TCTF_Presence._false;
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
		return new MBMS_MSCHSchedulingInfo();
	    case 1:
		return new RLC_Info_MSCH_r6();
	    case 2:
		return MBMS_TCTF_Presence._false;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mschShedulingInfo"
    public MBMS_MSCHSchedulingInfo getMschShedulingInfo()
    {
	return (MBMS_MSCHSchedulingInfo)mComponents[0];
    }
    
    public void setMschShedulingInfo(MBMS_MSCHSchedulingInfo mschShedulingInfo)
    {
	mComponents[0] = mschShedulingInfo;
    }
    
    public boolean hasMschShedulingInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMschShedulingInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "rlc_Info"
    public RLC_Info_MSCH_r6 getRlc_Info()
    {
	return (RLC_Info_MSCH_r6)mComponents[1];
    }
    
    public void setRlc_Info(RLC_Info_MSCH_r6 rlc_Info)
    {
	mComponents[1] = rlc_Info;
    }
    
    public boolean hasRlc_Info()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRlc_Info()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "tctf_Presence"
    public MBMS_TCTF_Presence getTctf_Presence()
    {
	return (MBMS_TCTF_Presence)mComponents[2];
    }
    
    public void setTctf_Presence(MBMS_TCTF_Presence tctf_Presence)
    {
	mComponents[2] = tctf_Presence;
    }
    
    public boolean hasTctf_Presence()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTctf_Presence()
    {
	setComponentAbsent(2);
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
	    "MBMS_MSCH_ConfigurationInfo_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-MSCH-ConfigurationInfo-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_MSCHSchedulingInfo"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-MSCHSchedulingInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_MSCHSchedulingInfo"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5)
				}
			    )
			)
		    ),
		    "mschShedulingInfo",
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
				"RLC_Info_MSCH_r6"
			    ),
			    new QName (
				"InformationElements",
				"RLC-Info-MSCH-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Info_MSCH_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Info_MSCH_r6"
				)
			    ),
			    0
			)
		    ),
		    "rlc-Info",
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
				"MBMS_TCTF_Presence"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-TCTF-Presence"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"false",
					0
				    )
				}
			    ),
			    0,
			    MBMS_TCTF_Presence._false
			)
		    ),
		    "tctf-Presence",
		    2,
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_MSCH_ConfigurationInfo_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_MSCH_ConfigurationInfo_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_MSCH_ConfigurationInfo_r6
