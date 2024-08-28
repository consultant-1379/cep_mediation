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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CompressedModeMeasCapability_r4 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class CompressedModeMeasCapability_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompressedModeMeasCapability_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompressedModeMeasCapability_r4(BOOLEAN fdd_Measurements, 
		    BOOLEAN tdd384_Measurements, BOOLEAN tdd128_Measurements, 
		    rrc.informationelements.GSM_Measurements gsm_Measurements, 
		    BOOLEAN multiCarrierMeasurements)
    {
	setFdd_Measurements(fdd_Measurements);
	setTdd384_Measurements(tdd384_Measurements);
	setTdd128_Measurements(tdd128_Measurements);
	setGsm_Measurements(gsm_Measurements);
	setMultiCarrierMeasurements(multiCarrierMeasurements);
    }
    
    /**
     * Construct with components.
     */
    public CompressedModeMeasCapability_r4(boolean fdd_Measurements, 
		    boolean tdd384_Measurements, boolean tdd128_Measurements, 
		    rrc.informationelements.GSM_Measurements gsm_Measurements, 
		    boolean multiCarrierMeasurements)
    {
	this(new BOOLEAN(fdd_Measurements), 
	     new BOOLEAN(tdd384_Measurements), 
	     new BOOLEAN(tdd128_Measurements), gsm_Measurements, 
	     new BOOLEAN(multiCarrierMeasurements));
    }
    
    /**
     * Construct with required components.
     */
    public CompressedModeMeasCapability_r4(boolean fdd_Measurements)
    {
	setFdd_Measurements(fdd_Measurements);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new rrc.informationelements.GSM_Measurements();
	mComponents[4] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
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
		return new rrc.informationelements.GSM_Measurements();
	    case 4:
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
    
    
    // Methods for field "tdd384_Measurements"
    public boolean getTdd384_Measurements()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setTdd384_Measurements(boolean tdd384_Measurements)
    {
	setTdd384_Measurements(new BOOLEAN(tdd384_Measurements));
    }
    
    public void setTdd384_Measurements(BOOLEAN tdd384_Measurements)
    {
	mComponents[1] = tdd384_Measurements;
    }
    
    public boolean hasTdd384_Measurements()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTdd384_Measurements()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "tdd128_Measurements"
    public boolean getTdd128_Measurements()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setTdd128_Measurements(boolean tdd128_Measurements)
    {
	setTdd128_Measurements(new BOOLEAN(tdd128_Measurements));
    }
    
    public void setTdd128_Measurements(BOOLEAN tdd128_Measurements)
    {
	mComponents[2] = tdd128_Measurements;
    }
    
    public boolean hasTdd128_Measurements()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTdd128_Measurements()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "gsm_Measurements"
    public rrc.informationelements.GSM_Measurements getGsm_Measurements()
    {
	return (rrc.informationelements.GSM_Measurements)mComponents[3];
    }
    
    public void setGsm_Measurements(rrc.informationelements.GSM_Measurements gsm_Measurements)
    {
	mComponents[3] = gsm_Measurements;
    }
    
    public boolean hasGsm_Measurements()
    {
	return componentIsPresent(3);
    }
    
    public void deleteGsm_Measurements()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "multiCarrierMeasurements"
    public boolean getMultiCarrierMeasurements()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setMultiCarrierMeasurements(boolean multiCarrierMeasurements)
    {
	setMultiCarrierMeasurements(new BOOLEAN(multiCarrierMeasurements));
    }
    
    public void setMultiCarrierMeasurements(BOOLEAN multiCarrierMeasurements)
    {
	mComponents[4] = multiCarrierMeasurements;
    }
    
    public boolean hasMultiCarrierMeasurements()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMultiCarrierMeasurements()
    {
	setComponentAbsent(4);
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
	    "rrc.internode_definitions",
	    "CompressedModeMeasCapability_r4"
	),
	new QName (
	    "Internode-definitions",
	    "CompressedModeMeasCapability-r4"
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
		    "tdd384-Measurements",
		    1,
		    3,
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
		    "tdd128-Measurements",
		    2,
		    3,
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
		    "multiCarrierMeasurements",
		    4,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CompressedModeMeasCapability_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompressedModeMeasCapability_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompressedModeMeasCapability_r4
