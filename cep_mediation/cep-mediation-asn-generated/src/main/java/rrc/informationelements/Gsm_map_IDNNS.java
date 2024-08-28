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
 * Define the ASN1 Type Gsm_map_IDNNS from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Gsm_map_IDNNS extends Sequence {
    
    /**
     * The default constructor.
     */
    public Gsm_map_IDNNS()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Gsm_map_IDNNS(Routingbasis routingbasis, BOOLEAN dummy)
    {
	setRoutingbasis(routingbasis);
	setDummy(dummy);
    }
    
    /**
     * Construct with components.
     */
    public Gsm_map_IDNNS(Routingbasis routingbasis, boolean dummy)
    {
	this(routingbasis, new BOOLEAN(dummy));
    }
    
    public void initComponents()
    {
	mComponents[0] = new Routingbasis();
	mComponents[1] = new BOOLEAN();
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
		return new Routingbasis();
	    case 1:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "routingbasis"
    public Routingbasis getRoutingbasis()
    {
	return (Routingbasis)mComponents[0];
    }
    
    public void setRoutingbasis(Routingbasis routingbasis)
    {
	mComponents[0] = routingbasis;
    }
    
    
    
    /**
     * Define the ASN1 Type Routingbasis from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Routingbasis extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Routingbasis()
	{
	}
	
	public static final  int  localPTMSI_chosen = 1;
	public static final  int  tMSIofsamePLMN_chosen = 2;
	public static final  int  tMSIofdifferentPLMN_chosen = 3;
	public static final  int  iMSIresponsetopaging_chosen = 4;
	public static final  int  iMSIcauseUEinitiatedEvent_chosen = 5;
	public static final  int  iMEI_chosen = 6;
	public static final  int  spare2_chosen = 7;
	public static final  int  spare1_chosen = 8;
	
	// Methods for field "localPTMSI"
	public static Routingbasis createRoutingbasisWithLocalPTMSI(LocalPTMSI localPTMSI)
	{
	    Routingbasis __object = new Routingbasis();

	    __object.setLocalPTMSI(localPTMSI);
	    return __object;
	}
	
	public boolean hasLocalPTMSI()
	{
	    return getChosenFlag() == localPTMSI_chosen;
	}
	
	public void setLocalPTMSI(LocalPTMSI localPTMSI)
	{
	    setChosenValue(localPTMSI);
	    setChosenFlag(localPTMSI_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type LocalPTMSI from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class LocalPTMSI extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public LocalPTMSI()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public LocalPTMSI(RoutingParameter routingparameter)
	    {
		setRoutingparameter(routingparameter);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RoutingParameter();
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
			return new RoutingParameter();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "routingparameter"
	    public RoutingParameter getRoutingparameter()
	    {
		return (RoutingParameter)mComponents[0];
	    }
	    
	    public void setRoutingparameter(RoutingParameter routingparameter)
	    {
		mComponents[0] = routingparameter;
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
		    "Gsm_map_IDNNS$Routingbasis$LocalPTMSI"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RoutingParameter"
				    ),
				    new QName (
					"InformationElements",
					"RoutingParameter"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(10)
					)
				    ),
				    new Bounds (
					new java.lang.Long(10),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "routingparameter",
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
	     * Get the type descriptor (TypeInfo) of 'this' LocalPTMSI object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' LocalPTMSI object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for LocalPTMSI

	// Methods for field "tMSIofsamePLMN"
	public static Routingbasis createRoutingbasisWithTMSIofsamePLMN(TMSIofsamePLMN tMSIofsamePLMN)
	{
	    Routingbasis __object = new Routingbasis();

	    __object.setTMSIofsamePLMN(tMSIofsamePLMN);
	    return __object;
	}
	
	public boolean hasTMSIofsamePLMN()
	{
	    return getChosenFlag() == tMSIofsamePLMN_chosen;
	}
	
	public void setTMSIofsamePLMN(TMSIofsamePLMN tMSIofsamePLMN)
	{
	    setChosenValue(tMSIofsamePLMN);
	    setChosenFlag(tMSIofsamePLMN_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type TMSIofsamePLMN from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class TMSIofsamePLMN extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public TMSIofsamePLMN()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public TMSIofsamePLMN(RoutingParameter routingparameter)
	    {
		setRoutingparameter(routingparameter);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RoutingParameter();
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
			return new RoutingParameter();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "routingparameter"
	    public RoutingParameter getRoutingparameter()
	    {
		return (RoutingParameter)mComponents[0];
	    }
	    
	    public void setRoutingparameter(RoutingParameter routingparameter)
	    {
		mComponents[0] = routingparameter;
	    }
	    
	    
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
		    "Gsm_map_IDNNS$Routingbasis$TMSIofsamePLMN"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RoutingParameter"
				    ),
				    new QName (
					"InformationElements",
					"RoutingParameter"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(10)
					)
				    ),
				    new Bounds (
					new java.lang.Long(10),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "routingparameter",
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
	     * Get the type descriptor (TypeInfo) of 'this' TMSIofsamePLMN object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' TMSIofsamePLMN object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for TMSIofsamePLMN

	// Methods for field "tMSIofdifferentPLMN"
	public static Routingbasis createRoutingbasisWithTMSIofdifferentPLMN(TMSIofdifferentPLMN tMSIofdifferentPLMN)
	{
	    Routingbasis __object = new Routingbasis();

	    __object.setTMSIofdifferentPLMN(tMSIofdifferentPLMN);
	    return __object;
	}
	
	public boolean hasTMSIofdifferentPLMN()
	{
	    return getChosenFlag() == tMSIofdifferentPLMN_chosen;
	}
	
	public void setTMSIofdifferentPLMN(TMSIofdifferentPLMN tMSIofdifferentPLMN)
	{
	    setChosenValue(tMSIofdifferentPLMN);
	    setChosenFlag(tMSIofdifferentPLMN_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type TMSIofdifferentPLMN from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class TMSIofdifferentPLMN extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public TMSIofdifferentPLMN()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public TMSIofdifferentPLMN(RoutingParameter routingparameter)
	    {
		setRoutingparameter(routingparameter);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RoutingParameter();
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
			return new RoutingParameter();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "routingparameter"
	    public RoutingParameter getRoutingparameter()
	    {
		return (RoutingParameter)mComponents[0];
	    }
	    
	    public void setRoutingparameter(RoutingParameter routingparameter)
	    {
		mComponents[0] = routingparameter;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "Gsm_map_IDNNS$Routingbasis$TMSIofdifferentPLMN"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RoutingParameter"
				    ),
				    new QName (
					"InformationElements",
					"RoutingParameter"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(10)
					)
				    ),
				    new Bounds (
					new java.lang.Long(10),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "routingparameter",
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
	     * Get the type descriptor (TypeInfo) of 'this' TMSIofdifferentPLMN object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' TMSIofdifferentPLMN object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for TMSIofdifferentPLMN

	// Methods for field "iMSIresponsetopaging"
	public static Routingbasis createRoutingbasisWithIMSIresponsetopaging(IMSIresponsetopaging iMSIresponsetopaging)
	{
	    Routingbasis __object = new Routingbasis();

	    __object.setIMSIresponsetopaging(iMSIresponsetopaging);
	    return __object;
	}
	
	public boolean hasIMSIresponsetopaging()
	{
	    return getChosenFlag() == iMSIresponsetopaging_chosen;
	}
	
	public void setIMSIresponsetopaging(IMSIresponsetopaging iMSIresponsetopaging)
	{
	    setChosenValue(iMSIresponsetopaging);
	    setChosenFlag(iMSIresponsetopaging_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type IMSIresponsetopaging from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class IMSIresponsetopaging extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public IMSIresponsetopaging()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public IMSIresponsetopaging(RoutingParameter routingparameter)
	    {
		setRoutingparameter(routingparameter);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RoutingParameter();
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
			return new RoutingParameter();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "routingparameter"
	    public RoutingParameter getRoutingparameter()
	    {
		return (RoutingParameter)mComponents[0];
	    }
	    
	    public void setRoutingparameter(RoutingParameter routingparameter)
	    {
		mComponents[0] = routingparameter;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8003
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "Gsm_map_IDNNS$Routingbasis$IMSIresponsetopaging"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RoutingParameter"
				    ),
				    new QName (
					"InformationElements",
					"RoutingParameter"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(10)
					)
				    ),
				    new Bounds (
					new java.lang.Long(10),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "routingparameter",
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
	     * Get the type descriptor (TypeInfo) of 'this' IMSIresponsetopaging object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' IMSIresponsetopaging object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for IMSIresponsetopaging

	// Methods for field "iMSIcauseUEinitiatedEvent"
	public static Routingbasis createRoutingbasisWithIMSIcauseUEinitiatedEvent(IMSIcauseUEinitiatedEvent iMSIcauseUEinitiatedEvent)
	{
	    Routingbasis __object = new Routingbasis();

	    __object.setIMSIcauseUEinitiatedEvent(iMSIcauseUEinitiatedEvent);
	    return __object;
	}
	
	public boolean hasIMSIcauseUEinitiatedEvent()
	{
	    return getChosenFlag() == iMSIcauseUEinitiatedEvent_chosen;
	}
	
	public void setIMSIcauseUEinitiatedEvent(IMSIcauseUEinitiatedEvent iMSIcauseUEinitiatedEvent)
	{
	    setChosenValue(iMSIcauseUEinitiatedEvent);
	    setChosenFlag(iMSIcauseUEinitiatedEvent_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type IMSIcauseUEinitiatedEvent from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class IMSIcauseUEinitiatedEvent extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public IMSIcauseUEinitiatedEvent()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public IMSIcauseUEinitiatedEvent(RoutingParameter routingparameter)
	    {
		setRoutingparameter(routingparameter);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RoutingParameter();
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
			return new RoutingParameter();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "routingparameter"
	    public RoutingParameter getRoutingparameter()
	    {
		return (RoutingParameter)mComponents[0];
	    }
	    
	    public void setRoutingparameter(RoutingParameter routingparameter)
	    {
		mComponents[0] = routingparameter;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8004
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "Gsm_map_IDNNS$Routingbasis$IMSIcauseUEinitiatedEvent"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RoutingParameter"
				    ),
				    new QName (
					"InformationElements",
					"RoutingParameter"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(10)
					)
				    ),
				    new Bounds (
					new java.lang.Long(10),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "routingparameter",
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
	     * Get the type descriptor (TypeInfo) of 'this' IMSIcauseUEinitiatedEvent object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' IMSIcauseUEinitiatedEvent object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for IMSIcauseUEinitiatedEvent

	// Methods for field "iMEI"
	public static Routingbasis createRoutingbasisWithIMEI(IMEI iMEI)
	{
	    Routingbasis __object = new Routingbasis();

	    __object.setIMEI(iMEI);
	    return __object;
	}
	
	public boolean hasIMEI()
	{
	    return getChosenFlag() == iMEI_chosen;
	}
	
	public void setIMEI(IMEI iMEI)
	{
	    setChosenValue(iMEI);
	    setChosenFlag(iMEI_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type IMEI from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class IMEI extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public IMEI()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public IMEI(RoutingParameter routingparameter)
	    {
		setRoutingparameter(routingparameter);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RoutingParameter();
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
			return new RoutingParameter();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "routingparameter"
	    public RoutingParameter getRoutingparameter()
	    {
		return (RoutingParameter)mComponents[0];
	    }
	    
	    public void setRoutingparameter(RoutingParameter routingparameter)
	    {
		mComponents[0] = routingparameter;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8005
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "Gsm_map_IDNNS$Routingbasis$IMEI"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RoutingParameter"
				    ),
				    new QName (
					"InformationElements",
					"RoutingParameter"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(10)
					)
				    ),
				    new Bounds (
					new java.lang.Long(10),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "routingparameter",
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
	     * Get the type descriptor (TypeInfo) of 'this' IMEI object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' IMEI object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for IMEI

	// Methods for field "spare2"
	public static Routingbasis createRoutingbasisWithSpare2(Spare2 spare2)
	{
	    Routingbasis __object = new Routingbasis();

	    __object.setSpare2(spare2);
	    return __object;
	}
	
	public boolean hasSpare2()
	{
	    return getChosenFlag() == spare2_chosen;
	}
	
	public void setSpare2(Spare2 spare2)
	{
	    setChosenValue(spare2);
	    setChosenFlag(spare2_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Spare2 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Spare2 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Spare2()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Spare2(RoutingParameter routingparameter)
	    {
		setRoutingparameter(routingparameter);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RoutingParameter();
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
			return new RoutingParameter();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "routingparameter"
	    public RoutingParameter getRoutingparameter()
	    {
		return (RoutingParameter)mComponents[0];
	    }
	    
	    public void setRoutingparameter(RoutingParameter routingparameter)
	    {
		mComponents[0] = routingparameter;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8006
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "Gsm_map_IDNNS$Routingbasis$Spare2"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RoutingParameter"
				    ),
				    new QName (
					"InformationElements",
					"RoutingParameter"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(10)
					)
				    ),
				    new Bounds (
					new java.lang.Long(10),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "routingparameter",
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
	     * Get the type descriptor (TypeInfo) of 'this' Spare2 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Spare2 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Spare2

	// Methods for field "spare1"
	public static Routingbasis createRoutingbasisWithSpare1(Spare1 spare1)
	{
	    Routingbasis __object = new Routingbasis();

	    __object.setSpare1(spare1);
	    return __object;
	}
	
	public boolean hasSpare1()
	{
	    return getChosenFlag() == spare1_chosen;
	}
	
	public void setSpare1(Spare1 spare1)
	{
	    setChosenValue(spare1);
	    setChosenFlag(spare1_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Spare1 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Spare1 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Spare1()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Spare1(RoutingParameter routingparameter)
	    {
		setRoutingparameter(routingparameter);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RoutingParameter();
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
			return new RoutingParameter();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "routingparameter"
	    public RoutingParameter getRoutingparameter()
	    {
		return (RoutingParameter)mComponents[0];
	    }
	    
	    public void setRoutingparameter(RoutingParameter routingparameter)
	    {
		mComponents[0] = routingparameter;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8007
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "Gsm_map_IDNNS$Routingbasis$Spare1"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RoutingParameter"
				    ),
				    new QName (
					"InformationElements",
					"RoutingParameter"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(10)
					)
				    ),
				    new Bounds (
					new java.lang.Long(10),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "routingparameter",
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
	     * Get the type descriptor (TypeInfo) of 'this' Spare1 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Spare1 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Spare1

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case localPTMSI_chosen:
		    return new LocalPTMSI();
		case tMSIofsamePLMN_chosen:
		    return new TMSIofsamePLMN();
		case tMSIofdifferentPLMN_chosen:
		    return new TMSIofdifferentPLMN();
		case iMSIresponsetopaging_chosen:
		    return new IMSIresponsetopaging();
		case iMSIcauseUEinitiatedEvent_chosen:
		    return new IMSIcauseUEinitiatedEvent();
		case iMEI_chosen:
		    return new IMEI();
		case spare2_chosen:
		    return new Spare2();
		case spare1_chosen:
		    return new Spare1();
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
		"Gsm_map_IDNNS$Routingbasis"
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
				"Gsm_map_IDNNS$Routingbasis$LocalPTMSI"
			    )
			),
			"localPTMSI",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"Gsm_map_IDNNS$Routingbasis$TMSIofsamePLMN"
			    )
			),
			"tMSIofsamePLMN",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"Gsm_map_IDNNS$Routingbasis$TMSIofdifferentPLMN"
			    )
			),
			"tMSIofdifferentPLMN",
			2,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"Gsm_map_IDNNS$Routingbasis$IMSIresponsetopaging"
			    )
			),
			"iMSIresponsetopaging",
			3,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"Gsm_map_IDNNS$Routingbasis$IMSIcauseUEinitiatedEvent"
			    )
			),
			"iMSIcauseUEinitiatedEvent",
			4,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"Gsm_map_IDNNS$Routingbasis$IMEI"
			    )
			),
			"iMEI",
			5,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"Gsm_map_IDNNS$Routingbasis$Spare2"
			    )
			),
			"spare2",
			6,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"Gsm_map_IDNNS$Routingbasis$Spare1"
			    )
			),
			"spare1",
			7,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2),
		    new TagDecoderElement((short)0x8003, 3),
		    new TagDecoderElement((short)0x8004, 4),
		    new TagDecoderElement((short)0x8005, 5),
		    new TagDecoderElement((short)0x8006, 6),
		    new TagDecoderElement((short)0x8007, 7)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Routingbasis object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Routingbasis object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Routingbasis

    // Methods for field "dummy"
    public boolean getDummy()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setDummy(boolean dummy)
    {
	setDummy(new BOOLEAN(dummy));
    }
    
    public void setDummy(BOOLEAN dummy)
    {
	mComponents[1] = dummy;
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
	    "Gsm_map_IDNNS"
	),
	new QName (
	    "InformationElements",
	    "Gsm-map-IDNNS"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "Gsm_map_IDNNS$Routingbasis"
			)
		    ),
		    "routingbasis",
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
		    "dummy",
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
     * Get the type descriptor (TypeInfo) of 'this' Gsm_map_IDNNS object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Gsm_map_IDNNS object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Gsm_map_IDNNS
