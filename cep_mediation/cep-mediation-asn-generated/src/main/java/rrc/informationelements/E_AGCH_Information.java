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
 * Define the ASN1 Type E_AGCH_Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_AGCH_Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_AGCH_Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_AGCH_Information(E_AGCH_ChannelisationCode e_AGCH_ChannelisationCode)
    {
	setE_AGCH_ChannelisationCode(e_AGCH_ChannelisationCode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_AGCH_ChannelisationCode();
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
		return new E_AGCH_ChannelisationCode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_AGCH_ChannelisationCode"
    public E_AGCH_ChannelisationCode getE_AGCH_ChannelisationCode()
    {
	return (E_AGCH_ChannelisationCode)mComponents[0];
    }
    
    public void setE_AGCH_ChannelisationCode(E_AGCH_ChannelisationCode e_AGCH_ChannelisationCode)
    {
	mComponents[0] = e_AGCH_ChannelisationCode;
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
	    "E_AGCH_Information"
	),
	new QName (
	    "InformationElements",
	    "E-AGCH-Information"
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
				"E_AGCH_ChannelisationCode"
			    ),
			    new QName (
				"InformationElements",
				"E-AGCH-ChannelisationCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_AGCH_ChannelisationCode(0), 
				    new E_AGCH_ChannelisationCode(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "e-AGCH-ChannelisationCode",
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
     * Get the type descriptor (TypeInfo) of 'this' E_AGCH_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_AGCH_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_AGCH_Information
