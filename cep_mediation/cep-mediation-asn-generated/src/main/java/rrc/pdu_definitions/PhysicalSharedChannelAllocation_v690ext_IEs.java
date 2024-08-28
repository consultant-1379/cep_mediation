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
 * Define the ASN1 Type PhysicalSharedChannelAllocation_v690ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class PhysicalSharedChannelAllocation_v690ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalSharedChannelAllocation_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalSharedChannelAllocation_v690ext_IEs(rrc.informationelements.BEACON_PL_Est beaconPLEst)
    {
	setBeaconPLEst(beaconPLEst);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.BEACON_PL_Est._true;
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
		return rrc.informationelements.BEACON_PL_Est._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "beaconPLEst"
    public rrc.informationelements.BEACON_PL_Est getBeaconPLEst()
    {
	return (rrc.informationelements.BEACON_PL_Est)mComponents[0];
    }
    
    public void setBeaconPLEst(rrc.informationelements.BEACON_PL_Est beaconPLEst)
    {
	mComponents[0] = beaconPLEst;
    }
    
    public boolean hasBeaconPLEst()
    {
	return componentIsPresent(0);
    }
    
    public void deleteBeaconPLEst()
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
	    "PhysicalSharedChannelAllocation_v690ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "PhysicalSharedChannelAllocation-v690ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"BEACON_PL_Est"
			    ),
			    new QName (
				"InformationElements",
				"BEACON-PL-Est"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"true",
					0
				    )
				}
			    ),
			    0,
			    rrc.informationelements.BEACON_PL_Est._true
			)
		    ),
		    "beaconPLEst",
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
     * Get the type descriptor (TypeInfo) of 'this' PhysicalSharedChannelAllocation_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalSharedChannelAllocation_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalSharedChannelAllocation_v690ext_IEs
