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
 * Define the ASN1 Type PrimaryCPICH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PrimaryCPICH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public PrimaryCPICH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PrimaryCPICH_Info(PrimaryScramblingCode primaryScramblingCode)
    {
	setPrimaryScramblingCode(primaryScramblingCode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrimaryScramblingCode();
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
		return new PrimaryScramblingCode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryScramblingCode"
    public PrimaryScramblingCode getPrimaryScramblingCode()
    {
	return (PrimaryScramblingCode)mComponents[0];
    }
    
    public void setPrimaryScramblingCode(PrimaryScramblingCode primaryScramblingCode)
    {
	mComponents[0] = primaryScramblingCode;
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
	    "PrimaryCPICH_Info"
	),
	new QName (
	    "InformationElements",
	    "PrimaryCPICH-Info"
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
				"PrimaryScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PrimaryScramblingCode(0), 
				    new PrimaryScramblingCode(511),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    ),
			    null
			)
		    ),
		    "primaryScramblingCode",
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
     * Get the type descriptor (TypeInfo) of 'this' PrimaryCPICH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PrimaryCPICH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PrimaryCPICH_Info
