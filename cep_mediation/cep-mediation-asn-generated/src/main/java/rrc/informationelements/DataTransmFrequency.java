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
 * Define the ASN1 Type DataTransmFrequency from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DataTransmFrequency extends Sequence {
    
    /**
     * The default constructor.
     */
    public DataTransmFrequency()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataTransmFrequency(DataTransmFreqGranularity dataTransmFreqGranularity, 
		    INTEGER numberOfDataTransmOcc)
    {
	setDataTransmFreqGranularity(dataTransmFreqGranularity);
	setNumberOfDataTransmOcc(numberOfDataTransmOcc);
    }
    
    /**
     * Construct with components.
     */
    public DataTransmFrequency(DataTransmFreqGranularity dataTransmFreqGranularity, 
		    long numberOfDataTransmOcc)
    {
	this(dataTransmFreqGranularity, new INTEGER(numberOfDataTransmOcc));
    }
    
    public void initComponents()
    {
	mComponents[0] = DataTransmFreqGranularity.ms100;
	mComponents[1] = new INTEGER();
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
		return DataTransmFreqGranularity.ms100;
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dataTransmFreqGranularity"
    public DataTransmFreqGranularity getDataTransmFreqGranularity()
    {
	return (DataTransmFreqGranularity)mComponents[0];
    }
    
    public void setDataTransmFreqGranularity(DataTransmFreqGranularity dataTransmFreqGranularity)
    {
	mComponents[0] = dataTransmFreqGranularity;
    }
    
    
    
    /**
     * Define the ASN1 Type DataTransmFreqGranularity from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class DataTransmFreqGranularity extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DataTransmFreqGranularity()
	{
	    super(cFirstNumber);
	}
	
	protected DataTransmFreqGranularity(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final DataTransmFreqGranularity ms100 =
	    new DataTransmFreqGranularity(0);
	public static final DataTransmFreqGranularity ms250 =
	    new DataTransmFreqGranularity(1);
	public static final DataTransmFreqGranularity ms500 =
	    new DataTransmFreqGranularity(2);
	public static final DataTransmFreqGranularity ms1000 =
	    new DataTransmFreqGranularity(3);
	public static final DataTransmFreqGranularity ms2000 =
	    new DataTransmFreqGranularity(4);
	public static final DataTransmFreqGranularity ms5000 =
	    new DataTransmFreqGranularity(5);
	public static final DataTransmFreqGranularity ms10000 =
	    new DataTransmFreqGranularity(6);
	public static final DataTransmFreqGranularity ms60000 =
	    new DataTransmFreqGranularity(7);
	private final static DataTransmFreqGranularity cNamedNumbers[] = {
	     ms100, 
	     ms250, 
	     ms500, 
	     ms1000, 
	     ms2000, 
	     ms5000, 
	     ms10000, 
	     ms60000
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static DataTransmFreqGranularity valueOf(long value)
	{
	    return (DataTransmFreqGranularity)ms100.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DataTransmFrequency$DataTransmFreqGranularity"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"ms100",
			0
		    ),
		    new MemberListElement (
			"ms250",
			1
		    ),
		    new MemberListElement (
			"ms500",
			2
		    ),
		    new MemberListElement (
			"ms1000",
			3
		    ),
		    new MemberListElement (
			"ms2000",
			4
		    ),
		    new MemberListElement (
			"ms5000",
			5
		    ),
		    new MemberListElement (
			"ms10000",
			6
		    ),
		    new MemberListElement (
			"ms60000",
			7
		    )
		}
	    ),
	    0,
	    ms100
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DataTransmFreqGranularity object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DataTransmFreqGranularity object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DataTransmFreqGranularity

    // Methods for field "numberOfDataTransmOcc"
    public long getNumberOfDataTransmOcc()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setNumberOfDataTransmOcc(long numberOfDataTransmOcc)
    {
	setNumberOfDataTransmOcc(new INTEGER(numberOfDataTransmOcc));
    }
    
    public void setNumberOfDataTransmOcc(INTEGER numberOfDataTransmOcc)
    {
	mComponents[1] = numberOfDataTransmOcc;
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
	    "DataTransmFrequency"
	),
	new QName (
	    "InformationElements",
	    "DataTransmFrequency"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DataTransmFrequency$DataTransmFreqGranularity"
			)
		    ),
		    "dataTransmFreqGranularity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(610),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(610)
			    ),
			    null
			)
		    ),
		    "numberOfDataTransmOcc",
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
     * Get the type descriptor (TypeInfo) of 'this' DataTransmFrequency object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DataTransmFrequency object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DataTransmFrequency
