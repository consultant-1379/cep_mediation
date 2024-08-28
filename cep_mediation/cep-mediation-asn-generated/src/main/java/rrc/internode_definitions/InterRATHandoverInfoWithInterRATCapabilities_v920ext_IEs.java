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
 * Define the ASN1 Type InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs(INTEGER ue_Inactivity_Period)
    {
	setUe_Inactivity_Period(ue_Inactivity_Period);
    }
    
    /**
     * Construct with components.
     */
    public InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs(long ue_Inactivity_Period)
    {
	this(new INTEGER(ue_Inactivity_Period));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
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
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_Inactivity_Period"
    public long getUe_Inactivity_Period()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setUe_Inactivity_Period(long ue_Inactivity_Period)
    {
	setUe_Inactivity_Period(new INTEGER(ue_Inactivity_Period));
    }
    
    public void setUe_Inactivity_Period(INTEGER ue_Inactivity_Period)
    {
	mComponents[0] = ue_Inactivity_Period;
    }
    
    public boolean hasUe_Inactivity_Period()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_Inactivity_Period()
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
	    "InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "InterRATHandoverInfoWithInterRATCapabilities-v920ext-IEs"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(120),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(120)
			    ),
			    null
			)
		    ),
		    "ue-Inactivity-Period",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs
