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
 * Define the ASN1 Type RAB_InformationSetup_v6b0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RAB_InformationSetup_v6b0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public RAB_InformationSetup_v6b0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RAB_InformationSetup_v6b0ext(RAB_Info_v6b0ext rab_Info_v6b0ext)
    {
	setRab_Info_v6b0ext(rab_Info_v6b0ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RAB_Info_v6b0ext();
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
		return new RAB_Info_v6b0ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rab_Info_v6b0ext"
    public RAB_Info_v6b0ext getRab_Info_v6b0ext()
    {
	return (RAB_Info_v6b0ext)mComponents[0];
    }
    
    public void setRab_Info_v6b0ext(RAB_Info_v6b0ext rab_Info_v6b0ext)
    {
	mComponents[0] = rab_Info_v6b0ext;
    }
    
    public boolean hasRab_Info_v6b0ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRab_Info_v6b0ext()
    {
	setComponentAbsent(0);
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
	    "RAB_InformationSetup_v6b0ext"
	),
	new QName (
	    "InformationElements",
	    "RAB-InformationSetup-v6b0ext"
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
				"RAB_Info_v6b0ext"
			    ),
			    new QName (
				"InformationElements",
				"RAB-Info-v6b0ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_Info_v6b0ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_Info_v6b0ext"
				)
			    ),
			    0
			)
		    ),
		    "rab-Info-v6b0ext",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RAB_InformationSetup_v6b0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RAB_InformationSetup_v6b0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RAB_InformationSetup_v6b0ext
