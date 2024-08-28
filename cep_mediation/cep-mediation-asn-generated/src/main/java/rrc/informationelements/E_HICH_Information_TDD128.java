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
 * Define the ASN1 Type E_HICH_Information_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_HICH_Information_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_HICH_Information_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_HICH_Information_TDD128(INTEGER n_E_HICH, 
		    E_HICH_Information_LCR_List e_HICH_InfoList)
    {
	setN_E_HICH(n_E_HICH);
	setE_HICH_InfoList(e_HICH_InfoList);
    }
    
    /**
     * Construct with components.
     */
    public E_HICH_Information_TDD128(long n_E_HICH, 
		    E_HICH_Information_LCR_List e_HICH_InfoList)
    {
	this(new INTEGER(n_E_HICH), e_HICH_InfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new E_HICH_Information_LCR_List();
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
		return new INTEGER();
	    case 1:
		return new E_HICH_Information_LCR_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "n_E_HICH"
    public long getN_E_HICH()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setN_E_HICH(long n_E_HICH)
    {
	setN_E_HICH(new INTEGER(n_E_HICH));
    }
    
    public void setN_E_HICH(INTEGER n_E_HICH)
    {
	mComponents[0] = n_E_HICH;
    }
    
    
    // Methods for field "e_HICH_InfoList"
    public E_HICH_Information_LCR_List getE_HICH_InfoList()
    {
	return (E_HICH_Information_LCR_List)mComponents[1];
    }
    
    public void setE_HICH_InfoList(E_HICH_Information_LCR_List e_HICH_InfoList)
    {
	mComponents[1] = e_HICH_InfoList;
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
	    "E_HICH_Information_TDD128"
	),
	new QName (
	    "InformationElements",
	    "E-HICH-Information-TDD128"
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
				    new com.oss.asn1.INTEGER(4), 
				    new com.oss.asn1.INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "n-E-HICH",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_HICH_Information_LCR_List"
			    ),
			    new QName (
				"InformationElements",
				"E-HICH-Information-LCR-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information_LCR"
				)
			    )
			)
		    ),
		    "e-HICH-InfoList",
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
     * Get the type descriptor (TypeInfo) of 'this' E_HICH_Information_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_HICH_Information_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_HICH_Information_TDD128
