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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CellChangeOrderFromUTRAN_v590ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellChangeOrderFromUTRAN_v590ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellChangeOrderFromUTRAN_v590ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellChangeOrderFromUTRAN_v590ext_IEs(Geran_SystemInfoType geran_SystemInfoType)
    {
	setGeran_SystemInfoType(geran_SystemInfoType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Geran_SystemInfoType();
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
		return new Geran_SystemInfoType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "geran_SystemInfoType"
    public Geran_SystemInfoType getGeran_SystemInfoType()
    {
	return (Geran_SystemInfoType)mComponents[0];
    }
    
    public void setGeran_SystemInfoType(Geran_SystemInfoType geran_SystemInfoType)
    {
	mComponents[0] = geran_SystemInfoType;
    }
    
    public boolean hasGeran_SystemInfoType()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGeran_SystemInfoType()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Geran_SystemInfoType from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class Geran_SystemInfoType extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Geran_SystemInfoType()
	{
	}
	
	public static final  int  sI_chosen = 1;
	public static final  int  pSI_chosen = 2;
	
	// Methods for field "sI"
	public static Geran_SystemInfoType createGeran_SystemInfoTypeWithSI(rrc.informationelements.GERAN_SystemInformation sI)
	{
	    Geran_SystemInfoType __object = new Geran_SystemInfoType();

	    __object.setSI(sI);
	    return __object;
	}
	
	public boolean hasSI()
	{
	    return getChosenFlag() == sI_chosen;
	}
	
	public void setSI(rrc.informationelements.GERAN_SystemInformation sI)
	{
	    setChosenValue(sI);
	    setChosenFlag(sI_chosen);
	}
	
	
	// Methods for field "pSI"
	public static Geran_SystemInfoType createGeran_SystemInfoTypeWithPSI(rrc.informationelements.GERAN_SystemInformation pSI)
	{
	    Geran_SystemInfoType __object = new Geran_SystemInfoType();

	    __object.setPSI(pSI);
	    return __object;
	}
	
	public boolean hasPSI()
	{
	    return getChosenFlag() == pSI_chosen;
	}
	
	public void setPSI(rrc.informationelements.GERAN_SystemInformation pSI)
	{
	    setChosenValue(pSI);
	    setChosenFlag(pSI_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case sI_chosen:
		    return new rrc.informationelements.GERAN_SystemInformation();
		case pSI_chosen:
		    return new rrc.informationelements.GERAN_SystemInformation();
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellChangeOrderFromUTRAN_v590ext_IEs$Geran_SystemInfoType"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "GERAN_SystemInformation"
				),
				new QName (
				    "InformationElements",
				    "GERAN-SystemInformation"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"GERAN_SystemInfoBlock"
				    )
				)
			    )
			),
			"sI",
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
				    "GERAN_SystemInformation"
				),
				new QName (
				    "InformationElements",
				    "GERAN-SystemInformation"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"GERAN_SystemInfoBlock"
				    )
				)
			    )
			),
			"pSI",
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
	 * Get the type descriptor (TypeInfo) of 'this' Geran_SystemInfoType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Geran_SystemInfoType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Geran_SystemInfoType

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
	    "rrc.pdu_definitions",
	    "CellChangeOrderFromUTRAN_v590ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "CellChangeOrderFromUTRAN-v590ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellChangeOrderFromUTRAN_v590ext_IEs$Geran_SystemInfoType"
			)
		    ),
		    "geran-SystemInfoType",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellChangeOrderFromUTRAN_v590ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellChangeOrderFromUTRAN_v590ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellChangeOrderFromUTRAN_v590ext_IEs
