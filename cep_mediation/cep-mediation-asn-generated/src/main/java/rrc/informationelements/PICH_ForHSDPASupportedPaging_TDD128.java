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
 * Define the ASN1 Type PICH_ForHSDPASupportedPaging_TDD128 from ASN1 Module InformationElements.
 * @see Choice
 */

public class PICH_ForHSDPASupportedPaging_TDD128 extends Choice {
    
    /**
     * The default constructor.
     */
    public PICH_ForHSDPASupportedPaging_TDD128()
    {
    }
    
    public static final  int  implicit_chosen = 1;
    public static final  int  explicit_chosen = 2;
    
    // Methods for field "implicit"
    public static PICH_ForHSDPASupportedPaging_TDD128 createPICH_ForHSDPASupportedPaging_TDD128WithImplicit(Implicit implicit)
    {
	PICH_ForHSDPASupportedPaging_TDD128 __object = new PICH_ForHSDPASupportedPaging_TDD128();

	__object.setImplicit(implicit);
	return __object;
    }
    
    public boolean hasImplicit()
    {
	return getChosenFlag() == implicit_chosen;
    }
    
    public void setImplicit(Implicit implicit)
    {
	setChosenValue(implicit);
	setChosenFlag(implicit_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Implicit from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Implicit extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Implicit()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Implicit(OccurrenceSequenceNumberOfPICH occurrenceSequenceNumberOfPICH)
	{
	    setOccurrenceSequenceNumberOfPICH(occurrenceSequenceNumberOfPICH);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new OccurrenceSequenceNumberOfPICH();
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
		    return new OccurrenceSequenceNumberOfPICH();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "occurrenceSequenceNumberOfPICH"
	public OccurrenceSequenceNumberOfPICH getOccurrenceSequenceNumberOfPICH()
	{
	    return (OccurrenceSequenceNumberOfPICH)mComponents[0];
	}
	
	public void setOccurrenceSequenceNumberOfPICH(OccurrenceSequenceNumberOfPICH occurrenceSequenceNumberOfPICH)
	{
	    mComponents[0] = occurrenceSequenceNumberOfPICH;
	}
	
	public boolean hasOccurrenceSequenceNumberOfPICH()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteOccurrenceSequenceNumberOfPICH()
	{
	    setComponentAbsent(0);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PICH_ForHSDPASupportedPaging_TDD128$Implicit"
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
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "OccurrenceSequenceNumberOfPICH"
				),
				new QName (
				    "InformationElements",
				    "OccurrenceSequenceNumberOfPICH"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new OccurrenceSequenceNumberOfPICH(1), 
					new OccurrenceSequenceNumberOfPICH(16),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(16)
				),
				null
			    )
			),
			"occurrenceSequenceNumberOfPICH",
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
	 * Get the type descriptor (TypeInfo) of 'this' Implicit object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Implicit object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Implicit

    // Methods for field "explicit"
    public static PICH_ForHSDPASupportedPaging_TDD128 createPICH_ForHSDPASupportedPaging_TDD128WithExplicit(PICH_Info_LCR_r4 explicit)
    {
	PICH_ForHSDPASupportedPaging_TDD128 __object = new PICH_ForHSDPASupportedPaging_TDD128();

	__object.setExplicit(explicit);
	return __object;
    }
    
    public boolean hasExplicit()
    {
	return getChosenFlag() == explicit_chosen;
    }
    
    public void setExplicit(PICH_Info_LCR_r4 explicit)
    {
	setChosenValue(explicit);
	setChosenFlag(explicit_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case implicit_chosen:
		return new Implicit();
	    case explicit_chosen:
		return new PICH_Info_LCR_r4();
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
	    "PICH_ForHSDPASupportedPaging_TDD128"
	),
	new QName (
	    "InformationElements",
	    "PICH-ForHSDPASupportedPaging-TDD128"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PICH_ForHSDPASupportedPaging_TDD128$Implicit"
			)
		    ),
		    "implicit",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PICH_Info_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"PICH-Info-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PICH_Info_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PICH_Info_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "explicit",
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
     * Get the type descriptor (TypeInfo) of 'this' PICH_ForHSDPASupportedPaging_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PICH_ForHSDPASupportedPaging_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PICH_ForHSDPASupportedPaging_TDD128
