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
 * Define the ASN1 Type PDCP_Capability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDCP_Capability extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDCP_Capability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDCP_Capability(BOOLEAN losslessSRNS_RelocationSupport, 
		    SupportForRfc2507 supportForRfc2507)
    {
	setLosslessSRNS_RelocationSupport(losslessSRNS_RelocationSupport);
	setSupportForRfc2507(supportForRfc2507);
    }
    
    /**
     * Construct with components.
     */
    public PDCP_Capability(boolean losslessSRNS_RelocationSupport, 
		    SupportForRfc2507 supportForRfc2507)
    {
	this(new BOOLEAN(losslessSRNS_RelocationSupport), supportForRfc2507);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new SupportForRfc2507();
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
		return new BOOLEAN();
	    case 1:
		return new SupportForRfc2507();
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
     * Define the ASN1 Type SupportForRfc2507 from ASN1 Module InformationElements.
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
	public static SupportForRfc2507 createSupportForRfc2507WithSupported(MaxHcContextSpace supported)
	{
	    SupportForRfc2507 __object = new SupportForRfc2507();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(MaxHcContextSpace supported)
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
		    return MaxHcContextSpace.dummy;
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
		"rrc.informationelements",
		"PDCP_Capability$SupportForRfc2507"
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
				MaxHcContextSpace.dummy
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
	    "PDCP_Capability"
	),
	new QName (
	    "InformationElements",
	    "PDCP-Capability"
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
			    "rrc.informationelements",
			    "PDCP_Capability$SupportForRfc2507"
			)
		    ),
		    "supportForRfc2507",
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
     * Get the type descriptor (TypeInfo) of 'this' PDCP_Capability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDCP_Capability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDCP_Capability
