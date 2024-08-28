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
 * Define the ASN1 Type GANSSMeasurementParameters from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class GANSSMeasurementParameters extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public GANSSMeasurementParameters()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public GANSSMeasurementParameters(Sequence_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the ASN1 Type Sequence_ from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Sequence_ extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Sequence_()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Sequence_(INTEGER satId, INTEGER cSurNzero, 
			MultipathIndicator multipathIndicator, 
			BitString carrierQualityIndication, 
			INTEGER ganssCodePhase, INTEGER ganssIntegerCodePhase, 
			INTEGER codePhaseRmsError, INTEGER doppler, 
			INTEGER adr)
	{
	    setSatId(satId);
	    setCSurNzero(cSurNzero);
	    setMultipathIndicator(multipathIndicator);
	    setCarrierQualityIndication(carrierQualityIndication);
	    setGanssCodePhase(ganssCodePhase);
	    setGanssIntegerCodePhase(ganssIntegerCodePhase);
	    setCodePhaseRmsError(codePhaseRmsError);
	    setDoppler(doppler);
	    setAdr(adr);
	}
	
	/**
	 * Construct with components.
	 */
	public Sequence_(long satId, long cSurNzero, 
			MultipathIndicator multipathIndicator, 
			BitString carrierQualityIndication, 
			long ganssCodePhase, long ganssIntegerCodePhase, 
			long codePhaseRmsError, long doppler, long adr)
	{
	    this(new INTEGER(satId), new INTEGER(cSurNzero), 
		 multipathIndicator, carrierQualityIndication, 
		 new INTEGER(ganssCodePhase), 
		 new INTEGER(ganssIntegerCodePhase), 
		 new INTEGER(codePhaseRmsError), new INTEGER(doppler), 
		 new INTEGER(adr));
	}
	
	/**
	 * Construct with required components.
	 */
	public Sequence_(long satId, long cSurNzero, 
			MultipathIndicator multipathIndicator, 
			long ganssCodePhase, long codePhaseRmsError, 
			long doppler)
	{
	    setSatId(satId);
	    setCSurNzero(cSurNzero);
	    setMultipathIndicator(multipathIndicator);
	    setGanssCodePhase(ganssCodePhase);
	    setCodePhaseRmsError(codePhaseRmsError);
	    setDoppler(doppler);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new INTEGER();
	    mComponents[2] = MultipathIndicator.nm;
	    mComponents[3] = new BitString();
	    mComponents[4] = new INTEGER();
	    mComponents[5] = new INTEGER();
	    mComponents[6] = new INTEGER();
	    mComponents[7] = new INTEGER();
	    mComponents[8] = new INTEGER();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[9];
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
		    return MultipathIndicator.nm;
		case 3:
		    return new BitString();
		case 4:
		    return new INTEGER();
		case 5:
		    return new INTEGER();
		case 6:
		    return new INTEGER();
		case 7:
		    return new INTEGER();
		case 8:
		    return new INTEGER();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "satId"
	public long getSatId()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setSatId(long satId)
	{
	    setSatId(new INTEGER(satId));
	}
	
	public void setSatId(INTEGER satId)
	{
	    mComponents[0] = satId;
	}
	
	
	// Methods for field "cSurNzero"
	public long getCSurNzero()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setCSurNzero(long cSurNzero)
	{
	    setCSurNzero(new INTEGER(cSurNzero));
	}
	
	public void setCSurNzero(INTEGER cSurNzero)
	{
	    mComponents[1] = cSurNzero;
	}
	
	
	// Methods for field "multipathIndicator"
	public MultipathIndicator getMultipathIndicator()
	{
	    return (MultipathIndicator)mComponents[2];
	}
	
	public void setMultipathIndicator(MultipathIndicator multipathIndicator)
	{
	    mComponents[2] = multipathIndicator;
	}
	
	
	
	/**
	 * Define the ASN1 Type MultipathIndicator from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class MultipathIndicator extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private MultipathIndicator()
	    {
		super(cFirstNumber);
	    }
	    
	    protected MultipathIndicator(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final MultipathIndicator nm =
		new MultipathIndicator(0);
	    public static final MultipathIndicator low =
		new MultipathIndicator(1);
	    public static final MultipathIndicator medium =
		new MultipathIndicator(2);
	    public static final MultipathIndicator high =
		new MultipathIndicator(3);
	    private final static MultipathIndicator cNamedNumbers[] = {
		 nm, 
		 low, 
		 medium, 
		 high
	    };
	    protected final static long cFirstNumber = 0;
	    protected final static boolean cLinearNumbers = false;
	    
	    public Enumerated[] getNamedNumbers()
	    {
		return cNamedNumbers;
	    }
	    
	    public boolean hasLinearNumbers()
	    {
		return cLinearNumbers;
	    }
	    
	    public long getFirstNumber()
	    {
		return cFirstNumber;
	    }
	    
	    public static MultipathIndicator valueOf(long value)
	    {
		return (MultipathIndicator)nm.lookupValue(value);
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		new Tags (
		    new short[] {
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "GANSSMeasurementParameters$Sequence_$MultipathIndicator"
		),
		new QName (
		    "builtin",
		    "ENUMERATED"
		),
		12314,
		null,
		new MemberList (
		    new MemberListElement[] {
			new MemberListElement (
			    "nm",
			    0
			),
			new MemberListElement (
			    "low",
			    1
			),
			new MemberListElement (
			    "medium",
			    2
			),
			new MemberListElement (
			    "high",
			    3
			)
		    }
		),
		0,
		nm
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' MultipathIndicator object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' MultipathIndicator object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for MultipathIndicator

	// Methods for field "carrierQualityIndication"
	public BitString getCarrierQualityIndication()
	{
	    return (BitString)mComponents[3];
	}
	
	public void setCarrierQualityIndication(BitString carrierQualityIndication)
	{
	    mComponents[3] = carrierQualityIndication;
	}
	
	public boolean hasCarrierQualityIndication()
	{
	    return componentIsPresent(3);
	}
	
	public void deleteCarrierQualityIndication()
	{
	    setComponentAbsent(3);
	}
	
	
	// Methods for field "ganssCodePhase"
	public long getGanssCodePhase()
	{
	    return ((INTEGER)mComponents[4]).longValue();
	}
	
	public void setGanssCodePhase(long ganssCodePhase)
	{
	    setGanssCodePhase(new INTEGER(ganssCodePhase));
	}
	
	public void setGanssCodePhase(INTEGER ganssCodePhase)
	{
	    mComponents[4] = ganssCodePhase;
	}
	
	
	// Methods for field "ganssIntegerCodePhase"
	public long getGanssIntegerCodePhase()
	{
	    return ((INTEGER)mComponents[5]).longValue();
	}
	
	public void setGanssIntegerCodePhase(long ganssIntegerCodePhase)
	{
	    setGanssIntegerCodePhase(new INTEGER(ganssIntegerCodePhase));
	}
	
	public void setGanssIntegerCodePhase(INTEGER ganssIntegerCodePhase)
	{
	    mComponents[5] = ganssIntegerCodePhase;
	}
	
	public boolean hasGanssIntegerCodePhase()
	{
	    return componentIsPresent(5);
	}
	
	public void deleteGanssIntegerCodePhase()
	{
	    setComponentAbsent(5);
	}
	
	
	// Methods for field "codePhaseRmsError"
	public long getCodePhaseRmsError()
	{
	    return ((INTEGER)mComponents[6]).longValue();
	}
	
	public void setCodePhaseRmsError(long codePhaseRmsError)
	{
	    setCodePhaseRmsError(new INTEGER(codePhaseRmsError));
	}
	
	public void setCodePhaseRmsError(INTEGER codePhaseRmsError)
	{
	    mComponents[6] = codePhaseRmsError;
	}
	
	
	// Methods for field "doppler"
	public long getDoppler()
	{
	    return ((INTEGER)mComponents[7]).longValue();
	}
	
	public void setDoppler(long doppler)
	{
	    setDoppler(new INTEGER(doppler));
	}
	
	public void setDoppler(INTEGER doppler)
	{
	    mComponents[7] = doppler;
	}
	
	
	// Methods for field "adr"
	public long getAdr()
	{
	    return ((INTEGER)mComponents[8]).longValue();
	}
	
	public void setAdr(long adr)
	{
	    setAdr(new INTEGER(adr));
	}
	
	public void setAdr(INTEGER adr)
	{
	    mComponents[8] = adr;
	}
	
	public boolean hasAdr()
	{
	    return componentIsPresent(8);
	}
	
	public void deleteAdr()
	{
	    setComponentAbsent(8);
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
		"GANSSMeasurementParameters$Sequence_"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
			"satId",
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
			"cSurNzero",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"GANSSMeasurementParameters$Sequence_$MultipathIndicator"
			    )
			),
			"multipathIndicator",
			2,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8003
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
					new com.oss.asn1.INTEGER(2)
				    )
				),
				new Bounds (
				    new java.lang.Long(2),
				    new java.lang.Long(2)
				),
				null
			    )
			),
			"carrierQualityIndication",
			3,
			3,
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
					new com.oss.asn1.INTEGER(2097151),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(2097151)
				),
				null
			    )
			),
			"ganssCodePhase",
			4,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8005
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
			"ganssIntegerCodePhase",
			5,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8006
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
			"codePhaseRmsError",
			6,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8007
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
					new com.oss.asn1.INTEGER(-32768), 
					new com.oss.asn1.INTEGER(32767),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(-32768),
				    new java.lang.Long(32767)
				),
				null
			    )
			),
			"doppler",
			7,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8008
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
					new com.oss.asn1.INTEGER(33554431),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(33554431)
				),
				null
			    )
			),
			"adr",
			8,
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
			    new TagDecoderElement((short)0x8002, 2)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8003, 3),
			    new TagDecoderElement((short)0x8004, 4)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8004, 4)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8005, 5),
			    new TagDecoderElement((short)0x8006, 6)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8006, 6)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8007, 7)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8008, 8)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sequence_

    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(Sequence_ element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(Sequence_ element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized Sequence_ get(int atIndex)
    {
	return (Sequence_)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(Sequence_ element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(Sequence_ element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new Sequence_();
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "GANSSMeasurementParameters"
	),
	new QName (
	    "InformationElements",
	    "GANSSMeasurementParameters"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(64),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(64)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"GANSSMeasurementParameters$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSSMeasurementParameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSSMeasurementParameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSSMeasurementParameters
