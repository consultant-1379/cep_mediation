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
 * Define the ASN1 Type TFCS_Identity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TFCS_Identity extends Sequence {
    
    /**
     * The default constructor.
     */
    public TFCS_Identity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TFCS_Identity(TFCS_IdentityPlain tfcs_ID, 
		    BOOLEAN sharedChannelIndicator)
    {
	setTfcs_ID(tfcs_ID);
	setSharedChannelIndicator(sharedChannelIndicator);
    }
    
    /**
     * Construct with components.
     */
    public TFCS_Identity(TFCS_IdentityPlain tfcs_ID, 
		    boolean sharedChannelIndicator)
    {
	this(tfcs_ID, new BOOLEAN(sharedChannelIndicator));
    }
    
    /**
     * Construct with required components.
     */
    public TFCS_Identity(boolean sharedChannelIndicator)
    {
	setSharedChannelIndicator(sharedChannelIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TFCS_IdentityPlain();
	mComponents[1] = new BOOLEAN();
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
		return new TFCS_IdentityPlain();
	    case 1:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final TFCS_IdentityPlain tfcs_ID__default = 
	new TFCS_IdentityPlain(1);
    
    // Methods for field "tfcs_ID"
    public TFCS_IdentityPlain getTfcs_ID()
    {
	if (hasTfcs_ID())
	    return (TFCS_IdentityPlain)mComponents[0];
	else
	    return (TFCS_IdentityPlain)tfcs_ID__default.clone();
    }
    
    public void setTfcs_ID(TFCS_IdentityPlain tfcs_ID)
    {
	mComponents[0] = tfcs_ID;
    }
    
    public void setTfcs_IDToDefault()
    {
	setTfcs_ID(tfcs_ID__default);
    }
    
    public boolean hasDefaultTfcs_ID()
    {
	return true;
    }
    
    public boolean hasTfcs_ID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTfcs_ID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "sharedChannelIndicator"
    public boolean getSharedChannelIndicator()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setSharedChannelIndicator(boolean sharedChannelIndicator)
    {
	setSharedChannelIndicator(new BOOLEAN(sharedChannelIndicator));
    }
    
    public void setSharedChannelIndicator(BOOLEAN sharedChannelIndicator)
    {
	mComponents[1] = sharedChannelIndicator;
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
	    "TFCS_Identity"
	),
	new QName (
	    "InformationElements",
	    "TFCS-Identity"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS_IdentityPlain"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-IdentityPlain"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TFCS_IdentityPlain(1), 
				    new TFCS_IdentityPlain(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "tfcs-ID",
		    0,
		    3,
		    tfcs_ID__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "sharedChannelIndicator",
		    1,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' TFCS_Identity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TFCS_Identity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TFCS_Identity
