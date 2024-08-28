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
 * Define the ASN1 Type UE_Positioning_GANSS_NavigationModel from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_NavigationModel extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_NavigationModel()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_NavigationModel(Non_broadcastIndication non_broadcastIndication, 
		    Ganss_Sat_Info_NavList ganssSatInfoNavList)
    {
	setNon_broadcastIndication(non_broadcastIndication);
	setGanssSatInfoNavList(ganssSatInfoNavList);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GANSS_NavigationModel(Ganss_Sat_Info_NavList ganssSatInfoNavList)
    {
	setGanssSatInfoNavList(ganssSatInfoNavList);
    }
    
    public void initComponents()
    {
	mComponents[0] = Non_broadcastIndication._true;
	mComponents[1] = new Ganss_Sat_Info_NavList();
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
		return Non_broadcastIndication._true;
	    case 1:
		return new Ganss_Sat_Info_NavList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "non_broadcastIndication"
    public Non_broadcastIndication getNon_broadcastIndication()
    {
	return (Non_broadcastIndication)mComponents[0];
    }
    
    public void setNon_broadcastIndication(Non_broadcastIndication non_broadcastIndication)
    {
	mComponents[0] = non_broadcastIndication;
    }
    
    public boolean hasNon_broadcastIndication()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNon_broadcastIndication()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Non_broadcastIndication from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Non_broadcastIndication extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Non_broadcastIndication()
	{
	    super(cFirstNumber);
	}
	
	protected Non_broadcastIndication(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Non_broadcastIndication _true =
	    new Non_broadcastIndication(0);
	private final static Non_broadcastIndication cNamedNumbers[] = {
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
	
	public static Non_broadcastIndication valueOf(long value)
	{
	    return (Non_broadcastIndication)_true.lookupValue(value);
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
		"UE_Positioning_GANSS_NavigationModel$Non_broadcastIndication"
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
	 * Get the type descriptor (TypeInfo) of 'this' Non_broadcastIndication object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Non_broadcastIndication object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Non_broadcastIndication

    // Methods for field "ganssSatInfoNavList"
    public Ganss_Sat_Info_NavList getGanssSatInfoNavList()
    {
	return (Ganss_Sat_Info_NavList)mComponents[1];
    }
    
    public void setGanssSatInfoNavList(Ganss_Sat_Info_NavList ganssSatInfoNavList)
    {
	mComponents[1] = ganssSatInfoNavList;
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
	    "UE_Positioning_GANSS_NavigationModel"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-NavigationModel"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_GANSS_NavigationModel$Non_broadcastIndication"
			)
		    ),
		    "non-broadcastIndication",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Ganss_Sat_Info_NavList"
			    ),
			    new QName (
				"InformationElements",
				"Ganss-Sat-Info-NavList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "Ganss_Sat_Info_Nav"
				)
			    )
			)
		    ),
		    "ganssSatInfoNavList",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_NavigationModel object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_NavigationModel object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_NavigationModel
