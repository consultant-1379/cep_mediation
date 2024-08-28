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
 * Define the ASN1 Type UE_Positioning_ReportingQuantity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_ReportingQuantity extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_ReportingQuantity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_ReportingQuantity(UE_Positioning_MethodType methodType, 
		    PositioningMethod positioningMethod, 
		    UE_Positioning_ResponseTime dummy1, 
		    UE_Positioning_Accuracy horizontal_Accuracy, 
		    BOOLEAN gps_TimingOfCellWanted, BOOLEAN dummy2, 
		    BOOLEAN additionalAssistanceDataRequest, 
		    EnvironmentCharacterisation environmentCharacterisation)
    {
	setMethodType(methodType);
	setPositioningMethod(positioningMethod);
	setDummy1(dummy1);
	setHorizontal_Accuracy(horizontal_Accuracy);
	setGps_TimingOfCellWanted(gps_TimingOfCellWanted);
	setDummy2(dummy2);
	setAdditionalAssistanceDataRequest(additionalAssistanceDataRequest);
	setEnvironmentCharacterisation(environmentCharacterisation);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_ReportingQuantity(UE_Positioning_MethodType methodType, 
		    PositioningMethod positioningMethod, 
		    UE_Positioning_ResponseTime dummy1, 
		    UE_Positioning_Accuracy horizontal_Accuracy, 
		    boolean gps_TimingOfCellWanted, boolean dummy2, 
		    boolean additionalAssistanceDataRequest, 
		    EnvironmentCharacterisation environmentCharacterisation)
    {
	this(methodType, positioningMethod, dummy1, horizontal_Accuracy, 
	     new BOOLEAN(gps_TimingOfCellWanted), new BOOLEAN(dummy2), 
	     new BOOLEAN(additionalAssistanceDataRequest), 
	     environmentCharacterisation);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_ReportingQuantity(UE_Positioning_MethodType methodType, 
		    PositioningMethod positioningMethod, 
		    UE_Positioning_ResponseTime dummy1, 
		    boolean gps_TimingOfCellWanted, boolean dummy2, 
		    boolean additionalAssistanceDataRequest)
    {
	setMethodType(methodType);
	setPositioningMethod(positioningMethod);
	setDummy1(dummy1);
	setGps_TimingOfCellWanted(gps_TimingOfCellWanted);
	setDummy2(dummy2);
	setAdditionalAssistanceDataRequest(additionalAssistanceDataRequest);
    }
    
    public void initComponents()
    {
	mComponents[0] = UE_Positioning_MethodType.ue_Assisted;
	mComponents[1] = PositioningMethod.otdoa;
	mComponents[2] = UE_Positioning_ResponseTime.s1;
	mComponents[3] = new UE_Positioning_Accuracy();
	mComponents[4] = new BOOLEAN();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = new BOOLEAN();
	mComponents[7] = EnvironmentCharacterisation.possibleHeavyMultipathNLOS;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return UE_Positioning_MethodType.ue_Assisted;
	    case 1:
		return PositioningMethod.otdoa;
	    case 2:
		return UE_Positioning_ResponseTime.s1;
	    case 3:
		return new UE_Positioning_Accuracy();
	    case 4:
		return new BOOLEAN();
	    case 5:
		return new BOOLEAN();
	    case 6:
		return new BOOLEAN();
	    case 7:
		return EnvironmentCharacterisation.possibleHeavyMultipathNLOS;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "methodType"
    public UE_Positioning_MethodType getMethodType()
    {
	return (UE_Positioning_MethodType)mComponents[0];
    }
    
    public void setMethodType(UE_Positioning_MethodType methodType)
    {
	mComponents[0] = methodType;
    }
    
    
    // Methods for field "positioningMethod"
    public PositioningMethod getPositioningMethod()
    {
	return (PositioningMethod)mComponents[1];
    }
    
    public void setPositioningMethod(PositioningMethod positioningMethod)
    {
	mComponents[1] = positioningMethod;
    }
    
    
    // Methods for field "dummy1"
    public UE_Positioning_ResponseTime getDummy1()
    {
	return (UE_Positioning_ResponseTime)mComponents[2];
    }
    
    public void setDummy1(UE_Positioning_ResponseTime dummy1)
    {
	mComponents[2] = dummy1;
    }
    
    
    // Methods for field "horizontal_Accuracy"
    public UE_Positioning_Accuracy getHorizontal_Accuracy()
    {
	return (UE_Positioning_Accuracy)mComponents[3];
    }
    
    public void setHorizontal_Accuracy(UE_Positioning_Accuracy horizontal_Accuracy)
    {
	mComponents[3] = horizontal_Accuracy;
    }
    
    public boolean hasHorizontal_Accuracy()
    {
	return componentIsPresent(3);
    }
    
    public void deleteHorizontal_Accuracy()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "gps_TimingOfCellWanted"
    public boolean getGps_TimingOfCellWanted()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setGps_TimingOfCellWanted(boolean gps_TimingOfCellWanted)
    {
	setGps_TimingOfCellWanted(new BOOLEAN(gps_TimingOfCellWanted));
    }
    
    public void setGps_TimingOfCellWanted(BOOLEAN gps_TimingOfCellWanted)
    {
	mComponents[4] = gps_TimingOfCellWanted;
    }
    
    
    // Methods for field "dummy2"
    public boolean getDummy2()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setDummy2(boolean dummy2)
    {
	setDummy2(new BOOLEAN(dummy2));
    }
    
    public void setDummy2(BOOLEAN dummy2)
    {
	mComponents[5] = dummy2;
    }
    
    
    // Methods for field "additionalAssistanceDataRequest"
    public boolean getAdditionalAssistanceDataRequest()
    {
	return ((BOOLEAN)mComponents[6]).booleanValue();
    }
    
    public void setAdditionalAssistanceDataRequest(boolean additionalAssistanceDataRequest)
    {
	setAdditionalAssistanceDataRequest(new BOOLEAN(additionalAssistanceDataRequest));
    }
    
    public void setAdditionalAssistanceDataRequest(BOOLEAN additionalAssistanceDataRequest)
    {
	mComponents[6] = additionalAssistanceDataRequest;
    }
    
    
    // Methods for field "environmentCharacterisation"
    public EnvironmentCharacterisation getEnvironmentCharacterisation()
    {
	return (EnvironmentCharacterisation)mComponents[7];
    }
    
    public void setEnvironmentCharacterisation(EnvironmentCharacterisation environmentCharacterisation)
    {
	mComponents[7] = environmentCharacterisation;
    }
    
    public boolean hasEnvironmentCharacterisation()
    {
	return componentIsPresent(7);
    }
    
    public void deleteEnvironmentCharacterisation()
    {
	setComponentAbsent(7);
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
	    "UE_Positioning_ReportingQuantity"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-ReportingQuantity"
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
				"UE_Positioning_MethodType"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-MethodType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ue-Assisted",
					0
				    ),
				    new MemberListElement (
					"ue-Based",
					1
				    ),
				    new MemberListElement (
					"ue-BasedPreferred",
					2
				    ),
				    new MemberListElement (
					"ue-AssistedPreferred",
					3
				    )
				}
			    ),
			    0,
			    UE_Positioning_MethodType.ue_Assisted
			)
		    ),
		    "methodType",
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
				"PositioningMethod"
			    ),
			    new QName (
				"InformationElements",
				"PositioningMethod"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"otdoa",
					0
				    ),
				    new MemberListElement (
					"gps",
					1
				    ),
				    new MemberListElement (
					"otdoaOrGPS",
					2
				    ),
				    new MemberListElement (
					"cellID",
					3
				    )
				}
			    ),
			    0,
			    PositioningMethod.otdoa
			)
		    ),
		    "positioningMethod",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_ResponseTime"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-ResponseTime"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"s1",
					0
				    ),
				    new MemberListElement (
					"s2",
					1
				    ),
				    new MemberListElement (
					"s4",
					2
				    ),
				    new MemberListElement (
					"s8",
					3
				    ),
				    new MemberListElement (
					"s16",
					4
				    ),
				    new MemberListElement (
					"s32",
					5
				    ),
				    new MemberListElement (
					"s64",
					6
				    ),
				    new MemberListElement (
					"s128",
					7
				    )
				}
			    ),
			    0,
			    UE_Positioning_ResponseTime.s1
			)
		    ),
		    "dummy1",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_Accuracy"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-Accuracy"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(7)
				)
			    ),
			    new Bounds (
				new java.lang.Long(7),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "horizontal-Accuracy",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "gps-TimingOfCellWanted",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "dummy2",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "additionalAssistanceDataRequest",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"EnvironmentCharacterisation"
			    ),
			    new QName (
				"InformationElements",
				"EnvironmentCharacterisation"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"possibleHeavyMultipathNLOS",
					0
				    ),
				    new MemberListElement (
					"lightMultipathLOS",
					1
				    ),
				    new MemberListElement (
					"notDefined",
					2
				    ),
				    new MemberListElement (
					"spare",
					3
				    )
				}
			    ),
			    0,
			    EnvironmentCharacterisation.possibleHeavyMultipathNLOS
			)
		    ),
		    "environmentCharacterisation",
		    7,
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
			new TagDecoderElement((short)0x8001, 1)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_ReportingQuantity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_ReportingQuantity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_ReportingQuantity
