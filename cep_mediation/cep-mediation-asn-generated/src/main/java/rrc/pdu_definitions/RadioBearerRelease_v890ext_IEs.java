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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type RadioBearerRelease_v890ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RadioBearerRelease_v890ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RadioBearerRelease_v890ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RadioBearerRelease_v890ext_IEs(rrc.informationelements.DL_SecondaryCellInfoFDD_v890ext dl_SecondaryCellInfoFDD_v890ext, 
		    rrc.informationelements.DL_HSPDSCH_Information_r8_ext dl_HSPDSCH_Information)
    {
	setDl_SecondaryCellInfoFDD_v890ext(dl_SecondaryCellInfoFDD_v890ext);
	setDl_HSPDSCH_Information(dl_HSPDSCH_Information);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.DL_SecondaryCellInfoFDD_v890ext();
	mComponents[1] = new rrc.informationelements.DL_HSPDSCH_Information_r8_ext();
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
		return new rrc.informationelements.DL_SecondaryCellInfoFDD_v890ext();
	    case 1:
		return new rrc.informationelements.DL_HSPDSCH_Information_r8_ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_SecondaryCellInfoFDD_v890ext"
    public rrc.informationelements.DL_SecondaryCellInfoFDD_v890ext getDl_SecondaryCellInfoFDD_v890ext()
    {
	return (rrc.informationelements.DL_SecondaryCellInfoFDD_v890ext)mComponents[0];
    }
    
    public void setDl_SecondaryCellInfoFDD_v890ext(rrc.informationelements.DL_SecondaryCellInfoFDD_v890ext dl_SecondaryCellInfoFDD_v890ext)
    {
	mComponents[0] = dl_SecondaryCellInfoFDD_v890ext;
    }
    
    public boolean hasDl_SecondaryCellInfoFDD_v890ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDl_SecondaryCellInfoFDD_v890ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dl_HSPDSCH_Information"
    public rrc.informationelements.DL_HSPDSCH_Information_r8_ext getDl_HSPDSCH_Information()
    {
	return (rrc.informationelements.DL_HSPDSCH_Information_r8_ext)mComponents[1];
    }
    
    public void setDl_HSPDSCH_Information(rrc.informationelements.DL_HSPDSCH_Information_r8_ext dl_HSPDSCH_Information)
    {
	mComponents[1] = dl_HSPDSCH_Information;
    }
    
    public boolean hasDl_HSPDSCH_Information()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_HSPDSCH_Information()
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
	    "rrc.pdu_definitions",
	    "RadioBearerRelease_v890ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RadioBearerRelease-v890ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD_v890ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD_v890ext"
				)
			    ),
			    0
			)
		    ),
		    "dl-SecondaryCellInfoFDD-v890ext",
		    0,
		    3,
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
				"DL_HSPDSCH_Information_r8_ext"
			    ),
			    new QName (
				"InformationElements",
				"DL-HSPDSCH-Information-r8-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r8_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r8_ext"
				)
			    ),
			    0
			)
		    ),
		    "dl-HSPDSCH-Information",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' RadioBearerRelease_v890ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioBearerRelease_v890ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioBearerRelease_v890ext_IEs
