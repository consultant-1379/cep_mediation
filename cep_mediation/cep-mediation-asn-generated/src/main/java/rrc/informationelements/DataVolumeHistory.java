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
 * Define the ASN1 Type DataVolumeHistory from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DataVolumeHistory extends Sequence {
    
    /**
     * The default constructor.
     */
    public DataVolumeHistory()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataVolumeHistory(INTEGER dataVolumeMontoringWindow, 
		    DataTransmFrequency dataTransmFrequency, 
		    DataVolumePerRB_List dataVolumePerRB)
    {
	setDataVolumeMontoringWindow(dataVolumeMontoringWindow);
	setDataTransmFrequency(dataTransmFrequency);
	setDataVolumePerRB(dataVolumePerRB);
    }
    
    /**
     * Construct with components.
     */
    public DataVolumeHistory(long dataVolumeMontoringWindow, 
		    DataTransmFrequency dataTransmFrequency, 
		    DataVolumePerRB_List dataVolumePerRB)
    {
	this(new INTEGER(dataVolumeMontoringWindow), dataTransmFrequency, 
	     dataVolumePerRB);
    }
    
    /**
     * Construct with required components.
     */
    public DataVolumeHistory(long dataVolumeMontoringWindow)
    {
	setDataVolumeMontoringWindow(dataVolumeMontoringWindow);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new DataTransmFrequency();
	mComponents[2] = new DataVolumePerRB_List();
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
		return new INTEGER();
	    case 1:
		return new DataTransmFrequency();
	    case 2:
		return new DataVolumePerRB_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dataVolumeMontoringWindow"
    public long getDataVolumeMontoringWindow()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDataVolumeMontoringWindow(long dataVolumeMontoringWindow)
    {
	setDataVolumeMontoringWindow(new INTEGER(dataVolumeMontoringWindow));
    }
    
    public void setDataVolumeMontoringWindow(INTEGER dataVolumeMontoringWindow)
    {
	mComponents[0] = dataVolumeMontoringWindow;
    }
    
    
    // Methods for field "dataTransmFrequency"
    public DataTransmFrequency getDataTransmFrequency()
    {
	return (DataTransmFrequency)mComponents[1];
    }
    
    public void setDataTransmFrequency(DataTransmFrequency dataTransmFrequency)
    {
	mComponents[1] = dataTransmFrequency;
    }
    
    public boolean hasDataTransmFrequency()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDataTransmFrequency()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dataVolumePerRB"
    public DataVolumePerRB_List getDataVolumePerRB()
    {
	return (DataVolumePerRB_List)mComponents[2];
    }
    
    public void setDataVolumePerRB(DataVolumePerRB_List dataVolumePerRB)
    {
	mComponents[2] = dataVolumePerRB;
    }
    
    public boolean hasDataVolumePerRB()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDataVolumePerRB()
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
	    "DataVolumeHistory"
	),
	new QName (
	    "InformationElements",
	    "DataVolumeHistory"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(120),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(120)
			    ),
			    null
			)
		    ),
		    "dataVolumeMontoringWindow",
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
				"DataTransmFrequency"
			    ),
			    new QName (
				"InformationElements",
				"DataTransmFrequency"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DataTransmFrequency"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DataTransmFrequency"
				)
			    ),
			    0
			)
		    ),
		    "dataTransmFrequency",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DataVolumePerRB_List"
			    ),
			    new QName (
				"InformationElements",
				"DataVolumePerRB-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DataVolumePerRB"
				)
			    )
			)
		    ),
		    "dataVolumePerRB",
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
     * Get the type descriptor (TypeInfo) of 'this' DataVolumeHistory object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DataVolumeHistory object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DataVolumeHistory
