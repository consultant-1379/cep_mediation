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
 * Define the ASN1 Type MBMSModifiedServicesInformation from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSModifiedServicesInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSModifiedServicesInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSModifiedServicesInformation(rrc.informationelements.MBMS_ModifedServiceList_r6 modifedServiceList, 
		    Mbms_ReacquireMCCH mbms_ReacquireMCCH, 
		    rrc.informationelements.DynamicPersistenceLevel mbms_DynamicPersistenceLevel, 
		    INTEGER endOfModifiedMCCHInformation, 
		    rrc.informationelements.MBMS_NumberOfNeighbourCells_r6 mbmsNumberOfNeighbourCells, 
		    Mbms_AllUnmodifiedPTMServices mbms_AllUnmodifiedPTMServices, 
		    rrc.informationelements.MBMS_PTMActivationTime_r6 mbms_PTMActivationTime, 
		    V770NCEs v770NCEs)
    {
	setModifedServiceList(modifedServiceList);
	setMbms_ReacquireMCCH(mbms_ReacquireMCCH);
	setMbms_DynamicPersistenceLevel(mbms_DynamicPersistenceLevel);
	setEndOfModifiedMCCHInformation(endOfModifiedMCCHInformation);
	setMbmsNumberOfNeighbourCells(mbmsNumberOfNeighbourCells);
	setMbms_AllUnmodifiedPTMServices(mbms_AllUnmodifiedPTMServices);
	setMbms_PTMActivationTime(mbms_PTMActivationTime);
	setV770NCEs(v770NCEs);
    }
    
    /**
     * Construct with components.
     */
    public MBMSModifiedServicesInformation(rrc.informationelements.MBMS_ModifedServiceList_r6 modifedServiceList, 
		    Mbms_ReacquireMCCH mbms_ReacquireMCCH, 
		    rrc.informationelements.DynamicPersistenceLevel mbms_DynamicPersistenceLevel, 
		    long endOfModifiedMCCHInformation, 
		    rrc.informationelements.MBMS_NumberOfNeighbourCells_r6 mbmsNumberOfNeighbourCells, 
		    Mbms_AllUnmodifiedPTMServices mbms_AllUnmodifiedPTMServices, 
		    rrc.informationelements.MBMS_PTMActivationTime_r6 mbms_PTMActivationTime, 
		    V770NCEs v770NCEs)
    {
	this(modifedServiceList, mbms_ReacquireMCCH, 
	     mbms_DynamicPersistenceLevel, 
	     new INTEGER(endOfModifiedMCCHInformation), 
	     mbmsNumberOfNeighbourCells, mbms_AllUnmodifiedPTMServices, 
	     mbms_PTMActivationTime, v770NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public MBMSModifiedServicesInformation(rrc.informationelements.MBMS_NumberOfNeighbourCells_r6 mbmsNumberOfNeighbourCells)
    {
	setMbmsNumberOfNeighbourCells(mbmsNumberOfNeighbourCells);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MBMS_ModifedServiceList_r6();
	mComponents[1] = Mbms_ReacquireMCCH._true;
	mComponents[2] = new rrc.informationelements.DynamicPersistenceLevel();
	mComponents[3] = new INTEGER();
	mComponents[4] = new rrc.informationelements.MBMS_NumberOfNeighbourCells_r6();
	mComponents[5] = Mbms_AllUnmodifiedPTMServices._true;
	mComponents[6] = new rrc.informationelements.MBMS_PTMActivationTime_r6();
	mComponents[7] = new V770NCEs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.MBMS_ModifedServiceList_r6();
	    case 1:
		return Mbms_ReacquireMCCH._true;
	    case 2:
		return new rrc.informationelements.DynamicPersistenceLevel();
	    case 3:
		return new INTEGER();
	    case 4:
		return new rrc.informationelements.MBMS_NumberOfNeighbourCells_r6();
	    case 5:
		return Mbms_AllUnmodifiedPTMServices._true;
	    case 6:
		return new rrc.informationelements.MBMS_PTMActivationTime_r6();
	    case 7:
		return new V770NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modifedServiceList"
    public rrc.informationelements.MBMS_ModifedServiceList_r6 getModifedServiceList()
    {
	return (rrc.informationelements.MBMS_ModifedServiceList_r6)mComponents[0];
    }
    
    public void setModifedServiceList(rrc.informationelements.MBMS_ModifedServiceList_r6 modifedServiceList)
    {
	mComponents[0] = modifedServiceList;
    }
    
    public boolean hasModifedServiceList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteModifedServiceList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "mbms_ReacquireMCCH"
    public Mbms_ReacquireMCCH getMbms_ReacquireMCCH()
    {
	return (Mbms_ReacquireMCCH)mComponents[1];
    }
    
    public void setMbms_ReacquireMCCH(Mbms_ReacquireMCCH mbms_ReacquireMCCH)
    {
	mComponents[1] = mbms_ReacquireMCCH;
    }
    
    public boolean hasMbms_ReacquireMCCH()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMbms_ReacquireMCCH()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Mbms_ReacquireMCCH from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class Mbms_ReacquireMCCH extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Mbms_ReacquireMCCH()
	{
	    super(cFirstNumber);
	}
	
	protected Mbms_ReacquireMCCH(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Mbms_ReacquireMCCH _true =
	    new Mbms_ReacquireMCCH(0);
	private final static Mbms_ReacquireMCCH cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static Mbms_ReacquireMCCH valueOf(long value)
	{
	    return (Mbms_ReacquireMCCH)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"MBMSModifiedServicesInformation$Mbms_ReacquireMCCH"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mbms_ReacquireMCCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mbms_ReacquireMCCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mbms_ReacquireMCCH

    // Methods for field "mbms_DynamicPersistenceLevel"
    public rrc.informationelements.DynamicPersistenceLevel getMbms_DynamicPersistenceLevel()
    {
	return (rrc.informationelements.DynamicPersistenceLevel)mComponents[2];
    }
    
    public void setMbms_DynamicPersistenceLevel(rrc.informationelements.DynamicPersistenceLevel mbms_DynamicPersistenceLevel)
    {
	mComponents[2] = mbms_DynamicPersistenceLevel;
    }
    
    public boolean hasMbms_DynamicPersistenceLevel()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMbms_DynamicPersistenceLevel()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "endOfModifiedMCCHInformation"
    public long getEndOfModifiedMCCHInformation()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setEndOfModifiedMCCHInformation(long endOfModifiedMCCHInformation)
    {
	setEndOfModifiedMCCHInformation(new INTEGER(endOfModifiedMCCHInformation));
    }
    
    public void setEndOfModifiedMCCHInformation(INTEGER endOfModifiedMCCHInformation)
    {
	mComponents[3] = endOfModifiedMCCHInformation;
    }
    
    public boolean hasEndOfModifiedMCCHInformation()
    {
	return componentIsPresent(3);
    }
    
    public void deleteEndOfModifiedMCCHInformation()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "mbmsNumberOfNeighbourCells"
    public rrc.informationelements.MBMS_NumberOfNeighbourCells_r6 getMbmsNumberOfNeighbourCells()
    {
	return (rrc.informationelements.MBMS_NumberOfNeighbourCells_r6)mComponents[4];
    }
    
    public void setMbmsNumberOfNeighbourCells(rrc.informationelements.MBMS_NumberOfNeighbourCells_r6 mbmsNumberOfNeighbourCells)
    {
	mComponents[4] = mbmsNumberOfNeighbourCells;
    }
    
    
    // Methods for field "mbms_AllUnmodifiedPTMServices"
    public Mbms_AllUnmodifiedPTMServices getMbms_AllUnmodifiedPTMServices()
    {
	return (Mbms_AllUnmodifiedPTMServices)mComponents[5];
    }
    
    public void setMbms_AllUnmodifiedPTMServices(Mbms_AllUnmodifiedPTMServices mbms_AllUnmodifiedPTMServices)
    {
	mComponents[5] = mbms_AllUnmodifiedPTMServices;
    }
    
    public boolean hasMbms_AllUnmodifiedPTMServices()
    {
	return componentIsPresent(5);
    }
    
    public void deleteMbms_AllUnmodifiedPTMServices()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type Mbms_AllUnmodifiedPTMServices from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class Mbms_AllUnmodifiedPTMServices extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Mbms_AllUnmodifiedPTMServices()
	{
	    super(cFirstNumber);
	}
	
	protected Mbms_AllUnmodifiedPTMServices(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Mbms_AllUnmodifiedPTMServices _true =
	    new Mbms_AllUnmodifiedPTMServices(0);
	private final static Mbms_AllUnmodifiedPTMServices cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static Mbms_AllUnmodifiedPTMServices valueOf(long value)
	{
	    return (Mbms_AllUnmodifiedPTMServices)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"MBMSModifiedServicesInformation$Mbms_AllUnmodifiedPTMServices"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mbms_AllUnmodifiedPTMServices object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mbms_AllUnmodifiedPTMServices object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mbms_AllUnmodifiedPTMServices

    // Methods for field "mbms_PTMActivationTime"
    public rrc.informationelements.MBMS_PTMActivationTime_r6 getMbms_PTMActivationTime()
    {
	return (rrc.informationelements.MBMS_PTMActivationTime_r6)mComponents[6];
    }
    
    public void setMbms_PTMActivationTime(rrc.informationelements.MBMS_PTMActivationTime_r6 mbms_PTMActivationTime)
    {
	mComponents[6] = mbms_PTMActivationTime;
    }
    
    public boolean hasMbms_PTMActivationTime()
    {
	return componentIsPresent(6);
    }
    
    public void deleteMbms_PTMActivationTime()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "v770NCEs"
    public V770NCEs getV770NCEs()
    {
	return (V770NCEs)mComponents[7];
    }
    
    public void setV770NCEs(V770NCEs v770NCEs)
    {
	mComponents[7] = v770NCEs;
    }
    
    public boolean hasV770NCEs()
    {
	return componentIsPresent(7);
    }
    
    public void deleteV770NCEs()
    {
	setComponentAbsent(7);
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
	public V770NCEs(MBMSModifiedServicesInformation_v770ext_IEs mbmsModifiedServicesInformation_v770ext, 
			V7c0NCEs v7c0NCEs)
	{
	    setMbmsModifiedServicesInformation_v770ext(mbmsModifiedServicesInformation_v770ext);
	    setV7c0NCEs(v7c0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V770NCEs(MBMSModifiedServicesInformation_v770ext_IEs mbmsModifiedServicesInformation_v770ext)
	{
	    setMbmsModifiedServicesInformation_v770ext(mbmsModifiedServicesInformation_v770ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MBMSModifiedServicesInformation_v770ext_IEs();
	    mComponents[1] = new V7c0NCEs();
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
		    return new MBMSModifiedServicesInformation_v770ext_IEs();
		case 1:
		    return new V7c0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "mbmsModifiedServicesInformation_v770ext"
	public MBMSModifiedServicesInformation_v770ext_IEs getMbmsModifiedServicesInformation_v770ext()
	{
	    return (MBMSModifiedServicesInformation_v770ext_IEs)mComponents[0];
	}
	
	public void setMbmsModifiedServicesInformation_v770ext(MBMSModifiedServicesInformation_v770ext_IEs mbmsModifiedServicesInformation_v770ext)
	{
	    mComponents[0] = mbmsModifiedServicesInformation_v770ext;
	}
	
	
	// Methods for field "v7c0NCEs"
	public V7c0NCEs getV7c0NCEs()
	{
	    return (V7c0NCEs)mComponents[1];
	}
	
	public void setV7c0NCEs(V7c0NCEs v7c0NCEs)
	{
	    mComponents[1] = v7c0NCEs;
	}
	
	public boolean hasV7c0NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV7c0NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V7c0NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V7c0NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V7c0NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V7c0NCEs(MBMSModifiedServicesInformation_v7c0ext_IEs mbmsModifiedServicesInformation_v7c0ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setMbmsModifiedServicesInformation_v7c0ext(mbmsModifiedServicesInformation_v7c0ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V7c0NCEs(MBMSModifiedServicesInformation_v7c0ext_IEs mbmsModifiedServicesInformation_v7c0ext)
	    {
		setMbmsModifiedServicesInformation_v7c0ext(mbmsModifiedServicesInformation_v7c0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MBMSModifiedServicesInformation_v7c0ext_IEs();
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
			return new MBMSModifiedServicesInformation_v7c0ext_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "mbmsModifiedServicesInformation_v7c0ext"
	    public MBMSModifiedServicesInformation_v7c0ext_IEs getMbmsModifiedServicesInformation_v7c0ext()
	    {
		return (MBMSModifiedServicesInformation_v7c0ext_IEs)mComponents[0];
	    }
	    
	    public void setMbmsModifiedServicesInformation_v7c0ext(MBMSModifiedServicesInformation_v7c0ext_IEs mbmsModifiedServicesInformation_v7c0ext)
	    {
		mComponents[0] = mbmsModifiedServicesInformation_v7c0ext;
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
			"MBMSModifiedServicesInformation$V770NCEs$V7c0NCEs$NonCriticalExtensions"
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
		    "MBMSModifiedServicesInformation$V770NCEs$V7c0NCEs"
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
					"MBMSModifiedServicesInformation_v7c0ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"MBMSModifiedServicesInformation-v7c0ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MBMSModifiedServicesInformation_v7c0ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MBMSModifiedServicesInformation_v7c0ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "mbmsModifiedServicesInformation-v7c0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSModifiedServicesInformation$V770NCEs$V7c0NCEs$NonCriticalExtensions"
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
	     * Get the type descriptor (TypeInfo) of 'this' V7c0NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V7c0NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V7c0NCEs

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8007
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"MBMSModifiedServicesInformation$V770NCEs"
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
				    "MBMSModifiedServicesInformation_v770ext_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "MBMSModifiedServicesInformation-v770ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSModifiedServicesInformation_v770ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSModifiedServicesInformation_v770ext_IEs"
				    )
				),
				0
			    )
			),
			"mbmsModifiedServicesInformation-v770ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"MBMSModifiedServicesInformation$V770NCEs$V7c0NCEs"
			    )
			),
			"v7c0NCEs",
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
		0x0010
	    }
	),
	new QName (
	    "rrc.pdu_definitions",
	    "MBMSModifiedServicesInformation"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSModifiedServicesInformation"
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
				"MBMS_ModifedServiceList_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-ModifedServiceList-r6"
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
				    "MBMS_ModifedService_r6"
				)
			    )
			)
		    ),
		    "modifedServiceList",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MBMSModifiedServicesInformation$Mbms_ReacquireMCCH"
			)
		    ),
		    "mbms-ReacquireMCCH",
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
				"DynamicPersistenceLevel"
			    ),
			    new QName (
				"InformationElements",
				"DynamicPersistenceLevel"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.DynamicPersistenceLevel(1), 
				    new rrc.informationelements.DynamicPersistenceLevel(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "mbms-DynamicPersistenceLevel",
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
				    new com.oss.asn1.INTEGER(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "endOfModifiedMCCHInformation",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_NumberOfNeighbourCells_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-NumberOfNeighbourCells-r6"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MBMS_NumberOfNeighbourCells_r6(0), 
				    new rrc.informationelements.MBMS_NumberOfNeighbourCells_r6(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "mbmsNumberOfNeighbourCells",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MBMSModifiedServicesInformation$Mbms_AllUnmodifiedPTMServices"
			)
		    ),
		    "mbms-AllUnmodifiedPTMServices",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_PTMActivationTime_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PTMActivationTime-r6"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MBMS_PTMActivationTime_r6(0), 
				    new rrc.informationelements.MBMS_PTMActivationTime_r6(2047),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(2047)
			    ),
			    null
			)
		    ),
		    "mbms-PTMActivationTime",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MBMSModifiedServicesInformation$V770NCEs"
			)
		    ),
		    "v770NCEs",
		    7,
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
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMSModifiedServicesInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSModifiedServicesInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSModifiedServicesInformation
