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
 * Define the ASN1 Type ExtraDopplerInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ExtraDopplerInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public ExtraDopplerInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ExtraDopplerInfo(INTEGER doppler1stOrder, 
		    DopplerUncertainty dopplerUncertainty)
    {
	setDoppler1stOrder(doppler1stOrder);
	setDopplerUncertainty(dopplerUncertainty);
    }
    
    /**
     * Construct with components.
     */
    public ExtraDopplerInfo(long doppler1stOrder, 
		    DopplerUncertainty dopplerUncertainty)
    {
	this(new INTEGER(doppler1stOrder), dopplerUncertainty);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = DopplerUncertainty.hz12_5;
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
		return DopplerUncertainty.hz12_5;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "doppler1stOrder"
    public long getDoppler1stOrder()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDoppler1stOrder(long doppler1stOrder)
    {
	setDoppler1stOrder(new INTEGER(doppler1stOrder));
    }
    
    public void setDoppler1stOrder(INTEGER doppler1stOrder)
    {
	mComponents[0] = doppler1stOrder;
    }
    
    
    // Methods for field "dopplerUncertainty"
    public DopplerUncertainty getDopplerUncertainty()
    {
	return (DopplerUncertainty)mComponents[1];
    }
    
    public void setDopplerUncertainty(DopplerUncertainty dopplerUncertainty)
    {
	mComponents[1] = dopplerUncertainty;
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
	    "ExtraDopplerInfo"
	),
	new QName (
	    "InformationElements",
	    "ExtraDopplerInfo"
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
				    new com.oss.asn1.INTEGER(-42), 
				    new com.oss.asn1.INTEGER(21),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-42),
				new java.lang.Long(21)
			    ),
			    null
			)
		    ),
		    "doppler1stOrder",
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
				"DopplerUncertainty"
			    ),
			    new QName (
				"InformationElements",
				"DopplerUncertainty"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"hz12-5",
					0
				    ),
				    new MemberListElement (
					"hz25",
					1
				    ),
				    new MemberListElement (
					"hz50",
					2
				    ),
				    new MemberListElement (
					"hz100",
					3
				    ),
				    new MemberListElement (
					"hz200",
					4
				    ),
				    new MemberListElement (
					"spare3",
					5
				    ),
				    new MemberListElement (
					"spare2",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    DopplerUncertainty.hz12_5
			)
		    ),
		    "dopplerUncertainty",
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
     * Get the type descriptor (TypeInfo) of 'this' ExtraDopplerInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ExtraDopplerInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ExtraDopplerInfo
