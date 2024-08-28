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
 * Define the ASN1 Type MBSFNInterFrequencyNeighbour_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBSFNInterFrequencyNeighbour_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBSFNInterFrequencyNeighbour_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBSFNInterFrequencyNeighbour_r7(FrequencyInfo mbsfnFrequency, 
		    MbsfnServicesNotification mbsfnServicesNotification)
    {
	setMbsfnFrequency(mbsfnFrequency);
	setMbsfnServicesNotification(mbsfnServicesNotification);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FrequencyInfo();
	mComponents[1] = new MbsfnServicesNotification();
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
		return new FrequencyInfo();
	    case 1:
		return new MbsfnServicesNotification();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbsfnFrequency"
    public FrequencyInfo getMbsfnFrequency()
    {
	return (FrequencyInfo)mComponents[0];
    }
    
    public void setMbsfnFrequency(FrequencyInfo mbsfnFrequency)
    {
	mComponents[0] = mbsfnFrequency;
    }
    
    
    // Methods for field "mbsfnServicesNotification"
    public MbsfnServicesNotification getMbsfnServicesNotification()
    {
	return (MbsfnServicesNotification)mComponents[1];
    }
    
    public void setMbsfnServicesNotification(MbsfnServicesNotification mbsfnServicesNotification)
    {
	mComponents[1] = mbsfnServicesNotification;
    }
    
    
    
    /**
     * Define the ASN1 Type MbsfnServicesNotification from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class MbsfnServicesNotification extends Choice {
	
	/**
	 * The default constructor.
	 */
	public MbsfnServicesNotification()
	{
	}
	
	public static final  int  mbsfnServicesNotified_chosen = 1;
	public static final  int  mbsfnServicesNotNotified_chosen = 2;
	
	// Methods for field "mbsfnServicesNotified"
	public static MbsfnServicesNotification createMbsfnServicesNotificationWithMbsfnServicesNotified(Null mbsfnServicesNotified)
	{
	    MbsfnServicesNotification __object = new MbsfnServicesNotification();

	    __object.setMbsfnServicesNotified(mbsfnServicesNotified);
	    return __object;
	}
	
	public boolean hasMbsfnServicesNotified()
	{
	    return getChosenFlag() == mbsfnServicesNotified_chosen;
	}
	
	public void setMbsfnServicesNotified(Null mbsfnServicesNotified)
	{
	    setChosenValue(mbsfnServicesNotified);
	    setChosenFlag(mbsfnServicesNotified_chosen);
	}
	
	
	// Methods for field "mbsfnServicesNotNotified"
	public static MbsfnServicesNotification createMbsfnServicesNotificationWithMbsfnServicesNotNotified(MBSFNservicesNotNotified_r7 mbsfnServicesNotNotified)
	{
	    MbsfnServicesNotification __object = new MbsfnServicesNotification();

	    __object.setMbsfnServicesNotNotified(mbsfnServicesNotNotified);
	    return __object;
	}
	
	public boolean hasMbsfnServicesNotNotified()
	{
	    return getChosenFlag() == mbsfnServicesNotNotified_chosen;
	}
	
	public void setMbsfnServicesNotNotified(MBSFNservicesNotNotified_r7 mbsfnServicesNotNotified)
	{
	    setChosenValue(mbsfnServicesNotNotified);
	    setChosenFlag(mbsfnServicesNotNotified_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case mbsfnServicesNotified_chosen:
		    return new Null();
		case mbsfnServicesNotNotified_chosen:
		    return new MBSFNservicesNotNotified_r7();
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
		"MBSFNInterFrequencyNeighbour_r7$MbsfnServicesNotification"
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
			"mbsfnServicesNotified",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MBSFNservicesNotNotified_r7"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MBSFNservicesNotNotified_r7"
				    )
				),
				0
			    )
			),
			"mbsfnServicesNotNotified",
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
	 * Get the type descriptor (TypeInfo) of 'this' MbsfnServicesNotification object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MbsfnServicesNotification object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MbsfnServicesNotification

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
	    "MBSFNInterFrequencyNeighbour_r7"
	),
	new QName (
	    "InformationElements",
	    "MBSFNInterFrequencyNeighbour-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"FrequencyInfo"
			    ),
			    new QName (
				"InformationElements",
				"FrequencyInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0
			)
		    ),
		    "mbsfnFrequency",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBSFNInterFrequencyNeighbour_r7$MbsfnServicesNotification"
			)
		    ),
		    "mbsfnServicesNotification",
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
     * Get the type descriptor (TypeInfo) of 'this' MBSFNInterFrequencyNeighbour_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBSFNInterFrequencyNeighbour_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBSFNInterFrequencyNeighbour_r7
