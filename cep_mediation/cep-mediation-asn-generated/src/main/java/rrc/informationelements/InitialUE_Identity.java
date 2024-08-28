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
 * Define the ASN1 Type InitialUE_Identity from ASN1 Module InformationElements.
 * @see Choice
 */

public class InitialUE_Identity extends Choice {
    
    /**
     * The default constructor.
     */
    public InitialUE_Identity()
    {
    }
    
    public static final  int  imsi_chosen = 1;
    public static final  int  tmsi_and_LAI_chosen = 2;
    public static final  int  p_TMSI_and_RAI_chosen = 3;
    public static final  int  imei_chosen = 4;
    public static final  int  esn_DS_41_chosen = 5;
    public static final  int  imsi_DS_41_chosen = 6;
    public static final  int  imsi_and_ESN_DS_41_chosen = 7;
    public static final  int  tmsi_DS_41_chosen = 8;
    
    // Methods for field "imsi"
    public static InitialUE_Identity createInitialUE_IdentityWithImsi(IMSI_GSM_MAP imsi)
    {
	InitialUE_Identity __object = new InitialUE_Identity();

	__object.setImsi(imsi);
	return __object;
    }
    
    public boolean hasImsi()
    {
	return getChosenFlag() == imsi_chosen;
    }
    
    public void setImsi(IMSI_GSM_MAP imsi)
    {
	setChosenValue(imsi);
	setChosenFlag(imsi_chosen);
    }
    
    
    // Methods for field "tmsi_and_LAI"
    public static InitialUE_Identity createInitialUE_IdentityWithTmsi_and_LAI(TMSI_and_LAI_GSM_MAP tmsi_and_LAI)
    {
	InitialUE_Identity __object = new InitialUE_Identity();

	__object.setTmsi_and_LAI(tmsi_and_LAI);
	return __object;
    }
    
    public boolean hasTmsi_and_LAI()
    {
	return getChosenFlag() == tmsi_and_LAI_chosen;
    }
    
    public void setTmsi_and_LAI(TMSI_and_LAI_GSM_MAP tmsi_and_LAI)
    {
	setChosenValue(tmsi_and_LAI);
	setChosenFlag(tmsi_and_LAI_chosen);
    }
    
    
    // Methods for field "p_TMSI_and_RAI"
    public static InitialUE_Identity createInitialUE_IdentityWithP_TMSI_and_RAI(P_TMSI_and_RAI_GSM_MAP p_TMSI_and_RAI)
    {
	InitialUE_Identity __object = new InitialUE_Identity();

	__object.setP_TMSI_and_RAI(p_TMSI_and_RAI);
	return __object;
    }
    
    public boolean hasP_TMSI_and_RAI()
    {
	return getChosenFlag() == p_TMSI_and_RAI_chosen;
    }
    
    public void setP_TMSI_and_RAI(P_TMSI_and_RAI_GSM_MAP p_TMSI_and_RAI)
    {
	setChosenValue(p_TMSI_and_RAI);
	setChosenFlag(p_TMSI_and_RAI_chosen);
    }
    
    
    // Methods for field "imei"
    public static InitialUE_Identity createInitialUE_IdentityWithImei(IMEI imei)
    {
	InitialUE_Identity __object = new InitialUE_Identity();

	__object.setImei(imei);
	return __object;
    }
    
    public boolean hasImei()
    {
	return getChosenFlag() == imei_chosen;
    }
    
    public void setImei(IMEI imei)
    {
	setChosenValue(imei);
	setChosenFlag(imei_chosen);
    }
    
    
    // Methods for field "esn_DS_41"
    public static InitialUE_Identity createInitialUE_IdentityWithEsn_DS_41(ESN_DS_41 esn_DS_41)
    {
	InitialUE_Identity __object = new InitialUE_Identity();

	__object.setEsn_DS_41(esn_DS_41);
	return __object;
    }
    
    public boolean hasEsn_DS_41()
    {
	return getChosenFlag() == esn_DS_41_chosen;
    }
    
    public void setEsn_DS_41(ESN_DS_41 esn_DS_41)
    {
	setChosenValue(esn_DS_41);
	setChosenFlag(esn_DS_41_chosen);
    }
    
    
    // Methods for field "imsi_DS_41"
    public static InitialUE_Identity createInitialUE_IdentityWithImsi_DS_41(IMSI_DS_41 imsi_DS_41)
    {
	InitialUE_Identity __object = new InitialUE_Identity();

	__object.setImsi_DS_41(imsi_DS_41);
	return __object;
    }
    
    public boolean hasImsi_DS_41()
    {
	return getChosenFlag() == imsi_DS_41_chosen;
    }
    
    public void setImsi_DS_41(IMSI_DS_41 imsi_DS_41)
    {
	setChosenValue(imsi_DS_41);
	setChosenFlag(imsi_DS_41_chosen);
    }
    
    
    // Methods for field "imsi_and_ESN_DS_41"
    public static InitialUE_Identity createInitialUE_IdentityWithImsi_and_ESN_DS_41(IMSI_and_ESN_DS_41 imsi_and_ESN_DS_41)
    {
	InitialUE_Identity __object = new InitialUE_Identity();

	__object.setImsi_and_ESN_DS_41(imsi_and_ESN_DS_41);
	return __object;
    }
    
    public boolean hasImsi_and_ESN_DS_41()
    {
	return getChosenFlag() == imsi_and_ESN_DS_41_chosen;
    }
    
    public void setImsi_and_ESN_DS_41(IMSI_and_ESN_DS_41 imsi_and_ESN_DS_41)
    {
	setChosenValue(imsi_and_ESN_DS_41);
	setChosenFlag(imsi_and_ESN_DS_41_chosen);
    }
    
    
    // Methods for field "tmsi_DS_41"
    public static InitialUE_Identity createInitialUE_IdentityWithTmsi_DS_41(TMSI_DS_41 tmsi_DS_41)
    {
	InitialUE_Identity __object = new InitialUE_Identity();

	__object.setTmsi_DS_41(tmsi_DS_41);
	return __object;
    }
    
    public boolean hasTmsi_DS_41()
    {
	return getChosenFlag() == tmsi_DS_41_chosen;
    }
    
    public void setTmsi_DS_41(TMSI_DS_41 tmsi_DS_41)
    {
	setChosenValue(tmsi_DS_41);
	setChosenFlag(tmsi_DS_41_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case imsi_chosen:
		return new IMSI_GSM_MAP();
	    case tmsi_and_LAI_chosen:
		return new TMSI_and_LAI_GSM_MAP();
	    case p_TMSI_and_RAI_chosen:
		return new P_TMSI_and_RAI_GSM_MAP();
	    case imei_chosen:
		return new IMEI();
	    case esn_DS_41_chosen:
		return new ESN_DS_41();
	    case imsi_DS_41_chosen:
		return new IMSI_DS_41();
	    case imsi_and_ESN_DS_41_chosen:
		return new IMSI_and_ESN_DS_41();
	    case tmsi_DS_41_chosen:
		return new TMSI_DS_41();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "InitialUE_Identity"
	),
	new QName (
	    "InformationElements",
	    "InitialUE-Identity"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IMSI_GSM_MAP"
			    ),
			    new QName (
				"InformationElements",
				"IMSI-GSM-MAP"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(6), 
					new com.oss.asn1.INTEGER(21),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(21)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "Digit"
				)
			    )
			)
		    ),
		    "imsi",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TMSI_and_LAI_GSM_MAP"
			    ),
			    new QName (
				"InformationElements",
				"TMSI-and-LAI-GSM-MAP"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TMSI_and_LAI_GSM_MAP"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TMSI_and_LAI_GSM_MAP"
				)
			    ),
			    0
			)
		    ),
		    "tmsi-and-LAI",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"P_TMSI_and_RAI_GSM_MAP"
			    ),
			    new QName (
				"InformationElements",
				"P-TMSI-and-RAI-GSM-MAP"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "P_TMSI_and_RAI_GSM_MAP"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "P_TMSI_and_RAI_GSM_MAP"
				)
			    ),
			    0
			)
		    ),
		    "p-TMSI-and-RAI",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IMEI"
			    ),
			    new QName (
				"InformationElements",
				"IMEI"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(15)
				)
			    ),
			    new Bounds (
				new java.lang.Long(15),
				new java.lang.Long(15)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "IMEI_Digit"
				)
			    )
			)
		    ),
		    "imei",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IMSI_and_ESN_DS_41"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IMSI_and_ESN_DS_41"
				)
			    ),
			    0
			)
		    ),
		    "imsi-and-ESN-DS-41",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TMSI_DS_41"
			    ),
			    new QName (
				"InformationElements",
				"TMSI-DS-41"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(2), 
					new com.oss.asn1.INTEGER(17),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(17)
			    )
			)
		    ),
		    "tmsi-DS-41",
		    7,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' InitialUE_Identity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InitialUE_Identity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InitialUE_Identity
