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
 * Define the ASN1 Type SysInfoType11 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType11 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType11()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType11(BOOLEAN sib12indicator, 
		    FACH_MeasurementOccasionInfo fach_MeasurementOccasionInfo, 
		    MeasurementControlSysInfo measurementControlSysInfo, 
		    V4b0NCEs v4b0NCEs)
    {
	setSib12indicator(sib12indicator);
	setFach_MeasurementOccasionInfo(fach_MeasurementOccasionInfo);
	setMeasurementControlSysInfo(measurementControlSysInfo);
	setV4b0NCEs(v4b0NCEs);
    }
    
    /**
     * Construct with components.
     */
    public SysInfoType11(boolean sib12indicator, 
		    FACH_MeasurementOccasionInfo fach_MeasurementOccasionInfo, 
		    MeasurementControlSysInfo measurementControlSysInfo, 
		    V4b0NCEs v4b0NCEs)
    {
	this(new BOOLEAN(sib12indicator), fach_MeasurementOccasionInfo, 
	     measurementControlSysInfo, v4b0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType11(boolean sib12indicator, 
		    MeasurementControlSysInfo measurementControlSysInfo)
    {
	setSib12indicator(sib12indicator);
	setMeasurementControlSysInfo(measurementControlSysInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new FACH_MeasurementOccasionInfo();
	mComponents[2] = new MeasurementControlSysInfo();
	mComponents[3] = new V4b0NCEs();
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
		return new BOOLEAN();
	    case 1:
		return new FACH_MeasurementOccasionInfo();
	    case 2:
		return new MeasurementControlSysInfo();
	    case 3:
		return new V4b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sib12indicator"
    public boolean getSib12indicator()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setSib12indicator(boolean sib12indicator)
    {
	setSib12indicator(new BOOLEAN(sib12indicator));
    }
    
    public void setSib12indicator(BOOLEAN sib12indicator)
    {
	mComponents[0] = sib12indicator;
    }
    
    
    // Methods for field "fach_MeasurementOccasionInfo"
    public FACH_MeasurementOccasionInfo getFach_MeasurementOccasionInfo()
    {
	return (FACH_MeasurementOccasionInfo)mComponents[1];
    }
    
    public void setFach_MeasurementOccasionInfo(FACH_MeasurementOccasionInfo fach_MeasurementOccasionInfo)
    {
	mComponents[1] = fach_MeasurementOccasionInfo;
    }
    
    public boolean hasFach_MeasurementOccasionInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteFach_MeasurementOccasionInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "measurementControlSysInfo"
    public MeasurementControlSysInfo getMeasurementControlSysInfo()
    {
	return (MeasurementControlSysInfo)mComponents[2];
    }
    
    public void setMeasurementControlSysInfo(MeasurementControlSysInfo measurementControlSysInfo)
    {
	mComponents[2] = measurementControlSysInfo;
    }
    
    
    // Methods for field "v4b0NCEs"
    public V4b0NCEs getV4b0NCEs()
    {
	return (V4b0NCEs)mComponents[3];
    }
    
    public void setV4b0NCEs(V4b0NCEs v4b0NCEs)
    {
	mComponents[3] = v4b0NCEs;
    }
    
    public boolean hasV4b0NCEs()
    {
	return componentIsPresent(3);
    }
    
    public void deleteV4b0NCEs()
    {
	setComponentAbsent(3);
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
	public V4b0NCEs(SysInfoType11_v4b0ext_IEs sysInfoType11_v4b0ext, 
			V590NCE v590NCE)
	{
	    setSysInfoType11_v4b0ext(sysInfoType11_v4b0ext);
	    setV590NCE(v590NCE);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType11_v4b0ext_IEs();
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
		    return new SysInfoType11_v4b0ext_IEs();
		case 1:
		    return new V590NCE();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType11_v4b0ext"
	public SysInfoType11_v4b0ext_IEs getSysInfoType11_v4b0ext()
	{
	    return (SysInfoType11_v4b0ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType11_v4b0ext(SysInfoType11_v4b0ext_IEs sysInfoType11_v4b0ext)
	{
	    mComponents[0] = sysInfoType11_v4b0ext;
	}
	
	public boolean hasSysInfoType11_v4b0ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteSysInfoType11_v4b0ext()
	{
	    setComponentAbsent(0);
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
	    public V590NCE(SysInfoType11_v590ext_IEs sysInfoType11_v590ext, 
			    V690NCEs v690NCEs)
	    {
		setSysInfoType11_v590ext(sysInfoType11_v590ext);
		setV690NCEs(v690NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V590NCE(SysInfoType11_v590ext_IEs sysInfoType11_v590ext)
	    {
		setSysInfoType11_v590ext(sysInfoType11_v590ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType11_v590ext_IEs();
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
			return new SysInfoType11_v590ext_IEs();
		    case 1:
			return new V690NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType11_v590ext"
	    public SysInfoType11_v590ext_IEs getSysInfoType11_v590ext()
	    {
		return (SysInfoType11_v590ext_IEs)mComponents[0];
	    }
	    
	    public void setSysInfoType11_v590ext(SysInfoType11_v590ext_IEs sysInfoType11_v590ext)
	    {
		mComponents[0] = sysInfoType11_v590ext;
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
	     * Define the ASN1 Type V690NCEs from ASN1 Module InformationElements.
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
		public V690NCEs(SysInfoType11_v690ext_IEs sysInfoType11_v690ext, 
				V6b0NCEs v6b0NCEs)
		{
		    setSysInfoType11_v690ext(sysInfoType11_v690ext);
		    setV6b0NCEs(v6b0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V690NCEs(SysInfoType11_v690ext_IEs sysInfoType11_v690ext)
		{
		    setSysInfoType11_v690ext(sysInfoType11_v690ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SysInfoType11_v690ext_IEs();
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
			    return new SysInfoType11_v690ext_IEs();
			case 1:
			    return new V6b0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sysInfoType11_v690ext"
		public SysInfoType11_v690ext_IEs getSysInfoType11_v690ext()
		{
		    return (SysInfoType11_v690ext_IEs)mComponents[0];
		}
		
		public void setSysInfoType11_v690ext(SysInfoType11_v690ext_IEs sysInfoType11_v690ext)
		{
		    mComponents[0] = sysInfoType11_v690ext;
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
		    public V6b0NCEs(SysInfoType11_v6b0ext_IEs sysInfoType11_v6b0ext, 
				    V770NCEs v770NCEs)
		    {
			setSysInfoType11_v6b0ext(sysInfoType11_v6b0ext);
			setV770NCEs(v770NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V6b0NCEs(SysInfoType11_v6b0ext_IEs sysInfoType11_v6b0ext)
		    {
			setSysInfoType11_v6b0ext(sysInfoType11_v6b0ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new SysInfoType11_v6b0ext_IEs();
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
				return new SysInfoType11_v6b0ext_IEs();
			    case 1:
				return new V770NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "sysInfoType11_v6b0ext"
		    public SysInfoType11_v6b0ext_IEs getSysInfoType11_v6b0ext()
		    {
			return (SysInfoType11_v6b0ext_IEs)mComponents[0];
		    }
		    
		    public void setSysInfoType11_v6b0ext(SysInfoType11_v6b0ext_IEs sysInfoType11_v6b0ext)
		    {
			mComponents[0] = sysInfoType11_v6b0ext;
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
			public V770NCEs(SysInfoType11_v770ext_IEs sysInfoType11_v770ext, 
					V7b0NCEs v7b0NCEs)
			{
			    setSysInfoType11_v770ext(sysInfoType11_v770ext);
			    setV7b0NCEs(v7b0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V770NCEs(SysInfoType11_v770ext_IEs sysInfoType11_v770ext)
			{
			    setSysInfoType11_v770ext(sysInfoType11_v770ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new SysInfoType11_v770ext_IEs();
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
				    return new SysInfoType11_v770ext_IEs();
				case 1:
				    return new V7b0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "sysInfoType11_v770ext"
			public SysInfoType11_v770ext_IEs getSysInfoType11_v770ext()
			{
			    return (SysInfoType11_v770ext_IEs)mComponents[0];
			}
			
			public void setSysInfoType11_v770ext(SysInfoType11_v770ext_IEs sysInfoType11_v770ext)
			{
			    mComponents[0] = sysInfoType11_v770ext;
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
			 * Define the ASN1 Type V7b0NCEs from ASN1 Module InformationElements.
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
			    public V7b0NCEs(SysInfoType11_v7b0ext_IEs sysInfoType11_v7b0ext, 
					    V860NCEs v860NCEs)
			    {
				setSysInfoType11_v7b0ext(sysInfoType11_v7b0ext);
				setV860NCEs(v860NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V7b0NCEs(SysInfoType11_v7b0ext_IEs sysInfoType11_v7b0ext)
			    {
				setSysInfoType11_v7b0ext(sysInfoType11_v7b0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new SysInfoType11_v7b0ext_IEs();
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
					return new SysInfoType11_v7b0ext_IEs();
				    case 1:
					return new V860NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "sysInfoType11_v7b0ext"
			    public SysInfoType11_v7b0ext_IEs getSysInfoType11_v7b0ext()
			    {
				return (SysInfoType11_v7b0ext_IEs)mComponents[0];
			    }
			    
			    public void setSysInfoType11_v7b0ext(SysInfoType11_v7b0ext_IEs sysInfoType11_v7b0ext)
			    {
				mComponents[0] = sysInfoType11_v7b0ext;
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
				public V860NCEs(SysInfoType11_v860ext_IEs sysInfoType11_v860ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setSysInfoType11_v860ext(sysInfoType11_v860ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V860NCEs(SysInfoType11_v860ext_IEs sysInfoType11_v860ext)
				{
				    setSysInfoType11_v860ext(sysInfoType11_v860ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new SysInfoType11_v860ext_IEs();
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
					    return new SysInfoType11_v860ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "sysInfoType11_v860ext"
				public SysInfoType11_v860ext_IEs getSysInfoType11_v860ext()
				{
				    return (SysInfoType11_v860ext_IEs)mComponents[0];
				}
				
				public void setSysInfoType11_v860ext(SysInfoType11_v860ext_IEs sysInfoType11_v860ext)
				{
				    mComponents[0] = sysInfoType11_v860ext;
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
					    "SysInfoType11$V4b0NCEs$V590NCE$V690NCEs$V6b0NCEs$V770NCEs$V7b0NCEs$V860NCEs$NonCriticalExtensions"
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
					"SysInfoType11$V4b0NCEs$V590NCE$V690NCEs$V6b0NCEs$V770NCEs$V7b0NCEs$V860NCEs"
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
							    "SysInfoType11_v860ext_IEs"
							),
							new QName (
							    "InformationElements",
							    "SysInfoType11-v860ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.informationelements",
								"SysInfoType11_v860ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.informationelements",
								"SysInfoType11_v860ext_IEs"
							    )
							),
							0
						    )
						),
						"sysInfoType11-v860ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType11$V4b0NCEs$V590NCE$V690NCEs$V6b0NCEs$V770NCEs$V7b0NCEs$V860NCEs$NonCriticalExtensions"
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
				    "rrc.informationelements",
				    "SysInfoType11$V4b0NCEs$V590NCE$V690NCEs$V6b0NCEs$V770NCEs$V7b0NCEs"
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
							"SysInfoType11_v7b0ext_IEs"
						    ),
						    new QName (
							"InformationElements",
							"SysInfoType11-v7b0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.informationelements",
							    "SysInfoType11_v7b0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.informationelements",
							    "SysInfoType11_v7b0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "sysInfoType11-v7b0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType11$V4b0NCEs$V590NCE$V690NCEs$V6b0NCEs$V770NCEs$V7b0NCEs$V860NCEs"
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
				"rrc.informationelements",
				"SysInfoType11$V4b0NCEs$V590NCE$V690NCEs$V6b0NCEs$V770NCEs"
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
						    "SysInfoType11_v770ext_IEs"
						),
						new QName (
						    "InformationElements",
						    "SysInfoType11-v770ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType11_v770ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"SysInfoType11_v770ext_IEs"
						    )
						),
						0
					    )
					),
					"sysInfoType11-v770ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType11$V4b0NCEs$V590NCE$V690NCEs$V6b0NCEs$V770NCEs$V7b0NCEs"
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
			    "rrc.informationelements",
			    "SysInfoType11$V4b0NCEs$V590NCE$V690NCEs$V6b0NCEs"
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
						"SysInfoType11_v6b0ext_IEs"
					    ),
					    new QName (
						"InformationElements",
						"SysInfoType11-v6b0ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType11_v6b0ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType11_v6b0ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "sysInfoType11-v6b0ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType11$V4b0NCEs$V590NCE$V690NCEs$V6b0NCEs$V770NCEs"
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"SysInfoType11$V4b0NCEs$V590NCE$V690NCEs"
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
					    "SysInfoType11_v690ext_IEs"
					),
					new QName (
					    "InformationElements",
					    "SysInfoType11-v690ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType11_v690ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType11_v690ext_IEs"
					    )
					),
					0
				    )
				),
				"sysInfoType11-v690ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType11$V4b0NCEs$V590NCE$V690NCEs$V6b0NCEs"
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
		    "rrc.informationelements",
		    "SysInfoType11$V4b0NCEs$V590NCE"
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
					"SysInfoType11_v590ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType11-v590ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType11_v590ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType11_v590ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType11-v590ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType11$V4b0NCEs$V590NCE$V690NCEs"
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType11$V4b0NCEs"
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
				    "SysInfoType11_v4b0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType11-v4b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType11_v4b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType11_v4b0ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType11-v4b0ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType11$V4b0NCEs$V590NCE"
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
	    "SysInfoType11"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType11"
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
		    "sib12indicator",
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
				"FACH_MeasurementOccasionInfo"
			    ),
			    new QName (
				"InformationElements",
				"FACH-MeasurementOccasionInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FACH_MeasurementOccasionInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FACH_MeasurementOccasionInfo"
				)
			    ),
			    0
			)
		    ),
		    "fach-MeasurementOccasionInfo",
		    1,
		    3,
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
				"MeasurementControlSysInfo"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementControlSysInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementControlSysInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementControlSysInfo"
				)
			    ),
			    0
			)
		    ),
		    "measurementControlSysInfo",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType11$V4b0NCEs"
			)
		    ),
		    "v4b0NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType11 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType11 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType11
