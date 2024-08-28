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
 * Define the ASN1 Type HSDSCH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HSDSCH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public HSDSCH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HSDSCH_Info(HARQ_Info harqInfo, 
		    AddOrReconfMAC_dFlow addOrReconfMAC_dFlow)
    {
	setHarqInfo(harqInfo);
	setAddOrReconfMAC_dFlow(addOrReconfMAC_dFlow);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HARQ_Info();
	mComponents[1] = new AddOrReconfMAC_dFlow();
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
		return new HARQ_Info();
	    case 1:
		return new AddOrReconfMAC_dFlow();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "harqInfo"
    public HARQ_Info getHarqInfo()
    {
	return (HARQ_Info)mComponents[0];
    }
    
    public void setHarqInfo(HARQ_Info harqInfo)
    {
	mComponents[0] = harqInfo;
    }
    
    public boolean hasHarqInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHarqInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "addOrReconfMAC_dFlow"
    public AddOrReconfMAC_dFlow getAddOrReconfMAC_dFlow()
    {
	return (AddOrReconfMAC_dFlow)mComponents[1];
    }
    
    public void setAddOrReconfMAC_dFlow(AddOrReconfMAC_dFlow addOrReconfMAC_dFlow)
    {
	mComponents[1] = addOrReconfMAC_dFlow;
    }
    
    public boolean hasAddOrReconfMAC_dFlow()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAddOrReconfMAC_dFlow()
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
	    "HSDSCH_Info"
	),
	new QName (
	    "InformationElements",
	    "HSDSCH-Info"
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
				"HARQ_Info"
			    ),
			    new QName (
				"InformationElements",
				"HARQ-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info"
				)
			    ),
			    0
			)
		    ),
		    "harqInfo",
		    0,
		    3,
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
				"AddOrReconfMAC_dFlow"
			    ),
			    new QName (
				"InformationElements",
				"AddOrReconfMAC-dFlow"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "AddOrReconfMAC_dFlow"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "AddOrReconfMAC_dFlow"
				)
			    ),
			    0
			)
		    ),
		    "addOrReconfMAC-dFlow",
		    1,
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
     * Get the type descriptor (TypeInfo) of 'this' HSDSCH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HSDSCH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HSDSCH_Info
