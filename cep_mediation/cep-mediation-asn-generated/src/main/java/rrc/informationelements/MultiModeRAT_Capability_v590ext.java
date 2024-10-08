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
 * Define the ASN1 Type MultiModeRAT_Capability_v590ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MultiModeRAT_Capability_v590ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MultiModeRAT_Capability_v590ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MultiModeRAT_Capability_v590ext(BOOLEAN supportOfUTRAN_ToGERAN_NACC)
    {
	setSupportOfUTRAN_ToGERAN_NACC(supportOfUTRAN_ToGERAN_NACC);
    }
    
    /**
     * Construct with components.
     */
    public MultiModeRAT_Capability_v590ext(boolean supportOfUTRAN_ToGERAN_NACC)
    {
	this(new BOOLEAN(supportOfUTRAN_ToGERAN_NACC));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
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
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfUTRAN_ToGERAN_NACC"
    public boolean getSupportOfUTRAN_ToGERAN_NACC()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setSupportOfUTRAN_ToGERAN_NACC(boolean supportOfUTRAN_ToGERAN_NACC)
    {
	setSupportOfUTRAN_ToGERAN_NACC(new BOOLEAN(supportOfUTRAN_ToGERAN_NACC));
    }
    
    public void setSupportOfUTRAN_ToGERAN_NACC(BOOLEAN supportOfUTRAN_ToGERAN_NACC)
    {
	mComponents[0] = supportOfUTRAN_ToGERAN_NACC;
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
	    "MultiModeRAT_Capability_v590ext"
	),
	new QName (
	    "InformationElements",
	    "MultiModeRAT-Capability-v590ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "supportOfUTRAN-ToGERAN-NACC",
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
     * Get the type descriptor (TypeInfo) of 'this' MultiModeRAT_Capability_v590ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MultiModeRAT_Capability_v590ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MultiModeRAT_Capability_v590ext
