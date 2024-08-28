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
 * Define the ASN1 Type UE_InternalMeasuredResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_InternalMeasuredResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_InternalMeasuredResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_InternalMeasuredResults(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
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
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[0];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[0] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Fdd fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Fdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Fdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Fdd(UE_TransmittedPower ue_TransmittedPowerFDD, 
			    UE_RX_TX_ReportEntryList ue_RX_TX_ReportEntryList)
	    {
		setUe_TransmittedPowerFDD(ue_TransmittedPowerFDD);
		setUe_RX_TX_ReportEntryList(ue_RX_TX_ReportEntryList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UE_TransmittedPower();
		mComponents[1] = new UE_RX_TX_ReportEntryList();
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
			return new UE_TransmittedPower();
		    case 1:
			return new UE_RX_TX_ReportEntryList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ue_TransmittedPowerFDD"
	    public UE_TransmittedPower getUe_TransmittedPowerFDD()
	    {
		return (UE_TransmittedPower)mComponents[0];
	    }
	    
	    public void setUe_TransmittedPowerFDD(UE_TransmittedPower ue_TransmittedPowerFDD)
	    {
		mComponents[0] = ue_TransmittedPowerFDD;
	    }
	    
	    public boolean hasUe_TransmittedPowerFDD()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteUe_TransmittedPowerFDD()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "ue_RX_TX_ReportEntryList"
	    public UE_RX_TX_ReportEntryList getUe_RX_TX_ReportEntryList()
	    {
		return (UE_RX_TX_ReportEntryList)mComponents[1];
	    }
	    
	    public void setUe_RX_TX_ReportEntryList(UE_RX_TX_ReportEntryList ue_RX_TX_ReportEntryList)
	    {
		mComponents[1] = ue_RX_TX_ReportEntryList;
	    }
	    
	    public boolean hasUe_RX_TX_ReportEntryList()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteUe_RX_TX_ReportEntryList()
	    {
		setComponentAbsent(1);
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
		    "UE_InternalMeasuredResults$ModeSpecificInfo$Fdd"
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
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UE_TransmittedPower"
				    ),
				    new QName (
					"InformationElements",
					"UE-TransmittedPower"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new UE_TransmittedPower(0), 
					    new UE_TransmittedPower(104),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(104)
				    ),
				    null
				)
			    ),
			    "ue-TransmittedPowerFDD",
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
					"UE_RX_TX_ReportEntryList"
				    ),
				    new QName (
					"InformationElements",
					"UE-RX-TX-ReportEntryList"
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
					    "UE_RX_TX_ReportEntry"
					)
				    )
				)
			    ),
			    "ue-RX-TX-ReportEntryList",
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
	     * Get the type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Fdd

	// Methods for field "tdd"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Tdd tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd(UE_TransmittedPowerTDD_List ue_TransmittedPowerTDD_List, 
			    UL_TimingAdvance appliedTA)
	    {
		setUe_TransmittedPowerTDD_List(ue_TransmittedPowerTDD_List);
		setAppliedTA(appliedTA);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UE_TransmittedPowerTDD_List();
		mComponents[1] = new UL_TimingAdvance();
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
			return new UE_TransmittedPowerTDD_List();
		    case 1:
			return new UL_TimingAdvance();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ue_TransmittedPowerTDD_List"
	    public UE_TransmittedPowerTDD_List getUe_TransmittedPowerTDD_List()
	    {
		return (UE_TransmittedPowerTDD_List)mComponents[0];
	    }
	    
	    public void setUe_TransmittedPowerTDD_List(UE_TransmittedPowerTDD_List ue_TransmittedPowerTDD_List)
	    {
		mComponents[0] = ue_TransmittedPowerTDD_List;
	    }
	    
	    public boolean hasUe_TransmittedPowerTDD_List()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteUe_TransmittedPowerTDD_List()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "appliedTA"
	    public UL_TimingAdvance getAppliedTA()
	    {
		return (UL_TimingAdvance)mComponents[1];
	    }
	    
	    public void setAppliedTA(UL_TimingAdvance appliedTA)
	    {
		mComponents[1] = appliedTA;
	    }
	    
	    public boolean hasAppliedTA()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteAppliedTA()
	    {
		setComponentAbsent(1);
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
		    "UE_InternalMeasuredResults$ModeSpecificInfo$Tdd"
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
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UE_TransmittedPowerTDD_List"
				    ),
				    new QName (
					"InformationElements",
					"UE-TransmittedPowerTDD-List"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(14),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(14)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "UE_TransmittedPower"
					)
				    )
				)
			    ),
			    "ue-TransmittedPowerTDD-List",
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
					"UL_TimingAdvance"
				    ),
				    new QName (
					"InformationElements",
					"UL-TimingAdvance"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new UL_TimingAdvance(0), 
					    new UL_TimingAdvance(63),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(63)
				    ),
				    null
				)
			    ),
			    "appliedTA",
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Tdd();
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
		"rrc.informationelements",
		"UE_InternalMeasuredResults$ModeSpecificInfo"
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
			    new QName (
				"rrc.informationelements",
				"UE_InternalMeasuredResults$ModeSpecificInfo$Fdd"
			    )
			),
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UE_InternalMeasuredResults$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

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
	    "UE_InternalMeasuredResults"
	),
	new QName (
	    "InformationElements",
	    "UE-InternalMeasuredResults"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_InternalMeasuredResults$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_InternalMeasuredResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_InternalMeasuredResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_InternalMeasuredResults
