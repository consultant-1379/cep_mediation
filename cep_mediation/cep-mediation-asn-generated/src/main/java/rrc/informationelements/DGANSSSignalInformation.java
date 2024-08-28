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
 * Define the ASN1 Type DGANSSSignalInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DGANSSSignalInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public DGANSSSignalInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DGANSSSignalInformation(INTEGER satId, BitString iode_dganss, 
		    UDRE udre, INTEGER ganss_prc, INTEGER ganss_rrc)
    {
	setSatId(satId);
	setIode_dganss(iode_dganss);
	setUdre(udre);
	setGanss_prc(ganss_prc);
	setGanss_rrc(ganss_rrc);
    }
    
    /**
     * Construct with components.
     */
    public DGANSSSignalInformation(long satId, BitString iode_dganss, 
		    UDRE udre, long ganss_prc, long ganss_rrc)
    {
	this(new INTEGER(satId), iode_dganss, udre, 
	     new INTEGER(ganss_prc), new INTEGER(ganss_rrc));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new BitString();
	mComponents[2] = UDRE.lessThan1;
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new BitString();
	    case 2:
		return UDRE.lessThan1;
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "satId"
    public long getSatId()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSatId(long satId)
    {
	setSatId(new INTEGER(satId));
    }
    
    public void setSatId(INTEGER satId)
    {
	mComponents[0] = satId;
    }
    
    
    // Methods for field "iode_dganss"
    public BitString getIode_dganss()
    {
	return (BitString)mComponents[1];
    }
    
    public void setIode_dganss(BitString iode_dganss)
    {
	mComponents[1] = iode_dganss;
    }
    
    
    // Methods for field "udre"
    public UDRE getUdre()
    {
	return (UDRE)mComponents[2];
    }
    
    public void setUdre(UDRE udre)
    {
	mComponents[2] = udre;
    }
    
    
    // Methods for field "ganss_prc"
    public long getGanss_prc()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setGanss_prc(long ganss_prc)
    {
	setGanss_prc(new INTEGER(ganss_prc));
    }
    
    public void setGanss_prc(INTEGER ganss_prc)
    {
	mComponents[3] = ganss_prc;
    }
    
    
    // Methods for field "ganss_rrc"
    public long getGanss_rrc()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setGanss_rrc(long ganss_rrc)
    {
	setGanss_rrc(new INTEGER(ganss_rrc));
    }
    
    public void setGanss_rrc(INTEGER ganss_rrc)
    {
	mComponents[4] = ganss_rrc;
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
	    "DGANSSSignalInformation"
	),
	new QName (
	    "InformationElements",
	    "DGANSSSignalInformation"
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "satId",
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
				    new com.oss.asn1.INTEGER(10)
				)
			    ),
			    new Bounds (
				new java.lang.Long(10),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "iode-dganss",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UDRE"
			    ),
			    new QName (
				"InformationElements",
				"UDRE"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"lessThan1",
					0
				    ),
				    new MemberListElement (
					"between1-and-4",
					1
				    ),
				    new MemberListElement (
					"between4-and-8",
					2
				    ),
				    new MemberListElement (
					"over8",
					3
				    )
				}
			    ),
			    0,
			    UDRE.lessThan1
			)
		    ),
		    "udre",
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
				    new com.oss.asn1.INTEGER(-2047), 
				    new com.oss.asn1.INTEGER(2047),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-2047),
				new java.lang.Long(2047)
			    ),
			    null
			)
		    ),
		    "ganss-prc",
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
				    new com.oss.asn1.INTEGER(-127), 
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-127),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "ganss-rrc",
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
     * Get the type descriptor (TypeInfo) of 'this' DGANSSSignalInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DGANSSSignalInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DGANSSSignalInformation
