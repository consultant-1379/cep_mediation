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
 * Define the ASN1 Type FACH_MeasurementOccasionInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class FACH_MeasurementOccasionInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public FACH_MeasurementOccasionInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public FACH_MeasurementOccasionInfo(INTEGER fACH_meas_occasion_coeff, 
		    BOOLEAN inter_freq_FDD_meas_ind, 
		    BOOLEAN inter_freq_TDD_meas_ind, 
		    Inter_RAT_meas_ind inter_RAT_meas_ind)
    {
	setFACH_meas_occasion_coeff(fACH_meas_occasion_coeff);
	setInter_freq_FDD_meas_ind(inter_freq_FDD_meas_ind);
	setInter_freq_TDD_meas_ind(inter_freq_TDD_meas_ind);
	setInter_RAT_meas_ind(inter_RAT_meas_ind);
    }
    
    /**
     * Construct with components.
     */
    public FACH_MeasurementOccasionInfo(long fACH_meas_occasion_coeff, 
		    boolean inter_freq_FDD_meas_ind, 
		    boolean inter_freq_TDD_meas_ind, 
		    Inter_RAT_meas_ind inter_RAT_meas_ind)
    {
	this(new INTEGER(fACH_meas_occasion_coeff), 
	     new BOOLEAN(inter_freq_FDD_meas_ind), 
	     new BOOLEAN(inter_freq_TDD_meas_ind), inter_RAT_meas_ind);
    }
    
    /**
     * Construct with required components.
     */
    public FACH_MeasurementOccasionInfo(boolean inter_freq_FDD_meas_ind, 
		    boolean inter_freq_TDD_meas_ind)
    {
	setInter_freq_FDD_meas_ind(inter_freq_FDD_meas_ind);
	setInter_freq_TDD_meas_ind(inter_freq_TDD_meas_ind);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new Inter_RAT_meas_ind();
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
		return new INTEGER();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new Inter_RAT_meas_ind();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "fACH_meas_occasion_coeff"
    public long getFACH_meas_occasion_coeff()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setFACH_meas_occasion_coeff(long fACH_meas_occasion_coeff)
    {
	setFACH_meas_occasion_coeff(new INTEGER(fACH_meas_occasion_coeff));
    }
    
    public void setFACH_meas_occasion_coeff(INTEGER fACH_meas_occasion_coeff)
    {
	mComponents[0] = fACH_meas_occasion_coeff;
    }
    
    public boolean hasFACH_meas_occasion_coeff()
    {
	return componentIsPresent(0);
    }
    
    public void deleteFACH_meas_occasion_coeff()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "inter_freq_FDD_meas_ind"
    public boolean getInter_freq_FDD_meas_ind()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setInter_freq_FDD_meas_ind(boolean inter_freq_FDD_meas_ind)
    {
	setInter_freq_FDD_meas_ind(new BOOLEAN(inter_freq_FDD_meas_ind));
    }
    
    public void setInter_freq_FDD_meas_ind(BOOLEAN inter_freq_FDD_meas_ind)
    {
	mComponents[1] = inter_freq_FDD_meas_ind;
    }
    
    
    // Methods for field "inter_freq_TDD_meas_ind"
    public boolean getInter_freq_TDD_meas_ind()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setInter_freq_TDD_meas_ind(boolean inter_freq_TDD_meas_ind)
    {
	setInter_freq_TDD_meas_ind(new BOOLEAN(inter_freq_TDD_meas_ind));
    }
    
    public void setInter_freq_TDD_meas_ind(BOOLEAN inter_freq_TDD_meas_ind)
    {
	mComponents[2] = inter_freq_TDD_meas_ind;
    }
    
    
    // Methods for field "inter_RAT_meas_ind"
    public Inter_RAT_meas_ind getInter_RAT_meas_ind()
    {
	return (Inter_RAT_meas_ind)mComponents[3];
    }
    
    public void setInter_RAT_meas_ind(Inter_RAT_meas_ind inter_RAT_meas_ind)
    {
	mComponents[3] = inter_RAT_meas_ind;
    }
    
    public boolean hasInter_RAT_meas_ind()
    {
	return componentIsPresent(3);
    }
    
    public void deleteInter_RAT_meas_ind()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type Inter_RAT_meas_ind from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Inter_RAT_meas_ind extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Inter_RAT_meas_ind()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Inter_RAT_meas_ind(RAT_Type[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(RAT_Type element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(RAT_Type element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized RAT_Type get(int atIndex)
	{
	    return (RAT_Type)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(RAT_Type element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(RAT_Type element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return RAT_Type.gsm;
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"FACH_MeasurementOccasionInfo$Inter_RAT_meas_ind"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    12314,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new com.oss.asn1.INTEGER(1), 
			new com.oss.asn1.INTEGER(15),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(15)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "RAT_Type"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Inter_RAT_meas_ind object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Inter_RAT_meas_ind object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Inter_RAT_meas_ind

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
	    "FACH_MeasurementOccasionInfo"
	),
	new QName (
	    "InformationElements",
	    "FACH-MeasurementOccasionInfo"
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
				    new com.oss.asn1.INTEGER(12),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(12)
			    ),
			    null
			)
		    ),
		    "fACH-meas-occasion-coeff",
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
		    "inter-freq-FDD-meas-ind",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "inter-freq-TDD-meas-ind",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "FACH_MeasurementOccasionInfo$Inter_RAT_meas_ind"
			)
		    ),
		    "inter-RAT-meas-ind",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' FACH_MeasurementOccasionInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FACH_MeasurementOccasionInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FACH_MeasurementOccasionInfo
