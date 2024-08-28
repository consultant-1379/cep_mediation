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
 * Define the ASN1 Type Common_E_DCH_ResourceInfoList from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Common_E_DCH_ResourceInfoList extends Sequence {
    
    /**
     * The default constructor.
     */
    public Common_E_DCH_ResourceInfoList()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Common_E_DCH_ResourceInfoList(INTEGER s_offset, 
		    INTEGER f_dpch_ChannelisationCodeNumber, 
		    E_RGCH_Information_CommonEdch e_RGCH_Information, 
		    E_HICH_Information_CommonEdch e_hich_Info, 
		    UL_DPCH_CodeInfoForCommonEDCH ul_DPCH_CodeInfoForCommonEDCH)
    {
	setS_offset(s_offset);
	setF_dpch_ChannelisationCodeNumber(f_dpch_ChannelisationCodeNumber);
	setE_RGCH_Information(e_RGCH_Information);
	setE_hich_Info(e_hich_Info);
	setUl_DPCH_CodeInfoForCommonEDCH(ul_DPCH_CodeInfoForCommonEDCH);
    }
    
    /**
     * Construct with components.
     */
    public Common_E_DCH_ResourceInfoList(long s_offset, 
		    long f_dpch_ChannelisationCodeNumber, 
		    E_RGCH_Information_CommonEdch e_RGCH_Information, 
		    E_HICH_Information_CommonEdch e_hich_Info, 
		    UL_DPCH_CodeInfoForCommonEDCH ul_DPCH_CodeInfoForCommonEDCH)
    {
	this(new INTEGER(s_offset), 
	     new INTEGER(f_dpch_ChannelisationCodeNumber), 
	     e_RGCH_Information, e_hich_Info, 
	     ul_DPCH_CodeInfoForCommonEDCH);
    }
    
    /**
     * Construct with required components.
     */
    public Common_E_DCH_ResourceInfoList(E_HICH_Information_CommonEdch e_hich_Info, 
		    UL_DPCH_CodeInfoForCommonEDCH ul_DPCH_CodeInfoForCommonEDCH)
    {
	setE_hich_Info(e_hich_Info);
	setUl_DPCH_CodeInfoForCommonEDCH(ul_DPCH_CodeInfoForCommonEDCH);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new E_RGCH_Information_CommonEdch();
	mComponents[3] = new E_HICH_Information_CommonEdch();
	mComponents[4] = new UL_DPCH_CodeInfoForCommonEDCH();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new E_RGCH_Information_CommonEdch();
	    case 3:
		return new E_HICH_Information_CommonEdch();
	    case 4:
		return new UL_DPCH_CodeInfoForCommonEDCH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "s_offset"
    public long getS_offset()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setS_offset(long s_offset)
    {
	setS_offset(new INTEGER(s_offset));
    }
    
    public void setS_offset(INTEGER s_offset)
    {
	mComponents[0] = s_offset;
    }
    
    public boolean hasS_offset()
    {
	return componentIsPresent(0);
    }
    
    public void deleteS_offset()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "f_dpch_ChannelisationCodeNumber"
    public long getF_dpch_ChannelisationCodeNumber()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setF_dpch_ChannelisationCodeNumber(long f_dpch_ChannelisationCodeNumber)
    {
	setF_dpch_ChannelisationCodeNumber(new INTEGER(f_dpch_ChannelisationCodeNumber));
    }
    
    public void setF_dpch_ChannelisationCodeNumber(INTEGER f_dpch_ChannelisationCodeNumber)
    {
	mComponents[1] = f_dpch_ChannelisationCodeNumber;
    }
    
    public boolean hasF_dpch_ChannelisationCodeNumber()
    {
	return componentIsPresent(1);
    }
    
    public void deleteF_dpch_ChannelisationCodeNumber()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "e_RGCH_Information"
    public E_RGCH_Information_CommonEdch getE_RGCH_Information()
    {
	return (E_RGCH_Information_CommonEdch)mComponents[2];
    }
    
    public void setE_RGCH_Information(E_RGCH_Information_CommonEdch e_RGCH_Information)
    {
	mComponents[2] = e_RGCH_Information;
    }
    
    public boolean hasE_RGCH_Information()
    {
	return componentIsPresent(2);
    }
    
    public void deleteE_RGCH_Information()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "e_hich_Info"
    public E_HICH_Information_CommonEdch getE_hich_Info()
    {
	return (E_HICH_Information_CommonEdch)mComponents[3];
    }
    
    public void setE_hich_Info(E_HICH_Information_CommonEdch e_hich_Info)
    {
	mComponents[3] = e_hich_Info;
    }
    
    
    // Methods for field "ul_DPCH_CodeInfoForCommonEDCH"
    public UL_DPCH_CodeInfoForCommonEDCH getUl_DPCH_CodeInfoForCommonEDCH()
    {
	return (UL_DPCH_CodeInfoForCommonEDCH)mComponents[4];
    }
    
    public void setUl_DPCH_CodeInfoForCommonEDCH(UL_DPCH_CodeInfoForCommonEDCH ul_DPCH_CodeInfoForCommonEDCH)
    {
	mComponents[4] = ul_DPCH_CodeInfoForCommonEDCH;
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
	    "Common_E_DCH_ResourceInfoList"
	),
	new QName (
	    "InformationElements",
	    "Common-E-DCH-ResourceInfoList"
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
				    new com.oss.asn1.INTEGER(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "s-offset",
		    0,
		    3,
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "f-dpch-ChannelisationCodeNumber",
		    1,
		    3,
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
				"E_RGCH_Information_CommonEdch"
			    ),
			    new QName (
				"InformationElements",
				"E-RGCH-Information-CommonEdch"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_RGCH_Information_CommonEdch"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_RGCH_Information_CommonEdch"
				)
			    ),
			    0
			)
		    ),
		    "e-RGCH-Information",
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
				"E_HICH_Information_CommonEdch"
			    ),
			    new QName (
				"InformationElements",
				"E-HICH-Information-CommonEdch"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information_CommonEdch"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information_CommonEdch"
				)
			    ),
			    0
			)
		    ),
		    "e-hich-Info",
		    3,
		    2,
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
				"UL_DPCH_CodeInfoForCommonEDCH"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCH-CodeInfoForCommonEDCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_CodeInfoForCommonEDCH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_CodeInfoForCommonEDCH"
				)
			    ),
			    0
			)
		    ),
		    "ul-DPCH-CodeInfoForCommonEDCH",
		    4,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' rrc.informationelements.Common_E_DCH_ResourceInfoList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' rrc.informationelements.Common_E_DCH_ResourceInfoList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Common_E_DCH_ResourceInfoList
