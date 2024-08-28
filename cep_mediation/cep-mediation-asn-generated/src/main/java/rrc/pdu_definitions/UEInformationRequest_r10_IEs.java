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
 * Define the ASN1 Type UEInformationRequest_r10_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UEInformationRequest_r10_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UEInformationRequest_r10_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UEInformationRequest_r10_IEs(LoggedMeasReportRequest loggedMeasReportRequest, 
		    LoggedANRReportRequest loggedANRReportRequest)
    {
	setLoggedMeasReportRequest(loggedMeasReportRequest);
	setLoggedANRReportRequest(loggedANRReportRequest);
    }
    
    public void initComponents()
    {
	mComponents[0] = LoggedMeasReportRequest._true;
	mComponents[1] = LoggedANRReportRequest._true;
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
		return LoggedMeasReportRequest._true;
	    case 1:
		return LoggedANRReportRequest._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "loggedMeasReportRequest"
    public LoggedMeasReportRequest getLoggedMeasReportRequest()
    {
	return (LoggedMeasReportRequest)mComponents[0];
    }
    
    public void setLoggedMeasReportRequest(LoggedMeasReportRequest loggedMeasReportRequest)
    {
	mComponents[0] = loggedMeasReportRequest;
    }
    
    public boolean hasLoggedMeasReportRequest()
    {
	return componentIsPresent(0);
    }
    
    public void deleteLoggedMeasReportRequest()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type LoggedMeasReportRequest from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class LoggedMeasReportRequest extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LoggedMeasReportRequest()
	{
	    super(cFirstNumber);
	}
	
	protected LoggedMeasReportRequest(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LoggedMeasReportRequest _true =
	    new LoggedMeasReportRequest(0);
	private final static LoggedMeasReportRequest cNamedNumbers[] = {
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
	
	public static LoggedMeasReportRequest valueOf(long value)
	{
	    return (LoggedMeasReportRequest)_true.lookupValue(value);
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
		"UEInformationRequest_r10_IEs$LoggedMeasReportRequest"
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
	 * Get the type descriptor (TypeInfo) of 'this' LoggedMeasReportRequest object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasReportRequest object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LoggedMeasReportRequest

    // Methods for field "loggedANRReportRequest"
    public LoggedANRReportRequest getLoggedANRReportRequest()
    {
	return (LoggedANRReportRequest)mComponents[1];
    }
    
    public void setLoggedANRReportRequest(LoggedANRReportRequest loggedANRReportRequest)
    {
	mComponents[1] = loggedANRReportRequest;
    }
    
    public boolean hasLoggedANRReportRequest()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLoggedANRReportRequest()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type LoggedANRReportRequest from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class LoggedANRReportRequest extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LoggedANRReportRequest()
	{
	    super(cFirstNumber);
	}
	
	protected LoggedANRReportRequest(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LoggedANRReportRequest _true =
	    new LoggedANRReportRequest(0);
	private final static LoggedANRReportRequest cNamedNumbers[] = {
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
	
	public static LoggedANRReportRequest valueOf(long value)
	{
	    return (LoggedANRReportRequest)_true.lookupValue(value);
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
		"rrc.pdu_definitions",
		"UEInformationRequest_r10_IEs$LoggedANRReportRequest"
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
	 * Get the type descriptor (TypeInfo) of 'this' LoggedANRReportRequest object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LoggedANRReportRequest object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LoggedANRReportRequest

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
	    "UEInformationRequest_r10_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UEInformationRequest-r10-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UEInformationRequest_r10_IEs$LoggedMeasReportRequest"
			)
		    ),
		    "loggedMeasReportRequest",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UEInformationRequest_r10_IEs$LoggedANRReportRequest"
			)
		    ),
		    "loggedANRReportRequest",
		    1,
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
     * Get the type descriptor (TypeInfo) of 'this' UEInformationRequest_r10_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UEInformationRequest_r10_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UEInformationRequest_r10_IEs
