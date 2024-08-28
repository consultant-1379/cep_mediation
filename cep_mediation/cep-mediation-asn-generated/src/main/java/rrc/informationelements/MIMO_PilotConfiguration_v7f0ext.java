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
 * Define the ASN1 Type MIMO_PilotConfiguration_v7f0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MIMO_PilotConfiguration_v7f0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MIMO_PilotConfiguration_v7f0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MIMO_PilotConfiguration_v7f0ext(S_CPICH_PowerOffset_MIMO s_cpich_PowerOffset_Mimo)
    {
	setS_cpich_PowerOffset_Mimo(s_cpich_PowerOffset_Mimo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new S_CPICH_PowerOffset_MIMO();
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
		return new S_CPICH_PowerOffset_MIMO();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "s_cpich_PowerOffset_Mimo"
    public S_CPICH_PowerOffset_MIMO getS_cpich_PowerOffset_Mimo()
    {
	return (S_CPICH_PowerOffset_MIMO)mComponents[0];
    }
    
    public void setS_cpich_PowerOffset_Mimo(S_CPICH_PowerOffset_MIMO s_cpich_PowerOffset_Mimo)
    {
	mComponents[0] = s_cpich_PowerOffset_Mimo;
    }
    
    public boolean hasS_cpich_PowerOffset_Mimo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteS_cpich_PowerOffset_Mimo()
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
	    "MIMO_PilotConfiguration_v7f0ext"
	),
	new QName (
	    "InformationElements",
	    "MIMO-PilotConfiguration-v7f0ext"
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
				"S_CPICH_PowerOffset_MIMO"
			    ),
			    new QName (
				"InformationElements",
				"S-CPICH-PowerOffset-MIMO"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new S_CPICH_PowerOffset_MIMO(-6), 
				    new S_CPICH_PowerOffset_MIMO(0),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-6),
				new java.lang.Long(0)
			    ),
			    null
			)
		    ),
		    "s-cpich-PowerOffset-Mimo",
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
     * Get the type descriptor (TypeInfo) of 'this' MIMO_PilotConfiguration_v7f0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MIMO_PilotConfiguration_v7f0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MIMO_PilotConfiguration_v7f0ext
