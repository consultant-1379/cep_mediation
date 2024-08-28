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
 * Define the ASN1 Type MasterInformationBlock from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MasterInformationBlock extends Sequence {
    
    /**
     * The default constructor.
     */
    public MasterInformationBlock()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MasterInformationBlock(MIB_ValueTag mib_ValueTag, 
		    PLMN_Type plmn_Type, 
		    SIBSb_ReferenceList sibSb_ReferenceList, 
		    V690NCEs v690NCEs)
    {
	setMib_ValueTag(mib_ValueTag);
	setPlmn_Type(plmn_Type);
	setSibSb_ReferenceList(sibSb_ReferenceList);
	setV690NCEs(v690NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public MasterInformationBlock(MIB_ValueTag mib_ValueTag, 
		    PLMN_Type plmn_Type, 
		    SIBSb_ReferenceList sibSb_ReferenceList)
    {
	setMib_ValueTag(mib_ValueTag);
	setPlmn_Type(plmn_Type);
	setSibSb_ReferenceList(sibSb_ReferenceList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MIB_ValueTag();
	mComponents[1] = new PLMN_Type();
	mComponents[2] = new SIBSb_ReferenceList();
	mComponents[3] = new V690NCEs();
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
		return new MIB_ValueTag();
	    case 1:
		return new PLMN_Type();
	    case 2:
		return new SIBSb_ReferenceList();
	    case 3:
		return new V690NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mib_ValueTag"
    public MIB_ValueTag getMib_ValueTag()
    {
	return (MIB_ValueTag)mComponents[0];
    }
    
    public void setMib_ValueTag(MIB_ValueTag mib_ValueTag)
    {
	mComponents[0] = mib_ValueTag;
    }
    
    
    // Methods for field "plmn_Type"
    public PLMN_Type getPlmn_Type()
    {
	return (PLMN_Type)mComponents[1];
    }
    
    public void setPlmn_Type(PLMN_Type plmn_Type)
    {
	mComponents[1] = plmn_Type;
    }
    
    
    // Methods for field "sibSb_ReferenceList"
    public SIBSb_ReferenceList getSibSb_ReferenceList()
    {
	return (SIBSb_ReferenceList)mComponents[2];
    }
    
    public void setSibSb_ReferenceList(SIBSb_ReferenceList sibSb_ReferenceList)
    {
	mComponents[2] = sibSb_ReferenceList;
    }
    
    
    // Methods for field "v690NCEs"
    public V690NCEs getV690NCEs()
    {
	return (V690NCEs)mComponents[3];
    }
    
    public void setV690NCEs(V690NCEs v690NCEs)
    {
	mComponents[3] = v690NCEs;
    }
    
    public boolean hasV690NCEs()
    {
	return componentIsPresent(3);
    }
    
    public void deleteV690NCEs()
    {
	setComponentAbsent(3);
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
	public V690NCEs(MasterInformationBlock_v690ext masterInformationBlock_v690ext, 
			V6b0NCEs v6b0NCEs)
	{
	    setMasterInformationBlock_v690ext(masterInformationBlock_v690ext);
	    setV6b0NCEs(v6b0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V690NCEs(MasterInformationBlock_v690ext masterInformationBlock_v690ext)
	{
	    setMasterInformationBlock_v690ext(masterInformationBlock_v690ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MasterInformationBlock_v690ext();
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
		    return new MasterInformationBlock_v690ext();
		case 1:
		    return new V6b0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "masterInformationBlock_v690ext"
	public MasterInformationBlock_v690ext getMasterInformationBlock_v690ext()
	{
	    return (MasterInformationBlock_v690ext)mComponents[0];
	}
	
	public void setMasterInformationBlock_v690ext(MasterInformationBlock_v690ext masterInformationBlock_v690ext)
	{
	    mComponents[0] = masterInformationBlock_v690ext;
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
	    public V6b0NCEs(MasterInformationBlock_v6b0ext_IEs masterInformationBlock_v6b0ext, 
			    V860NCEs v860NCEs)
	    {
		setMasterInformationBlock_v6b0ext(masterInformationBlock_v6b0ext);
		setV860NCEs(v860NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V6b0NCEs(MasterInformationBlock_v6b0ext_IEs masterInformationBlock_v6b0ext)
	    {
		setMasterInformationBlock_v6b0ext(masterInformationBlock_v6b0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MasterInformationBlock_v6b0ext_IEs();
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
			return new MasterInformationBlock_v6b0ext_IEs();
		    case 1:
			return new V860NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "masterInformationBlock_v6b0ext"
	    public MasterInformationBlock_v6b0ext_IEs getMasterInformationBlock_v6b0ext()
	    {
		return (MasterInformationBlock_v6b0ext_IEs)mComponents[0];
	    }
	    
	    public void setMasterInformationBlock_v6b0ext(MasterInformationBlock_v6b0ext_IEs masterInformationBlock_v6b0ext)
	    {
		mComponents[0] = masterInformationBlock_v6b0ext;
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
		public V860NCEs(MasterInformationBlock_v860ext_IEs masterInformationBlock_v860ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setMasterInformationBlock_v860ext(masterInformationBlock_v860ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public V860NCEs(MasterInformationBlock_v860ext_IEs masterInformationBlock_v860ext)
		{
		    setMasterInformationBlock_v860ext(masterInformationBlock_v860ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new MasterInformationBlock_v860ext_IEs();
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
			    return new MasterInformationBlock_v860ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "masterInformationBlock_v860ext"
		public MasterInformationBlock_v860ext_IEs getMasterInformationBlock_v860ext()
		{
		    return (MasterInformationBlock_v860ext_IEs)mComponents[0];
		}
		
		public void setMasterInformationBlock_v860ext(MasterInformationBlock_v860ext_IEs masterInformationBlock_v860ext)
		{
		    mComponents[0] = masterInformationBlock_v860ext;
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
			    "MasterInformationBlock$V690NCEs$V6b0NCEs$V860NCEs$NonCriticalExtensions"
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
			"MasterInformationBlock$V690NCEs$V6b0NCEs$V860NCEs"
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
					    "MasterInformationBlock_v860ext_IEs"
					),
					new QName (
					    "InformationElements",
					    "MasterInformationBlock-v860ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"MasterInformationBlock_v860ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"MasterInformationBlock_v860ext_IEs"
					    )
					),
					0
				    )
				),
				"masterInformationBlock-v860ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"MasterInformationBlock$V690NCEs$V6b0NCEs$V860NCEs$NonCriticalExtensions"
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
		    "MasterInformationBlock$V690NCEs$V6b0NCEs"
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
					"MasterInformationBlock_v6b0ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"MasterInformationBlock-v6b0ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "MasterInformationBlock_v6b0ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "MasterInformationBlock_v6b0ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "masterInformationBlock-v6b0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MasterInformationBlock$V690NCEs$V6b0NCEs$V860NCEs"
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MasterInformationBlock$V690NCEs"
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
				    "MasterInformationBlock_v690ext"
				),
				new QName (
				    "InformationElements",
				    "MasterInformationBlock-v690ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MasterInformationBlock_v690ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MasterInformationBlock_v690ext"
				    )
				),
				0
			    )
			),
			"masterInformationBlock-v690ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"MasterInformationBlock$V690NCEs$V6b0NCEs"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "MasterInformationBlock"
	),
	new QName (
	    "InformationElements",
	    "MasterInformationBlock"
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
				"MIB_ValueTag"
			    ),
			    new QName (
				"InformationElements",
				"MIB-ValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MIB_ValueTag(1), 
				    new MIB_ValueTag(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "mib-ValueTag",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PLMN_Type"
			    ),
			    new QName (
				"InformationElements",
				"PLMN-Type"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Type"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    )
			)
		    ),
		    "plmn-Type",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SIBSb_ReferenceList"
			    ),
			    new QName (
				"InformationElements",
				"SIBSb-ReferenceList"
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
				    "SchedulingInformationSIBSb"
				)
			    )
			)
		    ),
		    "sibSb-ReferenceList",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MasterInformationBlock$V690NCEs"
			)
		    ),
		    "v690NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' MasterInformationBlock object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MasterInformationBlock object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MasterInformationBlock
