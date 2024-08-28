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
 * Define the ASN1 Type MBMS_L1CombiningSchedule from ASN1 Module InformationElements.
 * @see Choice
 */

public class MBMS_L1CombiningSchedule extends Choice {
    
    /**
     * The default constructor.
     */
    public MBMS_L1CombiningSchedule()
    {
    }
    
    public static final  int  cycleLength_32_chosen = 1;
    public static final  int  cycleLength_64_chosen = 2;
    public static final  int  cycleLength_128_chosen = 3;
    public static final  int  cycleLength_256_chosen = 4;
    public static final  int  cycleLength_512_chosen = 5;
    public static final  int  cycleLength_1024_chosen = 6;
    
    // Methods for field "cycleLength_32"
    public static MBMS_L1CombiningSchedule createMBMS_L1CombiningScheduleWithCycleLength_32(MBMS_L1CombiningSchedule_32 cycleLength_32)
    {
	MBMS_L1CombiningSchedule __object = new MBMS_L1CombiningSchedule();

	__object.setCycleLength_32(cycleLength_32);
	return __object;
    }
    
    public boolean hasCycleLength_32()
    {
	return getChosenFlag() == cycleLength_32_chosen;
    }
    
    public void setCycleLength_32(MBMS_L1CombiningSchedule_32 cycleLength_32)
    {
	setChosenValue(cycleLength_32);
	setChosenFlag(cycleLength_32_chosen);
    }
    
    
    // Methods for field "cycleLength_64"
    public static MBMS_L1CombiningSchedule createMBMS_L1CombiningScheduleWithCycleLength_64(MBMS_L1CombiningSchedule_64 cycleLength_64)
    {
	MBMS_L1CombiningSchedule __object = new MBMS_L1CombiningSchedule();

	__object.setCycleLength_64(cycleLength_64);
	return __object;
    }
    
    public boolean hasCycleLength_64()
    {
	return getChosenFlag() == cycleLength_64_chosen;
    }
    
    public void setCycleLength_64(MBMS_L1CombiningSchedule_64 cycleLength_64)
    {
	setChosenValue(cycleLength_64);
	setChosenFlag(cycleLength_64_chosen);
    }
    
    
    // Methods for field "cycleLength_128"
    public static MBMS_L1CombiningSchedule createMBMS_L1CombiningScheduleWithCycleLength_128(MBMS_L1CombiningSchedule_128 cycleLength_128)
    {
	MBMS_L1CombiningSchedule __object = new MBMS_L1CombiningSchedule();

	__object.setCycleLength_128(cycleLength_128);
	return __object;
    }
    
    public boolean hasCycleLength_128()
    {
	return getChosenFlag() == cycleLength_128_chosen;
    }
    
    public void setCycleLength_128(MBMS_L1CombiningSchedule_128 cycleLength_128)
    {
	setChosenValue(cycleLength_128);
	setChosenFlag(cycleLength_128_chosen);
    }
    
    
    // Methods for field "cycleLength_256"
    public static MBMS_L1CombiningSchedule createMBMS_L1CombiningScheduleWithCycleLength_256(MBMS_L1CombiningSchedule_256 cycleLength_256)
    {
	MBMS_L1CombiningSchedule __object = new MBMS_L1CombiningSchedule();

	__object.setCycleLength_256(cycleLength_256);
	return __object;
    }
    
    public boolean hasCycleLength_256()
    {
	return getChosenFlag() == cycleLength_256_chosen;
    }
    
    public void setCycleLength_256(MBMS_L1CombiningSchedule_256 cycleLength_256)
    {
	setChosenValue(cycleLength_256);
	setChosenFlag(cycleLength_256_chosen);
    }
    
    
    // Methods for field "cycleLength_512"
    public static MBMS_L1CombiningSchedule createMBMS_L1CombiningScheduleWithCycleLength_512(MBMS_L1CombiningSchedule_512 cycleLength_512)
    {
	MBMS_L1CombiningSchedule __object = new MBMS_L1CombiningSchedule();

	__object.setCycleLength_512(cycleLength_512);
	return __object;
    }
    
    public boolean hasCycleLength_512()
    {
	return getChosenFlag() == cycleLength_512_chosen;
    }
    
    public void setCycleLength_512(MBMS_L1CombiningSchedule_512 cycleLength_512)
    {
	setChosenValue(cycleLength_512);
	setChosenFlag(cycleLength_512_chosen);
    }
    
    
    // Methods for field "cycleLength_1024"
    public static MBMS_L1CombiningSchedule createMBMS_L1CombiningScheduleWithCycleLength_1024(MBMS_L1CombiningSchedule_1024 cycleLength_1024)
    {
	MBMS_L1CombiningSchedule __object = new MBMS_L1CombiningSchedule();

	__object.setCycleLength_1024(cycleLength_1024);
	return __object;
    }
    
    public boolean hasCycleLength_1024()
    {
	return getChosenFlag() == cycleLength_1024_chosen;
    }
    
    public void setCycleLength_1024(MBMS_L1CombiningSchedule_1024 cycleLength_1024)
    {
	setChosenValue(cycleLength_1024);
	setChosenFlag(cycleLength_1024_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case cycleLength_32_chosen:
		return new MBMS_L1CombiningSchedule_32();
	    case cycleLength_64_chosen:
		return new MBMS_L1CombiningSchedule_64();
	    case cycleLength_128_chosen:
		return new MBMS_L1CombiningSchedule_128();
	    case cycleLength_256_chosen:
		return new MBMS_L1CombiningSchedule_256();
	    case cycleLength_512_chosen:
		return new MBMS_L1CombiningSchedule_512();
	    case cycleLength_1024_chosen:
		return new MBMS_L1CombiningSchedule_1024();
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
	    "MBMS_L1CombiningSchedule"
	),
	new QName (
	    "InformationElements",
	    "MBMS-L1CombiningSchedule"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_L1CombiningSchedule_32"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-L1CombiningSchedule-32"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_32"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_32"
				)
			    ),
			    0
			)
		    ),
		    "cycleLength-32",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_L1CombiningSchedule_64"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-L1CombiningSchedule-64"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_64"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_64"
				)
			    ),
			    0
			)
		    ),
		    "cycleLength-64",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_L1CombiningSchedule_128"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-L1CombiningSchedule-128"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_128"
				)
			    ),
			    0
			)
		    ),
		    "cycleLength-128",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_L1CombiningSchedule_256"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-L1CombiningSchedule-256"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_256"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_256"
				)
			    ),
			    0
			)
		    ),
		    "cycleLength-256",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_L1CombiningSchedule_512"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-L1CombiningSchedule-512"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_512"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_512"
				)
			    ),
			    0
			)
		    ),
		    "cycleLength-512",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_L1CombiningSchedule_1024"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-L1CombiningSchedule-1024"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_1024"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L1CombiningSchedule_1024"
				)
			    ),
			    0
			)
		    ),
		    "cycleLength-1024",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_L1CombiningSchedule object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_L1CombiningSchedule object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_L1CombiningSchedule
