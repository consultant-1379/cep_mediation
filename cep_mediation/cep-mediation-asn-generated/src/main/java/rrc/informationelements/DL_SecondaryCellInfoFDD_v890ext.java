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
 * Define the ASN1 Type DL_SecondaryCellInfoFDD_v890ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_SecondaryCellInfoFDD_v890ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_SecondaryCellInfoFDD_v890ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_SecondaryCellInfoFDD_v890ext(DifferentTxModeFromServingHS_DSCHCell differentTxModeFromServingHS_DSCHCell)
    {
	setDifferentTxModeFromServingHS_DSCHCell(differentTxModeFromServingHS_DSCHCell);
    }
    
    public void initComponents()
    {
	mComponents[0] = DifferentTxModeFromServingHS_DSCHCell.different;
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
		return DifferentTxModeFromServingHS_DSCHCell.different;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "differentTxModeFromServingHS_DSCHCell"
    public DifferentTxModeFromServingHS_DSCHCell getDifferentTxModeFromServingHS_DSCHCell()
    {
	return (DifferentTxModeFromServingHS_DSCHCell)mComponents[0];
    }
    
    public void setDifferentTxModeFromServingHS_DSCHCell(DifferentTxModeFromServingHS_DSCHCell differentTxModeFromServingHS_DSCHCell)
    {
	mComponents[0] = differentTxModeFromServingHS_DSCHCell;
    }
    
    public boolean hasDifferentTxModeFromServingHS_DSCHCell()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDifferentTxModeFromServingHS_DSCHCell()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type DifferentTxModeFromServingHS_DSCHCell from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class DifferentTxModeFromServingHS_DSCHCell extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DifferentTxModeFromServingHS_DSCHCell()
	{
	    super(cFirstNumber);
	}
	
	protected DifferentTxModeFromServingHS_DSCHCell(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final DifferentTxModeFromServingHS_DSCHCell different =
	    new DifferentTxModeFromServingHS_DSCHCell(0);
	private final static DifferentTxModeFromServingHS_DSCHCell cNamedNumbers[] = {
	     different
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static DifferentTxModeFromServingHS_DSCHCell valueOf(long value)
	{
	    return (DifferentTxModeFromServingHS_DSCHCell)different.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_SecondaryCellInfoFDD_v890ext$DifferentTxModeFromServingHS_DSCHCell"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"different",
			0
		    )
		}
	    ),
	    0,
	    different
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DifferentTxModeFromServingHS_DSCHCell object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DifferentTxModeFromServingHS_DSCHCell object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DifferentTxModeFromServingHS_DSCHCell

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
	    "DL_SecondaryCellInfoFDD_v890ext"
	),
	new QName (
	    "InformationElements",
	    "DL-SecondaryCellInfoFDD-v890ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_SecondaryCellInfoFDD_v890ext$DifferentTxModeFromServingHS_DSCHCell"
			)
		    ),
		    "differentTxModeFromServingHS-DSCHCell",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_SecondaryCellInfoFDD_v890ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_SecondaryCellInfoFDD_v890ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_SecondaryCellInfoFDD_v890ext
