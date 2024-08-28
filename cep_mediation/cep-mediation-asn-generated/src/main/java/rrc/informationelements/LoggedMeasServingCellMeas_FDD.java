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
 * Define the ASN1 Type LoggedMeasServingCellMeas_FDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedMeasServingCellMeas_FDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedMeasServingCellMeas_FDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedMeasServingCellMeas_FDD(CellIdentity cellIdentity, 
		    CPICH_RSCP cpich_RSCP, CPICH_Ec_N0 cpich_Ec_N0)
    {
	setCellIdentity(cellIdentity);
	setCpich_RSCP(cpich_RSCP);
	setCpich_Ec_N0(cpich_Ec_N0);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellIdentity();
	mComponents[1] = new CPICH_RSCP();
	mComponents[2] = new CPICH_Ec_N0();
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
		return new CellIdentity();
	    case 1:
		return new CPICH_RSCP();
	    case 2:
		return new CPICH_Ec_N0();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cellIdentity"
    public CellIdentity getCellIdentity()
    {
	return (CellIdentity)mComponents[0];
    }
    
    public void setCellIdentity(CellIdentity cellIdentity)
    {
	mComponents[0] = cellIdentity;
    }
    
    
    // Methods for field "cpich_RSCP"
    public CPICH_RSCP getCpich_RSCP()
    {
	return (CPICH_RSCP)mComponents[1];
    }
    
    public void setCpich_RSCP(CPICH_RSCP cpich_RSCP)
    {
	mComponents[1] = cpich_RSCP;
    }
    
    
    // Methods for field "cpich_Ec_N0"
    public CPICH_Ec_N0 getCpich_Ec_N0()
    {
	return (CPICH_Ec_N0)mComponents[2];
    }
    
    public void setCpich_Ec_N0(CPICH_Ec_N0 cpich_Ec_N0)
    {
	mComponents[2] = cpich_Ec_N0;
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
	    "LoggedMeasServingCellMeas_FDD"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasServingCellMeas-FDD"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CellIdentity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "cellIdentity",
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
				"CPICH_RSCP"
			    ),
			    new QName (
				"InformationElements",
				"CPICH-RSCP"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CPICH_RSCP(0), 
				    new CPICH_RSCP(127),
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
		    "cpich-RSCP",
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
				"rrc.informationelements",
				"CPICH_Ec_N0"
			    ),
			    new QName (
				"InformationElements",
				"CPICH-Ec-N0"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CPICH_Ec_N0(0), 
				    new CPICH_Ec_N0(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "cpich-Ec-N0",
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
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasServingCellMeas_FDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasServingCellMeas_FDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasServingCellMeas_FDD
