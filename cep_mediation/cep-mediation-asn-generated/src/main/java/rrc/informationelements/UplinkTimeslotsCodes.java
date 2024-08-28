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
 * Define the ASN1 Type UplinkTimeslotsCodes from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UplinkTimeslotsCodes extends Sequence {
    
    /**
     * The default constructor.
     */
    public UplinkTimeslotsCodes()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UplinkTimeslotsCodes(BOOLEAN dynamicSFusage, 
		    IndividualTimeslotInfo firstIndividualTimeslotInfo, 
		    UL_TS_ChannelisationCodeList ul_TS_ChannelisationCodeList, 
		    MoreTimeslots moreTimeslots)
    {
	setDynamicSFusage(dynamicSFusage);
	setFirstIndividualTimeslotInfo(firstIndividualTimeslotInfo);
	setUl_TS_ChannelisationCodeList(ul_TS_ChannelisationCodeList);
	setMoreTimeslots(moreTimeslots);
    }
    
    /**
     * Construct with components.
     */
    public UplinkTimeslotsCodes(boolean dynamicSFusage, 
		    IndividualTimeslotInfo firstIndividualTimeslotInfo, 
		    UL_TS_ChannelisationCodeList ul_TS_ChannelisationCodeList, 
		    MoreTimeslots moreTimeslots)
    {
	this(new BOOLEAN(dynamicSFusage), firstIndividualTimeslotInfo, 
	     ul_TS_ChannelisationCodeList, moreTimeslots);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new IndividualTimeslotInfo();
	mComponents[2] = new UL_TS_ChannelisationCodeList();
	mComponents[3] = new MoreTimeslots();
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
		return new BOOLEAN();
	    case 1:
		return new IndividualTimeslotInfo();
	    case 2:
		return new UL_TS_ChannelisationCodeList();
	    case 3:
		return new MoreTimeslots();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dynamicSFusage"
    public boolean getDynamicSFusage()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setDynamicSFusage(boolean dynamicSFusage)
    {
	setDynamicSFusage(new BOOLEAN(dynamicSFusage));
    }
    
    public void setDynamicSFusage(BOOLEAN dynamicSFusage)
    {
	mComponents[0] = dynamicSFusage;
    }
    
    
    // Methods for field "firstIndividualTimeslotInfo"
    public IndividualTimeslotInfo getFirstIndividualTimeslotInfo()
    {
	return (IndividualTimeslotInfo)mComponents[1];
    }
    
    public void setFirstIndividualTimeslotInfo(IndividualTimeslotInfo firstIndividualTimeslotInfo)
    {
	mComponents[1] = firstIndividualTimeslotInfo;
    }
    
    
    // Methods for field "ul_TS_ChannelisationCodeList"
    public UL_TS_ChannelisationCodeList getUl_TS_ChannelisationCodeList()
    {
	return (UL_TS_ChannelisationCodeList)mComponents[2];
    }
    
    public void setUl_TS_ChannelisationCodeList(UL_TS_ChannelisationCodeList ul_TS_ChannelisationCodeList)
    {
	mComponents[2] = ul_TS_ChannelisationCodeList;
    }
    
    
    // Methods for field "moreTimeslots"
    public MoreTimeslots getMoreTimeslots()
    {
	return (MoreTimeslots)mComponents[3];
    }
    
    public void setMoreTimeslots(MoreTimeslots moreTimeslots)
    {
	mComponents[3] = moreTimeslots;
    }
    
    
    
    /**
     * Define the ASN1 Type MoreTimeslots from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class MoreTimeslots extends Choice {
	
	/**
	 * The default constructor.
	 */
	public MoreTimeslots()
	{
	}
	
	public static final  int  noMore_chosen = 1;
	public static final  int  additionalTimeslots_chosen = 2;
	
	// Methods for field "noMore"
	public static MoreTimeslots createMoreTimeslotsWithNoMore(Null noMore)
	{
	    MoreTimeslots __object = new MoreTimeslots();

	    __object.setNoMore(noMore);
	    return __object;
	}
	
	public boolean hasNoMore()
	{
	    return getChosenFlag() == noMore_chosen;
	}
	
	public void setNoMore(Null noMore)
	{
	    setChosenValue(noMore);
	    setChosenFlag(noMore_chosen);
	}
	
	
	// Methods for field "additionalTimeslots"
	public static MoreTimeslots createMoreTimeslotsWithAdditionalTimeslots(AdditionalTimeslots additionalTimeslots)
	{
	    MoreTimeslots __object = new MoreTimeslots();

	    __object.setAdditionalTimeslots(additionalTimeslots);
	    return __object;
	}
	
	public boolean hasAdditionalTimeslots()
	{
	    return getChosenFlag() == additionalTimeslots_chosen;
	}
	
	public void setAdditionalTimeslots(AdditionalTimeslots additionalTimeslots)
	{
	    setChosenValue(additionalTimeslots);
	    setChosenFlag(additionalTimeslots_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type AdditionalTimeslots from ASN1 Module InformationElements.
	 * @see Choice
	 */
	public static class AdditionalTimeslots extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public AdditionalTimeslots()
	    {
	    }
	    
	    public static final  int  consecutive_chosen = 1;
	    public static final  int  timeslotList_chosen = 2;
	    
	    // Methods for field "consecutive"
	    public static AdditionalTimeslots createAdditionalTimeslotsWithConsecutive(Consecutive consecutive)
	    {
		AdditionalTimeslots __object = new AdditionalTimeslots();

		__object.setConsecutive(consecutive);
		return __object;
	    }
	    
	    public boolean hasConsecutive()
	    {
		return getChosenFlag() == consecutive_chosen;
	    }
	    
	    public void setConsecutive(Consecutive consecutive)
	    {
		setChosenValue(consecutive);
		setChosenFlag(consecutive_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Consecutive from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class Consecutive extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Consecutive()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Consecutive(INTEGER numAdditionalTimeslots)
		{
		    setNumAdditionalTimeslots(numAdditionalTimeslots);
		}
		
		/**
		 * Construct with components.
		 */
		public Consecutive(long numAdditionalTimeslots)
		{
		    this(new INTEGER(numAdditionalTimeslots));
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
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
			    return new INTEGER();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "numAdditionalTimeslots"
		public long getNumAdditionalTimeslots()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setNumAdditionalTimeslots(long numAdditionalTimeslots)
		{
		    setNumAdditionalTimeslots(new INTEGER(numAdditionalTimeslots));
		}
		
		public void setNumAdditionalTimeslots(INTEGER numAdditionalTimeslots)
		{
		    mComponents[0] = numAdditionalTimeslots;
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
			"UplinkTimeslotsCodes$MoreTimeslots$AdditionalTimeslots$Consecutive"
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
						new com.oss.asn1.INTEGER(13),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(1),
					    new java.lang.Long(13)
					),
					null
				    )
				),
				"numAdditionalTimeslots",
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
		 * Get the type descriptor (TypeInfo) of 'this' Consecutive object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Consecutive object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Consecutive

	    // Methods for field "timeslotList"
	    public static AdditionalTimeslots createAdditionalTimeslotsWithTimeslotList(TimeslotList timeslotList)
	    {
		AdditionalTimeslots __object = new AdditionalTimeslots();

		__object.setTimeslotList(timeslotList);
		return __object;
	    }
	    
	    public boolean hasTimeslotList()
	    {
		return getChosenFlag() == timeslotList_chosen;
	    }
	    
	    public void setTimeslotList(TimeslotList timeslotList)
	    {
		setChosenValue(timeslotList);
		setChosenFlag(timeslotList_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type TimeslotList from ASN1 Module InformationElements.
	     * @see SequenceOf
	     */
	    public static class TimeslotList extends SequenceOf {
		
		/**
		 * The default constructor.
		 */
		public TimeslotList()
		{
		}
		
		/**
		 * Construct from an array of components.
		 */
		public TimeslotList(UplinkAdditionalTimeslots[] elements)
		{
		    super(elements);
		}
		
		/**
		 * Add an Element to the SEQUENCE OF/SET OF.
		 */
		public synchronized void add(UplinkAdditionalTimeslots element)
		{
		    super.addElement(element);
		}
		
		/**
		 * Set an Element in the SEQUENCE OF/SET OF.
		 */
		public synchronized void set(UplinkAdditionalTimeslots element, int atIndex)
		{
		    super.setElement(element, atIndex);
		}
		
		/**
		 * Get an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized UplinkAdditionalTimeslots get(int atIndex)
		{
		    return (UplinkAdditionalTimeslots)super.getElement(atIndex);
		}
		
		/**
		 * Insert an Element into the SEQUENCE OF/SET OF.
		 */
		public synchronized void insert(UplinkAdditionalTimeslots element, int atIndex)
		{
		    super.insertElement(element, atIndex);
		}
		
		/**
		 * Remove an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized void remove(UplinkAdditionalTimeslots element)
		{
		    super.removeElement(element);
		}
		
		/**
		 * Create an instance of  SEQUENCE OF/SET OF.
		 */
		public AbstractData createInstance()
		{
		    return (AbstractData)new UplinkAdditionalTimeslots();
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final ContainerInfo c_typeinfo = new ContainerInfo (
		    new Tags (
			new short[] {
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"UplinkTimeslotsCodes$MoreTimeslots$AdditionalTimeslots$TimeslotList"
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
			    "UplinkAdditionalTimeslots"
			)
		    )
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' TimeslotList object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' TimeslotList object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for TimeslotList

	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case consecutive_chosen:
			return new Consecutive();
		    case timeslotList_chosen:
			return new TimeslotList();
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "UplinkTimeslotsCodes$MoreTimeslots$AdditionalTimeslots"
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
				    "UplinkTimeslotsCodes$MoreTimeslots$AdditionalTimeslots$Consecutive"
				)
			    ),
			    "consecutive",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UplinkTimeslotsCodes$MoreTimeslots$AdditionalTimeslots$TimeslotList"
				)
			    ),
			    "timeslotList",
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
	     * Get the type descriptor (TypeInfo) of 'this' AdditionalTimeslots object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' AdditionalTimeslots object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for AdditionalTimeslots

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case noMore_chosen:
		    return new Null();
		case additionalTimeslots_chosen:
		    return new AdditionalTimeslots();
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UplinkTimeslotsCodes$MoreTimeslots"
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
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
			    )
			),
			"noMore",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UplinkTimeslotsCodes$MoreTimeslots$AdditionalTimeslots"
			    )
			),
			"additionalTimeslots",
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
	 * Get the type descriptor (TypeInfo) of 'this' MoreTimeslots object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MoreTimeslots object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MoreTimeslots

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
	    "UplinkTimeslotsCodes"
	),
	new QName (
	    "InformationElements",
	    "UplinkTimeslotsCodes"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "dynamicSFusage",
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
		    "firstIndividualTimeslotInfo",
		    1,
		    2,
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
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UplinkTimeslotsCodes$MoreTimeslots"
			)
		    ),
		    "moreTimeslots",
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
     * Get the type descriptor (TypeInfo) of 'this' UplinkTimeslotsCodes object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UplinkTimeslotsCodes object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UplinkTimeslotsCodes
