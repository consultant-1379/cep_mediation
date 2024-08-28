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
 * Define the ASN1 Type UE_RadioAccessCapabBandFDD5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabBandFDD5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabBandFDD5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabBandFDD5(RadioFrequencyBandFDD3 radioFrequencyBandFDD3, 
		    FddRF_Capability fddRF_Capability, 
		    MeasurementCapabilityExt4 measurementCapability4)
    {
	setRadioFrequencyBandFDD3(radioFrequencyBandFDD3);
	setFddRF_Capability(fddRF_Capability);
	setMeasurementCapability4(measurementCapability4);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapabBandFDD5(RadioFrequencyBandFDD3 radioFrequencyBandFDD3, 
		    MeasurementCapabilityExt4 measurementCapability4)
    {
	setRadioFrequencyBandFDD3(radioFrequencyBandFDD3);
	setMeasurementCapability4(measurementCapability4);
    }
    
    public void initComponents()
    {
	mComponents[0] = RadioFrequencyBandFDD3.spare64;
	mComponents[1] = new FddRF_Capability();
	mComponents[2] = new MeasurementCapabilityExt4();
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
		return RadioFrequencyBandFDD3.spare64;
	    case 1:
		return new FddRF_Capability();
	    case 2:
		return new MeasurementCapabilityExt4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "radioFrequencyBandFDD3"
    public RadioFrequencyBandFDD3 getRadioFrequencyBandFDD3()
    {
	return (RadioFrequencyBandFDD3)mComponents[0];
    }
    
    public void setRadioFrequencyBandFDD3(RadioFrequencyBandFDD3 radioFrequencyBandFDD3)
    {
	mComponents[0] = radioFrequencyBandFDD3;
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
		"UE_RadioAccessCapabBandFDD5$FddRF_Capability"
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

    // Methods for field "measurementCapability4"
    public MeasurementCapabilityExt4 getMeasurementCapability4()
    {
	return (MeasurementCapabilityExt4)mComponents[2];
    }
    
    public void setMeasurementCapability4(MeasurementCapabilityExt4 measurementCapability4)
    {
	mComponents[2] = measurementCapability4;
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
	    "UE_RadioAccessCapabBandFDD5"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabBandFDD5"
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
				"RadioFrequencyBandFDD3"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandFDD3"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"spare64",
					0
				    ),
				    new MemberListElement (
					"spare63",
					1
				    ),
				    new MemberListElement (
					"bandXXV",
					2
				    ),
				    new MemberListElement (
					"spare61",
					3
				    ),
				    new MemberListElement (
					"spare60",
					4
				    ),
				    new MemberListElement (
					"spare59",
					5
				    ),
				    new MemberListElement (
					"spare58",
					6
				    ),
				    new MemberListElement (
					"spare57",
					7
				    ),
				    new MemberListElement (
					"spare56",
					8
				    ),
				    new MemberListElement (
					"spare55",
					9
				    ),
				    new MemberListElement (
					"spare54",
					10
				    ),
				    new MemberListElement (
					"spare53",
					11
				    ),
				    new MemberListElement (
					"spare52",
					12
				    ),
				    new MemberListElement (
					"spare51",
					13
				    ),
				    new MemberListElement (
					"spare50",
					14
				    ),
				    new MemberListElement (
					"spare49",
					15
				    ),
				    new MemberListElement (
					"spare48",
					16
				    ),
				    new MemberListElement (
					"spare47",
					17
				    ),
				    new MemberListElement (
					"spare46",
					18
				    ),
				    new MemberListElement (
					"spare45",
					19
				    ),
				    new MemberListElement (
					"spare44",
					20
				    ),
				    new MemberListElement (
					"spare43",
					21
				    ),
				    new MemberListElement (
					"spare42",
					22
				    ),
				    new MemberListElement (
					"spare41",
					23
				    ),
				    new MemberListElement (
					"spare40",
					24
				    ),
				    new MemberListElement (
					"spare39",
					25
				    ),
				    new MemberListElement (
					"spare38",
					26
				    ),
				    new MemberListElement (
					"spare37",
					27
				    ),
				    new MemberListElement (
					"spare36",
					28
				    ),
				    new MemberListElement (
					"spare35",
					29
				    ),
				    new MemberListElement (
					"spare34",
					30
				    ),
				    new MemberListElement (
					"spare33",
					31
				    ),
				    new MemberListElement (
					"spare32",
					32
				    ),
				    new MemberListElement (
					"spare31",
					33
				    ),
				    new MemberListElement (
					"spare30",
					34
				    ),
				    new MemberListElement (
					"spare29",
					35
				    ),
				    new MemberListElement (
					"spare28",
					36
				    ),
				    new MemberListElement (
					"spare27",
					37
				    ),
				    new MemberListElement (
					"spare26",
					38
				    ),
				    new MemberListElement (
					"spare25",
					39
				    ),
				    new MemberListElement (
					"spare24",
					40
				    ),
				    new MemberListElement (
					"spare23",
					41
				    ),
				    new MemberListElement (
					"spare22",
					42
				    ),
				    new MemberListElement (
					"spare21",
					43
				    ),
				    new MemberListElement (
					"spare20",
					44
				    ),
				    new MemberListElement (
					"spare19",
					45
				    ),
				    new MemberListElement (
					"spare18",
					46
				    ),
				    new MemberListElement (
					"spare17",
					47
				    ),
				    new MemberListElement (
					"spare16",
					48
				    ),
				    new MemberListElement (
					"spare15",
					49
				    ),
				    new MemberListElement (
					"spare14",
					50
				    ),
				    new MemberListElement (
					"spare13",
					51
				    ),
				    new MemberListElement (
					"spare12",
					52
				    ),
				    new MemberListElement (
					"spare11",
					53
				    ),
				    new MemberListElement (
					"spare10",
					54
				    ),
				    new MemberListElement (
					"spare9",
					55
				    ),
				    new MemberListElement (
					"spare8",
					56
				    ),
				    new MemberListElement (
					"spare7",
					57
				    ),
				    new MemberListElement (
					"spare6",
					58
				    ),
				    new MemberListElement (
					"spare5",
					59
				    ),
				    new MemberListElement (
					"spare4",
					60
				    ),
				    new MemberListElement (
					"spare3",
					61
				    ),
				    new MemberListElement (
					"spare2",
					62
				    ),
				    new MemberListElement (
					"extension-indicator",
					63
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandFDD3.spare64
			)
		    ),
		    "radioFrequencyBandFDD3",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabBandFDD5$FddRF_Capability"
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
				"MeasurementCapabilityExt4"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementCapabilityExt4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapabilityExt4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapabilityExt4"
				)
			    ),
			    0
			)
		    ),
		    "measurementCapability4",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabBandFDD5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabBandFDD5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabBandFDD5
