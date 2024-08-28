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
 * Define the ASN1 Type ASCSetting_TDD_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ASCSetting_TDD_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public ASCSetting_TDD_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ASCSetting_TDD_r7(AccessServiceClass_TDD_r7 accessServiceClass_TDD)
    {
	setAccessServiceClass_TDD(accessServiceClass_TDD);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AccessServiceClass_TDD_r7();
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
		return new AccessServiceClass_TDD_r7();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "accessServiceClass_TDD"
    public AccessServiceClass_TDD_r7 getAccessServiceClass_TDD()
    {
	return (AccessServiceClass_TDD_r7)mComponents[0];
    }
    
    public void setAccessServiceClass_TDD(AccessServiceClass_TDD_r7 accessServiceClass_TDD)
    {
	mComponents[0] = accessServiceClass_TDD;
    }
    
    public boolean hasAccessServiceClass_TDD()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAccessServiceClass_TDD()
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
	    "ASCSetting_TDD_r7"
	),
	new QName (
	    "InformationElements",
	    "ASCSetting-TDD-r7"
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
				"AccessServiceClass_TDD_r7"
			    ),
			    new QName (
				"InformationElements",
				"AccessServiceClass-TDD-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "AccessServiceClass_TDD_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "AccessServiceClass_TDD_r7"
				)
			    ),
			    0
			)
		    ),
		    "accessServiceClass-TDD",
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
     * Get the type descriptor (TypeInfo) of 'this' ASCSetting_TDD_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ASCSetting_TDD_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ASCSetting_TDD_r7
