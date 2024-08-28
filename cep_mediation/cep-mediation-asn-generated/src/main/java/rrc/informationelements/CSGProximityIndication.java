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
 * Define the ASN1 Type CSGProximityIndication from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CSGProximityIndication extends Sequence {
    
    /**
     * The default constructor.
     */
    public CSGProximityIndication()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CSGProximityIndication(CSGproximityInd cSGproximityInd, 
		    RadioAccessTechnology radioAccessTechnology)
    {
	setCSGproximityInd(cSGproximityInd);
	setRadioAccessTechnology(radioAccessTechnology);
    }
    
    public void initComponents()
    {
	mComponents[0] = CSGproximityInd.entering;
	mComponents[1] = new RadioAccessTechnology();
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
		return CSGproximityInd.entering;
	    case 1:
		return new RadioAccessTechnology();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cSGproximityInd"
    public CSGproximityInd getCSGproximityInd()
    {
	return (CSGproximityInd)mComponents[0];
    }
    
    public void setCSGproximityInd(CSGproximityInd cSGproximityInd)
    {
	mComponents[0] = cSGproximityInd;
    }
    
    
    
    /**
     * Define the ASN1 Type CSGproximityInd from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class CSGproximityInd extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private CSGproximityInd()
	{
	    super(cFirstNumber);
	}
	
	protected CSGproximityInd(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final CSGproximityInd entering =
	    new CSGproximityInd(0);
	public static final CSGproximityInd leaving =
	    new CSGproximityInd(1);
	private final static CSGproximityInd cNamedNumbers[] = {
	     entering, 
	     leaving
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
	
	public static CSGproximityInd valueOf(long value)
	{
	    return (CSGproximityInd)entering.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CSGProximityIndication$CSGproximityInd"
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
			"entering",
			0
		    ),
		    new MemberListElement (
			"leaving",
			1
		    )
		}
	    ),
	    0,
	    entering
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' CSGproximityInd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CSGproximityInd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CSGproximityInd

    // Methods for field "radioAccessTechnology"
    public RadioAccessTechnology getRadioAccessTechnology()
    {
	return (RadioAccessTechnology)mComponents[1];
    }
    
    public void setRadioAccessTechnology(RadioAccessTechnology radioAccessTechnology)
    {
	mComponents[1] = radioAccessTechnology;
    }
    
    
    
    /**
     * Define the ASN1 Type RadioAccessTechnology from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class RadioAccessTechnology extends Choice {
	
	/**
	 * The default constructor.
	 */
	public RadioAccessTechnology()
	{
	}
	
	public static final  int  uTRA_chosen = 1;
	public static final  int  e_UTRA_chosen = 2;
	
	// Methods for field "uTRA"
	public static RadioAccessTechnology createRadioAccessTechnologyWithUTRA(UTRA uTRA)
	{
	    RadioAccessTechnology __object = new RadioAccessTechnology();

	    __object.setUTRA(uTRA);
	    return __object;
	}
	
	public boolean hasUTRA()
	{
	    return getChosenFlag() == uTRA_chosen;
	}
	
	public void setUTRA(UTRA uTRA)
	{
	    setChosenValue(uTRA);
	    setChosenFlag(uTRA_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type UTRA from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class UTRA extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public UTRA()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public UTRA(FrequencyInfo cSGFrequencyInfoUTRA)
	    {
		setCSGFrequencyInfoUTRA(cSGFrequencyInfoUTRA);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new FrequencyInfo();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[1];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new FrequencyInfo();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cSGFrequencyInfoUTRA"
	    public FrequencyInfo getCSGFrequencyInfoUTRA()
	    {
		return (FrequencyInfo)mComponents[0];
	    }
	    
	    public void setCSGFrequencyInfoUTRA(FrequencyInfo cSGFrequencyInfoUTRA)
	    {
		mComponents[0] = cSGFrequencyInfoUTRA;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "CSGProximityIndication$RadioAccessTechnology$UTRA"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"FrequencyInfo"
				    ),
				    new QName (
					"InformationElements",
					"FrequencyInfo"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "FrequencyInfo"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "FrequencyInfo"
					)
				    ),
				    0
				)
			    ),
			    "cSGFrequencyInfoUTRA",
			    0,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' UTRA object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' UTRA object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for UTRA

	// Methods for field "e_UTRA"
	public static RadioAccessTechnology createRadioAccessTechnologyWithE_UTRA(E_UTRA e_UTRA)
	{
	    RadioAccessTechnology __object = new RadioAccessTechnology();

	    __object.setE_UTRA(e_UTRA);
	    return __object;
	}
	
	public boolean hasE_UTRA()
	{
	    return getChosenFlag() == e_UTRA_chosen;
	}
	
	public void setE_UTRA(E_UTRA e_UTRA)
	{
	    setChosenValue(e_UTRA);
	    setChosenFlag(e_UTRA_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type E_UTRA from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class E_UTRA extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public E_UTRA()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public E_UTRA(EARFCN cSGFrequencyInfoEUTRA)
	    {
		setCSGFrequencyInfoEUTRA(cSGFrequencyInfoEUTRA);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new EARFCN();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[1];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new EARFCN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cSGFrequencyInfoEUTRA"
	    public EARFCN getCSGFrequencyInfoEUTRA()
	    {
		return (EARFCN)mComponents[0];
	    }
	    
	    public void setCSGFrequencyInfoEUTRA(EARFCN cSGFrequencyInfoEUTRA)
	    {
		mComponents[0] = cSGFrequencyInfoEUTRA;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "CSGProximityIndication$RadioAccessTechnology$E_UTRA"
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
					"rrc.informationelements",
					"EARFCN"
				    ),
				    new QName (
					"InformationElements",
					"EARFCN"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new EARFCN(0), 
					    new EARFCN(65535),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(65535)
				    ),
				    null
				)
			    ),
			    "cSGFrequencyInfoEUTRA",
			    0,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' E_UTRA object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' E_UTRA object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for E_UTRA

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case uTRA_chosen:
		    return new UTRA();
		case e_UTRA_chosen:
		    return new E_UTRA();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CSGProximityIndication$RadioAccessTechnology"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"CSGProximityIndication$RadioAccessTechnology$UTRA"
			    )
			),
			"uTRA",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"CSGProximityIndication$RadioAccessTechnology$E_UTRA"
			    )
			),
			"e-UTRA",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' RadioAccessTechnology object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RadioAccessTechnology object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RadioAccessTechnology

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
	    "CSGProximityIndication"
	),
	new QName (
	    "InformationElements",
	    "CSGProximityIndication"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CSGProximityIndication$CSGproximityInd"
			)
		    ),
		    "cSGproximityInd",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CSGProximityIndication$RadioAccessTechnology"
			)
		    ),
		    "radioAccessTechnology",
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
     * Get the type descriptor (TypeInfo) of 'this' CSGProximityIndication object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CSGProximityIndication object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CSGProximityIndication
