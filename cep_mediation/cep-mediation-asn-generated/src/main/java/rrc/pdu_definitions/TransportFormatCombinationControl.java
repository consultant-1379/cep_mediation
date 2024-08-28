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
 * Define the ASN1 Type TransportFormatCombinationControl from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class TransportFormatCombinationControl extends Sequence {
    
    /**
     * The default constructor.
     */
    public TransportFormatCombinationControl()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TransportFormatCombinationControl(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    ModeSpecificInfo modeSpecificInfo, 
		    rrc.informationelements.TFC_Subset dpch_TFCS_InUplink, 
		    rrc.informationelements.ActivationTime activationTimeForTFCSubset, 
		    rrc.informationelements.TFC_ControlDuration tfc_ControlDuration, 
		    LaterNCEs laterNCEs)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setModeSpecificInfo(modeSpecificInfo);
	setDpch_TFCS_InUplink(dpch_TFCS_InUplink);
	setActivationTimeForTFCSubset(activationTimeForTFCSubset);
	setTfc_ControlDuration(tfc_ControlDuration);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public TransportFormatCombinationControl(ModeSpecificInfo modeSpecificInfo, 
		    rrc.informationelements.TFC_Subset dpch_TFCS_InUplink)
    {
	setModeSpecificInfo(modeSpecificInfo);
	setDpch_TFCS_InUplink(dpch_TFCS_InUplink);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new ModeSpecificInfo();
	mComponents[2] = new rrc.informationelements.TFC_Subset();
	mComponents[3] = new rrc.informationelements.ActivationTime();
	mComponents[4] = rrc.informationelements.TFC_ControlDuration.tfc_cd1;
	mComponents[5] = new LaterNCEs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new ModeSpecificInfo();
	    case 2:
		return new rrc.informationelements.TFC_Subset();
	    case 3:
		return new rrc.informationelements.ActivationTime();
	    case 4:
		return rrc.informationelements.TFC_ControlDuration.tfc_cd1;
	    case 5:
		return new LaterNCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[0];
    }
    
    public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[0] = rrc_TransactionIdentifier;
    }
    
    public boolean hasRrc_TransactionIdentifier()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRrc_TransactionIdentifier()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[1];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[1] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Null fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Null fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	// Methods for field "tdd"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Tdd tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Tdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd(rrc.informationelements.TFCS_Identity tfcs_ID)
	    {
		setTfcs_ID(tfcs_ID);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.TFCS_Identity();
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
			return new rrc.informationelements.TFCS_Identity();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "tfcs_ID"
	    public rrc.informationelements.TFCS_Identity getTfcs_ID()
	    {
		return (rrc.informationelements.TFCS_Identity)mComponents[0];
	    }
	    
	    public void setTfcs_ID(rrc.informationelements.TFCS_Identity tfcs_ID)
	    {
		mComponents[0] = tfcs_ID;
	    }
	    
	    public boolean hasTfcs_ID()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteTfcs_ID()
	    {
		setComponentAbsent(0);
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
		    "TransportFormatCombinationControl$ModeSpecificInfo$Tdd"
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
					"TFCS_Identity"
				    ),
				    new QName (
					"InformationElements",
					"TFCS-Identity"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "TFCS_Identity"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "TFCS_Identity"
					)
				    ),
				    0
				)
			    ),
			    "tfcs-ID",
			    0,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Null();
		case tdd_chosen:
		    return new Tdd();
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
		"rrc.pdu_definitions",
		"TransportFormatCombinationControl$ModeSpecificInfo"
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
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"TransportFormatCombinationControl$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

    // Methods for field "dpch_TFCS_InUplink"
    public rrc.informationelements.TFC_Subset getDpch_TFCS_InUplink()
    {
	return (rrc.informationelements.TFC_Subset)mComponents[2];
    }
    
    public void setDpch_TFCS_InUplink(rrc.informationelements.TFC_Subset dpch_TFCS_InUplink)
    {
	mComponents[2] = dpch_TFCS_InUplink;
    }
    
    
    // Methods for field "activationTimeForTFCSubset"
    public rrc.informationelements.ActivationTime getActivationTimeForTFCSubset()
    {
	return (rrc.informationelements.ActivationTime)mComponents[3];
    }
    
    public void setActivationTimeForTFCSubset(rrc.informationelements.ActivationTime activationTimeForTFCSubset)
    {
	mComponents[3] = activationTimeForTFCSubset;
    }
    
    public boolean hasActivationTimeForTFCSubset()
    {
	return componentIsPresent(3);
    }
    
    public void deleteActivationTimeForTFCSubset()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "tfc_ControlDuration"
    public rrc.informationelements.TFC_ControlDuration getTfc_ControlDuration()
    {
	return (rrc.informationelements.TFC_ControlDuration)mComponents[4];
    }
    
    public void setTfc_ControlDuration(rrc.informationelements.TFC_ControlDuration tfc_ControlDuration)
    {
	mComponents[4] = tfc_ControlDuration;
    }
    
    public boolean hasTfc_ControlDuration()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTfc_ControlDuration()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "laterNCEs"
    public LaterNCEs getLaterNCEs()
    {
	return (LaterNCEs)mComponents[5];
    }
    
    public void setLaterNCEs(LaterNCEs laterNCEs)
    {
	mComponents[5] = laterNCEs;
    }
    
    public boolean hasLaterNCEs()
    {
	return componentIsPresent(5);
    }
    
    public void deleteLaterNCEs()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type LaterNCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class LaterNCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public LaterNCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public LaterNCEs(BitString transportFormatCombinationControl_r3_add_ext, 
			V820NCEs v820NCEs)
	{
	    setTransportFormatCombinationControl_r3_add_ext(transportFormatCombinationControl_r3_add_ext);
	    setV820NCEs(v820NCEs);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new V820NCEs();
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
		    return new BitString();
		case 1:
		    return new V820NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "transportFormatCombinationControl_r3_add_ext"
	public BitString getTransportFormatCombinationControl_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setTransportFormatCombinationControl_r3_add_ext(BitString transportFormatCombinationControl_r3_add_ext)
	{
	    mComponents[0] = transportFormatCombinationControl_r3_add_ext;
	}
	
	public boolean hasTransportFormatCombinationControl_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteTransportFormatCombinationControl_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "v820NCEs"
	public V820NCEs getV820NCEs()
	{
	    return (V820NCEs)mComponents[1];
	}
	
	public void setV820NCEs(V820NCEs v820NCEs)
	{
	    mComponents[1] = v820NCEs;
	}
	
	public boolean hasV820NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV820NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V820NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V820NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V820NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V820NCEs(TransportFormatCombinationControl_v820ext_IEs transportformatcombinationcontrol_v820ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setTransportformatcombinationcontrol_v820ext(transportformatcombinationcontrol_v820ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V820NCEs(TransportFormatCombinationControl_v820ext_IEs transportformatcombinationcontrol_v820ext)
	    {
		setTransportformatcombinationcontrol_v820ext(transportformatcombinationcontrol_v820ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new TransportFormatCombinationControl_v820ext_IEs();
		mComponents[1] = new NonCriticalExtensions();
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
			return new TransportFormatCombinationControl_v820ext_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "transportformatcombinationcontrol_v820ext"
	    public TransportFormatCombinationControl_v820ext_IEs getTransportformatcombinationcontrol_v820ext()
	    {
		return (TransportFormatCombinationControl_v820ext_IEs)mComponents[0];
	    }
	    
	    public void setTransportformatcombinationcontrol_v820ext(TransportFormatCombinationControl_v820ext_IEs transportformatcombinationcontrol_v820ext)
	    {
		mComponents[0] = transportformatcombinationcontrol_v820ext;
	    }
	    
	    
	    // Methods for field "nonCriticalExtensions"
	    public NonCriticalExtensions getNonCriticalExtensions()
	    {
		return (NonCriticalExtensions)mComponents[1];
	    }
	    
	    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
	    {
		mComponents[1] = nonCriticalExtensions;
	    }
	    
	    public boolean hasNonCriticalExtensions()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteNonCriticalExtensions()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class NonCriticalExtensions extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public NonCriticalExtensions()
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"TransportFormatCombinationControl$LaterNCEs$V820NCEs$NonCriticalExtensions"
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
		 * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for NonCriticalExtensions

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
		    "TransportFormatCombinationControl$LaterNCEs$V820NCEs"
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
					"rrc.pdu_definitions",
					"TransportFormatCombinationControl_v820ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"TransportFormatCombinationControl-v820ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "TransportFormatCombinationControl_v820ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "TransportFormatCombinationControl_v820ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "transportformatcombinationcontrol-v820ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportFormatCombinationControl$LaterNCEs$V820NCEs$NonCriticalExtensions"
				)
			    ),
			    "nonCriticalExtensions",
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
	     * Get the type descriptor (TypeInfo) of 'this' V820NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V820NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V820NCEs

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"TransportFormatCombinationControl$LaterNCEs"
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
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
				null,
				null,
				null
			    )
			),
			"transportFormatCombinationControl-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"TransportFormatCombinationControl$LaterNCEs$V820NCEs"
			    )
			),
			"v820NCEs",
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
			    new TagDecoderElement((short)0x8000, 0),
			    new TagDecoderElement((short)0x8001, 1)
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
	 * Get the type descriptor (TypeInfo) of 'this' LaterNCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LaterNCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LaterNCEs

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
	    "TransportFormatCombinationControl"
	),
	new QName (
	    "PDU-definitions",
	    "TransportFormatCombinationControl"
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
				"RRC_TransactionIdentifier"
			    ),
			    new QName (
				"InformationElements",
				"RRC-TransactionIdentifier"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RRC_TransactionIdentifier(0), 
				    new rrc.informationelements.RRC_TransactionIdentifier(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "rrc-TransactionIdentifier",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "TransportFormatCombinationControl$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFC_Subset"
			    ),
			    new QName (
				"InformationElements",
				"TFC-Subset"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFC_Subset"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4)
				}
			    )
			)
		    ),
		    "dpch-TFCS-InUplink",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "activationTimeForTFCSubset",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFC_ControlDuration"
			    ),
			    new QName (
				"InformationElements",
				"TFC-ControlDuration"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tfc-cd1",
					0
				    ),
				    new MemberListElement (
					"tfc-cd2",
					1
				    ),
				    new MemberListElement (
					"tfc-cd4",
					2
				    ),
				    new MemberListElement (
					"tfc-cd8",
					3
				    ),
				    new MemberListElement (
					"tfc-cd16",
					4
				    ),
				    new MemberListElement (
					"tfc-cd24",
					5
				    ),
				    new MemberListElement (
					"tfc-cd32",
					6
				    ),
				    new MemberListElement (
					"tfc-cd48",
					7
				    ),
				    new MemberListElement (
					"tfc-cd64",
					8
				    ),
				    new MemberListElement (
					"tfc-cd128",
					9
				    ),
				    new MemberListElement (
					"tfc-cd192",
					10
				    ),
				    new MemberListElement (
					"tfc-cd256",
					11
				    ),
				    new MemberListElement (
					"tfc-cd512",
					12
				    )
				}
			    ),
			    0,
			    rrc.informationelements.TFC_ControlDuration.tfc_cd1
			)
		    ),
		    "tfc-ControlDuration",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "TransportFormatCombinationControl$LaterNCEs"
			)
		    ),
		    "laterNCEs",
		    5,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TransportFormatCombinationControl object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransportFormatCombinationControl object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransportFormatCombinationControl
