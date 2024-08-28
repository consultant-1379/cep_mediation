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
 * Define the ASN1 Type RB_MappingOption from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RB_MappingOption extends Sequence {
    
    /**
     * The default constructor.
     */
    public RB_MappingOption()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RB_MappingOption(UL_LogicalChannelMappings ul_LogicalChannelMappings, 
		    DL_LogicalChannelMappingList dl_LogicalChannelMappingList)
    {
	setUl_LogicalChannelMappings(ul_LogicalChannelMappings);
	setDl_LogicalChannelMappingList(dl_LogicalChannelMappingList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_LogicalChannelMappings();
	mComponents[1] = new DL_LogicalChannelMappingList();
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
		return new UL_LogicalChannelMappings();
	    case 1:
		return new DL_LogicalChannelMappingList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_LogicalChannelMappings"
    public UL_LogicalChannelMappings getUl_LogicalChannelMappings()
    {
	return (UL_LogicalChannelMappings)mComponents[0];
    }
    
    public void setUl_LogicalChannelMappings(UL_LogicalChannelMappings ul_LogicalChannelMappings)
    {
	mComponents[0] = ul_LogicalChannelMappings;
    }
    
    public boolean hasUl_LogicalChannelMappings()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_LogicalChannelMappings()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dl_LogicalChannelMappingList"
    public DL_LogicalChannelMappingList getDl_LogicalChannelMappingList()
    {
	return (DL_LogicalChannelMappingList)mComponents[1];
    }
    
    public void setDl_LogicalChannelMappingList(DL_LogicalChannelMappingList dl_LogicalChannelMappingList)
    {
	mComponents[1] = dl_LogicalChannelMappingList;
    }
    
    public boolean hasDl_LogicalChannelMappingList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_LogicalChannelMappingList()
    {
	setComponentAbsent(1);
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
	    "RB_MappingOption"
	),
	new QName (
	    "InformationElements",
	    "RB-MappingOption"
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
				"UL_LogicalChannelMappings"
			    ),
			    new QName (
				"InformationElements",
				"UL-LogicalChannelMappings"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_LogicalChannelMappings"
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
		    "ul-LogicalChannelMappings",
		    0,
		    3,
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
				"DL_LogicalChannelMappingList"
			    ),
			    new QName (
				"InformationElements",
				"DL-LogicalChannelMappingList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(2),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(2)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DL_LogicalChannelMapping"
				)
			    )
			)
		    ),
		    "dl-LogicalChannelMappingList",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' RB_MappingOption object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RB_MappingOption object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RB_MappingOption
