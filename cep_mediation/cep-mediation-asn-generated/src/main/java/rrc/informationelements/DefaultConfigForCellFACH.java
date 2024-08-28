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
 * Define the ASN1 Type DefaultConfigForCellFACH from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DefaultConfigForCellFACH extends Sequence {
    
    /**
     * The default constructor.
     */
    public DefaultConfigForCellFACH()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DefaultConfigForCellFACH(DefaultConfigMode defaultConfigMode, 
		    DefaultConfigIdForCellFACH defaultConfigIdForCellFACH)
    {
	setDefaultConfigMode(defaultConfigMode);
	setDefaultConfigIdForCellFACH(defaultConfigIdForCellFACH);
    }
    
    public void initComponents()
    {
	mComponents[0] = DefaultConfigMode.fdd;
	mComponents[1] = new DefaultConfigIdForCellFACH();
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
		return DefaultConfigMode.fdd;
	    case 1:
		return new DefaultConfigIdForCellFACH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "defaultConfigMode"
    public DefaultConfigMode getDefaultConfigMode()
    {
	return (DefaultConfigMode)mComponents[0];
    }
    
    public void setDefaultConfigMode(DefaultConfigMode defaultConfigMode)
    {
	mComponents[0] = defaultConfigMode;
    }
    
    
    // Methods for field "defaultConfigIdForCellFACH"
    public DefaultConfigIdForCellFACH getDefaultConfigIdForCellFACH()
    {
	return (DefaultConfigIdForCellFACH)mComponents[1];
    }
    
    public void setDefaultConfigIdForCellFACH(DefaultConfigIdForCellFACH defaultConfigIdForCellFACH)
    {
	mComponents[1] = defaultConfigIdForCellFACH;
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
	    "DefaultConfigForCellFACH"
	),
	new QName (
	    "InformationElements",
	    "DefaultConfigForCellFACH"
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
				"DefaultConfigMode"
			    ),
			    new QName (
				"InformationElements",
				"DefaultConfigMode"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"fdd",
					0
				    ),
				    new MemberListElement (
					"tdd",
					1
				    )
				}
			    ),
			    0,
			    DefaultConfigMode.fdd
			)
		    ),
		    "defaultConfigMode",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DefaultConfigIdForCellFACH"
			    ),
			    new QName (
				"InformationElements",
				"DefaultConfigIdForCellFACH"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DefaultConfigIdForCellFACH(0), 
				    new DefaultConfigIdForCellFACH(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "defaultConfigIdForCellFACH",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' DefaultConfigForCellFACH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DefaultConfigForCellFACH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DefaultConfigForCellFACH
