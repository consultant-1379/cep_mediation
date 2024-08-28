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
 * Define the ASN1 Type PDCP_Info_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDCP_Info_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDCP_Info_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDCP_Info_r4(LosslessSRNS_RelocSupport losslessSRNS_RelocSupport, 
		    PDCP_PDU_Header pdcp_PDU_Header, 
		    HeaderCompressionInfoList_r4 headerCompressionInfoList)
    {
	setLosslessSRNS_RelocSupport(losslessSRNS_RelocSupport);
	setPdcp_PDU_Header(pdcp_PDU_Header);
	setHeaderCompressionInfoList(headerCompressionInfoList);
    }
    
    /**
     * Construct with required components.
     */
    public PDCP_Info_r4(PDCP_PDU_Header pdcp_PDU_Header)
    {
	setPdcp_PDU_Header(pdcp_PDU_Header);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LosslessSRNS_RelocSupport();
	mComponents[1] = PDCP_PDU_Header.present;
	mComponents[2] = new HeaderCompressionInfoList_r4();
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
		return new LosslessSRNS_RelocSupport();
	    case 1:
		return PDCP_PDU_Header.present;
	    case 2:
		return new HeaderCompressionInfoList_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "losslessSRNS_RelocSupport"
    public LosslessSRNS_RelocSupport getLosslessSRNS_RelocSupport()
    {
	return (LosslessSRNS_RelocSupport)mComponents[0];
    }
    
    public void setLosslessSRNS_RelocSupport(LosslessSRNS_RelocSupport losslessSRNS_RelocSupport)
    {
	mComponents[0] = losslessSRNS_RelocSupport;
    }
    
    public boolean hasLosslessSRNS_RelocSupport()
    {
	return componentIsPresent(0);
    }
    
    public void deleteLosslessSRNS_RelocSupport()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pdcp_PDU_Header"
    public PDCP_PDU_Header getPdcp_PDU_Header()
    {
	return (PDCP_PDU_Header)mComponents[1];
    }
    
    public void setPdcp_PDU_Header(PDCP_PDU_Header pdcp_PDU_Header)
    {
	mComponents[1] = pdcp_PDU_Header;
    }
    
    
    // Methods for field "headerCompressionInfoList"
    public HeaderCompressionInfoList_r4 getHeaderCompressionInfoList()
    {
	return (HeaderCompressionInfoList_r4)mComponents[2];
    }
    
    public void setHeaderCompressionInfoList(HeaderCompressionInfoList_r4 headerCompressionInfoList)
    {
	mComponents[2] = headerCompressionInfoList;
    }
    
    public boolean hasHeaderCompressionInfoList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteHeaderCompressionInfoList()
    {
	setComponentAbsent(2);
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
	    "PDCP_Info_r4"
	),
	new QName (
	    "InformationElements",
	    "PDCP-Info-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LosslessSRNS_RelocSupport"
			    ),
			    new QName (
				"InformationElements",
				"LosslessSRNS-RelocSupport"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LosslessSRNS_RelocSupport"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "losslessSRNS-RelocSupport",
		    0,
		    3,
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
				"PDCP_PDU_Header"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-PDU-Header"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"present",
					0
				    ),
				    new MemberListElement (
					"absent",
					1
				    )
				}
			    ),
			    0,
			    PDCP_PDU_Header.present
			)
		    ),
		    "pdcp-PDU-Header",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HeaderCompressionInfoList_r4"
			    ),
			    new QName (
				"InformationElements",
				"HeaderCompressionInfoList-r4"
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
				    "HeaderCompressionInfo_r4"
				)
			    )
			)
		    ),
		    "headerCompressionInfoList",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' PDCP_Info_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDCP_Info_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDCP_Info_r4
