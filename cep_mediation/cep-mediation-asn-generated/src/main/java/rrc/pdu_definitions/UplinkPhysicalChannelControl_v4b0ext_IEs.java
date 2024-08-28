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
 * Define the ASN1 Type UplinkPhysicalChannelControl_v4b0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UplinkPhysicalChannelControl_v4b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UplinkPhysicalChannelControl_v4b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UplinkPhysicalChannelControl_v4b0ext_IEs(rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4 openLoopPowerControl_IPDL_TDD)
    {
	setOpenLoopPowerControl_IPDL_TDD(openLoopPowerControl_IPDL_TDD);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4();
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
		return new rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "openLoopPowerControl_IPDL_TDD"
    public rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4 getOpenLoopPowerControl_IPDL_TDD()
    {
	return (rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4)mComponents[0];
    }
    
    public void setOpenLoopPowerControl_IPDL_TDD(rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4 openLoopPowerControl_IPDL_TDD)
    {
	mComponents[0] = openLoopPowerControl_IPDL_TDD;
    }
    
    public boolean hasOpenLoopPowerControl_IPDL_TDD()
    {
	return componentIsPresent(0);
    }
    
    public void deleteOpenLoopPowerControl_IPDL_TDD()
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
	    "UplinkPhysicalChannelControl_v4b0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UplinkPhysicalChannelControl-v4b0ext-IEs"
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
				"OpenLoopPowerControl_IPDL_TDD_r4"
			    ),
			    new QName (
				"InformationElements",
				"OpenLoopPowerControl-IPDL-TDD-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "OpenLoopPowerControl_IPDL_TDD_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "OpenLoopPowerControl_IPDL_TDD_r4"
				)
			    ),
			    0
			)
		    ),
		    "openLoopPowerControl-IPDL-TDD",
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
     * Get the type descriptor (TypeInfo) of 'this' UplinkPhysicalChannelControl_v4b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UplinkPhysicalChannelControl_v4b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UplinkPhysicalChannelControl_v4b0ext_IEs
