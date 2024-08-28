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
 * Define the ASN1 Type SPS_Information_TDD128_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SPS_Information_TDD128_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SPS_Information_TDD128_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SPS_Information_TDD128_r8(E_DCH_SPS_Information_TDD128 e_dch_SPS_Info, 
		    HS_DSCH_SPS_Information_TDD128 hs_dsch_SPS_Info)
    {
	setE_dch_SPS_Info(e_dch_SPS_Info);
	setHs_dsch_SPS_Info(hs_dsch_SPS_Info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_DCH_SPS_Information_TDD128();
	mComponents[1] = new HS_DSCH_SPS_Information_TDD128();
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
		return new E_DCH_SPS_Information_TDD128();
	    case 1:
		return new HS_DSCH_SPS_Information_TDD128();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_dch_SPS_Info"
    public E_DCH_SPS_Information_TDD128 getE_dch_SPS_Info()
    {
	return (E_DCH_SPS_Information_TDD128)mComponents[0];
    }
    
    public void setE_dch_SPS_Info(E_DCH_SPS_Information_TDD128 e_dch_SPS_Info)
    {
	mComponents[0] = e_dch_SPS_Info;
    }
    
    public boolean hasE_dch_SPS_Info()
    {
	return componentIsPresent(0);
    }
    
    public void deleteE_dch_SPS_Info()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "hs_dsch_SPS_Info"
    public HS_DSCH_SPS_Information_TDD128 getHs_dsch_SPS_Info()
    {
	return (HS_DSCH_SPS_Information_TDD128)mComponents[1];
    }
    
    public void setHs_dsch_SPS_Info(HS_DSCH_SPS_Information_TDD128 hs_dsch_SPS_Info)
    {
	mComponents[1] = hs_dsch_SPS_Info;
    }
    
    public boolean hasHs_dsch_SPS_Info()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHs_dsch_SPS_Info()
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
	    "SPS_Information_TDD128_r8"
	),
	new QName (
	    "InformationElements",
	    "SPS-Information-TDD128-r8"
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
				"E_DCH_SPS_Information_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-SPS-Information-TDD128"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_SPS_Information_TDD128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_SPS_Information_TDD128"
				)
			    ),
			    0
			)
		    ),
		    "e-dch-SPS-Info",
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
				"HS_DSCH_SPS_Information_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"HS-DSCH-SPS-Information-TDD128"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HS_DSCH_SPS_Information_TDD128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HS_DSCH_SPS_Information_TDD128"
				)
			    ),
			    0
			)
		    ),
		    "hs-dsch-SPS-Info",
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
     * Get the type descriptor (TypeInfo) of 'this' SPS_Information_TDD128_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SPS_Information_TDD128_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SPS_Information_TDD128_r8
