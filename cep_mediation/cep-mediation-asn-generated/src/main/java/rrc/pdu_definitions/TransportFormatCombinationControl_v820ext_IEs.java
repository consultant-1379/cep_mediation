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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type TransportFormatCombinationControl_v820ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class TransportFormatCombinationControl_v820ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public TransportFormatCombinationControl_v820ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TransportFormatCombinationControl_v820ext_IEs(rrc.informationelements.UL_AMR_Rate ul_AMR_Rate)
    {
	setUl_AMR_Rate(ul_AMR_Rate);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.UL_AMR_Rate.t0;
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
		return rrc.informationelements.UL_AMR_Rate.t0;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_AMR_Rate"
    public rrc.informationelements.UL_AMR_Rate getUl_AMR_Rate()
    {
	return (rrc.informationelements.UL_AMR_Rate)mComponents[0];
    }
    
    public void setUl_AMR_Rate(rrc.informationelements.UL_AMR_Rate ul_AMR_Rate)
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
	    "rrc.pdu_definitions",
	    "TransportFormatCombinationControl_v820ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "TransportFormatCombinationControl-v820ext-IEs"
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
			    rrc.informationelements.UL_AMR_Rate.t0
			)
		    ),
		    "ul-AMR-Rate",
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
     * Get the type descriptor (TypeInfo) of 'this' TransportFormatCombinationControl_v820ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransportFormatCombinationControl_v820ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransportFormatCombinationControl_v820ext_IEs
