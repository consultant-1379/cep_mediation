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
 * Define the ASN1 Type RadioBearerReconfiguration_v590ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RadioBearerReconfiguration_v590ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RadioBearerReconfiguration_v590ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RadioBearerReconfiguration_v590ext_IEs(rrc.informationelements.DL_TPC_PowerOffsetPerRL_List dl_TPC_PowerOffsetPerRL_List)
    {
	setDl_TPC_PowerOffsetPerRL_List(dl_TPC_PowerOffsetPerRL_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.DL_TPC_PowerOffsetPerRL_List();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.DL_TPC_PowerOffsetPerRL_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_TPC_PowerOffsetPerRL_List"
    public rrc.informationelements.DL_TPC_PowerOffsetPerRL_List getDl_TPC_PowerOffsetPerRL_List()
    {
	return (rrc.informationelements.DL_TPC_PowerOffsetPerRL_List)mComponents[0];
    }
    
    public void setDl_TPC_PowerOffsetPerRL_List(rrc.informationelements.DL_TPC_PowerOffsetPerRL_List dl_TPC_PowerOffsetPerRL_List)
    {
	mComponents[0] = dl_TPC_PowerOffsetPerRL_List;
    }
    
    public boolean hasDl_TPC_PowerOffsetPerRL_List()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDl_TPC_PowerOffsetPerRL_List()
    {
	setComponentAbsent(0);
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
	    "RadioBearerReconfiguration_v590ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RadioBearerReconfiguration-v590ext-IEs"
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
				"DL_TPC_PowerOffsetPerRL_List"
			    ),
			    new QName (
				"InformationElements",
				"DL-TPC-PowerOffsetPerRL-List"
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
				    "DL_TPC_PowerOffsetPerRL"
				)
			    )
			)
		    ),
		    "dl-TPC-PowerOffsetPerRL-List",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioBearerReconfiguration_v590ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioBearerReconfiguration_v590ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioBearerReconfiguration_v590ext_IEs
