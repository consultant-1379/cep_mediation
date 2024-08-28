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
 * Define the ASN1 Type HCS_NeighbouringCellInformation_RSCP from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HCS_NeighbouringCellInformation_RSCP extends Sequence {
    
    /**
     * The default constructor.
     */
    public HCS_NeighbouringCellInformation_RSCP()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HCS_NeighbouringCellInformation_RSCP(HCS_PRIO hcs_PRIO, 
		    Q_HCS q_HCS, 
		    HCS_CellReselectInformation_RSCP hcs_CellReselectInformation)
    {
	setHcs_PRIO(hcs_PRIO);
	setQ_HCS(q_HCS);
	setHcs_CellReselectInformation(hcs_CellReselectInformation);
    }
    
    /**
     * Construct with required components.
     */
    public HCS_NeighbouringCellInformation_RSCP(HCS_CellReselectInformation_RSCP hcs_CellReselectInformation)
    {
	setHcs_CellReselectInformation(hcs_CellReselectInformation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HCS_PRIO();
	mComponents[1] = new Q_HCS();
	mComponents[2] = new HCS_CellReselectInformation_RSCP();
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
		return new HCS_PRIO();
	    case 1:
		return new Q_HCS();
	    case 2:
		return new HCS_CellReselectInformation_RSCP();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final HCS_PRIO hcs_PRIO__default = 
	new HCS_PRIO(0);
    public static final Q_HCS q_HCS__default = 
	new Q_HCS(0);
    
    // Methods for field "hcs_PRIO"
    public HCS_PRIO getHcs_PRIO()
    {
	if (hasHcs_PRIO())
	    return (HCS_PRIO)mComponents[0];
	else
	    return (HCS_PRIO)hcs_PRIO__default.clone();
    }
    
    public void setHcs_PRIO(HCS_PRIO hcs_PRIO)
    {
	mComponents[0] = hcs_PRIO;
    }
    
    public void setHcs_PRIOToDefault()
    {
	setHcs_PRIO(hcs_PRIO__default);
    }
    
    public boolean hasDefaultHcs_PRIO()
    {
	return true;
    }
    
    public boolean hasHcs_PRIO()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHcs_PRIO()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "q_HCS"
    public Q_HCS getQ_HCS()
    {
	if (hasQ_HCS())
	    return (Q_HCS)mComponents[1];
	else
	    return (Q_HCS)q_HCS__default.clone();
    }
    
    public void setQ_HCS(Q_HCS q_HCS)
    {
	mComponents[1] = q_HCS;
    }
    
    public void setQ_HCSToDefault()
    {
	setQ_HCS(q_HCS__default);
    }
    
    public boolean hasDefaultQ_HCS()
    {
	return true;
    }
    
    public boolean hasQ_HCS()
    {
	return componentIsPresent(1);
    }
    
    public void deleteQ_HCS()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "hcs_CellReselectInformation"
    public HCS_CellReselectInformation_RSCP getHcs_CellReselectInformation()
    {
	return (HCS_CellReselectInformation_RSCP)mComponents[2];
    }
    
    public void setHcs_CellReselectInformation(HCS_CellReselectInformation_RSCP hcs_CellReselectInformation)
    {
	mComponents[2] = hcs_CellReselectInformation;
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
	    "HCS_NeighbouringCellInformation_RSCP"
	),
	new QName (
	    "InformationElements",
	    "HCS-NeighbouringCellInformation-RSCP"
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
				"HCS_PRIO"
			    ),
			    new QName (
				"InformationElements",
				"HCS-PRIO"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new HCS_PRIO(0), 
				    new HCS_PRIO(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "hcs-PRIO",
		    0,
		    3,
		    hcs_PRIO__default
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
				"Q_HCS"
			    ),
			    new QName (
				"InformationElements",
				"Q-HCS"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Q_HCS(0), 
				    new Q_HCS(99),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(99)
			    ),
			    null
			)
		    ),
		    "q-HCS",
		    1,
		    3,
		    q_HCS__default
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
				"HCS_CellReselectInformation_RSCP"
			    ),
			    new QName (
				"InformationElements",
				"HCS-CellReselectInformation-RSCP"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HCS_CellReselectInformation_RSCP"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HCS_CellReselectInformation_RSCP"
				)
			    ),
			    0
			)
		    ),
		    "hcs-CellReselectInformation",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' HCS_NeighbouringCellInformation_RSCP object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HCS_NeighbouringCellInformation_RSCP object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HCS_NeighbouringCellInformation_RSCP
