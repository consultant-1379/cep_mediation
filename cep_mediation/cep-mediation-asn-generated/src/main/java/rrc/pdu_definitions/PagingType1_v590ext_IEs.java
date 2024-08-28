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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type PagingType1_v590ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class PagingType1_v590ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public PagingType1_v590ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PagingType1_v590ext_IEs(rrc.informationelements.PagingRecord2List_r5 pagingRecord2List)
    {
	setPagingRecord2List(pagingRecord2List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.PagingRecord2List_r5();
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
		return new rrc.informationelements.PagingRecord2List_r5();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pagingRecord2List"
    public rrc.informationelements.PagingRecord2List_r5 getPagingRecord2List()
    {
	return (rrc.informationelements.PagingRecord2List_r5)mComponents[0];
    }
    
    public void setPagingRecord2List(rrc.informationelements.PagingRecord2List_r5 pagingRecord2List)
    {
	mComponents[0] = pagingRecord2List;
    }
    
    public boolean hasPagingRecord2List()
    {
	return componentIsPresent(0);
    }
    
    public void deletePagingRecord2List()
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
	    "rrc.pdu_definitions",
	    "PagingType1_v590ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "PagingType1-v590ext-IEs"
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
				"PagingRecord2List_r5"
			    ),
			    new QName (
				"InformationElements",
				"PagingRecord2List-r5"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PagingRecord2_r5"
				)
			    )
			)
		    ),
		    "pagingRecord2List",
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
     * Get the type descriptor (TypeInfo) of 'this' PagingType1_v590ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PagingType1_v590ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PagingType1_v590ext_IEs
