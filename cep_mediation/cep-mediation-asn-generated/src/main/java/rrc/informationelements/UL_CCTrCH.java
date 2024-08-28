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
 * Define the ASN1 Type UL_CCTrCH from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_CCTrCH extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_CCTrCH()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_CCTrCH(TFCS_IdentityPlain tfcs_ID, UL_TargetSIR ul_TargetSIR, 
		    TimeInfo timeInfo, CommonTimeslotInfo commonTimeslotInfo, 
		    UplinkTimeslotsCodes ul_CCTrCH_TimeslotsCodes)
    {
	setTfcs_ID(tfcs_ID);
	setUl_TargetSIR(ul_TargetSIR);
	setTimeInfo(timeInfo);
	setCommonTimeslotInfo(commonTimeslotInfo);
	setUl_CCTrCH_TimeslotsCodes(ul_CCTrCH_TimeslotsCodes);
    }
    
    /**
     * Construct with required components.
     */
    public UL_CCTrCH(UL_TargetSIR ul_TargetSIR, TimeInfo timeInfo)
    {
	setUl_TargetSIR(ul_TargetSIR);
	setTimeInfo(timeInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TFCS_IdentityPlain();
	mComponents[1] = new UL_TargetSIR();
	mComponents[2] = new TimeInfo();
	mComponents[3] = new CommonTimeslotInfo();
	mComponents[4] = new UplinkTimeslotsCodes();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new TFCS_IdentityPlain();
	    case 1:
		return new UL_TargetSIR();
	    case 2:
		return new TimeInfo();
	    case 3:
		return new CommonTimeslotInfo();
	    case 4:
		return new UplinkTimeslotsCodes();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final TFCS_IdentityPlain tfcs_ID__default = 
	new TFCS_IdentityPlain(1);
    
    // Methods for field "tfcs_ID"
    public TFCS_IdentityPlain getTfcs_ID()
    {
	if (hasTfcs_ID())
	    return (TFCS_IdentityPlain)mComponents[0];
	else
	    return (TFCS_IdentityPlain)tfcs_ID__default.clone();
    }
    
    public void setTfcs_ID(TFCS_IdentityPlain tfcs_ID)
    {
	mComponents[0] = tfcs_ID;
    }
    
    public void setTfcs_IDToDefault()
    {
	setTfcs_ID(tfcs_ID__default);
    }
    
    public boolean hasDefaultTfcs_ID()
    {
	return true;
    }
    
    public boolean hasTfcs_ID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTfcs_ID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ul_TargetSIR"
    public UL_TargetSIR getUl_TargetSIR()
    {
	return (UL_TargetSIR)mComponents[1];
    }
    
    public void setUl_TargetSIR(UL_TargetSIR ul_TargetSIR)
    {
	mComponents[1] = ul_TargetSIR;
    }
    
    
    // Methods for field "timeInfo"
    public TimeInfo getTimeInfo()
    {
	return (TimeInfo)mComponents[2];
    }
    
    public void setTimeInfo(TimeInfo timeInfo)
    {
	mComponents[2] = timeInfo;
    }
    
    
    // Methods for field "commonTimeslotInfo"
    public CommonTimeslotInfo getCommonTimeslotInfo()
    {
	return (CommonTimeslotInfo)mComponents[3];
    }
    
    public void setCommonTimeslotInfo(CommonTimeslotInfo commonTimeslotInfo)
    {
	mComponents[3] = commonTimeslotInfo;
    }
    
    public boolean hasCommonTimeslotInfo()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCommonTimeslotInfo()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "ul_CCTrCH_TimeslotsCodes"
    public UplinkTimeslotsCodes getUl_CCTrCH_TimeslotsCodes()
    {
	return (UplinkTimeslotsCodes)mComponents[4];
    }
    
    public void setUl_CCTrCH_TimeslotsCodes(UplinkTimeslotsCodes ul_CCTrCH_TimeslotsCodes)
    {
	mComponents[4] = ul_CCTrCH_TimeslotsCodes;
    }
    
    public boolean hasUl_CCTrCH_TimeslotsCodes()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUl_CCTrCH_TimeslotsCodes()
    {
	setComponentAbsent(4);
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
	    "UL_CCTrCH"
	),
	new QName (
	    "InformationElements",
	    "UL-CCTrCH"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS_IdentityPlain"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-IdentityPlain"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TFCS_IdentityPlain(1), 
				    new TFCS_IdentityPlain(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "tfcs-ID",
		    0,
		    3,
		    tfcs_ID__default
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
				"UL_TargetSIR"
			    ),
			    new QName (
				"InformationElements",
				"UL-TargetSIR"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UL_TargetSIR(0), 
				    new UL_TargetSIR(62),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(62)
			    ),
			    null
			)
		    ),
		    "ul-TargetSIR",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TimeInfo"
			    ),
			    new QName (
				"InformationElements",
				"TimeInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TimeInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TimeInfo"
				)
			    ),
			    0
			)
		    ),
		    "timeInfo",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CommonTimeslotInfo"
			    ),
			    new QName (
				"InformationElements",
				"CommonTimeslotInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CommonTimeslotInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CommonTimeslotInfo"
				)
			    ),
			    0
			)
		    ),
		    "commonTimeslotInfo",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UplinkTimeslotsCodes"
			    ),
			    new QName (
				"InformationElements",
				"UplinkTimeslotsCodes"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UplinkTimeslotsCodes"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UplinkTimeslotsCodes"
				)
			    ),
			    0
			)
		    ),
		    "ul-CCTrCH-TimeslotsCodes",
		    4,
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
			new TagDecoderElement((short)0x8001, 1)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_CCTrCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_CCTrCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_CCTrCH
