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
 * Define the ASN1 Type MBMS_MSCHSchedulingInfo from ASN1 Module InformationElements.
 * @see Choice
 */

public class MBMS_MSCHSchedulingInfo extends Choice {
    
    /**
     * The default constructor.
     */
    public MBMS_MSCHSchedulingInfo()
    {
    }
    
    public static final  int  schedulingPeriod_32_Offset_chosen = 1;
    public static final  int  schedulingPeriod_64_Offset_chosen = 2;
    public static final  int  schedulingPeriod_128_Offset_chosen = 3;
    public static final  int  schedulingPeriod_256_Offset_chosen = 4;
    public static final  int  schedulingPeriod_512_Offset_chosen = 5;
    public static final  int  schedulingPeriod_1024_Offset_chosen = 6;
    
    // Methods for field "schedulingPeriod_32_Offset"
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_32_Offset(long schedulingPeriod_32_Offset)
    {
	return createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_32_Offset(new INTEGER(schedulingPeriod_32_Offset));
    }
    
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_32_Offset(INTEGER schedulingPeriod_32_Offset)
    {
	MBMS_MSCHSchedulingInfo __object = new MBMS_MSCHSchedulingInfo();

	__object.setSchedulingPeriod_32_Offset(schedulingPeriod_32_Offset);
	return __object;
    }
    
    public boolean hasSchedulingPeriod_32_Offset()
    {
	return getChosenFlag() == schedulingPeriod_32_Offset_chosen;
    }
    
    public void setSchedulingPeriod_32_Offset(long schedulingPeriod_32_Offset)
    {
	setSchedulingPeriod_32_Offset(new INTEGER(schedulingPeriod_32_Offset));
    }
    
    public void setSchedulingPeriod_32_Offset(INTEGER schedulingPeriod_32_Offset)
    {
	setChosenValue(schedulingPeriod_32_Offset);
	setChosenFlag(schedulingPeriod_32_Offset_chosen);
    }
    
    
    // Methods for field "schedulingPeriod_64_Offset"
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_64_Offset(long schedulingPeriod_64_Offset)
    {
	return createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_64_Offset(new INTEGER(schedulingPeriod_64_Offset));
    }
    
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_64_Offset(INTEGER schedulingPeriod_64_Offset)
    {
	MBMS_MSCHSchedulingInfo __object = new MBMS_MSCHSchedulingInfo();

	__object.setSchedulingPeriod_64_Offset(schedulingPeriod_64_Offset);
	return __object;
    }
    
    public boolean hasSchedulingPeriod_64_Offset()
    {
	return getChosenFlag() == schedulingPeriod_64_Offset_chosen;
    }
    
    public void setSchedulingPeriod_64_Offset(long schedulingPeriod_64_Offset)
    {
	setSchedulingPeriod_64_Offset(new INTEGER(schedulingPeriod_64_Offset));
    }
    
    public void setSchedulingPeriod_64_Offset(INTEGER schedulingPeriod_64_Offset)
    {
	setChosenValue(schedulingPeriod_64_Offset);
	setChosenFlag(schedulingPeriod_64_Offset_chosen);
    }
    
    
    // Methods for field "schedulingPeriod_128_Offset"
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_128_Offset(long schedulingPeriod_128_Offset)
    {
	return createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_128_Offset(new INTEGER(schedulingPeriod_128_Offset));
    }
    
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_128_Offset(INTEGER schedulingPeriod_128_Offset)
    {
	MBMS_MSCHSchedulingInfo __object = new MBMS_MSCHSchedulingInfo();

	__object.setSchedulingPeriod_128_Offset(schedulingPeriod_128_Offset);
	return __object;
    }
    
    public boolean hasSchedulingPeriod_128_Offset()
    {
	return getChosenFlag() == schedulingPeriod_128_Offset_chosen;
    }
    
    public void setSchedulingPeriod_128_Offset(long schedulingPeriod_128_Offset)
    {
	setSchedulingPeriod_128_Offset(new INTEGER(schedulingPeriod_128_Offset));
    }
    
    public void setSchedulingPeriod_128_Offset(INTEGER schedulingPeriod_128_Offset)
    {
	setChosenValue(schedulingPeriod_128_Offset);
	setChosenFlag(schedulingPeriod_128_Offset_chosen);
    }
    
    
    // Methods for field "schedulingPeriod_256_Offset"
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_256_Offset(long schedulingPeriod_256_Offset)
    {
	return createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_256_Offset(new INTEGER(schedulingPeriod_256_Offset));
    }
    
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_256_Offset(INTEGER schedulingPeriod_256_Offset)
    {
	MBMS_MSCHSchedulingInfo __object = new MBMS_MSCHSchedulingInfo();

	__object.setSchedulingPeriod_256_Offset(schedulingPeriod_256_Offset);
	return __object;
    }
    
    public boolean hasSchedulingPeriod_256_Offset()
    {
	return getChosenFlag() == schedulingPeriod_256_Offset_chosen;
    }
    
    public void setSchedulingPeriod_256_Offset(long schedulingPeriod_256_Offset)
    {
	setSchedulingPeriod_256_Offset(new INTEGER(schedulingPeriod_256_Offset));
    }
    
    public void setSchedulingPeriod_256_Offset(INTEGER schedulingPeriod_256_Offset)
    {
	setChosenValue(schedulingPeriod_256_Offset);
	setChosenFlag(schedulingPeriod_256_Offset_chosen);
    }
    
    
    // Methods for field "schedulingPeriod_512_Offset"
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_512_Offset(long schedulingPeriod_512_Offset)
    {
	return createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_512_Offset(new INTEGER(schedulingPeriod_512_Offset));
    }
    
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_512_Offset(INTEGER schedulingPeriod_512_Offset)
    {
	MBMS_MSCHSchedulingInfo __object = new MBMS_MSCHSchedulingInfo();

	__object.setSchedulingPeriod_512_Offset(schedulingPeriod_512_Offset);
	return __object;
    }
    
    public boolean hasSchedulingPeriod_512_Offset()
    {
	return getChosenFlag() == schedulingPeriod_512_Offset_chosen;
    }
    
    public void setSchedulingPeriod_512_Offset(long schedulingPeriod_512_Offset)
    {
	setSchedulingPeriod_512_Offset(new INTEGER(schedulingPeriod_512_Offset));
    }
    
    public void setSchedulingPeriod_512_Offset(INTEGER schedulingPeriod_512_Offset)
    {
	setChosenValue(schedulingPeriod_512_Offset);
	setChosenFlag(schedulingPeriod_512_Offset_chosen);
    }
    
    
    // Methods for field "schedulingPeriod_1024_Offset"
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_1024_Offset(long schedulingPeriod_1024_Offset)
    {
	return createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_1024_Offset(new INTEGER(schedulingPeriod_1024_Offset));
    }
    
    public static MBMS_MSCHSchedulingInfo createMBMS_MSCHSchedulingInfoWithSchedulingPeriod_1024_Offset(INTEGER schedulingPeriod_1024_Offset)
    {
	MBMS_MSCHSchedulingInfo __object = new MBMS_MSCHSchedulingInfo();

	__object.setSchedulingPeriod_1024_Offset(schedulingPeriod_1024_Offset);
	return __object;
    }
    
    public boolean hasSchedulingPeriod_1024_Offset()
    {
	return getChosenFlag() == schedulingPeriod_1024_Offset_chosen;
    }
    
    public void setSchedulingPeriod_1024_Offset(long schedulingPeriod_1024_Offset)
    {
	setSchedulingPeriod_1024_Offset(new INTEGER(schedulingPeriod_1024_Offset));
    }
    
    public void setSchedulingPeriod_1024_Offset(INTEGER schedulingPeriod_1024_Offset)
    {
	setChosenValue(schedulingPeriod_1024_Offset);
	setChosenFlag(schedulingPeriod_1024_Offset_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case schedulingPeriod_32_Offset_chosen:
		return new INTEGER();
	    case schedulingPeriod_64_Offset_chosen:
		return new INTEGER();
	    case schedulingPeriod_128_Offset_chosen:
		return new INTEGER();
	    case schedulingPeriod_256_Offset_chosen:
		return new INTEGER();
	    case schedulingPeriod_512_Offset_chosen:
		return new INTEGER();
	    case schedulingPeriod_1024_Offset_chosen:
		return new INTEGER();
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
	    "rrc.informationelements",
	    "MBMS_MSCHSchedulingInfo"
	),
	new QName (
	    "InformationElements",
	    "MBMS-MSCHSchedulingInfo"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
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
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "schedulingPeriod-32-Offset",
		    0,
		    2
		),
		new FieldInfo (
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
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "schedulingPeriod-64-Offset",
		    1,
		    2
		),
		new FieldInfo (
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "schedulingPeriod-128-Offset",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
				    new com.oss.asn1.INTEGER(255),
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
		    "schedulingPeriod-256-Offset",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new com.oss.asn1.INTEGER(511),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    ),
			    null
			)
		    ),
		    "schedulingPeriod-512-Offset",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
				    new com.oss.asn1.INTEGER(1023),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1023)
			    ),
			    null
			)
		    ),
		    "schedulingPeriod-1024-Offset",
		    5,
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
		new TagDecoderElement((short)0x8005, 5)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_MSCHSchedulingInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_MSCHSchedulingInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_MSCHSchedulingInfo
