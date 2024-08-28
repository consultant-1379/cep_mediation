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
 * Define the ASN1 Type LoggedANRConfigurationInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedANRConfigurationInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedANRConfigurationInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedANRConfigurationInfo(LoggingDuration loggingDuration, 
		    IntraUTRAANR intraUTRAANR, 
		    InterRATANRforEUTRAIndicator interRATANRforEUTRAIndicator, 
		    InterRATANRforGSMIndicator interRATANRforGSMIndicator)
    {
	setLoggingDuration(loggingDuration);
	setIntraUTRAANR(intraUTRAANR);
	setInterRATANRforEUTRAIndicator(interRATANRforEUTRAIndicator);
	setInterRATANRforGSMIndicator(interRATANRforGSMIndicator);
    }
    
    /**
     * Construct with required components.
     */
    public LoggedANRConfigurationInfo(LoggingDuration loggingDuration)
    {
	setLoggingDuration(loggingDuration);
    }
    
    public void initComponents()
    {
	mComponents[0] = LoggingDuration.min10;
	mComponents[1] = new IntraUTRAANR();
	mComponents[2] = InterRATANRforEUTRAIndicator._true;
	mComponents[3] = InterRATANRforGSMIndicator._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return LoggingDuration.min10;
	    case 1:
		return new IntraUTRAANR();
	    case 2:
		return InterRATANRforEUTRAIndicator._true;
	    case 3:
		return InterRATANRforGSMIndicator._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "loggingDuration"
    public LoggingDuration getLoggingDuration()
    {
	return (LoggingDuration)mComponents[0];
    }
    
    public void setLoggingDuration(LoggingDuration loggingDuration)
    {
	mComponents[0] = loggingDuration;
    }
    
    
    
    /**
     * Define the ASN1 Type LoggingDuration from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class LoggingDuration extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LoggingDuration()
	{
	    super(cFirstNumber);
	}
	
	protected LoggingDuration(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LoggingDuration min10 =
	    new LoggingDuration(0);
	public static final LoggingDuration min30 =
	    new LoggingDuration(1);
	public static final LoggingDuration hr1 =
	    new LoggingDuration(2);
	public static final LoggingDuration spare2 =
	    new LoggingDuration(3);
	public static final LoggingDuration spare1 =
	    new LoggingDuration(4);
	private final static LoggingDuration cNamedNumbers[] = {
	     min10, 
	     min30, 
	     hr1, 
	     spare2, 
	     spare1
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
	
	public static LoggingDuration valueOf(long value)
	{
	    return (LoggingDuration)min10.lookupValue(value);
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
		"LoggedANRConfigurationInfo$LoggingDuration"
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
			"min10",
			0
		    ),
		    new MemberListElement (
			"min30",
			1
		    ),
		    new MemberListElement (
			"hr1",
			2
		    ),
		    new MemberListElement (
			"spare2",
			3
		    ),
		    new MemberListElement (
			"spare1",
			4
		    )
		}
	    ),
	    0,
	    min10
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' LoggingDuration object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LoggingDuration object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LoggingDuration

    // Methods for field "intraUTRAANR"
    public IntraUTRAANR getIntraUTRAANR()
    {
	return (IntraUTRAANR)mComponents[1];
    }
    
    public void setIntraUTRAANR(IntraUTRAANR intraUTRAANR)
    {
	mComponents[1] = intraUTRAANR;
    }
    
    public boolean hasIntraUTRAANR()
    {
	return componentIsPresent(1);
    }
    
    public void deleteIntraUTRAANR()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "interRATANRforEUTRAIndicator"
    public InterRATANRforEUTRAIndicator getInterRATANRforEUTRAIndicator()
    {
	return (InterRATANRforEUTRAIndicator)mComponents[2];
    }
    
    public void setInterRATANRforEUTRAIndicator(InterRATANRforEUTRAIndicator interRATANRforEUTRAIndicator)
    {
	mComponents[2] = interRATANRforEUTRAIndicator;
    }
    
    public boolean hasInterRATANRforEUTRAIndicator()
    {
	return componentIsPresent(2);
    }
    
    public void deleteInterRATANRforEUTRAIndicator()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type InterRATANRforEUTRAIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class InterRATANRforEUTRAIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private InterRATANRforEUTRAIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected InterRATANRforEUTRAIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final InterRATANRforEUTRAIndicator _true =
	    new InterRATANRforEUTRAIndicator(0);
	private final static InterRATANRforEUTRAIndicator cNamedNumbers[] = {
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
	
	public static InterRATANRforEUTRAIndicator valueOf(long value)
	{
	    return (InterRATANRforEUTRAIndicator)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"LoggedANRConfigurationInfo$InterRATANRforEUTRAIndicator"
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
	 * Get the type descriptor (TypeInfo) of 'this' InterRATANRforEUTRAIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' InterRATANRforEUTRAIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for InterRATANRforEUTRAIndicator

    // Methods for field "interRATANRforGSMIndicator"
    public InterRATANRforGSMIndicator getInterRATANRforGSMIndicator()
    {
	return (InterRATANRforGSMIndicator)mComponents[3];
    }
    
    public void setInterRATANRforGSMIndicator(InterRATANRforGSMIndicator interRATANRforGSMIndicator)
    {
	mComponents[3] = interRATANRforGSMIndicator;
    }
    
    public boolean hasInterRATANRforGSMIndicator()
    {
	return componentIsPresent(3);
    }
    
    public void deleteInterRATANRforGSMIndicator()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type InterRATANRforGSMIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class InterRATANRforGSMIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private InterRATANRforGSMIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected InterRATANRforGSMIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final InterRATANRforGSMIndicator _true =
	    new InterRATANRforGSMIndicator(0);
	private final static InterRATANRforGSMIndicator cNamedNumbers[] = {
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
	
	public static InterRATANRforGSMIndicator valueOf(long value)
	{
	    return (InterRATANRforGSMIndicator)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"LoggedANRConfigurationInfo$InterRATANRforGSMIndicator"
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
	 * Get the type descriptor (TypeInfo) of 'this' InterRATANRforGSMIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' InterRATANRforGSMIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for InterRATANRforGSMIndicator

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
	    "LoggedANRConfigurationInfo"
	),
	new QName (
	    "InformationElements",
	    "LoggedANRConfigurationInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "LoggedANRConfigurationInfo$LoggingDuration"
			)
		    ),
		    "loggingDuration",
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
				"IntraUTRAANR"
			    ),
			    new QName (
				"InformationElements",
				"IntraUTRAANR"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraUTRAANR"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraUTRAANR"
				)
			    ),
			    0
			)
		    ),
		    "intraUTRAANR",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "LoggedANRConfigurationInfo$InterRATANRforEUTRAIndicator"
			)
		    ),
		    "interRATANRforEUTRAIndicator",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "LoggedANRConfigurationInfo$InterRATANRforGSMIndicator"
			)
		    ),
		    "interRATANRforGSMIndicator",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LoggedANRConfigurationInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedANRConfigurationInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedANRConfigurationInfo
