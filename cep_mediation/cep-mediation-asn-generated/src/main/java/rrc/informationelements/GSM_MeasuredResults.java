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
 * Define the ASN1 Type GSM_MeasuredResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GSM_MeasuredResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public GSM_MeasuredResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GSM_MeasuredResults(GSM_CarrierRSSI gsm_CarrierRSSI, INTEGER dummy, 
		    BSICReported bsicReported, 
		    ObservedTimeDifferenceToGSM dummy2)
    {
	setGsm_CarrierRSSI(gsm_CarrierRSSI);
	setDummy(dummy);
	setBsicReported(bsicReported);
	setDummy2(dummy2);
    }
    
    /**
     * Construct with components.
     */
    public GSM_MeasuredResults(GSM_CarrierRSSI gsm_CarrierRSSI, long dummy, 
		    BSICReported bsicReported, 
		    ObservedTimeDifferenceToGSM dummy2)
    {
	this(gsm_CarrierRSSI, new INTEGER(dummy), bsicReported, dummy2);
    }
    
    /**
     * Construct with required components.
     */
    public GSM_MeasuredResults(BSICReported bsicReported)
    {
	setBsicReported(bsicReported);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GSM_CarrierRSSI();
	mComponents[1] = new INTEGER();
	mComponents[2] = new BSICReported();
	mComponents[3] = new ObservedTimeDifferenceToGSM();
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
		return new GSM_CarrierRSSI();
	    case 1:
		return new INTEGER();
	    case 2:
		return new BSICReported();
	    case 3:
		return new ObservedTimeDifferenceToGSM();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gsm_CarrierRSSI"
    public GSM_CarrierRSSI getGsm_CarrierRSSI()
    {
	return (GSM_CarrierRSSI)mComponents[0];
    }
    
    public void setGsm_CarrierRSSI(GSM_CarrierRSSI gsm_CarrierRSSI)
    {
	mComponents[0] = gsm_CarrierRSSI;
    }
    
    public boolean hasGsm_CarrierRSSI()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGsm_CarrierRSSI()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dummy"
    public long getDummy()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setDummy(long dummy)
    {
	setDummy(new INTEGER(dummy));
    }
    
    public void setDummy(INTEGER dummy)
    {
	mComponents[1] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "bsicReported"
    public BSICReported getBsicReported()
    {
	return (BSICReported)mComponents[2];
    }
    
    public void setBsicReported(BSICReported bsicReported)
    {
	mComponents[2] = bsicReported;
    }
    
    
    // Methods for field "dummy2"
    public ObservedTimeDifferenceToGSM getDummy2()
    {
	return (ObservedTimeDifferenceToGSM)mComponents[3];
    }
    
    public void setDummy2(ObservedTimeDifferenceToGSM dummy2)
    {
	mComponents[3] = dummy2;
    }
    
    public boolean hasDummy2()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDummy2()
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
	    "GSM_MeasuredResults"
	),
	new QName (
	    "InformationElements",
	    "GSM-MeasuredResults"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GSM_CarrierRSSI"
			    ),
			    new QName (
				"InformationElements",
				"GSM-CarrierRSSI"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(6)
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "gsm-CarrierRSSI",
		    0,
		    3,
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
				    new com.oss.asn1.INTEGER(46), 
				    new com.oss.asn1.INTEGER(173),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(46),
				new java.lang.Long(173)
			    ),
			    null
			)
		    ),
		    "dummy",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"BSICReported"
			    ),
			    new QName (
				"InformationElements",
				"BSICReported"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "BSICReported"
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
		    "bsicReported",
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
				"ObservedTimeDifferenceToGSM"
			    ),
			    new QName (
				"InformationElements",
				"ObservedTimeDifferenceToGSM"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ObservedTimeDifferenceToGSM(0), 
				    new ObservedTimeDifferenceToGSM(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "dummy2",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' GSM_MeasuredResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GSM_MeasuredResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GSM_MeasuredResults
