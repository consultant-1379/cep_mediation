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
 * Define the ASN1 Type SIR_MeasurementResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SIR_MeasurementResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public SIR_MeasurementResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SIR_MeasurementResults(TFCS_IdentityPlain tfcs_ID, 
		    SIR_TimeslotList sir_TimeslotList)
    {
	setTfcs_ID(tfcs_ID);
	setSir_TimeslotList(sir_TimeslotList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TFCS_IdentityPlain();
	mComponents[1] = new SIR_TimeslotList();
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
		return new TFCS_IdentityPlain();
	    case 1:
		return new SIR_TimeslotList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tfcs_ID"
    public TFCS_IdentityPlain getTfcs_ID()
    {
	return (TFCS_IdentityPlain)mComponents[0];
    }
    
    public void setTfcs_ID(TFCS_IdentityPlain tfcs_ID)
    {
	mComponents[0] = tfcs_ID;
    }
    
    
    // Methods for field "sir_TimeslotList"
    public SIR_TimeslotList getSir_TimeslotList()
    {
	return (SIR_TimeslotList)mComponents[1];
    }
    
    public void setSir_TimeslotList(SIR_TimeslotList sir_TimeslotList)
    {
	mComponents[1] = sir_TimeslotList;
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
	    "SIR_MeasurementResults"
	),
	new QName (
	    "InformationElements",
	    "SIR-MeasurementResults"
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
				"TFCS_IdentityPlain"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-IdentityPlain"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TFCS_IdentityPlain(1), 
				    new TFCS_IdentityPlain(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "tfcs-ID",
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
				"SIR_TimeslotList"
			    ),
			    new QName (
				"InformationElements",
				"SIR-TimeslotList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(14),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(14)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SIR"
				)
			    )
			)
		    ),
		    "sir-TimeslotList",
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
     * Get the type descriptor (TypeInfo) of 'this' SIR_MeasurementResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SIR_MeasurementResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SIR_MeasurementResults
