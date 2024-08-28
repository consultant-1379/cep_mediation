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
 * Define the ASN1 Type AzimuthAndElevation_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AzimuthAndElevation_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public AzimuthAndElevation_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AzimuthAndElevation_r10(INTEGER azimuth, INTEGER elevation, 
		    INTEGER azimuthLSB, INTEGER elevationLSB)
    {
	setAzimuth(azimuth);
	setElevation(elevation);
	setAzimuthLSB(azimuthLSB);
	setElevationLSB(elevationLSB);
    }
    
    /**
     * Construct with components.
     */
    public AzimuthAndElevation_r10(long azimuth, long elevation, 
		    long azimuthLSB, long elevationLSB)
    {
	this(new INTEGER(azimuth), new INTEGER(elevation), 
	     new INTEGER(azimuthLSB), new INTEGER(elevationLSB));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
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
		return new INTEGER();
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
    
    
    // Methods for field "azimuth"
    public long getAzimuth()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setAzimuth(long azimuth)
    {
	setAzimuth(new INTEGER(azimuth));
    }
    
    public void setAzimuth(INTEGER azimuth)
    {
	mComponents[0] = azimuth;
    }
    
    
    // Methods for field "elevation"
    public long getElevation()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setElevation(long elevation)
    {
	setElevation(new INTEGER(elevation));
    }
    
    public void setElevation(INTEGER elevation)
    {
	mComponents[1] = elevation;
    }
    
    
    // Methods for field "azimuthLSB"
    public long getAzimuthLSB()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setAzimuthLSB(long azimuthLSB)
    {
	setAzimuthLSB(new INTEGER(azimuthLSB));
    }
    
    public void setAzimuthLSB(INTEGER azimuthLSB)
    {
	mComponents[2] = azimuthLSB;
    }
    
    
    // Methods for field "elevationLSB"
    public long getElevationLSB()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setElevationLSB(long elevationLSB)
    {
	setElevationLSB(new INTEGER(elevationLSB));
    }
    
    public void setElevationLSB(INTEGER elevationLSB)
    {
	mComponents[3] = elevationLSB;
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
	    "AzimuthAndElevation_r10"
	),
	new QName (
	    "InformationElements",
	    "AzimuthAndElevation-r10"
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
		    "azimuth",
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
		    "elevation",
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
		    "azimuthLSB",
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
		    "elevationLSB",
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
     * Get the type descriptor (TypeInfo) of 'this' AzimuthAndElevation_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AzimuthAndElevation_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AzimuthAndElevation_r10
