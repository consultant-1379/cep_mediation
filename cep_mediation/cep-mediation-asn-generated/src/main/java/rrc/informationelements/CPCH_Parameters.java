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
 * Define the ASN1 Type CPCH_Parameters from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CPCH_Parameters extends Sequence {
    
    /**
     * The default constructor.
     */
    public CPCH_Parameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CPCH_Parameters(InitialPriorityDelayList initialPriorityDelayList, 
		    BackoffControlParams backoffControlParams, 
		    PowerControlAlgorithm powerControlAlgorithm, 
		    DL_DPCCH_BER dl_DPCCH_BER)
    {
	setInitialPriorityDelayList(initialPriorityDelayList);
	setBackoffControlParams(backoffControlParams);
	setPowerControlAlgorithm(powerControlAlgorithm);
	setDl_DPCCH_BER(dl_DPCCH_BER);
    }
    
    /**
     * Construct with required components.
     */
    public CPCH_Parameters(BackoffControlParams backoffControlParams, 
		    PowerControlAlgorithm powerControlAlgorithm, 
		    DL_DPCCH_BER dl_DPCCH_BER)
    {
	setBackoffControlParams(backoffControlParams);
	setPowerControlAlgorithm(powerControlAlgorithm);
	setDl_DPCCH_BER(dl_DPCCH_BER);
    }
    
    public void initComponents()
    {
	mComponents[0] = new InitialPriorityDelayList();
	mComponents[1] = new BackoffControlParams();
	mComponents[2] = new PowerControlAlgorithm();
	mComponents[3] = new DL_DPCCH_BER();
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
		return new InitialPriorityDelayList();
	    case 1:
		return new BackoffControlParams();
	    case 2:
		return new PowerControlAlgorithm();
	    case 3:
		return new DL_DPCCH_BER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "initialPriorityDelayList"
    public InitialPriorityDelayList getInitialPriorityDelayList()
    {
	return (InitialPriorityDelayList)mComponents[0];
    }
    
    public void setInitialPriorityDelayList(InitialPriorityDelayList initialPriorityDelayList)
    {
	mComponents[0] = initialPriorityDelayList;
    }
    
    public boolean hasInitialPriorityDelayList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInitialPriorityDelayList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "backoffControlParams"
    public BackoffControlParams getBackoffControlParams()
    {
	return (BackoffControlParams)mComponents[1];
    }
    
    public void setBackoffControlParams(BackoffControlParams backoffControlParams)
    {
	mComponents[1] = backoffControlParams;
    }
    
    
    // Methods for field "powerControlAlgorithm"
    public PowerControlAlgorithm getPowerControlAlgorithm()
    {
	return (PowerControlAlgorithm)mComponents[2];
    }
    
    public void setPowerControlAlgorithm(PowerControlAlgorithm powerControlAlgorithm)
    {
	mComponents[2] = powerControlAlgorithm;
    }
    
    
    // Methods for field "dl_DPCCH_BER"
    public DL_DPCCH_BER getDl_DPCCH_BER()
    {
	return (DL_DPCCH_BER)mComponents[3];
    }
    
    public void setDl_DPCCH_BER(DL_DPCCH_BER dl_DPCCH_BER)
    {
	mComponents[3] = dl_DPCCH_BER;
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
	    "CPCH_Parameters"
	),
	new QName (
	    "InformationElements",
	    "CPCH-Parameters"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InitialPriorityDelayList"
			    ),
			    new QName (
				"InformationElements",
				"InitialPriorityDelayList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "NS_IP"
				)
			    )
			)
		    ),
		    "initialPriorityDelayList",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"BackoffControlParams"
			    ),
			    new QName (
				"InformationElements",
				"BackoffControlParams"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "BackoffControlParams"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "BackoffControlParams"
				)
			    ),
			    0
			)
		    ),
		    "backoffControlParams",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
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
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PowerControlAlgorithm"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "powerControlAlgorithm",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_DPCCH_BER"
			    ),
			    new QName (
				"InformationElements",
				"DL-DPCCH-BER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DL_DPCCH_BER(0), 
				    new DL_DPCCH_BER(63),
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
		    "dl-DPCCH-BER",
		    3,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' CPCH_Parameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CPCH_Parameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CPCH_Parameters
