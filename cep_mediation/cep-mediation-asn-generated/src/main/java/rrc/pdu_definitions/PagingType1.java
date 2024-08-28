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
 * Define the ASN1 Type PagingType1 from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class PagingType1 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PagingType1()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PagingType1(rrc.informationelements.PagingRecordList pagingRecordList, 
		    rrc.informationelements.BCCH_ModificationInfo bcch_ModificationInfo, 
		    LaterNCEs laterNCEs)
    {
	setPagingRecordList(pagingRecordList);
	setBcch_ModificationInfo(bcch_ModificationInfo);
	setLaterNCEs(laterNCEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.PagingRecordList();
	mComponents[1] = new rrc.informationelements.BCCH_ModificationInfo();
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
		return new rrc.informationelements.PagingRecordList();
	    case 1:
		return new rrc.informationelements.BCCH_ModificationInfo();
	    case 2:
		return new LaterNCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pagingRecordList"
    public rrc.informationelements.PagingRecordList getPagingRecordList()
    {
	return (rrc.informationelements.PagingRecordList)mComponents[0];
    }
    
    public void setPagingRecordList(rrc.informationelements.PagingRecordList pagingRecordList)
    {
	mComponents[0] = pagingRecordList;
    }
    
    public boolean hasPagingRecordList()
    {
	return componentIsPresent(0);
    }
    
    public void deletePagingRecordList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "bcch_ModificationInfo"
    public rrc.informationelements.BCCH_ModificationInfo getBcch_ModificationInfo()
    {
	return (rrc.informationelements.BCCH_ModificationInfo)mComponents[1];
    }
    
    public void setBcch_ModificationInfo(rrc.informationelements.BCCH_ModificationInfo bcch_ModificationInfo)
    {
	mComponents[1] = bcch_ModificationInfo;
    }
    
    public boolean hasBcch_ModificationInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteBcch_ModificationInfo()
    {
	setComponentAbsent(1);
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
	public LaterNCEs(BitString pagingType1_r3_add_ext, V590NCEs v590NCEs)
	{
	    setPagingType1_r3_add_ext(pagingType1_r3_add_ext);
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
	
	
	// Methods for field "pagingType1_r3_add_ext"
	public BitString getPagingType1_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setPagingType1_r3_add_ext(BitString pagingType1_r3_add_ext)
	{
	    mComponents[0] = pagingType1_r3_add_ext;
	}
	
	public boolean hasPagingType1_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deletePagingType1_r3_add_ext()
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
	    public V590NCEs(PagingType1_v590ext_IEs pagingType1_v590ext, 
			    V860NCEs v860NCEs)
	    {
		setPagingType1_v590ext(pagingType1_v590ext);
		setV860NCEs(v860NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V590NCEs(PagingType1_v590ext_IEs pagingType1_v590ext)
	    {
		setPagingType1_v590ext(pagingType1_v590ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PagingType1_v590ext_IEs();
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
			return new PagingType1_v590ext_IEs();
		    case 1:
			return new V860NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "pagingType1_v590ext"
	    public PagingType1_v590ext_IEs getPagingType1_v590ext()
	    {
		return (PagingType1_v590ext_IEs)mComponents[0];
	    }
	    
	    public void setPagingType1_v590ext(PagingType1_v590ext_IEs pagingType1_v590ext)
	    {
		mComponents[0] = pagingType1_v590ext;
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
		public V860NCEs(PagingType1_v860ext_IEs pagingType1_v860ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setPagingType1_v860ext(pagingType1_v860ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public V860NCEs(PagingType1_v860ext_IEs pagingType1_v860ext)
		{
		    setPagingType1_v860ext(pagingType1_v860ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new PagingType1_v860ext_IEs();
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
			    return new PagingType1_v860ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "pagingType1_v860ext"
		public PagingType1_v860ext_IEs getPagingType1_v860ext()
		{
		    return (PagingType1_v860ext_IEs)mComponents[0];
		}
		
		public void setPagingType1_v860ext(PagingType1_v860ext_IEs pagingType1_v860ext)
		{
		    mComponents[0] = pagingType1_v860ext;
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
			    "PagingType1$LaterNCEs$V590NCEs$V860NCEs$NonCriticalExtensions"
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
			"PagingType1$LaterNCEs$V590NCEs$V860NCEs"
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
					    "PagingType1_v860ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "PagingType1-v860ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"PagingType1_v860ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"PagingType1_v860ext_IEs"
					    )
					),
					0
				    )
				),
				"pagingType1-v860ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"PagingType1$LaterNCEs$V590NCEs$V860NCEs$NonCriticalExtensions"
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
		    "rrc.pdu_definitions",
		    "PagingType1$LaterNCEs$V590NCEs"
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
					"PagingType1_v590ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"PagingType1-v590ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "PagingType1_v590ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "PagingType1_v590ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "pagingType1-v590ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PagingType1$LaterNCEs$V590NCEs$V860NCEs"
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"PagingType1$LaterNCEs"
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
			"pagingType1-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"PagingType1$LaterNCEs$V590NCEs"
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
	    "PagingType1"
	),
	new QName (
	    "PDU-definitions",
	    "PagingType1"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PagingRecordList"
			    ),
			    new QName (
				"InformationElements",
				"PagingRecordList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PagingRecord"
				)
			    )
			)
		    ),
		    "pagingRecordList",
		    0,
		    3,
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
				"BCCH_ModificationInfo"
			    ),
			    new QName (
				"InformationElements",
				"BCCH-ModificationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "BCCH_ModificationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "BCCH_ModificationInfo"
				)
			    ),
			    0
			)
		    ),
		    "bcch-ModificationInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "PagingType1$LaterNCEs"
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
     * Get the type descriptor (TypeInfo) of 'this' PagingType1 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PagingType1 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PagingType1
