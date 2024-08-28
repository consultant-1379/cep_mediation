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
 * Define the ASN1 Type RB_PDCPContextRelocation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RB_PDCPContextRelocation extends Sequence {
    
    /**
     * The default constructor.
     */
    public RB_PDCPContextRelocation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RB_PDCPContextRelocation(RB_Identity rb_Identity, 
		    BOOLEAN dl_RFC3095_Context_Relocation, 
		    BOOLEAN ul_RFC3095_Context_Relocation)
    {
	setRb_Identity(rb_Identity);
	setDl_RFC3095_Context_Relocation(dl_RFC3095_Context_Relocation);
	setUl_RFC3095_Context_Relocation(ul_RFC3095_Context_Relocation);
    }
    
    /**
     * Construct with components.
     */
    public RB_PDCPContextRelocation(RB_Identity rb_Identity, 
		    boolean dl_RFC3095_Context_Relocation, 
		    boolean ul_RFC3095_Context_Relocation)
    {
	this(rb_Identity, new BOOLEAN(dl_RFC3095_Context_Relocation), 
	     new BOOLEAN(ul_RFC3095_Context_Relocation));
    }
    
    public void initComponents()
    {
	mComponents[0] = new RB_Identity();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
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
		return new RB_Identity();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rb_Identity"
    public RB_Identity getRb_Identity()
    {
	return (RB_Identity)mComponents[0];
    }
    
    public void setRb_Identity(RB_Identity rb_Identity)
    {
	mComponents[0] = rb_Identity;
    }
    
    
    // Methods for field "dl_RFC3095_Context_Relocation"
    public boolean getDl_RFC3095_Context_Relocation()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setDl_RFC3095_Context_Relocation(boolean dl_RFC3095_Context_Relocation)
    {
	setDl_RFC3095_Context_Relocation(new BOOLEAN(dl_RFC3095_Context_Relocation));
    }
    
    public void setDl_RFC3095_Context_Relocation(BOOLEAN dl_RFC3095_Context_Relocation)
    {
	mComponents[1] = dl_RFC3095_Context_Relocation;
    }
    
    
    // Methods for field "ul_RFC3095_Context_Relocation"
    public boolean getUl_RFC3095_Context_Relocation()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setUl_RFC3095_Context_Relocation(boolean ul_RFC3095_Context_Relocation)
    {
	setUl_RFC3095_Context_Relocation(new BOOLEAN(ul_RFC3095_Context_Relocation));
    }
    
    public void setUl_RFC3095_Context_Relocation(BOOLEAN ul_RFC3095_Context_Relocation)
    {
	mComponents[2] = ul_RFC3095_Context_Relocation;
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
	    "RB_PDCPContextRelocation"
	),
	new QName (
	    "InformationElements",
	    "RB-PDCPContextRelocation"
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
				    new RB_Identity(1), 
				    new RB_Identity(32),
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
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "dl-RFC3095-Context-Relocation",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ul-RFC3095-Context-Relocation",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RB_PDCPContextRelocation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RB_PDCPContextRelocation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RB_PDCPContextRelocation
