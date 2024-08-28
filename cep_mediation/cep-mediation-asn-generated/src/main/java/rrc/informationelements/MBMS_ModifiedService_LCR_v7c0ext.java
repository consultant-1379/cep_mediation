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
 * Define the ASN1 Type MBMS_ModifiedService_LCR_v7c0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_ModifiedService_LCR_v7c0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_ModifiedService_LCR_v7c0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_ModifiedService_LCR_v7c0ext(MBMS_PTM_RBReleaseCause_LCR_r7 rbReleaseCause)
    {
	setRbReleaseCause(rbReleaseCause);
    }
    
    public void initComponents()
    {
	mComponents[0] = MBMS_PTM_RBReleaseCause_LCR_r7.normalRelease;
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
		return MBMS_PTM_RBReleaseCause_LCR_r7.normalRelease;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rbReleaseCause"
    public MBMS_PTM_RBReleaseCause_LCR_r7 getRbReleaseCause()
    {
	return (MBMS_PTM_RBReleaseCause_LCR_r7)mComponents[0];
    }
    
    public void setRbReleaseCause(MBMS_PTM_RBReleaseCause_LCR_r7 rbReleaseCause)
    {
	mComponents[0] = rbReleaseCause;
    }
    
    public boolean hasRbReleaseCause()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRbReleaseCause()
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
	    "MBMS_ModifiedService_LCR_v7c0ext"
	),
	new QName (
	    "InformationElements",
	    "MBMS-ModifiedService-LCR-v7c0ext"
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
				"MBMS_PTM_RBReleaseCause_LCR_r7"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PTM-RBReleaseCause-LCR-r7"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"normalRelease",
					0
				    ),
				    new MemberListElement (
					"outOfMBMSServiceCoverageInRAN",
					1
				    ),
				    new MemberListElement (
					"networkAbnormalRelease",
					2
				    ),
				    new MemberListElement (
					"spare5",
					3
				    ),
				    new MemberListElement (
					"spare4",
					4
				    ),
				    new MemberListElement (
					"spare3",
					5
				    ),
				    new MemberListElement (
					"spare2",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    MBMS_PTM_RBReleaseCause_LCR_r7.normalRelease
			)
		    ),
		    "rbReleaseCause",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_ModifiedService_LCR_v7c0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_ModifiedService_LCR_v7c0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_ModifiedService_LCR_v7c0ext
