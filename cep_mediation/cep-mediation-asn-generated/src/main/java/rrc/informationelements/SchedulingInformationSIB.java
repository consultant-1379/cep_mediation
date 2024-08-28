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
 * Define the ASN1 Type SchedulingInformationSIB from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SchedulingInformationSIB extends Sequence {
    
    /**
     * The default constructor.
     */
    public SchedulingInformationSIB()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SchedulingInformationSIB(SIB_TypeAndTag sib_Type, 
		    SchedulingInformation scheduling)
    {
	setSib_Type(sib_Type);
	setScheduling(scheduling);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SIB_TypeAndTag();
	mComponents[1] = new SchedulingInformation();
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
		return new SIB_TypeAndTag();
	    case 1:
		return new SchedulingInformation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sib_Type"
    public SIB_TypeAndTag getSib_Type()
    {
	return (SIB_TypeAndTag)mComponents[0];
    }
    
    public void setSib_Type(SIB_TypeAndTag sib_Type)
    {
	mComponents[0] = sib_Type;
    }
    
    
    // Methods for field "scheduling"
    public SchedulingInformation getScheduling()
    {
	return (SchedulingInformation)mComponents[1];
    }
    
    public void setScheduling(SchedulingInformation scheduling)
    {
	mComponents[1] = scheduling;
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
	    "SchedulingInformationSIB"
	),
	new QName (
	    "InformationElements",
	    "SchedulingInformationSIB"
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
				"SIB_TypeAndTag"
			    ),
			    new QName (
				"InformationElements",
				"SIB-TypeAndTag"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SIB_TypeAndTag"
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
		    "sib-Type",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SchedulingInformation"
			    ),
			    new QName (
				"InformationElements",
				"SchedulingInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SchedulingInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SchedulingInformation"
				)
			    ),
			    0
			)
		    ),
		    "scheduling",
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
     * Get the type descriptor (TypeInfo) of 'this' SchedulingInformationSIB object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SchedulingInformationSIB object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SchedulingInformationSIB
