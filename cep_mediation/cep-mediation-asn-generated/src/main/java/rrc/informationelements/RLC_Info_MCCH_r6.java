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
 * Define the ASN1 Type RLC_Info_MCCH_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RLC_Info_MCCH_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RLC_Info_MCCH_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RLC_Info_MCCH_r6(DL_UM_RLC_LI_size dl_UM_RLC_LI_size, 
		    UM_RLC_OutOSeqDelivery_Info_r6 dl_UM_RLC_OutOSeqDelivery_Info)
    {
	setDl_UM_RLC_LI_size(dl_UM_RLC_LI_size);
	setDl_UM_RLC_OutOSeqDelivery_Info(dl_UM_RLC_OutOSeqDelivery_Info);
    }
    
    /**
     * Construct with required components.
     */
    public RLC_Info_MCCH_r6(DL_UM_RLC_LI_size dl_UM_RLC_LI_size)
    {
	setDl_UM_RLC_LI_size(dl_UM_RLC_LI_size);
    }
    
    public void initComponents()
    {
	mComponents[0] = DL_UM_RLC_LI_size.size7;
	mComponents[1] = new UM_RLC_OutOSeqDelivery_Info_r6();
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
		return DL_UM_RLC_LI_size.size7;
	    case 1:
		return new UM_RLC_OutOSeqDelivery_Info_r6();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_UM_RLC_LI_size"
    public DL_UM_RLC_LI_size getDl_UM_RLC_LI_size()
    {
	return (DL_UM_RLC_LI_size)mComponents[0];
    }
    
    public void setDl_UM_RLC_LI_size(DL_UM_RLC_LI_size dl_UM_RLC_LI_size)
    {
	mComponents[0] = dl_UM_RLC_LI_size;
    }
    
    
    // Methods for field "dl_UM_RLC_OutOSeqDelivery_Info"
    public UM_RLC_OutOSeqDelivery_Info_r6 getDl_UM_RLC_OutOSeqDelivery_Info()
    {
	return (UM_RLC_OutOSeqDelivery_Info_r6)mComponents[1];
    }
    
    public void setDl_UM_RLC_OutOSeqDelivery_Info(UM_RLC_OutOSeqDelivery_Info_r6 dl_UM_RLC_OutOSeqDelivery_Info)
    {
	mComponents[1] = dl_UM_RLC_OutOSeqDelivery_Info;
    }
    
    public boolean hasDl_UM_RLC_OutOSeqDelivery_Info()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_UM_RLC_OutOSeqDelivery_Info()
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
	    "RLC_Info_MCCH_r6"
	),
	new QName (
	    "InformationElements",
	    "RLC-Info-MCCH-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_UM_RLC_LI_size"
			    ),
			    new QName (
				"InformationElements",
				"DL-UM-RLC-LI-size"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"size7",
					0
				    ),
				    new MemberListElement (
					"size15",
					1
				    )
				}
			    ),
			    0,
			    DL_UM_RLC_LI_size.size7
			)
		    ),
		    "dl-UM-RLC-LI-size",
		    0,
		    2,
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
				"UM_RLC_OutOSeqDelivery_Info_r6"
			    ),
			    new QName (
				"InformationElements",
				"UM-RLC-OutOSeqDelivery-Info-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UM_RLC_OutOSeqDelivery_Info_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UM_RLC_OutOSeqDelivery_Info_r6"
				)
			    ),
			    0
			)
		    ),
		    "dl-UM-RLC-OutOSeqDelivery-Info",
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
     * Get the type descriptor (TypeInfo) of 'this' RLC_Info_MCCH_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RLC_Info_MCCH_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RLC_Info_MCCH_r6
