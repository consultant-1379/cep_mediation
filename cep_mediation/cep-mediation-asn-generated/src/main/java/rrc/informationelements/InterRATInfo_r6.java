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
 * Define the ASN1 Type InterRATInfo_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterRATInfo_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATInfo_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATInfo_r6(InterRATInfo rat, 
		    GSM_TargetCellInfoList gsm_TargetCellInfoList)
    {
	setRat(rat);
	setGsm_TargetCellInfoList(gsm_TargetCellInfoList);
    }
    
    /**
     * Construct with required components.
     */
    public InterRATInfo_r6(InterRATInfo rat)
    {
	setRat(rat);
    }
    
    public void initComponents()
    {
	mComponents[0] = InterRATInfo.gsm;
	mComponents[1] = new GSM_TargetCellInfoList();
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
		return InterRATInfo.gsm;
	    case 1:
		return new GSM_TargetCellInfoList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rat"
    public InterRATInfo getRat()
    {
	return (InterRATInfo)mComponents[0];
    }
    
    public void setRat(InterRATInfo rat)
    {
	mComponents[0] = rat;
    }
    
    
    // Methods for field "gsm_TargetCellInfoList"
    public GSM_TargetCellInfoList getGsm_TargetCellInfoList()
    {
	return (GSM_TargetCellInfoList)mComponents[1];
    }
    
    public void setGsm_TargetCellInfoList(GSM_TargetCellInfoList gsm_TargetCellInfoList)
    {
	mComponents[1] = gsm_TargetCellInfoList;
    }
    
    public boolean hasGsm_TargetCellInfoList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGsm_TargetCellInfoList()
    {
	setComponentAbsent(1);
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
	    "InterRATInfo_r6"
	),
	new QName (
	    "InformationElements",
	    "InterRATInfo-r6"
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
				"InterRATInfo"
			    ),
			    new QName (
				"InformationElements",
				"InterRATInfo"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"gsm",
					0
				    )
				}
			    ),
			    0,
			    InterRATInfo.gsm
			)
		    ),
		    "rat",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GSM_TargetCellInfoList"
			    ),
			    new QName (
				"InformationElements",
				"GSM-TargetCellInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "GSM_TargetCellInfo"
				)
			    )
			)
		    ),
		    "gsm-TargetCellInfoList",
		    1,
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATInfo_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATInfo_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATInfo_r6
