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
 * Define the ASN1 Type SysInfoType3 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType3 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType3()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType3(BOOLEAN sib4indicator, CellIdentity cellIdentity, 
		    CellSelectReselectInfoSIB_3_4 cellSelectReselectInfo, 
		    CellAccessRestriction cellAccessRestriction, 
		    V4b0NCEs v4b0NCEs)
    {
	setSib4indicator(sib4indicator);
	setCellIdentity(cellIdentity);
	setCellSelectReselectInfo(cellSelectReselectInfo);
	setCellAccessRestriction(cellAccessRestriction);
	setV4b0NCEs(v4b0NCEs);
    }
    
    /**
     * Construct with components.
     */
    public SysInfoType3(boolean sib4indicator, CellIdentity cellIdentity, 
		    CellSelectReselectInfoSIB_3_4 cellSelectReselectInfo, 
		    CellAccessRestriction cellAccessRestriction, 
		    V4b0NCEs v4b0NCEs)
    {
	this(new BOOLEAN(sib4indicator), cellIdentity, 
	     cellSelectReselectInfo, cellAccessRestriction, v4b0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType3(boolean sib4indicator, CellIdentity cellIdentity, 
		    CellSelectReselectInfoSIB_3_4 cellSelectReselectInfo, 
		    CellAccessRestriction cellAccessRestriction)
    {
	setSib4indicator(sib4indicator);
	setCellIdentity(cellIdentity);
	setCellSelectReselectInfo(cellSelectReselectInfo);
	setCellAccessRestriction(cellAccessRestriction);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new CellIdentity();
	mComponents[2] = new CellSelectReselectInfoSIB_3_4();
	mComponents[3] = new CellAccessRestriction();
	mComponents[4] = new V4b0NCEs();
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
		return new BOOLEAN();
	    case 1:
		return new CellIdentity();
	    case 2:
		return new CellSelectReselectInfoSIB_3_4();
	    case 3:
		return new CellAccessRestriction();
	    case 4:
		return new V4b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sib4indicator"
    public boolean getSib4indicator()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setSib4indicator(boolean sib4indicator)
    {
	setSib4indicator(new BOOLEAN(sib4indicator));
    }
    
    public void setSib4indicator(BOOLEAN sib4indicator)
    {
	mComponents[0] = sib4indicator;
    }
    
    
    // Methods for field "cellIdentity"
    public CellIdentity getCellIdentity()
    {
	return (CellIdentity)mComponents[1];
    }
    
    public void setCellIdentity(CellIdentity cellIdentity)
    {
	mComponents[1] = cellIdentity;
    }
    
    
    // Methods for field "cellSelectReselectInfo"
    public CellSelectReselectInfoSIB_3_4 getCellSelectReselectInfo()
    {
	return (CellSelectReselectInfoSIB_3_4)mComponents[2];
    }
    
    public void setCellSelectReselectInfo(CellSelectReselectInfoSIB_3_4 cellSelectReselectInfo)
    {
	mComponents[2] = cellSelectReselectInfo;
    }
    
    
    // Methods for field "cellAccessRestriction"
    public CellAccessRestriction getCellAccessRestriction()
    {
	return (CellAccessRestriction)mComponents[3];
    }
    
    public void setCellAccessRestriction(CellAccessRestriction cellAccessRestriction)
    {
	mComponents[3] = cellAccessRestriction;
    }
    
    
    // Methods for field "v4b0NCEs"
    public V4b0NCEs getV4b0NCEs()
    {
	return (V4b0NCEs)mComponents[4];
    }
    
    public void setV4b0NCEs(V4b0NCEs v4b0NCEs)
    {
	mComponents[4] = v4b0NCEs;
    }
    
    public boolean hasV4b0NCEs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteV4b0NCEs()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type V4b0NCEs from ASN1 Module InformationElements.
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
	public V4b0NCEs(SysInfoType3_v4b0ext_IEs sysInfoType3_v4b0ext, 
			V590NCE v590NCE)
	{
	    setSysInfoType3_v4b0ext(sysInfoType3_v4b0ext);
	    setV590NCE(v590NCE);
	}
	
	/**
	 * Construct with required components.
	 */
	public V4b0NCEs(SysInfoType3_v4b0ext_IEs sysInfoType3_v4b0ext)
	{
	    setSysInfoType3_v4b0ext(sysInfoType3_v4b0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType3_v4b0ext_IEs();
	    mComponents[1] = new V590NCE();
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
		    return new SysInfoType3_v4b0ext_IEs();
		case 1:
		    return new V590NCE();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType3_v4b0ext"
	public SysInfoType3_v4b0ext_IEs getSysInfoType3_v4b0ext()
	{
	    return (SysInfoType3_v4b0ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType3_v4b0ext(SysInfoType3_v4b0ext_IEs sysInfoType3_v4b0ext)
	{
	    mComponents[0] = sysInfoType3_v4b0ext;
	}
	
	
	// Methods for field "v590NCE"
	public V590NCE getV590NCE()
	{
	    return (V590NCE)mComponents[1];
	}
	
	public void setV590NCE(V590NCE v590NCE)
	{
	    mComponents[1] = v590NCE;
	}
	
	public boolean hasV590NCE()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV590NCE()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V590NCE from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class V590NCE extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V590NCE()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V590NCE(SysInfoType3_v590ext sysInfoType3_v590ext, 
			    V5c0NoncriticalExtension v5c0NoncriticalExtension)
	    {
		setSysInfoType3_v590ext(sysInfoType3_v590ext);
		setV5c0NoncriticalExtension(v5c0NoncriticalExtension);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V590NCE(SysInfoType3_v590ext sysInfoType3_v590ext)
	    {
		setSysInfoType3_v590ext(sysInfoType3_v590ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType3_v590ext();
		mComponents[1] = new V5c0NoncriticalExtension();
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
			return new SysInfoType3_v590ext();
		    case 1:
			return new V5c0NoncriticalExtension();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType3_v590ext"
	    public SysInfoType3_v590ext getSysInfoType3_v590ext()
	    {
		return (SysInfoType3_v590ext)mComponents[0];
	    }
	    
	    public void setSysInfoType3_v590ext(SysInfoType3_v590ext sysInfoType3_v590ext)
	    {
		mComponents[0] = sysInfoType3_v590ext;
	    }
	    
	    
	    // Methods for field "v5c0NoncriticalExtension"
	    public V5c0NoncriticalExtension getV5c0NoncriticalExtension()
	    {
		return (V5c0NoncriticalExtension)mComponents[1];
	    }
	    
	    public void setV5c0NoncriticalExtension(V5c0NoncriticalExtension v5c0NoncriticalExtension)
	    {
		mComponents[1] = v5c0NoncriticalExtension;
	    }
	    
	    public boolean hasV5c0NoncriticalExtension()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV5c0NoncriticalExtension()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V5c0NoncriticalExtension from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class V5c0NoncriticalExtension extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V5c0NoncriticalExtension()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V5c0NoncriticalExtension(SysInfoType3_v5c0ext_IEs sysInfoType3_v5c0ext, 
				V670NCE v670NCE)
		{
		    setSysInfoType3_v5c0ext(sysInfoType3_v5c0ext);
		    setV670NCE(v670NCE);
		}
		
		/**
		 * Construct with required components.
		 */
		public V5c0NoncriticalExtension(SysInfoType3_v5c0ext_IEs sysInfoType3_v5c0ext)
		{
		    setSysInfoType3_v5c0ext(sysInfoType3_v5c0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SysInfoType3_v5c0ext_IEs();
		    mComponents[1] = new V670NCE();
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
			    return new SysInfoType3_v5c0ext_IEs();
			case 1:
			    return new V670NCE();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sysInfoType3_v5c0ext"
		public SysInfoType3_v5c0ext_IEs getSysInfoType3_v5c0ext()
		{
		    return (SysInfoType3_v5c0ext_IEs)mComponents[0];
		}
		
		public void setSysInfoType3_v5c0ext(SysInfoType3_v5c0ext_IEs sysInfoType3_v5c0ext)
		{
		    mComponents[0] = sysInfoType3_v5c0ext;
		}
		
		
		// Methods for field "v670NCE"
		public V670NCE getV670NCE()
		{
		    return (V670NCE)mComponents[1];
		}
		
		public void setV670NCE(V670NCE v670NCE)
		{
		    mComponents[1] = v670NCE;
		}
		
		public boolean hasV670NCE()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV670NCE()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V670NCE from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class V670NCE extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V670NCE()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V670NCE(SysInfoType3_v670ext sysInfoType3_v670ext, 
				    V770NCE v770NCE)
		    {
			setSysInfoType3_v670ext(sysInfoType3_v670ext);
			setV770NCE(v770NCE);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V670NCE(SysInfoType3_v670ext sysInfoType3_v670ext)
		    {
			setSysInfoType3_v670ext(sysInfoType3_v670ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new SysInfoType3_v670ext();
			mComponents[1] = new V770NCE();
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
				return new SysInfoType3_v670ext();
			    case 1:
				return new V770NCE();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "sysInfoType3_v670ext"
		    public SysInfoType3_v670ext getSysInfoType3_v670ext()
		    {
			return (SysInfoType3_v670ext)mComponents[0];
		    }
		    
		    public void setSysInfoType3_v670ext(SysInfoType3_v670ext sysInfoType3_v670ext)
		    {
			mComponents[0] = sysInfoType3_v670ext;
		    }
		    
		    
		    // Methods for field "v770NCE"
		    public V770NCE getV770NCE()
		    {
			return (V770NCE)mComponents[1];
		    }
		    
		    public void setV770NCE(V770NCE v770NCE)
		    {
			mComponents[1] = v770NCE;
		    }
		    
		    public boolean hasV770NCE()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV770NCE()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V770NCE from ASN1 Module InformationElements.
		     * @see Sequence
		     */
		    public static class V770NCE extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V770NCE()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V770NCE(SysInfoType3_v770ext_IEs sysInfoType3_v770ext, 
					V830NCE v830NCE)
			{
			    setSysInfoType3_v770ext(sysInfoType3_v770ext);
			    setV830NCE(v830NCE);
			}
			
			/**
			 * Construct with required components.
			 */
			public V770NCE(SysInfoType3_v770ext_IEs sysInfoType3_v770ext)
			{
			    setSysInfoType3_v770ext(sysInfoType3_v770ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new SysInfoType3_v770ext_IEs();
			    mComponents[1] = new V830NCE();
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
				    return new SysInfoType3_v770ext_IEs();
				case 1:
				    return new V830NCE();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "sysInfoType3_v770ext"
			public SysInfoType3_v770ext_IEs getSysInfoType3_v770ext()
			{
			    return (SysInfoType3_v770ext_IEs)mComponents[0];
			}
			
			public void setSysInfoType3_v770ext(SysInfoType3_v770ext_IEs sysInfoType3_v770ext)
			{
			    mComponents[0] = sysInfoType3_v770ext;
			}
			
			
			// Methods for field "v830NCE"
			public V830NCE getV830NCE()
			{
			    return (V830NCE)mComponents[1];
			}
			
			public void setV830NCE(V830NCE v830NCE)
			{
			    mComponents[1] = v830NCE;
			}
			
			public boolean hasV830NCE()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV830NCE()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V830NCE from ASN1 Module InformationElements.
			 * @see Sequence
			 */
			public static class V830NCE extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V830NCE()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V830NCE(SysInfoType3_v830ext_IEs sysInfoType3_v830ext, 
					    V860NCE v860NCE)
			    {
				setSysInfoType3_v830ext(sysInfoType3_v830ext);
				setV860NCE(v860NCE);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V830NCE(SysInfoType3_v830ext_IEs sysInfoType3_v830ext)
			    {
				setSysInfoType3_v830ext(sysInfoType3_v830ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new SysInfoType3_v830ext_IEs();
				mComponents[1] = new V860NCE();
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
					return new SysInfoType3_v830ext_IEs();
				    case 1:
					return new V860NCE();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "sysInfoType3_v830ext"
			    public SysInfoType3_v830ext_IEs getSysInfoType3_v830ext()
			    {
				return (SysInfoType3_v830ext_IEs)mComponents[0];
			    }
			    
			    public void setSysInfoType3_v830ext(SysInfoType3_v830ext_IEs sysInfoType3_v830ext)
			    {
				mComponents[0] = sysInfoType3_v830ext;
			    }
			    
			    
			    // Methods for field "v860NCE"
			    public V860NCE getV860NCE()
			    {
				return (V860NCE)mComponents[1];
			    }
			    
			    public void setV860NCE(V860NCE v860NCE)
			    {
				mComponents[1] = v860NCE;
			    }
			    
			    public boolean hasV860NCE()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV860NCE()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V860NCE from ASN1 Module InformationElements.
			     * @see Sequence
			     */
			    public static class V860NCE extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V860NCE()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V860NCE(SysInfoType3_v860ext_IEs sysInfoType3_v860ext, 
						V870NCE v870NCE)
				{
				    setSysInfoType3_v860ext(sysInfoType3_v860ext);
				    setV870NCE(v870NCE);
				}
				
				/**
				 * Construct with required components.
				 */
				public V860NCE(SysInfoType3_v860ext_IEs sysInfoType3_v860ext)
				{
				    setSysInfoType3_v860ext(sysInfoType3_v860ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new SysInfoType3_v860ext_IEs();
				    mComponents[1] = new V870NCE();
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
					    return new SysInfoType3_v860ext_IEs();
					case 1:
					    return new V870NCE();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "sysInfoType3_v860ext"
				public SysInfoType3_v860ext_IEs getSysInfoType3_v860ext()
				{
				    return (SysInfoType3_v860ext_IEs)mComponents[0];
				}
				
				public void setSysInfoType3_v860ext(SysInfoType3_v860ext_IEs sysInfoType3_v860ext)
				{
				    mComponents[0] = sysInfoType3_v860ext;
				}
				
				
				// Methods for field "v870NCE"
				public V870NCE getV870NCE()
				{
				    return (V870NCE)mComponents[1];
				}
				
				public void setV870NCE(V870NCE v870NCE)
				{
				    mComponents[1] = v870NCE;
				}
				
				public boolean hasV870NCE()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteV870NCE()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type V870NCE from ASN1 Module InformationElements.
				 * @see Sequence
				 */
				public static class V870NCE extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V870NCE()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V870NCE(SysInfoType3_v870ext_IEs sysInfoType3_v870ext, 
						    V900NCE v900NCE)
				    {
					setSysInfoType3_v870ext(sysInfoType3_v870ext);
					setV900NCE(v900NCE);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V870NCE(SysInfoType3_v870ext_IEs sysInfoType3_v870ext)
				    {
					setSysInfoType3_v870ext(sysInfoType3_v870ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new SysInfoType3_v870ext_IEs();
					mComponents[1] = new V900NCE();
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
						return new SysInfoType3_v870ext_IEs();
					    case 1:
						return new V900NCE();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "sysInfoType3_v870ext"
				    public SysInfoType3_v870ext_IEs getSysInfoType3_v870ext()
				    {
					return (SysInfoType3_v870ext_IEs)mComponents[0];
				    }
				    
				    public void setSysInfoType3_v870ext(SysInfoType3_v870ext_IEs sysInfoType3_v870ext)
				    {
					mComponents[0] = sysInfoType3_v870ext;
				    }
				    
				    
				    // Methods for field "v900NCE"
				    public V900NCE getV900NCE()
				    {
					return (V900NCE)mComponents[1];
				    }
				    
				    public void setV900NCE(V900NCE v900NCE)
				    {
					mComponents[1] = v900NCE;
				    }
				    
				    public boolean hasV900NCE()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV900NCE()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V900NCE from ASN1 Module InformationElements.
				     * @see Sequence
				     */
				    public static class V900NCE extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V900NCE()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V900NCE(SysInfoType3_v920ext_IEs sysInfoType3_v920ext, 
							NonCriticalExtensions nonCriticalExtensions)
					{
					    setSysInfoType3_v920ext(sysInfoType3_v920ext);
					    setNonCriticalExtensions(nonCriticalExtensions);
					}
					
					/**
					 * Construct with required components.
					 */
					public V900NCE(SysInfoType3_v920ext_IEs sysInfoType3_v920ext)
					{
					    setSysInfoType3_v920ext(sysInfoType3_v920ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new SysInfoType3_v920ext_IEs();
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
						    return new SysInfoType3_v920ext_IEs();
						case 1:
						    return new NonCriticalExtensions();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "sysInfoType3_v920ext"
					public SysInfoType3_v920ext_IEs getSysInfoType3_v920ext()
					{
					    return (SysInfoType3_v920ext_IEs)mComponents[0];
					}
					
					public void setSysInfoType3_v920ext(SysInfoType3_v920ext_IEs sysInfoType3_v920ext)
					{
					    mComponents[0] = sysInfoType3_v920ext;
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
						    "SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE$V830NCE$V860NCE$V870NCE$V900NCE$NonCriticalExtensions"
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
						"SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE$V830NCE$V860NCE$V870NCE$V900NCE"
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
								    "SysInfoType3_v920ext_IEs"
								),
								new QName (
								    "InformationElements",
								    "SysInfoType3-v920ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.informationelements",
									"SysInfoType3_v920ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.informationelements",
									"SysInfoType3_v920ext_IEs"
								    )
								),
								0
							    )
							),
							"sysInfoType3-v920ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.informationelements",
								"SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE$V830NCE$V860NCE$V870NCE$V900NCE$NonCriticalExtensions"
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
					 * Get the type descriptor (TypeInfo) of 'this' V900NCE object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V900NCE object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V900NCE

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
					    "SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE$V830NCE$V860NCE$V870NCE"
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
								"SysInfoType3_v870ext_IEs"
							    ),
							    new QName (
								"InformationElements",
								"SysInfoType3-v870ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.informationelements",
								    "SysInfoType3_v870ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.informationelements",
								    "SysInfoType3_v870ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "sysInfoType3-v870ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.informationelements",
							    "SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE$V830NCE$V860NCE$V870NCE$V900NCE"
							)
						    ),
						    "v900NCE",
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
				     * Get the type descriptor (TypeInfo) of 'this' V870NCE object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V870NCE object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V870NCE

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
					"SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE$V830NCE$V860NCE"
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
							    "SysInfoType3_v860ext_IEs"
							),
							new QName (
							    "InformationElements",
							    "SysInfoType3-v860ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.informationelements",
								"SysInfoType3_v860ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.informationelements",
								"SysInfoType3_v860ext_IEs"
							    )
							),
							0
						    )
						),
						"sysInfoType3-v860ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE$V830NCE$V860NCE$V870NCE"
						    )
						),
						"v870NCE",
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
				 * Get the type descriptor (TypeInfo) of 'this' V860NCE object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V860NCE object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V860NCE

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
				    "SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE$V830NCE"
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
							"SysInfoType3_v830ext_IEs"
						    ),
						    new QName (
							"InformationElements",
							"SysInfoType3-v830ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.informationelements",
							    "SysInfoType3_v830ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.informationelements",
							    "SysInfoType3_v830ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "sysInfoType3-v830ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE$V830NCE$V860NCE"
						)
					    ),
					    "v860NCE",
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
			     * Get the type descriptor (TypeInfo) of 'this' V830NCE object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V830NCE object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V830NCE

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
				"SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE"
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
						    "SysInfoType3_v770ext_IEs"
						),
						new QName (
						    "InformationElements",
						    "SysInfoType3-v770ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType3_v770ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType3_v770ext_IEs"
						    )
						),
						0
					    )
					),
					"sysInfoType3-v770ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE$V830NCE"
					    )
					),
					"v830NCE",
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
			 * Get the type descriptor (TypeInfo) of 'this' V770NCE object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V770NCE object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V770NCE

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
			    "SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE"
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
						"SysInfoType3_v670ext"
					    ),
					    new QName (
						"InformationElements",
						"SysInfoType3-v670ext"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType3_v670ext"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType3_v670ext"
						)
					    ),
					    0
					)
				    ),
				    "sysInfoType3-v670ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE$V770NCE"
					)
				    ),
				    "v770NCE",
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
		     * Get the type descriptor (TypeInfo) of 'this' V670NCE object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V670NCE object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V670NCE

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
			"SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension"
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
					    "SysInfoType3_v5c0ext_IEs"
					),
					new QName (
					    "InformationElements",
					    "SysInfoType3-v5c0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType3_v5c0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType3_v5c0ext_IEs"
					    )
					),
					0
				    )
				),
				"sysInfoType3-v5c0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension$V670NCE"
				    )
				),
				"v670NCE",
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
		 * Get the type descriptor (TypeInfo) of 'this' V5c0NoncriticalExtension object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V5c0NoncriticalExtension object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V5c0NoncriticalExtension

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
		    "SysInfoType3$V4b0NCEs$V590NCE"
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
					"SysInfoType3_v590ext"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType3-v590ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType3_v590ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType3_v590ext"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType3-v590ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType3$V4b0NCEs$V590NCE$V5c0NoncriticalExtension"
				)
			    ),
			    "v5c0NoncriticalExtension",
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
	     * Get the type descriptor (TypeInfo) of 'this' V590NCE object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V590NCE object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V590NCE

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
		"rrc.informationelements",
		"SysInfoType3$V4b0NCEs"
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
				    "SysInfoType3_v4b0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType3-v4b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType3_v4b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType3_v4b0ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType3-v4b0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType3$V4b0NCEs$V590NCE"
			    )
			),
			"v590NCE",
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SysInfoType3"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType3"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "sib4indicator",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CellIdentity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "cellIdentity",
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
				"CellSelectReselectInfoSIB_3_4"
			    ),
			    new QName (
				"InformationElements",
				"CellSelectReselectInfoSIB-3-4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellSelectReselectInfoSIB_3_4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellSelectReselectInfoSIB_3_4"
				)
			    ),
			    0
			)
		    ),
		    "cellSelectReselectInfo",
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
				"CellAccessRestriction"
			    ),
			    new QName (
				"InformationElements",
				"CellAccessRestriction"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellAccessRestriction"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellAccessRestriction"
				)
			    ),
			    0
			)
		    ),
		    "cellAccessRestriction",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType3$V4b0NCEs"
			)
		    ),
		    "v4b0NCEs",
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
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType3 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType3 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType3
