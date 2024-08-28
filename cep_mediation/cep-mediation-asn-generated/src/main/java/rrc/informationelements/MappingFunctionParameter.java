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
 * Define the ASN1 Type MappingFunctionParameter from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MappingFunctionParameter extends Sequence {
    
    /**
     * The default constructor.
     */
    public MappingFunctionParameter()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MappingFunctionParameter(MappingFunctionType functionType, 
		    MapParameter mapParameter1, MapParameter mapParameter2, 
		    UpperLimit upperLimit)
    {
	setFunctionType(functionType);
	setMapParameter1(mapParameter1);
	setMapParameter2(mapParameter2);
	setUpperLimit(upperLimit);
    }
    
    /**
     * Construct with required components.
     */
    public MappingFunctionParameter(MappingFunctionType functionType, 
		    MapParameter mapParameter2)
    {
	setFunctionType(functionType);
	setMapParameter2(mapParameter2);
    }
    
    public void initComponents()
    {
	mComponents[0] = MappingFunctionType.linear;
	mComponents[1] = new MapParameter();
	mComponents[2] = new MapParameter();
	mComponents[3] = new UpperLimit();
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
		return MappingFunctionType.linear;
	    case 1:
		return new MapParameter();
	    case 2:
		return new MapParameter();
	    case 3:
		return new UpperLimit();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "functionType"
    public MappingFunctionType getFunctionType()
    {
	return (MappingFunctionType)mComponents[0];
    }
    
    public void setFunctionType(MappingFunctionType functionType)
    {
	mComponents[0] = functionType;
    }
    
    
    // Methods for field "mapParameter1"
    public MapParameter getMapParameter1()
    {
	return (MapParameter)mComponents[1];
    }
    
    public void setMapParameter1(MapParameter mapParameter1)
    {
	mComponents[1] = mapParameter1;
    }
    
    public boolean hasMapParameter1()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMapParameter1()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "mapParameter2"
    public MapParameter getMapParameter2()
    {
	return (MapParameter)mComponents[2];
    }
    
    public void setMapParameter2(MapParameter mapParameter2)
    {
	mComponents[2] = mapParameter2;
    }
    
    
    // Methods for field "upperLimit"
    public UpperLimit getUpperLimit()
    {
	return (UpperLimit)mComponents[3];
    }
    
    public void setUpperLimit(UpperLimit upperLimit)
    {
	mComponents[3] = upperLimit;
    }
    
    public boolean hasUpperLimit()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUpperLimit()
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
	    "MappingFunctionParameter"
	),
	new QName (
	    "InformationElements",
	    "MappingFunctionParameter"
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
				"MappingFunctionType"
			    ),
			    new QName (
				"InformationElements",
				"MappingFunctionType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"linear",
					0
				    ),
				    new MemberListElement (
					"functionType2",
					1
				    ),
				    new MemberListElement (
					"functionType3",
					2
				    ),
				    new MemberListElement (
					"functionType4",
					3
				    )
				}
			    ),
			    0,
			    MappingFunctionType.linear
			)
		    ),
		    "functionType",
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
				"MapParameter"
			    ),
			    new QName (
				"InformationElements",
				"MapParameter"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MapParameter(0), 
				    new MapParameter(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "mapParameter1",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MapParameter"
			    ),
			    new QName (
				"InformationElements",
				"MapParameter"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MapParameter(0), 
				    new MapParameter(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "mapParameter2",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UpperLimit"
			    ),
			    new QName (
				"InformationElements",
				"UpperLimit"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UpperLimit(1), 
				    new UpperLimit(91),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(91)
			    ),
			    null
			)
		    ),
		    "upperLimit",
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' MappingFunctionParameter object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MappingFunctionParameter object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MappingFunctionParameter
