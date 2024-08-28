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
 * Define the ASN1 Type AssistanceDataDelivery from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class AssistanceDataDelivery extends Choice {
    
    /**
     * The default constructor.
     */
    public AssistanceDataDelivery()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static AssistanceDataDelivery createAssistanceDataDeliveryWithR3(R3 r3)
    {
	AssistanceDataDelivery __object = new AssistanceDataDelivery();

	__object.setR3(r3);
	return __object;
    }
    
    public boolean hasR3()
    {
	return getChosenFlag() == r3_chosen;
    }
    
    public void setR3(R3 r3)
    {
	setChosenValue(r3);
	setChosenFlag(r3_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type R3 from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class R3 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public R3()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public R3(AssistanceDataDelivery_r3_IEs assistanceDataDelivery_r3, 
			V3a0NCEs v3a0NCEs)
	{
	    setAssistanceDataDelivery_r3(assistanceDataDelivery_r3);
	    setV3a0NCEs(v3a0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(AssistanceDataDelivery_r3_IEs assistanceDataDelivery_r3)
	{
	    setAssistanceDataDelivery_r3(assistanceDataDelivery_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new AssistanceDataDelivery_r3_IEs();
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
		    return new AssistanceDataDelivery_r3_IEs();
		case 1:
		    return new V3a0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "assistanceDataDelivery_r3"
	public AssistanceDataDelivery_r3_IEs getAssistanceDataDelivery_r3()
	{
	    return (AssistanceDataDelivery_r3_IEs)mComponents[0];
	}
	
	public void setAssistanceDataDelivery_r3(AssistanceDataDelivery_r3_IEs assistanceDataDelivery_r3)
	{
	    mComponents[0] = assistanceDataDelivery_r3;
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
	    public V3a0NCEs(AssistanceDataDelivery_v3a0ext assistanceDataDelivery_v3a0ext, 
			    LaterNCEs laterNCEs)
	    {
		setAssistanceDataDelivery_v3a0ext(assistanceDataDelivery_v3a0ext);
		setLaterNCEs(laterNCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V3a0NCEs(AssistanceDataDelivery_v3a0ext assistanceDataDelivery_v3a0ext)
	    {
		setAssistanceDataDelivery_v3a0ext(assistanceDataDelivery_v3a0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new AssistanceDataDelivery_v3a0ext();
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
			return new AssistanceDataDelivery_v3a0ext();
		    case 1:
			return new LaterNCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "assistanceDataDelivery_v3a0ext"
	    public AssistanceDataDelivery_v3a0ext getAssistanceDataDelivery_v3a0ext()
	    {
		return (AssistanceDataDelivery_v3a0ext)mComponents[0];
	    }
	    
	    public void setAssistanceDataDelivery_v3a0ext(AssistanceDataDelivery_v3a0ext assistanceDataDelivery_v3a0ext)
	    {
		mComponents[0] = assistanceDataDelivery_v3a0ext;
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
		public LaterNCEs(BitString assistanceDataDelivery_r3_add_ext, 
				V4b0NCEs v4b0NCEs)
		{
		    setAssistanceDataDelivery_r3_add_ext(assistanceDataDelivery_r3_add_ext);
		    setV4b0NCEs(v4b0NCEs);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new BitString();
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
			    return new BitString();
			case 1:
			    return new V4b0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "assistanceDataDelivery_r3_add_ext"
		public BitString getAssistanceDataDelivery_r3_add_ext()
		{
		    return (BitString)mComponents[0];
		}
		
		public void setAssistanceDataDelivery_r3_add_ext(BitString assistanceDataDelivery_r3_add_ext)
		{
		    mComponents[0] = assistanceDataDelivery_r3_add_ext;
		}
		
		public boolean hasAssistanceDataDelivery_r3_add_ext()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteAssistanceDataDelivery_r3_add_ext()
		{
		    setComponentAbsent(0);
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
		    public V4b0NCEs(AssistanceDataDelivery_v4b0ext_IEs assistanceDataDelivery_v4b0ext, 
				    V770NCE v770NCE)
		    {
			setAssistanceDataDelivery_v4b0ext(assistanceDataDelivery_v4b0ext);
			setV770NCE(v770NCE);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V4b0NCEs(AssistanceDataDelivery_v4b0ext_IEs assistanceDataDelivery_v4b0ext)
		    {
			setAssistanceDataDelivery_v4b0ext(assistanceDataDelivery_v4b0ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new AssistanceDataDelivery_v4b0ext_IEs();
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
				return new AssistanceDataDelivery_v4b0ext_IEs();
			    case 1:
				return new V770NCE();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "assistanceDataDelivery_v4b0ext"
		    public AssistanceDataDelivery_v4b0ext_IEs getAssistanceDataDelivery_v4b0ext()
		    {
			return (AssistanceDataDelivery_v4b0ext_IEs)mComponents[0];
		    }
		    
		    public void setAssistanceDataDelivery_v4b0ext(AssistanceDataDelivery_v4b0ext_IEs assistanceDataDelivery_v4b0ext)
		    {
			mComponents[0] = assistanceDataDelivery_v4b0ext;
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
		     * Define the ASN1 Type V770NCE from ASN1 Module PDU_definitions.
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
			public V770NCE(AssistanceDataDelivery_v770ext_IEs assistanceDataDelivery_v770ext, 
					V860NCE v860NCE)
			{
			    setAssistanceDataDelivery_v770ext(assistanceDataDelivery_v770ext);
			    setV860NCE(v860NCE);
			}
			
			/**
			 * Construct with required components.
			 */
			public V770NCE(AssistanceDataDelivery_v770ext_IEs assistanceDataDelivery_v770ext)
			{
			    setAssistanceDataDelivery_v770ext(assistanceDataDelivery_v770ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new AssistanceDataDelivery_v770ext_IEs();
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
				    return new AssistanceDataDelivery_v770ext_IEs();
				case 1:
				    return new V860NCE();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "assistanceDataDelivery_v770ext"
			public AssistanceDataDelivery_v770ext_IEs getAssistanceDataDelivery_v770ext()
			{
			    return (AssistanceDataDelivery_v770ext_IEs)mComponents[0];
			}
			
			public void setAssistanceDataDelivery_v770ext(AssistanceDataDelivery_v770ext_IEs assistanceDataDelivery_v770ext)
			{
			    mComponents[0] = assistanceDataDelivery_v770ext;
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
			 * Define the ASN1 Type V860NCE from ASN1 Module PDU_definitions.
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
			    public V860NCE(AssistanceDataDelivery_v860ext_IEs assistanceDataDelivery_v860ext, 
					    V920NCE v920NCE)
			    {
				setAssistanceDataDelivery_v860ext(assistanceDataDelivery_v860ext);
				setV920NCE(v920NCE);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V860NCE(AssistanceDataDelivery_v860ext_IEs assistanceDataDelivery_v860ext)
			    {
				setAssistanceDataDelivery_v860ext(assistanceDataDelivery_v860ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new AssistanceDataDelivery_v860ext_IEs();
				mComponents[1] = new V920NCE();
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
					return new AssistanceDataDelivery_v860ext_IEs();
				    case 1:
					return new V920NCE();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "assistanceDataDelivery_v860ext"
			    public AssistanceDataDelivery_v860ext_IEs getAssistanceDataDelivery_v860ext()
			    {
				return (AssistanceDataDelivery_v860ext_IEs)mComponents[0];
			    }
			    
			    public void setAssistanceDataDelivery_v860ext(AssistanceDataDelivery_v860ext_IEs assistanceDataDelivery_v860ext)
			    {
				mComponents[0] = assistanceDataDelivery_v860ext;
			    }
			    
			    
			    // Methods for field "v920NCE"
			    public V920NCE getV920NCE()
			    {
				return (V920NCE)mComponents[1];
			    }
			    
			    public void setV920NCE(V920NCE v920NCE)
			    {
				mComponents[1] = v920NCE;
			    }
			    
			    public boolean hasV920NCE()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV920NCE()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V920NCE from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V920NCE extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V920NCE()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V920NCE(AssistanceDataDelivery_v920ext_IEs assistanceDataDelivery_v920ext, 
						Va40NCE va40NCE)
				{
				    setAssistanceDataDelivery_v920ext(assistanceDataDelivery_v920ext);
				    setVa40NCE(va40NCE);
				}
				
				/**
				 * Construct with required components.
				 */
				public V920NCE(AssistanceDataDelivery_v920ext_IEs assistanceDataDelivery_v920ext)
				{
				    setAssistanceDataDelivery_v920ext(assistanceDataDelivery_v920ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new AssistanceDataDelivery_v920ext_IEs();
				    mComponents[1] = new Va40NCE();
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
					    return new AssistanceDataDelivery_v920ext_IEs();
					case 1:
					    return new Va40NCE();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "assistanceDataDelivery_v920ext"
				public AssistanceDataDelivery_v920ext_IEs getAssistanceDataDelivery_v920ext()
				{
				    return (AssistanceDataDelivery_v920ext_IEs)mComponents[0];
				}
				
				public void setAssistanceDataDelivery_v920ext(AssistanceDataDelivery_v920ext_IEs assistanceDataDelivery_v920ext)
				{
				    mComponents[0] = assistanceDataDelivery_v920ext;
				}
				
				
				// Methods for field "va40NCE"
				public Va40NCE getVa40NCE()
				{
				    return (Va40NCE)mComponents[1];
				}
				
				public void setVa40NCE(Va40NCE va40NCE)
				{
				    mComponents[1] = va40NCE;
				}
				
				public boolean hasVa40NCE()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteVa40NCE()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type Va40NCE from ASN1 Module PDU_definitions.
				 * @see Sequence
				 */
				public static class Va40NCE extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public Va40NCE()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public Va40NCE(AssistanceDataDelivery_va40ext_IEs assistanceDataDelivery_va40ext, 
						    NonCriticalExtensions nonCriticalExtensions)
				    {
					setAssistanceDataDelivery_va40ext(assistanceDataDelivery_va40ext);
					setNonCriticalExtensions(nonCriticalExtensions);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public Va40NCE(AssistanceDataDelivery_va40ext_IEs assistanceDataDelivery_va40ext)
				    {
					setAssistanceDataDelivery_va40ext(assistanceDataDelivery_va40ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new AssistanceDataDelivery_va40ext_IEs();
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
						return new AssistanceDataDelivery_va40ext_IEs();
					    case 1:
						return new NonCriticalExtensions();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "assistanceDataDelivery_va40ext"
				    public AssistanceDataDelivery_va40ext_IEs getAssistanceDataDelivery_va40ext()
				    {
					return (AssistanceDataDelivery_va40ext_IEs)mComponents[0];
				    }
				    
				    public void setAssistanceDataDelivery_va40ext(AssistanceDataDelivery_va40ext_IEs assistanceDataDelivery_va40ext)
				    {
					mComponents[0] = assistanceDataDelivery_va40ext;
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
						"AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs$V770NCE$V860NCE$V920NCE$Va40NCE$NonCriticalExtensions"
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
					    "AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs$V770NCE$V860NCE$V920NCE$Va40NCE"
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
								"AssistanceDataDelivery_va40ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"AssistanceDataDelivery-va40ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "AssistanceDataDelivery_va40ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "AssistanceDataDelivery_va40ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "assistanceDataDelivery-va40ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs$V770NCE$V860NCE$V920NCE$Va40NCE$NonCriticalExtensions"
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
				     * Get the type descriptor (TypeInfo) of 'this' Va40NCE object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' Va40NCE object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for Va40NCE

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
					"AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs$V770NCE$V860NCE$V920NCE"
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
							    "AssistanceDataDelivery_v920ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "AssistanceDataDelivery-v920ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"AssistanceDataDelivery_v920ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"AssistanceDataDelivery_v920ext_IEs"
							    )
							),
							0
						    )
						),
						"assistanceDataDelivery-v920ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs$V770NCE$V860NCE$V920NCE$Va40NCE"
						    )
						),
						"va40NCE",
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
				 * Get the type descriptor (TypeInfo) of 'this' V920NCE object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V920NCE object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V920NCE

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
				    "AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs$V770NCE$V860NCE"
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
							"AssistanceDataDelivery_v860ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"AssistanceDataDelivery-v860ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "AssistanceDataDelivery_v860ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "AssistanceDataDelivery_v860ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "assistanceDataDelivery-v860ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs$V770NCE$V860NCE$V920NCE"
						)
					    ),
					    "v920NCE",
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
				"rrc.pdu_definitions",
				"AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs$V770NCE"
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
						    "AssistanceDataDelivery_v770ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "AssistanceDataDelivery-v770ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"AssistanceDataDelivery_v770ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"AssistanceDataDelivery_v770ext_IEs"
						    )
						),
						0
					    )
					),
					"assistanceDataDelivery-v770ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs$V770NCE$V860NCE"
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
			    "rrc.pdu_definitions",
			    "AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs"
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
						"AssistanceDataDelivery_v4b0ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"AssistanceDataDelivery-v4b0ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "AssistanceDataDelivery_v4b0ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "AssistanceDataDelivery_v4b0ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "assistanceDataDelivery-v4b0ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs$V770NCE"
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
			"AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs"
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
				    new BitStringInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "com.oss.asn1",
					    "BitString"
					),
					new QName (
					    "builtin",
					    "BIT STRING"
					),
					12314,
					null,
					null,
					null
				    )
				),
				"assistanceDataDelivery-r3-add-ext",
				0,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs$V4b0NCEs"
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
		    "AssistanceDataDelivery$R3$V3a0NCEs"
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
					"AssistanceDataDelivery_v3a0ext"
				    ),
				    new QName (
					"PDU-definitions",
					"AssistanceDataDelivery-v3a0ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "AssistanceDataDelivery_v3a0ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "AssistanceDataDelivery_v3a0ext"
					)
				    ),
				    0
				)
			    ),
			    "assistanceDataDelivery-v3a0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "AssistanceDataDelivery$R3$V3a0NCEs$LaterNCEs"
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"AssistanceDataDelivery$R3"
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
				    "AssistanceDataDelivery_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "AssistanceDataDelivery-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"AssistanceDataDelivery_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"AssistanceDataDelivery_r3_IEs"
				    )
				),
				0
			    )
			),
			"assistanceDataDelivery-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"AssistanceDataDelivery$R3$V3a0NCEs"
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
	 * Get the type descriptor (TypeInfo) of 'this' R3 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' R3 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for R3

    // Methods for field "later_than_r3"
    public static AssistanceDataDelivery createAssistanceDataDeliveryWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	AssistanceDataDelivery __object = new AssistanceDataDelivery();

	__object.setLater_than_r3(later_than_r3);
	return __object;
    }
    
    public boolean hasLater_than_r3()
    {
	return getChosenFlag() == later_than_r3_chosen;
    }
    
    public void setLater_than_r3(Later_than_r3 later_than_r3)
    {
	setChosenValue(later_than_r3);
	setChosenFlag(later_than_r3_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Later_than_r3 from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class Later_than_r3 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Later_than_r3()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Later_than_r3(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
			CriticalExtensions criticalExtensions)
	{
	    setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	    setCriticalExtensions(criticalExtensions);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	    mComponents[1] = new CriticalExtensions();
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
		    return new rrc.informationelements.RRC_TransactionIdentifier();
		case 1:
		    return new CriticalExtensions();
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
	
	
	// Methods for field "criticalExtensions"
	public CriticalExtensions getCriticalExtensions()
	{
	    return (CriticalExtensions)mComponents[1];
	}
	
	public void setCriticalExtensions(CriticalExtensions criticalExtensions)
	{
	    mComponents[1] = criticalExtensions;
	}
	
	
	
	/**
	 * Define the ASN1 Type CriticalExtensions from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class CriticalExtensions extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public CriticalExtensions()
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
		    "AssistanceDataDelivery$Later_than_r3$CriticalExtensions"
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
	     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for CriticalExtensions

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
		"AssistanceDataDelivery$Later_than_r3"
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
			    new QName (
				"rrc.pdu_definitions",
				"AssistanceDataDelivery$Later_than_r3$CriticalExtensions"
			    )
			),
			"criticalExtensions",
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
	 * Get the type descriptor (TypeInfo) of 'this' Later_than_r3 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Later_than_r3 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Later_than_r3

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case r3_chosen:
		return new R3();
	    case later_than_r3_chosen:
		return new Later_than_r3();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.pdu_definitions",
	    "AssistanceDataDelivery"
	),
	new QName (
	    "PDU-definitions",
	    "AssistanceDataDelivery"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "AssistanceDataDelivery$R3"
			)
		    ),
		    "r3",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "AssistanceDataDelivery$Later_than_r3"
			)
		    ),
		    "later-than-r3",
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
     * Get the type descriptor (TypeInfo) of 'this' AssistanceDataDelivery object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AssistanceDataDelivery object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AssistanceDataDelivery
