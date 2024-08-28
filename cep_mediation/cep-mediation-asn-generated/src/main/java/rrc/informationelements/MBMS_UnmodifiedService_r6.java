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
 * Define the ASN1 Type MBMS_UnmodifiedService_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_UnmodifiedService_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_UnmodifiedService_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_UnmodifiedService_r6(MBMS_TransmissionIdentity mbms_TransmissionIdentity, 
		    MBMS_RequiredUEAction_UMod mbms_RequiredUEAction, 
		    MBMS_PFLIndex mbms_PreferredFrequency)
    {
	setMbms_TransmissionIdentity(mbms_TransmissionIdentity);
	setMbms_RequiredUEAction(mbms_RequiredUEAction);
	setMbms_PreferredFrequency(mbms_PreferredFrequency);
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_UnmodifiedService_r6(MBMS_TransmissionIdentity mbms_TransmissionIdentity, 
		    MBMS_RequiredUEAction_UMod mbms_RequiredUEAction)
    {
	setMbms_TransmissionIdentity(mbms_TransmissionIdentity);
	setMbms_RequiredUEAction(mbms_RequiredUEAction);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_TransmissionIdentity();
	mComponents[1] = MBMS_RequiredUEAction_UMod.none;
	mComponents[2] = new MBMS_PFLIndex();
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
		return new MBMS_TransmissionIdentity();
	    case 1:
		return MBMS_RequiredUEAction_UMod.none;
	    case 2:
		return new MBMS_PFLIndex();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_TransmissionIdentity"
    public MBMS_TransmissionIdentity getMbms_TransmissionIdentity()
    {
	return (MBMS_TransmissionIdentity)mComponents[0];
    }
    
    public void setMbms_TransmissionIdentity(MBMS_TransmissionIdentity mbms_TransmissionIdentity)
    {
	mComponents[0] = mbms_TransmissionIdentity;
    }
    
    
    // Methods for field "mbms_RequiredUEAction"
    public MBMS_RequiredUEAction_UMod getMbms_RequiredUEAction()
    {
	return (MBMS_RequiredUEAction_UMod)mComponents[1];
    }
    
    public void setMbms_RequiredUEAction(MBMS_RequiredUEAction_UMod mbms_RequiredUEAction)
    {
	mComponents[1] = mbms_RequiredUEAction;
    }
    
    
    // Methods for field "mbms_PreferredFrequency"
    public MBMS_PFLIndex getMbms_PreferredFrequency()
    {
	return (MBMS_PFLIndex)mComponents[2];
    }
    
    public void setMbms_PreferredFrequency(MBMS_PFLIndex mbms_PreferredFrequency)
    {
	mComponents[2] = mbms_PreferredFrequency;
    }
    
    public boolean hasMbms_PreferredFrequency()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMbms_PreferredFrequency()
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
	    "rrc.informationelements",
	    "MBMS_UnmodifiedService_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-UnmodifiedService-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_TransmissionIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-TransmissionIdentity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TransmissionIdentity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TransmissionIdentity"
				)
			    ),
			    0
			)
		    ),
		    "mbms-TransmissionIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_RequiredUEAction_UMod"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-RequiredUEAction-UMod"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"none",
					0
				    ),
				    new MemberListElement (
					"acquirePTM-RBInfo",
					1
				    ),
				    new MemberListElement (
					"requestPTPRB",
					2
				    )
				}
			    ),
			    0,
			    MBMS_RequiredUEAction_UMod.none
			)
		    ),
		    "mbms-RequiredUEAction",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_PFLIndex"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PFLIndex"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_PFLIndex(1), 
				    new MBMS_PFLIndex(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "mbms-PreferredFrequency",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_UnmodifiedService_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_UnmodifiedService_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_UnmodifiedService_r6
