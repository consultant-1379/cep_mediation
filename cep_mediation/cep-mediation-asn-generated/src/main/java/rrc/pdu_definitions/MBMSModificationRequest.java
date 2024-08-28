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
 * Define the ASN1 Type MBMSModificationRequest from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSModificationRequest extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSModificationRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSModificationRequest(rrc.informationelements.MBMS_ServiceIdentity_r6 mbms_PreferredFreqRequest, 
		    rrc.informationelements.RB_InformationReleaseList rb_InformationReleaseList, 
		    V6b0NCEs v6b0NCEs)
    {
	setMbms_PreferredFreqRequest(mbms_PreferredFreqRequest);
	setRb_InformationReleaseList(rb_InformationReleaseList);
	setV6b0NCEs(v6b0NCEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MBMS_ServiceIdentity_r6();
	mComponents[1] = new rrc.informationelements.RB_InformationReleaseList();
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
		return new rrc.informationelements.MBMS_ServiceIdentity_r6();
	    case 1:
		return new rrc.informationelements.RB_InformationReleaseList();
	    case 2:
		return new V6b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_PreferredFreqRequest"
    public rrc.informationelements.MBMS_ServiceIdentity_r6 getMbms_PreferredFreqRequest()
    {
	return (rrc.informationelements.MBMS_ServiceIdentity_r6)mComponents[0];
    }
    
    public void setMbms_PreferredFreqRequest(rrc.informationelements.MBMS_ServiceIdentity_r6 mbms_PreferredFreqRequest)
    {
	mComponents[0] = mbms_PreferredFreqRequest;
    }
    
    public boolean hasMbms_PreferredFreqRequest()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMbms_PreferredFreqRequest()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "rb_InformationReleaseList"
    public rrc.informationelements.RB_InformationReleaseList getRb_InformationReleaseList()
    {
	return (rrc.informationelements.RB_InformationReleaseList)mComponents[1];
    }
    
    public void setRb_InformationReleaseList(rrc.informationelements.RB_InformationReleaseList rb_InformationReleaseList)
    {
	mComponents[1] = rb_InformationReleaseList;
    }
    
    public boolean hasRb_InformationReleaseList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRb_InformationReleaseList()
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
	public V6b0NCEs(MBMSModificationRequest_v6b0ext_IEs mbmsModificationRequest_v6b0ext, 
			V6f0NCEs v6f0NCEs)
	{
	    setMbmsModificationRequest_v6b0ext(mbmsModificationRequest_v6b0ext);
	    setV6f0NCEs(v6f0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V6b0NCEs(MBMSModificationRequest_v6b0ext_IEs mbmsModificationRequest_v6b0ext)
	{
	    setMbmsModificationRequest_v6b0ext(mbmsModificationRequest_v6b0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MBMSModificationRequest_v6b0ext_IEs();
	    mComponents[1] = new V6f0NCEs();
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
		    return new MBMSModificationRequest_v6b0ext_IEs();
		case 1:
		    return new V6f0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "mbmsModificationRequest_v6b0ext"
	public MBMSModificationRequest_v6b0ext_IEs getMbmsModificationRequest_v6b0ext()
	{
	    return (MBMSModificationRequest_v6b0ext_IEs)mComponents[0];
	}
	
	public void setMbmsModificationRequest_v6b0ext(MBMSModificationRequest_v6b0ext_IEs mbmsModificationRequest_v6b0ext)
	{
	    mComponents[0] = mbmsModificationRequest_v6b0ext;
	}
	
	
	// Methods for field "v6f0NCEs"
	public V6f0NCEs getV6f0NCEs()
	{
	    return (V6f0NCEs)mComponents[1];
	}
	
	public void setV6f0NCEs(V6f0NCEs v6f0NCEs)
	{
	    mComponents[1] = v6f0NCEs;
	}
	
	public boolean hasV6f0NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV6f0NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V6f0NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V6f0NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V6f0NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V6f0NCEs(MBMSModificationRequest_v6f0ext_IEs mbmsModificationRequest_v6f0ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setMbmsModificationRequest_v6f0ext(mbmsModificationRequest_v6f0ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V6f0NCEs(MBMSModificationRequest_v6f0ext_IEs mbmsModificationRequest_v6f0ext)
	    {
		setMbmsModificationRequest_v6f0ext(mbmsModificationRequest_v6f0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MBMSModificationRequest_v6f0ext_IEs();
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
			return new MBMSModificationRequest_v6f0ext_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "mbmsModificationRequest_v6f0ext"
	    public MBMSModificationRequest_v6f0ext_IEs getMbmsModificationRequest_v6f0ext()
	    {
		return (MBMSModificationRequest_v6f0ext_IEs)mComponents[0];
	    }
	    
	    public void setMbmsModificationRequest_v6f0ext(MBMSModificationRequest_v6f0ext_IEs mbmsModificationRequest_v6f0ext)
	    {
		mComponents[0] = mbmsModificationRequest_v6f0ext;
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
			"MBMSModificationRequest$V6b0NCEs$V6f0NCEs$NonCriticalExtensions"
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
		    "MBMSModificationRequest$V6b0NCEs$V6f0NCEs"
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
					"MBMSModificationRequest_v6f0ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"MBMSModificationRequest-v6f0ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MBMSModificationRequest_v6f0ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MBMSModificationRequest_v6f0ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "mbmsModificationRequest-v6f0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSModificationRequest$V6b0NCEs$V6f0NCEs$NonCriticalExtensions"
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
	     * Get the type descriptor (TypeInfo) of 'this' V6f0NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V6f0NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V6f0NCEs

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
		"MBMSModificationRequest$V6b0NCEs"
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
				    "MBMSModificationRequest_v6b0ext_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "MBMSModificationRequest-v6b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSModificationRequest_v6b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSModificationRequest_v6b0ext_IEs"
				    )
				),
				0
			    )
			),
			"mbmsModificationRequest-v6b0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"MBMSModificationRequest$V6b0NCEs$V6f0NCEs"
			    )
			),
			"v6f0NCEs",
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
	    "rrc.pdu_definitions",
	    "MBMSModificationRequest"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSModificationRequest"
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
				"MBMS_ServiceIdentity_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-ServiceIdentity-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_ServiceIdentity_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_ServiceIdentity_r6"
				)
			    ),
			    0
			)
		    ),
		    "mbms-PreferredFreqRequest",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_InformationReleaseList"
			    ),
			    new QName (
				"InformationElements",
				"RB-InformationReleaseList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RB_Identity"
				)
			    )
			)
		    ),
		    "rb-InformationReleaseList",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MBMSModificationRequest$V6b0NCEs"
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' MBMSModificationRequest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSModificationRequest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSModificationRequest
