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
 * Define the ASN1 Type TFC_Subset from ASN1 Module InformationElements.
 * @see Choice
 */

public class TFC_Subset extends Choice {
    
    /**
     * The default constructor.
     */
    public TFC_Subset()
    {
    }
    
    public static final  int  minimumAllowedTFC_Number_chosen = 1;
    public static final  int  allowedTFC_List_chosen = 2;
    public static final  int  non_allowedTFC_List_chosen = 3;
    public static final  int  restrictedTrChInfoList_chosen = 4;
    public static final  int  fullTFCS_chosen = 5;
    
    // Methods for field "minimumAllowedTFC_Number"
    public static TFC_Subset createTFC_SubsetWithMinimumAllowedTFC_Number(long minimumAllowedTFC_Number)
    {
	return createTFC_SubsetWithMinimumAllowedTFC_Number(new TFC_Value(minimumAllowedTFC_Number));
    }
    
    public static TFC_Subset createTFC_SubsetWithMinimumAllowedTFC_Number(TFC_Value minimumAllowedTFC_Number)
    {
	TFC_Subset __object = new TFC_Subset();

	__object.setMinimumAllowedTFC_Number(minimumAllowedTFC_Number);
	return __object;
    }
    
    public boolean hasMinimumAllowedTFC_Number()
    {
	return getChosenFlag() == minimumAllowedTFC_Number_chosen;
    }
    
    public void setMinimumAllowedTFC_Number(long minimumAllowedTFC_Number)
    {
	setMinimumAllowedTFC_Number(new TFC_Value(minimumAllowedTFC_Number));
    }
    
    public void setMinimumAllowedTFC_Number(TFC_Value minimumAllowedTFC_Number)
    {
	setChosenValue(minimumAllowedTFC_Number);
	setChosenFlag(minimumAllowedTFC_Number_chosen);
    }
    
    
    // Methods for field "allowedTFC_List"
    public static TFC_Subset createTFC_SubsetWithAllowedTFC_List(AllowedTFC_List allowedTFC_List)
    {
	TFC_Subset __object = new TFC_Subset();

	__object.setAllowedTFC_List(allowedTFC_List);
	return __object;
    }
    
    public boolean hasAllowedTFC_List()
    {
	return getChosenFlag() == allowedTFC_List_chosen;
    }
    
    public void setAllowedTFC_List(AllowedTFC_List allowedTFC_List)
    {
	setChosenValue(allowedTFC_List);
	setChosenFlag(allowedTFC_List_chosen);
    }
    
    
    // Methods for field "non_allowedTFC_List"
    public static TFC_Subset createTFC_SubsetWithNon_allowedTFC_List(Non_allowedTFC_List non_allowedTFC_List)
    {
	TFC_Subset __object = new TFC_Subset();

	__object.setNon_allowedTFC_List(non_allowedTFC_List);
	return __object;
    }
    
    public boolean hasNon_allowedTFC_List()
    {
	return getChosenFlag() == non_allowedTFC_List_chosen;
    }
    
    public void setNon_allowedTFC_List(Non_allowedTFC_List non_allowedTFC_List)
    {
	setChosenValue(non_allowedTFC_List);
	setChosenFlag(non_allowedTFC_List_chosen);
    }
    
    
    // Methods for field "restrictedTrChInfoList"
    public static TFC_Subset createTFC_SubsetWithRestrictedTrChInfoList(RestrictedTrChInfoList restrictedTrChInfoList)
    {
	TFC_Subset __object = new TFC_Subset();

	__object.setRestrictedTrChInfoList(restrictedTrChInfoList);
	return __object;
    }
    
    public boolean hasRestrictedTrChInfoList()
    {
	return getChosenFlag() == restrictedTrChInfoList_chosen;
    }
    
    public void setRestrictedTrChInfoList(RestrictedTrChInfoList restrictedTrChInfoList)
    {
	setChosenValue(restrictedTrChInfoList);
	setChosenFlag(restrictedTrChInfoList_chosen);
    }
    
    
    // Methods for field "fullTFCS"
    public static TFC_Subset createTFC_SubsetWithFullTFCS(Null fullTFCS)
    {
	TFC_Subset __object = new TFC_Subset();

	__object.setFullTFCS(fullTFCS);
	return __object;
    }
    
    public boolean hasFullTFCS()
    {
	return getChosenFlag() == fullTFCS_chosen;
    }
    
    public void setFullTFCS(Null fullTFCS)
    {
	setChosenValue(fullTFCS);
	setChosenFlag(fullTFCS_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case minimumAllowedTFC_Number_chosen:
		return new TFC_Value();
	    case allowedTFC_List_chosen:
		return new AllowedTFC_List();
	    case non_allowedTFC_List_chosen:
		return new Non_allowedTFC_List();
	    case restrictedTrChInfoList_chosen:
		return new RestrictedTrChInfoList();
	    case fullTFCS_chosen:
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
	    "TFC_Subset"
	),
	new QName (
	    "InformationElements",
	    "TFC-Subset"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFC_Value"
			    ),
			    new QName (
				"InformationElements",
				"TFC-Value"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TFC_Value(0), 
				    new TFC_Value(1023),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1023)
			    ),
			    null
			)
		    ),
		    "minimumAllowedTFC-Number",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AllowedTFC_List"
			    ),
			    new QName (
				"InformationElements",
				"AllowedTFC-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(1024),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1024)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TFC_Value"
				)
			    )
			)
		    ),
		    "allowedTFC-List",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Non_allowedTFC_List"
			    ),
			    new QName (
				"InformationElements",
				"Non-allowedTFC-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(1024),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1024)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TFC_Value"
				)
			    )
			)
		    ),
		    "non-allowedTFC-List",
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
				"RestrictedTrChInfoList"
			    ),
			    new QName (
				"InformationElements",
				"RestrictedTrChInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RestrictedTrChInfo"
				)
			    )
			)
		    ),
		    "restrictedTrChInfoList",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "fullTFCS",
		    4,
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
		new TagDecoderElement((short)0x8004, 4)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TFC_Subset object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TFC_Subset object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TFC_Subset
