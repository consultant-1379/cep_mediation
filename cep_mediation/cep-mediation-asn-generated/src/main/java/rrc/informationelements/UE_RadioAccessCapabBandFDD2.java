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
 * Define the ASN1 Type UE_RadioAccessCapabBandFDD2 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabBandFDD2 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabBandFDD2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabBandFDD2(RadioFrequencyBandFDD2 radioFrequencyBandFDD2, 
		    FddRF_Capability fddRF_Capability, 
		    MeasurementCapabilityExt2 measurementCapability2)
    {
	setRadioFrequencyBandFDD2(radioFrequencyBandFDD2);
	setFddRF_Capability(fddRF_Capability);
	setMeasurementCapability2(measurementCapability2);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapabBandFDD2(RadioFrequencyBandFDD2 radioFrequencyBandFDD2, 
		    MeasurementCapabilityExt2 measurementCapability2)
    {
	setRadioFrequencyBandFDD2(radioFrequencyBandFDD2);
	setMeasurementCapability2(measurementCapability2);
    }
    
    public void initComponents()
    {
	mComponents[0] = RadioFrequencyBandFDD2.bandVIII;
	mComponents[1] = new FddRF_Capability();
	mComponents[2] = new MeasurementCapabilityExt2();
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
		return RadioFrequencyBandFDD2.bandVIII;
	    case 1:
		return new FddRF_Capability();
	    case 2:
		return new MeasurementCapabilityExt2();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "radioFrequencyBandFDD2"
    public RadioFrequencyBandFDD2 getRadioFrequencyBandFDD2()
    {
	return (RadioFrequencyBandFDD2)mComponents[0];
    }
    
    public void setRadioFrequencyBandFDD2(RadioFrequencyBandFDD2 radioFrequencyBandFDD2)
    {
	mComponents[0] = radioFrequencyBandFDD2;
    }
    
    
    // Methods for field "fddRF_Capability"
    public FddRF_Capability getFddRF_Capability()
    {
	return (FddRF_Capability)mComponents[1];
    }
    
    public void setFddRF_Capability(FddRF_Capability fddRF_Capability)
    {
	mComponents[1] = fddRF_Capability;
    }
    
    public boolean hasFddRF_Capability()
    {
	return componentIsPresent(1);
    }
    
    public void deleteFddRF_Capability()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type FddRF_Capability from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class FddRF_Capability extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public FddRF_Capability()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public FddRF_Capability(UE_PowerClassExt ue_PowerClass, 
			TxRxFrequencySeparation txRxFrequencySeparation)
	{
	    setUe_PowerClass(ue_PowerClass);
	    setTxRxFrequencySeparation(txRxFrequencySeparation);
	}
	
	public void initComponents()
	{
	    mComponents[0] = UE_PowerClassExt.class1;
	    mComponents[1] = TxRxFrequencySeparation.default_TxRx_separation;
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
		    return UE_PowerClassExt.class1;
		case 1:
		    return TxRxFrequencySeparation.default_TxRx_separation;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ue_PowerClass"
	public UE_PowerClassExt getUe_PowerClass()
	{
	    return (UE_PowerClassExt)mComponents[0];
	}
	
	public void setUe_PowerClass(UE_PowerClassExt ue_PowerClass)
	{
	    mComponents[0] = ue_PowerClass;
	}
	
	
	// Methods for field "txRxFrequencySeparation"
	public TxRxFrequencySeparation getTxRxFrequencySeparation()
	{
	    return (TxRxFrequencySeparation)mComponents[1];
	}
	
	public void setTxRxFrequencySeparation(TxRxFrequencySeparation txRxFrequencySeparation)
	{
	    mComponents[1] = txRxFrequencySeparation;
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
		"UE_RadioAccessCapabBandFDD2$FddRF_Capability"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UE_PowerClassExt"
				),
				new QName (
				    "InformationElements",
				    "UE-PowerClassExt"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "class1",
					    0
					),
					new MemberListElement (
					    "class2",
					    1
					),
					new MemberListElement (
					    "class3",
					    2
					),
					new MemberListElement (
					    "class4",
					    3
					),
					new MemberListElement (
					    "spare4",
					    4
					),
					new MemberListElement (
					    "spare3",
					    5
					),
					new MemberListElement (
					    "spare2",
					    6
					),
					new MemberListElement (
					    "spare1",
					    7
					)
				    }
				),
				0,
				UE_PowerClassExt.class1
			    )
			),
			"ue-PowerClass",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "TxRxFrequencySeparation"
				),
				new QName (
				    "InformationElements",
				    "TxRxFrequencySeparation"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "default-TxRx-separation",
					    0
					),
					new MemberListElement (
					    "spare2",
					    1
					),
					new MemberListElement (
					    "spare1",
					    2
					)
				    }
				),
				0,
				TxRxFrequencySeparation.default_TxRx_separation
			    )
			),
			"txRxFrequencySeparation",
			1,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' FddRF_Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' FddRF_Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for FddRF_Capability

    // Methods for field "measurementCapability2"
    public MeasurementCapabilityExt2 getMeasurementCapability2()
    {
	return (MeasurementCapabilityExt2)mComponents[2];
    }
    
    public void setMeasurementCapability2(MeasurementCapabilityExt2 measurementCapability2)
    {
	mComponents[2] = measurementCapability2;
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
	    "UE_RadioAccessCapabBandFDD2"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabBandFDD2"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RadioFrequencyBandFDD2"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandFDD2"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"bandVIII",
					0
				    ),
				    new MemberListElement (
					"bandIX",
					1
				    ),
				    new MemberListElement (
					"bandX",
					2
				    ),
				    new MemberListElement (
					"bandXI",
					3
				    ),
				    new MemberListElement (
					"bandXII",
					4
				    ),
				    new MemberListElement (
					"bandXIII",
					5
				    ),
				    new MemberListElement (
					"bandXIV",
					6
				    ),
				    new MemberListElement (
					"bandXV",
					7
				    ),
				    new MemberListElement (
					"bandXVI",
					8
				    ),
				    new MemberListElement (
					"bandXVII",
					9
				    ),
				    new MemberListElement (
					"bandXVIII",
					10
				    ),
				    new MemberListElement (
					"bandXIX",
					11
				    ),
				    new MemberListElement (
					"bandXX",
					12
				    ),
				    new MemberListElement (
					"bandXXI",
					13
				    ),
				    new MemberListElement (
					"bandXXII",
					14
				    ),
				    new MemberListElement (
					"extension-indicator",
					15
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandFDD2.bandVIII
			)
		    ),
		    "radioFrequencyBandFDD2",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabBandFDD2$FddRF_Capability"
			)
		    ),
		    "fddRF-Capability",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasurementCapabilityExt2"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementCapabilityExt2"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapabilityExt2"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapabilityExt2"
				)
			    ),
			    0
			)
		    ),
		    "measurementCapability2",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabBandFDD2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabBandFDD2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabBandFDD2
