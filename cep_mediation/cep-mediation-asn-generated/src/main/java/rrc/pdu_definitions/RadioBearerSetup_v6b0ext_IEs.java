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
 * Define the ASN1 Type RadioBearerSetup_v6b0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RadioBearerSetup_v6b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RadioBearerSetup_v6b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RadioBearerSetup_v6b0ext_IEs(rrc.informationelements.DL_InformationPerRL_List_v6b0ext dl_InformationPerRL_List_v6b0ext, 
		    rrc.informationelements.RAB_InformationSetupList_v6b0ext rab_InformationSetupListExt)
    {
	setDl_InformationPerRL_List_v6b0ext(dl_InformationPerRL_List_v6b0ext);
	setRab_InformationSetupListExt(rab_InformationSetupListExt);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.DL_InformationPerRL_List_v6b0ext();
	mComponents[1] = new rrc.informationelements.RAB_InformationSetupList_v6b0ext();
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
		return new rrc.informationelements.DL_InformationPerRL_List_v6b0ext();
	    case 1:
		return new rrc.informationelements.RAB_InformationSetupList_v6b0ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_InformationPerRL_List_v6b0ext"
    public rrc.informationelements.DL_InformationPerRL_List_v6b0ext getDl_InformationPerRL_List_v6b0ext()
    {
	return (rrc.informationelements.DL_InformationPerRL_List_v6b0ext)mComponents[0];
    }
    
    public void setDl_InformationPerRL_List_v6b0ext(rrc.informationelements.DL_InformationPerRL_List_v6b0ext dl_InformationPerRL_List_v6b0ext)
    {
	mComponents[0] = dl_InformationPerRL_List_v6b0ext;
    }
    
    public boolean hasDl_InformationPerRL_List_v6b0ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDl_InformationPerRL_List_v6b0ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "rab_InformationSetupListExt"
    public rrc.informationelements.RAB_InformationSetupList_v6b0ext getRab_InformationSetupListExt()
    {
	return (rrc.informationelements.RAB_InformationSetupList_v6b0ext)mComponents[1];
    }
    
    public void setRab_InformationSetupListExt(rrc.informationelements.RAB_InformationSetupList_v6b0ext rab_InformationSetupListExt)
    {
	mComponents[1] = rab_InformationSetupListExt;
    }
    
    public boolean hasRab_InformationSetupListExt()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRab_InformationSetupListExt()
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
	    "RadioBearerSetup_v6b0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RadioBearerSetup-v6b0ext-IEs"
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
				"DL_InformationPerRL_List_v6b0ext"
			    ),
			    new QName (
				"InformationElements",
				"DL-InformationPerRL-List-v6b0ext"
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
				    "DL_InformationPerRL_v6b0ext"
				)
			    )
			)
		    ),
		    "dl-InformationPerRL-List-v6b0ext",
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
				"RAB_InformationSetupList_v6b0ext"
			    ),
			    new QName (
				"InformationElements",
				"RAB-InformationSetupList-v6b0ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_InformationSetup_v6b0ext"
				)
			    )
			)
		    ),
		    "rab-InformationSetupListExt",
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
     * Get the type descriptor (TypeInfo) of 'this' RadioBearerSetup_v6b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioBearerSetup_v6b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioBearerSetup_v6b0ext_IEs
