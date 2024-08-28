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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs(rrc.informationelements.FailureCauseWithProtErr failureCauseWithProtErr)
    {
	setFailureCauseWithProtErr(failureCauseWithProtErr);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.FailureCauseWithProtErr();
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
		return new rrc.informationelements.FailureCauseWithProtErr();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "failureCauseWithProtErr"
    public rrc.informationelements.FailureCauseWithProtErr getFailureCauseWithProtErr()
    {
	return (rrc.informationelements.FailureCauseWithProtErr)mComponents[0];
    }
    
    public void setFailureCauseWithProtErr(rrc.informationelements.FailureCauseWithProtErr failureCauseWithProtErr)
    {
	mComponents[0] = failureCauseWithProtErr;
    }
    
    public boolean hasFailureCauseWithProtErr()
    {
	return componentIsPresent(0);
    }
    
    public void deleteFailureCauseWithProtErr()
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
	    "rrc.internode_definitions",
	    "InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "InterRATHandoverInfoWithInterRATCapabilities-v390ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"FailureCauseWithProtErr"
			    ),
			    new QName (
				"InformationElements",
				"FailureCauseWithProtErr"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FailureCauseWithProtErr"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7),
				    new TagDecoderElement((short)0x8008, 8),
				    new TagDecoderElement((short)0x8009, 9),
				    new TagDecoderElement((short)0x800a, 10),
				    new TagDecoderElement((short)0x800b, 11),
				    new TagDecoderElement((short)0x800c, 12),
				    new TagDecoderElement((short)0x800d, 13),
				    new TagDecoderElement((short)0x800e, 14),
				    new TagDecoderElement((short)0x800f, 15)
				}
			    )
			)
		    ),
		    "failureCauseWithProtErr",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs
