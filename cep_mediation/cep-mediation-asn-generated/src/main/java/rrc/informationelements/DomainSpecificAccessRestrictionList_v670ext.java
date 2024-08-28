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
 * Define the ASN1 Type DomainSpecificAccessRestrictionList_v670ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DomainSpecificAccessRestrictionList_v670ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public DomainSpecificAccessRestrictionList_v670ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DomainSpecificAccessRestrictionList_v670ext(DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForOperator1, 
		    DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForOperator2, 
		    DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForOperator3, 
		    DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForOperator4, 
		    DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForOperator5)
    {
	setDomainSpecificAccessRestrictionParametersForOperator1(domainSpecificAccessRestrictionParametersForOperator1);
	setDomainSpecificAccessRestrictionParametersForOperator2(domainSpecificAccessRestrictionParametersForOperator2);
	setDomainSpecificAccessRestrictionParametersForOperator3(domainSpecificAccessRestrictionParametersForOperator3);
	setDomainSpecificAccessRestrictionParametersForOperator4(domainSpecificAccessRestrictionParametersForOperator4);
	setDomainSpecificAccessRestrictionParametersForOperator5(domainSpecificAccessRestrictionParametersForOperator5);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DomainSpecificAccessRestrictionParam_v670ext();
	mComponents[1] = new DomainSpecificAccessRestrictionParam_v670ext();
	mComponents[2] = new DomainSpecificAccessRestrictionParam_v670ext();
	mComponents[3] = new DomainSpecificAccessRestrictionParam_v670ext();
	mComponents[4] = new DomainSpecificAccessRestrictionParam_v670ext();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new DomainSpecificAccessRestrictionParam_v670ext();
	    case 1:
		return new DomainSpecificAccessRestrictionParam_v670ext();
	    case 2:
		return new DomainSpecificAccessRestrictionParam_v670ext();
	    case 3:
		return new DomainSpecificAccessRestrictionParam_v670ext();
	    case 4:
		return new DomainSpecificAccessRestrictionParam_v670ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "domainSpecificAccessRestrictionParametersForOperator1"
    public DomainSpecificAccessRestrictionParam_v670ext getDomainSpecificAccessRestrictionParametersForOperator1()
    {
	return (DomainSpecificAccessRestrictionParam_v670ext)mComponents[0];
    }
    
    public void setDomainSpecificAccessRestrictionParametersForOperator1(DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForOperator1)
    {
	mComponents[0] = domainSpecificAccessRestrictionParametersForOperator1;
    }
    
    public boolean hasDomainSpecificAccessRestrictionParametersForOperator1()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDomainSpecificAccessRestrictionParametersForOperator1()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "domainSpecificAccessRestrictionParametersForOperator2"
    public DomainSpecificAccessRestrictionParam_v670ext getDomainSpecificAccessRestrictionParametersForOperator2()
    {
	return (DomainSpecificAccessRestrictionParam_v670ext)mComponents[1];
    }
    
    public void setDomainSpecificAccessRestrictionParametersForOperator2(DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForOperator2)
    {
	mComponents[1] = domainSpecificAccessRestrictionParametersForOperator2;
    }
    
    public boolean hasDomainSpecificAccessRestrictionParametersForOperator2()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDomainSpecificAccessRestrictionParametersForOperator2()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "domainSpecificAccessRestrictionParametersForOperator3"
    public DomainSpecificAccessRestrictionParam_v670ext getDomainSpecificAccessRestrictionParametersForOperator3()
    {
	return (DomainSpecificAccessRestrictionParam_v670ext)mComponents[2];
    }
    
    public void setDomainSpecificAccessRestrictionParametersForOperator3(DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForOperator3)
    {
	mComponents[2] = domainSpecificAccessRestrictionParametersForOperator3;
    }
    
    public boolean hasDomainSpecificAccessRestrictionParametersForOperator3()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDomainSpecificAccessRestrictionParametersForOperator3()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "domainSpecificAccessRestrictionParametersForOperator4"
    public DomainSpecificAccessRestrictionParam_v670ext getDomainSpecificAccessRestrictionParametersForOperator4()
    {
	return (DomainSpecificAccessRestrictionParam_v670ext)mComponents[3];
    }
    
    public void setDomainSpecificAccessRestrictionParametersForOperator4(DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForOperator4)
    {
	mComponents[3] = domainSpecificAccessRestrictionParametersForOperator4;
    }
    
    public boolean hasDomainSpecificAccessRestrictionParametersForOperator4()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDomainSpecificAccessRestrictionParametersForOperator4()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "domainSpecificAccessRestrictionParametersForOperator5"
    public DomainSpecificAccessRestrictionParam_v670ext getDomainSpecificAccessRestrictionParametersForOperator5()
    {
	return (DomainSpecificAccessRestrictionParam_v670ext)mComponents[4];
    }
    
    public void setDomainSpecificAccessRestrictionParametersForOperator5(DomainSpecificAccessRestrictionParam_v670ext domainSpecificAccessRestrictionParametersForOperator5)
    {
	mComponents[4] = domainSpecificAccessRestrictionParametersForOperator5;
    }
    
    public boolean hasDomainSpecificAccessRestrictionParametersForOperator5()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDomainSpecificAccessRestrictionParametersForOperator5()
    {
	setComponentAbsent(4);
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
	    "DomainSpecificAccessRestrictionList_v670ext"
	),
	new QName (
	    "InformationElements",
	    "DomainSpecificAccessRestrictionList-v670ext"
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
		    "domainSpecificAccessRestrictionParametersForOperator1",
		    0,
		    3,
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
		    "domainSpecificAccessRestrictionParametersForOperator2",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "domainSpecificAccessRestrictionParametersForOperator3",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "domainSpecificAccessRestrictionParametersForOperator4",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "domainSpecificAccessRestrictionParametersForOperator5",
		    4,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DomainSpecificAccessRestrictionList_v670ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DomainSpecificAccessRestrictionList_v670ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DomainSpecificAccessRestrictionList_v670ext
