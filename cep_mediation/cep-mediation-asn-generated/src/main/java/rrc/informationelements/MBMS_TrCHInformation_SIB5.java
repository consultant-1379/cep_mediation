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
 * Define the ASN1 Type MBMS_TrCHInformation_SIB5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_TrCHInformation_SIB5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_TrCHInformation_SIB5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_TrCHInformation_SIB5(INTEGER transpCh_Identity, 
		    MBMS_PTM_RBInformation_CList rbInformation, 
		    MBMS_MSCH_ConfigurationInfo_r6 msch_ConfigurationInfo)
    {
	setTranspCh_Identity(transpCh_Identity);
	setRbInformation(rbInformation);
	setMsch_ConfigurationInfo(msch_ConfigurationInfo);
    }
    
    /**
     * Construct with components.
     */
    public MBMS_TrCHInformation_SIB5(long transpCh_Identity, 
		    MBMS_PTM_RBInformation_CList rbInformation, 
		    MBMS_MSCH_ConfigurationInfo_r6 msch_ConfigurationInfo)
    {
	this(new INTEGER(transpCh_Identity), rbInformation, 
	     msch_ConfigurationInfo);
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_TrCHInformation_SIB5(long transpCh_Identity)
    {
	setTranspCh_Identity(transpCh_Identity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new MBMS_PTM_RBInformation_CList();
	mComponents[2] = new MBMS_MSCH_ConfigurationInfo_r6();
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
		return new INTEGER();
	    case 1:
		return new MBMS_PTM_RBInformation_CList();
	    case 2:
		return new MBMS_MSCH_ConfigurationInfo_r6();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transpCh_Identity"
    public long getTranspCh_Identity()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setTranspCh_Identity(long transpCh_Identity)
    {
	setTranspCh_Identity(new INTEGER(transpCh_Identity));
    }
    
    public void setTranspCh_Identity(INTEGER transpCh_Identity)
    {
	mComponents[0] = transpCh_Identity;
    }
    
    
    // Methods for field "rbInformation"
    public MBMS_PTM_RBInformation_CList getRbInformation()
    {
	return (MBMS_PTM_RBInformation_CList)mComponents[1];
    }
    
    public void setRbInformation(MBMS_PTM_RBInformation_CList rbInformation)
    {
	mComponents[1] = rbInformation;
    }
    
    public boolean hasRbInformation()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRbInformation()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "msch_ConfigurationInfo"
    public MBMS_MSCH_ConfigurationInfo_r6 getMsch_ConfigurationInfo()
    {
	return (MBMS_MSCH_ConfigurationInfo_r6)mComponents[2];
    }
    
    public void setMsch_ConfigurationInfo(MBMS_MSCH_ConfigurationInfo_r6 msch_ConfigurationInfo)
    {
	mComponents[2] = msch_ConfigurationInfo;
    }
    
    public boolean hasMsch_ConfigurationInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMsch_ConfigurationInfo()
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
	    "MBMS_TrCHInformation_SIB5"
	),
	new QName (
	    "InformationElements",
	    "MBMS-TrCHInformation-SIB5"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(8),
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
		    "transpCh-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_PTM_RBInformation_CList"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PTM-RBInformation-CList"
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
				    "MBMS_PTM_RBInformation_C"
				)
			    )
			)
		    ),
		    "rbInformation",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_TrCHInformation_SIB5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_TrCHInformation_SIB5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_TrCHInformation_SIB5
