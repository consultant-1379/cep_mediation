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
 * Define the ASN1 Type MappingFunctionType from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MappingFunctionType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MappingFunctionType()
    {
	super(cFirstNumber);
    }
    
    protected MappingFunctionType(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MappingFunctionType linear =
	new MappingFunctionType(0);
    public static final MappingFunctionType functionType2 =
	new MappingFunctionType(1);
    public static final MappingFunctionType functionType3 =
	new MappingFunctionType(2);
    public static final MappingFunctionType functionType4 =
	new MappingFunctionType(3);
    private final static MappingFunctionType cNamedNumbers[] = {
	 linear, 
	 functionType2, 
	 functionType3, 
	 functionType4
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
    
    public static MappingFunctionType valueOf(long value)
    {
	return (MappingFunctionType)linear.lookupValue(value);
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
	    "MappingFunctionType"
	),
	new QName (
	    "InformationElements",
	    "MappingFunctionType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "linear",
		    0
		),
		new MemberListElement (
		    "functionType2",
		    1
		),
		new MemberListElement (
		    "functionType3",
		    2
		),
		new MemberListElement (
		    "functionType4",
		    3
		)
	    }
	),
	0,
	linear
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MappingFunctionType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MappingFunctionType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MappingFunctionType
