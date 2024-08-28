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
 * Define the ASN1 Type GroupReleaseInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GroupReleaseInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public GroupReleaseInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GroupReleaseInformation(U_RNTI_Group uRNTI_Group)
    {
	setURNTI_Group(uRNTI_Group);
    }
    
    public void initComponents()
    {
	mComponents[0] = new U_RNTI_Group();
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
		return new U_RNTI_Group();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "uRNTI_Group"
    public U_RNTI_Group getURNTI_Group()
    {
	return (U_RNTI_Group)mComponents[0];
    }
    
    public void setURNTI_Group(U_RNTI_Group uRNTI_Group)
    {
	mComponents[0] = uRNTI_Group;
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
	    "GroupReleaseInformation"
	),
	new QName (
	    "InformationElements",
	    "GroupReleaseInformation"
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
				"U_RNTI_Group"
			    ),
			    new QName (
				"InformationElements",
				"U-RNTI-Group"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI_Group"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7),
				    new TagDecoderElement((short)0x8008, 8),
				    new TagDecoderElement((short)0x8009, 9),
				    new TagDecoderElement((short)0x800a, 10),
				    new TagDecoderElement((short)0x800b, 11),
				    new TagDecoderElement((short)0x800c, 12),
				    new TagDecoderElement((short)0x800d, 13),
				    new TagDecoderElement((short)0x800e, 14),
				    new TagDecoderElement((short)0x800f, 15),
				    new TagDecoderElement((short)0x8010, 16),
				    new TagDecoderElement((short)0x8011, 17),
				    new TagDecoderElement((short)0x8012, 18),
				    new TagDecoderElement((short)0x8013, 19),
				    new TagDecoderElement((short)0x8014, 20),
				    new TagDecoderElement((short)0x8015, 21),
				    new TagDecoderElement((short)0x8016, 22),
				    new TagDecoderElement((short)0x8017, 23),
				    new TagDecoderElement((short)0x8018, 24),
				    new TagDecoderElement((short)0x8019, 25),
				    new TagDecoderElement((short)0x801a, 26),
				    new TagDecoderElement((short)0x801b, 27),
				    new TagDecoderElement((short)0x801c, 28),
				    new TagDecoderElement((short)0x801d, 29),
				    new TagDecoderElement((short)0x801e, 30),
				    new TagDecoderElement((short)0x801f, 31)
				}
			    )
			)
		    ),
		    "uRNTI-Group",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GroupReleaseInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GroupReleaseInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GroupReleaseInformation
