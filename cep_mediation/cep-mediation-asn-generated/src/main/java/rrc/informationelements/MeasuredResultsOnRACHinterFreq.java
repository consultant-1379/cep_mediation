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
 * Define the ASN1 Type MeasuredResultsOnRACHinterFreq from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasuredResultsOnRACHinterFreq extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasuredResultsOnRACHinterFreq()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasuredResultsOnRACHinterFreq(INTEGER interFreqCellIndication_SIB11, 
		    INTEGER interFreqCellIndication_SIB12, 
		    InterFreqRACHRepCellsList interFreqRACHRepCellsList)
    {
	setInterFreqCellIndication_SIB11(interFreqCellIndication_SIB11);
	setInterFreqCellIndication_SIB12(interFreqCellIndication_SIB12);
	setInterFreqRACHRepCellsList(interFreqRACHRepCellsList);
    }
    
    /**
     * Construct with components.
     */
    public MeasuredResultsOnRACHinterFreq(long interFreqCellIndication_SIB11, 
		    long interFreqCellIndication_SIB12, 
		    InterFreqRACHRepCellsList interFreqRACHRepCellsList)
    {
	this(new INTEGER(interFreqCellIndication_SIB11), 
	     new INTEGER(interFreqCellIndication_SIB12), 
	     interFreqRACHRepCellsList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new InterFreqRACHRepCellsList();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new InterFreqRACHRepCellsList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interFreqCellIndication_SIB11"
    public long getInterFreqCellIndication_SIB11()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setInterFreqCellIndication_SIB11(long interFreqCellIndication_SIB11)
    {
	setInterFreqCellIndication_SIB11(new INTEGER(interFreqCellIndication_SIB11));
    }
    
    public void setInterFreqCellIndication_SIB11(INTEGER interFreqCellIndication_SIB11)
    {
	mComponents[0] = interFreqCellIndication_SIB11;
    }
    
    
    // Methods for field "interFreqCellIndication_SIB12"
    public long getInterFreqCellIndication_SIB12()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setInterFreqCellIndication_SIB12(long interFreqCellIndication_SIB12)
    {
	setInterFreqCellIndication_SIB12(new INTEGER(interFreqCellIndication_SIB12));
    }
    
    public void setInterFreqCellIndication_SIB12(INTEGER interFreqCellIndication_SIB12)
    {
	mComponents[1] = interFreqCellIndication_SIB12;
    }
    
    
    // Methods for field "interFreqRACHRepCellsList"
    public InterFreqRACHRepCellsList getInterFreqRACHRepCellsList()
    {
	return (InterFreqRACHRepCellsList)mComponents[2];
    }
    
    public void setInterFreqRACHRepCellsList(InterFreqRACHRepCellsList interFreqRACHRepCellsList)
    {
	mComponents[2] = interFreqRACHRepCellsList;
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
	    "MeasuredResultsOnRACHinterFreq"
	),
	new QName (
	    "InformationElements",
	    "MeasuredResultsOnRACHinterFreq"
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
				    new com.oss.asn1.INTEGER(1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "interFreqCellIndication-SIB11",
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
				    new com.oss.asn1.INTEGER(1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "interFreqCellIndication-SIB12",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterFreqRACHRepCellsList"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqRACHRepCellsList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqCellID"
				)
			    )
			)
		    ),
		    "interFreqRACHRepCellsList",
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' MeasuredResultsOnRACHinterFreq object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasuredResultsOnRACHinterFreq object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasuredResultsOnRACHinterFreq
