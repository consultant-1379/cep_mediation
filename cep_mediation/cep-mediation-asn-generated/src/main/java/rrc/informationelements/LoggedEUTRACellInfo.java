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
 * Define the ASN1 Type LoggedEUTRACellInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedEUTRACellInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedEUTRACellInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedEUTRACellInfo(PLMN_Identity plmn_Identity, 
		    BitString trackingAreaCode, BitString eutraCellIdentity, 
		    EARFCN earfcn, 
		    EUTRA_PhysicalCellIdentity physicalCellIdentity)
    {
	setPlmn_Identity(plmn_Identity);
	setTrackingAreaCode(trackingAreaCode);
	setEutraCellIdentity(eutraCellIdentity);
	setEarfcn(earfcn);
	setPhysicalCellIdentity(physicalCellIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PLMN_Identity();
	mComponents[1] = new BitString();
	mComponents[2] = new BitString();
	mComponents[3] = new EARFCN();
	mComponents[4] = new EUTRA_PhysicalCellIdentity();
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
		return new PLMN_Identity();
	    case 1:
		return new BitString();
	    case 2:
		return new BitString();
	    case 3:
		return new EARFCN();
	    case 4:
		return new EUTRA_PhysicalCellIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "plmn_Identity"
    public PLMN_Identity getPlmn_Identity()
    {
	return (PLMN_Identity)mComponents[0];
    }
    
    public void setPlmn_Identity(PLMN_Identity plmn_Identity)
    {
	mComponents[0] = plmn_Identity;
    }
    
    
    // Methods for field "trackingAreaCode"
    public BitString getTrackingAreaCode()
    {
	return (BitString)mComponents[1];
    }
    
    public void setTrackingAreaCode(BitString trackingAreaCode)
    {
	mComponents[1] = trackingAreaCode;
    }
    
    
    // Methods for field "eutraCellIdentity"
    public BitString getEutraCellIdentity()
    {
	return (BitString)mComponents[2];
    }
    
    public void setEutraCellIdentity(BitString eutraCellIdentity)
    {
	mComponents[2] = eutraCellIdentity;
    }
    
    
    // Methods for field "earfcn"
    public EARFCN getEarfcn()
    {
	return (EARFCN)mComponents[3];
    }
    
    public void setEarfcn(EARFCN earfcn)
    {
	mComponents[3] = earfcn;
    }
    
    
    // Methods for field "physicalCellIdentity"
    public EUTRA_PhysicalCellIdentity getPhysicalCellIdentity()
    {
	return (EUTRA_PhysicalCellIdentity)mComponents[4];
    }
    
    public void setPhysicalCellIdentity(EUTRA_PhysicalCellIdentity physicalCellIdentity)
    {
	mComponents[4] = physicalCellIdentity;
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
	    "LoggedEUTRACellInfo"
	),
	new QName (
	    "InformationElements",
	    "LoggedEUTRACellInfo"
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
				"PLMN_Identity"
			    ),
			    new QName (
				"InformationElements",
				"PLMN-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Identity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Identity"
				)
			    ),
			    0
			)
		    ),
		    "plmn-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "trackingAreaCode",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "eutraCellIdentity",
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
				"EARFCN"
			    ),
			    new QName (
				"InformationElements",
				"EARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new EARFCN(0), 
				    new EARFCN(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "earfcn",
		    3,
		    2,
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
				"EUTRA_PhysicalCellIdentity"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-PhysicalCellIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new EUTRA_PhysicalCellIdentity(0), 
				    new EUTRA_PhysicalCellIdentity(503),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(503)
			    ),
			    null
			)
		    ),
		    "physicalCellIdentity",
		    4,
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
     * Get the type descriptor (TypeInfo) of 'this' LoggedEUTRACellInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedEUTRACellInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedEUTRACellInfo
