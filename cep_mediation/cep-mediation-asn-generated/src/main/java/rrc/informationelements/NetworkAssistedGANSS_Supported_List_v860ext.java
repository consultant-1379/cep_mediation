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
 * Define the ASN1 Type NetworkAssistedGANSS_Supported_List_v860ext from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class NetworkAssistedGANSS_Supported_List_v860ext extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public NetworkAssistedGANSS_Supported_List_v860ext()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public NetworkAssistedGANSS_Supported_List_v860ext(Sequence_[] elements)
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
	public Sequence_(BitString sbas_Ids, BitString gANSS_SignalIds, 
			Non_native_AD_choices_supported non_native_AD_choices_supported)
	{
	    setSbas_Ids(sbas_Ids);
	    setGANSS_SignalIds(gANSS_SignalIds);
	    setNon_native_AD_choices_supported(non_native_AD_choices_supported);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new BitString();
	    mComponents[2] = Non_native_AD_choices_supported._true;
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
		    return new BitString();
		case 1:
		    return new BitString();
		case 2:
		    return Non_native_AD_choices_supported._true;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sbas_Ids"
	public BitString getSbas_Ids()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setSbas_Ids(BitString sbas_Ids)
	{
	    mComponents[0] = sbas_Ids;
	}
	
	public boolean hasSbas_Ids()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteSbas_Ids()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "gANSS_SignalIds"
	public BitString getGANSS_SignalIds()
	{
	    return (BitString)mComponents[1];
	}
	
	public void setGANSS_SignalIds(BitString gANSS_SignalIds)
	{
	    mComponents[1] = gANSS_SignalIds;
	}
	
	public boolean hasGANSS_SignalIds()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteGANSS_SignalIds()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "non_native_AD_choices_supported"
	public Non_native_AD_choices_supported getNon_native_AD_choices_supported()
	{
	    return (Non_native_AD_choices_supported)mComponents[2];
	}
	
	public void setNon_native_AD_choices_supported(Non_native_AD_choices_supported non_native_AD_choices_supported)
	{
	    mComponents[2] = non_native_AD_choices_supported;
	}
	
	public boolean hasNon_native_AD_choices_supported()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteNon_native_AD_choices_supported()
	{
	    setComponentAbsent(2);
	}
	
	
	
	/**
	 * Define the ASN1 Type Non_native_AD_choices_supported from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class Non_native_AD_choices_supported extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private Non_native_AD_choices_supported()
	    {
		super(cFirstNumber);
	    }
	    
	    protected Non_native_AD_choices_supported(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final Non_native_AD_choices_supported _true =
		new Non_native_AD_choices_supported(0);
	    private final static Non_native_AD_choices_supported cNamedNumbers[] = {
		 _true
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
	    
	    public static Non_native_AD_choices_supported valueOf(long value)
	    {
		return (Non_native_AD_choices_supported)_true.lookupValue(value);
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
		    "NetworkAssistedGANSS_Supported_List_v860ext$Sequence_$Non_native_AD_choices_supported"
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
			    "true",
			    0
			)
		    }
		),
		0,
		_true
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Non_native_AD_choices_supported object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Non_native_AD_choices_supported object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Non_native_AD_choices_supported

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
		"NetworkAssistedGANSS_Supported_List_v860ext$Sequence_"
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
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
					new com.oss.asn1.INTEGER(8)
				    )
				),
				new Bounds (
				    new java.lang.Long(8),
				    new java.lang.Long(8)
				),
				null
			    )
			),
			"sbas-Ids",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
					new com.oss.asn1.INTEGER(8)
				    )
				),
				new Bounds (
				    new java.lang.Long(8),
				    new java.lang.Long(8)
				),
				null
			    )
			),
			"gANSS-SignalIds",
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"NetworkAssistedGANSS_Supported_List_v860ext$Sequence_$Non_native_AD_choices_supported"
			    )
			),
			"non-native-AD-choices-supported",
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
	    "NetworkAssistedGANSS_Supported_List_v860ext"
	),
	new QName (
	    "InformationElements",
	    "NetworkAssistedGANSS-Supported-List-v860ext"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(8),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(8)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"NetworkAssistedGANSS_Supported_List_v860ext$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NetworkAssistedGANSS_Supported_List_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NetworkAssistedGANSS_Supported_List_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NetworkAssistedGANSS_Supported_List_v860ext
