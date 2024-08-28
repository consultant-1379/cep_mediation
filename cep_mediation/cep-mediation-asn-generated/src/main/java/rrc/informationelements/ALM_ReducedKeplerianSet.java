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
 * Define the ASN1 Type ALM_ReducedKeplerianSet from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ALM_ReducedKeplerianSet extends Sequence {
    
    /**
     * The default constructor.
     */
    public ALM_ReducedKeplerianSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ALM_ReducedKeplerianSet(INTEGER t_oa, 
		    GANSS_SAT_Info_Almanac_REDkpList sat_info_REDkpList)
    {
	setT_oa(t_oa);
	setSat_info_REDkpList(sat_info_REDkpList);
    }
    
    /**
     * Construct with components.
     */
    public ALM_ReducedKeplerianSet(long t_oa, 
		    GANSS_SAT_Info_Almanac_REDkpList sat_info_REDkpList)
    {
	this(new INTEGER(t_oa), sat_info_REDkpList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new GANSS_SAT_Info_Almanac_REDkpList();
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
		return new INTEGER();
	    case 1:
		return new GANSS_SAT_Info_Almanac_REDkpList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "t_oa"
    public long getT_oa()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setT_oa(long t_oa)
    {
	setT_oa(new INTEGER(t_oa));
    }
    
    public void setT_oa(INTEGER t_oa)
    {
	mComponents[0] = t_oa;
    }
    
    
    // Methods for field "sat_info_REDkpList"
    public GANSS_SAT_Info_Almanac_REDkpList getSat_info_REDkpList()
    {
	return (GANSS_SAT_Info_Almanac_REDkpList)mComponents[1];
    }
    
    public void setSat_info_REDkpList(GANSS_SAT_Info_Almanac_REDkpList sat_info_REDkpList)
    {
	mComponents[1] = sat_info_REDkpList;
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
	    "ALM_ReducedKeplerianSet"
	),
	new QName (
	    "InformationElements",
	    "ALM-ReducedKeplerianSet"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(147),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(147)
			    ),
			    null
			)
		    ),
		    "t-oa",
		    0,
		    2,
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
				"GANSS_SAT_Info_Almanac_REDkpList"
			    ),
			    new QName (
				"InformationElements",
				"GANSS-SAT-Info-Almanac-REDkpList"
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
				    "GANSS_SAT_Info_Almanac_REDkp"
				)
			    )
			)
		    ),
		    "sat-info-REDkpList",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ALM_ReducedKeplerianSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ALM_ReducedKeplerianSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ALM_ReducedKeplerianSet
