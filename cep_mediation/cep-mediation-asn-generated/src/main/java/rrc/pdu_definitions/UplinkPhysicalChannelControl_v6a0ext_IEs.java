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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type UplinkPhysicalChannelControl_v6a0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UplinkPhysicalChannelControl_v6a0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UplinkPhysicalChannelControl_v6a0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UplinkPhysicalChannelControl_v6a0ext_IEs(INTEGER desired_HS_SICH_PowerLevel, 
		    Tpc_Step_Size tpc_Step_Size)
    {
	setDesired_HS_SICH_PowerLevel(desired_HS_SICH_PowerLevel);
	setTpc_Step_Size(tpc_Step_Size);
    }
    
    /**
     * Construct with components.
     */
    public UplinkPhysicalChannelControl_v6a0ext_IEs(long desired_HS_SICH_PowerLevel, 
		    Tpc_Step_Size tpc_Step_Size)
    {
	this(new INTEGER(desired_HS_SICH_PowerLevel), tpc_Step_Size);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = Tpc_Step_Size.s1;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return Tpc_Step_Size.s1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "desired_HS_SICH_PowerLevel"
    public long getDesired_HS_SICH_PowerLevel()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDesired_HS_SICH_PowerLevel(long desired_HS_SICH_PowerLevel)
    {
	setDesired_HS_SICH_PowerLevel(new INTEGER(desired_HS_SICH_PowerLevel));
    }
    
    public void setDesired_HS_SICH_PowerLevel(INTEGER desired_HS_SICH_PowerLevel)
    {
	mComponents[0] = desired_HS_SICH_PowerLevel;
    }
    
    public boolean hasDesired_HS_SICH_PowerLevel()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDesired_HS_SICH_PowerLevel()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "tpc_Step_Size"
    public Tpc_Step_Size getTpc_Step_Size()
    {
	return (Tpc_Step_Size)mComponents[1];
    }
    
    public void setTpc_Step_Size(Tpc_Step_Size tpc_Step_Size)
    {
	mComponents[1] = tpc_Step_Size;
    }
    
    public boolean hasTpc_Step_Size()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTpc_Step_Size()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Tpc_Step_Size from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class Tpc_Step_Size extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Tpc_Step_Size()
	{
	    super(cFirstNumber);
	}
	
	protected Tpc_Step_Size(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Tpc_Step_Size s1 =
	    new Tpc_Step_Size(0);
	public static final Tpc_Step_Size s2 =
	    new Tpc_Step_Size(1);
	public static final Tpc_Step_Size s3 =
	    new Tpc_Step_Size(2);
	public static final Tpc_Step_Size spare1 =
	    new Tpc_Step_Size(3);
	private final static Tpc_Step_Size cNamedNumbers[] = {
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
	
	public static Tpc_Step_Size valueOf(long value)
	{
	    return (Tpc_Step_Size)s1.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UplinkPhysicalChannelControl_v6a0ext_IEs$Tpc_Step_Size"
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
	 * Get the type descriptor (TypeInfo) of 'this' Tpc_Step_Size object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tpc_Step_Size object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tpc_Step_Size

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
	    "rrc.pdu_definitions",
	    "UplinkPhysicalChannelControl_v6a0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UplinkPhysicalChannelControl-v6a0ext-IEs"
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
		    "desired-HS-SICH-PowerLevel",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UplinkPhysicalChannelControl_v6a0ext_IEs$Tpc_Step_Size"
			)
		    ),
		    "tpc-Step-Size",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UplinkPhysicalChannelControl_v6a0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UplinkPhysicalChannelControl_v6a0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UplinkPhysicalChannelControl_v6a0ext_IEs
