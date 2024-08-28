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
 * Define the ASN1 Type RRCConnectionSetupComplete from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionSetupComplete extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionSetupComplete()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionSetupComplete(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.STARTList startList, 
		    rrc.informationelements.UE_RadioAccessCapability ue_RadioAccessCapability, 
		    rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList ue_RATSpecificCapability, 
		    V370NCEs v370NCEs)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setStartList(startList);
	setUe_RadioAccessCapability(ue_RadioAccessCapability);
	setUe_RATSpecificCapability(ue_RATSpecificCapability);
	setV370NCEs(v370NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public RRCConnectionSetupComplete(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.STARTList startList)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setStartList(startList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.STARTList();
	mComponents[2] = new rrc.informationelements.UE_RadioAccessCapability();
	mComponents[3] = new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	mComponents[4] = new V370NCEs();
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
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new rrc.informationelements.STARTList();
	    case 2:
		return new rrc.informationelements.UE_RadioAccessCapability();
	    case 3:
		return new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	    case 4:
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
    
    
    // Methods for field "startList"
    public rrc.informationelements.STARTList getStartList()
    {
	return (rrc.informationelements.STARTList)mComponents[1];
    }
    
    public void setStartList(rrc.informationelements.STARTList startList)
    {
	mComponents[1] = startList;
    }
    
    
    // Methods for field "ue_RadioAccessCapability"
    public rrc.informationelements.UE_RadioAccessCapability getUe_RadioAccessCapability()
    {
	return (rrc.informationelements.UE_RadioAccessCapability)mComponents[2];
    }
    
    public void setUe_RadioAccessCapability(rrc.informationelements.UE_RadioAccessCapability ue_RadioAccessCapability)
    {
	mComponents[2] = ue_RadioAccessCapability;
    }
    
    public boolean hasUe_RadioAccessCapability()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_RadioAccessCapability()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ue_RATSpecificCapability"
    public rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList getUe_RATSpecificCapability()
    {
	return (rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList)mComponents[3];
    }
    
    public void setUe_RATSpecificCapability(rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList ue_RATSpecificCapability)
    {
	mComponents[3] = ue_RATSpecificCapability;
    }
    
    public boolean hasUe_RATSpecificCapability()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_RATSpecificCapability()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "v370NCEs"
    public V370NCEs getV370NCEs()
    {
	return (V370NCEs)mComponents[4];
    }
    
    public void setV370NCEs(V370NCEs v370NCEs)
    {
	mComponents[4] = v370NCEs;
    }
    
    public boolean hasV370NCEs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteV370NCEs()
    {
	setComponentAbsent(4);
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
	public V370NCEs(RRCConnectionSetupComplete_v370ext rrcConnectionSetupComplete_v370ext, 
			V380NCEs v380NCEs)
	{
	    setRrcConnectionSetupComplete_v370ext(rrcConnectionSetupComplete_v370ext);
	    setV380NCEs(v380NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V370NCEs(RRCConnectionSetupComplete_v370ext rrcConnectionSetupComplete_v370ext)
	{
	    setRrcConnectionSetupComplete_v370ext(rrcConnectionSetupComplete_v370ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new RRCConnectionSetupComplete_v370ext();
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
		    return new RRCConnectionSetupComplete_v370ext();
		case 1:
		    return new V380NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "rrcConnectionSetupComplete_v370ext"
	public RRCConnectionSetupComplete_v370ext getRrcConnectionSetupComplete_v370ext()
	{
	    return (RRCConnectionSetupComplete_v370ext)mComponents[0];
	}
	
	public void setRrcConnectionSetupComplete_v370ext(RRCConnectionSetupComplete_v370ext rrcConnectionSetupComplete_v370ext)
	{
	    mComponents[0] = rrcConnectionSetupComplete_v370ext;
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
	    public V380NCEs(RRCConnectionSetupComplete_v380ext_IEs rrcConnectionSetupComplete_v380ext, 
			    V3a0NCEs v3a0NCEs)
	    {
		setRrcConnectionSetupComplete_v380ext(rrcConnectionSetupComplete_v380ext);
		setV3a0NCEs(v3a0NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V380NCEs(RRCConnectionSetupComplete_v380ext_IEs rrcConnectionSetupComplete_v380ext)
	    {
		setRrcConnectionSetupComplete_v380ext(rrcConnectionSetupComplete_v380ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RRCConnectionSetupComplete_v380ext_IEs();
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
			return new RRCConnectionSetupComplete_v380ext_IEs();
		    case 1:
			return new V3a0NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "rrcConnectionSetupComplete_v380ext"
	    public RRCConnectionSetupComplete_v380ext_IEs getRrcConnectionSetupComplete_v380ext()
	    {
		return (RRCConnectionSetupComplete_v380ext_IEs)mComponents[0];
	    }
	    
	    public void setRrcConnectionSetupComplete_v380ext(RRCConnectionSetupComplete_v380ext_IEs rrcConnectionSetupComplete_v380ext)
	    {
		mComponents[0] = rrcConnectionSetupComplete_v380ext;
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
		public V3a0NCEs(RRCConnectionSetupComplete_v3a0ext_IEs rrcConnectionSetupComplete_v3a0ext, 
				LaterNCEs laterNCEs)
		{
		    setRrcConnectionSetupComplete_v3a0ext(rrcConnectionSetupComplete_v3a0ext);
		    setLaterNCEs(laterNCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V3a0NCEs(RRCConnectionSetupComplete_v3a0ext_IEs rrcConnectionSetupComplete_v3a0ext)
		{
		    setRrcConnectionSetupComplete_v3a0ext(rrcConnectionSetupComplete_v3a0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new RRCConnectionSetupComplete_v3a0ext_IEs();
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
			    return new RRCConnectionSetupComplete_v3a0ext_IEs();
			case 1:
			    return new LaterNCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "rrcConnectionSetupComplete_v3a0ext"
		public RRCConnectionSetupComplete_v3a0ext_IEs getRrcConnectionSetupComplete_v3a0ext()
		{
		    return (RRCConnectionSetupComplete_v3a0ext_IEs)mComponents[0];
		}
		
		public void setRrcConnectionSetupComplete_v3a0ext(RRCConnectionSetupComplete_v3a0ext_IEs rrcConnectionSetupComplete_v3a0ext)
		{
		    mComponents[0] = rrcConnectionSetupComplete_v3a0ext;
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
		    public LaterNCEs(RrcConnectionSetupComplete_r3_add_ext rrcConnectionSetupComplete_r3_add_ext, 
				    V3g0NCEs v3g0NCEs)
		    {
			setRrcConnectionSetupComplete_r3_add_ext(rrcConnectionSetupComplete_r3_add_ext);
			setV3g0NCEs(v3g0NCEs);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new RrcConnectionSetupComplete_r3_add_ext();
			mComponents[1] = new V3g0NCEs();
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
				return new RrcConnectionSetupComplete_r3_add_ext();
			    case 1:
				return new V3g0NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "rrcConnectionSetupComplete_r3_add_ext"
		    public RrcConnectionSetupComplete_r3_add_ext getRrcConnectionSetupComplete_r3_add_ext()
		    {
			return (RrcConnectionSetupComplete_r3_add_ext)mComponents[0];
		    }
		    
		    public void setRrcConnectionSetupComplete_r3_add_ext(RrcConnectionSetupComplete_r3_add_ext rrcConnectionSetupComplete_r3_add_ext)
		    {
			mComponents[0] = rrcConnectionSetupComplete_r3_add_ext;
		    }
		    
		    public boolean hasRrcConnectionSetupComplete_r3_add_ext()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteRrcConnectionSetupComplete_r3_add_ext()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type RrcConnectionSetupComplete_r3_add_ext from ASN1 Module PDU_definitions.
		     * @see ContainingBitString
		     */
		    public static class RrcConnectionSetupComplete_r3_add_ext extends ContainingBitString {
			
			/**
			 * The default constructor.
			 */
			public RrcConnectionSetupComplete_r3_add_ext()
			{
			}
			
			/**
			 * Construct Bit String from a byte array.
			 * All bits considered significant.
			 * @param value the byte array to set this object to.
			 */
			public RrcConnectionSetupComplete_r3_add_ext(byte[] value)
			{
			    super(value);
			}
			
			
			/**
			 * Construct Bit String from a byte array and significant bits.
			 * @param value the byte array to set this object to.
			 * @param sigBits the number of significant bits.
			 */
			public RrcConnectionSetupComplete_r3_add_ext(byte[] value, int sigBits)
			{
			    super(value, sigBits);
			}
			
			/**
			 * Construct from a contained type value.
			 */
			public RrcConnectionSetupComplete_r3_add_ext(RRCConnectionSetupComplete_r3_add_ext_IEs decoded)
			{
			    super(decoded);
			}
			
			// Methods for getting and setting a contained value
			public RRCConnectionSetupComplete_r3_add_ext_IEs getContainedValue()
			{
			    return (RRCConnectionSetupComplete_r3_add_ext_IEs)getDecodedValue();
			}
			
			public void setContainedValue(RRCConnectionSetupComplete_r3_add_ext_IEs value)
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
				"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$RrcConnectionSetupComplete_r3_add_ext"
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
				    "RRCConnectionSetupComplete_r3_add_ext_IEs"
				)
			    ),
			    null
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' RrcConnectionSetupComplete_r3_add_ext object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' RrcConnectionSetupComplete_r3_add_ext object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for RrcConnectionSetupComplete_r3_add_ext

		    // Methods for field "v3g0NCEs"
		    public V3g0NCEs getV3g0NCEs()
		    {
			return (V3g0NCEs)mComponents[1];
		    }
		    
		    public void setV3g0NCEs(V3g0NCEs v3g0NCEs)
		    {
			mComponents[1] = v3g0NCEs;
		    }
		    
		    public boolean hasV3g0NCEs()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV3g0NCEs()
		    {
			setComponentAbsent(1);
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
			public V3g0NCEs(RRCConnectionSetupComplete_v3g0ext_IEs rrcConnectionSetupComplete_v3g0ext, 
					V4b0NCEs v4b0NCEs)
			{
			    setRrcConnectionSetupComplete_v3g0ext(rrcConnectionSetupComplete_v3g0ext);
			    setV4b0NCEs(v4b0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V3g0NCEs(RRCConnectionSetupComplete_v3g0ext_IEs rrcConnectionSetupComplete_v3g0ext)
			{
			    setRrcConnectionSetupComplete_v3g0ext(rrcConnectionSetupComplete_v3g0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new RRCConnectionSetupComplete_v3g0ext_IEs();
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
				    return new RRCConnectionSetupComplete_v3g0ext_IEs();
				case 1:
				    return new V4b0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "rrcConnectionSetupComplete_v3g0ext"
			public RRCConnectionSetupComplete_v3g0ext_IEs getRrcConnectionSetupComplete_v3g0ext()
			{
			    return (RRCConnectionSetupComplete_v3g0ext_IEs)mComponents[0];
			}
			
			public void setRrcConnectionSetupComplete_v3g0ext(RRCConnectionSetupComplete_v3g0ext_IEs rrcConnectionSetupComplete_v3g0ext)
			{
			    mComponents[0] = rrcConnectionSetupComplete_v3g0ext;
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
			    public V4b0NCEs(RRCConnectionSetupComplete_v4b0ext_IEs rrcConnectionSetupComplete_v4b0ext, 
					    V590NCEs v590NCEs)
			    {
				setRrcConnectionSetupComplete_v4b0ext(rrcConnectionSetupComplete_v4b0ext);
				setV590NCEs(v590NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V4b0NCEs(RRCConnectionSetupComplete_v4b0ext_IEs rrcConnectionSetupComplete_v4b0ext)
			    {
				setRrcConnectionSetupComplete_v4b0ext(rrcConnectionSetupComplete_v4b0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new RRCConnectionSetupComplete_v4b0ext_IEs();
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
					return new RRCConnectionSetupComplete_v4b0ext_IEs();
				    case 1:
					return new V590NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "rrcConnectionSetupComplete_v4b0ext"
			    public RRCConnectionSetupComplete_v4b0ext_IEs getRrcConnectionSetupComplete_v4b0ext()
			    {
				return (RRCConnectionSetupComplete_v4b0ext_IEs)mComponents[0];
			    }
			    
			    public void setRrcConnectionSetupComplete_v4b0ext(RRCConnectionSetupComplete_v4b0ext_IEs rrcConnectionSetupComplete_v4b0ext)
			    {
				mComponents[0] = rrcConnectionSetupComplete_v4b0ext;
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
				public V590NCEs(RRCConnectionSetupComplete_v590ext_IEs rrcConnectionSetupComplete_v590ext, 
						V5c0NCEs v5c0NCEs)
				{
				    setRrcConnectionSetupComplete_v590ext(rrcConnectionSetupComplete_v590ext);
				    setV5c0NCEs(v5c0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V590NCEs(RRCConnectionSetupComplete_v590ext_IEs rrcConnectionSetupComplete_v590ext)
				{
				    setRrcConnectionSetupComplete_v590ext(rrcConnectionSetupComplete_v590ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new RRCConnectionSetupComplete_v590ext_IEs();
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
					    return new RRCConnectionSetupComplete_v590ext_IEs();
					case 1:
					    return new V5c0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "rrcConnectionSetupComplete_v590ext"
				public RRCConnectionSetupComplete_v590ext_IEs getRrcConnectionSetupComplete_v590ext()
				{
				    return (RRCConnectionSetupComplete_v590ext_IEs)mComponents[0];
				}
				
				public void setRrcConnectionSetupComplete_v590ext(RRCConnectionSetupComplete_v590ext_IEs rrcConnectionSetupComplete_v590ext)
				{
				    mComponents[0] = rrcConnectionSetupComplete_v590ext;
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
				    public V5c0NCEs(RRCConnectionSetupComplete_v5c0ext_IEs rrcConnectionSetupComplete_v5c0ext, 
						    V690NCEs v690NCEs)
				    {
					setRrcConnectionSetupComplete_v5c0ext(rrcConnectionSetupComplete_v5c0ext);
					setV690NCEs(v690NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V5c0NCEs(RRCConnectionSetupComplete_v5c0ext_IEs rrcConnectionSetupComplete_v5c0ext)
				    {
					setRrcConnectionSetupComplete_v5c0ext(rrcConnectionSetupComplete_v5c0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new RRCConnectionSetupComplete_v5c0ext_IEs();
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
						return new RRCConnectionSetupComplete_v5c0ext_IEs();
					    case 1:
						return new V690NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "rrcConnectionSetupComplete_v5c0ext"
				    public RRCConnectionSetupComplete_v5c0ext_IEs getRrcConnectionSetupComplete_v5c0ext()
				    {
					return (RRCConnectionSetupComplete_v5c0ext_IEs)mComponents[0];
				    }
				    
				    public void setRrcConnectionSetupComplete_v5c0ext(RRCConnectionSetupComplete_v5c0ext_IEs rrcConnectionSetupComplete_v5c0ext)
				    {
					mComponents[0] = rrcConnectionSetupComplete_v5c0ext;
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
					public V690NCEs(RRCConnectionSetupComplete_v690ext_IEs rrcConnectionSetupComplete_v690ext, 
							V770NCEs v770NCEs)
					{
					    setRrcConnectionSetupComplete_v690ext(rrcConnectionSetupComplete_v690ext);
					    setV770NCEs(v770NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V690NCEs(RRCConnectionSetupComplete_v690ext_IEs rrcConnectionSetupComplete_v690ext)
					{
					    setRrcConnectionSetupComplete_v690ext(rrcConnectionSetupComplete_v690ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new RRCConnectionSetupComplete_v690ext_IEs();
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
						    return new RRCConnectionSetupComplete_v690ext_IEs();
						case 1:
						    return new V770NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "rrcConnectionSetupComplete_v690ext"
					public RRCConnectionSetupComplete_v690ext_IEs getRrcConnectionSetupComplete_v690ext()
					{
					    return (RRCConnectionSetupComplete_v690ext_IEs)mComponents[0];
					}
					
					public void setRrcConnectionSetupComplete_v690ext(RRCConnectionSetupComplete_v690ext_IEs rrcConnectionSetupComplete_v690ext)
					{
					    mComponents[0] = rrcConnectionSetupComplete_v690ext;
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
					    public V770NCEs(RRCConnectionSetupComplete_v770ext_IEs rrcConectionSetupComplete_v770ext, 
							    Va40NCEs va40NCEs)
					    {
						setRrcConectionSetupComplete_v770ext(rrcConectionSetupComplete_v770ext);
						setVa40NCEs(va40NCEs);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public V770NCEs(RRCConnectionSetupComplete_v770ext_IEs rrcConectionSetupComplete_v770ext)
					    {
						setRrcConectionSetupComplete_v770ext(rrcConectionSetupComplete_v770ext);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new RRCConnectionSetupComplete_v770ext_IEs();
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
							return new RRCConnectionSetupComplete_v770ext_IEs();
						    case 1:
							return new Va40NCEs();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "rrcConectionSetupComplete_v770ext"
					    public RRCConnectionSetupComplete_v770ext_IEs getRrcConectionSetupComplete_v770ext()
					    {
						return (RRCConnectionSetupComplete_v770ext_IEs)mComponents[0];
					    }
					    
					    public void setRrcConectionSetupComplete_v770ext(RRCConnectionSetupComplete_v770ext_IEs rrcConectionSetupComplete_v770ext)
					    {
						mComponents[0] = rrcConectionSetupComplete_v770ext;
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
						public Va40NCEs(RRCConnectionSetupComplete_va40ext_IEs rrcConectionSetupComplete_va40ext, 
								NonCriticalExtensions nonCriticalExtensions)
						{
						    setRrcConectionSetupComplete_va40ext(rrcConectionSetupComplete_va40ext);
						    setNonCriticalExtensions(nonCriticalExtensions);
						}
						
						/**
						 * Construct with required components.
						 */
						public Va40NCEs(RRCConnectionSetupComplete_va40ext_IEs rrcConectionSetupComplete_va40ext)
						{
						    setRrcConectionSetupComplete_va40ext(rrcConectionSetupComplete_va40ext);
						}
						
						public void initComponents()
						{
						    mComponents[0] = new RRCConnectionSetupComplete_va40ext_IEs();
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
							    return new RRCConnectionSetupComplete_va40ext_IEs();
							case 1:
							    return new NonCriticalExtensions();
							default:
							    throw new InternalError("AbstractCollection.createInstance()");
						    }
						    
						}
						
						
						// Methods for field "rrcConectionSetupComplete_va40ext"
						public RRCConnectionSetupComplete_va40ext_IEs getRrcConectionSetupComplete_va40ext()
						{
						    return (RRCConnectionSetupComplete_va40ext_IEs)mComponents[0];
						}
						
						public void setRrcConectionSetupComplete_va40ext(RRCConnectionSetupComplete_va40ext_IEs rrcConectionSetupComplete_va40ext)
						{
						    mComponents[0] = rrcConectionSetupComplete_va40ext;
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
							    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs$V770NCEs$Va40NCEs$NonCriticalExtensions"
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
							"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs$V770NCEs$Va40NCEs"
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
									    "RRCConnectionSetupComplete_va40ext_IEs"
									),
									new QName (
									    "PDU-definitions",
									    "RRCConnectionSetupComplete-va40ext-IEs"
									),
									12314,
									null,
									new FieldsRef (
									    new QName (
										"rrc.pdu_definitions",
										"RRCConnectionSetupComplete_va40ext_IEs"
									    )
									),
									0,
									new TagDecodersRef (
									    new QName (
										"rrc.pdu_definitions",
										"RRCConnectionSetupComplete_va40ext_IEs"
									    )
									),
									0
								    )
								),
								"rrcConectionSetupComplete-va40ext",
								0,
								2,
								null
							    ),
							    new SequenceFieldInfo (
								new TypeInfoRef (
								    new QName (
									"rrc.pdu_definitions",
									"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs$V770NCEs$Va40NCEs$NonCriticalExtensions"
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
						    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs$V770NCEs"
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
									"RRCConnectionSetupComplete_v770ext_IEs"
								    ),
								    new QName (
									"PDU-definitions",
									"RRCConnectionSetupComplete-v770ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.pdu_definitions",
									    "RRCConnectionSetupComplete_v770ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.pdu_definitions",
									    "RRCConnectionSetupComplete_v770ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "rrcConectionSetupComplete-v770ext",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.pdu_definitions",
								    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs$V770NCEs$Va40NCEs"
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
						    (short)0x8001
						}
					    ),
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs"
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
								    "RRCConnectionSetupComplete_v690ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "RRCConnectionSetupComplete-v690ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"RRCConnectionSetupComplete_v690ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"RRCConnectionSetupComplete_v690ext_IEs"
								    )
								),
								0
							    )
							),
							"rrcConnectionSetupComplete-v690ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs$V770NCEs"
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
					    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5c0NCEs"
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
								"RRCConnectionSetupComplete_v5c0ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"RRCConnectionSetupComplete-v5c0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "RRCConnectionSetupComplete_v5c0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "RRCConnectionSetupComplete_v5c0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "rrcConnectionSetupComplete-v5c0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5c0NCEs$V690NCEs"
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
					"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs"
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
							    "RRCConnectionSetupComplete_v590ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "RRCConnectionSetupComplete-v590ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"RRCConnectionSetupComplete_v590ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"RRCConnectionSetupComplete_v590ext_IEs"
							    )
							),
							0
						    )
						),
						"rrcConnectionSetupComplete-v590ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs$V5c0NCEs"
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
				    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs"
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
							"RRCConnectionSetupComplete_v4b0ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"RRCConnectionSetupComplete-v4b0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionSetupComplete_v4b0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionSetupComplete_v4b0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "rrcConnectionSetupComplete-v4b0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs$V590NCEs"
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
				"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs"
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
						    "RRCConnectionSetupComplete_v3g0ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "RRCConnectionSetupComplete-v3g0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionSetupComplete_v3g0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionSetupComplete_v3g0ext_IEs"
						    )
						),
						0
					    )
					),
					"rrcConnectionSetupComplete-v3g0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs$V4b0NCEs"
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
			    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs"
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
					    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$RrcConnectionSetupComplete_r3_add_ext"
					)
				    ),
				    "rrcConnectionSetupComplete-r3-add-ext",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs$V3g0NCEs"
					)
				    ),
				    "v3g0NCEs",
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
			"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs"
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
					    "RRCConnectionSetupComplete_v3a0ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "RRCConnectionSetupComplete-v3a0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionSetupComplete_v3a0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionSetupComplete_v3a0ext_IEs"
					    )
					),
					0
				    )
				),
				"rrcConnectionSetupComplete-v3a0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs$LaterNCEs"
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
		    "RRCConnectionSetupComplete$V370NCEs$V380NCEs"
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
					"RRCConnectionSetupComplete_v380ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"RRCConnectionSetupComplete-v380ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RRCConnectionSetupComplete_v380ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RRCConnectionSetupComplete_v380ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "rrcConnectionSetupComplete-v380ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionSetupComplete$V370NCEs$V380NCEs$V3a0NCEs"
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RRCConnectionSetupComplete$V370NCEs"
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
				    "RRCConnectionSetupComplete_v370ext"
				),
				new QName (
				    "PDU-definitions",
				    "RRCConnectionSetupComplete-v370ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionSetupComplete_v370ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionSetupComplete_v370ext"
				    )
				),
				0
			    )
			),
			"rrcConnectionSetupComplete-v370ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionSetupComplete$V370NCEs$V380NCEs"
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
	    "RRCConnectionSetupComplete"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionSetupComplete"
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
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"STARTList"
			    ),
			    new QName (
				"InformationElements",
				"STARTList"
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
				    "STARTSingle"
				)
			    )
			)
		    ),
		    "startList",
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionSetupComplete$V370NCEs"
			)
		    ),
		    "v370NCEs",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionSetupComplete object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionSetupComplete object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionSetupComplete
