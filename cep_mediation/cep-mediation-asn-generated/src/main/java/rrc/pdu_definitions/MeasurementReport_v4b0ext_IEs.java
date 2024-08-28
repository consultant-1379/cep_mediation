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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MeasurementReport_v4b0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementReport_v4b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementReport_v4b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementReport_v4b0ext_IEs(rrc.informationelements.InterFreqEventResults_LCR_r4_ext interFreqEventResults_LCR, 
		    rrc.informationelements.MeasuredResultsList_LCR_r4_ext additionalMeasuredResults_LCR, 
		    rrc.informationelements.PrimaryCPICH_Info dummy)
    {
	setInterFreqEventResults_LCR(interFreqEventResults_LCR);
	setAdditionalMeasuredResults_LCR(additionalMeasuredResults_LCR);
	setDummy(dummy);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.InterFreqEventResults_LCR_r4_ext();
	mComponents[1] = new rrc.informationelements.MeasuredResultsList_LCR_r4_ext();
	mComponents[2] = new rrc.informationelements.PrimaryCPICH_Info();
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
		return new rrc.informationelements.InterFreqEventResults_LCR_r4_ext();
	    case 1:
		return new rrc.informationelements.MeasuredResultsList_LCR_r4_ext();
	    case 2:
		return new rrc.informationelements.PrimaryCPICH_Info();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interFreqEventResults_LCR"
    public rrc.informationelements.InterFreqEventResults_LCR_r4_ext getInterFreqEventResults_LCR()
    {
	return (rrc.informationelements.InterFreqEventResults_LCR_r4_ext)mComponents[0];
    }
    
    public void setInterFreqEventResults_LCR(rrc.informationelements.InterFreqEventResults_LCR_r4_ext interFreqEventResults_LCR)
    {
	mComponents[0] = interFreqEventResults_LCR;
    }
    
    public boolean hasInterFreqEventResults_LCR()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInterFreqEventResults_LCR()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "additionalMeasuredResults_LCR"
    public rrc.informationelements.MeasuredResultsList_LCR_r4_ext getAdditionalMeasuredResults_LCR()
    {
	return (rrc.informationelements.MeasuredResultsList_LCR_r4_ext)mComponents[1];
    }
    
    public void setAdditionalMeasuredResults_LCR(rrc.informationelements.MeasuredResultsList_LCR_r4_ext additionalMeasuredResults_LCR)
    {
	mComponents[1] = additionalMeasuredResults_LCR;
    }
    
    public boolean hasAdditionalMeasuredResults_LCR()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAdditionalMeasuredResults_LCR()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dummy"
    public rrc.informationelements.PrimaryCPICH_Info getDummy()
    {
	return (rrc.informationelements.PrimaryCPICH_Info)mComponents[2];
    }
    
    public void setDummy(rrc.informationelements.PrimaryCPICH_Info dummy)
    {
	mComponents[2] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(2);
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
	    "rrc.pdu_definitions",
	    "MeasurementReport_v4b0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementReport-v4b0ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterFreqEventResults_LCR_r4_ext"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqEventResults-LCR-r4-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqEventResults_LCR_r4_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqEventResults_LCR_r4_ext"
				)
			    ),
			    0
			)
		    ),
		    "interFreqEventResults-LCR",
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
				"MeasuredResultsList_LCR_r4_ext"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsList-LCR-r4-ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResults_LCR_r4"
				)
			    )
			)
		    ),
		    "additionalMeasuredResults-LCR",
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
		    "dummy",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MeasurementReport_v4b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementReport_v4b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementReport_v4b0ext_IEs
