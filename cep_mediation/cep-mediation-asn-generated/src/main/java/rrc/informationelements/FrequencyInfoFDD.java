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
 * Define the ASN1 Type FrequencyInfoFDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class FrequencyInfoFDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public FrequencyInfoFDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public FrequencyInfoFDD(UARFCN uarfcn_UL, UARFCN uarfcn_DL)
    {
	setUarfcn_UL(uarfcn_UL);
	setUarfcn_DL(uarfcn_DL);
    }
    
    /**
     * Construct with required components.
     */
    public FrequencyInfoFDD(UARFCN uarfcn_DL)
    {
	setUarfcn_DL(uarfcn_DL);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UARFCN();
	mComponents[1] = new UARFCN();
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
		return new UARFCN();
	    case 1:
		return new UARFCN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "uarfcn_UL"
    public UARFCN getUarfcn_UL()
    {
	return (UARFCN)mComponents[0];
    }
    
    public void setUarfcn_UL(UARFCN uarfcn_UL)
    {
	mComponents[0] = uarfcn_UL;
    }
    
    public boolean hasUarfcn_UL()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUarfcn_UL()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "uarfcn_DL"
    public UARFCN getUarfcn_DL()
    {
	return (UARFCN)mComponents[1];
    }
    
    public void setUarfcn_DL(UARFCN uarfcn_DL)
    {
	mComponents[1] = uarfcn_DL;
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
	    "FrequencyInfoFDD"
	),
	new QName (
	    "InformationElements",
	    "FrequencyInfoFDD"
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
				"UARFCN"
			    ),
			    new QName (
				"InformationElements",
				"UARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UARFCN(0), 
				    new UARFCN(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "uarfcn-UL",
		    0,
		    3,
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
				"rrc.informationelements",
				"UARFCN"
			    ),
			    new QName (
				"InformationElements",
				"UARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UARFCN(0), 
				    new UARFCN(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "uarfcn-DL",
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
     * Get the type descriptor (TypeInfo) of 'this' FrequencyInfoFDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FrequencyInfoFDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FrequencyInfoFDD
