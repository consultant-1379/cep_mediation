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
 * Define the ASN1 Type HS_DSCH_DrxCycleFach from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class HS_DSCH_DrxCycleFach extends Enumerated {
    
    /**
     * The default constructor.
     */
    private HS_DSCH_DrxCycleFach()
    {
	super(cFirstNumber);
    }
    
    protected HS_DSCH_DrxCycleFach(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final HS_DSCH_DrxCycleFach f4 =
	new HS_DSCH_DrxCycleFach(0);
    public static final HS_DSCH_DrxCycleFach f8 =
	new HS_DSCH_DrxCycleFach(1);
    public static final HS_DSCH_DrxCycleFach f16 =
	new HS_DSCH_DrxCycleFach(2);
    public static final HS_DSCH_DrxCycleFach f32 =
	new HS_DSCH_DrxCycleFach(3);
    private final static HS_DSCH_DrxCycleFach cNamedNumbers[] = {
	 f4, 
	 f8, 
	 f16, 
	 f32
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
    
    public static HS_DSCH_DrxCycleFach valueOf(long value)
    {
	return (HS_DSCH_DrxCycleFach)f4.lookupValue(value);
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
	    "HS_DSCH_DrxCycleFach"
	),
	new QName (
	    "InformationElements",
	    "HS-DSCH-DrxCycleFach"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "f4",
		    0
		),
		new MemberListElement (
		    "f8",
		    1
		),
		new MemberListElement (
		    "f16",
		    2
		),
		new MemberListElement (
		    "f32",
		    3
		)
	    }
	),
	0,
	f4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_DSCH_DrxCycleFach object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_DSCH_DrxCycleFach object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_DSCH_DrxCycleFach
