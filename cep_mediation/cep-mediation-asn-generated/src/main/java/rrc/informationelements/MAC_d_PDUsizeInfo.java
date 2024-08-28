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
 * Define the ASN1 Type MAC_d_PDUsizeInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MAC_d_PDUsizeInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public MAC_d_PDUsizeInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MAC_d_PDUsizeInfo(INTEGER mac_d_PDU_Size, INTEGER mac_d_PDU_Index)
    {
	setMac_d_PDU_Size(mac_d_PDU_Size);
	setMac_d_PDU_Index(mac_d_PDU_Index);
    }
    
    /**
     * Construct with components.
     */
    public MAC_d_PDUsizeInfo(long mac_d_PDU_Size, long mac_d_PDU_Index)
    {
	this(new INTEGER(mac_d_PDU_Size), new INTEGER(mac_d_PDU_Index));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mac_d_PDU_Size"
    public long getMac_d_PDU_Size()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMac_d_PDU_Size(long mac_d_PDU_Size)
    {
	setMac_d_PDU_Size(new INTEGER(mac_d_PDU_Size));
    }
    
    public void setMac_d_PDU_Size(INTEGER mac_d_PDU_Size)
    {
	mComponents[0] = mac_d_PDU_Size;
    }
    
    
    // Methods for field "mac_d_PDU_Index"
    public long getMac_d_PDU_Index()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setMac_d_PDU_Index(long mac_d_PDU_Index)
    {
	setMac_d_PDU_Index(new INTEGER(mac_d_PDU_Index));
    }
    
    public void setMac_d_PDU_Index(INTEGER mac_d_PDU_Index)
    {
	mComponents[1] = mac_d_PDU_Index;
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
	    "MAC_d_PDUsizeInfo"
	),
	new QName (
	    "InformationElements",
	    "MAC-d-PDUsizeInfo"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(5000),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(5000)
			    ),
			    null
			)
		    ),
		    "mac-d-PDU-Size",
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(7),
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
		    "mac-d-PDU-Index",
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
     * Get the type descriptor (TypeInfo) of 'this' MAC_d_PDUsizeInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MAC_d_PDUsizeInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MAC_d_PDUsizeInfo
