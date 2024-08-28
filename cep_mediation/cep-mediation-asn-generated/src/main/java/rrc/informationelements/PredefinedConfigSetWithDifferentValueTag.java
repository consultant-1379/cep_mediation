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
 * Define the ASN1 Type PredefinedConfigSetWithDifferentValueTag from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PredefinedConfigSetWithDifferentValueTag extends Sequence {
    
    /**
     * The default constructor.
     */
    public PredefinedConfigSetWithDifferentValueTag()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PredefinedConfigSetWithDifferentValueTag(INTEGER startPosition, 
		    PredefinedConfigValueTagList valueTagList)
    {
	setStartPosition(startPosition);
	setValueTagList(valueTagList);
    }
    
    /**
     * Construct with components.
     */
    public PredefinedConfigSetWithDifferentValueTag(long startPosition, 
		    PredefinedConfigValueTagList valueTagList)
    {
	this(new INTEGER(startPosition), valueTagList);
    }
    
    /**
     * Construct with required components.
     */
    public PredefinedConfigSetWithDifferentValueTag(PredefinedConfigValueTagList valueTagList)
    {
	setValueTagList(valueTagList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new PredefinedConfigValueTagList();
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
		return new INTEGER();
	    case 1:
		return new PredefinedConfigValueTagList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final com.oss.asn1.INTEGER startPosition__default = 
	new com.oss.asn1.INTEGER(0);
    
    // Methods for field "startPosition"
    public long getStartPosition()
    {
	if (hasStartPosition())
	    return ((INTEGER)mComponents[0]).longValue();
	else
	    return startPosition__default.longValue();
    }
    
    public void setStartPosition(long startPosition)
    {
	setStartPosition(new INTEGER(startPosition));
    }
    
    public void setStartPosition(INTEGER startPosition)
    {
	mComponents[0] = startPosition;
    }
    
    public void setStartPositionToDefault()
    {
	setStartPosition(startPosition__default);
    }
    
    public boolean hasDefaultStartPosition()
    {
	return true;
    }
    
    public boolean hasStartPosition()
    {
	return componentIsPresent(0);
    }
    
    public void deleteStartPosition()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "valueTagList"
    public PredefinedConfigValueTagList getValueTagList()
    {
	return (PredefinedConfigValueTagList)mComponents[1];
    }
    
    public void setValueTagList(PredefinedConfigValueTagList valueTagList)
    {
	mComponents[1] = valueTagList;
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
	    "PredefinedConfigSetWithDifferentValueTag"
	),
	new QName (
	    "InformationElements",
	    "PredefinedConfigSetWithDifferentValueTag"
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
				    new com.oss.asn1.INTEGER(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "startPosition",
		    0,
		    3,
		    startPosition__default
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
				"PredefinedConfigValueTagList"
			    ),
			    new QName (
				"InformationElements",
				"PredefinedConfigValueTagList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PredefinedConfigValueTag"
				)
			    )
			)
		    ),
		    "valueTagList",
		    1,
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
     * Get the type descriptor (TypeInfo) of 'this' PredefinedConfigSetWithDifferentValueTag object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PredefinedConfigSetWithDifferentValueTag object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PredefinedConfigSetWithDifferentValueTag
