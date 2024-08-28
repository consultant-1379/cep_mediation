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
 * Define the ASN1 Type HS_DSCH_TBSizeTable from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class HS_DSCH_TBSizeTable extends Enumerated {
    
    /**
     * The default constructor.
     */
    private HS_DSCH_TBSizeTable()
    {
	super(cFirstNumber);
    }
    
    protected HS_DSCH_TBSizeTable(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final HS_DSCH_TBSizeTable octetAligned =
	new HS_DSCH_TBSizeTable(0);
    private final static HS_DSCH_TBSizeTable cNamedNumbers[] = {
	 octetAligned
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
    
    public static HS_DSCH_TBSizeTable valueOf(long value)
    {
	return (HS_DSCH_TBSizeTable)octetAligned.lookupValue(value);
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
	    "HS_DSCH_TBSizeTable"
	),
	new QName (
	    "InformationElements",
	    "HS-DSCH-TBSizeTable"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "octetAligned",
		    0
		)
	    }
	),
	0,
	octetAligned
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_DSCH_TBSizeTable object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_DSCH_TBSizeTable object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_DSCH_TBSizeTable
