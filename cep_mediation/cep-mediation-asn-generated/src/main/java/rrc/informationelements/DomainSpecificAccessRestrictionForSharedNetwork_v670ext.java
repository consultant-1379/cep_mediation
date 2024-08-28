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
 * Define the ASN1 Type DomainSpecificAccessRestrictionForSharedNetwork_v670ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class DomainSpecificAccessRestrictionForSharedNetwork_v670ext extends Choice {
    
    /**
     * The default constructor.
     */
    public DomainSpecificAccessRestrictionForSharedNetwork_v670ext()
    {
    }
    
    public static final  int  domainSpecificAccessRestictionList_chosen = 1;
    public static final  int  domainSpecificAccessRestictionParametersForAll_chosen = 2;
    
    // Methods for field "domainSpecificAccessRestictionList"
    public static DomainSpecificAccessRestrictionForSharedNetwork_v670ext createDomainSpecificAccessRestrictionForSharedNetwork_v670extWithDomainSpecificAccessRestictionList(DomainSpecificAccessRestrictionList_v670ext domainSpecificAccessRestictionList)
    {
	DomainSpecificAccessRestrictionForSharedNetwork_v670ext __object = new DomainSpecificAccessRestrictionForSharedNetwork_v670ext();

	__object.setDomainSpecificAccessRestictionList(domainSpecificAccessRestictionList);
	return __object;
    }
    
    public boolean hasDomainSpecificAccessRestictionList()
    {
	return getChosenFlag() == domainSpecificAccessRestictionList_chosen;
    }
    
    public void setDomainSpecificAccessRestictionList(DomainSpecificAccessRestrictionList_v670ext domainSpecificAccessRestictionList)
    {
	setChosenValue(domainSpecificAccessRestictionList);
	setChosenFlag(domainSpecificAccessRestictionList_chosen);
    }
    
    
    // Methods for field "domainSpecificAccessRestictionParametersForAll"
    public static DomainSpecificAccessRestrictionForSharedNetwork_v670ext createDomainSpecificAccessRestrictionForSharedNetwork_v670extWithDomainSpecificAccessRestictionParametersForAll(DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestictionParametersForAll)
    {
	DomainSpecificAccessRestrictionForSharedNetwork_v670ext __object = new DomainSpecificAccessRestrictionForSharedNetwork_v670ext();

	__object.setDomainSpecificAccessRestictionParametersForAll(domainSpecificAccessRestictionParametersForAll);
	return __object;
    }
    
    public boolean hasDomainSpecificAccessRestictionParametersForAll()
    {
	return getChosenFlag() == domainSpecificAccessRestictionParametersForAll_chosen;
    }
    
    public void setDomainSpecificAccessRestictionParametersForAll(DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestictionParametersForAll)
    {
	setChosenValue(domainSpecificAccessRestictionParametersForAll);
	setChosenFlag(domainSpecificAccessRestictionParametersForAll_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case domainSpecificAccessRestictionList_chosen:
		return new DomainSpecificAccessRestrictionList_v670ext();
	    case domainSpecificAccessRestictionParametersForAll_chosen:
		return new DomainSpecificAccessRestrictionParam_v670ext();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
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
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DomainSpecificAccessRestrictionList_v670ext"
			    ),
			    new QName (
				"InformationElements",
				"DomainSpecificAccessRestrictionList-v670ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DomainSpecificAccessRestrictionList_v670ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DomainSpecificAccessRestrictionList_v670ext"
				)
			    ),
			    0
			)
		    ),
		    "domainSpecificAccessRestictionList",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "domainSpecificAccessRestictionParametersForAll",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DomainSpecificAccessRestrictionForSharedNetwork_v670ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DomainSpecificAccessRestrictionForSharedNetwork_v670ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DomainSpecificAccessRestrictionForSharedNetwork_v670ext
