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
 * Define the ASN1 Type UTRANMobilityInformationConfirm from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UTRANMobilityInformationConfirm extends Sequence {
    
    /**
     * The default constructor.
     */
    public UTRANMobilityInformationConfirm()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UTRANMobilityInformationConfirm(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.IntegrityProtActivationInfo ul_IntegProtActivationInfo, 
		    rrc.informationelements.ActivationTime count_C_ActivationTime, 
		    rrc.informationelements.RB_ActivationTimeInfoList dummy, 
		    rrc.informationelements.UL_CounterSynchronisationInfo ul_CounterSynchronisationInfo, 
		    LaterNCEs laterNCEs)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setUl_IntegProtActivationInfo(ul_IntegProtActivationInfo);
	setCount_C_ActivationTime(count_C_ActivationTime);
	setDummy(dummy);
	setUl_CounterSynchronisationInfo(ul_CounterSynchronisationInfo);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public UTRANMobilityInformationConfirm(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.IntegrityProtActivationInfo();
	mComponents[2] = new rrc.informationelements.ActivationTime();
	mComponents[3] = new rrc.informationelements.RB_ActivationTimeInfoList();
	mComponents[4] = new rrc.informationelements.UL_CounterSynchronisationInfo();
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
		return new rrc.informationelements.IntegrityProtActivationInfo();
	    case 2:
		return new rrc.informationelements.ActivationTime();
	    case 3:
		return new rrc.informationelements.RB_ActivationTimeInfoList();
	    case 4:
		return new rrc.informationelements.UL_CounterSynchronisationInfo();
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
    
    
    // Methods for field "count_C_ActivationTime"
    public rrc.informationelements.ActivationTime getCount_C_ActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[2];
    }
    
    public void setCount_C_ActivationTime(rrc.informationelements.ActivationTime count_C_ActivationTime)
    {
	mComponents[2] = count_C_ActivationTime;
    }
    
    public boolean hasCount_C_ActivationTime()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCount_C_ActivationTime()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "dummy"
    public rrc.informationelements.RB_ActivationTimeInfoList getDummy()
    {
	return (rrc.informationelements.RB_ActivationTimeInfoList)mComponents[3];
    }
    
    public void setDummy(rrc.informationelements.RB_ActivationTimeInfoList dummy)
    {
	mComponents[3] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "ul_CounterSynchronisationInfo"
    public rrc.informationelements.UL_CounterSynchronisationInfo getUl_CounterSynchronisationInfo()
    {
	return (rrc.informationelements.UL_CounterSynchronisationInfo)mComponents[4];
    }
    
    public void setUl_CounterSynchronisationInfo(rrc.informationelements.UL_CounterSynchronisationInfo ul_CounterSynchronisationInfo)
    {
	mComponents[4] = ul_CounterSynchronisationInfo;
    }
    
    public boolean hasUl_CounterSynchronisationInfo()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUl_CounterSynchronisationInfo()
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
	public LaterNCEs(BitString utranMobilityInformationConfirm_r3_add_ext, 
			V770NCE v770NCE)
	{
	    setUtranMobilityInformationConfirm_r3_add_ext(utranMobilityInformationConfirm_r3_add_ext);
	    setV770NCE(v770NCE);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new V770NCE();
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
		    return new V770NCE();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "utranMobilityInformationConfirm_r3_add_ext"
	public BitString getUtranMobilityInformationConfirm_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setUtranMobilityInformationConfirm_r3_add_ext(BitString utranMobilityInformationConfirm_r3_add_ext)
	{
	    mComponents[0] = utranMobilityInformationConfirm_r3_add_ext;
	}
	
	public boolean hasUtranMobilityInformationConfirm_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteUtranMobilityInformationConfirm_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "v770NCE"
	public V770NCE getV770NCE()
	{
	    return (V770NCE)mComponents[1];
	}
	
	public void setV770NCE(V770NCE v770NCE)
	{
	    mComponents[1] = v770NCE;
	}
	
	public boolean hasV770NCE()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV770NCE()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V770NCE from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V770NCE extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V770NCE()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V770NCE(UTRANMobilityInformationConfirm_v770ext_IEs utranMobilityInformationConfirm_v770ext, 
			    Va40NCEs va40NCEs)
	    {
		setUtranMobilityInformationConfirm_v770ext(utranMobilityInformationConfirm_v770ext);
		setVa40NCEs(va40NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V770NCE(UTRANMobilityInformationConfirm_v770ext_IEs utranMobilityInformationConfirm_v770ext)
	    {
		setUtranMobilityInformationConfirm_v770ext(utranMobilityInformationConfirm_v770ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UTRANMobilityInformationConfirm_v770ext_IEs();
		mComponents[1] = new Va40NCEs();
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
			return new UTRANMobilityInformationConfirm_v770ext_IEs();
		    case 1:
			return new Va40NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "utranMobilityInformationConfirm_v770ext"
	    public UTRANMobilityInformationConfirm_v770ext_IEs getUtranMobilityInformationConfirm_v770ext()
	    {
		return (UTRANMobilityInformationConfirm_v770ext_IEs)mComponents[0];
	    }
	    
	    public void setUtranMobilityInformationConfirm_v770ext(UTRANMobilityInformationConfirm_v770ext_IEs utranMobilityInformationConfirm_v770ext)
	    {
		mComponents[0] = utranMobilityInformationConfirm_v770ext;
	    }
	    
	    
	    // Methods for field "va40NCEs"
	    public Va40NCEs getVa40NCEs()
	    {
		return (Va40NCEs)mComponents[1];
	    }
	    
	    public void setVa40NCEs(Va40NCEs va40NCEs)
	    {
		mComponents[1] = va40NCEs;
	    }
	    
	    public boolean hasVa40NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteVa40NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Va40NCEs from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class Va40NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Va40NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Va40NCEs(UTRANMobilityInformationConfirm_va40ext_IEs utranMobilityInformationConfirm_va40ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setUtranMobilityInformationConfirm_va40ext(utranMobilityInformationConfirm_va40ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public Va40NCEs(UTRANMobilityInformationConfirm_va40ext_IEs utranMobilityInformationConfirm_va40ext)
		{
		    setUtranMobilityInformationConfirm_va40ext(utranMobilityInformationConfirm_va40ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UTRANMobilityInformationConfirm_va40ext_IEs();
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
			    return new UTRANMobilityInformationConfirm_va40ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "utranMobilityInformationConfirm_va40ext"
		public UTRANMobilityInformationConfirm_va40ext_IEs getUtranMobilityInformationConfirm_va40ext()
		{
		    return (UTRANMobilityInformationConfirm_va40ext_IEs)mComponents[0];
		}
		
		public void setUtranMobilityInformationConfirm_va40ext(UTRANMobilityInformationConfirm_va40ext_IEs utranMobilityInformationConfirm_va40ext)
		{
		    mComponents[0] = utranMobilityInformationConfirm_va40ext;
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
			    "UTRANMobilityInformationConfirm$LaterNCEs$V770NCE$Va40NCEs$NonCriticalExtensions"
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
			"UTRANMobilityInformationConfirm$LaterNCEs$V770NCE$Va40NCEs"
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
					    "UTRANMobilityInformationConfirm_va40ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "UTRANMobilityInformationConfirm-va40ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"UTRANMobilityInformationConfirm_va40ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"UTRANMobilityInformationConfirm_va40ext_IEs"
					    )
					),
					0
				    )
				),
				"utranMobilityInformationConfirm-va40ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"UTRANMobilityInformationConfirm$LaterNCEs$V770NCE$Va40NCEs$NonCriticalExtensions"
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
		 * Get the type descriptor (TypeInfo) of 'this' Va40NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Va40NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Va40NCEs

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
		    "UTRANMobilityInformationConfirm$LaterNCEs$V770NCE"
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
					"UTRANMobilityInformationConfirm_v770ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"UTRANMobilityInformationConfirm-v770ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UTRANMobilityInformationConfirm_v770ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UTRANMobilityInformationConfirm_v770ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "utranMobilityInformationConfirm-v770ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UTRANMobilityInformationConfirm$LaterNCEs$V770NCE$Va40NCEs"
				)
			    ),
			    "va40NCEs",
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
	     * Get the type descriptor (TypeInfo) of 'this' V770NCE object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V770NCE object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V770NCE

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
		"UTRANMobilityInformationConfirm$LaterNCEs"
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
			"utranMobilityInformationConfirm-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UTRANMobilityInformationConfirm$LaterNCEs$V770NCE"
			    )
			),
			"v770NCE",
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
	    "UTRANMobilityInformationConfirm"
	),
	new QName (
	    "PDU-definitions",
	    "UTRANMobilityInformationConfirm"
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
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UTRANMobilityInformationConfirm$LaterNCEs"
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' UTRANMobilityInformationConfirm object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRANMobilityInformationConfirm object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRANMobilityInformationConfirm
