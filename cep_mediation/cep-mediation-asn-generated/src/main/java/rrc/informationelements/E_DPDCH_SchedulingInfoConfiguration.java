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
 * Define the ASN1 Type E_DPDCH_SchedulingInfoConfiguration from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DPDCH_SchedulingInfoConfiguration extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DPDCH_SchedulingInfoConfiguration()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DPDCH_SchedulingInfoConfiguration(E_DPDCH_PeriodicyOfSchedInfo periodicityOfSchedInfo_NoGrant, 
		    E_DPDCH_PeriodicyOfSchedInfo periodicityOfSchedInfo_Grant, 
		    INTEGER powerOffsetForSchedInfo)
    {
	setPeriodicityOfSchedInfo_NoGrant(periodicityOfSchedInfo_NoGrant);
	setPeriodicityOfSchedInfo_Grant(periodicityOfSchedInfo_Grant);
	setPowerOffsetForSchedInfo(powerOffsetForSchedInfo);
    }
    
    /**
     * Construct with components.
     */
    public E_DPDCH_SchedulingInfoConfiguration(E_DPDCH_PeriodicyOfSchedInfo periodicityOfSchedInfo_NoGrant, 
		    E_DPDCH_PeriodicyOfSchedInfo periodicityOfSchedInfo_Grant, 
		    long powerOffsetForSchedInfo)
    {
	this(periodicityOfSchedInfo_NoGrant, periodicityOfSchedInfo_Grant, 
	     new INTEGER(powerOffsetForSchedInfo));
    }
    
    /**
     * Construct with required components.
     */
    public E_DPDCH_SchedulingInfoConfiguration(long powerOffsetForSchedInfo)
    {
	setPowerOffsetForSchedInfo(powerOffsetForSchedInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = E_DPDCH_PeriodicyOfSchedInfo.everyEDCHTTI;
	mComponents[1] = E_DPDCH_PeriodicyOfSchedInfo.everyEDCHTTI;
	mComponents[2] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return E_DPDCH_PeriodicyOfSchedInfo.everyEDCHTTI;
	    case 1:
		return E_DPDCH_PeriodicyOfSchedInfo.everyEDCHTTI;
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "periodicityOfSchedInfo_NoGrant"
    public E_DPDCH_PeriodicyOfSchedInfo getPeriodicityOfSchedInfo_NoGrant()
    {
	return (E_DPDCH_PeriodicyOfSchedInfo)mComponents[0];
    }
    
    public void setPeriodicityOfSchedInfo_NoGrant(E_DPDCH_PeriodicyOfSchedInfo periodicityOfSchedInfo_NoGrant)
    {
	mComponents[0] = periodicityOfSchedInfo_NoGrant;
    }
    
    public boolean hasPeriodicityOfSchedInfo_NoGrant()
    {
	return componentIsPresent(0);
    }
    
    public void deletePeriodicityOfSchedInfo_NoGrant()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "periodicityOfSchedInfo_Grant"
    public E_DPDCH_PeriodicyOfSchedInfo getPeriodicityOfSchedInfo_Grant()
    {
	return (E_DPDCH_PeriodicyOfSchedInfo)mComponents[1];
    }
    
    public void setPeriodicityOfSchedInfo_Grant(E_DPDCH_PeriodicyOfSchedInfo periodicityOfSchedInfo_Grant)
    {
	mComponents[1] = periodicityOfSchedInfo_Grant;
    }
    
    public boolean hasPeriodicityOfSchedInfo_Grant()
    {
	return componentIsPresent(1);
    }
    
    public void deletePeriodicityOfSchedInfo_Grant()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "powerOffsetForSchedInfo"
    public long getPowerOffsetForSchedInfo()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setPowerOffsetForSchedInfo(long powerOffsetForSchedInfo)
    {
	setPowerOffsetForSchedInfo(new INTEGER(powerOffsetForSchedInfo));
    }
    
    public void setPowerOffsetForSchedInfo(INTEGER powerOffsetForSchedInfo)
    {
	mComponents[2] = powerOffsetForSchedInfo;
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
	    "E_DPDCH_SchedulingInfoConfiguration"
	),
	new QName (
	    "InformationElements",
	    "E-DPDCH-SchedulingInfoConfiguration"
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
				"E_DPDCH_PeriodicyOfSchedInfo"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-PeriodicyOfSchedInfo"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"everyEDCHTTI",
					0
				    ),
				    new MemberListElement (
					"ms4",
					1
				    ),
				    new MemberListElement (
					"ms10",
					2
				    ),
				    new MemberListElement (
					"ms20",
					3
				    ),
				    new MemberListElement (
					"ms50",
					4
				    ),
				    new MemberListElement (
					"ms100",
					5
				    ),
				    new MemberListElement (
					"ms200",
					6
				    ),
				    new MemberListElement (
					"ms500",
					7
				    ),
				    new MemberListElement (
					"ms1000",
					8
				    )
				}
			    ),
			    0,
			    E_DPDCH_PeriodicyOfSchedInfo.everyEDCHTTI
			)
		    ),
		    "periodicityOfSchedInfo-NoGrant",
		    0,
		    3,
		    null
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
				"E_DPDCH_PeriodicyOfSchedInfo"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-PeriodicyOfSchedInfo"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"everyEDCHTTI",
					0
				    ),
				    new MemberListElement (
					"ms4",
					1
				    ),
				    new MemberListElement (
					"ms10",
					2
				    ),
				    new MemberListElement (
					"ms20",
					3
				    ),
				    new MemberListElement (
					"ms50",
					4
				    ),
				    new MemberListElement (
					"ms100",
					5
				    ),
				    new MemberListElement (
					"ms200",
					6
				    ),
				    new MemberListElement (
					"ms500",
					7
				    ),
				    new MemberListElement (
					"ms1000",
					8
				    )
				}
			    ),
			    0,
			    E_DPDCH_PeriodicyOfSchedInfo.everyEDCHTTI
			)
		    ),
		    "periodicityOfSchedInfo-Grant",
		    1,
		    3,
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "powerOffsetForSchedInfo",
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_DPDCH_SchedulingInfoConfiguration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DPDCH_SchedulingInfoConfiguration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DPDCH_SchedulingInfoConfiguration
