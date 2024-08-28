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
 * Define the ASN1 Type RB_WithPDCP_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RB_WithPDCP_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public RB_WithPDCP_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RB_WithPDCP_Info(RB_Identity rb_Identity, 
		    PDCP_SN_Info pdcp_SN_Info)
    {
	setRb_Identity(rb_Identity);
	setPdcp_SN_Info(pdcp_SN_Info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RB_Identity();
	mComponents[1] = new PDCP_SN_Info();
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
		return new RB_Identity();
	    case 1:
		return new PDCP_SN_Info();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rb_Identity"
    public RB_Identity getRb_Identity()
    {
	return (RB_Identity)mComponents[0];
    }
    
    public void setRb_Identity(RB_Identity rb_Identity)
    {
	mComponents[0] = rb_Identity;
    }
    
    
    // Methods for field "pdcp_SN_Info"
    public PDCP_SN_Info getPdcp_SN_Info()
    {
	return (PDCP_SN_Info)mComponents[1];
    }
    
    public void setPdcp_SN_Info(PDCP_SN_Info pdcp_SN_Info)
    {
	mComponents[1] = pdcp_SN_Info;
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
	    "RB_WithPDCP_Info"
	),
	new QName (
	    "InformationElements",
	    "RB-WithPDCP-Info"
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
				"RB_Identity"
			    ),
			    new QName (
				"InformationElements",
				"RB-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RB_Identity(1), 
				    new RB_Identity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "rb-Identity",
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
				"rrc.informationelements",
				"PDCP_SN_Info"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-SN-Info"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PDCP_SN_Info(0), 
				    new PDCP_SN_Info(65535),
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
		    "pdcp-SN-Info",
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
     * Get the type descriptor (TypeInfo) of 'this' RB_WithPDCP_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RB_WithPDCP_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RB_WithPDCP_Info
