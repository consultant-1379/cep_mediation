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
 * Define the ASN1 Type CN_PagedUE_Identity from ASN1 Module InformationElements.
 * @see Choice
 */

public class CN_PagedUE_Identity extends Choice {
    
    /**
     * The default constructor.
     */
    public CN_PagedUE_Identity()
    {
    }
    
    public static final  int  imsi_GSM_MAP_chosen = 1;
    public static final  int  tmsi_GSM_MAP_chosen = 2;
    public static final  int  p_TMSI_GSM_MAP_chosen = 3;
    public static final  int  imsi_DS_41_chosen = 4;
    public static final  int  tmsi_DS_41_chosen = 5;
    public static final  int  spare3_chosen = 6;
    public static final  int  spare2_chosen = 7;
    public static final  int  spare1_chosen = 8;
    
    // Methods for field "imsi_GSM_MAP"
    public static CN_PagedUE_Identity createCN_PagedUE_IdentityWithImsi_GSM_MAP(IMSI_GSM_MAP imsi_GSM_MAP)
    {
	CN_PagedUE_Identity __object = new CN_PagedUE_Identity();

	__object.setImsi_GSM_MAP(imsi_GSM_MAP);
	return __object;
    }
    
    public boolean hasImsi_GSM_MAP()
    {
	return getChosenFlag() == imsi_GSM_MAP_chosen;
    }
    
    public void setImsi_GSM_MAP(IMSI_GSM_MAP imsi_GSM_MAP)
    {
	setChosenValue(imsi_GSM_MAP);
	setChosenFlag(imsi_GSM_MAP_chosen);
    }
    
    
    // Methods for field "tmsi_GSM_MAP"
    public static CN_PagedUE_Identity createCN_PagedUE_IdentityWithTmsi_GSM_MAP(TMSI_GSM_MAP tmsi_GSM_MAP)
    {
	CN_PagedUE_Identity __object = new CN_PagedUE_Identity();

	__object.setTmsi_GSM_MAP(tmsi_GSM_MAP);
	return __object;
    }
    
    public boolean hasTmsi_GSM_MAP()
    {
	return getChosenFlag() == tmsi_GSM_MAP_chosen;
    }
    
    public void setTmsi_GSM_MAP(TMSI_GSM_MAP tmsi_GSM_MAP)
    {
	setChosenValue(tmsi_GSM_MAP);
	setChosenFlag(tmsi_GSM_MAP_chosen);
    }
    
    
    // Methods for field "p_TMSI_GSM_MAP"
    public static CN_PagedUE_Identity createCN_PagedUE_IdentityWithP_TMSI_GSM_MAP(P_TMSI_GSM_MAP p_TMSI_GSM_MAP)
    {
	CN_PagedUE_Identity __object = new CN_PagedUE_Identity();

	__object.setP_TMSI_GSM_MAP(p_TMSI_GSM_MAP);
	return __object;
    }
    
    public boolean hasP_TMSI_GSM_MAP()
    {
	return getChosenFlag() == p_TMSI_GSM_MAP_chosen;
    }
    
    public void setP_TMSI_GSM_MAP(P_TMSI_GSM_MAP p_TMSI_GSM_MAP)
    {
	setChosenValue(p_TMSI_GSM_MAP);
	setChosenFlag(p_TMSI_GSM_MAP_chosen);
    }
    
    
    // Methods for field "imsi_DS_41"
    public static CN_PagedUE_Identity createCN_PagedUE_IdentityWithImsi_DS_41(IMSI_DS_41 imsi_DS_41)
    {
	CN_PagedUE_Identity __object = new CN_PagedUE_Identity();

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
    
    
    // Methods for field "tmsi_DS_41"
    public static CN_PagedUE_Identity createCN_PagedUE_IdentityWithTmsi_DS_41(TMSI_DS_41 tmsi_DS_41)
    {
	CN_PagedUE_Identity __object = new CN_PagedUE_Identity();

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
    
    
    // Methods for field "spare3"
    public static CN_PagedUE_Identity createCN_PagedUE_IdentityWithSpare3(Null spare3)
    {
	CN_PagedUE_Identity __object = new CN_PagedUE_Identity();

	__object.setSpare3(spare3);
	return __object;
    }
    
    public boolean hasSpare3()
    {
	return getChosenFlag() == spare3_chosen;
    }
    
    public void setSpare3(Null spare3)
    {
	setChosenValue(spare3);
	setChosenFlag(spare3_chosen);
    }
    
    
    // Methods for field "spare2"
    public static CN_PagedUE_Identity createCN_PagedUE_IdentityWithSpare2(Null spare2)
    {
	CN_PagedUE_Identity __object = new CN_PagedUE_Identity();

	__object.setSpare2(spare2);
	return __object;
    }
    
    public boolean hasSpare2()
    {
	return getChosenFlag() == spare2_chosen;
    }
    
    public void setSpare2(Null spare2)
    {
	setChosenValue(spare2);
	setChosenFlag(spare2_chosen);
    }
    
    
    // Methods for field "spare1"
    public static CN_PagedUE_Identity createCN_PagedUE_IdentityWithSpare1(Null spare1)
    {
	CN_PagedUE_Identity __object = new CN_PagedUE_Identity();

	__object.setSpare1(spare1);
	return __object;
    }
    
    public boolean hasSpare1()
    {
	return getChosenFlag() == spare1_chosen;
    }
    
    public void setSpare1(Null spare1)
    {
	setChosenValue(spare1);
	setChosenFlag(spare1_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case imsi_GSM_MAP_chosen:
		return new IMSI_GSM_MAP();
	    case tmsi_GSM_MAP_chosen:
		return new TMSI_GSM_MAP();
	    case p_TMSI_GSM_MAP_chosen:
		return new P_TMSI_GSM_MAP();
	    case imsi_DS_41_chosen:
		return new IMSI_DS_41();
	    case tmsi_DS_41_chosen:
		return new TMSI_DS_41();
	    case spare3_chosen:
		return new Null();
	    case spare2_chosen:
		return new Null();
	    case spare1_chosen:
		return new Null();
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
	    "CN_PagedUE_Identity"
	),
	new QName (
	    "InformationElements",
	    "CN-PagedUE-Identity"
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
		    "imsi-GSM-MAP",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TMSI_GSM_MAP"
			    ),
			    new QName (
				"InformationElements",
				"TMSI-GSM-MAP"
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
		    "tmsi-GSM-MAP",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"P_TMSI_GSM_MAP"
			    ),
			    new QName (
				"InformationElements",
				"P-TMSI-GSM-MAP"
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
		    "p-TMSI-GSM-MAP",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "spare3",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "spare2",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "spare1",
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
     * Get the type descriptor (TypeInfo) of 'this' CN_PagedUE_Identity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CN_PagedUE_Identity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CN_PagedUE_Identity
