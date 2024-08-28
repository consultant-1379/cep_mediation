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
 * Define the ASN1 Type UE_Positioning_GANSS_Data_Bit_Assistance from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_Data_Bit_Assistance extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_Data_Bit_Assistance()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_Data_Bit_Assistance(INTEGER ganss_tod, 
		    DataBitAssistanceList dataBitAssistanceList)
    {
	setGanss_tod(ganss_tod);
	setDataBitAssistanceList(dataBitAssistanceList);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GANSS_Data_Bit_Assistance(long ganss_tod, 
		    DataBitAssistanceList dataBitAssistanceList)
    {
	this(new INTEGER(ganss_tod), dataBitAssistanceList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new DataBitAssistanceList();
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
		return new DataBitAssistanceList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganss_tod"
    public long getGanss_tod()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanss_tod(long ganss_tod)
    {
	setGanss_tod(new INTEGER(ganss_tod));
    }
    
    public void setGanss_tod(INTEGER ganss_tod)
    {
	mComponents[0] = ganss_tod;
    }
    
    
    // Methods for field "dataBitAssistanceList"
    public DataBitAssistanceList getDataBitAssistanceList()
    {
	return (DataBitAssistanceList)mComponents[1];
    }
    
    public void setDataBitAssistanceList(DataBitAssistanceList dataBitAssistanceList)
    {
	mComponents[1] = dataBitAssistanceList;
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
	    "UE_Positioning_GANSS_Data_Bit_Assistance"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-Data-Bit-Assistance"
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
				    new com.oss.asn1.INTEGER(59),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(59)
			    ),
			    null
			)
		    ),
		    "ganss-tod",
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
				"DataBitAssistanceList"
			    ),
			    new QName (
				"InformationElements",
				"DataBitAssistanceList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DataBitAssistanceSat"
				)
			    )
			)
		    ),
		    "dataBitAssistanceList",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_Data_Bit_Assistance object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_Data_Bit_Assistance object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_Data_Bit_Assistance
