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
 * Define the ASN1 Type PDCP_Capability_r4 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class PDCP_Capability_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDCP_Capability_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDCP_Capability_r4(BOOLEAN losslessSRNS_RelocationSupport, 
		    SupportForRfc2507 supportForRfc2507, 
		    SupportForRfc3095 supportForRfc3095)
    {
	setLosslessSRNS_RelocationSupport(losslessSRNS_RelocationSupport);
	setSupportForRfc2507(supportForRfc2507);
	setSupportForRfc3095(supportForRfc3095);
    }
    
    /**
     * Construct with components.
     */
    public PDCP_Capability_r4(boolean losslessSRNS_RelocationSupport, 
		    SupportForRfc2507 supportForRfc2507, 
		    SupportForRfc3095 supportForRfc3095)
    {
	this(new BOOLEAN(losslessSRNS_RelocationSupport), supportForRfc2507, 
	     supportForRfc3095);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new SupportForRfc2507();
	mComponents[2] = new SupportForRfc3095();
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
		return new BOOLEAN();
	    case 1:
		return new SupportForRfc2507();
	    case 2:
		return new SupportForRfc3095();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "losslessSRNS_RelocationSupport"
    public boolean getLosslessSRNS_RelocationSupport()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setLosslessSRNS_RelocationSupport(boolean losslessSRNS_RelocationSupport)
    {
	setLosslessSRNS_RelocationSupport(new BOOLEAN(losslessSRNS_RelocationSupport));
    }
    
    public void setLosslessSRNS_RelocationSupport(BOOLEAN losslessSRNS_RelocationSupport)
    {
	mComponents[0] = losslessSRNS_RelocationSupport;
    }
    
    
    // Methods for field "supportForRfc2507"
    public SupportForRfc2507 getSupportForRfc2507()
    {
	return (SupportForRfc2507)mComponents[1];
    }
    
    public void setSupportForRfc2507(SupportForRfc2507 supportForRfc2507)
    {
	mComponents[1] = supportForRfc2507;
    }
    
    
    
    /**
     * Define the ASN1 Type SupportForRfc2507 from ASN1 Module Internode_definitions.
     * @see Choice
     */
    public static class SupportForRfc2507 extends Choice {
	
	/**
	 * The default constructor.
	 */
	public SupportForRfc2507()
	{
	}
	
	public static final  int  notSupported_chosen = 1;
	public static final  int  supported_chosen = 2;
	
	// Methods for field "notSupported"
	public static SupportForRfc2507 createSupportForRfc2507WithNotSupported(Null notSupported)
	{
	    SupportForRfc2507 __object = new SupportForRfc2507();

	    __object.setNotSupported(notSupported);
	    return __object;
	}
	
	public boolean hasNotSupported()
	{
	    return getChosenFlag() == notSupported_chosen;
	}
	
	public void setNotSupported(Null notSupported)
	{
	    setChosenValue(notSupported);
	    setChosenFlag(notSupported_chosen);
	}
	
	
	// Methods for field "supported"
	public static SupportForRfc2507 createSupportForRfc2507WithSupported(rrc.informationelements.MaxHcContextSpace supported)
	{
	    SupportForRfc2507 __object = new SupportForRfc2507();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(rrc.informationelements.MaxHcContextSpace supported)
	{
	    setChosenValue(supported);
	    setChosenFlag(supported_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case notSupported_chosen:
		    return new Null();
		case supported_chosen:
		    return rrc.informationelements.MaxHcContextSpace.dummy;
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
		"rrc.internode_definitions",
		"PDCP_Capability_r4$SupportForRfc2507"
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
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
			    )
			),
			"notSupported",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MaxHcContextSpace"
				),
				new QName (
				    "InformationElements",
				    "MaxHcContextSpace"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "dummy",
					    0
					),
					new MemberListElement (
					    "by1024",
					    1
					),
					new MemberListElement (
					    "by2048",
					    2
					),
					new MemberListElement (
					    "by4096",
					    3
					),
					new MemberListElement (
					    "by8192",
					    4
					)
				    }
				),
				0,
				rrc.informationelements.MaxHcContextSpace.dummy
			    )
			),
			"supported",
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportForRfc2507 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportForRfc2507 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportForRfc2507

    // Methods for field "supportForRfc3095"
    public SupportForRfc3095 getSupportForRfc3095()
    {
	return (SupportForRfc3095)mComponents[2];
    }
    
    public void setSupportForRfc3095(SupportForRfc3095 supportForRfc3095)
    {
	mComponents[2] = supportForRfc3095;
    }
    
    
    
    /**
     * Define the ASN1 Type SupportForRfc3095 from ASN1 Module Internode_definitions.
     * @see Choice
     */
    public static class SupportForRfc3095 extends Choice {
	
	/**
	 * The default constructor.
	 */
	public SupportForRfc3095()
	{
	}
	
	public static final  int  notSupported_chosen = 1;
	public static final  int  supported_chosen = 2;
	
	// Methods for field "notSupported"
	public static SupportForRfc3095 createSupportForRfc3095WithNotSupported(Null notSupported)
	{
	    SupportForRfc3095 __object = new SupportForRfc3095();

	    __object.setNotSupported(notSupported);
	    return __object;
	}
	
	public boolean hasNotSupported()
	{
	    return getChosenFlag() == notSupported_chosen;
	}
	
	public void setNotSupported(Null notSupported)
	{
	    setChosenValue(notSupported);
	    setChosenFlag(notSupported_chosen);
	}
	
	
	// Methods for field "supported"
	public static SupportForRfc3095 createSupportForRfc3095WithSupported(Supported supported)
	{
	    SupportForRfc3095 __object = new SupportForRfc3095();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(Supported supported)
	{
	    setChosenValue(supported);
	    setChosenFlag(supported_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Supported from ASN1 Module Internode_definitions.
	 * @see Sequence
	 */
	public static class Supported extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Supported()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Supported(rrc.informationelements.MaxROHC_ContextSessions_r4 maxROHC_ContextSessions, 
			    INTEGER reverseCompressionDepth)
	    {
		setMaxROHC_ContextSessions(maxROHC_ContextSessions);
		setReverseCompressionDepth(reverseCompressionDepth);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Supported(rrc.informationelements.MaxROHC_ContextSessions_r4 maxROHC_ContextSessions, 
			    long reverseCompressionDepth)
	    {
		this(maxROHC_ContextSessions, 
		     new INTEGER(reverseCompressionDepth));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = rrc.informationelements.MaxROHC_ContextSessions_r4.s2;
		mComponents[1] = new INTEGER();
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
			return rrc.informationelements.MaxROHC_ContextSessions_r4.s2;
		    case 1:
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    // Default Values
	    public static final rrc.informationelements.MaxROHC_ContextSessions_r4 maxROHC_ContextSessions__default = 
		rrc.informationelements.MaxROHC_ContextSessions_r4.s16;
	    public static final com.oss.asn1.INTEGER reverseCompressionDepth__default = 
		new com.oss.asn1.INTEGER(0);
	    
	    // Methods for field "maxROHC_ContextSessions"
	    public rrc.informationelements.MaxROHC_ContextSessions_r4 getMaxROHC_ContextSessions()
	    {
		if (hasMaxROHC_ContextSessions())
		    return (rrc.informationelements.MaxROHC_ContextSessions_r4)mComponents[0];
		else
		    return (rrc.informationelements.MaxROHC_ContextSessions_r4)maxROHC_ContextSessions__default.clone();
	    }
	    
	    public void setMaxROHC_ContextSessions(rrc.informationelements.MaxROHC_ContextSessions_r4 maxROHC_ContextSessions)
	    {
		mComponents[0] = maxROHC_ContextSessions;
	    }
	    
	    public void setMaxROHC_ContextSessionsToDefault()
	    {
		setMaxROHC_ContextSessions(maxROHC_ContextSessions__default);
	    }
	    
	    public boolean hasDefaultMaxROHC_ContextSessions()
	    {
		return true;
	    }
	    
	    public boolean hasMaxROHC_ContextSessions()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteMaxROHC_ContextSessions()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "reverseCompressionDepth"
	    public long getReverseCompressionDepth()
	    {
		if (hasReverseCompressionDepth())
		    return ((INTEGER)mComponents[1]).longValue();
		else
		    return reverseCompressionDepth__default.longValue();
	    }
	    
	    public void setReverseCompressionDepth(long reverseCompressionDepth)
	    {
		setReverseCompressionDepth(new INTEGER(reverseCompressionDepth));
	    }
	    
	    public void setReverseCompressionDepth(INTEGER reverseCompressionDepth)
	    {
		mComponents[1] = reverseCompressionDepth;
	    }
	    
	    public void setReverseCompressionDepthToDefault()
	    {
		setReverseCompressionDepth(reverseCompressionDepth__default);
	    }
	    
	    public boolean hasDefaultReverseCompressionDepth()
	    {
		return true;
	    }
	    
	    public boolean hasReverseCompressionDepth()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteReverseCompressionDepth()
	    {
		setComponentAbsent(1);
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
		    "PDCP_Capability_r4$SupportForRfc3095$Supported"
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
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"MaxROHC_ContextSessions_r4"
				    ),
				    new QName (
					"InformationElements",
					"MaxROHC-ContextSessions-r4"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"s2",
						0
					    ),
					    new MemberListElement (
						"s4",
						1
					    ),
					    new MemberListElement (
						"s8",
						2
					    ),
					    new MemberListElement (
						"s12",
						3
					    ),
					    new MemberListElement (
						"s16",
						4
					    ),
					    new MemberListElement (
						"s24",
						5
					    ),
					    new MemberListElement (
						"s32",
						6
					    ),
					    new MemberListElement (
						"s48",
						7
					    ),
					    new MemberListElement (
						"s64",
						8
					    ),
					    new MemberListElement (
						"s128",
						9
					    ),
					    new MemberListElement (
						"s256",
						10
					    ),
					    new MemberListElement (
						"s512",
						11
					    ),
					    new MemberListElement (
						"s1024",
						12
					    ),
					    new MemberListElement (
						"s16384",
						13
					    )
					}
				    ),
				    0,
				    rrc.informationelements.MaxROHC_ContextSessions_r4.s2
				)
			    ),
			    "maxROHC-ContextSessions",
			    0,
			    3,
			    maxROHC_ContextSessions__default
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"INTEGER"
				    ),
				    new QName (
					"builtin",
					"INTEGER"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(0), 
					    new com.oss.asn1.INTEGER(65535),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(65535)
				    ),
				    null
				)
			    ),
			    "reverseCompressionDepth",
			    1,
			    3,
			    reverseCompressionDepth__default
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
	     * Get the type descriptor (TypeInfo) of 'this' Supported object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Supported object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Supported

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case notSupported_chosen:
		    return new Null();
		case supported_chosen:
		    return new Supported();
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"PDCP_Capability_r4$SupportForRfc3095"
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
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
			    )
			),
			"notSupported",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.internode_definitions",
				"PDCP_Capability_r4$SupportForRfc3095$Supported"
			    )
			),
			"supported",
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportForRfc3095 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportForRfc3095 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportForRfc3095

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
	    "PDCP_Capability_r4"
	),
	new QName (
	    "Internode-definitions",
	    "PDCP-Capability-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "losslessSRNS-RelocationSupport",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "PDCP_Capability_r4$SupportForRfc2507"
			)
		    ),
		    "supportForRfc2507",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "PDCP_Capability_r4$SupportForRfc3095"
			)
		    ),
		    "supportForRfc3095",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' PDCP_Capability_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDCP_Capability_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDCP_Capability_r4
