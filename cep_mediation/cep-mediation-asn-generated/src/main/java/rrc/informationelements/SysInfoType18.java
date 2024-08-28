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
 * Define the ASN1 Type SysInfoType18 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType18 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType18()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType18(PLMNIdentitiesOfNeighbourCells idleModePLMNIdentities, 
		    PLMNIdentitiesOfNeighbourCells connectedModePLMNIdentities, 
		    V6b0NCEs v6b0NCEs)
    {
	setIdleModePLMNIdentities(idleModePLMNIdentities);
	setConnectedModePLMNIdentities(connectedModePLMNIdentities);
	setV6b0NCEs(v6b0NCEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PLMNIdentitiesOfNeighbourCells();
	mComponents[1] = new PLMNIdentitiesOfNeighbourCells();
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
		return new PLMNIdentitiesOfNeighbourCells();
	    case 1:
		return new PLMNIdentitiesOfNeighbourCells();
	    case 2:
		return new V6b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "idleModePLMNIdentities"
    public PLMNIdentitiesOfNeighbourCells getIdleModePLMNIdentities()
    {
	return (PLMNIdentitiesOfNeighbourCells)mComponents[0];
    }
    
    public void setIdleModePLMNIdentities(PLMNIdentitiesOfNeighbourCells idleModePLMNIdentities)
    {
	mComponents[0] = idleModePLMNIdentities;
    }
    
    public boolean hasIdleModePLMNIdentities()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIdleModePLMNIdentities()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "connectedModePLMNIdentities"
    public PLMNIdentitiesOfNeighbourCells getConnectedModePLMNIdentities()
    {
	return (PLMNIdentitiesOfNeighbourCells)mComponents[1];
    }
    
    public void setConnectedModePLMNIdentities(PLMNIdentitiesOfNeighbourCells connectedModePLMNIdentities)
    {
	mComponents[1] = connectedModePLMNIdentities;
    }
    
    public boolean hasConnectedModePLMNIdentities()
    {
	return componentIsPresent(1);
    }
    
    public void deleteConnectedModePLMNIdentities()
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
	public V6b0NCEs(SysInfoType18_v6b0ext sysInfoType18_v6b0ext, 
			V860NCEs v860NCEs)
	{
	    setSysInfoType18_v6b0ext(sysInfoType18_v6b0ext);
	    setV860NCEs(v860NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V6b0NCEs(SysInfoType18_v6b0ext sysInfoType18_v6b0ext)
	{
	    setSysInfoType18_v6b0ext(sysInfoType18_v6b0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType18_v6b0ext();
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
		    return new SysInfoType18_v6b0ext();
		case 1:
		    return new V860NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType18_v6b0ext"
	public SysInfoType18_v6b0ext getSysInfoType18_v6b0ext()
	{
	    return (SysInfoType18_v6b0ext)mComponents[0];
	}
	
	public void setSysInfoType18_v6b0ext(SysInfoType18_v6b0ext sysInfoType18_v6b0ext)
	{
	    mComponents[0] = sysInfoType18_v6b0ext;
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
	    public V860NCEs(SysInfoType18_v860ext sysInfoType18_v860ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setSysInfoType18_v860ext(sysInfoType18_v860ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V860NCEs(SysInfoType18_v860ext sysInfoType18_v860ext)
	    {
		setSysInfoType18_v860ext(sysInfoType18_v860ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType18_v860ext();
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
			return new SysInfoType18_v860ext();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType18_v860ext"
	    public SysInfoType18_v860ext getSysInfoType18_v860ext()
	    {
		return (SysInfoType18_v860ext)mComponents[0];
	    }
	    
	    public void setSysInfoType18_v860ext(SysInfoType18_v860ext sysInfoType18_v860ext)
	    {
		mComponents[0] = sysInfoType18_v860ext;
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
			"SysInfoType18$V6b0NCEs$V860NCEs$NonCriticalExtensions"
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
		    "SysInfoType18$V6b0NCEs$V860NCEs"
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
					"SysInfoType18_v860ext"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType18-v860ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType18_v860ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType18_v860ext"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType18-v860ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType18$V6b0NCEs$V860NCEs$NonCriticalExtensions"
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
		"rrc.informationelements",
		"SysInfoType18$V6b0NCEs"
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
				    "SysInfoType18_v6b0ext"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType18-v6b0ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType18_v6b0ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType18_v6b0ext"
				    )
				),
				0
			    )
			),
			"sysInfoType18-v6b0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType18$V6b0NCEs$V860NCEs"
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
	    "SysInfoType18"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType18"
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
				"PLMNIdentitiesOfNeighbourCells"
			    ),
			    new QName (
				"InformationElements",
				"PLMNIdentitiesOfNeighbourCells"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells"
				)
			    ),
			    0
			)
		    ),
		    "idleModePLMNIdentities",
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
				"PLMNIdentitiesOfNeighbourCells"
			    ),
			    new QName (
				"InformationElements",
				"PLMNIdentitiesOfNeighbourCells"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells"
				)
			    ),
			    0
			)
		    ),
		    "connectedModePLMNIdentities",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType18$V6b0NCEs"
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType18 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType18 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for SysInfoType18
