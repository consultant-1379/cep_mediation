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
 * Define the ASN1 Type DLUL_HSPA_Information_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DLUL_HSPA_Information_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DLUL_HSPA_Information_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DLUL_HSPA_Information_r10(UL_EDCH_Information_r9 ul_EDCH_Information, 
		    DL_CommonInformation_r10 dl_CommonInformation, 
		    DL_InformationPerRL_List_r7 dl_InformationPerRL_List, 
		    DL_HSPDSCH_Information_r9 dl_HSPDSCH_Information)
    {
	setUl_EDCH_Information(ul_EDCH_Information);
	setDl_CommonInformation(dl_CommonInformation);
	setDl_InformationPerRL_List(dl_InformationPerRL_List);
	setDl_HSPDSCH_Information(dl_HSPDSCH_Information);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_EDCH_Information_r9();
	mComponents[1] = new DL_CommonInformation_r10();
	mComponents[2] = new DL_InformationPerRL_List_r7();
	mComponents[3] = new DL_HSPDSCH_Information_r9();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UL_EDCH_Information_r9();
	    case 1:
		return new DL_CommonInformation_r10();
	    case 2:
		return new DL_InformationPerRL_List_r7();
	    case 3:
		return new DL_HSPDSCH_Information_r9();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_EDCH_Information"
    public UL_EDCH_Information_r9 getUl_EDCH_Information()
    {
	return (UL_EDCH_Information_r9)mComponents[0];
    }
    
    public void setUl_EDCH_Information(UL_EDCH_Information_r9 ul_EDCH_Information)
    {
	mComponents[0] = ul_EDCH_Information;
    }
    
    
    // Methods for field "dl_CommonInformation"
    public DL_CommonInformation_r10 getDl_CommonInformation()
    {
	return (DL_CommonInformation_r10)mComponents[1];
    }
    
    public void setDl_CommonInformation(DL_CommonInformation_r10 dl_CommonInformation)
    {
	mComponents[1] = dl_CommonInformation;
    }
    
    
    // Methods for field "dl_InformationPerRL_List"
    public DL_InformationPerRL_List_r7 getDl_InformationPerRL_List()
    {
	return (DL_InformationPerRL_List_r7)mComponents[2];
    }
    
    public void setDl_InformationPerRL_List(DL_InformationPerRL_List_r7 dl_InformationPerRL_List)
    {
	mComponents[2] = dl_InformationPerRL_List;
    }
    
    
    // Methods for field "dl_HSPDSCH_Information"
    public DL_HSPDSCH_Information_r9 getDl_HSPDSCH_Information()
    {
	return (DL_HSPDSCH_Information_r9)mComponents[3];
    }
    
    public void setDl_HSPDSCH_Information(DL_HSPDSCH_Information_r9 dl_HSPDSCH_Information)
    {
	mComponents[3] = dl_HSPDSCH_Information;
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
	    "DLUL_HSPA_Information_r10"
	),
	new QName (
	    "InformationElements",
	    "DLUL-HSPA-Information-r10"
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
				"UL_EDCH_Information_r9"
			    ),
			    new QName (
				"InformationElements",
				"UL-EDCH-Information-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_EDCH_Information_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_EDCH_Information_r9"
				)
			    ),
			    0
			)
		    ),
		    "ul-EDCH-Information",
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
				"DL_CommonInformation_r10"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonInformation-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation_r10"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonInformation",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_InformationPerRL_List_r7"
			    ),
			    new QName (
				"InformationElements",
				"DL-InformationPerRL-List-r7"
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
				    "DL_InformationPerRL_r7"
				)
			    )
			)
		    ),
		    "dl-InformationPerRL-List",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_HSPDSCH_Information_r9"
			    ),
			    new QName (
				"InformationElements",
				"DL-HSPDSCH-Information-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r9"
				)
			    ),
			    0
			)
		    ),
		    "dl-HSPDSCH-Information",
		    3,
		    2,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DLUL_HSPA_Information_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DLUL_HSPA_Information_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DLUL_HSPA_Information_r10
