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
 * Define the ASN1 Type InterFreqCellInfoSI_List_HCS_RSCP from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterFreqCellInfoSI_List_HCS_RSCP extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterFreqCellInfoSI_List_HCS_RSCP()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterFreqCellInfoSI_List_HCS_RSCP(RemovedInterFreqCellList removedInterFreqCellList, 
		    NewInterFreqCellSI_List_HCS_RSCP newInterFreqCellList)
    {
	setRemovedInterFreqCellList(removedInterFreqCellList);
	setNewInterFreqCellList(newInterFreqCellList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RemovedInterFreqCellList();
	mComponents[1] = new NewInterFreqCellSI_List_HCS_RSCP();
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
		return new RemovedInterFreqCellList();
	    case 1:
		return new NewInterFreqCellSI_List_HCS_RSCP();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "removedInterFreqCellList"
    public RemovedInterFreqCellList getRemovedInterFreqCellList()
    {
	return (RemovedInterFreqCellList)mComponents[0];
    }
    
    public void setRemovedInterFreqCellList(RemovedInterFreqCellList removedInterFreqCellList)
    {
	mComponents[0] = removedInterFreqCellList;
    }
    
    public boolean hasRemovedInterFreqCellList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRemovedInterFreqCellList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "newInterFreqCellList"
    public NewInterFreqCellSI_List_HCS_RSCP getNewInterFreqCellList()
    {
	return (NewInterFreqCellSI_List_HCS_RSCP)mComponents[1];
    }
    
    public void setNewInterFreqCellList(NewInterFreqCellSI_List_HCS_RSCP newInterFreqCellList)
    {
	mComponents[1] = newInterFreqCellList;
    }
    
    public boolean hasNewInterFreqCellList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteNewInterFreqCellList()
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
	    "InterFreqCellInfoSI_List_HCS_RSCP"
	),
	new QName (
	    "InformationElements",
	    "InterFreqCellInfoSI-List-HCS-RSCP"
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
				"RemovedInterFreqCellList"
			    ),
			    new QName (
				"InformationElements",
				"RemovedInterFreqCellList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RemovedInterFreqCellList"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "removedInterFreqCellList",
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
				"NewInterFreqCellSI_List_HCS_RSCP"
			    ),
			    new QName (
				"InformationElements",
				"NewInterFreqCellSI-List-HCS-RSCP"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "NewInterFreqCellSI_HCS_RSCP"
				)
			    )
			)
		    ),
		    "newInterFreqCellList",
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
     * Get the type descriptor (TypeInfo) of 'this' InterFreqCellInfoSI_List_HCS_RSCP object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterFreqCellInfoSI_List_HCS_RSCP object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterFreqCellInfoSI_List_HCS_RSCP
