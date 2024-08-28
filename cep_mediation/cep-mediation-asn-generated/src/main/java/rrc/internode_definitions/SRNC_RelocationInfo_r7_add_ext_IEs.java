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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type SRNC_RelocationInfo_r7_add_ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_r7_add_ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_r7_add_ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_r7_add_ext_IEs(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext, 
		    V7f0NCEs v7f0NCEs)
    {
	setSRNC_RelocationInfo_v7e0ext(sRNC_RelocationInfo_v7e0ext);
	setV7f0NCEs(v7f0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SRNC_RelocationInfo_r7_add_ext_IEs(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext)
    {
	setSRNC_RelocationInfo_v7e0ext(sRNC_RelocationInfo_v7e0ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SRNC_RelocationInfo_v7e0ext_IEs();
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
		return new SRNC_RelocationInfo_v7e0ext_IEs();
	    case 1:
		return new V7f0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sRNC_RelocationInfo_v7e0ext"
    public SRNC_RelocationInfo_v7e0ext_IEs getSRNC_RelocationInfo_v7e0ext()
    {
	return (SRNC_RelocationInfo_v7e0ext_IEs)mComponents[0];
    }
    
    public void setSRNC_RelocationInfo_v7e0ext(SRNC_RelocationInfo_v7e0ext_IEs sRNC_RelocationInfo_v7e0ext)
    {
	mComponents[0] = sRNC_RelocationInfo_v7e0ext;
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
     * Define the ASN1 Type V7f0NCEs from ASN1 Module Internode_definitions.
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
	public V7f0NCEs(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext, 
			NonCriticalExtensions nonCriticalExtensions)
	{
	    setSRNC_RelocationInfo_v7f0ext(sRNC_RelocationInfo_v7f0ext);
	    setNonCriticalExtensions(nonCriticalExtensions);
	}
	
	/**
	 * Construct with required components.
	 */
	public V7f0NCEs(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext)
	{
	    setSRNC_RelocationInfo_v7f0ext(sRNC_RelocationInfo_v7f0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SRNC_RelocationInfo_v7f0ext_IEs();
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
		    return new SRNC_RelocationInfo_v7f0ext_IEs();
		case 1:
		    return new NonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sRNC_RelocationInfo_v7f0ext"
	public SRNC_RelocationInfo_v7f0ext_IEs getSRNC_RelocationInfo_v7f0ext()
	{
	    return (SRNC_RelocationInfo_v7f0ext_IEs)mComponents[0];
	}
	
	public void setSRNC_RelocationInfo_v7f0ext(SRNC_RelocationInfo_v7f0ext_IEs sRNC_RelocationInfo_v7f0ext)
	{
	    mComponents[0] = sRNC_RelocationInfo_v7f0ext;
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
	 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module Internode_definitions.
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
		    "rrc.internode_definitions",
		    "SRNC_RelocationInfo_r7_add_ext_IEs$V7f0NCEs$NonCriticalExtensions"
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
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_r7_add_ext_IEs$V7f0NCEs"
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
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_v7f0ext_IEs"
				),
				new QName (
				    "Internode-definitions",
				    "SRNC-RelocationInfo-v7f0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_v7f0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.internode_definitions",
					"SRNC_RelocationInfo_v7f0ext_IEs"
				    )
				),
				0
			    )
			),
			"sRNC-RelocationInfo-v7f0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r7_add_ext_IEs$V7f0NCEs$NonCriticalExtensions"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.internode_definitions",
	    "SRNC_RelocationInfo_r7_add_ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-r7-add-ext-IEs"
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
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_v7e0ext_IEs"
			    ),
			    new QName (
				"Internode-definitions",
				"SRNC-RelocationInfo-v7e0ext-IEs"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_v7e0ext_IEs"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "SRNC_RelocationInfo_v7e0ext_IEs"
				)
			    ),
			    0
			)
		    ),
		    "sRNC-RelocationInfo-v7e0ext",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r7_add_ext_IEs$V7f0NCEs"
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
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r7_add_ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r7_add_ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_r7_add_ext_IEs
