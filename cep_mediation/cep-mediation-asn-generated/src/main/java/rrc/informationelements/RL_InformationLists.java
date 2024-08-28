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
 * Define the ASN1 Type RL_InformationLists from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RL_InformationLists extends Sequence {
    
    /**
     * The default constructor.
     */
    public RL_InformationLists()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RL_InformationLists(RL_AdditionInfoList rl_AdditionInfoList, 
		    RL_RemovalInformationList rL_RemovalInformationList)
    {
	setRl_AdditionInfoList(rl_AdditionInfoList);
	setRL_RemovalInformationList(rL_RemovalInformationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RL_AdditionInfoList();
	mComponents[1] = new RL_RemovalInformationList();
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
		return new RL_AdditionInfoList();
	    case 1:
		return new RL_RemovalInformationList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rl_AdditionInfoList"
    public RL_AdditionInfoList getRl_AdditionInfoList()
    {
	return (RL_AdditionInfoList)mComponents[0];
    }
    
    public void setRl_AdditionInfoList(RL_AdditionInfoList rl_AdditionInfoList)
    {
	mComponents[0] = rl_AdditionInfoList;
    }
    
    public boolean hasRl_AdditionInfoList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRl_AdditionInfoList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "rL_RemovalInformationList"
    public RL_RemovalInformationList getRL_RemovalInformationList()
    {
	return (RL_RemovalInformationList)mComponents[1];
    }
    
    public void setRL_RemovalInformationList(RL_RemovalInformationList rL_RemovalInformationList)
    {
	mComponents[1] = rL_RemovalInformationList;
    }
    
    public boolean hasRL_RemovalInformationList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRL_RemovalInformationList()
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
	    "RL_InformationLists"
	),
	new QName (
	    "InformationElements",
	    "RL-InformationLists"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RL_AdditionInfoList"
			    ),
			    new QName (
				"InformationElements",
				"RL-AdditionInfoList"
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
				    "PrimaryCPICH_Info"
				)
			    )
			)
		    ),
		    "rl-AdditionInfoList",
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
				"RL_RemovalInformationList"
			    ),
			    new QName (
				"InformationElements",
				"RL-RemovalInformationList"
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
				    "PrimaryCPICH_Info"
				)
			    )
			)
		    ),
		    "rL-RemovalInformationList",
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
     * Get the type descriptor (TypeInfo) of 'this' RL_InformationLists object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RL_InformationLists object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RL_InformationLists
