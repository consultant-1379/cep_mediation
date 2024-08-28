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
 * Define the ASN1 Type RRCConnectionRequest from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionRequest extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionRequest(rrc.informationelements.InitialUE_Identity initialUE_Identity, 
		    rrc.informationelements.EstablishmentCause establishmentCause, 
		    rrc.informationelements.ProtocolErrorIndicator protocolErrorIndicator, 
		    rrc.informationelements.MeasuredResultsOnRACH measuredResultsOnRACH, 
		    V3d0NCEs v3d0NCEs)
    {
	setInitialUE_Identity(initialUE_Identity);
	setEstablishmentCause(establishmentCause);
	setProtocolErrorIndicator(protocolErrorIndicator);
	setMeasuredResultsOnRACH(measuredResultsOnRACH);
	setV3d0NCEs(v3d0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public RRCConnectionRequest(rrc.informationelements.InitialUE_Identity initialUE_Identity, 
		    rrc.informationelements.EstablishmentCause establishmentCause, 
		    rrc.informationelements.ProtocolErrorIndicator protocolErrorIndicator)
    {
	setInitialUE_Identity(initialUE_Identity);
	setEstablishmentCause(establishmentCause);
	setProtocolErrorIndicator(protocolErrorIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.InitialUE_Identity();
	mComponents[1] = rrc.informationelements.EstablishmentCause.originatingConversationalCall;
	mComponents[2] = rrc.informationelements.ProtocolErrorIndicator.noError;
	mComponents[3] = new rrc.informationelements.MeasuredResultsOnRACH();
	mComponents[4] = new V3d0NCEs();
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
		return new rrc.informationelements.InitialUE_Identity();
	    case 1:
		return rrc.informationelements.EstablishmentCause.originatingConversationalCall;
	    case 2:
		return rrc.informationelements.ProtocolErrorIndicator.noError;
	    case 3:
		return new rrc.informationelements.MeasuredResultsOnRACH();
	    case 4:
		return new V3d0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "initialUE_Identity"
    public rrc.informationelements.InitialUE_Identity getInitialUE_Identity()
    {
	return (rrc.informationelements.InitialUE_Identity)mComponents[0];
    }
    
    public void setInitialUE_Identity(rrc.informationelements.InitialUE_Identity initialUE_Identity)
    {
	mComponents[0] = initialUE_Identity;
    }
    
    
    // Methods for field "establishmentCause"
    public rrc.informationelements.EstablishmentCause getEstablishmentCause()
    {
	return (rrc.informationelements.EstablishmentCause)mComponents[1];
    }
    
    public void setEstablishmentCause(rrc.informationelements.EstablishmentCause establishmentCause)
    {
	mComponents[1] = establishmentCause;
    }
    
    
    // Methods for field "protocolErrorIndicator"
    public rrc.informationelements.ProtocolErrorIndicator getProtocolErrorIndicator()
    {
	return (rrc.informationelements.ProtocolErrorIndicator)mComponents[2];
    }
    
    public void setProtocolErrorIndicator(rrc.informationelements.ProtocolErrorIndicator protocolErrorIndicator)
    {
	mComponents[2] = protocolErrorIndicator;
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
    
    
    // Methods for field "v3d0NCEs"
    public V3d0NCEs getV3d0NCEs()
    {
	return (V3d0NCEs)mComponents[4];
    }
    
    public void setV3d0NCEs(V3d0NCEs v3d0NCEs)
    {
	mComponents[4] = v3d0NCEs;
    }
    
    public boolean hasV3d0NCEs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteV3d0NCEs()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type V3d0NCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class V3d0NCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public V3d0NCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public V3d0NCEs(RRCConnectionRequest_v3d0ext_IEs rRCConnectionRequest_v3d0ext, 
			V4b0NCEs v4b0NCEs)
	{
	    setRRCConnectionRequest_v3d0ext(rRCConnectionRequest_v3d0ext);
	    setV4b0NCEs(v4b0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V3d0NCEs(RRCConnectionRequest_v3d0ext_IEs rRCConnectionRequest_v3d0ext)
	{
	    setRRCConnectionRequest_v3d0ext(rRCConnectionRequest_v3d0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new RRCConnectionRequest_v3d0ext_IEs();
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
		    return new RRCConnectionRequest_v3d0ext_IEs();
		case 1:
		    return new V4b0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "rRCConnectionRequest_v3d0ext"
	public RRCConnectionRequest_v3d0ext_IEs getRRCConnectionRequest_v3d0ext()
	{
	    return (RRCConnectionRequest_v3d0ext_IEs)mComponents[0];
	}
	
	public void setRRCConnectionRequest_v3d0ext(RRCConnectionRequest_v3d0ext_IEs rRCConnectionRequest_v3d0ext)
	{
	    mComponents[0] = rRCConnectionRequest_v3d0ext;
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
	    public V4b0NCEs(RRCConnectionRequest_v4b0ext_IEs rrcConnectionRequest_v4b0ext, 
			    V590NCEs v590NCEs)
	    {
		setRrcConnectionRequest_v4b0ext(rrcConnectionRequest_v4b0ext);
		setV590NCEs(v590NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V4b0NCEs(RRCConnectionRequest_v4b0ext_IEs rrcConnectionRequest_v4b0ext)
	    {
		setRrcConnectionRequest_v4b0ext(rrcConnectionRequest_v4b0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RRCConnectionRequest_v4b0ext_IEs();
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
			return new RRCConnectionRequest_v4b0ext_IEs();
		    case 1:
			return new V590NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "rrcConnectionRequest_v4b0ext"
	    public RRCConnectionRequest_v4b0ext_IEs getRrcConnectionRequest_v4b0ext()
	    {
		return (RRCConnectionRequest_v4b0ext_IEs)mComponents[0];
	    }
	    
	    public void setRrcConnectionRequest_v4b0ext(RRCConnectionRequest_v4b0ext_IEs rrcConnectionRequest_v4b0ext)
	    {
		mComponents[0] = rrcConnectionRequest_v4b0ext;
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
		public V590NCEs(RRCConnectionRequest_v590ext_IEs rrcConnectionRequest_v590ext, 
				V690NCEs v690NCEs)
		{
		    setRrcConnectionRequest_v590ext(rrcConnectionRequest_v590ext);
		    setV690NCEs(v690NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V590NCEs(RRCConnectionRequest_v590ext_IEs rrcConnectionRequest_v590ext)
		{
		    setRrcConnectionRequest_v590ext(rrcConnectionRequest_v590ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new RRCConnectionRequest_v590ext_IEs();
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
			    return new RRCConnectionRequest_v590ext_IEs();
			case 1:
			    return new V690NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "rrcConnectionRequest_v590ext"
		public RRCConnectionRequest_v590ext_IEs getRrcConnectionRequest_v590ext()
		{
		    return (RRCConnectionRequest_v590ext_IEs)mComponents[0];
		}
		
		public void setRrcConnectionRequest_v590ext(RRCConnectionRequest_v590ext_IEs rrcConnectionRequest_v590ext)
		{
		    mComponents[0] = rrcConnectionRequest_v590ext;
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
		    public V690NCEs(RRCConnectionRequest_v690ext_IEs rrcConnectionRequest_v690ext, 
				    V6b0NCEs v6b0NCEs)
		    {
			setRrcConnectionRequest_v690ext(rrcConnectionRequest_v690ext);
			setV6b0NCEs(v6b0NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V690NCEs(RRCConnectionRequest_v690ext_IEs rrcConnectionRequest_v690ext)
		    {
			setRrcConnectionRequest_v690ext(rrcConnectionRequest_v690ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new RRCConnectionRequest_v690ext_IEs();
			mComponents[1] = new V6b0NCEs();
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
				return new RRCConnectionRequest_v690ext_IEs();
			    case 1:
				return new V6b0NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "rrcConnectionRequest_v690ext"
		    public RRCConnectionRequest_v690ext_IEs getRrcConnectionRequest_v690ext()
		    {
			return (RRCConnectionRequest_v690ext_IEs)mComponents[0];
		    }
		    
		    public void setRrcConnectionRequest_v690ext(RRCConnectionRequest_v690ext_IEs rrcConnectionRequest_v690ext)
		    {
			mComponents[0] = rrcConnectionRequest_v690ext;
		    }
		    
		    
		    // Methods for field "v6b0NCEs"
		    public V6b0NCEs getV6b0NCEs()
		    {
			return (V6b0NCEs)mComponents[1];
		    }
		    
		    public void setV6b0NCEs(V6b0NCEs v6b0NCEs)
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
			public V6b0NCEs(RRCConnectionRequest_v6b0ext_IEs rrcConnectionRequest_v6b0ext, 
					V6e0NCEs v6e0NCEs)
			{
			    setRrcConnectionRequest_v6b0ext(rrcConnectionRequest_v6b0ext);
			    setV6e0NCEs(v6e0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V6b0NCEs(RRCConnectionRequest_v6b0ext_IEs rrcConnectionRequest_v6b0ext)
			{
			    setRrcConnectionRequest_v6b0ext(rrcConnectionRequest_v6b0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new RRCConnectionRequest_v6b0ext_IEs();
			    mComponents[1] = new V6e0NCEs();
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
				    return new RRCConnectionRequest_v6b0ext_IEs();
				case 1:
				    return new V6e0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "rrcConnectionRequest_v6b0ext"
			public RRCConnectionRequest_v6b0ext_IEs getRrcConnectionRequest_v6b0ext()
			{
			    return (RRCConnectionRequest_v6b0ext_IEs)mComponents[0];
			}
			
			public void setRrcConnectionRequest_v6b0ext(RRCConnectionRequest_v6b0ext_IEs rrcConnectionRequest_v6b0ext)
			{
			    mComponents[0] = rrcConnectionRequest_v6b0ext;
			}
			
			
			// Methods for field "v6e0NCEs"
			public V6e0NCEs getV6e0NCEs()
			{
			    return (V6e0NCEs)mComponents[1];
			}
			
			public void setV6e0NCEs(V6e0NCEs v6e0NCEs)
			{
			    mComponents[1] = v6e0NCEs;
			}
			
			public boolean hasV6e0NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV6e0NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V6e0NCEs from ASN1 Module PDU_definitions.
			 * @see Sequence
			 */
			public static class V6e0NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V6e0NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V6e0NCEs(RRCConnectionRequest_v6e0ext_IEs rrcConnectionRequest_v6e0ext, 
					    V770NCEs v770NCEs)
			    {
				setRrcConnectionRequest_v6e0ext(rrcConnectionRequest_v6e0ext);
				setV770NCEs(v770NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V6e0NCEs(RRCConnectionRequest_v6e0ext_IEs rrcConnectionRequest_v6e0ext)
			    {
				setRrcConnectionRequest_v6e0ext(rrcConnectionRequest_v6e0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new RRCConnectionRequest_v6e0ext_IEs();
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
					return new RRCConnectionRequest_v6e0ext_IEs();
				    case 1:
					return new V770NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "rrcConnectionRequest_v6e0ext"
			    public RRCConnectionRequest_v6e0ext_IEs getRrcConnectionRequest_v6e0ext()
			    {
				return (RRCConnectionRequest_v6e0ext_IEs)mComponents[0];
			    }
			    
			    public void setRrcConnectionRequest_v6e0ext(RRCConnectionRequest_v6e0ext_IEs rrcConnectionRequest_v6e0ext)
			    {
				mComponents[0] = rrcConnectionRequest_v6e0ext;
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
				public V770NCEs(RRCConnectionRequest_v770ext_IEs rrcConnectionRequest_v770ext, 
						V7b0NCEs v7b0NCEs)
				{
				    setRrcConnectionRequest_v770ext(rrcConnectionRequest_v770ext);
				    setV7b0NCEs(v7b0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V770NCEs(RRCConnectionRequest_v770ext_IEs rrcConnectionRequest_v770ext)
				{
				    setRrcConnectionRequest_v770ext(rrcConnectionRequest_v770ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new RRCConnectionRequest_v770ext_IEs();
				    mComponents[1] = new V7b0NCEs();
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
					    return new RRCConnectionRequest_v770ext_IEs();
					case 1:
					    return new V7b0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "rrcConnectionRequest_v770ext"
				public RRCConnectionRequest_v770ext_IEs getRrcConnectionRequest_v770ext()
				{
				    return (RRCConnectionRequest_v770ext_IEs)mComponents[0];
				}
				
				public void setRrcConnectionRequest_v770ext(RRCConnectionRequest_v770ext_IEs rrcConnectionRequest_v770ext)
				{
				    mComponents[0] = rrcConnectionRequest_v770ext;
				}
				
				
				// Methods for field "v7b0NCEs"
				public V7b0NCEs getV7b0NCEs()
				{
				    return (V7b0NCEs)mComponents[1];
				}
				
				public void setV7b0NCEs(V7b0NCEs v7b0NCEs)
				{
				    mComponents[1] = v7b0NCEs;
				}
				
				public boolean hasV7b0NCEs()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteV7b0NCEs()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type V7b0NCEs from ASN1 Module PDU_definitions.
				 * @see Sequence
				 */
				public static class V7b0NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V7b0NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V7b0NCEs(RRCConnectionRequest_v7b0ext_IEs rrcConnectionRequest_v7b0ext, 
						    V860NCEs v860NCEs)
				    {
					setRrcConnectionRequest_v7b0ext(rrcConnectionRequest_v7b0ext);
					setV860NCEs(v860NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V7b0NCEs(RRCConnectionRequest_v7b0ext_IEs rrcConnectionRequest_v7b0ext)
				    {
					setRrcConnectionRequest_v7b0ext(rrcConnectionRequest_v7b0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new RRCConnectionRequest_v7b0ext_IEs();
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
						return new RRCConnectionRequest_v7b0ext_IEs();
					    case 1:
						return new V860NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "rrcConnectionRequest_v7b0ext"
				    public RRCConnectionRequest_v7b0ext_IEs getRrcConnectionRequest_v7b0ext()
				    {
					return (RRCConnectionRequest_v7b0ext_IEs)mComponents[0];
				    }
				    
				    public void setRrcConnectionRequest_v7b0ext(RRCConnectionRequest_v7b0ext_IEs rrcConnectionRequest_v7b0ext)
				    {
					mComponents[0] = rrcConnectionRequest_v7b0ext;
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
					public V860NCEs(RRCConnectionRequest_v860ext_IEs rrcConnectionRequest_v860ext, 
							V7e0NCEs v7e0NCEs)
					{
					    setRrcConnectionRequest_v860ext(rrcConnectionRequest_v860ext);
					    setV7e0NCEs(v7e0NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V860NCEs(RRCConnectionRequest_v860ext_IEs rrcConnectionRequest_v860ext)
					{
					    setRrcConnectionRequest_v860ext(rrcConnectionRequest_v860ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new RRCConnectionRequest_v860ext_IEs();
					    mComponents[1] = new V7e0NCEs();
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
						    return new RRCConnectionRequest_v860ext_IEs();
						case 1:
						    return new V7e0NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "rrcConnectionRequest_v860ext"
					public RRCConnectionRequest_v860ext_IEs getRrcConnectionRequest_v860ext()
					{
					    return (RRCConnectionRequest_v860ext_IEs)mComponents[0];
					}
					
					public void setRrcConnectionRequest_v860ext(RRCConnectionRequest_v860ext_IEs rrcConnectionRequest_v860ext)
					{
					    mComponents[0] = rrcConnectionRequest_v860ext;
					}
					
					
					// Methods for field "v7e0NCEs"
					public V7e0NCEs getV7e0NCEs()
					{
					    return (V7e0NCEs)mComponents[1];
					}
					
					public void setV7e0NCEs(V7e0NCEs v7e0NCEs)
					{
					    mComponents[1] = v7e0NCEs;
					}
					
					public boolean hasV7e0NCEs()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteV7e0NCEs()
					{
					    setComponentAbsent(1);
					}
					
					
					
					/**
					 * Define the ASN1 Type V7e0NCEs from ASN1 Module PDU_definitions.
					 * @see Sequence
					 */
					public static class V7e0NCEs extends Sequence {
					    
					    /**
					     * The default constructor.
					     */
					    public V7e0NCEs()
					    {
					    }
					    
					    /**
					     * Construct with AbstractData components.
					     */
					    public V7e0NCEs(RRCConnectionRequest_v7e0ext_IEs rrcConnectionRequest_v7e0ext, 
							    V7g0NCEs v7g0NCEs)
					    {
						setRrcConnectionRequest_v7e0ext(rrcConnectionRequest_v7e0ext);
						setV7g0NCEs(v7g0NCEs);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public V7e0NCEs(RRCConnectionRequest_v7e0ext_IEs rrcConnectionRequest_v7e0ext)
					    {
						setRrcConnectionRequest_v7e0ext(rrcConnectionRequest_v7e0ext);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new RRCConnectionRequest_v7e0ext_IEs();
						mComponents[1] = new V7g0NCEs();
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
							return new RRCConnectionRequest_v7e0ext_IEs();
						    case 1:
							return new V7g0NCEs();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "rrcConnectionRequest_v7e0ext"
					    public RRCConnectionRequest_v7e0ext_IEs getRrcConnectionRequest_v7e0ext()
					    {
						return (RRCConnectionRequest_v7e0ext_IEs)mComponents[0];
					    }
					    
					    public void setRrcConnectionRequest_v7e0ext(RRCConnectionRequest_v7e0ext_IEs rrcConnectionRequest_v7e0ext)
					    {
						mComponents[0] = rrcConnectionRequest_v7e0ext;
					    }
					    
					    
					    // Methods for field "v7g0NCEs"
					    public V7g0NCEs getV7g0NCEs()
					    {
						return (V7g0NCEs)mComponents[1];
					    }
					    
					    public void setV7g0NCEs(V7g0NCEs v7g0NCEs)
					    {
						mComponents[1] = v7g0NCEs;
					    }
					    
					    public boolean hasV7g0NCEs()
					    {
						return componentIsPresent(1);
					    }
					    
					    public void deleteV7g0NCEs()
					    {
						setComponentAbsent(1);
					    }
					    
					    
					    
					    /**
					     * Define the ASN1 Type V7g0NCEs from ASN1 Module PDU_definitions.
					     * @see Sequence
					     */
					    public static class V7g0NCEs extends Sequence {
						
						/**
						 * The default constructor.
						 */
						public V7g0NCEs()
						{
						}
						
						/**
						 * Construct with AbstractData components.
						 */
						public V7g0NCEs(RRCConnectionRequest_v7g0ext_IEs rrcConnectionRequest_v7g0ext, 
								V920NCEs v920NCEs)
						{
						    setRrcConnectionRequest_v7g0ext(rrcConnectionRequest_v7g0ext);
						    setV920NCEs(v920NCEs);
						}
						
						/**
						 * Construct with required components.
						 */
						public V7g0NCEs(RRCConnectionRequest_v7g0ext_IEs rrcConnectionRequest_v7g0ext)
						{
						    setRrcConnectionRequest_v7g0ext(rrcConnectionRequest_v7g0ext);
						}
						
						public void initComponents()
						{
						    mComponents[0] = new RRCConnectionRequest_v7g0ext_IEs();
						    mComponents[1] = new V920NCEs();
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
							    return new RRCConnectionRequest_v7g0ext_IEs();
							case 1:
							    return new V920NCEs();
							default:
							    throw new InternalError("AbstractCollection.createInstance()");
						    }
						    
						}
						
						
						// Methods for field "rrcConnectionRequest_v7g0ext"
						public RRCConnectionRequest_v7g0ext_IEs getRrcConnectionRequest_v7g0ext()
						{
						    return (RRCConnectionRequest_v7g0ext_IEs)mComponents[0];
						}
						
						public void setRrcConnectionRequest_v7g0ext(RRCConnectionRequest_v7g0ext_IEs rrcConnectionRequest_v7g0ext)
						{
						    mComponents[0] = rrcConnectionRequest_v7g0ext;
						}
						
						
						// Methods for field "v920NCEs"
						public V920NCEs getV920NCEs()
						{
						    return (V920NCEs)mComponents[1];
						}
						
						public void setV920NCEs(V920NCEs v920NCEs)
						{
						    mComponents[1] = v920NCEs;
						}
						
						public boolean hasV920NCEs()
						{
						    return componentIsPresent(1);
						}
						
						public void deleteV920NCEs()
						{
						    setComponentAbsent(1);
						}
						
						
						
						/**
						 * Define the ASN1 Type V920NCEs from ASN1 Module PDU_definitions.
						 * @see Sequence
						 */
						public static class V920NCEs extends Sequence {
						    
						    /**
						     * The default constructor.
						     */
						    public V920NCEs()
						    {
						    }
						    
						    /**
						     * Construct with AbstractData components.
						     */
						    public V920NCEs(RRCConnectionRequest_v920ext_IEs rrcConnectionRequest_v920ext, 
								    V940NCEs v940NCEs)
						    {
							setRrcConnectionRequest_v920ext(rrcConnectionRequest_v920ext);
							setV940NCEs(v940NCEs);
						    }
						    
						    /**
						     * Construct with required components.
						     */
						    public V920NCEs(RRCConnectionRequest_v920ext_IEs rrcConnectionRequest_v920ext)
						    {
							setRrcConnectionRequest_v920ext(rrcConnectionRequest_v920ext);
						    }
						    
						    public void initComponents()
						    {
							mComponents[0] = new RRCConnectionRequest_v920ext_IEs();
							mComponents[1] = new V940NCEs();
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
								return new RRCConnectionRequest_v920ext_IEs();
							    case 1:
								return new V940NCEs();
							    default:
								throw new InternalError("AbstractCollection.createInstance()");
							}
							
						    }
						    
						    
						    // Methods for field "rrcConnectionRequest_v920ext"
						    public RRCConnectionRequest_v920ext_IEs getRrcConnectionRequest_v920ext()
						    {
							return (RRCConnectionRequest_v920ext_IEs)mComponents[0];
						    }
						    
						    public void setRrcConnectionRequest_v920ext(RRCConnectionRequest_v920ext_IEs rrcConnectionRequest_v920ext)
						    {
							mComponents[0] = rrcConnectionRequest_v920ext;
						    }
						    
						    
						    // Methods for field "v940NCEs"
						    public V940NCEs getV940NCEs()
						    {
							return (V940NCEs)mComponents[1];
						    }
						    
						    public void setV940NCEs(V940NCEs v940NCEs)
						    {
							mComponents[1] = v940NCEs;
						    }
						    
						    public boolean hasV940NCEs()
						    {
							return componentIsPresent(1);
						    }
						    
						    public void deleteV940NCEs()
						    {
							setComponentAbsent(1);
						    }
						    
						    
						    
						    /**
						     * Define the ASN1 Type V940NCEs from ASN1 Module PDU_definitions.
						     * @see Sequence
						     */
						    public static class V940NCEs extends Sequence {
							
							/**
							 * The default constructor.
							 */
							public V940NCEs()
							{
							}
							
							/**
							 * Construct with AbstractData components.
							 */
							public V940NCEs(RRCConnectionRequest_v940ext_IEs rrcConnectionRequest_v940ext, 
									RRCConnectionRequest_NonCriticalExts_va40_IEs va40NCEs)
							{
							    setRrcConnectionRequest_v940ext(rrcConnectionRequest_v940ext);
							    setVa40NCEs(va40NCEs);
							}
							
							public void initComponents()
							{
							    mComponents[0] = new RRCConnectionRequest_v940ext_IEs();
							    mComponents[1] = new RRCConnectionRequest_NonCriticalExts_va40_IEs();
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
								    return new RRCConnectionRequest_v940ext_IEs();
								case 1:
								    return new RRCConnectionRequest_NonCriticalExts_va40_IEs();
								default:
								    throw new InternalError("AbstractCollection.createInstance()");
							    }
							    
							}
							
							
							// Methods for field "rrcConnectionRequest_v940ext"
							public RRCConnectionRequest_v940ext_IEs getRrcConnectionRequest_v940ext()
							{
							    return (RRCConnectionRequest_v940ext_IEs)mComponents[0];
							}
							
							public void setRrcConnectionRequest_v940ext(RRCConnectionRequest_v940ext_IEs rrcConnectionRequest_v940ext)
							{
							    mComponents[0] = rrcConnectionRequest_v940ext;
							}
							
							
							// Methods for field "va40NCEs"
							public RRCConnectionRequest_NonCriticalExts_va40_IEs getVa40NCEs()
							{
							    return (RRCConnectionRequest_NonCriticalExts_va40_IEs)mComponents[1];
							}
							
							public void setVa40NCEs(RRCConnectionRequest_NonCriticalExts_va40_IEs va40NCEs)
							{
							    mComponents[1] = va40NCEs;
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
								"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs$V860NCEs$V7e0NCEs$V7g0NCEs$V920NCEs$V940NCEs"
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
										    "RRCConnectionRequest_v940ext_IEs"
										),
										new QName (
										    "PDU-definitions",
										    "RRCConnectionRequest-v940ext-IEs"
										),
										12314,
										null,
										new FieldsRef (
										    new QName (
											"rrc.pdu_definitions",
											"RRCConnectionRequest_v940ext_IEs"
										    )
										),
										0,
										new TagDecodersRef (
										    new QName (
											"rrc.pdu_definitions",
											"RRCConnectionRequest_v940ext_IEs"
										    )
										),
										0
									    )
									),
									"rrcConnectionRequest-v940ext",
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
										    "RRCConnectionRequest_NonCriticalExts_va40_IEs"
										),
										new QName (
										    "PDU-definitions",
										    "RRCConnectionRequest-NonCriticalExts-va40-IEs"
										),
										12314,
										null,
										new FieldsRef (
										    new QName (
											"rrc.pdu_definitions",
											"RRCConnectionRequest_NonCriticalExts_va40_IEs"
										    )
										),
										0,
										new TagDecodersRef (
										    new QName (
											"rrc.pdu_definitions",
											"RRCConnectionRequest_NonCriticalExts_va40_IEs"
										    )
										),
										0
									    )
									),
									"va40NCEs",
									1,
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
								    )
								}
							    ),
							    0
							);
							
							/**
							 * Get the type descriptor (TypeInfo) of 'this' V940NCEs object.
							 */
							public TypeInfo getTypeInfo()
							{
							    return c_typeinfo;
							}
							
							/**
							 * Get the static type descriptor (TypeInfo) of 'this' V940NCEs object.
							 */
							public static TypeInfo getStaticTypeInfo()
							{
							    return c_typeinfo;
							}
							
						    } // End class definition for V940NCEs

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
							    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs$V860NCEs$V7e0NCEs$V7g0NCEs$V920NCEs"
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
										"RRCConnectionRequest_v920ext_IEs"
									    ),
									    new QName (
										"PDU-definitions",
										"RRCConnectionRequest-v920ext-IEs"
									    ),
									    12314,
									    null,
									    new FieldsRef (
										new QName (
										    "rrc.pdu_definitions",
										    "RRCConnectionRequest_v920ext_IEs"
										)
									    ),
									    0,
									    new TagDecodersRef (
										new QName (
										    "rrc.pdu_definitions",
										    "RRCConnectionRequest_v920ext_IEs"
										)
									    ),
									    0
									)
								    ),
								    "rrcConnectionRequest-v920ext",
								    0,
								    2,
								    null
								),
								new SequenceFieldInfo (
								    new TypeInfoRef (
									new QName (
									    "rrc.pdu_definitions",
									    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs$V860NCEs$V7e0NCEs$V7g0NCEs$V920NCEs$V940NCEs"
									)
								    ),
								    "v940NCEs",
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
						     * Get the type descriptor (TypeInfo) of 'this' V920NCEs object.
						     */
						    public TypeInfo getTypeInfo()
						    {
							return c_typeinfo;
						    }
						    
						    /**
						     * Get the static type descriptor (TypeInfo) of 'this' V920NCEs object.
						     */
						    public static TypeInfo getStaticTypeInfo()
						    {
							return c_typeinfo;
						    }
						    
						} // End class definition for V920NCEs

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
							"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs$V860NCEs$V7e0NCEs$V7g0NCEs"
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
									    "RRCConnectionRequest_v7g0ext_IEs"
									),
									new QName (
									    "PDU-definitions",
									    "RRCConnectionRequest-v7g0ext-IEs"
									),
									12314,
									null,
									new FieldsRef (
									    new QName (
										"rrc.pdu_definitions",
										"RRCConnectionRequest_v7g0ext_IEs"
									    )
									),
									0,
									new TagDecodersRef (
									    new QName (
										"rrc.pdu_definitions",
										"RRCConnectionRequest_v7g0ext_IEs"
									    )
									),
									0
								    )
								),
								"rrcConnectionRequest-v7g0ext",
								0,
								2,
								null
							    ),
							    new SequenceFieldInfo (
								new TypeInfoRef (
								    new QName (
									"rrc.pdu_definitions",
									"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs$V860NCEs$V7e0NCEs$V7g0NCEs$V920NCEs"
								    )
								),
								"v920NCEs",
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
						 * Get the type descriptor (TypeInfo) of 'this' V7g0NCEs object.
						 */
						public TypeInfo getTypeInfo()
						{
						    return c_typeinfo;
						}
						
						/**
						 * Get the static type descriptor (TypeInfo) of 'this' V7g0NCEs object.
						 */
						public static TypeInfo getStaticTypeInfo()
						{
						    return c_typeinfo;
						}
						
					    } // End class definition for V7g0NCEs

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
						    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs$V860NCEs$V7e0NCEs"
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
									"RRCConnectionRequest_v7e0ext_IEs"
								    ),
								    new QName (
									"PDU-definitions",
									"RRCConnectionRequest-v7e0ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.pdu_definitions",
									    "RRCConnectionRequest_v7e0ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.pdu_definitions",
									    "RRCConnectionRequest_v7e0ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "rrcConnectionRequest-v7e0ext",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.pdu_definitions",
								    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs$V860NCEs$V7e0NCEs$V7g0NCEs"
								)
							    ),
							    "v7g0NCEs",
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
					     * Get the type descriptor (TypeInfo) of 'this' V7e0NCEs object.
					     */
					    public TypeInfo getTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					    /**
					     * Get the static type descriptor (TypeInfo) of 'this' V7e0NCEs object.
					     */
					    public static TypeInfo getStaticTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					} // End class definition for V7e0NCEs

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
						"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs$V860NCEs"
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
								    "RRCConnectionRequest_v860ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "RRCConnectionRequest-v860ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"RRCConnectionRequest_v860ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"RRCConnectionRequest_v860ext_IEs"
								    )
								),
								0
							    )
							),
							"rrcConnectionRequest-v860ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs$V860NCEs$V7e0NCEs"
							    )
							),
							"v7e0NCEs",
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
					    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs"
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
								"RRCConnectionRequest_v7b0ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"RRCConnectionRequest-v7b0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "RRCConnectionRequest_v7b0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "RRCConnectionRequest_v7b0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "rrcConnectionRequest-v7b0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs$V860NCEs"
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
				     * Get the type descriptor (TypeInfo) of 'this' V7b0NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V7b0NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V7b0NCEs

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
					"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs"
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
							    "RRCConnectionRequest_v770ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "RRCConnectionRequest-v770ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"RRCConnectionRequest_v770ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"RRCConnectionRequest_v770ext_IEs"
							    )
							),
							0
						    )
						),
						"rrcConnectionRequest-v770ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs$V7b0NCEs"
						    )
						),
						"v7b0NCEs",
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
				    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs"
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
							"RRCConnectionRequest_v6e0ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"RRCConnectionRequest-v6e0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionRequest_v6e0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionRequest_v6e0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "rrcConnectionRequest-v6e0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs$V770NCEs"
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
			     * Get the type descriptor (TypeInfo) of 'this' V6e0NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V6e0NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V6e0NCEs

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
				"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs"
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
						    "RRCConnectionRequest_v6b0ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "RRCConnectionRequest-v6b0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionRequest_v6b0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionRequest_v6b0ext_IEs"
						    )
						),
						0
					    )
					),
					"rrcConnectionRequest-v6b0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs$V6e0NCEs"
					    )
					),
					"v6e0NCEs",
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
				(short)0x8001
			    }
			),
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs"
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
						"RRCConnectionRequest_v690ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"RRCConnectionRequest-v690ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionRequest_v690ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionRequest_v690ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "rrcConnectionRequest-v690ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs$V6b0NCEs"
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
			"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs"
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
					    "RRCConnectionRequest_v590ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "RRCConnectionRequest-v590ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionRequest_v590ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionRequest_v590ext_IEs"
					    )
					),
					0
				    )
				),
				"rrcConnectionRequest-v590ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs$V690NCEs"
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
		    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs"
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
					"RRCConnectionRequest_v4b0ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"RRCConnectionRequest-v4b0ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RRCConnectionRequest_v4b0ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RRCConnectionRequest_v4b0ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "rrcConnectionRequest-v4b0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionRequest$V3d0NCEs$V4b0NCEs$V590NCEs"
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RRCConnectionRequest$V3d0NCEs"
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
				    "RRCConnectionRequest_v3d0ext_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "RRCConnectionRequest-v3d0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionRequest_v3d0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionRequest_v3d0ext_IEs"
				    )
				),
				0
			    )
			),
			"rRCConnectionRequest-v3d0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionRequest$V3d0NCEs$V4b0NCEs"
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
	 * Get the type descriptor (TypeInfo) of 'this' V3d0NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V3d0NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V3d0NCEs

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
	    "RRCConnectionRequest"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRequest"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InitialUE_Identity"
			    ),
			    new QName (
				"InformationElements",
				"InitialUE-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InitialUE_Identity"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7)
				}
			    )
			)
		    ),
		    "initialUE-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"EstablishmentCause"
			    ),
			    new QName (
				"InformationElements",
				"EstablishmentCause"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"originatingConversationalCall",
					0
				    ),
				    new MemberListElement (
					"originatingStreamingCall",
					1
				    ),
				    new MemberListElement (
					"originatingInteractiveCall",
					2
				    ),
				    new MemberListElement (
					"originatingBackgroundCall",
					3
				    ),
				    new MemberListElement (
					"originatingSubscribedTrafficCall",
					4
				    ),
				    new MemberListElement (
					"terminatingConversationalCall",
					5
				    ),
				    new MemberListElement (
					"terminatingStreamingCall",
					6
				    ),
				    new MemberListElement (
					"terminatingInteractiveCall",
					7
				    ),
				    new MemberListElement (
					"terminatingBackgroundCall",
					8
				    ),
				    new MemberListElement (
					"emergencyCall",
					9
				    ),
				    new MemberListElement (
					"interRAT-CellReselection",
					10
				    ),
				    new MemberListElement (
					"interRAT-CellChangeOrder",
					11
				    ),
				    new MemberListElement (
					"registration",
					12
				    ),
				    new MemberListElement (
					"detach",
					13
				    ),
				    new MemberListElement (
					"originatingHighPrioritySignalling",
					14
				    ),
				    new MemberListElement (
					"originatingLowPrioritySignalling",
					15
				    ),
				    new MemberListElement (
					"callRe-establishment",
					16
				    ),
				    new MemberListElement (
					"terminatingHighPrioritySignalling",
					17
				    ),
				    new MemberListElement (
					"terminatingLowPrioritySignalling",
					18
				    ),
				    new MemberListElement (
					"terminatingCauseUnknown",
					19
				    ),
				    new MemberListElement (
					"mbms-Reception",
					20
				    ),
				    new MemberListElement (
					"mbms-PTP-RB-Request",
					21
				    ),
				    new MemberListElement (
					"delayTolerantAccess",
					22
				    ),
				    new MemberListElement (
					"spare9",
					23
				    ),
				    new MemberListElement (
					"spare8",
					24
				    ),
				    new MemberListElement (
					"spare7",
					25
				    ),
				    new MemberListElement (
					"spare6",
					26
				    ),
				    new MemberListElement (
					"spare5",
					27
				    ),
				    new MemberListElement (
					"spare4",
					28
				    ),
				    new MemberListElement (
					"spare3",
					29
				    ),
				    new MemberListElement (
					"spare2",
					30
				    ),
				    new MemberListElement (
					"spare1",
					31
				    )
				}
			    ),
			    0,
			    rrc.informationelements.EstablishmentCause.originatingConversationalCall
			)
		    ),
		    "establishmentCause",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ProtocolErrorIndicator"
			    ),
			    new QName (
				"InformationElements",
				"ProtocolErrorIndicator"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"noError",
					0
				    ),
				    new MemberListElement (
					"errorOccurred",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.ProtocolErrorIndicator.noError
			)
		    ),
		    "protocolErrorIndicator",
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
			    "RRCConnectionRequest$V3d0NCEs"
			)
		    ),
		    "v3d0NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRequest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRequest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRequest
