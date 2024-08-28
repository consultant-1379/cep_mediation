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
 * Define the ASN1 Type CellInfo_LCR_r8_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellInfo_LCR_r8_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellInfo_LCR_r8_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellInfo_LCR_r8_ext(CellSelectReselectInfoMC_RSCP cellSelectionReselectionInfo)
    {
	setCellSelectionReselectionInfo(cellSelectionReselectionInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellSelectReselectInfoMC_RSCP();
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
		return new CellSelectReselectInfoMC_RSCP();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cellSelectionReselectionInfo"
    public CellSelectReselectInfoMC_RSCP getCellSelectionReselectionInfo()
    {
	return (CellSelectReselectInfoMC_RSCP)mComponents[0];
    }
    
    public void setCellSelectionReselectionInfo(CellSelectReselectInfoMC_RSCP cellSelectionReselectionInfo)
    {
	mComponents[0] = cellSelectionReselectionInfo;
    }
    
    public boolean hasCellSelectionReselectionInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCellSelectionReselectionInfo()
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
	    "CellInfo_LCR_r8_ext"
	),
	new QName (
	    "InformationElements",
	    "CellInfo-LCR-r8-ext"
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
				"CellSelectReselectInfoMC_RSCP"
			    ),
			    new QName (
				"InformationElements",
				"CellSelectReselectInfoMC-RSCP"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellSelectReselectInfoMC_RSCP"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellSelectReselectInfoMC_RSCP"
				)
			    ),
			    0
			)
		    ),
		    "cellSelectionReselectionInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' CellInfo_LCR_r8_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellInfo_LCR_r8_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellInfo_LCR_r8_ext
