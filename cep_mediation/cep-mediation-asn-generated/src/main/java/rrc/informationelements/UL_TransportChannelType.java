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
 * Define the ASN1 Type UL_TransportChannelType from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_TransportChannelType extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_TransportChannelType()
    {
    }
    
    public static final  int  dch_chosen = 1;
    public static final  int  rach_chosen = 2;
    public static final  int  dummy_chosen = 3;
    public static final  int  usch_chosen = 4;
    
    // Methods for field "dch"
    public static UL_TransportChannelType createUL_TransportChannelTypeWithDch(long dch)
    {
	return createUL_TransportChannelTypeWithDch(new TransportChannelIdentity(dch));
    }
    
    public static UL_TransportChannelType createUL_TransportChannelTypeWithDch(TransportChannelIdentity dch)
    {
	UL_TransportChannelType __object = new UL_TransportChannelType();

	__object.setDch(dch);
	return __object;
    }
    
    public boolean hasDch()
    {
	return getChosenFlag() == dch_chosen;
    }
    
    public void setDch(long dch)
    {
	setDch(new TransportChannelIdentity(dch));
    }
    
    public void setDch(TransportChannelIdentity dch)
    {
	setChosenValue(dch);
	setChosenFlag(dch_chosen);
    }
    
    
    // Methods for field "rach"
    public static UL_TransportChannelType createUL_TransportChannelTypeWithRach(Null rach)
    {
	UL_TransportChannelType __object = new UL_TransportChannelType();

	__object.setRach(rach);
	return __object;
    }
    
    public boolean hasRach()
    {
	return getChosenFlag() == rach_chosen;
    }
    
    public void setRach(Null rach)
    {
	setChosenValue(rach);
	setChosenFlag(rach_chosen);
    }
    
    
    // Methods for field "dummy"
    public static UL_TransportChannelType createUL_TransportChannelTypeWithDummy(Null dummy)
    {
	UL_TransportChannelType __object = new UL_TransportChannelType();

	__object.setDummy(dummy);
	return __object;
    }
    
    public boolean hasDummy()
    {
	return getChosenFlag() == dummy_chosen;
    }
    
    public void setDummy(Null dummy)
    {
	setChosenValue(dummy);
	setChosenFlag(dummy_chosen);
    }
    
    
    // Methods for field "usch"
    public static UL_TransportChannelType createUL_TransportChannelTypeWithUsch(long usch)
    {
	return createUL_TransportChannelTypeWithUsch(new TransportChannelIdentity(usch));
    }
    
    public static UL_TransportChannelType createUL_TransportChannelTypeWithUsch(TransportChannelIdentity usch)
    {
	UL_TransportChannelType __object = new UL_TransportChannelType();

	__object.setUsch(usch);
	return __object;
    }
    
    public boolean hasUsch()
    {
	return getChosenFlag() == usch_chosen;
    }
    
    public void setUsch(long usch)
    {
	setUsch(new TransportChannelIdentity(usch));
    }
    
    public void setUsch(TransportChannelIdentity usch)
    {
	setChosenValue(usch);
	setChosenFlag(usch_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case dch_chosen:
		return new TransportChannelIdentity();
	    case rach_chosen:
		return new Null();
	    case dummy_chosen:
		return new Null();
	    case usch_chosen:
		return new TransportChannelIdentity();
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
	    "UL_TransportChannelType"
	),
	new QName (
	    "InformationElements",
	    "UL-TransportChannelType"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransportChannelIdentity(1), 
				    new TransportChannelIdentity(32),
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
		    "dch",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "rach",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "dummy",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransportChannelIdentity(1), 
				    new TransportChannelIdentity(32),
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
		    "usch",
		    3,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_TransportChannelType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TransportChannelType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TransportChannelType
