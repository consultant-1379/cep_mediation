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


package rrc.informationelements;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type UE_CapabilityContainer_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_CapabilityContainer_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_CapabilityContainer_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_CapabilityContainer_IEs(UE_RadioAccessCapability_v690ext ue_RadioAccessCapability_v690ext, 
		    InterRAT_UE_RadioAccessCapability_v690ext ue_RATSpecificCapability_v690ext, 
		    V6b0NCEs v6b0NCEs)
    {
	setUe_RadioAccessCapability_v690ext(ue_RadioAccessCapability_v690ext);
	setUe_RATSpecificCapability_v690ext(ue_RATSpecificCapability_v690ext);
	setV6b0NCEs(v6b0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public UE_CapabilityContainer_IEs(UE_RadioAccessCapability_v690ext ue_RadioAccessCapability_v690ext)
    {
	setUe_RadioAccessCapability_v690ext(ue_RadioAccessCapability_v690ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_RadioAccessCapability_v690ext();
	mComponents[1] = new InterRAT_UE_RadioAccessCapability_v690ext();
	mComponents[2] = new V6b0NCEs();
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
		return new UE_RadioAccessCapability_v690ext();
	    case 1:
		return new InterRAT_UE_RadioAccessCapability_v690ext();
	    case 2:
		return new V6b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapability_v690ext"
    public UE_RadioAccessCapability_v690ext getUe_RadioAccessCapability_v690ext()
    {
	return (UE_RadioAccessCapability_v690ext)mComponents[0];
    }
    
    public void setUe_RadioAccessCapability_v690ext(UE_RadioAccessCapability_v690ext ue_RadioAccessCapability_v690ext)
    {
	mComponents[0] = ue_RadioAccessCapability_v690ext;
    }
    
    
    // Methods for field "ue_RATSpecificCapability_v690ext"
    public InterRAT_UE_RadioAccessCapability_v690ext getUe_RATSpecificCapability_v690ext()
    {
	return (InterRAT_UE_RadioAccessCapability_v690ext)mComponents[1];
    }
    
    public void setUe_RATSpecificCapability_v690ext(InterRAT_UE_RadioAccessCapability_v690ext ue_RATSpecificCapability_v690ext)
    {
	mComponents[1] = ue_RATSpecificCapability_v690ext;
    }
    
    public boolean hasUe_RATSpecificCapability_v690ext()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_RATSpecificCapability_v690ext()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "v6b0NCEs"
    public V6b0NCEs getV6b0NCEs()
    {
	return (V6b0NCEs)mComponents[2];
    }
    
    public void setV6b0NCEs(V6b0NCEs v6b0NCEs)
    {
	mComponents[2] = v6b0NCEs;
    }
    
    public boolean hasV6b0NCEs()
    {
	return componentIsPresent(2);
    }
    
    public void deleteV6b0NCEs()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type V6b0NCEs from ASN1 Module InformationElements.
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
	public V6b0NCEs(UE_RadioAccessCapability_v6b0ext_IEs ue_RadioAccessCapability_v6b0ext, 
			V6e0NCEs v6e0NCEs)
	{
	    setUe_RadioAccessCapability_v6b0ext(ue_RadioAccessCapability_v6b0ext);
	    setV6e0NCEs(v6e0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V6b0NCEs(UE_RadioAccessCapability_v6b0ext_IEs ue_RadioAccessCapability_v6b0ext)
	{
	    setUe_RadioAccessCapability_v6b0ext(ue_RadioAccessCapability_v6b0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UE_RadioAccessCapability_v6b0ext_IEs();
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
		    return new UE_RadioAccessCapability_v6b0ext_IEs();
		case 1:
		    return new V6e0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ue_RadioAccessCapability_v6b0ext"
	public UE_RadioAccessCapability_v6b0ext_IEs getUe_RadioAccessCapability_v6b0ext()
	{
	    return (UE_RadioAccessCapability_v6b0ext_IEs)mComponents[0];
	}
	
	public void setUe_RadioAccessCapability_v6b0ext(UE_RadioAccessCapability_v6b0ext_IEs ue_RadioAccessCapability_v6b0ext)
	{
	    mComponents[0] = ue_RadioAccessCapability_v6b0ext;
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
	 * Define the ASN1 Type V6e0NCEs from ASN1 Module InformationElements.
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
	    public V6e0NCEs(UE_RadioAccessCapability_v6e0ext_IEs ue_RadioAccessCapability_v6e0ext, 
			    V770NCEs v770NCEs)
	    {
		setUe_RadioAccessCapability_v6e0ext(ue_RadioAccessCapability_v6e0ext);
		setV770NCEs(v770NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V6e0NCEs(UE_RadioAccessCapability_v6e0ext_IEs ue_RadioAccessCapability_v6e0ext)
	    {
		setUe_RadioAccessCapability_v6e0ext(ue_RadioAccessCapability_v6e0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UE_RadioAccessCapability_v6e0ext_IEs();
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
			return new UE_RadioAccessCapability_v6e0ext_IEs();
		    case 1:
			return new V770NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ue_RadioAccessCapability_v6e0ext"
	    public UE_RadioAccessCapability_v6e0ext_IEs getUe_RadioAccessCapability_v6e0ext()
	    {
		return (UE_RadioAccessCapability_v6e0ext_IEs)mComponents[0];
	    }
	    
	    public void setUe_RadioAccessCapability_v6e0ext(UE_RadioAccessCapability_v6e0ext_IEs ue_RadioAccessCapability_v6e0ext)
	    {
		mComponents[0] = ue_RadioAccessCapability_v6e0ext;
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
	     * Define the ASN1 Type V770NCEs from ASN1 Module InformationElements.
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
		public V770NCEs(UE_RadioAccessCapability_v770ext_IEs ue_RadioAccessCapability_v770ext, 
				V790NCEs v790NCEs)
		{
		    setUe_RadioAccessCapability_v770ext(ue_RadioAccessCapability_v770ext);
		    setV790NCEs(v790NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V770NCEs(UE_RadioAccessCapability_v770ext_IEs ue_RadioAccessCapability_v770ext)
		{
		    setUe_RadioAccessCapability_v770ext(ue_RadioAccessCapability_v770ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UE_RadioAccessCapability_v770ext_IEs();
		    mComponents[1] = new V790NCEs();
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
			    return new UE_RadioAccessCapability_v770ext_IEs();
			case 1:
			    return new V790NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ue_RadioAccessCapability_v770ext"
		public UE_RadioAccessCapability_v770ext_IEs getUe_RadioAccessCapability_v770ext()
		{
		    return (UE_RadioAccessCapability_v770ext_IEs)mComponents[0];
		}
		
		public void setUe_RadioAccessCapability_v770ext(UE_RadioAccessCapability_v770ext_IEs ue_RadioAccessCapability_v770ext)
		{
		    mComponents[0] = ue_RadioAccessCapability_v770ext;
		}
		
		
		// Methods for field "v790NCEs"
		public V790NCEs getV790NCEs()
		{
		    return (V790NCEs)mComponents[1];
		}
		
		public void setV790NCEs(V790NCEs v790NCEs)
		{
		    mComponents[1] = v790NCEs;
		}
		
		public boolean hasV790NCEs()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV790NCEs()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V790NCEs from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class V790NCEs extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V790NCEs()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V790NCEs(UE_RadioAccessCapability_v790ext_IEs ue_RadioAccessCapability_v790ext, 
				    V860NCEs v860NCEs)
		    {
			setUe_RadioAccessCapability_v790ext(ue_RadioAccessCapability_v790ext);
			setV860NCEs(v860NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V790NCEs(UE_RadioAccessCapability_v790ext_IEs ue_RadioAccessCapability_v790ext)
		    {
			setUe_RadioAccessCapability_v790ext(ue_RadioAccessCapability_v790ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new UE_RadioAccessCapability_v790ext_IEs();
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
				return new UE_RadioAccessCapability_v790ext_IEs();
			    case 1:
				return new V860NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "ue_RadioAccessCapability_v790ext"
		    public UE_RadioAccessCapability_v790ext_IEs getUe_RadioAccessCapability_v790ext()
		    {
			return (UE_RadioAccessCapability_v790ext_IEs)mComponents[0];
		    }
		    
		    public void setUe_RadioAccessCapability_v790ext(UE_RadioAccessCapability_v790ext_IEs ue_RadioAccessCapability_v790ext)
		    {
			mComponents[0] = ue_RadioAccessCapability_v790ext;
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
		     * Define the ASN1 Type V860NCEs from ASN1 Module InformationElements.
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
			public V860NCEs(UE_RadioAccessCapability_v860ext_IEs ue_RadioAccessCapability_v860ext, 
					InterRAT_UE_RadioAccessCapability_v860ext ue_RATSpecificCapability_v860ext, 
					V880NCEs v880NCEs)
			{
			    setUe_RadioAccessCapability_v860ext(ue_RadioAccessCapability_v860ext);
			    setUe_RATSpecificCapability_v860ext(ue_RATSpecificCapability_v860ext);
			    setV880NCEs(v880NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V860NCEs(UE_RadioAccessCapability_v860ext_IEs ue_RadioAccessCapability_v860ext)
			{
			    setUe_RadioAccessCapability_v860ext(ue_RadioAccessCapability_v860ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new UE_RadioAccessCapability_v860ext_IEs();
			    mComponents[1] = new InterRAT_UE_RadioAccessCapability_v860ext();
			    mComponents[2] = new V880NCEs();
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
				    return new UE_RadioAccessCapability_v860ext_IEs();
				case 1:
				    return new InterRAT_UE_RadioAccessCapability_v860ext();
				case 2:
				    return new V880NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "ue_RadioAccessCapability_v860ext"
			public UE_RadioAccessCapability_v860ext_IEs getUe_RadioAccessCapability_v860ext()
			{
			    return (UE_RadioAccessCapability_v860ext_IEs)mComponents[0];
			}
			
			public void setUe_RadioAccessCapability_v860ext(UE_RadioAccessCapability_v860ext_IEs ue_RadioAccessCapability_v860ext)
			{
			    mComponents[0] = ue_RadioAccessCapability_v860ext;
			}
			
			
			// Methods for field "ue_RATSpecificCapability_v860ext"
			public InterRAT_UE_RadioAccessCapability_v860ext getUe_RATSpecificCapability_v860ext()
			{
			    return (InterRAT_UE_RadioAccessCapability_v860ext)mComponents[1];
			}
			
			public void setUe_RATSpecificCapability_v860ext(InterRAT_UE_RadioAccessCapability_v860ext ue_RATSpecificCapability_v860ext)
			{
			    mComponents[1] = ue_RATSpecificCapability_v860ext;
			}
			
			public boolean hasUe_RATSpecificCapability_v860ext()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteUe_RATSpecificCapability_v860ext()
			{
			    setComponentAbsent(1);
			}
			
			
			// Methods for field "v880NCEs"
			public V880NCEs getV880NCEs()
			{
			    return (V880NCEs)mComponents[2];
			}
			
			public void setV880NCEs(V880NCEs v880NCEs)
			{
			    mComponents[2] = v880NCEs;
			}
			
			public boolean hasV880NCEs()
			{
			    return componentIsPresent(2);
			}
			
			public void deleteV880NCEs()
			{
			    setComponentAbsent(2);
			}
			
			
			
			/**
			 * Define the ASN1 Type V880NCEs from ASN1 Module InformationElements.
			 * @see Sequence
			 */
			public static class V880NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V880NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V880NCEs(UE_RadioAccessCapability_v880ext_IEs ue_RadioAccessCapability_v880ext, 
					    V890NCEs v890NCEs)
			    {
				setUe_RadioAccessCapability_v880ext(ue_RadioAccessCapability_v880ext);
				setV890NCEs(v890NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V880NCEs(UE_RadioAccessCapability_v880ext_IEs ue_RadioAccessCapability_v880ext)
			    {
				setUe_RadioAccessCapability_v880ext(ue_RadioAccessCapability_v880ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new UE_RadioAccessCapability_v880ext_IEs();
				mComponents[1] = new V890NCEs();
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
					return new UE_RadioAccessCapability_v880ext_IEs();
				    case 1:
					return new V890NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "ue_RadioAccessCapability_v880ext"
			    public UE_RadioAccessCapability_v880ext_IEs getUe_RadioAccessCapability_v880ext()
			    {
				return (UE_RadioAccessCapability_v880ext_IEs)mComponents[0];
			    }
			    
			    public void setUe_RadioAccessCapability_v880ext(UE_RadioAccessCapability_v880ext_IEs ue_RadioAccessCapability_v880ext)
			    {
				mComponents[0] = ue_RadioAccessCapability_v880ext;
			    }
			    
			    
			    // Methods for field "v890NCEs"
			    public V890NCEs getV890NCEs()
			    {
				return (V890NCEs)mComponents[1];
			    }
			    
			    public void setV890NCEs(V890NCEs v890NCEs)
			    {
				mComponents[1] = v890NCEs;
			    }
			    
			    public boolean hasV890NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV890NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V890NCEs from ASN1 Module InformationElements.
			     * @see Sequence
			     */
			    public static class V890NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V890NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V890NCEs(UE_RadioAccessCapability_v890ext_IEs ue_RadioAccessCapability_v890ext, 
						V920NCEs v920NCEs)
				{
				    setUe_RadioAccessCapability_v890ext(ue_RadioAccessCapability_v890ext);
				    setV920NCEs(v920NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V890NCEs(UE_RadioAccessCapability_v890ext_IEs ue_RadioAccessCapability_v890ext)
				{
				    setUe_RadioAccessCapability_v890ext(ue_RadioAccessCapability_v890ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new UE_RadioAccessCapability_v890ext_IEs();
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
					    return new UE_RadioAccessCapability_v890ext_IEs();
					case 1:
					    return new V920NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "ue_RadioAccessCapability_v890ext"
				public UE_RadioAccessCapability_v890ext_IEs getUe_RadioAccessCapability_v890ext()
				{
				    return (UE_RadioAccessCapability_v890ext_IEs)mComponents[0];
				}
				
				public void setUe_RadioAccessCapability_v890ext(UE_RadioAccessCapability_v890ext_IEs ue_RadioAccessCapability_v890ext)
				{
				    mComponents[0] = ue_RadioAccessCapability_v890ext;
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
				 * Define the ASN1 Type V920NCEs from ASN1 Module InformationElements.
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
				    public V920NCEs(UE_RadioAccessCapability_v920ext_IEs ue_RadioAccessCapability_v920ext, 
						    V970NCEs v970NCEs)
				    {
					setUe_RadioAccessCapability_v920ext(ue_RadioAccessCapability_v920ext);
					setV970NCEs(v970NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V920NCEs(UE_RadioAccessCapability_v920ext_IEs ue_RadioAccessCapability_v920ext)
				    {
					setUe_RadioAccessCapability_v920ext(ue_RadioAccessCapability_v920ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new UE_RadioAccessCapability_v920ext_IEs();
					mComponents[1] = new V970NCEs();
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
						return new UE_RadioAccessCapability_v920ext_IEs();
					    case 1:
						return new V970NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "ue_RadioAccessCapability_v920ext"
				    public UE_RadioAccessCapability_v920ext_IEs getUe_RadioAccessCapability_v920ext()
				    {
					return (UE_RadioAccessCapability_v920ext_IEs)mComponents[0];
				    }
				    
				    public void setUe_RadioAccessCapability_v920ext(UE_RadioAccessCapability_v920ext_IEs ue_RadioAccessCapability_v920ext)
				    {
					mComponents[0] = ue_RadioAccessCapability_v920ext;
				    }
				    
				    
				    // Methods for field "v970NCEs"
				    public V970NCEs getV970NCEs()
				    {
					return (V970NCEs)mComponents[1];
				    }
				    
				    public void setV970NCEs(V970NCEs v970NCEs)
				    {
					mComponents[1] = v970NCEs;
				    }
				    
				    public boolean hasV970NCEs()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV970NCEs()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V970NCEs from ASN1 Module InformationElements.
				     * @see Sequence
				     */
				    public static class V970NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V970NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V970NCEs(UE_RadioAccessCapability_v970ext_IEs ue_RadioAccessCapability_v970ext, 
							Va40NCEs va40NCEs)
					{
					    setUe_RadioAccessCapability_v970ext(ue_RadioAccessCapability_v970ext);
					    setVa40NCEs(va40NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V970NCEs(UE_RadioAccessCapability_v970ext_IEs ue_RadioAccessCapability_v970ext)
					{
					    setUe_RadioAccessCapability_v970ext(ue_RadioAccessCapability_v970ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new UE_RadioAccessCapability_v970ext_IEs();
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
						    return new UE_RadioAccessCapability_v970ext_IEs();
						case 1:
						    return new Va40NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "ue_RadioAccessCapability_v970ext"
					public UE_RadioAccessCapability_v970ext_IEs getUe_RadioAccessCapability_v970ext()
					{
					    return (UE_RadioAccessCapability_v970ext_IEs)mComponents[0];
					}
					
					public void setUe_RadioAccessCapability_v970ext(UE_RadioAccessCapability_v970ext_IEs ue_RadioAccessCapability_v970ext)
					{
					    mComponents[0] = ue_RadioAccessCapability_v970ext;
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
					 * Define the ASN1 Type Va40NCEs from ASN1 Module InformationElements.
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
					    public Va40NCEs(UE_RadioAccessCapability_va40ext_IEs ue_RadioAccessCapability_va40ext, 
							    NonCriticalExtensions nonCriticalExtensions)
					    {
						setUe_RadioAccessCapability_va40ext(ue_RadioAccessCapability_va40ext);
						setNonCriticalExtensions(nonCriticalExtensions);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public Va40NCEs(UE_RadioAccessCapability_va40ext_IEs ue_RadioAccessCapability_va40ext)
					    {
						setUe_RadioAccessCapability_va40ext(ue_RadioAccessCapability_va40ext);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new UE_RadioAccessCapability_va40ext_IEs();
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
							return new UE_RadioAccessCapability_va40ext_IEs();
						    case 1:
							return new NonCriticalExtensions();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "ue_RadioAccessCapability_va40ext"
					    public UE_RadioAccessCapability_va40ext_IEs getUe_RadioAccessCapability_va40ext()
					    {
						return (UE_RadioAccessCapability_va40ext_IEs)mComponents[0];
					    }
					    
					    public void setUe_RadioAccessCapability_va40ext(UE_RadioAccessCapability_va40ext_IEs ue_RadioAccessCapability_va40ext)
					    {
						mComponents[0] = ue_RadioAccessCapability_va40ext;
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
					     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module InformationElements.
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
							"rrc.informationelements",
							"UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs$V890NCEs$V920NCEs$V970NCEs$Va40NCEs$NonCriticalExtensions"
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
						    "rrc.informationelements",
						    "UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs$V890NCEs$V920NCEs$V970NCEs$Va40NCEs"
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
									"rrc.informationelements",
									"UE_RadioAccessCapability_va40ext_IEs"
								    ),
								    new QName (
									"InformationElements",
									"UE-RadioAccessCapability-va40ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.informationelements",
									    "UE_RadioAccessCapability_va40ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.informationelements",
									    "UE_RadioAccessCapability_va40ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "ue-RadioAccessCapability-va40ext",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.informationelements",
								    "UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs$V890NCEs$V920NCEs$V970NCEs$Va40NCEs$NonCriticalExtensions"
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
						"rrc.informationelements",
						"UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs$V890NCEs$V920NCEs$V970NCEs"
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
								    "rrc.informationelements",
								    "UE_RadioAccessCapability_v970ext_IEs"
								),
								new QName (
								    "InformationElements",
								    "UE-RadioAccessCapability-v970ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.informationelements",
									"UE_RadioAccessCapability_v970ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.informationelements",
									"UE_RadioAccessCapability_v970ext_IEs"
								    )
								),
								0
							    )
							),
							"ue-RadioAccessCapability-v970ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.informationelements",
								"UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs$V890NCEs$V920NCEs$V970NCEs$Va40NCEs"
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
					 * Get the type descriptor (TypeInfo) of 'this' V970NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V970NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V970NCEs

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
					    "rrc.informationelements",
					    "UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs$V890NCEs$V920NCEs"
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
								"rrc.informationelements",
								"UE_RadioAccessCapability_v920ext_IEs"
							    ),
							    new QName (
								"InformationElements",
								"UE-RadioAccessCapability-v920ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.informationelements",
								    "UE_RadioAccessCapability_v920ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.informationelements",
								    "UE_RadioAccessCapability_v920ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "ue-RadioAccessCapability-v920ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.informationelements",
							    "UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs$V890NCEs$V920NCEs$V970NCEs"
							)
						    ),
						    "v970NCEs",
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
					"rrc.informationelements",
					"UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs$V890NCEs"
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
							    "rrc.informationelements",
							    "UE_RadioAccessCapability_v890ext_IEs"
							),
							new QName (
							    "InformationElements",
							    "UE-RadioAccessCapability-v890ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.informationelements",
								"UE_RadioAccessCapability_v890ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.informationelements",
								"UE_RadioAccessCapability_v890ext_IEs"
							    )
							),
							0
						    )
						),
						"ue-RadioAccessCapability-v890ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.informationelements",
							"UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs$V890NCEs$V920NCEs"
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
				 * Get the type descriptor (TypeInfo) of 'this' V890NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V890NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V890NCEs

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
				    "rrc.informationelements",
				    "UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs"
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
							"rrc.informationelements",
							"UE_RadioAccessCapability_v880ext_IEs"
						    ),
						    new QName (
							"InformationElements",
							"UE-RadioAccessCapability-v880ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.informationelements",
							    "UE_RadioAccessCapability_v880ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.informationelements",
							    "UE_RadioAccessCapability_v880ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "ue-RadioAccessCapability-v880ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs$V890NCEs"
						)
					    ),
					    "v890NCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' V880NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V880NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V880NCEs

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
				"rrc.informationelements",
				"UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs"
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
						    "rrc.informationelements",
						    "UE_RadioAccessCapability_v860ext_IEs"
						),
						new QName (
						    "InformationElements",
						    "UE-RadioAccessCapability-v860ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"UE_RadioAccessCapability_v860ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"UE_RadioAccessCapability_v860ext_IEs"
						    )
						),
						0
					    )
					),
					"ue-RadioAccessCapability-v860ext",
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
						    "InterRAT_UE_RadioAccessCapability_v860ext"
						),
						new QName (
						    "InformationElements",
						    "InterRAT-UE-RadioAccessCapability-v860ext"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"InterRAT_UE_RadioAccessCapability_v860ext"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"InterRAT_UE_RadioAccessCapability_v860ext"
						    )
						),
						0
					    )
					),
					"ue-RATSpecificCapability-v860ext",
					1,
					3,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.informationelements",
						"UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs$V880NCEs"
					    )
					),
					"v880NCEs",
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
			    "rrc.informationelements",
			    "UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs"
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
						"rrc.informationelements",
						"UE_RadioAccessCapability_v790ext_IEs"
					    ),
					    new QName (
						"InformationElements",
						"UE-RadioAccessCapability-v790ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "UE_RadioAccessCapability_v790ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "UE_RadioAccessCapability_v790ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "ue-RadioAccessCapability-v790ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs$V860NCEs"
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
		     * Get the type descriptor (TypeInfo) of 'this' V790NCEs object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V790NCEs object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V790NCEs

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
			"rrc.informationelements",
			"UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs"
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
					    "rrc.informationelements",
					    "UE_RadioAccessCapability_v770ext_IEs"
					),
					new QName (
					    "InformationElements",
					    "UE-RadioAccessCapability-v770ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"UE_RadioAccessCapability_v770ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"UE_RadioAccessCapability_v770ext_IEs"
					    )
					),
					0
				    )
				),
				"ue-RadioAccessCapability-v770ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs$V790NCEs"
				    )
				),
				"v790NCEs",
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
		    "rrc.informationelements",
		    "UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs"
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
					"rrc.informationelements",
					"UE_RadioAccessCapability_v6e0ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"UE-RadioAccessCapability-v6e0ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UE_RadioAccessCapability_v6e0ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "UE_RadioAccessCapability_v6e0ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "ue-RadioAccessCapability-v6e0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs$V770NCEs"
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_CapabilityContainer_IEs$V6b0NCEs"
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
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v6b0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "UE-RadioAccessCapability-v6b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UE_RadioAccessCapability_v6b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UE_RadioAccessCapability_v6b0ext_IEs"
				    )
				),
				0
			    )
			),
			"ue-RadioAccessCapability-v6b0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UE_CapabilityContainer_IEs$V6b0NCEs$V6e0NCEs"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "UE_CapabilityContainer_IEs"
	),
	new QName (
	    "InformationElements",
	    "UE-CapabilityContainer-IEs"
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
				"rrc.informationelements",
				"UE_RadioAccessCapability_v690ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapability-v690ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v690ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability_v690ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapability-v690ext",
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
				"InterRAT_UE_RadioAccessCapability_v690ext"
			    ),
			    new QName (
				"InformationElements",
				"InterRAT-UE-RadioAccessCapability-v690ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRAT_UE_RadioAccessCapability_v690ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterRAT_UE_RadioAccessCapability_v690ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RATSpecificCapability-v690ext",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_CapabilityContainer_IEs$V6b0NCEs"
			)
		    ),
		    "v6b0NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_CapabilityContainer_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_CapabilityContainer_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_CapabilityContainer_IEs
