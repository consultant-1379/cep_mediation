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
 * Define the ASN1 Type TemporaryOffsetList from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TemporaryOffsetList extends Sequence {
    
    /**
     * The default constructor.
     */
    public TemporaryOffsetList()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TemporaryOffsetList(TemporaryOffset1 temporaryOffset1, 
		    TemporaryOffset2 temporaryOffset2)
    {
	setTemporaryOffset1(temporaryOffset1);
	setTemporaryOffset2(temporaryOffset2);
    }
    
    public void initComponents()
    {
	mComponents[0] = TemporaryOffset1.to3;
	mComponents[1] = TemporaryOffset2.to2;
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
		return TemporaryOffset1.to3;
	    case 1:
		return TemporaryOffset2.to2;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "temporaryOffset1"
    public TemporaryOffset1 getTemporaryOffset1()
    {
	return (TemporaryOffset1)mComponents[0];
    }
    
    public void setTemporaryOffset1(TemporaryOffset1 temporaryOffset1)
    {
	mComponents[0] = temporaryOffset1;
    }
    
    
    // Methods for field "temporaryOffset2"
    public TemporaryOffset2 getTemporaryOffset2()
    {
	return (TemporaryOffset2)mComponents[1];
    }
    
    public void setTemporaryOffset2(TemporaryOffset2 temporaryOffset2)
    {
	mComponents[1] = temporaryOffset2;
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
	    "TemporaryOffsetList"
	),
	new QName (
	    "InformationElements",
	    "TemporaryOffsetList"
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
				"TemporaryOffset1"
			    ),
			    new QName (
				"InformationElements",
				"TemporaryOffset1"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"to3",
					0
				    ),
				    new MemberListElement (
					"to6",
					1
				    ),
				    new MemberListElement (
					"to9",
					2
				    ),
				    new MemberListElement (
					"to12",
					3
				    ),
				    new MemberListElement (
					"to15",
					4
				    ),
				    new MemberListElement (
					"to18",
					5
				    ),
				    new MemberListElement (
					"to21",
					6
				    ),
				    new MemberListElement (
					"infinite",
					7
				    )
				}
			    ),
			    0,
			    TemporaryOffset1.to3
			)
		    ),
		    "temporaryOffset1",
		    0,
		    2,
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
				"TemporaryOffset2"
			    ),
			    new QName (
				"InformationElements",
				"TemporaryOffset2"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"to2",
					0
				    ),
				    new MemberListElement (
					"to3",
					1
				    ),
				    new MemberListElement (
					"to4",
					2
				    ),
				    new MemberListElement (
					"to6",
					3
				    ),
				    new MemberListElement (
					"to8",
					4
				    ),
				    new MemberListElement (
					"to10",
					5
				    ),
				    new MemberListElement (
					"to12",
					6
				    ),
				    new MemberListElement (
					"infinite",
					7
				    )
				}
			    ),
			    0,
			    TemporaryOffset2.to2
			)
		    ),
		    "temporaryOffset2",
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
     * Get the type descriptor (TypeInfo) of 'this' TemporaryOffsetList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TemporaryOffsetList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TemporaryOffsetList
