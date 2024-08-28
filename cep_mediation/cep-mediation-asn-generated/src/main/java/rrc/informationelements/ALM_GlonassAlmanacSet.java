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
 * Define the ASN1 Type ALM_GlonassAlmanacSet from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ALM_GlonassAlmanacSet extends Sequence {
    
    /**
     * The default constructor.
     */
    public ALM_GlonassAlmanacSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ALM_GlonassAlmanacSet(GANSS_SAT_Info_Almanac_GLOkpList sat_info_GLOkpList)
    {
	setSat_info_GLOkpList(sat_info_GLOkpList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GANSS_SAT_Info_Almanac_GLOkpList();
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
		return new GANSS_SAT_Info_Almanac_GLOkpList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sat_info_GLOkpList"
    public GANSS_SAT_Info_Almanac_GLOkpList getSat_info_GLOkpList()
    {
	return (GANSS_SAT_Info_Almanac_GLOkpList)mComponents[0];
    }
    
    public void setSat_info_GLOkpList(GANSS_SAT_Info_Almanac_GLOkpList sat_info_GLOkpList)
    {
	mComponents[0] = sat_info_GLOkpList;
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
	    "ALM_GlonassAlmanacSet"
	),
	new QName (
	    "InformationElements",
	    "ALM-GlonassAlmanacSet"
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
				"GANSS_SAT_Info_Almanac_GLOkpList"
			    ),
			    new QName (
				"InformationElements",
				"GANSS-SAT-Info-Almanac-GLOkpList"
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
				    "GANSS_SAT_Info_Almanac_GLOkp"
				)
			    )
			)
		    ),
		    "sat-info-GLOkpList",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ALM_GlonassAlmanacSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ALM_GlonassAlmanacSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ALM_GlonassAlmanacSet
