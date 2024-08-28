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
 * Define the ASN1 Type HorizontalWithVerticalVelocity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HorizontalWithVerticalVelocity extends Sequence {
    
    /**
     * The default constructor.
     */
    public HorizontalWithVerticalVelocity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HorizontalWithVerticalVelocity(VerticalSpeedDirection verticalSpeedDirection, 
		    INTEGER bearing, INTEGER horizontalSpeed, 
		    INTEGER verticalSpeed)
    {
	setVerticalSpeedDirection(verticalSpeedDirection);
	setBearing(bearing);
	setHorizontalSpeed(horizontalSpeed);
	setVerticalSpeed(verticalSpeed);
    }
    
    /**
     * Construct with components.
     */
    public HorizontalWithVerticalVelocity(VerticalSpeedDirection verticalSpeedDirection, 
		    long bearing, long horizontalSpeed, long verticalSpeed)
    {
	this(verticalSpeedDirection, new INTEGER(bearing), 
	     new INTEGER(horizontalSpeed), new INTEGER(verticalSpeed));
    }
    
    public void initComponents()
    {
	mComponents[0] = VerticalSpeedDirection.upward;
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
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
		return VerticalSpeedDirection.upward;
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "verticalSpeedDirection"
    public VerticalSpeedDirection getVerticalSpeedDirection()
    {
	return (VerticalSpeedDirection)mComponents[0];
    }
    
    public void setVerticalSpeedDirection(VerticalSpeedDirection verticalSpeedDirection)
    {
	mComponents[0] = verticalSpeedDirection;
    }
    
    
    
    /**
     * Define the ASN1 Type VerticalSpeedDirection from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class VerticalSpeedDirection extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private VerticalSpeedDirection()
	{
	    super(cFirstNumber);
	}
	
	protected VerticalSpeedDirection(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final VerticalSpeedDirection upward =
	    new VerticalSpeedDirection(0);
	public static final VerticalSpeedDirection downward =
	    new VerticalSpeedDirection(1);
	private final static VerticalSpeedDirection cNamedNumbers[] = {
	     upward, 
	     downward
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
	
	public static VerticalSpeedDirection valueOf(long value)
	{
	    return (VerticalSpeedDirection)upward.lookupValue(value);
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
		"HorizontalWithVerticalVelocity$VerticalSpeedDirection"
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
			"upward",
			0
		    ),
		    new MemberListElement (
			"downward",
			1
		    )
		}
	    ),
	    0,
	    upward
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' VerticalSpeedDirection object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' VerticalSpeedDirection object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for VerticalSpeedDirection

    // Methods for field "bearing"
    public long getBearing()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setBearing(long bearing)
    {
	setBearing(new INTEGER(bearing));
    }
    
    public void setBearing(INTEGER bearing)
    {
	mComponents[1] = bearing;
    }
    
    
    // Methods for field "horizontalSpeed"
    public long getHorizontalSpeed()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setHorizontalSpeed(long horizontalSpeed)
    {
	setHorizontalSpeed(new INTEGER(horizontalSpeed));
    }
    
    public void setHorizontalSpeed(INTEGER horizontalSpeed)
    {
	mComponents[2] = horizontalSpeed;
    }
    
    
    // Methods for field "verticalSpeed"
    public long getVerticalSpeed()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setVerticalSpeed(long verticalSpeed)
    {
	setVerticalSpeed(new INTEGER(verticalSpeed));
    }
    
    public void setVerticalSpeed(INTEGER verticalSpeed)
    {
	mComponents[3] = verticalSpeed;
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
	    "HorizontalWithVerticalVelocity"
	),
	new QName (
	    "InformationElements",
	    "HorizontalWithVerticalVelocity"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HorizontalWithVerticalVelocity$VerticalSpeedDirection"
			)
		    ),
		    "verticalSpeedDirection",
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(359),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(359)
			    ),
			    null
			)
		    ),
		    "bearing",
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
		    "horizontalSpeed",
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
		    "verticalSpeed",
		    3,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HorizontalWithVerticalVelocity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HorizontalWithVerticalVelocity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HorizontalWithVerticalVelocity
