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
 * Define the ASN1 Type UTRANMobilityInformation_v860ext2_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UTRANMobilityInformation_v860ext2_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UTRANMobilityInformation_v860ext2_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UTRANMobilityInformation_v860ext2_IEs(rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.UE_ConnTimersAndConstants_v860ext ue_ConnTimersAndConstants, 
		    rrc.informationelements.DedicatedPriorityInformation dedicatedPriorityInformation)
    {
	setNewPrimary_E_RNTI(newPrimary_E_RNTI);
	setUe_ConnTimersAndConstants(ue_ConnTimersAndConstants);
	setDedicatedPriorityInformation(dedicatedPriorityInformation);
    }
    
    /**
     * Construct with required components.
     */
    public UTRANMobilityInformation_v860ext2_IEs(rrc.informationelements.UE_ConnTimersAndConstants_v860ext ue_ConnTimersAndConstants)
    {
	setUe_ConnTimersAndConstants(ue_ConnTimersAndConstants);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.E_RNTI();
	mComponents[1] = new rrc.informationelements.UE_ConnTimersAndConstants_v860ext();
	mComponents[2] = new rrc.informationelements.DedicatedPriorityInformation();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.E_RNTI();
	    case 1:
		return new rrc.informationelements.UE_ConnTimersAndConstants_v860ext();
	    case 2:
		return new rrc.informationelements.DedicatedPriorityInformation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "newPrimary_E_RNTI"
    public rrc.informationelements.E_RNTI getNewPrimary_E_RNTI()
    {
	return (rrc.informationelements.E_RNTI)mComponents[0];
    }
    
    public void setNewPrimary_E_RNTI(rrc.informationelements.E_RNTI newPrimary_E_RNTI)
    {
	mComponents[0] = newPrimary_E_RNTI;
    }
    
    public boolean hasNewPrimary_E_RNTI()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNewPrimary_E_RNTI()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_ConnTimersAndConstants"
    public rrc.informationelements.UE_ConnTimersAndConstants_v860ext getUe_ConnTimersAndConstants()
    {
	return (rrc.informationelements.UE_ConnTimersAndConstants_v860ext)mComponents[1];
    }
    
    public void setUe_ConnTimersAndConstants(rrc.informationelements.UE_ConnTimersAndConstants_v860ext ue_ConnTimersAndConstants)
    {
	mComponents[1] = ue_ConnTimersAndConstants;
    }
    
    
    // Methods for field "dedicatedPriorityInformation"
    public rrc.informationelements.DedicatedPriorityInformation getDedicatedPriorityInformation()
    {
	return (rrc.informationelements.DedicatedPriorityInformation)mComponents[2];
    }
    
    public void setDedicatedPriorityInformation(rrc.informationelements.DedicatedPriorityInformation dedicatedPriorityInformation)
    {
	mComponents[2] = dedicatedPriorityInformation;
    }
    
    public boolean hasDedicatedPriorityInformation()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDedicatedPriorityInformation()
    {
	setComponentAbsent(2);
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
	    "UTRANMobilityInformation_v860ext2_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UTRANMobilityInformation-v860ext2-IEs"
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
				"E_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"E-RNTI"
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
			    null
			)
		    ),
		    "newPrimary-E-RNTI",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_ConnTimersAndConstants_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-ConnTimersAndConstants-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_ConnTimersAndConstants_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_ConnTimersAndConstants_v860ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-ConnTimersAndConstants",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DedicatedPriorityInformation"
			    ),
			    new QName (
				"InformationElements",
				"DedicatedPriorityInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DedicatedPriorityInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DedicatedPriorityInformation"
				)
			    ),
			    0
			)
		    ),
		    "dedicatedPriorityInformation",
		    2,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UTRANMobilityInformation_v860ext2_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRANMobilityInformation_v860ext2_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRANMobilityInformation_v860ext2_IEs
