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
 * Define the ASN1 Type HandoverFromUTRANCommand_GSM_r6_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class HandoverFromUTRANCommand_GSM_r6_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public HandoverFromUTRANCommand_GSM_r6_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HandoverFromUTRANCommand_GSM_r6_IEs(rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.RAB_InformationList_r6 toHandoverRAB_Info, 
		    rrc.informationelements.Frequency_Band frequency_band, 
		    Gsm_message gsm_message, 
		    Geran_SystemInfoType geran_SystemInfoType)
    {
	setActivationTime(activationTime);
	setToHandoverRAB_Info(toHandoverRAB_Info);
	setFrequency_band(frequency_band);
	setGsm_message(gsm_message);
	setGeran_SystemInfoType(geran_SystemInfoType);
    }
    
    /**
     * Construct with required components.
     */
    public HandoverFromUTRANCommand_GSM_r6_IEs(rrc.informationelements.Frequency_Band frequency_band, 
		    Gsm_message gsm_message)
    {
	setFrequency_band(frequency_band);
	setGsm_message(gsm_message);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.ActivationTime();
	mComponents[1] = new rrc.informationelements.RAB_InformationList_r6();
	mComponents[2] = rrc.informationelements.Frequency_Band.dcs1800BandUsed;
	mComponents[3] = new Gsm_message();
	mComponents[4] = new Geran_SystemInfoType();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.ActivationTime();
	    case 1:
		return new rrc.informationelements.RAB_InformationList_r6();
	    case 2:
		return rrc.informationelements.Frequency_Band.dcs1800BandUsed;
	    case 3:
		return new Gsm_message();
	    case 4:
		return new Geran_SystemInfoType();
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
    
    
    // Methods for field "toHandoverRAB_Info"
    public rrc.informationelements.RAB_InformationList_r6 getToHandoverRAB_Info()
    {
	return (rrc.informationelements.RAB_InformationList_r6)mComponents[1];
    }
    
    public void setToHandoverRAB_Info(rrc.informationelements.RAB_InformationList_r6 toHandoverRAB_Info)
    {
	mComponents[1] = toHandoverRAB_Info;
    }
    
    public boolean hasToHandoverRAB_Info()
    {
	return componentIsPresent(1);
    }
    
    public void deleteToHandoverRAB_Info()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "frequency_band"
    public rrc.informationelements.Frequency_Band getFrequency_band()
    {
	return (rrc.informationelements.Frequency_Band)mComponents[2];
    }
    
    public void setFrequency_band(rrc.informationelements.Frequency_Band frequency_band)
    {
	mComponents[2] = frequency_band;
    }
    
    
    // Methods for field "gsm_message"
    public Gsm_message getGsm_message()
    {
	return (Gsm_message)mComponents[3];
    }
    
    public void setGsm_message(Gsm_message gsm_message)
    {
	mComponents[3] = gsm_message;
    }
    
    
    
    /**
     * Define the ASN1 Type Gsm_message from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class Gsm_message extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Gsm_message()
	{
	}
	
	public static final  int  single_GSM_Message_chosen = 1;
	public static final  int  gsm_MessageList_chosen = 2;
	
	// Methods for field "single_GSM_Message"
	public static Gsm_message createGsm_messageWithSingle_GSM_Message(Single_GSM_Message single_GSM_Message)
	{
	    Gsm_message __object = new Gsm_message();

	    __object.setSingle_GSM_Message(single_GSM_Message);
	    return __object;
	}
	
	public boolean hasSingle_GSM_Message()
	{
	    return getChosenFlag() == single_GSM_Message_chosen;
	}
	
	public void setSingle_GSM_Message(Single_GSM_Message single_GSM_Message)
	{
	    setChosenValue(single_GSM_Message);
	    setChosenFlag(single_GSM_Message_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Single_GSM_Message from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Single_GSM_Message extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Single_GSM_Message()
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
		    "HandoverFromUTRANCommand_GSM_r6_IEs$Gsm_message$Single_GSM_Message"
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
	     * Get the type descriptor (TypeInfo) of 'this' Single_GSM_Message object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Single_GSM_Message object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Single_GSM_Message

	// Methods for field "gsm_MessageList"
	public static Gsm_message createGsm_messageWithGsm_MessageList(Gsm_MessageList gsm_MessageList)
	{
	    Gsm_message __object = new Gsm_message();

	    __object.setGsm_MessageList(gsm_MessageList);
	    return __object;
	}
	
	public boolean hasGsm_MessageList()
	{
	    return getChosenFlag() == gsm_MessageList_chosen;
	}
	
	public void setGsm_MessageList(Gsm_MessageList gsm_MessageList)
	{
	    setChosenValue(gsm_MessageList);
	    setChosenFlag(gsm_MessageList_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Gsm_MessageList from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Gsm_MessageList extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Gsm_MessageList()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Gsm_MessageList(rrc.informationelements.GSM_MessageList gsm_Messages)
	    {
		setGsm_Messages(gsm_Messages);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.GSM_MessageList();
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
			return new rrc.informationelements.GSM_MessageList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "gsm_Messages"
	    public rrc.informationelements.GSM_MessageList getGsm_Messages()
	    {
		return (rrc.informationelements.GSM_MessageList)mComponents[0];
	    }
	    
	    public void setGsm_Messages(rrc.informationelements.GSM_MessageList gsm_Messages)
	    {
		mComponents[0] = gsm_Messages;
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
		    "HandoverFromUTRANCommand_GSM_r6_IEs$Gsm_message$Gsm_MessageList"
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
					"GSM_MessageList"
				    ),
				    new QName (
					"InformationElements",
					"GSM-MessageList"
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
							new com.oss.asn1.INTEGER(512),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(512)
					    ),
					    null
					)
				    )
				)
			    ),
			    "gsm-Messages",
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
	     * Get the type descriptor (TypeInfo) of 'this' Gsm_MessageList object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Gsm_MessageList object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Gsm_MessageList

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case single_GSM_Message_chosen:
		    return new Single_GSM_Message();
		case gsm_MessageList_chosen:
		    return new Gsm_MessageList();
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
		"rrc.pdu_definitions",
		"HandoverFromUTRANCommand_GSM_r6_IEs$Gsm_message"
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
				"HandoverFromUTRANCommand_GSM_r6_IEs$Gsm_message$Single_GSM_Message"
			    )
			),
			"single-GSM-Message",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"HandoverFromUTRANCommand_GSM_r6_IEs$Gsm_message$Gsm_MessageList"
			    )
			),
			"gsm-MessageList",
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
	 * Get the type descriptor (TypeInfo) of 'this' Gsm_message object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Gsm_message object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Gsm_message

    // Methods for field "geran_SystemInfoType"
    public Geran_SystemInfoType getGeran_SystemInfoType()
    {
	return (Geran_SystemInfoType)mComponents[4];
    }
    
    public void setGeran_SystemInfoType(Geran_SystemInfoType geran_SystemInfoType)
    {
	mComponents[4] = geran_SystemInfoType;
    }
    
    public boolean hasGeran_SystemInfoType()
    {
	return componentIsPresent(4);
    }
    
    public void deleteGeran_SystemInfoType()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type Geran_SystemInfoType from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class Geran_SystemInfoType extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Geran_SystemInfoType()
	{
	}
	
	public static final  int  sI_chosen = 1;
	public static final  int  pSI_chosen = 2;
	
	// Methods for field "sI"
	public static Geran_SystemInfoType createGeran_SystemInfoTypeWithSI(rrc.informationelements.GERAN_SystemInformation sI)
	{
	    Geran_SystemInfoType __object = new Geran_SystemInfoType();

	    __object.setSI(sI);
	    return __object;
	}
	
	public boolean hasSI()
	{
	    return getChosenFlag() == sI_chosen;
	}
	
	public void setSI(rrc.informationelements.GERAN_SystemInformation sI)
	{
	    setChosenValue(sI);
	    setChosenFlag(sI_chosen);
	}
	
	
	// Methods for field "pSI"
	public static Geran_SystemInfoType createGeran_SystemInfoTypeWithPSI(rrc.informationelements.GERAN_SystemInformation pSI)
	{
	    Geran_SystemInfoType __object = new Geran_SystemInfoType();

	    __object.setPSI(pSI);
	    return __object;
	}
	
	public boolean hasPSI()
	{
	    return getChosenFlag() == pSI_chosen;
	}
	
	public void setPSI(rrc.informationelements.GERAN_SystemInformation pSI)
	{
	    setChosenValue(pSI);
	    setChosenFlag(pSI_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case sI_chosen:
		    return new rrc.informationelements.GERAN_SystemInformation();
		case pSI_chosen:
		    return new rrc.informationelements.GERAN_SystemInformation();
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"HandoverFromUTRANCommand_GSM_r6_IEs$Geran_SystemInfoType"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "GERAN_SystemInformation"
				),
				new QName (
				    "InformationElements",
				    "GERAN-SystemInformation"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"GERAN_SystemInfoBlock"
				    )
				)
			    )
			),
			"sI",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "GERAN_SystemInformation"
				),
				new QName (
				    "InformationElements",
				    "GERAN-SystemInformation"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"GERAN_SystemInfoBlock"
				    )
				)
			    )
			),
			"pSI",
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
	 * Get the type descriptor (TypeInfo) of 'this' Geran_SystemInfoType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Geran_SystemInfoType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Geran_SystemInfoType

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
	    "HandoverFromUTRANCommand_GSM_r6_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverFromUTRANCommand-GSM-r6-IEs"
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
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RAB_InformationList_r6"
			    ),
			    new QName (
				"InformationElements",
				"RAB-InformationList-r6"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_Info_r6"
				)
			    )
			)
		    ),
		    "toHandoverRAB-Info",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "frequency-band",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverFromUTRANCommand_GSM_r6_IEs$Gsm_message"
			)
		    ),
		    "gsm-message",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverFromUTRANCommand_GSM_r6_IEs$Geran_SystemInfoType"
			)
		    ),
		    "geran-SystemInfoType",
		    4,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_GSM_r6_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_GSM_r6_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverFromUTRANCommand_GSM_r6_IEs
