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
 * Define the ASN1 Type MBMS_ModifiedService_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_ModifiedService_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_ModifiedService_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_ModifiedService_v770ext(MBSFN_ClusterFrequency_r7 mbsfnClusterFrequency)
    {
	setMbsfnClusterFrequency(mbsfnClusterFrequency);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBSFN_ClusterFrequency_r7();
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
		return new MBSFN_ClusterFrequency_r7();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbsfnClusterFrequency"
    public MBSFN_ClusterFrequency_r7 getMbsfnClusterFrequency()
    {
	return (MBSFN_ClusterFrequency_r7)mComponents[0];
    }
    
    public void setMbsfnClusterFrequency(MBSFN_ClusterFrequency_r7 mbsfnClusterFrequency)
    {
	mComponents[0] = mbsfnClusterFrequency;
    }
    
    public boolean hasMbsfnClusterFrequency()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMbsfnClusterFrequency()
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
	    "MBMS_ModifiedService_v770ext"
	),
	new QName (
	    "InformationElements",
	    "MBMS-ModifiedService-v770ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBSFN_ClusterFrequency_r7"
			    ),
			    new QName (
				"InformationElements",
				"MBSFN-ClusterFrequency-r7"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBSFN_ClusterFrequency_r7(1), 
				    new MBSFN_ClusterFrequency_r7(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "mbsfnClusterFrequency",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_ModifiedService_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_ModifiedService_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_ModifiedService_v770ext
