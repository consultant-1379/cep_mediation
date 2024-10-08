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
 * Define the ASN1 Type E_DCH_RL_InfoNewSecServingCell from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DCH_RL_InfoNewSecServingCell extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DCH_RL_InfoNewSecServingCell()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DCH_RL_InfoNewSecServingCell(E_AGCH_Information e_AGCH_Information, 
		    E_HICH_Information e_HICH_Information, 
		    E_RGCH_Info e_RGCH_Info)
    {
	setE_AGCH_Information(e_AGCH_Information);
	setE_HICH_Information(e_HICH_Information);
	setE_RGCH_Info(e_RGCH_Info);
    }
    
    /**
     * Construct with required components.
     */
    public E_DCH_RL_InfoNewSecServingCell(E_AGCH_Information e_AGCH_Information)
    {
	setE_AGCH_Information(e_AGCH_Information);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_AGCH_Information();
	mComponents[1] = new E_HICH_Information();
	mComponents[2] = new E_RGCH_Info();
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
		return new E_AGCH_Information();
	    case 1:
		return new E_HICH_Information();
	    case 2:
		return new E_RGCH_Info();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_AGCH_Information"
    public E_AGCH_Information getE_AGCH_Information()
    {
	return (E_AGCH_Information)mComponents[0];
    }
    
    public void setE_AGCH_Information(E_AGCH_Information e_AGCH_Information)
    {
	mComponents[0] = e_AGCH_Information;
    }
    
    
    // Methods for field "e_HICH_Information"
    public E_HICH_Information getE_HICH_Information()
    {
	return (E_HICH_Information)mComponents[1];
    }
    
    public void setE_HICH_Information(E_HICH_Information e_HICH_Information)
    {
	mComponents[1] = e_HICH_Information;
    }
    
    public boolean hasE_HICH_Information()
    {
	return componentIsPresent(1);
    }
    
    public void deleteE_HICH_Information()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "e_RGCH_Info"
    public E_RGCH_Info getE_RGCH_Info()
    {
	return (E_RGCH_Info)mComponents[2];
    }
    
    public void setE_RGCH_Info(E_RGCH_Info e_RGCH_Info)
    {
	mComponents[2] = e_RGCH_Info;
    }
    
    public boolean hasE_RGCH_Info()
    {
	return componentIsPresent(2);
    }
    
    public void deleteE_RGCH_Info()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type E_RGCH_Info from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class E_RGCH_Info extends Choice {
	
	/**
	 * The default constructor.
	 */
	public E_RGCH_Info()
	{
	}
	
	public static final  int  e_RGCH_Information_chosen = 1;
	public static final  int  releaseIndicator_chosen = 2;
	
	// Methods for field "e_RGCH_Information"
	public static E_RGCH_Info createE_RGCH_InfoWithE_RGCH_Information(E_RGCH_Information e_RGCH_Information)
	{
	    E_RGCH_Info __object = new E_RGCH_Info();

	    __object.setE_RGCH_Information(e_RGCH_Information);
	    return __object;
	}
	
	public boolean hasE_RGCH_Information()
	{
	    return getChosenFlag() == e_RGCH_Information_chosen;
	}
	
	public void setE_RGCH_Information(E_RGCH_Information e_RGCH_Information)
	{
	    setChosenValue(e_RGCH_Information);
	    setChosenFlag(e_RGCH_Information_chosen);
	}
	
	
	// Methods for field "releaseIndicator"
	public static E_RGCH_Info createE_RGCH_InfoWithReleaseIndicator(Null releaseIndicator)
	{
	    E_RGCH_Info __object = new E_RGCH_Info();

	    __object.setReleaseIndicator(releaseIndicator);
	    return __object;
	}
	
	public boolean hasReleaseIndicator()
	{
	    return getChosenFlag() == releaseIndicator_chosen;
	}
	
	public void setReleaseIndicator(Null releaseIndicator)
	{
	    setChosenValue(releaseIndicator);
	    setChosenFlag(releaseIndicator_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case e_RGCH_Information_chosen:
		    return new E_RGCH_Information();
		case releaseIndicator_chosen:
		    return new Null();
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_DCH_RL_InfoNewSecServingCell$E_RGCH_Info"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "E_RGCH_Information"
				),
				new QName (
				    "InformationElements",
				    "E-RGCH-Information"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"E_RGCH_Information"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"E_RGCH_Information"
				    )
				),
				0
			    )
			),
			"e-RGCH-Information",
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
			"releaseIndicator",
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
	 * Get the type descriptor (TypeInfo) of 'this' E_RGCH_Info object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' E_RGCH_Info object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for E_RGCH_Info

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
	    "E_DCH_RL_InfoNewSecServingCell"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-RL-InfoNewSecServingCell"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_AGCH_Information"
			    ),
			    new QName (
				"InformationElements",
				"E-AGCH-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information"
				)
			    ),
			    0
			)
		    ),
		    "e-AGCH-Information",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_HICH_Information"
			    ),
			    new QName (
				"InformationElements",
				"E-HICH-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information"
				)
			    ),
			    0
			)
		    ),
		    "e-HICH-Information",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_DCH_RL_InfoNewSecServingCell$E_RGCH_Info"
			)
		    ),
		    "e-RGCH-Info",
		    2,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_RL_InfoNewSecServingCell object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_RL_InfoNewSecServingCell object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_RL_InfoNewSecServingCell
