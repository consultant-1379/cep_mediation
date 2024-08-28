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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type ActiveSetUpdate_v950ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class ActiveSetUpdate_v950ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public ActiveSetUpdate_v950ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ActiveSetUpdate_v950ext_IEs(rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext secondaryCellMimoParameters, 
		    rrc.informationelements.RL_AdditionInformationList_v950ext rl_AdditionInformationList)
    {
	setSecondaryCellMimoParameters(secondaryCellMimoParameters);
	setRl_AdditionInformationList(rl_AdditionInformationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext();
	mComponents[1] = new rrc.informationelements.RL_AdditionInformationList_v950ext();
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
		return new rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext();
	    case 1:
		return new rrc.informationelements.RL_AdditionInformationList_v950ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondaryCellMimoParameters"
    public rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext getSecondaryCellMimoParameters()
    {
	return (rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext)mComponents[0];
    }
    
    public void setSecondaryCellMimoParameters(rrc.informationelements.SecondaryCellMIMOparametersFDD_v950ext secondaryCellMimoParameters)
    {
	mComponents[0] = secondaryCellMimoParameters;
    }
    
    public boolean hasSecondaryCellMimoParameters()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSecondaryCellMimoParameters()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "rl_AdditionInformationList"
    public rrc.informationelements.RL_AdditionInformationList_v950ext getRl_AdditionInformationList()
    {
	return (rrc.informationelements.RL_AdditionInformationList_v950ext)mComponents[1];
    }
    
    public void setRl_AdditionInformationList(rrc.informationelements.RL_AdditionInformationList_v950ext rl_AdditionInformationList)
    {
	mComponents[1] = rl_AdditionInformationList;
    }
    
    public boolean hasRl_AdditionInformationList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRl_AdditionInformationList()
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
	    "rrc.pdu_definitions",
	    "ActiveSetUpdate_v950ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "ActiveSetUpdate-v950ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SecondaryCellMIMOparametersFDD_v950ext"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryCellMIMOparametersFDD-v950ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCellMIMOparametersFDD_v950ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCellMIMOparametersFDD_v950ext"
				)
			    ),
			    0
			)
		    ),
		    "secondaryCellMimoParameters",
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
				"RL_AdditionInformationList_v950ext"
			    ),
			    new QName (
				"InformationElements",
				"RL-AdditionInformationList-v950ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(7)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RL_AdditionInformation_v950ext"
				)
			    )
			)
		    ),
		    "rl-AdditionInformationList",
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
     * Get the type descriptor (TypeInfo) of 'this' ActiveSetUpdate_v950ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ActiveSetUpdate_v950ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ActiveSetUpdate_v950ext_IEs
