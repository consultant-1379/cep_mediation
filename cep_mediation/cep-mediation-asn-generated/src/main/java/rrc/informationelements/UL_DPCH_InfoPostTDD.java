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
 * Define the ASN1 Type UL_DPCH_InfoPostTDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_DPCH_InfoPostTDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_DPCH_InfoPostTDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_DPCH_InfoPostTDD(UL_DPCH_PowerControlInfoPostTDD ul_DPCH_PowerControlInfo, 
		    UL_TimingAdvanceControl ul_TimingAdvance, 
		    UplinkTimeslotsCodes ul_CCTrCH_TimeslotsCodes)
    {
	setUl_DPCH_PowerControlInfo(ul_DPCH_PowerControlInfo);
	setUl_TimingAdvance(ul_TimingAdvance);
	setUl_CCTrCH_TimeslotsCodes(ul_CCTrCH_TimeslotsCodes);
    }
    
    /**
     * Construct with required components.
     */
    public UL_DPCH_InfoPostTDD(UL_DPCH_PowerControlInfoPostTDD ul_DPCH_PowerControlInfo, 
		    UplinkTimeslotsCodes ul_CCTrCH_TimeslotsCodes)
    {
	setUl_DPCH_PowerControlInfo(ul_DPCH_PowerControlInfo);
	setUl_CCTrCH_TimeslotsCodes(ul_CCTrCH_TimeslotsCodes);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_DPCH_PowerControlInfoPostTDD();
	mComponents[1] = new UL_TimingAdvanceControl();
	mComponents[2] = new UplinkTimeslotsCodes();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UL_DPCH_PowerControlInfoPostTDD();
	    case 1:
		return new UL_TimingAdvanceControl();
	    case 2:
		return new UplinkTimeslotsCodes();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_DPCH_PowerControlInfo"
    public UL_DPCH_PowerControlInfoPostTDD getUl_DPCH_PowerControlInfo()
    {
	return (UL_DPCH_PowerControlInfoPostTDD)mComponents[0];
    }
    
    public void setUl_DPCH_PowerControlInfo(UL_DPCH_PowerControlInfoPostTDD ul_DPCH_PowerControlInfo)
    {
	mComponents[0] = ul_DPCH_PowerControlInfo;
    }
    
    
    // Methods for field "ul_TimingAdvance"
    public UL_TimingAdvanceControl getUl_TimingAdvance()
    {
	return (UL_TimingAdvanceControl)mComponents[1];
    }
    
    public void setUl_TimingAdvance(UL_TimingAdvanceControl ul_TimingAdvance)
    {
	mComponents[1] = ul_TimingAdvance;
    }
    
    public boolean hasUl_TimingAdvance()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUl_TimingAdvance()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ul_CCTrCH_TimeslotsCodes"
    public UplinkTimeslotsCodes getUl_CCTrCH_TimeslotsCodes()
    {
	return (UplinkTimeslotsCodes)mComponents[2];
    }
    
    public void setUl_CCTrCH_TimeslotsCodes(UplinkTimeslotsCodes ul_CCTrCH_TimeslotsCodes)
    {
	mComponents[2] = ul_CCTrCH_TimeslotsCodes;
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
	    "UL_DPCH_InfoPostTDD"
	),
	new QName (
	    "InformationElements",
	    "UL-DPCH-InfoPostTDD"
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
				"UL_DPCH_PowerControlInfoPostTDD"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCH-PowerControlInfoPostTDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_PowerControlInfoPostTDD"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_PowerControlInfoPostTDD"
				)
			    ),
			    0
			)
		    ),
		    "ul-DPCH-PowerControlInfo",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_TimingAdvanceControl"
			    ),
			    new QName (
				"InformationElements",
				"UL-TimingAdvanceControl"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TimingAdvanceControl"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "ul-TimingAdvance",
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
				"UplinkTimeslotsCodes"
			    ),
			    new QName (
				"InformationElements",
				"UplinkTimeslotsCodes"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UplinkTimeslotsCodes"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UplinkTimeslotsCodes"
				)
			    ),
			    0
			)
		    ),
		    "ul-CCTrCH-TimeslotsCodes",
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_DPCH_InfoPostTDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DPCH_InfoPostTDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DPCH_InfoPostTDD
