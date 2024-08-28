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
 * Define the ASN1 Type UE_Positioning_GANSS_AdditionalAssistanceDataRequest from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_AdditionalAssistanceDataRequest extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_AdditionalAssistanceDataRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_AdditionalAssistanceDataRequest(BOOLEAN ganssReferenceTime, 
		    BOOLEAN ganssreferenceLocation, 
		    BOOLEAN ganssIonosphericModel, 
		    GanssRequestedGenericAssistanceDataList ganssRequestedGenericAssistanceDataList)
    {
	setGanssReferenceTime(ganssReferenceTime);
	setGanssreferenceLocation(ganssreferenceLocation);
	setGanssIonosphericModel(ganssIonosphericModel);
	setGanssRequestedGenericAssistanceDataList(ganssRequestedGenericAssistanceDataList);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GANSS_AdditionalAssistanceDataRequest(boolean ganssReferenceTime, 
		    boolean ganssreferenceLocation, 
		    boolean ganssIonosphericModel, 
		    GanssRequestedGenericAssistanceDataList ganssRequestedGenericAssistanceDataList)
    {
	this(new BOOLEAN(ganssReferenceTime), 
	     new BOOLEAN(ganssreferenceLocation), 
	     new BOOLEAN(ganssIonosphericModel), 
	     ganssRequestedGenericAssistanceDataList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new GanssRequestedGenericAssistanceDataList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new GanssRequestedGenericAssistanceDataList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssReferenceTime"
    public boolean getGanssReferenceTime()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setGanssReferenceTime(boolean ganssReferenceTime)
    {
	setGanssReferenceTime(new BOOLEAN(ganssReferenceTime));
    }
    
    public void setGanssReferenceTime(BOOLEAN ganssReferenceTime)
    {
	mComponents[0] = ganssReferenceTime;
    }
    
    
    // Methods for field "ganssreferenceLocation"
    public boolean getGanssreferenceLocation()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setGanssreferenceLocation(boolean ganssreferenceLocation)
    {
	setGanssreferenceLocation(new BOOLEAN(ganssreferenceLocation));
    }
    
    public void setGanssreferenceLocation(BOOLEAN ganssreferenceLocation)
    {
	mComponents[1] = ganssreferenceLocation;
    }
    
    
    // Methods for field "ganssIonosphericModel"
    public boolean getGanssIonosphericModel()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setGanssIonosphericModel(boolean ganssIonosphericModel)
    {
	setGanssIonosphericModel(new BOOLEAN(ganssIonosphericModel));
    }
    
    public void setGanssIonosphericModel(BOOLEAN ganssIonosphericModel)
    {
	mComponents[2] = ganssIonosphericModel;
    }
    
    
    // Methods for field "ganssRequestedGenericAssistanceDataList"
    public GanssRequestedGenericAssistanceDataList getGanssRequestedGenericAssistanceDataList()
    {
	return (GanssRequestedGenericAssistanceDataList)mComponents[3];
    }
    
    public void setGanssRequestedGenericAssistanceDataList(GanssRequestedGenericAssistanceDataList ganssRequestedGenericAssistanceDataList)
    {
	mComponents[3] = ganssRequestedGenericAssistanceDataList;
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
	    "UE_Positioning_GANSS_AdditionalAssistanceDataRequest"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-AdditionalAssistanceDataRequest"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "ganssReferenceTime",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "ganssreferenceLocation",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "ganssIonosphericModel",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GanssRequestedGenericAssistanceDataList"
			    ),
			    new QName (
				"InformationElements",
				"GanssRequestedGenericAssistanceDataList"
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
				    "GanssReqGenericData"
				)
			    )
			)
		    ),
		    "ganssRequestedGenericAssistanceDataList",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AdditionalAssistanceDataRequest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AdditionalAssistanceDataRequest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_AdditionalAssistanceDataRequest
