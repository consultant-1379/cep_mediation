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
 * Define the ASN1 Type IndividualUL_CCTrCH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IndividualUL_CCTrCH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public IndividualUL_CCTrCH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IndividualUL_CCTrCH_Info(TFCS_Identity ul_TFCS_Identity, 
		    TFCS ul_TFCS, TFC_Subset tfc_Subset)
    {
	setUl_TFCS_Identity(ul_TFCS_Identity);
	setUl_TFCS(ul_TFCS);
	setTfc_Subset(tfc_Subset);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TFCS_Identity();
	mComponents[1] = new TFCS();
	mComponents[2] = new TFC_Subset();
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
		return new TFCS_Identity();
	    case 1:
		return new TFCS();
	    case 2:
		return new TFC_Subset();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_TFCS_Identity"
    public TFCS_Identity getUl_TFCS_Identity()
    {
	return (TFCS_Identity)mComponents[0];
    }
    
    public void setUl_TFCS_Identity(TFCS_Identity ul_TFCS_Identity)
    {
	mComponents[0] = ul_TFCS_Identity;
    }
    
    
    // Methods for field "ul_TFCS"
    public TFCS getUl_TFCS()
    {
	return (TFCS)mComponents[1];
    }
    
    public void setUl_TFCS(TFCS ul_TFCS)
    {
	mComponents[1] = ul_TFCS;
    }
    
    
    // Methods for field "tfc_Subset"
    public TFC_Subset getTfc_Subset()
    {
	return (TFC_Subset)mComponents[2];
    }
    
    public void setTfc_Subset(TFC_Subset tfc_Subset)
    {
	mComponents[2] = tfc_Subset;
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
	    "IndividualUL_CCTrCH_Info"
	),
	new QName (
	    "InformationElements",
	    "IndividualUL-CCTrCH-Info"
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
				"TFCS_Identity"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_Identity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_Identity"
				)
			    ),
			    0
			)
		    ),
		    "ul-TFCS-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS"
			    ),
			    new QName (
				"InformationElements",
				"TFCS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS"
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
		    "ul-TFCS",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFC_Subset"
			    ),
			    new QName (
				"InformationElements",
				"TFC-Subset"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFC_Subset"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4)
				}
			    )
			)
		    ),
		    "tfc-Subset",
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
     * Get the type descriptor (TypeInfo) of 'this' IndividualUL_CCTrCH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IndividualUL_CCTrCH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IndividualUL_CCTrCH_Info
