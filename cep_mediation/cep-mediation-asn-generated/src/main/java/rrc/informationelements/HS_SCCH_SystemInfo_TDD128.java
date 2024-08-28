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
 * Define the ASN1 Type HS_SCCH_SystemInfo_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_SCCH_SystemInfo_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_SCCH_SystemInfo_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_SCCH_SystemInfo_TDD128(Hs_SCCH_SetConfiguration hs_SCCH_SetConfiguration, 
		    INTEGER power_level_HSSICH, INTEGER nack_ack_power_offset, 
		    Tpc_step_size tpc_step_size, Bler_Target bler_target, 
		    INTEGER power_control_gap, 
		    BOOLEAN pathloss_compensation_switch)
    {
	setHs_SCCH_SetConfiguration(hs_SCCH_SetConfiguration);
	setPower_level_HSSICH(power_level_HSSICH);
	setNack_ack_power_offset(nack_ack_power_offset);
	setTpc_step_size(tpc_step_size);
	setBler_target(bler_target);
	setPower_control_gap(power_control_gap);
	setPathloss_compensation_switch(pathloss_compensation_switch);
    }
    
    /**
     * Construct with components.
     */
    public HS_SCCH_SystemInfo_TDD128(Hs_SCCH_SetConfiguration hs_SCCH_SetConfiguration, 
		    long power_level_HSSICH, long nack_ack_power_offset, 
		    Tpc_step_size tpc_step_size, Bler_Target bler_target, 
		    long power_control_gap, 
		    boolean pathloss_compensation_switch)
    {
	this(hs_SCCH_SetConfiguration, new INTEGER(power_level_HSSICH), 
	     new INTEGER(nack_ack_power_offset), tpc_step_size, 
	     bler_target, new INTEGER(power_control_gap), 
	     new BOOLEAN(pathloss_compensation_switch));
    }
    
    /**
     * Construct with required components.
     */
    public HS_SCCH_SystemInfo_TDD128(Hs_SCCH_SetConfiguration hs_SCCH_SetConfiguration, 
		    long power_level_HSSICH, long nack_ack_power_offset, 
		    Tpc_step_size tpc_step_size, Bler_Target bler_target)
    {
	setHs_SCCH_SetConfiguration(hs_SCCH_SetConfiguration);
	setPower_level_HSSICH(power_level_HSSICH);
	setNack_ack_power_offset(nack_ack_power_offset);
	setTpc_step_size(tpc_step_size);
	setBler_target(bler_target);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Hs_SCCH_SetConfiguration();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = Tpc_step_size.s1;
	mComponents[4] = new Bler_Target();
	mComponents[5] = new INTEGER();
	mComponents[6] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Hs_SCCH_SetConfiguration();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return Tpc_step_size.s1;
	    case 4:
		return new Bler_Target();
	    case 5:
		return new INTEGER();
	    case 6:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hs_SCCH_SetConfiguration"
    public Hs_SCCH_SetConfiguration getHs_SCCH_SetConfiguration()
    {
	return (Hs_SCCH_SetConfiguration)mComponents[0];
    }
    
    public void setHs_SCCH_SetConfiguration(Hs_SCCH_SetConfiguration hs_SCCH_SetConfiguration)
    {
	mComponents[0] = hs_SCCH_SetConfiguration;
    }
    
    
    
    /**
     * Define the ASN1 Type Hs_SCCH_SetConfiguration from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Hs_SCCH_SetConfiguration extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Hs_SCCH_SetConfiguration()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Hs_SCCH_SetConfiguration(HS_SCCH_TDD128_r6[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(HS_SCCH_TDD128_r6 element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(HS_SCCH_TDD128_r6 element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized HS_SCCH_TDD128_r6 get(int atIndex)
	{
	    return (HS_SCCH_TDD128_r6)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(HS_SCCH_TDD128_r6 element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(HS_SCCH_TDD128_r6 element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new HS_SCCH_TDD128_r6();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"HS_SCCH_SystemInfo_TDD128$Hs_SCCH_SetConfiguration"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    12314,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new com.oss.asn1.INTEGER(1), 
			new com.oss.asn1.INTEGER(4),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(4)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "HS_SCCH_TDD128_r6"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Hs_SCCH_SetConfiguration object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Hs_SCCH_SetConfiguration object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Hs_SCCH_SetConfiguration

    // Methods for field "power_level_HSSICH"
    public long getPower_level_HSSICH()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setPower_level_HSSICH(long power_level_HSSICH)
    {
	setPower_level_HSSICH(new INTEGER(power_level_HSSICH));
    }
    
    public void setPower_level_HSSICH(INTEGER power_level_HSSICH)
    {
	mComponents[1] = power_level_HSSICH;
    }
    
    
    // Methods for field "nack_ack_power_offset"
    public long getNack_ack_power_offset()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setNack_ack_power_offset(long nack_ack_power_offset)
    {
	setNack_ack_power_offset(new INTEGER(nack_ack_power_offset));
    }
    
    public void setNack_ack_power_offset(INTEGER nack_ack_power_offset)
    {
	mComponents[2] = nack_ack_power_offset;
    }
    
    
    // Methods for field "tpc_step_size"
    public Tpc_step_size getTpc_step_size()
    {
	return (Tpc_step_size)mComponents[3];
    }
    
    public void setTpc_step_size(Tpc_step_size tpc_step_size)
    {
	mComponents[3] = tpc_step_size;
    }
    
    
    
    /**
     * Define the ASN1 Type Tpc_step_size from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Tpc_step_size extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Tpc_step_size()
	{
	    super(cFirstNumber);
	}
	
	protected Tpc_step_size(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Tpc_step_size s1 =
	    new Tpc_step_size(0);
	public static final Tpc_step_size s2 =
	    new Tpc_step_size(1);
	public static final Tpc_step_size s3 =
	    new Tpc_step_size(2);
	public static final Tpc_step_size spare1 =
	    new Tpc_step_size(3);
	private final static Tpc_step_size cNamedNumbers[] = {
	     s1, 
	     s2, 
	     s3, 
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
	
	public static Tpc_step_size valueOf(long value)
	{
	    return (Tpc_step_size)s1.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"HS_SCCH_SystemInfo_TDD128$Tpc_step_size"
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
			"s1",
			0
		    ),
		    new MemberListElement (
			"s2",
			1
		    ),
		    new MemberListElement (
			"s3",
			2
		    ),
		    new MemberListElement (
			"spare1",
			3
		    )
		}
	    ),
	    0,
	    s1
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tpc_step_size object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tpc_step_size object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tpc_step_size

    // Methods for field "bler_target"
    public Bler_Target getBler_target()
    {
	return (Bler_Target)mComponents[4];
    }
    
    public void setBler_target(Bler_Target bler_target)
    {
	mComponents[4] = bler_target;
    }
    
    
    // Methods for field "power_control_gap"
    public long getPower_control_gap()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setPower_control_gap(long power_control_gap)
    {
	setPower_control_gap(new INTEGER(power_control_gap));
    }
    
    public void setPower_control_gap(INTEGER power_control_gap)
    {
	mComponents[5] = power_control_gap;
    }
    
    public boolean hasPower_control_gap()
    {
	return componentIsPresent(5);
    }
    
    public void deletePower_control_gap()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "pathloss_compensation_switch"
    public boolean getPathloss_compensation_switch()
    {
	return ((BOOLEAN)mComponents[6]).booleanValue();
    }
    
    public void setPathloss_compensation_switch(boolean pathloss_compensation_switch)
    {
	setPathloss_compensation_switch(new BOOLEAN(pathloss_compensation_switch));
    }
    
    public void setPathloss_compensation_switch(BOOLEAN pathloss_compensation_switch)
    {
	mComponents[6] = pathloss_compensation_switch;
    }
    
    public boolean hasPathloss_compensation_switch()
    {
	return componentIsPresent(6);
    }
    
    public void deletePathloss_compensation_switch()
    {
	setComponentAbsent(6);
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
	    "HS_SCCH_SystemInfo_TDD128"
	),
	new QName (
	    "InformationElements",
	    "HS-SCCH-SystemInfo-TDD128"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_SystemInfo_TDD128$Hs_SCCH_SetConfiguration"
			)
		    ),
		    "hs-SCCH-SetConfiguration",
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
				    new com.oss.asn1.INTEGER(-120), 
				    new com.oss.asn1.INTEGER(-58),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-120),
				new java.lang.Long(-58)
			    ),
			    null
			)
		    ),
		    "power-level-HSSICH",
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
				    new com.oss.asn1.INTEGER(-7), 
				    new com.oss.asn1.INTEGER(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-7),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "nack-ack-power-offset",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_SystemInfo_TDD128$Tpc_step_size"
			)
		    ),
		    "tpc-step-size",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Bler_Target"
			    ),
			    new QName (
				"InformationElements",
				"Bler-Target"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Bler_Target(-63), 
				    new Bler_Target(0),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-63),
				new java.lang.Long(0)
			    ),
			    null
			)
		    ),
		    "bler-target",
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "power-control-gap",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "pathloss-compensation-switch",
		    6,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_SystemInfo_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_SystemInfo_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SCCH_SystemInfo_TDD128
