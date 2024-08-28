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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type PhysicalChannelReconfiguration_v780ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class PhysicalChannelReconfiguration_v780ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalChannelReconfiguration_v780ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalChannelReconfiguration_v780ext_IEs(rrc.informationelements.HARQ_Info_r7 harqInfo, 
		    rrc.informationelements.HS_DSCH_TBSizeTable hs_DSCH_TBSizeTable)
    {
	setHarqInfo(harqInfo);
	setHs_DSCH_TBSizeTable(hs_DSCH_TBSizeTable);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.HARQ_Info_r7();
	mComponents[1] = rrc.informationelements.HS_DSCH_TBSizeTable.octetAligned;
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
		return new rrc.informationelements.HARQ_Info_r7();
	    case 1:
		return rrc.informationelements.HS_DSCH_TBSizeTable.octetAligned;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "harqInfo"
    public rrc.informationelements.HARQ_Info_r7 getHarqInfo()
    {
	return (rrc.informationelements.HARQ_Info_r7)mComponents[0];
    }
    
    public void setHarqInfo(rrc.informationelements.HARQ_Info_r7 harqInfo)
    {
	mComponents[0] = harqInfo;
    }
    
    public boolean hasHarqInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHarqInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "hs_DSCH_TBSizeTable"
    public rrc.informationelements.HS_DSCH_TBSizeTable getHs_DSCH_TBSizeTable()
    {
	return (rrc.informationelements.HS_DSCH_TBSizeTable)mComponents[1];
    }
    
    public void setHs_DSCH_TBSizeTable(rrc.informationelements.HS_DSCH_TBSizeTable hs_DSCH_TBSizeTable)
    {
	mComponents[1] = hs_DSCH_TBSizeTable;
    }
    
    public boolean hasHs_DSCH_TBSizeTable()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHs_DSCH_TBSizeTable()
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
	    "rrc.pdu_definitions",
	    "PhysicalChannelReconfiguration_v780ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "PhysicalChannelReconfiguration-v780ext-IEs"
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
				"HARQ_Info_r7"
			    ),
			    new QName (
				"InformationElements",
				"HARQ-Info-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info_r7"
				)
			    ),
			    0
			)
		    ),
		    "harqInfo",
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
				"HS_DSCH_TBSizeTable"
			    ),
			    new QName (
				"InformationElements",
				"HS-DSCH-TBSizeTable"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"octetAligned",
					0
				    )
				}
			    ),
			    0,
			    rrc.informationelements.HS_DSCH_TBSizeTable.octetAligned
			)
		    ),
		    "hs-DSCH-TBSizeTable",
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
     * Get the type descriptor (TypeInfo) of 'this' PhysicalChannelReconfiguration_v780ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalChannelReconfiguration_v780ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalChannelReconfiguration_v780ext_IEs
