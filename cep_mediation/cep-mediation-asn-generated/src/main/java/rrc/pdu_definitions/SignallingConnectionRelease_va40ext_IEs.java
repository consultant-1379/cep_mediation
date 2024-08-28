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
 * Define the ASN1 Type SignallingConnectionRelease_va40ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class SignallingConnectionRelease_va40ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SignallingConnectionRelease_va40ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignallingConnectionRelease_va40ext_IEs(rrc.informationelements.ExtendedWaitTime extendedWaitTime)
    {
	setExtendedWaitTime(extendedWaitTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.ExtendedWaitTime();
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
		return new rrc.informationelements.ExtendedWaitTime();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "extendedWaitTime"
    public rrc.informationelements.ExtendedWaitTime getExtendedWaitTime()
    {
	return (rrc.informationelements.ExtendedWaitTime)mComponents[0];
    }
    
    public void setExtendedWaitTime(rrc.informationelements.ExtendedWaitTime extendedWaitTime)
    {
	mComponents[0] = extendedWaitTime;
    }
    
    public boolean hasExtendedWaitTime()
    {
	return componentIsPresent(0);
    }
    
    public void deleteExtendedWaitTime()
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
	    "SignallingConnectionRelease_va40ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "SignallingConnectionRelease-va40ext-IEs"
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
				"ExtendedWaitTime"
			    ),
			    new QName (
				"InformationElements",
				"ExtendedWaitTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.ExtendedWaitTime(1), 
				    new rrc.informationelements.ExtendedWaitTime(1800),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1800)
			    ),
			    null
			)
		    ),
		    "extendedWaitTime",
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
     * Get the type descriptor (TypeInfo) of 'this' SignallingConnectionRelease_va40ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SignallingConnectionRelease_va40ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SignallingConnectionRelease_va40ext_IEs
