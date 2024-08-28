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
 * Define the ASN1 Type UE_Positioning_DGANSSCorrections_r9 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_DGANSSCorrections_r9 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_DGANSSCorrections_r9()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_DGANSSCorrections_r9(INTEGER dganssreferencetime, 
		    DGANSSInfoList_r9 dganssInfoList)
    {
	setDganssreferencetime(dganssreferencetime);
	setDganssInfoList(dganssInfoList);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_DGANSSCorrections_r9(long dganssreferencetime, 
		    DGANSSInfoList_r9 dganssInfoList)
    {
	this(new INTEGER(dganssreferencetime), dganssInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new DGANSSInfoList_r9();
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
		return new INTEGER();
	    case 1:
		return new DGANSSInfoList_r9();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dganssreferencetime"
    public long getDganssreferencetime()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDganssreferencetime(long dganssreferencetime)
    {
	setDganssreferencetime(new INTEGER(dganssreferencetime));
    }
    
    public void setDganssreferencetime(INTEGER dganssreferencetime)
    {
	mComponents[0] = dganssreferencetime;
    }
    
    
    // Methods for field "dganssInfoList"
    public DGANSSInfoList_r9 getDganssInfoList()
    {
	return (DGANSSInfoList_r9)mComponents[1];
    }
    
    public void setDganssInfoList(DGANSSInfoList_r9 dganssInfoList)
    {
	mComponents[1] = dganssInfoList;
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
	    "UE_Positioning_DGANSSCorrections_r9"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-DGANSSCorrections-r9"
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(119),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(119)
			    ),
			    null
			)
		    ),
		    "dganssreferencetime",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DGANSSInfoList_r9"
			    ),
			    new QName (
				"InformationElements",
				"DGANSSInfoList-r9"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DGANSSInfo_r9"
				)
			    )
			)
		    ),
		    "dganssInfoList",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_DGANSSCorrections_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_DGANSSCorrections_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_DGANSSCorrections_r9
