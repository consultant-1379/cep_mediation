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
 * Define the ASN1 Type UplinkDirectTransfer from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UplinkDirectTransfer extends Sequence {
    
    /**
     * The default constructor.
     */
    public UplinkDirectTransfer()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UplinkDirectTransfer(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity, 
		    rrc.informationelements.NAS_Message nas_Message, 
		    rrc.informationelements.MeasuredResultsOnRACH measuredResultsOnRACH, 
		    LaterNCEs laterNCEs)
    {
	setCn_DomainIdentity(cn_DomainIdentity);
	setNas_Message(nas_Message);
	setMeasuredResultsOnRACH(measuredResultsOnRACH);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public UplinkDirectTransfer(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity, 
		    rrc.informationelements.NAS_Message nas_Message)
    {
	setCn_DomainIdentity(cn_DomainIdentity);
	setNas_Message(nas_Message);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.CN_DomainIdentity.cs_domain;
	mComponents[1] = new rrc.informationelements.NAS_Message();
	mComponents[2] = new rrc.informationelements.MeasuredResultsOnRACH();
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
		return rrc.informationelements.CN_DomainIdentity.cs_domain;
	    case 1:
		return new rrc.informationelements.NAS_Message();
	    case 2:
		return new rrc.informationelements.MeasuredResultsOnRACH();
	    case 3:
		return new LaterNCEs();
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
    
    
    // Methods for field "nas_Message"
    public rrc.informationelements.NAS_Message getNas_Message()
    {
	return (rrc.informationelements.NAS_Message)mComponents[1];
    }
    
    public void setNas_Message(rrc.informationelements.NAS_Message nas_Message)
    {
	mComponents[1] = nas_Message;
    }
    
    
    // Methods for field "measuredResultsOnRACH"
    public rrc.informationelements.MeasuredResultsOnRACH getMeasuredResultsOnRACH()
    {
	return (rrc.informationelements.MeasuredResultsOnRACH)mComponents[2];
    }
    
    public void setMeasuredResultsOnRACH(rrc.informationelements.MeasuredResultsOnRACH measuredResultsOnRACH)
    {
	mComponents[2] = measuredResultsOnRACH;
    }
    
    public boolean hasMeasuredResultsOnRACH()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMeasuredResultsOnRACH()
    {
	setComponentAbsent(2);
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
	public LaterNCEs(BitString uplinkDirectTransfer_r3_add_ext, 
			V690NCEs v690NCEs)
	{
	    setUplinkDirectTransfer_r3_add_ext(uplinkDirectTransfer_r3_add_ext);
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
	
	
	// Methods for field "uplinkDirectTransfer_r3_add_ext"
	public BitString getUplinkDirectTransfer_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setUplinkDirectTransfer_r3_add_ext(BitString uplinkDirectTransfer_r3_add_ext)
	{
	    mComponents[0] = uplinkDirectTransfer_r3_add_ext;
	}
	
	public boolean hasUplinkDirectTransfer_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteUplinkDirectTransfer_r3_add_ext()
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
	    public V690NCEs(UplinkDirectTransfer_v690ext_IEs uplinkDirectTransfer_v690ext, 
			    V7g0NCEs v7g0NCEs)
	    {
		setUplinkDirectTransfer_v690ext(uplinkDirectTransfer_v690ext);
		setV7g0NCEs(v7g0NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V690NCEs(UplinkDirectTransfer_v690ext_IEs uplinkDirectTransfer_v690ext)
	    {
		setUplinkDirectTransfer_v690ext(uplinkDirectTransfer_v690ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UplinkDirectTransfer_v690ext_IEs();
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
			return new UplinkDirectTransfer_v690ext_IEs();
		    case 1:
			return new V7g0NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "uplinkDirectTransfer_v690ext"
	    public UplinkDirectTransfer_v690ext_IEs getUplinkDirectTransfer_v690ext()
	    {
		return (UplinkDirectTransfer_v690ext_IEs)mComponents[0];
	    }
	    
	    public void setUplinkDirectTransfer_v690ext(UplinkDirectTransfer_v690ext_IEs uplinkDirectTransfer_v690ext)
	    {
		mComponents[0] = uplinkDirectTransfer_v690ext;
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
		public V7g0NCEs(UplinkDirectTransfer_v7g0ext_IEs uplinkDirectTransfer_v7g0ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setUplinkDirectTransfer_v7g0ext(uplinkDirectTransfer_v7g0ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public V7g0NCEs(UplinkDirectTransfer_v7g0ext_IEs uplinkDirectTransfer_v7g0ext)
		{
		    setUplinkDirectTransfer_v7g0ext(uplinkDirectTransfer_v7g0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UplinkDirectTransfer_v7g0ext_IEs();
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
			    return new UplinkDirectTransfer_v7g0ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "uplinkDirectTransfer_v7g0ext"
		public UplinkDirectTransfer_v7g0ext_IEs getUplinkDirectTransfer_v7g0ext()
		{
		    return (UplinkDirectTransfer_v7g0ext_IEs)mComponents[0];
		}
		
		public void setUplinkDirectTransfer_v7g0ext(UplinkDirectTransfer_v7g0ext_IEs uplinkDirectTransfer_v7g0ext)
		{
		    mComponents[0] = uplinkDirectTransfer_v7g0ext;
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
			    "UplinkDirectTransfer$LaterNCEs$V690NCEs$V7g0NCEs$NonCriticalExtensions"
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
			"UplinkDirectTransfer$LaterNCEs$V690NCEs$V7g0NCEs"
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
					    "UplinkDirectTransfer_v7g0ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "UplinkDirectTransfer-v7g0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"UplinkDirectTransfer_v7g0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"UplinkDirectTransfer_v7g0ext_IEs"
					    )
					),
					0
				    )
				),
				"uplinkDirectTransfer-v7g0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"UplinkDirectTransfer$LaterNCEs$V690NCEs$V7g0NCEs$NonCriticalExtensions"
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
		    "UplinkDirectTransfer$LaterNCEs$V690NCEs"
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
					"UplinkDirectTransfer_v690ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"UplinkDirectTransfer-v690ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UplinkDirectTransfer_v690ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UplinkDirectTransfer_v690ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "uplinkDirectTransfer-v690ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UplinkDirectTransfer$LaterNCEs$V690NCEs$V7g0NCEs"
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UplinkDirectTransfer$LaterNCEs"
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
			"uplinkDirectTransfer-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UplinkDirectTransfer$LaterNCEs$V690NCEs"
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
	    "UplinkDirectTransfer"
	),
	new QName (
	    "PDU-definitions",
	    "UplinkDirectTransfer"
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
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UplinkDirectTransfer$LaterNCEs"
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' UplinkDirectTransfer object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UplinkDirectTransfer object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UplinkDirectTransfer
