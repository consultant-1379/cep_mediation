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
 * Define the ASN1 Type HS_DSCH_DrxBurstFach from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class HS_DSCH_DrxBurstFach extends Enumerated {
    
    /**
     * The default constructor.
     */
    private HS_DSCH_DrxBurstFach()
    {
	super(cFirstNumber);
    }
    
    protected HS_DSCH_DrxBurstFach(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final HS_DSCH_DrxBurstFach f1 =
	new HS_DSCH_DrxBurstFach(0);
    public static final HS_DSCH_DrxBurstFach f2 =
	new HS_DSCH_DrxBurstFach(1);
    public static final HS_DSCH_DrxBurstFach f4 =
	new HS_DSCH_DrxBurstFach(2);
    public static final HS_DSCH_DrxBurstFach f8 =
	new HS_DSCH_DrxBurstFach(3);
    public static final HS_DSCH_DrxBurstFach f16 =
	new HS_DSCH_DrxBurstFach(4);
    public static final HS_DSCH_DrxBurstFach spare3 =
	new HS_DSCH_DrxBurstFach(5);
    public static final HS_DSCH_DrxBurstFach spare2 =
	new HS_DSCH_DrxBurstFach(6);
    public static final HS_DSCH_DrxBurstFach spare1 =
	new HS_DSCH_DrxBurstFach(7);
    private final static HS_DSCH_DrxBurstFach cNamedNumbers[] = {
	 f1, 
	 f2, 
	 f4, 
	 f8, 
	 f16, 
	 spare3, 
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
    
    public static HS_DSCH_DrxBurstFach valueOf(long value)
    {
	return (HS_DSCH_DrxBurstFach)f1.lookupValue(value);
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
	    "HS_DSCH_DrxBurstFach"
	),
	new QName (
	    "InformationElements",
	    "HS-DSCH-DrxBurstFach"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "f1",
		    0
		),
		new MemberListElement (
		    "f2",
		    1
		),
		new MemberListElement (
		    "f4",
		    2
		),
		new MemberListElement (
		    "f8",
		    3
		),
		new MemberListElement (
		    "f16",
		    4
		),
		new MemberListElement (
		    "spare3",
		    5
		),
		new MemberListElement (
		    "spare2",
		    6
		),
		new MemberListElement (
		    "spare1",
		    7
		)
	    }
	),
	0,
	f1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_DSCH_DrxBurstFach object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_DSCH_DrxBurstFach object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_DSCH_DrxBurstFach
