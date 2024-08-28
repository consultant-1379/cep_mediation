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
 * Define the ASN1 Type UL_16QAM_Config from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_16QAM_Config extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_16QAM_Config()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_16QAM_Config(UL_16QAM_Settings ul_16QAM_Settings, 
		    E_TFCI_TableIndex e_TFCI_TableIndex, 
		    Mac_es_e_resetIndicator mac_es_e_resetIndicator)
    {
	setUl_16QAM_Settings(ul_16QAM_Settings);
	setE_TFCI_TableIndex(e_TFCI_TableIndex);
	setMac_es_e_resetIndicator(mac_es_e_resetIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_16QAM_Settings();
	mComponents[1] = new E_TFCI_TableIndex();
	mComponents[2] = Mac_es_e_resetIndicator._true;
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
		return new UL_16QAM_Settings();
	    case 1:
		return new E_TFCI_TableIndex();
	    case 2:
		return Mac_es_e_resetIndicator._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_16QAM_Settings"
    public UL_16QAM_Settings getUl_16QAM_Settings()
    {
	return (UL_16QAM_Settings)mComponents[0];
    }
    
    public void setUl_16QAM_Settings(UL_16QAM_Settings ul_16QAM_Settings)
    {
	mComponents[0] = ul_16QAM_Settings;
    }
    
    public boolean hasUl_16QAM_Settings()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_16QAM_Settings()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "e_TFCI_TableIndex"
    public E_TFCI_TableIndex getE_TFCI_TableIndex()
    {
	return (E_TFCI_TableIndex)mComponents[1];
    }
    
    public void setE_TFCI_TableIndex(E_TFCI_TableIndex e_TFCI_TableIndex)
    {
	mComponents[1] = e_TFCI_TableIndex;
    }
    
    public boolean hasE_TFCI_TableIndex()
    {
	return componentIsPresent(1);
    }
    
    public void deleteE_TFCI_TableIndex()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "mac_es_e_resetIndicator"
    public Mac_es_e_resetIndicator getMac_es_e_resetIndicator()
    {
	return (Mac_es_e_resetIndicator)mComponents[2];
    }
    
    public void setMac_es_e_resetIndicator(Mac_es_e_resetIndicator mac_es_e_resetIndicator)
    {
	mComponents[2] = mac_es_e_resetIndicator;
    }
    
    public boolean hasMac_es_e_resetIndicator()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMac_es_e_resetIndicator()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Mac_es_e_resetIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Mac_es_e_resetIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Mac_es_e_resetIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected Mac_es_e_resetIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Mac_es_e_resetIndicator _true =
	    new Mac_es_e_resetIndicator(0);
	private final static Mac_es_e_resetIndicator cNamedNumbers[] = {
	     _true
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
	
	public static Mac_es_e_resetIndicator valueOf(long value)
	{
	    return (Mac_es_e_resetIndicator)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UL_16QAM_Config$Mac_es_e_resetIndicator"
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
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mac_es_e_resetIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mac_es_e_resetIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mac_es_e_resetIndicator

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
	    "UL_16QAM_Config"
	),
	new QName (
	    "InformationElements",
	    "UL-16QAM-Config"
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
				"UL_16QAM_Settings"
			    ),
			    new QName (
				"InformationElements",
				"UL-16QAM-Settings"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_16QAM_Settings"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_16QAM_Settings"
				)
			    ),
			    0
			)
		    ),
		    "ul-16QAM-Settings",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_TFCI_TableIndex"
			    ),
			    new QName (
				"InformationElements",
				"E-TFCI-TableIndex"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_TFCI_TableIndex(0), 
				    new E_TFCI_TableIndex(1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "e-TFCI-TableIndex",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_16QAM_Config$Mac_es_e_resetIndicator"
			)
		    ),
		    "mac-es-e-resetIndicator",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_16QAM_Config object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_16QAM_Config object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_16QAM_Config
