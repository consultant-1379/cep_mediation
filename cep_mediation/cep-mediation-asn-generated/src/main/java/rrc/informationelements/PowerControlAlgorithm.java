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
 * Define the ASN1 Type PowerControlAlgorithm from ASN1 Module InformationElements.
 * @see Choice
 */

public class PowerControlAlgorithm extends Choice {
    
    /**
     * The default constructor.
     */
    public PowerControlAlgorithm()
    {
    }
    
    public static final  int  algorithm1_chosen = 1;
    public static final  int  algorithm2_chosen = 2;
    
    // Methods for field "algorithm1"
    public static PowerControlAlgorithm createPowerControlAlgorithmWithAlgorithm1(long algorithm1)
    {
	return createPowerControlAlgorithmWithAlgorithm1(new TPC_StepSizeFDD(algorithm1));
    }
    
    public static PowerControlAlgorithm createPowerControlAlgorithmWithAlgorithm1(TPC_StepSizeFDD algorithm1)
    {
	PowerControlAlgorithm __object = new PowerControlAlgorithm();

	__object.setAlgorithm1(algorithm1);
	return __object;
    }
    
    public boolean hasAlgorithm1()
    {
	return getChosenFlag() == algorithm1_chosen;
    }
    
    public void setAlgorithm1(long algorithm1)
    {
	setAlgorithm1(new TPC_StepSizeFDD(algorithm1));
    }
    
    public void setAlgorithm1(TPC_StepSizeFDD algorithm1)
    {
	setChosenValue(algorithm1);
	setChosenFlag(algorithm1_chosen);
    }
    
    
    // Methods for field "algorithm2"
    public static PowerControlAlgorithm createPowerControlAlgorithmWithAlgorithm2(Null algorithm2)
    {
	PowerControlAlgorithm __object = new PowerControlAlgorithm();

	__object.setAlgorithm2(algorithm2);
	return __object;
    }
    
    public boolean hasAlgorithm2()
    {
	return getChosenFlag() == algorithm2_chosen;
    }
    
    public void setAlgorithm2(Null algorithm2)
    {
	setChosenValue(algorithm2);
	setChosenFlag(algorithm2_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case algorithm1_chosen:
		return new TPC_StepSizeFDD();
	    case algorithm2_chosen:
		return new Null();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "PowerControlAlgorithm"
	),
	new QName (
	    "InformationElements",
	    "PowerControlAlgorithm"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TPC_StepSizeFDD"
			    ),
			    new QName (
				"InformationElements",
				"TPC-StepSizeFDD"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TPC_StepSizeFDD(0), 
				    new TPC_StepSizeFDD(1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "algorithm1",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "algorithm2",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PowerControlAlgorithm object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PowerControlAlgorithm object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PowerControlAlgorithm
