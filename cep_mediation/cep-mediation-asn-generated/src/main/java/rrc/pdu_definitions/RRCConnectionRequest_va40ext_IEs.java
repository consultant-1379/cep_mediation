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
 * Define the ASN1 Type RRCConnectionRequest_va40ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionRequest_va40ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRequest_va40ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionRequest_va40ext_IEs(SupportOfMoreThanTwoCells supportOfMoreThanTwoCells, 
		    SupportOf1stFrequencyBand supportOf1stFrequencyBand, 
		    SupportOf2ndFrequencyBand supportOf2ndFrequencyBand)
    {
	setSupportOfMoreThanTwoCells(supportOfMoreThanTwoCells);
	setSupportOf1stFrequencyBand(supportOf1stFrequencyBand);
	setSupportOf2ndFrequencyBand(supportOf2ndFrequencyBand);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportOfMoreThanTwoCells.higherRate;
	mComponents[1] = SupportOf1stFrequencyBand._true;
	mComponents[2] = SupportOf2ndFrequencyBand._true;
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
		return SupportOfMoreThanTwoCells.higherRate;
	    case 1:
		return SupportOf1stFrequencyBand._true;
	    case 2:
		return SupportOf2ndFrequencyBand._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfMoreThanTwoCells"
    public SupportOfMoreThanTwoCells getSupportOfMoreThanTwoCells()
    {
	return (SupportOfMoreThanTwoCells)mComponents[0];
    }
    
    public void setSupportOfMoreThanTwoCells(SupportOfMoreThanTwoCells supportOfMoreThanTwoCells)
    {
	mComponents[0] = supportOfMoreThanTwoCells;
    }
    
    public boolean hasSupportOfMoreThanTwoCells()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportOfMoreThanTwoCells()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfMoreThanTwoCells from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportOfMoreThanTwoCells extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfMoreThanTwoCells()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfMoreThanTwoCells(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfMoreThanTwoCells higherRate =
	    new SupportOfMoreThanTwoCells(0);
	public static final SupportOfMoreThanTwoCells lowerRate =
	    new SupportOfMoreThanTwoCells(1);
	private final static SupportOfMoreThanTwoCells cNamedNumbers[] = {
	     higherRate, 
	     lowerRate
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
	
	public static SupportOfMoreThanTwoCells valueOf(long value)
	{
	    return (SupportOfMoreThanTwoCells)higherRate.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RRCConnectionRequest_va40ext_IEs$SupportOfMoreThanTwoCells"
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
			"higherRate",
			0
		    ),
		    new MemberListElement (
			"lowerRate",
			1
		    )
		}
	    ),
	    0,
	    higherRate
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfMoreThanTwoCells object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfMoreThanTwoCells object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfMoreThanTwoCells

    // Methods for field "supportOf1stFrequencyBand"
    public SupportOf1stFrequencyBand getSupportOf1stFrequencyBand()
    {
	return (SupportOf1stFrequencyBand)mComponents[1];
    }
    
    public void setSupportOf1stFrequencyBand(SupportOf1stFrequencyBand supportOf1stFrequencyBand)
    {
	mComponents[1] = supportOf1stFrequencyBand;
    }
    
    public boolean hasSupportOf1stFrequencyBand()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSupportOf1stFrequencyBand()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOf1stFrequencyBand from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportOf1stFrequencyBand extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOf1stFrequencyBand()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOf1stFrequencyBand(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOf1stFrequencyBand _true =
	    new SupportOf1stFrequencyBand(0);
	private final static SupportOf1stFrequencyBand cNamedNumbers[] = {
	     _true
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
	
	public static SupportOf1stFrequencyBand valueOf(long value)
	{
	    return (SupportOf1stFrequencyBand)_true.lookupValue(value);
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
		"RRCConnectionRequest_va40ext_IEs$SupportOf1stFrequencyBand"
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
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOf1stFrequencyBand object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOf1stFrequencyBand object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOf1stFrequencyBand

    // Methods for field "supportOf2ndFrequencyBand"
    public SupportOf2ndFrequencyBand getSupportOf2ndFrequencyBand()
    {
	return (SupportOf2ndFrequencyBand)mComponents[2];
    }
    
    public void setSupportOf2ndFrequencyBand(SupportOf2ndFrequencyBand supportOf2ndFrequencyBand)
    {
	mComponents[2] = supportOf2ndFrequencyBand;
    }
    
    public boolean hasSupportOf2ndFrequencyBand()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSupportOf2ndFrequencyBand()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOf2ndFrequencyBand from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportOf2ndFrequencyBand extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOf2ndFrequencyBand()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOf2ndFrequencyBand(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOf2ndFrequencyBand _true =
	    new SupportOf2ndFrequencyBand(0);
	private final static SupportOf2ndFrequencyBand cNamedNumbers[] = {
	     _true
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
	
	public static SupportOf2ndFrequencyBand valueOf(long value)
	{
	    return (SupportOf2ndFrequencyBand)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RRCConnectionRequest_va40ext_IEs$SupportOf2ndFrequencyBand"
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
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOf2ndFrequencyBand object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOf2ndFrequencyBand object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOf2ndFrequencyBand

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
	    "RRCConnectionRequest_va40ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRequest-va40ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest_va40ext_IEs$SupportOfMoreThanTwoCells"
			)
		    ),
		    "supportOfMoreThanTwoCells",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest_va40ext_IEs$SupportOf1stFrequencyBand"
			)
		    ),
		    "supportOf1stFrequencyBand",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest_va40ext_IEs$SupportOf2ndFrequencyBand"
			)
		    ),
		    "supportOf2ndFrequencyBand",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRequest_va40ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRequest_va40ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRequest_va40ext_IEs
