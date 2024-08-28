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
 * Define the ASN1 Type GSM_Measurements from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GSM_Measurements extends Sequence {
    
    /**
     * The default constructor.
     */
    public GSM_Measurements()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GSM_Measurements(BOOLEAN gsm900, BOOLEAN dcs1800, BOOLEAN gsm1900)
    {
	setGsm900(gsm900);
	setDcs1800(dcs1800);
	setGsm1900(gsm1900);
    }
    
    /**
     * Construct with components.
     */
    public GSM_Measurements(boolean gsm900, boolean dcs1800, boolean gsm1900)
    {
	this(new BOOLEAN(gsm900), new BOOLEAN(dcs1800), 
	     new BOOLEAN(gsm1900));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
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
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gsm900"
    public boolean getGsm900()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setGsm900(boolean gsm900)
    {
	setGsm900(new BOOLEAN(gsm900));
    }
    
    public void setGsm900(BOOLEAN gsm900)
    {
	mComponents[0] = gsm900;
    }
    
    
    // Methods for field "dcs1800"
    public boolean getDcs1800()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setDcs1800(boolean dcs1800)
    {
	setDcs1800(new BOOLEAN(dcs1800));
    }
    
    public void setDcs1800(BOOLEAN dcs1800)
    {
	mComponents[1] = dcs1800;
    }
    
    
    // Methods for field "gsm1900"
    public boolean getGsm1900()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setGsm1900(boolean gsm1900)
    {
	setGsm1900(new BOOLEAN(gsm1900));
    }
    
    public void setGsm1900(BOOLEAN gsm1900)
    {
	mComponents[2] = gsm1900;
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
	    "GSM_Measurements"
	),
	new QName (
	    "InformationElements",
	    "GSM-Measurements"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "gsm900",
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
		    "dcs1800",
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
		    "gsm1900",
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
     * Get the type descriptor (TypeInfo) of 'this' GSM_Measurements object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GSM_Measurements object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GSM_Measurements
