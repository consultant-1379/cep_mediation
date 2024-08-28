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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CodeChangeStatus from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class CodeChangeStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public CodeChangeStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CodeChangeStatus(rrc.informationelements.PrimaryCPICH_Info primaryCPICH_Info, 
		    rrc.informationelements.ScramblingCodeChange scramblingCodeChange)
    {
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setScramblingCodeChange(scramblingCodeChange);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.PrimaryCPICH_Info();
	mComponents[1] = rrc.informationelements.ScramblingCodeChange.codeChange;
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
		return new rrc.informationelements.PrimaryCPICH_Info();
	    case 1:
		return rrc.informationelements.ScramblingCodeChange.codeChange;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryCPICH_Info"
    public rrc.informationelements.PrimaryCPICH_Info getPrimaryCPICH_Info()
    {
	return (rrc.informationelements.PrimaryCPICH_Info)mComponents[0];
    }
    
    public void setPrimaryCPICH_Info(rrc.informationelements.PrimaryCPICH_Info primaryCPICH_Info)
    {
	mComponents[0] = primaryCPICH_Info;
    }
    
    
    // Methods for field "scramblingCodeChange"
    public rrc.informationelements.ScramblingCodeChange getScramblingCodeChange()
    {
	return (rrc.informationelements.ScramblingCodeChange)mComponents[1];
    }
    
    public void setScramblingCodeChange(rrc.informationelements.ScramblingCodeChange scramblingCodeChange)
    {
	mComponents[1] = scramblingCodeChange;
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
	    "rrc.internode_definitions",
	    "CodeChangeStatus"
	),
	new QName (
	    "Internode-definitions",
	    "CodeChangeStatus"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PrimaryCPICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCPICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0
			)
		    ),
		    "primaryCPICH-Info",
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
				"ScramblingCodeChange"
			    ),
			    new QName (
				"InformationElements",
				"ScramblingCodeChange"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"codeChange",
					0
				    ),
				    new MemberListElement (
					"noCodeChange",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.ScramblingCodeChange.codeChange
			)
		    ),
		    "scramblingCodeChange",
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
     * Get the type descriptor (TypeInfo) of 'this' CodeChangeStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CodeChangeStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CodeChangeStatus
