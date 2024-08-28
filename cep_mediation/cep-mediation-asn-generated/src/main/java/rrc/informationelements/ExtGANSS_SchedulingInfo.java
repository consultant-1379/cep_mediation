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
 * Define the ASN1 Type ExtGANSS_SchedulingInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ExtGANSS_SchedulingInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public ExtGANSS_SchedulingInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ExtGANSS_SchedulingInfo(SIB_TypeExtGANSS extensionGANSS_SIBType, 
		    SchedulingInformation schedulingInfo, 
		    ValueTagInfo valueTagInfo)
    {
	setExtensionGANSS_SIBType(extensionGANSS_SIBType);
	setSchedulingInfo(schedulingInfo);
	setValueTagInfo(valueTagInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SIB_TypeExtGANSS();
	mComponents[1] = new SchedulingInformation();
	mComponents[2] = new ValueTagInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new SIB_TypeExtGANSS();
	    case 1:
		return new SchedulingInformation();
	    case 2:
		return new ValueTagInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "extensionGANSS_SIBType"
    public SIB_TypeExtGANSS getExtensionGANSS_SIBType()
    {
	return (SIB_TypeExtGANSS)mComponents[0];
    }
    
    public void setExtensionGANSS_SIBType(SIB_TypeExtGANSS extensionGANSS_SIBType)
    {
	mComponents[0] = extensionGANSS_SIBType;
    }
    
    
    // Methods for field "schedulingInfo"
    public SchedulingInformation getSchedulingInfo()
    {
	return (SchedulingInformation)mComponents[1];
    }
    
    public void setSchedulingInfo(SchedulingInformation schedulingInfo)
    {
	mComponents[1] = schedulingInfo;
    }
    
    
    // Methods for field "valueTagInfo"
    public ValueTagInfo getValueTagInfo()
    {
	return (ValueTagInfo)mComponents[2];
    }
    
    public void setValueTagInfo(ValueTagInfo valueTagInfo)
    {
	mComponents[2] = valueTagInfo;
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
	    "ExtGANSS_SchedulingInfo"
	),
	new QName (
	    "InformationElements",
	    "ExtGANSS-SchedulingInfo"
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
				"SIB_TypeExtGANSS"
			    ),
			    new QName (
				"InformationElements",
				"SIB-TypeExtGANSS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SIB_TypeExtGANSS"
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
				    new TagDecoderElement((short)0x800f, 15)
				}
			    )
			)
		    ),
		    "extensionGANSS-SIBType",
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
		    "schedulingInfo",
		    1,
		    2,
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
				"ValueTagInfo"
			    ),
			    new QName (
				"InformationElements",
				"ValueTagInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ValueTagInfo"
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
		    "valueTagInfo",
		    2,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ExtGANSS_SchedulingInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ExtGANSS_SchedulingInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ExtGANSS_SchedulingInfo
