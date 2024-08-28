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
 * Define the ASN1 Type DL_HSPDSCH_MultiCarrier_Information from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class DL_HSPDSCH_MultiCarrier_Information extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public DL_HSPDSCH_MultiCarrier_Information()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public DL_HSPDSCH_MultiCarrier_Information(Sequence_[] elements)
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
	public Sequence_(UARFCN uarfcn_Carrier, HARQ_Info harqInfo, 
			HS_PDSCH_Midamble_Configuration_TDD128 hs_PDSCH_Midamble_Configuration, 
			Hs_SCCH_TDD128_MultiCarrier hs_SCCH_TDD128_MultiCarrier)
	{
	    setUarfcn_Carrier(uarfcn_Carrier);
	    setHarqInfo(harqInfo);
	    setHs_PDSCH_Midamble_Configuration(hs_PDSCH_Midamble_Configuration);
	    setHs_SCCH_TDD128_MultiCarrier(hs_SCCH_TDD128_MultiCarrier);
	}
	
	/**
	 * Construct with required components.
	 */
	public Sequence_(UARFCN uarfcn_Carrier)
	{
	    setUarfcn_Carrier(uarfcn_Carrier);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UARFCN();
	    mComponents[1] = new HARQ_Info();
	    mComponents[2] = new HS_PDSCH_Midamble_Configuration_TDD128();
	    mComponents[3] = new Hs_SCCH_TDD128_MultiCarrier();
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
		    return new UARFCN();
		case 1:
		    return new HARQ_Info();
		case 2:
		    return new HS_PDSCH_Midamble_Configuration_TDD128();
		case 3:
		    return new Hs_SCCH_TDD128_MultiCarrier();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "uarfcn_Carrier"
	public UARFCN getUarfcn_Carrier()
	{
	    return (UARFCN)mComponents[0];
	}
	
	public void setUarfcn_Carrier(UARFCN uarfcn_Carrier)
	{
	    mComponents[0] = uarfcn_Carrier;
	}
	
	
	// Methods for field "harqInfo"
	public HARQ_Info getHarqInfo()
	{
	    return (HARQ_Info)mComponents[1];
	}
	
	public void setHarqInfo(HARQ_Info harqInfo)
	{
	    mComponents[1] = harqInfo;
	}
	
	public boolean hasHarqInfo()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteHarqInfo()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "hs_PDSCH_Midamble_Configuration"
	public HS_PDSCH_Midamble_Configuration_TDD128 getHs_PDSCH_Midamble_Configuration()
	{
	    return (HS_PDSCH_Midamble_Configuration_TDD128)mComponents[2];
	}
	
	public void setHs_PDSCH_Midamble_Configuration(HS_PDSCH_Midamble_Configuration_TDD128 hs_PDSCH_Midamble_Configuration)
	{
	    mComponents[2] = hs_PDSCH_Midamble_Configuration;
	}
	
	public boolean hasHs_PDSCH_Midamble_Configuration()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteHs_PDSCH_Midamble_Configuration()
	{
	    setComponentAbsent(2);
	}
	
	
	// Methods for field "hs_SCCH_TDD128_MultiCarrier"
	public Hs_SCCH_TDD128_MultiCarrier getHs_SCCH_TDD128_MultiCarrier()
	{
	    return (Hs_SCCH_TDD128_MultiCarrier)mComponents[3];
	}
	
	public void setHs_SCCH_TDD128_MultiCarrier(Hs_SCCH_TDD128_MultiCarrier hs_SCCH_TDD128_MultiCarrier)
	{
	    mComponents[3] = hs_SCCH_TDD128_MultiCarrier;
	}
	
	public boolean hasHs_SCCH_TDD128_MultiCarrier()
	{
	    return componentIsPresent(3);
	}
	
	public void deleteHs_SCCH_TDD128_MultiCarrier()
	{
	    setComponentAbsent(3);
	}
	
	
	
	/**
	 * Define the ASN1 Type Hs_SCCH_TDD128_MultiCarrier from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class Hs_SCCH_TDD128_MultiCarrier extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Hs_SCCH_TDD128_MultiCarrier()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public Hs_SCCH_TDD128_MultiCarrier(HS_SCCH_TDD128_MultiCarrier[] elements)
	    {
		super(elements);
	    }
	    
	    /**
	     * Add an Element to the SEQUENCE OF/SET OF.
	     */
	    public synchronized void add(HS_SCCH_TDD128_MultiCarrier element)
	    {
		super.addElement(element);
	    }
	    
	    /**
	     * Set an Element in the SEQUENCE OF/SET OF.
	     */
	    public synchronized void set(HS_SCCH_TDD128_MultiCarrier element, int atIndex)
	    {
		super.setElement(element, atIndex);
	    }
	    
	    /**
	     * Get an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized HS_SCCH_TDD128_MultiCarrier get(int atIndex)
	    {
		return (HS_SCCH_TDD128_MultiCarrier)super.getElement(atIndex);
	    }
	    
	    /**
	     * Insert an Element into the SEQUENCE OF/SET OF.
	     */
	    public synchronized void insert(HS_SCCH_TDD128_MultiCarrier element, int atIndex)
	    {
		super.insertElement(element, atIndex);
	    }
	    
	    /**
	     * Remove an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized void remove(HS_SCCH_TDD128_MultiCarrier element)
	    {
		super.removeElement(element);
	    }
	    
	    /**
	     * Create an instance of  SEQUENCE OF/SET OF.
	     */
	    public AbstractData createInstance()
	    {
		return (AbstractData)new HS_SCCH_TDD128_MultiCarrier();
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final ContainerInfo c_typeinfo = new ContainerInfo (
		new Tags (
		    new short[] {
			(short)0x8003
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "DL_HSPDSCH_MultiCarrier_Information$Sequence_$Hs_SCCH_TDD128_MultiCarrier"
		),
		new QName (
		    "builtin",
		    "SEQUENCE OF"
		),
		12314,
		new SizeConstraint (
		    new ValueRangeConstraint (
			new AbstractBounds(
			    new com.oss.asn1.INTEGER(1), 
			    new com.oss.asn1.INTEGER(4),
			    0
			)
		    )
		),
		new Bounds (
		    new java.lang.Long(1),
		    new java.lang.Long(4)
		),
		new TypeInfoRef (
		    new QName (
			"rrc.informationelements",
			"HS_SCCH_TDD128_MultiCarrier"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Hs_SCCH_TDD128_MultiCarrier object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Hs_SCCH_TDD128_MultiCarrier object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Hs_SCCH_TDD128_MultiCarrier

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
		"DL_HSPDSCH_MultiCarrier_Information$Sequence_"
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
				    "UARFCN"
				),
				new QName (
				    "InformationElements",
				    "UARFCN"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new UARFCN(0), 
					new UARFCN(16383),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(16383)
				),
				null
			    )
			),
			"uarfcn-Carrier",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info"
				),
				new QName (
				    "InformationElements",
				    "HARQ-Info"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"HARQ_Info"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"HARQ_Info"
				    )
				),
				0
			    )
			),
			"harqInfo",
			1,
			3,
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
				    "HS_PDSCH_Midamble_Configuration_TDD128"
				),
				new QName (
				    "InformationElements",
				    "HS-PDSCH-Midamble-Configuration-TDD128"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"HS_PDSCH_Midamble_Configuration_TDD128"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"HS_PDSCH_Midamble_Configuration_TDD128"
				    )
				),
				0
			    )
			),
			"hs-PDSCH-Midamble-Configuration",
			2,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"DL_HSPDSCH_MultiCarrier_Information$Sequence_$Hs_SCCH_TDD128_MultiCarrier"
			    )
			),
			"hs-SCCH-TDD128-MultiCarrier",
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
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3)
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
	    "DL_HSPDSCH_MultiCarrier_Information"
	),
	new QName (
	    "InformationElements",
	    "DL-HSPDSCH-MultiCarrier-Information"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(6),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(6)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"DL_HSPDSCH_MultiCarrier_Information$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_HSPDSCH_MultiCarrier_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_HSPDSCH_MultiCarrier_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_HSPDSCH_MultiCarrier_Information
