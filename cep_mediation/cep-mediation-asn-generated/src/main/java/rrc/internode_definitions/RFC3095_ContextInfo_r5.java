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
 * Define the ASN1 Type RFC3095_ContextInfo_r5 from ASN1 Module Internode_definitions.
 * @see Choice
 */

public class RFC3095_ContextInfo_r5 extends Choice {
    
    /**
     * The default constructor.
     */
    public RFC3095_ContextInfo_r5()
    {
    }
    
    public static final  int  r5_chosen = 1;
    public static final  int  criticalExtensions_chosen = 2;
    
    // Methods for field "r5"
    public static RFC3095_ContextInfo_r5 createRFC3095_ContextInfo_r5WithR5(R5 r5)
    {
	RFC3095_ContextInfo_r5 __object = new RFC3095_ContextInfo_r5();

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
     * Define the ASN1 Type R5 from ASN1 Module Internode_definitions.
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
	public R5(RFC3095_ContextInfoList_r5 rFC3095_ContextInfoList_r5, 
			NonCriticalExtensions nonCriticalExtensions)
	{
	    setRFC3095_ContextInfoList_r5(rFC3095_ContextInfoList_r5);
	    setNonCriticalExtensions(nonCriticalExtensions);
	}
	
	/**
	 * Construct with required components.
	 */
	public R5(RFC3095_ContextInfoList_r5 rFC3095_ContextInfoList_r5)
	{
	    setRFC3095_ContextInfoList_r5(rFC3095_ContextInfoList_r5);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new RFC3095_ContextInfoList_r5();
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
		    return new RFC3095_ContextInfoList_r5();
		case 1:
		    return new NonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "rFC3095_ContextInfoList_r5"
	public RFC3095_ContextInfoList_r5 getRFC3095_ContextInfoList_r5()
	{
	    return (RFC3095_ContextInfoList_r5)mComponents[0];
	}
	
	public void setRFC3095_ContextInfoList_r5(RFC3095_ContextInfoList_r5 rFC3095_ContextInfoList_r5)
	{
	    mComponents[0] = rFC3095_ContextInfoList_r5;
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
		    "RFC3095_ContextInfo_r5$R5$NonCriticalExtensions"
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
		"rrc.internode_definitions",
		"RFC3095_ContextInfo_r5$R5"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.internode_definitions",
				    "RFC3095_ContextInfoList_r5"
				),
				new QName (
				    "Internode-definitions",
				    "RFC3095-ContextInfoList-r5"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(27),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(27)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.internode_definitions",
					"RFC3095_ContextInfo"
				    )
				)
			    )
			),
			"rFC3095-ContextInfoList-r5",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.internode_definitions",
				"RFC3095_ContextInfo_r5$R5$NonCriticalExtensions"
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
    public static RFC3095_ContextInfo_r5 createRFC3095_ContextInfo_r5WithCriticalExtensions(CriticalExtensions criticalExtensions)
    {
	RFC3095_ContextInfo_r5 __object = new RFC3095_ContextInfo_r5();

	__object.setCriticalExtensions(criticalExtensions);
	return __object;
    }
    
    public boolean hasCriticalExtensions()
    {
	return getChosenFlag() == criticalExtensions_chosen;
    }
    
    public void setCriticalExtensions(CriticalExtensions criticalExtensions)
    {
	setChosenValue(criticalExtensions);
	setChosenFlag(criticalExtensions_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type CriticalExtensions from ASN1 Module Internode_definitions.
     * @see Sequence
     */
    public static class CriticalExtensions extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public CriticalExtensions()
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
		"RFC3095_ContextInfo_r5$CriticalExtensions"
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

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case r5_chosen:
		return new R5();
	    case criticalExtensions_chosen:
		return new CriticalExtensions();
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
	    "rrc.internode_definitions",
	    "RFC3095_ContextInfo_r5"
	),
	new QName (
	    "Internode-definitions",
	    "RFC3095-ContextInfo-r5"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "RFC3095_ContextInfo_r5$R5"
			)
		    ),
		    "r5",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "RFC3095_ContextInfo_r5$CriticalExtensions"
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
     * Get the type descriptor (TypeInfo) of 'this' RFC3095_ContextInfo_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RFC3095_ContextInfo_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RFC3095_ContextInfo_r5
