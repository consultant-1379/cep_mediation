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
 * Define the ASN1 Type RFC3095_ContextInfo from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class RFC3095_ContextInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public RFC3095_ContextInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RFC3095_ContextInfo(rrc.informationelements.RB_Identity rb_Identity, 
		    RFC3095_Context_List rfc3095_Context_List)
    {
	setRb_Identity(rb_Identity);
	setRfc3095_Context_List(rfc3095_Context_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RB_Identity();
	mComponents[1] = new RFC3095_Context_List();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RB_Identity();
	    case 1:
		return new RFC3095_Context_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rb_Identity"
    public rrc.informationelements.RB_Identity getRb_Identity()
    {
	return (rrc.informationelements.RB_Identity)mComponents[0];
    }
    
    public void setRb_Identity(rrc.informationelements.RB_Identity rb_Identity)
    {
	mComponents[0] = rb_Identity;
    }
    
    
    // Methods for field "rfc3095_Context_List"
    public RFC3095_Context_List getRfc3095_Context_List()
    {
	return (RFC3095_Context_List)mComponents[1];
    }
    
    public void setRfc3095_Context_List(RFC3095_Context_List rfc3095_Context_List)
    {
	mComponents[1] = rfc3095_Context_List;
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
	    "RFC3095_ContextInfo"
	),
	new QName (
	    "Internode-definitions",
	    "RFC3095-ContextInfo"
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
				"rrc.informationelements",
				"RB_Identity"
			    ),
			    new QName (
				"InformationElements",
				"RB-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RB_Identity(1), 
				    new rrc.informationelements.RB_Identity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "rb-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"RFC3095_Context_List"
			    ),
			    new QName (
				"Internode-definitions",
				"RFC3095-Context-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16384),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16384)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "RFC3095_Context_List$Sequence_"
				)
			    )
			)
		    ),
		    "rfc3095-Context-List",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RFC3095_ContextInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RFC3095_ContextInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RFC3095_ContextInfo
