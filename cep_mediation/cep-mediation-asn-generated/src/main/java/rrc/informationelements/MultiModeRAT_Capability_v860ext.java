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
 * Define the ASN1 Type MultiModeRAT_Capability_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MultiModeRAT_Capability_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MultiModeRAT_Capability_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MultiModeRAT_Capability_v860ext(SupportOfEUTRAFDD supportOfEUTRAFDD, 
		    SupportOfInterRATHOToEUTRAFDD supportOfInterRATHOToEUTRAFDD, 
		    SupportOfEUTRATDD supportOfEUTRATDD, 
		    SupportOfInterRATHOToEUTRATDD supportOfInterRATHOToEUTRATDD, 
		    BitString eutraFeatureGroupIndicators)
    {
	setSupportOfEUTRAFDD(supportOfEUTRAFDD);
	setSupportOfInterRATHOToEUTRAFDD(supportOfInterRATHOToEUTRAFDD);
	setSupportOfEUTRATDD(supportOfEUTRATDD);
	setSupportOfInterRATHOToEUTRATDD(supportOfInterRATHOToEUTRATDD);
	setEutraFeatureGroupIndicators(eutraFeatureGroupIndicators);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportOfEUTRAFDD.doesSupportEUTRAFDD;
	mComponents[1] = SupportOfInterRATHOToEUTRAFDD.doesSupportInterRATHOToEUTRAFDD;
	mComponents[2] = SupportOfEUTRATDD.doesSupportEUTRATDD;
	mComponents[3] = SupportOfInterRATHOToEUTRATDD.doesSupportInterRATHOToEUTRATDD;
	mComponents[4] = new BitString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return SupportOfEUTRAFDD.doesSupportEUTRAFDD;
	    case 1:
		return SupportOfInterRATHOToEUTRAFDD.doesSupportInterRATHOToEUTRAFDD;
	    case 2:
		return SupportOfEUTRATDD.doesSupportEUTRATDD;
	    case 3:
		return SupportOfInterRATHOToEUTRATDD.doesSupportInterRATHOToEUTRATDD;
	    case 4:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfEUTRAFDD"
    public SupportOfEUTRAFDD getSupportOfEUTRAFDD()
    {
	return (SupportOfEUTRAFDD)mComponents[0];
    }
    
    public void setSupportOfEUTRAFDD(SupportOfEUTRAFDD supportOfEUTRAFDD)
    {
	mComponents[0] = supportOfEUTRAFDD;
    }
    
    public boolean hasSupportOfEUTRAFDD()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportOfEUTRAFDD()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfEUTRAFDD from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfEUTRAFDD extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfEUTRAFDD()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfEUTRAFDD(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfEUTRAFDD doesSupportEUTRAFDD =
	    new SupportOfEUTRAFDD(0);
	private final static SupportOfEUTRAFDD cNamedNumbers[] = {
	     doesSupportEUTRAFDD
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
	
	public static SupportOfEUTRAFDD valueOf(long value)
	{
	    return (SupportOfEUTRAFDD)doesSupportEUTRAFDD.lookupValue(value);
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
		"MultiModeRAT_Capability_v860ext$SupportOfEUTRAFDD"
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
			"doesSupportEUTRAFDD",
			0
		    )
		}
	    ),
	    0,
	    doesSupportEUTRAFDD
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfEUTRAFDD object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfEUTRAFDD object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfEUTRAFDD

    // Methods for field "supportOfInterRATHOToEUTRAFDD"
    public SupportOfInterRATHOToEUTRAFDD getSupportOfInterRATHOToEUTRAFDD()
    {
	return (SupportOfInterRATHOToEUTRAFDD)mComponents[1];
    }
    
    public void setSupportOfInterRATHOToEUTRAFDD(SupportOfInterRATHOToEUTRAFDD supportOfInterRATHOToEUTRAFDD)
    {
	mComponents[1] = supportOfInterRATHOToEUTRAFDD;
    }
    
    public boolean hasSupportOfInterRATHOToEUTRAFDD()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSupportOfInterRATHOToEUTRAFDD()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfInterRATHOToEUTRAFDD from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfInterRATHOToEUTRAFDD extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfInterRATHOToEUTRAFDD()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfInterRATHOToEUTRAFDD(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfInterRATHOToEUTRAFDD doesSupportInterRATHOToEUTRAFDD =
	    new SupportOfInterRATHOToEUTRAFDD(0);
	private final static SupportOfInterRATHOToEUTRAFDD cNamedNumbers[] = {
	     doesSupportInterRATHOToEUTRAFDD
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
	
	public static SupportOfInterRATHOToEUTRAFDD valueOf(long value)
	{
	    return (SupportOfInterRATHOToEUTRAFDD)doesSupportInterRATHOToEUTRAFDD.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MultiModeRAT_Capability_v860ext$SupportOfInterRATHOToEUTRAFDD"
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
			"doesSupportInterRATHOToEUTRAFDD",
			0
		    )
		}
	    ),
	    0,
	    doesSupportInterRATHOToEUTRAFDD
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfInterRATHOToEUTRAFDD object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfInterRATHOToEUTRAFDD object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfInterRATHOToEUTRAFDD

    // Methods for field "supportOfEUTRATDD"
    public SupportOfEUTRATDD getSupportOfEUTRATDD()
    {
	return (SupportOfEUTRATDD)mComponents[2];
    }
    
    public void setSupportOfEUTRATDD(SupportOfEUTRATDD supportOfEUTRATDD)
    {
	mComponents[2] = supportOfEUTRATDD;
    }
    
    public boolean hasSupportOfEUTRATDD()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSupportOfEUTRATDD()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfEUTRATDD from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfEUTRATDD extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfEUTRATDD()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfEUTRATDD(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfEUTRATDD doesSupportEUTRATDD =
	    new SupportOfEUTRATDD(0);
	private final static SupportOfEUTRATDD cNamedNumbers[] = {
	     doesSupportEUTRATDD
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
	
	public static SupportOfEUTRATDD valueOf(long value)
	{
	    return (SupportOfEUTRATDD)doesSupportEUTRATDD.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MultiModeRAT_Capability_v860ext$SupportOfEUTRATDD"
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
			"doesSupportEUTRATDD",
			0
		    )
		}
	    ),
	    0,
	    doesSupportEUTRATDD
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfEUTRATDD object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfEUTRATDD object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfEUTRATDD

    // Methods for field "supportOfInterRATHOToEUTRATDD"
    public SupportOfInterRATHOToEUTRATDD getSupportOfInterRATHOToEUTRATDD()
    {
	return (SupportOfInterRATHOToEUTRATDD)mComponents[3];
    }
    
    public void setSupportOfInterRATHOToEUTRATDD(SupportOfInterRATHOToEUTRATDD supportOfInterRATHOToEUTRATDD)
    {
	mComponents[3] = supportOfInterRATHOToEUTRATDD;
    }
    
    public boolean hasSupportOfInterRATHOToEUTRATDD()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSupportOfInterRATHOToEUTRATDD()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfInterRATHOToEUTRATDD from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfInterRATHOToEUTRATDD extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfInterRATHOToEUTRATDD()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfInterRATHOToEUTRATDD(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfInterRATHOToEUTRATDD doesSupportInterRATHOToEUTRATDD =
	    new SupportOfInterRATHOToEUTRATDD(0);
	private final static SupportOfInterRATHOToEUTRATDD cNamedNumbers[] = {
	     doesSupportInterRATHOToEUTRATDD
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
	
	public static SupportOfInterRATHOToEUTRATDD valueOf(long value)
	{
	    return (SupportOfInterRATHOToEUTRATDD)doesSupportInterRATHOToEUTRATDD.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MultiModeRAT_Capability_v860ext$SupportOfInterRATHOToEUTRATDD"
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
			"doesSupportInterRATHOToEUTRATDD",
			0
		    )
		}
	    ),
	    0,
	    doesSupportInterRATHOToEUTRATDD
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfInterRATHOToEUTRATDD object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfInterRATHOToEUTRATDD object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfInterRATHOToEUTRATDD

    // Methods for field "eutraFeatureGroupIndicators"
    public BitString getEutraFeatureGroupIndicators()
    {
	return (BitString)mComponents[4];
    }
    
    public void setEutraFeatureGroupIndicators(BitString eutraFeatureGroupIndicators)
    {
	mComponents[4] = eutraFeatureGroupIndicators;
    }
    
    public boolean hasEutraFeatureGroupIndicators()
    {
	return componentIsPresent(4);
    }
    
    public void deleteEutraFeatureGroupIndicators()
    {
	setComponentAbsent(4);
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
	    "MultiModeRAT_Capability_v860ext"
	),
	new QName (
	    "InformationElements",
	    "MultiModeRAT-Capability-v860ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MultiModeRAT_Capability_v860ext$SupportOfEUTRAFDD"
			)
		    ),
		    "supportOfEUTRAFDD",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MultiModeRAT_Capability_v860ext$SupportOfInterRATHOToEUTRAFDD"
			)
		    ),
		    "supportOfInterRATHOToEUTRAFDD",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MultiModeRAT_Capability_v860ext$SupportOfEUTRATDD"
			)
		    ),
		    "supportOfEUTRATDD",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MultiModeRAT_Capability_v860ext$SupportOfInterRATHOToEUTRATDD"
			)
		    ),
		    "supportOfInterRATHOToEUTRATDD",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(4)
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "eutraFeatureGroupIndicators",
		    4,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MultiModeRAT_Capability_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MultiModeRAT_Capability_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MultiModeRAT_Capability_v860ext
