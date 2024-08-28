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
 * Define the ASN1 Type Common_E_DCH_MAC_d_Flow from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Common_E_DCH_MAC_d_Flow extends Sequence {
    
    /**
     * The default constructor.
     */
    public Common_E_DCH_MAC_d_Flow()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Common_E_DCH_MAC_d_Flow(E_DCH_MAC_d_FlowIdentity mac_d_FlowIdentity, 
		    E_DCH_MAC_d_FlowPowerOffset mac_d_FlowPowerOffset, 
		    E_DCH_MAC_d_FlowMaxRetrans mac_d_FlowMaxRetrans, 
		    E_DCH_MAC_d_FlowMultiplexingList mac_d_FlowMultiplexingList, 
		    E_DCH_MAC_d_FlowRetransTimer e_dch_mac_d_flow_retransmission_timer)
    {
	setMac_d_FlowIdentity(mac_d_FlowIdentity);
	setMac_d_FlowPowerOffset(mac_d_FlowPowerOffset);
	setMac_d_FlowMaxRetrans(mac_d_FlowMaxRetrans);
	setMac_d_FlowMultiplexingList(mac_d_FlowMultiplexingList);
	setE_dch_mac_d_flow_retransmission_timer(e_dch_mac_d_flow_retransmission_timer);
    }
    
    /**
     * Construct with required components.
     */
    public Common_E_DCH_MAC_d_Flow(E_DCH_MAC_d_FlowIdentity mac_d_FlowIdentity, 
		    E_DCH_MAC_d_FlowPowerOffset mac_d_FlowPowerOffset, 
		    E_DCH_MAC_d_FlowMaxRetrans mac_d_FlowMaxRetrans)
    {
	setMac_d_FlowIdentity(mac_d_FlowIdentity);
	setMac_d_FlowPowerOffset(mac_d_FlowPowerOffset);
	setMac_d_FlowMaxRetrans(mac_d_FlowMaxRetrans);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_DCH_MAC_d_FlowIdentity();
	mComponents[1] = new E_DCH_MAC_d_FlowPowerOffset();
	mComponents[2] = new E_DCH_MAC_d_FlowMaxRetrans();
	mComponents[3] = new E_DCH_MAC_d_FlowMultiplexingList();
	mComponents[4] = E_DCH_MAC_d_FlowRetransTimer.ms10;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new E_DCH_MAC_d_FlowIdentity();
	    case 1:
		return new E_DCH_MAC_d_FlowPowerOffset();
	    case 2:
		return new E_DCH_MAC_d_FlowMaxRetrans();
	    case 3:
		return new E_DCH_MAC_d_FlowMultiplexingList();
	    case 4:
		return E_DCH_MAC_d_FlowRetransTimer.ms10;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mac_d_FlowIdentity"
    public E_DCH_MAC_d_FlowIdentity getMac_d_FlowIdentity()
    {
	return (E_DCH_MAC_d_FlowIdentity)mComponents[0];
    }
    
    public void setMac_d_FlowIdentity(E_DCH_MAC_d_FlowIdentity mac_d_FlowIdentity)
    {
	mComponents[0] = mac_d_FlowIdentity;
    }
    
    
    // Methods for field "mac_d_FlowPowerOffset"
    public E_DCH_MAC_d_FlowPowerOffset getMac_d_FlowPowerOffset()
    {
	return (E_DCH_MAC_d_FlowPowerOffset)mComponents[1];
    }
    
    public void setMac_d_FlowPowerOffset(E_DCH_MAC_d_FlowPowerOffset mac_d_FlowPowerOffset)
    {
	mComponents[1] = mac_d_FlowPowerOffset;
    }
    
    
    // Methods for field "mac_d_FlowMaxRetrans"
    public E_DCH_MAC_d_FlowMaxRetrans getMac_d_FlowMaxRetrans()
    {
	return (E_DCH_MAC_d_FlowMaxRetrans)mComponents[2];
    }
    
    public void setMac_d_FlowMaxRetrans(E_DCH_MAC_d_FlowMaxRetrans mac_d_FlowMaxRetrans)
    {
	mComponents[2] = mac_d_FlowMaxRetrans;
    }
    
    
    // Methods for field "mac_d_FlowMultiplexingList"
    public E_DCH_MAC_d_FlowMultiplexingList getMac_d_FlowMultiplexingList()
    {
	return (E_DCH_MAC_d_FlowMultiplexingList)mComponents[3];
    }
    
    public void setMac_d_FlowMultiplexingList(E_DCH_MAC_d_FlowMultiplexingList mac_d_FlowMultiplexingList)
    {
	mComponents[3] = mac_d_FlowMultiplexingList;
    }
    
    public boolean hasMac_d_FlowMultiplexingList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMac_d_FlowMultiplexingList()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "e_dch_mac_d_flow_retransmission_timer"
    public E_DCH_MAC_d_FlowRetransTimer getE_dch_mac_d_flow_retransmission_timer()
    {
	return (E_DCH_MAC_d_FlowRetransTimer)mComponents[4];
    }
    
    public void setE_dch_mac_d_flow_retransmission_timer(E_DCH_MAC_d_FlowRetransTimer e_dch_mac_d_flow_retransmission_timer)
    {
	mComponents[4] = e_dch_mac_d_flow_retransmission_timer;
    }
    
    public boolean hasE_dch_mac_d_flow_retransmission_timer()
    {
	return componentIsPresent(4);
    }
    
    public void deleteE_dch_mac_d_flow_retransmission_timer()
    {
	setComponentAbsent(4);
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
	    "Common_E_DCH_MAC_d_Flow"
	),
	new QName (
	    "InformationElements",
	    "Common-E-DCH-MAC-d-Flow"
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
				"E_DCH_MAC_d_FlowIdentity"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MAC-d-FlowIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DCH_MAC_d_FlowIdentity(0), 
				    new E_DCH_MAC_d_FlowIdentity(7),
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
		    "mac-d-FlowIdentity",
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
				"E_DCH_MAC_d_FlowPowerOffset"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MAC-d-FlowPowerOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DCH_MAC_d_FlowPowerOffset(0), 
				    new E_DCH_MAC_d_FlowPowerOffset(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "mac-d-FlowPowerOffset",
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
				"E_DCH_MAC_d_FlowMaxRetrans"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MAC-d-FlowMaxRetrans"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DCH_MAC_d_FlowMaxRetrans(0), 
				    new E_DCH_MAC_d_FlowMaxRetrans(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "mac-d-FlowMaxRetrans",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DCH_MAC_d_FlowMultiplexingList"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MAC-d-FlowMultiplexingList"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "mac-d-FlowMultiplexingList",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DCH_MAC_d_FlowRetransTimer"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MAC-d-FlowRetransTimer"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms10",
					0
				    ),
				    new MemberListElement (
					"ms15",
					1
				    ),
				    new MemberListElement (
					"ms20",
					2
				    ),
				    new MemberListElement (
					"ms25",
					3
				    ),
				    new MemberListElement (
					"ms30",
					4
				    ),
				    new MemberListElement (
					"ms35",
					5
				    ),
				    new MemberListElement (
					"ms40",
					6
				    ),
				    new MemberListElement (
					"ms45",
					7
				    ),
				    new MemberListElement (
					"ms50",
					8
				    ),
				    new MemberListElement (
					"ms55",
					9
				    ),
				    new MemberListElement (
					"ms60",
					10
				    ),
				    new MemberListElement (
					"ms65",
					11
				    ),
				    new MemberListElement (
					"ms70",
					12
				    ),
				    new MemberListElement (
					"ms75",
					13
				    ),
				    new MemberListElement (
					"ms80",
					14
				    ),
				    new MemberListElement (
					"ms85",
					15
				    ),
				    new MemberListElement (
					"ms90",
					16
				    ),
				    new MemberListElement (
					"ms95",
					17
				    ),
				    new MemberListElement (
					"ms100",
					18
				    ),
				    new MemberListElement (
					"ms110",
					19
				    ),
				    new MemberListElement (
					"ms120",
					20
				    ),
				    new MemberListElement (
					"ms140",
					21
				    ),
				    new MemberListElement (
					"ms160",
					22
				    ),
				    new MemberListElement (
					"ms200",
					23
				    ),
				    new MemberListElement (
					"ms240",
					24
				    ),
				    new MemberListElement (
					"ms280",
					25
				    ),
				    new MemberListElement (
					"ms320",
					26
				    ),
				    new MemberListElement (
					"ms400",
					27
				    ),
				    new MemberListElement (
					"ms480",
					28
				    ),
				    new MemberListElement (
					"ms560",
					29
				    )
				}
			    ),
			    0,
			    E_DCH_MAC_d_FlowRetransTimer.ms10
			)
		    ),
		    "e-dch-mac-d-flow-retransmission-timer",
		    4,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Common_E_DCH_MAC_d_Flow object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Common_E_DCH_MAC_d_Flow object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Common_E_DCH_MAC_d_Flow
