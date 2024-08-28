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
 * Define the ASN1 Type InterRATReportingQuantity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterRATReportingQuantity extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATReportingQuantity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATReportingQuantity(BOOLEAN utran_EstimatedQuality, 
		    RatSpecificInfo ratSpecificInfo)
    {
	setUtran_EstimatedQuality(utran_EstimatedQuality);
	setRatSpecificInfo(ratSpecificInfo);
    }
    
    /**
     * Construct with components.
     */
    public InterRATReportingQuantity(boolean utran_EstimatedQuality, 
		    RatSpecificInfo ratSpecificInfo)
    {
	this(new BOOLEAN(utran_EstimatedQuality), ratSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new RatSpecificInfo();
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
		return new RatSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "utran_EstimatedQuality"
    public boolean getUtran_EstimatedQuality()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setUtran_EstimatedQuality(boolean utran_EstimatedQuality)
    {
	setUtran_EstimatedQuality(new BOOLEAN(utran_EstimatedQuality));
    }
    
    public void setUtran_EstimatedQuality(BOOLEAN utran_EstimatedQuality)
    {
	mComponents[0] = utran_EstimatedQuality;
    }
    
    
    // Methods for field "ratSpecificInfo"
    public RatSpecificInfo getRatSpecificInfo()
    {
	return (RatSpecificInfo)mComponents[1];
    }
    
    public void setRatSpecificInfo(RatSpecificInfo ratSpecificInfo)
    {
	mComponents[1] = ratSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type RatSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class RatSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public RatSpecificInfo()
	{
	}
	
	public static final  int  gsm_chosen = 1;
	
	// Methods for field "gsm"
	public static RatSpecificInfo createRatSpecificInfoWithGsm(Gsm gsm)
	{
	    RatSpecificInfo __object = new RatSpecificInfo();

	    __object.setGsm(gsm);
	    return __object;
	}
	
	public boolean hasGsm()
	{
	    return getChosenFlag() == gsm_chosen;
	}
	
	public void setGsm(Gsm gsm)
	{
	    setChosenValue(gsm);
	    setChosenFlag(gsm_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Gsm from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Gsm extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Gsm()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Gsm(BOOLEAN dummy, BOOLEAN dummy2, 
			    BOOLEAN gsm_Carrier_RSSI)
	    {
		setDummy(dummy);
		setDummy2(dummy2);
		setGsm_Carrier_RSSI(gsm_Carrier_RSSI);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Gsm(boolean dummy, boolean dummy2, 
			    boolean gsm_Carrier_RSSI)
	    {
		this(new BOOLEAN(dummy), new BOOLEAN(dummy2), 
		     new BOOLEAN(gsm_Carrier_RSSI));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BOOLEAN();
		mComponents[1] = new BOOLEAN();
		mComponents[2] = new BOOLEAN();
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
			return new BOOLEAN();
		    case 2:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dummy"
	    public boolean getDummy()
	    {
		return ((BOOLEAN)mComponents[0]).booleanValue();
	    }
	    
	    public void setDummy(boolean dummy)
	    {
		setDummy(new BOOLEAN(dummy));
	    }
	    
	    public void setDummy(BOOLEAN dummy)
	    {
		mComponents[0] = dummy;
	    }
	    
	    
	    // Methods for field "dummy2"
	    public boolean getDummy2()
	    {
		return ((BOOLEAN)mComponents[1]).booleanValue();
	    }
	    
	    public void setDummy2(boolean dummy2)
	    {
		setDummy2(new BOOLEAN(dummy2));
	    }
	    
	    public void setDummy2(BOOLEAN dummy2)
	    {
		mComponents[1] = dummy2;
	    }
	    
	    
	    // Methods for field "gsm_Carrier_RSSI"
	    public boolean getGsm_Carrier_RSSI()
	    {
		return ((BOOLEAN)mComponents[2]).booleanValue();
	    }
	    
	    public void setGsm_Carrier_RSSI(boolean gsm_Carrier_RSSI)
	    {
		setGsm_Carrier_RSSI(new BOOLEAN(gsm_Carrier_RSSI));
	    }
	    
	    public void setGsm_Carrier_RSSI(BOOLEAN gsm_Carrier_RSSI)
	    {
		mComponents[2] = gsm_Carrier_RSSI;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "InterRATReportingQuantity$RatSpecificInfo$Gsm"
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
			    "dummy",
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
			    "dummy2",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
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
			    "gsm-Carrier-RSSI",
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
	     * Get the type descriptor (TypeInfo) of 'this' Gsm object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Gsm object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Gsm

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case gsm_chosen:
		    return new Gsm();
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
		"InterRATReportingQuantity$RatSpecificInfo"
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
			    new QName (
				"rrc.informationelements",
				"InterRATReportingQuantity$RatSpecificInfo$Gsm"
			    )
			),
			"gsm",
			0,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' RatSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RatSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RatSpecificInfo

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
	    "InterRATReportingQuantity"
	),
	new QName (
	    "InformationElements",
	    "InterRATReportingQuantity"
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
		    "utran-EstimatedQuality",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "InterRATReportingQuantity$RatSpecificInfo"
			)
		    ),
		    "ratSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATReportingQuantity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATReportingQuantity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATReportingQuantity
