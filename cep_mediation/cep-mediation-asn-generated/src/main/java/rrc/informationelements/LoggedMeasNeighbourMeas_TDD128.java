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
 * Define the ASN1 Type LoggedMeasNeighbourMeas_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedMeasNeighbourMeas_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedMeasNeighbourMeas_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedMeasNeighbourMeas_TDD128(CellParametersID cellParametersID, 
		    PrimaryCCPCH_RSCP primaryCCPCH_RSCP)
    {
	setCellParametersID(cellParametersID);
	setPrimaryCCPCH_RSCP(primaryCCPCH_RSCP);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellParametersID();
	mComponents[1] = new PrimaryCCPCH_RSCP();
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
		return new CellParametersID();
	    case 1:
		return new PrimaryCCPCH_RSCP();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cellParametersID"
    public CellParametersID getCellParametersID()
    {
	return (CellParametersID)mComponents[0];
    }
    
    public void setCellParametersID(CellParametersID cellParametersID)
    {
	mComponents[0] = cellParametersID;
    }
    
    
    // Methods for field "primaryCCPCH_RSCP"
    public PrimaryCCPCH_RSCP getPrimaryCCPCH_RSCP()
    {
	return (PrimaryCCPCH_RSCP)mComponents[1];
    }
    
    public void setPrimaryCCPCH_RSCP(PrimaryCCPCH_RSCP primaryCCPCH_RSCP)
    {
	mComponents[1] = primaryCCPCH_RSCP;
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
	    "LoggedMeasNeighbourMeas_TDD128"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasNeighbourMeas-TDD128"
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
				"CellParametersID"
			    ),
			    new QName (
				"InformationElements",
				"CellParametersID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellParametersID(0), 
				    new CellParametersID(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "cellParametersID",
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
				"rrc.informationelements",
				"PrimaryCCPCH_RSCP"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCCPCH-RSCP"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PrimaryCCPCH_RSCP(0), 
				    new PrimaryCCPCH_RSCP(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "primaryCCPCH-RSCP",
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
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasNeighbourMeas_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasNeighbourMeas_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasNeighbourMeas_TDD128
