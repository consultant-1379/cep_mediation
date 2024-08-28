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
 * Define the ASN1 Type IdleIntervalMeasCapabEUTRA from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IdleIntervalMeasCapabEUTRA extends Sequence {
    
    /**
     * The default constructor.
     */
    public IdleIntervalMeasCapabEUTRA()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IdleIntervalMeasCapabEUTRA(RadioFrequencyBandEUTRA radioFrequencyBandEUTRA, 
		    BOOLEAN idleInterval)
    {
	setRadioFrequencyBandEUTRA(radioFrequencyBandEUTRA);
	setIdleInterval(idleInterval);
    }
    
    /**
     * Construct with components.
     */
    public IdleIntervalMeasCapabEUTRA(RadioFrequencyBandEUTRA radioFrequencyBandEUTRA, 
		    boolean idleInterval)
    {
	this(radioFrequencyBandEUTRA, new BOOLEAN(idleInterval));
    }
    
    public void initComponents()
    {
	mComponents[0] = new RadioFrequencyBandEUTRA();
	mComponents[1] = new BOOLEAN();
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
		return new RadioFrequencyBandEUTRA();
	    case 1:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "radioFrequencyBandEUTRA"
    public RadioFrequencyBandEUTRA getRadioFrequencyBandEUTRA()
    {
	return (RadioFrequencyBandEUTRA)mComponents[0];
    }
    
    public void setRadioFrequencyBandEUTRA(RadioFrequencyBandEUTRA radioFrequencyBandEUTRA)
    {
	mComponents[0] = radioFrequencyBandEUTRA;
    }
    
    
    // Methods for field "idleInterval"
    public boolean getIdleInterval()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setIdleInterval(boolean idleInterval)
    {
	setIdleInterval(new BOOLEAN(idleInterval));
    }
    
    public void setIdleInterval(BOOLEAN idleInterval)
    {
	mComponents[1] = idleInterval;
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
	    "IdleIntervalMeasCapabEUTRA"
	),
	new QName (
	    "InformationElements",
	    "IdleIntervalMeasCapabEUTRA"
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
				"RadioFrequencyBandEUTRA"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandEUTRA"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RadioFrequencyBandEUTRA(1), 
				    new RadioFrequencyBandEUTRA(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "radioFrequencyBandEUTRA",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "idleInterval",
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
     * Get the type descriptor (TypeInfo) of 'this' IdleIntervalMeasCapabEUTRA object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IdleIntervalMeasCapabEUTRA object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IdleIntervalMeasCapabEUTRA
