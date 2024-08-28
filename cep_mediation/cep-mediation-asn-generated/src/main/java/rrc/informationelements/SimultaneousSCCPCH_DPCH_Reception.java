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
 * Define the ASN1 Type SimultaneousSCCPCH_DPCH_Reception from ASN1 Module InformationElements.
 * @see Choice
 */

public class SimultaneousSCCPCH_DPCH_Reception extends Choice {
    
    /**
     * The default constructor.
     */
    public SimultaneousSCCPCH_DPCH_Reception()
    {
    }
    
    public static final  int  notSupported_chosen = 1;
    public static final  int  supported_chosen = 2;
    
    // Methods for field "notSupported"
    public static SimultaneousSCCPCH_DPCH_Reception createSimultaneousSCCPCH_DPCH_ReceptionWithNotSupported(Null notSupported)
    {
	SimultaneousSCCPCH_DPCH_Reception __object = new SimultaneousSCCPCH_DPCH_Reception();

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
    public static SimultaneousSCCPCH_DPCH_Reception createSimultaneousSCCPCH_DPCH_ReceptionWithSupported(Supported supported)
    {
	SimultaneousSCCPCH_DPCH_Reception __object = new SimultaneousSCCPCH_DPCH_Reception();

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
     * Define the ASN1 Type Supported from ASN1 Module InformationElements.
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
	public Supported(MaxNoSCCPCH_RL maxNoSCCPCH_RL, 
			BOOLEAN simultaneousSCCPCH_DPCH_DPDCH_Reception)
	{
	    setMaxNoSCCPCH_RL(maxNoSCCPCH_RL);
	    setSimultaneousSCCPCH_DPCH_DPDCH_Reception(simultaneousSCCPCH_DPCH_DPDCH_Reception);
	}
	
	/**
	 * Construct with components.
	 */
	public Supported(MaxNoSCCPCH_RL maxNoSCCPCH_RL, 
			boolean simultaneousSCCPCH_DPCH_DPDCH_Reception)
	{
	    this(maxNoSCCPCH_RL, 
		 new BOOLEAN(simultaneousSCCPCH_DPCH_DPDCH_Reception));
	}
	
	public void initComponents()
	{
	    mComponents[0] = MaxNoSCCPCH_RL.rl1;
	    mComponents[1] = new BOOLEAN();
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
		    return MaxNoSCCPCH_RL.rl1;
		case 1:
		    return new BOOLEAN();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "maxNoSCCPCH_RL"
	public MaxNoSCCPCH_RL getMaxNoSCCPCH_RL()
	{
	    return (MaxNoSCCPCH_RL)mComponents[0];
	}
	
	public void setMaxNoSCCPCH_RL(MaxNoSCCPCH_RL maxNoSCCPCH_RL)
	{
	    mComponents[0] = maxNoSCCPCH_RL;
	}
	
	
	// Methods for field "simultaneousSCCPCH_DPCH_DPDCH_Reception"
	public boolean getSimultaneousSCCPCH_DPCH_DPDCH_Reception()
	{
	    return ((BOOLEAN)mComponents[1]).booleanValue();
	}
	
	public void setSimultaneousSCCPCH_DPCH_DPDCH_Reception(boolean simultaneousSCCPCH_DPCH_DPDCH_Reception)
	{
	    setSimultaneousSCCPCH_DPCH_DPDCH_Reception(new BOOLEAN(simultaneousSCCPCH_DPCH_DPDCH_Reception));
	}
	
	public void setSimultaneousSCCPCH_DPCH_DPDCH_Reception(BOOLEAN simultaneousSCCPCH_DPCH_DPDCH_Reception)
	{
	    mComponents[1] = simultaneousSCCPCH_DPCH_DPDCH_Reception;
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
		"SimultaneousSCCPCH_DPCH_Reception$Supported"
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
				    "MaxNoSCCPCH_RL"
				),
				new QName (
				    "InformationElements",
				    "MaxNoSCCPCH-RL"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "rl1",
					    0
					)
				    }
				),
				0,
				MaxNoSCCPCH_RL.rl1
			    )
			),
			"maxNoSCCPCH-RL",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
			"simultaneousSCCPCH-DPCH-DPDCH-Reception",
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
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "SimultaneousSCCPCH_DPCH_Reception"
	),
	new QName (
	    "InformationElements",
	    "SimultaneousSCCPCH-DPCH-Reception"
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
			    "rrc.informationelements",
			    "SimultaneousSCCPCH_DPCH_Reception$Supported"
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
     * Get the type descriptor (TypeInfo) of 'this' SimultaneousSCCPCH_DPCH_Reception object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SimultaneousSCCPCH_DPCH_Reception object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SimultaneousSCCPCH_DPCH_Reception
