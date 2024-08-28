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
 * Define the ASN1 Type MBMS_TimersAndCounters_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_TimersAndCounters_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_TimersAndCounters_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_TimersAndCounters_r6(T_318 t_318)
    {
	setT_318(t_318);
    }
    
    public void initComponents()
    {
	mComponents[0] = T_318.ms250;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return T_318.ms250;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final T_318 t_318__default = 
	T_318.ms1000;
    
    // Methods for field "t_318"
    public T_318 getT_318()
    {
	if (hasT_318())
	    return (T_318)mComponents[0];
	else
	    return (T_318)t_318__default.clone();
    }
    
    public void setT_318(T_318 t_318)
    {
	mComponents[0] = t_318;
    }
    
    public void setT_318ToDefault()
    {
	setT_318(t_318__default);
    }
    
    public boolean hasDefaultT_318()
    {
	return true;
    }
    
    public boolean hasT_318()
    {
	return componentIsPresent(0);
    }
    
    public void deleteT_318()
    {
	setComponentAbsent(0);
    }
    
    
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
	    "MBMS_TimersAndCounters_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-TimersAndCounters-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_318"
			    ),
			    new QName (
				"InformationElements",
				"T-318"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms250",
					0
				    ),
				    new MemberListElement (
					"ms500",
					1
				    ),
				    new MemberListElement (
					"ms750",
					2
				    ),
				    new MemberListElement (
					"ms1000",
					3
				    ),
				    new MemberListElement (
					"ms1250",
					4
				    ),
				    new MemberListElement (
					"ms1500",
					5
				    ),
				    new MemberListElement (
					"ms1750",
					6
				    ),
				    new MemberListElement (
					"ms2000",
					7
				    ),
				    new MemberListElement (
					"ms3000",
					8
				    ),
				    new MemberListElement (
					"ms4000",
					9
				    ),
				    new MemberListElement (
					"ms6000",
					10
				    ),
				    new MemberListElement (
					"ms8000",
					11
				    ),
				    new MemberListElement (
					"ms10000",
					12
				    ),
				    new MemberListElement (
					"ms12000",
					13
				    ),
				    new MemberListElement (
					"ms16000",
					14
				    )
				}
			    ),
			    0,
			    T_318.ms250
			)
		    ),
		    "t-318",
		    0,
		    3,
		    t_318__default
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_TimersAndCounters_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_TimersAndCounters_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_TimersAndCounters_r6
