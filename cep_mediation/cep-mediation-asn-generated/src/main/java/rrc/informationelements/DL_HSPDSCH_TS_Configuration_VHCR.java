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
 * Define the ASN1 Type DL_HSPDSCH_TS_Configuration_VHCR from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class DL_HSPDSCH_TS_Configuration_VHCR extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public DL_HSPDSCH_TS_Configuration_VHCR()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public DL_HSPDSCH_TS_Configuration_VHCR(Sequence_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the ASN1 Type Sequence_ from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Sequence_ extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Sequence_()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Sequence_(TimeslotNumber timeslot, 
			MidambleShiftAndBurstType_DL_VHCR midambleShiftAndBurstType)
	{
	    setTimeslot(timeslot);
	    setMidambleShiftAndBurstType(midambleShiftAndBurstType);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new TimeslotNumber();
	    mComponents[1] = new MidambleShiftAndBurstType_DL_VHCR();
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
		    return new TimeslotNumber();
		case 1:
		    return new MidambleShiftAndBurstType_DL_VHCR();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "timeslot"
	public TimeslotNumber getTimeslot()
	{
	    return (TimeslotNumber)mComponents[0];
	}
	
	public void setTimeslot(TimeslotNumber timeslot)
	{
	    mComponents[0] = timeslot;
	}
	
	
	// Methods for field "midambleShiftAndBurstType"
	public MidambleShiftAndBurstType_DL_VHCR getMidambleShiftAndBurstType()
	{
	    return (MidambleShiftAndBurstType_DL_VHCR)mComponents[1];
	}
	
	public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType_DL_VHCR midambleShiftAndBurstType)
	{
	    mComponents[1] = midambleShiftAndBurstType;
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
		"DL_HSPDSCH_TS_Configuration_VHCR$Sequence_"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
				    "rrc.informationelements",
				    "TimeslotNumber"
				),
				new QName (
				    "InformationElements",
				    "TimeslotNumber"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new TimeslotNumber(0), 
					new TimeslotNumber(14),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(14)
				),
				null
			    )
			),
			"timeslot",
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
				    "MidambleShiftAndBurstType_DL_VHCR"
				),
				new QName (
				    "InformationElements",
				    "MidambleShiftAndBurstType-DL-VHCR"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MidambleShiftAndBurstType_DL_VHCR"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MidambleShiftAndBurstType_DL_VHCR"
				    )
				),
				0
			    )
			),
			"midambleShiftAndBurstType",
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
	 * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sequence_

    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(Sequence_ element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(Sequence_ element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized Sequence_ get(int atIndex)
    {
	return (Sequence_)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(Sequence_ element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(Sequence_ element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new Sequence_();
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "DL_HSPDSCH_TS_Configuration_VHCR"
	),
	new QName (
	    "InformationElements",
	    "DL-HSPDSCH-TS-Configuration-VHCR"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(13),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(13)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"DL_HSPDSCH_TS_Configuration_VHCR$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_HSPDSCH_TS_Configuration_VHCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_HSPDSCH_TS_Configuration_VHCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_HSPDSCH_TS_Configuration_VHCR
