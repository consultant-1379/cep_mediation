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
 * Define the ASN1 Type KeplerianParameters from ASN1 Module InformationElements.
 * @see Sequence
 */

public class KeplerianParameters extends Sequence {
    
    /**
     * The default constructor.
     */
    public KeplerianParameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public KeplerianParameters(BitString toe_nav, BitString ganss_omega_nav, 
		    BitString delta_n_nav, BitString m_zero_nav, 
		    BitString omegadot_nav, BitString ganss_e_nav, 
		    BitString idot_nav, BitString a_sqrt_nav, 
		    BitString i_zero_nav, BitString omega_zero_nav, 
		    BitString c_rs_nav, BitString c_is_nav, 
		    BitString c_us_nav, BitString c_rc_nav, 
		    BitString c_ic_nav, BitString c_uc_nav)
    {
	setToe_nav(toe_nav);
	setGanss_omega_nav(ganss_omega_nav);
	setDelta_n_nav(delta_n_nav);
	setM_zero_nav(m_zero_nav);
	setOmegadot_nav(omegadot_nav);
	setGanss_e_nav(ganss_e_nav);
	setIdot_nav(idot_nav);
	setA_sqrt_nav(a_sqrt_nav);
	setI_zero_nav(i_zero_nav);
	setOmega_zero_nav(omega_zero_nav);
	setC_rs_nav(c_rs_nav);
	setC_is_nav(c_is_nav);
	setC_us_nav(c_us_nav);
	setC_rc_nav(c_rc_nav);
	setC_ic_nav(c_ic_nav);
	setC_uc_nav(c_uc_nav);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
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
	mComponents[11] = new BitString();
	mComponents[12] = new BitString();
	mComponents[13] = new BitString();
	mComponents[14] = new BitString();
	mComponents[15] = new BitString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[16];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BitString();
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
	    case 11:
		return new BitString();
	    case 12:
		return new BitString();
	    case 13:
		return new BitString();
	    case 14:
		return new BitString();
	    case 15:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "toe_nav"
    public BitString getToe_nav()
    {
	return (BitString)mComponents[0];
    }
    
    public void setToe_nav(BitString toe_nav)
    {
	mComponents[0] = toe_nav;
    }
    
    
    // Methods for field "ganss_omega_nav"
    public BitString getGanss_omega_nav()
    {
	return (BitString)mComponents[1];
    }
    
    public void setGanss_omega_nav(BitString ganss_omega_nav)
    {
	mComponents[1] = ganss_omega_nav;
    }
    
    
    // Methods for field "delta_n_nav"
    public BitString getDelta_n_nav()
    {
	return (BitString)mComponents[2];
    }
    
    public void setDelta_n_nav(BitString delta_n_nav)
    {
	mComponents[2] = delta_n_nav;
    }
    
    
    // Methods for field "m_zero_nav"
    public BitString getM_zero_nav()
    {
	return (BitString)mComponents[3];
    }
    
    public void setM_zero_nav(BitString m_zero_nav)
    {
	mComponents[3] = m_zero_nav;
    }
    
    
    // Methods for field "omegadot_nav"
    public BitString getOmegadot_nav()
    {
	return (BitString)mComponents[4];
    }
    
    public void setOmegadot_nav(BitString omegadot_nav)
    {
	mComponents[4] = omegadot_nav;
    }
    
    
    // Methods for field "ganss_e_nav"
    public BitString getGanss_e_nav()
    {
	return (BitString)mComponents[5];
    }
    
    public void setGanss_e_nav(BitString ganss_e_nav)
    {
	mComponents[5] = ganss_e_nav;
    }
    
    
    // Methods for field "idot_nav"
    public BitString getIdot_nav()
    {
	return (BitString)mComponents[6];
    }
    
    public void setIdot_nav(BitString idot_nav)
    {
	mComponents[6] = idot_nav;
    }
    
    
    // Methods for field "a_sqrt_nav"
    public BitString getA_sqrt_nav()
    {
	return (BitString)mComponents[7];
    }
    
    public void setA_sqrt_nav(BitString a_sqrt_nav)
    {
	mComponents[7] = a_sqrt_nav;
    }
    
    
    // Methods for field "i_zero_nav"
    public BitString getI_zero_nav()
    {
	return (BitString)mComponents[8];
    }
    
    public void setI_zero_nav(BitString i_zero_nav)
    {
	mComponents[8] = i_zero_nav;
    }
    
    
    // Methods for field "omega_zero_nav"
    public BitString getOmega_zero_nav()
    {
	return (BitString)mComponents[9];
    }
    
    public void setOmega_zero_nav(BitString omega_zero_nav)
    {
	mComponents[9] = omega_zero_nav;
    }
    
    
    // Methods for field "c_rs_nav"
    public BitString getC_rs_nav()
    {
	return (BitString)mComponents[10];
    }
    
    public void setC_rs_nav(BitString c_rs_nav)
    {
	mComponents[10] = c_rs_nav;
    }
    
    
    // Methods for field "c_is_nav"
    public BitString getC_is_nav()
    {
	return (BitString)mComponents[11];
    }
    
    public void setC_is_nav(BitString c_is_nav)
    {
	mComponents[11] = c_is_nav;
    }
    
    
    // Methods for field "c_us_nav"
    public BitString getC_us_nav()
    {
	return (BitString)mComponents[12];
    }
    
    public void setC_us_nav(BitString c_us_nav)
    {
	mComponents[12] = c_us_nav;
    }
    
    
    // Methods for field "c_rc_nav"
    public BitString getC_rc_nav()
    {
	return (BitString)mComponents[13];
    }
    
    public void setC_rc_nav(BitString c_rc_nav)
    {
	mComponents[13] = c_rc_nav;
    }
    
    
    // Methods for field "c_ic_nav"
    public BitString getC_ic_nav()
    {
	return (BitString)mComponents[14];
    }
    
    public void setC_ic_nav(BitString c_ic_nav)
    {
	mComponents[14] = c_ic_nav;
    }
    
    
    // Methods for field "c_uc_nav"
    public BitString getC_uc_nav()
    {
	return (BitString)mComponents[15];
    }
    
    public void setC_uc_nav(BitString c_uc_nav)
    {
	mComponents[15] = c_uc_nav;
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
	    "KeplerianParameters"
	),
	new QName (
	    "InformationElements",
	    "KeplerianParameters"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "toe-nav",
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
		    "ganss-omega-nav",
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
		    "delta-n-nav",
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
		    "m-zero-nav",
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
				    new com.oss.asn1.INTEGER(24)
				)
			    ),
			    new Bounds (
				new java.lang.Long(24),
				new java.lang.Long(24)
			    ),
			    null
			)
		    ),
		    "omegadot-nav",
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
		    "ganss-e-nav",
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
		    "idot-nav",
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
		    "a-sqrt-nav",
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
		    "i-zero-nav",
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
		    "omega-zero-nav",
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
		    "c-rs-nav",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    "c-is-nav",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    "c-us-nav",
		    12,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    "c-rc-nav",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
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
		    "c-ic-nav",
		    14,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
		    "c-uc-nav",
		    15,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' KeplerianParameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' KeplerianParameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for KeplerianParameters
