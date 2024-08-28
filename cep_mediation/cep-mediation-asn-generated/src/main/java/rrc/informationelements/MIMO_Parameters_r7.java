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
 * Define the ASN1 Type MIMO_Parameters_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MIMO_Parameters_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MIMO_Parameters_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MIMO_Parameters_r7(MIMO_Operation mimoOperation, 
		    MIMO_N_M_Ratio mimoN_M_Ratio, 
		    MIMO_PilotConfiguration mimoPilotConfiguration)
    {
	setMimoOperation(mimoOperation);
	setMimoN_M_Ratio(mimoN_M_Ratio);
	setMimoPilotConfiguration(mimoPilotConfiguration);
    }
    
    /**
     * Construct with required components.
     */
    public MIMO_Parameters_r7(MIMO_Operation mimoOperation)
    {
	setMimoOperation(mimoOperation);
    }
    
    public void initComponents()
    {
	mComponents[0] = MIMO_Operation.start;
	mComponents[1] = MIMO_N_M_Ratio.mnm1_2;
	mComponents[2] = new MIMO_PilotConfiguration();
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
		return MIMO_Operation.start;
	    case 1:
		return MIMO_N_M_Ratio.mnm1_2;
	    case 2:
		return new MIMO_PilotConfiguration();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mimoOperation"
    public MIMO_Operation getMimoOperation()
    {
	return (MIMO_Operation)mComponents[0];
    }
    
    public void setMimoOperation(MIMO_Operation mimoOperation)
    {
	mComponents[0] = mimoOperation;
    }
    
    
    // Methods for field "mimoN_M_Ratio"
    public MIMO_N_M_Ratio getMimoN_M_Ratio()
    {
	return (MIMO_N_M_Ratio)mComponents[1];
    }
    
    public void setMimoN_M_Ratio(MIMO_N_M_Ratio mimoN_M_Ratio)
    {
	mComponents[1] = mimoN_M_Ratio;
    }
    
    public boolean hasMimoN_M_Ratio()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMimoN_M_Ratio()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "mimoPilotConfiguration"
    public MIMO_PilotConfiguration getMimoPilotConfiguration()
    {
	return (MIMO_PilotConfiguration)mComponents[2];
    }
    
    public void setMimoPilotConfiguration(MIMO_PilotConfiguration mimoPilotConfiguration)
    {
	mComponents[2] = mimoPilotConfiguration;
    }
    
    public boolean hasMimoPilotConfiguration()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMimoPilotConfiguration()
    {
	setComponentAbsent(2);
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
	    "MIMO_Parameters_r7"
	),
	new QName (
	    "InformationElements",
	    "MIMO-Parameters-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MIMO_Operation"
			    ),
			    new QName (
				"InformationElements",
				"MIMO-Operation"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"start",
					0
				    ),
				    new MemberListElement (
					"continue",
					1
				    )
				}
			    ),
			    0,
			    MIMO_Operation.start
			)
		    ),
		    "mimoOperation",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MIMO_N_M_Ratio"
			    ),
			    new QName (
				"InformationElements",
				"MIMO-N-M-Ratio"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mnm1-2",
					0
				    ),
				    new MemberListElement (
					"mnm2-3",
					1
				    ),
				    new MemberListElement (
					"mnm3-4",
					2
				    ),
				    new MemberListElement (
					"mnm4-5",
					3
				    ),
				    new MemberListElement (
					"mnm5-6",
					4
				    ),
				    new MemberListElement (
					"mnm6-7",
					5
				    ),
				    new MemberListElement (
					"mnm7-8",
					6
				    ),
				    new MemberListElement (
					"mnm8-9",
					7
				    ),
				    new MemberListElement (
					"mnm9-10",
					8
				    ),
				    new MemberListElement (
					"mnm1-1",
					9
				    )
				}
			    ),
			    0,
			    MIMO_N_M_Ratio.mnm1_2
			)
		    ),
		    "mimoN-M-Ratio",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MIMO_PilotConfiguration"
			    ),
			    new QName (
				"InformationElements",
				"MIMO-PilotConfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MIMO_PilotConfiguration"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MIMO_PilotConfiguration"
				)
			    ),
			    0
			)
		    ),
		    "mimoPilotConfiguration",
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' MIMO_Parameters_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MIMO_Parameters_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MIMO_Parameters_r7
