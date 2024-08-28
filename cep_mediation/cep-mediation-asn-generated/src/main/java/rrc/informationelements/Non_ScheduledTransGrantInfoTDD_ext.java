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
 * Define the ASN1 Type Non_ScheduledTransGrantInfoTDD_ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class Non_ScheduledTransGrantInfoTDD_ext extends Choice {
    
    /**
     * The default constructor.
     */
    public Non_ScheduledTransGrantInfoTDD_ext()
    {
    }
    
    public static final  int  tdd384_768_chosen = 1;
    public static final  int  tdd128_chosen = 2;
    
    // Methods for field "tdd384_768"
    public static Non_ScheduledTransGrantInfoTDD_ext createNon_ScheduledTransGrantInfoTDD_extWithTdd384_768(Null tdd384_768)
    {
	Non_ScheduledTransGrantInfoTDD_ext __object = new Non_ScheduledTransGrantInfoTDD_ext();

	__object.setTdd384_768(tdd384_768);
	return __object;
    }
    
    public boolean hasTdd384_768()
    {
	return getChosenFlag() == tdd384_768_chosen;
    }
    
    public void setTdd384_768(Null tdd384_768)
    {
	setChosenValue(tdd384_768);
	setChosenFlag(tdd384_768_chosen);
    }
    
    
    // Methods for field "tdd128"
    public static Non_ScheduledTransGrantInfoTDD_ext createNon_ScheduledTransGrantInfoTDD_extWithTdd128(Tdd128 tdd128)
    {
	Non_ScheduledTransGrantInfoTDD_ext __object = new Non_ScheduledTransGrantInfoTDD_ext();

	__object.setTdd128(tdd128);
	return __object;
    }
    
    public boolean hasTdd128()
    {
	return getChosenFlag() == tdd128_chosen;
    }
    
    public void setTdd128(Tdd128 tdd128)
    {
	setChosenValue(tdd128);
	setChosenFlag(tdd128_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd128 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Tdd128 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd128()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd128(T_SI_nst t_SI_nst)
	{
	    setT_SI_nst(t_SI_nst);
	}
	
	public void initComponents()
	{
	    mComponents[0] = T_SI_nst.everyEDCHTTI;
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
		    return T_SI_nst.everyEDCHTTI;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "t_SI_nst"
	public T_SI_nst getT_SI_nst()
	{
	    return (T_SI_nst)mComponents[0];
	}
	
	public void setT_SI_nst(T_SI_nst t_SI_nst)
	{
	    mComponents[0] = t_SI_nst;
	}
	
	public boolean hasT_SI_nst()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteT_SI_nst()
	{
	    setComponentAbsent(0);
	}
	
	
	
	/**
	 * Define the ASN1 Type T_SI_nst from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class T_SI_nst extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private T_SI_nst()
	    {
		super(cFirstNumber);
	    }
	    
	    protected T_SI_nst(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final T_SI_nst everyEDCHTTI =
		new T_SI_nst(0);
	    public static final T_SI_nst ms20 =
		new T_SI_nst(1);
	    public static final T_SI_nst ms40 =
		new T_SI_nst(2);
	    public static final T_SI_nst ms60 =
		new T_SI_nst(3);
	    public static final T_SI_nst ms80 =
		new T_SI_nst(4);
	    public static final T_SI_nst ms160 =
		new T_SI_nst(5);
	    public static final T_SI_nst ms200 =
		new T_SI_nst(6);
	    private final static T_SI_nst cNamedNumbers[] = {
		 everyEDCHTTI, 
		 ms20, 
		 ms40, 
		 ms60, 
		 ms80, 
		 ms160, 
		 ms200
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
	    
	    public static T_SI_nst valueOf(long value)
	    {
		return (T_SI_nst)everyEDCHTTI.lookupValue(value);
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
		    "Non_ScheduledTransGrantInfoTDD_ext$Tdd128$T_SI_nst"
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
			    "everyEDCHTTI",
			    0
			),
			new MemberListElement (
			    "ms20",
			    1
			),
			new MemberListElement (
			    "ms40",
			    2
			),
			new MemberListElement (
			    "ms60",
			    3
			),
			new MemberListElement (
			    "ms80",
			    4
			),
			new MemberListElement (
			    "ms160",
			    5
			),
			new MemberListElement (
			    "ms200",
			    6
			)
		    }
		),
		0,
		everyEDCHTTI
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' T_SI_nst object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' T_SI_nst object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for T_SI_nst

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
		"Non_ScheduledTransGrantInfoTDD_ext$Tdd128"
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
			    new QName (
				"rrc.informationelements",
				"Non_ScheduledTransGrantInfoTDD_ext$Tdd128$T_SI_nst"
			    )
			),
			"t-SI-nst",
			0,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tdd128 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd128 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd128

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case tdd384_768_chosen:
		return new Null();
	    case tdd128_chosen:
		return new Tdd128();
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
	    "Non_ScheduledTransGrantInfoTDD_ext"
	),
	new QName (
	    "InformationElements",
	    "Non-ScheduledTransGrantInfoTDD-ext"
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
		    "tdd384-768",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "Non_ScheduledTransGrantInfoTDD_ext$Tdd128"
			)
		    ),
		    "tdd128",
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
     * Get the type descriptor (TypeInfo) of 'this' Non_ScheduledTransGrantInfoTDD_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Non_ScheduledTransGrantInfoTDD_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Non_ScheduledTransGrantInfoTDD_ext
