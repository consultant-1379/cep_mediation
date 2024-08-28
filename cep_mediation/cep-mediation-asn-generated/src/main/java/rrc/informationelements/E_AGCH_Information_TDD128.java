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
 * Define the ASN1 Type E_AGCH_Information_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_AGCH_Information_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_AGCH_Information_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_AGCH_Information_TDD128(BOOLEAN rdi_Indicator, 
		    TPC_StepSizeTDD tpc_StepSize, 
		    E_AGCH_Set_Config_LCR e_AGCH_Set_Config, 
		    Bler_Target e_AGCH_BLER_Target)
    {
	setRdi_Indicator(rdi_Indicator);
	setTpc_StepSize(tpc_StepSize);
	setE_AGCH_Set_Config(e_AGCH_Set_Config);
	setE_AGCH_BLER_Target(e_AGCH_BLER_Target);
    }
    
    /**
     * Construct with components.
     */
    public E_AGCH_Information_TDD128(boolean rdi_Indicator, 
		    TPC_StepSizeTDD tpc_StepSize, 
		    E_AGCH_Set_Config_LCR e_AGCH_Set_Config, 
		    Bler_Target e_AGCH_BLER_Target)
    {
	this(new BOOLEAN(rdi_Indicator), tpc_StepSize, e_AGCH_Set_Config, 
	     e_AGCH_BLER_Target);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new TPC_StepSizeTDD();
	mComponents[2] = new E_AGCH_Set_Config_LCR();
	mComponents[3] = new Bler_Target();
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
		return new BOOLEAN();
	    case 1:
		return new TPC_StepSizeTDD();
	    case 2:
		return new E_AGCH_Set_Config_LCR();
	    case 3:
		return new Bler_Target();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rdi_Indicator"
    public boolean getRdi_Indicator()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setRdi_Indicator(boolean rdi_Indicator)
    {
	setRdi_Indicator(new BOOLEAN(rdi_Indicator));
    }
    
    public void setRdi_Indicator(BOOLEAN rdi_Indicator)
    {
	mComponents[0] = rdi_Indicator;
    }
    
    
    // Methods for field "tpc_StepSize"
    public TPC_StepSizeTDD getTpc_StepSize()
    {
	return (TPC_StepSizeTDD)mComponents[1];
    }
    
    public void setTpc_StepSize(TPC_StepSizeTDD tpc_StepSize)
    {
	mComponents[1] = tpc_StepSize;
    }
    
    
    // Methods for field "e_AGCH_Set_Config"
    public E_AGCH_Set_Config_LCR getE_AGCH_Set_Config()
    {
	return (E_AGCH_Set_Config_LCR)mComponents[2];
    }
    
    public void setE_AGCH_Set_Config(E_AGCH_Set_Config_LCR e_AGCH_Set_Config)
    {
	mComponents[2] = e_AGCH_Set_Config;
    }
    
    
    // Methods for field "e_AGCH_BLER_Target"
    public Bler_Target getE_AGCH_BLER_Target()
    {
	return (Bler_Target)mComponents[3];
    }
    
    public void setE_AGCH_BLER_Target(Bler_Target e_AGCH_BLER_Target)
    {
	mComponents[3] = e_AGCH_BLER_Target;
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
	    "E_AGCH_Information_TDD128"
	),
	new QName (
	    "InformationElements",
	    "E-AGCH-Information-TDD128"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "rdi-Indicator",
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
		    "tpc-StepSize",
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
				"E_AGCH_Set_Config_LCR"
			    ),
			    new QName (
				"InformationElements",
				"E-AGCH-Set-Config-LCR"
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
				    "E_AGCH_Individual_LCR"
				)
			    )
			)
		    ),
		    "e-AGCH-Set-Config",
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
				"Bler_Target"
			    ),
			    new QName (
				"InformationElements",
				"Bler-Target"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Bler_Target(-63), 
				    new Bler_Target(0),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-63),
				new java.lang.Long(0)
			    ),
			    null
			)
		    ),
		    "e-AGCH-BLER-Target",
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
     * Get the type descriptor (TypeInfo) of 'this' E_AGCH_Information_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_AGCH_Information_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_AGCH_Information_TDD128
