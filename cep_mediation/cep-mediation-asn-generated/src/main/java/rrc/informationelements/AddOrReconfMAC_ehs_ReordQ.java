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
 * Define the ASN1 Type AddOrReconfMAC_ehs_ReordQ from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AddOrReconfMAC_ehs_ReordQ extends Sequence {
    
    /**
     * The default constructor.
     */
    public AddOrReconfMAC_ehs_ReordQ()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AddOrReconfMAC_ehs_ReordQ(MAC_ehs_AddReconfReordQ_List mac_ehs_AddReconfQueue_List, 
		    MAC_ehs_DelReordQ_List dummy)
    {
	setMac_ehs_AddReconfQueue_List(mac_ehs_AddReconfQueue_List);
	setDummy(dummy);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MAC_ehs_AddReconfReordQ_List();
	mComponents[1] = new MAC_ehs_DelReordQ_List();
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
		return new MAC_ehs_AddReconfReordQ_List();
	    case 1:
		return new MAC_ehs_DelReordQ_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mac_ehs_AddReconfQueue_List"
    public MAC_ehs_AddReconfReordQ_List getMac_ehs_AddReconfQueue_List()
    {
	return (MAC_ehs_AddReconfReordQ_List)mComponents[0];
    }
    
    public void setMac_ehs_AddReconfQueue_List(MAC_ehs_AddReconfReordQ_List mac_ehs_AddReconfQueue_List)
    {
	mComponents[0] = mac_ehs_AddReconfQueue_List;
    }
    
    public boolean hasMac_ehs_AddReconfQueue_List()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMac_ehs_AddReconfQueue_List()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dummy"
    public MAC_ehs_DelReordQ_List getDummy()
    {
	return (MAC_ehs_DelReordQ_List)mComponents[1];
    }
    
    public void setDummy(MAC_ehs_DelReordQ_List dummy)
    {
	mComponents[1] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(1);
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
	    "AddOrReconfMAC_ehs_ReordQ"
	),
	new QName (
	    "InformationElements",
	    "AddOrReconfMAC-ehs-ReordQ"
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
				"MAC_ehs_AddReconfReordQ_List"
			    ),
			    new QName (
				"InformationElements",
				"MAC-ehs-AddReconfReordQ-List"
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
				    "MAC_ehs_AddReconfReordQ"
				)
			    )
			)
		    ),
		    "mac-ehs-AddReconfQueue-List",
		    0,
		    3,
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
				"MAC_ehs_DelReordQ_List"
			    ),
			    new QName (
				"InformationElements",
				"MAC-ehs-DelReordQ-List"
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
				    "MAC_ehs_DelReordQ"
				)
			    )
			)
		    ),
		    "dummy",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' AddOrReconfMAC_ehs_ReordQ object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AddOrReconfMAC_ehs_ReordQ object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AddOrReconfMAC_ehs_ReordQ
