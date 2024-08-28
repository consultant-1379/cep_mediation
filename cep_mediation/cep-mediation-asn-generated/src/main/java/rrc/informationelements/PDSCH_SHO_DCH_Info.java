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
 * Define the ASN1 Type PDSCH_SHO_DCH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDSCH_SHO_DCH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDSCH_SHO_DCH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDSCH_SHO_DCH_Info(DSCH_RadioLinkIdentifier dsch_RadioLinkIdentifier, 
		    RL_IdentifierList rl_IdentifierList)
    {
	setDsch_RadioLinkIdentifier(dsch_RadioLinkIdentifier);
	setRl_IdentifierList(rl_IdentifierList);
    }
    
    /**
     * Construct with required components.
     */
    public PDSCH_SHO_DCH_Info(DSCH_RadioLinkIdentifier dsch_RadioLinkIdentifier)
    {
	setDsch_RadioLinkIdentifier(dsch_RadioLinkIdentifier);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DSCH_RadioLinkIdentifier();
	mComponents[1] = new RL_IdentifierList();
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
		return new DSCH_RadioLinkIdentifier();
	    case 1:
		return new RL_IdentifierList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dsch_RadioLinkIdentifier"
    public DSCH_RadioLinkIdentifier getDsch_RadioLinkIdentifier()
    {
	return (DSCH_RadioLinkIdentifier)mComponents[0];
    }
    
    public void setDsch_RadioLinkIdentifier(DSCH_RadioLinkIdentifier dsch_RadioLinkIdentifier)
    {
	mComponents[0] = dsch_RadioLinkIdentifier;
    }
    
    
    // Methods for field "rl_IdentifierList"
    public RL_IdentifierList getRl_IdentifierList()
    {
	return (RL_IdentifierList)mComponents[1];
    }
    
    public void setRl_IdentifierList(RL_IdentifierList rl_IdentifierList)
    {
	mComponents[1] = rl_IdentifierList;
    }
    
    public boolean hasRl_IdentifierList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRl_IdentifierList()
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
	    "PDSCH_SHO_DCH_Info"
	),
	new QName (
	    "InformationElements",
	    "PDSCH-SHO-DCH-Info"
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
				"DSCH_RadioLinkIdentifier"
			    ),
			    new QName (
				"InformationElements",
				"DSCH-RadioLinkIdentifier"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DSCH_RadioLinkIdentifier(0), 
				    new DSCH_RadioLinkIdentifier(511),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    ),
			    null
			)
		    ),
		    "dsch-RadioLinkIdentifier",
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
				"RL_IdentifierList"
			    ),
			    new QName (
				"InformationElements",
				"RL-IdentifierList"
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
		    "rl-IdentifierList",
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
     * Get the type descriptor (TypeInfo) of 'this' PDSCH_SHO_DCH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDSCH_SHO_DCH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDSCH_SHO_DCH_Info
