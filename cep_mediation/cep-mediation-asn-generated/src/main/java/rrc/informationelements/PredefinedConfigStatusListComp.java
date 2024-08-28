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
 * Define the ASN1 Type PredefinedConfigStatusListComp from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PredefinedConfigStatusListComp extends Sequence {
    
    /**
     * The default constructor.
     */
    public PredefinedConfigStatusListComp()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PredefinedConfigStatusListComp(PredefinedConfigSetsWithDifferentValueTag setsWithDifferentValueTag, 
		    PredefinedConfigStatusListVarSz otherEntries)
    {
	setSetsWithDifferentValueTag(setsWithDifferentValueTag);
	setOtherEntries(otherEntries);
    }
    
    /**
     * Construct with required components.
     */
    public PredefinedConfigStatusListComp(PredefinedConfigSetsWithDifferentValueTag setsWithDifferentValueTag)
    {
	setSetsWithDifferentValueTag(setsWithDifferentValueTag);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PredefinedConfigSetsWithDifferentValueTag();
	mComponents[1] = new PredefinedConfigStatusListVarSz();
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
		return new PredefinedConfigSetsWithDifferentValueTag();
	    case 1:
		return new PredefinedConfigStatusListVarSz();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "setsWithDifferentValueTag"
    public PredefinedConfigSetsWithDifferentValueTag getSetsWithDifferentValueTag()
    {
	return (PredefinedConfigSetsWithDifferentValueTag)mComponents[0];
    }
    
    public void setSetsWithDifferentValueTag(PredefinedConfigSetsWithDifferentValueTag setsWithDifferentValueTag)
    {
	mComponents[0] = setsWithDifferentValueTag;
    }
    
    
    // Methods for field "otherEntries"
    public PredefinedConfigStatusListVarSz getOtherEntries()
    {
	return (PredefinedConfigStatusListVarSz)mComponents[1];
    }
    
    public void setOtherEntries(PredefinedConfigStatusListVarSz otherEntries)
    {
	mComponents[1] = otherEntries;
    }
    
    public boolean hasOtherEntries()
    {
	return componentIsPresent(1);
    }
    
    public void deleteOtherEntries()
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
	    "rrc.informationelements",
	    "PredefinedConfigStatusListComp"
	),
	new QName (
	    "InformationElements",
	    "PredefinedConfigStatusListComp"
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
				"PredefinedConfigSetsWithDifferentValueTag"
			    ),
			    new QName (
				"InformationElements",
				"PredefinedConfigSetsWithDifferentValueTag"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(2),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(2)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PredefinedConfigSetWithDifferentValueTag"
				)
			    )
			)
		    ),
		    "setsWithDifferentValueTag",
		    0,
		    2,
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
				"PredefinedConfigStatusListVarSz"
			    ),
			    new QName (
				"InformationElements",
				"PredefinedConfigStatusListVarSz"
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
				    "PredefinedConfigStatusInfo"
				)
			    )
			)
		    ),
		    "otherEntries",
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
     * Get the type descriptor (TypeInfo) of 'this' PredefinedConfigStatusListComp object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PredefinedConfigStatusListComp object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PredefinedConfigStatusListComp
