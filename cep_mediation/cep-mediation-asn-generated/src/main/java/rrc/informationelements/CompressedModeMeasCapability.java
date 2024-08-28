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
 * Define the ASN1 Type CompressedModeMeasCapability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CompressedModeMeasCapability extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompressedModeMeasCapability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompressedModeMeasCapability(BOOLEAN fdd_Measurements, 
		    BOOLEAN tdd_Measurements, 
		    GSM_Measurements gsm_Measurements, 
		    BOOLEAN multiCarrierMeasurements)
    {
	setFdd_Measurements(fdd_Measurements);
	setTdd_Measurements(tdd_Measurements);
	setGsm_Measurements(gsm_Measurements);
	setMultiCarrierMeasurements(multiCarrierMeasurements);
    }
    
    /**
     * Construct with components.
     */
    public CompressedModeMeasCapability(boolean fdd_Measurements, 
		    boolean tdd_Measurements, 
		    GSM_Measurements gsm_Measurements, 
		    boolean multiCarrierMeasurements)
    {
	this(new BOOLEAN(fdd_Measurements), new BOOLEAN(tdd_Measurements), 
	     gsm_Measurements, new BOOLEAN(multiCarrierMeasurements));
    }
    
    /**
     * Construct with required components.
     */
    public CompressedModeMeasCapability(boolean fdd_Measurements)
    {
	setFdd_Measurements(fdd_Measurements);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new GSM_Measurements();
	mComponents[3] = new BOOLEAN();
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
		return new GSM_Measurements();
	    case 3:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "fdd_Measurements"
    public boolean getFdd_Measurements()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setFdd_Measurements(boolean fdd_Measurements)
    {
	setFdd_Measurements(new BOOLEAN(fdd_Measurements));
    }
    
    public void setFdd_Measurements(BOOLEAN fdd_Measurements)
    {
	mComponents[0] = fdd_Measurements;
    }
    
    
    // Methods for field "tdd_Measurements"
    public boolean getTdd_Measurements()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setTdd_Measurements(boolean tdd_Measurements)
    {
	setTdd_Measurements(new BOOLEAN(tdd_Measurements));
    }
    
    public void setTdd_Measurements(BOOLEAN tdd_Measurements)
    {
	mComponents[1] = tdd_Measurements;
    }
    
    public boolean hasTdd_Measurements()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTdd_Measurements()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "gsm_Measurements"
    public GSM_Measurements getGsm_Measurements()
    {
	return (GSM_Measurements)mComponents[2];
    }
    
    public void setGsm_Measurements(GSM_Measurements gsm_Measurements)
    {
	mComponents[2] = gsm_Measurements;
    }
    
    public boolean hasGsm_Measurements()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGsm_Measurements()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "multiCarrierMeasurements"
    public boolean getMultiCarrierMeasurements()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setMultiCarrierMeasurements(boolean multiCarrierMeasurements)
    {
	setMultiCarrierMeasurements(new BOOLEAN(multiCarrierMeasurements));
    }
    
    public void setMultiCarrierMeasurements(BOOLEAN multiCarrierMeasurements)
    {
	mComponents[3] = multiCarrierMeasurements;
    }
    
    public boolean hasMultiCarrierMeasurements()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMultiCarrierMeasurements()
    {
	setComponentAbsent(3);
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
	    "CompressedModeMeasCapability"
	),
	new QName (
	    "InformationElements",
	    "CompressedModeMeasCapability"
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
		    "fdd-Measurements",
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
		    "tdd-Measurements",
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
				"GSM_Measurements"
			    ),
			    new QName (
				"InformationElements",
				"GSM-Measurements"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "GSM_Measurements"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "GSM_Measurements"
				)
			    ),
			    0
			)
		    ),
		    "gsm-Measurements",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "multiCarrierMeasurements",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' CompressedModeMeasCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompressedModeMeasCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompressedModeMeasCapability
