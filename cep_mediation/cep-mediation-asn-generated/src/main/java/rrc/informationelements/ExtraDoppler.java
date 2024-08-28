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
 * Define the ASN1 Type ExtraDoppler from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ExtraDoppler extends Sequence {
    
    /**
     * The default constructor.
     */
    public ExtraDoppler()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ExtraDoppler(INTEGER dopplerFirstOrder, 
		    DopplerUncertainty dopplerUncertainty)
    {
	setDopplerFirstOrder(dopplerFirstOrder);
	setDopplerUncertainty(dopplerUncertainty);
    }
    
    /**
     * Construct with components.
     */
    public ExtraDoppler(long dopplerFirstOrder, 
		    DopplerUncertainty dopplerUncertainty)
    {
	this(new INTEGER(dopplerFirstOrder), dopplerUncertainty);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = DopplerUncertainty.dopU40;
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
		return new INTEGER();
	    case 1:
		return DopplerUncertainty.dopU40;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dopplerFirstOrder"
    public long getDopplerFirstOrder()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDopplerFirstOrder(long dopplerFirstOrder)
    {
	setDopplerFirstOrder(new INTEGER(dopplerFirstOrder));
    }
    
    public void setDopplerFirstOrder(INTEGER dopplerFirstOrder)
    {
	mComponents[0] = dopplerFirstOrder;
    }
    
    
    // Methods for field "dopplerUncertainty"
    public DopplerUncertainty getDopplerUncertainty()
    {
	return (DopplerUncertainty)mComponents[1];
    }
    
    public void setDopplerUncertainty(DopplerUncertainty dopplerUncertainty)
    {
	mComponents[1] = dopplerUncertainty;
    }
    
    
    
    /**
     * Define the ASN1 Type DopplerUncertainty from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class DopplerUncertainty extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DopplerUncertainty()
	{
	    super(cFirstNumber);
	}
	
	protected DopplerUncertainty(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final DopplerUncertainty dopU40 =
	    new DopplerUncertainty(0);
	public static final DopplerUncertainty dopU20 =
	    new DopplerUncertainty(1);
	public static final DopplerUncertainty dopU10 =
	    new DopplerUncertainty(2);
	public static final DopplerUncertainty dopU5 =
	    new DopplerUncertainty(3);
	public static final DopplerUncertainty dopU2_5 =
	    new DopplerUncertainty(4);
	public static final DopplerUncertainty spare3 =
	    new DopplerUncertainty(5);
	public static final DopplerUncertainty spare2 =
	    new DopplerUncertainty(6);
	public static final DopplerUncertainty spare1 =
	    new DopplerUncertainty(7);
	private final static DopplerUncertainty cNamedNumbers[] = {
	     dopU40, 
	     dopU20, 
	     dopU10, 
	     dopU5, 
	     dopU2_5, 
	     spare3, 
	     spare2, 
	     spare1
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
	
	public static DopplerUncertainty valueOf(long value)
	{
	    return (DopplerUncertainty)dopU40.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"ExtraDoppler$DopplerUncertainty"
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
			"dopU40",
			0
		    ),
		    new MemberListElement (
			"dopU20",
			1
		    ),
		    new MemberListElement (
			"dopU10",
			2
		    ),
		    new MemberListElement (
			"dopU5",
			3
		    ),
		    new MemberListElement (
			"dopU2-5",
			4
		    ),
		    new MemberListElement (
			"spare3",
			5
		    ),
		    new MemberListElement (
			"spare2",
			6
		    ),
		    new MemberListElement (
			"spare1",
			7
		    )
		}
	    ),
	    0,
	    dopU40
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DopplerUncertainty object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DopplerUncertainty object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DopplerUncertainty

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
	    "ExtraDoppler"
	),
	new QName (
	    "InformationElements",
	    "ExtraDoppler"
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
				    new com.oss.asn1.INTEGER(-42), 
				    new com.oss.asn1.INTEGER(21),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-42),
				new java.lang.Long(21)
			    ),
			    null
			)
		    ),
		    "dopplerFirstOrder",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "ExtraDoppler$DopplerUncertainty"
			)
		    ),
		    "dopplerUncertainty",
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
     * Get the type descriptor (TypeInfo) of 'this' ExtraDoppler object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ExtraDoppler object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ExtraDoppler
