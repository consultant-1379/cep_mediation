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
 * Define the ASN1 Type SysInfoType3_v670ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType3_v670ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType3_v670ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType3_v670ext(DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForPLMNOfMIB, 
		    DomainSpecificAccessRestrictionForSharedNetwork_v670ext domainSpecificAccessRestictionForSharedNetwork)
    {
	setDomainSpecificAccessRestrictionParametersForPLMNOfMIB(domainSpecificAccessRestrictionParametersForPLMNOfMIB);
	setDomainSpecificAccessRestictionForSharedNetwork(domainSpecificAccessRestictionForSharedNetwork);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DomainSpecificAccessRestrictionParam_v670ext();
	mComponents[1] = new DomainSpecificAccessRestrictionForSharedNetwork_v670ext();
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
		return new DomainSpecificAccessRestrictionParam_v670ext();
	    case 1:
		return new DomainSpecificAccessRestrictionForSharedNetwork_v670ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "domainSpecificAccessRestrictionParametersForPLMNOfMIB"
    public DomainSpecificAccessRestrictionParam_v670ext getDomainSpecificAccessRestrictionParametersForPLMNOfMIB()
    {
	return (DomainSpecificAccessRestrictionParam_v670ext)mComponents[0];
    }
    
    public void setDomainSpecificAccessRestrictionParametersForPLMNOfMIB(DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForPLMNOfMIB)
    {
	mComponents[0] = domainSpecificAccessRestrictionParametersForPLMNOfMIB;
    }
    
    public boolean hasDomainSpecificAccessRestrictionParametersForPLMNOfMIB()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDomainSpecificAccessRestrictionParametersForPLMNOfMIB()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "domainSpecificAccessRestictionForSharedNetwork"
    public DomainSpecificAccessRestrictionForSharedNetwork_v670ext getDomainSpecificAccessRestictionForSharedNetwork()
    {
	return (DomainSpecificAccessRestrictionForSharedNetwork_v670ext)mComponents[1];
    }
    
    public void setDomainSpecificAccessRestictionForSharedNetwork(DomainSpecificAccessRestrictionForSharedNetwork_v670ext domainSpecificAccessRestictionForSharedNetwork)
    {
	mComponents[1] = domainSpecificAccessRestictionForSharedNetwork;
    }
    
    public boolean hasDomainSpecificAccessRestictionForSharedNetwork()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDomainSpecificAccessRestictionForSharedNetwork()
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
	    "SysInfoType3_v670ext"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType3-v670ext"
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
				"DomainSpecificAccessRestrictionParam_v670ext"
			    ),
			    new QName (
				"InformationElements",
				"DomainSpecificAccessRestrictionParam-v670ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DomainSpecificAccessRestrictionParam_v670ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DomainSpecificAccessRestrictionParam_v670ext"
				)
			    ),
			    0
			)
		    ),
		    "domainSpecificAccessRestrictionParametersForPLMNOfMIB",
		    0,
		    3,
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
				"DomainSpecificAccessRestrictionForSharedNetwork_v670ext"
			    ),
			    new QName (
				"InformationElements",
				"DomainSpecificAccessRestrictionForSharedNetwork-v670ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DomainSpecificAccessRestrictionForSharedNetwork_v670ext"
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
		    "domainSpecificAccessRestictionForSharedNetwork",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType3_v670ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType3_v670ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType3_v670ext
