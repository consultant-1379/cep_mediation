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
 * Define the ASN1 Type IntraUTRAANR from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraUTRAANR extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraUTRAANR()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraUTRAANR(LoggingAbsoluteThreshold loggingAbsoluteThreshold, 
		    LoggingRelativeThreshold loggingRelativeThreshold)
    {
	setLoggingAbsoluteThreshold(loggingAbsoluteThreshold);
	setLoggingRelativeThreshold(loggingRelativeThreshold);
    }
    
    /**
     * Construct with required components.
     */
    public IntraUTRAANR(LoggingAbsoluteThreshold loggingAbsoluteThreshold)
    {
	setLoggingAbsoluteThreshold(loggingAbsoluteThreshold);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LoggingAbsoluteThreshold();
	mComponents[1] = new LoggingRelativeThreshold();
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
		return new LoggingAbsoluteThreshold();
	    case 1:
		return new LoggingRelativeThreshold();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "loggingAbsoluteThreshold"
    public LoggingAbsoluteThreshold getLoggingAbsoluteThreshold()
    {
	return (LoggingAbsoluteThreshold)mComponents[0];
    }
    
    public void setLoggingAbsoluteThreshold(LoggingAbsoluteThreshold loggingAbsoluteThreshold)
    {
	mComponents[0] = loggingAbsoluteThreshold;
    }
    
    
    // Methods for field "loggingRelativeThreshold"
    public LoggingRelativeThreshold getLoggingRelativeThreshold()
    {
	return (LoggingRelativeThreshold)mComponents[1];
    }
    
    public void setLoggingRelativeThreshold(LoggingRelativeThreshold loggingRelativeThreshold)
    {
	mComponents[1] = loggingRelativeThreshold;
    }
    
    public boolean hasLoggingRelativeThreshold()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLoggingRelativeThreshold()
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
	    "IntraUTRAANR"
	),
	new QName (
	    "InformationElements",
	    "IntraUTRAANR"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LoggingAbsoluteThreshold"
			    ),
			    new QName (
				"InformationElements",
				"LoggingAbsoluteThreshold"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggingAbsoluteThreshold"
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
		    "loggingAbsoluteThreshold",
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
				"LoggingRelativeThreshold"
			    ),
			    new QName (
				"InformationElements",
				"LoggingRelativeThreshold"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LoggingRelativeThreshold(-4), 
				    new LoggingRelativeThreshold(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-4),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "loggingRelativeThreshold",
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
     * Get the type descriptor (TypeInfo) of 'this' IntraUTRAANR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraUTRAANR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraUTRAANR
