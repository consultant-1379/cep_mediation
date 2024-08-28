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
 * Define the ASN1 Type RLC_PDU_SizeConstraint from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RLC_PDU_SizeConstraint extends Sequence {
    
    /**
     * The default constructor.
     */
    public RLC_PDU_SizeConstraint()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RLC_PDU_SizeConstraint(LengthIndicatorSize lengthIndicatorSize, 
		    INTEGER minRLC_PDU_Size, INTEGER largestRLC_PDU_Size)
    {
	setLengthIndicatorSize(lengthIndicatorSize);
	setMinRLC_PDU_Size(minRLC_PDU_Size);
	setLargestRLC_PDU_Size(largestRLC_PDU_Size);
    }
    
    /**
     * Construct with components.
     */
    public RLC_PDU_SizeConstraint(LengthIndicatorSize lengthIndicatorSize, 
		    long minRLC_PDU_Size, long largestRLC_PDU_Size)
    {
	this(lengthIndicatorSize, new INTEGER(minRLC_PDU_Size), 
	     new INTEGER(largestRLC_PDU_Size));
    }
    
    /**
     * Construct with required components.
     */
    public RLC_PDU_SizeConstraint(long minRLC_PDU_Size, 
		    long largestRLC_PDU_Size)
    {
	setMinRLC_PDU_Size(minRLC_PDU_Size);
	setLargestRLC_PDU_Size(largestRLC_PDU_Size);
    }
    
    public void initComponents()
    {
	mComponents[0] = LengthIndicatorSize.size7;
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
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
		return LengthIndicatorSize.size7;
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "lengthIndicatorSize"
    public LengthIndicatorSize getLengthIndicatorSize()
    {
	return (LengthIndicatorSize)mComponents[0];
    }
    
    public void setLengthIndicatorSize(LengthIndicatorSize lengthIndicatorSize)
    {
	mComponents[0] = lengthIndicatorSize;
    }
    
    public boolean hasLengthIndicatorSize()
    {
	return componentIsPresent(0);
    }
    
    public void deleteLengthIndicatorSize()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type LengthIndicatorSize from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class LengthIndicatorSize extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LengthIndicatorSize()
	{
	    super(cFirstNumber);
	}
	
	protected LengthIndicatorSize(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LengthIndicatorSize size7 =
	    new LengthIndicatorSize(0);
	public static final LengthIndicatorSize size15 =
	    new LengthIndicatorSize(1);
	private final static LengthIndicatorSize cNamedNumbers[] = {
	     size7, 
	     size15
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
	
	public static LengthIndicatorSize valueOf(long value)
	{
	    return (LengthIndicatorSize)size7.lookupValue(value);
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
		"rrc.informationelements",
		"RLC_PDU_SizeConstraint$LengthIndicatorSize"
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
			"size7",
			0
		    ),
		    new MemberListElement (
			"size15",
			1
		    )
		}
	    ),
	    0,
	    size7
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' LengthIndicatorSize object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LengthIndicatorSize object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LengthIndicatorSize

    // Methods for field "minRLC_PDU_Size"
    public long getMinRLC_PDU_Size()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setMinRLC_PDU_Size(long minRLC_PDU_Size)
    {
	setMinRLC_PDU_Size(new INTEGER(minRLC_PDU_Size));
    }
    
    public void setMinRLC_PDU_Size(INTEGER minRLC_PDU_Size)
    {
	mComponents[1] = minRLC_PDU_Size;
    }
    
    
    // Methods for field "largestRLC_PDU_Size"
    public long getLargestRLC_PDU_Size()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setLargestRLC_PDU_Size(long largestRLC_PDU_Size)
    {
	setLargestRLC_PDU_Size(new INTEGER(largestRLC_PDU_Size));
    }
    
    public void setLargestRLC_PDU_Size(INTEGER largestRLC_PDU_Size)
    {
	mComponents[2] = largestRLC_PDU_Size;
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
	    "RLC_PDU_SizeConstraint"
	),
	new QName (
	    "InformationElements",
	    "RLC-PDU-SizeConstraint"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RLC_PDU_SizeConstraint$LengthIndicatorSize"
			)
		    ),
		    "lengthIndicatorSize",
		    0,
		    3,
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(1503),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1503)
			    ),
			    null
			)
		    ),
		    "minRLC-PDU-Size",
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(1503),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1503)
			    ),
			    null
			)
		    ),
		    "largestRLC-PDU-Size",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' RLC_PDU_SizeConstraint object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RLC_PDU_SizeConstraint object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RLC_PDU_SizeConstraint
