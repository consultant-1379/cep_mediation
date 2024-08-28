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
 * Define the ASN1 Type GANSS_Storm_Flag from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSS_Storm_Flag extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSS_Storm_Flag()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSS_Storm_Flag(BOOLEAN storm_flag_one, BOOLEAN storm_flag_two, 
		    BOOLEAN storm_flag_three, BOOLEAN storm_flag_four, 
		    BOOLEAN storm_flag_five)
    {
	setStorm_flag_one(storm_flag_one);
	setStorm_flag_two(storm_flag_two);
	setStorm_flag_three(storm_flag_three);
	setStorm_flag_four(storm_flag_four);
	setStorm_flag_five(storm_flag_five);
    }
    
    /**
     * Construct with components.
     */
    public GANSS_Storm_Flag(boolean storm_flag_one, boolean storm_flag_two, 
		    boolean storm_flag_three, boolean storm_flag_four, 
		    boolean storm_flag_five)
    {
	this(new BOOLEAN(storm_flag_one), new BOOLEAN(storm_flag_two), 
	     new BOOLEAN(storm_flag_three), new BOOLEAN(storm_flag_four), 
	     new BOOLEAN(storm_flag_five));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
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
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "storm_flag_one"
    public boolean getStorm_flag_one()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setStorm_flag_one(boolean storm_flag_one)
    {
	setStorm_flag_one(new BOOLEAN(storm_flag_one));
    }
    
    public void setStorm_flag_one(BOOLEAN storm_flag_one)
    {
	mComponents[0] = storm_flag_one;
    }
    
    
    // Methods for field "storm_flag_two"
    public boolean getStorm_flag_two()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setStorm_flag_two(boolean storm_flag_two)
    {
	setStorm_flag_two(new BOOLEAN(storm_flag_two));
    }
    
    public void setStorm_flag_two(BOOLEAN storm_flag_two)
    {
	mComponents[1] = storm_flag_two;
    }
    
    
    // Methods for field "storm_flag_three"
    public boolean getStorm_flag_three()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setStorm_flag_three(boolean storm_flag_three)
    {
	setStorm_flag_three(new BOOLEAN(storm_flag_three));
    }
    
    public void setStorm_flag_three(BOOLEAN storm_flag_three)
    {
	mComponents[2] = storm_flag_three;
    }
    
    
    // Methods for field "storm_flag_four"
    public boolean getStorm_flag_four()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setStorm_flag_four(boolean storm_flag_four)
    {
	setStorm_flag_four(new BOOLEAN(storm_flag_four));
    }
    
    public void setStorm_flag_four(BOOLEAN storm_flag_four)
    {
	mComponents[3] = storm_flag_four;
    }
    
    
    // Methods for field "storm_flag_five"
    public boolean getStorm_flag_five()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setStorm_flag_five(boolean storm_flag_five)
    {
	setStorm_flag_five(new BOOLEAN(storm_flag_five));
    }
    
    public void setStorm_flag_five(BOOLEAN storm_flag_five)
    {
	mComponents[4] = storm_flag_five;
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
	    "GANSS_Storm_Flag"
	),
	new QName (
	    "InformationElements",
	    "GANSS-Storm-Flag"
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
		    "storm-flag-one",
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
		    "storm-flag-two",
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
		    "storm-flag-three",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "storm-flag-four",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "storm-flag-five",
		    4,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSS_Storm_Flag object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSS_Storm_Flag object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSS_Storm_Flag
