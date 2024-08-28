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
 * Define the ASN1 Type InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4(InterFreqCellInfoSI_List_HCS_RSCP_LCR interFreqCellInfoSI_List)
    {
	setInterFreqCellInfoSI_List(interFreqCellInfoSI_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new InterFreqCellInfoSI_List_HCS_RSCP_LCR();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new InterFreqCellInfoSI_List_HCS_RSCP_LCR();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interFreqCellInfoSI_List"
    public InterFreqCellInfoSI_List_HCS_RSCP_LCR getInterFreqCellInfoSI_List()
    {
	return (InterFreqCellInfoSI_List_HCS_RSCP_LCR)mComponents[0];
    }
    
    public void setInterFreqCellInfoSI_List(InterFreqCellInfoSI_List_HCS_RSCP_LCR interFreqCellInfoSI_List)
    {
	mComponents[0] = interFreqCellInfoSI_List;
    }
    
    public boolean hasInterFreqCellInfoSI_List()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInterFreqCellInfoSI_List()
    {
	setComponentAbsent(0);
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
	    "InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "InterFreqMeasurementSysInfo-HCS-RSCP-LCR-r4"
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
				"InterFreqCellInfoSI_List_HCS_RSCP_LCR"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqCellInfoSI-List-HCS-RSCP-LCR"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqCellInfoSI_List_HCS_RSCP_LCR"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqCellInfoSI_List_HCS_RSCP_LCR"
				)
			    ),
			    0
			)
		    ),
		    "interFreqCellInfoSI-List",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4
