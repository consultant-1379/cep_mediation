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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type HandoverFromUTRANCommand_GERANIu_r5_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class HandoverFromUTRANCommand_GERANIu_r5_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public HandoverFromUTRANCommand_GERANIu_r5_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HandoverFromUTRANCommand_GERANIu_r5_IEs(rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.Frequency_Band frequency_Band, 
		    GeranIu_Message geranIu_Message)
    {
	setActivationTime(activationTime);
	setFrequency_Band(frequency_Band);
	setGeranIu_Message(geranIu_Message);
    }
    
    /**
     * Construct with required components.
     */
    public HandoverFromUTRANCommand_GERANIu_r5_IEs(rrc.informationelements.Frequency_Band frequency_Band, 
		    GeranIu_Message geranIu_Message)
    {
	setFrequency_Band(frequency_Band);
	setGeranIu_Message(geranIu_Message);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.ActivationTime();
	mComponents[1] = rrc.informationelements.Frequency_Band.dcs1800BandUsed;
	mComponents[2] = new GeranIu_Message();
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
		return new rrc.informationelements.ActivationTime();
	    case 1:
		return rrc.informationelements.Frequency_Band.dcs1800BandUsed;
	    case 2:
		return new GeranIu_Message();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "activationTime"
    public rrc.informationelements.ActivationTime getActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[0];
    }
    
    public void setActivationTime(rrc.informationelements.ActivationTime activationTime)
    {
	mComponents[0] = activationTime;
    }
    
    public boolean hasActivationTime()
    {
	return componentIsPresent(0);
    }
    
    public void deleteActivationTime()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "frequency_Band"
    public rrc.informationelements.Frequency_Band getFrequency_Band()
    {
	return (rrc.informationelements.Frequency_Band)mComponents[1];
    }
    
    public void setFrequency_Band(rrc.informationelements.Frequency_Band frequency_Band)
    {
	mComponents[1] = frequency_Band;
    }
    
    
    // Methods for field "geranIu_Message"
    public GeranIu_Message getGeranIu_Message()
    {
	return (GeranIu_Message)mComponents[2];
    }
    
    public void setGeranIu_Message(GeranIu_Message geranIu_Message)
    {
	mComponents[2] = geranIu_Message;
    }
    
    
    
    /**
     * Define the ASN1 Type GeranIu_Message from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class GeranIu_Message extends Choice {
	
	/**
	 * The default constructor.
	 */
	public GeranIu_Message()
	{
	}
	
	public static final  int  single_GERANIu_Message_chosen = 1;
	public static final  int  geranIu_MessageList_chosen = 2;
	
	// Methods for field "single_GERANIu_Message"
	public static GeranIu_Message createGeranIu_MessageWithSingle_GERANIu_Message(Single_GERANIu_Message single_GERANIu_Message)
	{
	    GeranIu_Message __object = new GeranIu_Message();

	    __object.setSingle_GERANIu_Message(single_GERANIu_Message);
	    return __object;
	}
	
	public boolean hasSingle_GERANIu_Message()
	{
	    return getChosenFlag() == single_GERANIu_Message_chosen;
	}
	
	public void setSingle_GERANIu_Message(Single_GERANIu_Message single_GERANIu_Message)
	{
	    setChosenValue(single_GERANIu_Message);
	    setChosenFlag(single_GERANIu_Message_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Single_GERANIu_Message from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Single_GERANIu_Message extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Single_GERANIu_Message()
	    {
	    }
	    
	    public void initComponents()
	    {
		
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[0];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		return null;
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
		    "rrc.pdu_definitions",
		    "HandoverFromUTRANCommand_GERANIu_r5_IEs$GeranIu_Message$Single_GERANIu_Message"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		12314,
		null,
		new Fields (
		    new SequenceFieldInfo[] {
		    }
		),
		0,
		null,
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Single_GERANIu_Message object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Single_GERANIu_Message object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Single_GERANIu_Message

	// Methods for field "geranIu_MessageList"
	public static GeranIu_Message createGeranIu_MessageWithGeranIu_MessageList(GeranIu_MessageList geranIu_MessageList)
	{
	    GeranIu_Message __object = new GeranIu_Message();

	    __object.setGeranIu_MessageList(geranIu_MessageList);
	    return __object;
	}
	
	public boolean hasGeranIu_MessageList()
	{
	    return getChosenFlag() == geranIu_MessageList_chosen;
	}
	
	public void setGeranIu_MessageList(GeranIu_MessageList geranIu_MessageList)
	{
	    setChosenValue(geranIu_MessageList);
	    setChosenFlag(geranIu_MessageList_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type GeranIu_MessageList from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class GeranIu_MessageList extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public GeranIu_MessageList()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public GeranIu_MessageList(rrc.informationelements.GERANIu_MessageList geranIu_Messages)
	    {
		setGeranIu_Messages(geranIu_Messages);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.GERANIu_MessageList();
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
			return new rrc.informationelements.GERANIu_MessageList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "geranIu_Messages"
	    public rrc.informationelements.GERANIu_MessageList getGeranIu_Messages()
	    {
		return (rrc.informationelements.GERANIu_MessageList)mComponents[0];
	    }
	    
	    public void setGeranIu_Messages(rrc.informationelements.GERANIu_MessageList geranIu_Messages)
	    {
		mComponents[0] = geranIu_Messages;
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
		    "rrc.pdu_definitions",
		    "HandoverFromUTRANCommand_GERANIu_r5_IEs$GeranIu_Message$GeranIu_MessageList"
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
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"GERANIu_MessageList"
				    ),
				    new QName (
					"InformationElements",
					"GERANIu-MessageList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(4),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(4)
				    ),
				    new TypeInfoRef (
					new BitStringInfo (
					    new Tags (
						new short[] {
						    0x0003
						}
					    ),
					    new QName (
						"com.oss.asn1",
						"BitString"
					    ),
					    new QName (
						"builtin",
						"BIT STRING"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(32768),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(32768)
					    ),
					    null
					)
				    )
				)
			    ),
			    "geranIu-Messages",
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
	     * Get the type descriptor (TypeInfo) of 'this' GeranIu_MessageList object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' GeranIu_MessageList object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for GeranIu_MessageList

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case single_GERANIu_Message_chosen:
		    return new Single_GERANIu_Message();
		case geranIu_MessageList_chosen:
		    return new GeranIu_MessageList();
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
		"rrc.pdu_definitions",
		"HandoverFromUTRANCommand_GERANIu_r5_IEs$GeranIu_Message"
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
				"rrc.pdu_definitions",
				"HandoverFromUTRANCommand_GERANIu_r5_IEs$GeranIu_Message$Single_GERANIu_Message"
			    )
			),
			"single-GERANIu-Message",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"HandoverFromUTRANCommand_GERANIu_r5_IEs$GeranIu_Message$GeranIu_MessageList"
			    )
			),
			"geranIu-MessageList",
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
	 * Get the type descriptor (TypeInfo) of 'this' GeranIu_Message object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GeranIu_Message object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GeranIu_Message

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
	    "rrc.pdu_definitions",
	    "HandoverFromUTRANCommand_GERANIu_r5_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverFromUTRANCommand-GERANIu-r5-IEs"
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
				"ActivationTime"
			    ),
			    new QName (
				"InformationElements",
				"ActivationTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.ActivationTime(0), 
				    new rrc.informationelements.ActivationTime(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "activationTime",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Frequency_Band"
			    ),
			    new QName (
				"InformationElements",
				"Frequency-Band"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dcs1800BandUsed",
					0
				    ),
				    new MemberListElement (
					"pcs1900BandUsed",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.Frequency_Band.dcs1800BandUsed
			)
		    ),
		    "frequency-Band",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverFromUTRANCommand_GERANIu_r5_IEs$GeranIu_Message"
			)
		    ),
		    "geranIu-Message",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_GERANIu_r5_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_GERANIu_r5_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverFromUTRANCommand_GERANIu_r5_IEs
