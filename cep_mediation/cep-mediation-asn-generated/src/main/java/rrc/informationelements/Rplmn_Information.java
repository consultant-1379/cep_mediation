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
 * Define the ASN1 Type Rplmn_Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Rplmn_Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public Rplmn_Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Rplmn_Information(GSM_BA_Range_List gsm_BA_Range_List, 
		    FDD_UMTS_Frequency_List fdd_UMTS_Frequency_List, 
		    TDD_UMTS_Frequency_List tdd_UMTS_Frequency_List, 
		    CDMA2000_UMTS_Frequency_List cdma2000_UMTS_Frequency_List)
    {
	setGsm_BA_Range_List(gsm_BA_Range_List);
	setFdd_UMTS_Frequency_List(fdd_UMTS_Frequency_List);
	setTdd_UMTS_Frequency_List(tdd_UMTS_Frequency_List);
	setCdma2000_UMTS_Frequency_List(cdma2000_UMTS_Frequency_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GSM_BA_Range_List();
	mComponents[1] = new FDD_UMTS_Frequency_List();
	mComponents[2] = new TDD_UMTS_Frequency_List();
	mComponents[3] = new CDMA2000_UMTS_Frequency_List();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new GSM_BA_Range_List();
	    case 1:
		return new FDD_UMTS_Frequency_List();
	    case 2:
		return new TDD_UMTS_Frequency_List();
	    case 3:
		return new CDMA2000_UMTS_Frequency_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gsm_BA_Range_List"
    public GSM_BA_Range_List getGsm_BA_Range_List()
    {
	return (GSM_BA_Range_List)mComponents[0];
    }
    
    public void setGsm_BA_Range_List(GSM_BA_Range_List gsm_BA_Range_List)
    {
	mComponents[0] = gsm_BA_Range_List;
    }
    
    public boolean hasGsm_BA_Range_List()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGsm_BA_Range_List()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "fdd_UMTS_Frequency_List"
    public FDD_UMTS_Frequency_List getFdd_UMTS_Frequency_List()
    {
	return (FDD_UMTS_Frequency_List)mComponents[1];
    }
    
    public void setFdd_UMTS_Frequency_List(FDD_UMTS_Frequency_List fdd_UMTS_Frequency_List)
    {
	mComponents[1] = fdd_UMTS_Frequency_List;
    }
    
    public boolean hasFdd_UMTS_Frequency_List()
    {
	return componentIsPresent(1);
    }
    
    public void deleteFdd_UMTS_Frequency_List()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "tdd_UMTS_Frequency_List"
    public TDD_UMTS_Frequency_List getTdd_UMTS_Frequency_List()
    {
	return (TDD_UMTS_Frequency_List)mComponents[2];
    }
    
    public void setTdd_UMTS_Frequency_List(TDD_UMTS_Frequency_List tdd_UMTS_Frequency_List)
    {
	mComponents[2] = tdd_UMTS_Frequency_List;
    }
    
    public boolean hasTdd_UMTS_Frequency_List()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTdd_UMTS_Frequency_List()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "cdma2000_UMTS_Frequency_List"
    public CDMA2000_UMTS_Frequency_List getCdma2000_UMTS_Frequency_List()
    {
	return (CDMA2000_UMTS_Frequency_List)mComponents[3];
    }
    
    public void setCdma2000_UMTS_Frequency_List(CDMA2000_UMTS_Frequency_List cdma2000_UMTS_Frequency_List)
    {
	mComponents[3] = cdma2000_UMTS_Frequency_List;
    }
    
    public boolean hasCdma2000_UMTS_Frequency_List()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCdma2000_UMTS_Frequency_List()
    {
	setComponentAbsent(3);
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
	    "Rplmn_Information"
	),
	new QName (
	    "InformationElements",
	    "Rplmn-Information"
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
				"GSM_BA_Range_List"
			    ),
			    new QName (
				"InformationElements",
				"GSM-BA-Range-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "GSM_BA_Range"
				)
			    )
			)
		    ),
		    "gsm-BA-Range-List",
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
				"FDD_UMTS_Frequency_List"
			    ),
			    new QName (
				"InformationElements",
				"FDD-UMTS-Frequency-List"
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
				    "FrequencyInfoFDD"
				)
			    )
			)
		    ),
		    "fdd-UMTS-Frequency-List",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TDD_UMTS_Frequency_List"
			    ),
			    new QName (
				"InformationElements",
				"TDD-UMTS-Frequency-List"
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
				    "FrequencyInfoTDD"
				)
			    )
			)
		    ),
		    "tdd-UMTS-Frequency-List",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CDMA2000_UMTS_Frequency_List"
			    ),
			    new QName (
				"InformationElements",
				"CDMA2000-UMTS-Frequency-List"
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
				    "FrequencyInfoCDMA2000"
				)
			    )
			)
		    ),
		    "cdma2000-UMTS-Frequency-List",
		    3,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Rplmn_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Rplmn_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Rplmn_Information
