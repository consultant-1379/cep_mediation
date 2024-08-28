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
 * Define the ASN1 Type Serving_HSDSCH_CellInformation_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Serving_HSDSCH_CellInformation_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public Serving_HSDSCH_CellInformation_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Serving_HSDSCH_CellInformation_r8(DeltaACK deltaACK, 
		    DeltaNACK deltaNACK, 
		    HARQ_Preamble_Mode harq_Preamble_Mode, 
		    PrimaryCPICH_Info primaryCPICH_Info, 
		    DL_HSPDSCH_Information_r8 dl_hspdsch_Information, 
		    HARQ_Info_r7 harqInfo, 
		    Mac_hsResetIndicator mac_hsResetIndicator)
    {
	setDeltaACK(deltaACK);
	setDeltaNACK(deltaNACK);
	setHarq_Preamble_Mode(harq_Preamble_Mode);
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setDl_hspdsch_Information(dl_hspdsch_Information);
	setHarqInfo(harqInfo);
	setMac_hsResetIndicator(mac_hsResetIndicator);
    }
    
    /**
     * Construct with required components.
     */
    public Serving_HSDSCH_CellInformation_r8(HARQ_Preamble_Mode harq_Preamble_Mode)
    {
	setHarq_Preamble_Mode(harq_Preamble_Mode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DeltaACK();
	mComponents[1] = new DeltaNACK();
	mComponents[2] = new HARQ_Preamble_Mode();
	mComponents[3] = new PrimaryCPICH_Info();
	mComponents[4] = new DL_HSPDSCH_Information_r8();
	mComponents[5] = new HARQ_Info_r7();
	mComponents[6] = Mac_hsResetIndicator._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new DeltaACK();
	    case 1:
		return new DeltaNACK();
	    case 2:
		return new HARQ_Preamble_Mode();
	    case 3:
		return new PrimaryCPICH_Info();
	    case 4:
		return new DL_HSPDSCH_Information_r8();
	    case 5:
		return new HARQ_Info_r7();
	    case 6:
		return Mac_hsResetIndicator._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "deltaACK"
    public DeltaACK getDeltaACK()
    {
	return (DeltaACK)mComponents[0];
    }
    
    public void setDeltaACK(DeltaACK deltaACK)
    {
	mComponents[0] = deltaACK;
    }
    
    public boolean hasDeltaACK()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDeltaACK()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "deltaNACK"
    public DeltaNACK getDeltaNACK()
    {
	return (DeltaNACK)mComponents[1];
    }
    
    public void setDeltaNACK(DeltaNACK deltaNACK)
    {
	mComponents[1] = deltaNACK;
    }
    
    public boolean hasDeltaNACK()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDeltaNACK()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "harq_Preamble_Mode"
    public HARQ_Preamble_Mode getHarq_Preamble_Mode()
    {
	return (HARQ_Preamble_Mode)mComponents[2];
    }
    
    public void setHarq_Preamble_Mode(HARQ_Preamble_Mode harq_Preamble_Mode)
    {
	mComponents[2] = harq_Preamble_Mode;
    }
    
    
    // Methods for field "primaryCPICH_Info"
    public PrimaryCPICH_Info getPrimaryCPICH_Info()
    {
	return (PrimaryCPICH_Info)mComponents[3];
    }
    
    public void setPrimaryCPICH_Info(PrimaryCPICH_Info primaryCPICH_Info)
    {
	mComponents[3] = primaryCPICH_Info;
    }
    
    public boolean hasPrimaryCPICH_Info()
    {
	return componentIsPresent(3);
    }
    
    public void deletePrimaryCPICH_Info()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "dl_hspdsch_Information"
    public DL_HSPDSCH_Information_r8 getDl_hspdsch_Information()
    {
	return (DL_HSPDSCH_Information_r8)mComponents[4];
    }
    
    public void setDl_hspdsch_Information(DL_HSPDSCH_Information_r8 dl_hspdsch_Information)
    {
	mComponents[4] = dl_hspdsch_Information;
    }
    
    public boolean hasDl_hspdsch_Information()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDl_hspdsch_Information()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "harqInfo"
    public HARQ_Info_r7 getHarqInfo()
    {
	return (HARQ_Info_r7)mComponents[5];
    }
    
    public void setHarqInfo(HARQ_Info_r7 harqInfo)
    {
	mComponents[5] = harqInfo;
    }
    
    public boolean hasHarqInfo()
    {
	return componentIsPresent(5);
    }
    
    public void deleteHarqInfo()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "mac_hsResetIndicator"
    public Mac_hsResetIndicator getMac_hsResetIndicator()
    {
	return (Mac_hsResetIndicator)mComponents[6];
    }
    
    public void setMac_hsResetIndicator(Mac_hsResetIndicator mac_hsResetIndicator)
    {
	mComponents[6] = mac_hsResetIndicator;
    }
    
    public boolean hasMac_hsResetIndicator()
    {
	return componentIsPresent(6);
    }
    
    public void deleteMac_hsResetIndicator()
    {
	setComponentAbsent(6);
    }
    
    
    
    /**
     * Define the ASN1 Type Mac_hsResetIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Mac_hsResetIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Mac_hsResetIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected Mac_hsResetIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Mac_hsResetIndicator _true =
	    new Mac_hsResetIndicator(0);
	private final static Mac_hsResetIndicator cNamedNumbers[] = {
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
	
	public static Mac_hsResetIndicator valueOf(long value)
	{
	    return (Mac_hsResetIndicator)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"Serving_HSDSCH_CellInformation_r8$Mac_hsResetIndicator"
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
	 * Get the type descriptor (TypeInfo) of 'this' Mac_hsResetIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mac_hsResetIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mac_hsResetIndicator

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
	    "Serving_HSDSCH_CellInformation_r8"
	),
	new QName (
	    "InformationElements",
	    "Serving-HSDSCH-CellInformation-r8"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DeltaACK"
			    ),
			    new QName (
				"InformationElements",
				"DeltaACK"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaACK(0), 
				    new DeltaACK(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "deltaACK",
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
				"DeltaNACK"
			    ),
			    new QName (
				"InformationElements",
				"DeltaNACK"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaNACK(0), 
				    new DeltaNACK(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "deltaNACK",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HARQ_Preamble_Mode"
			    ),
			    new QName (
				"InformationElements",
				"HARQ-Preamble-Mode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new HARQ_Preamble_Mode(0), 
				    new HARQ_Preamble_Mode(1),
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
		    "harq-Preamble-Mode",
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
				"DL_HSPDSCH_Information_r8"
			    ),
			    new QName (
				"InformationElements",
				"DL-HSPDSCH-Information-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r8"
				)
			    ),
			    0
			)
		    ),
		    "dl-hspdsch-Information",
		    4,
		    3,
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
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "Serving_HSDSCH_CellInformation_r8$Mac_hsResetIndicator"
			)
		    ),
		    "mac-hsResetIndicator",
		    6,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Serving_HSDSCH_CellInformation_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Serving_HSDSCH_CellInformation_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Serving_HSDSCH_CellInformation_r8
