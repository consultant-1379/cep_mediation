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
 * Define the ASN1 Type Dl_rate_matching_restriction from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Dl_rate_matching_restriction extends Sequence {
    
    /**
     * The default constructor.
     */
    public Dl_rate_matching_restriction()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Dl_rate_matching_restriction(RestrictedTrCH_InfoList restrictedTrCH_InfoList)
    {
	setRestrictedTrCH_InfoList(restrictedTrCH_InfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RestrictedTrCH_InfoList();
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
		return new RestrictedTrCH_InfoList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "restrictedTrCH_InfoList"
    public RestrictedTrCH_InfoList getRestrictedTrCH_InfoList()
    {
	return (RestrictedTrCH_InfoList)mComponents[0];
    }
    
    public void setRestrictedTrCH_InfoList(RestrictedTrCH_InfoList restrictedTrCH_InfoList)
    {
	mComponents[0] = restrictedTrCH_InfoList;
    }
    
    public boolean hasRestrictedTrCH_InfoList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRestrictedTrCH_InfoList()
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
	    "Dl_rate_matching_restriction"
	),
	new QName (
	    "InformationElements",
	    "Dl-rate-matching-restriction"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RestrictedTrCH_InfoList"
			    ),
			    new QName (
				"InformationElements",
				"RestrictedTrCH-InfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RestrictedTrCH"
				)
			    )
			)
		    ),
		    "restrictedTrCH-InfoList",
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
     * Get the type descriptor (TypeInfo) of 'this' Dl_rate_matching_restriction object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Dl_rate_matching_restriction object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Dl_rate_matching_restriction
