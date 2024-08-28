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
 * Define the ASN1 Type SchedulingInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SchedulingInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public SchedulingInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SchedulingInformation(Scheduling scheduling)
    {
	setScheduling(scheduling);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Scheduling();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Scheduling();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "scheduling"
    public Scheduling getScheduling()
    {
	return (Scheduling)mComponents[0];
    }
    
    public void setScheduling(Scheduling scheduling)
    {
	mComponents[0] = scheduling;
    }
    
    
    
    /**
     * Define the ASN1 Type Scheduling from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Scheduling extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Scheduling()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Scheduling(SegCount segCount, Sib_Pos sib_Pos, 
			SibOFF_List sib_PosOffsetInfo)
	{
	    setSegCount(segCount);
	    setSib_Pos(sib_Pos);
	    setSib_PosOffsetInfo(sib_PosOffsetInfo);
	}
	
	/**
	 * Construct with required components.
	 */
	public Scheduling(Sib_Pos sib_Pos)
	{
	    setSib_Pos(sib_Pos);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SegCount();
	    mComponents[1] = new Sib_Pos();
	    mComponents[2] = new SibOFF_List();
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
		    return new SegCount();
		case 1:
		    return new Sib_Pos();
		case 2:
		    return new SibOFF_List();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	// Default Values
	public static final SegCount segCount__default = 
	    new SegCount(1);
	
	// Methods for field "segCount"
	public SegCount getSegCount()
	{
	    if (hasSegCount())
		return (SegCount)mComponents[0];
	    else
		return (SegCount)segCount__default.clone();
	}
	
	public void setSegCount(SegCount segCount)
	{
	    mComponents[0] = segCount;
	}
	
	public void setSegCountToDefault()
	{
	    setSegCount(segCount__default);
	}
	
	public boolean hasDefaultSegCount()
	{
	    return true;
	}
	
	public boolean hasSegCount()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteSegCount()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "sib_Pos"
	public Sib_Pos getSib_Pos()
	{
	    return (Sib_Pos)mComponents[1];
	}
	
	public void setSib_Pos(Sib_Pos sib_Pos)
	{
	    mComponents[1] = sib_Pos;
	}
	
	
	
	/**
	 * Define the ASN1 Type Sib_Pos from ASN1 Module InformationElements.
	 * @see Choice
	 */
	public static class Sib_Pos extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Sib_Pos()
	    {
	    }
	    
	    public static final  int  rep4_chosen = 1;
	    public static final  int  rep8_chosen = 2;
	    public static final  int  rep16_chosen = 3;
	    public static final  int  rep32_chosen = 4;
	    public static final  int  rep64_chosen = 5;
	    public static final  int  rep128_chosen = 6;
	    public static final  int  rep256_chosen = 7;
	    public static final  int  rep512_chosen = 8;
	    public static final  int  rep1024_chosen = 9;
	    public static final  int  rep2048_chosen = 10;
	    public static final  int  rep4096_chosen = 11;
	    
	    // Methods for field "rep4"
	    public static Sib_Pos createSib_PosWithRep4(long rep4)
	    {
		return createSib_PosWithRep4(new INTEGER(rep4));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep4(INTEGER rep4)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep4(rep4);
		return __object;
	    }
	    
	    public boolean hasRep4()
	    {
		return getChosenFlag() == rep4_chosen;
	    }
	    
	    public void setRep4(long rep4)
	    {
		setRep4(new INTEGER(rep4));
	    }
	    
	    public void setRep4(INTEGER rep4)
	    {
		setChosenValue(rep4);
		setChosenFlag(rep4_chosen);
	    }
	    
	    
	    // Methods for field "rep8"
	    public static Sib_Pos createSib_PosWithRep8(long rep8)
	    {
		return createSib_PosWithRep8(new INTEGER(rep8));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep8(INTEGER rep8)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep8(rep8);
		return __object;
	    }
	    
	    public boolean hasRep8()
	    {
		return getChosenFlag() == rep8_chosen;
	    }
	    
	    public void setRep8(long rep8)
	    {
		setRep8(new INTEGER(rep8));
	    }
	    
	    public void setRep8(INTEGER rep8)
	    {
		setChosenValue(rep8);
		setChosenFlag(rep8_chosen);
	    }
	    
	    
	    // Methods for field "rep16"
	    public static Sib_Pos createSib_PosWithRep16(long rep16)
	    {
		return createSib_PosWithRep16(new INTEGER(rep16));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep16(INTEGER rep16)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep16(rep16);
		return __object;
	    }
	    
	    public boolean hasRep16()
	    {
		return getChosenFlag() == rep16_chosen;
	    }
	    
	    public void setRep16(long rep16)
	    {
		setRep16(new INTEGER(rep16));
	    }
	    
	    public void setRep16(INTEGER rep16)
	    {
		setChosenValue(rep16);
		setChosenFlag(rep16_chosen);
	    }
	    
	    
	    // Methods for field "rep32"
	    public static Sib_Pos createSib_PosWithRep32(long rep32)
	    {
		return createSib_PosWithRep32(new INTEGER(rep32));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep32(INTEGER rep32)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep32(rep32);
		return __object;
	    }
	    
	    public boolean hasRep32()
	    {
		return getChosenFlag() == rep32_chosen;
	    }
	    
	    public void setRep32(long rep32)
	    {
		setRep32(new INTEGER(rep32));
	    }
	    
	    public void setRep32(INTEGER rep32)
	    {
		setChosenValue(rep32);
		setChosenFlag(rep32_chosen);
	    }
	    
	    
	    // Methods for field "rep64"
	    public static Sib_Pos createSib_PosWithRep64(long rep64)
	    {
		return createSib_PosWithRep64(new INTEGER(rep64));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep64(INTEGER rep64)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep64(rep64);
		return __object;
	    }
	    
	    public boolean hasRep64()
	    {
		return getChosenFlag() == rep64_chosen;
	    }
	    
	    public void setRep64(long rep64)
	    {
		setRep64(new INTEGER(rep64));
	    }
	    
	    public void setRep64(INTEGER rep64)
	    {
		setChosenValue(rep64);
		setChosenFlag(rep64_chosen);
	    }
	    
	    
	    // Methods for field "rep128"
	    public static Sib_Pos createSib_PosWithRep128(long rep128)
	    {
		return createSib_PosWithRep128(new INTEGER(rep128));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep128(INTEGER rep128)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep128(rep128);
		return __object;
	    }
	    
	    public boolean hasRep128()
	    {
		return getChosenFlag() == rep128_chosen;
	    }
	    
	    public void setRep128(long rep128)
	    {
		setRep128(new INTEGER(rep128));
	    }
	    
	    public void setRep128(INTEGER rep128)
	    {
		setChosenValue(rep128);
		setChosenFlag(rep128_chosen);
	    }
	    
	    
	    // Methods for field "rep256"
	    public static Sib_Pos createSib_PosWithRep256(long rep256)
	    {
		return createSib_PosWithRep256(new INTEGER(rep256));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep256(INTEGER rep256)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep256(rep256);
		return __object;
	    }
	    
	    public boolean hasRep256()
	    {
		return getChosenFlag() == rep256_chosen;
	    }
	    
	    public void setRep256(long rep256)
	    {
		setRep256(new INTEGER(rep256));
	    }
	    
	    public void setRep256(INTEGER rep256)
	    {
		setChosenValue(rep256);
		setChosenFlag(rep256_chosen);
	    }
	    
	    
	    // Methods for field "rep512"
	    public static Sib_Pos createSib_PosWithRep512(long rep512)
	    {
		return createSib_PosWithRep512(new INTEGER(rep512));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep512(INTEGER rep512)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep512(rep512);
		return __object;
	    }
	    
	    public boolean hasRep512()
	    {
		return getChosenFlag() == rep512_chosen;
	    }
	    
	    public void setRep512(long rep512)
	    {
		setRep512(new INTEGER(rep512));
	    }
	    
	    public void setRep512(INTEGER rep512)
	    {
		setChosenValue(rep512);
		setChosenFlag(rep512_chosen);
	    }
	    
	    
	    // Methods for field "rep1024"
	    public static Sib_Pos createSib_PosWithRep1024(long rep1024)
	    {
		return createSib_PosWithRep1024(new INTEGER(rep1024));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep1024(INTEGER rep1024)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep1024(rep1024);
		return __object;
	    }
	    
	    public boolean hasRep1024()
	    {
		return getChosenFlag() == rep1024_chosen;
	    }
	    
	    public void setRep1024(long rep1024)
	    {
		setRep1024(new INTEGER(rep1024));
	    }
	    
	    public void setRep1024(INTEGER rep1024)
	    {
		setChosenValue(rep1024);
		setChosenFlag(rep1024_chosen);
	    }
	    
	    
	    // Methods for field "rep2048"
	    public static Sib_Pos createSib_PosWithRep2048(long rep2048)
	    {
		return createSib_PosWithRep2048(new INTEGER(rep2048));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep2048(INTEGER rep2048)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep2048(rep2048);
		return __object;
	    }
	    
	    public boolean hasRep2048()
	    {
		return getChosenFlag() == rep2048_chosen;
	    }
	    
	    public void setRep2048(long rep2048)
	    {
		setRep2048(new INTEGER(rep2048));
	    }
	    
	    public void setRep2048(INTEGER rep2048)
	    {
		setChosenValue(rep2048);
		setChosenFlag(rep2048_chosen);
	    }
	    
	    
	    // Methods for field "rep4096"
	    public static Sib_Pos createSib_PosWithRep4096(long rep4096)
	    {
		return createSib_PosWithRep4096(new INTEGER(rep4096));
	    }
	    
	    public static Sib_Pos createSib_PosWithRep4096(INTEGER rep4096)
	    {
		Sib_Pos __object = new Sib_Pos();

		__object.setRep4096(rep4096);
		return __object;
	    }
	    
	    public boolean hasRep4096()
	    {
		return getChosenFlag() == rep4096_chosen;
	    }
	    
	    public void setRep4096(long rep4096)
	    {
		setRep4096(new INTEGER(rep4096));
	    }
	    
	    public void setRep4096(INTEGER rep4096)
	    {
		setChosenValue(rep4096);
		setChosenFlag(rep4096_chosen);
	    }
	    
	    
	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case rep4_chosen:
			return new INTEGER();
		    case rep8_chosen:
			return new INTEGER();
		    case rep16_chosen:
			return new INTEGER();
		    case rep32_chosen:
			return new INTEGER();
		    case rep64_chosen:
			return new INTEGER();
		    case rep128_chosen:
			return new INTEGER();
		    case rep256_chosen:
			return new INTEGER();
		    case rep512_chosen:
			return new INTEGER();
		    case rep1024_chosen:
			return new INTEGER();
		    case rep2048_chosen:
			return new INTEGER();
		    case rep4096_chosen:
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
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "SchedulingInformation$Scheduling$Sib_Pos"
		),
		new QName (
		    "builtin",
		    "CHOICE"
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
					    new com.oss.asn1.INTEGER(1),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(1)
				    ),
				    null
				)
			    ),
			    "rep4",
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
			    "rep8",
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
					    new com.oss.asn1.INTEGER(7),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(7)
				    ),
				    null
				)
			    ),
			    "rep16",
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
					    new com.oss.asn1.INTEGER(15),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(15)
				    ),
				    null
				)
			    ),
			    "rep32",
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
			    "rep64",
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
			    "rep128",
			    5,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8006
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
			    "rep256",
			    6,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8007
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
			    "rep512",
			    7,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8008
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
			    "rep1024",
			    8,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8009
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
			    "rep2048",
			    9,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x800a
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
					    new com.oss.asn1.INTEGER(2047),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(2047)
				    ),
				    null
				)
			    ),
			    "rep4096",
			    10,
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
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Sib_Pos object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Sib_Pos object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Sib_Pos

	// Methods for field "sib_PosOffsetInfo"
	public SibOFF_List getSib_PosOffsetInfo()
	{
	    return (SibOFF_List)mComponents[2];
	}
	
	public void setSib_PosOffsetInfo(SibOFF_List sib_PosOffsetInfo)
	{
	    mComponents[2] = sib_PosOffsetInfo;
	}
	
	public boolean hasSib_PosOffsetInfo()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteSib_PosOffsetInfo()
	{
	    setComponentAbsent(2);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SchedulingInformation$Scheduling"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
				    "SegCount"
				),
				new QName (
				    "InformationElements",
				    "SegCount"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new SegCount(1), 
					new SegCount(16),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(16)
				),
				null
			    )
			),
			"segCount",
			0,
			3,
			segCount__default
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SchedulingInformation$Scheduling$Sib_Pos"
			    )
			),
			"sib-Pos",
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
				    "SibOFF_List"
				),
				new QName (
				    "InformationElements",
				    "SibOFF-List"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(15),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(15)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"SibOFF"
				    )
				)
			    )
			),
			"sib-PosOffsetInfo",
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
			    new TagDecoderElement((short)0x8000, 0),
			    new TagDecoderElement((short)0x8001, 1)
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Scheduling object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Scheduling object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Scheduling

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
	    "SchedulingInformation"
	),
	new QName (
	    "InformationElements",
	    "SchedulingInformation"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SchedulingInformation$Scheduling"
			)
		    ),
		    "scheduling",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SchedulingInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SchedulingInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SchedulingInformation
