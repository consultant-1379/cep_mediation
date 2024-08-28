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
 * Define the ASN1 Type PLMN_Type from ASN1 Module InformationElements.
 * @see Choice
 */

public class PLMN_Type extends Choice {
    
    /**
     * The default constructor.
     */
    public PLMN_Type()
    {
    }
    
    public static final  int  gsm_MAP_chosen = 1;
    public static final  int  ansi_41_chosen = 2;
    public static final  int  gsm_MAP_and_ANSI_41_chosen = 3;
    public static final  int  spare_chosen = 4;
    
    // Methods for field "gsm_MAP"
    public static PLMN_Type createPLMN_TypeWithGsm_MAP(Gsm_MAP gsm_MAP)
    {
	PLMN_Type __object = new PLMN_Type();

	__object.setGsm_MAP(gsm_MAP);
	return __object;
    }
    
    public boolean hasGsm_MAP()
    {
	return getChosenFlag() == gsm_MAP_chosen;
    }
    
    public void setGsm_MAP(Gsm_MAP gsm_MAP)
    {
	setChosenValue(gsm_MAP);
	setChosenFlag(gsm_MAP_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Gsm_MAP from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Gsm_MAP extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Gsm_MAP()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Gsm_MAP(PLMN_Identity plmn_Identity)
	{
	    setPlmn_Identity(plmn_Identity);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new PLMN_Identity();
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
		    return new PLMN_Identity();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "plmn_Identity"
	public PLMN_Identity getPlmn_Identity()
	{
	    return (PLMN_Identity)mComponents[0];
	}
	
	public void setPlmn_Identity(PLMN_Identity plmn_Identity)
	{
	    mComponents[0] = plmn_Identity;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PLMN_Type$Gsm_MAP"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
				    "PLMN_Identity"
				),
				new QName (
				    "InformationElements",
				    "PLMN-Identity"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PLMN_Identity"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"PLMN_Identity"
				    )
				),
				0
			    )
			),
			"plmn-Identity",
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
	 * Get the type descriptor (TypeInfo) of 'this' Gsm_MAP object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Gsm_MAP object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Gsm_MAP

    // Methods for field "ansi_41"
    public static PLMN_Type createPLMN_TypeWithAnsi_41(Ansi_41 ansi_41)
    {
	PLMN_Type __object = new PLMN_Type();

	__object.setAnsi_41(ansi_41);
	return __object;
    }
    
    public boolean hasAnsi_41()
    {
	return getChosenFlag() == ansi_41_chosen;
    }
    
    public void setAnsi_41(Ansi_41 ansi_41)
    {
	setChosenValue(ansi_41);
	setChosenFlag(ansi_41_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Ansi_41 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Ansi_41 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Ansi_41()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Ansi_41(P_REV p_REV, Min_P_REV min_P_REV, SID sid, NID nid)
	{
	    setP_REV(p_REV);
	    setMin_P_REV(min_P_REV);
	    setSid(sid);
	    setNid(nid);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new P_REV();
	    mComponents[1] = new Min_P_REV();
	    mComponents[2] = new SID();
	    mComponents[3] = new NID();
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
		    return new P_REV();
		case 1:
		    return new Min_P_REV();
		case 2:
		    return new SID();
		case 3:
		    return new NID();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "p_REV"
	public P_REV getP_REV()
	{
	    return (P_REV)mComponents[0];
	}
	
	public void setP_REV(P_REV p_REV)
	{
	    mComponents[0] = p_REV;
	}
	
	
	// Methods for field "min_P_REV"
	public Min_P_REV getMin_P_REV()
	{
	    return (Min_P_REV)mComponents[1];
	}
	
	public void setMin_P_REV(Min_P_REV min_P_REV)
	{
	    mComponents[1] = min_P_REV;
	}
	
	
	// Methods for field "sid"
	public SID getSid()
	{
	    return (SID)mComponents[2];
	}
	
	public void setSid(SID sid)
	{
	    mComponents[2] = sid;
	}
	
	
	// Methods for field "nid"
	public NID getNid()
	{
	    return (NID)mComponents[3];
	}
	
	public void setNid(NID nid)
	{
	    mComponents[3] = nid;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PLMN_Type$Ansi_41"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
				    "rrc.informationelements",
				    "P_REV"
				),
				new QName (
				    "InformationElements",
				    "P-REV"
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
			"p-REV",
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
				    "Min_P_REV"
				),
				new QName (
				    "InformationElements",
				    "Min-P-REV"
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
			"min-P-REV",
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
				    "rrc.informationelements",
				    "SID"
				),
				new QName (
				    "InformationElements",
				    "SID"
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
				null
			    )
			),
			"sid",
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
				    "rrc.informationelements",
				    "NID"
				),
				new QName (
				    "InformationElements",
				    "NID"
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
			"nid",
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
			    new TagDecoderElement((short)0x8002, 2)
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
	 * Get the type descriptor (TypeInfo) of 'this' Ansi_41 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Ansi_41 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Ansi_41

    // Methods for field "gsm_MAP_and_ANSI_41"
    public static PLMN_Type createPLMN_TypeWithGsm_MAP_and_ANSI_41(Gsm_MAP_and_ANSI_41 gsm_MAP_and_ANSI_41)
    {
	PLMN_Type __object = new PLMN_Type();

	__object.setGsm_MAP_and_ANSI_41(gsm_MAP_and_ANSI_41);
	return __object;
    }
    
    public boolean hasGsm_MAP_and_ANSI_41()
    {
	return getChosenFlag() == gsm_MAP_and_ANSI_41_chosen;
    }
    
    public void setGsm_MAP_and_ANSI_41(Gsm_MAP_and_ANSI_41 gsm_MAP_and_ANSI_41)
    {
	setChosenValue(gsm_MAP_and_ANSI_41);
	setChosenFlag(gsm_MAP_and_ANSI_41_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Gsm_MAP_and_ANSI_41 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Gsm_MAP_and_ANSI_41 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Gsm_MAP_and_ANSI_41()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Gsm_MAP_and_ANSI_41(PLMN_Identity plmn_Identity, P_REV p_REV, 
			Min_P_REV min_P_REV, SID sid, NID nid)
	{
	    setPlmn_Identity(plmn_Identity);
	    setP_REV(p_REV);
	    setMin_P_REV(min_P_REV);
	    setSid(sid);
	    setNid(nid);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new PLMN_Identity();
	    mComponents[1] = new P_REV();
	    mComponents[2] = new Min_P_REV();
	    mComponents[3] = new SID();
	    mComponents[4] = new NID();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[5];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new PLMN_Identity();
		case 1:
		    return new P_REV();
		case 2:
		    return new Min_P_REV();
		case 3:
		    return new SID();
		case 4:
		    return new NID();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "plmn_Identity"
	public PLMN_Identity getPlmn_Identity()
	{
	    return (PLMN_Identity)mComponents[0];
	}
	
	public void setPlmn_Identity(PLMN_Identity plmn_Identity)
	{
	    mComponents[0] = plmn_Identity;
	}
	
	
	// Methods for field "p_REV"
	public P_REV getP_REV()
	{
	    return (P_REV)mComponents[1];
	}
	
	public void setP_REV(P_REV p_REV)
	{
	    mComponents[1] = p_REV;
	}
	
	
	// Methods for field "min_P_REV"
	public Min_P_REV getMin_P_REV()
	{
	    return (Min_P_REV)mComponents[2];
	}
	
	public void setMin_P_REV(Min_P_REV min_P_REV)
	{
	    mComponents[2] = min_P_REV;
	}
	
	
	// Methods for field "sid"
	public SID getSid()
	{
	    return (SID)mComponents[3];
	}
	
	public void setSid(SID sid)
	{
	    mComponents[3] = sid;
	}
	
	
	// Methods for field "nid"
	public NID getNid()
	{
	    return (NID)mComponents[4];
	}
	
	public void setNid(NID nid)
	{
	    mComponents[4] = nid;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PLMN_Type$Gsm_MAP_and_ANSI_41"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
				    "PLMN_Identity"
				),
				new QName (
				    "InformationElements",
				    "PLMN-Identity"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PLMN_Identity"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"PLMN_Identity"
				    )
				),
				0
			    )
			),
			"plmn-Identity",
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
				    "P_REV"
				),
				new QName (
				    "InformationElements",
				    "P-REV"
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
			"p-REV",
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
				    "rrc.informationelements",
				    "Min_P_REV"
				),
				new QName (
				    "InformationElements",
				    "Min-P-REV"
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
			"min-P-REV",
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
				    "rrc.informationelements",
				    "SID"
				),
				new QName (
				    "InformationElements",
				    "SID"
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
				null
			    )
			),
			"sid",
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
				    "rrc.informationelements",
				    "NID"
				),
				new QName (
				    "InformationElements",
				    "NID"
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
			"nid",
			4,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Gsm_MAP_and_ANSI_41 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Gsm_MAP_and_ANSI_41 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Gsm_MAP_and_ANSI_41

    // Methods for field "spare"
    public static PLMN_Type createPLMN_TypeWithSpare(Null spare)
    {
	PLMN_Type __object = new PLMN_Type();

	__object.setSpare(spare);
	return __object;
    }
    
    public boolean hasSpare()
    {
	return getChosenFlag() == spare_chosen;
    }
    
    public void setSpare(Null spare)
    {
	setChosenValue(spare);
	setChosenFlag(spare_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case gsm_MAP_chosen:
		return new Gsm_MAP();
	    case ansi_41_chosen:
		return new Ansi_41();
	    case gsm_MAP_and_ANSI_41_chosen:
		return new Gsm_MAP_and_ANSI_41();
	    case spare_chosen:
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
	    "PLMN_Type"
	),
	new QName (
	    "InformationElements",
	    "PLMN-Type"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PLMN_Type$Gsm_MAP"
			)
		    ),
		    "gsm-MAP",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PLMN_Type$Ansi_41"
			)
		    ),
		    "ansi-41",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PLMN_Type$Gsm_MAP_and_ANSI_41"
			)
		    ),
		    "gsm-MAP-and-ANSI-41",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "spare",
		    3,
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
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PLMN_Type object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PLMN_Type object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PLMN_Type
