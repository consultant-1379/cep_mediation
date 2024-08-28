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
 * Define the ASN1 Type PDSCH_SysInfo_HCR_r5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDSCH_SysInfo_HCR_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDSCH_SysInfo_HCR_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDSCH_SysInfo_HCR_r5(PDSCH_Identity pdsch_Identity, 
		    PDSCH_Info pdsch_Info, 
		    DSCH_TransportChannelsInfo dsch_TransportChannelsInfo, 
		    TFCS dsch_TFCS)
    {
	setPdsch_Identity(pdsch_Identity);
	setPdsch_Info(pdsch_Info);
	setDsch_TransportChannelsInfo(dsch_TransportChannelsInfo);
	setDsch_TFCS(dsch_TFCS);
    }
    
    /**
     * Construct with required components.
     */
    public PDSCH_SysInfo_HCR_r5(PDSCH_Identity pdsch_Identity, 
		    PDSCH_Info pdsch_Info)
    {
	setPdsch_Identity(pdsch_Identity);
	setPdsch_Info(pdsch_Info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PDSCH_Identity();
	mComponents[1] = new PDSCH_Info();
	mComponents[2] = new DSCH_TransportChannelsInfo();
	mComponents[3] = new TFCS();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PDSCH_Identity();
	    case 1:
		return new PDSCH_Info();
	    case 2:
		return new DSCH_TransportChannelsInfo();
	    case 3:
		return new TFCS();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pdsch_Identity"
    public PDSCH_Identity getPdsch_Identity()
    {
	return (PDSCH_Identity)mComponents[0];
    }
    
    public void setPdsch_Identity(PDSCH_Identity pdsch_Identity)
    {
	mComponents[0] = pdsch_Identity;
    }
    
    
    // Methods for field "pdsch_Info"
    public PDSCH_Info getPdsch_Info()
    {
	return (PDSCH_Info)mComponents[1];
    }
    
    public void setPdsch_Info(PDSCH_Info pdsch_Info)
    {
	mComponents[1] = pdsch_Info;
    }
    
    
    // Methods for field "dsch_TransportChannelsInfo"
    public DSCH_TransportChannelsInfo getDsch_TransportChannelsInfo()
    {
	return (DSCH_TransportChannelsInfo)mComponents[2];
    }
    
    public void setDsch_TransportChannelsInfo(DSCH_TransportChannelsInfo dsch_TransportChannelsInfo)
    {
	mComponents[2] = dsch_TransportChannelsInfo;
    }
    
    public boolean hasDsch_TransportChannelsInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDsch_TransportChannelsInfo()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "dsch_TFCS"
    public TFCS getDsch_TFCS()
    {
	return (TFCS)mComponents[3];
    }
    
    public void setDsch_TFCS(TFCS dsch_TFCS)
    {
	mComponents[3] = dsch_TFCS;
    }
    
    public boolean hasDsch_TFCS()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDsch_TFCS()
    {
	setComponentAbsent(3);
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
	    "PDSCH_SysInfo_HCR_r5"
	),
	new QName (
	    "InformationElements",
	    "PDSCH-SysInfo-HCR-r5"
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
				"PDSCH_Identity"
			    ),
			    new QName (
				"InformationElements",
				"PDSCH-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PDSCH_Identity(1), 
				    new PDSCH_Identity(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "pdsch-Identity",
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
				"PDSCH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PDSCH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_Info"
				)
			    ),
			    0
			)
		    ),
		    "pdsch-Info",
		    1,
		    2,
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
				"DSCH_TransportChannelsInfo"
			    ),
			    new QName (
				"InformationElements",
				"DSCH-TransportChannelsInfo"
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
				    "DSCH_TransportChannelsInfo$Sequence_"
				)
			    )
			)
		    ),
		    "dsch-TransportChannelsInfo",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS"
			    ),
			    new QName (
				"InformationElements",
				"TFCS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS"
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
		    "dsch-TFCS",
		    3,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PDSCH_SysInfo_HCR_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDSCH_SysInfo_HCR_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDSCH_SysInfo_HCR_r5
