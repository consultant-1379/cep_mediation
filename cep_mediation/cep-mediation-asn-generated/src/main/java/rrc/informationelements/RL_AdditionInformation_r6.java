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
 * Define the ASN1 Type RL_AdditionInformation_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RL_AdditionInformation_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RL_AdditionInformation_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RL_AdditionInformation_r6(PrimaryCPICH_Info primaryCPICH_Info, 
		    CellIdentity cell_Id, Dl_dpchInfo dl_dpchInfo, 
		    E_HICH_Information e_HICH_Information, 
		    E_RGCH_Information e_RGCH_Information)
    {
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setCell_Id(cell_Id);
	setDl_dpchInfo(dl_dpchInfo);
	setE_HICH_Information(e_HICH_Information);
	setE_RGCH_Information(e_RGCH_Information);
    }
    
    /**
     * Construct with required components.
     */
    public RL_AdditionInformation_r6(PrimaryCPICH_Info primaryCPICH_Info, 
		    Dl_dpchInfo dl_dpchInfo)
    {
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setDl_dpchInfo(dl_dpchInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrimaryCPICH_Info();
	mComponents[1] = new CellIdentity();
	mComponents[2] = new Dl_dpchInfo();
	mComponents[3] = new E_HICH_Information();
	mComponents[4] = new E_RGCH_Information();
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
		return new PrimaryCPICH_Info();
	    case 1:
		return new CellIdentity();
	    case 2:
		return new Dl_dpchInfo();
	    case 3:
		return new E_HICH_Information();
	    case 4:
		return new E_RGCH_Information();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryCPICH_Info"
    public PrimaryCPICH_Info getPrimaryCPICH_Info()
    {
	return (PrimaryCPICH_Info)mComponents[0];
    }
    
    public void setPrimaryCPICH_Info(PrimaryCPICH_Info primaryCPICH_Info)
    {
	mComponents[0] = primaryCPICH_Info;
    }
    
    
    // Methods for field "cell_Id"
    public CellIdentity getCell_Id()
    {
	return (CellIdentity)mComponents[1];
    }
    
    public void setCell_Id(CellIdentity cell_Id)
    {
	mComponents[1] = cell_Id;
    }
    
    public boolean hasCell_Id()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCell_Id()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dl_dpchInfo"
    public Dl_dpchInfo getDl_dpchInfo()
    {
	return (Dl_dpchInfo)mComponents[2];
    }
    
    public void setDl_dpchInfo(Dl_dpchInfo dl_dpchInfo)
    {
	mComponents[2] = dl_dpchInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type Dl_dpchInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Dl_dpchInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Dl_dpchInfo()
	{
	}
	
	public static final  int  dl_DPCH_InfoPerRL_chosen = 1;
	public static final  int  dl_FDPCH_InfoPerRL_chosen = 2;
	
	// Methods for field "dl_DPCH_InfoPerRL"
	public static Dl_dpchInfo createDl_dpchInfoWithDl_DPCH_InfoPerRL(DL_DPCH_InfoPerRL_r5 dl_DPCH_InfoPerRL)
	{
	    Dl_dpchInfo __object = new Dl_dpchInfo();

	    __object.setDl_DPCH_InfoPerRL(dl_DPCH_InfoPerRL);
	    return __object;
	}
	
	public boolean hasDl_DPCH_InfoPerRL()
	{
	    return getChosenFlag() == dl_DPCH_InfoPerRL_chosen;
	}
	
	public void setDl_DPCH_InfoPerRL(DL_DPCH_InfoPerRL_r5 dl_DPCH_InfoPerRL)
	{
	    setChosenValue(dl_DPCH_InfoPerRL);
	    setChosenFlag(dl_DPCH_InfoPerRL_chosen);
	}
	
	
	// Methods for field "dl_FDPCH_InfoPerRL"
	public static Dl_dpchInfo createDl_dpchInfoWithDl_FDPCH_InfoPerRL(DL_FDPCH_InfoPerRL_r6 dl_FDPCH_InfoPerRL)
	{
	    Dl_dpchInfo __object = new Dl_dpchInfo();

	    __object.setDl_FDPCH_InfoPerRL(dl_FDPCH_InfoPerRL);
	    return __object;
	}
	
	public boolean hasDl_FDPCH_InfoPerRL()
	{
	    return getChosenFlag() == dl_FDPCH_InfoPerRL_chosen;
	}
	
	public void setDl_FDPCH_InfoPerRL(DL_FDPCH_InfoPerRL_r6 dl_FDPCH_InfoPerRL)
	{
	    setChosenValue(dl_FDPCH_InfoPerRL);
	    setChosenFlag(dl_FDPCH_InfoPerRL_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case dl_DPCH_InfoPerRL_chosen:
		    return new DL_DPCH_InfoPerRL_r5();
		case dl_FDPCH_InfoPerRL_chosen:
		    return new DL_FDPCH_InfoPerRL_r6();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"RL_AdditionInformation_r6$Dl_dpchInfo"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_InfoPerRL_r5"
				),
				new QName (
				    "InformationElements",
				    "DL-DPCH-InfoPerRL-r5"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_DPCH_InfoPerRL_r5"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1)
				    }
				)
			    )
			),
			"dl-DPCH-InfoPerRL",
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
				    "DL_FDPCH_InfoPerRL_r6"
				),
				new QName (
				    "InformationElements",
				    "DL-FDPCH-InfoPerRL-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_FDPCH_InfoPerRL_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_FDPCH_InfoPerRL_r6"
				    )
				),
				0
			    )
			),
			"dl-FDPCH-InfoPerRL",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Dl_dpchInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dl_dpchInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dl_dpchInfo

    // Methods for field "e_HICH_Information"
    public E_HICH_Information getE_HICH_Information()
    {
	return (E_HICH_Information)mComponents[3];
    }
    
    public void setE_HICH_Information(E_HICH_Information e_HICH_Information)
    {
	mComponents[3] = e_HICH_Information;
    }
    
    public boolean hasE_HICH_Information()
    {
	return componentIsPresent(3);
    }
    
    public void deleteE_HICH_Information()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "e_RGCH_Information"
    public E_RGCH_Information getE_RGCH_Information()
    {
	return (E_RGCH_Information)mComponents[4];
    }
    
    public void setE_RGCH_Information(E_RGCH_Information e_RGCH_Information)
    {
	mComponents[4] = e_RGCH_Information;
    }
    
    public boolean hasE_RGCH_Information()
    {
	return componentIsPresent(4);
    }
    
    public void deleteE_RGCH_Information()
    {
	setComponentAbsent(4);
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
	    "RL_AdditionInformation_r6"
	),
	new QName (
	    "InformationElements",
	    "RL-AdditionInformation-r6"
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
				"PrimaryCPICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCPICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0
			)
		    ),
		    "primaryCPICH-Info",
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
				"CellIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CellIdentity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "cell-Id",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RL_AdditionInformation_r6$Dl_dpchInfo"
			)
		    ),
		    "dl-dpchInfo",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_HICH_Information"
			    ),
			    new QName (
				"InformationElements",
				"E-HICH-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information"
				)
			    ),
			    0
			)
		    ),
		    "e-HICH-Information",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_RGCH_Information"
			    ),
			    new QName (
				"InformationElements",
				"E-RGCH-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_RGCH_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_RGCH_Information"
				)
			    ),
			    0
			)
		    ),
		    "e-RGCH-Information",
		    4,
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
     * Get the type descriptor (TypeInfo) of 'this' RL_AdditionInformation_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RL_AdditionInformation_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RL_AdditionInformation_r6
