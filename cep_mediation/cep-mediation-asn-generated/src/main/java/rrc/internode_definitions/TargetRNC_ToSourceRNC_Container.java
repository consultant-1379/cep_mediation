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
 * Define the ASN1 Type TargetRNC_ToSourceRNC_Container from ASN1 Module Internode_definitions.
 * @see Choice
 */

public class TargetRNC_ToSourceRNC_Container extends Choice {
    
    /**
     * The default constructor.
     */
    public TargetRNC_ToSourceRNC_Container()
    {
    }
    
    public static final  int  radioBearerSetup_chosen = 1;
    public static final  int  radioBearerReconfiguration_chosen = 2;
    public static final  int  radioBearerRelease_chosen = 3;
    public static final  int  transportChannelReconfiguration_chosen = 4;
    public static final  int  physicalChannelReconfiguration_chosen = 5;
    public static final  int  rrc_FailureInfo_chosen = 6;
    public static final  int  dL_DCCHmessage_chosen = 7;
    public static final  int  extension_chosen = 8;
    
    // Methods for field "radioBearerSetup"
    public static TargetRNC_ToSourceRNC_Container createTargetRNC_ToSourceRNC_ContainerWithRadioBearerSetup(rrc.pdu_definitions.RadioBearerSetup radioBearerSetup)
    {
	TargetRNC_ToSourceRNC_Container __object = new TargetRNC_ToSourceRNC_Container();

	__object.setRadioBearerSetup(radioBearerSetup);
	return __object;
    }
    
    public boolean hasRadioBearerSetup()
    {
	return getChosenFlag() == radioBearerSetup_chosen;
    }
    
    public void setRadioBearerSetup(rrc.pdu_definitions.RadioBearerSetup radioBearerSetup)
    {
	setChosenValue(radioBearerSetup);
	setChosenFlag(radioBearerSetup_chosen);
    }
    
    
    // Methods for field "radioBearerReconfiguration"
    public static TargetRNC_ToSourceRNC_Container createTargetRNC_ToSourceRNC_ContainerWithRadioBearerReconfiguration(rrc.pdu_definitions.RadioBearerReconfiguration radioBearerReconfiguration)
    {
	TargetRNC_ToSourceRNC_Container __object = new TargetRNC_ToSourceRNC_Container();

	__object.setRadioBearerReconfiguration(radioBearerReconfiguration);
	return __object;
    }
    
    public boolean hasRadioBearerReconfiguration()
    {
	return getChosenFlag() == radioBearerReconfiguration_chosen;
    }
    
    public void setRadioBearerReconfiguration(rrc.pdu_definitions.RadioBearerReconfiguration radioBearerReconfiguration)
    {
	setChosenValue(radioBearerReconfiguration);
	setChosenFlag(radioBearerReconfiguration_chosen);
    }
    
    
    // Methods for field "radioBearerRelease"
    public static TargetRNC_ToSourceRNC_Container createTargetRNC_ToSourceRNC_ContainerWithRadioBearerRelease(rrc.pdu_definitions.RadioBearerRelease radioBearerRelease)
    {
	TargetRNC_ToSourceRNC_Container __object = new TargetRNC_ToSourceRNC_Container();

	__object.setRadioBearerRelease(radioBearerRelease);
	return __object;
    }
    
    public boolean hasRadioBearerRelease()
    {
	return getChosenFlag() == radioBearerRelease_chosen;
    }
    
    public void setRadioBearerRelease(rrc.pdu_definitions.RadioBearerRelease radioBearerRelease)
    {
	setChosenValue(radioBearerRelease);
	setChosenFlag(radioBearerRelease_chosen);
    }
    
    
    // Methods for field "transportChannelReconfiguration"
    public static TargetRNC_ToSourceRNC_Container createTargetRNC_ToSourceRNC_ContainerWithTransportChannelReconfiguration(rrc.pdu_definitions.TransportChannelReconfiguration transportChannelReconfiguration)
    {
	TargetRNC_ToSourceRNC_Container __object = new TargetRNC_ToSourceRNC_Container();

	__object.setTransportChannelReconfiguration(transportChannelReconfiguration);
	return __object;
    }
    
    public boolean hasTransportChannelReconfiguration()
    {
	return getChosenFlag() == transportChannelReconfiguration_chosen;
    }
    
    public void setTransportChannelReconfiguration(rrc.pdu_definitions.TransportChannelReconfiguration transportChannelReconfiguration)
    {
	setChosenValue(transportChannelReconfiguration);
	setChosenFlag(transportChannelReconfiguration_chosen);
    }
    
    
    // Methods for field "physicalChannelReconfiguration"
    public static TargetRNC_ToSourceRNC_Container createTargetRNC_ToSourceRNC_ContainerWithPhysicalChannelReconfiguration(rrc.pdu_definitions.PhysicalChannelReconfiguration physicalChannelReconfiguration)
    {
	TargetRNC_ToSourceRNC_Container __object = new TargetRNC_ToSourceRNC_Container();

	__object.setPhysicalChannelReconfiguration(physicalChannelReconfiguration);
	return __object;
    }
    
    public boolean hasPhysicalChannelReconfiguration()
    {
	return getChosenFlag() == physicalChannelReconfiguration_chosen;
    }
    
    public void setPhysicalChannelReconfiguration(rrc.pdu_definitions.PhysicalChannelReconfiguration physicalChannelReconfiguration)
    {
	setChosenValue(physicalChannelReconfiguration);
	setChosenFlag(physicalChannelReconfiguration_chosen);
    }
    
    
    // Methods for field "rrc_FailureInfo"
    public static TargetRNC_ToSourceRNC_Container createTargetRNC_ToSourceRNC_ContainerWithRrc_FailureInfo(rrc.pdu_definitions.RRC_FailureInfo rrc_FailureInfo)
    {
	TargetRNC_ToSourceRNC_Container __object = new TargetRNC_ToSourceRNC_Container();

	__object.setRrc_FailureInfo(rrc_FailureInfo);
	return __object;
    }
    
    public boolean hasRrc_FailureInfo()
    {
	return getChosenFlag() == rrc_FailureInfo_chosen;
    }
    
    public void setRrc_FailureInfo(rrc.pdu_definitions.RRC_FailureInfo rrc_FailureInfo)
    {
	setChosenValue(rrc_FailureInfo);
	setChosenFlag(rrc_FailureInfo_chosen);
    }
    
    
    // Methods for field "dL_DCCHmessage"
    public static TargetRNC_ToSourceRNC_Container createTargetRNC_ToSourceRNC_ContainerWithDL_DCCHmessage(OctetString dL_DCCHmessage)
    {
	TargetRNC_ToSourceRNC_Container __object = new TargetRNC_ToSourceRNC_Container();

	__object.setDL_DCCHmessage(dL_DCCHmessage);
	return __object;
    }
    
    public boolean hasDL_DCCHmessage()
    {
	return getChosenFlag() == dL_DCCHmessage_chosen;
    }
    
    public void setDL_DCCHmessage(OctetString dL_DCCHmessage)
    {
	setChosenValue(dL_DCCHmessage);
	setChosenFlag(dL_DCCHmessage_chosen);
    }
    
    
    // Methods for field "extension"
    public static TargetRNC_ToSourceRNC_Container createTargetRNC_ToSourceRNC_ContainerWithExtension(Null extension)
    {
	TargetRNC_ToSourceRNC_Container __object = new TargetRNC_ToSourceRNC_Container();

	__object.setExtension(extension);
	return __object;
    }
    
    public boolean hasExtension()
    {
	return getChosenFlag() == extension_chosen;
    }
    
    public void setExtension(Null extension)
    {
	setChosenValue(extension);
	setChosenFlag(extension_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case radioBearerSetup_chosen:
		return new rrc.pdu_definitions.RadioBearerSetup();
	    case radioBearerReconfiguration_chosen:
		return new rrc.pdu_definitions.RadioBearerReconfiguration();
	    case radioBearerRelease_chosen:
		return new rrc.pdu_definitions.RadioBearerRelease();
	    case transportChannelReconfiguration_chosen:
		return new rrc.pdu_definitions.TransportChannelReconfiguration();
	    case physicalChannelReconfiguration_chosen:
		return new rrc.pdu_definitions.PhysicalChannelReconfiguration();
	    case rrc_FailureInfo_chosen:
		return new rrc.pdu_definitions.RRC_FailureInfo();
	    case dL_DCCHmessage_chosen:
		return new OctetString();
	    case extension_chosen:
		return new Null();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.internode_definitions",
	    "TargetRNC_ToSourceRNC_Container"
	),
	new QName (
	    "Internode-definitions",
	    "TargetRNC-ToSourceRNC-Container"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerSetup"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerSetup"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerSetup"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "radioBearerSetup",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerReconfiguration"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerReconfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReconfiguration"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "radioBearerReconfiguration",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerRelease"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerRelease"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerRelease"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "radioBearerRelease",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"TransportChannelReconfiguration"
			    ),
			    new QName (
				"PDU-definitions",
				"TransportChannelReconfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportChannelReconfiguration"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "transportChannelReconfiguration",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"PhysicalChannelReconfiguration"
			    ),
			    new QName (
				"PDU-definitions",
				"PhysicalChannelReconfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PhysicalChannelReconfiguration"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "physicalChannelReconfiguration",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RRC_FailureInfo"
			    ),
			    new QName (
				"PDU-definitions",
				"RRC-FailureInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRC_FailureInfo"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "rrc-FailureInfo",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    12314,
			    null,
			    null
			)
		    ),
		    "dL-DCCHmessage",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "extension",
		    7,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TargetRNC_ToSourceRNC_Container object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TargetRNC_ToSourceRNC_Container object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for TargetRNC_ToSourceRNC_Container
