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
 * Define the ASN1 Type BackoffControlParams from ASN1 Module InformationElements.
 * @see Sequence
 */

public class BackoffControlParams extends Sequence {
    
    /**
     * The default constructor.
     */
    public BackoffControlParams()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BackoffControlParams(N_AP_RetransMax n_AP_RetransMax, 
		    N_AccessFails n_AccessFails, NF_BO_NoAICH nf_BO_NoAICH, 
		    NS_BO_Busy ns_BO_Busy, NF_BO_AllBusy nf_BO_AllBusy, 
		    NF_BO_Mismatch nf_BO_Mismatch, T_CPCH t_CPCH)
    {
	setN_AP_RetransMax(n_AP_RetransMax);
	setN_AccessFails(n_AccessFails);
	setNf_BO_NoAICH(nf_BO_NoAICH);
	setNs_BO_Busy(ns_BO_Busy);
	setNf_BO_AllBusy(nf_BO_AllBusy);
	setNf_BO_Mismatch(nf_BO_Mismatch);
	setT_CPCH(t_CPCH);
    }
    
    public void initComponents()
    {
	mComponents[0] = new N_AP_RetransMax();
	mComponents[1] = new N_AccessFails();
	mComponents[2] = new NF_BO_NoAICH();
	mComponents[3] = new NS_BO_Busy();
	mComponents[4] = new NF_BO_AllBusy();
	mComponents[5] = new NF_BO_Mismatch();
	mComponents[6] = T_CPCH.ct0;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new N_AP_RetransMax();
	    case 1:
		return new N_AccessFails();
	    case 2:
		return new NF_BO_NoAICH();
	    case 3:
		return new NS_BO_Busy();
	    case 4:
		return new NF_BO_AllBusy();
	    case 5:
		return new NF_BO_Mismatch();
	    case 6:
		return T_CPCH.ct0;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "n_AP_RetransMax"
    public N_AP_RetransMax getN_AP_RetransMax()
    {
	return (N_AP_RetransMax)mComponents[0];
    }
    
    public void setN_AP_RetransMax(N_AP_RetransMax n_AP_RetransMax)
    {
	mComponents[0] = n_AP_RetransMax;
    }
    
    
    // Methods for field "n_AccessFails"
    public N_AccessFails getN_AccessFails()
    {
	return (N_AccessFails)mComponents[1];
    }
    
    public void setN_AccessFails(N_AccessFails n_AccessFails)
    {
	mComponents[1] = n_AccessFails;
    }
    
    
    // Methods for field "nf_BO_NoAICH"
    public NF_BO_NoAICH getNf_BO_NoAICH()
    {
	return (NF_BO_NoAICH)mComponents[2];
    }
    
    public void setNf_BO_NoAICH(NF_BO_NoAICH nf_BO_NoAICH)
    {
	mComponents[2] = nf_BO_NoAICH;
    }
    
    
    // Methods for field "ns_BO_Busy"
    public NS_BO_Busy getNs_BO_Busy()
    {
	return (NS_BO_Busy)mComponents[3];
    }
    
    public void setNs_BO_Busy(NS_BO_Busy ns_BO_Busy)
    {
	mComponents[3] = ns_BO_Busy;
    }
    
    
    // Methods for field "nf_BO_AllBusy"
    public NF_BO_AllBusy getNf_BO_AllBusy()
    {
	return (NF_BO_AllBusy)mComponents[4];
    }
    
    public void setNf_BO_AllBusy(NF_BO_AllBusy nf_BO_AllBusy)
    {
	mComponents[4] = nf_BO_AllBusy;
    }
    
    
    // Methods for field "nf_BO_Mismatch"
    public NF_BO_Mismatch getNf_BO_Mismatch()
    {
	return (NF_BO_Mismatch)mComponents[5];
    }
    
    public void setNf_BO_Mismatch(NF_BO_Mismatch nf_BO_Mismatch)
    {
	mComponents[5] = nf_BO_Mismatch;
    }
    
    
    // Methods for field "t_CPCH"
    public T_CPCH getT_CPCH()
    {
	return (T_CPCH)mComponents[6];
    }
    
    public void setT_CPCH(T_CPCH t_CPCH)
    {
	mComponents[6] = t_CPCH;
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
	    "BackoffControlParams"
	),
	new QName (
	    "InformationElements",
	    "BackoffControlParams"
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
				"rrc.informationelements",
				"N_AP_RetransMax"
			    ),
			    new QName (
				"InformationElements",
				"N-AP-RetransMax"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new N_AP_RetransMax(1), 
				    new N_AP_RetransMax(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "n-AP-RetransMax",
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
				"N_AccessFails"
			    ),
			    new QName (
				"InformationElements",
				"N-AccessFails"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new N_AccessFails(1), 
				    new N_AccessFails(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "n-AccessFails",
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
				"NF_BO_NoAICH"
			    ),
			    new QName (
				"InformationElements",
				"NF-BO-NoAICH"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new NF_BO_NoAICH(0), 
				    new NF_BO_NoAICH(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "nf-BO-NoAICH",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NS_BO_Busy"
			    ),
			    new QName (
				"InformationElements",
				"NS-BO-Busy"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new NS_BO_Busy(0), 
				    new NS_BO_Busy(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "ns-BO-Busy",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NF_BO_AllBusy"
			    ),
			    new QName (
				"InformationElements",
				"NF-BO-AllBusy"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new NF_BO_AllBusy(0), 
				    new NF_BO_AllBusy(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "nf-BO-AllBusy",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NF_BO_Mismatch"
			    ),
			    new QName (
				"InformationElements",
				"NF-BO-Mismatch"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new NF_BO_Mismatch(0), 
				    new NF_BO_Mismatch(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "nf-BO-Mismatch",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_CPCH"
			    ),
			    new QName (
				"InformationElements",
				"T-CPCH"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ct0",
					0
				    ),
				    new MemberListElement (
					"ct1",
					1
				    )
				}
			    ),
			    0,
			    T_CPCH.ct0
			)
		    ),
		    "t-CPCH",
		    6,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BackoffControlParams object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BackoffControlParams object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BackoffControlParams
