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
 * Define the ASN1 Type InterRATHandoverInfoBand_va40ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfoBand_va40ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfoBand_va40ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfoBand_va40ext_IEs(rrc.informationelements.UE_RadioAccessCapabBand_va40ext ue_RadioAccessCapabBand, 
		    rrc.informationelements.RF_CapabBandListFDDComp_ext2 rf_CapabilityFDDComp)
    {
	setUe_RadioAccessCapabBand(ue_RadioAccessCapabBand);
	setRf_CapabilityFDDComp(rf_CapabilityFDDComp);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UE_RadioAccessCapabBand_va40ext();
	mComponents[1] = new rrc.informationelements.RF_CapabBandListFDDComp_ext2();
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
		return new rrc.informationelements.UE_RadioAccessCapabBand_va40ext();
	    case 1:
		return new rrc.informationelements.RF_CapabBandListFDDComp_ext2();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapabBand"
    public rrc.informationelements.UE_RadioAccessCapabBand_va40ext getUe_RadioAccessCapabBand()
    {
	return (rrc.informationelements.UE_RadioAccessCapabBand_va40ext)mComponents[0];
    }
    
    public void setUe_RadioAccessCapabBand(rrc.informationelements.UE_RadioAccessCapabBand_va40ext ue_RadioAccessCapabBand)
    {
	mComponents[0] = ue_RadioAccessCapabBand;
    }
    
    public boolean hasUe_RadioAccessCapabBand()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_RadioAccessCapabBand()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "rf_CapabilityFDDComp"
    public rrc.informationelements.RF_CapabBandListFDDComp_ext2 getRf_CapabilityFDDComp()
    {
	return (rrc.informationelements.RF_CapabBandListFDDComp_ext2)mComponents[1];
    }
    
    public void setRf_CapabilityFDDComp(rrc.informationelements.RF_CapabBandListFDDComp_ext2 rf_CapabilityFDDComp)
    {
	mComponents[1] = rf_CapabilityFDDComp;
    }
    
    public boolean hasRf_CapabilityFDDComp()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRf_CapabilityFDDComp()
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
	    "InterRATHandoverInfoBand_va40ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "InterRATHandoverInfoBand-va40ext-IEs"
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
				"UE_RadioAccessCapabBand_va40ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBand-va40ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapabBand_va40ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapabBand_va40ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapabBand",
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
				"RF_CapabBandListFDDComp_ext2"
			    ),
			    new QName (
				"InformationElements",
				"RF-CapabBandListFDDComp-ext2"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RF_CapabBandFDDComp"
				)
			    )
			)
		    ),
		    "rf-CapabilityFDDComp",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfoBand_va40ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfoBand_va40ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfoBand_va40ext_IEs
