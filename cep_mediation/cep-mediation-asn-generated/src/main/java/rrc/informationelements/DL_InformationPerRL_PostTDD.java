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
 * Define the ASN1 Type DL_InformationPerRL_PostTDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_InformationPerRL_PostTDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_InformationPerRL_PostTDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_InformationPerRL_PostTDD(PrimaryCCPCH_InfoPost primaryCCPCH_Info, 
		    DL_DPCH_InfoPerRL_PostTDD dl_DPCH_InfoPerRL)
    {
	setPrimaryCCPCH_Info(primaryCCPCH_Info);
	setDl_DPCH_InfoPerRL(dl_DPCH_InfoPerRL);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrimaryCCPCH_InfoPost();
	mComponents[1] = new DL_DPCH_InfoPerRL_PostTDD();
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
		return new PrimaryCCPCH_InfoPost();
	    case 1:
		return new DL_DPCH_InfoPerRL_PostTDD();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryCCPCH_Info"
    public PrimaryCCPCH_InfoPost getPrimaryCCPCH_Info()
    {
	return (PrimaryCCPCH_InfoPost)mComponents[0];
    }
    
    public void setPrimaryCCPCH_Info(PrimaryCCPCH_InfoPost primaryCCPCH_Info)
    {
	mComponents[0] = primaryCCPCH_Info;
    }
    
    
    // Methods for field "dl_DPCH_InfoPerRL"
    public DL_DPCH_InfoPerRL_PostTDD getDl_DPCH_InfoPerRL()
    {
	return (DL_DPCH_InfoPerRL_PostTDD)mComponents[1];
    }
    
    public void setDl_DPCH_InfoPerRL(DL_DPCH_InfoPerRL_PostTDD dl_DPCH_InfoPerRL)
    {
	mComponents[1] = dl_DPCH_InfoPerRL;
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
	    "DL_InformationPerRL_PostTDD"
	),
	new QName (
	    "InformationElements",
	    "DL-InformationPerRL-PostTDD"
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
				"PrimaryCCPCH_InfoPost"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCCPCH-InfoPost"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCCPCH_InfoPost"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCCPCH_InfoPost"
				)
			    ),
			    0
			)
		    ),
		    "primaryCCPCH-Info",
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
				"DL_DPCH_InfoPerRL_PostTDD"
			    ),
			    new QName (
				"InformationElements",
				"DL-DPCH-InfoPerRL-PostTDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_InfoPerRL_PostTDD"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_InfoPerRL_PostTDD"
				)
			    ),
			    0
			)
		    ),
		    "dl-DPCH-InfoPerRL",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_InformationPerRL_PostTDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_InformationPerRL_PostTDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_InformationPerRL_PostTDD
