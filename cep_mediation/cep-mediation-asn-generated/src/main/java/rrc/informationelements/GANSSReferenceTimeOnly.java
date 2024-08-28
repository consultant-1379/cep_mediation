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
 * Define the ASN1 Type GANSSReferenceTimeOnly from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSSReferenceTimeOnly extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSSReferenceTimeOnly()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSSReferenceTimeOnly(INTEGER gANSS_tod, INTEGER gANSS_timeId, 
		    INTEGER gANSS_tod_uncertainty)
    {
	setGANSS_tod(gANSS_tod);
	setGANSS_timeId(gANSS_timeId);
	setGANSS_tod_uncertainty(gANSS_tod_uncertainty);
    }
    
    /**
     * Construct with components.
     */
    public GANSSReferenceTimeOnly(long gANSS_tod, long gANSS_timeId, 
		    long gANSS_tod_uncertainty)
    {
	this(new INTEGER(gANSS_tod), new INTEGER(gANSS_timeId), 
	     new INTEGER(gANSS_tod_uncertainty));
    }
    
    /**
     * Construct with required components.
     */
    public GANSSReferenceTimeOnly(long gANSS_tod)
    {
	setGANSS_tod(gANSS_tod);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gANSS_tod"
    public long getGANSS_tod()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGANSS_tod(long gANSS_tod)
    {
	setGANSS_tod(new INTEGER(gANSS_tod));
    }
    
    public void setGANSS_tod(INTEGER gANSS_tod)
    {
	mComponents[0] = gANSS_tod;
    }
    
    
    // Methods for field "gANSS_timeId"
    public long getGANSS_timeId()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setGANSS_timeId(long gANSS_timeId)
    {
	setGANSS_timeId(new INTEGER(gANSS_timeId));
    }
    
    public void setGANSS_timeId(INTEGER gANSS_timeId)
    {
	mComponents[1] = gANSS_timeId;
    }
    
    public boolean hasGANSS_timeId()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGANSS_timeId()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "gANSS_tod_uncertainty"
    public long getGANSS_tod_uncertainty()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setGANSS_tod_uncertainty(long gANSS_tod_uncertainty)
    {
	setGANSS_tod_uncertainty(new INTEGER(gANSS_tod_uncertainty));
    }
    
    public void setGANSS_tod_uncertainty(INTEGER gANSS_tod_uncertainty)
    {
	mComponents[2] = gANSS_tod_uncertainty;
    }
    
    public boolean hasGANSS_tod_uncertainty()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGANSS_tod_uncertainty()
    {
	setComponentAbsent(2);
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
	    "GANSSReferenceTimeOnly"
	),
	new QName (
	    "InformationElements",
	    "GANSSReferenceTimeOnly"
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
				    new com.oss.asn1.INTEGER(3599999),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3599999)
			    ),
			    null
			)
		    ),
		    "gANSS-tod",
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
		    "gANSS-timeId",
		    1,
		    3,
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
		    "gANSS-tod-uncertainty",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' GANSSReferenceTimeOnly object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSSReferenceTimeOnly object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSSReferenceTimeOnly
