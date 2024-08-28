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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type UL_RFC3095_Context from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class UL_RFC3095_Context extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_RFC3095_Context()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_RFC3095_Context(INTEGER rfc3095_Context_Identity, 
		    Ul_mode ul_mode, OctetString ul_ref_ir, 
		    INTEGER ul_ref_time, INTEGER ul_curr_time, 
		    INTEGER ul_syn_offset_id, INTEGER ul_syn_slope_ts, 
		    INTEGER ul_ref_sn_1)
    {
	setRfc3095_Context_Identity(rfc3095_Context_Identity);
	setUl_mode(ul_mode);
	setUl_ref_ir(ul_ref_ir);
	setUl_ref_time(ul_ref_time);
	setUl_curr_time(ul_curr_time);
	setUl_syn_offset_id(ul_syn_offset_id);
	setUl_syn_slope_ts(ul_syn_slope_ts);
	setUl_ref_sn_1(ul_ref_sn_1);
    }
    
    /**
     * Construct with components.
     */
    public UL_RFC3095_Context(long rfc3095_Context_Identity, Ul_mode ul_mode, 
		    OctetString ul_ref_ir, long ul_ref_time, 
		    long ul_curr_time, long ul_syn_offset_id, 
		    long ul_syn_slope_ts, long ul_ref_sn_1)
    {
	this(new INTEGER(rfc3095_Context_Identity), ul_mode, ul_ref_ir, 
	     new INTEGER(ul_ref_time), new INTEGER(ul_curr_time), 
	     new INTEGER(ul_syn_offset_id), new INTEGER(ul_syn_slope_ts), 
	     new INTEGER(ul_ref_sn_1));
    }
    
    /**
     * Construct with required components.
     */
    public UL_RFC3095_Context(long rfc3095_Context_Identity, Ul_mode ul_mode, 
		    OctetString ul_ref_ir)
    {
	setRfc3095_Context_Identity(rfc3095_Context_Identity);
	setUl_mode(ul_mode);
	setUl_ref_ir(ul_ref_ir);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = Ul_mode.u;
	mComponents[2] = new OctetString();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return Ul_mode.u;
	    case 2:
		return new OctetString();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new INTEGER();
	    case 7:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rfc3095_Context_Identity"
    public long getRfc3095_Context_Identity()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setRfc3095_Context_Identity(long rfc3095_Context_Identity)
    {
	setRfc3095_Context_Identity(new INTEGER(rfc3095_Context_Identity));
    }
    
    public void setRfc3095_Context_Identity(INTEGER rfc3095_Context_Identity)
    {
	mComponents[0] = rfc3095_Context_Identity;
    }
    
    
    // Methods for field "ul_mode"
    public Ul_mode getUl_mode()
    {
	return (Ul_mode)mComponents[1];
    }
    
    public void setUl_mode(Ul_mode ul_mode)
    {
	mComponents[1] = ul_mode;
    }
    
    
    
    /**
     * Define the ASN1 Type Ul_mode from ASN1 Module Internode_definitions.
     * @see Enumerated
     */
    public static final class Ul_mode extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Ul_mode()
	{
	    super(cFirstNumber);
	}
	
	protected Ul_mode(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Ul_mode u =
	    new Ul_mode(0);
	public static final Ul_mode o =
	    new Ul_mode(1);
	public static final Ul_mode r =
	    new Ul_mode(2);
	private final static Ul_mode cNamedNumbers[] = {
	     u, 
	     o, 
	     r
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
	
	public static Ul_mode valueOf(long value)
	{
	    return (Ul_mode)u.lookupValue(value);
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
		"rrc.internode_definitions",
		"UL_RFC3095_Context$Ul_mode"
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
			"u",
			0
		    ),
		    new MemberListElement (
			"o",
			1
		    ),
		    new MemberListElement (
			"r",
			2
		    )
		}
	    ),
	    0,
	    u
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Ul_mode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Ul_mode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Ul_mode

    // Methods for field "ul_ref_ir"
    public OctetString getUl_ref_ir()
    {
	return (OctetString)mComponents[2];
    }
    
    public void setUl_ref_ir(OctetString ul_ref_ir)
    {
	mComponents[2] = ul_ref_ir;
    }
    
    
    // Methods for field "ul_ref_time"
    public long getUl_ref_time()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setUl_ref_time(long ul_ref_time)
    {
	setUl_ref_time(new INTEGER(ul_ref_time));
    }
    
    public void setUl_ref_time(INTEGER ul_ref_time)
    {
	mComponents[3] = ul_ref_time;
    }
    
    public boolean hasUl_ref_time()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUl_ref_time()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "ul_curr_time"
    public long getUl_curr_time()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setUl_curr_time(long ul_curr_time)
    {
	setUl_curr_time(new INTEGER(ul_curr_time));
    }
    
    public void setUl_curr_time(INTEGER ul_curr_time)
    {
	mComponents[4] = ul_curr_time;
    }
    
    public boolean hasUl_curr_time()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUl_curr_time()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "ul_syn_offset_id"
    public long getUl_syn_offset_id()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setUl_syn_offset_id(long ul_syn_offset_id)
    {
	setUl_syn_offset_id(new INTEGER(ul_syn_offset_id));
    }
    
    public void setUl_syn_offset_id(INTEGER ul_syn_offset_id)
    {
	mComponents[5] = ul_syn_offset_id;
    }
    
    public boolean hasUl_syn_offset_id()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUl_syn_offset_id()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "ul_syn_slope_ts"
    public long getUl_syn_slope_ts()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setUl_syn_slope_ts(long ul_syn_slope_ts)
    {
	setUl_syn_slope_ts(new INTEGER(ul_syn_slope_ts));
    }
    
    public void setUl_syn_slope_ts(INTEGER ul_syn_slope_ts)
    {
	mComponents[6] = ul_syn_slope_ts;
    }
    
    public boolean hasUl_syn_slope_ts()
    {
	return componentIsPresent(6);
    }
    
    public void deleteUl_syn_slope_ts()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "ul_ref_sn_1"
    public long getUl_ref_sn_1()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setUl_ref_sn_1(long ul_ref_sn_1)
    {
	setUl_ref_sn_1(new INTEGER(ul_ref_sn_1));
    }
    
    public void setUl_ref_sn_1(INTEGER ul_ref_sn_1)
    {
	mComponents[7] = ul_ref_sn_1;
    }
    
    public boolean hasUl_ref_sn_1()
    {
	return componentIsPresent(7);
    }
    
    public void deleteUl_ref_sn_1()
    {
	setComponentAbsent(7);
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
	    "rrc.internode_definitions",
	    "UL_RFC3095_Context"
	),
	new QName (
	    "Internode-definitions",
	    "UL-RFC3095-Context"
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
				    new com.oss.asn1.INTEGER(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "rfc3095-Context-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "UL_RFC3095_Context$Ul_mode"
			)
		    ),
		    "ul-mode",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(3000),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(3000)
			    )
			)
		    ),
		    "ul-ref-ir",
		    2,
		    2,
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(4294967295L),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4294967295L)
			    ),
			    null
			)
		    ),
		    "ul-ref-time",
		    3,
		    3,
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
				    new com.oss.asn1.INTEGER(4294967295L),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4294967295L)
			    ),
			    null
			)
		    ),
		    "ul-curr-time",
		    4,
		    3,
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
				    new com.oss.asn1.INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "ul-syn-offset-id",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
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
				    new com.oss.asn1.INTEGER(4294967295L),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4294967295L)
			    ),
			    null
			)
		    ),
		    "ul-syn-slope-ts",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
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
				    new com.oss.asn1.INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "ul-ref-sn-1",
		    7,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_RFC3095_Context object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_RFC3095_Context object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_RFC3095_Context
