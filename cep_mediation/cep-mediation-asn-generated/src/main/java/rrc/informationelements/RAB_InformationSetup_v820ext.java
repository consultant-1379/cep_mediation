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
 * Define the ASN1 Type RAB_InformationSetup_v820ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RAB_InformationSetup_v820ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public RAB_InformationSetup_v820ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RAB_InformationSetup_v820ext(CS_HSPA_Information cs_HSPA_Information)
    {
	setCs_HSPA_Information(cs_HSPA_Information);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CS_HSPA_Information();
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
		return new CS_HSPA_Information();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cs_HSPA_Information"
    public CS_HSPA_Information getCs_HSPA_Information()
    {
	return (CS_HSPA_Information)mComponents[0];
    }
    
    public void setCs_HSPA_Information(CS_HSPA_Information cs_HSPA_Information)
    {
	mComponents[0] = cs_HSPA_Information;
    }
    
    public boolean hasCs_HSPA_Information()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCs_HSPA_Information()
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
	    "RAB_InformationSetup_v820ext"
	),
	new QName (
	    "InformationElements",
	    "RAB-InformationSetup-v820ext"
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
				"CS_HSPA_Information"
			    ),
			    new QName (
				"InformationElements",
				"CS-HSPA-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CS_HSPA_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CS_HSPA_Information"
				)
			    ),
			    0
			)
		    ),
		    "cs-HSPA-Information",
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
     * Get the type descriptor (TypeInfo) of 'this' RAB_InformationSetup_v820ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RAB_InformationSetup_v820ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RAB_InformationSetup_v820ext
