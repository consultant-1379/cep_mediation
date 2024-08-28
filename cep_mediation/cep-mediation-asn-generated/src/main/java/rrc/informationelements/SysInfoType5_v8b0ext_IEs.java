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
 * Define the ASN1 Type SysInfoType5_v8b0ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType5_v8b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType5_v8b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType5_v8b0ext_IEs(TresetUsageIndicator tresetUsageIndicator, 
		    UpPCHposition_LCR upPCHpositionInfo)
    {
	setTresetUsageIndicator(tresetUsageIndicator);
	setUpPCHpositionInfo(upPCHpositionInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = TresetUsageIndicator._true;
	mComponents[1] = new UpPCHposition_LCR();
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
		return TresetUsageIndicator._true;
	    case 1:
		return new UpPCHposition_LCR();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tresetUsageIndicator"
    public TresetUsageIndicator getTresetUsageIndicator()
    {
	return (TresetUsageIndicator)mComponents[0];
    }
    
    public void setTresetUsageIndicator(TresetUsageIndicator tresetUsageIndicator)
    {
	mComponents[0] = tresetUsageIndicator;
    }
    
    public boolean hasTresetUsageIndicator()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTresetUsageIndicator()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type TresetUsageIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class TresetUsageIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private TresetUsageIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected TresetUsageIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final TresetUsageIndicator _true =
	    new TresetUsageIndicator(0);
	private final static TresetUsageIndicator cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static TresetUsageIndicator valueOf(long value)
	{
	    return (TresetUsageIndicator)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType5_v8b0ext_IEs$TresetUsageIndicator"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' TresetUsageIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' TresetUsageIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for TresetUsageIndicator

    // Methods for field "upPCHpositionInfo"
    public UpPCHposition_LCR getUpPCHpositionInfo()
    {
	return (UpPCHposition_LCR)mComponents[1];
    }
    
    public void setUpPCHpositionInfo(UpPCHposition_LCR upPCHpositionInfo)
    {
	mComponents[1] = upPCHpositionInfo;
    }
    
    public boolean hasUpPCHpositionInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUpPCHpositionInfo()
    {
	setComponentAbsent(1);
    }
    
    
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
	    "SysInfoType5_v8b0ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType5-v8b0ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5_v8b0ext_IEs$TresetUsageIndicator"
			)
		    ),
		    "tresetUsageIndicator",
		    0,
		    3,
		    null
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
				"rrc.informationelements",
				"UpPCHposition_LCR"
			    ),
			    new QName (
				"InformationElements",
				"UpPCHposition-LCR"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UpPCHposition_LCR(0), 
				    new UpPCHposition_LCR(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "upPCHpositionInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType5_v8b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType5_v8b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType5_v8b0ext_IEs
