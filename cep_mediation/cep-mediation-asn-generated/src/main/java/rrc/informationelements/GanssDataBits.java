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
 * Define the ASN1 Type GanssDataBits from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GanssDataBits extends Sequence {
    
    /**
     * The default constructor.
     */
    public GanssDataBits()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GanssDataBits(INTEGER ganssTod, 
		    ReqDataBitAssistance dataBitAssistance)
    {
	setGanssTod(ganssTod);
	setDataBitAssistance(dataBitAssistance);
    }
    
    /**
     * Construct with components.
     */
    public GanssDataBits(long ganssTod, 
		    ReqDataBitAssistance dataBitAssistance)
    {
	this(new INTEGER(ganssTod), dataBitAssistance);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new ReqDataBitAssistance();
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
		return new ReqDataBitAssistance();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssTod"
    public long getGanssTod()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanssTod(long ganssTod)
    {
	setGanssTod(new INTEGER(ganssTod));
    }
    
    public void setGanssTod(INTEGER ganssTod)
    {
	mComponents[0] = ganssTod;
    }
    
    
    // Methods for field "dataBitAssistance"
    public ReqDataBitAssistance getDataBitAssistance()
    {
	return (ReqDataBitAssistance)mComponents[1];
    }
    
    public void setDataBitAssistance(ReqDataBitAssistance dataBitAssistance)
    {
	mComponents[1] = dataBitAssistance;
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
	    "GanssDataBits"
	),
	new QName (
	    "InformationElements",
	    "GanssDataBits"
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
				    new com.oss.asn1.INTEGER(86399),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(86399)
			    ),
			    null
			)
		    ),
		    "ganssTod",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReqDataBitAssistance"
			    ),
			    new QName (
				"InformationElements",
				"ReqDataBitAssistance"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReqDataBitAssistance"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ReqDataBitAssistance"
				)
			    ),
			    0
			)
		    ),
		    "dataBitAssistance",
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
     * Get the type descriptor (TypeInfo) of 'this' GanssDataBits object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GanssDataBits object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GanssDataBits
