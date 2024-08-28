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
 * Define the ASN1 Type SplitTFCI_Signalling from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SplitTFCI_Signalling extends Sequence {
    
    /**
     * The default constructor.
     */
    public SplitTFCI_Signalling()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SplitTFCI_Signalling(SplitType splitType, 
		    INTEGER tfci_Field2_Length, 
		    ExplicitTFCS_Configuration tfci_Field1_Information, 
		    TFCI_Field2_Information tfci_Field2_Information)
    {
	setSplitType(splitType);
	setTfci_Field2_Length(tfci_Field2_Length);
	setTfci_Field1_Information(tfci_Field1_Information);
	setTfci_Field2_Information(tfci_Field2_Information);
    }
    
    /**
     * Construct with components.
     */
    public SplitTFCI_Signalling(SplitType splitType, long tfci_Field2_Length, 
		    ExplicitTFCS_Configuration tfci_Field1_Information, 
		    TFCI_Field2_Information tfci_Field2_Information)
    {
	this(splitType, new INTEGER(tfci_Field2_Length), 
	     tfci_Field1_Information, tfci_Field2_Information);
    }
    
    public void initComponents()
    {
	mComponents[0] = SplitType.hardSplit;
	mComponents[1] = new INTEGER();
	mComponents[2] = new ExplicitTFCS_Configuration();
	mComponents[3] = new TFCI_Field2_Information();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return SplitType.hardSplit;
	    case 1:
		return new INTEGER();
	    case 2:
		return new ExplicitTFCS_Configuration();
	    case 3:
		return new TFCI_Field2_Information();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "splitType"
    public SplitType getSplitType()
    {
	return (SplitType)mComponents[0];
    }
    
    public void setSplitType(SplitType splitType)
    {
	mComponents[0] = splitType;
    }
    
    public boolean hasSplitType()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSplitType()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "tfci_Field2_Length"
    public long getTfci_Field2_Length()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setTfci_Field2_Length(long tfci_Field2_Length)
    {
	setTfci_Field2_Length(new INTEGER(tfci_Field2_Length));
    }
    
    public void setTfci_Field2_Length(INTEGER tfci_Field2_Length)
    {
	mComponents[1] = tfci_Field2_Length;
    }
    
    public boolean hasTfci_Field2_Length()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTfci_Field2_Length()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "tfci_Field1_Information"
    public ExplicitTFCS_Configuration getTfci_Field1_Information()
    {
	return (ExplicitTFCS_Configuration)mComponents[2];
    }
    
    public void setTfci_Field1_Information(ExplicitTFCS_Configuration tfci_Field1_Information)
    {
	mComponents[2] = tfci_Field1_Information;
    }
    
    public boolean hasTfci_Field1_Information()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTfci_Field1_Information()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "tfci_Field2_Information"
    public TFCI_Field2_Information getTfci_Field2_Information()
    {
	return (TFCI_Field2_Information)mComponents[3];
    }
    
    public void setTfci_Field2_Information(TFCI_Field2_Information tfci_Field2_Information)
    {
	mComponents[3] = tfci_Field2_Information;
    }
    
    public boolean hasTfci_Field2_Information()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTfci_Field2_Information()
    {
	setComponentAbsent(3);
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
	    "SplitTFCI_Signalling"
	),
	new QName (
	    "InformationElements",
	    "SplitTFCI-Signalling"
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
				"SplitType"
			    ),
			    new QName (
				"InformationElements",
				"SplitType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"hardSplit",
					0
				    ),
				    new MemberListElement (
					"logicalSplit",
					1
				    )
				}
			    ),
			    0,
			    SplitType.hardSplit
			)
		    ),
		    "splitType",
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "tfci-Field2-Length",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ExplicitTFCS_Configuration"
			    ),
			    new QName (
				"InformationElements",
				"ExplicitTFCS-Configuration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ExplicitTFCS_Configuration"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    )
			)
		    ),
		    "tfci-Field1-Information",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCI_Field2_Information"
			    ),
			    new QName (
				"InformationElements",
				"TFCI-Field2-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCI_Field2_Information"
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
		    "tfci-Field2-Information",
		    3,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SplitTFCI_Signalling object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SplitTFCI_Signalling object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SplitTFCI_Signalling
