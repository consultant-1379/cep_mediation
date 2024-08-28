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
 * Define the ASN1 Type PDSCH_PowerControlInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDSCH_PowerControlInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDSCH_PowerControlInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDSCH_PowerControlInfo(TPC_StepSizeTDD tpc_StepSizeTDD, 
		    UL_CCTrChTPCList ul_CCTrChTPCList)
    {
	setTpc_StepSizeTDD(tpc_StepSizeTDD);
	setUl_CCTrChTPCList(ul_CCTrChTPCList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TPC_StepSizeTDD();
	mComponents[1] = new UL_CCTrChTPCList();
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
		return new TPC_StepSizeTDD();
	    case 1:
		return new UL_CCTrChTPCList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tpc_StepSizeTDD"
    public TPC_StepSizeTDD getTpc_StepSizeTDD()
    {
	return (TPC_StepSizeTDD)mComponents[0];
    }
    
    public void setTpc_StepSizeTDD(TPC_StepSizeTDD tpc_StepSizeTDD)
    {
	mComponents[0] = tpc_StepSizeTDD;
    }
    
    public boolean hasTpc_StepSizeTDD()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTpc_StepSizeTDD()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ul_CCTrChTPCList"
    public UL_CCTrChTPCList getUl_CCTrChTPCList()
    {
	return (UL_CCTrChTPCList)mComponents[1];
    }
    
    public void setUl_CCTrChTPCList(UL_CCTrChTPCList ul_CCTrChTPCList)
    {
	mComponents[1] = ul_CCTrChTPCList;
    }
    
    public boolean hasUl_CCTrChTPCList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUl_CCTrChTPCList()
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
	    "PDSCH_PowerControlInfo"
	),
	new QName (
	    "InformationElements",
	    "PDSCH-PowerControlInfo"
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
				"rrc.informationelements",
				"TPC_StepSizeTDD"
			    ),
			    new QName (
				"InformationElements",
				"TPC-StepSizeTDD"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TPC_StepSizeTDD(1), 
				    new TPC_StepSizeTDD(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "tpc-StepSizeTDD",
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
				"UL_CCTrChTPCList"
			    ),
			    new QName (
				"InformationElements",
				"UL-CCTrChTPCList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_Identity"
				)
			    )
			)
		    ),
		    "ul-CCTrChTPCList",
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
     * Get the type descriptor (TypeInfo) of 'this' PDSCH_PowerControlInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDSCH_PowerControlInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDSCH_PowerControlInfo
