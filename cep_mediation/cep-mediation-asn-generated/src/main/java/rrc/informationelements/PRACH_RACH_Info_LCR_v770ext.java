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
 * Define the ASN1 Type PRACH_RACH_Info_LCR_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PRACH_RACH_Info_LCR_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public PRACH_RACH_Info_LCR_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PRACH_RACH_Info_LCR_v770ext(Sync_UL_Codes_Bitmap e_RUCCH_Sync_UL_Codes_Bitmap)
    {
	setE_RUCCH_Sync_UL_Codes_Bitmap(e_RUCCH_Sync_UL_Codes_Bitmap);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Sync_UL_Codes_Bitmap();
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
		return new Sync_UL_Codes_Bitmap();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_RUCCH_Sync_UL_Codes_Bitmap"
    public Sync_UL_Codes_Bitmap getE_RUCCH_Sync_UL_Codes_Bitmap()
    {
	return (Sync_UL_Codes_Bitmap)mComponents[0];
    }
    
    public void setE_RUCCH_Sync_UL_Codes_Bitmap(Sync_UL_Codes_Bitmap e_RUCCH_Sync_UL_Codes_Bitmap)
    {
	mComponents[0] = e_RUCCH_Sync_UL_Codes_Bitmap;
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
	    "PRACH_RACH_Info_LCR_v770ext"
	),
	new QName (
	    "InformationElements",
	    "PRACH-RACH-Info-LCR-v770ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Sync_UL_Codes_Bitmap"
			    ),
			    new QName (
				"InformationElements",
				"Sync-UL-Codes-Bitmap"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"code7",
					0
				    ),
				    new MemberListElement (
					"code6",
					1
				    ),
				    new MemberListElement (
					"code5",
					2
				    ),
				    new MemberListElement (
					"code4",
					3
				    ),
				    new MemberListElement (
					"code3",
					4
				    ),
				    new MemberListElement (
					"code2",
					5
				    ),
				    new MemberListElement (
					"code1",
					6
				    ),
				    new MemberListElement (
					"code0",
					7
				    )
				}
			    )
			)
		    ),
		    "e-RUCCH-Sync-UL-Codes-Bitmap",
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
     * Get the type descriptor (TypeInfo) of 'this' PRACH_RACH_Info_LCR_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PRACH_RACH_Info_LCR_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PRACH_RACH_Info_LCR_v770ext
