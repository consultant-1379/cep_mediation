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
 * Define the ASN1 Type Rb_timer_indicator from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Rb_timer_indicator extends Sequence {
    
    /**
     * The default constructor.
     */
    public Rb_timer_indicator()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Rb_timer_indicator(BOOLEAN t314_expired, BOOLEAN t315_expired)
    {
	setT314_expired(t314_expired);
	setT315_expired(t315_expired);
    }
    
    /**
     * Construct with components.
     */
    public Rb_timer_indicator(boolean t314_expired, boolean t315_expired)
    {
	this(new BOOLEAN(t314_expired), new BOOLEAN(t315_expired));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
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
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "t314_expired"
    public boolean getT314_expired()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setT314_expired(boolean t314_expired)
    {
	setT314_expired(new BOOLEAN(t314_expired));
    }
    
    public void setT314_expired(BOOLEAN t314_expired)
    {
	mComponents[0] = t314_expired;
    }
    
    
    // Methods for field "t315_expired"
    public boolean getT315_expired()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setT315_expired(boolean t315_expired)
    {
	setT315_expired(new BOOLEAN(t315_expired));
    }
    
    public void setT315_expired(BOOLEAN t315_expired)
    {
	mComponents[1] = t315_expired;
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
	    "Rb_timer_indicator"
	),
	new QName (
	    "InformationElements",
	    "Rb-timer-indicator"
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
		    "t314-expired",
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
		    "t315-expired",
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
     * Get the type descriptor (TypeInfo) of 'this' Rb_timer_indicator object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Rb_timer_indicator object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Rb_timer_indicator
