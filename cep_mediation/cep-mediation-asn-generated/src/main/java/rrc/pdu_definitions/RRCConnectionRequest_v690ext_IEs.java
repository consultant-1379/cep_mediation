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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type RRCConnectionRequest_v690ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionRequest_v690ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRequest_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionRequest_v690ext_IEs(UeCapabilityIndication ueCapabilityIndication, 
		    rrc.informationelements.MeasuredResultsOnRACHinterFreq measuredResultsOnRACHinterFreq, 
		    DomainIndicator domainIndicator)
    {
	setUeCapabilityIndication(ueCapabilityIndication);
	setMeasuredResultsOnRACHinterFreq(measuredResultsOnRACHinterFreq);
	setDomainIndicator(domainIndicator);
    }
    
    /**
     * Construct with required components.
     */
    public RRCConnectionRequest_v690ext_IEs(DomainIndicator domainIndicator)
    {
	setDomainIndicator(domainIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = UeCapabilityIndication.hsdch;
	mComponents[1] = new rrc.informationelements.MeasuredResultsOnRACHinterFreq();
	mComponents[2] = new DomainIndicator();
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
		return UeCapabilityIndication.hsdch;
	    case 1:
		return new rrc.informationelements.MeasuredResultsOnRACHinterFreq();
	    case 2:
		return new DomainIndicator();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ueCapabilityIndication"
    public UeCapabilityIndication getUeCapabilityIndication()
    {
	return (UeCapabilityIndication)mComponents[0];
    }
    
    public void setUeCapabilityIndication(UeCapabilityIndication ueCapabilityIndication)
    {
	mComponents[0] = ueCapabilityIndication;
    }
    
    public boolean hasUeCapabilityIndication()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUeCapabilityIndication()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type UeCapabilityIndication from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class UeCapabilityIndication extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private UeCapabilityIndication()
	{
	    super(cFirstNumber);
	}
	
	protected UeCapabilityIndication(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final UeCapabilityIndication hsdch =
	    new UeCapabilityIndication(0);
	public static final UeCapabilityIndication hsdch_edch =
	    new UeCapabilityIndication(1);
	private final static UeCapabilityIndication cNamedNumbers[] = {
	     hsdch, 
	     hsdch_edch
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
	
	public static UeCapabilityIndication valueOf(long value)
	{
	    return (UeCapabilityIndication)hsdch.lookupValue(value);
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
		"rrc.pdu_definitions",
		"RRCConnectionRequest_v690ext_IEs$UeCapabilityIndication"
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
			"hsdch",
			0
		    ),
		    new MemberListElement (
			"hsdch-edch",
			1
		    )
		}
	    ),
	    0,
	    hsdch
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' UeCapabilityIndication object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' UeCapabilityIndication object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for UeCapabilityIndication

    // Methods for field "measuredResultsOnRACHinterFreq"
    public rrc.informationelements.MeasuredResultsOnRACHinterFreq getMeasuredResultsOnRACHinterFreq()
    {
	return (rrc.informationelements.MeasuredResultsOnRACHinterFreq)mComponents[1];
    }
    
    public void setMeasuredResultsOnRACHinterFreq(rrc.informationelements.MeasuredResultsOnRACHinterFreq measuredResultsOnRACHinterFreq)
    {
	mComponents[1] = measuredResultsOnRACHinterFreq;
    }
    
    public boolean hasMeasuredResultsOnRACHinterFreq()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMeasuredResultsOnRACHinterFreq()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "domainIndicator"
    public DomainIndicator getDomainIndicator()
    {
	return (DomainIndicator)mComponents[2];
    }
    
    public void setDomainIndicator(DomainIndicator domainIndicator)
    {
	mComponents[2] = domainIndicator;
    }
    
    
    
    /**
     * Define the ASN1 Type DomainIndicator from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class DomainIndicator extends Choice {
	
	/**
	 * The default constructor.
	 */
	public DomainIndicator()
	{
	}
	
	public static final  int  cs_domain_chosen = 1;
	public static final  int  ps_domain_chosen = 2;
	
	// Methods for field "cs_domain"
	public static DomainIndicator createDomainIndicatorWithCs_domain(Cs_domain cs_domain)
	{
	    DomainIndicator __object = new DomainIndicator();

	    __object.setCs_domain(cs_domain);
	    return __object;
	}
	
	public boolean hasCs_domain()
	{
	    return getChosenFlag() == cs_domain_chosen;
	}
	
	public void setCs_domain(Cs_domain cs_domain)
	{
	    setChosenValue(cs_domain);
	    setChosenFlag(cs_domain_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Cs_domain from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Cs_domain extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Cs_domain()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Cs_domain(CsCallType csCallType)
	    {
		setCsCallType(csCallType);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = CsCallType.speech;
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
			return CsCallType.speech;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "csCallType"
	    public CsCallType getCsCallType()
	    {
		return (CsCallType)mComponents[0];
	    }
	    
	    public void setCsCallType(CsCallType csCallType)
	    {
		mComponents[0] = csCallType;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type CsCallType from ASN1 Module PDU_definitions.
	     * @see Enumerated
	     */
	    public static final class CsCallType extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private CsCallType()
		{
		    super(cFirstNumber);
		}
		
		protected CsCallType(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final CsCallType speech =
		    new CsCallType(0);
		public static final CsCallType video =
		    new CsCallType(1);
		public static final CsCallType other =
		    new CsCallType(2);
		public static final CsCallType spare =
		    new CsCallType(3);
		private final static CsCallType cNamedNumbers[] = {
		     speech, 
		     video, 
		     other, 
		     spare
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
		
		public static CsCallType valueOf(long value)
		{
		    return (CsCallType)speech.lookupValue(value);
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
			"rrc.pdu_definitions",
			"RRCConnectionRequest_v690ext_IEs$DomainIndicator$Cs_domain$CsCallType"
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
				"speech",
				0
			    ),
			    new MemberListElement (
				"video",
				1
			    ),
			    new MemberListElement (
				"other",
				2
			    ),
			    new MemberListElement (
				"spare",
				3
			    )
			}
		    ),
		    0,
		    speech
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' CsCallType object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' CsCallType object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for CsCallType

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
		    "rrc.pdu_definitions",
		    "RRCConnectionRequest_v690ext_IEs$DomainIndicator$Cs_domain"
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
				    "rrc.pdu_definitions",
				    "RRCConnectionRequest_v690ext_IEs$DomainIndicator$Cs_domain$CsCallType"
				)
			    ),
			    "csCallType",
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
	     * Get the type descriptor (TypeInfo) of 'this' Cs_domain object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Cs_domain object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Cs_domain

	// Methods for field "ps_domain"
	public static DomainIndicator createDomainIndicatorWithPs_domain(Null ps_domain)
	{
	    DomainIndicator __object = new DomainIndicator();

	    __object.setPs_domain(ps_domain);
	    return __object;
	}
	
	public boolean hasPs_domain()
	{
	    return getChosenFlag() == ps_domain_chosen;
	}
	
	public void setPs_domain(Null ps_domain)
	{
	    setChosenValue(ps_domain);
	    setChosenFlag(ps_domain_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case cs_domain_chosen:
		    return new Cs_domain();
		case ps_domain_chosen:
		    return new Null();
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RRCConnectionRequest_v690ext_IEs$DomainIndicator"
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
				"rrc.pdu_definitions",
				"RRCConnectionRequest_v690ext_IEs$DomainIndicator$Cs_domain"
			    )
			),
			"cs-domain",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
			"ps-domain",
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
	 * Get the type descriptor (TypeInfo) of 'this' DomainIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DomainIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DomainIndicator

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
	    "rrc.pdu_definitions",
	    "RRCConnectionRequest_v690ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRequest-v690ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest_v690ext_IEs$UeCapabilityIndication"
			)
		    ),
		    "ueCapabilityIndication",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResultsOnRACHinterFreq"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsOnRACHinterFreq"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACHinterFreq"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACHinterFreq"
				)
			    ),
			    0
			)
		    ),
		    "measuredResultsOnRACHinterFreq",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest_v690ext_IEs$DomainIndicator"
			)
		    ),
		    "domainIndicator",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRequest_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRequest_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRequest_v690ext_IEs
