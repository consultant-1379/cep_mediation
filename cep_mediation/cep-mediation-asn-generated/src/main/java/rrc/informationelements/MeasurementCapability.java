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
 * Define the ASN1 Type MeasurementCapability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementCapability extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementCapability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementCapability(CompressedModeMeasCapability downlinkCompressedMode, 
		    CompressedModeMeasCapability uplinkCompressedMode)
    {
	setDownlinkCompressedMode(downlinkCompressedMode);
	setUplinkCompressedMode(uplinkCompressedMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CompressedModeMeasCapability();
	mComponents[1] = new CompressedModeMeasCapability();
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
		return new CompressedModeMeasCapability();
	    case 1:
		return new CompressedModeMeasCapability();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "downlinkCompressedMode"
    public CompressedModeMeasCapability getDownlinkCompressedMode()
    {
	return (CompressedModeMeasCapability)mComponents[0];
    }
    
    public void setDownlinkCompressedMode(CompressedModeMeasCapability downlinkCompressedMode)
    {
	mComponents[0] = downlinkCompressedMode;
    }
    
    
    // Methods for field "uplinkCompressedMode"
    public CompressedModeMeasCapability getUplinkCompressedMode()
    {
	return (CompressedModeMeasCapability)mComponents[1];
    }
    
    public void setUplinkCompressedMode(CompressedModeMeasCapability uplinkCompressedMode)
    {
	mComponents[1] = uplinkCompressedMode;
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
	    "MeasurementCapability"
	),
	new QName (
	    "InformationElements",
	    "MeasurementCapability"
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
				"CompressedModeMeasCapability"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapability"
				)
			    ),
			    0
			)
		    ),
		    "downlinkCompressedMode",
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
				"CompressedModeMeasCapability"
			    ),
			    new QName (
				"InformationElements",
				"CompressedModeMeasCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapability"
				)
			    ),
			    0
			)
		    ),
		    "uplinkCompressedMode",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementCapability
