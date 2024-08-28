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
 * Define the ASN1 Type CellUpdate_v860ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellUpdate_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellUpdate_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellUpdate_v860ext_IEs(SupportOfCommonEDCH supportOfCommonEDCH, 
		    SupportOfHS_DSCHDRXOperation supportOfHS_DSCHDRXOperation, 
		    SupportOfMACiis supportOfMACiis, 
		    SupportOfSPSOperation supportOfSPSOperation, 
		    SupportOfControlChannelDRXOperation supportOfControlChannelDRXOperation)
    {
	setSupportOfCommonEDCH(supportOfCommonEDCH);
	setSupportOfHS_DSCHDRXOperation(supportOfHS_DSCHDRXOperation);
	setSupportOfMACiis(supportOfMACiis);
	setSupportOfSPSOperation(supportOfSPSOperation);
	setSupportOfControlChannelDRXOperation(supportOfControlChannelDRXOperation);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportOfCommonEDCH._true;
	mComponents[1] = SupportOfHS_DSCHDRXOperation._true;
	mComponents[2] = SupportOfMACiis._true;
	mComponents[3] = SupportOfSPSOperation._true;
	mComponents[4] = SupportOfControlChannelDRXOperation._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return SupportOfCommonEDCH._true;
	    case 1:
		return SupportOfHS_DSCHDRXOperation._true;
	    case 2:
		return SupportOfMACiis._true;
	    case 3:
		return SupportOfSPSOperation._true;
	    case 4:
		return SupportOfControlChannelDRXOperation._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfCommonEDCH"
    public SupportOfCommonEDCH getSupportOfCommonEDCH()
    {
	return (SupportOfCommonEDCH)mComponents[0];
    }
    
    public void setSupportOfCommonEDCH(SupportOfCommonEDCH supportOfCommonEDCH)
    {
	mComponents[0] = supportOfCommonEDCH;
    }
    
    public boolean hasSupportOfCommonEDCH()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportOfCommonEDCH()
    {
	setComponentAbsent(0);
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellUpdate_v860ext_IEs$SupportOfCommonEDCH"
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

    // Methods for field "supportOfHS_DSCHDRXOperation"
    public SupportOfHS_DSCHDRXOperation getSupportOfHS_DSCHDRXOperation()
    {
	return (SupportOfHS_DSCHDRXOperation)mComponents[1];
    }
    
    public void setSupportOfHS_DSCHDRXOperation(SupportOfHS_DSCHDRXOperation supportOfHS_DSCHDRXOperation)
    {
	mComponents[1] = supportOfHS_DSCHDRXOperation;
    }
    
    public boolean hasSupportOfHS_DSCHDRXOperation()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSupportOfHS_DSCHDRXOperation()
    {
	setComponentAbsent(1);
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellUpdate_v860ext_IEs$SupportOfHS_DSCHDRXOperation"
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
		"CellUpdate_v860ext_IEs$SupportOfMACiis"
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

    // Methods for field "supportOfSPSOperation"
    public SupportOfSPSOperation getSupportOfSPSOperation()
    {
	return (SupportOfSPSOperation)mComponents[3];
    }
    
    public void setSupportOfSPSOperation(SupportOfSPSOperation supportOfSPSOperation)
    {
	mComponents[3] = supportOfSPSOperation;
    }
    
    public boolean hasSupportOfSPSOperation()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSupportOfSPSOperation()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfSPSOperation from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportOfSPSOperation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfSPSOperation()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfSPSOperation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfSPSOperation _true =
	    new SupportOfSPSOperation(0);
	private final static SupportOfSPSOperation cNamedNumbers[] = {
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
	
	public static SupportOfSPSOperation valueOf(long value)
	{
	    return (SupportOfSPSOperation)_true.lookupValue(value);
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
		"rrc.pdu_definitions",
		"CellUpdate_v860ext_IEs$SupportOfSPSOperation"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfSPSOperation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfSPSOperation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfSPSOperation

    // Methods for field "supportOfControlChannelDRXOperation"
    public SupportOfControlChannelDRXOperation getSupportOfControlChannelDRXOperation()
    {
	return (SupportOfControlChannelDRXOperation)mComponents[4];
    }
    
    public void setSupportOfControlChannelDRXOperation(SupportOfControlChannelDRXOperation supportOfControlChannelDRXOperation)
    {
	mComponents[4] = supportOfControlChannelDRXOperation;
    }
    
    public boolean hasSupportOfControlChannelDRXOperation()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSupportOfControlChannelDRXOperation()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfControlChannelDRXOperation from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportOfControlChannelDRXOperation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfControlChannelDRXOperation()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfControlChannelDRXOperation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfControlChannelDRXOperation _true =
	    new SupportOfControlChannelDRXOperation(0);
	private final static SupportOfControlChannelDRXOperation cNamedNumbers[] = {
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
	
	public static SupportOfControlChannelDRXOperation valueOf(long value)
	{
	    return (SupportOfControlChannelDRXOperation)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellUpdate_v860ext_IEs$SupportOfControlChannelDRXOperation"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfControlChannelDRXOperation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfControlChannelDRXOperation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfControlChannelDRXOperation

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
	    "CellUpdate_v860ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdate-v860ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_v860ext_IEs$SupportOfCommonEDCH"
			)
		    ),
		    "supportOfCommonEDCH",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_v860ext_IEs$SupportOfHS_DSCHDRXOperation"
			)
		    ),
		    "supportOfHS-DSCHDRXOperation",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_v860ext_IEs$SupportOfMACiis"
			)
		    ),
		    "supportOfMACiis",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_v860ext_IEs$SupportOfSPSOperation"
			)
		    ),
		    "supportOfSPSOperation",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_v860ext_IEs$SupportOfControlChannelDRXOperation"
			)
		    ),
		    "supportOfControlChannelDRXOperation",
		    4,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellUpdate_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdate_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdate_v860ext_IEs
