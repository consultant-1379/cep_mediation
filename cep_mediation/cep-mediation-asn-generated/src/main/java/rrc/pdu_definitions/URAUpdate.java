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
 * Define the ASN1 Type URAUpdate from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class URAUpdate extends Sequence {
    
    /**
     * The default constructor.
     */
    public URAUpdate()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public URAUpdate(rrc.informationelements.U_RNTI u_RNTI, 
		    rrc.informationelements.URA_UpdateCause ura_UpdateCause, 
		    rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo protocolErrorIndicator, 
		    LaterNCEs laterNCEs)
    {
	setU_RNTI(u_RNTI);
	setUra_UpdateCause(ura_UpdateCause);
	setProtocolErrorIndicator(protocolErrorIndicator);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public URAUpdate(rrc.informationelements.U_RNTI u_RNTI, 
		    rrc.informationelements.URA_UpdateCause ura_UpdateCause, 
		    rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo protocolErrorIndicator)
    {
	setU_RNTI(u_RNTI);
	setUra_UpdateCause(ura_UpdateCause);
	setProtocolErrorIndicator(protocolErrorIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.U_RNTI();
	mComponents[1] = rrc.informationelements.URA_UpdateCause.changeOfURA;
	mComponents[2] = new rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo();
	mComponents[3] = new LaterNCEs();
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
		return new rrc.informationelements.U_RNTI();
	    case 1:
		return rrc.informationelements.URA_UpdateCause.changeOfURA;
	    case 2:
		return new rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo();
	    case 3:
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
    
    
    // Methods for field "ura_UpdateCause"
    public rrc.informationelements.URA_UpdateCause getUra_UpdateCause()
    {
	return (rrc.informationelements.URA_UpdateCause)mComponents[1];
    }
    
    public void setUra_UpdateCause(rrc.informationelements.URA_UpdateCause ura_UpdateCause)
    {
	mComponents[1] = ura_UpdateCause;
    }
    
    
    // Methods for field "protocolErrorIndicator"
    public rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo getProtocolErrorIndicator()
    {
	return (rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo)mComponents[2];
    }
    
    public void setProtocolErrorIndicator(rrc.informationelements.ProtocolErrorIndicatorWithMoreInfo protocolErrorIndicator)
    {
	mComponents[2] = protocolErrorIndicator;
    }
    
    
    // Methods for field "laterNCEs"
    public LaterNCEs getLaterNCEs()
    {
	return (LaterNCEs)mComponents[3];
    }
    
    public void setLaterNCEs(LaterNCEs laterNCEs)
    {
	mComponents[3] = laterNCEs;
    }
    
    public boolean hasLaterNCEs()
    {
	return componentIsPresent(3);
    }
    
    public void deleteLaterNCEs()
    {
	setComponentAbsent(3);
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
	public LaterNCEs(UraUpdate_r3_add_ext uraUpdate_r3_add_ext, 
			V770NCEs v770NCEs)
	{
	    setUraUpdate_r3_add_ext(uraUpdate_r3_add_ext);
	    setV770NCEs(v770NCEs);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UraUpdate_r3_add_ext();
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
		    return new UraUpdate_r3_add_ext();
		case 1:
		    return new V770NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "uraUpdate_r3_add_ext"
	public UraUpdate_r3_add_ext getUraUpdate_r3_add_ext()
	{
	    return (UraUpdate_r3_add_ext)mComponents[0];
	}
	
	public void setUraUpdate_r3_add_ext(UraUpdate_r3_add_ext uraUpdate_r3_add_ext)
	{
	    mComponents[0] = uraUpdate_r3_add_ext;
	}
	
	public boolean hasUraUpdate_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteUraUpdate_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	
	/**
	 * Define the ASN1 Type UraUpdate_r3_add_ext from ASN1 Module PDU_definitions.
	 * @see ContainingBitString
	 */
	public static class UraUpdate_r3_add_ext extends ContainingBitString {
	    
	    /**
	     * The default constructor.
	     */
	    public UraUpdate_r3_add_ext()
	    {
	    }
	    
	    /**
	     * Construct Bit String from a byte array.
	     * All bits considered significant.
	     * @param value the byte array to set this object to.
	     */
	    public UraUpdate_r3_add_ext(byte[] value)
	    {
		super(value);
	    }
	    
	    
	    /**
	     * Construct Bit String from a byte array and significant bits.
	     * @param value the byte array to set this object to.
	     * @param sigBits the number of significant bits.
	     */
	    public UraUpdate_r3_add_ext(byte[] value, int sigBits)
	    {
		super(value, sigBits);
	    }
	    
	    /**
	     * Construct from a contained type value.
	     */
	    public UraUpdate_r3_add_ext(URAUpdate_r3_add_ext_IEs decoded)
	    {
		super(decoded);
	    }
	    
	    // Methods for getting and setting a contained value
	    public URAUpdate_r3_add_ext_IEs getContainedValue()
	    {
		return (URAUpdate_r3_add_ext_IEs)getDecodedValue();
	    }
	    
	    public void setContainedValue(URAUpdate_r3_add_ext_IEs value)
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
		    "URAUpdate$LaterNCEs$UraUpdate_r3_add_ext"
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
			"URAUpdate_r3_add_ext_IEs"
		    )
		),
		null
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' UraUpdate_r3_add_ext object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' UraUpdate_r3_add_ext object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for UraUpdate_r3_add_ext

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
	    public V770NCEs(UraUpdate_v770ext_IEs uraUpdate_v770ext, 
			    V860NCEs v860NCEs)
	    {
		setUraUpdate_v770ext(uraUpdate_v770ext);
		setV860NCEs(v860NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V770NCEs(UraUpdate_v770ext_IEs uraUpdate_v770ext)
	    {
		setUraUpdate_v770ext(uraUpdate_v770ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UraUpdate_v770ext_IEs();
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
			return new UraUpdate_v770ext_IEs();
		    case 1:
			return new V860NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "uraUpdate_v770ext"
	    public UraUpdate_v770ext_IEs getUraUpdate_v770ext()
	    {
		return (UraUpdate_v770ext_IEs)mComponents[0];
	    }
	    
	    public void setUraUpdate_v770ext(UraUpdate_v770ext_IEs uraUpdate_v770ext)
	    {
		mComponents[0] = uraUpdate_v770ext;
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
		public V860NCEs(URAUpdate_v860ext_IEs uraUpdate_v860ext, 
				Va40NCEs va40NCEs)
		{
		    setUraUpdate_v860ext(uraUpdate_v860ext);
		    setVa40NCEs(va40NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V860NCEs(URAUpdate_v860ext_IEs uraUpdate_v860ext)
		{
		    setUraUpdate_v860ext(uraUpdate_v860ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new URAUpdate_v860ext_IEs();
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
			    return new URAUpdate_v860ext_IEs();
			case 1:
			    return new Va40NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "uraUpdate_v860ext"
		public URAUpdate_v860ext_IEs getUraUpdate_v860ext()
		{
		    return (URAUpdate_v860ext_IEs)mComponents[0];
		}
		
		public void setUraUpdate_v860ext(URAUpdate_v860ext_IEs uraUpdate_v860ext)
		{
		    mComponents[0] = uraUpdate_v860ext;
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
		    public Va40NCEs(URAUpdate_va40ext_IEs uraUpdate_va40ext, 
				    NonCriticalExtensions nonCriticalExtensions)
		    {
			setUraUpdate_va40ext(uraUpdate_va40ext);
			setNonCriticalExtensions(nonCriticalExtensions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public Va40NCEs(URAUpdate_va40ext_IEs uraUpdate_va40ext)
		    {
			setUraUpdate_va40ext(uraUpdate_va40ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new URAUpdate_va40ext_IEs();
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
				return new URAUpdate_va40ext_IEs();
			    case 1:
				return new NonCriticalExtensions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "uraUpdate_va40ext"
		    public URAUpdate_va40ext_IEs getUraUpdate_va40ext()
		    {
			return (URAUpdate_va40ext_IEs)mComponents[0];
		    }
		    
		    public void setUraUpdate_va40ext(URAUpdate_va40ext_IEs uraUpdate_va40ext)
		    {
			mComponents[0] = uraUpdate_va40ext;
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
				"URAUpdate$LaterNCEs$V770NCEs$V860NCEs$Va40NCEs$NonCriticalExtensions"
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
			    "URAUpdate$LaterNCEs$V770NCEs$V860NCEs$Va40NCEs"
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
						"URAUpdate_va40ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"URAUpdate-va40ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "URAUpdate_va40ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "URAUpdate_va40ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "uraUpdate-va40ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "URAUpdate$LaterNCEs$V770NCEs$V860NCEs$Va40NCEs$NonCriticalExtensions"
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
			"URAUpdate$LaterNCEs$V770NCEs$V860NCEs"
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
					    "URAUpdate_v860ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "URAUpdate-v860ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"URAUpdate_v860ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"URAUpdate_v860ext_IEs"
					    )
					),
					0
				    )
				),
				"uraUpdate-v860ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"URAUpdate$LaterNCEs$V770NCEs$V860NCEs$Va40NCEs"
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
		    "URAUpdate$LaterNCEs$V770NCEs"
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
					"UraUpdate_v770ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"UraUpdate-v770ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UraUpdate_v770ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UraUpdate_v770ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "uraUpdate-v770ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "URAUpdate$LaterNCEs$V770NCEs$V860NCEs"
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"URAUpdate$LaterNCEs"
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
				"URAUpdate$LaterNCEs$UraUpdate_r3_add_ext"
			    )
			),
			"uraUpdate-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"URAUpdate$LaterNCEs$V770NCEs"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.pdu_definitions",
	    "URAUpdate"
	),
	new QName (
	    "PDU-definitions",
	    "URAUpdate"
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
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"URA_UpdateCause"
			    ),
			    new QName (
				"InformationElements",
				"URA-UpdateCause"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"changeOfURA",
					0
				    ),
				    new MemberListElement (
					"periodicURAUpdate",
					1
				    ),
				    new MemberListElement (
					"dummy",
					2
				    ),
				    new MemberListElement (
					"spare1",
					3
				    )
				}
			    ),
			    0,
			    rrc.informationelements.URA_UpdateCause.changeOfURA
			)
		    ),
		    "ura-UpdateCause",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ProtocolErrorIndicatorWithMoreInfo"
			    ),
			    new QName (
				"InformationElements",
				"ProtocolErrorIndicatorWithMoreInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ProtocolErrorIndicatorWithMoreInfo"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "protocolErrorIndicator",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "URAUpdate$LaterNCEs"
			)
		    ),
		    "laterNCEs",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' URAUpdate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' URAUpdate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for URAUpdate
