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
 * Define the ASN1 Type DRAC_StaticInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DRAC_StaticInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public DRAC_StaticInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DRAC_StaticInformation(TransmissionTimeValidity transmissionTimeValidity, 
		    TimeDurationBeforeRetry timeDurationBeforeRetry, 
		    DRAC_ClassIdentity drac_ClassIdentity)
    {
	setTransmissionTimeValidity(transmissionTimeValidity);
	setTimeDurationBeforeRetry(timeDurationBeforeRetry);
	setDrac_ClassIdentity(drac_ClassIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TransmissionTimeValidity();
	mComponents[1] = new TimeDurationBeforeRetry();
	mComponents[2] = new DRAC_ClassIdentity();
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
		return new TransmissionTimeValidity();
	    case 1:
		return new TimeDurationBeforeRetry();
	    case 2:
		return new DRAC_ClassIdentity();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transmissionTimeValidity"
    public TransmissionTimeValidity getTransmissionTimeValidity()
    {
	return (TransmissionTimeValidity)mComponents[0];
    }
    
    public void setTransmissionTimeValidity(TransmissionTimeValidity transmissionTimeValidity)
    {
	mComponents[0] = transmissionTimeValidity;
    }
    
    
    // Methods for field "timeDurationBeforeRetry"
    public TimeDurationBeforeRetry getTimeDurationBeforeRetry()
    {
	return (TimeDurationBeforeRetry)mComponents[1];
    }
    
    public void setTimeDurationBeforeRetry(TimeDurationBeforeRetry timeDurationBeforeRetry)
    {
	mComponents[1] = timeDurationBeforeRetry;
    }
    
    
    // Methods for field "drac_ClassIdentity"
    public DRAC_ClassIdentity getDrac_ClassIdentity()
    {
	return (DRAC_ClassIdentity)mComponents[2];
    }
    
    public void setDrac_ClassIdentity(DRAC_ClassIdentity drac_ClassIdentity)
    {
	mComponents[2] = drac_ClassIdentity;
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
	    "DRAC_StaticInformation"
	),
	new QName (
	    "InformationElements",
	    "DRAC-StaticInformation"
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
				"rrc.informationelements",
				"TransmissionTimeValidity"
			    ),
			    new QName (
				"InformationElements",
				"TransmissionTimeValidity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransmissionTimeValidity(1), 
				    new TransmissionTimeValidity(256),
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
		    "transmissionTimeValidity",
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
				"TimeDurationBeforeRetry"
			    ),
			    new QName (
				"InformationElements",
				"TimeDurationBeforeRetry"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeDurationBeforeRetry(1), 
				    new TimeDurationBeforeRetry(256),
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
		    "timeDurationBeforeRetry",
		    1,
		    2,
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
				"DRAC_ClassIdentity"
			    ),
			    new QName (
				"InformationElements",
				"DRAC-ClassIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DRAC_ClassIdentity(1), 
				    new DRAC_ClassIdentity(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "drac-ClassIdentity",
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
     * Get the type descriptor (TypeInfo) of 'this' DRAC_StaticInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DRAC_StaticInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DRAC_StaticInformation
