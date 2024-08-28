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
 * Define the ASN1 Type DomainSpecificAccessRestriction_v670ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class DomainSpecificAccessRestriction_v670ext extends Choice {
    
    /**
     * The default constructor.
     */
    public DomainSpecificAccessRestriction_v670ext()
    {
    }
    
    public static final  int  noRestriction_chosen = 1;
    public static final  int  restriction_chosen = 2;
    
    // Methods for field "noRestriction"
    public static DomainSpecificAccessRestriction_v670ext createDomainSpecificAccessRestriction_v670extWithNoRestriction(Null noRestriction)
    {
	DomainSpecificAccessRestriction_v670ext __object = new DomainSpecificAccessRestriction_v670ext();

	__object.setNoRestriction(noRestriction);
	return __object;
    }
    
    public boolean hasNoRestriction()
    {
	return getChosenFlag() == noRestriction_chosen;
    }
    
    public void setNoRestriction(Null noRestriction)
    {
	setChosenValue(noRestriction);
	setChosenFlag(noRestriction_chosen);
    }
    
    
    // Methods for field "restriction"
    public static DomainSpecificAccessRestriction_v670ext createDomainSpecificAccessRestriction_v670extWithRestriction(Restriction restriction)
    {
	DomainSpecificAccessRestriction_v670ext __object = new DomainSpecificAccessRestriction_v670ext();

	__object.setRestriction(restriction);
	return __object;
    }
    
    public boolean hasRestriction()
    {
	return getChosenFlag() == restriction_chosen;
    }
    
    public void setRestriction(Restriction restriction)
    {
	setChosenValue(restriction);
	setChosenFlag(restriction_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Restriction from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Restriction extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Restriction()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Restriction(AccessClassBarredList domainSpecficAccessClassBarredList)
	{
	    setDomainSpecficAccessClassBarredList(domainSpecficAccessClassBarredList);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new AccessClassBarredList();
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
		    return new AccessClassBarredList();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "domainSpecficAccessClassBarredList"
	public AccessClassBarredList getDomainSpecficAccessClassBarredList()
	{
	    return (AccessClassBarredList)mComponents[0];
	}
	
	public void setDomainSpecficAccessClassBarredList(AccessClassBarredList domainSpecficAccessClassBarredList)
	{
	    mComponents[0] = domainSpecficAccessClassBarredList;
	}
	
	public boolean hasDomainSpecficAccessClassBarredList()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteDomainSpecficAccessClassBarredList()
	{
	    setComponentAbsent(0);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DomainSpecificAccessRestriction_v670ext$Restriction"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "AccessClassBarredList"
				),
				new QName (
				    "InformationElements",
				    "AccessClassBarredList"
				),
				12314,
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(16)
				    )
				),
				new Bounds (
				    new java.lang.Long(16),
				    new java.lang.Long(16)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"AccessClassBarred"
				    )
				)
			    )
			),
			"domainSpecficAccessClassBarredList",
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
	 * Get the type descriptor (TypeInfo) of 'this' Restriction object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Restriction object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Restriction

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case noRestriction_chosen:
		return new Null();
	    case restriction_chosen:
		return new Restriction();
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
	    "DomainSpecificAccessRestriction_v670ext"
	),
	new QName (
	    "InformationElements",
	    "DomainSpecificAccessRestriction-v670ext"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "noRestriction",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DomainSpecificAccessRestriction_v670ext$Restriction"
			)
		    ),
		    "restriction",
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
     * Get the type descriptor (TypeInfo) of 'this' DomainSpecificAccessRestriction_v670ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DomainSpecificAccessRestriction_v670ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DomainSpecificAccessRestriction_v670ext
