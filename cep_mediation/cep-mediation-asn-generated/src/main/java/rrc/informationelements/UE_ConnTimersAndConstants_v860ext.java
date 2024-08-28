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
 * Define the ASN1 Type UE_ConnTimersAndConstants_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_ConnTimersAndConstants_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_ConnTimersAndConstants_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_ConnTimersAndConstants_v860ext(T_323 t_323)
    {
	setT_323(t_323);
    }
    
    public void initComponents()
    {
	mComponents[0] = T_323.s0;
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
		return T_323.s0;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "t_323"
    public T_323 getT_323()
    {
	return (T_323)mComponents[0];
    }
    
    public void setT_323(T_323 t_323)
    {
	mComponents[0] = t_323;
    }
    
    public boolean hasT_323()
    {
	return componentIsPresent(0);
    }
    
    public void deleteT_323()
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
	    "UE_ConnTimersAndConstants_v860ext"
	),
	new QName (
	    "InformationElements",
	    "UE-ConnTimersAndConstants-v860ext"
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
				"T_323"
			    ),
			    new QName (
				"InformationElements",
				"T-323"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"s0",
					0
				    ),
				    new MemberListElement (
					"s5",
					1
				    ),
				    new MemberListElement (
					"s10",
					2
				    ),
				    new MemberListElement (
					"s20",
					3
				    ),
				    new MemberListElement (
					"s30",
					4
				    ),
				    new MemberListElement (
					"s60",
					5
				    ),
				    new MemberListElement (
					"s90",
					6
				    ),
				    new MemberListElement (
					"s120",
					7
				    )
				}
			    ),
			    0,
			    T_323.s0
			)
		    ),
		    "t-323",
		    0,
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_ConnTimersAndConstants_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_ConnTimersAndConstants_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_ConnTimersAndConstants_v860ext
