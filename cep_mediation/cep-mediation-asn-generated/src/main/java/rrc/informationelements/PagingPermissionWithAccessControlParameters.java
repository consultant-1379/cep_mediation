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
 * Define the ASN1 Type PagingPermissionWithAccessControlParameters from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PagingPermissionWithAccessControlParameters extends Sequence {
    
    /**
     * The default constructor.
     */
    public PagingPermissionWithAccessControlParameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PagingPermissionWithAccessControlParameters(PagingResponseRestrictionIndicator pagingResponseRestrictionIndicator, 
		    LocationRegistrationRestrictionIndicator locationRegistrationRestrictionIndicator, 
		    LocationRegistrationParameters locationRegistration)
    {
	setPagingResponseRestrictionIndicator(pagingResponseRestrictionIndicator);
	setLocationRegistrationRestrictionIndicator(locationRegistrationRestrictionIndicator);
	setLocationRegistration(locationRegistration);
    }
    
    public void initComponents()
    {
	mComponents[0] = PagingResponseRestrictionIndicator.all;
	mComponents[1] = LocationRegistrationRestrictionIndicator.all;
	mComponents[2] = new LocationRegistrationParameters();
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
		return PagingResponseRestrictionIndicator.all;
	    case 1:
		return LocationRegistrationRestrictionIndicator.all;
	    case 2:
		return new LocationRegistrationParameters();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pagingResponseRestrictionIndicator"
    public PagingResponseRestrictionIndicator getPagingResponseRestrictionIndicator()
    {
	return (PagingResponseRestrictionIndicator)mComponents[0];
    }
    
    public void setPagingResponseRestrictionIndicator(PagingResponseRestrictionIndicator pagingResponseRestrictionIndicator)
    {
	mComponents[0] = pagingResponseRestrictionIndicator;
    }
    
    
    
    /**
     * Define the ASN1 Type PagingResponseRestrictionIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class PagingResponseRestrictionIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private PagingResponseRestrictionIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected PagingResponseRestrictionIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final PagingResponseRestrictionIndicator all =
	    new PagingResponseRestrictionIndicator(0);
	public static final PagingResponseRestrictionIndicator cS =
	    new PagingResponseRestrictionIndicator(1);
	public static final PagingResponseRestrictionIndicator pS =
	    new PagingResponseRestrictionIndicator(2);
	public static final PagingResponseRestrictionIndicator none =
	    new PagingResponseRestrictionIndicator(3);
	private final static PagingResponseRestrictionIndicator cNamedNumbers[] = {
	     all, 
	     cS, 
	     pS, 
	     none
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
	
	public static PagingResponseRestrictionIndicator valueOf(long value)
	{
	    return (PagingResponseRestrictionIndicator)all.lookupValue(value);
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
		"PagingPermissionWithAccessControlParameters$PagingResponseRestrictionIndicator"
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
			"all",
			0
		    ),
		    new MemberListElement (
			"cS",
			1
		    ),
		    new MemberListElement (
			"pS",
			2
		    ),
		    new MemberListElement (
			"none",
			3
		    )
		}
	    ),
	    0,
	    all
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' PagingResponseRestrictionIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' PagingResponseRestrictionIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for PagingResponseRestrictionIndicator

    // Methods for field "locationRegistrationRestrictionIndicator"
    public LocationRegistrationRestrictionIndicator getLocationRegistrationRestrictionIndicator()
    {
	return (LocationRegistrationRestrictionIndicator)mComponents[1];
    }
    
    public void setLocationRegistrationRestrictionIndicator(LocationRegistrationRestrictionIndicator locationRegistrationRestrictionIndicator)
    {
	mComponents[1] = locationRegistrationRestrictionIndicator;
    }
    
    
    
    /**
     * Define the ASN1 Type LocationRegistrationRestrictionIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class LocationRegistrationRestrictionIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LocationRegistrationRestrictionIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected LocationRegistrationRestrictionIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LocationRegistrationRestrictionIndicator all =
	    new LocationRegistrationRestrictionIndicator(0);
	public static final LocationRegistrationRestrictionIndicator cS =
	    new LocationRegistrationRestrictionIndicator(1);
	public static final LocationRegistrationRestrictionIndicator pS =
	    new LocationRegistrationRestrictionIndicator(2);
	private final static LocationRegistrationRestrictionIndicator cNamedNumbers[] = {
	     all, 
	     cS, 
	     pS
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
	
	public static LocationRegistrationRestrictionIndicator valueOf(long value)
	{
	    return (LocationRegistrationRestrictionIndicator)all.lookupValue(value);
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
		"PagingPermissionWithAccessControlParameters$LocationRegistrationRestrictionIndicator"
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
			"all",
			0
		    ),
		    new MemberListElement (
			"cS",
			1
		    ),
		    new MemberListElement (
			"pS",
			2
		    )
		}
	    ),
	    0,
	    all
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' LocationRegistrationRestrictionIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LocationRegistrationRestrictionIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LocationRegistrationRestrictionIndicator

    // Methods for field "locationRegistration"
    public LocationRegistrationParameters getLocationRegistration()
    {
	return (LocationRegistrationParameters)mComponents[2];
    }
    
    public void setLocationRegistration(LocationRegistrationParameters locationRegistration)
    {
	mComponents[2] = locationRegistration;
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
	    "PagingPermissionWithAccessControlParameters"
	),
	new QName (
	    "InformationElements",
	    "PagingPermissionWithAccessControlParameters"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PagingPermissionWithAccessControlParameters$PagingResponseRestrictionIndicator"
			)
		    ),
		    "pagingResponseRestrictionIndicator",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PagingPermissionWithAccessControlParameters$LocationRegistrationRestrictionIndicator"
			)
		    ),
		    "locationRegistrationRestrictionIndicator",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LocationRegistrationParameters"
			    ),
			    new QName (
				"InformationElements",
				"LocationRegistrationParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LocationRegistrationParameters"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "locationRegistration",
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
     * Get the type descriptor (TypeInfo) of 'this' PagingPermissionWithAccessControlParameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PagingPermissionWithAccessControlParameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PagingPermissionWithAccessControlParameters
