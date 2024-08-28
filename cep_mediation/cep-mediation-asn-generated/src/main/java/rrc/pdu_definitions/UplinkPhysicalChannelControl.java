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
 * Define the ASN1 Type UplinkPhysicalChannelControl from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class UplinkPhysicalChannelControl extends Choice {
    
    /**
     * The default constructor.
     */
    public UplinkPhysicalChannelControl()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static UplinkPhysicalChannelControl createUplinkPhysicalChannelControlWithR3(R3 r3)
    {
	UplinkPhysicalChannelControl __object = new UplinkPhysicalChannelControl();

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
	public R3(UplinkPhysicalChannelControl_r3_IEs uplinkPhysicalChannelControl_r3, 
			LaterNCEs laterNCEs)
	{
	    setUplinkPhysicalChannelControl_r3(uplinkPhysicalChannelControl_r3);
	    setLaterNCEs(laterNCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(UplinkPhysicalChannelControl_r3_IEs uplinkPhysicalChannelControl_r3)
	{
	    setUplinkPhysicalChannelControl_r3(uplinkPhysicalChannelControl_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UplinkPhysicalChannelControl_r3_IEs();
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
		    return new UplinkPhysicalChannelControl_r3_IEs();
		case 1:
		    return new LaterNCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "uplinkPhysicalChannelControl_r3"
	public UplinkPhysicalChannelControl_r3_IEs getUplinkPhysicalChannelControl_r3()
	{
	    return (UplinkPhysicalChannelControl_r3_IEs)mComponents[0];
	}
	
	public void setUplinkPhysicalChannelControl_r3(UplinkPhysicalChannelControl_r3_IEs uplinkPhysicalChannelControl_r3)
	{
	    mComponents[0] = uplinkPhysicalChannelControl_r3;
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
	    public LaterNCEs(BitString uplinkPhysicalChannelControl_r3_add_ext, 
			    V4b0NCEs v4b0NCEs)
	    {
		setUplinkPhysicalChannelControl_r3_add_ext(uplinkPhysicalChannelControl_r3_add_ext);
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
	    
	    
	    // Methods for field "uplinkPhysicalChannelControl_r3_add_ext"
	    public BitString getUplinkPhysicalChannelControl_r3_add_ext()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setUplinkPhysicalChannelControl_r3_add_ext(BitString uplinkPhysicalChannelControl_r3_add_ext)
	    {
		mComponents[0] = uplinkPhysicalChannelControl_r3_add_ext;
	    }
	    
	    public boolean hasUplinkPhysicalChannelControl_r3_add_ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteUplinkPhysicalChannelControl_r3_add_ext()
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
		public V4b0NCEs(UplinkPhysicalChannelControl_v4b0ext_IEs uplinkPysicalChannelControl_v4b0ext, 
				NoncriticalExtensions noncriticalExtensions)
		{
		    setUplinkPysicalChannelControl_v4b0ext(uplinkPysicalChannelControl_v4b0ext);
		    setNoncriticalExtensions(noncriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public V4b0NCEs(UplinkPhysicalChannelControl_v4b0ext_IEs uplinkPysicalChannelControl_v4b0ext)
		{
		    setUplinkPysicalChannelControl_v4b0ext(uplinkPysicalChannelControl_v4b0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UplinkPhysicalChannelControl_v4b0ext_IEs();
		    mComponents[1] = new NoncriticalExtensions();
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
			    return new UplinkPhysicalChannelControl_v4b0ext_IEs();
			case 1:
			    return new NoncriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "uplinkPysicalChannelControl_v4b0ext"
		public UplinkPhysicalChannelControl_v4b0ext_IEs getUplinkPysicalChannelControl_v4b0ext()
		{
		    return (UplinkPhysicalChannelControl_v4b0ext_IEs)mComponents[0];
		}
		
		public void setUplinkPysicalChannelControl_v4b0ext(UplinkPhysicalChannelControl_v4b0ext_IEs uplinkPysicalChannelControl_v4b0ext)
		{
		    mComponents[0] = uplinkPysicalChannelControl_v4b0ext;
		}
		
		
		// Methods for field "noncriticalExtensions"
		public NoncriticalExtensions getNoncriticalExtensions()
		{
		    return (NoncriticalExtensions)mComponents[1];
		}
		
		public void setNoncriticalExtensions(NoncriticalExtensions noncriticalExtensions)
		{
		    mComponents[1] = noncriticalExtensions;
		}
		
		public boolean hasNoncriticalExtensions()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteNoncriticalExtensions()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type NoncriticalExtensions from ASN1 Module PDU_definitions.
		 * @see Sequence
		 */
		public static class NoncriticalExtensions extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public NoncriticalExtensions()
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
			    "UplinkPhysicalChannelControl$R3$LaterNCEs$V4b0NCEs$NoncriticalExtensions"
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
		     * Get the type descriptor (TypeInfo) of 'this' NoncriticalExtensions object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' NoncriticalExtensions object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for NoncriticalExtensions

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
			"UplinkPhysicalChannelControl$R3$LaterNCEs$V4b0NCEs"
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
					    "UplinkPhysicalChannelControl_v4b0ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "UplinkPhysicalChannelControl-v4b0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"UplinkPhysicalChannelControl_v4b0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"UplinkPhysicalChannelControl_v4b0ext_IEs"
					    )
					),
					0
				    )
				),
				"uplinkPysicalChannelControl-v4b0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"UplinkPhysicalChannelControl$R3$LaterNCEs$V4b0NCEs$NoncriticalExtensions"
				    )
				),
				"noncriticalExtensions",
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
		    "UplinkPhysicalChannelControl$R3$LaterNCEs"
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
			    "uplinkPhysicalChannelControl-r3-add-ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UplinkPhysicalChannelControl$R3$LaterNCEs$V4b0NCEs"
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
		"UplinkPhysicalChannelControl$R3"
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
				    "UplinkPhysicalChannelControl_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "UplinkPhysicalChannelControl-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"UplinkPhysicalChannelControl_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"UplinkPhysicalChannelControl_r3_IEs"
				    )
				),
				0
			    )
			),
			"uplinkPhysicalChannelControl-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UplinkPhysicalChannelControl$R3$LaterNCEs"
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
    public static UplinkPhysicalChannelControl createUplinkPhysicalChannelControlWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	UplinkPhysicalChannelControl __object = new UplinkPhysicalChannelControl();

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
		public R4(UplinkPhysicalChannelControl_r4_IEs uplinkPhysicalChannelControl_r4, 
				V4d0NCEs v4d0NCEs)
		{
		    setUplinkPhysicalChannelControl_r4(uplinkPhysicalChannelControl_r4);
		    setV4d0NCEs(v4d0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public R4(UplinkPhysicalChannelControl_r4_IEs uplinkPhysicalChannelControl_r4)
		{
		    setUplinkPhysicalChannelControl_r4(uplinkPhysicalChannelControl_r4);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UplinkPhysicalChannelControl_r4_IEs();
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
			    return new UplinkPhysicalChannelControl_r4_IEs();
			case 1:
			    return new V4d0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "uplinkPhysicalChannelControl_r4"
		public UplinkPhysicalChannelControl_r4_IEs getUplinkPhysicalChannelControl_r4()
		{
		    return (UplinkPhysicalChannelControl_r4_IEs)mComponents[0];
		}
		
		public void setUplinkPhysicalChannelControl_r4(UplinkPhysicalChannelControl_r4_IEs uplinkPhysicalChannelControl_r4)
		{
		    mComponents[0] = uplinkPhysicalChannelControl_r4;
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
		    public V4d0NCEs(BitString uplinkPhysicalChannelControl_r4_add_ext, 
				    V690NCEs v690NCEs)
		    {
			setUplinkPhysicalChannelControl_r4_add_ext(uplinkPhysicalChannelControl_r4_add_ext);
			setV690NCEs(v690NCEs);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new BitString();
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
				return new BitString();
			    case 1:
				return new V690NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "uplinkPhysicalChannelControl_r4_add_ext"
		    public BitString getUplinkPhysicalChannelControl_r4_add_ext()
		    {
			return (BitString)mComponents[0];
		    }
		    
		    public void setUplinkPhysicalChannelControl_r4_add_ext(BitString uplinkPhysicalChannelControl_r4_add_ext)
		    {
			mComponents[0] = uplinkPhysicalChannelControl_r4_add_ext;
		    }
		    
		    public boolean hasUplinkPhysicalChannelControl_r4_add_ext()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteUplinkPhysicalChannelControl_r4_add_ext()
		    {
			setComponentAbsent(0);
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
			public V690NCEs(UplinkPhysicalChannelControl_v690ext_IEs uplinkPhysicalChannelControl_v690ext, 
					NonCriticalExtensions nonCriticalExtensions)
			{
			    setUplinkPhysicalChannelControl_v690ext(uplinkPhysicalChannelControl_v690ext);
			    setNonCriticalExtensions(nonCriticalExtensions);
			}
			
			/**
			 * Construct with required components.
			 */
			public V690NCEs(UplinkPhysicalChannelControl_v690ext_IEs uplinkPhysicalChannelControl_v690ext)
			{
			    setUplinkPhysicalChannelControl_v690ext(uplinkPhysicalChannelControl_v690ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new UplinkPhysicalChannelControl_v690ext_IEs();
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
				    return new UplinkPhysicalChannelControl_v690ext_IEs();
				case 1:
				    return new NonCriticalExtensions();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "uplinkPhysicalChannelControl_v690ext"
			public UplinkPhysicalChannelControl_v690ext_IEs getUplinkPhysicalChannelControl_v690ext()
			{
			    return (UplinkPhysicalChannelControl_v690ext_IEs)mComponents[0];
			}
			
			public void setUplinkPhysicalChannelControl_v690ext(UplinkPhysicalChannelControl_v690ext_IEs uplinkPhysicalChannelControl_v690ext)
			{
			    mComponents[0] = uplinkPhysicalChannelControl_v690ext;
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
				    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs$NonCriticalExtensions"
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
				"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs"
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
						    "UplinkPhysicalChannelControl_v690ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "UplinkPhysicalChannelControl-v690ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"UplinkPhysicalChannelControl_v690ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"UplinkPhysicalChannelControl_v690ext_IEs"
						    )
						),
						0
					    )
					),
					"uplinkPhysicalChannelControl-v690ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs$NonCriticalExtensions"
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
			    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs"
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
				    "uplinkPhysicalChannelControl-r4-add-ext",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs"
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
			"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$R4"
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
					    "UplinkPhysicalChannelControl_r4_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "UplinkPhysicalChannelControl-r4-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"UplinkPhysicalChannelControl_r4_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"UplinkPhysicalChannelControl_r4_IEs"
					    )
					),
					0
				    )
				),
				"uplinkPhysicalChannelControl-r4",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs"
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
		    public R5(UplinkPhysicalChannelControl_r5_IEs uplinkPhysicalChannelControl_r5, 
				    BitString uplinkPhysicalChannelControl_r5_add_ext, 
				    V690NCEs v690NCEs)
		    {
			setUplinkPhysicalChannelControl_r5(uplinkPhysicalChannelControl_r5);
			setUplinkPhysicalChannelControl_r5_add_ext(uplinkPhysicalChannelControl_r5_add_ext);
			setV690NCEs(v690NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public R5(UplinkPhysicalChannelControl_r5_IEs uplinkPhysicalChannelControl_r5)
		    {
			setUplinkPhysicalChannelControl_r5(uplinkPhysicalChannelControl_r5);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new UplinkPhysicalChannelControl_r5_IEs();
			mComponents[1] = new BitString();
			mComponents[2] = new V690NCEs();
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
				return new UplinkPhysicalChannelControl_r5_IEs();
			    case 1:
				return new BitString();
			    case 2:
				return new V690NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "uplinkPhysicalChannelControl_r5"
		    public UplinkPhysicalChannelControl_r5_IEs getUplinkPhysicalChannelControl_r5()
		    {
			return (UplinkPhysicalChannelControl_r5_IEs)mComponents[0];
		    }
		    
		    public void setUplinkPhysicalChannelControl_r5(UplinkPhysicalChannelControl_r5_IEs uplinkPhysicalChannelControl_r5)
		    {
			mComponents[0] = uplinkPhysicalChannelControl_r5;
		    }
		    
		    
		    // Methods for field "uplinkPhysicalChannelControl_r5_add_ext"
		    public BitString getUplinkPhysicalChannelControl_r5_add_ext()
		    {
			return (BitString)mComponents[1];
		    }
		    
		    public void setUplinkPhysicalChannelControl_r5_add_ext(BitString uplinkPhysicalChannelControl_r5_add_ext)
		    {
			mComponents[1] = uplinkPhysicalChannelControl_r5_add_ext;
		    }
		    
		    public boolean hasUplinkPhysicalChannelControl_r5_add_ext()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteUplinkPhysicalChannelControl_r5_add_ext()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    // Methods for field "v690NCEs"
		    public V690NCEs getV690NCEs()
		    {
			return (V690NCEs)mComponents[2];
		    }
		    
		    public void setV690NCEs(V690NCEs v690NCEs)
		    {
			mComponents[2] = v690NCEs;
		    }
		    
		    public boolean hasV690NCEs()
		    {
			return componentIsPresent(2);
		    }
		    
		    public void deleteV690NCEs()
		    {
			setComponentAbsent(2);
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
			public V690NCEs(UplinkPhysicalChannelControl_v690ext_IEs uplinkPhysicalChannelControl_v690ext, 
					V6a0NCEs v6a0NCEs)
			{
			    setUplinkPhysicalChannelControl_v690ext(uplinkPhysicalChannelControl_v690ext);
			    setV6a0NCEs(v6a0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V690NCEs(UplinkPhysicalChannelControl_v690ext_IEs uplinkPhysicalChannelControl_v690ext)
			{
			    setUplinkPhysicalChannelControl_v690ext(uplinkPhysicalChannelControl_v690ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new UplinkPhysicalChannelControl_v690ext_IEs();
			    mComponents[1] = new V6a0NCEs();
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
				    return new UplinkPhysicalChannelControl_v690ext_IEs();
				case 1:
				    return new V6a0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "uplinkPhysicalChannelControl_v690ext"
			public UplinkPhysicalChannelControl_v690ext_IEs getUplinkPhysicalChannelControl_v690ext()
			{
			    return (UplinkPhysicalChannelControl_v690ext_IEs)mComponents[0];
			}
			
			public void setUplinkPhysicalChannelControl_v690ext(UplinkPhysicalChannelControl_v690ext_IEs uplinkPhysicalChannelControl_v690ext)
			{
			    mComponents[0] = uplinkPhysicalChannelControl_v690ext;
			}
			
			
			// Methods for field "v6a0NCEs"
			public V6a0NCEs getV6a0NCEs()
			{
			    return (V6a0NCEs)mComponents[1];
			}
			
			public void setV6a0NCEs(V6a0NCEs v6a0NCEs)
			{
			    mComponents[1] = v6a0NCEs;
			}
			
			public boolean hasV6a0NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV6a0NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V6a0NCEs from ASN1 Module PDU_definitions.
			 * @see Sequence
			 */
			public static class V6a0NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V6a0NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V6a0NCEs(UplinkPhysicalChannelControl_v6a0ext_IEs uplinkPhysicalChannelControl_v6a0ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setUplinkPhysicalChannelControl_v6a0ext(uplinkPhysicalChannelControl_v6a0ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V6a0NCEs(UplinkPhysicalChannelControl_v6a0ext_IEs uplinkPhysicalChannelControl_v6a0ext)
			    {
				setUplinkPhysicalChannelControl_v6a0ext(uplinkPhysicalChannelControl_v6a0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new UplinkPhysicalChannelControl_v6a0ext_IEs();
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
					return new UplinkPhysicalChannelControl_v6a0ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "uplinkPhysicalChannelControl_v6a0ext"
			    public UplinkPhysicalChannelControl_v6a0ext_IEs getUplinkPhysicalChannelControl_v6a0ext()
			    {
				return (UplinkPhysicalChannelControl_v6a0ext_IEs)mComponents[0];
			    }
			    
			    public void setUplinkPhysicalChannelControl_v6a0ext(UplinkPhysicalChannelControl_v6a0ext_IEs uplinkPhysicalChannelControl_v6a0ext)
			    {
				mComponents[0] = uplinkPhysicalChannelControl_v6a0ext;
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
					"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs$V6a0NCEs$NonCriticalExtensions"
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
				    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs$V6a0NCEs"
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
							"UplinkPhysicalChannelControl_v6a0ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"UplinkPhysicalChannelControl-v6a0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "UplinkPhysicalChannelControl_v6a0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "UplinkPhysicalChannelControl_v6a0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "uplinkPhysicalChannelControl-v6a0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs$V6a0NCEs$NonCriticalExtensions"
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
			     * Get the type descriptor (TypeInfo) of 'this' V6a0NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V6a0NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V6a0NCEs

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
				"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs"
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
						    "UplinkPhysicalChannelControl_v690ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "UplinkPhysicalChannelControl-v690ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"UplinkPhysicalChannelControl_v690ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"UplinkPhysicalChannelControl_v690ext_IEs"
						    )
						),
						0
					    )
					),
					"uplinkPhysicalChannelControl-v690ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs$V6a0NCEs"
					    )
					),
					"v6a0NCEs",
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
				(short)0x8000
			    }
			),
			new QName (
			    "rrc.pdu_definitions",
			    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5"
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
						"UplinkPhysicalChannelControl_r5_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"UplinkPhysicalChannelControl-r5-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UplinkPhysicalChannelControl_r5_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UplinkPhysicalChannelControl_r5_IEs"
						)
					    ),
					    0
					)
				    ),
				    "uplinkPhysicalChannelControl-r5",
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
				    "uplinkPhysicalChannelControl-r5-add-ext",
				    1,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs"
					)
				    ),
				    "v690NCEs",
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
		    
		    public static final  int  r7_chosen = 1;
		    public static final  int  criticalExtensions_chosen = 2;
		    
		    // Methods for field "r7"
		    public static CriticalExtensions2 createCriticalExtensions2WithR7(R7 r7)
		    {
			CriticalExtensions2 __object = new CriticalExtensions2();

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
			public R7(UplinkPhysicalChannelControl_r7_IEs uplinkPhysicalChannelControl_r7, 
					BitString uplinkPhysicalChannelControl_r7_add_ext, 
					NonCriticalExtensions nonCriticalExtensions)
			{
			    setUplinkPhysicalChannelControl_r7(uplinkPhysicalChannelControl_r7);
			    setUplinkPhysicalChannelControl_r7_add_ext(uplinkPhysicalChannelControl_r7_add_ext);
			    setNonCriticalExtensions(nonCriticalExtensions);
			}
			
			/**
			 * Construct with required components.
			 */
			public R7(UplinkPhysicalChannelControl_r7_IEs uplinkPhysicalChannelControl_r7)
			{
			    setUplinkPhysicalChannelControl_r7(uplinkPhysicalChannelControl_r7);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new UplinkPhysicalChannelControl_r7_IEs();
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
				    return new UplinkPhysicalChannelControl_r7_IEs();
				case 1:
				    return new BitString();
				case 2:
				    return new NonCriticalExtensions();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "uplinkPhysicalChannelControl_r7"
			public UplinkPhysicalChannelControl_r7_IEs getUplinkPhysicalChannelControl_r7()
			{
			    return (UplinkPhysicalChannelControl_r7_IEs)mComponents[0];
			}
			
			public void setUplinkPhysicalChannelControl_r7(UplinkPhysicalChannelControl_r7_IEs uplinkPhysicalChannelControl_r7)
			{
			    mComponents[0] = uplinkPhysicalChannelControl_r7;
			}
			
			
			// Methods for field "uplinkPhysicalChannelControl_r7_add_ext"
			public BitString getUplinkPhysicalChannelControl_r7_add_ext()
			{
			    return (BitString)mComponents[1];
			}
			
			public void setUplinkPhysicalChannelControl_r7_add_ext(BitString uplinkPhysicalChannelControl_r7_add_ext)
			{
			    mComponents[1] = uplinkPhysicalChannelControl_r7_add_ext;
			}
			
			public boolean hasUplinkPhysicalChannelControl_r7_add_ext()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteUplinkPhysicalChannelControl_r7_add_ext()
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
				    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7$NonCriticalExtensions"
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
				"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7"
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
						    "UplinkPhysicalChannelControl_r7_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "UplinkPhysicalChannelControl-r7-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"UplinkPhysicalChannelControl_r7_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"UplinkPhysicalChannelControl_r7_IEs"
						    )
						),
						0
					    )
					),
					"uplinkPhysicalChannelControl-r7",
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
					"uplinkPhysicalChannelControl-r7-add-ext",
					1,
					3,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7$NonCriticalExtensions"
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
		     * @see Sequence
		     */
		    public static class CriticalExtensions3 extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public CriticalExtensions3()
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
				"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
			    case r7_chosen:
				return new R7();
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
			    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
					    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R7"
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
					    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
			"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
					"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5"
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
					"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions"
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
				    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$R4"
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
				    "UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
		"UplinkPhysicalChannelControl$Later_than_r3"
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
				"UplinkPhysicalChannelControl$Later_than_r3$CriticalExtensions"
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
	    "UplinkPhysicalChannelControl"
	),
	new QName (
	    "PDU-definitions",
	    "UplinkPhysicalChannelControl"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UplinkPhysicalChannelControl$R3"
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
			    "UplinkPhysicalChannelControl$Later_than_r3"
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
     * Get the type descriptor (TypeInfo) of 'this' UplinkPhysicalChannelControl object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UplinkPhysicalChannelControl object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UplinkPhysicalChannelControl
