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
 * Define the ASN1 Type RAB_Identity from ASN1 Module InformationElements.
 * @see Choice
 */

public class RAB_Identity extends Choice {
    
    /**
     * The default constructor.
     */
    public RAB_Identity()
    {
    }
    
    public static final  int  gsm_MAP_RAB_Identity_chosen = 1;
    public static final  int  ansi_41_RAB_Identity_chosen = 2;
    
    // Methods for field "gsm_MAP_RAB_Identity"
    public static RAB_Identity createRAB_IdentityWithGsm_MAP_RAB_Identity(BitString gsm_MAP_RAB_Identity)
    {
	RAB_Identity __object = new RAB_Identity();

	__object.setGsm_MAP_RAB_Identity(gsm_MAP_RAB_Identity);
	return __object;
    }
    
    public boolean hasGsm_MAP_RAB_Identity()
    {
	return getChosenFlag() == gsm_MAP_RAB_Identity_chosen;
    }
    
    public void setGsm_MAP_RAB_Identity(BitString gsm_MAP_RAB_Identity)
    {
	setChosenValue(gsm_MAP_RAB_Identity);
	setChosenFlag(gsm_MAP_RAB_Identity_chosen);
    }
    
    
    // Methods for field "ansi_41_RAB_Identity"
    public static RAB_Identity createRAB_IdentityWithAnsi_41_RAB_Identity(BitString ansi_41_RAB_Identity)
    {
	RAB_Identity __object = new RAB_Identity();

	__object.setAnsi_41_RAB_Identity(ansi_41_RAB_Identity);
	return __object;
    }
    
    public boolean hasAnsi_41_RAB_Identity()
    {
	return getChosenFlag() == ansi_41_RAB_Identity_chosen;
    }
    
    public void setAnsi_41_RAB_Identity(BitString ansi_41_RAB_Identity)
    {
	setChosenValue(ansi_41_RAB_Identity);
	setChosenFlag(ansi_41_RAB_Identity_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case gsm_MAP_RAB_Identity_chosen:
		return new BitString();
	    case ansi_41_RAB_Identity_chosen:
		return new BitString();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "RAB_Identity"
	),
	new QName (
	    "InformationElements",
	    "RAB-Identity"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "gsm-MAP-RAB-Identity",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "ansi-41-RAB-Identity",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RAB_Identity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RAB_Identity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RAB_Identity
