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
 * Define the ASN1 Type HSDSCH_Info_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HSDSCH_Info_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HSDSCH_Info_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HSDSCH_Info_r7(HARQ_Info_r7 harqInfo, 
		    Dl_MAC_HeaderType dl_MAC_HeaderType)
    {
	setHarqInfo(harqInfo);
	setDl_MAC_HeaderType(dl_MAC_HeaderType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HARQ_Info_r7();
	mComponents[1] = new Dl_MAC_HeaderType();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new HARQ_Info_r7();
	    case 1:
		return new Dl_MAC_HeaderType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "harqInfo"
    public HARQ_Info_r7 getHarqInfo()
    {
	return (HARQ_Info_r7)mComponents[0];
    }
    
    public void setHarqInfo(HARQ_Info_r7 harqInfo)
    {
	mComponents[0] = harqInfo;
    }
    
    public boolean hasHarqInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHarqInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dl_MAC_HeaderType"
    public Dl_MAC_HeaderType getDl_MAC_HeaderType()
    {
	return (Dl_MAC_HeaderType)mComponents[1];
    }
    
    public void setDl_MAC_HeaderType(Dl_MAC_HeaderType dl_MAC_HeaderType)
    {
	mComponents[1] = dl_MAC_HeaderType;
    }
    
    public boolean hasDl_MAC_HeaderType()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_MAC_HeaderType()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Dl_MAC_HeaderType from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Dl_MAC_HeaderType extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Dl_MAC_HeaderType()
	{
	}
	
	public static final  int  mac_hs_chosen = 1;
	public static final  int  mac_ehs_chosen = 2;
	
	// Methods for field "mac_hs"
	public static Dl_MAC_HeaderType createDl_MAC_HeaderTypeWithMac_hs(AddOrReconfMAC_dFlow mac_hs)
	{
	    Dl_MAC_HeaderType __object = new Dl_MAC_HeaderType();

	    __object.setMac_hs(mac_hs);
	    return __object;
	}
	
	public boolean hasMac_hs()
	{
	    return getChosenFlag() == mac_hs_chosen;
	}
	
	public void setMac_hs(AddOrReconfMAC_dFlow mac_hs)
	{
	    setChosenValue(mac_hs);
	    setChosenFlag(mac_hs_chosen);
	}
	
	
	// Methods for field "mac_ehs"
	public static Dl_MAC_HeaderType createDl_MAC_HeaderTypeWithMac_ehs(AddOrReconfMAC_ehs_ReordQ mac_ehs)
	{
	    Dl_MAC_HeaderType __object = new Dl_MAC_HeaderType();

	    __object.setMac_ehs(mac_ehs);
	    return __object;
	}
	
	public boolean hasMac_ehs()
	{
	    return getChosenFlag() == mac_ehs_chosen;
	}
	
	public void setMac_ehs(AddOrReconfMAC_ehs_ReordQ mac_ehs)
	{
	    setChosenValue(mac_ehs);
	    setChosenFlag(mac_ehs_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case mac_hs_chosen:
		    return new AddOrReconfMAC_dFlow();
		case mac_ehs_chosen:
		    return new AddOrReconfMAC_ehs_ReordQ();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"HSDSCH_Info_r7$Dl_MAC_HeaderType"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "AddOrReconfMAC_dFlow"
				),
				new QName (
				    "InformationElements",
				    "AddOrReconfMAC-dFlow"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"AddOrReconfMAC_dFlow"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"AddOrReconfMAC_dFlow"
				    )
				),
				0
			    )
			),
			"mac-hs",
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
				    "AddOrReconfMAC_ehs_ReordQ"
				),
				new QName (
				    "InformationElements",
				    "AddOrReconfMAC-ehs-ReordQ"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"AddOrReconfMAC_ehs_ReordQ"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"AddOrReconfMAC_ehs_ReordQ"
				    )
				),
				0
			    )
			),
			"mac-ehs",
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
	 * Get the type descriptor (TypeInfo) of 'this' Dl_MAC_HeaderType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dl_MAC_HeaderType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dl_MAC_HeaderType

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
	    "HSDSCH_Info_r7"
	),
	new QName (
	    "InformationElements",
	    "HSDSCH-Info-r7"
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
				"HARQ_Info_r7"
			    ),
			    new QName (
				"InformationElements",
				"HARQ-Info-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info_r7"
				)
			    ),
			    0
			)
		    ),
		    "harqInfo",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HSDSCH_Info_r7$Dl_MAC_HeaderType"
			)
		    ),
		    "dl-MAC-HeaderType",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HSDSCH_Info_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HSDSCH_Info_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HSDSCH_Info_r7
