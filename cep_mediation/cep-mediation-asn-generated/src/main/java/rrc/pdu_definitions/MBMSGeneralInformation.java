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
 * Define the ASN1 Type MBMSGeneralInformation from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSGeneralInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSGeneralInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSGeneralInformation(rrc.informationelements.MBMS_PreferredFrequencyList_r6 mbms_PreferredFrequencyInfo, 
		    rrc.informationelements.MBMS_TimersAndCounters_r6 mbms_TimersAndCounters, 
		    rrc.informationelements.MBMS_MICHConfigurationInfo_r6 michConfigurationInfo, 
		    rrc.informationelements.MBMS_CellGroupIdentity_r6 cellGroupIdentity, 
		    rrc.informationelements.MBMS_MSCH_ConfigurationInfo_r6 mschDefaultConfigurationInfo, 
		    V6b0NCEs v6b0NCEs)
    {
	setMbms_PreferredFrequencyInfo(mbms_PreferredFrequencyInfo);
	setMbms_TimersAndCounters(mbms_TimersAndCounters);
	setMichConfigurationInfo(michConfigurationInfo);
	setCellGroupIdentity(cellGroupIdentity);
	setMschDefaultConfigurationInfo(mschDefaultConfigurationInfo);
	setV6b0NCEs(v6b0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public MBMSGeneralInformation(rrc.informationelements.MBMS_TimersAndCounters_r6 mbms_TimersAndCounters, 
		    rrc.informationelements.MBMS_MICHConfigurationInfo_r6 michConfigurationInfo, 
		    rrc.informationelements.MBMS_CellGroupIdentity_r6 cellGroupIdentity)
    {
	setMbms_TimersAndCounters(mbms_TimersAndCounters);
	setMichConfigurationInfo(michConfigurationInfo);
	setCellGroupIdentity(cellGroupIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MBMS_PreferredFrequencyList_r6();
	mComponents[1] = new rrc.informationelements.MBMS_TimersAndCounters_r6();
	mComponents[2] = new rrc.informationelements.MBMS_MICHConfigurationInfo_r6();
	mComponents[3] = new rrc.informationelements.MBMS_CellGroupIdentity_r6();
	mComponents[4] = new rrc.informationelements.MBMS_MSCH_ConfigurationInfo_r6();
	mComponents[5] = new V6b0NCEs();
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
		return new rrc.informationelements.MBMS_PreferredFrequencyList_r6();
	    case 1:
		return new rrc.informationelements.MBMS_TimersAndCounters_r6();
	    case 2:
		return new rrc.informationelements.MBMS_MICHConfigurationInfo_r6();
	    case 3:
		return new rrc.informationelements.MBMS_CellGroupIdentity_r6();
	    case 4:
		return new rrc.informationelements.MBMS_MSCH_ConfigurationInfo_r6();
	    case 5:
		return new V6b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_PreferredFrequencyInfo"
    public rrc.informationelements.MBMS_PreferredFrequencyList_r6 getMbms_PreferredFrequencyInfo()
    {
	return (rrc.informationelements.MBMS_PreferredFrequencyList_r6)mComponents[0];
    }
    
    public void setMbms_PreferredFrequencyInfo(rrc.informationelements.MBMS_PreferredFrequencyList_r6 mbms_PreferredFrequencyInfo)
    {
	mComponents[0] = mbms_PreferredFrequencyInfo;
    }
    
    public boolean hasMbms_PreferredFrequencyInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMbms_PreferredFrequencyInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "mbms_TimersAndCounters"
    public rrc.informationelements.MBMS_TimersAndCounters_r6 getMbms_TimersAndCounters()
    {
	return (rrc.informationelements.MBMS_TimersAndCounters_r6)mComponents[1];
    }
    
    public void setMbms_TimersAndCounters(rrc.informationelements.MBMS_TimersAndCounters_r6 mbms_TimersAndCounters)
    {
	mComponents[1] = mbms_TimersAndCounters;
    }
    
    
    // Methods for field "michConfigurationInfo"
    public rrc.informationelements.MBMS_MICHConfigurationInfo_r6 getMichConfigurationInfo()
    {
	return (rrc.informationelements.MBMS_MICHConfigurationInfo_r6)mComponents[2];
    }
    
    public void setMichConfigurationInfo(rrc.informationelements.MBMS_MICHConfigurationInfo_r6 michConfigurationInfo)
    {
	mComponents[2] = michConfigurationInfo;
    }
    
    
    // Methods for field "cellGroupIdentity"
    public rrc.informationelements.MBMS_CellGroupIdentity_r6 getCellGroupIdentity()
    {
	return (rrc.informationelements.MBMS_CellGroupIdentity_r6)mComponents[3];
    }
    
    public void setCellGroupIdentity(rrc.informationelements.MBMS_CellGroupIdentity_r6 cellGroupIdentity)
    {
	mComponents[3] = cellGroupIdentity;
    }
    
    
    // Methods for field "mschDefaultConfigurationInfo"
    public rrc.informationelements.MBMS_MSCH_ConfigurationInfo_r6 getMschDefaultConfigurationInfo()
    {
	return (rrc.informationelements.MBMS_MSCH_ConfigurationInfo_r6)mComponents[4];
    }
    
    public void setMschDefaultConfigurationInfo(rrc.informationelements.MBMS_MSCH_ConfigurationInfo_r6 mschDefaultConfigurationInfo)
    {
	mComponents[4] = mschDefaultConfigurationInfo;
    }
    
    public boolean hasMschDefaultConfigurationInfo()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMschDefaultConfigurationInfo()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "v6b0NCEs"
    public V6b0NCEs getV6b0NCEs()
    {
	return (V6b0NCEs)mComponents[5];
    }
    
    public void setV6b0NCEs(V6b0NCEs v6b0NCEs)
    {
	mComponents[5] = v6b0NCEs;
    }
    
    public boolean hasV6b0NCEs()
    {
	return componentIsPresent(5);
    }
    
    public void deleteV6b0NCEs()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type V6b0NCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class V6b0NCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public V6b0NCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public V6b0NCEs(MBMSGeneralInformation_v6b0ext_IEs mbmsGeneralInformation_v6b0ext, 
			V770NCEs v770NCEs)
	{
	    setMbmsGeneralInformation_v6b0ext(mbmsGeneralInformation_v6b0ext);
	    setV770NCEs(v770NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V6b0NCEs(MBMSGeneralInformation_v6b0ext_IEs mbmsGeneralInformation_v6b0ext)
	{
	    setMbmsGeneralInformation_v6b0ext(mbmsGeneralInformation_v6b0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MBMSGeneralInformation_v6b0ext_IEs();
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
		    return new MBMSGeneralInformation_v6b0ext_IEs();
		case 1:
		    return new V770NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "mbmsGeneralInformation_v6b0ext"
	public MBMSGeneralInformation_v6b0ext_IEs getMbmsGeneralInformation_v6b0ext()
	{
	    return (MBMSGeneralInformation_v6b0ext_IEs)mComponents[0];
	}
	
	public void setMbmsGeneralInformation_v6b0ext(MBMSGeneralInformation_v6b0ext_IEs mbmsGeneralInformation_v6b0ext)
	{
	    mComponents[0] = mbmsGeneralInformation_v6b0ext;
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
	    public V770NCEs(MBMSGeneralInformation_v770ext_IEs mbmsGeneralInformation_v770ext, 
			    V860NCEs v860NCEs)
	    {
		setMbmsGeneralInformation_v770ext(mbmsGeneralInformation_v770ext);
		setV860NCEs(v860NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V770NCEs(MBMSGeneralInformation_v770ext_IEs mbmsGeneralInformation_v770ext)
	    {
		setMbmsGeneralInformation_v770ext(mbmsGeneralInformation_v770ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MBMSGeneralInformation_v770ext_IEs();
		mComponents[1] = new V860NCEs();
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
			return new MBMSGeneralInformation_v770ext_IEs();
		    case 1:
			return new V860NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "mbmsGeneralInformation_v770ext"
	    public MBMSGeneralInformation_v770ext_IEs getMbmsGeneralInformation_v770ext()
	    {
		return (MBMSGeneralInformation_v770ext_IEs)mComponents[0];
	    }
	    
	    public void setMbmsGeneralInformation_v770ext(MBMSGeneralInformation_v770ext_IEs mbmsGeneralInformation_v770ext)
	    {
		mComponents[0] = mbmsGeneralInformation_v770ext;
	    }
	    
	    
	    // Methods for field "v860NCEs"
	    public V860NCEs getV860NCEs()
	    {
		return (V860NCEs)mComponents[1];
	    }
	    
	    public void setV860NCEs(V860NCEs v860NCEs)
	    {
		mComponents[1] = v860NCEs;
	    }
	    
	    public boolean hasV860NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV860NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V860NCEs from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class V860NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V860NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V860NCEs(MBMSGeneralInformation_v860ext_IEs mbmsGeneralInformation_v860ext, 
				V890NoncriticalExtensions v890NoncriticalExtensions)
		{
		    setMbmsGeneralInformation_v860ext(mbmsGeneralInformation_v860ext);
		    setV890NoncriticalExtensions(v890NoncriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public V860NCEs(MBMSGeneralInformation_v860ext_IEs mbmsGeneralInformation_v860ext)
		{
		    setMbmsGeneralInformation_v860ext(mbmsGeneralInformation_v860ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new MBMSGeneralInformation_v860ext_IEs();
		    mComponents[1] = new V890NoncriticalExtensions();
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
			    return new MBMSGeneralInformation_v860ext_IEs();
			case 1:
			    return new V890NoncriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "mbmsGeneralInformation_v860ext"
		public MBMSGeneralInformation_v860ext_IEs getMbmsGeneralInformation_v860ext()
		{
		    return (MBMSGeneralInformation_v860ext_IEs)mComponents[0];
		}
		
		public void setMbmsGeneralInformation_v860ext(MBMSGeneralInformation_v860ext_IEs mbmsGeneralInformation_v860ext)
		{
		    mComponents[0] = mbmsGeneralInformation_v860ext;
		}
		
		
		// Methods for field "v890NoncriticalExtensions"
		public V890NoncriticalExtensions getV890NoncriticalExtensions()
		{
		    return (V890NoncriticalExtensions)mComponents[1];
		}
		
		public void setV890NoncriticalExtensions(V890NoncriticalExtensions v890NoncriticalExtensions)
		{
		    mComponents[1] = v890NoncriticalExtensions;
		}
		
		public boolean hasV890NoncriticalExtensions()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV890NoncriticalExtensions()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V890NoncriticalExtensions from ASN1 Module PDU_definitions.
		 * @see Sequence
		 */
		public static class V890NoncriticalExtensions extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V890NoncriticalExtensions()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V890NoncriticalExtensions(MBMSGeneralInformation_v890ext_IEs mbmsGeneralInformation_v890ext, 
				    NonCriticalExtensions nonCriticalExtensions)
		    {
			setMbmsGeneralInformation_v890ext(mbmsGeneralInformation_v890ext);
			setNonCriticalExtensions(nonCriticalExtensions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V890NoncriticalExtensions(MBMSGeneralInformation_v890ext_IEs mbmsGeneralInformation_v890ext)
		    {
			setMbmsGeneralInformation_v890ext(mbmsGeneralInformation_v890ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new MBMSGeneralInformation_v890ext_IEs();
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
				return new MBMSGeneralInformation_v890ext_IEs();
			    case 1:
				return new NonCriticalExtensions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "mbmsGeneralInformation_v890ext"
		    public MBMSGeneralInformation_v890ext_IEs getMbmsGeneralInformation_v890ext()
		    {
			return (MBMSGeneralInformation_v890ext_IEs)mComponents[0];
		    }
		    
		    public void setMbmsGeneralInformation_v890ext(MBMSGeneralInformation_v890ext_IEs mbmsGeneralInformation_v890ext)
		    {
			mComponents[0] = mbmsGeneralInformation_v890ext;
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
				"MBMSGeneralInformation$V6b0NCEs$V770NCEs$V860NCEs$V890NoncriticalExtensions$NonCriticalExtensions"
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
			    "MBMSGeneralInformation$V6b0NCEs$V770NCEs$V860NCEs$V890NoncriticalExtensions"
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
						"MBMSGeneralInformation_v890ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"MBMSGeneralInformation-v890ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "MBMSGeneralInformation_v890ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "MBMSGeneralInformation_v890ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "mbmsGeneralInformation-v890ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MBMSGeneralInformation$V6b0NCEs$V770NCEs$V860NCEs$V890NoncriticalExtensions$NonCriticalExtensions"
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
		     * Get the type descriptor (TypeInfo) of 'this' V890NoncriticalExtensions object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V890NoncriticalExtensions object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V890NoncriticalExtensions

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
			"MBMSGeneralInformation$V6b0NCEs$V770NCEs$V860NCEs"
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
					    "MBMSGeneralInformation_v860ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "MBMSGeneralInformation-v860ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"MBMSGeneralInformation_v860ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"MBMSGeneralInformation_v860ext_IEs"
					    )
					),
					0
				    )
				),
				"mbmsGeneralInformation-v860ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSGeneralInformation$V6b0NCEs$V770NCEs$V860NCEs$V890NoncriticalExtensions"
				    )
				),
				"v890NoncriticalExtensions",
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
		 * Get the type descriptor (TypeInfo) of 'this' V860NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V860NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V860NCEs

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
		    "MBMSGeneralInformation$V6b0NCEs$V770NCEs"
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
					"MBMSGeneralInformation_v770ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"MBMSGeneralInformation-v770ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MBMSGeneralInformation_v770ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MBMSGeneralInformation_v770ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "mbmsGeneralInformation-v770ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSGeneralInformation$V6b0NCEs$V770NCEs$V860NCEs"
				)
			    ),
			    "v860NCEs",
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
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"MBMSGeneralInformation$V6b0NCEs"
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
				    "MBMSGeneralInformation_v6b0ext_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "MBMSGeneralInformation-v6b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSGeneralInformation_v6b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSGeneralInformation_v6b0ext_IEs"
				    )
				),
				0
			    )
			),
			"mbmsGeneralInformation-v6b0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"MBMSGeneralInformation$V6b0NCEs$V770NCEs"
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
	 * Get the type descriptor (TypeInfo) of 'this' V6b0NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V6b0NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V6b0NCEs

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
	    "MBMSGeneralInformation"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSGeneralInformation"
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
				"MBMS_PreferredFrequencyList_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PreferredFrequencyList-r6"
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
				new QName (
				    "rrc.informationelements",
				    "MBMS_PreferredFrequencyInfo_r6"
				)
			    )
			)
		    ),
		    "mbms-PreferredFrequencyInfo",
		    0,
		    3,
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
				"MBMS_TimersAndCounters_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-TimersAndCounters-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TimersAndCounters_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TimersAndCounters_r6"
				)
			    ),
			    0
			)
		    ),
		    "mbms-TimersAndCounters",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_MICHConfigurationInfo_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-MICHConfigurationInfo-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_MICHConfigurationInfo_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_MICHConfigurationInfo_r6"
				)
			    ),
			    0
			)
		    ),
		    "michConfigurationInfo",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_CellGroupIdentity_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CellGroupIdentity-r6"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(12)
				)
			    ),
			    new Bounds (
				new java.lang.Long(12),
				new java.lang.Long(12)
			    ),
			    null
			)
		    ),
		    "cellGroupIdentity",
		    3,
		    2,
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
				"MBMS_MSCH_ConfigurationInfo_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-MSCH-ConfigurationInfo-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_MSCH_ConfigurationInfo_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_MSCH_ConfigurationInfo_r6"
				)
			    ),
			    0
			)
		    ),
		    "mschDefaultConfigurationInfo",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MBMSGeneralInformation$V6b0NCEs"
			)
		    ),
		    "v6b0NCEs",
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
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' MBMSGeneralInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSGeneralInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSGeneralInformation
