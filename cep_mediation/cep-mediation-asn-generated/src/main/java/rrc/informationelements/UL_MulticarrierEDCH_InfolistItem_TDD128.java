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
 * Define the ASN1 Type UL_MulticarrierEDCH_InfolistItem_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_MulticarrierEDCH_InfolistItem_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_MulticarrierEDCH_InfolistItem_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_MulticarrierEDCH_InfolistItem_TDD128(UARFCN uarfcn, 
		    INTEGER prxdes_base, 
		    E_PUCH_Info_MulticarrierEDCH_TDD128 e_PUCH_info, 
		    E_AGCH_Information_TDD128 e_AGCH_info, 
		    E_HICH_Information_TDD128 e_HICH_info)
    {
	setUarfcn(uarfcn);
	setPrxdes_base(prxdes_base);
	setE_PUCH_info(e_PUCH_info);
	setE_AGCH_info(e_AGCH_info);
	setE_HICH_info(e_HICH_info);
    }
    
    /**
     * Construct with components.
     */
    public UL_MulticarrierEDCH_InfolistItem_TDD128(UARFCN uarfcn, 
		    long prxdes_base, 
		    E_PUCH_Info_MulticarrierEDCH_TDD128 e_PUCH_info, 
		    E_AGCH_Information_TDD128 e_AGCH_info, 
		    E_HICH_Information_TDD128 e_HICH_info)
    {
	this(uarfcn, new INTEGER(prxdes_base), e_PUCH_info, e_AGCH_info, 
	     e_HICH_info);
    }
    
    /**
     * Construct with required components.
     */
    public UL_MulticarrierEDCH_InfolistItem_TDD128(UARFCN uarfcn, 
		    long prxdes_base)
    {
	setUarfcn(uarfcn);
	setPrxdes_base(prxdes_base);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UARFCN();
	mComponents[1] = new INTEGER();
	mComponents[2] = new E_PUCH_Info_MulticarrierEDCH_TDD128();
	mComponents[3] = new E_AGCH_Information_TDD128();
	mComponents[4] = new E_HICH_Information_TDD128();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UARFCN();
	    case 1:
		return new INTEGER();
	    case 2:
		return new E_PUCH_Info_MulticarrierEDCH_TDD128();
	    case 3:
		return new E_AGCH_Information_TDD128();
	    case 4:
		return new E_HICH_Information_TDD128();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "uarfcn"
    public UARFCN getUarfcn()
    {
	return (UARFCN)mComponents[0];
    }
    
    public void setUarfcn(UARFCN uarfcn)
    {
	mComponents[0] = uarfcn;
    }
    
    
    // Methods for field "prxdes_base"
    public long getPrxdes_base()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setPrxdes_base(long prxdes_base)
    {
	setPrxdes_base(new INTEGER(prxdes_base));
    }
    
    public void setPrxdes_base(INTEGER prxdes_base)
    {
	mComponents[1] = prxdes_base;
    }
    
    
    // Methods for field "e_PUCH_info"
    public E_PUCH_Info_MulticarrierEDCH_TDD128 getE_PUCH_info()
    {
	return (E_PUCH_Info_MulticarrierEDCH_TDD128)mComponents[2];
    }
    
    public void setE_PUCH_info(E_PUCH_Info_MulticarrierEDCH_TDD128 e_PUCH_info)
    {
	mComponents[2] = e_PUCH_info;
    }
    
    public boolean hasE_PUCH_info()
    {
	return componentIsPresent(2);
    }
    
    public void deleteE_PUCH_info()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "e_AGCH_info"
    public E_AGCH_Information_TDD128 getE_AGCH_info()
    {
	return (E_AGCH_Information_TDD128)mComponents[3];
    }
    
    public void setE_AGCH_info(E_AGCH_Information_TDD128 e_AGCH_info)
    {
	mComponents[3] = e_AGCH_info;
    }
    
    public boolean hasE_AGCH_info()
    {
	return componentIsPresent(3);
    }
    
    public void deleteE_AGCH_info()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "e_HICH_info"
    public E_HICH_Information_TDD128 getE_HICH_info()
    {
	return (E_HICH_Information_TDD128)mComponents[4];
    }
    
    public void setE_HICH_info(E_HICH_Information_TDD128 e_HICH_info)
    {
	mComponents[4] = e_HICH_info;
    }
    
    public boolean hasE_HICH_info()
    {
	return componentIsPresent(4);
    }
    
    public void deleteE_HICH_info()
    {
	setComponentAbsent(4);
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
	    "UL_MulticarrierEDCH_InfolistItem_TDD128"
	),
	new QName (
	    "InformationElements",
	    "UL-MulticarrierEDCH-InfolistItem-TDD128"
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
				"UARFCN"
			    ),
			    new QName (
				"InformationElements",
				"UARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UARFCN(0), 
				    new UARFCN(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "uarfcn",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(-112), 
				    new com.oss.asn1.INTEGER(-50),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-112),
				new java.lang.Long(-50)
			    ),
			    null
			)
		    ),
		    "prxdes-base",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_PUCH_Info_MulticarrierEDCH_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"E-PUCH-Info-MulticarrierEDCH-TDD128"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_PUCH_Info_MulticarrierEDCH_TDD128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_PUCH_Info_MulticarrierEDCH_TDD128"
				)
			    ),
			    0
			)
		    ),
		    "e-PUCH-info",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_AGCH_Information_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"E-AGCH-Information-TDD128"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information_TDD128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information_TDD128"
				)
			    ),
			    0
			)
		    ),
		    "e-AGCH-info",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information_TDD128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information_TDD128"
				)
			    ),
			    0
			)
		    ),
		    "e-HICH-info",
		    4,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_MulticarrierEDCH_InfolistItem_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_MulticarrierEDCH_InfolistItem_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_MulticarrierEDCH_InfolistItem_TDD128
