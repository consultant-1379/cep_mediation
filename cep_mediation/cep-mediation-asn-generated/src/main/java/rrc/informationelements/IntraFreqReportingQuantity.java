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
 * Define the ASN1 Type IntraFreqReportingQuantity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraFreqReportingQuantity extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraFreqReportingQuantity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraFreqReportingQuantity(CellReportingQuantities activeSetReportingQuantities, 
		    CellReportingQuantities monitoredSetReportingQuantities, 
		    CellReportingQuantities detectedSetReportingQuantities)
    {
	setActiveSetReportingQuantities(activeSetReportingQuantities);
	setMonitoredSetReportingQuantities(monitoredSetReportingQuantities);
	setDetectedSetReportingQuantities(detectedSetReportingQuantities);
    }
    
    /**
     * Construct with required components.
     */
    public IntraFreqReportingQuantity(CellReportingQuantities activeSetReportingQuantities, 
		    CellReportingQuantities monitoredSetReportingQuantities)
    {
	setActiveSetReportingQuantities(activeSetReportingQuantities);
	setMonitoredSetReportingQuantities(monitoredSetReportingQuantities);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellReportingQuantities();
	mComponents[1] = new CellReportingQuantities();
	mComponents[2] = new CellReportingQuantities();
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
		return new CellReportingQuantities();
	    case 1:
		return new CellReportingQuantities();
	    case 2:
		return new CellReportingQuantities();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "activeSetReportingQuantities"
    public CellReportingQuantities getActiveSetReportingQuantities()
    {
	return (CellReportingQuantities)mComponents[0];
    }
    
    public void setActiveSetReportingQuantities(CellReportingQuantities activeSetReportingQuantities)
    {
	mComponents[0] = activeSetReportingQuantities;
    }
    
    
    // Methods for field "monitoredSetReportingQuantities"
    public CellReportingQuantities getMonitoredSetReportingQuantities()
    {
	return (CellReportingQuantities)mComponents[1];
    }
    
    public void setMonitoredSetReportingQuantities(CellReportingQuantities monitoredSetReportingQuantities)
    {
	mComponents[1] = monitoredSetReportingQuantities;
    }
    
    
    // Methods for field "detectedSetReportingQuantities"
    public CellReportingQuantities getDetectedSetReportingQuantities()
    {
	return (CellReportingQuantities)mComponents[2];
    }
    
    public void setDetectedSetReportingQuantities(CellReportingQuantities detectedSetReportingQuantities)
    {
	mComponents[2] = detectedSetReportingQuantities;
    }
    
    public boolean hasDetectedSetReportingQuantities()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDetectedSetReportingQuantities()
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
	    "rrc.informationelements",
	    "IntraFreqReportingQuantity"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqReportingQuantity"
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
				"CellReportingQuantities"
			    ),
			    new QName (
				"InformationElements",
				"CellReportingQuantities"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellReportingQuantities"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellReportingQuantities"
				)
			    ),
			    0
			)
		    ),
		    "activeSetReportingQuantities",
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
				"CellReportingQuantities"
			    ),
			    new QName (
				"InformationElements",
				"CellReportingQuantities"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellReportingQuantities"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellReportingQuantities"
				)
			    ),
			    0
			)
		    ),
		    "monitoredSetReportingQuantities",
		    1,
		    2,
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
				"CellReportingQuantities"
			    ),
			    new QName (
				"InformationElements",
				"CellReportingQuantities"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellReportingQuantities"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellReportingQuantities"
				)
			    ),
			    0
			)
		    ),
		    "detectedSetReportingQuantities",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqReportingQuantity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqReportingQuantity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqReportingQuantity
