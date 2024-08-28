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
 * Define the ASN1 Type E_DPDCH_SchedulingTransmConfiguration from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DPDCH_SchedulingTransmConfiguration extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DPDCH_SchedulingTransmConfiguration()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DPDCH_SchedulingTransmConfiguration(BitString ms2_SchedTransmGrantHARQAlloc, 
		    ServingGrant servingGrant)
    {
	setMs2_SchedTransmGrantHARQAlloc(ms2_SchedTransmGrantHARQAlloc);
	setServingGrant(servingGrant);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = new ServingGrant();
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
		return new BitString();
	    case 1:
		return new ServingGrant();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ms2_SchedTransmGrantHARQAlloc"
    public BitString getMs2_SchedTransmGrantHARQAlloc()
    {
	return (BitString)mComponents[0];
    }
    
    public void setMs2_SchedTransmGrantHARQAlloc(BitString ms2_SchedTransmGrantHARQAlloc)
    {
	mComponents[0] = ms2_SchedTransmGrantHARQAlloc;
    }
    
    public boolean hasMs2_SchedTransmGrantHARQAlloc()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMs2_SchedTransmGrantHARQAlloc()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "servingGrant"
    public ServingGrant getServingGrant()
    {
	return (ServingGrant)mComponents[1];
    }
    
    public void setServingGrant(ServingGrant servingGrant)
    {
	mComponents[1] = servingGrant;
    }
    
    public boolean hasServingGrant()
    {
	return componentIsPresent(1);
    }
    
    public void deleteServingGrant()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type ServingGrant from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class ServingGrant extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public ServingGrant()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public ServingGrant(INTEGER value, 
			Primary_Secondary_GrantSelector primary_Secondary_GrantSelector)
	{
	    setValue(value);
	    setPrimary_Secondary_GrantSelector(primary_Secondary_GrantSelector);
	}
	
	/**
	 * Construct with components.
	 */
	public ServingGrant(long value, 
			Primary_Secondary_GrantSelector primary_Secondary_GrantSelector)
	{
	    this(new INTEGER(value), primary_Secondary_GrantSelector);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = Primary_Secondary_GrantSelector.primary;
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
		    return Primary_Secondary_GrantSelector.primary;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "value"
	public long getValue()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setValue(long value)
	{
	    setValue(new INTEGER(value));
	}
	
	public void setValue(INTEGER value)
	{
	    mComponents[0] = value;
	}
	
	
	// Methods for field "primary_Secondary_GrantSelector"
	public Primary_Secondary_GrantSelector getPrimary_Secondary_GrantSelector()
	{
	    return (Primary_Secondary_GrantSelector)mComponents[1];
	}
	
	public void setPrimary_Secondary_GrantSelector(Primary_Secondary_GrantSelector primary_Secondary_GrantSelector)
	{
	    mComponents[1] = primary_Secondary_GrantSelector;
	}
	
	
	
	/**
	 * Define the ASN1 Type Primary_Secondary_GrantSelector from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class Primary_Secondary_GrantSelector extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private Primary_Secondary_GrantSelector()
	    {
		super(cFirstNumber);
	    }
	    
	    protected Primary_Secondary_GrantSelector(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final Primary_Secondary_GrantSelector primary =
		new Primary_Secondary_GrantSelector(0);
	    public static final Primary_Secondary_GrantSelector secondary =
		new Primary_Secondary_GrantSelector(1);
	    private final static Primary_Secondary_GrantSelector cNamedNumbers[] = {
		 primary, 
		 secondary
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
	    
	    public static Primary_Secondary_GrantSelector valueOf(long value)
	    {
		return (Primary_Secondary_GrantSelector)primary.lookupValue(value);
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
		    "E_DPDCH_SchedulingTransmConfiguration$ServingGrant$Primary_Secondary_GrantSelector"
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
			    "primary",
			    0
			),
			new MemberListElement (
			    "secondary",
			    1
			)
		    }
		),
		0,
		primary
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Primary_Secondary_GrantSelector object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Primary_Secondary_GrantSelector object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Primary_Secondary_GrantSelector

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
		"E_DPDCH_SchedulingTransmConfiguration$ServingGrant"
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
					new com.oss.asn1.INTEGER(38),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(38)
				),
				null
			    )
			),
			"value",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"E_DPDCH_SchedulingTransmConfiguration$ServingGrant$Primary_Secondary_GrantSelector"
			    )
			),
			"primary-Secondary-GrantSelector",
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
	 * Get the type descriptor (TypeInfo) of 'this' ServingGrant object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ServingGrant object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ServingGrant

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
	    "E_DPDCH_SchedulingTransmConfiguration"
	),
	new QName (
	    "InformationElements",
	    "E-DPDCH-SchedulingTransmConfiguration"
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
		    "ms2-SchedTransmGrantHARQAlloc",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_DPDCH_SchedulingTransmConfiguration$ServingGrant"
			)
		    ),
		    "servingGrant",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' E_DPDCH_SchedulingTransmConfiguration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DPDCH_SchedulingTransmConfiguration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DPDCH_SchedulingTransmConfiguration
