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
 * Define the ASN1 Type TrafficVolumeMeasQuantity from ASN1 Module InformationElements.
 * @see Choice
 */

public class TrafficVolumeMeasQuantity extends Choice {
    
    /**
     * The default constructor.
     */
    public TrafficVolumeMeasQuantity()
    {
    }
    
    public static final  int  rlc_BufferPayload_chosen = 1;
    public static final  int  averageRLC_BufferPayload_chosen = 2;
    public static final  int  varianceOfRLC_BufferPayload_chosen = 3;
    
    // Methods for field "rlc_BufferPayload"
    public static TrafficVolumeMeasQuantity createTrafficVolumeMeasQuantityWithRlc_BufferPayload(Null rlc_BufferPayload)
    {
	TrafficVolumeMeasQuantity __object = new TrafficVolumeMeasQuantity();

	__object.setRlc_BufferPayload(rlc_BufferPayload);
	return __object;
    }
    
    public boolean hasRlc_BufferPayload()
    {
	return getChosenFlag() == rlc_BufferPayload_chosen;
    }
    
    public void setRlc_BufferPayload(Null rlc_BufferPayload)
    {
	setChosenValue(rlc_BufferPayload);
	setChosenFlag(rlc_BufferPayload_chosen);
    }
    
    
    // Methods for field "averageRLC_BufferPayload"
    public static TrafficVolumeMeasQuantity createTrafficVolumeMeasQuantityWithAverageRLC_BufferPayload(long averageRLC_BufferPayload)
    {
	return createTrafficVolumeMeasQuantityWithAverageRLC_BufferPayload(new TimeInterval(averageRLC_BufferPayload));
    }
    
    public static TrafficVolumeMeasQuantity createTrafficVolumeMeasQuantityWithAverageRLC_BufferPayload(TimeInterval averageRLC_BufferPayload)
    {
	TrafficVolumeMeasQuantity __object = new TrafficVolumeMeasQuantity();

	__object.setAverageRLC_BufferPayload(averageRLC_BufferPayload);
	return __object;
    }
    
    public boolean hasAverageRLC_BufferPayload()
    {
	return getChosenFlag() == averageRLC_BufferPayload_chosen;
    }
    
    public void setAverageRLC_BufferPayload(long averageRLC_BufferPayload)
    {
	setAverageRLC_BufferPayload(new TimeInterval(averageRLC_BufferPayload));
    }
    
    public void setAverageRLC_BufferPayload(TimeInterval averageRLC_BufferPayload)
    {
	setChosenValue(averageRLC_BufferPayload);
	setChosenFlag(averageRLC_BufferPayload_chosen);
    }
    
    
    // Methods for field "varianceOfRLC_BufferPayload"
    public static TrafficVolumeMeasQuantity createTrafficVolumeMeasQuantityWithVarianceOfRLC_BufferPayload(long varianceOfRLC_BufferPayload)
    {
	return createTrafficVolumeMeasQuantityWithVarianceOfRLC_BufferPayload(new TimeInterval(varianceOfRLC_BufferPayload));
    }
    
    public static TrafficVolumeMeasQuantity createTrafficVolumeMeasQuantityWithVarianceOfRLC_BufferPayload(TimeInterval varianceOfRLC_BufferPayload)
    {
	TrafficVolumeMeasQuantity __object = new TrafficVolumeMeasQuantity();

	__object.setVarianceOfRLC_BufferPayload(varianceOfRLC_BufferPayload);
	return __object;
    }
    
    public boolean hasVarianceOfRLC_BufferPayload()
    {
	return getChosenFlag() == varianceOfRLC_BufferPayload_chosen;
    }
    
    public void setVarianceOfRLC_BufferPayload(long varianceOfRLC_BufferPayload)
    {
	setVarianceOfRLC_BufferPayload(new TimeInterval(varianceOfRLC_BufferPayload));
    }
    
    public void setVarianceOfRLC_BufferPayload(TimeInterval varianceOfRLC_BufferPayload)
    {
	setChosenValue(varianceOfRLC_BufferPayload);
	setChosenFlag(varianceOfRLC_BufferPayload_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case rlc_BufferPayload_chosen:
		return new Null();
	    case averageRLC_BufferPayload_chosen:
		return new TimeInterval();
	    case varianceOfRLC_BufferPayload_chosen:
		return new TimeInterval();
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
	    "TrafficVolumeMeasQuantity"
	),
	new QName (
	    "InformationElements",
	    "TrafficVolumeMeasQuantity"
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
		    "rlc-BufferPayload",
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
				"TimeInterval"
			    ),
			    new QName (
				"InformationElements",
				"TimeInterval"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeInterval(1), 
				    new TimeInterval(13),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "averageRLC-BufferPayload",
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
				"TimeInterval"
			    ),
			    new QName (
				"InformationElements",
				"TimeInterval"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeInterval(1), 
				    new TimeInterval(13),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(13)
			    ),
			    null
			)
		    ),
		    "varianceOfRLC-BufferPayload",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TrafficVolumeMeasQuantity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrafficVolumeMeasQuantity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrafficVolumeMeasQuantity
