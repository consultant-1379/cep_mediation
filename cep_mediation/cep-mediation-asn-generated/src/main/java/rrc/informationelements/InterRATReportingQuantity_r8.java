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
 * Define the ASN1 Type InterRATReportingQuantity_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterRATReportingQuantity_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATReportingQuantity_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATReportingQuantity_r8(BOOLEAN utran_EstimatedQuality, 
		    RatSpecificInfo ratSpecificInfo)
    {
	setUtran_EstimatedQuality(utran_EstimatedQuality);
	setRatSpecificInfo(ratSpecificInfo);
    }
    
    /**
     * Construct with components.
     */
    public InterRATReportingQuantity_r8(boolean utran_EstimatedQuality, 
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
	public static final  int  eutra_chosen = 2;
	
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
	    public Gsm(BOOLEAN gsm_Carrier_RSSI)
	    {
		setGsm_Carrier_RSSI(gsm_Carrier_RSSI);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Gsm(boolean gsm_Carrier_RSSI)
	    {
		this(new BOOLEAN(gsm_Carrier_RSSI));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BOOLEAN();
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
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "gsm_Carrier_RSSI"
	    public boolean getGsm_Carrier_RSSI()
	    {
		return ((BOOLEAN)mComponents[0]).booleanValue();
	    }
	    
	    public void setGsm_Carrier_RSSI(boolean gsm_Carrier_RSSI)
	    {
		setGsm_Carrier_RSSI(new BOOLEAN(gsm_Carrier_RSSI));
	    }
	    
	    public void setGsm_Carrier_RSSI(BOOLEAN gsm_Carrier_RSSI)
	    {
		mComponents[0] = gsm_Carrier_RSSI;
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
		    "InterRATReportingQuantity_r8$RatSpecificInfo$Gsm"
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
			    "gsm-Carrier-RSSI",
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

	// Methods for field "eutra"
	public static RatSpecificInfo createRatSpecificInfoWithEutra(Eutra eutra)
	{
	    RatSpecificInfo __object = new RatSpecificInfo();

	    __object.setEutra(eutra);
	    return __object;
	}
	
	public boolean hasEutra()
	{
	    return getChosenFlag() == eutra_chosen;
	}
	
	public void setEutra(Eutra eutra)
	{
	    setChosenValue(eutra);
	    setChosenFlag(eutra_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Eutra from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Eutra extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Eutra()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Eutra(ReportingQuantity reportingQuantity)
	    {
		setReportingQuantity(reportingQuantity);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = ReportingQuantity.measurementQuantity;
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
			return ReportingQuantity.measurementQuantity;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "reportingQuantity"
	    public ReportingQuantity getReportingQuantity()
	    {
		return (ReportingQuantity)mComponents[0];
	    }
	    
	    public void setReportingQuantity(ReportingQuantity reportingQuantity)
	    {
		mComponents[0] = reportingQuantity;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type ReportingQuantity from ASN1 Module InformationElements.
	     * @see Enumerated
	     */
	    public static final class ReportingQuantity extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private ReportingQuantity()
		{
		    super(cFirstNumber);
		}
		
		protected ReportingQuantity(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final ReportingQuantity measurementQuantity =
		    new ReportingQuantity(0);
		public static final ReportingQuantity both =
		    new ReportingQuantity(1);
		private final static ReportingQuantity cNamedNumbers[] = {
		     measurementQuantity, 
		     both
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
		
		public static ReportingQuantity valueOf(long value)
		{
		    return (ReportingQuantity)measurementQuantity.lookupValue(value);
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
			"InterRATReportingQuantity_r8$RatSpecificInfo$Eutra$ReportingQuantity"
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
				"measurementQuantity",
				0
			    ),
			    new MemberListElement (
				"both",
				1
			    )
			}
		    ),
		    0,
		    measurementQuantity
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' ReportingQuantity object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' ReportingQuantity object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for ReportingQuantity

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
		    "InterRATReportingQuantity_r8$RatSpecificInfo$Eutra"
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
				new QName (
				    "rrc.informationelements",
				    "InterRATReportingQuantity_r8$RatSpecificInfo$Eutra$ReportingQuantity"
				)
			    ),
			    "reportingQuantity",
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
	     * Get the type descriptor (TypeInfo) of 'this' Eutra object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Eutra object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Eutra

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case gsm_chosen:
		    return new Gsm();
		case eutra_chosen:
		    return new Eutra();
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
		"InterRATReportingQuantity_r8$RatSpecificInfo"
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
				"InterRATReportingQuantity_r8$RatSpecificInfo$Gsm"
			    )
			),
			"gsm",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"InterRATReportingQuantity_r8$RatSpecificInfo$Eutra"
			    )
			),
			"eutra",
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
	    "InterRATReportingQuantity_r8"
	),
	new QName (
	    "InformationElements",
	    "InterRATReportingQuantity-r8"
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
			    "InterRATReportingQuantity_r8$RatSpecificInfo"
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATReportingQuantity_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATReportingQuantity_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATReportingQuantity_r8
