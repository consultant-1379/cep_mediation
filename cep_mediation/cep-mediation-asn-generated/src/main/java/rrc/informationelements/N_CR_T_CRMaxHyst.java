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
 * Define the ASN1 Type N_CR_T_CRMaxHyst from ASN1 Module InformationElements.
 * @see Sequence
 */

public class N_CR_T_CRMaxHyst extends Sequence {
    
    /**
     * The default constructor.
     */
    public N_CR_T_CRMaxHyst()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public N_CR_T_CRMaxHyst(INTEGER n_CR, T_CRMaxHyst t_CRMaxHyst)
    {
	setN_CR(n_CR);
	setT_CRMaxHyst(t_CRMaxHyst);
    }
    
    /**
     * Construct with components.
     */
    public N_CR_T_CRMaxHyst(long n_CR, T_CRMaxHyst t_CRMaxHyst)
    {
	this(new INTEGER(n_CR), t_CRMaxHyst);
    }
    
    /**
     * Construct with required components.
     */
    public N_CR_T_CRMaxHyst(T_CRMaxHyst t_CRMaxHyst)
    {
	setT_CRMaxHyst(t_CRMaxHyst);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = T_CRMaxHyst.notUsed;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return T_CRMaxHyst.notUsed;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final com.oss.asn1.INTEGER n_CR__default = 
	new com.oss.asn1.INTEGER(8);
    
    // Methods for field "n_CR"
    public long getN_CR()
    {
	if (hasN_CR())
	    return ((INTEGER)mComponents[0]).longValue();
	else
	    return n_CR__default.longValue();
    }
    
    public void setN_CR(long n_CR)
    {
	setN_CR(new INTEGER(n_CR));
    }
    
    public void setN_CR(INTEGER n_CR)
    {
	mComponents[0] = n_CR;
    }
    
    public void setN_CRToDefault()
    {
	setN_CR(n_CR__default);
    }
    
    public boolean hasDefaultN_CR()
    {
	return true;
    }
    
    public boolean hasN_CR()
    {
	return componentIsPresent(0);
    }
    
    public void deleteN_CR()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "t_CRMaxHyst"
    public T_CRMaxHyst getT_CRMaxHyst()
    {
	return (T_CRMaxHyst)mComponents[1];
    }
    
    public void setT_CRMaxHyst(T_CRMaxHyst t_CRMaxHyst)
    {
	mComponents[1] = t_CRMaxHyst;
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
	    "N_CR_T_CRMaxHyst"
	),
	new QName (
	    "InformationElements",
	    "N-CR-T-CRMaxHyst"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "n-CR",
		    0,
		    3,
		    n_CR__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_CRMaxHyst"
			    ),
			    new QName (
				"InformationElements",
				"T-CRMaxHyst"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"notUsed",
					0
				    ),
				    new MemberListElement (
					"t10",
					1
				    ),
				    new MemberListElement (
					"t20",
					2
				    ),
				    new MemberListElement (
					"t30",
					3
				    ),
				    new MemberListElement (
					"t40",
					4
				    ),
				    new MemberListElement (
					"t50",
					5
				    ),
				    new MemberListElement (
					"t60",
					6
				    ),
				    new MemberListElement (
					"t70",
					7
				    )
				}
			    ),
			    0,
			    T_CRMaxHyst.notUsed
			)
		    ),
		    "t-CRMaxHyst",
		    1,
		    2,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' N_CR_T_CRMaxHyst object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' N_CR_T_CRMaxHyst object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for N_CR_T_CRMaxHyst
