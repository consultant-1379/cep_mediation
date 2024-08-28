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
 * Define the ASN1 Type LoggedMeasReport from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedMeasReport extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedMeasReport()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedMeasReport(BitString absoluteTimeInfo, 
		    TraceReference traceReference, 
		    TraceRecordingSession traceRecordingSession, 
		    TCE_Id tce_Id, LoggedMeasInfoList loggedMeasInfoList, 
		    LoggedMeasAvailable loggedMeasAvailable)
    {
	setAbsoluteTimeInfo(absoluteTimeInfo);
	setTraceReference(traceReference);
	setTraceRecordingSession(traceRecordingSession);
	setTce_Id(tce_Id);
	setLoggedMeasInfoList(loggedMeasInfoList);
	setLoggedMeasAvailable(loggedMeasAvailable);
    }
    
    /**
     * Construct with required components.
     */
    public LoggedMeasReport(BitString absoluteTimeInfo, 
		    TraceReference traceReference, 
		    TraceRecordingSession traceRecordingSession, 
		    TCE_Id tce_Id)
    {
	setAbsoluteTimeInfo(absoluteTimeInfo);
	setTraceReference(traceReference);
	setTraceRecordingSession(traceRecordingSession);
	setTce_Id(tce_Id);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new TraceReference();
	mComponents[2] = new TraceRecordingSession();
	mComponents[3] = new TCE_Id();
	mComponents[4] = new LoggedMeasInfoList();
	mComponents[5] = LoggedMeasAvailable._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BitString();
	    case 1:
		return new TraceReference();
	    case 2:
		return new TraceRecordingSession();
	    case 3:
		return new TCE_Id();
	    case 4:
		return new LoggedMeasInfoList();
	    case 5:
		return LoggedMeasAvailable._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "absoluteTimeInfo"
    public BitString getAbsoluteTimeInfo()
    {
	return (BitString)mComponents[0];
    }
    
    public void setAbsoluteTimeInfo(BitString absoluteTimeInfo)
    {
	mComponents[0] = absoluteTimeInfo;
    }
    
    
    // Methods for field "traceReference"
    public TraceReference getTraceReference()
    {
	return (TraceReference)mComponents[1];
    }
    
    public void setTraceReference(TraceReference traceReference)
    {
	mComponents[1] = traceReference;
    }
    
    
    // Methods for field "traceRecordingSession"
    public TraceRecordingSession getTraceRecordingSession()
    {
	return (TraceRecordingSession)mComponents[2];
    }
    
    public void setTraceRecordingSession(TraceRecordingSession traceRecordingSession)
    {
	mComponents[2] = traceRecordingSession;
    }
    
    
    // Methods for field "tce_Id"
    public TCE_Id getTce_Id()
    {
	return (TCE_Id)mComponents[3];
    }
    
    public void setTce_Id(TCE_Id tce_Id)
    {
	mComponents[3] = tce_Id;
    }
    
    
    // Methods for field "loggedMeasInfoList"
    public LoggedMeasInfoList getLoggedMeasInfoList()
    {
	return (LoggedMeasInfoList)mComponents[4];
    }
    
    public void setLoggedMeasInfoList(LoggedMeasInfoList loggedMeasInfoList)
    {
	mComponents[4] = loggedMeasInfoList;
    }
    
    public boolean hasLoggedMeasInfoList()
    {
	return componentIsPresent(4);
    }
    
    public void deleteLoggedMeasInfoList()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "loggedMeasAvailable"
    public LoggedMeasAvailable getLoggedMeasAvailable()
    {
	return (LoggedMeasAvailable)mComponents[5];
    }
    
    public void setLoggedMeasAvailable(LoggedMeasAvailable loggedMeasAvailable)
    {
	mComponents[5] = loggedMeasAvailable;
    }
    
    public boolean hasLoggedMeasAvailable()
    {
	return componentIsPresent(5);
    }
    
    public void deleteLoggedMeasAvailable()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type LoggedMeasAvailable from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class LoggedMeasAvailable extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LoggedMeasAvailable()
	{
	    super(cFirstNumber);
	}
	
	protected LoggedMeasAvailable(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LoggedMeasAvailable _true =
	    new LoggedMeasAvailable(0);
	private final static LoggedMeasAvailable cNamedNumbers[] = {
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
	
	public static LoggedMeasAvailable valueOf(long value)
	{
	    return (LoggedMeasAvailable)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"LoggedMeasReport$LoggedMeasAvailable"
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
	 * Get the type descriptor (TypeInfo) of 'this' LoggedMeasAvailable object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasAvailable object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LoggedMeasAvailable

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
	    "LoggedMeasReport"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasReport"
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
				    new com.oss.asn1.INTEGER(48)
				)
			    ),
			    new Bounds (
				new java.lang.Long(48),
				new java.lang.Long(48)
			    ),
			    null
			)
		    ),
		    "absoluteTimeInfo",
		    0,
		    2,
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
				"TraceReference"
			    ),
			    new QName (
				"InformationElements",
				"TraceReference"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TraceReference"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TraceReference"
				)
			    ),
			    0
			)
		    ),
		    "traceReference",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TraceRecordingSession"
			    ),
			    new QName (
				"InformationElements",
				"TraceRecordingSession"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TraceRecordingSession"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TraceRecordingSession"
				)
			    ),
			    0
			)
		    ),
		    "traceRecordingSession",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TCE_Id"
			    ),
			    new QName (
				"InformationElements",
				"TCE-Id"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TCE_Id"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TCE_Id"
				)
			    ),
			    0
			)
		    ),
		    "tce-Id",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LoggedMeasInfoList"
			    ),
			    new QName (
				"InformationElements",
				"LoggedMeasInfoList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasInfoList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasInfoList"
				)
			    ),
			    0
			)
		    ),
		    "loggedMeasInfoList",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "LoggedMeasReport$LoggedMeasAvailable"
			)
		    ),
		    "loggedMeasAvailable",
		    5,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasReport object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasReport object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasReport
