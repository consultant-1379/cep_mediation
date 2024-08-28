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
 * Define the ASN1 Type CellBarred from ASN1 Module InformationElements.
 * @see Choice
 */

public class CellBarred extends Choice {
    
    /**
     * The default constructor.
     */
    public CellBarred()
    {
    }
    
    public static final  int  barred_chosen = 1;
    public static final  int  notBarred_chosen = 2;
    
    // Methods for field "barred"
    public static CellBarred createCellBarredWithBarred(Barred barred)
    {
	CellBarred __object = new CellBarred();

	__object.setBarred(barred);
	return __object;
    }
    
    public boolean hasBarred()
    {
	return getChosenFlag() == barred_chosen;
    }
    
    public void setBarred(Barred barred)
    {
	setChosenValue(barred);
	setChosenFlag(barred_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Barred from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Barred extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Barred()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Barred(AllowedIndicator intraFreqCellReselectionInd, 
			T_Barred t_Barred)
	{
	    setIntraFreqCellReselectionInd(intraFreqCellReselectionInd);
	    setT_Barred(t_Barred);
	}
	
	public void initComponents()
	{
	    mComponents[0] = AllowedIndicator.allowed;
	    mComponents[1] = T_Barred.s10;
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
		    return AllowedIndicator.allowed;
		case 1:
		    return T_Barred.s10;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "intraFreqCellReselectionInd"
	public AllowedIndicator getIntraFreqCellReselectionInd()
	{
	    return (AllowedIndicator)mComponents[0];
	}
	
	public void setIntraFreqCellReselectionInd(AllowedIndicator intraFreqCellReselectionInd)
	{
	    mComponents[0] = intraFreqCellReselectionInd;
	}
	
	
	// Methods for field "t_Barred"
	public T_Barred getT_Barred()
	{
	    return (T_Barred)mComponents[1];
	}
	
	public void setT_Barred(T_Barred t_Barred)
	{
	    mComponents[1] = t_Barred;
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
		"CellBarred$Barred"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "AllowedIndicator"
				),
				new QName (
				    "InformationElements",
				    "AllowedIndicator"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "allowed",
					    0
					),
					new MemberListElement (
					    "notAllowed",
					    1
					)
				    }
				),
				0,
				AllowedIndicator.allowed
			    )
			),
			"intraFreqCellReselectionInd",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "T_Barred"
				),
				new QName (
				    "InformationElements",
				    "T-Barred"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "s10",
					    0
					),
					new MemberListElement (
					    "s20",
					    1
					),
					new MemberListElement (
					    "s40",
					    2
					),
					new MemberListElement (
					    "s80",
					    3
					),
					new MemberListElement (
					    "s160",
					    4
					),
					new MemberListElement (
					    "s320",
					    5
					),
					new MemberListElement (
					    "s640",
					    6
					),
					new MemberListElement (
					    "s1280",
					    7
					)
				    }
				),
				0,
				T_Barred.s10
			    )
			),
			"t-Barred",
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
	 * Get the type descriptor (TypeInfo) of 'this' Barred object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Barred object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Barred

    // Methods for field "notBarred"
    public static CellBarred createCellBarredWithNotBarred(Null notBarred)
    {
	CellBarred __object = new CellBarred();

	__object.setNotBarred(notBarred);
	return __object;
    }
    
    public boolean hasNotBarred()
    {
	return getChosenFlag() == notBarred_chosen;
    }
    
    public void setNotBarred(Null notBarred)
    {
	setChosenValue(notBarred);
	setChosenFlag(notBarred_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case barred_chosen:
		return new Barred();
	    case notBarred_chosen:
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
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "CellBarred"
	),
	new QName (
	    "InformationElements",
	    "CellBarred"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CellBarred$Barred"
			)
		    ),
		    "barred",
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
		    "notBarred",
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
     * Get the type descriptor (TypeInfo) of 'this' CellBarred object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellBarred object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellBarred
