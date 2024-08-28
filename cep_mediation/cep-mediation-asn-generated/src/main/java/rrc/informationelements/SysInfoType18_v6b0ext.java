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
 * Define the ASN1 Type SysInfoType18_v6b0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType18_v6b0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType18_v6b0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType18_v6b0ext(PLMNIdentitiesOfNeighbourCells idleModePLMNIdentitiesSIB11bis, 
		    PLMNIdentitiesOfNeighbourCells connectedModePLMNIdentitiesSIB11bis)
    {
	setIdleModePLMNIdentitiesSIB11bis(idleModePLMNIdentitiesSIB11bis);
	setConnectedModePLMNIdentitiesSIB11bis(connectedModePLMNIdentitiesSIB11bis);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PLMNIdentitiesOfNeighbourCells();
	mComponents[1] = new PLMNIdentitiesOfNeighbourCells();
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
		return new PLMNIdentitiesOfNeighbourCells();
	    case 1:
		return new PLMNIdentitiesOfNeighbourCells();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "idleModePLMNIdentitiesSIB11bis"
    public PLMNIdentitiesOfNeighbourCells getIdleModePLMNIdentitiesSIB11bis()
    {
	return (PLMNIdentitiesOfNeighbourCells)mComponents[0];
    }
    
    public void setIdleModePLMNIdentitiesSIB11bis(PLMNIdentitiesOfNeighbourCells idleModePLMNIdentitiesSIB11bis)
    {
	mComponents[0] = idleModePLMNIdentitiesSIB11bis;
    }
    
    public boolean hasIdleModePLMNIdentitiesSIB11bis()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIdleModePLMNIdentitiesSIB11bis()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "connectedModePLMNIdentitiesSIB11bis"
    public PLMNIdentitiesOfNeighbourCells getConnectedModePLMNIdentitiesSIB11bis()
    {
	return (PLMNIdentitiesOfNeighbourCells)mComponents[1];
    }
    
    public void setConnectedModePLMNIdentitiesSIB11bis(PLMNIdentitiesOfNeighbourCells connectedModePLMNIdentitiesSIB11bis)
    {
	mComponents[1] = connectedModePLMNIdentitiesSIB11bis;
    }
    
    public boolean hasConnectedModePLMNIdentitiesSIB11bis()
    {
	return componentIsPresent(1);
    }
    
    public void deleteConnectedModePLMNIdentitiesSIB11bis()
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
	    "SysInfoType18_v6b0ext"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType18-v6b0ext"
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
				"PLMNIdentitiesOfNeighbourCells"
			    ),
			    new QName (
				"InformationElements",
				"PLMNIdentitiesOfNeighbourCells"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells"
				)
			    ),
			    0
			)
		    ),
		    "idleModePLMNIdentitiesSIB11bis",
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
				"PLMNIdentitiesOfNeighbourCells"
			    ),
			    new QName (
				"InformationElements",
				"PLMNIdentitiesOfNeighbourCells"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMNIdentitiesOfNeighbourCells"
				)
			    ),
			    0
			)
		    ),
		    "connectedModePLMNIdentitiesSIB11bis",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType18_v6b0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType18_v6b0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType18_v6b0ext
