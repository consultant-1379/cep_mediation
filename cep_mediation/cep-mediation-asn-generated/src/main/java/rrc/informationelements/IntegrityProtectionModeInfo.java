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
 * Define the ASN1 Type IntegrityProtectionModeInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntegrityProtectionModeInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntegrityProtectionModeInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntegrityProtectionModeInfo(IntegrityProtectionModeCommand integrityProtectionModeCommand, 
		    IntegrityProtectionAlgorithm integrityProtectionAlgorithm)
    {
	setIntegrityProtectionModeCommand(integrityProtectionModeCommand);
	setIntegrityProtectionAlgorithm(integrityProtectionAlgorithm);
    }
    
    /**
     * Construct with required components.
     */
    public IntegrityProtectionModeInfo(IntegrityProtectionModeCommand integrityProtectionModeCommand)
    {
	setIntegrityProtectionModeCommand(integrityProtectionModeCommand);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IntegrityProtectionModeCommand();
	mComponents[1] = IntegrityProtectionAlgorithm.uia1;
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
		return new IntegrityProtectionModeCommand();
	    case 1:
		return IntegrityProtectionAlgorithm.uia1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "integrityProtectionModeCommand"
    public IntegrityProtectionModeCommand getIntegrityProtectionModeCommand()
    {
	return (IntegrityProtectionModeCommand)mComponents[0];
    }
    
    public void setIntegrityProtectionModeCommand(IntegrityProtectionModeCommand integrityProtectionModeCommand)
    {
	mComponents[0] = integrityProtectionModeCommand;
    }
    
    
    // Methods for field "integrityProtectionAlgorithm"
    public IntegrityProtectionAlgorithm getIntegrityProtectionAlgorithm()
    {
	return (IntegrityProtectionAlgorithm)mComponents[1];
    }
    
    public void setIntegrityProtectionAlgorithm(IntegrityProtectionAlgorithm integrityProtectionAlgorithm)
    {
	mComponents[1] = integrityProtectionAlgorithm;
    }
    
    public boolean hasIntegrityProtectionAlgorithm()
    {
	return componentIsPresent(1);
    }
    
    public void deleteIntegrityProtectionAlgorithm()
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
	    "IntegrityProtectionModeInfo"
	),
	new QName (
	    "InformationElements",
	    "IntegrityProtectionModeInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntegrityProtectionModeCommand"
			    ),
			    new QName (
				"InformationElements",
				"IntegrityProtectionModeCommand"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtectionModeCommand"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "integrityProtectionModeCommand",
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
				"IntegrityProtectionAlgorithm"
			    ),
			    new QName (
				"InformationElements",
				"IntegrityProtectionAlgorithm"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"uia1",
					0
				    )
				}
			    ),
			    0,
			    IntegrityProtectionAlgorithm.uia1
			)
		    ),
		    "integrityProtectionAlgorithm",
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
     * Get the type descriptor (TypeInfo) of 'this' IntegrityProtectionModeInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntegrityProtectionModeInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntegrityProtectionModeInfo
