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
 * Define the ASN1 Type SysInfoType8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType8(CPCH_Parameters dummy1, CPCH_SetInfoList dummy2, 
		    CSICH_PowerOffset dummy3, 
		    NonCriticalExtensions nonCriticalExtensions)
    {
	setDummy1(dummy1);
	setDummy2(dummy2);
	setDummy3(dummy3);
	setNonCriticalExtensions(nonCriticalExtensions);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType8(CPCH_Parameters dummy1, CPCH_SetInfoList dummy2, 
		    CSICH_PowerOffset dummy3)
    {
	setDummy1(dummy1);
	setDummy2(dummy2);
	setDummy3(dummy3);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CPCH_Parameters();
	mComponents[1] = new CPCH_SetInfoList();
	mComponents[2] = new CSICH_PowerOffset();
	mComponents[3] = new NonCriticalExtensions();
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
		return new CPCH_Parameters();
	    case 1:
		return new CPCH_SetInfoList();
	    case 2:
		return new CSICH_PowerOffset();
	    case 3:
		return new NonCriticalExtensions();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dummy1"
    public CPCH_Parameters getDummy1()
    {
	return (CPCH_Parameters)mComponents[0];
    }
    
    public void setDummy1(CPCH_Parameters dummy1)
    {
	mComponents[0] = dummy1;
    }
    
    
    // Methods for field "dummy2"
    public CPCH_SetInfoList getDummy2()
    {
	return (CPCH_SetInfoList)mComponents[1];
    }
    
    public void setDummy2(CPCH_SetInfoList dummy2)
    {
	mComponents[1] = dummy2;
    }
    
    
    // Methods for field "dummy3"
    public CSICH_PowerOffset getDummy3()
    {
	return (CSICH_PowerOffset)mComponents[2];
    }
    
    public void setDummy3(CSICH_PowerOffset dummy3)
    {
	mComponents[2] = dummy3;
    }
    
    
    // Methods for field "nonCriticalExtensions"
    public NonCriticalExtensions getNonCriticalExtensions()
    {
	return (NonCriticalExtensions)mComponents[3];
    }
    
    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
    {
	mComponents[3] = nonCriticalExtensions;
    }
    
    public boolean hasNonCriticalExtensions()
    {
	return componentIsPresent(3);
    }
    
    public void deleteNonCriticalExtensions()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class NonCriticalExtensions extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public NonCriticalExtensions()
	{
	}
	
	public void initComponents()
	{
	    
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[0];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    return null;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType8$NonCriticalExtensions"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		}
	    ),
	    0,
	    null,
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NonCriticalExtensions

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
	    "SysInfoType8"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType8"
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
				"CPCH_Parameters"
			    ),
			    new QName (
				"InformationElements",
				"CPCH-Parameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CPCH_Parameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CPCH_Parameters"
				)
			    ),
			    0
			)
		    ),
		    "dummy1",
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
				"CPCH_SetInfoList"
			    ),
			    new QName (
				"InformationElements",
				"CPCH-SetInfoList"
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
				    "CPCH_SetInfo"
				)
			    )
			)
		    ),
		    "dummy2",
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
				"rrc.informationelements",
				"CSICH_PowerOffset"
			    ),
			    new QName (
				"InformationElements",
				"CSICH-PowerOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CSICH_PowerOffset(-10), 
				    new CSICH_PowerOffset(5),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-10),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "dummy3",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType8$NonCriticalExtensions"
			)
		    ),
		    "nonCriticalExtensions",
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
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType8 object.
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
    
} // End class definition for SysInfoType8
