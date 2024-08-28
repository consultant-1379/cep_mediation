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
 * Define the ASN1 Type UE_Positioning_OTDOA_ReferenceCellInfo_UEB_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_OTDOA_ReferenceCellInfo_UEB_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_OTDOA_ReferenceCellInfo_UEB_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_OTDOA_ReferenceCellInfo_UEB_ext(INTEGER roundTripTimeExtension)
    {
	setRoundTripTimeExtension(roundTripTimeExtension);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_OTDOA_ReferenceCellInfo_UEB_ext(long roundTripTimeExtension)
    {
	this(new INTEGER(roundTripTimeExtension));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "roundTripTimeExtension"
    public long getRoundTripTimeExtension()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setRoundTripTimeExtension(long roundTripTimeExtension)
    {
	setRoundTripTimeExtension(new INTEGER(roundTripTimeExtension));
    }
    
    public void setRoundTripTimeExtension(INTEGER roundTripTimeExtension)
    {
	mComponents[0] = roundTripTimeExtension;
    }
    
    public boolean hasRoundTripTimeExtension()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRoundTripTimeExtension()
    {
	setComponentAbsent(0);
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
	    "UE_Positioning_OTDOA_ReferenceCellInfo_UEB_ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-OTDOA-ReferenceCellInfo-UEB-ext"
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
				    new com.oss.asn1.INTEGER(70274),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(70274)
			    ),
			    null
			)
		    ),
		    "roundTripTimeExtension",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_OTDOA_ReferenceCellInfo_UEB_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_OTDOA_ReferenceCellInfo_UEB_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_OTDOA_ReferenceCellInfo_UEB_ext
