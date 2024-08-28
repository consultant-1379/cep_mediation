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
 * Define the ASN1 Type MBMS_PhyChInformation_IMB384 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_PhyChInformation_IMB384 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_PhyChInformation_IMB384()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_PhyChInformation_IMB384(MBMS_CommonPhyChIdentity mbms_CommonPhyChIdentity, 
		    SecondaryCCPCHFrameType2Info secondaryCCPCHInfo_MBMS)
    {
	setMbms_CommonPhyChIdentity(mbms_CommonPhyChIdentity);
	setSecondaryCCPCHInfo_MBMS(secondaryCCPCHInfo_MBMS);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_CommonPhyChIdentity();
	mComponents[1] = new SecondaryCCPCHFrameType2Info();
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
		return new MBMS_CommonPhyChIdentity();
	    case 1:
		return new SecondaryCCPCHFrameType2Info();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_CommonPhyChIdentity"
    public MBMS_CommonPhyChIdentity getMbms_CommonPhyChIdentity()
    {
	return (MBMS_CommonPhyChIdentity)mComponents[0];
    }
    
    public void setMbms_CommonPhyChIdentity(MBMS_CommonPhyChIdentity mbms_CommonPhyChIdentity)
    {
	mComponents[0] = mbms_CommonPhyChIdentity;
    }
    
    
    // Methods for field "secondaryCCPCHInfo_MBMS"
    public SecondaryCCPCHFrameType2Info getSecondaryCCPCHInfo_MBMS()
    {
	return (SecondaryCCPCHFrameType2Info)mComponents[1];
    }
    
    public void setSecondaryCCPCHInfo_MBMS(SecondaryCCPCHFrameType2Info secondaryCCPCHInfo_MBMS)
    {
	mComponents[1] = secondaryCCPCHInfo_MBMS;
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
	    "MBMS_PhyChInformation_IMB384"
	),
	new QName (
	    "InformationElements",
	    "MBMS-PhyChInformation-IMB384"
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
				"MBMS_CommonPhyChIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CommonPhyChIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_CommonPhyChIdentity(1), 
				    new MBMS_CommonPhyChIdentity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "mbms-CommonPhyChIdentity",
		    0,
		    2,
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
				"SecondaryCCPCHFrameType2Info"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryCCPCHFrameType2Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCHFrameType2Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCHFrameType2Info"
				)
			    ),
			    0
			)
		    ),
		    "secondaryCCPCHInfo-MBMS",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_PhyChInformation_IMB384 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_PhyChInformation_IMB384 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_PhyChInformation_IMB384
