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
 * Define the ASN1 Type DownlinkTimeslotsCodes_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DownlinkTimeslotsCodes_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DownlinkTimeslotsCodes_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DownlinkTimeslotsCodes_r7(IndividualTimeslotInfo_r7 firstIndividualTimeslotInfo, 
		    DL_TS_ChannelisationCodesShort dl_TS_ChannelisationCodesShort, 
		    MoreTimeslots moreTimeslots)
    {
	setFirstIndividualTimeslotInfo(firstIndividualTimeslotInfo);
	setDl_TS_ChannelisationCodesShort(dl_TS_ChannelisationCodesShort);
	setMoreTimeslots(moreTimeslots);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IndividualTimeslotInfo_r7();
	mComponents[1] = new DL_TS_ChannelisationCodesShort();
	mComponents[2] = new MoreTimeslots();
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
		return new IndividualTimeslotInfo_r7();
	    case 1:
		return new DL_TS_ChannelisationCodesShort();
	    case 2:
		return new MoreTimeslots();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "firstIndividualTimeslotInfo"
    public IndividualTimeslotInfo_r7 getFirstIndividualTimeslotInfo()
    {
	return (IndividualTimeslotInfo_r7)mComponents[0];
    }
    
    public void setFirstIndividualTimeslotInfo(IndividualTimeslotInfo_r7 firstIndividualTimeslotInfo)
    {
	mComponents[0] = firstIndividualTimeslotInfo;
    }
    
    
    // Methods for field "dl_TS_ChannelisationCodesShort"
    public DL_TS_ChannelisationCodesShort getDl_TS_ChannelisationCodesShort()
    {
	return (DL_TS_ChannelisationCodesShort)mComponents[1];
    }
    
    public void setDl_TS_ChannelisationCodesShort(DL_TS_ChannelisationCodesShort dl_TS_ChannelisationCodesShort)
    {
	mComponents[1] = dl_TS_ChannelisationCodesShort;
    }
    
    
    // Methods for field "moreTimeslots"
    public MoreTimeslots getMoreTimeslots()
    {
	return (MoreTimeslots)mComponents[2];
    }
    
    public void setMoreTimeslots(MoreTimeslots moreTimeslots)
    {
	mComponents[2] = moreTimeslots;
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
	    public static AdditionalTimeslots createAdditionalTimeslotsWithConsecutive(long consecutive)
	    {
		return createAdditionalTimeslotsWithConsecutive(new INTEGER(consecutive));
	    }
	    
	    public static AdditionalTimeslots createAdditionalTimeslotsWithConsecutive(INTEGER consecutive)
	    {
		AdditionalTimeslots __object = new AdditionalTimeslots();

		__object.setConsecutive(consecutive);
		return __object;
	    }
	    
	    public boolean hasConsecutive()
	    {
		return getChosenFlag() == consecutive_chosen;
	    }
	    
	    public void setConsecutive(long consecutive)
	    {
		setConsecutive(new INTEGER(consecutive));
	    }
	    
	    public void setConsecutive(INTEGER consecutive)
	    {
		setChosenValue(consecutive);
		setChosenFlag(consecutive_chosen);
	    }
	    
	    
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
		public TimeslotList(DownlinkAdditionalTimeslots_r7[] elements)
		{
		    super(elements);
		}
		
		/**
		 * Add an Element to the SEQUENCE OF/SET OF.
		 */
		public synchronized void add(DownlinkAdditionalTimeslots_r7 element)
		{
		    super.addElement(element);
		}
		
		/**
		 * Set an Element in the SEQUENCE OF/SET OF.
		 */
		public synchronized void set(DownlinkAdditionalTimeslots_r7 element, int atIndex)
		{
		    super.setElement(element, atIndex);
		}
		
		/**
		 * Get an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized DownlinkAdditionalTimeslots_r7 get(int atIndex)
		{
		    return (DownlinkAdditionalTimeslots_r7)super.getElement(atIndex);
		}
		
		/**
		 * Insert an Element into the SEQUENCE OF/SET OF.
		 */
		public synchronized void insert(DownlinkAdditionalTimeslots_r7 element, int atIndex)
		{
		    super.insertElement(element, atIndex);
		}
		
		/**
		 * Remove an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized void remove(DownlinkAdditionalTimeslots_r7 element)
		{
		    super.removeElement(element);
		}
		
		/**
		 * Create an instance of  SEQUENCE OF/SET OF.
		 */
		public AbstractData createInstance()
		{
		    return (AbstractData)new DownlinkAdditionalTimeslots_r7();
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
			"DownlinkTimeslotsCodes_r7$MoreTimeslots$AdditionalTimeslots$TimeslotList"
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
			    "DownlinkAdditionalTimeslots_r7"
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
			return new INTEGER();
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
		    "DownlinkTimeslotsCodes_r7$MoreTimeslots$AdditionalTimeslots"
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
			    "consecutive",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DownlinkTimeslotsCodes_r7$MoreTimeslots$AdditionalTimeslots$TimeslotList"
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DownlinkTimeslotsCodes_r7$MoreTimeslots"
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
				"DownlinkTimeslotsCodes_r7$MoreTimeslots$AdditionalTimeslots"
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
	    "DownlinkTimeslotsCodes_r7"
	),
	new QName (
	    "InformationElements",
	    "DownlinkTimeslotsCodes-r7"
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
				"IndividualTimeslotInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"IndividualTimeslotInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IndividualTimeslotInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IndividualTimeslotInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "firstIndividualTimeslotInfo",
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
				"DL_TS_ChannelisationCodesShort"
			    ),
			    new QName (
				"InformationElements",
				"DL-TS-ChannelisationCodesShort"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_TS_ChannelisationCodesShort"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_TS_ChannelisationCodesShort"
				)
			    ),
			    0
			)
		    ),
		    "dl-TS-ChannelisationCodesShort",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DownlinkTimeslotsCodes_r7$MoreTimeslots"
			)
		    ),
		    "moreTimeslots",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DownlinkTimeslotsCodes_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DownlinkTimeslotsCodes_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DownlinkTimeslotsCodes_r7
