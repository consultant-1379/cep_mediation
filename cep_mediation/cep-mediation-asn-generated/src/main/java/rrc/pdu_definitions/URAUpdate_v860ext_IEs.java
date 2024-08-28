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
 * Define the ASN1 Type URAUpdate_v860ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class URAUpdate_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public URAUpdate_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public URAUpdate_v860ext_IEs(SupportOfHS_DSCHDRXOperation supportOfHS_DSCHDRXOperation, 
		    SupportOfCommonEDCH supportOfCommonEDCH, 
		    SupportOfMACiis supportOfMACiis)
    {
	setSupportOfHS_DSCHDRXOperation(supportOfHS_DSCHDRXOperation);
	setSupportOfCommonEDCH(supportOfCommonEDCH);
	setSupportOfMACiis(supportOfMACiis);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportOfHS_DSCHDRXOperation._true;
	mComponents[1] = SupportOfCommonEDCH._true;
	mComponents[2] = SupportOfMACiis._true;
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
		return SupportOfHS_DSCHDRXOperation._true;
	    case 1:
		return SupportOfCommonEDCH._true;
	    case 2:
		return SupportOfMACiis._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfHS_DSCHDRXOperation"
    public SupportOfHS_DSCHDRXOperation getSupportOfHS_DSCHDRXOperation()
    {
	return (SupportOfHS_DSCHDRXOperation)mComponents[0];
    }
    
    public void setSupportOfHS_DSCHDRXOperation(SupportOfHS_DSCHDRXOperation supportOfHS_DSCHDRXOperation)
    {
	mComponents[0] = supportOfHS_DSCHDRXOperation;
    }
    
    public boolean hasSupportOfHS_DSCHDRXOperation()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportOfHS_DSCHDRXOperation()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfHS_DSCHDRXOperation from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportOfHS_DSCHDRXOperation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfHS_DSCHDRXOperation()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfHS_DSCHDRXOperation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfHS_DSCHDRXOperation _true =
	    new SupportOfHS_DSCHDRXOperation(0);
	private final static SupportOfHS_DSCHDRXOperation cNamedNumbers[] = {
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
	
	public static SupportOfHS_DSCHDRXOperation valueOf(long value)
	{
	    return (SupportOfHS_DSCHDRXOperation)_true.lookupValue(value);
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
		"URAUpdate_v860ext_IEs$SupportOfHS_DSCHDRXOperation"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfHS_DSCHDRXOperation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfHS_DSCHDRXOperation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfHS_DSCHDRXOperation

    // Methods for field "supportOfCommonEDCH"
    public SupportOfCommonEDCH getSupportOfCommonEDCH()
    {
	return (SupportOfCommonEDCH)mComponents[1];
    }
    
    public void setSupportOfCommonEDCH(SupportOfCommonEDCH supportOfCommonEDCH)
    {
	mComponents[1] = supportOfCommonEDCH;
    }
    
    public boolean hasSupportOfCommonEDCH()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSupportOfCommonEDCH()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfCommonEDCH from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportOfCommonEDCH extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfCommonEDCH()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfCommonEDCH(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfCommonEDCH _true =
	    new SupportOfCommonEDCH(0);
	private final static SupportOfCommonEDCH cNamedNumbers[] = {
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
	
	public static SupportOfCommonEDCH valueOf(long value)
	{
	    return (SupportOfCommonEDCH)_true.lookupValue(value);
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
		"URAUpdate_v860ext_IEs$SupportOfCommonEDCH"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfCommonEDCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfCommonEDCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfCommonEDCH

    // Methods for field "supportOfMACiis"
    public SupportOfMACiis getSupportOfMACiis()
    {
	return (SupportOfMACiis)mComponents[2];
    }
    
    public void setSupportOfMACiis(SupportOfMACiis supportOfMACiis)
    {
	mComponents[2] = supportOfMACiis;
    }
    
    public boolean hasSupportOfMACiis()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSupportOfMACiis()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfMACiis from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportOfMACiis extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfMACiis()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfMACiis(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfMACiis _true =
	    new SupportOfMACiis(0);
	private final static SupportOfMACiis cNamedNumbers[] = {
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
	
	public static SupportOfMACiis valueOf(long value)
	{
	    return (SupportOfMACiis)_true.lookupValue(value);
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
		"URAUpdate_v860ext_IEs$SupportOfMACiis"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfMACiis object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfMACiis object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfMACiis

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
	    "URAUpdate_v860ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "URAUpdate-v860ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "URAUpdate_v860ext_IEs$SupportOfHS_DSCHDRXOperation"
			)
		    ),
		    "supportOfHS-DSCHDRXOperation",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "URAUpdate_v860ext_IEs$SupportOfCommonEDCH"
			)
		    ),
		    "supportOfCommonEDCH",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "URAUpdate_v860ext_IEs$SupportOfMACiis"
			)
		    ),
		    "supportOfMACiis",
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
     * Get the type descriptor (TypeInfo) of 'this' URAUpdate_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' URAUpdate_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for URAUpdate_v860ext_IEs
