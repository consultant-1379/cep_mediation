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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MBMSGeneralInformation_v890ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSGeneralInformation_v890ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSGeneralInformation_v890ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSGeneralInformation_v890ext_IEs(rrc.informationelements.MBMS_NetworkStandardTimeInformation_LCR_v890ext mbmsNetworkStandardTimeInformation_LCR, 
		    rrc.informationelements.MBMS_MICHConfigurationInfo_v890ext mbmsMICHConfiguration)
    {
	setMbmsNetworkStandardTimeInformation_LCR(mbmsNetworkStandardTimeInformation_LCR);
	setMbmsMICHConfiguration(mbmsMICHConfiguration);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MBMS_NetworkStandardTimeInformation_LCR_v890ext();
	mComponents[1] = new rrc.informationelements.MBMS_MICHConfigurationInfo_v890ext();
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
		return new rrc.informationelements.MBMS_NetworkStandardTimeInformation_LCR_v890ext();
	    case 1:
		return new rrc.informationelements.MBMS_MICHConfigurationInfo_v890ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbmsNetworkStandardTimeInformation_LCR"
    public rrc.informationelements.MBMS_NetworkStandardTimeInformation_LCR_v890ext getMbmsNetworkStandardTimeInformation_LCR()
    {
	return (rrc.informationelements.MBMS_NetworkStandardTimeInformation_LCR_v890ext)mComponents[0];
    }
    
    public void setMbmsNetworkStandardTimeInformation_LCR(rrc.informationelements.MBMS_NetworkStandardTimeInformation_LCR_v890ext mbmsNetworkStandardTimeInformation_LCR)
    {
	mComponents[0] = mbmsNetworkStandardTimeInformation_LCR;
    }
    
    public boolean hasMbmsNetworkStandardTimeInformation_LCR()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMbmsNetworkStandardTimeInformation_LCR()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "mbmsMICHConfiguration"
    public rrc.informationelements.MBMS_MICHConfigurationInfo_v890ext getMbmsMICHConfiguration()
    {
	return (rrc.informationelements.MBMS_MICHConfigurationInfo_v890ext)mComponents[1];
    }
    
    public void setMbmsMICHConfiguration(rrc.informationelements.MBMS_MICHConfigurationInfo_v890ext mbmsMICHConfiguration)
    {
	mComponents[1] = mbmsMICHConfiguration;
    }
    
    public boolean hasMbmsMICHConfiguration()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMbmsMICHConfiguration()
    {
	setComponentAbsent(1);
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
	    "rrc.pdu_definitions",
	    "MBMSGeneralInformation_v890ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSGeneralInformation-v890ext-IEs"
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
				"MBMS_NetworkStandardTimeInformation_LCR_v890ext"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-NetworkStandardTimeInformation-LCR-v890ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_NetworkStandardTimeInformation_LCR_v890ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_NetworkStandardTimeInformation_LCR_v890ext"
				)
			    ),
			    0
			)
		    ),
		    "mbmsNetworkStandardTimeInformation-LCR",
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
				"MBMS_MICHConfigurationInfo_v890ext"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-MICHConfigurationInfo-v890ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_MICHConfigurationInfo_v890ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_MICHConfigurationInfo_v890ext"
				)
			    ),
			    0
			)
		    ),
		    "mbmsMICHConfiguration",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMSGeneralInformation_v890ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSGeneralInformation_v890ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSGeneralInformation_v890ext_IEs
