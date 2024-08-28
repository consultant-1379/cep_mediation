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
 * Define the ASN1 Type URAUpdateConfirm_CCCH_r3_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class URAUpdateConfirm_CCCH_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public URAUpdateConfirm_CCCH_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public URAUpdateConfirm_CCCH_r3_IEs(rrc.informationelements.U_RNTI u_RNTI, 
		    URAUpdateConfirm_r3_IEs uraUpdateConfirm)
    {
	setU_RNTI(u_RNTI);
	setUraUpdateConfirm(uraUpdateConfirm);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.U_RNTI();
	mComponents[1] = new URAUpdateConfirm_r3_IEs();
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
		return new rrc.informationelements.U_RNTI();
	    case 1:
		return new URAUpdateConfirm_r3_IEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "u_RNTI"
    public rrc.informationelements.U_RNTI getU_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[0];
    }
    
    public void setU_RNTI(rrc.informationelements.U_RNTI u_RNTI)
    {
	mComponents[0] = u_RNTI;
    }
    
    
    // Methods for field "uraUpdateConfirm"
    public URAUpdateConfirm_r3_IEs getUraUpdateConfirm()
    {
	return (URAUpdateConfirm_r3_IEs)mComponents[1];
    }
    
    public void setUraUpdateConfirm(URAUpdateConfirm_r3_IEs uraUpdateConfirm)
    {
	mComponents[1] = uraUpdateConfirm;
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
	    "URAUpdateConfirm_CCCH_r3_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "URAUpdateConfirm-CCCH-r3-IEs"
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
				"U_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"U-RNTI"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI"
				)
			    ),
			    0
			)
		    ),
		    "u-RNTI",
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
				"rrc.pdu_definitions",
				"URAUpdateConfirm_r3_IEs"
			    ),
			    new QName (
				"PDU-definitions",
				"URAUpdateConfirm-r3-IEs"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "URAUpdateConfirm_r3_IEs"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "URAUpdateConfirm_r3_IEs"
				)
			    ),
			    0
			)
		    ),
		    "uraUpdateConfirm",
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
     * Get the type descriptor (TypeInfo) of 'this' URAUpdateConfirm_CCCH_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' URAUpdateConfirm_CCCH_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for URAUpdateConfirm_CCCH_r3_IEs
