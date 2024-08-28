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
 * Define the ASN1 Type SysInfoTypeSB2 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoTypeSB2 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoTypeSB2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoTypeSB2(SIB_ReferenceList sib_ReferenceList, 
		    V6b0NCEs v6b0NCEs)
    {
	setSib_ReferenceList(sib_ReferenceList);
	setV6b0NCEs(v6b0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoTypeSB2(SIB_ReferenceList sib_ReferenceList)
    {
	setSib_ReferenceList(sib_ReferenceList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SIB_ReferenceList();
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
		return new SIB_ReferenceList();
	    case 1:
		return new V6b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sib_ReferenceList"
    public SIB_ReferenceList getSib_ReferenceList()
    {
	return (SIB_ReferenceList)mComponents[0];
    }
    
    public void setSib_ReferenceList(SIB_ReferenceList sib_ReferenceList)
    {
	mComponents[0] = sib_ReferenceList;
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
	public V6b0NCEs(SysInfoTypeSB2_v6b0ext sysInfoTypeSB2_v6b0ext, 
			V860NCEs v860NCEs)
	{
	    setSysInfoTypeSB2_v6b0ext(sysInfoTypeSB2_v6b0ext);
	    setV860NCEs(v860NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V6b0NCEs(SysInfoTypeSB2_v6b0ext sysInfoTypeSB2_v6b0ext)
	{
	    setSysInfoTypeSB2_v6b0ext(sysInfoTypeSB2_v6b0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoTypeSB2_v6b0ext();
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
		    return new SysInfoTypeSB2_v6b0ext();
		case 1:
		    return new V860NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoTypeSB2_v6b0ext"
	public SysInfoTypeSB2_v6b0ext getSysInfoTypeSB2_v6b0ext()
	{
	    return (SysInfoTypeSB2_v6b0ext)mComponents[0];
	}
	
	public void setSysInfoTypeSB2_v6b0ext(SysInfoTypeSB2_v6b0ext sysInfoTypeSB2_v6b0ext)
	{
	    mComponents[0] = sysInfoTypeSB2_v6b0ext;
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
	    public V860NCEs(SysInfoTypeSB2_v860ext sysInfoTypeSB2_v860ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setSysInfoTypeSB2_v860ext(sysInfoTypeSB2_v860ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V860NCEs(SysInfoTypeSB2_v860ext sysInfoTypeSB2_v860ext)
	    {
		setSysInfoTypeSB2_v860ext(sysInfoTypeSB2_v860ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoTypeSB2_v860ext();
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
			return new SysInfoTypeSB2_v860ext();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoTypeSB2_v860ext"
	    public SysInfoTypeSB2_v860ext getSysInfoTypeSB2_v860ext()
	    {
		return (SysInfoTypeSB2_v860ext)mComponents[0];
	    }
	    
	    public void setSysInfoTypeSB2_v860ext(SysInfoTypeSB2_v860ext sysInfoTypeSB2_v860ext)
	    {
		mComponents[0] = sysInfoTypeSB2_v860ext;
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
			"SysInfoTypeSB2$V6b0NCEs$V860NCEs$NonCriticalExtensions"
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
		    "SysInfoTypeSB2$V6b0NCEs$V860NCEs"
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
					"SysInfoTypeSB2_v860ext"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoTypeSB2-v860ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoTypeSB2_v860ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoTypeSB2_v860ext"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoTypeSB2-v860ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoTypeSB2$V6b0NCEs$V860NCEs$NonCriticalExtensions"
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
		"SysInfoTypeSB2$V6b0NCEs"
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
				    "SysInfoTypeSB2_v6b0ext"
				),
				new QName (
				    "InformationElements",
				    "SysInfoTypeSB2-v6b0ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoTypeSB2_v6b0ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoTypeSB2_v6b0ext"
				    )
				),
				0
			    )
			),
			"sysInfoTypeSB2-v6b0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoTypeSB2$V6b0NCEs$V860NCEs"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SysInfoTypeSB2"
	),
	new QName (
	    "InformationElements",
	    "SysInfoTypeSB2"
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
				"SIB_ReferenceList"
			    ),
			    new QName (
				"InformationElements",
				"SIB-ReferenceList"
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
				    "SchedulingInformationSIB"
				)
			    )
			)
		    ),
		    "sib-ReferenceList",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoTypeSB2$V6b0NCEs"
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoTypeSB2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoTypeSB2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoTypeSB2
