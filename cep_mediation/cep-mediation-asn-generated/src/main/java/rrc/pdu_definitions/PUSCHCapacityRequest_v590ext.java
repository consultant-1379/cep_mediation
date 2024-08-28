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
 * Define the ASN1 Type PUSCHCapacityRequest_v590ext from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class PUSCHCapacityRequest_v590ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public PUSCHCapacityRequest_v590ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PUSCHCapacityRequest_v590ext(rrc.informationelements.DeltaRSCP primaryCCPCH_RSCP_delta)
    {
	setPrimaryCCPCH_RSCP_delta(primaryCCPCH_RSCP_delta);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.DeltaRSCP();
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
		return new rrc.informationelements.DeltaRSCP();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryCCPCH_RSCP_delta"
    public rrc.informationelements.DeltaRSCP getPrimaryCCPCH_RSCP_delta()
    {
	return (rrc.informationelements.DeltaRSCP)mComponents[0];
    }
    
    public void setPrimaryCCPCH_RSCP_delta(rrc.informationelements.DeltaRSCP primaryCCPCH_RSCP_delta)
    {
	mComponents[0] = primaryCCPCH_RSCP_delta;
    }
    
    public boolean hasPrimaryCCPCH_RSCP_delta()
    {
	return componentIsPresent(0);
    }
    
    public void deletePrimaryCCPCH_RSCP_delta()
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
	    "PUSCHCapacityRequest_v590ext"
	),
	new QName (
	    "PDU-definitions",
	    "PUSCHCapacityRequest-v590ext"
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
				"DeltaRSCP"
			    ),
			    new QName (
				"InformationElements",
				"DeltaRSCP"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.DeltaRSCP(-5), 
				    new rrc.informationelements.DeltaRSCP(-1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-5),
				new java.lang.Long(-1)
			    ),
			    null
			)
		    ),
		    "primaryCCPCH-RSCP-delta",
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
     * Get the type descriptor (TypeInfo) of 'this' PUSCHCapacityRequest_v590ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PUSCHCapacityRequest_v590ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PUSCHCapacityRequest_v590ext
