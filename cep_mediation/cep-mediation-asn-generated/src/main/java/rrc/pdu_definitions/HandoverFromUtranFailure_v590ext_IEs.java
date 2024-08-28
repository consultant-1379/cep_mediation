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
 * Define the ASN1 Type HandoverFromUtranFailure_v590ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class HandoverFromUtranFailure_v590ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public HandoverFromUtranFailure_v590ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HandoverFromUtranFailure_v590ext_IEs(rrc.informationelements.GERANIu_MessageList geranIu_MessageList)
    {
	setGeranIu_MessageList(geranIu_MessageList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.GERANIu_MessageList();
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
		return new rrc.informationelements.GERANIu_MessageList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "geranIu_MessageList"
    public rrc.informationelements.GERANIu_MessageList getGeranIu_MessageList()
    {
	return (rrc.informationelements.GERANIu_MessageList)mComponents[0];
    }
    
    public void setGeranIu_MessageList(rrc.informationelements.GERANIu_MessageList geranIu_MessageList)
    {
	mComponents[0] = geranIu_MessageList;
    }
    
    public boolean hasGeranIu_MessageList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGeranIu_MessageList()
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
	    "rrc.pdu_definitions",
	    "HandoverFromUtranFailure_v590ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverFromUtranFailure-v590ext-IEs"
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
				"GERANIu_MessageList"
			    ),
			    new QName (
				"InformationElements",
				"GERANIu-MessageList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new BitStringInfo (
				    new Tags (
					new short[] {
					    0x0003
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"BitString"
				    ),
				    new QName (
					"builtin",
					"BIT STRING"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(32768),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(32768)
				    ),
				    null
				)
			    )
			)
		    ),
		    "geranIu-MessageList",
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
     * Get the type descriptor (TypeInfo) of 'this' HandoverFromUtranFailure_v590ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverFromUtranFailure_v590ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverFromUtranFailure_v590ext_IEs
