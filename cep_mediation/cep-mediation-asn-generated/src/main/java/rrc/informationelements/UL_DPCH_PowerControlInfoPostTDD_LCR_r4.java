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
 * Define the ASN1 Type UL_DPCH_PowerControlInfoPostTDD_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_DPCH_PowerControlInfoPostTDD_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_DPCH_PowerControlInfoPostTDD_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_DPCH_PowerControlInfoPostTDD_LCR_r4(UL_TargetSIR ul_TargetSIR)
    {
	setUl_TargetSIR(ul_TargetSIR);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_TargetSIR();
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
		return new UL_TargetSIR();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_TargetSIR"
    public UL_TargetSIR getUl_TargetSIR()
    {
	return (UL_TargetSIR)mComponents[0];
    }
    
    public void setUl_TargetSIR(UL_TargetSIR ul_TargetSIR)
    {
	mComponents[0] = ul_TargetSIR;
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
	    "UL_DPCH_PowerControlInfoPostTDD_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "UL-DPCH-PowerControlInfoPostTDD-LCR-r4"
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
				"UL_TargetSIR"
			    ),
			    new QName (
				"InformationElements",
				"UL-TargetSIR"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UL_TargetSIR(0), 
				    new UL_TargetSIR(62),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(62)
			    ),
			    null
			)
		    ),
		    "ul-TargetSIR",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_DPCH_PowerControlInfoPostTDD_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DPCH_PowerControlInfoPostTDD_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DPCH_PowerControlInfoPostTDD_LCR_r4
