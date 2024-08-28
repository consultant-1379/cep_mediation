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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type SRNC_RelocationInfo_v970ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_v970ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_v970ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_v970ext_IEs(OngoingMeasRepList_v970ext_IE ongoingMeasRepList)
    {
	setOngoingMeasRepList(ongoingMeasRepList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new OngoingMeasRepList_v970ext_IE();
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
		return new OngoingMeasRepList_v970ext_IE();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ongoingMeasRepList"
    public OngoingMeasRepList_v970ext_IE getOngoingMeasRepList()
    {
	return (OngoingMeasRepList_v970ext_IE)mComponents[0];
    }
    
    public void setOngoingMeasRepList(OngoingMeasRepList_v970ext_IE ongoingMeasRepList)
    {
	mComponents[0] = ongoingMeasRepList;
    }
    
    public boolean hasOngoingMeasRepList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteOngoingMeasRepList()
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
	    "rrc.internode_definitions",
	    "SRNC_RelocationInfo_v970ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-v970ext-IEs"
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
				"rrc.internode_definitions",
				"OngoingMeasRepList_v970ext_IE"
			    ),
			    new QName (
				"Internode-definitions",
				"OngoingMeasRepList-v970ext-IE"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "OngoingMeasRep_v970ext_IEs"
				)
			    )
			)
		    ),
		    "ongoingMeasRepList",
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
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v970ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v970ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_v970ext_IEs
