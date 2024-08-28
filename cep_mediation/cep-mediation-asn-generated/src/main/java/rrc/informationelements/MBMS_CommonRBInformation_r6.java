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
 * Define the ASN1 Type MBMS_CommonRBInformation_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_CommonRBInformation_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_CommonRBInformation_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_CommonRBInformation_r6(MBMS_CommonRBIdentity commonRBIdentity, 
		    PDCP_Info_r4 pdcp_Info, RLC_Info_MTCH_r6 rlc_Info)
    {
	setCommonRBIdentity(commonRBIdentity);
	setPdcp_Info(pdcp_Info);
	setRlc_Info(rlc_Info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_CommonRBIdentity();
	mComponents[1] = new PDCP_Info_r4();
	mComponents[2] = new RLC_Info_MTCH_r6();
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
		return new MBMS_CommonRBIdentity();
	    case 1:
		return new PDCP_Info_r4();
	    case 2:
		return new RLC_Info_MTCH_r6();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "commonRBIdentity"
    public MBMS_CommonRBIdentity getCommonRBIdentity()
    {
	return (MBMS_CommonRBIdentity)mComponents[0];
    }
    
    public void setCommonRBIdentity(MBMS_CommonRBIdentity commonRBIdentity)
    {
	mComponents[0] = commonRBIdentity;
    }
    
    
    // Methods for field "pdcp_Info"
    public PDCP_Info_r4 getPdcp_Info()
    {
	return (PDCP_Info_r4)mComponents[1];
    }
    
    public void setPdcp_Info(PDCP_Info_r4 pdcp_Info)
    {
	mComponents[1] = pdcp_Info;
    }
    
    
    // Methods for field "rlc_Info"
    public RLC_Info_MTCH_r6 getRlc_Info()
    {
	return (RLC_Info_MTCH_r6)mComponents[2];
    }
    
    public void setRlc_Info(RLC_Info_MTCH_r6 rlc_Info)
    {
	mComponents[2] = rlc_Info;
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
	    "MBMS_CommonRBInformation_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-CommonRBInformation-r6"
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
				"MBMS_CommonRBIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CommonRBIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_CommonRBIdentity(1), 
				    new MBMS_CommonRBIdentity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "commonRBIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Info_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Info_r4"
				)
			    ),
			    0
			)
		    ),
		    "pdcp-Info",
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
				"RLC_Info_MTCH_r6"
			    ),
			    new QName (
				"InformationElements",
				"RLC-Info-MTCH-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Info_MTCH_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Info_MTCH_r6"
				)
			    ),
			    0
			)
		    ),
		    "rlc-Info",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_CommonRBInformation_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_CommonRBInformation_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_CommonRBInformation_r6
