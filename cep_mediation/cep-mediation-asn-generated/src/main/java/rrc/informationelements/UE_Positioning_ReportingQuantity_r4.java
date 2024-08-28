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
 * Define the ASN1 Type UE_Positioning_ReportingQuantity_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_ReportingQuantity_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_ReportingQuantity_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_ReportingQuantity_r4(UE_Positioning_MethodType methodType, 
		    PositioningMethod positioningMethod, 
		    UE_Positioning_Accuracy horizontalAccuracy, 
		    UE_Positioning_Accuracy verticalAccuracy, 
		    BOOLEAN gps_TimingOfCellWanted, 
		    BOOLEAN additionalAssistanceDataReq, 
		    EnvironmentCharacterisation environmentCharacterisation)
    {
	setMethodType(methodType);
	setPositioningMethod(positioningMethod);
	setHorizontalAccuracy(horizontalAccuracy);
	setVerticalAccuracy(verticalAccuracy);
	setGps_TimingOfCellWanted(gps_TimingOfCellWanted);
	setAdditionalAssistanceDataReq(additionalAssistanceDataReq);
	setEnvironmentCharacterisation(environmentCharacterisation);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_ReportingQuantity_r4(UE_Positioning_MethodType methodType, 
		    PositioningMethod positioningMethod, 
		    UE_Positioning_Accuracy horizontalAccuracy, 
		    UE_Positioning_Accuracy verticalAccuracy, 
		    boolean gps_TimingOfCellWanted, 
		    boolean additionalAssistanceDataReq, 
		    EnvironmentCharacterisation environmentCharacterisation)
    {
	this(methodType, positioningMethod, horizontalAccuracy, 
	     verticalAccuracy, new BOOLEAN(gps_TimingOfCellWanted), 
	     new BOOLEAN(additionalAssistanceDataReq), 
	     environmentCharacterisation);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_ReportingQuantity_r4(UE_Positioning_MethodType methodType, 
		    PositioningMethod positioningMethod, 
		    boolean gps_TimingOfCellWanted, 
		    boolean additionalAssistanceDataReq)
    {
	setMethodType(methodType);
	setPositioningMethod(positioningMethod);
	setGps_TimingOfCellWanted(gps_TimingOfCellWanted);
	setAdditionalAssistanceDataReq(additionalAssistanceDataReq);
    }
    
    public void initComponents()
    {
	mComponents[0] = UE_Positioning_MethodType.ue_Assisted;
	mComponents[1] = PositioningMethod.otdoa;
	mComponents[2] = new UE_Positioning_Accuracy();
	mComponents[3] = new UE_Positioning_Accuracy();
	mComponents[4] = new BOOLEAN();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = EnvironmentCharacterisation.possibleHeavyMultipathNLOS;
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
		return UE_Positioning_MethodType.ue_Assisted;
	    case 1:
		return PositioningMethod.otdoa;
	    case 2:
		return new UE_Positioning_Accuracy();
	    case 3:
		return new UE_Positioning_Accuracy();
	    case 4:
		return new BOOLEAN();
	    case 5:
		return new BOOLEAN();
	    case 6:
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
    
    
    // Methods for field "horizontalAccuracy"
    public UE_Positioning_Accuracy getHorizontalAccuracy()
    {
	return (UE_Positioning_Accuracy)mComponents[2];
    }
    
    public void setHorizontalAccuracy(UE_Positioning_Accuracy horizontalAccuracy)
    {
	mComponents[2] = horizontalAccuracy;
    }
    
    public boolean hasHorizontalAccuracy()
    {
	return componentIsPresent(2);
    }
    
    public void deleteHorizontalAccuracy()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "verticalAccuracy"
    public UE_Positioning_Accuracy getVerticalAccuracy()
    {
	return (UE_Positioning_Accuracy)mComponents[3];
    }
    
    public void setVerticalAccuracy(UE_Positioning_Accuracy verticalAccuracy)
    {
	mComponents[3] = verticalAccuracy;
    }
    
    public boolean hasVerticalAccuracy()
    {
	return componentIsPresent(3);
    }
    
    public void deleteVerticalAccuracy()
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
    
    
    // Methods for field "additionalAssistanceDataReq"
    public boolean getAdditionalAssistanceDataReq()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setAdditionalAssistanceDataReq(boolean additionalAssistanceDataReq)
    {
	setAdditionalAssistanceDataReq(new BOOLEAN(additionalAssistanceDataReq));
    }
    
    public void setAdditionalAssistanceDataReq(BOOLEAN additionalAssistanceDataReq)
    {
	mComponents[5] = additionalAssistanceDataReq;
    }
    
    
    // Methods for field "environmentCharacterisation"
    public EnvironmentCharacterisation getEnvironmentCharacterisation()
    {
	return (EnvironmentCharacterisation)mComponents[6];
    }
    
    public void setEnvironmentCharacterisation(EnvironmentCharacterisation environmentCharacterisation)
    {
	mComponents[6] = environmentCharacterisation;
    }
    
    public boolean hasEnvironmentCharacterisation()
    {
	return componentIsPresent(6);
    }
    
    public void deleteEnvironmentCharacterisation()
    {
	setComponentAbsent(6);
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
	    "UE_Positioning_ReportingQuantity_r4"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-ReportingQuantity-r4"
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
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "horizontalAccuracy",
		    2,
		    3,
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
		    "verticalAccuracy",
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
		    "additionalAssistanceDataReq",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_ReportingQuantity_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_ReportingQuantity_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_ReportingQuantity_r4
