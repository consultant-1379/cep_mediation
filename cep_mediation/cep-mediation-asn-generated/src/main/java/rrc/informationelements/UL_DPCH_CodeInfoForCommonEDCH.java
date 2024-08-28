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
 * Define the ASN1 Type UL_DPCH_CodeInfoForCommonEDCH from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_DPCH_CodeInfoForCommonEDCH extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_DPCH_CodeInfoForCommonEDCH()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_DPCH_CodeInfoForCommonEDCH(ScramblingCodeType ul_DPCCHscramblingCodeType, 
		    UL_ScramblingCode ul_DPCCHscramblingCode)
    {
	setUl_DPCCHscramblingCodeType(ul_DPCCHscramblingCodeType);
	setUl_DPCCHscramblingCode(ul_DPCCHscramblingCode);
    }
    
    /**
     * Construct with required components.
     */
    public UL_DPCH_CodeInfoForCommonEDCH(ScramblingCodeType ul_DPCCHscramblingCodeType)
    {
	setUl_DPCCHscramblingCodeType(ul_DPCCHscramblingCodeType);
    }
    
    public void initComponents()
    {
	mComponents[0] = ScramblingCodeType.shortSC;
	mComponents[1] = new UL_ScramblingCode();
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
		return ScramblingCodeType.shortSC;
	    case 1:
		return new UL_ScramblingCode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_DPCCHscramblingCodeType"
    public ScramblingCodeType getUl_DPCCHscramblingCodeType()
    {
	return (ScramblingCodeType)mComponents[0];
    }
    
    public void setUl_DPCCHscramblingCodeType(ScramblingCodeType ul_DPCCHscramblingCodeType)
    {
	mComponents[0] = ul_DPCCHscramblingCodeType;
    }
    
    
    // Methods for field "ul_DPCCHscramblingCode"
    public UL_ScramblingCode getUl_DPCCHscramblingCode()
    {
	return (UL_ScramblingCode)mComponents[1];
    }
    
    public void setUl_DPCCHscramblingCode(UL_ScramblingCode ul_DPCCHscramblingCode)
    {
	mComponents[1] = ul_DPCCHscramblingCode;
    }
    
    public boolean hasUl_DPCCHscramblingCode()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUl_DPCCHscramblingCode()
    {
	setComponentAbsent(1);
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
	    "UL_DPCH_CodeInfoForCommonEDCH"
	),
	new QName (
	    "InformationElements",
	    "UL-DPCH-CodeInfoForCommonEDCH"
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
				"ScramblingCodeType"
			    ),
			    new QName (
				"InformationElements",
				"ScramblingCodeType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"shortSC",
					0
				    ),
				    new MemberListElement (
					"longSC",
					1
				    )
				}
			    ),
			    0,
			    ScramblingCodeType.shortSC
			)
		    ),
		    "ul-DPCCHscramblingCodeType",
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
				"rrc.informationelements",
				"UL_ScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"UL-ScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UL_ScramblingCode(0), 
				    new UL_ScramblingCode(16777215),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16777215)
			    ),
			    null
			)
		    ),
		    "ul-DPCCHscramblingCode",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_DPCH_CodeInfoForCommonEDCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DPCH_CodeInfoForCommonEDCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DPCH_CodeInfoForCommonEDCH
