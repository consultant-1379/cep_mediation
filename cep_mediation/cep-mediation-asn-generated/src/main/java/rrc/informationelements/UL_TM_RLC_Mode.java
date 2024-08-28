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
 * Define the ASN1 Type UL_TM_RLC_Mode from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_TM_RLC_Mode extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_TM_RLC_Mode()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_TM_RLC_Mode(TransmissionRLC_Discard transmissionRLC_Discard, 
		    BOOLEAN segmentationIndication)
    {
	setTransmissionRLC_Discard(transmissionRLC_Discard);
	setSegmentationIndication(segmentationIndication);
    }
    
    /**
     * Construct with components.
     */
    public UL_TM_RLC_Mode(TransmissionRLC_Discard transmissionRLC_Discard, 
		    boolean segmentationIndication)
    {
	this(transmissionRLC_Discard, new BOOLEAN(segmentationIndication));
    }
    
    /**
     * Construct with required components.
     */
    public UL_TM_RLC_Mode(boolean segmentationIndication)
    {
	setSegmentationIndication(segmentationIndication);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TransmissionRLC_Discard();
	mComponents[1] = new BOOLEAN();
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
		return new TransmissionRLC_Discard();
	    case 1:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transmissionRLC_Discard"
    public TransmissionRLC_Discard getTransmissionRLC_Discard()
    {
	return (TransmissionRLC_Discard)mComponents[0];
    }
    
    public void setTransmissionRLC_Discard(TransmissionRLC_Discard transmissionRLC_Discard)
    {
	mComponents[0] = transmissionRLC_Discard;
    }
    
    public boolean hasTransmissionRLC_Discard()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTransmissionRLC_Discard()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "segmentationIndication"
    public boolean getSegmentationIndication()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setSegmentationIndication(boolean segmentationIndication)
    {
	setSegmentationIndication(new BOOLEAN(segmentationIndication));
    }
    
    public void setSegmentationIndication(BOOLEAN segmentationIndication)
    {
	mComponents[1] = segmentationIndication;
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
	    "UL_TM_RLC_Mode"
	),
	new QName (
	    "InformationElements",
	    "UL-TM-RLC-Mode"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransmissionRLC_Discard"
			    ),
			    new QName (
				"InformationElements",
				"TransmissionRLC-Discard"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TransmissionRLC_Discard"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    )
			)
		    ),
		    "transmissionRLC-Discard",
		    0,
		    3,
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
		    "segmentationIndication",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' UL_TM_RLC_Mode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TM_RLC_Mode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TM_RLC_Mode
