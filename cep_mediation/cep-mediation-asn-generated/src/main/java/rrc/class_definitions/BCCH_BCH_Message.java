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


package rrc.class_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type BCCH_BCH_Message from ASN1 Module Class_definitions.
 * @see Sequence
 */

public class BCCH_BCH_Message extends Sequence {
    
    /**
     * The default constructor.
     */
    public BCCH_BCH_Message()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BCCH_BCH_Message(rrc.pdu_definitions.SystemInformation_BCH message)
    {
	setMessage(message);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.pdu_definitions.SystemInformation_BCH();
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
		return new rrc.pdu_definitions.SystemInformation_BCH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "message"
    public rrc.pdu_definitions.SystemInformation_BCH getMessage()
    {
	return (rrc.pdu_definitions.SystemInformation_BCH)mComponents[0];
    }
    
    public void setMessage(rrc.pdu_definitions.SystemInformation_BCH message)
    {
	mComponents[0] = message;
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
	    "rrc.class_definitions",
	    "BCCH_BCH_Message"
	),
	new QName (
	    "Class-definitions",
	    "BCCH-BCH-Message"
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
				"rrc.pdu_definitions",
				"SystemInformation_BCH"
			    ),
			    new QName (
				"PDU-definitions",
				"SystemInformation-BCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SystemInformation_BCH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SystemInformation_BCH"
				)
			    ),
			    0
			)
		    ),
		    "message",
		    0,
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' BCCH_BCH_Message object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BCCH_BCH_Message object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for BCCH_BCH_Message
