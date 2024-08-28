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
 * Define the ASN1 Type MAC_d_FlowIdentityDCHandHSDSCH from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MAC_d_FlowIdentityDCHandHSDSCH extends Sequence {
    
    /**
     * The default constructor.
     */
    public MAC_d_FlowIdentityDCHandHSDSCH()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MAC_d_FlowIdentityDCHandHSDSCH(TransportChannelIdentity dch_transport_ch_id, 
		    MAC_d_FlowIdentity hsdsch_mac_d_flow_id)
    {
	setDch_transport_ch_id(dch_transport_ch_id);
	setHsdsch_mac_d_flow_id(hsdsch_mac_d_flow_id);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TransportChannelIdentity();
	mComponents[1] = new MAC_d_FlowIdentity();
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
		return new TransportChannelIdentity();
	    case 1:
		return new MAC_d_FlowIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dch_transport_ch_id"
    public TransportChannelIdentity getDch_transport_ch_id()
    {
	return (TransportChannelIdentity)mComponents[0];
    }
    
    public void setDch_transport_ch_id(TransportChannelIdentity dch_transport_ch_id)
    {
	mComponents[0] = dch_transport_ch_id;
    }
    
    
    // Methods for field "hsdsch_mac_d_flow_id"
    public MAC_d_FlowIdentity getHsdsch_mac_d_flow_id()
    {
	return (MAC_d_FlowIdentity)mComponents[1];
    }
    
    public void setHsdsch_mac_d_flow_id(MAC_d_FlowIdentity hsdsch_mac_d_flow_id)
    {
	mComponents[1] = hsdsch_mac_d_flow_id;
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
	    "MAC_d_FlowIdentityDCHandHSDSCH"
	),
	new QName (
	    "InformationElements",
	    "MAC-d-FlowIdentityDCHandHSDSCH"
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
				"TransportChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransportChannelIdentity(1), 
				    new TransportChannelIdentity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "dch-transport-ch-id",
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
				"MAC_d_FlowIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MAC-d-FlowIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MAC_d_FlowIdentity(0), 
				    new MAC_d_FlowIdentity(7),
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
		    "hsdsch-mac-d-flow-id",
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
     * Get the type descriptor (TypeInfo) of 'this' MAC_d_FlowIdentityDCHandHSDSCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MAC_d_FlowIdentityDCHandHSDSCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MAC_d_FlowIdentityDCHandHSDSCH
