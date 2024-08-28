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
 * Define the ASN1 Type UE_Positioning_OTDOA_AssistanceData_UEB from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_OTDOA_AssistanceData_UEB extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_OTDOA_AssistanceData_UEB()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_OTDOA_AssistanceData_UEB(UE_Positioning_OTDOA_ReferenceCellInfo_UEB ue_positioning_OTDOA_ReferenceCellInfo_UEB, 
		    UE_Positioning_OTDOA_NeighbourCellList_UEB ue_positioning_OTDOA_NeighbourCellList_UEB)
    {
	setUe_positioning_OTDOA_ReferenceCellInfo_UEB(ue_positioning_OTDOA_ReferenceCellInfo_UEB);
	setUe_positioning_OTDOA_NeighbourCellList_UEB(ue_positioning_OTDOA_NeighbourCellList_UEB);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_OTDOA_ReferenceCellInfo_UEB();
	mComponents[1] = new UE_Positioning_OTDOA_NeighbourCellList_UEB();
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
		return new UE_Positioning_OTDOA_ReferenceCellInfo_UEB();
	    case 1:
		return new UE_Positioning_OTDOA_NeighbourCellList_UEB();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_OTDOA_ReferenceCellInfo_UEB"
    public UE_Positioning_OTDOA_ReferenceCellInfo_UEB getUe_positioning_OTDOA_ReferenceCellInfo_UEB()
    {
	return (UE_Positioning_OTDOA_ReferenceCellInfo_UEB)mComponents[0];
    }
    
    public void setUe_positioning_OTDOA_ReferenceCellInfo_UEB(UE_Positioning_OTDOA_ReferenceCellInfo_UEB ue_positioning_OTDOA_ReferenceCellInfo_UEB)
    {
	mComponents[0] = ue_positioning_OTDOA_ReferenceCellInfo_UEB;
    }
    
    public boolean hasUe_positioning_OTDOA_ReferenceCellInfo_UEB()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_OTDOA_ReferenceCellInfo_UEB()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_positioning_OTDOA_NeighbourCellList_UEB"
    public UE_Positioning_OTDOA_NeighbourCellList_UEB getUe_positioning_OTDOA_NeighbourCellList_UEB()
    {
	return (UE_Positioning_OTDOA_NeighbourCellList_UEB)mComponents[1];
    }
    
    public void setUe_positioning_OTDOA_NeighbourCellList_UEB(UE_Positioning_OTDOA_NeighbourCellList_UEB ue_positioning_OTDOA_NeighbourCellList_UEB)
    {
	mComponents[1] = ue_positioning_OTDOA_NeighbourCellList_UEB;
    }
    
    public boolean hasUe_positioning_OTDOA_NeighbourCellList_UEB()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_positioning_OTDOA_NeighbourCellList_UEB()
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
	    "UE_Positioning_OTDOA_AssistanceData_UEB"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-OTDOA-AssistanceData-UEB"
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
				"UE_Positioning_OTDOA_ReferenceCellInfo_UEB"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-ReferenceCellInfo-UEB"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_ReferenceCellInfo_UEB"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_ReferenceCellInfo_UEB"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-OTDOA-ReferenceCellInfo-UEB",
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
				"UE_Positioning_OTDOA_NeighbourCellList_UEB"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-NeighbourCellList-UEB"
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
				    "UE_Positioning_OTDOA_NeighbourCellInfo_UEB"
				)
			    )
			)
		    ),
		    "ue-positioning-OTDOA-NeighbourCellList-UEB",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_OTDOA_AssistanceData_UEB object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_OTDOA_AssistanceData_UEB object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_OTDOA_AssistanceData_UEB
