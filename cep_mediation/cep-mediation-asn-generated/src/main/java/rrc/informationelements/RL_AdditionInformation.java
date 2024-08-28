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
 * Define the ASN1 Type RL_AdditionInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RL_AdditionInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public RL_AdditionInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RL_AdditionInformation(PrimaryCPICH_Info primaryCPICH_Info, 
		    DL_DPCH_InfoPerRL dl_DPCH_InfoPerRL, BOOLEAN dummy, 
		    SCCPCH_InfoForFACH dummy2)
    {
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setDl_DPCH_InfoPerRL(dl_DPCH_InfoPerRL);
	setDummy(dummy);
	setDummy2(dummy2);
    }
    
    /**
     * Construct with components.
     */
    public RL_AdditionInformation(PrimaryCPICH_Info primaryCPICH_Info, 
		    DL_DPCH_InfoPerRL dl_DPCH_InfoPerRL, boolean dummy, 
		    SCCPCH_InfoForFACH dummy2)
    {
	this(primaryCPICH_Info, dl_DPCH_InfoPerRL, new BOOLEAN(dummy), 
	     dummy2);
    }
    
    /**
     * Construct with required components.
     */
    public RL_AdditionInformation(PrimaryCPICH_Info primaryCPICH_Info, 
		    DL_DPCH_InfoPerRL dl_DPCH_InfoPerRL, boolean dummy)
    {
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setDl_DPCH_InfoPerRL(dl_DPCH_InfoPerRL);
	setDummy(dummy);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrimaryCPICH_Info();
	mComponents[1] = new DL_DPCH_InfoPerRL();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new SCCPCH_InfoForFACH();
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
		return new PrimaryCPICH_Info();
	    case 1:
		return new DL_DPCH_InfoPerRL();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new SCCPCH_InfoForFACH();
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
    
    
    // Methods for field "dl_DPCH_InfoPerRL"
    public DL_DPCH_InfoPerRL getDl_DPCH_InfoPerRL()
    {
	return (DL_DPCH_InfoPerRL)mComponents[1];
    }
    
    public void setDl_DPCH_InfoPerRL(DL_DPCH_InfoPerRL dl_DPCH_InfoPerRL)
    {
	mComponents[1] = dl_DPCH_InfoPerRL;
    }
    
    
    // Methods for field "dummy"
    public boolean getDummy()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setDummy(boolean dummy)
    {
	setDummy(new BOOLEAN(dummy));
    }
    
    public void setDummy(BOOLEAN dummy)
    {
	mComponents[2] = dummy;
    }
    
    
    // Methods for field "dummy2"
    public SCCPCH_InfoForFACH getDummy2()
    {
	return (SCCPCH_InfoForFACH)mComponents[3];
    }
    
    public void setDummy2(SCCPCH_InfoForFACH dummy2)
    {
	mComponents[3] = dummy2;
    }
    
    public boolean hasDummy2()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDummy2()
    {
	setComponentAbsent(3);
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
	    "RL_AdditionInformation"
	),
	new QName (
	    "InformationElements",
	    "RL-AdditionInformation"
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
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_DPCH_InfoPerRL"
			    ),
			    new QName (
				"InformationElements",
				"DL-DPCH-InfoPerRL"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_InfoPerRL"
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
		    "dl-DPCH-InfoPerRL",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "dummy",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SCCPCH_InfoForFACH"
			    ),
			    new QName (
				"InformationElements",
				"SCCPCH-InfoForFACH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SCCPCH_InfoForFACH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SCCPCH_InfoForFACH"
				)
			    ),
			    0
			)
		    ),
		    "dummy2",
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' RL_AdditionInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RL_AdditionInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RL_AdditionInformation
