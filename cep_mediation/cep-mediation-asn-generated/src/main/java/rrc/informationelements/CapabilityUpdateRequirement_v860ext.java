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
 * Define the ASN1 Type CapabilityUpdateRequirement_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CapabilityUpdateRequirement_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public CapabilityUpdateRequirement_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CapabilityUpdateRequirement_v860ext(SystemSpecificCapUpdateReqList_r8 systemSpecificCapUpdateReqList)
    {
	setSystemSpecificCapUpdateReqList(systemSpecificCapUpdateReqList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SystemSpecificCapUpdateReqList_r8();
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
		return new SystemSpecificCapUpdateReqList_r8();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "systemSpecificCapUpdateReqList"
    public SystemSpecificCapUpdateReqList_r8 getSystemSpecificCapUpdateReqList()
    {
	return (SystemSpecificCapUpdateReqList_r8)mComponents[0];
    }
    
    public void setSystemSpecificCapUpdateReqList(SystemSpecificCapUpdateReqList_r8 systemSpecificCapUpdateReqList)
    {
	mComponents[0] = systemSpecificCapUpdateReqList;
    }
    
    public boolean hasSystemSpecificCapUpdateReqList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSystemSpecificCapUpdateReqList()
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
	    "CapabilityUpdateRequirement_v860ext"
	),
	new QName (
	    "InformationElements",
	    "CapabilityUpdateRequirement-v860ext"
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
				"SystemSpecificCapUpdateReqList_r8"
			    ),
			    new QName (
				"InformationElements",
				"SystemSpecificCapUpdateReqList-r8"
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
				    "rrc.informationelements",
				    "SystemSpecificCapUpdateReq_r8"
				)
			    )
			)
		    ),
		    "systemSpecificCapUpdateReqList",
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
     * Get the type descriptor (TypeInfo) of 'this' CapabilityUpdateRequirement_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CapabilityUpdateRequirement_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CapabilityUpdateRequirement_v860ext
