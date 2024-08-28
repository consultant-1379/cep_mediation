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
 * Define the ASN1 Type InterRATMeasurement_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterRATMeasurement_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATMeasurement_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATMeasurement_r6(InterRATCellInfoList_r6 interRATCellInfoList, 
		    InterRATMeasQuantity interRATMeasQuantity, 
		    InterRATReportingQuantity interRATReportingQuantity, 
		    InterRATReportCriteria reportCriteria)
    {
	setInterRATCellInfoList(interRATCellInfoList);
	setInterRATMeasQuantity(interRATMeasQuantity);
	setInterRATReportingQuantity(interRATReportingQuantity);
	setReportCriteria(reportCriteria);
    }
    
    /**
     * Construct with required components.
     */
    public InterRATMeasurement_r6(InterRATReportCriteria reportCriteria)
    {
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new InterRATCellInfoList_r6();
	mComponents[1] = new InterRATMeasQuantity();
	mComponents[2] = new InterRATReportingQuantity();
	mComponents[3] = new InterRATReportCriteria();
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
		return new InterRATCellInfoList_r6();
	    case 1:
		return new InterRATMeasQuantity();
	    case 2:
		return new InterRATReportingQuantity();
	    case 3:
		return new InterRATReportCriteria();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interRATCellInfoList"
    public InterRATCellInfoList_r6 getInterRATCellInfoList()
    {
	return (InterRATCellInfoList_r6)mComponents[0];
    }
    
    public void setInterRATCellInfoList(InterRATCellInfoList_r6 interRATCellInfoList)
    {
	mComponents[0] = interRATCellInfoList;
    }
    
    public boolean hasInterRATCellInfoList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInterRATCellInfoList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "interRATMeasQuantity"
    public InterRATMeasQuantity getInterRATMeasQuantity()
    {
	return (InterRATMeasQuantity)mComponents[1];
    }
    
    public void setInterRATMeasQuantity(InterRATMeasQuantity interRATMeasQuantity)
    {
	mComponents[1] = interRATMeasQuantity;
    }
    
    public boolean hasInterRATMeasQuantity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteInterRATMeasQuantity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "interRATReportingQuantity"
    public InterRATReportingQuantity getInterRATReportingQuantity()
    {
	return (InterRATReportingQuantity)mComponents[2];
    }
    
    public void setInterRATReportingQuantity(InterRATReportingQuantity interRATReportingQuantity)
    {
	mComponents[2] = interRATReportingQuantity;
    }
    
    public boolean hasInterRATReportingQuantity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteInterRATReportingQuantity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "reportCriteria"
    public InterRATReportCriteria getReportCriteria()
    {
	return (InterRATReportCriteria)mComponents[3];
    }
    
    public void setReportCriteria(InterRATReportCriteria reportCriteria)
    {
	mComponents[3] = reportCriteria;
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
	    "InterRATMeasurement_r6"
	),
	new QName (
	    "InformationElements",
	    "InterRATMeasurement-r6"
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
				"InterRATCellInfoList_r6"
			    ),
			    new QName (
				"InformationElements",
				"InterRATCellInfoList-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATCellInfoList_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATCellInfoList_r6"
				)
			    ),
			    0
			)
		    ),
		    "interRATCellInfoList",
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
				"InterRATMeasQuantity"
			    ),
			    new QName (
				"InformationElements",
				"InterRATMeasQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATMeasQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATMeasQuantity"
				)
			    ),
			    0
			)
		    ),
		    "interRATMeasQuantity",
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
				"InterRATReportingQuantity"
			    ),
			    new QName (
				"InformationElements",
				"InterRATReportingQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATReportingQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATReportingQuantity"
				)
			    ),
			    0
			)
		    ),
		    "interRATReportingQuantity",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterRATReportCriteria"
			    ),
			    new QName (
				"InformationElements",
				"InterRATReportCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATReportCriteria"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "reportCriteria",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATMeasurement_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATMeasurement_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATMeasurement_r6
