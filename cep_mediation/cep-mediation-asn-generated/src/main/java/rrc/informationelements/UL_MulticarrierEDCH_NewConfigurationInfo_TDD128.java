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
 * Define the ASN1 Type UL_MulticarrierEDCH_NewConfigurationInfo_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_MulticarrierEDCH_NewConfigurationInfo_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_MulticarrierEDCH_NewConfigurationInfo_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_MulticarrierEDCH_NewConfigurationInfo_TDD128(Tsn_Length tsn_Length, 
		    UL_MulticarrierEDCH_Infolist_TDD128 ul_MulticarrierEDCH_Infolist, 
		    UL_MulticarrierEDCH_Deletelist_TDD128 ul_MulticarrierEDCH_Deletelist)
    {
	setTsn_Length(tsn_Length);
	setUl_MulticarrierEDCH_Infolist(ul_MulticarrierEDCH_Infolist);
	setUl_MulticarrierEDCH_Deletelist(ul_MulticarrierEDCH_Deletelist);
    }
    
    public void initComponents()
    {
	mComponents[0] = Tsn_Length.tsn_14bits;
	mComponents[1] = new UL_MulticarrierEDCH_Infolist_TDD128();
	mComponents[2] = new UL_MulticarrierEDCH_Deletelist_TDD128();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return Tsn_Length.tsn_14bits;
	    case 1:
		return new UL_MulticarrierEDCH_Infolist_TDD128();
	    case 2:
		return new UL_MulticarrierEDCH_Deletelist_TDD128();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tsn_Length"
    public Tsn_Length getTsn_Length()
    {
	return (Tsn_Length)mComponents[0];
    }
    
    public void setTsn_Length(Tsn_Length tsn_Length)
    {
	mComponents[0] = tsn_Length;
    }
    
    public boolean hasTsn_Length()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTsn_Length()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsn_Length from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Tsn_Length extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Tsn_Length()
	{
	    super(cFirstNumber);
	}
	
	protected Tsn_Length(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Tsn_Length tsn_14bits =
	    new Tsn_Length(0);
	private final static Tsn_Length cNamedNumbers[] = {
	     tsn_14bits
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static Tsn_Length valueOf(long value)
	{
	    return (Tsn_Length)tsn_14bits.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UL_MulticarrierEDCH_NewConfigurationInfo_TDD128$Tsn_Length"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"tsn-14bits",
			0
		    )
		}
	    ),
	    0,
	    tsn_14bits
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsn_Length object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsn_Length object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsn_Length

    // Methods for field "ul_MulticarrierEDCH_Infolist"
    public UL_MulticarrierEDCH_Infolist_TDD128 getUl_MulticarrierEDCH_Infolist()
    {
	return (UL_MulticarrierEDCH_Infolist_TDD128)mComponents[1];
    }
    
    public void setUl_MulticarrierEDCH_Infolist(UL_MulticarrierEDCH_Infolist_TDD128 ul_MulticarrierEDCH_Infolist)
    {
	mComponents[1] = ul_MulticarrierEDCH_Infolist;
    }
    
    public boolean hasUl_MulticarrierEDCH_Infolist()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUl_MulticarrierEDCH_Infolist()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ul_MulticarrierEDCH_Deletelist"
    public UL_MulticarrierEDCH_Deletelist_TDD128 getUl_MulticarrierEDCH_Deletelist()
    {
	return (UL_MulticarrierEDCH_Deletelist_TDD128)mComponents[2];
    }
    
    public void setUl_MulticarrierEDCH_Deletelist(UL_MulticarrierEDCH_Deletelist_TDD128 ul_MulticarrierEDCH_Deletelist)
    {
	mComponents[2] = ul_MulticarrierEDCH_Deletelist;
    }
    
    public boolean hasUl_MulticarrierEDCH_Deletelist()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUl_MulticarrierEDCH_Deletelist()
    {
	setComponentAbsent(2);
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
	    "UL_MulticarrierEDCH_NewConfigurationInfo_TDD128"
	),
	new QName (
	    "InformationElements",
	    "UL-MulticarrierEDCH-NewConfigurationInfo-TDD128"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_MulticarrierEDCH_NewConfigurationInfo_TDD128$Tsn_Length"
			)
		    ),
		    "tsn-Length",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_MulticarrierEDCH_Infolist_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"UL-MulticarrierEDCH-Infolist-TDD128"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(5),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(5)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UL_MulticarrierEDCH_InfolistItem_TDD128"
				)
			    )
			)
		    ),
		    "ul-MulticarrierEDCH-Infolist",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_MulticarrierEDCH_Deletelist_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"UL-MulticarrierEDCH-Deletelist-TDD128"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(5),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(5)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UARFCN"
				)
			    )
			)
		    ),
		    "ul-MulticarrierEDCH-Deletelist",
		    2,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_MulticarrierEDCH_NewConfigurationInfo_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_MulticarrierEDCH_NewConfigurationInfo_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_MulticarrierEDCH_NewConfigurationInfo_TDD128
