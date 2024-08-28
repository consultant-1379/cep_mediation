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
 * Define the ASN1 Type InterRATHandoverInfo from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfo(PredefinedConfigStatusList predefinedConfigStatusList, 
		    UE_SecurityInformation uE_SecurityInformation, 
		    Ue_CapabilityContainer ue_CapabilityContainer, 
		    V390NCEs v390NCEs)
    {
	setPredefinedConfigStatusList(predefinedConfigStatusList);
	setUE_SecurityInformation(uE_SecurityInformation);
	setUe_CapabilityContainer(ue_CapabilityContainer);
	setV390NCEs(v390NCEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PredefinedConfigStatusList();
	mComponents[1] = new UE_SecurityInformation();
	mComponents[2] = new Ue_CapabilityContainer();
	mComponents[3] = new V390NCEs();
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
		return new PredefinedConfigStatusList();
	    case 1:
		return new UE_SecurityInformation();
	    case 2:
		return new Ue_CapabilityContainer();
	    case 3:
		return new V390NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "predefinedConfigStatusList"
    public PredefinedConfigStatusList getPredefinedConfigStatusList()
    {
	return (PredefinedConfigStatusList)mComponents[0];
    }
    
    public void setPredefinedConfigStatusList(PredefinedConfigStatusList predefinedConfigStatusList)
    {
	mComponents[0] = predefinedConfigStatusList;
    }
    
    
    
    /**
     * Define the ASN1 Type PredefinedConfigStatusList from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class PredefinedConfigStatusList extends Choice {
	
	/**
	 * The default constructor.
	 */
	public PredefinedConfigStatusList()
	{
	}
	
	public static final  int  absent_chosen = 1;
	public static final  int  present_chosen = 2;
	
	// Methods for field "absent"
	public static PredefinedConfigStatusList createPredefinedConfigStatusListWithAbsent(Null absent)
	{
	    PredefinedConfigStatusList __object = new PredefinedConfigStatusList();

	    __object.setAbsent(absent);
	    return __object;
	}
	
	public boolean hasAbsent()
	{
	    return getChosenFlag() == absent_chosen;
	}
	
	public void setAbsent(Null absent)
	{
	    setChosenValue(absent);
	    setChosenFlag(absent_chosen);
	}
	
	
	// Methods for field "present"
	public static PredefinedConfigStatusList createPredefinedConfigStatusListWithPresent(rrc.informationelements.PredefinedConfigStatusList present)
	{
	    PredefinedConfigStatusList __object = new PredefinedConfigStatusList();

	    __object.setPresent(present);
	    return __object;
	}
	
	public boolean hasPresent()
	{
	    return getChosenFlag() == present_chosen;
	}
	
	public void setPresent(rrc.informationelements.PredefinedConfigStatusList present)
	{
	    setChosenValue(present);
	    setChosenFlag(present_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case absent_chosen:
		    return new Null();
		case present_chosen:
		    return new rrc.informationelements.PredefinedConfigStatusList();
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"InterRATHandoverInfo$PredefinedConfigStatusList"
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
			"absent",
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
				    "PredefinedConfigStatusList"
				),
				new QName (
				    "InformationElements",
				    "PredefinedConfigStatusList"
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
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"PredefinedConfigStatusInfo"
				    )
				)
			    )
			),
			"present",
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
	 * Get the type descriptor (TypeInfo) of 'this' PredefinedConfigStatusList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' PredefinedConfigStatusList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for PredefinedConfigStatusList

    // Methods for field "uE_SecurityInformation"
    public UE_SecurityInformation getUE_SecurityInformation()
    {
	return (UE_SecurityInformation)mComponents[1];
    }
    
    public void setUE_SecurityInformation(UE_SecurityInformation uE_SecurityInformation)
    {
	mComponents[1] = uE_SecurityInformation;
    }
    
    
    
    /**
     * Define the ASN1 Type UE_SecurityInformation from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class UE_SecurityInformation extends Choice {
	
	/**
	 * The default constructor.
	 */
	public UE_SecurityInformation()
	{
	}
	
	public static final  int  absent_chosen = 1;
	public static final  int  present_chosen = 2;
	
	// Methods for field "absent"
	public static UE_SecurityInformation createUE_SecurityInformationWithAbsent(Null absent)
	{
	    UE_SecurityInformation __object = new UE_SecurityInformation();

	    __object.setAbsent(absent);
	    return __object;
	}
	
	public boolean hasAbsent()
	{
	    return getChosenFlag() == absent_chosen;
	}
	
	public void setAbsent(Null absent)
	{
	    setChosenValue(absent);
	    setChosenFlag(absent_chosen);
	}
	
	
	// Methods for field "present"
	public static UE_SecurityInformation createUE_SecurityInformationWithPresent(rrc.informationelements.UE_SecurityInformation present)
	{
	    UE_SecurityInformation __object = new UE_SecurityInformation();

	    __object.setPresent(present);
	    return __object;
	}
	
	public boolean hasPresent()
	{
	    return getChosenFlag() == present_chosen;
	}
	
	public void setPresent(rrc.informationelements.UE_SecurityInformation present)
	{
	    setChosenValue(present);
	    setChosenFlag(present_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case absent_chosen:
		    return new Null();
		case present_chosen:
		    return new rrc.informationelements.UE_SecurityInformation();
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
		"InterRATHandoverInfo$UE_SecurityInformation"
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
			"absent",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UE_SecurityInformation"
				),
				new QName (
				    "InformationElements",
				    "UE-SecurityInformation"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UE_SecurityInformation"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UE_SecurityInformation"
				    )
				),
				0
			    )
			),
			"present",
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
	 * Get the type descriptor (TypeInfo) of 'this' UE_SecurityInformation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' UE_SecurityInformation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for UE_SecurityInformation

    // Methods for field "ue_CapabilityContainer"
    public Ue_CapabilityContainer getUe_CapabilityContainer()
    {
	return (Ue_CapabilityContainer)mComponents[2];
    }
    
    public void setUe_CapabilityContainer(Ue_CapabilityContainer ue_CapabilityContainer)
    {
	mComponents[2] = ue_CapabilityContainer;
    }
    
    
    
    /**
     * Define the ASN1 Type Ue_CapabilityContainer from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class Ue_CapabilityContainer extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Ue_CapabilityContainer()
	{
	}
	
	public static final  int  absent_chosen = 1;
	public static final  int  present_chosen = 2;
	
	// Methods for field "absent"
	public static Ue_CapabilityContainer createUe_CapabilityContainerWithAbsent(Null absent)
	{
	    Ue_CapabilityContainer __object = new Ue_CapabilityContainer();

	    __object.setAbsent(absent);
	    return __object;
	}
	
	public boolean hasAbsent()
	{
	    return getChosenFlag() == absent_chosen;
	}
	
	public void setAbsent(Null absent)
	{
	    setChosenValue(absent);
	    setChosenFlag(absent_chosen);
	}
	
	
	// Methods for field "present"
	public static Ue_CapabilityContainer createUe_CapabilityContainerWithPresent(OctetString present)
	{
	    Ue_CapabilityContainer __object = new Ue_CapabilityContainer();

	    __object.setPresent(present);
	    return __object;
	}
	
	public boolean hasPresent()
	{
	    return getChosenFlag() == present_chosen;
	}
	
	public void setPresent(OctetString present)
	{
	    setChosenValue(present);
	    setChosenFlag(present_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case absent_chosen:
		    return new Null();
		case present_chosen:
		    return new OctetString();
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
		"InterRATHandoverInfo$Ue_CapabilityContainer"
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
			"absent",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new VectorInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "OctetString"
				),
				new QName (
				    "builtin",
				    "OCTET STRING"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(0), 
					    new com.oss.asn1.INTEGER(63),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(63)
				)
			    )
			),
			"present",
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
	 * Get the type descriptor (TypeInfo) of 'this' Ue_CapabilityContainer object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Ue_CapabilityContainer object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Ue_CapabilityContainer

    // Methods for field "v390NCEs"
    public V390NCEs getV390NCEs()
    {
	return (V390NCEs)mComponents[3];
    }
    
    public void setV390NCEs(V390NCEs v390NCEs)
    {
	mComponents[3] = v390NCEs;
    }
    
    
    
    /**
     * Define the ASN1 Type V390NCEs from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class V390NCEs extends Choice {
	
	/**
	 * The default constructor.
	 */
	public V390NCEs()
	{
	}
	
	public static final  int  absent_chosen = 1;
	public static final  int  present_chosen = 2;
	
	// Methods for field "absent"
	public static V390NCEs createV390NCEsWithAbsent(Null absent)
	{
	    V390NCEs __object = new V390NCEs();

	    __object.setAbsent(absent);
	    return __object;
	}
	
	public boolean hasAbsent()
	{
	    return getChosenFlag() == absent_chosen;
	}
	
	public void setAbsent(Null absent)
	{
	    setChosenValue(absent);
	    setChosenFlag(absent_chosen);
	}
	
	
	// Methods for field "present"
	public static V390NCEs createV390NCEsWithPresent(Present present)
	{
	    V390NCEs __object = new V390NCEs();

	    __object.setPresent(present);
	    return __object;
	}
	
	public boolean hasPresent()
	{
	    return getChosenFlag() == present_chosen;
	}
	
	public void setPresent(Present present)
	{
	    setChosenValue(present);
	    setChosenFlag(present_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Present from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Present extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Present()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Present(InterRATHandoverInfo_v390ext_IEs interRATHandoverInfo_v390ext, 
			    V3a0NCEs v3a0NCEs)
	    {
		setInterRATHandoverInfo_v390ext(interRATHandoverInfo_v390ext);
		setV3a0NCEs(v3a0NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Present(InterRATHandoverInfo_v390ext_IEs interRATHandoverInfo_v390ext)
	    {
		setInterRATHandoverInfo_v390ext(interRATHandoverInfo_v390ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new InterRATHandoverInfo_v390ext_IEs();
		mComponents[1] = new V3a0NCEs();
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
			return new InterRATHandoverInfo_v390ext_IEs();
		    case 1:
			return new V3a0NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "interRATHandoverInfo_v390ext"
	    public InterRATHandoverInfo_v390ext_IEs getInterRATHandoverInfo_v390ext()
	    {
		return (InterRATHandoverInfo_v390ext_IEs)mComponents[0];
	    }
	    
	    public void setInterRATHandoverInfo_v390ext(InterRATHandoverInfo_v390ext_IEs interRATHandoverInfo_v390ext)
	    {
		mComponents[0] = interRATHandoverInfo_v390ext;
	    }
	    
	    
	    // Methods for field "v3a0NCEs"
	    public V3a0NCEs getV3a0NCEs()
	    {
		return (V3a0NCEs)mComponents[1];
	    }
	    
	    public void setV3a0NCEs(V3a0NCEs v3a0NCEs)
	    {
		mComponents[1] = v3a0NCEs;
	    }
	    
	    public boolean hasV3a0NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV3a0NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V3a0NCEs from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class V3a0NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V3a0NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V3a0NCEs(InterRATHandoverInfo_v3a0ext_IEs interRATHandoverInfo_v3a0ext, 
				LaterNCEs laterNCEs)
		{
		    setInterRATHandoverInfo_v3a0ext(interRATHandoverInfo_v3a0ext);
		    setLaterNCEs(laterNCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V3a0NCEs(InterRATHandoverInfo_v3a0ext_IEs interRATHandoverInfo_v3a0ext)
		{
		    setInterRATHandoverInfo_v3a0ext(interRATHandoverInfo_v3a0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new InterRATHandoverInfo_v3a0ext_IEs();
		    mComponents[1] = new LaterNCEs();
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
			    return new InterRATHandoverInfo_v3a0ext_IEs();
			case 1:
			    return new LaterNCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "interRATHandoverInfo_v3a0ext"
		public InterRATHandoverInfo_v3a0ext_IEs getInterRATHandoverInfo_v3a0ext()
		{
		    return (InterRATHandoverInfo_v3a0ext_IEs)mComponents[0];
		}
		
		public void setInterRATHandoverInfo_v3a0ext(InterRATHandoverInfo_v3a0ext_IEs interRATHandoverInfo_v3a0ext)
		{
		    mComponents[0] = interRATHandoverInfo_v3a0ext;
		}
		
		
		// Methods for field "laterNCEs"
		public LaterNCEs getLaterNCEs()
		{
		    return (LaterNCEs)mComponents[1];
		}
		
		public void setLaterNCEs(LaterNCEs laterNCEs)
		{
		    mComponents[1] = laterNCEs;
		}
		
		public boolean hasLaterNCEs()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteLaterNCEs()
		{
		    setComponentAbsent(1);
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
		    public LaterNCEs(InterRATHandoverInfo_v3d0ext_IEs interRATHandoverInfo_v3d0ext, 
				    InterRATHandoverInfo_r3_add_ext interRATHandoverInfo_r3_add_ext, 
				    V3g0NCEs v3g0NCEs)
		    {
			setInterRATHandoverInfo_v3d0ext(interRATHandoverInfo_v3d0ext);
			setInterRATHandoverInfo_r3_add_ext(interRATHandoverInfo_r3_add_ext);
			setV3g0NCEs(v3g0NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public LaterNCEs(InterRATHandoverInfo_v3d0ext_IEs interRATHandoverInfo_v3d0ext)
		    {
			setInterRATHandoverInfo_v3d0ext(interRATHandoverInfo_v3d0ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new InterRATHandoverInfo_v3d0ext_IEs();
			mComponents[1] = new InterRATHandoverInfo_r3_add_ext();
			mComponents[2] = new V3g0NCEs();
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
				return new InterRATHandoverInfo_v3d0ext_IEs();
			    case 1:
				return new InterRATHandoverInfo_r3_add_ext();
			    case 2:
				return new V3g0NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "interRATHandoverInfo_v3d0ext"
		    public InterRATHandoverInfo_v3d0ext_IEs getInterRATHandoverInfo_v3d0ext()
		    {
			return (InterRATHandoverInfo_v3d0ext_IEs)mComponents[0];
		    }
		    
		    public void setInterRATHandoverInfo_v3d0ext(InterRATHandoverInfo_v3d0ext_IEs interRATHandoverInfo_v3d0ext)
		    {
			mComponents[0] = interRATHandoverInfo_v3d0ext;
		    }
		    
		    
		    // Methods for field "interRATHandoverInfo_r3_add_ext"
		    public InterRATHandoverInfo_r3_add_ext getInterRATHandoverInfo_r3_add_ext()
		    {
			return (InterRATHandoverInfo_r3_add_ext)mComponents[1];
		    }
		    
		    public void setInterRATHandoverInfo_r3_add_ext(InterRATHandoverInfo_r3_add_ext interRATHandoverInfo_r3_add_ext)
		    {
			mComponents[1] = interRATHandoverInfo_r3_add_ext;
		    }
		    
		    public boolean hasInterRATHandoverInfo_r3_add_ext()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteInterRATHandoverInfo_r3_add_ext()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type InterRATHandoverInfo_r3_add_ext from ASN1 Module PDU_definitions.
		     * @see ContainingBitString
		     */
		    public static class InterRATHandoverInfo_r3_add_ext extends ContainingBitString {
			
			/**
			 * The default constructor.
			 */
			public InterRATHandoverInfo_r3_add_ext()
			{
			}
			
			/**
			 * Construct Bit String from a byte array.
			 * All bits considered significant.
			 * @param value the byte array to set this object to.
			 */
			public InterRATHandoverInfo_r3_add_ext(byte[] value)
			{
			    super(value);
			}
			
			
			/**
			 * Construct Bit String from a byte array and significant bits.
			 * @param value the byte array to set this object to.
			 * @param sigBits the number of significant bits.
			 */
			public InterRATHandoverInfo_r3_add_ext(byte[] value, int sigBits)
			{
			    super(value, sigBits);
			}
			
			/**
			 * Construct from a contained type value.
			 */
			public InterRATHandoverInfo_r3_add_ext(InterRATHandoverInfo_r3_add_ext_IEs decoded)
			{
			    super(decoded);
			}
			
			// Methods for getting and setting a contained value
			public InterRATHandoverInfo_r3_add_ext_IEs getContainedValue()
			{
			    return (InterRATHandoverInfo_r3_add_ext_IEs)getDecodedValue();
			}
			
			public void setContainedValue(InterRATHandoverInfo_r3_add_ext_IEs value)
			{
			    setDecodedValue(value);
			}
			
			/**
			 * Initialize the type descriptor.
			 */
			private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$InterRATHandoverInfo_r3_add_ext"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    null,
			    null,
			    null,
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InterRATHandoverInfo_r3_add_ext_IEs"
				)
			    ),
			    null
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_r3_add_ext object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_r3_add_ext object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for InterRATHandoverInfo_r3_add_ext

		    // Methods for field "v3g0NCEs"
		    public V3g0NCEs getV3g0NCEs()
		    {
			return (V3g0NCEs)mComponents[2];
		    }
		    
		    public void setV3g0NCEs(V3g0NCEs v3g0NCEs)
		    {
			mComponents[2] = v3g0NCEs;
		    }
		    
		    public boolean hasV3g0NCEs()
		    {
			return componentIsPresent(2);
		    }
		    
		    public void deleteV3g0NCEs()
		    {
			setComponentAbsent(2);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V3g0NCEs from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class V3g0NCEs extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V3g0NCEs()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V3g0NCEs(InterRATHandoverInfo_v3g0ext_IEs interRATHandoverInfo_v3g0ext, 
					V4b0NCEs v4b0NCEs)
			{
			    setInterRATHandoverInfo_v3g0ext(interRATHandoverInfo_v3g0ext);
			    setV4b0NCEs(v4b0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V3g0NCEs(InterRATHandoverInfo_v3g0ext_IEs interRATHandoverInfo_v3g0ext)
			{
			    setInterRATHandoverInfo_v3g0ext(interRATHandoverInfo_v3g0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new InterRATHandoverInfo_v3g0ext_IEs();
			    mComponents[1] = new V4b0NCEs();
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
				    return new InterRATHandoverInfo_v3g0ext_IEs();
				case 1:
				    return new V4b0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "interRATHandoverInfo_v3g0ext"
			public InterRATHandoverInfo_v3g0ext_IEs getInterRATHandoverInfo_v3g0ext()
			{
			    return (InterRATHandoverInfo_v3g0ext_IEs)mComponents[0];
			}
			
			public void setInterRATHandoverInfo_v3g0ext(InterRATHandoverInfo_v3g0ext_IEs interRATHandoverInfo_v3g0ext)
			{
			    mComponents[0] = interRATHandoverInfo_v3g0ext;
			}
			
			
			// Methods for field "v4b0NCEs"
			public V4b0NCEs getV4b0NCEs()
			{
			    return (V4b0NCEs)mComponents[1];
			}
			
			public void setV4b0NCEs(V4b0NCEs v4b0NCEs)
			{
			    mComponents[1] = v4b0NCEs;
			}
			
			public boolean hasV4b0NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV4b0NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V4b0NCEs from ASN1 Module PDU_definitions.
			 * @see Sequence
			 */
			public static class V4b0NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V4b0NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V4b0NCEs(InterRATHandoverInfo_v4b0ext_IEs interRATHandoverInfo_v4b0ext, 
					    V4d0NCEs v4d0NCEs)
			    {
				setInterRATHandoverInfo_v4b0ext(interRATHandoverInfo_v4b0ext);
				setV4d0NCEs(v4d0NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V4b0NCEs(InterRATHandoverInfo_v4b0ext_IEs interRATHandoverInfo_v4b0ext)
			    {
				setInterRATHandoverInfo_v4b0ext(interRATHandoverInfo_v4b0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new InterRATHandoverInfo_v4b0ext_IEs();
				mComponents[1] = new V4d0NCEs();
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
					return new InterRATHandoverInfo_v4b0ext_IEs();
				    case 1:
					return new V4d0NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "interRATHandoverInfo_v4b0ext"
			    public InterRATHandoverInfo_v4b0ext_IEs getInterRATHandoverInfo_v4b0ext()
			    {
				return (InterRATHandoverInfo_v4b0ext_IEs)mComponents[0];
			    }
			    
			    public void setInterRATHandoverInfo_v4b0ext(InterRATHandoverInfo_v4b0ext_IEs interRATHandoverInfo_v4b0ext)
			    {
				mComponents[0] = interRATHandoverInfo_v4b0ext;
			    }
			    
			    
			    // Methods for field "v4d0NCEs"
			    public V4d0NCEs getV4d0NCEs()
			    {
				return (V4d0NCEs)mComponents[1];
			    }
			    
			    public void setV4d0NCEs(V4d0NCEs v4d0NCEs)
			    {
				mComponents[1] = v4d0NCEs;
			    }
			    
			    public boolean hasV4d0NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV4d0NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V4d0NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V4d0NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V4d0NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V4d0NCEs(InterRATHandoverInfo_v4d0ext_IEs interRATHandoverInfo_v4d0ext, 
						V590NCEs v590NCEs)
				{
				    setInterRATHandoverInfo_v4d0ext(interRATHandoverInfo_v4d0ext);
				    setV590NCEs(v590NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V4d0NCEs(InterRATHandoverInfo_v4d0ext_IEs interRATHandoverInfo_v4d0ext)
				{
				    setInterRATHandoverInfo_v4d0ext(interRATHandoverInfo_v4d0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new InterRATHandoverInfo_v4d0ext_IEs();
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
					    return new InterRATHandoverInfo_v4d0ext_IEs();
					case 1:
					    return new V590NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "interRATHandoverInfo_v4d0ext"
				public InterRATHandoverInfo_v4d0ext_IEs getInterRATHandoverInfo_v4d0ext()
				{
				    return (InterRATHandoverInfo_v4d0ext_IEs)mComponents[0];
				}
				
				public void setInterRATHandoverInfo_v4d0ext(InterRATHandoverInfo_v4d0ext_IEs interRATHandoverInfo_v4d0ext)
				{
				    mComponents[0] = interRATHandoverInfo_v4d0ext;
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
				    public V590NCEs(InterRATHandoverInfo_v590ext_IEs interRATHandoverInfo_v590ext, 
						    V690NCEs v690NCEs)
				    {
					setInterRATHandoverInfo_v590ext(interRATHandoverInfo_v590ext);
					setV690NCEs(v690NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V590NCEs(InterRATHandoverInfo_v590ext_IEs interRATHandoverInfo_v590ext)
				    {
					setInterRATHandoverInfo_v590ext(interRATHandoverInfo_v590ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new InterRATHandoverInfo_v590ext_IEs();
					mComponents[1] = new V690NCEs();
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
						return new InterRATHandoverInfo_v590ext_IEs();
					    case 1:
						return new V690NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "interRATHandoverInfo_v590ext"
				    public InterRATHandoverInfo_v590ext_IEs getInterRATHandoverInfo_v590ext()
				    {
					return (InterRATHandoverInfo_v590ext_IEs)mComponents[0];
				    }
				    
				    public void setInterRATHandoverInfo_v590ext(InterRATHandoverInfo_v590ext_IEs interRATHandoverInfo_v590ext)
				    {
					mComponents[0] = interRATHandoverInfo_v590ext;
				    }
				    
				    
				    // Methods for field "v690NCEs"
				    public V690NCEs getV690NCEs()
				    {
					return (V690NCEs)mComponents[1];
				    }
				    
				    public void setV690NCEs(V690NCEs v690NCEs)
				    {
					mComponents[1] = v690NCEs;
				    }
				    
				    public boolean hasV690NCEs()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV690NCEs()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V690NCEs from ASN1 Module PDU_definitions.
				     * @see Sequence
				     */
				    public static class V690NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V690NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V690NCEs(InterRATHandoverInfo_v690ext_IEs interRATHandoverInfo_v690ext, 
							InterRATHandoverInfo_NCE_v6b0_IEs v6b0NCEs)
					{
					    setInterRATHandoverInfo_v690ext(interRATHandoverInfo_v690ext);
					    setV6b0NCEs(v6b0NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V690NCEs(InterRATHandoverInfo_v690ext_IEs interRATHandoverInfo_v690ext)
					{
					    setInterRATHandoverInfo_v690ext(interRATHandoverInfo_v690ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new InterRATHandoverInfo_v690ext_IEs();
					    mComponents[1] = new InterRATHandoverInfo_NCE_v6b0_IEs();
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
						    return new InterRATHandoverInfo_v690ext_IEs();
						case 1:
						    return new InterRATHandoverInfo_NCE_v6b0_IEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "interRATHandoverInfo_v690ext"
					public InterRATHandoverInfo_v690ext_IEs getInterRATHandoverInfo_v690ext()
					{
					    return (InterRATHandoverInfo_v690ext_IEs)mComponents[0];
					}
					
					public void setInterRATHandoverInfo_v690ext(InterRATHandoverInfo_v690ext_IEs interRATHandoverInfo_v690ext)
					{
					    mComponents[0] = interRATHandoverInfo_v690ext;
					}
					
					
					// Methods for field "v6b0NCEs"
					public InterRATHandoverInfo_NCE_v6b0_IEs getV6b0NCEs()
					{
					    return (InterRATHandoverInfo_NCE_v6b0_IEs)mComponents[1];
					}
					
					public void setV6b0NCEs(InterRATHandoverInfo_NCE_v6b0_IEs v6b0NCEs)
					{
					    mComponents[1] = v6b0NCEs;
					}
					
					public boolean hasV6b0NCEs()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteV6b0NCEs()
					{
					    setComponentAbsent(1);
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
						"InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V4d0NCEs$V590NCEs$V690NCEs"
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
								    "InterRATHandoverInfo_v690ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "InterRATHandoverInfo-v690ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"InterRATHandoverInfo_v690ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"InterRATHandoverInfo_v690ext_IEs"
								    )
								),
								0
							    )
							),
							"interRATHandoverInfo-v690ext",
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
								    "rrc.pdu_definitions",
								    "InterRATHandoverInfo_NCE_v6b0_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "InterRATHandoverInfo-NCE-v6b0-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"InterRATHandoverInfo_NCE_v6b0_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"InterRATHandoverInfo_NCE_v6b0_IEs"
								    )
								),
								0
							    )
							),
							"v6b0NCEs",
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
					 * Get the type descriptor (TypeInfo) of 'this' V690NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V690NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V690NCEs

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
					    "InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V4d0NCEs$V590NCEs"
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
								"InterRATHandoverInfo_v590ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"InterRATHandoverInfo-v590ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "InterRATHandoverInfo_v590ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "InterRATHandoverInfo_v590ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "interRATHandoverInfo-v590ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V4d0NCEs$V590NCEs$V690NCEs"
							)
						    ),
						    "v690NCEs",
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
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V4d0NCEs"
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
							    "InterRATHandoverInfo_v4d0ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "InterRATHandoverInfo-v4d0ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"InterRATHandoverInfo_v4d0ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"InterRATHandoverInfo_v4d0ext_IEs"
							    )
							),
							0
						    )
						),
						"interRATHandoverInfo-v4d0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V4d0NCEs$V590NCEs"
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
				 * Get the type descriptor (TypeInfo) of 'this' V4d0NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V4d0NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V4d0NCEs

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
				    "InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs"
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
							"InterRATHandoverInfo_v4b0ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"InterRATHandoverInfo-v4b0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "InterRATHandoverInfo_v4b0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "InterRATHandoverInfo_v4b0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "interRATHandoverInfo-v4b0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V4d0NCEs"
						)
					    ),
					    "v4d0NCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' V4b0NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V4b0NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V4b0NCEs

			/**
			 * Initialize the type descriptor.
			 */
			private static final SequenceInfo c_typeinfo = new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$V3g0NCEs"
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
						    "InterRATHandoverInfo_v3g0ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "InterRATHandoverInfo-v3g0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"InterRATHandoverInfo_v3g0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"InterRATHandoverInfo_v3g0ext_IEs"
						    )
						),
						0
					    )
					),
					"interRATHandoverInfo-v3g0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs"
					    )
					),
					"v4b0NCEs",
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
			 * Get the type descriptor (TypeInfo) of 'this' V3g0NCEs object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V3g0NCEs object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V3g0NCEs

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
			    "InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs"
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
						"InterRATHandoverInfo_v3d0ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"InterRATHandoverInfo-v3d0ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "InterRATHandoverInfo_v3d0ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "InterRATHandoverInfo_v3d0ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "interRATHandoverInfo-v3d0ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$InterRATHandoverInfo_r3_add_ext"
					)
				    ),
				    "interRATHandoverInfo-r3-add-ext",
				    1,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs$V3g0NCEs"
					)
				    ),
				    "v3g0NCEs",
				    2,
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
					new TagDecoderElement((short)0x8002, 2)
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs"
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
					    "InterRATHandoverInfo_v3a0ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "InterRATHandoverInfo-v3a0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"InterRATHandoverInfo_v3a0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"InterRATHandoverInfo_v3a0ext_IEs"
					    )
					),
					0
				    )
				),
				"interRATHandoverInfo-v3a0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs$LaterNCEs"
				    )
				),
				"laterNCEs",
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
		 * Get the type descriptor (TypeInfo) of 'this' V3a0NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V3a0NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V3a0NCEs

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
		    "InterRATHandoverInfo$V390NCEs$Present"
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
					"InterRATHandoverInfo_v390ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"InterRATHandoverInfo-v390ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "InterRATHandoverInfo_v390ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "InterRATHandoverInfo_v390ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "interRATHandoverInfo-v390ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InterRATHandoverInfo$V390NCEs$Present$V3a0NCEs"
				)
			    ),
			    "v3a0NCEs",
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
	     * Get the type descriptor (TypeInfo) of 'this' Present object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Present object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Present

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case absent_chosen:
		    return new Null();
		case present_chosen:
		    return new Present();
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
		"InterRATHandoverInfo$V390NCEs"
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
			"absent",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"InterRATHandoverInfo$V390NCEs$Present"
			    )
			),
			"present",
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
	 * Get the type descriptor (TypeInfo) of 'this' V390NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V390NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V390NCEs

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
	    "InterRATHandoverInfo"
	),
	new QName (
	    "PDU-definitions",
	    "InterRATHandoverInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "InterRATHandoverInfo$PredefinedConfigStatusList"
			)
		    ),
		    "predefinedConfigStatusList",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "InterRATHandoverInfo$UE_SecurityInformation"
			)
		    ),
		    "uE-SecurityInformation",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "InterRATHandoverInfo$Ue_CapabilityContainer"
			)
		    ),
		    "ue-CapabilityContainer",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "InterRATHandoverInfo$V390NCEs"
			)
		    ),
		    "v390NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for InterRATHandoverInfo
