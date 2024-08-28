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
 * Define the ASN1 Type UE_HistoryInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_HistoryInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_HistoryInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_HistoryInformation(INTEGER ue_InactivityPeriod, 
		    High_MobilityDetected ueMobilityStateIndicator, 
		    DataVolumeHistory ul_dataVolumeHistory, 
		    DataVolumeHistory dl_dataVolumeHistory)
    {
	setUe_InactivityPeriod(ue_InactivityPeriod);
	setUeMobilityStateIndicator(ueMobilityStateIndicator);
	setUl_dataVolumeHistory(ul_dataVolumeHistory);
	setDl_dataVolumeHistory(dl_dataVolumeHistory);
    }
    
    /**
     * Construct with components.
     */
    public UE_HistoryInformation(long ue_InactivityPeriod, 
		    High_MobilityDetected ueMobilityStateIndicator, 
		    DataVolumeHistory ul_dataVolumeHistory, 
		    DataVolumeHistory dl_dataVolumeHistory)
    {
	this(new INTEGER(ue_InactivityPeriod), ueMobilityStateIndicator, 
	     ul_dataVolumeHistory, dl_dataVolumeHistory);
    }
    
    /**
     * Construct with required components.
     */
    public UE_HistoryInformation(long ue_InactivityPeriod)
    {
	setUe_InactivityPeriod(ue_InactivityPeriod);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = High_MobilityDetected.high_MobilityDetected;
	mComponents[2] = new DataVolumeHistory();
	mComponents[3] = new DataVolumeHistory();
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
		return new INTEGER();
	    case 1:
		return High_MobilityDetected.high_MobilityDetected;
	    case 2:
		return new DataVolumeHistory();
	    case 3:
		return new DataVolumeHistory();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_InactivityPeriod"
    public long getUe_InactivityPeriod()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setUe_InactivityPeriod(long ue_InactivityPeriod)
    {
	setUe_InactivityPeriod(new INTEGER(ue_InactivityPeriod));
    }
    
    public void setUe_InactivityPeriod(INTEGER ue_InactivityPeriod)
    {
	mComponents[0] = ue_InactivityPeriod;
    }
    
    
    // Methods for field "ueMobilityStateIndicator"
    public High_MobilityDetected getUeMobilityStateIndicator()
    {
	return (High_MobilityDetected)mComponents[1];
    }
    
    public void setUeMobilityStateIndicator(High_MobilityDetected ueMobilityStateIndicator)
    {
	mComponents[1] = ueMobilityStateIndicator;
    }
    
    public boolean hasUeMobilityStateIndicator()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUeMobilityStateIndicator()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ul_dataVolumeHistory"
    public DataVolumeHistory getUl_dataVolumeHistory()
    {
	return (DataVolumeHistory)mComponents[2];
    }
    
    public void setUl_dataVolumeHistory(DataVolumeHistory ul_dataVolumeHistory)
    {
	mComponents[2] = ul_dataVolumeHistory;
    }
    
    public boolean hasUl_dataVolumeHistory()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUl_dataVolumeHistory()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "dl_dataVolumeHistory"
    public DataVolumeHistory getDl_dataVolumeHistory()
    {
	return (DataVolumeHistory)mComponents[3];
    }
    
    public void setDl_dataVolumeHistory(DataVolumeHistory dl_dataVolumeHistory)
    {
	mComponents[3] = dl_dataVolumeHistory;
    }
    
    public boolean hasDl_dataVolumeHistory()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDl_dataVolumeHistory()
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
	    "UE_HistoryInformation"
	),
	new QName (
	    "InformationElements",
	    "UE-HistoryInformation"
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
				    new com.oss.asn1.INTEGER(120),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(120)
			    ),
			    null
			)
		    ),
		    "ue-InactivityPeriod",
		    0,
		    2,
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
				"High_MobilityDetected"
			    ),
			    new QName (
				"InformationElements",
				"High-MobilityDetected"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"high-MobilityDetected",
					0
				    )
				}
			    ),
			    0,
			    High_MobilityDetected.high_MobilityDetected
			)
		    ),
		    "ueMobilityStateIndicator",
		    1,
		    3,
		    null
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
				"DataVolumeHistory"
			    ),
			    new QName (
				"InformationElements",
				"DataVolumeHistory"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DataVolumeHistory"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DataVolumeHistory"
				)
			    ),
			    0
			)
		    ),
		    "ul-dataVolumeHistory",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DataVolumeHistory"
			    ),
			    new QName (
				"InformationElements",
				"DataVolumeHistory"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DataVolumeHistory"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DataVolumeHistory"
				)
			    ),
			    0
			)
		    ),
		    "dl-dataVolumeHistory",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_HistoryInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_HistoryInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_HistoryInformation
