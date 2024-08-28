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
 * Define the ASN1 Type UL_TS_ChannelisationCodeList_r7 from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class UL_TS_ChannelisationCodeList_r7 extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public UL_TS_ChannelisationCodeList_r7()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public UL_TS_ChannelisationCodeList_r7(Sequence_[] elements)
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
	public Sequence_(UL_TS_ChannelisationCode ul_TS_Channelisation_Code, 
			PLCCH_Info plcch_info)
	{
	    setUl_TS_Channelisation_Code(ul_TS_Channelisation_Code);
	    setPlcch_info(plcch_info);
	}
	
	/**
	 * Construct with required components.
	 */
	public Sequence_(UL_TS_ChannelisationCode ul_TS_Channelisation_Code)
	{
	    setUl_TS_Channelisation_Code(ul_TS_Channelisation_Code);
	}
	
	public void initComponents()
	{
	    mComponents[0] = UL_TS_ChannelisationCode.cc1_1;
	    mComponents[1] = new PLCCH_Info();
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
		    return UL_TS_ChannelisationCode.cc1_1;
		case 1:
		    return new PLCCH_Info();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ul_TS_Channelisation_Code"
	public UL_TS_ChannelisationCode getUl_TS_Channelisation_Code()
	{
	    return (UL_TS_ChannelisationCode)mComponents[0];
	}
	
	public void setUl_TS_Channelisation_Code(UL_TS_ChannelisationCode ul_TS_Channelisation_Code)
	{
	    mComponents[0] = ul_TS_Channelisation_Code;
	}
	
	
	// Methods for field "plcch_info"
	public PLCCH_Info getPlcch_info()
	{
	    return (PLCCH_Info)mComponents[1];
	}
	
	public void setPlcch_info(PLCCH_Info plcch_info)
	{
	    mComponents[1] = plcch_info;
	}
	
	public boolean hasPlcch_info()
	{
	    return componentIsPresent(1);
	}
	
	public void deletePlcch_info()
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
		"UL_TS_ChannelisationCodeList_r7$Sequence_"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UL_TS_ChannelisationCode"
				),
				new QName (
				    "InformationElements",
				    "UL-TS-ChannelisationCode"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "cc1-1",
					    0
					),
					new MemberListElement (
					    "cc2-1",
					    1
					),
					new MemberListElement (
					    "cc2-2",
					    2
					),
					new MemberListElement (
					    "cc4-1",
					    3
					),
					new MemberListElement (
					    "cc4-2",
					    4
					),
					new MemberListElement (
					    "cc4-3",
					    5
					),
					new MemberListElement (
					    "cc4-4",
					    6
					),
					new MemberListElement (
					    "cc8-1",
					    7
					),
					new MemberListElement (
					    "cc8-2",
					    8
					),
					new MemberListElement (
					    "cc8-3",
					    9
					),
					new MemberListElement (
					    "cc8-4",
					    10
					),
					new MemberListElement (
					    "cc8-5",
					    11
					),
					new MemberListElement (
					    "cc8-6",
					    12
					),
					new MemberListElement (
					    "cc8-7",
					    13
					),
					new MemberListElement (
					    "cc8-8",
					    14
					),
					new MemberListElement (
					    "cc16-1",
					    15
					),
					new MemberListElement (
					    "cc16-2",
					    16
					),
					new MemberListElement (
					    "cc16-3",
					    17
					),
					new MemberListElement (
					    "cc16-4",
					    18
					),
					new MemberListElement (
					    "cc16-5",
					    19
					),
					new MemberListElement (
					    "cc16-6",
					    20
					),
					new MemberListElement (
					    "cc16-7",
					    21
					),
					new MemberListElement (
					    "cc16-8",
					    22
					),
					new MemberListElement (
					    "cc16-9",
					    23
					),
					new MemberListElement (
					    "cc16-10",
					    24
					),
					new MemberListElement (
					    "cc16-11",
					    25
					),
					new MemberListElement (
					    "cc16-12",
					    26
					),
					new MemberListElement (
					    "cc16-13",
					    27
					),
					new MemberListElement (
					    "cc16-14",
					    28
					),
					new MemberListElement (
					    "cc16-15",
					    29
					),
					new MemberListElement (
					    "cc16-16",
					    30
					)
				    }
				),
				0,
				UL_TS_ChannelisationCode.cc1_1
			    )
			),
			"ul-TS-Channelisation-Code",
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
				    "PLCCH_Info"
				),
				new QName (
				    "InformationElements",
				    "PLCCH-Info"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PLCCH_Info"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"PLCCH_Info"
				    )
				),
				0
			    )
			),
			"plcch-info",
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
	    "UL_TS_ChannelisationCodeList_r7"
	),
	new QName (
	    "InformationElements",
	    "UL-TS-ChannelisationCodeList-r7"
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
		"UL_TS_ChannelisationCodeList_r7$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_TS_ChannelisationCodeList_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TS_ChannelisationCodeList_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TS_ChannelisationCodeList_r7
