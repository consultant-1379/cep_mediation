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
 * Define the ASN1 Type MBMS_SelectedServiceInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_SelectedServiceInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_SelectedServiceInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_SelectedServiceInfo(Status status)
    {
	setStatus(status);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Status();
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
		return new Status();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "status"
    public Status getStatus()
    {
	return (Status)mComponents[0];
    }
    
    public void setStatus(Status status)
    {
	mComponents[0] = status;
    }
    
    
    
    /**
     * Define the ASN1 Type Status from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Status extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Status()
	{
	}
	
	public static final  int  none_chosen = 1;
	public static final  int  some_chosen = 2;
	
	// Methods for field "none"
	public static Status createStatusWithNone(Null none)
	{
	    Status __object = new Status();

	    __object.setNone(none);
	    return __object;
	}
	
	public boolean hasNone()
	{
	    return getChosenFlag() == none_chosen;
	}
	
	public void setNone(Null none)
	{
	    setChosenValue(none);
	    setChosenFlag(none_chosen);
	}
	
	
	// Methods for field "some"
	public static Status createStatusWithSome(MBMS_SelectedServicesListFull some)
	{
	    Status __object = new Status();

	    __object.setSome(some);
	    return __object;
	}
	
	public boolean hasSome()
	{
	    return getChosenFlag() == some_chosen;
	}
	
	public void setSome(MBMS_SelectedServicesListFull some)
	{
	    setChosenValue(some);
	    setChosenFlag(some_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case none_chosen:
		    return new Null();
		case some_chosen:
		    return new MBMS_SelectedServicesListFull();
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MBMS_SelectedServiceInfo$Status"
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
			"none",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MBMS_SelectedServicesListFull"
				),
				new QName (
				    "InformationElements",
				    "MBMS-SelectedServicesListFull"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_ServiceIdentity_r6"
				    )
				)
			    )
			),
			"some",
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
	 * Get the type descriptor (TypeInfo) of 'this' Status object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Status object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Status

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
	    "MBMS_SelectedServiceInfo"
	),
	new QName (
	    "InformationElements",
	    "MBMS-SelectedServiceInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_SelectedServiceInfo$Status"
			)
		    ),
		    "status",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_SelectedServiceInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_SelectedServiceInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_SelectedServiceInfo
