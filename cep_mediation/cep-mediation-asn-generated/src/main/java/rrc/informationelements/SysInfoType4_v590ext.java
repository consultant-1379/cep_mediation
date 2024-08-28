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
 * Define the ASN1 Type SysInfoType4_v590ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType4_v590ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType4_v590ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType4_v590ext(CellSelectReselectInfo_v590ext cellSelectReselectInfo_v590ext)
    {
	setCellSelectReselectInfo_v590ext(cellSelectReselectInfo_v590ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellSelectReselectInfo_v590ext();
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
		return new CellSelectReselectInfo_v590ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cellSelectReselectInfo_v590ext"
    public CellSelectReselectInfo_v590ext getCellSelectReselectInfo_v590ext()
    {
	return (CellSelectReselectInfo_v590ext)mComponents[0];
    }
    
    public void setCellSelectReselectInfo_v590ext(CellSelectReselectInfo_v590ext cellSelectReselectInfo_v590ext)
    {
	mComponents[0] = cellSelectReselectInfo_v590ext;
    }
    
    public boolean hasCellSelectReselectInfo_v590ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCellSelectReselectInfo_v590ext()
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
	    "SysInfoType4_v590ext"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType4-v590ext"
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
				"CellSelectReselectInfo_v590ext"
			    ),
			    new QName (
				"InformationElements",
				"CellSelectReselectInfo-v590ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellSelectReselectInfo_v590ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellSelectReselectInfo_v590ext"
				)
			    ),
			    0
			)
		    ),
		    "cellSelectReselectInfo-v590ext",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType4_v590ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType4_v590ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType4_v590ext
