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
 * Define the ASN1 Type MBMS_MCCH_ConfigurationInfo_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_MCCH_ConfigurationInfo_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_MCCH_ConfigurationInfo_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_MCCH_ConfigurationInfo_r6(INTEGER accessInfoPeriodCoefficient, 
		    INTEGER repetitionPeriodCoefficient, 
		    INTEGER modificationPeriodCoefficient, 
		    RLC_Info_MCCH_r6 rlc_Info, 
		    MBMS_TCTF_Presence tctf_Presence)
    {
	setAccessInfoPeriodCoefficient(accessInfoPeriodCoefficient);
	setRepetitionPeriodCoefficient(repetitionPeriodCoefficient);
	setModificationPeriodCoefficient(modificationPeriodCoefficient);
	setRlc_Info(rlc_Info);
	setTctf_Presence(tctf_Presence);
    }
    
    /**
     * Construct with components.
     */
    public MBMS_MCCH_ConfigurationInfo_r6(long accessInfoPeriodCoefficient, 
		    long repetitionPeriodCoefficient, 
		    long modificationPeriodCoefficient, 
		    RLC_Info_MCCH_r6 rlc_Info, 
		    MBMS_TCTF_Presence tctf_Presence)
    {
	this(new INTEGER(accessInfoPeriodCoefficient), 
	     new INTEGER(repetitionPeriodCoefficient), 
	     new INTEGER(modificationPeriodCoefficient), rlc_Info, 
	     tctf_Presence);
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_MCCH_ConfigurationInfo_r6(long accessInfoPeriodCoefficient, 
		    long repetitionPeriodCoefficient, 
		    long modificationPeriodCoefficient, 
		    RLC_Info_MCCH_r6 rlc_Info)
    {
	setAccessInfoPeriodCoefficient(accessInfoPeriodCoefficient);
	setRepetitionPeriodCoefficient(repetitionPeriodCoefficient);
	setModificationPeriodCoefficient(modificationPeriodCoefficient);
	setRlc_Info(rlc_Info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new RLC_Info_MCCH_r6();
	mComponents[4] = MBMS_TCTF_Presence._false;
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new RLC_Info_MCCH_r6();
	    case 4:
		return MBMS_TCTF_Presence._false;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "accessInfoPeriodCoefficient"
    public long getAccessInfoPeriodCoefficient()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setAccessInfoPeriodCoefficient(long accessInfoPeriodCoefficient)
    {
	setAccessInfoPeriodCoefficient(new INTEGER(accessInfoPeriodCoefficient));
    }
    
    public void setAccessInfoPeriodCoefficient(INTEGER accessInfoPeriodCoefficient)
    {
	mComponents[0] = accessInfoPeriodCoefficient;
    }
    
    
    // Methods for field "repetitionPeriodCoefficient"
    public long getRepetitionPeriodCoefficient()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setRepetitionPeriodCoefficient(long repetitionPeriodCoefficient)
    {
	setRepetitionPeriodCoefficient(new INTEGER(repetitionPeriodCoefficient));
    }
    
    public void setRepetitionPeriodCoefficient(INTEGER repetitionPeriodCoefficient)
    {
	mComponents[1] = repetitionPeriodCoefficient;
    }
    
    
    // Methods for field "modificationPeriodCoefficient"
    public long getModificationPeriodCoefficient()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setModificationPeriodCoefficient(long modificationPeriodCoefficient)
    {
	setModificationPeriodCoefficient(new INTEGER(modificationPeriodCoefficient));
    }
    
    public void setModificationPeriodCoefficient(INTEGER modificationPeriodCoefficient)
    {
	mComponents[2] = modificationPeriodCoefficient;
    }
    
    
    // Methods for field "rlc_Info"
    public RLC_Info_MCCH_r6 getRlc_Info()
    {
	return (RLC_Info_MCCH_r6)mComponents[3];
    }
    
    public void setRlc_Info(RLC_Info_MCCH_r6 rlc_Info)
    {
	mComponents[3] = rlc_Info;
    }
    
    
    // Methods for field "tctf_Presence"
    public MBMS_TCTF_Presence getTctf_Presence()
    {
	return (MBMS_TCTF_Presence)mComponents[4];
    }
    
    public void setTctf_Presence(MBMS_TCTF_Presence tctf_Presence)
    {
	mComponents[4] = tctf_Presence;
    }
    
    public boolean hasTctf_Presence()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTctf_Presence()
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
	    "MBMS_MCCH_ConfigurationInfo_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-MCCH-ConfigurationInfo-r6"
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "accessInfoPeriodCoefficient",
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "repetitionPeriodCoefficient",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
				    new com.oss.asn1.INTEGER(7), 
				    new com.oss.asn1.INTEGER(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(7),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "modificationPeriodCoefficient",
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
				"RLC_Info_MCCH_r6"
			    ),
			    new QName (
				"InformationElements",
				"RLC-Info-MCCH-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Info_MCCH_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Info_MCCH_r6"
				)
			    ),
			    0
			)
		    ),
		    "rlc-Info",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_MCCH_ConfigurationInfo_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_MCCH_ConfigurationInfo_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_MCCH_ConfigurationInfo_r6
