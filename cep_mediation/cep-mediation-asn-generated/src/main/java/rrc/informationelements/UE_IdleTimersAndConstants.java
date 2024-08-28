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
 * Define the ASN1 Type UE_IdleTimersAndConstants from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_IdleTimersAndConstants extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_IdleTimersAndConstants()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_IdleTimersAndConstants(T_300 t_300, N_300 n_300, T_312 t_312, 
		    N_312 n_312)
    {
	setT_300(t_300);
	setN_300(n_300);
	setT_312(t_312);
	setN_312(n_312);
    }
    
    public void initComponents()
    {
	mComponents[0] = T_300.ms100;
	mComponents[1] = new N_300();
	mComponents[2] = new T_312();
	mComponents[3] = N_312.s1;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return T_300.ms100;
	    case 1:
		return new N_300();
	    case 2:
		return new T_312();
	    case 3:
		return N_312.s1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "t_300"
    public T_300 getT_300()
    {
	return (T_300)mComponents[0];
    }
    
    public void setT_300(T_300 t_300)
    {
	mComponents[0] = t_300;
    }
    
    
    // Methods for field "n_300"
    public N_300 getN_300()
    {
	return (N_300)mComponents[1];
    }
    
    public void setN_300(N_300 n_300)
    {
	mComponents[1] = n_300;
    }
    
    
    // Methods for field "t_312"
    public T_312 getT_312()
    {
	return (T_312)mComponents[2];
    }
    
    public void setT_312(T_312 t_312)
    {
	mComponents[2] = t_312;
    }
    
    
    // Methods for field "n_312"
    public N_312 getN_312()
    {
	return (N_312)mComponents[3];
    }
    
    public void setN_312(N_312 n_312)
    {
	mComponents[3] = n_312;
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
	    "UE_IdleTimersAndConstants"
	),
	new QName (
	    "InformationElements",
	    "UE-IdleTimersAndConstants"
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
				"T_300"
			    ),
			    new QName (
				"InformationElements",
				"T-300"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms100",
					0
				    ),
				    new MemberListElement (
					"ms200",
					1
				    ),
				    new MemberListElement (
					"ms400",
					2
				    ),
				    new MemberListElement (
					"ms600",
					3
				    ),
				    new MemberListElement (
					"ms800",
					4
				    ),
				    new MemberListElement (
					"ms1000",
					5
				    ),
				    new MemberListElement (
					"ms1200",
					6
				    ),
				    new MemberListElement (
					"ms1400",
					7
				    ),
				    new MemberListElement (
					"ms1600",
					8
				    ),
				    new MemberListElement (
					"ms1800",
					9
				    ),
				    new MemberListElement (
					"ms2000",
					10
				    ),
				    new MemberListElement (
					"ms3000",
					11
				    ),
				    new MemberListElement (
					"ms4000",
					12
				    ),
				    new MemberListElement (
					"ms6000",
					13
				    ),
				    new MemberListElement (
					"ms8000",
					14
				    )
				}
			    ),
			    0,
			    T_300.ms100
			)
		    ),
		    "t-300",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_300"
			    ),
			    new QName (
				"InformationElements",
				"N-300"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new N_300(0), 
				    new N_300(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "n-300",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_312"
			    ),
			    new QName (
				"InformationElements",
				"T-312"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new T_312(0), 
				    new T_312(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "t-312",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_312"
			    ),
			    new QName (
				"InformationElements",
				"N-312"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"s1",
					0
				    ),
				    new MemberListElement (
					"s50",
					1
				    ),
				    new MemberListElement (
					"s100",
					2
				    ),
				    new MemberListElement (
					"s200",
					3
				    ),
				    new MemberListElement (
					"s400",
					4
				    ),
				    new MemberListElement (
					"s600",
					5
				    ),
				    new MemberListElement (
					"s800",
					6
				    ),
				    new MemberListElement (
					"s1000",
					7
				    )
				}
			    ),
			    0,
			    N_312.s1
			)
		    ),
		    "n-312",
		    3,
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_IdleTimersAndConstants object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_IdleTimersAndConstants object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_IdleTimersAndConstants
