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
 * Define the ASN1 Type UL_RFC3095_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_RFC3095_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_RFC3095_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_RFC3095_r4(CID_InclusionInfo_r4 dummy1, INTEGER max_CID, 
		    ROHC_PacketSizeList_r4 dummy)
    {
	setDummy1(dummy1);
	setMax_CID(max_CID);
	setDummy(dummy);
    }
    
    /**
     * Construct with components.
     */
    public UL_RFC3095_r4(CID_InclusionInfo_r4 dummy1, long max_CID, 
		    ROHC_PacketSizeList_r4 dummy)
    {
	this(dummy1, new INTEGER(max_CID), dummy);
    }
    
    /**
     * Construct with required components.
     */
    public UL_RFC3095_r4(CID_InclusionInfo_r4 dummy1, 
		    ROHC_PacketSizeList_r4 dummy)
    {
	setDummy1(dummy1);
	setDummy(dummy);
    }
    
    public void initComponents()
    {
	mComponents[0] = CID_InclusionInfo_r4.pdcp_Header;
	mComponents[1] = new INTEGER();
	mComponents[2] = new ROHC_PacketSizeList_r4();
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
		return CID_InclusionInfo_r4.pdcp_Header;
	    case 1:
		return new INTEGER();
	    case 2:
		return new ROHC_PacketSizeList_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final com.oss.asn1.INTEGER max_CID__default = 
	new com.oss.asn1.INTEGER(15);
    
    // Methods for field "dummy1"
    public CID_InclusionInfo_r4 getDummy1()
    {
	return (CID_InclusionInfo_r4)mComponents[0];
    }
    
    public void setDummy1(CID_InclusionInfo_r4 dummy1)
    {
	mComponents[0] = dummy1;
    }
    
    
    // Methods for field "max_CID"
    public long getMax_CID()
    {
	if (hasMax_CID())
	    return ((INTEGER)mComponents[1]).longValue();
	else
	    return max_CID__default.longValue();
    }
    
    public void setMax_CID(long max_CID)
    {
	setMax_CID(new INTEGER(max_CID));
    }
    
    public void setMax_CID(INTEGER max_CID)
    {
	mComponents[1] = max_CID;
    }
    
    public void setMax_CIDToDefault()
    {
	setMax_CID(max_CID__default);
    }
    
    public boolean hasDefaultMax_CID()
    {
	return true;
    }
    
    public boolean hasMax_CID()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMax_CID()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dummy"
    public ROHC_PacketSizeList_r4 getDummy()
    {
	return (ROHC_PacketSizeList_r4)mComponents[2];
    }
    
    public void setDummy(ROHC_PacketSizeList_r4 dummy)
    {
	mComponents[2] = dummy;
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
	    "UL_RFC3095_r4"
	),
	new QName (
	    "InformationElements",
	    "UL-RFC3095-r4"
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
				"CID_InclusionInfo_r4"
			    ),
			    new QName (
				"InformationElements",
				"CID-InclusionInfo-r4"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pdcp-Header",
					0
				    ),
				    new MemberListElement (
					"rfc3095-PacketFormat",
					1
				    )
				}
			    ),
			    0,
			    CID_InclusionInfo_r4.pdcp_Header
			)
		    ),
		    "dummy1",
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
				    new com.oss.asn1.INTEGER(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "max-CID",
		    1,
		    3,
		    max_CID__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ROHC_PacketSizeList_r4"
			    ),
			    new QName (
				"InformationElements",
				"ROHC-PacketSizeList-r4"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "ROHC_PacketSize_r4"
				)
			    )
			)
		    ),
		    "dummy",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' UL_RFC3095_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_RFC3095_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_RFC3095_r4
