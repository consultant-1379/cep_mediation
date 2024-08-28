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
 * Define the ASN1 Type RB_InformationChanged_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RB_InformationChanged_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RB_InformationChanged_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RB_InformationChanged_r6(RB_Identity rb_Identity, 
		    Rb_Change rb_Change)
    {
	setRb_Identity(rb_Identity);
	setRb_Change(rb_Change);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RB_Identity();
	mComponents[1] = new Rb_Change();
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
		return new RB_Identity();
	    case 1:
		return new Rb_Change();
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
    
    
    // Methods for field "rb_Change"
    public Rb_Change getRb_Change()
    {
	return (Rb_Change)mComponents[1];
    }
    
    public void setRb_Change(Rb_Change rb_Change)
    {
	mComponents[1] = rb_Change;
    }
    
    
    
    /**
     * Define the ASN1 Type Rb_Change from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Rb_Change extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Rb_Change()
	{
	}
	
	public static final  int  release_chosen = 1;
	public static final  int  re_mapToDefaultRb_chosen = 2;
	
	// Methods for field "release"
	public static Rb_Change createRb_ChangeWithRelease(Null release)
	{
	    Rb_Change __object = new Rb_Change();

	    __object.setRelease(release);
	    return __object;
	}
	
	public boolean hasRelease()
	{
	    return getChosenFlag() == release_chosen;
	}
	
	public void setRelease(Null release)
	{
	    setChosenValue(release);
	    setChosenFlag(release_chosen);
	}
	
	
	// Methods for field "re_mapToDefaultRb"
	public static Rb_Change createRb_ChangeWithRe_mapToDefaultRb(long re_mapToDefaultRb)
	{
	    return createRb_ChangeWithRe_mapToDefaultRb(new RB_Identity(re_mapToDefaultRb));
	}
	
	public static Rb_Change createRb_ChangeWithRe_mapToDefaultRb(RB_Identity re_mapToDefaultRb)
	{
	    Rb_Change __object = new Rb_Change();

	    __object.setRe_mapToDefaultRb(re_mapToDefaultRb);
	    return __object;
	}
	
	public boolean hasRe_mapToDefaultRb()
	{
	    return getChosenFlag() == re_mapToDefaultRb_chosen;
	}
	
	public void setRe_mapToDefaultRb(long re_mapToDefaultRb)
	{
	    setRe_mapToDefaultRb(new RB_Identity(re_mapToDefaultRb));
	}
	
	public void setRe_mapToDefaultRb(RB_Identity re_mapToDefaultRb)
	{
	    setChosenValue(re_mapToDefaultRb);
	    setChosenFlag(re_mapToDefaultRb_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case release_chosen:
		    return new Null();
		case re_mapToDefaultRb_chosen:
		    return new RB_Identity();
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
		"RB_InformationChanged_r6$Rb_Change"
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
			"release",
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
			"re-mapToDefaultRb",
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
	 * Get the type descriptor (TypeInfo) of 'this' Rb_Change object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Rb_Change object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Rb_Change

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
	    "RB_InformationChanged_r6"
	),
	new QName (
	    "InformationElements",
	    "RB-InformationChanged-r6"
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
			new QName (
			    "rrc.informationelements",
			    "RB_InformationChanged_r6$Rb_Change"
			)
		    ),
		    "rb-Change",
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
     * Get the type descriptor (TypeInfo) of 'this' RB_InformationChanged_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RB_InformationChanged_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RB_InformationChanged_r6
