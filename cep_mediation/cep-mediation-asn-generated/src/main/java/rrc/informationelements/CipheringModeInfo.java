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
 * Define the ASN1 Type CipheringModeInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CipheringModeInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public CipheringModeInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CipheringModeInfo(CipheringModeCommand cipheringModeCommand, 
		    ActivationTime activationTimeForDPCH, 
		    RB_ActivationTimeInfoList rb_DL_CiphActivationTimeInfo)
    {
	setCipheringModeCommand(cipheringModeCommand);
	setActivationTimeForDPCH(activationTimeForDPCH);
	setRb_DL_CiphActivationTimeInfo(rb_DL_CiphActivationTimeInfo);
    }
    
    /**
     * Construct with required components.
     */
    public CipheringModeInfo(CipheringModeCommand cipheringModeCommand)
    {
	setCipheringModeCommand(cipheringModeCommand);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CipheringModeCommand();
	mComponents[1] = new ActivationTime();
	mComponents[2] = new RB_ActivationTimeInfoList();
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
		return new CipheringModeCommand();
	    case 1:
		return new ActivationTime();
	    case 2:
		return new RB_ActivationTimeInfoList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cipheringModeCommand"
    public CipheringModeCommand getCipheringModeCommand()
    {
	return (CipheringModeCommand)mComponents[0];
    }
    
    public void setCipheringModeCommand(CipheringModeCommand cipheringModeCommand)
    {
	mComponents[0] = cipheringModeCommand;
    }
    
    
    // Methods for field "activationTimeForDPCH"
    public ActivationTime getActivationTimeForDPCH()
    {
	return (ActivationTime)mComponents[1];
    }
    
    public void setActivationTimeForDPCH(ActivationTime activationTimeForDPCH)
    {
	mComponents[1] = activationTimeForDPCH;
    }
    
    public boolean hasActivationTimeForDPCH()
    {
	return componentIsPresent(1);
    }
    
    public void deleteActivationTimeForDPCH()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "rb_DL_CiphActivationTimeInfo"
    public RB_ActivationTimeInfoList getRb_DL_CiphActivationTimeInfo()
    {
	return (RB_ActivationTimeInfoList)mComponents[2];
    }
    
    public void setRb_DL_CiphActivationTimeInfo(RB_ActivationTimeInfoList rb_DL_CiphActivationTimeInfo)
    {
	mComponents[2] = rb_DL_CiphActivationTimeInfo;
    }
    
    public boolean hasRb_DL_CiphActivationTimeInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRb_DL_CiphActivationTimeInfo()
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
	    "CipheringModeInfo"
	),
	new QName (
	    "InformationElements",
	    "CipheringModeInfo"
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
				"CipheringModeCommand"
			    ),
			    new QName (
				"InformationElements",
				"CipheringModeCommand"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CipheringModeCommand"
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
		    "cipheringModeCommand",
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
				"ActivationTime"
			    ),
			    new QName (
				"InformationElements",
				"ActivationTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ActivationTime(0), 
				    new ActivationTime(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "activationTimeForDPCH",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_ActivationTimeInfoList"
			    ),
			    new QName (
				"InformationElements",
				"RB-ActivationTimeInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RB_ActivationTimeInfo"
				)
			    )
			)
		    ),
		    "rb-DL-CiphActivationTimeInfo",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' CipheringModeInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CipheringModeInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CipheringModeInfo
