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
 * Define the ASN1 Type HandoverToUTRANCommand_v820ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class HandoverToUTRANCommand_v820ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public HandoverToUTRANCommand_v820ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HandoverToUTRANCommand_v820ext_IEs(rrc.informationelements.RAB_InformationSetupList_v820ext rab_InformationSetupList)
    {
	setRab_InformationSetupList(rab_InformationSetupList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RAB_InformationSetupList_v820ext();
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
		return new rrc.informationelements.RAB_InformationSetupList_v820ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rab_InformationSetupList"
    public rrc.informationelements.RAB_InformationSetupList_v820ext getRab_InformationSetupList()
    {
	return (rrc.informationelements.RAB_InformationSetupList_v820ext)mComponents[0];
    }
    
    public void setRab_InformationSetupList(rrc.informationelements.RAB_InformationSetupList_v820ext rab_InformationSetupList)
    {
	mComponents[0] = rab_InformationSetupList;
    }
    
    public boolean hasRab_InformationSetupList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRab_InformationSetupList()
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
	    "HandoverToUTRANCommand_v820ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverToUTRANCommand-v820ext-IEs"
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
				"RAB_InformationSetupList_v820ext"
			    ),
			    new QName (
				"InformationElements",
				"RAB-InformationSetupList-v820ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_InformationSetup_v820ext"
				)
			    )
			)
		    ),
		    "rab-InformationSetupList",
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
     * Get the type descriptor (TypeInfo) of 'this' HandoverToUTRANCommand_v820ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverToUTRANCommand_v820ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverToUTRANCommand_v820ext_IEs
