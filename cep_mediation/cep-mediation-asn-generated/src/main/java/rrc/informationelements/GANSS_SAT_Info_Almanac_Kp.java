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
 * Define the ASN1 Type GANSS_SAT_Info_Almanac_Kp from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSS_SAT_Info_Almanac_Kp extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSS_SAT_Info_Almanac_Kp()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSS_SAT_Info_Almanac_Kp(INTEGER svId, BitString ganss_alm_e, 
		    BitString ganss_delta_I_alm, BitString ganss_omegadot_alm, 
		    BitString ganss_svhealth_alm, 
		    BitString ganss_delta_a_sqrt_alm, 
		    BitString ganss_omegazero_alm, BitString ganss_m_zero_alm, 
		    BitString ganss_omega_alm, BitString ganss_af_zero_alm, 
		    BitString ganss_af_one_alm)
    {
	setSvId(svId);
	setGanss_alm_e(ganss_alm_e);
	setGanss_delta_I_alm(ganss_delta_I_alm);
	setGanss_omegadot_alm(ganss_omegadot_alm);
	setGanss_svhealth_alm(ganss_svhealth_alm);
	setGanss_delta_a_sqrt_alm(ganss_delta_a_sqrt_alm);
	setGanss_omegazero_alm(ganss_omegazero_alm);
	setGanss_m_zero_alm(ganss_m_zero_alm);
	setGanss_omega_alm(ganss_omega_alm);
	setGanss_af_zero_alm(ganss_af_zero_alm);
	setGanss_af_one_alm(ganss_af_one_alm);
    }
    
    /**
     * Construct with components.
     */
    public GANSS_SAT_Info_Almanac_Kp(long svId, BitString ganss_alm_e, 
		    BitString ganss_delta_I_alm, BitString ganss_omegadot_alm, 
		    BitString ganss_svhealth_alm, 
		    BitString ganss_delta_a_sqrt_alm, 
		    BitString ganss_omegazero_alm, BitString ganss_m_zero_alm, 
		    BitString ganss_omega_alm, BitString ganss_af_zero_alm, 
		    BitString ganss_af_one_alm)
    {
	this(new INTEGER(svId), ganss_alm_e, ganss_delta_I_alm, 
	     ganss_omegadot_alm, ganss_svhealth_alm, 
	     ganss_delta_a_sqrt_alm, ganss_omegazero_alm, ganss_m_zero_alm, 
	     ganss_omega_alm, ganss_af_zero_alm, ganss_af_one_alm);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new BitString();
	mComponents[2] = new BitString();
	mComponents[3] = new BitString();
	mComponents[4] = new BitString();
	mComponents[5] = new BitString();
	mComponents[6] = new BitString();
	mComponents[7] = new BitString();
	mComponents[8] = new BitString();
	mComponents[9] = new BitString();
	mComponents[10] = new BitString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[11];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new BitString();
	    case 2:
		return new BitString();
	    case 3:
		return new BitString();
	    case 4:
		return new BitString();
	    case 5:
		return new BitString();
	    case 6:
		return new BitString();
	    case 7:
		return new BitString();
	    case 8:
		return new BitString();
	    case 9:
		return new BitString();
	    case 10:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "svId"
    public long getSvId()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSvId(long svId)
    {
	setSvId(new INTEGER(svId));
    }
    
    public void setSvId(INTEGER svId)
    {
	mComponents[0] = svId;
    }
    
    
    // Methods for field "ganss_alm_e"
    public BitString getGanss_alm_e()
    {
	return (BitString)mComponents[1];
    }
    
    public void setGanss_alm_e(BitString ganss_alm_e)
    {
	mComponents[1] = ganss_alm_e;
    }
    
    
    // Methods for field "ganss_delta_I_alm"
    public BitString getGanss_delta_I_alm()
    {
	return (BitString)mComponents[2];
    }
    
    public void setGanss_delta_I_alm(BitString ganss_delta_I_alm)
    {
	mComponents[2] = ganss_delta_I_alm;
    }
    
    
    // Methods for field "ganss_omegadot_alm"
    public BitString getGanss_omegadot_alm()
    {
	return (BitString)mComponents[3];
    }
    
    public void setGanss_omegadot_alm(BitString ganss_omegadot_alm)
    {
	mComponents[3] = ganss_omegadot_alm;
    }
    
    
    // Methods for field "ganss_svhealth_alm"
    public BitString getGanss_svhealth_alm()
    {
	return (BitString)mComponents[4];
    }
    
    public void setGanss_svhealth_alm(BitString ganss_svhealth_alm)
    {
	mComponents[4] = ganss_svhealth_alm;
    }
    
    
    // Methods for field "ganss_delta_a_sqrt_alm"
    public BitString getGanss_delta_a_sqrt_alm()
    {
	return (BitString)mComponents[5];
    }
    
    public void setGanss_delta_a_sqrt_alm(BitString ganss_delta_a_sqrt_alm)
    {
	mComponents[5] = ganss_delta_a_sqrt_alm;
    }
    
    
    // Methods for field "ganss_omegazero_alm"
    public BitString getGanss_omegazero_alm()
    {
	return (BitString)mComponents[6];
    }
    
    public void setGanss_omegazero_alm(BitString ganss_omegazero_alm)
    {
	mComponents[6] = ganss_omegazero_alm;
    }
    
    
    // Methods for field "ganss_m_zero_alm"
    public BitString getGanss_m_zero_alm()
    {
	return (BitString)mComponents[7];
    }
    
    public void setGanss_m_zero_alm(BitString ganss_m_zero_alm)
    {
	mComponents[7] = ganss_m_zero_alm;
    }
    
    
    // Methods for field "ganss_omega_alm"
    public BitString getGanss_omega_alm()
    {
	return (BitString)mComponents[8];
    }
    
    public void setGanss_omega_alm(BitString ganss_omega_alm)
    {
	mComponents[8] = ganss_omega_alm;
    }
    
    
    // Methods for field "ganss_af_zero_alm"
    public BitString getGanss_af_zero_alm()
    {
	return (BitString)mComponents[9];
    }
    
    public void setGanss_af_zero_alm(BitString ganss_af_zero_alm)
    {
	mComponents[9] = ganss_af_zero_alm;
    }
    
    
    // Methods for field "ganss_af_one_alm"
    public BitString getGanss_af_one_alm()
    {
	return (BitString)mComponents[10];
    }
    
    public void setGanss_af_one_alm(BitString ganss_af_one_alm)
    {
	mComponents[10] = ganss_af_one_alm;
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
	    "GANSS_SAT_Info_Almanac_Kp"
	),
	new QName (
	    "InformationElements",
	    "GANSS-SAT-Info-Almanac-Kp"
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
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "svId",
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
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(11)
				)
			    ),
			    new Bounds (
				new java.lang.Long(11),
				new java.lang.Long(11)
			    ),
			    null
			)
		    ),
		    "ganss-alm-e",
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
				    new com.oss.asn1.INTEGER(11)
				)
			    ),
			    new Bounds (
				new java.lang.Long(11),
				new java.lang.Long(11)
			    ),
			    null
			)
		    ),
		    "ganss-delta-I-alm",
		    2,
		    2,
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
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(11)
				)
			    ),
			    new Bounds (
				new java.lang.Long(11),
				new java.lang.Long(11)
			    ),
			    null
			)
		    ),
		    "ganss-omegadot-alm",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new com.oss.asn1.INTEGER(4)
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "ganss-svhealth-alm",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
				    new com.oss.asn1.INTEGER(17)
				)
			    ),
			    new Bounds (
				new java.lang.Long(17),
				new java.lang.Long(17)
			    ),
			    null
			)
		    ),
		    "ganss-delta-a-sqrt-alm",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "ganss-omegazero-alm",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "ganss-m-zero-alm",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "ganss-omega-alm",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
				    new com.oss.asn1.INTEGER(14)
				)
			    ),
			    new Bounds (
				new java.lang.Long(14),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "ganss-af-zero-alm",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
				    new com.oss.asn1.INTEGER(11)
				)
			    ),
			    new Bounds (
				new java.lang.Long(11),
				new java.lang.Long(11)
			    ),
			    null
			)
		    ),
		    "ganss-af-one-alm",
		    10,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSS_SAT_Info_Almanac_Kp object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSS_SAT_Info_Almanac_Kp object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSS_SAT_Info_Almanac_Kp
