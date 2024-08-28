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
 * Define the ASN1 Type SupportedCarrierCombination from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SupportedCarrierCombination extends Sequence {
    
    /**
     * The default constructor.
     */
    public SupportedCarrierCombination()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SupportedCarrierCombination(BOOLEAN carrierCombination12, 
		    BOOLEAN carrierCombination21, 
		    BOOLEAN carrierCombination13, 
		    BOOLEAN carrierCombination31, 
		    BOOLEAN carrierCombination22)
    {
	setCarrierCombination12(carrierCombination12);
	setCarrierCombination21(carrierCombination21);
	setCarrierCombination13(carrierCombination13);
	setCarrierCombination31(carrierCombination31);
	setCarrierCombination22(carrierCombination22);
    }
    
    /**
     * Construct with components.
     */
    public SupportedCarrierCombination(boolean carrierCombination12, 
		    boolean carrierCombination21, 
		    boolean carrierCombination13, 
		    boolean carrierCombination31, 
		    boolean carrierCombination22)
    {
	this(new BOOLEAN(carrierCombination12), 
	     new BOOLEAN(carrierCombination21), 
	     new BOOLEAN(carrierCombination13), 
	     new BOOLEAN(carrierCombination31), 
	     new BOOLEAN(carrierCombination22));
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
    
    
    // Methods for field "carrierCombination12"
    public boolean getCarrierCombination12()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setCarrierCombination12(boolean carrierCombination12)
    {
	setCarrierCombination12(new BOOLEAN(carrierCombination12));
    }
    
    public void setCarrierCombination12(BOOLEAN carrierCombination12)
    {
	mComponents[0] = carrierCombination12;
    }
    
    
    // Methods for field "carrierCombination21"
    public boolean getCarrierCombination21()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setCarrierCombination21(boolean carrierCombination21)
    {
	setCarrierCombination21(new BOOLEAN(carrierCombination21));
    }
    
    public void setCarrierCombination21(BOOLEAN carrierCombination21)
    {
	mComponents[1] = carrierCombination21;
    }
    
    
    // Methods for field "carrierCombination13"
    public boolean getCarrierCombination13()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setCarrierCombination13(boolean carrierCombination13)
    {
	setCarrierCombination13(new BOOLEAN(carrierCombination13));
    }
    
    public void setCarrierCombination13(BOOLEAN carrierCombination13)
    {
	mComponents[2] = carrierCombination13;
    }
    
    
    // Methods for field "carrierCombination31"
    public boolean getCarrierCombination31()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setCarrierCombination31(boolean carrierCombination31)
    {
	setCarrierCombination31(new BOOLEAN(carrierCombination31));
    }
    
    public void setCarrierCombination31(BOOLEAN carrierCombination31)
    {
	mComponents[3] = carrierCombination31;
    }
    
    
    // Methods for field "carrierCombination22"
    public boolean getCarrierCombination22()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setCarrierCombination22(boolean carrierCombination22)
    {
	setCarrierCombination22(new BOOLEAN(carrierCombination22));
    }
    
    public void setCarrierCombination22(BOOLEAN carrierCombination22)
    {
	mComponents[4] = carrierCombination22;
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
	    "SupportedCarrierCombination"
	),
	new QName (
	    "InformationElements",
	    "SupportedCarrierCombination"
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
		    "carrierCombination12",
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
		    "carrierCombination21",
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
		    "carrierCombination13",
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
		    "carrierCombination31",
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
		    "carrierCombination22",
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
     * Get the type descriptor (TypeInfo) of 'this' SupportedCarrierCombination object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SupportedCarrierCombination object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SupportedCarrierCombination
