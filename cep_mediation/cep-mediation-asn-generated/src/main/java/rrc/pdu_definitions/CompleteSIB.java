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
 * Define the ASN1 Type CompleteSIB from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CompleteSIB extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompleteSIB()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompleteSIB(rrc.informationelements.SIB_Type sib_Type, 
		    BitString sib_Data_fixed)
    {
	setSib_Type(sib_Type);
	setSib_Data_fixed(sib_Data_fixed);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.SIB_Type.masterInformationBlock;
	mComponents[1] = new BitString();
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
		return rrc.informationelements.SIB_Type.masterInformationBlock;
	    case 1:
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sib_Type"
    public rrc.informationelements.SIB_Type getSib_Type()
    {
	return (rrc.informationelements.SIB_Type)mComponents[0];
    }
    
    public void setSib_Type(rrc.informationelements.SIB_Type sib_Type)
    {
	mComponents[0] = sib_Type;
    }
    
    
    // Methods for field "sib_Data_fixed"
    public BitString getSib_Data_fixed()
    {
	return (BitString)mComponents[1];
    }
    
    public void setSib_Data_fixed(BitString sib_Data_fixed)
    {
	mComponents[1] = sib_Data_fixed;
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
	    "CompleteSIB"
	),
	new QName (
	    "PDU-definitions",
	    "CompleteSIB"
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
				"SIB_Type"
			    ),
			    new QName (
				"InformationElements",
				"SIB-Type"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"masterInformationBlock",
					0
				    ),
				    new MemberListElement (
					"systemInformationBlockType1",
					1
				    ),
				    new MemberListElement (
					"systemInformationBlockType2",
					2
				    ),
				    new MemberListElement (
					"systemInformationBlockType3",
					3
				    ),
				    new MemberListElement (
					"systemInformationBlockType4",
					4
				    ),
				    new MemberListElement (
					"systemInformationBlockType5",
					5
				    ),
				    new MemberListElement (
					"systemInformationBlockType6",
					6
				    ),
				    new MemberListElement (
					"systemInformationBlockType7",
					7
				    ),
				    new MemberListElement (
					"dummy",
					8
				    ),
				    new MemberListElement (
					"dummy2",
					9
				    ),
				    new MemberListElement (
					"dummy3",
					10
				    ),
				    new MemberListElement (
					"systemInformationBlockType11",
					11
				    ),
				    new MemberListElement (
					"systemInformationBlockType12",
					12
				    ),
				    new MemberListElement (
					"systemInformationBlockType13",
					13
				    ),
				    new MemberListElement (
					"systemInformationBlockType13-1",
					14
				    ),
				    new MemberListElement (
					"systemInformationBlockType13-2",
					15
				    ),
				    new MemberListElement (
					"systemInformationBlockType13-3",
					16
				    ),
				    new MemberListElement (
					"systemInformationBlockType13-4",
					17
				    ),
				    new MemberListElement (
					"systemInformationBlockType14",
					18
				    ),
				    new MemberListElement (
					"systemInformationBlockType15",
					19
				    ),
				    new MemberListElement (
					"systemInformationBlockType15-1",
					20
				    ),
				    new MemberListElement (
					"systemInformationBlockType15-2",
					21
				    ),
				    new MemberListElement (
					"systemInformationBlockType15-3",
					22
				    ),
				    new MemberListElement (
					"systemInformationBlockType16",
					23
				    ),
				    new MemberListElement (
					"systemInformationBlockType17",
					24
				    ),
				    new MemberListElement (
					"systemInformationBlockType15-4",
					25
				    ),
				    new MemberListElement (
					"systemInformationBlockType18",
					26
				    ),
				    new MemberListElement (
					"schedulingBlock1",
					27
				    ),
				    new MemberListElement (
					"schedulingBlock2",
					28
				    ),
				    new MemberListElement (
					"systemInformationBlockType15-5",
					29
				    ),
				    new MemberListElement (
					"systemInformationBlockType5bis",
					30
				    ),
				    new MemberListElement (
					"extensionType",
					31
				    )
				}
			    ),
			    0,
			    rrc.informationelements.SIB_Type.masterInformationBlock
			)
		    ),
		    "sib-Type",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(226)
				)
			    ),
			    new Bounds (
				new java.lang.Long(226),
				new java.lang.Long(226)
			    ),
			    null
			)
		    ),
		    "sib-Data-fixed",
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
     * Get the type descriptor (TypeInfo) of 'this' CompleteSIB object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompleteSIB object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompleteSIB
