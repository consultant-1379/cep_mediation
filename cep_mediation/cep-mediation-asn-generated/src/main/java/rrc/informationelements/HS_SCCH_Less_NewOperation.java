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
 * Define the ASN1 Type HS_SCCH_Less_NewOperation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_SCCH_Less_NewOperation extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_SCCH_Less_NewOperation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_SCCH_Less_NewOperation(INTEGER hs_pdsch_CodeIndex, 
		    HS_SCCH_LessTFSList hs_scch_LessTFS)
    {
	setHs_pdsch_CodeIndex(hs_pdsch_CodeIndex);
	setHs_scch_LessTFS(hs_scch_LessTFS);
    }
    
    /**
     * Construct with components.
     */
    public HS_SCCH_Less_NewOperation(long hs_pdsch_CodeIndex, 
		    HS_SCCH_LessTFSList hs_scch_LessTFS)
    {
	this(new INTEGER(hs_pdsch_CodeIndex), hs_scch_LessTFS);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new HS_SCCH_LessTFSList();
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
		return new HS_SCCH_LessTFSList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hs_pdsch_CodeIndex"
    public long getHs_pdsch_CodeIndex()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setHs_pdsch_CodeIndex(long hs_pdsch_CodeIndex)
    {
	setHs_pdsch_CodeIndex(new INTEGER(hs_pdsch_CodeIndex));
    }
    
    public void setHs_pdsch_CodeIndex(INTEGER hs_pdsch_CodeIndex)
    {
	mComponents[0] = hs_pdsch_CodeIndex;
    }
    
    
    // Methods for field "hs_scch_LessTFS"
    public HS_SCCH_LessTFSList getHs_scch_LessTFS()
    {
	return (HS_SCCH_LessTFSList)mComponents[1];
    }
    
    public void setHs_scch_LessTFS(HS_SCCH_LessTFSList hs_scch_LessTFS)
    {
	mComponents[1] = hs_scch_LessTFS;
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
	    "HS_SCCH_Less_NewOperation"
	),
	new QName (
	    "InformationElements",
	    "HS-SCCH-Less-NewOperation"
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "hs-pdsch-CodeIndex",
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
				"HS_SCCH_LessTFSList"
			    ),
			    new QName (
				"InformationElements",
				"HS-SCCH-LessTFSList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_LessTFSList$Sequence_"
				)
			    )
			)
		    ),
		    "hs-scch-LessTFS",
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
     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_Less_NewOperation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_Less_NewOperation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SCCH_Less_NewOperation
