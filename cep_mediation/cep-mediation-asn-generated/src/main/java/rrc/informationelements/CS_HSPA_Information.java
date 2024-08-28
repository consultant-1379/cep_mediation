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
 * Define the ASN1 Type CS_HSPA_Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CS_HSPA_Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public CS_HSPA_Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CS_HSPA_Information(UL_AMR_Rate ul_AMR_Rate, 
		    MaxCS_Delay maxCS_Delay)
    {
	setUl_AMR_Rate(ul_AMR_Rate);
	setMaxCS_Delay(maxCS_Delay);
    }
    
    /**
     * Construct with required components.
     */
    public CS_HSPA_Information(MaxCS_Delay maxCS_Delay)
    {
	setMaxCS_Delay(maxCS_Delay);
    }
    
    public void initComponents()
    {
	mComponents[0] = UL_AMR_Rate.t0;
	mComponents[1] = new MaxCS_Delay();
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
		return UL_AMR_Rate.t0;
	    case 1:
		return new MaxCS_Delay();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_AMR_Rate"
    public UL_AMR_Rate getUl_AMR_Rate()
    {
	return (UL_AMR_Rate)mComponents[0];
    }
    
    public void setUl_AMR_Rate(UL_AMR_Rate ul_AMR_Rate)
    {
	mComponents[0] = ul_AMR_Rate;
    }
    
    public boolean hasUl_AMR_Rate()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_AMR_Rate()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "maxCS_Delay"
    public MaxCS_Delay getMaxCS_Delay()
    {
	return (MaxCS_Delay)mComponents[1];
    }
    
    public void setMaxCS_Delay(MaxCS_Delay maxCS_Delay)
    {
	mComponents[1] = maxCS_Delay;
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
	    "CS_HSPA_Information"
	),
	new QName (
	    "InformationElements",
	    "CS-HSPA-Information"
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
				"UL_AMR_Rate"
			    ),
			    new QName (
				"InformationElements",
				"UL-AMR-Rate"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"t0",
					0
				    ),
				    new MemberListElement (
					"t1",
					1
				    ),
				    new MemberListElement (
					"t2",
					2
				    ),
				    new MemberListElement (
					"t3",
					3
				    ),
				    new MemberListElement (
					"t4",
					4
				    ),
				    new MemberListElement (
					"t5",
					5
				    ),
				    new MemberListElement (
					"t6",
					6
				    ),
				    new MemberListElement (
					"t7",
					7
				    ),
				    new MemberListElement (
					"t8",
					8
				    ),
				    new MemberListElement (
					"spare7",
					9
				    ),
				    new MemberListElement (
					"spare6",
					10
				    ),
				    new MemberListElement (
					"spare5",
					11
				    ),
				    new MemberListElement (
					"spare4",
					12
				    ),
				    new MemberListElement (
					"spare3",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    UL_AMR_Rate.t0
			)
		    ),
		    "ul-AMR-Rate",
		    0,
		    3,
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
				"MaxCS_Delay"
			    ),
			    new QName (
				"InformationElements",
				"MaxCS-Delay"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxCS_Delay(0), 
				    new MaxCS_Delay(18),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(18)
			    ),
			    null
			)
		    ),
		    "maxCS-Delay",
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
     * Get the type descriptor (TypeInfo) of 'this' CS_HSPA_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CS_HSPA_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CS_HSPA_Information
