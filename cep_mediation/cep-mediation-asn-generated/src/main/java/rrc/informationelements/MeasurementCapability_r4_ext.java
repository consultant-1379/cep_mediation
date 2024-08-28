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
 * Define the ASN1 Type MeasurementCapability_r4_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementCapability_r4_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementCapability_r4_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementCapability_r4_ext(CompressedModeMeasCapability_LCR_r4 downlinkCompressedMode_LCR, 
		    CompressedModeMeasCapability_LCR_r4 uplinkCompressedMode_LCR)
    {
	setDownlinkCompressedMode_LCR(downlinkCompressedMode_LCR);
	setUplinkCompressedMode_LCR(uplinkCompressedMode_LCR);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CompressedModeMeasCapability_LCR_r4();
	mComponents[1] = new CompressedModeMeasCapability_LCR_r4();
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
		return new CompressedModeMeasCapability_LCR_r4();
	    case 1:
		return new CompressedModeMeasCapability_LCR_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "downlinkCompressedMode_LCR"
    public CompressedModeMeasCapability_LCR_r4 getDownlinkCompressedMode_LCR()
    {
	return (CompressedModeMeasCapability_LCR_r4)mComponents[0];
    }
    
    public void setDownlinkCompressedMode_LCR(CompressedModeMeasCapability_LCR_r4 downlinkCompressedMode_LCR)
    {
	mComponents[0] = downlinkCompressedMode_LCR;
    }
    
    
    // Methods for field "uplinkCompressedMode_LCR"
    public CompressedModeMeasCapability_LCR_r4 getUplinkCompressedMode_LCR()
    {
	return (CompressedModeMeasCapability_LCR_r4)mComponents[1];
    }
    
    public void setUplinkCompressedMode_LCR(CompressedModeMeasCapability_LCR_r4 uplinkCompressedMode_LCR)
    {
	mComponents[1] = uplinkCompressedMode_LCR;
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
	    "MeasurementCapability_r4_ext"
	),
	new QName (
	    "InformationElements",
	    "MeasurementCapability-r4-ext"
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
				"CompressedModeMeasCapability_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapability-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapability_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapability_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "downlinkCompressedMode-LCR",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CompressedModeMeasCapability_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapability-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapability_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapability_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "uplinkCompressedMode-LCR",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementCapability_r4_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementCapability_r4_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementCapability_r4_ext
