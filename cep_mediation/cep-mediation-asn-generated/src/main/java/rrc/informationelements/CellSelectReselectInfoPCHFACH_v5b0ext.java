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
 * Define the ASN1 Type CellSelectReselectInfoPCHFACH_v5b0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellSelectReselectInfoPCHFACH_v5b0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellSelectReselectInfoPCHFACH_v5b0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellSelectReselectInfoPCHFACH_v5b0ext(Q_Hyst_S_Fine q_Hyst_l_S_PCH, 
		    Q_Hyst_S_Fine q_Hyst_l_S_FACH, 
		    Q_Hyst_S_Fine q_Hyst_2_S_PCH, 
		    Q_Hyst_S_Fine q_Hyst_2_S_FACH, 
		    T_Reselection_S t_Reselection_S_PCH, 
		    T_Reselection_S_Fine t_Reselection_S_FACH)
    {
	setQ_Hyst_l_S_PCH(q_Hyst_l_S_PCH);
	setQ_Hyst_l_S_FACH(q_Hyst_l_S_FACH);
	setQ_Hyst_2_S_PCH(q_Hyst_2_S_PCH);
	setQ_Hyst_2_S_FACH(q_Hyst_2_S_FACH);
	setT_Reselection_S_PCH(t_Reselection_S_PCH);
	setT_Reselection_S_FACH(t_Reselection_S_FACH);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Q_Hyst_S_Fine();
	mComponents[1] = new Q_Hyst_S_Fine();
	mComponents[2] = new Q_Hyst_S_Fine();
	mComponents[3] = new Q_Hyst_S_Fine();
	mComponents[4] = new T_Reselection_S();
	mComponents[5] = new T_Reselection_S_Fine();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Q_Hyst_S_Fine();
	    case 1:
		return new Q_Hyst_S_Fine();
	    case 2:
		return new Q_Hyst_S_Fine();
	    case 3:
		return new Q_Hyst_S_Fine();
	    case 4:
		return new T_Reselection_S();
	    case 5:
		return new T_Reselection_S_Fine();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "q_Hyst_l_S_PCH"
    public Q_Hyst_S_Fine getQ_Hyst_l_S_PCH()
    {
	return (Q_Hyst_S_Fine)mComponents[0];
    }
    
    public void setQ_Hyst_l_S_PCH(Q_Hyst_S_Fine q_Hyst_l_S_PCH)
    {
	mComponents[0] = q_Hyst_l_S_PCH;
    }
    
    public boolean hasQ_Hyst_l_S_PCH()
    {
	return componentIsPresent(0);
    }
    
    public void deleteQ_Hyst_l_S_PCH()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "q_Hyst_l_S_FACH"
    public Q_Hyst_S_Fine getQ_Hyst_l_S_FACH()
    {
	return (Q_Hyst_S_Fine)mComponents[1];
    }
    
    public void setQ_Hyst_l_S_FACH(Q_Hyst_S_Fine q_Hyst_l_S_FACH)
    {
	mComponents[1] = q_Hyst_l_S_FACH;
    }
    
    public boolean hasQ_Hyst_l_S_FACH()
    {
	return componentIsPresent(1);
    }
    
    public void deleteQ_Hyst_l_S_FACH()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "q_Hyst_2_S_PCH"
    public Q_Hyst_S_Fine getQ_Hyst_2_S_PCH()
    {
	return (Q_Hyst_S_Fine)mComponents[2];
    }
    
    public void setQ_Hyst_2_S_PCH(Q_Hyst_S_Fine q_Hyst_2_S_PCH)
    {
	mComponents[2] = q_Hyst_2_S_PCH;
    }
    
    public boolean hasQ_Hyst_2_S_PCH()
    {
	return componentIsPresent(2);
    }
    
    public void deleteQ_Hyst_2_S_PCH()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "q_Hyst_2_S_FACH"
    public Q_Hyst_S_Fine getQ_Hyst_2_S_FACH()
    {
	return (Q_Hyst_S_Fine)mComponents[3];
    }
    
    public void setQ_Hyst_2_S_FACH(Q_Hyst_S_Fine q_Hyst_2_S_FACH)
    {
	mComponents[3] = q_Hyst_2_S_FACH;
    }
    
    public boolean hasQ_Hyst_2_S_FACH()
    {
	return componentIsPresent(3);
    }
    
    public void deleteQ_Hyst_2_S_FACH()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "t_Reselection_S_PCH"
    public T_Reselection_S getT_Reselection_S_PCH()
    {
	return (T_Reselection_S)mComponents[4];
    }
    
    public void setT_Reselection_S_PCH(T_Reselection_S t_Reselection_S_PCH)
    {
	mComponents[4] = t_Reselection_S_PCH;
    }
    
    public boolean hasT_Reselection_S_PCH()
    {
	return componentIsPresent(4);
    }
    
    public void deleteT_Reselection_S_PCH()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "t_Reselection_S_FACH"
    public T_Reselection_S_Fine getT_Reselection_S_FACH()
    {
	return (T_Reselection_S_Fine)mComponents[5];
    }
    
    public void setT_Reselection_S_FACH(T_Reselection_S_Fine t_Reselection_S_FACH)
    {
	mComponents[5] = t_Reselection_S_FACH;
    }
    
    public boolean hasT_Reselection_S_FACH()
    {
	return componentIsPresent(5);
    }
    
    public void deleteT_Reselection_S_FACH()
    {
	setComponentAbsent(5);
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
	    "CellSelectReselectInfoPCHFACH_v5b0ext"
	),
	new QName (
	    "InformationElements",
	    "CellSelectReselectInfoPCHFACH-v5b0ext"
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
				"Q_Hyst_S_Fine"
			    ),
			    new QName (
				"InformationElements",
				"Q-Hyst-S-Fine"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Q_Hyst_S_Fine(0), 
				    new Q_Hyst_S_Fine(40),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(40)
			    ),
			    null
			)
		    ),
		    "q-Hyst-l-S-PCH",
		    0,
		    3,
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
				"Q_Hyst_S_Fine"
			    ),
			    new QName (
				"InformationElements",
				"Q-Hyst-S-Fine"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Q_Hyst_S_Fine(0), 
				    new Q_Hyst_S_Fine(40),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(40)
			    ),
			    null
			)
		    ),
		    "q-Hyst-l-S-FACH",
		    1,
		    3,
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
				"Q_Hyst_S_Fine"
			    ),
			    new QName (
				"InformationElements",
				"Q-Hyst-S-Fine"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Q_Hyst_S_Fine(0), 
				    new Q_Hyst_S_Fine(40),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(40)
			    ),
			    null
			)
		    ),
		    "q-Hyst-2-S-PCH",
		    2,
		    3,
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
				"Q_Hyst_S_Fine"
			    ),
			    new QName (
				"InformationElements",
				"Q-Hyst-S-Fine"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Q_Hyst_S_Fine(0), 
				    new Q_Hyst_S_Fine(40),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(40)
			    ),
			    null
			)
		    ),
		    "q-Hyst-2-S-FACH",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_Reselection_S"
			    ),
			    new QName (
				"InformationElements",
				"T-Reselection-S"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new T_Reselection_S(0), 
				    new T_Reselection_S(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "t-Reselection-S-PCH",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_Reselection_S_Fine"
			    ),
			    new QName (
				"InformationElements",
				"T-Reselection-S-Fine"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new T_Reselection_S_Fine(0), 
				    new T_Reselection_S_Fine(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "t-Reselection-S-FACH",
		    5,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellSelectReselectInfoPCHFACH_v5b0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellSelectReselectInfoPCHFACH_v5b0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellSelectReselectInfoPCHFACH_v5b0ext
