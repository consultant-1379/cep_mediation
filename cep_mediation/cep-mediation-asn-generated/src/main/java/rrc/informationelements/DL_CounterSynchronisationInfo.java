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
 * Define the ASN1 Type DL_CounterSynchronisationInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_CounterSynchronisationInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_CounterSynchronisationInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_CounterSynchronisationInfo(RB_WithPDCP_InfoList rB_WithPDCP_InfoList)
    {
	setRB_WithPDCP_InfoList(rB_WithPDCP_InfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RB_WithPDCP_InfoList();
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
		return new RB_WithPDCP_InfoList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rB_WithPDCP_InfoList"
    public RB_WithPDCP_InfoList getRB_WithPDCP_InfoList()
    {
	return (RB_WithPDCP_InfoList)mComponents[0];
    }
    
    public void setRB_WithPDCP_InfoList(RB_WithPDCP_InfoList rB_WithPDCP_InfoList)
    {
	mComponents[0] = rB_WithPDCP_InfoList;
    }
    
    public boolean hasRB_WithPDCP_InfoList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRB_WithPDCP_InfoList()
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
	    "DL_CounterSynchronisationInfo"
	),
	new QName (
	    "InformationElements",
	    "DL-CounterSynchronisationInfo"
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
				"RB_WithPDCP_InfoList"
			    ),
			    new QName (
				"InformationElements",
				"RB-WithPDCP-InfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(27),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(27)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RB_WithPDCP_Info"
				)
			    )
			)
		    ),
		    "rB-WithPDCP-InfoList",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_CounterSynchronisationInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_CounterSynchronisationInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_CounterSynchronisationInfo
