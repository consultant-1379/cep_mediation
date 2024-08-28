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
 * Define the ASN1 Type SysInfoType11_v860ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType11_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType11_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType11_v860ext_IEs(MBSFNFrequencyList_v860ext mbsfnFrequencyList)
    {
	setMbsfnFrequencyList(mbsfnFrequencyList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBSFNFrequencyList_v860ext();
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
		return new MBSFNFrequencyList_v860ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbsfnFrequencyList"
    public MBSFNFrequencyList_v860ext getMbsfnFrequencyList()
    {
	return (MBSFNFrequencyList_v860ext)mComponents[0];
    }
    
    public void setMbsfnFrequencyList(MBSFNFrequencyList_v860ext mbsfnFrequencyList)
    {
	mComponents[0] = mbsfnFrequencyList;
    }
    
    public boolean hasMbsfnFrequencyList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMbsfnFrequencyList()
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
	    "SysInfoType11_v860ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType11-v860ext-IEs"
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
				"MBSFNFrequencyList_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"MBSFNFrequencyList-v860ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MBSFNFrequency_v860ext"
				)
			    )
			)
		    ),
		    "mbsfnFrequencyList",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType11_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType11_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType11_v860ext_IEs
