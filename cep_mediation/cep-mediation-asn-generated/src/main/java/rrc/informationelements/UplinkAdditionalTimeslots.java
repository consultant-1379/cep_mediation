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
 * Define the ASN1 Type UplinkAdditionalTimeslots from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UplinkAdditionalTimeslots extends Sequence {
    
    /**
     * The default constructor.
     */
    public UplinkAdditionalTimeslots()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UplinkAdditionalTimeslots(Parameters parameters)
    {
	setParameters(parameters);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Parameters();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Parameters();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "parameters"
    public Parameters getParameters()
    {
	return (Parameters)mComponents[0];
    }
    
    public void setParameters(Parameters parameters)
    {
	mComponents[0] = parameters;
    }
    
    
    
    /**
     * Define the ASN1 Type Parameters from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Parameters extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Parameters()
	{
	}
	
	public static final  int  sameAsLast_chosen = 1;
	public static final  int  newParameters_chosen = 2;
	
	// Methods for field "sameAsLast"
	public static Parameters createParametersWithSameAsLast(SameAsLast sameAsLast)
	{
	    Parameters __object = new Parameters();

	    __object.setSameAsLast(sameAsLast);
	    return __object;
	}
	
	public boolean hasSameAsLast()
	{
	    return getChosenFlag() == sameAsLast_chosen;
	}
	
	public void setSameAsLast(SameAsLast sameAsLast)
	{
	    setChosenValue(sameAsLast);
	    setChosenFlag(sameAsLast_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type SameAsLast from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class SameAsLast extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public SameAsLast()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public SameAsLast(TimeslotNumber timeslotNumber)
	    {
		setTimeslotNumber(timeslotNumber);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new TimeslotNumber();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[1];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new TimeslotNumber();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "timeslotNumber"
	    public TimeslotNumber getTimeslotNumber()
	    {
		return (TimeslotNumber)mComponents[0];
	    }
	    
	    public void setTimeslotNumber(TimeslotNumber timeslotNumber)
	    {
		mComponents[0] = timeslotNumber;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "UplinkAdditionalTimeslots$Parameters$SameAsLast"
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
			    "timeslotNumber",
			    0,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' SameAsLast object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' SameAsLast object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for SameAsLast

	// Methods for field "newParameters"
	public static Parameters createParametersWithNewParameters(NewParameters newParameters)
	{
	    Parameters __object = new Parameters();

	    __object.setNewParameters(newParameters);
	    return __object;
	}
	
	public boolean hasNewParameters()
	{
	    return getChosenFlag() == newParameters_chosen;
	}
	
	public void setNewParameters(NewParameters newParameters)
	{
	    setChosenValue(newParameters);
	    setChosenFlag(newParameters_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type NewParameters from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class NewParameters extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public NewParameters()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public NewParameters(IndividualTimeslotInfo individualTimeslotInfo, 
			    UL_TS_ChannelisationCodeList ul_TS_ChannelisationCodeList)
	    {
		setIndividualTimeslotInfo(individualTimeslotInfo);
		setUl_TS_ChannelisationCodeList(ul_TS_ChannelisationCodeList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new IndividualTimeslotInfo();
		mComponents[1] = new UL_TS_ChannelisationCodeList();
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
			return new IndividualTimeslotInfo();
		    case 1:
			return new UL_TS_ChannelisationCodeList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "individualTimeslotInfo"
	    public IndividualTimeslotInfo getIndividualTimeslotInfo()
	    {
		return (IndividualTimeslotInfo)mComponents[0];
	    }
	    
	    public void setIndividualTimeslotInfo(IndividualTimeslotInfo individualTimeslotInfo)
	    {
		mComponents[0] = individualTimeslotInfo;
	    }
	    
	    
	    // Methods for field "ul_TS_ChannelisationCodeList"
	    public UL_TS_ChannelisationCodeList getUl_TS_ChannelisationCodeList()
	    {
		return (UL_TS_ChannelisationCodeList)mComponents[1];
	    }
	    
	    public void setUl_TS_ChannelisationCodeList(UL_TS_ChannelisationCodeList ul_TS_ChannelisationCodeList)
	    {
		mComponents[1] = ul_TS_ChannelisationCodeList;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "UplinkAdditionalTimeslots$Parameters$NewParameters"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"IndividualTimeslotInfo"
				    ),
				    new QName (
					"InformationElements",
					"IndividualTimeslotInfo"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "IndividualTimeslotInfo"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "IndividualTimeslotInfo"
					)
				    ),
				    0
				)
			    ),
			    "individualTimeslotInfo",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UL_TS_ChannelisationCodeList"
				    ),
				    new QName (
					"InformationElements",
					"UL-TS-ChannelisationCodeList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(2),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(2)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "UL_TS_ChannelisationCode"
					)
				    )
				)
			    ),
			    "ul-TS-ChannelisationCodeList",
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
	     * Get the type descriptor (TypeInfo) of 'this' NewParameters object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' NewParameters object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for NewParameters

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case sameAsLast_chosen:
		    return new SameAsLast();
		case newParameters_chosen:
		    return new NewParameters();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UplinkAdditionalTimeslots$Parameters"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UplinkAdditionalTimeslots$Parameters$SameAsLast"
			    )
			),
			"sameAsLast",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UplinkAdditionalTimeslots$Parameters$NewParameters"
			    )
			),
			"newParameters",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Parameters object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Parameters object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Parameters

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
	    "UplinkAdditionalTimeslots"
	),
	new QName (
	    "InformationElements",
	    "UplinkAdditionalTimeslots"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UplinkAdditionalTimeslots$Parameters"
			)
		    ),
		    "parameters",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UplinkAdditionalTimeslots object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UplinkAdditionalTimeslots object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UplinkAdditionalTimeslots
