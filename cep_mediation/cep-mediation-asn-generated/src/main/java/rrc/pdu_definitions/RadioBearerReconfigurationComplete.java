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
 * Define the ASN1 Type RadioBearerReconfigurationComplete from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RadioBearerReconfigurationComplete extends Sequence {
    
    /**
     * The default constructor.
     */
    public RadioBearerReconfigurationComplete()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RadioBearerReconfigurationComplete(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.IntegrityProtActivationInfo ul_IntegProtActivationInfo, 
		    rrc.informationelements.UL_TimingAdvance ul_TimingAdvance, 
		    rrc.informationelements.ActivationTime count_C_ActivationTime, 
		    rrc.informationelements.RB_ActivationTimeInfoList dummy, 
		    rrc.informationelements.UL_CounterSynchronisationInfo ul_CounterSynchronisationInfo, 
		    LaterNCEs laterNCEs)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setUl_IntegProtActivationInfo(ul_IntegProtActivationInfo);
	setUl_TimingAdvance(ul_TimingAdvance);
	setCount_C_ActivationTime(count_C_ActivationTime);
	setDummy(dummy);
	setUl_CounterSynchronisationInfo(ul_CounterSynchronisationInfo);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public RadioBearerReconfigurationComplete(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.IntegrityProtActivationInfo();
	mComponents[2] = new rrc.informationelements.UL_TimingAdvance();
	mComponents[3] = new rrc.informationelements.ActivationTime();
	mComponents[4] = new rrc.informationelements.RB_ActivationTimeInfoList();
	mComponents[5] = new rrc.informationelements.UL_CounterSynchronisationInfo();
	mComponents[6] = new LaterNCEs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new rrc.informationelements.IntegrityProtActivationInfo();
	    case 2:
		return new rrc.informationelements.UL_TimingAdvance();
	    case 3:
		return new rrc.informationelements.ActivationTime();
	    case 4:
		return new rrc.informationelements.RB_ActivationTimeInfoList();
	    case 5:
		return new rrc.informationelements.UL_CounterSynchronisationInfo();
	    case 6:
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
    
    
    // Methods for field "ul_IntegProtActivationInfo"
    public rrc.informationelements.IntegrityProtActivationInfo getUl_IntegProtActivationInfo()
    {
	return (rrc.informationelements.IntegrityProtActivationInfo)mComponents[1];
    }
    
    public void setUl_IntegProtActivationInfo(rrc.informationelements.IntegrityProtActivationInfo ul_IntegProtActivationInfo)
    {
	mComponents[1] = ul_IntegProtActivationInfo;
    }
    
    public boolean hasUl_IntegProtActivationInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUl_IntegProtActivationInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ul_TimingAdvance"
    public rrc.informationelements.UL_TimingAdvance getUl_TimingAdvance()
    {
	return (rrc.informationelements.UL_TimingAdvance)mComponents[2];
    }
    
    public void setUl_TimingAdvance(rrc.informationelements.UL_TimingAdvance ul_TimingAdvance)
    {
	mComponents[2] = ul_TimingAdvance;
    }
    
    public boolean hasUl_TimingAdvance()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUl_TimingAdvance()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "count_C_ActivationTime"
    public rrc.informationelements.ActivationTime getCount_C_ActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[3];
    }
    
    public void setCount_C_ActivationTime(rrc.informationelements.ActivationTime count_C_ActivationTime)
    {
	mComponents[3] = count_C_ActivationTime;
    }
    
    public boolean hasCount_C_ActivationTime()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCount_C_ActivationTime()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "dummy"
    public rrc.informationelements.RB_ActivationTimeInfoList getDummy()
    {
	return (rrc.informationelements.RB_ActivationTimeInfoList)mComponents[4];
    }
    
    public void setDummy(rrc.informationelements.RB_ActivationTimeInfoList dummy)
    {
	mComponents[4] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "ul_CounterSynchronisationInfo"
    public rrc.informationelements.UL_CounterSynchronisationInfo getUl_CounterSynchronisationInfo()
    {
	return (rrc.informationelements.UL_CounterSynchronisationInfo)mComponents[5];
    }
    
    public void setUl_CounterSynchronisationInfo(rrc.informationelements.UL_CounterSynchronisationInfo ul_CounterSynchronisationInfo)
    {
	mComponents[5] = ul_CounterSynchronisationInfo;
    }
    
    public boolean hasUl_CounterSynchronisationInfo()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUl_CounterSynchronisationInfo()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "laterNCEs"
    public LaterNCEs getLaterNCEs()
    {
	return (LaterNCEs)mComponents[6];
    }
    
    public void setLaterNCEs(LaterNCEs laterNCEs)
    {
	mComponents[6] = laterNCEs;
    }
    
    public boolean hasLaterNCEs()
    {
	return componentIsPresent(6);
    }
    
    public void deleteLaterNCEs()
    {
	setComponentAbsent(6);
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
	public LaterNCEs(BitString radioBearerReconfigurationComplete_r3_add_ext, 
			V770NCEs v770NCEs)
	{
	    setRadioBearerReconfigurationComplete_r3_add_ext(radioBearerReconfigurationComplete_r3_add_ext);
	    setV770NCEs(v770NCEs);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new V770NCEs();
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
		    return new V770NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "radioBearerReconfigurationComplete_r3_add_ext"
	public BitString getRadioBearerReconfigurationComplete_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setRadioBearerReconfigurationComplete_r3_add_ext(BitString radioBearerReconfigurationComplete_r3_add_ext)
	{
	    mComponents[0] = radioBearerReconfigurationComplete_r3_add_ext;
	}
	
	public boolean hasRadioBearerReconfigurationComplete_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteRadioBearerReconfigurationComplete_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "v770NCEs"
	public V770NCEs getV770NCEs()
	{
	    return (V770NCEs)mComponents[1];
	}
	
	public void setV770NCEs(V770NCEs v770NCEs)
	{
	    mComponents[1] = v770NCEs;
	}
	
	public boolean hasV770NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV770NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V770NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V770NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V770NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V770NCEs(RadioBearerReconfigurationComplete_v770ext_IEs radioBearerReconfigurationComplete_v770ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setRadioBearerReconfigurationComplete_v770ext(radioBearerReconfigurationComplete_v770ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V770NCEs(RadioBearerReconfigurationComplete_v770ext_IEs radioBearerReconfigurationComplete_v770ext)
	    {
		setRadioBearerReconfigurationComplete_v770ext(radioBearerReconfigurationComplete_v770ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RadioBearerReconfigurationComplete_v770ext_IEs();
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
			return new RadioBearerReconfigurationComplete_v770ext_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "radioBearerReconfigurationComplete_v770ext"
	    public RadioBearerReconfigurationComplete_v770ext_IEs getRadioBearerReconfigurationComplete_v770ext()
	    {
		return (RadioBearerReconfigurationComplete_v770ext_IEs)mComponents[0];
	    }
	    
	    public void setRadioBearerReconfigurationComplete_v770ext(RadioBearerReconfigurationComplete_v770ext_IEs radioBearerReconfigurationComplete_v770ext)
	    {
		mComponents[0] = radioBearerReconfigurationComplete_v770ext;
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
			"RadioBearerReconfigurationComplete$LaterNCEs$V770NCEs$NonCriticalExtensions"
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
		    "RadioBearerReconfigurationComplete$LaterNCEs$V770NCEs"
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
					"RadioBearerReconfigurationComplete_v770ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"RadioBearerReconfigurationComplete-v770ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RadioBearerReconfigurationComplete_v770ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RadioBearerReconfigurationComplete_v770ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "radioBearerReconfigurationComplete-v770ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReconfigurationComplete$LaterNCEs$V770NCEs$NonCriticalExtensions"
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
	     * Get the type descriptor (TypeInfo) of 'this' V770NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V770NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V770NCEs

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RadioBearerReconfigurationComplete$LaterNCEs"
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
			"radioBearerReconfigurationComplete-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerReconfigurationComplete$LaterNCEs$V770NCEs"
			    )
			),
			"v770NCEs",
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
	    "RadioBearerReconfigurationComplete"
	),
	new QName (
	    "PDU-definitions",
	    "RadioBearerReconfigurationComplete"
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
				"IntegrityProtActivationInfo"
			    ),
			    new QName (
				"InformationElements",
				"IntegrityProtActivationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtActivationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtActivationInfo"
				)
			    ),
			    0
			)
		    ),
		    "ul-IntegProtActivationInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_TimingAdvance"
			    ),
			    new QName (
				"InformationElements",
				"UL-TimingAdvance"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.UL_TimingAdvance(0), 
				    new rrc.informationelements.UL_TimingAdvance(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "ul-TimingAdvance",
		    2,
		    3,
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
		    "count-C-ActivationTime",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_ActivationTimeInfoList"
			    ),
			    new QName (
				"InformationElements",
				"RB-ActivationTimeInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RB_ActivationTimeInfo"
				)
			    )
			)
		    ),
		    "dummy",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_CounterSynchronisationInfo"
			    ),
			    new QName (
				"InformationElements",
				"UL-CounterSynchronisationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CounterSynchronisationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CounterSynchronisationInfo"
				)
			    ),
			    0
			)
		    ),
		    "ul-CounterSynchronisationInfo",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RadioBearerReconfigurationComplete$LaterNCEs"
			)
		    ),
		    "laterNCEs",
		    6,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioBearerReconfigurationComplete object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioBearerReconfigurationComplete object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioBearerReconfigurationComplete
