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
 * Define the ASN1 Type EphemerisParameter from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EphemerisParameter extends Sequence {
    
    /**
     * The default constructor.
     */
    public EphemerisParameter()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EphemerisParameter(BitString codeOnL2, BitString uraIndex, 
		    BitString satHealth, BitString iodc, BitString l2Pflag, 
		    SubFrame1Reserved sf1Revd, BitString t_GD, BitString t_oc, 
		    BitString af2, BitString af1, BitString af0, 
		    BitString c_rs, BitString delta_n, BitString m0, 
		    BitString c_uc, BitString e, BitString c_us, 
		    BitString a_Sqrt, BitString t_oe, BitString fitInterval, 
		    BitString aodo, BitString c_ic, BitString omega0, 
		    BitString c_is, BitString i0, BitString c_rc, 
		    BitString omega, BitString omegaDot, BitString iDot)
    {
	setCodeOnL2(codeOnL2);
	setUraIndex(uraIndex);
	setSatHealth(satHealth);
	setIodc(iodc);
	setL2Pflag(l2Pflag);
	setSf1Revd(sf1Revd);
	setT_GD(t_GD);
	setT_oc(t_oc);
	setAf2(af2);
	setAf1(af1);
	setAf0(af0);
	setC_rs(c_rs);
	setDelta_n(delta_n);
	setM0(m0);
	setC_uc(c_uc);
	setE(e);
	setC_us(c_us);
	setA_Sqrt(a_Sqrt);
	setT_oe(t_oe);
	setFitInterval(fitInterval);
	setAodo(aodo);
	setC_ic(c_ic);
	setOmega0(omega0);
	setC_is(c_is);
	setI0(i0);
	setC_rc(c_rc);
	setOmega(omega);
	setOmegaDot(omegaDot);
	setIDot(iDot);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new BitString();
	mComponents[2] = new BitString();
	mComponents[3] = new BitString();
	mComponents[4] = new BitString();
	mComponents[5] = new SubFrame1Reserved();
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
	mComponents[16] = new BitString();
	mComponents[17] = new BitString();
	mComponents[18] = new BitString();
	mComponents[19] = new BitString();
	mComponents[20] = new BitString();
	mComponents[21] = new BitString();
	mComponents[22] = new BitString();
	mComponents[23] = new BitString();
	mComponents[24] = new BitString();
	mComponents[25] = new BitString();
	mComponents[26] = new BitString();
	mComponents[27] = new BitString();
	mComponents[28] = new BitString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[29];
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
		return new SubFrame1Reserved();
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
	    case 16:
		return new BitString();
	    case 17:
		return new BitString();
	    case 18:
		return new BitString();
	    case 19:
		return new BitString();
	    case 20:
		return new BitString();
	    case 21:
		return new BitString();
	    case 22:
		return new BitString();
	    case 23:
		return new BitString();
	    case 24:
		return new BitString();
	    case 25:
		return new BitString();
	    case 26:
		return new BitString();
	    case 27:
		return new BitString();
	    case 28:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "codeOnL2"
    public BitString getCodeOnL2()
    {
	return (BitString)mComponents[0];
    }
    
    public void setCodeOnL2(BitString codeOnL2)
    {
	mComponents[0] = codeOnL2;
    }
    
    
    // Methods for field "uraIndex"
    public BitString getUraIndex()
    {
	return (BitString)mComponents[1];
    }
    
    public void setUraIndex(BitString uraIndex)
    {
	mComponents[1] = uraIndex;
    }
    
    
    // Methods for field "satHealth"
    public BitString getSatHealth()
    {
	return (BitString)mComponents[2];
    }
    
    public void setSatHealth(BitString satHealth)
    {
	mComponents[2] = satHealth;
    }
    
    
    // Methods for field "iodc"
    public BitString getIodc()
    {
	return (BitString)mComponents[3];
    }
    
    public void setIodc(BitString iodc)
    {
	mComponents[3] = iodc;
    }
    
    
    // Methods for field "l2Pflag"
    public BitString getL2Pflag()
    {
	return (BitString)mComponents[4];
    }
    
    public void setL2Pflag(BitString l2Pflag)
    {
	mComponents[4] = l2Pflag;
    }
    
    
    // Methods for field "sf1Revd"
    public SubFrame1Reserved getSf1Revd()
    {
	return (SubFrame1Reserved)mComponents[5];
    }
    
    public void setSf1Revd(SubFrame1Reserved sf1Revd)
    {
	mComponents[5] = sf1Revd;
    }
    
    
    // Methods for field "t_GD"
    public BitString getT_GD()
    {
	return (BitString)mComponents[6];
    }
    
    public void setT_GD(BitString t_GD)
    {
	mComponents[6] = t_GD;
    }
    
    
    // Methods for field "t_oc"
    public BitString getT_oc()
    {
	return (BitString)mComponents[7];
    }
    
    public void setT_oc(BitString t_oc)
    {
	mComponents[7] = t_oc;
    }
    
    
    // Methods for field "af2"
    public BitString getAf2()
    {
	return (BitString)mComponents[8];
    }
    
    public void setAf2(BitString af2)
    {
	mComponents[8] = af2;
    }
    
    
    // Methods for field "af1"
    public BitString getAf1()
    {
	return (BitString)mComponents[9];
    }
    
    public void setAf1(BitString af1)
    {
	mComponents[9] = af1;
    }
    
    
    // Methods for field "af0"
    public BitString getAf0()
    {
	return (BitString)mComponents[10];
    }
    
    public void setAf0(BitString af0)
    {
	mComponents[10] = af0;
    }
    
    
    // Methods for field "c_rs"
    public BitString getC_rs()
    {
	return (BitString)mComponents[11];
    }
    
    public void setC_rs(BitString c_rs)
    {
	mComponents[11] = c_rs;
    }
    
    
    // Methods for field "delta_n"
    public BitString getDelta_n()
    {
	return (BitString)mComponents[12];
    }
    
    public void setDelta_n(BitString delta_n)
    {
	mComponents[12] = delta_n;
    }
    
    
    // Methods for field "m0"
    public BitString getM0()
    {
	return (BitString)mComponents[13];
    }
    
    public void setM0(BitString m0)
    {
	mComponents[13] = m0;
    }
    
    
    // Methods for field "c_uc"
    public BitString getC_uc()
    {
	return (BitString)mComponents[14];
    }
    
    public void setC_uc(BitString c_uc)
    {
	mComponents[14] = c_uc;
    }
    
    
    // Methods for field "e"
    public BitString getE()
    {
	return (BitString)mComponents[15];
    }
    
    public void setE(BitString e)
    {
	mComponents[15] = e;
    }
    
    
    // Methods for field "c_us"
    public BitString getC_us()
    {
	return (BitString)mComponents[16];
    }
    
    public void setC_us(BitString c_us)
    {
	mComponents[16] = c_us;
    }
    
    
    // Methods for field "a_Sqrt"
    public BitString getA_Sqrt()
    {
	return (BitString)mComponents[17];
    }
    
    public void setA_Sqrt(BitString a_Sqrt)
    {
	mComponents[17] = a_Sqrt;
    }
    
    
    // Methods for field "t_oe"
    public BitString getT_oe()
    {
	return (BitString)mComponents[18];
    }
    
    public void setT_oe(BitString t_oe)
    {
	mComponents[18] = t_oe;
    }
    
    
    // Methods for field "fitInterval"
    public BitString getFitInterval()
    {
	return (BitString)mComponents[19];
    }
    
    public void setFitInterval(BitString fitInterval)
    {
	mComponents[19] = fitInterval;
    }
    
    
    // Methods for field "aodo"
    public BitString getAodo()
    {
	return (BitString)mComponents[20];
    }
    
    public void setAodo(BitString aodo)
    {
	mComponents[20] = aodo;
    }
    
    
    // Methods for field "c_ic"
    public BitString getC_ic()
    {
	return (BitString)mComponents[21];
    }
    
    public void setC_ic(BitString c_ic)
    {
	mComponents[21] = c_ic;
    }
    
    
    // Methods for field "omega0"
    public BitString getOmega0()
    {
	return (BitString)mComponents[22];
    }
    
    public void setOmega0(BitString omega0)
    {
	mComponents[22] = omega0;
    }
    
    
    // Methods for field "c_is"
    public BitString getC_is()
    {
	return (BitString)mComponents[23];
    }
    
    public void setC_is(BitString c_is)
    {
	mComponents[23] = c_is;
    }
    
    
    // Methods for field "i0"
    public BitString getI0()
    {
	return (BitString)mComponents[24];
    }
    
    public void setI0(BitString i0)
    {
	mComponents[24] = i0;
    }
    
    
    // Methods for field "c_rc"
    public BitString getC_rc()
    {
	return (BitString)mComponents[25];
    }
    
    public void setC_rc(BitString c_rc)
    {
	mComponents[25] = c_rc;
    }
    
    
    // Methods for field "omega"
    public BitString getOmega()
    {
	return (BitString)mComponents[26];
    }
    
    public void setOmega(BitString omega)
    {
	mComponents[26] = omega;
    }
    
    
    // Methods for field "omegaDot"
    public BitString getOmegaDot()
    {
	return (BitString)mComponents[27];
    }
    
    public void setOmegaDot(BitString omegaDot)
    {
	mComponents[27] = omegaDot;
    }
    
    
    // Methods for field "iDot"
    public BitString getIDot()
    {
	return (BitString)mComponents[28];
    }
    
    public void setIDot(BitString iDot)
    {
	mComponents[28] = iDot;
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
	    "EphemerisParameter"
	),
	new QName (
	    "InformationElements",
	    "EphemerisParameter"
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
				    new com.oss.asn1.INTEGER(2)
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(2)
			    ),
			    null
			)
		    ),
		    "codeOnL2",
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
		    "uraIndex",
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
				    new com.oss.asn1.INTEGER(6)
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "satHealth",
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
				    new com.oss.asn1.INTEGER(10)
				)
			    ),
			    new Bounds (
				new java.lang.Long(10),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "iodc",
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
				    new com.oss.asn1.INTEGER(1)
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "l2Pflag",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SubFrame1Reserved"
			    ),
			    new QName (
				"InformationElements",
				"SubFrame1Reserved"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SubFrame1Reserved"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SubFrame1Reserved"
				)
			    ),
			    0
			)
		    ),
		    "sf1Revd",
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
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "t-GD",
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
		    "t-oc",
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
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "af2",
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
		    "af1",
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
				    new com.oss.asn1.INTEGER(22)
				)
			    ),
			    new Bounds (
				new java.lang.Long(22),
				new java.lang.Long(22)
			    ),
			    null
			)
		    ),
		    "af0",
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
		    "c-rs",
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
		    "delta-n",
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
		    "m0",
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
		    "c-uc",
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
		    "e",
		    15,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
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
		    "c-us",
		    16,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
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
		    "a-Sqrt",
		    17,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
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
		    "t-oe",
		    18,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
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
				    new com.oss.asn1.INTEGER(1)
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "fitInterval",
		    19,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
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
				    new com.oss.asn1.INTEGER(5)
				)
			    ),
			    new Bounds (
				new java.lang.Long(5),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "aodo",
		    20,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
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
		    "c-ic",
		    21,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
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
		    "omega0",
		    22,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
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
		    "c-is",
		    23,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
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
		    "i0",
		    24,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
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
		    "c-rc",
		    25,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x801a
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
		    "omega",
		    26,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x801b
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
		    "omegaDot",
		    27,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x801c
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
		    "iDot",
		    28,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 22)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8019, 25)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801a, 26)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801b, 27)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801c, 28)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EphemerisParameter object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EphemerisParameter object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EphemerisParameter
