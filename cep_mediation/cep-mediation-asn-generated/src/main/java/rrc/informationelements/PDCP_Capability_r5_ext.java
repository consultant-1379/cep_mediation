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
 * Define the ASN1 Type PDCP_Capability_r5_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDCP_Capability_r5_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDCP_Capability_r5_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDCP_Capability_r5_ext(BOOLEAN supportForRfc3095ContextRelocation, 
		    MaxHcContextSpace_r5_ext maxHcContextSpace)
    {
	setSupportForRfc3095ContextRelocation(supportForRfc3095ContextRelocation);
	setMaxHcContextSpace(maxHcContextSpace);
    }
    
    /**
     * Construct with components.
     */
    public PDCP_Capability_r5_ext(boolean supportForRfc3095ContextRelocation, 
		    MaxHcContextSpace_r5_ext maxHcContextSpace)
    {
	this(new BOOLEAN(supportForRfc3095ContextRelocation), 
	     maxHcContextSpace);
    }
    
    /**
     * Construct with required components.
     */
    public PDCP_Capability_r5_ext(boolean supportForRfc3095ContextRelocation)
    {
	setSupportForRfc3095ContextRelocation(supportForRfc3095ContextRelocation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = MaxHcContextSpace_r5_ext.by16384;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BOOLEAN();
	    case 1:
		return MaxHcContextSpace_r5_ext.by16384;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportForRfc3095ContextRelocation"
    public boolean getSupportForRfc3095ContextRelocation()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setSupportForRfc3095ContextRelocation(boolean supportForRfc3095ContextRelocation)
    {
	setSupportForRfc3095ContextRelocation(new BOOLEAN(supportForRfc3095ContextRelocation));
    }
    
    public void setSupportForRfc3095ContextRelocation(BOOLEAN supportForRfc3095ContextRelocation)
    {
	mComponents[0] = supportForRfc3095ContextRelocation;
    }
    
    
    // Methods for field "maxHcContextSpace"
    public MaxHcContextSpace_r5_ext getMaxHcContextSpace()
    {
	return (MaxHcContextSpace_r5_ext)mComponents[1];
    }
    
    public void setMaxHcContextSpace(MaxHcContextSpace_r5_ext maxHcContextSpace)
    {
	mComponents[1] = maxHcContextSpace;
    }
    
    public boolean hasMaxHcContextSpace()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMaxHcContextSpace()
    {
	setComponentAbsent(1);
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
	    "PDCP_Capability_r5_ext"
	),
	new QName (
	    "InformationElements",
	    "PDCP-Capability-r5-ext"
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
		    "supportForRfc3095ContextRelocation",
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
				"MaxHcContextSpace_r5_ext"
			    ),
			    new QName (
				"InformationElements",
				"MaxHcContextSpace-r5-ext"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"by16384",
					0
				    ),
				    new MemberListElement (
					"by32768",
					1
				    ),
				    new MemberListElement (
					"by65536",
					2
				    ),
				    new MemberListElement (
					"by131072",
					3
				    )
				}
			    ),
			    0,
			    MaxHcContextSpace_r5_ext.by16384
			)
		    ),
		    "maxHcContextSpace",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PDCP_Capability_r5_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDCP_Capability_r5_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDCP_Capability_r5_ext
