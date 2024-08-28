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
 * Define the ASN1 Type UCSM_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UCSM_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public UCSM_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UCSM_Info(MinimumSpreadingFactor minimumSpreadingFactor, 
		    NF_Max nf_Max, 
		    ChannelReqParamsForUCSM channelReqParamsForUCSM)
    {
	setMinimumSpreadingFactor(minimumSpreadingFactor);
	setNf_Max(nf_Max);
	setChannelReqParamsForUCSM(channelReqParamsForUCSM);
    }
    
    public void initComponents()
    {
	mComponents[0] = MinimumSpreadingFactor.sf4;
	mComponents[1] = new NF_Max();
	mComponents[2] = new ChannelReqParamsForUCSM();
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
		return MinimumSpreadingFactor.sf4;
	    case 1:
		return new NF_Max();
	    case 2:
		return new ChannelReqParamsForUCSM();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "minimumSpreadingFactor"
    public MinimumSpreadingFactor getMinimumSpreadingFactor()
    {
	return (MinimumSpreadingFactor)mComponents[0];
    }
    
    public void setMinimumSpreadingFactor(MinimumSpreadingFactor minimumSpreadingFactor)
    {
	mComponents[0] = minimumSpreadingFactor;
    }
    
    
    // Methods for field "nf_Max"
    public NF_Max getNf_Max()
    {
	return (NF_Max)mComponents[1];
    }
    
    public void setNf_Max(NF_Max nf_Max)
    {
	mComponents[1] = nf_Max;
    }
    
    
    // Methods for field "channelReqParamsForUCSM"
    public ChannelReqParamsForUCSM getChannelReqParamsForUCSM()
    {
	return (ChannelReqParamsForUCSM)mComponents[2];
    }
    
    public void setChannelReqParamsForUCSM(ChannelReqParamsForUCSM channelReqParamsForUCSM)
    {
	mComponents[2] = channelReqParamsForUCSM;
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
	    "UCSM_Info"
	),
	new QName (
	    "InformationElements",
	    "UCSM-Info"
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
				"MinimumSpreadingFactor"
			    ),
			    new QName (
				"InformationElements",
				"MinimumSpreadingFactor"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sf4",
					0
				    ),
				    new MemberListElement (
					"sf8",
					1
				    ),
				    new MemberListElement (
					"sf16",
					2
				    ),
				    new MemberListElement (
					"sf32",
					3
				    ),
				    new MemberListElement (
					"sf64",
					4
				    ),
				    new MemberListElement (
					"sf128",
					5
				    ),
				    new MemberListElement (
					"sf256",
					6
				    )
				}
			    ),
			    0,
			    MinimumSpreadingFactor.sf4
			)
		    ),
		    "minimumSpreadingFactor",
		    0,
		    2,
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
				"rrc.informationelements",
				"NF_Max"
			    ),
			    new QName (
				"InformationElements",
				"NF-Max"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new NF_Max(1), 
				    new NF_Max(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "nf-Max",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ChannelReqParamsForUCSM"
			    ),
			    new QName (
				"InformationElements",
				"ChannelReqParamsForUCSM"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ChannelReqParamsForUCSM"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ChannelReqParamsForUCSM"
				)
			    ),
			    0
			)
		    ),
		    "channelReqParamsForUCSM",
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
     * Get the type descriptor (TypeInfo) of 'this' UCSM_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UCSM_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UCSM_Info
