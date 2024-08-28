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
 * Define the ASN1 Type UL_CompressedModeMethod from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UL_CompressedModeMethod extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UL_CompressedModeMethod()
    {
	super(cFirstNumber);
    }
    
    protected UL_CompressedModeMethod(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UL_CompressedModeMethod sf_2 =
	new UL_CompressedModeMethod(0);
    public static final UL_CompressedModeMethod higherLayerScheduling =
	new UL_CompressedModeMethod(1);
    private final static UL_CompressedModeMethod cNamedNumbers[] = {
	 sf_2, 
	 higherLayerScheduling
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
    
    public static UL_CompressedModeMethod valueOf(long value)
    {
	return (UL_CompressedModeMethod)sf_2.lookupValue(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	new Tags (
	    new short[] {
		0x000a
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "UL_CompressedModeMethod"
	),
	new QName (
	    "InformationElements",
	    "UL-CompressedModeMethod"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sf-2",
		    0
		),
		new MemberListElement (
		    "higherLayerScheduling",
		    1
		)
	    }
	),
	0,
	sf_2
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_CompressedModeMethod object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_CompressedModeMethod object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_CompressedModeMethod
