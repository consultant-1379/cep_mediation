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
 * Define the ASN1 Type DGANSSSignalInformation_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DGANSSSignalInformation_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public DGANSSSignalInformation_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DGANSSSignalInformation_v920ext(UDREGrowthRate udreGrowthRate, 
		    UDREValidityTime udreValidityTime)
    {
	setUdreGrowthRate(udreGrowthRate);
	setUdreValidityTime(udreValidityTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = UDREGrowthRate.growth_1_5;
	mComponents[1] = UDREValidityTime.val_20sec;
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
		return UDREGrowthRate.growth_1_5;
	    case 1:
		return UDREValidityTime.val_20sec;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "udreGrowthRate"
    public UDREGrowthRate getUdreGrowthRate()
    {
	return (UDREGrowthRate)mComponents[0];
    }
    
    public void setUdreGrowthRate(UDREGrowthRate udreGrowthRate)
    {
	mComponents[0] = udreGrowthRate;
    }
    
    public boolean hasUdreGrowthRate()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUdreGrowthRate()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "udreValidityTime"
    public UDREValidityTime getUdreValidityTime()
    {
	return (UDREValidityTime)mComponents[1];
    }
    
    public void setUdreValidityTime(UDREValidityTime udreValidityTime)
    {
	mComponents[1] = udreValidityTime;
    }
    
    public boolean hasUdreValidityTime()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUdreValidityTime()
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
	    "DGANSSSignalInformation_v920ext"
	),
	new QName (
	    "InformationElements",
	    "DGANSSSignalInformation-v920ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UDREGrowthRate"
			    ),
			    new QName (
				"InformationElements",
				"UDREGrowthRate"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"growth-1-5",
					0
				    ),
				    new MemberListElement (
					"growth-2",
					1
				    ),
				    new MemberListElement (
					"growth-4",
					2
				    ),
				    new MemberListElement (
					"growth-6",
					3
				    ),
				    new MemberListElement (
					"growth-8",
					4
				    ),
				    new MemberListElement (
					"growth-10",
					5
				    ),
				    new MemberListElement (
					"growth-12",
					6
				    ),
				    new MemberListElement (
					"growth-16",
					7
				    )
				}
			    ),
			    0,
			    UDREGrowthRate.growth_1_5
			)
		    ),
		    "udreGrowthRate",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UDREValidityTime"
			    ),
			    new QName (
				"InformationElements",
				"UDREValidityTime"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"val-20sec",
					0
				    ),
				    new MemberListElement (
					"val-40sec",
					1
				    ),
				    new MemberListElement (
					"val-80sec",
					2
				    ),
				    new MemberListElement (
					"val-160sec",
					3
				    ),
				    new MemberListElement (
					"val-320sec",
					4
				    ),
				    new MemberListElement (
					"val-640sec",
					5
				    ),
				    new MemberListElement (
					"val-1280sec",
					6
				    ),
				    new MemberListElement (
					"val-2560sec",
					7
				    )
				}
			    ),
			    0,
			    UDREValidityTime.val_20sec
			)
		    ),
		    "udreValidityTime",
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
     * Get the type descriptor (TypeInfo) of 'this' DGANSSSignalInformation_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DGANSSSignalInformation_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DGANSSSignalInformation_v920ext
