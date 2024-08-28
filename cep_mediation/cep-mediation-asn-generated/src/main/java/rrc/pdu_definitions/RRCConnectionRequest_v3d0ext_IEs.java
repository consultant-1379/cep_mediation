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
 * Define the ASN1 Type RRCConnectionRequest_v3d0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionRequest_v3d0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRequest_v3d0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionRequest_v3d0ext_IEs(rrc.informationelements.UESpecificBehaviourInformation1idle uESpecificBehaviourInformation1idle)
    {
	setUESpecificBehaviourInformation1idle(uESpecificBehaviourInformation1idle);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UESpecificBehaviourInformation1idle();
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
		return new rrc.informationelements.UESpecificBehaviourInformation1idle();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "uESpecificBehaviourInformation1idle"
    public rrc.informationelements.UESpecificBehaviourInformation1idle getUESpecificBehaviourInformation1idle()
    {
	return (rrc.informationelements.UESpecificBehaviourInformation1idle)mComponents[0];
    }
    
    public void setUESpecificBehaviourInformation1idle(rrc.informationelements.UESpecificBehaviourInformation1idle uESpecificBehaviourInformation1idle)
    {
	mComponents[0] = uESpecificBehaviourInformation1idle;
    }
    
    public boolean hasUESpecificBehaviourInformation1idle()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUESpecificBehaviourInformation1idle()
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
	    "RRCConnectionRequest_v3d0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRequest-v3d0ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UESpecificBehaviourInformation1idle"
			    ),
			    new QName (
				"InformationElements",
				"UESpecificBehaviourInformation1idle"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(4)
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "uESpecificBehaviourInformation1idle",
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRequest_v3d0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRequest_v3d0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRequest_v3d0ext_IEs
