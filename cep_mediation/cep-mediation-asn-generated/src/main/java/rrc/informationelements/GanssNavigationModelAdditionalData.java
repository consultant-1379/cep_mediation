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
 * Define the ASN1 Type GanssNavigationModelAdditionalData from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GanssNavigationModelAdditionalData extends Sequence {
    
    /**
     * The default constructor.
     */
    public GanssNavigationModelAdditionalData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GanssNavigationModelAdditionalData(INTEGER ganssWeek, 
		    INTEGER ganssToe, INTEGER t_toeLimit, 
		    SatellitesListRelatedDataList satellitesListRelatedDataList)
    {
	setGanssWeek(ganssWeek);
	setGanssToe(ganssToe);
	setT_toeLimit(t_toeLimit);
	setSatellitesListRelatedDataList(satellitesListRelatedDataList);
    }
    
    /**
     * Construct with components.
     */
    public GanssNavigationModelAdditionalData(long ganssWeek, long ganssToe, 
		    long t_toeLimit, 
		    SatellitesListRelatedDataList satellitesListRelatedDataList)
    {
	this(new INTEGER(ganssWeek), new INTEGER(ganssToe), 
	     new INTEGER(t_toeLimit), satellitesListRelatedDataList);
    }
    
    /**
     * Construct with required components.
     */
    public GanssNavigationModelAdditionalData(long ganssWeek, long ganssToe, 
		    long t_toeLimit)
    {
	setGanssWeek(ganssWeek);
	setGanssToe(ganssToe);
	setT_toeLimit(t_toeLimit);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new SatellitesListRelatedDataList();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new SatellitesListRelatedDataList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssWeek"
    public long getGanssWeek()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanssWeek(long ganssWeek)
    {
	setGanssWeek(new INTEGER(ganssWeek));
    }
    
    public void setGanssWeek(INTEGER ganssWeek)
    {
	mComponents[0] = ganssWeek;
    }
    
    
    // Methods for field "ganssToe"
    public long getGanssToe()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setGanssToe(long ganssToe)
    {
	setGanssToe(new INTEGER(ganssToe));
    }
    
    public void setGanssToe(INTEGER ganssToe)
    {
	mComponents[1] = ganssToe;
    }
    
    
    // Methods for field "t_toeLimit"
    public long getT_toeLimit()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setT_toeLimit(long t_toeLimit)
    {
	setT_toeLimit(new INTEGER(t_toeLimit));
    }
    
    public void setT_toeLimit(INTEGER t_toeLimit)
    {
	mComponents[2] = t_toeLimit;
    }
    
    
    // Methods for field "satellitesListRelatedDataList"
    public SatellitesListRelatedDataList getSatellitesListRelatedDataList()
    {
	return (SatellitesListRelatedDataList)mComponents[3];
    }
    
    public void setSatellitesListRelatedDataList(SatellitesListRelatedDataList satellitesListRelatedDataList)
    {
	mComponents[3] = satellitesListRelatedDataList;
    }
    
    public boolean hasSatellitesListRelatedDataList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSatellitesListRelatedDataList()
    {
	setComponentAbsent(3);
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
	    "GanssNavigationModelAdditionalData"
	),
	new QName (
	    "InformationElements",
	    "GanssNavigationModelAdditionalData"
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "ganssWeek",
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
				    new com.oss.asn1.INTEGER(167),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(167)
			    ),
			    null
			)
		    ),
		    "ganssToe",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
				    new com.oss.asn1.INTEGER(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "t-toeLimit",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SatellitesListRelatedDataList"
			    ),
			    new QName (
				"InformationElements",
				"SatellitesListRelatedDataList"
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
				    "SatellitesListRelatedData"
				)
			    )
			)
		    ),
		    "satellitesListRelatedDataList",
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' GanssNavigationModelAdditionalData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GanssNavigationModelAdditionalData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GanssNavigationModelAdditionalData
