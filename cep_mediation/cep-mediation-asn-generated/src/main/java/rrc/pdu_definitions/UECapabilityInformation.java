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
 * Define the ASN1 Type UECapabilityInformation from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UECapabilityInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public UECapabilityInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UECapabilityInformation(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.UE_RadioAccessCapability ue_RadioAccessCapability, 
		    rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList ue_RATSpecificCapability, 
		    V370NCEs v370NCEs)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setUe_RadioAccessCapability(ue_RadioAccessCapability);
	setUe_RATSpecificCapability(ue_RATSpecificCapability);
	setV370NCEs(v370NCEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.UE_RadioAccessCapability();
	mComponents[2] = new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	mComponents[3] = new V370NCEs();
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
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new rrc.informationelements.UE_RadioAccessCapability();
	    case 2:
		return new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	    case 3:
		return new V370NCEs();
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
    
    
    // Methods for field "ue_RadioAccessCapability"
    public rrc.informationelements.UE_RadioAccessCapability getUe_RadioAccessCapability()
    {
	return (rrc.informationelements.UE_RadioAccessCapability)mComponents[1];
    }
    
    public void setUe_RadioAccessCapability(rrc.informationelements.UE_RadioAccessCapability ue_RadioAccessCapability)
    {
	mComponents[1] = ue_RadioAccessCapability;
    }
    
    public boolean hasUe_RadioAccessCapability()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_RadioAccessCapability()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_RATSpecificCapability"
    public rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList getUe_RATSpecificCapability()
    {
	return (rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList)mComponents[2];
    }
    
    public void setUe_RATSpecificCapability(rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList ue_RATSpecificCapability)
    {
	mComponents[2] = ue_RATSpecificCapability;
    }
    
    public boolean hasUe_RATSpecificCapability()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_RATSpecificCapability()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "v370NCEs"
    public V370NCEs getV370NCEs()
    {
	return (V370NCEs)mComponents[3];
    }
    
    public void setV370NCEs(V370NCEs v370NCEs)
    {
	mComponents[3] = v370NCEs;
    }
    
    public boolean hasV370NCEs()
    {
	return componentIsPresent(3);
    }
    
    public void deleteV370NCEs()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type V370NCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class V370NCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public V370NCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public V370NCEs(UECapabilityInformation_v370ext ueCapabilityInformation_v370ext, 
			V380NCEs v380NCEs)
	{
	    setUeCapabilityInformation_v370ext(ueCapabilityInformation_v370ext);
	    setV380NCEs(v380NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V370NCEs(UECapabilityInformation_v370ext ueCapabilityInformation_v370ext)
	{
	    setUeCapabilityInformation_v370ext(ueCapabilityInformation_v370ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UECapabilityInformation_v370ext();
	    mComponents[1] = new V380NCEs();
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
		    return new UECapabilityInformation_v370ext();
		case 1:
		    return new V380NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ueCapabilityInformation_v370ext"
	public UECapabilityInformation_v370ext getUeCapabilityInformation_v370ext()
	{
	    return (UECapabilityInformation_v370ext)mComponents[0];
	}
	
	public void setUeCapabilityInformation_v370ext(UECapabilityInformation_v370ext ueCapabilityInformation_v370ext)
	{
	    mComponents[0] = ueCapabilityInformation_v370ext;
	}
	
	
	// Methods for field "v380NCEs"
	public V380NCEs getV380NCEs()
	{
	    return (V380NCEs)mComponents[1];
	}
	
	public void setV380NCEs(V380NCEs v380NCEs)
	{
	    mComponents[1] = v380NCEs;
	}
	
	public boolean hasV380NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV380NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V380NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V380NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V380NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V380NCEs(UECapabilityInformation_v380ext_IEs ueCapabilityInformation_v380ext, 
			    V3a0NCEs v3a0NCEs)
	    {
		setUeCapabilityInformation_v380ext(ueCapabilityInformation_v380ext);
		setV3a0NCEs(v3a0NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V380NCEs(UECapabilityInformation_v380ext_IEs ueCapabilityInformation_v380ext)
	    {
		setUeCapabilityInformation_v380ext(ueCapabilityInformation_v380ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UECapabilityInformation_v380ext_IEs();
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
			return new UECapabilityInformation_v380ext_IEs();
		    case 1:
			return new V3a0NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ueCapabilityInformation_v380ext"
	    public UECapabilityInformation_v380ext_IEs getUeCapabilityInformation_v380ext()
	    {
		return (UECapabilityInformation_v380ext_IEs)mComponents[0];
	    }
	    
	    public void setUeCapabilityInformation_v380ext(UECapabilityInformation_v380ext_IEs ueCapabilityInformation_v380ext)
	    {
		mComponents[0] = ueCapabilityInformation_v380ext;
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
		public V3a0NCEs(UECapabilityInformation_v3a0ext_IEs ueCapabilityInformation_v3a0ext, 
				LaterNCEs laterNCEs)
		{
		    setUeCapabilityInformation_v3a0ext(ueCapabilityInformation_v3a0ext);
		    setLaterNCEs(laterNCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V3a0NCEs(UECapabilityInformation_v3a0ext_IEs ueCapabilityInformation_v3a0ext)
		{
		    setUeCapabilityInformation_v3a0ext(ueCapabilityInformation_v3a0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UECapabilityInformation_v3a0ext_IEs();
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
			    return new UECapabilityInformation_v3a0ext_IEs();
			case 1:
			    return new LaterNCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ueCapabilityInformation_v3a0ext"
		public UECapabilityInformation_v3a0ext_IEs getUeCapabilityInformation_v3a0ext()
		{
		    return (UECapabilityInformation_v3a0ext_IEs)mComponents[0];
		}
		
		public void setUeCapabilityInformation_v3a0ext(UECapabilityInformation_v3a0ext_IEs ueCapabilityInformation_v3a0ext)
		{
		    mComponents[0] = ueCapabilityInformation_v3a0ext;
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
		    public LaterNCEs(UeCapabilityInformation_r3_add_ext ueCapabilityInformation_r3_add_ext, 
				    V4b0NCEs v4b0NCEs)
		    {
			setUeCapabilityInformation_r3_add_ext(ueCapabilityInformation_r3_add_ext);
			setV4b0NCEs(v4b0NCEs);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new UeCapabilityInformation_r3_add_ext();
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
				return new UeCapabilityInformation_r3_add_ext();
			    case 1:
				return new V4b0NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "ueCapabilityInformation_r3_add_ext"
		    public UeCapabilityInformation_r3_add_ext getUeCapabilityInformation_r3_add_ext()
		    {
			return (UeCapabilityInformation_r3_add_ext)mComponents[0];
		    }
		    
		    public void setUeCapabilityInformation_r3_add_ext(UeCapabilityInformation_r3_add_ext ueCapabilityInformation_r3_add_ext)
		    {
			mComponents[0] = ueCapabilityInformation_r3_add_ext;
		    }
		    
		    public boolean hasUeCapabilityInformation_r3_add_ext()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteUeCapabilityInformation_r3_add_ext()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type UeCapabilityInformation_r3_add_ext from ASN1 Module PDU_definitions.
		     * @see ContainingBitString
		     */
		    public static class UeCapabilityInformation_r3_add_ext extends ContainingBitString {
			
			/**
			 * The default constructor.
			 */
			public UeCapabilityInformation_r3_add_ext()
			{
			}
			
			/**
			 * Construct Bit String from a byte array.
			 * All bits considered significant.
			 * @param value the byte array to set this object to.
			 */
			public UeCapabilityInformation_r3_add_ext(byte[] value)
			{
			    super(value);
			}
			
			
			/**
			 * Construct Bit String from a byte array and significant bits.
			 * @param value the byte array to set this object to.
			 * @param sigBits the number of significant bits.
			 */
			public UeCapabilityInformation_r3_add_ext(byte[] value, int sigBits)
			{
			    super(value, sigBits);
			}
			
			/**
			 * Construct from a contained type value.
			 */
			public UeCapabilityInformation_r3_add_ext(UECapabilityInformation_r3_add_ext_IEs decoded)
			{
			    super(decoded);
			}
			
			// Methods for getting and setting a contained value
			public UECapabilityInformation_r3_add_ext_IEs getContainedValue()
			{
			    return (UECapabilityInformation_r3_add_ext_IEs)getDecodedValue();
			}
			
			public void setContainedValue(UECapabilityInformation_r3_add_ext_IEs value)
			{
			    setDecodedValue(value);
			}
			
			/**
			 * Initialize the type descriptor.
			 */
			private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$UeCapabilityInformation_r3_add_ext"
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
				    "UECapabilityInformation_r3_add_ext_IEs"
				)
			    ),
			    null
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' UeCapabilityInformation_r3_add_ext object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' UeCapabilityInformation_r3_add_ext object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for UeCapabilityInformation_r3_add_ext

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
			public V4b0NCEs(UECapabilityInformation_v4b0ext ueCapabilityInformation_v4b0ext, 
					V590NCEs v590NCEs)
			{
			    setUeCapabilityInformation_v4b0ext(ueCapabilityInformation_v4b0ext);
			    setV590NCEs(v590NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V4b0NCEs(UECapabilityInformation_v4b0ext ueCapabilityInformation_v4b0ext)
			{
			    setUeCapabilityInformation_v4b0ext(ueCapabilityInformation_v4b0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new UECapabilityInformation_v4b0ext();
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
				    return new UECapabilityInformation_v4b0ext();
				case 1:
				    return new V590NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "ueCapabilityInformation_v4b0ext"
			public UECapabilityInformation_v4b0ext getUeCapabilityInformation_v4b0ext()
			{
			    return (UECapabilityInformation_v4b0ext)mComponents[0];
			}
			
			public void setUeCapabilityInformation_v4b0ext(UECapabilityInformation_v4b0ext ueCapabilityInformation_v4b0ext)
			{
			    mComponents[0] = ueCapabilityInformation_v4b0ext;
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
			    public V590NCEs(UECapabilityInformation_v590ext ueCapabilityInformation_v590ext, 
					    V5c0NCEs v5c0NCEs)
			    {
				setUeCapabilityInformation_v590ext(ueCapabilityInformation_v590ext);
				setV5c0NCEs(v5c0NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V590NCEs(UECapabilityInformation_v590ext ueCapabilityInformation_v590ext)
			    {
				setUeCapabilityInformation_v590ext(ueCapabilityInformation_v590ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new UECapabilityInformation_v590ext();
				mComponents[1] = new V5c0NCEs();
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
					return new UECapabilityInformation_v590ext();
				    case 1:
					return new V5c0NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "ueCapabilityInformation_v590ext"
			    public UECapabilityInformation_v590ext getUeCapabilityInformation_v590ext()
			    {
				return (UECapabilityInformation_v590ext)mComponents[0];
			    }
			    
			    public void setUeCapabilityInformation_v590ext(UECapabilityInformation_v590ext ueCapabilityInformation_v590ext)
			    {
				mComponents[0] = ueCapabilityInformation_v590ext;
			    }
			    
			    
			    // Methods for field "v5c0NCEs"
			    public V5c0NCEs getV5c0NCEs()
			    {
				return (V5c0NCEs)mComponents[1];
			    }
			    
			    public void setV5c0NCEs(V5c0NCEs v5c0NCEs)
			    {
				mComponents[1] = v5c0NCEs;
			    }
			    
			    public boolean hasV5c0NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV5c0NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V5c0NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V5c0NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V5c0NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V5c0NCEs(UECapabilityInformation_v5c0ext ueCapabilityInformation_v5c0ext, 
						V690NCEs v690NCEs)
				{
				    setUeCapabilityInformation_v5c0ext(ueCapabilityInformation_v5c0ext);
				    setV690NCEs(v690NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V5c0NCEs(UECapabilityInformation_v5c0ext ueCapabilityInformation_v5c0ext)
				{
				    setUeCapabilityInformation_v5c0ext(ueCapabilityInformation_v5c0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new UECapabilityInformation_v5c0ext();
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
					    return new UECapabilityInformation_v5c0ext();
					case 1:
					    return new V690NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "ueCapabilityInformation_v5c0ext"
				public UECapabilityInformation_v5c0ext getUeCapabilityInformation_v5c0ext()
				{
				    return (UECapabilityInformation_v5c0ext)mComponents[0];
				}
				
				public void setUeCapabilityInformation_v5c0ext(UECapabilityInformation_v5c0ext ueCapabilityInformation_v5c0ext)
				{
				    mComponents[0] = ueCapabilityInformation_v5c0ext;
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
				    public V690NCEs(UECapabilityInformation_v690ext_IEs ueCapabilityInformation_v690ext, 
						    NonCriticalExtensions nonCriticalExtensions)
				    {
					setUeCapabilityInformation_v690ext(ueCapabilityInformation_v690ext);
					setNonCriticalExtensions(nonCriticalExtensions);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V690NCEs(UECapabilityInformation_v690ext_IEs ueCapabilityInformation_v690ext)
				    {
					setUeCapabilityInformation_v690ext(ueCapabilityInformation_v690ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new UECapabilityInformation_v690ext_IEs();
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
						return new UECapabilityInformation_v690ext_IEs();
					    case 1:
						return new NonCriticalExtensions();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "ueCapabilityInformation_v690ext"
				    public UECapabilityInformation_v690ext_IEs getUeCapabilityInformation_v690ext()
				    {
					return (UECapabilityInformation_v690ext_IEs)mComponents[0];
				    }
				    
				    public void setUeCapabilityInformation_v690ext(UECapabilityInformation_v690ext_IEs ueCapabilityInformation_v690ext)
				    {
					mComponents[0] = ueCapabilityInformation_v690ext;
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
						"UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs$NonCriticalExtensions"
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
					    "UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs"
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
								"UECapabilityInformation_v690ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"UECapabilityInformation-v690ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "UECapabilityInformation_v690ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "UECapabilityInformation_v690ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "ueCapabilityInformation-v690ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs$NonCriticalExtensions"
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
					"UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs$V5c0NCEs"
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
							    "UECapabilityInformation_v5c0ext"
							),
							new QName (
							    "PDU-definitions",
							    "UECapabilityInformation-v5c0ext"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"UECapabilityInformation_v5c0ext"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"UECapabilityInformation_v5c0ext"
							    )
							),
							0
						    )
						),
						"ueCapabilityInformation-v5c0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs"
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
				 * Get the type descriptor (TypeInfo) of 'this' V5c0NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V5c0NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V5c0NCEs

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
				    "UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs"
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
							"UECapabilityInformation_v590ext"
						    ),
						    new QName (
							"PDU-definitions",
							"UECapabilityInformation-v590ext"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "UECapabilityInformation_v590ext"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "UECapabilityInformation_v590ext"
							)
						    ),
						    0
						)
					    ),
					    "ueCapabilityInformation-v590ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs$V5c0NCEs"
						)
					    ),
					    "v5c0NCEs",
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
				"UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V4b0NCEs"
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
						    "UECapabilityInformation_v4b0ext"
						),
						new QName (
						    "PDU-definitions",
						    "UECapabilityInformation-v4b0ext"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"UECapabilityInformation_v4b0ext"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"UECapabilityInformation_v4b0ext"
						    )
						),
						0
					    )
					),
					"ueCapabilityInformation-v4b0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs"
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
				(short)0x8001
			    }
			),
			new QName (
			    "rrc.pdu_definitions",
			    "UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs"
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
					new QName (
					    "rrc.pdu_definitions",
					    "UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$UeCapabilityInformation_r3_add_ext"
					)
				    ),
				    "ueCapabilityInformation-r3-add-ext",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V4b0NCEs"
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs"
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
					    "UECapabilityInformation_v3a0ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "UECapabilityInformation-v3a0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"UECapabilityInformation_v3a0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"UECapabilityInformation_v3a0ext_IEs"
					    )
					),
					0
				    )
				),
				"ueCapabilityInformation-v3a0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs"
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
		    "UECapabilityInformation$V370NCEs$V380NCEs"
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
					"UECapabilityInformation_v380ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"UECapabilityInformation-v380ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UECapabilityInformation_v380ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UECapabilityInformation_v380ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "ueCapabilityInformation-v380ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UECapabilityInformation$V370NCEs$V380NCEs$V3a0NCEs"
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
	     * Get the type descriptor (TypeInfo) of 'this' V380NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V380NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V380NCEs

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UECapabilityInformation$V370NCEs"
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
				    "UECapabilityInformation_v370ext"
				),
				new QName (
				    "PDU-definitions",
				    "UECapabilityInformation-v370ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityInformation_v370ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityInformation_v370ext"
				    )
				),
				0
			    )
			),
			"ueCapabilityInformation-v370ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UECapabilityInformation$V370NCEs$V380NCEs"
			    )
			),
			"v380NCEs",
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
	 * Get the type descriptor (TypeInfo) of 'this' V370NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V370NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V370NCEs

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
	    "UECapabilityInformation"
	),
	new QName (
	    "PDU-definitions",
	    "UECapabilityInformation"
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
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_RadioAccessCapability"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapability",
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
				"InterRAT_UE_RadioAccessCapabilityList"
			    ),
			    new QName (
				"InformationElements",
				"InterRAT-UE-RadioAccessCapabilityList"
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
				    "InterRAT_UE_RadioAccessCapability"
				)
			    )
			)
		    ),
		    "ue-RATSpecificCapability",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UECapabilityInformation$V370NCEs"
			)
		    ),
		    "v370NCEs",
		    3,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' UECapabilityInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UECapabilityInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UECapabilityInformation
