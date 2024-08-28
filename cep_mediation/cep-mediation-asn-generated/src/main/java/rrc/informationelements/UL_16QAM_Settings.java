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
 * Define the ASN1 Type UL_16QAM_Settings from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_16QAM_Settings extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_16QAM_Settings()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_16QAM_Settings(INTEGER beta_Ed_Gain_E_AGCH_Table_Selection)
    {
	setBeta_Ed_Gain_E_AGCH_Table_Selection(beta_Ed_Gain_E_AGCH_Table_Selection);
    }
    
    /**
     * Construct with components.
     */
    public UL_16QAM_Settings(long beta_Ed_Gain_E_AGCH_Table_Selection)
    {
	this(new INTEGER(beta_Ed_Gain_E_AGCH_Table_Selection));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
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
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "beta_Ed_Gain_E_AGCH_Table_Selection"
    public long getBeta_Ed_Gain_E_AGCH_Table_Selection()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setBeta_Ed_Gain_E_AGCH_Table_Selection(long beta_Ed_Gain_E_AGCH_Table_Selection)
    {
	setBeta_Ed_Gain_E_AGCH_Table_Selection(new INTEGER(beta_Ed_Gain_E_AGCH_Table_Selection));
    }
    
    public void setBeta_Ed_Gain_E_AGCH_Table_Selection(INTEGER beta_Ed_Gain_E_AGCH_Table_Selection)
    {
	mComponents[0] = beta_Ed_Gain_E_AGCH_Table_Selection;
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
	    "UL_16QAM_Settings"
	),
	new QName (
	    "InformationElements",
	    "UL-16QAM-Settings"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "beta-Ed-Gain-E-AGCH-Table-Selection",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_16QAM_Settings object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_16QAM_Settings object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_16QAM_Settings
