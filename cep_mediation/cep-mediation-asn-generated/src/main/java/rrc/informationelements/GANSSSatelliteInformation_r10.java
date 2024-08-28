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
 * Define the ASN1 Type GANSSSatelliteInformation_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSSSatelliteInformation_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSSSatelliteInformation_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSSSatelliteInformation_r10(INTEGER ganssSatId, 
		    INTEGER dopplerZeroOrder, ExtraDoppler extraDoppler, 
		    INTEGER codePhase, INTEGER integerCodePhase, 
		    BitString codePhaseSearchWindow, 
		    AzimuthAndElevation_r10 azimuthandElevation)
    {
	setGanssSatId(ganssSatId);
	setDopplerZeroOrder(dopplerZeroOrder);
	setExtraDoppler(extraDoppler);
	setCodePhase(codePhase);
	setIntegerCodePhase(integerCodePhase);
	setCodePhaseSearchWindow(codePhaseSearchWindow);
	setAzimuthandElevation(azimuthandElevation);
    }
    
    /**
     * Construct with components.
     */
    public GANSSSatelliteInformation_r10(long ganssSatId, 
		    long dopplerZeroOrder, ExtraDoppler extraDoppler, 
		    long codePhase, long integerCodePhase, 
		    BitString codePhaseSearchWindow, 
		    AzimuthAndElevation_r10 azimuthandElevation)
    {
	this(new INTEGER(ganssSatId), new INTEGER(dopplerZeroOrder), 
	     extraDoppler, new INTEGER(codePhase), 
	     new INTEGER(integerCodePhase), codePhaseSearchWindow, 
	     azimuthandElevation);
    }
    
    /**
     * Construct with required components.
     */
    public GANSSSatelliteInformation_r10(long ganssSatId, 
		    long dopplerZeroOrder, long codePhase, 
		    long integerCodePhase, BitString codePhaseSearchWindow)
    {
	setGanssSatId(ganssSatId);
	setDopplerZeroOrder(dopplerZeroOrder);
	setCodePhase(codePhase);
	setIntegerCodePhase(integerCodePhase);
	setCodePhaseSearchWindow(codePhaseSearchWindow);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new ExtraDoppler();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new BitString();
	mComponents[6] = new AzimuthAndElevation_r10();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
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
		return new ExtraDoppler();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new BitString();
	    case 6:
		return new AzimuthAndElevation_r10();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssSatId"
    public long getGanssSatId()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanssSatId(long ganssSatId)
    {
	setGanssSatId(new INTEGER(ganssSatId));
    }
    
    public void setGanssSatId(INTEGER ganssSatId)
    {
	mComponents[0] = ganssSatId;
    }
    
    
    // Methods for field "dopplerZeroOrder"
    public long getDopplerZeroOrder()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setDopplerZeroOrder(long dopplerZeroOrder)
    {
	setDopplerZeroOrder(new INTEGER(dopplerZeroOrder));
    }
    
    public void setDopplerZeroOrder(INTEGER dopplerZeroOrder)
    {
	mComponents[1] = dopplerZeroOrder;
    }
    
    
    // Methods for field "extraDoppler"
    public ExtraDoppler getExtraDoppler()
    {
	return (ExtraDoppler)mComponents[2];
    }
    
    public void setExtraDoppler(ExtraDoppler extraDoppler)
    {
	mComponents[2] = extraDoppler;
    }
    
    public boolean hasExtraDoppler()
    {
	return componentIsPresent(2);
    }
    
    public void deleteExtraDoppler()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "codePhase"
    public long getCodePhase()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setCodePhase(long codePhase)
    {
	setCodePhase(new INTEGER(codePhase));
    }
    
    public void setCodePhase(INTEGER codePhase)
    {
	mComponents[3] = codePhase;
    }
    
    
    // Methods for field "integerCodePhase"
    public long getIntegerCodePhase()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setIntegerCodePhase(long integerCodePhase)
    {
	setIntegerCodePhase(new INTEGER(integerCodePhase));
    }
    
    public void setIntegerCodePhase(INTEGER integerCodePhase)
    {
	mComponents[4] = integerCodePhase;
    }
    
    
    // Methods for field "codePhaseSearchWindow"
    public BitString getCodePhaseSearchWindow()
    {
	return (BitString)mComponents[5];
    }
    
    public void setCodePhaseSearchWindow(BitString codePhaseSearchWindow)
    {
	mComponents[5] = codePhaseSearchWindow;
    }
    
    
    // Methods for field "azimuthandElevation"
    public AzimuthAndElevation_r10 getAzimuthandElevation()
    {
	return (AzimuthAndElevation_r10)mComponents[6];
    }
    
    public void setAzimuthandElevation(AzimuthAndElevation_r10 azimuthandElevation)
    {
	mComponents[6] = azimuthandElevation;
    }
    
    public boolean hasAzimuthandElevation()
    {
	return componentIsPresent(6);
    }
    
    public void deleteAzimuthandElevation()
    {
	setComponentAbsent(6);
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
	    "GANSSSatelliteInformation_r10"
	),
	new QName (
	    "InformationElements",
	    "GANSSSatelliteInformation-r10"
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
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "ganssSatId",
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
				    new com.oss.asn1.INTEGER(-2048), 
				    new com.oss.asn1.INTEGER(2047),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-2048),
				new java.lang.Long(2047)
			    ),
			    null
			)
		    ),
		    "dopplerZeroOrder",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ExtraDoppler"
			    ),
			    new QName (
				"InformationElements",
				"ExtraDoppler"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ExtraDoppler"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ExtraDoppler"
				)
			    ),
			    0
			)
		    ),
		    "extraDoppler",
		    2,
		    3,
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
				    new com.oss.asn1.INTEGER(1023),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1023)
			    ),
			    null
			)
		    ),
		    "codePhase",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new com.oss.asn1.INTEGER(127),
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
		    "integerCodePhase",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(5)
				)
			    ),
			    new Bounds (
				new java.lang.Long(5),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "codePhaseSearchWindow",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AzimuthAndElevation_r10"
			    ),
			    new QName (
				"InformationElements",
				"AzimuthAndElevation-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "AzimuthAndElevation_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "AzimuthAndElevation_r10"
				)
			    ),
			    0
			)
		    ),
		    "azimuthandElevation",
		    6,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSSSatelliteInformation_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSSSatelliteInformation_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSSSatelliteInformation_r10
