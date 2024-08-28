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
 * Define the ASN1 Type PDCP_InfoReconfig from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDCP_InfoReconfig extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDCP_InfoReconfig()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDCP_InfoReconfig(PDCP_Info pdcp_Info, INTEGER dummy)
    {
	setPdcp_Info(pdcp_Info);
	setDummy(dummy);
    }
    
    /**
     * Construct with components.
     */
    public PDCP_InfoReconfig(PDCP_Info pdcp_Info, long dummy)
    {
	this(pdcp_Info, new INTEGER(dummy));
    }
    
    public void initComponents()
    {
	mComponents[0] = new PDCP_Info();
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
		return new PDCP_Info();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pdcp_Info"
    public PDCP_Info getPdcp_Info()
    {
	return (PDCP_Info)mComponents[0];
    }
    
    public void setPdcp_Info(PDCP_Info pdcp_Info)
    {
	mComponents[0] = pdcp_Info;
    }
    
    
    // Methods for field "dummy"
    public long getDummy()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setDummy(long dummy)
    {
	setDummy(new INTEGER(dummy));
    }
    
    public void setDummy(INTEGER dummy)
    {
	mComponents[1] = dummy;
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
	    "PDCP_InfoReconfig"
	),
	new QName (
	    "InformationElements",
	    "PDCP-InfoReconfig"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PDCP_Info"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Info"
				)
			    ),
			    0
			)
		    ),
		    "pdcp-Info",
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
				    new com.oss.asn1.INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "dummy",
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
     * Get the type descriptor (TypeInfo) of 'this' PDCP_InfoReconfig object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDCP_InfoReconfig object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDCP_InfoReconfig
