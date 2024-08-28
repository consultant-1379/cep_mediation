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
 * Define the ASN1 Type Mapping from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Mapping extends Sequence {
    
    /**
     * The default constructor.
     */
    public Mapping()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Mapping(RAT rat, 
		    MappingFunctionParameterList mappingFunctionParameterList)
    {
	setRat(rat);
	setMappingFunctionParameterList(mappingFunctionParameterList);
    }
    
    public void initComponents()
    {
	mComponents[0] = RAT.utra_FDD;
	mComponents[1] = new MappingFunctionParameterList();
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
		return RAT.utra_FDD;
	    case 1:
		return new MappingFunctionParameterList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rat"
    public RAT getRat()
    {
	return (RAT)mComponents[0];
    }
    
    public void setRat(RAT rat)
    {
	mComponents[0] = rat;
    }
    
    
    // Methods for field "mappingFunctionParameterList"
    public MappingFunctionParameterList getMappingFunctionParameterList()
    {
	return (MappingFunctionParameterList)mComponents[1];
    }
    
    public void setMappingFunctionParameterList(MappingFunctionParameterList mappingFunctionParameterList)
    {
	mComponents[1] = mappingFunctionParameterList;
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
	    "Mapping"
	),
	new QName (
	    "InformationElements",
	    "Mapping"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RAT"
			    ),
			    new QName (
				"InformationElements",
				"RAT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"utra-FDD",
					0
				    ),
				    new MemberListElement (
					"utra-TDD",
					1
				    ),
				    new MemberListElement (
					"gsm",
					2
				    ),
				    new MemberListElement (
					"cdma2000",
					3
				    )
				}
			    ),
			    0,
			    RAT.utra_FDD
			)
		    ),
		    "rat",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MappingFunctionParameterList"
			    ),
			    new QName (
				"InformationElements",
				"MappingFunctionParameterList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(3),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(3)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MappingFunctionParameter"
				)
			    )
			)
		    ),
		    "mappingFunctionParameterList",
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
     * Get the type descriptor (TypeInfo) of 'this' Mapping object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Mapping object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Mapping
