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
 * Define the ASN1 Type MBSFNservicesNotNotified_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBSFNservicesNotNotified_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBSFNservicesNotNotified_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBSFNservicesNotNotified_r7(NotificationOfAllMBSFNServicesInTheBand notificationOfAllMBSFNServicesInTheBand)
    {
	setNotificationOfAllMBSFNServicesInTheBand(notificationOfAllMBSFNServicesInTheBand);
    }
    
    public void initComponents()
    {
	mComponents[0] = NotificationOfAllMBSFNServicesInTheBand._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return NotificationOfAllMBSFNServicesInTheBand._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "notificationOfAllMBSFNServicesInTheBand"
    public NotificationOfAllMBSFNServicesInTheBand getNotificationOfAllMBSFNServicesInTheBand()
    {
	return (NotificationOfAllMBSFNServicesInTheBand)mComponents[0];
    }
    
    public void setNotificationOfAllMBSFNServicesInTheBand(NotificationOfAllMBSFNServicesInTheBand notificationOfAllMBSFNServicesInTheBand)
    {
	mComponents[0] = notificationOfAllMBSFNServicesInTheBand;
    }
    
    public boolean hasNotificationOfAllMBSFNServicesInTheBand()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNotificationOfAllMBSFNServicesInTheBand()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type NotificationOfAllMBSFNServicesInTheBand from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class NotificationOfAllMBSFNServicesInTheBand extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private NotificationOfAllMBSFNServicesInTheBand()
	{
	    super(cFirstNumber);
	}
	
	protected NotificationOfAllMBSFNServicesInTheBand(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final NotificationOfAllMBSFNServicesInTheBand _true =
	    new NotificationOfAllMBSFNServicesInTheBand(0);
	private final static NotificationOfAllMBSFNServicesInTheBand cNamedNumbers[] = {
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
	
	public static NotificationOfAllMBSFNServicesInTheBand valueOf(long value)
	{
	    return (NotificationOfAllMBSFNServicesInTheBand)_true.lookupValue(value);
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
		"MBSFNservicesNotNotified_r7$NotificationOfAllMBSFNServicesInTheBand"
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
	 * Get the type descriptor (TypeInfo) of 'this' NotificationOfAllMBSFNServicesInTheBand object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NotificationOfAllMBSFNServicesInTheBand object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NotificationOfAllMBSFNServicesInTheBand

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
	    "MBSFNservicesNotNotified_r7"
	),
	new QName (
	    "InformationElements",
	    "MBSFNservicesNotNotified-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBSFNservicesNotNotified_r7$NotificationOfAllMBSFNServicesInTheBand"
			)
		    ),
		    "notificationOfAllMBSFNServicesInTheBand",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBSFNservicesNotNotified_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBSFNservicesNotNotified_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBSFNservicesNotNotified_r7
