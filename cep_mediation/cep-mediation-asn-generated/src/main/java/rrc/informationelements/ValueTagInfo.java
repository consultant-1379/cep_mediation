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
 * Define the ASN1 Type ValueTagInfo from ASN1 Module InformationElements.
 * @see Choice
 */

public class ValueTagInfo extends Choice {
    
    /**
     * The default constructor.
     */
    public ValueTagInfo()
    {
    }
    
    public static final  int  none_chosen = 1;
    public static final  int  cellValueTag_chosen = 2;
    public static final  int  plmn_ValueTag_chosen = 3;
    public static final  int  sIBOccurrenceIdentityAndValueTag_chosen = 4;
    
    // Methods for field "none"
    public static ValueTagInfo createValueTagInfoWithNone(Null none)
    {
	ValueTagInfo __object = new ValueTagInfo();

	__object.setNone(none);
	return __object;
    }
    
    public boolean hasNone()
    {
	return getChosenFlag() == none_chosen;
    }
    
    public void setNone(Null none)
    {
	setChosenValue(none);
	setChosenFlag(none_chosen);
    }
    
    
    // Methods for field "cellValueTag"
    public static ValueTagInfo createValueTagInfoWithCellValueTag(long cellValueTag)
    {
	return createValueTagInfoWithCellValueTag(new CellValueTag(cellValueTag));
    }
    
    public static ValueTagInfo createValueTagInfoWithCellValueTag(CellValueTag cellValueTag)
    {
	ValueTagInfo __object = new ValueTagInfo();

	__object.setCellValueTag(cellValueTag);
	return __object;
    }
    
    public boolean hasCellValueTag()
    {
	return getChosenFlag() == cellValueTag_chosen;
    }
    
    public void setCellValueTag(long cellValueTag)
    {
	setCellValueTag(new CellValueTag(cellValueTag));
    }
    
    public void setCellValueTag(CellValueTag cellValueTag)
    {
	setChosenValue(cellValueTag);
	setChosenFlag(cellValueTag_chosen);
    }
    
    
    // Methods for field "plmn_ValueTag"
    public static ValueTagInfo createValueTagInfoWithPlmn_ValueTag(long plmn_ValueTag)
    {
	return createValueTagInfoWithPlmn_ValueTag(new PLMN_ValueTag(plmn_ValueTag));
    }
    
    public static ValueTagInfo createValueTagInfoWithPlmn_ValueTag(PLMN_ValueTag plmn_ValueTag)
    {
	ValueTagInfo __object = new ValueTagInfo();

	__object.setPlmn_ValueTag(plmn_ValueTag);
	return __object;
    }
    
    public boolean hasPlmn_ValueTag()
    {
	return getChosenFlag() == plmn_ValueTag_chosen;
    }
    
    public void setPlmn_ValueTag(long plmn_ValueTag)
    {
	setPlmn_ValueTag(new PLMN_ValueTag(plmn_ValueTag));
    }
    
    public void setPlmn_ValueTag(PLMN_ValueTag plmn_ValueTag)
    {
	setChosenValue(plmn_ValueTag);
	setChosenFlag(plmn_ValueTag_chosen);
    }
    
    
    // Methods for field "sIBOccurrenceIdentityAndValueTag"
    public static ValueTagInfo createValueTagInfoWithSIBOccurrenceIdentityAndValueTag(SIBOccurrenceIdentityAndValueTag sIBOccurrenceIdentityAndValueTag)
    {
	ValueTagInfo __object = new ValueTagInfo();

	__object.setSIBOccurrenceIdentityAndValueTag(sIBOccurrenceIdentityAndValueTag);
	return __object;
    }
    
    public boolean hasSIBOccurrenceIdentityAndValueTag()
    {
	return getChosenFlag() == sIBOccurrenceIdentityAndValueTag_chosen;
    }
    
    public void setSIBOccurrenceIdentityAndValueTag(SIBOccurrenceIdentityAndValueTag sIBOccurrenceIdentityAndValueTag)
    {
	setChosenValue(sIBOccurrenceIdentityAndValueTag);
	setChosenFlag(sIBOccurrenceIdentityAndValueTag_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case none_chosen:
		return new Null();
	    case cellValueTag_chosen:
		return new CellValueTag();
	    case plmn_ValueTag_chosen:
		return new PLMN_ValueTag();
	    case sIBOccurrenceIdentityAndValueTag_chosen:
		return new SIBOccurrenceIdentityAndValueTag();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "ValueTagInfo"
	),
	new QName (
	    "InformationElements",
	    "ValueTagInfo"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "none",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellValueTag"
			    ),
			    new QName (
				"InformationElements",
				"CellValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CellValueTag(1), 
				    new CellValueTag(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "cellValueTag",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PLMN_ValueTag"
			    ),
			    new QName (
				"InformationElements",
				"PLMN-ValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PLMN_ValueTag(1), 
				    new PLMN_ValueTag(256),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(256)
			    ),
			    null
			)
		    ),
		    "plmn-ValueTag",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SIBOccurrenceIdentityAndValueTag"
			    ),
			    new QName (
				"InformationElements",
				"SIBOccurrenceIdentityAndValueTag"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SIBOccurrenceIdentityAndValueTag"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SIBOccurrenceIdentityAndValueTag"
				)
			    ),
			    0
			)
		    ),
		    "sIBOccurrenceIdentityAndValueTag",
		    3,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ValueTagInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ValueTagInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ValueTagInfo
