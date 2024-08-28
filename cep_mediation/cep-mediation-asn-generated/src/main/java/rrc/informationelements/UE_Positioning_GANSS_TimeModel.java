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
 * Define the ASN1 Type UE_Positioning_GANSS_TimeModel from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_TimeModel extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_TimeModel()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_TimeModel(INTEGER ganss_timeModelreferenceTime, 
		    INTEGER ganss_t_a0, INTEGER ganss_t_a1, 
		    INTEGER ganss_t_a2, Gnss_to_id gnss_to_id, 
		    INTEGER ganss_wk_number)
    {
	setGanss_timeModelreferenceTime(ganss_timeModelreferenceTime);
	setGanss_t_a0(ganss_t_a0);
	setGanss_t_a1(ganss_t_a1);
	setGanss_t_a2(ganss_t_a2);
	setGnss_to_id(gnss_to_id);
	setGanss_wk_number(ganss_wk_number);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GANSS_TimeModel(long ganss_timeModelreferenceTime, 
		    long ganss_t_a0, long ganss_t_a1, long ganss_t_a2, 
		    Gnss_to_id gnss_to_id, long ganss_wk_number)
    {
	this(new INTEGER(ganss_timeModelreferenceTime), 
	     new INTEGER(ganss_t_a0), new INTEGER(ganss_t_a1), 
	     new INTEGER(ganss_t_a2), gnss_to_id, 
	     new INTEGER(ganss_wk_number));
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GANSS_TimeModel(long ganss_timeModelreferenceTime, 
		    long ganss_t_a0, Gnss_to_id gnss_to_id)
    {
	setGanss_timeModelreferenceTime(ganss_timeModelreferenceTime);
	setGanss_t_a0(ganss_t_a0);
	setGnss_to_id(gnss_to_id);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = Gnss_to_id.gps;
	mComponents[5] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
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
		return new INTEGER();
	    case 4:
		return Gnss_to_id.gps;
	    case 5:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganss_timeModelreferenceTime"
    public long getGanss_timeModelreferenceTime()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanss_timeModelreferenceTime(long ganss_timeModelreferenceTime)
    {
	setGanss_timeModelreferenceTime(new INTEGER(ganss_timeModelreferenceTime));
    }
    
    public void setGanss_timeModelreferenceTime(INTEGER ganss_timeModelreferenceTime)
    {
	mComponents[0] = ganss_timeModelreferenceTime;
    }
    
    
    // Methods for field "ganss_t_a0"
    public long getGanss_t_a0()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setGanss_t_a0(long ganss_t_a0)
    {
	setGanss_t_a0(new INTEGER(ganss_t_a0));
    }
    
    public void setGanss_t_a0(INTEGER ganss_t_a0)
    {
	mComponents[1] = ganss_t_a0;
    }
    
    
    // Methods for field "ganss_t_a1"
    public long getGanss_t_a1()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setGanss_t_a1(long ganss_t_a1)
    {
	setGanss_t_a1(new INTEGER(ganss_t_a1));
    }
    
    public void setGanss_t_a1(INTEGER ganss_t_a1)
    {
	mComponents[2] = ganss_t_a1;
    }
    
    public boolean hasGanss_t_a1()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGanss_t_a1()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ganss_t_a2"
    public long getGanss_t_a2()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setGanss_t_a2(long ganss_t_a2)
    {
	setGanss_t_a2(new INTEGER(ganss_t_a2));
    }
    
    public void setGanss_t_a2(INTEGER ganss_t_a2)
    {
	mComponents[3] = ganss_t_a2;
    }
    
    public boolean hasGanss_t_a2()
    {
	return componentIsPresent(3);
    }
    
    public void deleteGanss_t_a2()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "gnss_to_id"
    public Gnss_to_id getGnss_to_id()
    {
	return (Gnss_to_id)mComponents[4];
    }
    
    public void setGnss_to_id(Gnss_to_id gnss_to_id)
    {
	mComponents[4] = gnss_to_id;
    }
    
    
    
    /**
     * Define the ASN1 Type Gnss_to_id from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Gnss_to_id extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Gnss_to_id()
	{
	    super(cFirstNumber);
	}
	
	protected Gnss_to_id(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Gnss_to_id gps =
	    new Gnss_to_id(0);
	public static final Gnss_to_id galileo =
	    new Gnss_to_id(1);
	public static final Gnss_to_id qzss =
	    new Gnss_to_id(2);
	public static final Gnss_to_id glonass =
	    new Gnss_to_id(3);
	public static final Gnss_to_id spare4 =
	    new Gnss_to_id(4);
	public static final Gnss_to_id spare3 =
	    new Gnss_to_id(5);
	public static final Gnss_to_id spare2 =
	    new Gnss_to_id(6);
	public static final Gnss_to_id spare1 =
	    new Gnss_to_id(7);
	private final static Gnss_to_id cNamedNumbers[] = {
	     gps, 
	     galileo, 
	     qzss, 
	     glonass, 
	     spare4, 
	     spare3, 
	     spare2, 
	     spare1
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static Gnss_to_id valueOf(long value)
	{
	    return (Gnss_to_id)gps.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_Positioning_GANSS_TimeModel$Gnss_to_id"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"gps",
			0
		    ),
		    new MemberListElement (
			"galileo",
			1
		    ),
		    new MemberListElement (
			"qzss",
			2
		    ),
		    new MemberListElement (
			"glonass",
			3
		    ),
		    new MemberListElement (
			"spare4",
			4
		    ),
		    new MemberListElement (
			"spare3",
			5
		    ),
		    new MemberListElement (
			"spare2",
			6
		    ),
		    new MemberListElement (
			"spare1",
			7
		    )
		}
	    ),
	    0,
	    gps
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Gnss_to_id object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Gnss_to_id object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Gnss_to_id

    // Methods for field "ganss_wk_number"
    public long getGanss_wk_number()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setGanss_wk_number(long ganss_wk_number)
    {
	setGanss_wk_number(new INTEGER(ganss_wk_number));
    }
    
    public void setGanss_wk_number(INTEGER ganss_wk_number)
    {
	mComponents[5] = ganss_wk_number;
    }
    
    public boolean hasGanss_wk_number()
    {
	return componentIsPresent(5);
    }
    
    public void deleteGanss_wk_number()
    {
	setComponentAbsent(5);
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
	    "UE_Positioning_GANSS_TimeModel"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-TimeModel"
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
				    new com.oss.asn1.INTEGER(37799),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(37799)
			    ),
			    null
			)
		    ),
		    "ganss-timeModelreferenceTime",
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
				    new com.oss.asn1.INTEGER(-2147483648), 
				    new com.oss.asn1.INTEGER(2147483647),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-2147483648),
				new java.lang.Long(2147483647)
			    ),
			    null
			)
		    ),
		    "ganss-t-a0",
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
				    new com.oss.asn1.INTEGER(-8388608), 
				    new com.oss.asn1.INTEGER(8388607),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-8388608),
				new java.lang.Long(8388607)
			    ),
			    null
			)
		    ),
		    "ganss-t-a1",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
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
				    new com.oss.asn1.INTEGER(-64), 
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-64),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "ganss-t-a2",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_GANSS_TimeModel$Gnss_to_id"
			)
		    ),
		    "gnss-to-id",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
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
				    new com.oss.asn1.INTEGER(8191),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8191)
			    ),
			    null
			)
		    ),
		    "ganss-wk-number",
		    5,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_TimeModel object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_TimeModel object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_TimeModel
