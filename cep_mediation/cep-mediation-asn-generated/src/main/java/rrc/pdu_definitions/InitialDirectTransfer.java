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
 * Define the ASN1 Type InitialDirectTransfer from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InitialDirectTransfer extends Sequence {
    
    /**
     * The default constructor.
     */
    public InitialDirectTransfer()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InitialDirectTransfer(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity, 
		    rrc.informationelements.IntraDomainNasNodeSelector intraDomainNasNodeSelector, 
		    rrc.informationelements.NAS_Message nas_Message, 
		    rrc.informationelements.MeasuredResultsOnRACH measuredResultsOnRACH, 
		    V3a0NCEs v3a0NCEs)
    {
	setCn_DomainIdentity(cn_DomainIdentity);
	setIntraDomainNasNodeSelector(intraDomainNasNodeSelector);
	setNas_Message(nas_Message);
	setMeasuredResultsOnRACH(measuredResultsOnRACH);
	setV3a0NCEs(v3a0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public InitialDirectTransfer(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity, 
		    rrc.informationelements.IntraDomainNasNodeSelector intraDomainNasNodeSelector, 
		    rrc.informationelements.NAS_Message nas_Message)
    {
	setCn_DomainIdentity(cn_DomainIdentity);
	setIntraDomainNasNodeSelector(intraDomainNasNodeSelector);
	setNas_Message(nas_Message);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.CN_DomainIdentity.cs_domain;
	mComponents[1] = new rrc.informationelements.IntraDomainNasNodeSelector();
	mComponents[2] = new rrc.informationelements.NAS_Message();
	mComponents[3] = new rrc.informationelements.MeasuredResultsOnRACH();
	mComponents[4] = new V3a0NCEs();
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
		return rrc.informationelements.CN_DomainIdentity.cs_domain;
	    case 1:
		return new rrc.informationelements.IntraDomainNasNodeSelector();
	    case 2:
		return new rrc.informationelements.NAS_Message();
	    case 3:
		return new rrc.informationelements.MeasuredResultsOnRACH();
	    case 4:
		return new V3a0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cn_DomainIdentity"
    public rrc.informationelements.CN_DomainIdentity getCn_DomainIdentity()
    {
	return (rrc.informationelements.CN_DomainIdentity)mComponents[0];
    }
    
    public void setCn_DomainIdentity(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity)
    {
	mComponents[0] = cn_DomainIdentity;
    }
    
    
    // Methods for field "intraDomainNasNodeSelector"
    public rrc.informationelements.IntraDomainNasNodeSelector getIntraDomainNasNodeSelector()
    {
	return (rrc.informationelements.IntraDomainNasNodeSelector)mComponents[1];
    }
    
    public void setIntraDomainNasNodeSelector(rrc.informationelements.IntraDomainNasNodeSelector intraDomainNasNodeSelector)
    {
	mComponents[1] = intraDomainNasNodeSelector;
    }
    
    
    // Methods for field "nas_Message"
    public rrc.informationelements.NAS_Message getNas_Message()
    {
	return (rrc.informationelements.NAS_Message)mComponents[2];
    }
    
    public void setNas_Message(rrc.informationelements.NAS_Message nas_Message)
    {
	mComponents[2] = nas_Message;
    }
    
    
    // Methods for field "measuredResultsOnRACH"
    public rrc.informationelements.MeasuredResultsOnRACH getMeasuredResultsOnRACH()
    {
	return (rrc.informationelements.MeasuredResultsOnRACH)mComponents[3];
    }
    
    public void setMeasuredResultsOnRACH(rrc.informationelements.MeasuredResultsOnRACH measuredResultsOnRACH)
    {
	mComponents[3] = measuredResultsOnRACH;
    }
    
    public boolean hasMeasuredResultsOnRACH()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMeasuredResultsOnRACH()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "v3a0NCEs"
    public V3a0NCEs getV3a0NCEs()
    {
	return (V3a0NCEs)mComponents[4];
    }
    
    public void setV3a0NCEs(V3a0NCEs v3a0NCEs)
    {
	mComponents[4] = v3a0NCEs;
    }
    
    public boolean hasV3a0NCEs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteV3a0NCEs()
    {
	setComponentAbsent(4);
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
	public V3a0NCEs(InitialDirectTransfer_v3a0ext initialDirectTransfer_v3a0ext, 
			LaterNCEs laterNCEs)
	{
	    setInitialDirectTransfer_v3a0ext(initialDirectTransfer_v3a0ext);
	    setLaterNCEs(laterNCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V3a0NCEs(InitialDirectTransfer_v3a0ext initialDirectTransfer_v3a0ext)
	{
	    setInitialDirectTransfer_v3a0ext(initialDirectTransfer_v3a0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new InitialDirectTransfer_v3a0ext();
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
		    return new InitialDirectTransfer_v3a0ext();
		case 1:
		    return new LaterNCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "initialDirectTransfer_v3a0ext"
	public InitialDirectTransfer_v3a0ext getInitialDirectTransfer_v3a0ext()
	{
	    return (InitialDirectTransfer_v3a0ext)mComponents[0];
	}
	
	public void setInitialDirectTransfer_v3a0ext(InitialDirectTransfer_v3a0ext initialDirectTransfer_v3a0ext)
	{
	    mComponents[0] = initialDirectTransfer_v3a0ext;
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
	    public LaterNCEs(InitialDirectTransfer_r3_add_ext initialDirectTransfer_r3_add_ext, 
			    V590NCEs v590NCEs)
	    {
		setInitialDirectTransfer_r3_add_ext(initialDirectTransfer_r3_add_ext);
		setV590NCEs(v590NCEs);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new InitialDirectTransfer_r3_add_ext();
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
			return new InitialDirectTransfer_r3_add_ext();
		    case 1:
			return new V590NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "initialDirectTransfer_r3_add_ext"
	    public InitialDirectTransfer_r3_add_ext getInitialDirectTransfer_r3_add_ext()
	    {
		return (InitialDirectTransfer_r3_add_ext)mComponents[0];
	    }
	    
	    public void setInitialDirectTransfer_r3_add_ext(InitialDirectTransfer_r3_add_ext initialDirectTransfer_r3_add_ext)
	    {
		mComponents[0] = initialDirectTransfer_r3_add_ext;
	    }
	    
	    public boolean hasInitialDirectTransfer_r3_add_ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteInitialDirectTransfer_r3_add_ext()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type InitialDirectTransfer_r3_add_ext from ASN1 Module PDU_definitions.
	     * @see ContainingBitString
	     */
	    public static class InitialDirectTransfer_r3_add_ext extends ContainingBitString {
		
		/**
		 * The default constructor.
		 */
		public InitialDirectTransfer_r3_add_ext()
		{
		}
		
		/**
		 * Construct Bit String from a byte array.
		 * All bits considered significant.
		 * @param value the byte array to set this object to.
		 */
		public InitialDirectTransfer_r3_add_ext(byte[] value)
		{
		    super(value);
		}
		
		
		/**
		 * Construct Bit String from a byte array and significant bits.
		 * @param value the byte array to set this object to.
		 * @param sigBits the number of significant bits.
		 */
		public InitialDirectTransfer_r3_add_ext(byte[] value, int sigBits)
		{
		    super(value, sigBits);
		}
		
		/**
		 * Construct from a contained type value.
		 */
		public InitialDirectTransfer_r3_add_ext(InitialDirectTransfer_r3_add_ext_IEs decoded)
		{
		    super(decoded);
		}
		
		// Methods for getting and setting a contained value
		public InitialDirectTransfer_r3_add_ext_IEs getContainedValue()
		{
		    return (InitialDirectTransfer_r3_add_ext_IEs)getDecodedValue();
		}
		
		public void setContainedValue(InitialDirectTransfer_r3_add_ext_IEs value)
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
			"InitialDirectTransfer$V3a0NCEs$LaterNCEs$InitialDirectTransfer_r3_add_ext"
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
			    "InitialDirectTransfer_r3_add_ext_IEs"
			)
		    ),
		    null
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' InitialDirectTransfer_r3_add_ext object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' InitialDirectTransfer_r3_add_ext object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for InitialDirectTransfer_r3_add_ext

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
		public V590NCEs(InitialDirectTransfer_v590ext initialDirectTransfer_v590ext, 
				V690NCEs v690NCEs)
		{
		    setInitialDirectTransfer_v590ext(initialDirectTransfer_v590ext);
		    setV690NCEs(v690NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V590NCEs(InitialDirectTransfer_v590ext initialDirectTransfer_v590ext)
		{
		    setInitialDirectTransfer_v590ext(initialDirectTransfer_v590ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new InitialDirectTransfer_v590ext();
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
			    return new InitialDirectTransfer_v590ext();
			case 1:
			    return new V690NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "initialDirectTransfer_v590ext"
		public InitialDirectTransfer_v590ext getInitialDirectTransfer_v590ext()
		{
		    return (InitialDirectTransfer_v590ext)mComponents[0];
		}
		
		public void setInitialDirectTransfer_v590ext(InitialDirectTransfer_v590ext initialDirectTransfer_v590ext)
		{
		    mComponents[0] = initialDirectTransfer_v590ext;
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
		    public V690NCEs(InitialDirectTransfer_v690ext_IEs initialDirectTransfer_v690ext, 
				    V770NCEs v770NCEs)
		    {
			setInitialDirectTransfer_v690ext(initialDirectTransfer_v690ext);
			setV770NCEs(v770NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V690NCEs(InitialDirectTransfer_v690ext_IEs initialDirectTransfer_v690ext)
		    {
			setInitialDirectTransfer_v690ext(initialDirectTransfer_v690ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new InitialDirectTransfer_v690ext_IEs();
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
				return new InitialDirectTransfer_v690ext_IEs();
			    case 1:
				return new V770NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "initialDirectTransfer_v690ext"
		    public InitialDirectTransfer_v690ext_IEs getInitialDirectTransfer_v690ext()
		    {
			return (InitialDirectTransfer_v690ext_IEs)mComponents[0];
		    }
		    
		    public void setInitialDirectTransfer_v690ext(InitialDirectTransfer_v690ext_IEs initialDirectTransfer_v690ext)
		    {
			mComponents[0] = initialDirectTransfer_v690ext;
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
			public V770NCEs(InitialDirectTransfer_v770ext_IEs initialDirectTransfer_v770ext, 
					V860NCEs v860NCEs)
			{
			    setInitialDirectTransfer_v770ext(initialDirectTransfer_v770ext);
			    setV860NCEs(v860NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V770NCEs(InitialDirectTransfer_v770ext_IEs initialDirectTransfer_v770ext)
			{
			    setInitialDirectTransfer_v770ext(initialDirectTransfer_v770ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new InitialDirectTransfer_v770ext_IEs();
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
				    return new InitialDirectTransfer_v770ext_IEs();
				case 1:
				    return new V860NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "initialDirectTransfer_v770ext"
			public InitialDirectTransfer_v770ext_IEs getInitialDirectTransfer_v770ext()
			{
			    return (InitialDirectTransfer_v770ext_IEs)mComponents[0];
			}
			
			public void setInitialDirectTransfer_v770ext(InitialDirectTransfer_v770ext_IEs initialDirectTransfer_v770ext)
			{
			    mComponents[0] = initialDirectTransfer_v770ext;
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
			    public V860NCEs(InitialDirectTransfer_v860ext_IEs initialDirectTransfer_v860ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setInitialDirectTransfer_v860ext(initialDirectTransfer_v860ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V860NCEs(InitialDirectTransfer_v860ext_IEs initialDirectTransfer_v860ext)
			    {
				setInitialDirectTransfer_v860ext(initialDirectTransfer_v860ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new InitialDirectTransfer_v860ext_IEs();
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
					return new InitialDirectTransfer_v860ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "initialDirectTransfer_v860ext"
			    public InitialDirectTransfer_v860ext_IEs getInitialDirectTransfer_v860ext()
			    {
				return (InitialDirectTransfer_v860ext_IEs)mComponents[0];
			    }
			    
			    public void setInitialDirectTransfer_v860ext(InitialDirectTransfer_v860ext_IEs initialDirectTransfer_v860ext)
			    {
				mComponents[0] = initialDirectTransfer_v860ext;
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
					"InitialDirectTransfer$V3a0NCEs$LaterNCEs$V590NCEs$V690NCEs$V770NCEs$V860NCEs$NonCriticalExtensions"
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
				    "InitialDirectTransfer$V3a0NCEs$LaterNCEs$V590NCEs$V690NCEs$V770NCEs$V860NCEs"
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
							"InitialDirectTransfer_v860ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"InitialDirectTransfer-v860ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "InitialDirectTransfer_v860ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "InitialDirectTransfer_v860ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "initialDirectTransfer-v860ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "InitialDirectTransfer$V3a0NCEs$LaterNCEs$V590NCEs$V690NCEs$V770NCEs$V860NCEs$NonCriticalExtensions"
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
				"InitialDirectTransfer$V3a0NCEs$LaterNCEs$V590NCEs$V690NCEs$V770NCEs"
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
						    "InitialDirectTransfer_v770ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "InitialDirectTransfer-v770ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"InitialDirectTransfer_v770ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"InitialDirectTransfer_v770ext_IEs"
						    )
						),
						0
					    )
					),
					"initialDirectTransfer-v770ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"InitialDirectTransfer$V3a0NCEs$LaterNCEs$V590NCEs$V690NCEs$V770NCEs$V860NCEs"
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
				(short)0x8001
			    }
			),
			new QName (
			    "rrc.pdu_definitions",
			    "InitialDirectTransfer$V3a0NCEs$LaterNCEs$V590NCEs$V690NCEs"
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
						"InitialDirectTransfer_v690ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"InitialDirectTransfer-v690ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "InitialDirectTransfer_v690ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "InitialDirectTransfer_v690ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "initialDirectTransfer-v690ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "InitialDirectTransfer$V3a0NCEs$LaterNCEs$V590NCEs$V690NCEs$V770NCEs"
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
			"InitialDirectTransfer$V3a0NCEs$LaterNCEs$V590NCEs"
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
					    "InitialDirectTransfer_v590ext"
					),
					new QName (
					    "PDU-definitions",
					    "InitialDirectTransfer-v590ext"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"InitialDirectTransfer_v590ext"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"InitialDirectTransfer_v590ext"
					    )
					),
					0
				    )
				),
				"initialDirectTransfer-v590ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"InitialDirectTransfer$V3a0NCEs$LaterNCEs$V590NCEs$V690NCEs"
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
		    "InitialDirectTransfer$V3a0NCEs$LaterNCEs"
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
				    "InitialDirectTransfer$V3a0NCEs$LaterNCEs$InitialDirectTransfer_r3_add_ext"
				)
			    ),
			    "initialDirectTransfer-r3-add-ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InitialDirectTransfer$V3a0NCEs$LaterNCEs$V590NCEs"
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"InitialDirectTransfer$V3a0NCEs"
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
				    "InitialDirectTransfer_v3a0ext"
				),
				new QName (
				    "PDU-definitions",
				    "InitialDirectTransfer-v3a0ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"InitialDirectTransfer_v3a0ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"InitialDirectTransfer_v3a0ext"
				    )
				),
				0
			    )
			),
			"initialDirectTransfer-v3a0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"InitialDirectTransfer$V3a0NCEs$LaterNCEs"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.pdu_definitions",
	    "InitialDirectTransfer"
	),
	new QName (
	    "PDU-definitions",
	    "InitialDirectTransfer"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CN_DomainIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CN-DomainIdentity"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cs-domain",
					0
				    ),
				    new MemberListElement (
					"ps-domain",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.CN_DomainIdentity.cs_domain
			)
		    ),
		    "cn-DomainIdentity",
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
				"IntraDomainNasNodeSelector"
			    ),
			    new QName (
				"InformationElements",
				"IntraDomainNasNodeSelector"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraDomainNasNodeSelector"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraDomainNasNodeSelector"
				)
			    ),
			    0
			)
		    ),
		    "intraDomainNasNodeSelector",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NAS_Message"
			    ),
			    new QName (
				"InformationElements",
				"NAS-Message"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4095),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4095)
			    )
			)
		    ),
		    "nas-Message",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResultsOnRACH"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsOnRACH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACH"
				)
			    ),
			    0
			)
		    ),
		    "measuredResultsOnRACH",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "InitialDirectTransfer$V3a0NCEs"
			)
		    ),
		    "v3a0NCEs",
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
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' InitialDirectTransfer object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InitialDirectTransfer object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InitialDirectTransfer
