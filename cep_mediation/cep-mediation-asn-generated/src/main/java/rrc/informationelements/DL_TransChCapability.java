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
 * Define the ASN1 Type DL_TransChCapability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_TransChCapability extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_TransChCapability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_TransChCapability(MaxNoBits maxNoBitsReceived, 
		    MaxNoBits maxConvCodeBitsReceived, 
		    TurboSupport turboDecodingSupport, 
		    MaxSimultaneousTransChsDL maxSimultaneousTransChs, 
		    MaxSimultaneousCCTrCH_Count maxSimultaneousCCTrCH_Count, 
		    MaxTransportBlocksDL maxReceivedTransportBlocks, 
		    MaxNumberOfTFC_DL maxNumberOfTFC, 
		    MaxNumberOfTF maxNumberOfTF)
    {
	setMaxNoBitsReceived(maxNoBitsReceived);
	setMaxConvCodeBitsReceived(maxConvCodeBitsReceived);
	setTurboDecodingSupport(turboDecodingSupport);
	setMaxSimultaneousTransChs(maxSimultaneousTransChs);
	setMaxSimultaneousCCTrCH_Count(maxSimultaneousCCTrCH_Count);
	setMaxReceivedTransportBlocks(maxReceivedTransportBlocks);
	setMaxNumberOfTFC(maxNumberOfTFC);
	setMaxNumberOfTF(maxNumberOfTF);
    }
    
    public void initComponents()
    {
	mComponents[0] = MaxNoBits.b640;
	mComponents[1] = MaxNoBits.b640;
	mComponents[2] = new TurboSupport();
	mComponents[3] = MaxSimultaneousTransChsDL.e4;
	mComponents[4] = new MaxSimultaneousCCTrCH_Count();
	mComponents[5] = MaxTransportBlocksDL.tb4;
	mComponents[6] = MaxNumberOfTFC_DL.tfc16;
	mComponents[7] = MaxNumberOfTF.tf32;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return MaxNoBits.b640;
	    case 1:
		return MaxNoBits.b640;
	    case 2:
		return new TurboSupport();
	    case 3:
		return MaxSimultaneousTransChsDL.e4;
	    case 4:
		return new MaxSimultaneousCCTrCH_Count();
	    case 5:
		return MaxTransportBlocksDL.tb4;
	    case 6:
		return MaxNumberOfTFC_DL.tfc16;
	    case 7:
		return MaxNumberOfTF.tf32;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxNoBitsReceived"
    public MaxNoBits getMaxNoBitsReceived()
    {
	return (MaxNoBits)mComponents[0];
    }
    
    public void setMaxNoBitsReceived(MaxNoBits maxNoBitsReceived)
    {
	mComponents[0] = maxNoBitsReceived;
    }
    
    
    // Methods for field "maxConvCodeBitsReceived"
    public MaxNoBits getMaxConvCodeBitsReceived()
    {
	return (MaxNoBits)mComponents[1];
    }
    
    public void setMaxConvCodeBitsReceived(MaxNoBits maxConvCodeBitsReceived)
    {
	mComponents[1] = maxConvCodeBitsReceived;
    }
    
    
    // Methods for field "turboDecodingSupport"
    public TurboSupport getTurboDecodingSupport()
    {
	return (TurboSupport)mComponents[2];
    }
    
    public void setTurboDecodingSupport(TurboSupport turboDecodingSupport)
    {
	mComponents[2] = turboDecodingSupport;
    }
    
    
    // Methods for field "maxSimultaneousTransChs"
    public MaxSimultaneousTransChsDL getMaxSimultaneousTransChs()
    {
	return (MaxSimultaneousTransChsDL)mComponents[3];
    }
    
    public void setMaxSimultaneousTransChs(MaxSimultaneousTransChsDL maxSimultaneousTransChs)
    {
	mComponents[3] = maxSimultaneousTransChs;
    }
    
    
    // Methods for field "maxSimultaneousCCTrCH_Count"
    public MaxSimultaneousCCTrCH_Count getMaxSimultaneousCCTrCH_Count()
    {
	return (MaxSimultaneousCCTrCH_Count)mComponents[4];
    }
    
    public void setMaxSimultaneousCCTrCH_Count(MaxSimultaneousCCTrCH_Count maxSimultaneousCCTrCH_Count)
    {
	mComponents[4] = maxSimultaneousCCTrCH_Count;
    }
    
    
    // Methods for field "maxReceivedTransportBlocks"
    public MaxTransportBlocksDL getMaxReceivedTransportBlocks()
    {
	return (MaxTransportBlocksDL)mComponents[5];
    }
    
    public void setMaxReceivedTransportBlocks(MaxTransportBlocksDL maxReceivedTransportBlocks)
    {
	mComponents[5] = maxReceivedTransportBlocks;
    }
    
    
    // Methods for field "maxNumberOfTFC"
    public MaxNumberOfTFC_DL getMaxNumberOfTFC()
    {
	return (MaxNumberOfTFC_DL)mComponents[6];
    }
    
    public void setMaxNumberOfTFC(MaxNumberOfTFC_DL maxNumberOfTFC)
    {
	mComponents[6] = maxNumberOfTFC;
    }
    
    
    // Methods for field "maxNumberOfTF"
    public MaxNumberOfTF getMaxNumberOfTF()
    {
	return (MaxNumberOfTF)mComponents[7];
    }
    
    public void setMaxNumberOfTF(MaxNumberOfTF maxNumberOfTF)
    {
	mComponents[7] = maxNumberOfTF;
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
	    "DL_TransChCapability"
	),
	new QName (
	    "InformationElements",
	    "DL-TransChCapability"
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
				"MaxNoBits"
			    ),
			    new QName (
				"InformationElements",
				"MaxNoBits"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"b640",
					0
				    ),
				    new MemberListElement (
					"b1280",
					1
				    ),
				    new MemberListElement (
					"b2560",
					2
				    ),
				    new MemberListElement (
					"b3840",
					3
				    ),
				    new MemberListElement (
					"b5120",
					4
				    ),
				    new MemberListElement (
					"b6400",
					5
				    ),
				    new MemberListElement (
					"b7680",
					6
				    ),
				    new MemberListElement (
					"b8960",
					7
				    ),
				    new MemberListElement (
					"b10240",
					8
				    ),
				    new MemberListElement (
					"b20480",
					9
				    ),
				    new MemberListElement (
					"b40960",
					10
				    ),
				    new MemberListElement (
					"b81920",
					11
				    ),
				    new MemberListElement (
					"b163840",
					12
				    )
				}
			    ),
			    0,
			    MaxNoBits.b640
			)
		    ),
		    "maxNoBitsReceived",
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
				"MaxNoBits"
			    ),
			    new QName (
				"InformationElements",
				"MaxNoBits"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"b640",
					0
				    ),
				    new MemberListElement (
					"b1280",
					1
				    ),
				    new MemberListElement (
					"b2560",
					2
				    ),
				    new MemberListElement (
					"b3840",
					3
				    ),
				    new MemberListElement (
					"b5120",
					4
				    ),
				    new MemberListElement (
					"b6400",
					5
				    ),
				    new MemberListElement (
					"b7680",
					6
				    ),
				    new MemberListElement (
					"b8960",
					7
				    ),
				    new MemberListElement (
					"b10240",
					8
				    ),
				    new MemberListElement (
					"b20480",
					9
				    ),
				    new MemberListElement (
					"b40960",
					10
				    ),
				    new MemberListElement (
					"b81920",
					11
				    ),
				    new MemberListElement (
					"b163840",
					12
				    )
				}
			    ),
			    0,
			    MaxNoBits.b640
			)
		    ),
		    "maxConvCodeBitsReceived",
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
				"TurboSupport"
			    ),
			    new QName (
				"InformationElements",
				"TurboSupport"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TurboSupport"
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
		    "turboDecodingSupport",
		    2,
		    2,
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
				"MaxSimultaneousTransChsDL"
			    ),
			    new QName (
				"InformationElements",
				"MaxSimultaneousTransChsDL"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e4",
					0
				    ),
				    new MemberListElement (
					"e8",
					1
				    ),
				    new MemberListElement (
					"e16",
					2
				    ),
				    new MemberListElement (
					"e32",
					3
				    )
				}
			    ),
			    0,
			    MaxSimultaneousTransChsDL.e4
			)
		    ),
		    "maxSimultaneousTransChs",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxSimultaneousCCTrCH_Count"
			    ),
			    new QName (
				"InformationElements",
				"MaxSimultaneousCCTrCH-Count"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxSimultaneousCCTrCH_Count(1), 
				    new MaxSimultaneousCCTrCH_Count(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "maxSimultaneousCCTrCH-Count",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxTransportBlocksDL"
			    ),
			    new QName (
				"InformationElements",
				"MaxTransportBlocksDL"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tb4",
					0
				    ),
				    new MemberListElement (
					"tb8",
					1
				    ),
				    new MemberListElement (
					"tb16",
					2
				    ),
				    new MemberListElement (
					"tb32",
					3
				    ),
				    new MemberListElement (
					"tb48",
					4
				    ),
				    new MemberListElement (
					"tb64",
					5
				    ),
				    new MemberListElement (
					"tb96",
					6
				    ),
				    new MemberListElement (
					"tb128",
					7
				    ),
				    new MemberListElement (
					"tb256",
					8
				    ),
				    new MemberListElement (
					"tb512",
					9
				    )
				}
			    ),
			    0,
			    MaxTransportBlocksDL.tb4
			)
		    ),
		    "maxReceivedTransportBlocks",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfTFC_DL"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfTFC-DL"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tfc16",
					0
				    ),
				    new MemberListElement (
					"tfc32",
					1
				    ),
				    new MemberListElement (
					"tfc48",
					2
				    ),
				    new MemberListElement (
					"tfc64",
					3
				    ),
				    new MemberListElement (
					"tfc96",
					4
				    ),
				    new MemberListElement (
					"tfc128",
					5
				    ),
				    new MemberListElement (
					"tfc256",
					6
				    ),
				    new MemberListElement (
					"tfc512",
					7
				    ),
				    new MemberListElement (
					"tfc1024",
					8
				    )
				}
			    ),
			    0,
			    MaxNumberOfTFC_DL.tfc16
			)
		    ),
		    "maxNumberOfTFC",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfTF"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfTF"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tf32",
					0
				    ),
				    new MemberListElement (
					"tf64",
					1
				    ),
				    new MemberListElement (
					"tf128",
					2
				    ),
				    new MemberListElement (
					"tf256",
					3
				    ),
				    new MemberListElement (
					"tf512",
					4
				    ),
				    new MemberListElement (
					"tf1024",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfTF.tf32
			)
		    ),
		    "maxNumberOfTF",
		    7,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_TransChCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_TransChCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_TransChCapability
