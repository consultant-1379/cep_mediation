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
 * Define the ASN1 Type TrafficVolumeMeasuredResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TrafficVolumeMeasuredResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public TrafficVolumeMeasuredResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrafficVolumeMeasuredResults(RB_Identity rb_Identity, 
		    RLC_BuffersPayload rlc_BuffersPayload, 
		    AverageRLC_BufferPayload averageRLC_BufferPayload, 
		    VarianceOfRLC_BufferPayload varianceOfRLC_BufferPayload)
    {
	setRb_Identity(rb_Identity);
	setRlc_BuffersPayload(rlc_BuffersPayload);
	setAverageRLC_BufferPayload(averageRLC_BufferPayload);
	setVarianceOfRLC_BufferPayload(varianceOfRLC_BufferPayload);
    }
    
    /**
     * Construct with required components.
     */
    public TrafficVolumeMeasuredResults(RB_Identity rb_Identity)
    {
	setRb_Identity(rb_Identity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RB_Identity();
	mComponents[1] = RLC_BuffersPayload.pl0;
	mComponents[2] = AverageRLC_BufferPayload.pla0;
	mComponents[3] = VarianceOfRLC_BufferPayload.plv0;
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
		return new RB_Identity();
	    case 1:
		return RLC_BuffersPayload.pl0;
	    case 2:
		return AverageRLC_BufferPayload.pla0;
	    case 3:
		return VarianceOfRLC_BufferPayload.plv0;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rb_Identity"
    public RB_Identity getRb_Identity()
    {
	return (RB_Identity)mComponents[0];
    }
    
    public void setRb_Identity(RB_Identity rb_Identity)
    {
	mComponents[0] = rb_Identity;
    }
    
    
    // Methods for field "rlc_BuffersPayload"
    public RLC_BuffersPayload getRlc_BuffersPayload()
    {
	return (RLC_BuffersPayload)mComponents[1];
    }
    
    public void setRlc_BuffersPayload(RLC_BuffersPayload rlc_BuffersPayload)
    {
	mComponents[1] = rlc_BuffersPayload;
    }
    
    public boolean hasRlc_BuffersPayload()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRlc_BuffersPayload()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "averageRLC_BufferPayload"
    public AverageRLC_BufferPayload getAverageRLC_BufferPayload()
    {
	return (AverageRLC_BufferPayload)mComponents[2];
    }
    
    public void setAverageRLC_BufferPayload(AverageRLC_BufferPayload averageRLC_BufferPayload)
    {
	mComponents[2] = averageRLC_BufferPayload;
    }
    
    public boolean hasAverageRLC_BufferPayload()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAverageRLC_BufferPayload()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "varianceOfRLC_BufferPayload"
    public VarianceOfRLC_BufferPayload getVarianceOfRLC_BufferPayload()
    {
	return (VarianceOfRLC_BufferPayload)mComponents[3];
    }
    
    public void setVarianceOfRLC_BufferPayload(VarianceOfRLC_BufferPayload varianceOfRLC_BufferPayload)
    {
	mComponents[3] = varianceOfRLC_BufferPayload;
    }
    
    public boolean hasVarianceOfRLC_BufferPayload()
    {
	return componentIsPresent(3);
    }
    
    public void deleteVarianceOfRLC_BufferPayload()
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
	    "TrafficVolumeMeasuredResults"
	),
	new QName (
	    "InformationElements",
	    "TrafficVolumeMeasuredResults"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_Identity"
			    ),
			    new QName (
				"InformationElements",
				"RB-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RB_Identity(1), 
				    new RB_Identity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "rb-Identity",
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
				"RLC_BuffersPayload"
			    ),
			    new QName (
				"InformationElements",
				"RLC-BuffersPayload"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pl0",
					0
				    ),
				    new MemberListElement (
					"pl4",
					1
				    ),
				    new MemberListElement (
					"pl8",
					2
				    ),
				    new MemberListElement (
					"pl16",
					3
				    ),
				    new MemberListElement (
					"pl32",
					4
				    ),
				    new MemberListElement (
					"pl64",
					5
				    ),
				    new MemberListElement (
					"pl128",
					6
				    ),
				    new MemberListElement (
					"pl256",
					7
				    ),
				    new MemberListElement (
					"pl512",
					8
				    ),
				    new MemberListElement (
					"pl1024",
					9
				    ),
				    new MemberListElement (
					"pl2k",
					10
				    ),
				    new MemberListElement (
					"pl4k",
					11
				    ),
				    new MemberListElement (
					"pl8k",
					12
				    ),
				    new MemberListElement (
					"pl16k",
					13
				    ),
				    new MemberListElement (
					"pl32k",
					14
				    ),
				    new MemberListElement (
					"pl64k",
					15
				    ),
				    new MemberListElement (
					"pl128k",
					16
				    ),
				    new MemberListElement (
					"pl256k",
					17
				    ),
				    new MemberListElement (
					"pl512k",
					18
				    ),
				    new MemberListElement (
					"pl1024k",
					19
				    ),
				    new MemberListElement (
					"spare12",
					20
				    ),
				    new MemberListElement (
					"spare11",
					21
				    ),
				    new MemberListElement (
					"spare10",
					22
				    ),
				    new MemberListElement (
					"spare9",
					23
				    ),
				    new MemberListElement (
					"spare8",
					24
				    ),
				    new MemberListElement (
					"spare7",
					25
				    ),
				    new MemberListElement (
					"spare6",
					26
				    ),
				    new MemberListElement (
					"spare5",
					27
				    ),
				    new MemberListElement (
					"spare4",
					28
				    ),
				    new MemberListElement (
					"spare3",
					29
				    ),
				    new MemberListElement (
					"spare2",
					30
				    ),
				    new MemberListElement (
					"spare1",
					31
				    )
				}
			    ),
			    0,
			    RLC_BuffersPayload.pl0
			)
		    ),
		    "rlc-BuffersPayload",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AverageRLC_BufferPayload"
			    ),
			    new QName (
				"InformationElements",
				"AverageRLC-BufferPayload"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pla0",
					0
				    ),
				    new MemberListElement (
					"pla4",
					1
				    ),
				    new MemberListElement (
					"pla8",
					2
				    ),
				    new MemberListElement (
					"pla16",
					3
				    ),
				    new MemberListElement (
					"pla32",
					4
				    ),
				    new MemberListElement (
					"pla64",
					5
				    ),
				    new MemberListElement (
					"pla128",
					6
				    ),
				    new MemberListElement (
					"pla256",
					7
				    ),
				    new MemberListElement (
					"pla512",
					8
				    ),
				    new MemberListElement (
					"pla1024",
					9
				    ),
				    new MemberListElement (
					"pla2k",
					10
				    ),
				    new MemberListElement (
					"pla4k",
					11
				    ),
				    new MemberListElement (
					"pla8k",
					12
				    ),
				    new MemberListElement (
					"pla16k",
					13
				    ),
				    new MemberListElement (
					"pla32k",
					14
				    ),
				    new MemberListElement (
					"pla64k",
					15
				    ),
				    new MemberListElement (
					"pla128k",
					16
				    ),
				    new MemberListElement (
					"pla256k",
					17
				    ),
				    new MemberListElement (
					"pla512k",
					18
				    ),
				    new MemberListElement (
					"pla1024k",
					19
				    ),
				    new MemberListElement (
					"spare12",
					20
				    ),
				    new MemberListElement (
					"spare11",
					21
				    ),
				    new MemberListElement (
					"spare10",
					22
				    ),
				    new MemberListElement (
					"spare9",
					23
				    ),
				    new MemberListElement (
					"spare8",
					24
				    ),
				    new MemberListElement (
					"spare7",
					25
				    ),
				    new MemberListElement (
					"spare6",
					26
				    ),
				    new MemberListElement (
					"spare5",
					27
				    ),
				    new MemberListElement (
					"spare4",
					28
				    ),
				    new MemberListElement (
					"spare3",
					29
				    ),
				    new MemberListElement (
					"spare2",
					30
				    ),
				    new MemberListElement (
					"spare1",
					31
				    )
				}
			    ),
			    0,
			    AverageRLC_BufferPayload.pla0
			)
		    ),
		    "averageRLC-BufferPayload",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"VarianceOfRLC_BufferPayload"
			    ),
			    new QName (
				"InformationElements",
				"VarianceOfRLC-BufferPayload"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"plv0",
					0
				    ),
				    new MemberListElement (
					"plv4",
					1
				    ),
				    new MemberListElement (
					"plv8",
					2
				    ),
				    new MemberListElement (
					"plv16",
					3
				    ),
				    new MemberListElement (
					"plv32",
					4
				    ),
				    new MemberListElement (
					"plv64",
					5
				    ),
				    new MemberListElement (
					"plv128",
					6
				    ),
				    new MemberListElement (
					"plv256",
					7
				    ),
				    new MemberListElement (
					"plv512",
					8
				    ),
				    new MemberListElement (
					"plv1024",
					9
				    ),
				    new MemberListElement (
					"plv2k",
					10
				    ),
				    new MemberListElement (
					"plv4k",
					11
				    ),
				    new MemberListElement (
					"plv8k",
					12
				    ),
				    new MemberListElement (
					"plv16k",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    VarianceOfRLC_BufferPayload.plv0
			)
		    ),
		    "varianceOfRLC-BufferPayload",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' TrafficVolumeMeasuredResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrafficVolumeMeasuredResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrafficVolumeMeasuredResults
