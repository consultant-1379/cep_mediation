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
 * Define the ASN1 Type DL_RFC3095_Context from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class DL_RFC3095_Context extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_RFC3095_Context()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_RFC3095_Context(INTEGER rfc3095_Context_Identity, 
		    Dl_mode dl_mode, OctetString dl_ref_ir, 
		    INTEGER dl_ref_time, INTEGER dl_curr_time, 
		    INTEGER dl_syn_offset_id, INTEGER dl_syn_slope_ts, 
		    BOOLEAN dl_dyn_changed)
    {
	setRfc3095_Context_Identity(rfc3095_Context_Identity);
	setDl_mode(dl_mode);
	setDl_ref_ir(dl_ref_ir);
	setDl_ref_time(dl_ref_time);
	setDl_curr_time(dl_curr_time);
	setDl_syn_offset_id(dl_syn_offset_id);
	setDl_syn_slope_ts(dl_syn_slope_ts);
	setDl_dyn_changed(dl_dyn_changed);
    }
    
    /**
     * Construct with components.
     */
    public DL_RFC3095_Context(long rfc3095_Context_Identity, Dl_mode dl_mode, 
		    OctetString dl_ref_ir, long dl_ref_time, 
		    long dl_curr_time, long dl_syn_offset_id, 
		    long dl_syn_slope_ts, boolean dl_dyn_changed)
    {
	this(new INTEGER(rfc3095_Context_Identity), dl_mode, dl_ref_ir, 
	     new INTEGER(dl_ref_time), new INTEGER(dl_curr_time), 
	     new INTEGER(dl_syn_offset_id), new INTEGER(dl_syn_slope_ts), 
	     new BOOLEAN(dl_dyn_changed));
    }
    
    /**
     * Construct with required components.
     */
    public DL_RFC3095_Context(long rfc3095_Context_Identity, Dl_mode dl_mode, 
		    OctetString dl_ref_ir, boolean dl_dyn_changed)
    {
	setRfc3095_Context_Identity(rfc3095_Context_Identity);
	setDl_mode(dl_mode);
	setDl_ref_ir(dl_ref_ir);
	setDl_dyn_changed(dl_dyn_changed);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = Dl_mode.u;
	mComponents[2] = new OctetString();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = new BOOLEAN();
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
		return Dl_mode.u;
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
		return new BOOLEAN();
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
    
    
    // Methods for field "dl_mode"
    public Dl_mode getDl_mode()
    {
	return (Dl_mode)mComponents[1];
    }
    
    public void setDl_mode(Dl_mode dl_mode)
    {
	mComponents[1] = dl_mode;
    }
    
    
    
    /**
     * Define the ASN1 Type Dl_mode from ASN1 Module Internode_definitions.
     * @see Enumerated
     */
    public static final class Dl_mode extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Dl_mode()
	{
	    super(cFirstNumber);
	}
	
	protected Dl_mode(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Dl_mode u =
	    new Dl_mode(0);
	public static final Dl_mode o =
	    new Dl_mode(1);
	public static final Dl_mode r =
	    new Dl_mode(2);
	private final static Dl_mode cNamedNumbers[] = {
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
	
	public static Dl_mode valueOf(long value)
	{
	    return (Dl_mode)u.lookupValue(value);
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
		"DL_RFC3095_Context$Dl_mode"
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
	 * Get the type descriptor (TypeInfo) of 'this' Dl_mode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dl_mode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dl_mode

    // Methods for field "dl_ref_ir"
    public OctetString getDl_ref_ir()
    {
	return (OctetString)mComponents[2];
    }
    
    public void setDl_ref_ir(OctetString dl_ref_ir)
    {
	mComponents[2] = dl_ref_ir;
    }
    
    
    // Methods for field "dl_ref_time"
    public long getDl_ref_time()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setDl_ref_time(long dl_ref_time)
    {
	setDl_ref_time(new INTEGER(dl_ref_time));
    }
    
    public void setDl_ref_time(INTEGER dl_ref_time)
    {
	mComponents[3] = dl_ref_time;
    }
    
    public boolean hasDl_ref_time()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDl_ref_time()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "dl_curr_time"
    public long getDl_curr_time()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setDl_curr_time(long dl_curr_time)
    {
	setDl_curr_time(new INTEGER(dl_curr_time));
    }
    
    public void setDl_curr_time(INTEGER dl_curr_time)
    {
	mComponents[4] = dl_curr_time;
    }
    
    public boolean hasDl_curr_time()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDl_curr_time()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "dl_syn_offset_id"
    public long getDl_syn_offset_id()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setDl_syn_offset_id(long dl_syn_offset_id)
    {
	setDl_syn_offset_id(new INTEGER(dl_syn_offset_id));
    }
    
    public void setDl_syn_offset_id(INTEGER dl_syn_offset_id)
    {
	mComponents[5] = dl_syn_offset_id;
    }
    
    public boolean hasDl_syn_offset_id()
    {
	return componentIsPresent(5);
    }
    
    public void deleteDl_syn_offset_id()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "dl_syn_slope_ts"
    public long getDl_syn_slope_ts()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setDl_syn_slope_ts(long dl_syn_slope_ts)
    {
	setDl_syn_slope_ts(new INTEGER(dl_syn_slope_ts));
    }
    
    public void setDl_syn_slope_ts(INTEGER dl_syn_slope_ts)
    {
	mComponents[6] = dl_syn_slope_ts;
    }
    
    public boolean hasDl_syn_slope_ts()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDl_syn_slope_ts()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "dl_dyn_changed"
    public boolean getDl_dyn_changed()
    {
	return ((BOOLEAN)mComponents[7]).booleanValue();
    }
    
    public void setDl_dyn_changed(boolean dl_dyn_changed)
    {
	setDl_dyn_changed(new BOOLEAN(dl_dyn_changed));
    }
    
    public void setDl_dyn_changed(BOOLEAN dl_dyn_changed)
    {
	mComponents[7] = dl_dyn_changed;
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
	    "DL_RFC3095_Context"
	),
	new QName (
	    "Internode-definitions",
	    "DL-RFC3095-Context"
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
			    "DL_RFC3095_Context$Dl_mode"
			)
		    ),
		    "dl-mode",
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
		    "dl-ref-ir",
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
		    "dl-ref-time",
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
		    "dl-curr-time",
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
		    "dl-syn-offset-id",
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
		    "dl-syn-slope-ts",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "dl-dyn-changed",
		    7,
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
     * Get the type descriptor (TypeInfo) of 'this' DL_RFC3095_Context object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_RFC3095_Context object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_RFC3095_Context
