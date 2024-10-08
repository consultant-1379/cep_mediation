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
 * Define the ASN1 Type CellUpdate_va40ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellUpdate_va40ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellUpdate_va40ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellUpdate_va40ext_IEs(SecurityRevertStatusIndicator securityRevertStatusIndicator, 
		    LoggedMeasAvailable loggedMeasAvailable, 
		    LoggedANRResultsAvailable loggedANRResultsAvailable)
    {
	setSecurityRevertStatusIndicator(securityRevertStatusIndicator);
	setLoggedMeasAvailable(loggedMeasAvailable);
	setLoggedANRResultsAvailable(loggedANRResultsAvailable);
    }
    
    public void initComponents()
    {
	mComponents[0] = SecurityRevertStatusIndicator.revertedBack;
	mComponents[1] = LoggedMeasAvailable._true;
	mComponents[2] = LoggedANRResultsAvailable._true;
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
		return SecurityRevertStatusIndicator.revertedBack;
	    case 1:
		return LoggedMeasAvailable._true;
	    case 2:
		return LoggedANRResultsAvailable._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "securityRevertStatusIndicator"
    public SecurityRevertStatusIndicator getSecurityRevertStatusIndicator()
    {
	return (SecurityRevertStatusIndicator)mComponents[0];
    }
    
    public void setSecurityRevertStatusIndicator(SecurityRevertStatusIndicator securityRevertStatusIndicator)
    {
	mComponents[0] = securityRevertStatusIndicator;
    }
    
    public boolean hasSecurityRevertStatusIndicator()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSecurityRevertStatusIndicator()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SecurityRevertStatusIndicator from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SecurityRevertStatusIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SecurityRevertStatusIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected SecurityRevertStatusIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SecurityRevertStatusIndicator revertedBack =
	    new SecurityRevertStatusIndicator(0);
	public static final SecurityRevertStatusIndicator normalOperation =
	    new SecurityRevertStatusIndicator(1);
	private final static SecurityRevertStatusIndicator cNamedNumbers[] = {
	     revertedBack, 
	     normalOperation
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
	
	public static SecurityRevertStatusIndicator valueOf(long value)
	{
	    return (SecurityRevertStatusIndicator)revertedBack.lookupValue(value);
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
		"CellUpdate_va40ext_IEs$SecurityRevertStatusIndicator"
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
			"revertedBack",
			0
		    ),
		    new MemberListElement (
			"normalOperation",
			1
		    )
		}
	    ),
	    0,
	    revertedBack
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SecurityRevertStatusIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SecurityRevertStatusIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SecurityRevertStatusIndicator

    // Methods for field "loggedMeasAvailable"
    public LoggedMeasAvailable getLoggedMeasAvailable()
    {
	return (LoggedMeasAvailable)mComponents[1];
    }
    
    public void setLoggedMeasAvailable(LoggedMeasAvailable loggedMeasAvailable)
    {
	mComponents[1] = loggedMeasAvailable;
    }
    
    public boolean hasLoggedMeasAvailable()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLoggedMeasAvailable()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type LoggedMeasAvailable from ASN1 Module PDU_definitions.
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellUpdate_va40ext_IEs$LoggedMeasAvailable"
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

    // Methods for field "loggedANRResultsAvailable"
    public LoggedANRResultsAvailable getLoggedANRResultsAvailable()
    {
	return (LoggedANRResultsAvailable)mComponents[2];
    }
    
    public void setLoggedANRResultsAvailable(LoggedANRResultsAvailable loggedANRResultsAvailable)
    {
	mComponents[2] = loggedANRResultsAvailable;
    }
    
    public boolean hasLoggedANRResultsAvailable()
    {
	return componentIsPresent(2);
    }
    
    public void deleteLoggedANRResultsAvailable()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type LoggedANRResultsAvailable from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class LoggedANRResultsAvailable extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LoggedANRResultsAvailable()
	{
	    super(cFirstNumber);
	}
	
	protected LoggedANRResultsAvailable(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LoggedANRResultsAvailable _true =
	    new LoggedANRResultsAvailable(0);
	private final static LoggedANRResultsAvailable cNamedNumbers[] = {
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
	
	public static LoggedANRResultsAvailable valueOf(long value)
	{
	    return (LoggedANRResultsAvailable)_true.lookupValue(value);
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
		"rrc.pdu_definitions",
		"CellUpdate_va40ext_IEs$LoggedANRResultsAvailable"
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
	 * Get the type descriptor (TypeInfo) of 'this' LoggedANRResultsAvailable object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LoggedANRResultsAvailable object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LoggedANRResultsAvailable

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
	    "CellUpdate_va40ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdate-va40ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_va40ext_IEs$SecurityRevertStatusIndicator"
			)
		    ),
		    "securityRevertStatusIndicator",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_va40ext_IEs$LoggedMeasAvailable"
			)
		    ),
		    "loggedMeasAvailable",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_va40ext_IEs$LoggedANRResultsAvailable"
			)
		    ),
		    "loggedANRResultsAvailable",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' CellUpdate_va40ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdate_va40ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdate_va40ext_IEs
