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
 * Define the ASN1 Type ALM_keplerianParameters from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ALM_keplerianParameters extends Sequence {
    
    /**
     * The default constructor.
     */
    public ALM_keplerianParameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ALM_keplerianParameters(INTEGER t_oa, INTEGER iod_a, 
		    GANSS_SAT_Info_Almanac_KpList sat_info_kpList)
    {
	setT_oa(t_oa);
	setIod_a(iod_a);
	setSat_info_kpList(sat_info_kpList);
    }
    
    /**
     * Construct with components.
     */
    public ALM_keplerianParameters(long t_oa, long iod_a, 
		    GANSS_SAT_Info_Almanac_KpList sat_info_kpList)
    {
	this(new INTEGER(t_oa), new INTEGER(iod_a), sat_info_kpList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new GANSS_SAT_Info_Almanac_KpList();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new GANSS_SAT_Info_Almanac_KpList();
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
    
    
    // Methods for field "iod_a"
    public long getIod_a()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setIod_a(long iod_a)
    {
	setIod_a(new INTEGER(iod_a));
    }
    
    public void setIod_a(INTEGER iod_a)
    {
	mComponents[1] = iod_a;
    }
    
    
    // Methods for field "sat_info_kpList"
    public GANSS_SAT_Info_Almanac_KpList getSat_info_kpList()
    {
	return (GANSS_SAT_Info_Almanac_KpList)mComponents[2];
    }
    
    public void setSat_info_kpList(GANSS_SAT_Info_Almanac_KpList sat_info_kpList)
    {
	mComponents[2] = sat_info_kpList;
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
	    "ALM_keplerianParameters"
	),
	new QName (
	    "InformationElements",
	    "ALM-keplerianParameters"
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "iod-a",
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
				"GANSS_SAT_Info_Almanac_KpList"
			    ),
			    new QName (
				"InformationElements",
				"GANSS-SAT-Info-Almanac-KpList"
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
				    "GANSS_SAT_Info_Almanac_Kp"
				)
			    )
			)
		    ),
		    "sat-info-kpList",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ALM_keplerianParameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ALM_keplerianParameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ALM_keplerianParameters
