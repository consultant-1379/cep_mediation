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
 * Define the ASN1 Type EllipsoidPointUncertCircle from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EllipsoidPointUncertCircle extends Sequence {
    
    /**
     * The default constructor.
     */
    public EllipsoidPointUncertCircle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EllipsoidPointUncertCircle(LatitudeSign latitudeSign, 
		    INTEGER latitude, INTEGER longitude, 
		    INTEGER uncertaintyCode)
    {
	setLatitudeSign(latitudeSign);
	setLatitude(latitude);
	setLongitude(longitude);
	setUncertaintyCode(uncertaintyCode);
    }
    
    /**
     * Construct with components.
     */
    public EllipsoidPointUncertCircle(LatitudeSign latitudeSign, 
		    long latitude, long longitude, long uncertaintyCode)
    {
	this(latitudeSign, new INTEGER(latitude), new INTEGER(longitude), 
	     new INTEGER(uncertaintyCode));
    }
    
    public void initComponents()
    {
	mComponents[0] = LatitudeSign.north;
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
		return LatitudeSign.north;
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
    
    
    // Methods for field "latitudeSign"
    public LatitudeSign getLatitudeSign()
    {
	return (LatitudeSign)mComponents[0];
    }
    
    public void setLatitudeSign(LatitudeSign latitudeSign)
    {
	mComponents[0] = latitudeSign;
    }
    
    
    
    /**
     * Define the ASN1 Type LatitudeSign from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class LatitudeSign extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LatitudeSign()
	{
	    super(cFirstNumber);
	}
	
	protected LatitudeSign(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LatitudeSign north =
	    new LatitudeSign(0);
	public static final LatitudeSign south =
	    new LatitudeSign(1);
	private final static LatitudeSign cNamedNumbers[] = {
	     north, 
	     south
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
	
	public static LatitudeSign valueOf(long value)
	{
	    return (LatitudeSign)north.lookupValue(value);
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
		"EllipsoidPointUncertCircle$LatitudeSign"
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
			"north",
			0
		    ),
		    new MemberListElement (
			"south",
			1
		    )
		}
	    ),
	    0,
	    north
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' LatitudeSign object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LatitudeSign object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LatitudeSign

    // Methods for field "latitude"
    public long getLatitude()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setLatitude(long latitude)
    {
	setLatitude(new INTEGER(latitude));
    }
    
    public void setLatitude(INTEGER latitude)
    {
	mComponents[1] = latitude;
    }
    
    
    // Methods for field "longitude"
    public long getLongitude()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setLongitude(long longitude)
    {
	setLongitude(new INTEGER(longitude));
    }
    
    public void setLongitude(INTEGER longitude)
    {
	mComponents[2] = longitude;
    }
    
    
    // Methods for field "uncertaintyCode"
    public long getUncertaintyCode()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setUncertaintyCode(long uncertaintyCode)
    {
	setUncertaintyCode(new INTEGER(uncertaintyCode));
    }
    
    public void setUncertaintyCode(INTEGER uncertaintyCode)
    {
	mComponents[3] = uncertaintyCode;
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
	    "EllipsoidPointUncertCircle"
	),
	new QName (
	    "InformationElements",
	    "EllipsoidPointUncertCircle"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "EllipsoidPointUncertCircle$LatitudeSign"
			)
		    ),
		    "latitudeSign",
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
				    new com.oss.asn1.INTEGER(8388607),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8388607)
			    ),
			    null
			)
		    ),
		    "latitude",
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
		    "longitude",
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
		    "uncertaintyCode",
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
     * Get the type descriptor (TypeInfo) of 'this' EllipsoidPointUncertCircle object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EllipsoidPointUncertCircle object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EllipsoidPointUncertCircle
