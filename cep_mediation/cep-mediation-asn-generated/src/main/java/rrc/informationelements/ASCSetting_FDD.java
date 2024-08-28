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
 * Define the ASN1 Type ASCSetting_FDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ASCSetting_FDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public ASCSetting_FDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ASCSetting_FDD(AccessServiceClass_FDD accessServiceClass_FDD)
    {
	setAccessServiceClass_FDD(accessServiceClass_FDD);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AccessServiceClass_FDD();
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
		return new AccessServiceClass_FDD();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "accessServiceClass_FDD"
    public AccessServiceClass_FDD getAccessServiceClass_FDD()
    {
	return (AccessServiceClass_FDD)mComponents[0];
    }
    
    public void setAccessServiceClass_FDD(AccessServiceClass_FDD accessServiceClass_FDD)
    {
	mComponents[0] = accessServiceClass_FDD;
    }
    
    public boolean hasAccessServiceClass_FDD()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAccessServiceClass_FDD()
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
	    "ASCSetting_FDD"
	),
	new QName (
	    "InformationElements",
	    "ASCSetting-FDD"
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
				"AccessServiceClass_FDD"
			    ),
			    new QName (
				"InformationElements",
				"AccessServiceClass-FDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "AccessServiceClass_FDD"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "AccessServiceClass_FDD"
				)
			    ),
			    0
			)
		    ),
		    "accessServiceClass-FDD",
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
     * Get the type descriptor (TypeInfo) of 'this' ASCSetting_FDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ASCSetting_FDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ASCSetting_FDD
