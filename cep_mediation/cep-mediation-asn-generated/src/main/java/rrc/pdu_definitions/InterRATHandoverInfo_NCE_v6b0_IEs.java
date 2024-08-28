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
 * Define the ASN1 Type InterRATHandoverInfo_NCE_v6b0_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfo_NCE_v6b0_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfo_NCE_v6b0_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfo_NCE_v6b0_IEs(InterRATHandoverInfo_v6b0ext_IEs interRATHandoverInfo_v6b0ext, 
		    V6e0NCEs v6e0NCEs)
    {
	setInterRATHandoverInfo_v6b0ext(interRATHandoverInfo_v6b0ext);
	setV6e0NCEs(v6e0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public InterRATHandoverInfo_NCE_v6b0_IEs(InterRATHandoverInfo_v6b0ext_IEs interRATHandoverInfo_v6b0ext)
    {
	setInterRATHandoverInfo_v6b0ext(interRATHandoverInfo_v6b0ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new InterRATHandoverInfo_v6b0ext_IEs();
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
		return new InterRATHandoverInfo_v6b0ext_IEs();
	    case 1:
		return new V6e0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interRATHandoverInfo_v6b0ext"
    public InterRATHandoverInfo_v6b0ext_IEs getInterRATHandoverInfo_v6b0ext()
    {
	return (InterRATHandoverInfo_v6b0ext_IEs)mComponents[0];
    }
    
    public void setInterRATHandoverInfo_v6b0ext(InterRATHandoverInfo_v6b0ext_IEs interRATHandoverInfo_v6b0ext)
    {
	mComponents[0] = interRATHandoverInfo_v6b0ext;
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
	public V6e0NCEs(InterRATHandoverInfo_v6e0ext_IEs interRATHandoverInfo_v6e0ext, 
			V770NCEs v770NCEs)
	{
	    setInterRATHandoverInfo_v6e0ext(interRATHandoverInfo_v6e0ext);
	    setV770NCEs(v770NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V6e0NCEs(InterRATHandoverInfo_v6e0ext_IEs interRATHandoverInfo_v6e0ext)
	{
	    setInterRATHandoverInfo_v6e0ext(interRATHandoverInfo_v6e0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new InterRATHandoverInfo_v6e0ext_IEs();
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
		    return new InterRATHandoverInfo_v6e0ext_IEs();
		case 1:
		    return new V770NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "interRATHandoverInfo_v6e0ext"
	public InterRATHandoverInfo_v6e0ext_IEs getInterRATHandoverInfo_v6e0ext()
	{
	    return (InterRATHandoverInfo_v6e0ext_IEs)mComponents[0];
	}
	
	public void setInterRATHandoverInfo_v6e0ext(InterRATHandoverInfo_v6e0ext_IEs interRATHandoverInfo_v6e0ext)
	{
	    mComponents[0] = interRATHandoverInfo_v6e0ext;
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
	    public V770NCEs(InterRATHandoverInfo_v770ext_IEs interRATHandoverInfo_v770ext, 
			    V790nonCriticalExtensions v790nonCriticalExtensions)
	    {
		setInterRATHandoverInfo_v770ext(interRATHandoverInfo_v770ext);
		setV790nonCriticalExtensions(v790nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V770NCEs(InterRATHandoverInfo_v770ext_IEs interRATHandoverInfo_v770ext)
	    {
		setInterRATHandoverInfo_v770ext(interRATHandoverInfo_v770ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new InterRATHandoverInfo_v770ext_IEs();
		mComponents[1] = new V790nonCriticalExtensions();
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
			return new InterRATHandoverInfo_v770ext_IEs();
		    case 1:
			return new V790nonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "interRATHandoverInfo_v770ext"
	    public InterRATHandoverInfo_v770ext_IEs getInterRATHandoverInfo_v770ext()
	    {
		return (InterRATHandoverInfo_v770ext_IEs)mComponents[0];
	    }
	    
	    public void setInterRATHandoverInfo_v770ext(InterRATHandoverInfo_v770ext_IEs interRATHandoverInfo_v770ext)
	    {
		mComponents[0] = interRATHandoverInfo_v770ext;
	    }
	    
	    
	    // Methods for field "v790nonCriticalExtensions"
	    public V790nonCriticalExtensions getV790nonCriticalExtensions()
	    {
		return (V790nonCriticalExtensions)mComponents[1];
	    }
	    
	    public void setV790nonCriticalExtensions(V790nonCriticalExtensions v790nonCriticalExtensions)
	    {
		mComponents[1] = v790nonCriticalExtensions;
	    }
	    
	    public boolean hasV790nonCriticalExtensions()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV790nonCriticalExtensions()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V790nonCriticalExtensions from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class V790nonCriticalExtensions extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V790nonCriticalExtensions()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V790nonCriticalExtensions(InterRATHandoverInfo_v790ext_IEs interRATHandoverInfo_v790ext, 
				V860NCEs v860NCEs)
		{
		    setInterRATHandoverInfo_v790ext(interRATHandoverInfo_v790ext);
		    setV860NCEs(v860NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V790nonCriticalExtensions(InterRATHandoverInfo_v790ext_IEs interRATHandoverInfo_v790ext)
		{
		    setInterRATHandoverInfo_v790ext(interRATHandoverInfo_v790ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new InterRATHandoverInfo_v790ext_IEs();
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
			    return new InterRATHandoverInfo_v790ext_IEs();
			case 1:
			    return new V860NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "interRATHandoverInfo_v790ext"
		public InterRATHandoverInfo_v790ext_IEs getInterRATHandoverInfo_v790ext()
		{
		    return (InterRATHandoverInfo_v790ext_IEs)mComponents[0];
		}
		
		public void setInterRATHandoverInfo_v790ext(InterRATHandoverInfo_v790ext_IEs interRATHandoverInfo_v790ext)
		{
		    mComponents[0] = interRATHandoverInfo_v790ext;
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
		    public V860NCEs(InterRATHandoverInfo_v860ext_IEs interRATHandoverInfo_v860ext, 
				    V880NCEs v880NCEs)
		    {
			setInterRATHandoverInfo_v860ext(interRATHandoverInfo_v860ext);
			setV880NCEs(v880NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V860NCEs(InterRATHandoverInfo_v860ext_IEs interRATHandoverInfo_v860ext)
		    {
			setInterRATHandoverInfo_v860ext(interRATHandoverInfo_v860ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new InterRATHandoverInfo_v860ext_IEs();
			mComponents[1] = new V880NCEs();
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
				return new InterRATHandoverInfo_v860ext_IEs();
			    case 1:
				return new V880NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "interRATHandoverInfo_v860ext"
		    public InterRATHandoverInfo_v860ext_IEs getInterRATHandoverInfo_v860ext()
		    {
			return (InterRATHandoverInfo_v860ext_IEs)mComponents[0];
		    }
		    
		    public void setInterRATHandoverInfo_v860ext(InterRATHandoverInfo_v860ext_IEs interRATHandoverInfo_v860ext)
		    {
			mComponents[0] = interRATHandoverInfo_v860ext;
		    }
		    
		    
		    // Methods for field "v880NCEs"
		    public V880NCEs getV880NCEs()
		    {
			return (V880NCEs)mComponents[1];
		    }
		    
		    public void setV880NCEs(V880NCEs v880NCEs)
		    {
			mComponents[1] = v880NCEs;
		    }
		    
		    public boolean hasV880NCEs()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV880NCEs()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V880NCEs from ASN1 Module PDU_definitions.
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
			public V880NCEs(InterRATHandoverInfo_v880ext_IEs interRATHandoverInfo_v880ext, 
					V920NCEs v920NCEs)
			{
			    setInterRATHandoverInfo_v880ext(interRATHandoverInfo_v880ext);
			    setV920NCEs(v920NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V880NCEs(InterRATHandoverInfo_v880ext_IEs interRATHandoverInfo_v880ext)
			{
			    setInterRATHandoverInfo_v880ext(interRATHandoverInfo_v880ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new InterRATHandoverInfo_v880ext_IEs();
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
				    return new InterRATHandoverInfo_v880ext_IEs();
				case 1:
				    return new V920NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "interRATHandoverInfo_v880ext"
			public InterRATHandoverInfo_v880ext_IEs getInterRATHandoverInfo_v880ext()
			{
			    return (InterRATHandoverInfo_v880ext_IEs)mComponents[0];
			}
			
			public void setInterRATHandoverInfo_v880ext(InterRATHandoverInfo_v880ext_IEs interRATHandoverInfo_v880ext)
			{
			    mComponents[0] = interRATHandoverInfo_v880ext;
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
			    public V920NCEs(InterRATHandoverInfo_v920ext_IEs interRATHandoverInfo_v920ext, 
					    V8b0NCEs v8b0NCEs)
			    {
				setInterRATHandoverInfo_v920ext(interRATHandoverInfo_v920ext);
				setV8b0NCEs(v8b0NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V920NCEs(InterRATHandoverInfo_v920ext_IEs interRATHandoverInfo_v920ext)
			    {
				setInterRATHandoverInfo_v920ext(interRATHandoverInfo_v920ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new InterRATHandoverInfo_v920ext_IEs();
				mComponents[1] = new V8b0NCEs();
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
					return new InterRATHandoverInfo_v920ext_IEs();
				    case 1:
					return new V8b0NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "interRATHandoverInfo_v920ext"
			    public InterRATHandoverInfo_v920ext_IEs getInterRATHandoverInfo_v920ext()
			    {
				return (InterRATHandoverInfo_v920ext_IEs)mComponents[0];
			    }
			    
			    public void setInterRATHandoverInfo_v920ext(InterRATHandoverInfo_v920ext_IEs interRATHandoverInfo_v920ext)
			    {
				mComponents[0] = interRATHandoverInfo_v920ext;
			    }
			    
			    
			    // Methods for field "v8b0NCEs"
			    public V8b0NCEs getV8b0NCEs()
			    {
				return (V8b0NCEs)mComponents[1];
			    }
			    
			    public void setV8b0NCEs(V8b0NCEs v8b0NCEs)
			    {
				mComponents[1] = v8b0NCEs;
			    }
			    
			    public boolean hasV8b0NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV8b0NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V8b0NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V8b0NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V8b0NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V8b0NCEs(InterRATHandoverInfo_v8b0ext_IEs interRATHandoverInfo_v8b0ext, 
						V950NCEs v950NCEs)
				{
				    setInterRATHandoverInfo_v8b0ext(interRATHandoverInfo_v8b0ext);
				    setV950NCEs(v950NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V8b0NCEs(InterRATHandoverInfo_v8b0ext_IEs interRATHandoverInfo_v8b0ext)
				{
				    setInterRATHandoverInfo_v8b0ext(interRATHandoverInfo_v8b0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new InterRATHandoverInfo_v8b0ext_IEs();
				    mComponents[1] = new V950NCEs();
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
					    return new InterRATHandoverInfo_v8b0ext_IEs();
					case 1:
					    return new V950NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "interRATHandoverInfo_v8b0ext"
				public InterRATHandoverInfo_v8b0ext_IEs getInterRATHandoverInfo_v8b0ext()
				{
				    return (InterRATHandoverInfo_v8b0ext_IEs)mComponents[0];
				}
				
				public void setInterRATHandoverInfo_v8b0ext(InterRATHandoverInfo_v8b0ext_IEs interRATHandoverInfo_v8b0ext)
				{
				    mComponents[0] = interRATHandoverInfo_v8b0ext;
				}
				
				
				// Methods for field "v950NCEs"
				public V950NCEs getV950NCEs()
				{
				    return (V950NCEs)mComponents[1];
				}
				
				public void setV950NCEs(V950NCEs v950NCEs)
				{
				    mComponents[1] = v950NCEs;
				}
				
				public boolean hasV950NCEs()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteV950NCEs()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type V950NCEs from ASN1 Module PDU_definitions.
				 * @see Sequence
				 */
				public static class V950NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V950NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V950NCEs(InterRATHandoverInfo_v950ext_IEs interRATHandoverInfo_v950ext, 
						    Va40NCEs va40NCEs)
				    {
					setInterRATHandoverInfo_v950ext(interRATHandoverInfo_v950ext);
					setVa40NCEs(va40NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V950NCEs(InterRATHandoverInfo_v950ext_IEs interRATHandoverInfo_v950ext)
				    {
					setInterRATHandoverInfo_v950ext(interRATHandoverInfo_v950ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new InterRATHandoverInfo_v950ext_IEs();
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
						return new InterRATHandoverInfo_v950ext_IEs();
					    case 1:
						return new Va40NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "interRATHandoverInfo_v950ext"
				    public InterRATHandoverInfo_v950ext_IEs getInterRATHandoverInfo_v950ext()
				    {
					return (InterRATHandoverInfo_v950ext_IEs)mComponents[0];
				    }
				    
				    public void setInterRATHandoverInfo_v950ext(InterRATHandoverInfo_v950ext_IEs interRATHandoverInfo_v950ext)
				    {
					mComponents[0] = interRATHandoverInfo_v950ext;
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
					public Va40NCEs(InterRATHandoverInfo_va40ext_IEs interRATHandoverInfo_va40ext, 
							NonCriticalExtensions nonCriticalExtensions)
					{
					    setInterRATHandoverInfo_va40ext(interRATHandoverInfo_va40ext);
					    setNonCriticalExtensions(nonCriticalExtensions);
					}
					
					/**
					 * Construct with required components.
					 */
					public Va40NCEs(InterRATHandoverInfo_va40ext_IEs interRATHandoverInfo_va40ext)
					{
					    setInterRATHandoverInfo_va40ext(interRATHandoverInfo_va40ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new InterRATHandoverInfo_va40ext_IEs();
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
						    return new InterRATHandoverInfo_va40ext_IEs();
						case 1:
						    return new NonCriticalExtensions();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "interRATHandoverInfo_va40ext"
					public InterRATHandoverInfo_va40ext_IEs getInterRATHandoverInfo_va40ext()
					{
					    return (InterRATHandoverInfo_va40ext_IEs)mComponents[0];
					}
					
					public void setInterRATHandoverInfo_va40ext(InterRATHandoverInfo_va40ext_IEs interRATHandoverInfo_va40ext)
					{
					    mComponents[0] = interRATHandoverInfo_va40ext;
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
						    "InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs$V920NCEs$V8b0NCEs$V950NCEs$Va40NCEs$NonCriticalExtensions"
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
						"InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs$V920NCEs$V8b0NCEs$V950NCEs$Va40NCEs"
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
								    "InterRATHandoverInfo_va40ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "InterRATHandoverInfo-va40ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"InterRATHandoverInfo_va40ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"InterRATHandoverInfo_va40ext_IEs"
								    )
								),
								0
							    )
							),
							"interRATHandoverInfo-va40ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs$V920NCEs$V8b0NCEs$V950NCEs$Va40NCEs$NonCriticalExtensions"
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
					    "InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs$V920NCEs$V8b0NCEs$V950NCEs"
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
								"InterRATHandoverInfo_v950ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"InterRATHandoverInfo-v950ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "InterRATHandoverInfo_v950ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "InterRATHandoverInfo_v950ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "interRATHandoverInfo-v950ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs$V920NCEs$V8b0NCEs$V950NCEs$Va40NCEs"
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
				     * Get the type descriptor (TypeInfo) of 'this' V950NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V950NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V950NCEs

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
					"InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs$V920NCEs$V8b0NCEs"
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
							    "InterRATHandoverInfo_v8b0ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "InterRATHandoverInfo-v8b0ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"InterRATHandoverInfo_v8b0ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"InterRATHandoverInfo_v8b0ext_IEs"
							    )
							),
							0
						    )
						),
						"interRATHandoverInfo-v8b0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs$V920NCEs$V8b0NCEs$V950NCEs"
						    )
						),
						"v950NCEs",
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
				 * Get the type descriptor (TypeInfo) of 'this' V8b0NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V8b0NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V8b0NCEs

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
				    "InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs$V920NCEs"
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
							"InterRATHandoverInfo_v920ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"InterRATHandoverInfo-v920ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "InterRATHandoverInfo_v920ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "InterRATHandoverInfo_v920ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "interRATHandoverInfo-v920ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs$V920NCEs$V8b0NCEs"
						)
					    ),
					    "v8b0NCEs",
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
				"InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs"
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
						    "InterRATHandoverInfo_v880ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "InterRATHandoverInfo-v880ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"InterRATHandoverInfo_v880ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"InterRATHandoverInfo_v880ext_IEs"
						    )
						),
						0
					    )
					),
					"interRATHandoverInfo-v880ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs$V920NCEs"
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
			    "rrc.pdu_definitions",
			    "InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs"
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
						"InterRATHandoverInfo_v860ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"InterRATHandoverInfo-v860ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "InterRATHandoverInfo_v860ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "InterRATHandoverInfo_v860ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "interRATHandoverInfo-v860ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs$V880NCEs"
					)
				    ),
				    "v880NCEs",
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
			"InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions"
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
					    "InterRATHandoverInfo_v790ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "InterRATHandoverInfo-v790ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"InterRATHandoverInfo_v790ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"InterRATHandoverInfo_v790ext_IEs"
					    )
					),
					0
				    )
				),
				"interRATHandoverInfo-v790ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions$V860NCEs"
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
		 * Get the type descriptor (TypeInfo) of 'this' V790nonCriticalExtensions object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V790nonCriticalExtensions object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V790nonCriticalExtensions

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
		    "InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs"
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
					"InterRATHandoverInfo_v770ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"InterRATHandoverInfo-v770ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "InterRATHandoverInfo_v770ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "InterRATHandoverInfo_v770ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "interRATHandoverInfo-v770ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs$V790nonCriticalExtensions"
				)
			    ),
			    "v790nonCriticalExtensions",
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
		"InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs"
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
				    "InterRATHandoverInfo_v6e0ext_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "InterRATHandoverInfo-v6e0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"InterRATHandoverInfo_v6e0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"InterRATHandoverInfo_v6e0ext_IEs"
				    )
				),
				0
			    )
			),
			"interRATHandoverInfo-v6e0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs$V770NCEs"
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
		0x0010
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
				"InterRATHandoverInfo_v6b0ext_IEs"
			    ),
			    new QName (
				"PDU-definitions",
				"InterRATHandoverInfo-v6b0ext-IEs"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InterRATHandoverInfo_v6b0ext_IEs"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InterRATHandoverInfo_v6b0ext_IEs"
				)
			    ),
			    0
			)
		    ),
		    "interRATHandoverInfo-v6b0ext",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "InterRATHandoverInfo_NCE_v6b0_IEs$V6e0NCEs"
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_NCE_v6b0_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_NCE_v6b0_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfo_NCE_v6b0_IEs
