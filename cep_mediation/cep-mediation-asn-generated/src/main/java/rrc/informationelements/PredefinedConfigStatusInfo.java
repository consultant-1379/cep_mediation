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
 * Define the ASN1 Type PredefinedConfigStatusInfo from ASN1 Module InformationElements.
 * @see Choice
 */

public class PredefinedConfigStatusInfo extends Choice {
    
    /**
     * The default constructor.
     */
    public PredefinedConfigStatusInfo()
    {
    }
    
    public static final  int  storedWithValueTagSameAsPrevius_chosen = 1;
    public static final  int  other_chosen = 2;
    
    // Methods for field "storedWithValueTagSameAsPrevius"
    public static PredefinedConfigStatusInfo createPredefinedConfigStatusInfoWithStoredWithValueTagSameAsPrevius(Null storedWithValueTagSameAsPrevius)
    {
	PredefinedConfigStatusInfo __object = new PredefinedConfigStatusInfo();

	__object.setStoredWithValueTagSameAsPrevius(storedWithValueTagSameAsPrevius);
	return __object;
    }
    
    public boolean hasStoredWithValueTagSameAsPrevius()
    {
	return getChosenFlag() == storedWithValueTagSameAsPrevius_chosen;
    }
    
    public void setStoredWithValueTagSameAsPrevius(Null storedWithValueTagSameAsPrevius)
    {
	setChosenValue(storedWithValueTagSameAsPrevius);
	setChosenFlag(storedWithValueTagSameAsPrevius_chosen);
    }
    
    
    // Methods for field "other"
    public static PredefinedConfigStatusInfo createPredefinedConfigStatusInfoWithOther(Other other)
    {
	PredefinedConfigStatusInfo __object = new PredefinedConfigStatusInfo();

	__object.setOther(other);
	return __object;
    }
    
    public boolean hasOther()
    {
	return getChosenFlag() == other_chosen;
    }
    
    public void setOther(Other other)
    {
	setChosenValue(other);
	setChosenFlag(other_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Other from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Other extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Other()
	{
	}
	
	public static final  int  notStored_chosen = 1;
	public static final  int  storedWithDifferentValueTag_chosen = 2;
	
	// Methods for field "notStored"
	public static Other createOtherWithNotStored(Null notStored)
	{
	    Other __object = new Other();

	    __object.setNotStored(notStored);
	    return __object;
	}
	
	public boolean hasNotStored()
	{
	    return getChosenFlag() == notStored_chosen;
	}
	
	public void setNotStored(Null notStored)
	{
	    setChosenValue(notStored);
	    setChosenFlag(notStored_chosen);
	}
	
	
	// Methods for field "storedWithDifferentValueTag"
	public static Other createOtherWithStoredWithDifferentValueTag(long storedWithDifferentValueTag)
	{
	    return createOtherWithStoredWithDifferentValueTag(new PredefinedConfigValueTag(storedWithDifferentValueTag));
	}
	
	public static Other createOtherWithStoredWithDifferentValueTag(PredefinedConfigValueTag storedWithDifferentValueTag)
	{
	    Other __object = new Other();

	    __object.setStoredWithDifferentValueTag(storedWithDifferentValueTag);
	    return __object;
	}
	
	public boolean hasStoredWithDifferentValueTag()
	{
	    return getChosenFlag() == storedWithDifferentValueTag_chosen;
	}
	
	public void setStoredWithDifferentValueTag(long storedWithDifferentValueTag)
	{
	    setStoredWithDifferentValueTag(new PredefinedConfigValueTag(storedWithDifferentValueTag));
	}
	
	public void setStoredWithDifferentValueTag(PredefinedConfigValueTag storedWithDifferentValueTag)
	{
	    setChosenValue(storedWithDifferentValueTag);
	    setChosenFlag(storedWithDifferentValueTag_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case notStored_chosen:
		    return new Null();
		case storedWithDifferentValueTag_chosen:
		    return new PredefinedConfigValueTag();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PredefinedConfigStatusInfo$Other"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
			"notStored",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "PredefinedConfigValueTag"
				),
				new QName (
				    "InformationElements",
				    "PredefinedConfigValueTag"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new PredefinedConfigValueTag(0), 
					new PredefinedConfigValueTag(15),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(15)
				),
				null
			    )
			),
			"storedWithDifferentValueTag",
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
	 * Get the type descriptor (TypeInfo) of 'this' Other object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Other object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Other

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case storedWithValueTagSameAsPrevius_chosen:
		return new Null();
	    case other_chosen:
		return new Other();
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
	    "PredefinedConfigStatusInfo"
	),
	new QName (
	    "InformationElements",
	    "PredefinedConfigStatusInfo"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "storedWithValueTagSameAsPrevius",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PredefinedConfigStatusInfo$Other"
			)
		    ),
		    "other",
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
     * Get the type descriptor (TypeInfo) of 'this' PredefinedConfigStatusInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PredefinedConfigStatusInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PredefinedConfigStatusInfo
