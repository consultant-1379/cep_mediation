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
 * Define the ASN1 Type DL_MultiCarrier_Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_MultiCarrier_Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_MultiCarrier_Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_MultiCarrier_Information(Tsn_Length tsn_Length, 
		    INTEGER multiCarrierNumber, 
		    DL_HSPDSCH_MultiCarrier_Information dl_HSPDSCH_MultiCarrier_Information)
    {
	setTsn_Length(tsn_Length);
	setMultiCarrierNumber(multiCarrierNumber);
	setDl_HSPDSCH_MultiCarrier_Information(dl_HSPDSCH_MultiCarrier_Information);
    }
    
    /**
     * Construct with components.
     */
    public DL_MultiCarrier_Information(Tsn_Length tsn_Length, 
		    long multiCarrierNumber, 
		    DL_HSPDSCH_MultiCarrier_Information dl_HSPDSCH_MultiCarrier_Information)
    {
	this(tsn_Length, new INTEGER(multiCarrierNumber), 
	     dl_HSPDSCH_MultiCarrier_Information);
    }
    
    public void initComponents()
    {
	mComponents[0] = Tsn_Length.tsn_6bits;
	mComponents[1] = new INTEGER();
	mComponents[2] = new DL_HSPDSCH_MultiCarrier_Information();
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
		return Tsn_Length.tsn_6bits;
	    case 1:
		return new INTEGER();
	    case 2:
		return new DL_HSPDSCH_MultiCarrier_Information();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tsn_Length"
    public Tsn_Length getTsn_Length()
    {
	return (Tsn_Length)mComponents[0];
    }
    
    public void setTsn_Length(Tsn_Length tsn_Length)
    {
	mComponents[0] = tsn_Length;
    }
    
    public boolean hasTsn_Length()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTsn_Length()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsn_Length from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Tsn_Length extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Tsn_Length()
	{
	    super(cFirstNumber);
	}
	
	protected Tsn_Length(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Tsn_Length tsn_6bits =
	    new Tsn_Length(0);
	public static final Tsn_Length tsn_9bits =
	    new Tsn_Length(1);
	private final static Tsn_Length cNamedNumbers[] = {
	     tsn_6bits, 
	     tsn_9bits
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
	
	public static Tsn_Length valueOf(long value)
	{
	    return (Tsn_Length)tsn_6bits.lookupValue(value);
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
		"DL_MultiCarrier_Information$Tsn_Length"
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
			"tsn-6bits",
			0
		    ),
		    new MemberListElement (
			"tsn-9bits",
			1
		    )
		}
	    ),
	    0,
	    tsn_6bits
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsn_Length object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsn_Length object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsn_Length

    // Methods for field "multiCarrierNumber"
    public long getMultiCarrierNumber()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setMultiCarrierNumber(long multiCarrierNumber)
    {
	setMultiCarrierNumber(new INTEGER(multiCarrierNumber));
    }
    
    public void setMultiCarrierNumber(INTEGER multiCarrierNumber)
    {
	mComponents[1] = multiCarrierNumber;
    }
    
    public boolean hasMultiCarrierNumber()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMultiCarrierNumber()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dl_HSPDSCH_MultiCarrier_Information"
    public DL_HSPDSCH_MultiCarrier_Information getDl_HSPDSCH_MultiCarrier_Information()
    {
	return (DL_HSPDSCH_MultiCarrier_Information)mComponents[2];
    }
    
    public void setDl_HSPDSCH_MultiCarrier_Information(DL_HSPDSCH_MultiCarrier_Information dl_HSPDSCH_MultiCarrier_Information)
    {
	mComponents[2] = dl_HSPDSCH_MultiCarrier_Information;
    }
    
    public boolean hasDl_HSPDSCH_MultiCarrier_Information()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDl_HSPDSCH_MultiCarrier_Information()
    {
	setComponentAbsent(2);
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
	    "DL_MultiCarrier_Information"
	),
	new QName (
	    "InformationElements",
	    "DL-MultiCarrier-Information"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_MultiCarrier_Information$Tsn_Length"
			)
		    ),
		    "tsn-Length",
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "multiCarrierNumber",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
			)
		    ),
		    "dl-HSPDSCH-MultiCarrier-Information",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_MultiCarrier_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_MultiCarrier_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_MultiCarrier_Information
