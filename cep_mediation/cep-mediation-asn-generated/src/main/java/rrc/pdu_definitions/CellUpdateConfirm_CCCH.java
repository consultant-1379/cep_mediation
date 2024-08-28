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
 * Define the ASN1 Type CellUpdateConfirm_CCCH from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class CellUpdateConfirm_CCCH extends Choice {
    
    /**
     * The default constructor.
     */
    public CellUpdateConfirm_CCCH()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static CellUpdateConfirm_CCCH createCellUpdateConfirm_CCCHWithR3(R3 r3)
    {
	CellUpdateConfirm_CCCH __object = new CellUpdateConfirm_CCCH();

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
	public R3(rrc.informationelements.U_RNTI u_RNTI, 
			CellUpdateConfirm_r3_IEs cellUpdateConfirm_r3, 
			LaterNCEs laterNCEs)
	{
	    setU_RNTI(u_RNTI);
	    setCellUpdateConfirm_r3(cellUpdateConfirm_r3);
	    setLaterNCEs(laterNCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(rrc.informationelements.U_RNTI u_RNTI, 
			CellUpdateConfirm_r3_IEs cellUpdateConfirm_r3)
	{
	    setU_RNTI(u_RNTI);
	    setCellUpdateConfirm_r3(cellUpdateConfirm_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new rrc.informationelements.U_RNTI();
	    mComponents[1] = new CellUpdateConfirm_r3_IEs();
	    mComponents[2] = new LaterNCEs();
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
		    return new rrc.informationelements.U_RNTI();
		case 1:
		    return new CellUpdateConfirm_r3_IEs();
		case 2:
		    return new LaterNCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "u_RNTI"
	public rrc.informationelements.U_RNTI getU_RNTI()
	{
	    return (rrc.informationelements.U_RNTI)mComponents[0];
	}
	
	public void setU_RNTI(rrc.informationelements.U_RNTI u_RNTI)
	{
	    mComponents[0] = u_RNTI;
	}
	
	
	// Methods for field "cellUpdateConfirm_r3"
	public CellUpdateConfirm_r3_IEs getCellUpdateConfirm_r3()
	{
	    return (CellUpdateConfirm_r3_IEs)mComponents[1];
	}
	
	public void setCellUpdateConfirm_r3(CellUpdateConfirm_r3_IEs cellUpdateConfirm_r3)
	{
	    mComponents[1] = cellUpdateConfirm_r3;
	}
	
	
	// Methods for field "laterNCEs"
	public LaterNCEs getLaterNCEs()
	{
	    return (LaterNCEs)mComponents[2];
	}
	
	public void setLaterNCEs(LaterNCEs laterNCEs)
	{
	    mComponents[2] = laterNCEs;
	}
	
	public boolean hasLaterNCEs()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteLaterNCEs()
	{
	    setComponentAbsent(2);
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
	    public LaterNCEs(BitString cellUpdateConfirm_CCCH_r3_add_ext, 
			    V4b0NCEs v4b0NCEs)
	    {
		setCellUpdateConfirm_CCCH_r3_add_ext(cellUpdateConfirm_CCCH_r3_add_ext);
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
	    
	    
	    // Methods for field "cellUpdateConfirm_CCCH_r3_add_ext"
	    public BitString getCellUpdateConfirm_CCCH_r3_add_ext()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setCellUpdateConfirm_CCCH_r3_add_ext(BitString cellUpdateConfirm_CCCH_r3_add_ext)
	    {
		mComponents[0] = cellUpdateConfirm_CCCH_r3_add_ext;
	    }
	    
	    public boolean hasCellUpdateConfirm_CCCH_r3_add_ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteCellUpdateConfirm_CCCH_r3_add_ext()
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
		public V4b0NCEs(CellUpdateConfirm_v4b0ext_IEs cellUpdateConfirm_v4b0ext, 
				V590NCEs v590NCEs)
		{
		    setCellUpdateConfirm_v4b0ext(cellUpdateConfirm_v4b0ext);
		    setV590NCEs(v590NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V4b0NCEs(CellUpdateConfirm_v4b0ext_IEs cellUpdateConfirm_v4b0ext)
		{
		    setCellUpdateConfirm_v4b0ext(cellUpdateConfirm_v4b0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new CellUpdateConfirm_v4b0ext_IEs();
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
			    return new CellUpdateConfirm_v4b0ext_IEs();
			case 1:
			    return new V590NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "cellUpdateConfirm_v4b0ext"
		public CellUpdateConfirm_v4b0ext_IEs getCellUpdateConfirm_v4b0ext()
		{
		    return (CellUpdateConfirm_v4b0ext_IEs)mComponents[0];
		}
		
		public void setCellUpdateConfirm_v4b0ext(CellUpdateConfirm_v4b0ext_IEs cellUpdateConfirm_v4b0ext)
		{
		    mComponents[0] = cellUpdateConfirm_v4b0ext;
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
		    public V590NCEs(CellUpdateConfirm_v590ext_IEs cellUpdateConfirm_v590ext, 
				    V5d0NonCriticalExtenstions v5d0NonCriticalExtenstions)
		    {
			setCellUpdateConfirm_v590ext(cellUpdateConfirm_v590ext);
			setV5d0NonCriticalExtenstions(v5d0NonCriticalExtenstions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V590NCEs(CellUpdateConfirm_v590ext_IEs cellUpdateConfirm_v590ext)
		    {
			setCellUpdateConfirm_v590ext(cellUpdateConfirm_v590ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new CellUpdateConfirm_v590ext_IEs();
			mComponents[1] = new V5d0NonCriticalExtenstions();
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
				return new CellUpdateConfirm_v590ext_IEs();
			    case 1:
				return new V5d0NonCriticalExtenstions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "cellUpdateConfirm_v590ext"
		    public CellUpdateConfirm_v590ext_IEs getCellUpdateConfirm_v590ext()
		    {
			return (CellUpdateConfirm_v590ext_IEs)mComponents[0];
		    }
		    
		    public void setCellUpdateConfirm_v590ext(CellUpdateConfirm_v590ext_IEs cellUpdateConfirm_v590ext)
		    {
			mComponents[0] = cellUpdateConfirm_v590ext;
		    }
		    
		    
		    // Methods for field "v5d0NonCriticalExtenstions"
		    public V5d0NonCriticalExtenstions getV5d0NonCriticalExtenstions()
		    {
			return (V5d0NonCriticalExtenstions)mComponents[1];
		    }
		    
		    public void setV5d0NonCriticalExtenstions(V5d0NonCriticalExtenstions v5d0NonCriticalExtenstions)
		    {
			mComponents[1] = v5d0NonCriticalExtenstions;
		    }
		    
		    public boolean hasV5d0NonCriticalExtenstions()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV5d0NonCriticalExtenstions()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V5d0NonCriticalExtenstions from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class V5d0NonCriticalExtenstions extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V5d0NonCriticalExtenstions()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V5d0NonCriticalExtenstions(CellUpdateConfirm_v5d0ext_IEs cellUpdateConfirm_v5d0ext, 
					V690NCEs v690NCEs)
			{
			    setCellUpdateConfirm_v5d0ext(cellUpdateConfirm_v5d0ext);
			    setV690NCEs(v690NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V5d0NonCriticalExtenstions(CellUpdateConfirm_v5d0ext_IEs cellUpdateConfirm_v5d0ext)
			{
			    setCellUpdateConfirm_v5d0ext(cellUpdateConfirm_v5d0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new CellUpdateConfirm_v5d0ext_IEs();
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
				    return new CellUpdateConfirm_v5d0ext_IEs();
				case 1:
				    return new V690NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "cellUpdateConfirm_v5d0ext"
			public CellUpdateConfirm_v5d0ext_IEs getCellUpdateConfirm_v5d0ext()
			{
			    return (CellUpdateConfirm_v5d0ext_IEs)mComponents[0];
			}
			
			public void setCellUpdateConfirm_v5d0ext(CellUpdateConfirm_v5d0ext_IEs cellUpdateConfirm_v5d0ext)
			{
			    mComponents[0] = cellUpdateConfirm_v5d0ext;
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
			    public V690NCEs(CellUpdateConfirm_v690ext_IEs cellUpdateConfirm_v690ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setCellUpdateConfirm_v690ext(cellUpdateConfirm_v690ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V690NCEs(CellUpdateConfirm_v690ext_IEs cellUpdateConfirm_v690ext)
			    {
				setCellUpdateConfirm_v690ext(cellUpdateConfirm_v690ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new CellUpdateConfirm_v690ext_IEs();
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
					return new CellUpdateConfirm_v690ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "cellUpdateConfirm_v690ext"
			    public CellUpdateConfirm_v690ext_IEs getCellUpdateConfirm_v690ext()
			    {
				return (CellUpdateConfirm_v690ext_IEs)mComponents[0];
			    }
			    
			    public void setCellUpdateConfirm_v690ext(CellUpdateConfirm_v690ext_IEs cellUpdateConfirm_v690ext)
			    {
				mComponents[0] = cellUpdateConfirm_v690ext;
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
					"CellUpdateConfirm_CCCH$R3$LaterNCEs$V4b0NCEs$V590NCEs$V5d0NonCriticalExtenstions$V690NCEs$NonCriticalExtensions"
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
				    "CellUpdateConfirm_CCCH$R3$LaterNCEs$V4b0NCEs$V590NCEs$V5d0NonCriticalExtenstions$V690NCEs"
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
							"CellUpdateConfirm_v690ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"CellUpdateConfirm-v690ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_v690ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_v690ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "cellUpdateConfirm-v690ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_CCCH$R3$LaterNCEs$V4b0NCEs$V590NCEs$V5d0NonCriticalExtenstions$V690NCEs$NonCriticalExtensions"
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
				"CellUpdateConfirm_CCCH$R3$LaterNCEs$V4b0NCEs$V590NCEs$V5d0NonCriticalExtenstions"
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
						    "CellUpdateConfirm_v5d0ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "CellUpdateConfirm-v5d0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_v5d0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_v5d0ext_IEs"
						    )
						),
						0
					    )
					),
					"cellUpdateConfirm-v5d0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_CCCH$R3$LaterNCEs$V4b0NCEs$V590NCEs$V5d0NonCriticalExtenstions$V690NCEs"
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
			 * Get the type descriptor (TypeInfo) of 'this' V5d0NonCriticalExtenstions object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V5d0NonCriticalExtenstions object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V5d0NonCriticalExtenstions

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
			    "CellUpdateConfirm_CCCH$R3$LaterNCEs$V4b0NCEs$V590NCEs"
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
						"CellUpdateConfirm_v590ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"CellUpdateConfirm-v590ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_v590ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_v590ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "cellUpdateConfirm-v590ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdateConfirm_CCCH$R3$LaterNCEs$V4b0NCEs$V590NCEs$V5d0NonCriticalExtenstions"
					)
				    ),
				    "v5d0NonCriticalExtenstions",
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
			"CellUpdateConfirm_CCCH$R3$LaterNCEs$V4b0NCEs"
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
					    "CellUpdateConfirm_v4b0ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "CellUpdateConfirm-v4b0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_v4b0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_v4b0ext_IEs"
					    )
					),
					0
				    )
				),
				"cellUpdateConfirm-v4b0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdateConfirm_CCCH$R3$LaterNCEs$V4b0NCEs$V590NCEs"
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
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "CellUpdateConfirm_CCCH$R3$LaterNCEs"
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
			    "cellUpdateConfirm-CCCH-r3-add-ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdateConfirm_CCCH$R3$LaterNCEs$V4b0NCEs"
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellUpdateConfirm_CCCH$R3"
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
				    "U_RNTI"
				),
				new QName (
				    "InformationElements",
				    "U-RNTI"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"U_RNTI"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"U_RNTI"
				    )
				),
				0
			    )
			),
			"u-RNTI",
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
				    "CellUpdateConfirm_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "CellUpdateConfirm-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdateConfirm_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdateConfirm_r3_IEs"
				    )
				),
				0
			    )
			),
			"cellUpdateConfirm-r3",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"CellUpdateConfirm_CCCH$R3$LaterNCEs"
			    )
			),
			"laterNCEs",
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
			    new TagDecoderElement((short)0x8001, 1)
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
    public static CellUpdateConfirm_CCCH createCellUpdateConfirm_CCCHWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	CellUpdateConfirm_CCCH __object = new CellUpdateConfirm_CCCH();

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
	public Later_than_r3(rrc.informationelements.U_RNTI u_RNTI, 
			rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
			CriticalExtensions criticalExtensions)
	{
	    setU_RNTI(u_RNTI);
	    setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	    setCriticalExtensions(criticalExtensions);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new rrc.informationelements.U_RNTI();
	    mComponents[1] = new rrc.informationelements.RRC_TransactionIdentifier();
	    mComponents[2] = new CriticalExtensions();
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
		    return new rrc.informationelements.U_RNTI();
		case 1:
		    return new rrc.informationelements.RRC_TransactionIdentifier();
		case 2:
		    return new CriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "u_RNTI"
	public rrc.informationelements.U_RNTI getU_RNTI()
	{
	    return (rrc.informationelements.U_RNTI)mComponents[0];
	}
	
	public void setU_RNTI(rrc.informationelements.U_RNTI u_RNTI)
	{
	    mComponents[0] = u_RNTI;
	}
	
	
	// Methods for field "rrc_TransactionIdentifier"
	public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
	{
	    return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[1];
	}
	
	public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
	{
	    mComponents[1] = rrc_TransactionIdentifier;
	}
	
	
	// Methods for field "criticalExtensions"
	public CriticalExtensions getCriticalExtensions()
	{
	    return (CriticalExtensions)mComponents[2];
	}
	
	public void setCriticalExtensions(CriticalExtensions criticalExtensions)
	{
	    mComponents[2] = criticalExtensions;
	}
	
	
	
	/**
	 * Define the ASN1 Type CriticalExtensions from ASN1 Module PDU_definitions.
	 * @see Choice
	 */
	public static class CriticalExtensions extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public CriticalExtensions()
	    {
	    }
	    
	    public static final  int  r4_chosen = 1;
	    public static final  int  criticalExtensions_chosen = 2;
	    
	    // Methods for field "r4"
	    public static CriticalExtensions createCriticalExtensionsWithR4(R4 r4)
	    {
		CriticalExtensions __object = new CriticalExtensions();

		__object.setR4(r4);
		return __object;
	    }
	    
	    public boolean hasR4()
	    {
		return getChosenFlag() == r4_chosen;
	    }
	    
	    public void setR4(R4 r4)
	    {
		setChosenValue(r4);
		setChosenFlag(r4_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type R4 from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class R4 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public R4()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public R4(CellUpdateConfirm_r4_IEs cellUpdateConfirm_r4, 
				V4d0NCEs v4d0NCEs)
		{
		    setCellUpdateConfirm_r4(cellUpdateConfirm_r4);
		    setV4d0NCEs(v4d0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public R4(CellUpdateConfirm_r4_IEs cellUpdateConfirm_r4)
		{
		    setCellUpdateConfirm_r4(cellUpdateConfirm_r4);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new CellUpdateConfirm_r4_IEs();
		    mComponents[1] = new V4d0NCEs();
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
			    return new CellUpdateConfirm_r4_IEs();
			case 1:
			    return new V4d0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "cellUpdateConfirm_r4"
		public CellUpdateConfirm_r4_IEs getCellUpdateConfirm_r4()
		{
		    return (CellUpdateConfirm_r4_IEs)mComponents[0];
		}
		
		public void setCellUpdateConfirm_r4(CellUpdateConfirm_r4_IEs cellUpdateConfirm_r4)
		{
		    mComponents[0] = cellUpdateConfirm_r4;
		}
		
		
		// Methods for field "v4d0NCEs"
		public V4d0NCEs getV4d0NCEs()
		{
		    return (V4d0NCEs)mComponents[1];
		}
		
		public void setV4d0NCEs(V4d0NCEs v4d0NCEs)
		{
		    mComponents[1] = v4d0NCEs;
		}
		
		public boolean hasV4d0NCEs()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV4d0NCEs()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V4d0NCEs from ASN1 Module PDU_definitions.
		 * @see Sequence
		 */
		public static class V4d0NCEs extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V4d0NCEs()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V4d0NCEs(BitString cellUpdateConfirm_CCCH_r4_add_ext, 
				    V590NCEs v590NCEs)
		    {
			setCellUpdateConfirm_CCCH_r4_add_ext(cellUpdateConfirm_CCCH_r4_add_ext);
			setV590NCEs(v590NCEs);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new BitString();
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
				return new BitString();
			    case 1:
				return new V590NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "cellUpdateConfirm_CCCH_r4_add_ext"
		    public BitString getCellUpdateConfirm_CCCH_r4_add_ext()
		    {
			return (BitString)mComponents[0];
		    }
		    
		    public void setCellUpdateConfirm_CCCH_r4_add_ext(BitString cellUpdateConfirm_CCCH_r4_add_ext)
		    {
			mComponents[0] = cellUpdateConfirm_CCCH_r4_add_ext;
		    }
		    
		    public boolean hasCellUpdateConfirm_CCCH_r4_add_ext()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteCellUpdateConfirm_CCCH_r4_add_ext()
		    {
			setComponentAbsent(0);
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
			public V590NCEs(CellUpdateConfirm_v590ext_IEs cellUpdateConfirm_v590ext, 
					V5d0NonCriticalExtenstions v5d0NonCriticalExtenstions)
			{
			    setCellUpdateConfirm_v590ext(cellUpdateConfirm_v590ext);
			    setV5d0NonCriticalExtenstions(v5d0NonCriticalExtenstions);
			}
			
			/**
			 * Construct with required components.
			 */
			public V590NCEs(CellUpdateConfirm_v590ext_IEs cellUpdateConfirm_v590ext)
			{
			    setCellUpdateConfirm_v590ext(cellUpdateConfirm_v590ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new CellUpdateConfirm_v590ext_IEs();
			    mComponents[1] = new V5d0NonCriticalExtenstions();
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
				    return new CellUpdateConfirm_v590ext_IEs();
				case 1:
				    return new V5d0NonCriticalExtenstions();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "cellUpdateConfirm_v590ext"
			public CellUpdateConfirm_v590ext_IEs getCellUpdateConfirm_v590ext()
			{
			    return (CellUpdateConfirm_v590ext_IEs)mComponents[0];
			}
			
			public void setCellUpdateConfirm_v590ext(CellUpdateConfirm_v590ext_IEs cellUpdateConfirm_v590ext)
			{
			    mComponents[0] = cellUpdateConfirm_v590ext;
			}
			
			
			// Methods for field "v5d0NonCriticalExtenstions"
			public V5d0NonCriticalExtenstions getV5d0NonCriticalExtenstions()
			{
			    return (V5d0NonCriticalExtenstions)mComponents[1];
			}
			
			public void setV5d0NonCriticalExtenstions(V5d0NonCriticalExtenstions v5d0NonCriticalExtenstions)
			{
			    mComponents[1] = v5d0NonCriticalExtenstions;
			}
			
			public boolean hasV5d0NonCriticalExtenstions()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV5d0NonCriticalExtenstions()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V5d0NonCriticalExtenstions from ASN1 Module PDU_definitions.
			 * @see Sequence
			 */
			public static class V5d0NonCriticalExtenstions extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V5d0NonCriticalExtenstions()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V5d0NonCriticalExtenstions(CellUpdateConfirm_v5d0ext_IEs cellUpdateConfirm_v5d0ext, 
					    V690NCEs v690NCEs)
			    {
				setCellUpdateConfirm_v5d0ext(cellUpdateConfirm_v5d0ext);
				setV690NCEs(v690NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V5d0NonCriticalExtenstions(CellUpdateConfirm_v5d0ext_IEs cellUpdateConfirm_v5d0ext)
			    {
				setCellUpdateConfirm_v5d0ext(cellUpdateConfirm_v5d0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new CellUpdateConfirm_v5d0ext_IEs();
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
					return new CellUpdateConfirm_v5d0ext_IEs();
				    case 1:
					return new V690NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "cellUpdateConfirm_v5d0ext"
			    public CellUpdateConfirm_v5d0ext_IEs getCellUpdateConfirm_v5d0ext()
			    {
				return (CellUpdateConfirm_v5d0ext_IEs)mComponents[0];
			    }
			    
			    public void setCellUpdateConfirm_v5d0ext(CellUpdateConfirm_v5d0ext_IEs cellUpdateConfirm_v5d0ext)
			    {
				mComponents[0] = cellUpdateConfirm_v5d0ext;
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
				public V690NCEs(CellUpdateConfirm_v690ext_IEs cellUpdateConfirm_v690ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setCellUpdateConfirm_v690ext(cellUpdateConfirm_v690ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V690NCEs(CellUpdateConfirm_v690ext_IEs cellUpdateConfirm_v690ext)
				{
				    setCellUpdateConfirm_v690ext(cellUpdateConfirm_v690ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new CellUpdateConfirm_v690ext_IEs();
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
					    return new CellUpdateConfirm_v690ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "cellUpdateConfirm_v690ext"
				public CellUpdateConfirm_v690ext_IEs getCellUpdateConfirm_v690ext()
				{
				    return (CellUpdateConfirm_v690ext_IEs)mComponents[0];
				}
				
				public void setCellUpdateConfirm_v690ext(CellUpdateConfirm_v690ext_IEs cellUpdateConfirm_v690ext)
				{
				    mComponents[0] = cellUpdateConfirm_v690ext;
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
					    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs$V5d0NonCriticalExtenstions$V690NCEs$NonCriticalExtensions"
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
					"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs$V5d0NonCriticalExtenstions$V690NCEs"
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
							    "CellUpdateConfirm_v690ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "CellUpdateConfirm-v690ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"CellUpdateConfirm_v690ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"CellUpdateConfirm_v690ext_IEs"
							    )
							),
							0
						    )
						),
						"cellUpdateConfirm-v690ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs$V5d0NonCriticalExtenstions$V690NCEs$NonCriticalExtensions"
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
				    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs$V5d0NonCriticalExtenstions"
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
							"CellUpdateConfirm_v5d0ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"CellUpdateConfirm-v5d0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_v5d0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_v5d0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "cellUpdateConfirm-v5d0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs$V5d0NonCriticalExtenstions$V690NCEs"
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
			     * Get the type descriptor (TypeInfo) of 'this' V5d0NonCriticalExtenstions object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V5d0NonCriticalExtenstions object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V5d0NonCriticalExtenstions

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
				"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs"
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
						    "CellUpdateConfirm_v590ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "CellUpdateConfirm-v590ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_v590ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_v590ext_IEs"
						    )
						),
						0
					    )
					),
					"cellUpdateConfirm-v590ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs$V5d0NonCriticalExtenstions"
					    )
					),
					"v5d0NonCriticalExtenstions",
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
			    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4$V4d0NCEs"
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
				    "cellUpdateConfirm-CCCH-r4-add-ext",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs"
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
		     * Get the type descriptor (TypeInfo) of 'this' V4d0NCEs object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V4d0NCEs object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V4d0NCEs

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
			"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4"
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
					    "CellUpdateConfirm_r4_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "CellUpdateConfirm-r4-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_r4_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_r4_IEs"
					    )
					),
					0
				    )
				),
				"cellUpdateConfirm-r4",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4$V4d0NCEs"
				    )
				),
				"v4d0NCEs",
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
		 * Get the type descriptor (TypeInfo) of 'this' R4 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' R4 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for R4

	    // Methods for field "criticalExtensions"
	    public static CriticalExtensions createCriticalExtensionsWithCriticalExtensions(CriticalExtensions1 criticalExtensions)
	    {
		CriticalExtensions __object = new CriticalExtensions();

		__object.setCriticalExtensions(criticalExtensions);
		return __object;
	    }
	    
	    public boolean hasCriticalExtensions()
	    {
		return getChosenFlag() == criticalExtensions_chosen;
	    }
	    
	    public void setCriticalExtensions(CriticalExtensions1 criticalExtensions)
	    {
		setChosenValue(criticalExtensions);
		setChosenFlag(criticalExtensions_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type CriticalExtensions1 from ASN1 Module PDU_definitions.
	     * @see Choice
	     */
	    public static class CriticalExtensions1 extends Choice {
		
		/**
		 * The default constructor.
		 */
		public CriticalExtensions1()
		{
		}
		
		public static final  int  r5_chosen = 1;
		public static final  int  criticalExtensions_chosen = 2;
		
		// Methods for field "r5"
		public static CriticalExtensions1 createCriticalExtensions1WithR5(R5 r5)
		{
		    CriticalExtensions1 __object = new CriticalExtensions1();

		    __object.setR5(r5);
		    return __object;
		}
		
		public boolean hasR5()
		{
		    return getChosenFlag() == r5_chosen;
		}
		
		public void setR5(R5 r5)
		{
		    setChosenValue(r5);
		    setChosenFlag(r5_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type R5 from ASN1 Module PDU_definitions.
		 * @see Sequence
		 */
		public static class R5 extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public R5()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public R5(CellUpdateConfirm_r5_IEs cellUpdateConfirm_r5, 
				    BitString cellUpdateConfirm_CCCH_r5_add_ext, 
				    V5d0NonCriticalExtenstions v5d0NonCriticalExtenstions)
		    {
			setCellUpdateConfirm_r5(cellUpdateConfirm_r5);
			setCellUpdateConfirm_CCCH_r5_add_ext(cellUpdateConfirm_CCCH_r5_add_ext);
			setV5d0NonCriticalExtenstions(v5d0NonCriticalExtenstions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public R5(CellUpdateConfirm_r5_IEs cellUpdateConfirm_r5)
		    {
			setCellUpdateConfirm_r5(cellUpdateConfirm_r5);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new CellUpdateConfirm_r5_IEs();
			mComponents[1] = new BitString();
			mComponents[2] = new V5d0NonCriticalExtenstions();
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
				return new CellUpdateConfirm_r5_IEs();
			    case 1:
				return new BitString();
			    case 2:
				return new V5d0NonCriticalExtenstions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "cellUpdateConfirm_r5"
		    public CellUpdateConfirm_r5_IEs getCellUpdateConfirm_r5()
		    {
			return (CellUpdateConfirm_r5_IEs)mComponents[0];
		    }
		    
		    public void setCellUpdateConfirm_r5(CellUpdateConfirm_r5_IEs cellUpdateConfirm_r5)
		    {
			mComponents[0] = cellUpdateConfirm_r5;
		    }
		    
		    
		    // Methods for field "cellUpdateConfirm_CCCH_r5_add_ext"
		    public BitString getCellUpdateConfirm_CCCH_r5_add_ext()
		    {
			return (BitString)mComponents[1];
		    }
		    
		    public void setCellUpdateConfirm_CCCH_r5_add_ext(BitString cellUpdateConfirm_CCCH_r5_add_ext)
		    {
			mComponents[1] = cellUpdateConfirm_CCCH_r5_add_ext;
		    }
		    
		    public boolean hasCellUpdateConfirm_CCCH_r5_add_ext()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteCellUpdateConfirm_CCCH_r5_add_ext()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    // Methods for field "v5d0NonCriticalExtenstions"
		    public V5d0NonCriticalExtenstions getV5d0NonCriticalExtenstions()
		    {
			return (V5d0NonCriticalExtenstions)mComponents[2];
		    }
		    
		    public void setV5d0NonCriticalExtenstions(V5d0NonCriticalExtenstions v5d0NonCriticalExtenstions)
		    {
			mComponents[2] = v5d0NonCriticalExtenstions;
		    }
		    
		    public boolean hasV5d0NonCriticalExtenstions()
		    {
			return componentIsPresent(2);
		    }
		    
		    public void deleteV5d0NonCriticalExtenstions()
		    {
			setComponentAbsent(2);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V5d0NonCriticalExtenstions from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class V5d0NonCriticalExtenstions extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V5d0NonCriticalExtenstions()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V5d0NonCriticalExtenstions(CellUpdateConfirm_v5d0ext_IEs cellUpdateConfirm_v5d0ext, 
					V690NCEs v690NCEs)
			{
			    setCellUpdateConfirm_v5d0ext(cellUpdateConfirm_v5d0ext);
			    setV690NCEs(v690NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V5d0NonCriticalExtenstions(CellUpdateConfirm_v5d0ext_IEs cellUpdateConfirm_v5d0ext)
			{
			    setCellUpdateConfirm_v5d0ext(cellUpdateConfirm_v5d0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new CellUpdateConfirm_v5d0ext_IEs();
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
				    return new CellUpdateConfirm_v5d0ext_IEs();
				case 1:
				    return new V690NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "cellUpdateConfirm_v5d0ext"
			public CellUpdateConfirm_v5d0ext_IEs getCellUpdateConfirm_v5d0ext()
			{
			    return (CellUpdateConfirm_v5d0ext_IEs)mComponents[0];
			}
			
			public void setCellUpdateConfirm_v5d0ext(CellUpdateConfirm_v5d0ext_IEs cellUpdateConfirm_v5d0ext)
			{
			    mComponents[0] = cellUpdateConfirm_v5d0ext;
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
			    public V690NCEs(CellUpdateConfirm_v690ext_IEs cellUpdateConfirm_v690ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setCellUpdateConfirm_v690ext(cellUpdateConfirm_v690ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V690NCEs(CellUpdateConfirm_v690ext_IEs cellUpdateConfirm_v690ext)
			    {
				setCellUpdateConfirm_v690ext(cellUpdateConfirm_v690ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new CellUpdateConfirm_v690ext_IEs();
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
					return new CellUpdateConfirm_v690ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "cellUpdateConfirm_v690ext"
			    public CellUpdateConfirm_v690ext_IEs getCellUpdateConfirm_v690ext()
			    {
				return (CellUpdateConfirm_v690ext_IEs)mComponents[0];
			    }
			    
			    public void setCellUpdateConfirm_v690ext(CellUpdateConfirm_v690ext_IEs cellUpdateConfirm_v690ext)
			    {
				mComponents[0] = cellUpdateConfirm_v690ext;
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
					"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V5d0NonCriticalExtenstions$V690NCEs$NonCriticalExtensions"
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
				    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V5d0NonCriticalExtenstions$V690NCEs"
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
							"CellUpdateConfirm_v690ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"CellUpdateConfirm-v690ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_v690ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_v690ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "cellUpdateConfirm-v690ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V5d0NonCriticalExtenstions$V690NCEs$NonCriticalExtensions"
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
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V5d0NonCriticalExtenstions"
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
						    "CellUpdateConfirm_v5d0ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "CellUpdateConfirm-v5d0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_v5d0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_v5d0ext_IEs"
						    )
						),
						0
					    )
					),
					"cellUpdateConfirm-v5d0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V5d0NonCriticalExtenstions$V690NCEs"
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
			 * Get the type descriptor (TypeInfo) of 'this' V5d0NonCriticalExtenstions object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V5d0NonCriticalExtenstions object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V5d0NonCriticalExtenstions

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
			    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5"
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
						"CellUpdateConfirm_r5_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"CellUpdateConfirm-r5-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_r5_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_r5_IEs"
						)
					    ),
					    0
					)
				    ),
				    "cellUpdateConfirm-r5",
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
				    "cellUpdateConfirm-CCCH-r5-add-ext",
				    1,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V5d0NonCriticalExtenstions"
					)
				    ),
				    "v5d0NonCriticalExtenstions",
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
		     * Get the type descriptor (TypeInfo) of 'this' R5 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' R5 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for R5

		// Methods for field "criticalExtensions"
		public static CriticalExtensions1 createCriticalExtensions1WithCriticalExtensions(CriticalExtensions2 criticalExtensions)
		{
		    CriticalExtensions1 __object = new CriticalExtensions1();

		    __object.setCriticalExtensions(criticalExtensions);
		    return __object;
		}
		
		public boolean hasCriticalExtensions()
		{
		    return getChosenFlag() == criticalExtensions_chosen;
		}
		
		public void setCriticalExtensions(CriticalExtensions2 criticalExtensions)
		{
		    setChosenValue(criticalExtensions);
		    setChosenFlag(criticalExtensions_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type CriticalExtensions2 from ASN1 Module PDU_definitions.
		 * @see Choice
		 */
		public static class CriticalExtensions2 extends Choice {
		    
		    /**
		     * The default constructor.
		     */
		    public CriticalExtensions2()
		    {
		    }
		    
		    public static final  int  r6_chosen = 1;
		    public static final  int  criticalExtensions_chosen = 2;
		    
		    // Methods for field "r6"
		    public static CriticalExtensions2 createCriticalExtensions2WithR6(R6 r6)
		    {
			CriticalExtensions2 __object = new CriticalExtensions2();

			__object.setR6(r6);
			return __object;
		    }
		    
		    public boolean hasR6()
		    {
			return getChosenFlag() == r6_chosen;
		    }
		    
		    public void setR6(R6 r6)
		    {
			setChosenValue(r6);
			setChosenFlag(r6_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type R6 from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class R6 extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public R6()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public R6(CellUpdateConfirm_r6_IEs cellUpdateConfirm_r6, 
					BitString cellUpdateConfirm_r6_add_ext, 
					V6b0NCEs v6b0NCEs)
			{
			    setCellUpdateConfirm_r6(cellUpdateConfirm_r6);
			    setCellUpdateConfirm_r6_add_ext(cellUpdateConfirm_r6_add_ext);
			    setV6b0NCEs(v6b0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public R6(CellUpdateConfirm_r6_IEs cellUpdateConfirm_r6)
			{
			    setCellUpdateConfirm_r6(cellUpdateConfirm_r6);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new CellUpdateConfirm_r6_IEs();
			    mComponents[1] = new BitString();
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
				    return new CellUpdateConfirm_r6_IEs();
				case 1:
				    return new BitString();
				case 2:
				    return new V6b0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "cellUpdateConfirm_r6"
			public CellUpdateConfirm_r6_IEs getCellUpdateConfirm_r6()
			{
			    return (CellUpdateConfirm_r6_IEs)mComponents[0];
			}
			
			public void setCellUpdateConfirm_r6(CellUpdateConfirm_r6_IEs cellUpdateConfirm_r6)
			{
			    mComponents[0] = cellUpdateConfirm_r6;
			}
			
			
			// Methods for field "cellUpdateConfirm_r6_add_ext"
			public BitString getCellUpdateConfirm_r6_add_ext()
			{
			    return (BitString)mComponents[1];
			}
			
			public void setCellUpdateConfirm_r6_add_ext(BitString cellUpdateConfirm_r6_add_ext)
			{
			    mComponents[1] = cellUpdateConfirm_r6_add_ext;
			}
			
			public boolean hasCellUpdateConfirm_r6_add_ext()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteCellUpdateConfirm_r6_add_ext()
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
			    public V6b0NCEs(CellUpdateConfirm_v6b0ext_IEs cellUpdateConfirm_v6b0ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setCellUpdateConfirm_v6b0ext(cellUpdateConfirm_v6b0ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V6b0NCEs(CellUpdateConfirm_v6b0ext_IEs cellUpdateConfirm_v6b0ext)
			    {
				setCellUpdateConfirm_v6b0ext(cellUpdateConfirm_v6b0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new CellUpdateConfirm_v6b0ext_IEs();
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
					return new CellUpdateConfirm_v6b0ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "cellUpdateConfirm_v6b0ext"
			    public CellUpdateConfirm_v6b0ext_IEs getCellUpdateConfirm_v6b0ext()
			    {
				return (CellUpdateConfirm_v6b0ext_IEs)mComponents[0];
			    }
			    
			    public void setCellUpdateConfirm_v6b0ext(CellUpdateConfirm_v6b0ext_IEs cellUpdateConfirm_v6b0ext)
			    {
				mComponents[0] = cellUpdateConfirm_v6b0ext;
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
					"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs$NonCriticalExtensions"
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
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs"
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
							"CellUpdateConfirm_v6b0ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"CellUpdateConfirm-v6b0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_v6b0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_v6b0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "cellUpdateConfirm-v6b0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs$NonCriticalExtensions"
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
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6"
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
						    "CellUpdateConfirm_r6_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "CellUpdateConfirm-r6-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_r6_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_r6_IEs"
						    )
						),
						0
					    )
					),
					"cellUpdateConfirm-r6",
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
					"cellUpdateConfirm-r6-add-ext",
					1,
					3,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs"
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
			 * Get the type descriptor (TypeInfo) of 'this' R6 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' R6 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for R6

		    // Methods for field "criticalExtensions"
		    public static CriticalExtensions2 createCriticalExtensions2WithCriticalExtensions(CriticalExtensions3 criticalExtensions)
		    {
			CriticalExtensions2 __object = new CriticalExtensions2();

			__object.setCriticalExtensions(criticalExtensions);
			return __object;
		    }
		    
		    public boolean hasCriticalExtensions()
		    {
			return getChosenFlag() == criticalExtensions_chosen;
		    }
		    
		    public void setCriticalExtensions(CriticalExtensions3 criticalExtensions)
		    {
			setChosenValue(criticalExtensions);
			setChosenFlag(criticalExtensions_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type CriticalExtensions3 from ASN1 Module PDU_definitions.
		     * @see Choice
		     */
		    public static class CriticalExtensions3 extends Choice {
			
			/**
			 * The default constructor.
			 */
			public CriticalExtensions3()
			{
			}
			
			public static final  int  r7_chosen = 1;
			public static final  int  criticalExtensions_chosen = 2;
			
			// Methods for field "r7"
			public static CriticalExtensions3 createCriticalExtensions3WithR7(R7 r7)
			{
			    CriticalExtensions3 __object = new CriticalExtensions3();

			    __object.setR7(r7);
			    return __object;
			}
			
			public boolean hasR7()
			{
			    return getChosenFlag() == r7_chosen;
			}
			
			public void setR7(R7 r7)
			{
			    setChosenValue(r7);
			    setChosenFlag(r7_chosen);
			}
			
			
			
			/**
			 * Define the ASN1 Type R7 from ASN1 Module PDU_definitions.
			 * @see Sequence
			 */
			public static class R7 extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public R7()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public R7(CellUpdateConfirm_r7_IEs cellUpdateConfirm_r7, 
					    CellUpdateConfirm_r7_add_ext cellUpdateConfirm_r7_add_ext, 
					    V780NCEs v780NCEs)
			    {
				setCellUpdateConfirm_r7(cellUpdateConfirm_r7);
				setCellUpdateConfirm_r7_add_ext(cellUpdateConfirm_r7_add_ext);
				setV780NCEs(v780NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public R7(CellUpdateConfirm_r7_IEs cellUpdateConfirm_r7)
			    {
				setCellUpdateConfirm_r7(cellUpdateConfirm_r7);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new CellUpdateConfirm_r7_IEs();
				mComponents[1] = new CellUpdateConfirm_r7_add_ext();
				mComponents[2] = new V780NCEs();
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
					return new CellUpdateConfirm_r7_IEs();
				    case 1:
					return new CellUpdateConfirm_r7_add_ext();
				    case 2:
					return new V780NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "cellUpdateConfirm_r7"
			    public CellUpdateConfirm_r7_IEs getCellUpdateConfirm_r7()
			    {
				return (CellUpdateConfirm_r7_IEs)mComponents[0];
			    }
			    
			    public void setCellUpdateConfirm_r7(CellUpdateConfirm_r7_IEs cellUpdateConfirm_r7)
			    {
				mComponents[0] = cellUpdateConfirm_r7;
			    }
			    
			    
			    // Methods for field "cellUpdateConfirm_r7_add_ext"
			    public CellUpdateConfirm_r7_add_ext getCellUpdateConfirm_r7_add_ext()
			    {
				return (CellUpdateConfirm_r7_add_ext)mComponents[1];
			    }
			    
			    public void setCellUpdateConfirm_r7_add_ext(CellUpdateConfirm_r7_add_ext cellUpdateConfirm_r7_add_ext)
			    {
				mComponents[1] = cellUpdateConfirm_r7_add_ext;
			    }
			    
			    public boolean hasCellUpdateConfirm_r7_add_ext()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteCellUpdateConfirm_r7_add_ext()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type CellUpdateConfirm_r7_add_ext from ASN1 Module PDU_definitions.
			     * @see ContainingBitString
			     */
			    public static class CellUpdateConfirm_r7_add_ext extends ContainingBitString {
				
				/**
				 * The default constructor.
				 */
				public CellUpdateConfirm_r7_add_ext()
				{
				}
				
				/**
				 * Construct Bit String from a byte array.
				 * All bits considered significant.
				 * @param value the byte array to set this object to.
				 */
				public CellUpdateConfirm_r7_add_ext(byte[] value)
				{
				    super(value);
				}
				
				
				/**
				 * Construct Bit String from a byte array and significant bits.
				 * @param value the byte array to set this object to.
				 * @param sigBits the number of significant bits.
				 */
				public CellUpdateConfirm_r7_add_ext(byte[] value, int sigBits)
				{
				    super(value, sigBits);
				}
				
				/**
				 * Construct from a contained type value.
				 */
				public CellUpdateConfirm_r7_add_ext(CellUpdateConfirm_r7_add_ext_IEs decoded)
				{
				    super(decoded);
				}
				
				// Methods for getting and setting a contained value
				public CellUpdateConfirm_r7_add_ext_IEs getContainedValue()
				{
				    return (CellUpdateConfirm_r7_add_ext_IEs)getDecodedValue();
				}
				
				public void setContainedValue(CellUpdateConfirm_r7_add_ext_IEs value)
				{
				    setDecodedValue(value);
				}
				
				/**
				 * Initialize the type descriptor.
				 */
				private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$CellUpdateConfirm_r7_add_ext"
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
					    "CellUpdateConfirm_r7_add_ext_IEs"
					)
				    ),
				    null
				);
				
				/**
				 * Get the type descriptor (TypeInfo) of 'this' CellUpdateConfirm_r7_add_ext object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' CellUpdateConfirm_r7_add_ext object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for CellUpdateConfirm_r7_add_ext

			    // Methods for field "v780NCEs"
			    public V780NCEs getV780NCEs()
			    {
				return (V780NCEs)mComponents[2];
			    }
			    
			    public void setV780NCEs(V780NCEs v780NCEs)
			    {
				mComponents[2] = v780NCEs;
			    }
			    
			    public boolean hasV780NCEs()
			    {
				return componentIsPresent(2);
			    }
			    
			    public void deleteV780NCEs()
			    {
				setComponentAbsent(2);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V780NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V780NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V780NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V780NCEs(CellUpdateConfirm_v780ext_IEs cellUpdateConfirm_v780ext, 
						V860NCEs v860NCEs)
				{
				    setCellUpdateConfirm_v780ext(cellUpdateConfirm_v780ext);
				    setV860NCEs(v860NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V780NCEs(CellUpdateConfirm_v780ext_IEs cellUpdateConfirm_v780ext)
				{
				    setCellUpdateConfirm_v780ext(cellUpdateConfirm_v780ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new CellUpdateConfirm_v780ext_IEs();
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
					    return new CellUpdateConfirm_v780ext_IEs();
					case 1:
					    return new V860NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "cellUpdateConfirm_v780ext"
				public CellUpdateConfirm_v780ext_IEs getCellUpdateConfirm_v780ext()
				{
				    return (CellUpdateConfirm_v780ext_IEs)mComponents[0];
				}
				
				public void setCellUpdateConfirm_v780ext(CellUpdateConfirm_v780ext_IEs cellUpdateConfirm_v780ext)
				{
				    mComponents[0] = cellUpdateConfirm_v780ext;
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
				    public V860NCEs(CellUpdateConfirm_v860ext_IEs cellUpdateConfirm_v860ext, 
						    NonCriticalExtensions nonCriticalExtensions)
				    {
					setCellUpdateConfirm_v860ext(cellUpdateConfirm_v860ext);
					setNonCriticalExtensions(nonCriticalExtensions);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V860NCEs(CellUpdateConfirm_v860ext_IEs cellUpdateConfirm_v860ext)
				    {
					setCellUpdateConfirm_v860ext(cellUpdateConfirm_v860ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new CellUpdateConfirm_v860ext_IEs();
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
						return new CellUpdateConfirm_v860ext_IEs();
					    case 1:
						return new NonCriticalExtensions();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "cellUpdateConfirm_v860ext"
				    public CellUpdateConfirm_v860ext_IEs getCellUpdateConfirm_v860ext()
				    {
					return (CellUpdateConfirm_v860ext_IEs)mComponents[0];
				    }
				    
				    public void setCellUpdateConfirm_v860ext(CellUpdateConfirm_v860ext_IEs cellUpdateConfirm_v860ext)
				    {
					mComponents[0] = cellUpdateConfirm_v860ext;
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
						"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V860NCEs$NonCriticalExtensions"
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
					    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V860NCEs"
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
								"CellUpdateConfirm_v860ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"CellUpdateConfirm-v860ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "CellUpdateConfirm_v860ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "CellUpdateConfirm_v860ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "cellUpdateConfirm-v860ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V860NCEs$NonCriticalExtensions"
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
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs"
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
							    "CellUpdateConfirm_v780ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "CellUpdateConfirm-v780ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"CellUpdateConfirm_v780ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"CellUpdateConfirm_v780ext_IEs"
							    )
							),
							0
						    )
						),
						"cellUpdateConfirm-v780ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V860NCEs"
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
				 * Get the type descriptor (TypeInfo) of 'this' V780NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V780NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V780NCEs

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
				    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7"
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
							"CellUpdateConfirm_r7_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"CellUpdateConfirm-r7-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_r7_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_r7_IEs"
							)
						    ),
						    0
						)
					    ),
					    "cellUpdateConfirm-r7",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$CellUpdateConfirm_r7_add_ext"
						)
					    ),
					    "cellUpdateConfirm-r7-add-ext",
					    1,
					    3,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs"
						)
					    ),
					    "v780NCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' R7 object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' R7 object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for R7

			// Methods for field "criticalExtensions"
			public static CriticalExtensions3 createCriticalExtensions3WithCriticalExtensions(CriticalExtensions4 criticalExtensions)
			{
			    CriticalExtensions3 __object = new CriticalExtensions3();

			    __object.setCriticalExtensions(criticalExtensions);
			    return __object;
			}
			
			public boolean hasCriticalExtensions()
			{
			    return getChosenFlag() == criticalExtensions_chosen;
			}
			
			public void setCriticalExtensions(CriticalExtensions4 criticalExtensions)
			{
			    setChosenValue(criticalExtensions);
			    setChosenFlag(criticalExtensions_chosen);
			}
			
			
			
			/**
			 * Define the ASN1 Type CriticalExtensions4 from ASN1 Module PDU_definitions.
			 * @see Choice
			 */
			public static class CriticalExtensions4 extends Choice {
			    
			    /**
			     * The default constructor.
			     */
			    public CriticalExtensions4()
			    {
			    }
			    
			    public static final  int  r8_chosen = 1;
			    public static final  int  criticalExtensions_chosen = 2;
			    
			    // Methods for field "r8"
			    public static CriticalExtensions4 createCriticalExtensions4WithR8(R8 r8)
			    {
				CriticalExtensions4 __object = new CriticalExtensions4();

				__object.setR8(r8);
				return __object;
			    }
			    
			    public boolean hasR8()
			    {
				return getChosenFlag() == r8_chosen;
			    }
			    
			    public void setR8(R8 r8)
			    {
				setChosenValue(r8);
				setChosenFlag(r8_chosen);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type R8 from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class R8 extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public R8()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public R8(CellUpdateConfirm_r8_IEs cellUpdateConfirm_r8, 
						BitString cellUpdateConfirm_r8_add_ext, 
						V7d0NCEs v7d0NCEs)
				{
				    setCellUpdateConfirm_r8(cellUpdateConfirm_r8);
				    setCellUpdateConfirm_r8_add_ext(cellUpdateConfirm_r8_add_ext);
				    setV7d0NCEs(v7d0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public R8(CellUpdateConfirm_r8_IEs cellUpdateConfirm_r8)
				{
				    setCellUpdateConfirm_r8(cellUpdateConfirm_r8);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new CellUpdateConfirm_r8_IEs();
				    mComponents[1] = new BitString();
				    mComponents[2] = new V7d0NCEs();
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
					    return new CellUpdateConfirm_r8_IEs();
					case 1:
					    return new BitString();
					case 2:
					    return new V7d0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "cellUpdateConfirm_r8"
				public CellUpdateConfirm_r8_IEs getCellUpdateConfirm_r8()
				{
				    return (CellUpdateConfirm_r8_IEs)mComponents[0];
				}
				
				public void setCellUpdateConfirm_r8(CellUpdateConfirm_r8_IEs cellUpdateConfirm_r8)
				{
				    mComponents[0] = cellUpdateConfirm_r8;
				}
				
				
				// Methods for field "cellUpdateConfirm_r8_add_ext"
				public BitString getCellUpdateConfirm_r8_add_ext()
				{
				    return (BitString)mComponents[1];
				}
				
				public void setCellUpdateConfirm_r8_add_ext(BitString cellUpdateConfirm_r8_add_ext)
				{
				    mComponents[1] = cellUpdateConfirm_r8_add_ext;
				}
				
				public boolean hasCellUpdateConfirm_r8_add_ext()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteCellUpdateConfirm_r8_add_ext()
				{
				    setComponentAbsent(1);
				}
				
				
				// Methods for field "v7d0NCEs"
				public V7d0NCEs getV7d0NCEs()
				{
				    return (V7d0NCEs)mComponents[2];
				}
				
				public void setV7d0NCEs(V7d0NCEs v7d0NCEs)
				{
				    mComponents[2] = v7d0NCEs;
				}
				
				public boolean hasV7d0NCEs()
				{
				    return componentIsPresent(2);
				}
				
				public void deleteV7d0NCEs()
				{
				    setComponentAbsent(2);
				}
				
				
				
				/**
				 * Define the ASN1 Type V7d0NCEs from ASN1 Module PDU_definitions.
				 * @see Sequence
				 */
				public static class V7d0NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V7d0NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V7d0NCEs(CellUpdateConfirm_v7d0ext_IEs cellUpdateConfirm_v7d0ext, 
						    V890NCEs v890NCEs)
				    {
					setCellUpdateConfirm_v7d0ext(cellUpdateConfirm_v7d0ext);
					setV890NCEs(v890NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V7d0NCEs(CellUpdateConfirm_v7d0ext_IEs cellUpdateConfirm_v7d0ext)
				    {
					setCellUpdateConfirm_v7d0ext(cellUpdateConfirm_v7d0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new CellUpdateConfirm_v7d0ext_IEs();
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
						return new CellUpdateConfirm_v7d0ext_IEs();
					    case 1:
						return new V890NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "cellUpdateConfirm_v7d0ext"
				    public CellUpdateConfirm_v7d0ext_IEs getCellUpdateConfirm_v7d0ext()
				    {
					return (CellUpdateConfirm_v7d0ext_IEs)mComponents[0];
				    }
				    
				    public void setCellUpdateConfirm_v7d0ext(CellUpdateConfirm_v7d0ext_IEs cellUpdateConfirm_v7d0ext)
				    {
					mComponents[0] = cellUpdateConfirm_v7d0ext;
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
				     * Define the ASN1 Type V890NCEs from ASN1 Module PDU_definitions.
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
					public V890NCEs(CellUpdateConfirm_v890ext_IEs cellUpdateConfirm_v890ext, 
							V8a0NCEs v8a0NCEs)
					{
					    setCellUpdateConfirm_v890ext(cellUpdateConfirm_v890ext);
					    setV8a0NCEs(v8a0NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V890NCEs(CellUpdateConfirm_v890ext_IEs cellUpdateConfirm_v890ext)
					{
					    setCellUpdateConfirm_v890ext(cellUpdateConfirm_v890ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new CellUpdateConfirm_v890ext_IEs();
					    mComponents[1] = new V8a0NCEs();
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
						    return new CellUpdateConfirm_v890ext_IEs();
						case 1:
						    return new V8a0NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "cellUpdateConfirm_v890ext"
					public CellUpdateConfirm_v890ext_IEs getCellUpdateConfirm_v890ext()
					{
					    return (CellUpdateConfirm_v890ext_IEs)mComponents[0];
					}
					
					public void setCellUpdateConfirm_v890ext(CellUpdateConfirm_v890ext_IEs cellUpdateConfirm_v890ext)
					{
					    mComponents[0] = cellUpdateConfirm_v890ext;
					}
					
					
					// Methods for field "v8a0NCEs"
					public V8a0NCEs getV8a0NCEs()
					{
					    return (V8a0NCEs)mComponents[1];
					}
					
					public void setV8a0NCEs(V8a0NCEs v8a0NCEs)
					{
					    mComponents[1] = v8a0NCEs;
					}
					
					public boolean hasV8a0NCEs()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteV8a0NCEs()
					{
					    setComponentAbsent(1);
					}
					
					
					
					/**
					 * Define the ASN1 Type V8a0NCEs from ASN1 Module PDU_definitions.
					 * @see Sequence
					 */
					public static class V8a0NCEs extends Sequence {
					    
					    /**
					     * The default constructor.
					     */
					    public V8a0NCEs()
					    {
					    }
					    
					    /**
					     * Construct with AbstractData components.
					     */
					    public V8a0NCEs(CellUpdateConfirm_v8a0ext_IEs cellUpdateConfirm_v8a0ext, 
							    V7f0NCEs v7f0NCEs)
					    {
						setCellUpdateConfirm_v8a0ext(cellUpdateConfirm_v8a0ext);
						setV7f0NCEs(v7f0NCEs);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public V8a0NCEs(CellUpdateConfirm_v8a0ext_IEs cellUpdateConfirm_v8a0ext)
					    {
						setCellUpdateConfirm_v8a0ext(cellUpdateConfirm_v8a0ext);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new CellUpdateConfirm_v8a0ext_IEs();
						mComponents[1] = new V7f0NCEs();
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
							return new CellUpdateConfirm_v8a0ext_IEs();
						    case 1:
							return new V7f0NCEs();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "cellUpdateConfirm_v8a0ext"
					    public CellUpdateConfirm_v8a0ext_IEs getCellUpdateConfirm_v8a0ext()
					    {
						return (CellUpdateConfirm_v8a0ext_IEs)mComponents[0];
					    }
					    
					    public void setCellUpdateConfirm_v8a0ext(CellUpdateConfirm_v8a0ext_IEs cellUpdateConfirm_v8a0ext)
					    {
						mComponents[0] = cellUpdateConfirm_v8a0ext;
					    }
					    
					    
					    // Methods for field "v7f0NCEs"
					    public V7f0NCEs getV7f0NCEs()
					    {
						return (V7f0NCEs)mComponents[1];
					    }
					    
					    public void setV7f0NCEs(V7f0NCEs v7f0NCEs)
					    {
						mComponents[1] = v7f0NCEs;
					    }
					    
					    public boolean hasV7f0NCEs()
					    {
						return componentIsPresent(1);
					    }
					    
					    public void deleteV7f0NCEs()
					    {
						setComponentAbsent(1);
					    }
					    
					    
					    
					    /**
					     * Define the ASN1 Type V7f0NCEs from ASN1 Module PDU_definitions.
					     * @see Sequence
					     */
					    public static class V7f0NCEs extends Sequence {
						
						/**
						 * The default constructor.
						 */
						public V7f0NCEs()
						{
						}
						
						/**
						 * Construct with AbstractData components.
						 */
						public V7f0NCEs(CellUpdateConfirm_v7f0ext_IEs cellUpdateConfirm_v7f0ext, 
								V7g0NCEs v7g0NCEs)
						{
						    setCellUpdateConfirm_v7f0ext(cellUpdateConfirm_v7f0ext);
						    setV7g0NCEs(v7g0NCEs);
						}
						
						/**
						 * Construct with required components.
						 */
						public V7f0NCEs(CellUpdateConfirm_v7f0ext_IEs cellUpdateConfirm_v7f0ext)
						{
						    setCellUpdateConfirm_v7f0ext(cellUpdateConfirm_v7f0ext);
						}
						
						public void initComponents()
						{
						    mComponents[0] = new CellUpdateConfirm_v7f0ext_IEs();
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
							    return new CellUpdateConfirm_v7f0ext_IEs();
							case 1:
							    return new V7g0NCEs();
							default:
							    throw new InternalError("AbstractCollection.createInstance()");
						    }
						    
						}
						
						
						// Methods for field "cellUpdateConfirm_v7f0ext"
						public CellUpdateConfirm_v7f0ext_IEs getCellUpdateConfirm_v7f0ext()
						{
						    return (CellUpdateConfirm_v7f0ext_IEs)mComponents[0];
						}
						
						public void setCellUpdateConfirm_v7f0ext(CellUpdateConfirm_v7f0ext_IEs cellUpdateConfirm_v7f0ext)
						{
						    mComponents[0] = cellUpdateConfirm_v7f0ext;
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
						    public V7g0NCEs(CellUpdateConfirm_v7g0ext_IEs cellUpdateConfirm_v7g0ext, 
								    NonCriticalExtensions nonCriticalExtensions)
						    {
							setCellUpdateConfirm_v7g0ext(cellUpdateConfirm_v7g0ext);
							setNonCriticalExtensions(nonCriticalExtensions);
						    }
						    
						    /**
						     * Construct with required components.
						     */
						    public V7g0NCEs(CellUpdateConfirm_v7g0ext_IEs cellUpdateConfirm_v7g0ext)
						    {
							setCellUpdateConfirm_v7g0ext(cellUpdateConfirm_v7g0ext);
						    }
						    
						    public void initComponents()
						    {
							mComponents[0] = new CellUpdateConfirm_v7g0ext_IEs();
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
								return new CellUpdateConfirm_v7g0ext_IEs();
							    case 1:
								return new NonCriticalExtensions();
							    default:
								throw new InternalError("AbstractCollection.createInstance()");
							}
							
						    }
						    
						    
						    // Methods for field "cellUpdateConfirm_v7g0ext"
						    public CellUpdateConfirm_v7g0ext_IEs getCellUpdateConfirm_v7g0ext()
						    {
							return (CellUpdateConfirm_v7g0ext_IEs)mComponents[0];
						    }
						    
						    public void setCellUpdateConfirm_v7g0ext(CellUpdateConfirm_v7g0ext_IEs cellUpdateConfirm_v7g0ext)
						    {
							mComponents[0] = cellUpdateConfirm_v7g0ext;
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
								"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs$V7f0NCEs$V7g0NCEs$NonCriticalExtensions"
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
							    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs$V7f0NCEs$V7g0NCEs"
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
										"CellUpdateConfirm_v7g0ext_IEs"
									    ),
									    new QName (
										"PDU-definitions",
										"CellUpdateConfirm-v7g0ext-IEs"
									    ),
									    12314,
									    null,
									    new FieldsRef (
										new QName (
										    "rrc.pdu_definitions",
										    "CellUpdateConfirm_v7g0ext_IEs"
										)
									    ),
									    0,
									    new TagDecodersRef (
										new QName (
										    "rrc.pdu_definitions",
										    "CellUpdateConfirm_v7g0ext_IEs"
										)
									    ),
									    0
									)
								    ),
								    "cellUpdateConfirm-v7g0ext",
								    0,
								    2,
								    null
								),
								new SequenceFieldInfo (
								    new TypeInfoRef (
									new QName (
									    "rrc.pdu_definitions",
									    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs$V7f0NCEs$V7g0NCEs$NonCriticalExtensions"
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
							"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs$V7f0NCEs"
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
									    "CellUpdateConfirm_v7f0ext_IEs"
									),
									new QName (
									    "PDU-definitions",
									    "CellUpdateConfirm-v7f0ext-IEs"
									),
									12314,
									null,
									new FieldsRef (
									    new QName (
										"rrc.pdu_definitions",
										"CellUpdateConfirm_v7f0ext_IEs"
									    )
									),
									0,
									new TagDecodersRef (
									    new QName (
										"rrc.pdu_definitions",
										"CellUpdateConfirm_v7f0ext_IEs"
									    )
									),
									0
								    )
								),
								"cellUpdateConfirm-v7f0ext",
								0,
								2,
								null
							    ),
							    new SequenceFieldInfo (
								new TypeInfoRef (
								    new QName (
									"rrc.pdu_definitions",
									"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs$V7f0NCEs$V7g0NCEs"
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
						 * Get the type descriptor (TypeInfo) of 'this' V7f0NCEs object.
						 */
						public TypeInfo getTypeInfo()
						{
						    return c_typeinfo;
						}
						
						/**
						 * Get the static type descriptor (TypeInfo) of 'this' V7f0NCEs object.
						 */
						public static TypeInfo getStaticTypeInfo()
						{
						    return c_typeinfo;
						}
						
					    } // End class definition for V7f0NCEs

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
						    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs"
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
									"CellUpdateConfirm_v8a0ext_IEs"
								    ),
								    new QName (
									"PDU-definitions",
									"CellUpdateConfirm-v8a0ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.pdu_definitions",
									    "CellUpdateConfirm_v8a0ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.pdu_definitions",
									    "CellUpdateConfirm_v8a0ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "cellUpdateConfirm-v8a0ext",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.pdu_definitions",
								    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs$V7f0NCEs"
								)
							    ),
							    "v7f0NCEs",
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
					     * Get the type descriptor (TypeInfo) of 'this' V8a0NCEs object.
					     */
					    public TypeInfo getTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					    /**
					     * Get the static type descriptor (TypeInfo) of 'this' V8a0NCEs object.
					     */
					    public static TypeInfo getStaticTypeInfo()
					    {
						return c_typeinfo;
					    }
					    
					} // End class definition for V8a0NCEs

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
						"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs"
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
								    "CellUpdateConfirm_v890ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "CellUpdateConfirm-v890ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"CellUpdateConfirm_v890ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"CellUpdateConfirm_v890ext_IEs"
								    )
								),
								0
							    )
							),
							"cellUpdateConfirm-v890ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs"
							    )
							),
							"v8a0NCEs",
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
					    "rrc.pdu_definitions",
					    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs"
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
								"CellUpdateConfirm_v7d0ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"CellUpdateConfirm-v7d0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "CellUpdateConfirm_v7d0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "CellUpdateConfirm_v7d0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "cellUpdateConfirm-v7d0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs"
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
				     * Get the type descriptor (TypeInfo) of 'this' V7d0NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V7d0NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V7d0NCEs

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
					"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8"
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
							    "CellUpdateConfirm_r8_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "CellUpdateConfirm-r8-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"CellUpdateConfirm_r8_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"CellUpdateConfirm_r8_IEs"
							    )
							),
							0
						    )
						),
						"cellUpdateConfirm-r8",
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
						"cellUpdateConfirm-r8-add-ext",
						1,
						3,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs"
						    )
						),
						"v7d0NCEs",
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
				 * Get the type descriptor (TypeInfo) of 'this' R8 object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' R8 object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for R8

			    // Methods for field "criticalExtensions"
			    public static CriticalExtensions4 createCriticalExtensions4WithCriticalExtensions(CriticalExtensions5 criticalExtensions)
			    {
				CriticalExtensions4 __object = new CriticalExtensions4();

				__object.setCriticalExtensions(criticalExtensions);
				return __object;
			    }
			    
			    public boolean hasCriticalExtensions()
			    {
				return getChosenFlag() == criticalExtensions_chosen;
			    }
			    
			    public void setCriticalExtensions(CriticalExtensions5 criticalExtensions)
			    {
				setChosenValue(criticalExtensions);
				setChosenFlag(criticalExtensions_chosen);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type CriticalExtensions5 from ASN1 Module PDU_definitions.
			     * @see Choice
			     */
			    public static class CriticalExtensions5 extends Choice {
				
				/**
				 * The default constructor.
				 */
				public CriticalExtensions5()
				{
				}
				
				public static final  int  r9_chosen = 1;
				public static final  int  criticalExtensions_chosen = 2;
				
				// Methods for field "r9"
				public static CriticalExtensions5 createCriticalExtensions5WithR9(R9 r9)
				{
				    CriticalExtensions5 __object = new CriticalExtensions5();

				    __object.setR9(r9);
				    return __object;
				}
				
				public boolean hasR9()
				{
				    return getChosenFlag() == r9_chosen;
				}
				
				public void setR9(R9 r9)
				{
				    setChosenValue(r9);
				    setChosenFlag(r9_chosen);
				}
				
				
				
				/**
				 * Define the ASN1 Type R9 from ASN1 Module PDU_definitions.
				 * @see Sequence
				 */
				public static class R9 extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public R9()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public R9(CellUpdateConfirm_r9_IEs cellUpdateConfirm_r9, 
						    BitString cellUpdateConfirm_r9_add_ext, 
						    NonCriticalExtensions nonCriticalExtensions)
				    {
					setCellUpdateConfirm_r9(cellUpdateConfirm_r9);
					setCellUpdateConfirm_r9_add_ext(cellUpdateConfirm_r9_add_ext);
					setNonCriticalExtensions(nonCriticalExtensions);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public R9(CellUpdateConfirm_r9_IEs cellUpdateConfirm_r9)
				    {
					setCellUpdateConfirm_r9(cellUpdateConfirm_r9);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new CellUpdateConfirm_r9_IEs();
					mComponents[1] = new BitString();
					mComponents[2] = new NonCriticalExtensions();
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
						return new CellUpdateConfirm_r9_IEs();
					    case 1:
						return new BitString();
					    case 2:
						return new NonCriticalExtensions();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "cellUpdateConfirm_r9"
				    public CellUpdateConfirm_r9_IEs getCellUpdateConfirm_r9()
				    {
					return (CellUpdateConfirm_r9_IEs)mComponents[0];
				    }
				    
				    public void setCellUpdateConfirm_r9(CellUpdateConfirm_r9_IEs cellUpdateConfirm_r9)
				    {
					mComponents[0] = cellUpdateConfirm_r9;
				    }
				    
				    
				    // Methods for field "cellUpdateConfirm_r9_add_ext"
				    public BitString getCellUpdateConfirm_r9_add_ext()
				    {
					return (BitString)mComponents[1];
				    }
				    
				    public void setCellUpdateConfirm_r9_add_ext(BitString cellUpdateConfirm_r9_add_ext)
				    {
					mComponents[1] = cellUpdateConfirm_r9_add_ext;
				    }
				    
				    public boolean hasCellUpdateConfirm_r9_add_ext()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteCellUpdateConfirm_r9_add_ext()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    // Methods for field "nonCriticalExtensions"
				    public NonCriticalExtensions getNonCriticalExtensions()
				    {
					return (NonCriticalExtensions)mComponents[2];
				    }
				    
				    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
				    {
					mComponents[2] = nonCriticalExtensions;
				    }
				    
				    public boolean hasNonCriticalExtensions()
				    {
					return componentIsPresent(2);
				    }
				    
				    public void deleteNonCriticalExtensions()
				    {
					setComponentAbsent(2);
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
						    (short)0x8002
						}
					    ),
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9$NonCriticalExtensions"
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
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9"
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
								"CellUpdateConfirm_r9_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"CellUpdateConfirm-r9-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "CellUpdateConfirm_r9_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "CellUpdateConfirm_r9_IEs"
								)
							    ),
							    0
							)
						    ),
						    "cellUpdateConfirm-r9",
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
						    "cellUpdateConfirm-r9-add-ext",
						    1,
						    3,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9$NonCriticalExtensions"
							)
						    ),
						    "nonCriticalExtensions",
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
				     * Get the type descriptor (TypeInfo) of 'this' R9 object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' R9 object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for R9

				// Methods for field "criticalExtensions"
				public static CriticalExtensions5 createCriticalExtensions5WithCriticalExtensions(CriticalExtensions6 criticalExtensions)
				{
				    CriticalExtensions5 __object = new CriticalExtensions5();

				    __object.setCriticalExtensions(criticalExtensions);
				    return __object;
				}
				
				public boolean hasCriticalExtensions()
				{
				    return getChosenFlag() == criticalExtensions_chosen;
				}
				
				public void setCriticalExtensions(CriticalExtensions6 criticalExtensions)
				{
				    setChosenValue(criticalExtensions);
				    setChosenFlag(criticalExtensions_chosen);
				}
				
				
				
				/**
				 * Define the ASN1 Type CriticalExtensions6 from ASN1 Module PDU_definitions.
				 * @see Choice
				 */
				public static class CriticalExtensions6 extends Choice {
				    
				    /**
				     * The default constructor.
				     */
				    public CriticalExtensions6()
				    {
				    }
				    
				    public static final  int  r10_chosen = 1;
				    public static final  int  criticalExtensions_chosen = 2;
				    
				    // Methods for field "r10"
				    public static CriticalExtensions6 createCriticalExtensions6WithR10(R10 r10)
				    {
					CriticalExtensions6 __object = new CriticalExtensions6();

					__object.setR10(r10);
					return __object;
				    }
				    
				    public boolean hasR10()
				    {
					return getChosenFlag() == r10_chosen;
				    }
				    
				    public void setR10(R10 r10)
				    {
					setChosenValue(r10);
					setChosenFlag(r10_chosen);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type R10 from ASN1 Module PDU_definitions.
				     * @see Sequence
				     */
				    public static class R10 extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public R10()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public R10(CellUpdateConfirm_r10_IEs cellUpdateConfirm_r10, 
							BitString cellUpdateConfirm_r10_add_ext, 
							NonCriticalExtensions nonCriticalExtensions)
					{
					    setCellUpdateConfirm_r10(cellUpdateConfirm_r10);
					    setCellUpdateConfirm_r10_add_ext(cellUpdateConfirm_r10_add_ext);
					    setNonCriticalExtensions(nonCriticalExtensions);
					}
					
					/**
					 * Construct with required components.
					 */
					public R10(CellUpdateConfirm_r10_IEs cellUpdateConfirm_r10)
					{
					    setCellUpdateConfirm_r10(cellUpdateConfirm_r10);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new CellUpdateConfirm_r10_IEs();
					    mComponents[1] = new BitString();
					    mComponents[2] = new NonCriticalExtensions();
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
						    return new CellUpdateConfirm_r10_IEs();
						case 1:
						    return new BitString();
						case 2:
						    return new NonCriticalExtensions();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "cellUpdateConfirm_r10"
					public CellUpdateConfirm_r10_IEs getCellUpdateConfirm_r10()
					{
					    return (CellUpdateConfirm_r10_IEs)mComponents[0];
					}
					
					public void setCellUpdateConfirm_r10(CellUpdateConfirm_r10_IEs cellUpdateConfirm_r10)
					{
					    mComponents[0] = cellUpdateConfirm_r10;
					}
					
					
					// Methods for field "cellUpdateConfirm_r10_add_ext"
					public BitString getCellUpdateConfirm_r10_add_ext()
					{
					    return (BitString)mComponents[1];
					}
					
					public void setCellUpdateConfirm_r10_add_ext(BitString cellUpdateConfirm_r10_add_ext)
					{
					    mComponents[1] = cellUpdateConfirm_r10_add_ext;
					}
					
					public boolean hasCellUpdateConfirm_r10_add_ext()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteCellUpdateConfirm_r10_add_ext()
					{
					    setComponentAbsent(1);
					}
					
					
					// Methods for field "nonCriticalExtensions"
					public NonCriticalExtensions getNonCriticalExtensions()
					{
					    return (NonCriticalExtensions)mComponents[2];
					}
					
					public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
					{
					    mComponents[2] = nonCriticalExtensions;
					}
					
					public boolean hasNonCriticalExtensions()
					{
					    return componentIsPresent(2);
					}
					
					public void deleteNonCriticalExtensions()
					{
					    setComponentAbsent(2);
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
							(short)0x8002
						    }
						),
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10$NonCriticalExtensions"
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
						    (short)0x8000
						}
					    ),
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10"
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
								    "CellUpdateConfirm_r10_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "CellUpdateConfirm-r10-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"CellUpdateConfirm_r10_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"CellUpdateConfirm_r10_IEs"
								    )
								),
								0
							    )
							),
							"cellUpdateConfirm-r10",
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
							"cellUpdateConfirm-r10-add-ext",
							1,
							3,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10$NonCriticalExtensions"
							    )
							),
							"nonCriticalExtensions",
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
					 * Get the type descriptor (TypeInfo) of 'this' R10 object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' R10 object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for R10

				    // Methods for field "criticalExtensions"
				    public static CriticalExtensions6 createCriticalExtensions6WithCriticalExtensions(CriticalExtensions7 criticalExtensions)
				    {
					CriticalExtensions6 __object = new CriticalExtensions6();

					__object.setCriticalExtensions(criticalExtensions);
					return __object;
				    }
				    
				    public boolean hasCriticalExtensions()
				    {
					return getChosenFlag() == criticalExtensions_chosen;
				    }
				    
				    public void setCriticalExtensions(CriticalExtensions7 criticalExtensions)
				    {
					setChosenValue(criticalExtensions);
					setChosenFlag(criticalExtensions_chosen);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type CriticalExtensions7 from ASN1 Module PDU_definitions.
				     * @see Sequence
				     */
				    public static class CriticalExtensions7 extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public CriticalExtensions7()
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
						"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$CriticalExtensions7"
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
					 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions7 object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions7 object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for CriticalExtensions7

				    // Method to create a specific choice instance
				    public AbstractData createInstance(int chosen)
				    {
					switch (chosen) {
					    case r10_chosen:
						return new R10();
					    case criticalExtensions_chosen:
						return new CriticalExtensions7();
					    default:
						throw new InternalError("Choice.createInstance()");
					}
					
				    }
				    
				    /**
				     * Initialize the type descriptor.
				     */
				    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
					new Tags (
					    new short[] {
						(short)0x8001
					    }
					),
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6"
					),
					new QName (
					    "builtin",
					    "CHOICE"
					),
					12314,
					null,
					new Fields (
					    new FieldInfo[] {
						new FieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10"
							)
						    ),
						    "r10",
						    0,
						    2
						),
						new FieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$CriticalExtensions7"
							)
						    ),
						    "criticalExtensions",
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
				     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions6 object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions6 object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for CriticalExtensions6

				// Method to create a specific choice instance
				public AbstractData createInstance(int chosen)
				{
				    switch (chosen) {
					case r9_chosen:
					    return new R9();
					case criticalExtensions_chosen:
					    return new CriticalExtensions6();
					default:
					    throw new InternalError("Choice.createInstance()");
				    }
				    
				}
				
				/**
				 * Initialize the type descriptor.
				 */
				private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
				    ),
				    new QName (
					"builtin",
					"CHOICE"
				    ),
				    12314,
				    null,
				    new Fields (
					new FieldInfo[] {
					    new FieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9"
						    )
						),
						"r9",
						0,
						2
					    ),
					    new FieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6"
						    )
						),
						"criticalExtensions",
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
				 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions5 object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions5 object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for CriticalExtensions5

			    // Method to create a specific choice instance
			    public AbstractData createInstance(int chosen)
			    {
				switch (chosen) {
				    case r8_chosen:
					return new R8();
				    case criticalExtensions_chosen:
					return new CriticalExtensions5();
				    default:
					throw new InternalError("Choice.createInstance()");
				}
				
			    }
			    
			    /**
			     * Initialize the type descriptor.
			     */
			    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
				),
				new QName (
				    "builtin",
				    "CHOICE"
				),
				12314,
				null,
				new Fields (
				    new FieldInfo[] {
					new FieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8"
						)
					    ),
					    "r8",
					    0,
					    2
					),
					new FieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
						)
					    ),
					    "criticalExtensions",
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
			     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions4 object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions4 object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for CriticalExtensions4

			// Method to create a specific choice instance
			public AbstractData createInstance(int chosen)
			{
			    switch (chosen) {
				case r7_chosen:
				    return new R7();
				case criticalExtensions_chosen:
				    return new CriticalExtensions4();
				default:
				    throw new InternalError("Choice.createInstance()");
			    }
			    
			}
			
			/**
			 * Initialize the type descriptor.
			 */
			private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
			    ),
			    new QName (
				"builtin",
				"CHOICE"
			    ),
			    12314,
			    null,
			    new Fields (
				new FieldInfo[] {
				    new FieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7"
					    )
					),
					"r7",
					0,
					2
				    ),
				    new FieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
					    )
					),
					"criticalExtensions",
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
			 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions3 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions3 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for CriticalExtensions3

		    // Method to create a specific choice instance
		    public AbstractData createInstance(int chosen)
		    {
			switch (chosen) {
			    case r6_chosen:
				return new R6();
			    case criticalExtensions_chosen:
				return new CriticalExtensions3();
			    default:
				throw new InternalError("Choice.createInstance()");
			}
			
		    }
		    
		    /**
		     * Initialize the type descriptor.
		     */
		    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
			new Tags (
			    new short[] {
				(short)0x8001
			    }
			),
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
			),
			new QName (
			    "builtin",
			    "CHOICE"
			),
			12314,
			null,
			new Fields (
			    new FieldInfo[] {
				new FieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6"
					)
				    ),
				    "r6",
				    0,
				    2
				),
				new FieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
					)
				    ),
				    "criticalExtensions",
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
		     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions2 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions2 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for CriticalExtensions2

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case r5_chosen:
			    return new R5();
			case criticalExtensions_chosen:
			    return new CriticalExtensions2();
			default:
			    throw new InternalError("Choice.createInstance()");
		    }
		    
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
		    new Tags (
			new short[] {
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1"
		    ),
		    new QName (
			"builtin",
			"CHOICE"
		    ),
		    12314,
		    null,
		    new Fields (
			new FieldInfo[] {
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5"
				    )
				),
				"r5",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
				    )
				),
				"criticalExtensions",
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
		 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions1 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions1 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for CriticalExtensions1

	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case r4_chosen:
			return new R4();
		    case criticalExtensions_chosen:
			return new CriticalExtensions1();
		    default:
			throw new InternalError("Choice.createInstance()");
		}
		
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
		new Tags (
		    new short[] {
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions"
		),
		new QName (
		    "builtin",
		    "CHOICE"
		),
		12314,
		null,
		new Fields (
		    new FieldInfo[] {
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$R4"
				)
			    ),
			    "r4",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions$CriticalExtensions1"
				)
			    ),
			    "criticalExtensions",
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
		"CellUpdateConfirm_CCCH$Later_than_r3"
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
				    "U_RNTI"
				),
				new QName (
				    "InformationElements",
				    "U-RNTI"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"U_RNTI"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"U_RNTI"
				    )
				),
				0
			    )
			),
			"u-RNTI",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"CellUpdateConfirm_CCCH$Later_than_r3$CriticalExtensions"
			    )
			),
			"criticalExtensions",
			2,
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
	    "CellUpdateConfirm_CCCH"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdateConfirm-CCCH"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdateConfirm_CCCH$R3"
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
			    "CellUpdateConfirm_CCCH$Later_than_r3"
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
     * Get the type descriptor (TypeInfo) of 'this' CellUpdateConfirm_CCCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdateConfirm_CCCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdateConfirm_CCCH
