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
 * Define the ASN1 Type LoggedMeasNeighbourInfo_FDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedMeasNeighbourInfo_FDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedMeasNeighbourInfo_FDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedMeasNeighbourInfo_FDD(PrimaryCPICH_Info primaryCPICH_Info, 
		    CPICH_RSCP cpich_RSCP, CPICH_Ec_N0 cpich_Ec_N0)
    {
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setCpich_RSCP(cpich_RSCP);
	setCpich_Ec_N0(cpich_Ec_N0);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrimaryCPICH_Info();
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
		return new PrimaryCPICH_Info();
	    case 1:
		return new CPICH_RSCP();
	    case 2:
		return new CPICH_Ec_N0();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryCPICH_Info"
    public PrimaryCPICH_Info getPrimaryCPICH_Info()
    {
	return (PrimaryCPICH_Info)mComponents[0];
    }
    
    public void setPrimaryCPICH_Info(PrimaryCPICH_Info primaryCPICH_Info)
    {
	mComponents[0] = primaryCPICH_Info;
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
	    "LoggedMeasNeighbourInfo_FDD"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasNeighbourInfo-FDD"
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
				"PrimaryCPICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCPICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0
			)
		    ),
		    "primaryCPICH-Info",
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
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasNeighbourInfo_FDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasNeighbourInfo_FDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasNeighbourInfo_FDD
