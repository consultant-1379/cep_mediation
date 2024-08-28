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
 * Define the ASN1 Type MaximumAM_EntityNumberRLC_Cap from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaximumAM_EntityNumberRLC_Cap extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaximumAM_EntityNumberRLC_Cap()
    {
	super(cFirstNumber);
    }
    
    protected MaximumAM_EntityNumberRLC_Cap(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaximumAM_EntityNumberRLC_Cap dummy =
	new MaximumAM_EntityNumberRLC_Cap(0);
    public static final MaximumAM_EntityNumberRLC_Cap am4 =
	new MaximumAM_EntityNumberRLC_Cap(1);
    public static final MaximumAM_EntityNumberRLC_Cap am5 =
	new MaximumAM_EntityNumberRLC_Cap(2);
    public static final MaximumAM_EntityNumberRLC_Cap am6 =
	new MaximumAM_EntityNumberRLC_Cap(3);
    public static final MaximumAM_EntityNumberRLC_Cap am8 =
	new MaximumAM_EntityNumberRLC_Cap(4);
    public static final MaximumAM_EntityNumberRLC_Cap am16 =
	new MaximumAM_EntityNumberRLC_Cap(5);
    public static final MaximumAM_EntityNumberRLC_Cap am30 =
	new MaximumAM_EntityNumberRLC_Cap(6);
    private final static MaximumAM_EntityNumberRLC_Cap cNamedNumbers[] = {
	 dummy, 
	 am4, 
	 am5, 
	 am6, 
	 am8, 
	 am16, 
	 am30
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
    
    public static MaximumAM_EntityNumberRLC_Cap valueOf(long value)
    {
	return (MaximumAM_EntityNumberRLC_Cap)dummy.lookupValue(value);
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
	    "MaximumAM_EntityNumberRLC_Cap"
	),
	new QName (
	    "InformationElements",
	    "MaximumAM-EntityNumberRLC-Cap"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "dummy",
		    0
		),
		new MemberListElement (
		    "am4",
		    1
		),
		new MemberListElement (
		    "am5",
		    2
		),
		new MemberListElement (
		    "am6",
		    3
		),
		new MemberListElement (
		    "am8",
		    4
		),
		new MemberListElement (
		    "am16",
		    5
		),
		new MemberListElement (
		    "am30",
		    6
		)
	    }
	),
	0,
	dummy
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaximumAM_EntityNumberRLC_Cap object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaximumAM_EntityNumberRLC_Cap object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaximumAM_EntityNumberRLC_Cap
