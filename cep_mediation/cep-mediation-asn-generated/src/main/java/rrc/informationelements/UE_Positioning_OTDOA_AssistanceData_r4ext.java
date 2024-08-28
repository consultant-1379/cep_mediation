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
 * Define the ASN1 Type UE_Positioning_OTDOA_AssistanceData_r4ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_OTDOA_AssistanceData_r4ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_OTDOA_AssistanceData_r4ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_OTDOA_AssistanceData_r4ext(UE_Positioning_IPDL_Parameters_TDD_r4_ext ue_Positioning_IPDL_Parameters_TDD_r4_ext, 
		    UE_Positioning_IPDL_Parameters_TDDList_r4_ext ue_Positioning_IPDL_Parameters_TDDList_r4_ext)
    {
	setUe_Positioning_IPDL_Parameters_TDD_r4_ext(ue_Positioning_IPDL_Parameters_TDD_r4_ext);
	setUe_Positioning_IPDL_Parameters_TDDList_r4_ext(ue_Positioning_IPDL_Parameters_TDDList_r4_ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_IPDL_Parameters_TDD_r4_ext();
	mComponents[1] = new UE_Positioning_IPDL_Parameters_TDDList_r4_ext();
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
		return new UE_Positioning_IPDL_Parameters_TDD_r4_ext();
	    case 1:
		return new UE_Positioning_IPDL_Parameters_TDDList_r4_ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_Positioning_IPDL_Parameters_TDD_r4_ext"
    public UE_Positioning_IPDL_Parameters_TDD_r4_ext getUe_Positioning_IPDL_Parameters_TDD_r4_ext()
    {
	return (UE_Positioning_IPDL_Parameters_TDD_r4_ext)mComponents[0];
    }
    
    public void setUe_Positioning_IPDL_Parameters_TDD_r4_ext(UE_Positioning_IPDL_Parameters_TDD_r4_ext ue_Positioning_IPDL_Parameters_TDD_r4_ext)
    {
	mComponents[0] = ue_Positioning_IPDL_Parameters_TDD_r4_ext;
    }
    
    public boolean hasUe_Positioning_IPDL_Parameters_TDD_r4_ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_Positioning_IPDL_Parameters_TDD_r4_ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_Positioning_IPDL_Parameters_TDDList_r4_ext"
    public UE_Positioning_IPDL_Parameters_TDDList_r4_ext getUe_Positioning_IPDL_Parameters_TDDList_r4_ext()
    {
	return (UE_Positioning_IPDL_Parameters_TDDList_r4_ext)mComponents[1];
    }
    
    public void setUe_Positioning_IPDL_Parameters_TDDList_r4_ext(UE_Positioning_IPDL_Parameters_TDDList_r4_ext ue_Positioning_IPDL_Parameters_TDDList_r4_ext)
    {
	mComponents[1] = ue_Positioning_IPDL_Parameters_TDDList_r4_ext;
    }
    
    public boolean hasUe_Positioning_IPDL_Parameters_TDDList_r4_ext()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_Positioning_IPDL_Parameters_TDDList_r4_ext()
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
	    "UE_Positioning_OTDOA_AssistanceData_r4ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-OTDOA-AssistanceData-r4ext"
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
				"UE_Positioning_IPDL_Parameters_TDD_r4_ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-IPDL-Parameters-TDD-r4-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_IPDL_Parameters_TDD_r4_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_IPDL_Parameters_TDD_r4_ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-IPDL-Parameters-TDD-r4-ext",
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
				"UE_Positioning_IPDL_Parameters_TDDList_r4_ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-IPDL-Parameters-TDDList-r4-ext"
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
				    "UE_Positioning_IPDL_Parameters_TDD_r4_ext"
				)
			    )
			)
		    ),
		    "ue-Positioning-IPDL-Parameters-TDDList-r4-ext",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_OTDOA_AssistanceData_r4ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_OTDOA_AssistanceData_r4ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_OTDOA_AssistanceData_r4ext
