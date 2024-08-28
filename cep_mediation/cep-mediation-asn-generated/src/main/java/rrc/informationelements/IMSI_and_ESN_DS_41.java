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
 * Define the ASN1 Type IMSI_and_ESN_DS_41 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IMSI_and_ESN_DS_41 extends Sequence {
    
    /**
     * The default constructor.
     */
    public IMSI_and_ESN_DS_41()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IMSI_and_ESN_DS_41(IMSI_DS_41 imsi_DS_41, ESN_DS_41 esn_DS_41)
    {
	setImsi_DS_41(imsi_DS_41);
	setEsn_DS_41(esn_DS_41);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IMSI_DS_41();
	mComponents[1] = new ESN_DS_41();
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
		return new IMSI_DS_41();
	    case 1:
		return new ESN_DS_41();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "imsi_DS_41"
    public IMSI_DS_41 getImsi_DS_41()
    {
	return (IMSI_DS_41)mComponents[0];
    }
    
    public void setImsi_DS_41(IMSI_DS_41 imsi_DS_41)
    {
	mComponents[0] = imsi_DS_41;
    }
    
    
    // Methods for field "esn_DS_41"
    public ESN_DS_41 getEsn_DS_41()
    {
	return (ESN_DS_41)mComponents[1];
    }
    
    public void setEsn_DS_41(ESN_DS_41 esn_DS_41)
    {
	mComponents[1] = esn_DS_41;
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
	    "IMSI_and_ESN_DS_41"
	),
	new QName (
	    "InformationElements",
	    "IMSI-and-ESN-DS-41"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IMSI_DS_41"
			    ),
			    new QName (
				"InformationElements",
				"IMSI-DS-41"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(5), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(5),
				new java.lang.Long(7)
			    )
			)
		    ),
		    "imsi-DS-41",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ESN_DS_41"
			    ),
			    new QName (
				"InformationElements",
				"ESN-DS-41"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(32)
				)
			    ),
			    new Bounds (
				new java.lang.Long(32),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "esn-DS-41",
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
     * Get the type descriptor (TypeInfo) of 'this' IMSI_and_ESN_DS_41 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IMSI_and_ESN_DS_41 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IMSI_and_ESN_DS_41
