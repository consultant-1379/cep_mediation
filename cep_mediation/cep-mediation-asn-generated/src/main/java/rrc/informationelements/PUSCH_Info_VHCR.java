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
 * Define the ASN1 Type PUSCH_Info_VHCR from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PUSCH_Info_VHCR extends Sequence {
    
    /**
     * The default constructor.
     */
    public PUSCH_Info_VHCR()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PUSCH_Info_VHCR(TFCS_IdentityPlain tfcs_ID, 
		    CommonTimeslotInfo commonTimeslotInfo, 
		    UplinkTimeslotsCodes_VHCR pusch_TimeslotsCodes_VHCR)
    {
	setTfcs_ID(tfcs_ID);
	setCommonTimeslotInfo(commonTimeslotInfo);
	setPusch_TimeslotsCodes_VHCR(pusch_TimeslotsCodes_VHCR);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TFCS_IdentityPlain();
	mComponents[1] = new CommonTimeslotInfo();
	mComponents[2] = new UplinkTimeslotsCodes_VHCR();
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
		return new TFCS_IdentityPlain();
	    case 1:
		return new CommonTimeslotInfo();
	    case 2:
		return new UplinkTimeslotsCodes_VHCR();
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
    
    
    // Methods for field "commonTimeslotInfo"
    public CommonTimeslotInfo getCommonTimeslotInfo()
    {
	return (CommonTimeslotInfo)mComponents[1];
    }
    
    public void setCommonTimeslotInfo(CommonTimeslotInfo commonTimeslotInfo)
    {
	mComponents[1] = commonTimeslotInfo;
    }
    
    public boolean hasCommonTimeslotInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCommonTimeslotInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "pusch_TimeslotsCodes_VHCR"
    public UplinkTimeslotsCodes_VHCR getPusch_TimeslotsCodes_VHCR()
    {
	return (UplinkTimeslotsCodes_VHCR)mComponents[2];
    }
    
    public void setPusch_TimeslotsCodes_VHCR(UplinkTimeslotsCodes_VHCR pusch_TimeslotsCodes_VHCR)
    {
	mComponents[2] = pusch_TimeslotsCodes_VHCR;
    }
    
    public boolean hasPusch_TimeslotsCodes_VHCR()
    {
	return componentIsPresent(2);
    }
    
    public void deletePusch_TimeslotsCodes_VHCR()
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
	    "PUSCH_Info_VHCR"
	),
	new QName (
	    "InformationElements",
	    "PUSCH-Info-VHCR"
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
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    1,
		    3,
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
				"UplinkTimeslotsCodes_VHCR"
			    ),
			    new QName (
				"InformationElements",
				"UplinkTimeslotsCodes-VHCR"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UplinkTimeslotsCodes_VHCR"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UplinkTimeslotsCodes_VHCR"
				)
			    ),
			    0
			)
		    ),
		    "pusch-TimeslotsCodes-VHCR",
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
     * Get the type descriptor (TypeInfo) of 'this' PUSCH_Info_VHCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PUSCH_Info_VHCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PUSCH_Info_VHCR
