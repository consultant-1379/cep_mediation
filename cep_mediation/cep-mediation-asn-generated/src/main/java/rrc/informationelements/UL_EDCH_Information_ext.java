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
 * Define the ASN1 Type UL_EDCH_Information_ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_EDCH_Information_ext extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_EDCH_Information_ext()
    {
    }
    
    public static final  int  fdd_chosen = 1;
    public static final  int  tdd_chosen = 2;
    
    // Methods for field "fdd"
    public static UL_EDCH_Information_ext createUL_EDCH_Information_extWithFdd(Null fdd)
    {
	UL_EDCH_Information_ext __object = new UL_EDCH_Information_ext();

	__object.setFdd(fdd);
	return __object;
    }
    
    public boolean hasFdd()
    {
	return getChosenFlag() == fdd_chosen;
    }
    
    public void setFdd(Null fdd)
    {
	setChosenValue(fdd);
	setChosenFlag(fdd_chosen);
    }
    
    
    // Methods for field "tdd"
    public static UL_EDCH_Information_ext createUL_EDCH_Information_extWithTdd(Tdd tdd)
    {
	UL_EDCH_Information_ext __object = new UL_EDCH_Information_ext();

	__object.setTdd(tdd);
	return __object;
    }
    
    public boolean hasTdd()
    {
	return getChosenFlag() == tdd_chosen;
    }
    
    public void setTdd(Tdd tdd)
    {
	setChosenValue(tdd);
	setChosenFlag(tdd_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Tdd extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd(Non_ScheduledTransGrantInfoTDD_ext non_ScheduledTransGrantInfo)
	{
	    setNon_ScheduledTransGrantInfo(non_ScheduledTransGrantInfo);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new Non_ScheduledTransGrantInfoTDD_ext();
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
		    return new Non_ScheduledTransGrantInfoTDD_ext();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "non_ScheduledTransGrantInfo"
	public Non_ScheduledTransGrantInfoTDD_ext getNon_ScheduledTransGrantInfo()
	{
	    return (Non_ScheduledTransGrantInfoTDD_ext)mComponents[0];
	}
	
	public void setNon_ScheduledTransGrantInfo(Non_ScheduledTransGrantInfoTDD_ext non_ScheduledTransGrantInfo)
	{
	    mComponents[0] = non_ScheduledTransGrantInfo;
	}
	
	public boolean hasNon_ScheduledTransGrantInfo()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteNon_ScheduledTransGrantInfo()
	{
	    setComponentAbsent(0);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UL_EDCH_Information_ext$Tdd"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "Non_ScheduledTransGrantInfoTDD_ext"
				),
				new QName (
				    "InformationElements",
				    "Non-ScheduledTransGrantInfoTDD-ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"Non_ScheduledTransGrantInfoTDD_ext"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1)
				    }
				)
			    )
			),
			"non-ScheduledTransGrantInfo",
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case fdd_chosen:
		return new Null();
	    case tdd_chosen:
		return new Tdd();
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
	    "UL_EDCH_Information_ext"
	),
	new QName (
	    "InformationElements",
	    "UL-EDCH-Information-ext"
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
		    "fdd",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_EDCH_Information_ext$Tdd"
			)
		    ),
		    "tdd",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_EDCH_Information_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_EDCH_Information_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_EDCH_Information_ext
