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
 * Define the ASN1 Type UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext(BitString ganssAddIonoModelReq, 
		    GanssEOPreq ganssEOPreq, 
		    GanssRequestedGenericAssistanceDataList_v860ext ganssRequestedGenericAssistanceDataList)
    {
	setGanssAddIonoModelReq(ganssAddIonoModelReq);
	setGanssEOPreq(ganssEOPreq);
	setGanssRequestedGenericAssistanceDataList(ganssRequestedGenericAssistanceDataList);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext(GanssRequestedGenericAssistanceDataList_v860ext ganssRequestedGenericAssistanceDataList)
    {
	setGanssRequestedGenericAssistanceDataList(ganssRequestedGenericAssistanceDataList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = GanssEOPreq._true;
	mComponents[2] = new GanssRequestedGenericAssistanceDataList_v860ext();
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
		return new BitString();
	    case 1:
		return GanssEOPreq._true;
	    case 2:
		return new GanssRequestedGenericAssistanceDataList_v860ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssAddIonoModelReq"
    public BitString getGanssAddIonoModelReq()
    {
	return (BitString)mComponents[0];
    }
    
    public void setGanssAddIonoModelReq(BitString ganssAddIonoModelReq)
    {
	mComponents[0] = ganssAddIonoModelReq;
    }
    
    public boolean hasGanssAddIonoModelReq()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGanssAddIonoModelReq()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ganssEOPreq"
    public GanssEOPreq getGanssEOPreq()
    {
	return (GanssEOPreq)mComponents[1];
    }
    
    public void setGanssEOPreq(GanssEOPreq ganssEOPreq)
    {
	mComponents[1] = ganssEOPreq;
    }
    
    public boolean hasGanssEOPreq()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGanssEOPreq()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type GanssEOPreq from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class GanssEOPreq extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private GanssEOPreq()
	{
	    super(cFirstNumber);
	}
	
	protected GanssEOPreq(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final GanssEOPreq _true =
	    new GanssEOPreq(0);
	private final static GanssEOPreq cNamedNumbers[] = {
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
	
	public static GanssEOPreq valueOf(long value)
	{
	    return (GanssEOPreq)_true.lookupValue(value);
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
		"UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext$GanssEOPreq"
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
	 * Get the type descriptor (TypeInfo) of 'this' GanssEOPreq object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GanssEOPreq object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GanssEOPreq

    // Methods for field "ganssRequestedGenericAssistanceDataList"
    public GanssRequestedGenericAssistanceDataList_v860ext getGanssRequestedGenericAssistanceDataList()
    {
	return (GanssRequestedGenericAssistanceDataList_v860ext)mComponents[2];
    }
    
    public void setGanssRequestedGenericAssistanceDataList(GanssRequestedGenericAssistanceDataList_v860ext ganssRequestedGenericAssistanceDataList)
    {
	mComponents[2] = ganssRequestedGenericAssistanceDataList;
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
	    "UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-AdditionalAssistanceDataRequest-v860ext"
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
				    new com.oss.asn1.INTEGER(2)
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(2)
			    ),
			    null
			)
		    ),
		    "ganssAddIonoModelReq",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext$GanssEOPreq"
			)
		    ),
		    "ganssEOPreq",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GanssRequestedGenericAssistanceDataList_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"GanssRequestedGenericAssistanceDataList-v860ext"
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
				    "GanssReqGenericData_v860ext"
				)
			    )
			)
		    ),
		    "ganssRequestedGenericAssistanceDataList",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_AdditionalAssistanceDataRequest_v860ext
