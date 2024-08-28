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
 * Define the ASN1 Type UE_InternalMeasQuantity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_InternalMeasQuantity extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_InternalMeasQuantity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_InternalMeasQuantity(UE_MeasurementQuantity measurementQuantity, 
		    FilterCoefficient filterCoefficient)
    {
	setMeasurementQuantity(measurementQuantity);
	setFilterCoefficient(filterCoefficient);
    }
    
    /**
     * Construct with required components.
     */
    public UE_InternalMeasQuantity(UE_MeasurementQuantity measurementQuantity)
    {
	setMeasurementQuantity(measurementQuantity);
    }
    
    public void initComponents()
    {
	mComponents[0] = UE_MeasurementQuantity.ue_TransmittedPower;
	mComponents[1] = FilterCoefficient.fc0;
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
		return UE_MeasurementQuantity.ue_TransmittedPower;
	    case 1:
		return FilterCoefficient.fc0;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final FilterCoefficient filterCoefficient__default = 
	FilterCoefficient.fc0;
    
    // Methods for field "measurementQuantity"
    public UE_MeasurementQuantity getMeasurementQuantity()
    {
	return (UE_MeasurementQuantity)mComponents[0];
    }
    
    public void setMeasurementQuantity(UE_MeasurementQuantity measurementQuantity)
    {
	mComponents[0] = measurementQuantity;
    }
    
    
    // Methods for field "filterCoefficient"
    public FilterCoefficient getFilterCoefficient()
    {
	if (hasFilterCoefficient())
	    return (FilterCoefficient)mComponents[1];
	else
	    return (FilterCoefficient)filterCoefficient__default.clone();
    }
    
    public void setFilterCoefficient(FilterCoefficient filterCoefficient)
    {
	mComponents[1] = filterCoefficient;
    }
    
    public void setFilterCoefficientToDefault()
    {
	setFilterCoefficient(filterCoefficient__default);
    }
    
    public boolean hasDefaultFilterCoefficient()
    {
	return true;
    }
    
    public boolean hasFilterCoefficient()
    {
	return componentIsPresent(1);
    }
    
    public void deleteFilterCoefficient()
    {
	setComponentAbsent(1);
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
	    "UE_InternalMeasQuantity"
	),
	new QName (
	    "InformationElements",
	    "UE-InternalMeasQuantity"
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
				"UE_MeasurementQuantity"
			    ),
			    new QName (
				"InformationElements",
				"UE-MeasurementQuantity"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ue-TransmittedPower",
					0
				    ),
				    new MemberListElement (
					"utra-Carrier-RSSI",
					1
				    ),
				    new MemberListElement (
					"ue-RX-TX-TimeDifference",
					2
				    )
				}
			    ),
			    0,
			    UE_MeasurementQuantity.ue_TransmittedPower
			)
		    ),
		    "measurementQuantity",
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
				"FilterCoefficient"
			    ),
			    new QName (
				"InformationElements",
				"FilterCoefficient"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"fc0",
					0
				    ),
				    new MemberListElement (
					"fc1",
					1
				    ),
				    new MemberListElement (
					"fc2",
					2
				    ),
				    new MemberListElement (
					"fc3",
					3
				    ),
				    new MemberListElement (
					"fc4",
					4
				    ),
				    new MemberListElement (
					"fc5",
					5
				    ),
				    new MemberListElement (
					"fc6",
					6
				    ),
				    new MemberListElement (
					"fc7",
					7
				    ),
				    new MemberListElement (
					"fc8",
					8
				    ),
				    new MemberListElement (
					"fc9",
					9
				    ),
				    new MemberListElement (
					"fc11",
					10
				    ),
				    new MemberListElement (
					"fc13",
					11
				    ),
				    new MemberListElement (
					"fc15",
					12
				    ),
				    new MemberListElement (
					"fc17",
					13
				    ),
				    new MemberListElement (
					"fc19",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    FilterCoefficient.fc0
			)
		    ),
		    "filterCoefficient",
		    1,
		    3,
		    filterCoefficient__default
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
     * Get the type descriptor (TypeInfo) of 'this' UE_InternalMeasQuantity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_InternalMeasQuantity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_InternalMeasQuantity
