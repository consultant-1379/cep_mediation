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
 * Define the ASN1 Type PUSCHCapacityRequest from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class PUSCHCapacityRequest extends Sequence {
    
    /**
     * The default constructor.
     */
    public PUSCHCapacityRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PUSCHCapacityRequest(rrc.informationelements.DSCH_RNTI dsch_RNTI, 
		    rrc.informationelements.TrafficVolumeMeasuredResultsList trafficVolume, 
		    rrc.informationelements.TimeslotListWithISCP timeslotListWithISCP, 
		    rrc.informationelements.PrimaryCCPCH_RSCP primaryCCPCH_RSCP, 
		    AllocationConfirmation allocationConfirmation, 
		    rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo protocolErrorIndicator, 
		    LaterNCEs laterNCEs)
    {
	setDsch_RNTI(dsch_RNTI);
	setTrafficVolume(trafficVolume);
	setTimeslotListWithISCP(timeslotListWithISCP);
	setPrimaryCCPCH_RSCP(primaryCCPCH_RSCP);
	setAllocationConfirmation(allocationConfirmation);
	setProtocolErrorIndicator(protocolErrorIndicator);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public PUSCHCapacityRequest(rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo protocolErrorIndicator)
    {
	setProtocolErrorIndicator(protocolErrorIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.DSCH_RNTI();
	mComponents[1] = new rrc.informationelements.TrafficVolumeMeasuredResultsList();
	mComponents[2] = new rrc.informationelements.TimeslotListWithISCP();
	mComponents[3] = new rrc.informationelements.PrimaryCCPCH_RSCP();
	mComponents[4] = new AllocationConfirmation();
	mComponents[5] = new rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo();
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
		return new rrc.informationelements.DSCH_RNTI();
	    case 1:
		return new rrc.informationelements.TrafficVolumeMeasuredResultsList();
	    case 2:
		return new rrc.informationelements.TimeslotListWithISCP();
	    case 3:
		return new rrc.informationelements.PrimaryCCPCH_RSCP();
	    case 4:
		return new AllocationConfirmation();
	    case 5:
		return new rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo();
	    case 6:
		return new LaterNCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dsch_RNTI"
    public rrc.informationelements.DSCH_RNTI getDsch_RNTI()
    {
	return (rrc.informationelements.DSCH_RNTI)mComponents[0];
    }
    
    public void setDsch_RNTI(rrc.informationelements.DSCH_RNTI dsch_RNTI)
    {
	mComponents[0] = dsch_RNTI;
    }
    
    public boolean hasDsch_RNTI()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDsch_RNTI()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "trafficVolume"
    public rrc.informationelements.TrafficVolumeMeasuredResultsList getTrafficVolume()
    {
	return (rrc.informationelements.TrafficVolumeMeasuredResultsList)mComponents[1];
    }
    
    public void setTrafficVolume(rrc.informationelements.TrafficVolumeMeasuredResultsList trafficVolume)
    {
	mComponents[1] = trafficVolume;
    }
    
    public boolean hasTrafficVolume()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTrafficVolume()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "timeslotListWithISCP"
    public rrc.informationelements.TimeslotListWithISCP getTimeslotListWithISCP()
    {
	return (rrc.informationelements.TimeslotListWithISCP)mComponents[2];
    }
    
    public void setTimeslotListWithISCP(rrc.informationelements.TimeslotListWithISCP timeslotListWithISCP)
    {
	mComponents[2] = timeslotListWithISCP;
    }
    
    public boolean hasTimeslotListWithISCP()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTimeslotListWithISCP()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "primaryCCPCH_RSCP"
    public rrc.informationelements.PrimaryCCPCH_RSCP getPrimaryCCPCH_RSCP()
    {
	return (rrc.informationelements.PrimaryCCPCH_RSCP)mComponents[3];
    }
    
    public void setPrimaryCCPCH_RSCP(rrc.informationelements.PrimaryCCPCH_RSCP primaryCCPCH_RSCP)
    {
	mComponents[3] = primaryCCPCH_RSCP;
    }
    
    public boolean hasPrimaryCCPCH_RSCP()
    {
	return componentIsPresent(3);
    }
    
    public void deletePrimaryCCPCH_RSCP()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "allocationConfirmation"
    public AllocationConfirmation getAllocationConfirmation()
    {
	return (AllocationConfirmation)mComponents[4];
    }
    
    public void setAllocationConfirmation(AllocationConfirmation allocationConfirmation)
    {
	mComponents[4] = allocationConfirmation;
    }
    
    public boolean hasAllocationConfirmation()
    {
	return componentIsPresent(4);
    }
    
    public void deleteAllocationConfirmation()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type AllocationConfirmation from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class AllocationConfirmation extends Choice {
	
	/**
	 * The default constructor.
	 */
	public AllocationConfirmation()
	{
	}
	
	public static final  int  pdschConfirmation_chosen = 1;
	public static final  int  puschConfirmation_chosen = 2;
	
	// Methods for field "pdschConfirmation"
	public static AllocationConfirmation createAllocationConfirmationWithPdschConfirmation(long pdschConfirmation)
	{
	    return createAllocationConfirmationWithPdschConfirmation(new rrc.informationelements.PDSCH_Identity(pdschConfirmation));
	}
	
	public static AllocationConfirmation createAllocationConfirmationWithPdschConfirmation(rrc.informationelements.PDSCH_Identity pdschConfirmation)
	{
	    AllocationConfirmation __object = new AllocationConfirmation();

	    __object.setPdschConfirmation(pdschConfirmation);
	    return __object;
	}
	
	public boolean hasPdschConfirmation()
	{
	    return getChosenFlag() == pdschConfirmation_chosen;
	}
	
	public void setPdschConfirmation(long pdschConfirmation)
	{
	    setPdschConfirmation(new rrc.informationelements.PDSCH_Identity(pdschConfirmation));
	}
	
	public void setPdschConfirmation(rrc.informationelements.PDSCH_Identity pdschConfirmation)
	{
	    setChosenValue(pdschConfirmation);
	    setChosenFlag(pdschConfirmation_chosen);
	}
	
	
	// Methods for field "puschConfirmation"
	public static AllocationConfirmation createAllocationConfirmationWithPuschConfirmation(long puschConfirmation)
	{
	    return createAllocationConfirmationWithPuschConfirmation(new rrc.informationelements.PUSCH_Identity(puschConfirmation));
	}
	
	public static AllocationConfirmation createAllocationConfirmationWithPuschConfirmation(rrc.informationelements.PUSCH_Identity puschConfirmation)
	{
	    AllocationConfirmation __object = new AllocationConfirmation();

	    __object.setPuschConfirmation(puschConfirmation);
	    return __object;
	}
	
	public boolean hasPuschConfirmation()
	{
	    return getChosenFlag() == puschConfirmation_chosen;
	}
	
	public void setPuschConfirmation(long puschConfirmation)
	{
	    setPuschConfirmation(new rrc.informationelements.PUSCH_Identity(puschConfirmation));
	}
	
	public void setPuschConfirmation(rrc.informationelements.PUSCH_Identity puschConfirmation)
	{
	    setChosenValue(puschConfirmation);
	    setChosenFlag(puschConfirmation_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case pdschConfirmation_chosen:
		    return new rrc.informationelements.PDSCH_Identity();
		case puschConfirmation_chosen:
		    return new rrc.informationelements.PUSCH_Identity();
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
		"PUSCHCapacityRequest$AllocationConfirmation"
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
				    "rrc.informationelements",
				    "PDSCH_Identity"
				),
				new QName (
				    "InformationElements",
				    "PDSCH-Identity"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new rrc.informationelements.PDSCH_Identity(1), 
					new rrc.informationelements.PDSCH_Identity(64),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(64)
				),
				null
			    )
			),
			"pdschConfirmation",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "PUSCH_Identity"
				),
				new QName (
				    "InformationElements",
				    "PUSCH-Identity"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new rrc.informationelements.PUSCH_Identity(1), 
					new rrc.informationelements.PUSCH_Identity(64),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(64)
				),
				null
			    )
			),
			"puschConfirmation",
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
	 * Get the type descriptor (TypeInfo) of 'this' AllocationConfirmation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' AllocationConfirmation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for AllocationConfirmation

    // Methods for field "protocolErrorIndicator"
    public rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo getProtocolErrorIndicator()
    {
	return (rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo)mComponents[5];
    }
    
    public void setProtocolErrorIndicator(rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo protocolErrorIndicator)
    {
	mComponents[5] = protocolErrorIndicator;
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
	public LaterNCEs(BitString puschCapacityRequest_r3_add_ext, 
			V590NCEs v590NCEs)
	{
	    setPuschCapacityRequest_r3_add_ext(puschCapacityRequest_r3_add_ext);
	    setV590NCEs(v590NCEs);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new V590NCEs();
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
		    return new V590NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "puschCapacityRequest_r3_add_ext"
	public BitString getPuschCapacityRequest_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setPuschCapacityRequest_r3_add_ext(BitString puschCapacityRequest_r3_add_ext)
	{
	    mComponents[0] = puschCapacityRequest_r3_add_ext;
	}
	
	public boolean hasPuschCapacityRequest_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deletePuschCapacityRequest_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "v590NCEs"
	public V590NCEs getV590NCEs()
	{
	    return (V590NCEs)mComponents[1];
	}
	
	public void setV590NCEs(V590NCEs v590NCEs)
	{
	    mComponents[1] = v590NCEs;
	}
	
	public boolean hasV590NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV590NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V590NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V590NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V590NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V590NCEs(PUSCHCapacityRequest_v590ext puschCapacityRequest_v590ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setPuschCapacityRequest_v590ext(puschCapacityRequest_v590ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V590NCEs(PUSCHCapacityRequest_v590ext puschCapacityRequest_v590ext)
	    {
		setPuschCapacityRequest_v590ext(puschCapacityRequest_v590ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PUSCHCapacityRequest_v590ext();
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
			return new PUSCHCapacityRequest_v590ext();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "puschCapacityRequest_v590ext"
	    public PUSCHCapacityRequest_v590ext getPuschCapacityRequest_v590ext()
	    {
		return (PUSCHCapacityRequest_v590ext)mComponents[0];
	    }
	    
	    public void setPuschCapacityRequest_v590ext(PUSCHCapacityRequest_v590ext puschCapacityRequest_v590ext)
	    {
		mComponents[0] = puschCapacityRequest_v590ext;
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
			"PUSCHCapacityRequest$LaterNCEs$V590NCEs$NonCriticalExtensions"
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
		    "PUSCHCapacityRequest$LaterNCEs$V590NCEs"
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
					"PUSCHCapacityRequest_v590ext"
				    ),
				    new QName (
					"PDU-definitions",
					"PUSCHCapacityRequest-v590ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "PUSCHCapacityRequest_v590ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "PUSCHCapacityRequest_v590ext"
					)
				    ),
				    0
				)
			    ),
			    "puschCapacityRequest-v590ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PUSCHCapacityRequest$LaterNCEs$V590NCEs$NonCriticalExtensions"
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
	     * Get the type descriptor (TypeInfo) of 'this' V590NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V590NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V590NCEs

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
		"PUSCHCapacityRequest$LaterNCEs"
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
			"puschCapacityRequest-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"PUSCHCapacityRequest$LaterNCEs$V590NCEs"
			    )
			),
			"v590NCEs",
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
	    "PUSCHCapacityRequest"
	),
	new QName (
	    "PDU-definitions",
	    "PUSCHCapacityRequest"
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
				"rrc.informationelements",
				"DSCH_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"DSCH-RNTI"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "dsch-RNTI",
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
				"TrafficVolumeMeasuredResultsList"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeMeasuredResultsList"
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
				    "TrafficVolumeMeasuredResults"
				)
			    )
			)
		    ),
		    "trafficVolume",
		    1,
		    3,
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
				"TimeslotListWithISCP"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotListWithISCP"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(14),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(14)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TimeslotWithISCP"
				)
			    )
			)
		    ),
		    "timeslotListWithISCP",
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
				"PrimaryCCPCH_RSCP"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCCPCH-RSCP"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.PrimaryCCPCH_RSCP(0), 
				    new rrc.informationelements.PrimaryCCPCH_RSCP(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "primaryCCPCH-RSCP",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "PUSCHCapacityRequest$AllocationConfirmation"
			)
		    ),
		    "allocationConfirmation",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ProtocolErrorIndicatorWithMoreInfo"
			    ),
			    new QName (
				"InformationElements",
				"ProtocolErrorIndicatorWithMoreInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ProtocolErrorIndicatorWithMoreInfo"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "protocolErrorIndicator",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "PUSCHCapacityRequest$LaterNCEs"
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' PUSCHCapacityRequest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PUSCHCapacityRequest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PUSCHCapacityRequest
