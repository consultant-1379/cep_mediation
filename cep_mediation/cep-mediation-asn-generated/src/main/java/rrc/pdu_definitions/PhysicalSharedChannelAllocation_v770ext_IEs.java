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
 * Define the ASN1 Type PhysicalSharedChannelAllocation_v770ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class PhysicalSharedChannelAllocation_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalSharedChannelAllocation_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalSharedChannelAllocation_v770ext_IEs(rrc.informationelements.UL_TimingAdvanceControl_r7 ul_TimingAdvance, 
		    rrc.informationelements.PUSCH_CapacityAllocationInfo_r7 pusch_CapacityAllocationInfo, 
		    rrc.informationelements.PDSCH_CapacityAllocationInfo_r7 pdsch_CapacityAllocationInfo)
    {
	setUl_TimingAdvance(ul_TimingAdvance);
	setPusch_CapacityAllocationInfo(pusch_CapacityAllocationInfo);
	setPdsch_CapacityAllocationInfo(pdsch_CapacityAllocationInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UL_TimingAdvanceControl_r7();
	mComponents[1] = new rrc.informationelements.PUSCH_CapacityAllocationInfo_r7();
	mComponents[2] = new rrc.informationelements.PDSCH_CapacityAllocationInfo_r7();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.UL_TimingAdvanceControl_r7();
	    case 1:
		return new rrc.informationelements.PUSCH_CapacityAllocationInfo_r7();
	    case 2:
		return new rrc.informationelements.PDSCH_CapacityAllocationInfo_r7();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_TimingAdvance"
    public rrc.informationelements.UL_TimingAdvanceControl_r7 getUl_TimingAdvance()
    {
	return (rrc.informationelements.UL_TimingAdvanceControl_r7)mComponents[0];
    }
    
    public void setUl_TimingAdvance(rrc.informationelements.UL_TimingAdvanceControl_r7 ul_TimingAdvance)
    {
	mComponents[0] = ul_TimingAdvance;
    }
    
    public boolean hasUl_TimingAdvance()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_TimingAdvance()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pusch_CapacityAllocationInfo"
    public rrc.informationelements.PUSCH_CapacityAllocationInfo_r7 getPusch_CapacityAllocationInfo()
    {
	return (rrc.informationelements.PUSCH_CapacityAllocationInfo_r7)mComponents[1];
    }
    
    public void setPusch_CapacityAllocationInfo(rrc.informationelements.PUSCH_CapacityAllocationInfo_r7 pusch_CapacityAllocationInfo)
    {
	mComponents[1] = pusch_CapacityAllocationInfo;
    }
    
    public boolean hasPusch_CapacityAllocationInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deletePusch_CapacityAllocationInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "pdsch_CapacityAllocationInfo"
    public rrc.informationelements.PDSCH_CapacityAllocationInfo_r7 getPdsch_CapacityAllocationInfo()
    {
	return (rrc.informationelements.PDSCH_CapacityAllocationInfo_r7)mComponents[2];
    }
    
    public void setPdsch_CapacityAllocationInfo(rrc.informationelements.PDSCH_CapacityAllocationInfo_r7 pdsch_CapacityAllocationInfo)
    {
	mComponents[2] = pdsch_CapacityAllocationInfo;
    }
    
    public boolean hasPdsch_CapacityAllocationInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deletePdsch_CapacityAllocationInfo()
    {
	setComponentAbsent(2);
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
	    "PhysicalSharedChannelAllocation_v770ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "PhysicalSharedChannelAllocation-v770ext-IEs"
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
				"UL_TimingAdvanceControl_r7"
			    ),
			    new QName (
				"InformationElements",
				"UL-TimingAdvanceControl-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TimingAdvanceControl_r7"
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
		    "ul-TimingAdvance",
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
				"PUSCH_CapacityAllocationInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"PUSCH-CapacityAllocationInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PUSCH_CapacityAllocationInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PUSCH_CapacityAllocationInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "pusch-CapacityAllocationInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PDSCH_CapacityAllocationInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"PDSCH-CapacityAllocationInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_CapacityAllocationInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_CapacityAllocationInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "pdsch-CapacityAllocationInfo",
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PhysicalSharedChannelAllocation_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalSharedChannelAllocation_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalSharedChannelAllocation_v770ext_IEs
