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
 * Define the ASN1 Type SSDT_Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SSDT_Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public SSDT_Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SSDT_Information(S_Field s_Field, CodeWordSet codeWordSet)
    {
	setS_Field(s_Field);
	setCodeWordSet(codeWordSet);
    }
    
    public void initComponents()
    {
	mComponents[0] = S_Field.e1bit;
	mComponents[1] = CodeWordSet.longCWS;
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
		return S_Field.e1bit;
	    case 1:
		return CodeWordSet.longCWS;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "s_Field"
    public S_Field getS_Field()
    {
	return (S_Field)mComponents[0];
    }
    
    public void setS_Field(S_Field s_Field)
    {
	mComponents[0] = s_Field;
    }
    
    
    // Methods for field "codeWordSet"
    public CodeWordSet getCodeWordSet()
    {
	return (CodeWordSet)mComponents[1];
    }
    
    public void setCodeWordSet(CodeWordSet codeWordSet)
    {
	mComponents[1] = codeWordSet;
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
	    "SSDT_Information"
	),
	new QName (
	    "InformationElements",
	    "SSDT-Information"
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
				"S_Field"
			    ),
			    new QName (
				"InformationElements",
				"S-Field"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1bit",
					0
				    ),
				    new MemberListElement (
					"e2bits",
					1
				    )
				}
			    ),
			    0,
			    S_Field.e1bit
			)
		    ),
		    "s-Field",
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
				"CodeWordSet"
			    ),
			    new QName (
				"InformationElements",
				"CodeWordSet"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"longCWS",
					0
				    ),
				    new MemberListElement (
					"mediumCWS",
					1
				    ),
				    new MemberListElement (
					"shortCWS",
					2
				    ),
				    new MemberListElement (
					"ssdtOff",
					3
				    )
				}
			    ),
			    0,
			    CodeWordSet.longCWS
			)
		    ),
		    "codeWordSet",
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
     * Get the type descriptor (TypeInfo) of 'this' SSDT_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SSDT_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SSDT_Information
