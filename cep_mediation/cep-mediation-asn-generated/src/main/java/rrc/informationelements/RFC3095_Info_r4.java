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
 * Define the ASN1 Type RFC3095_Info_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RFC3095_Info_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RFC3095_Info_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RFC3095_Info_r4(ROHC_ProfileList_r4 rohcProfileList, 
		    UL_RFC3095_r4 ul_RFC3095, DL_RFC3095_r4 dl_RFC3095)
    {
	setRohcProfileList(rohcProfileList);
	setUl_RFC3095(ul_RFC3095);
	setDl_RFC3095(dl_RFC3095);
    }
    
    /**
     * Construct with required components.
     */
    public RFC3095_Info_r4(ROHC_ProfileList_r4 rohcProfileList)
    {
	setRohcProfileList(rohcProfileList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ROHC_ProfileList_r4();
	mComponents[1] = new UL_RFC3095_r4();
	mComponents[2] = new DL_RFC3095_r4();
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
		return new ROHC_ProfileList_r4();
	    case 1:
		return new UL_RFC3095_r4();
	    case 2:
		return new DL_RFC3095_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rohcProfileList"
    public ROHC_ProfileList_r4 getRohcProfileList()
    {
	return (ROHC_ProfileList_r4)mComponents[0];
    }
    
    public void setRohcProfileList(ROHC_ProfileList_r4 rohcProfileList)
    {
	mComponents[0] = rohcProfileList;
    }
    
    
    // Methods for field "ul_RFC3095"
    public UL_RFC3095_r4 getUl_RFC3095()
    {
	return (UL_RFC3095_r4)mComponents[1];
    }
    
    public void setUl_RFC3095(UL_RFC3095_r4 ul_RFC3095)
    {
	mComponents[1] = ul_RFC3095;
    }
    
    public boolean hasUl_RFC3095()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUl_RFC3095()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dl_RFC3095"
    public DL_RFC3095_r4 getDl_RFC3095()
    {
	return (DL_RFC3095_r4)mComponents[2];
    }
    
    public void setDl_RFC3095(DL_RFC3095_r4 dl_RFC3095)
    {
	mComponents[2] = dl_RFC3095;
    }
    
    public boolean hasDl_RFC3095()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDl_RFC3095()
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
	    "rrc.informationelements",
	    "RFC3095_Info_r4"
	),
	new QName (
	    "InformationElements",
	    "RFC3095-Info-r4"
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
				"ROHC_ProfileList_r4"
			    ),
			    new QName (
				"InformationElements",
				"ROHC-ProfileList-r4"
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
				    "ROHC_Profile_r4"
				)
			    )
			)
		    ),
		    "rohcProfileList",
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
				"UL_RFC3095_r4"
			    ),
			    new QName (
				"InformationElements",
				"UL-RFC3095-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_RFC3095_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_RFC3095_r4"
				)
			    ),
			    0
			)
		    ),
		    "ul-RFC3095",
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
				"DL_RFC3095_r4"
			    ),
			    new QName (
				"InformationElements",
				"DL-RFC3095-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_RFC3095_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_RFC3095_r4"
				)
			    ),
			    0
			)
		    ),
		    "dl-RFC3095",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' RFC3095_Info_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RFC3095_Info_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RFC3095_Info_r4
