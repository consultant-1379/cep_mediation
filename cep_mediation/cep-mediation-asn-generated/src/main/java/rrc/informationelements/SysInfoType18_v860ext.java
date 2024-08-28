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
 * Define the ASN1 Type SysInfoType18_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType18_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType18_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType18_v860ext(PLMNIdentitiesOfNeighbourCells_v860ext idleModePLMNIdentities, 
		    PLMNIdentitiesOfNeighbourCells_v860ext connectedModePLMNIdentities)
    {
	setIdleModePLMNIdentities(idleModePLMNIdentities);
	setConnectedModePLMNIdentities(connectedModePLMNIdentities);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PLMNIdentitiesOfNeighbourCells_v860ext();
	mComponents[1] = new PLMNIdentitiesOfNeighbourCells_v860ext();
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
		return new PLMNIdentitiesOfNeighbourCells_v860ext();
	    case 1:
		return new PLMNIdentitiesOfNeighbourCells_v860ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "idleModePLMNIdentities"
    public PLMNIdentitiesOfNeighbourCells_v860ext getIdleModePLMNIdentities()
    {
	return (PLMNIdentitiesOfNeighbourCells_v860ext)mComponents[0];
    }
    
    public void setIdleModePLMNIdentities(PLMNIdentitiesOfNeighbourCells_v860ext idleModePLMNIdentities)
    {
	mComponents[0] = idleModePLMNIdentities;
    }
    
    public boolean hasIdleModePLMNIdentities()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIdleModePLMNIdentities()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "connectedModePLMNIdentities"
    public PLMNIdentitiesOfNeighbourCells_v860ext getConnectedModePLMNIdentities()
    {
	return (PLMNIdentitiesOfNeighbourCells_v860ext)mComponents[1];
    }
    
    public void setConnectedModePLMNIdentities(PLMNIdentitiesOfNeighbourCells_v860ext connectedModePLMNIdentities)
    {
	mComponents[1] = connectedModePLMNIdentities;
    }
    
    public boolean hasConnectedModePLMNIdentities()
    {
	return componentIsPresent(1);
    }
    
    public void deleteConnectedModePLMNIdentities()
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
	    "SysInfoType18_v860ext"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType18-v860ext"
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
				"PLMNIdentitiesOfNeighbourCells_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"PLMNIdentitiesOfNeighbourCells-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells_v860ext"
				)
			    ),
			    0
			)
		    ),
		    "idleModePLMNIdentities",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PLMNIdentitiesOfNeighbourCells_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"PLMNIdentitiesOfNeighbourCells-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells_v860ext"
				)
			    ),
			    0
			)
		    ),
		    "connectedModePLMNIdentities",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType18_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType18_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType18_v860ext
