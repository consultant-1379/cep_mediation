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
 * Define the ASN1 Type MasterInformationBlock_v690ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MasterInformationBlock_v690ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MasterInformationBlock_v690ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MasterInformationBlock_v690ext(MultiplePLMN_List_r6 multiplePLMN_List)
    {
	setMultiplePLMN_List(multiplePLMN_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MultiplePLMN_List_r6();
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
		return new MultiplePLMN_List_r6();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "multiplePLMN_List"
    public MultiplePLMN_List_r6 getMultiplePLMN_List()
    {
	return (MultiplePLMN_List_r6)mComponents[0];
    }
    
    public void setMultiplePLMN_List(MultiplePLMN_List_r6 multiplePLMN_List)
    {
	mComponents[0] = multiplePLMN_List;
    }
    
    public boolean hasMultiplePLMN_List()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMultiplePLMN_List()
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
	    "MasterInformationBlock_v690ext"
	),
	new QName (
	    "InformationElements",
	    "MasterInformationBlock-v690ext"
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
				"MultiplePLMN_List_r6"
			    ),
			    new QName (
				"InformationElements",
				"MultiplePLMN-List-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MultiplePLMN_List_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MultiplePLMN_List_r6"
				)
			    ),
			    0
			)
		    ),
		    "multiplePLMN-List",
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
     * Get the type descriptor (TypeInfo) of 'this' MasterInformationBlock_v690ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MasterInformationBlock_v690ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MasterInformationBlock_v690ext
