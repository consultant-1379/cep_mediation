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
 * Define the ASN1 Type InterRATInfo_v860ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class InterRATInfo_v860ext extends Choice {
    
    /**
     * The default constructor.
     */
    public InterRATInfo_v860ext()
    {
    }
    
    public static final  int  gsm_chosen = 1;
    public static final  int  eutra_chosen = 2;
    
    // Methods for field "gsm"
    public static InterRATInfo_v860ext createInterRATInfo_v860extWithGsm(Null gsm)
    {
	InterRATInfo_v860ext __object = new InterRATInfo_v860ext();

	__object.setGsm(gsm);
	return __object;
    }
    
    public boolean hasGsm()
    {
	return getChosenFlag() == gsm_chosen;
    }
    
    public void setGsm(Null gsm)
    {
	setChosenValue(gsm);
	setChosenFlag(gsm_chosen);
    }
    
    
    // Methods for field "eutra"
    public static InterRATInfo_v860ext createInterRATInfo_v860extWithEutra(Eutra eutra)
    {
	InterRATInfo_v860ext __object = new InterRATInfo_v860ext();

	__object.setEutra(eutra);
	return __object;
    }
    
    public boolean hasEutra()
    {
	return getChosenFlag() == eutra_chosen;
    }
    
    public void setEutra(Eutra eutra)
    {
	setChosenValue(eutra);
	setChosenFlag(eutra_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Eutra from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Eutra extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Eutra()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Eutra(EUTRA_TargetFreqInfoList eutra_TargetFreqInfoList)
	{
	    setEutra_TargetFreqInfoList(eutra_TargetFreqInfoList);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new EUTRA_TargetFreqInfoList();
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
		    return new EUTRA_TargetFreqInfoList();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "eutra_TargetFreqInfoList"
	public EUTRA_TargetFreqInfoList getEutra_TargetFreqInfoList()
	{
	    return (EUTRA_TargetFreqInfoList)mComponents[0];
	}
	
	public void setEutra_TargetFreqInfoList(EUTRA_TargetFreqInfoList eutra_TargetFreqInfoList)
	{
	    mComponents[0] = eutra_TargetFreqInfoList;
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
		"InterRATInfo_v860ext$Eutra"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "EUTRA_TargetFreqInfoList"
				),
				new QName (
				    "InformationElements",
				    "EUTRA-TargetFreqInfoList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"EUTRA_TargetFreqInfo"
				    )
				)
			    )
			),
			"eutra-TargetFreqInfoList",
			0,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Eutra object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Eutra object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Eutra

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case gsm_chosen:
		return new Null();
	    case eutra_chosen:
		return new Eutra();
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
	    "InterRATInfo_v860ext"
	),
	new QName (
	    "InformationElements",
	    "InterRATInfo-v860ext"
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
		    "gsm",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "InterRATInfo_v860ext$Eutra"
			)
		    ),
		    "eutra",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATInfo_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATInfo_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATInfo_v860ext
