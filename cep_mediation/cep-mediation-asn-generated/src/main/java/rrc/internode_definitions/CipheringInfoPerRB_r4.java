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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CipheringInfoPerRB_r4 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class CipheringInfoPerRB_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CipheringInfoPerRB_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CipheringInfoPerRB_r4(rrc.informationelements.RB_Identity rb_Identity, 
		    BitString dl_HFN, BitString dl_UM_SN, BitString ul_HFN)
    {
	setRb_Identity(rb_Identity);
	setDl_HFN(dl_HFN);
	setDl_UM_SN(dl_UM_SN);
	setUl_HFN(ul_HFN);
    }
    
    /**
     * Construct with required components.
     */
    public CipheringInfoPerRB_r4(rrc.informationelements.RB_Identity rb_Identity, 
		    BitString dl_HFN, BitString ul_HFN)
    {
	setRb_Identity(rb_Identity);
	setDl_HFN(dl_HFN);
	setUl_HFN(ul_HFN);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RB_Identity();
	mComponents[1] = new BitString();
	mComponents[2] = new BitString();
	mComponents[3] = new BitString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RB_Identity();
	    case 1:
		return new BitString();
	    case 2:
		return new BitString();
	    case 3:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rb_Identity"
    public rrc.informationelements.RB_Identity getRb_Identity()
    {
	return (rrc.informationelements.RB_Identity)mComponents[0];
    }
    
    public void setRb_Identity(rrc.informationelements.RB_Identity rb_Identity)
    {
	mComponents[0] = rb_Identity;
    }
    
    
    // Methods for field "dl_HFN"
    public BitString getDl_HFN()
    {
	return (BitString)mComponents[1];
    }
    
    public void setDl_HFN(BitString dl_HFN)
    {
	mComponents[1] = dl_HFN;
    }
    
    
    // Methods for field "dl_UM_SN"
    public BitString getDl_UM_SN()
    {
	return (BitString)mComponents[2];
    }
    
    public void setDl_UM_SN(BitString dl_UM_SN)
    {
	mComponents[2] = dl_UM_SN;
    }
    
    public boolean hasDl_UM_SN()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDl_UM_SN()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ul_HFN"
    public BitString getUl_HFN()
    {
	return (BitString)mComponents[3];
    }
    
    public void setUl_HFN(BitString ul_HFN)
    {
	mComponents[3] = ul_HFN;
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
	    "rrc.internode_definitions",
	    "CipheringInfoPerRB_r4"
	),
	new QName (
	    "Internode-definitions",
	    "CipheringInfoPerRB-r4"
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
				    new rrc.informationelements.RB_Identity(1), 
				    new rrc.informationelements.RB_Identity(32),
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
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(20), 
					new com.oss.asn1.INTEGER(25),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(25)
			    ),
			    null
			)
		    ),
		    "dl-HFN",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(7)
				)
			    ),
			    new Bounds (
				new java.lang.Long(7),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "dl-UM-SN",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(20), 
					new com.oss.asn1.INTEGER(25),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(25)
			    ),
			    null
			)
		    ),
		    "ul-HFN",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CipheringInfoPerRB_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CipheringInfoPerRB_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CipheringInfoPerRB_r4
