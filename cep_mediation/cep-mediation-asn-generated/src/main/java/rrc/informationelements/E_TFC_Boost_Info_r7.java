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
 * Define the ASN1 Type E_TFC_Boost_Info_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_TFC_Boost_Info_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_TFC_Boost_Info_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_TFC_Boost_Info_r7(INTEGER e_TFCI_Boost, INTEGER delta_T2TP)
    {
	setE_TFCI_Boost(e_TFCI_Boost);
	setDelta_T2TP(delta_T2TP);
    }
    
    /**
     * Construct with components.
     */
    public E_TFC_Boost_Info_r7(long e_TFCI_Boost, long delta_T2TP)
    {
	this(new INTEGER(e_TFCI_Boost), new INTEGER(delta_T2TP));
    }
    
    /**
     * Construct with required components.
     */
    public E_TFC_Boost_Info_r7(long e_TFCI_Boost)
    {
	setE_TFCI_Boost(e_TFCI_Boost);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_TFCI_Boost"
    public long getE_TFCI_Boost()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setE_TFCI_Boost(long e_TFCI_Boost)
    {
	setE_TFCI_Boost(new INTEGER(e_TFCI_Boost));
    }
    
    public void setE_TFCI_Boost(INTEGER e_TFCI_Boost)
    {
	mComponents[0] = e_TFCI_Boost;
    }
    
    
    // Methods for field "delta_T2TP"
    public long getDelta_T2TP()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setDelta_T2TP(long delta_T2TP)
    {
	setDelta_T2TP(new INTEGER(delta_T2TP));
    }
    
    public void setDelta_T2TP(INTEGER delta_T2TP)
    {
	mComponents[1] = delta_T2TP;
    }
    
    public boolean hasDelta_T2TP()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDelta_T2TP()
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
	    "E_TFC_Boost_Info_r7"
	),
	new QName (
	    "InformationElements",
	    "E-TFC-Boost-Info-r7"
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "e-TFCI-Boost",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "delta-T2TP",
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
     * Get the type descriptor (TypeInfo) of 'this' E_TFC_Boost_Info_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_TFC_Boost_Info_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_TFC_Boost_Info_r7
