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
 * Define the ASN1 Type MBMS_TrCHInformation_Neighb from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_TrCHInformation_Neighb extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_TrCHInformation_Neighb()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_TrCHInformation_Neighb(MBMS_CommonTrChIdentity transpCh_Info, 
		    BOOLEAN transpCh_CombiningStatus, 
		    MBMS_PTM_RBInformation_NList rbInformation, 
		    MBMS_MSCH_ConfigurationInfo_r6 msch_ConfigurationInfo)
    {
	setTranspCh_Info(transpCh_Info);
	setTranspCh_CombiningStatus(transpCh_CombiningStatus);
	setRbInformation(rbInformation);
	setMsch_ConfigurationInfo(msch_ConfigurationInfo);
    }
    
    /**
     * Construct with components.
     */
    public MBMS_TrCHInformation_Neighb(MBMS_CommonTrChIdentity transpCh_Info, 
		    boolean transpCh_CombiningStatus, 
		    MBMS_PTM_RBInformation_NList rbInformation, 
		    MBMS_MSCH_ConfigurationInfo_r6 msch_ConfigurationInfo)
    {
	this(transpCh_Info, new BOOLEAN(transpCh_CombiningStatus), 
	     rbInformation, msch_ConfigurationInfo);
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_TrCHInformation_Neighb(MBMS_CommonTrChIdentity transpCh_Info, 
		    boolean transpCh_CombiningStatus)
    {
	setTranspCh_Info(transpCh_Info);
	setTranspCh_CombiningStatus(transpCh_CombiningStatus);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_CommonTrChIdentity();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new MBMS_PTM_RBInformation_NList();
	mComponents[3] = new MBMS_MSCH_ConfigurationInfo_r6();
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
		return new MBMS_CommonTrChIdentity();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new MBMS_PTM_RBInformation_NList();
	    case 3:
		return new MBMS_MSCH_ConfigurationInfo_r6();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transpCh_Info"
    public MBMS_CommonTrChIdentity getTranspCh_Info()
    {
	return (MBMS_CommonTrChIdentity)mComponents[0];
    }
    
    public void setTranspCh_Info(MBMS_CommonTrChIdentity transpCh_Info)
    {
	mComponents[0] = transpCh_Info;
    }
    
    
    // Methods for field "transpCh_CombiningStatus"
    public boolean getTranspCh_CombiningStatus()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setTranspCh_CombiningStatus(boolean transpCh_CombiningStatus)
    {
	setTranspCh_CombiningStatus(new BOOLEAN(transpCh_CombiningStatus));
    }
    
    public void setTranspCh_CombiningStatus(BOOLEAN transpCh_CombiningStatus)
    {
	mComponents[1] = transpCh_CombiningStatus;
    }
    
    
    // Methods for field "rbInformation"
    public MBMS_PTM_RBInformation_NList getRbInformation()
    {
	return (MBMS_PTM_RBInformation_NList)mComponents[2];
    }
    
    public void setRbInformation(MBMS_PTM_RBInformation_NList rbInformation)
    {
	mComponents[2] = rbInformation;
    }
    
    public boolean hasRbInformation()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRbInformation()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "msch_ConfigurationInfo"
    public MBMS_MSCH_ConfigurationInfo_r6 getMsch_ConfigurationInfo()
    {
	return (MBMS_MSCH_ConfigurationInfo_r6)mComponents[3];
    }
    
    public void setMsch_ConfigurationInfo(MBMS_MSCH_ConfigurationInfo_r6 msch_ConfigurationInfo)
    {
	mComponents[3] = msch_ConfigurationInfo;
    }
    
    public boolean hasMsch_ConfigurationInfo()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMsch_ConfigurationInfo()
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
	    "MBMS_TrCHInformation_Neighb"
	),
	new QName (
	    "InformationElements",
	    "MBMS-TrCHInformation-Neighb"
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
				"MBMS_CommonTrChIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CommonTrChIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_CommonTrChIdentity(1), 
				    new MBMS_CommonTrChIdentity(32),
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
		    "transpCh-Info",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "transpCh-CombiningStatus",
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
				"MBMS_PTM_RBInformation_NList"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PTM-RBInformation-NList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_PTM_RBInformation_N"
				)
			    )
			)
		    ),
		    "rbInformation",
		    2,
		    3,
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
				"MBMS_MSCH_ConfigurationInfo_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-MSCH-ConfigurationInfo-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_MSCH_ConfigurationInfo_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_MSCH_ConfigurationInfo_r6"
				)
			    ),
			    0
			)
		    ),
		    "msch-ConfigurationInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_TrCHInformation_Neighb object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_TrCHInformation_Neighb object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_TrCHInformation_Neighb
