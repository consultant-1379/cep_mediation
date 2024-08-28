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
 * Define the ASN1 Type LoggedGSMCellInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedGSMCellInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedGSMCellInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedGSMCellInfo(PLMN_Identity plmn_Identity, BitString lac, 
		    BitString gsmCellIdentity, BCCH_ARFCN bcch_ARFCN, 
		    Frequency_Band bandIndicator, BSIC bsic)
    {
	setPlmn_Identity(plmn_Identity);
	setLac(lac);
	setGsmCellIdentity(gsmCellIdentity);
	setBcch_ARFCN(bcch_ARFCN);
	setBandIndicator(bandIndicator);
	setBsic(bsic);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PLMN_Identity();
	mComponents[1] = new BitString();
	mComponents[2] = new BitString();
	mComponents[3] = new BCCH_ARFCN();
	mComponents[4] = Frequency_Band.dcs1800BandUsed;
	mComponents[5] = new BSIC();
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
		return new PLMN_Identity();
	    case 1:
		return new BitString();
	    case 2:
		return new BitString();
	    case 3:
		return new BCCH_ARFCN();
	    case 4:
		return Frequency_Band.dcs1800BandUsed;
	    case 5:
		return new BSIC();
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
    
    
    // Methods for field "lac"
    public BitString getLac()
    {
	return (BitString)mComponents[1];
    }
    
    public void setLac(BitString lac)
    {
	mComponents[1] = lac;
    }
    
    
    // Methods for field "gsmCellIdentity"
    public BitString getGsmCellIdentity()
    {
	return (BitString)mComponents[2];
    }
    
    public void setGsmCellIdentity(BitString gsmCellIdentity)
    {
	mComponents[2] = gsmCellIdentity;
    }
    
    
    // Methods for field "bcch_ARFCN"
    public BCCH_ARFCN getBcch_ARFCN()
    {
	return (BCCH_ARFCN)mComponents[3];
    }
    
    public void setBcch_ARFCN(BCCH_ARFCN bcch_ARFCN)
    {
	mComponents[3] = bcch_ARFCN;
    }
    
    
    // Methods for field "bandIndicator"
    public Frequency_Band getBandIndicator()
    {
	return (Frequency_Band)mComponents[4];
    }
    
    public void setBandIndicator(Frequency_Band bandIndicator)
    {
	mComponents[4] = bandIndicator;
    }
    
    
    // Methods for field "bsic"
    public BSIC getBsic()
    {
	return (BSIC)mComponents[5];
    }
    
    public void setBsic(BSIC bsic)
    {
	mComponents[5] = bsic;
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
	    "LoggedGSMCellInfo"
	),
	new QName (
	    "InformationElements",
	    "LoggedGSMCellInfo"
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
		    "lac",
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
		    "gsmCellIdentity",
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
				"BCCH_ARFCN"
			    ),
			    new QName (
				"InformationElements",
				"BCCH-ARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new BCCH_ARFCN(0), 
				    new BCCH_ARFCN(1023),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1023)
			    ),
			    null
			)
		    ),
		    "bcch-ARFCN",
		    3,
		    2,
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
				"Frequency_Band"
			    ),
			    new QName (
				"InformationElements",
				"Frequency-Band"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dcs1800BandUsed",
					0
				    ),
				    new MemberListElement (
					"pcs1900BandUsed",
					1
				    )
				}
			    ),
			    0,
			    Frequency_Band.dcs1800BandUsed
			)
		    ),
		    "bandIndicator",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"BSIC"
			    ),
			    new QName (
				"InformationElements",
				"BSIC"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "BSIC"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "BSIC"
				)
			    ),
			    0
			)
		    ),
		    "bsic",
		    5,
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
     * Get the type descriptor (TypeInfo) of 'this' LoggedGSMCellInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedGSMCellInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedGSMCellInfo
