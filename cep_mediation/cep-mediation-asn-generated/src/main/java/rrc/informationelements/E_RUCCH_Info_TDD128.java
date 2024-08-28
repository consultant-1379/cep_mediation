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
 * Define the ASN1 Type E_RUCCH_Info_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_RUCCH_Info_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_RUCCH_Info_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_RUCCH_Info_TDD128(T_RUCCH t_RUCCH, INTEGER n_RUCCH, 
		    T_WAIT t_WAIT, T_SI t_SI, 
		    INTEGER extendedEstimationWindow, 
		    E_RUCCH_AccessServiceClass e_RUCCH_AccessServiceClass, 
		    PersistenceScalingFactorList e_RUCCH_PersistenceScalingFactor, 
		    SYNC_UL_InfoForE_RUCCH sync_UL_InfoForE_RUCCH, 
		    PRACH_Information_LCR_List prach_information)
    {
	setT_RUCCH(t_RUCCH);
	setN_RUCCH(n_RUCCH);
	setT_WAIT(t_WAIT);
	setT_SI(t_SI);
	setExtendedEstimationWindow(extendedEstimationWindow);
	setE_RUCCH_AccessServiceClass(e_RUCCH_AccessServiceClass);
	setE_RUCCH_PersistenceScalingFactor(e_RUCCH_PersistenceScalingFactor);
	setSync_UL_InfoForE_RUCCH(sync_UL_InfoForE_RUCCH);
	setPrach_information(prach_information);
    }
    
    /**
     * Construct with components.
     */
    public E_RUCCH_Info_TDD128(T_RUCCH t_RUCCH, long n_RUCCH, T_WAIT t_WAIT, 
		    T_SI t_SI, long extendedEstimationWindow, 
		    E_RUCCH_AccessServiceClass e_RUCCH_AccessServiceClass, 
		    PersistenceScalingFactorList e_RUCCH_PersistenceScalingFactor, 
		    SYNC_UL_InfoForE_RUCCH sync_UL_InfoForE_RUCCH, 
		    PRACH_Information_LCR_List prach_information)
    {
	this(t_RUCCH, new INTEGER(n_RUCCH), t_WAIT, t_SI, 
	     new INTEGER(extendedEstimationWindow), 
	     e_RUCCH_AccessServiceClass, e_RUCCH_PersistenceScalingFactor, 
	     sync_UL_InfoForE_RUCCH, prach_information);
    }
    
    public void initComponents()
    {
	mComponents[0] = T_RUCCH.ms20;
	mComponents[1] = new INTEGER();
	mComponents[2] = T_WAIT.everyEDCHTTI;
	mComponents[3] = T_SI.everyEDCHTTI;
	mComponents[4] = new INTEGER();
	mComponents[5] = new E_RUCCH_AccessServiceClass();
	mComponents[6] = new PersistenceScalingFactorList();
	mComponents[7] = new SYNC_UL_InfoForE_RUCCH();
	mComponents[8] = new PRACH_Information_LCR_List();
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
		return T_RUCCH.ms20;
	    case 1:
		return new INTEGER();
	    case 2:
		return T_WAIT.everyEDCHTTI;
	    case 3:
		return T_SI.everyEDCHTTI;
	    case 4:
		return new INTEGER();
	    case 5:
		return new E_RUCCH_AccessServiceClass();
	    case 6:
		return new PersistenceScalingFactorList();
	    case 7:
		return new SYNC_UL_InfoForE_RUCCH();
	    case 8:
		return new PRACH_Information_LCR_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "t_RUCCH"
    public T_RUCCH getT_RUCCH()
    {
	return (T_RUCCH)mComponents[0];
    }
    
    public void setT_RUCCH(T_RUCCH t_RUCCH)
    {
	mComponents[0] = t_RUCCH;
    }
    
    public boolean hasT_RUCCH()
    {
	return componentIsPresent(0);
    }
    
    public void deleteT_RUCCH()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type T_RUCCH from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class T_RUCCH extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private T_RUCCH()
	{
	    super(cFirstNumber);
	}
	
	protected T_RUCCH(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final T_RUCCH ms20 =
	    new T_RUCCH(0);
	public static final T_RUCCH ms40 =
	    new T_RUCCH(1);
	public static final T_RUCCH ms60 =
	    new T_RUCCH(2);
	public static final T_RUCCH ms80 =
	    new T_RUCCH(3);
	public static final T_RUCCH ms120 =
	    new T_RUCCH(4);
	public static final T_RUCCH ms160 =
	    new T_RUCCH(5);
	public static final T_RUCCH ms200 =
	    new T_RUCCH(6);
	public static final T_RUCCH ms240 =
	    new T_RUCCH(7);
	public static final T_RUCCH ms280 =
	    new T_RUCCH(8);
	public static final T_RUCCH ms320 =
	    new T_RUCCH(9);
	public static final T_RUCCH ms400 =
	    new T_RUCCH(10);
	public static final T_RUCCH ms500 =
	    new T_RUCCH(11);
	public static final T_RUCCH ms600 =
	    new T_RUCCH(12);
	public static final T_RUCCH ms800 =
	    new T_RUCCH(13);
	public static final T_RUCCH ms1000 =
	    new T_RUCCH(14);
	public static final T_RUCCH ms2000 =
	    new T_RUCCH(15);
	private final static T_RUCCH cNamedNumbers[] = {
	     ms20, 
	     ms40, 
	     ms60, 
	     ms80, 
	     ms120, 
	     ms160, 
	     ms200, 
	     ms240, 
	     ms280, 
	     ms320, 
	     ms400, 
	     ms500, 
	     ms600, 
	     ms800, 
	     ms1000, 
	     ms2000
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
	
	public static T_RUCCH valueOf(long value)
	{
	    return (T_RUCCH)ms20.lookupValue(value);
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
		"E_RUCCH_Info_TDD128$T_RUCCH"
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
			"ms20",
			0
		    ),
		    new MemberListElement (
			"ms40",
			1
		    ),
		    new MemberListElement (
			"ms60",
			2
		    ),
		    new MemberListElement (
			"ms80",
			3
		    ),
		    new MemberListElement (
			"ms120",
			4
		    ),
		    new MemberListElement (
			"ms160",
			5
		    ),
		    new MemberListElement (
			"ms200",
			6
		    ),
		    new MemberListElement (
			"ms240",
			7
		    ),
		    new MemberListElement (
			"ms280",
			8
		    ),
		    new MemberListElement (
			"ms320",
			9
		    ),
		    new MemberListElement (
			"ms400",
			10
		    ),
		    new MemberListElement (
			"ms500",
			11
		    ),
		    new MemberListElement (
			"ms600",
			12
		    ),
		    new MemberListElement (
			"ms800",
			13
		    ),
		    new MemberListElement (
			"ms1000",
			14
		    ),
		    new MemberListElement (
			"ms2000",
			15
		    )
		}
	    ),
	    0,
	    ms20
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' T_RUCCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' T_RUCCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for T_RUCCH

    // Methods for field "n_RUCCH"
    public long getN_RUCCH()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setN_RUCCH(long n_RUCCH)
    {
	setN_RUCCH(new INTEGER(n_RUCCH));
    }
    
    public void setN_RUCCH(INTEGER n_RUCCH)
    {
	mComponents[1] = n_RUCCH;
    }
    
    public boolean hasN_RUCCH()
    {
	return componentIsPresent(1);
    }
    
    public void deleteN_RUCCH()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "t_WAIT"
    public T_WAIT getT_WAIT()
    {
	return (T_WAIT)mComponents[2];
    }
    
    public void setT_WAIT(T_WAIT t_WAIT)
    {
	mComponents[2] = t_WAIT;
    }
    
    public boolean hasT_WAIT()
    {
	return componentIsPresent(2);
    }
    
    public void deleteT_WAIT()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type T_WAIT from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class T_WAIT extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private T_WAIT()
	{
	    super(cFirstNumber);
	}
	
	protected T_WAIT(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final T_WAIT everyEDCHTTI =
	    new T_WAIT(0);
	public static final T_WAIT ms40 =
	    new T_WAIT(1);
	public static final T_WAIT ms80 =
	    new T_WAIT(2);
	public static final T_WAIT ms160 =
	    new T_WAIT(3);
	public static final T_WAIT ms320 =
	    new T_WAIT(4);
	public static final T_WAIT ms640 =
	    new T_WAIT(5);
	public static final T_WAIT ms1000 =
	    new T_WAIT(6);
	public static final T_WAIT ms2000 =
	    new T_WAIT(7);
	private final static T_WAIT cNamedNumbers[] = {
	     everyEDCHTTI, 
	     ms40, 
	     ms80, 
	     ms160, 
	     ms320, 
	     ms640, 
	     ms1000, 
	     ms2000
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
	
	public static T_WAIT valueOf(long value)
	{
	    return (T_WAIT)everyEDCHTTI.lookupValue(value);
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
		"E_RUCCH_Info_TDD128$T_WAIT"
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
			"ms40",
			1
		    ),
		    new MemberListElement (
			"ms80",
			2
		    ),
		    new MemberListElement (
			"ms160",
			3
		    ),
		    new MemberListElement (
			"ms320",
			4
		    ),
		    new MemberListElement (
			"ms640",
			5
		    ),
		    new MemberListElement (
			"ms1000",
			6
		    ),
		    new MemberListElement (
			"ms2000",
			7
		    )
		}
	    ),
	    0,
	    everyEDCHTTI
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' T_WAIT object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' T_WAIT object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for T_WAIT

    // Methods for field "t_SI"
    public T_SI getT_SI()
    {
	return (T_SI)mComponents[3];
    }
    
    public void setT_SI(T_SI t_SI)
    {
	mComponents[3] = t_SI;
    }
    
    public boolean hasT_SI()
    {
	return componentIsPresent(3);
    }
    
    public void deleteT_SI()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type T_SI from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class T_SI extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private T_SI()
	{
	    super(cFirstNumber);
	}
	
	protected T_SI(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final T_SI everyEDCHTTI =
	    new T_SI(0);
	public static final T_SI ms20 =
	    new T_SI(1);
	public static final T_SI ms40 =
	    new T_SI(2);
	public static final T_SI ms60 =
	    new T_SI(3);
	public static final T_SI ms80 =
	    new T_SI(4);
	public static final T_SI ms160 =
	    new T_SI(5);
	public static final T_SI ms200 =
	    new T_SI(6);
	private final static T_SI cNamedNumbers[] = {
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
	
	public static T_SI valueOf(long value)
	{
	    return (T_SI)everyEDCHTTI.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_RUCCH_Info_TDD128$T_SI"
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
	 * Get the type descriptor (TypeInfo) of 'this' T_SI object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' T_SI object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for T_SI

    // Methods for field "extendedEstimationWindow"
    public long getExtendedEstimationWindow()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setExtendedEstimationWindow(long extendedEstimationWindow)
    {
	setExtendedEstimationWindow(new INTEGER(extendedEstimationWindow));
    }
    
    public void setExtendedEstimationWindow(INTEGER extendedEstimationWindow)
    {
	mComponents[4] = extendedEstimationWindow;
    }
    
    public boolean hasExtendedEstimationWindow()
    {
	return componentIsPresent(4);
    }
    
    public void deleteExtendedEstimationWindow()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "e_RUCCH_AccessServiceClass"
    public E_RUCCH_AccessServiceClass getE_RUCCH_AccessServiceClass()
    {
	return (E_RUCCH_AccessServiceClass)mComponents[5];
    }
    
    public void setE_RUCCH_AccessServiceClass(E_RUCCH_AccessServiceClass e_RUCCH_AccessServiceClass)
    {
	mComponents[5] = e_RUCCH_AccessServiceClass;
    }
    
    public boolean hasE_RUCCH_AccessServiceClass()
    {
	return componentIsPresent(5);
    }
    
    public void deleteE_RUCCH_AccessServiceClass()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "e_RUCCH_PersistenceScalingFactor"
    public PersistenceScalingFactorList getE_RUCCH_PersistenceScalingFactor()
    {
	return (PersistenceScalingFactorList)mComponents[6];
    }
    
    public void setE_RUCCH_PersistenceScalingFactor(PersistenceScalingFactorList e_RUCCH_PersistenceScalingFactor)
    {
	mComponents[6] = e_RUCCH_PersistenceScalingFactor;
    }
    
    public boolean hasE_RUCCH_PersistenceScalingFactor()
    {
	return componentIsPresent(6);
    }
    
    public void deleteE_RUCCH_PersistenceScalingFactor()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "sync_UL_InfoForE_RUCCH"
    public SYNC_UL_InfoForE_RUCCH getSync_UL_InfoForE_RUCCH()
    {
	return (SYNC_UL_InfoForE_RUCCH)mComponents[7];
    }
    
    public void setSync_UL_InfoForE_RUCCH(SYNC_UL_InfoForE_RUCCH sync_UL_InfoForE_RUCCH)
    {
	mComponents[7] = sync_UL_InfoForE_RUCCH;
    }
    
    public boolean hasSync_UL_InfoForE_RUCCH()
    {
	return componentIsPresent(7);
    }
    
    public void deleteSync_UL_InfoForE_RUCCH()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "prach_information"
    public PRACH_Information_LCR_List getPrach_information()
    {
	return (PRACH_Information_LCR_List)mComponents[8];
    }
    
    public void setPrach_information(PRACH_Information_LCR_List prach_information)
    {
	mComponents[8] = prach_information;
    }
    
    public boolean hasPrach_information()
    {
	return componentIsPresent(8);
    }
    
    public void deletePrach_information()
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
	    "E_RUCCH_Info_TDD128"
	),
	new QName (
	    "InformationElements",
	    "E-RUCCH-Info-TDD128"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_RUCCH_Info_TDD128$T_RUCCH"
			)
		    ),
		    "t-RUCCH",
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "n-RUCCH",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_RUCCH_Info_TDD128$T_WAIT"
			)
		    ),
		    "t-WAIT",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_RUCCH_Info_TDD128$T_SI"
			)
		    ),
		    "t-SI",
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
				    new com.oss.asn1.INTEGER(2), 
				    new com.oss.asn1.INTEGER(5),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "extendedEstimationWindow",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_RUCCH_AccessServiceClass"
			    ),
			    new QName (
				"InformationElements",
				"E-RUCCH-AccessServiceClass"
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
				    "ASCSetting_TDD_LCR_r4"
				)
			    )
			)
		    ),
		    "e-RUCCH-AccessServiceClass",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PersistenceScalingFactorList"
			    ),
			    new QName (
				"InformationElements",
				"PersistenceScalingFactorList"
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
				    "PersistenceScalingFactor"
				)
			    )
			)
		    ),
		    "e-RUCCH-PersistenceScalingFactor",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SYNC_UL_InfoForE_RUCCH"
			    ),
			    new QName (
				"InformationElements",
				"SYNC-UL-InfoForE-RUCCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SYNC_UL_InfoForE_RUCCH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SYNC_UL_InfoForE_RUCCH"
				)
			    ),
			    0
			)
		    ),
		    "sync-UL-InfoForE-RUCCH",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PRACH_Information_LCR_List"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-Information-LCR-List"
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
				    "PRACH_Information_LCR"
				)
			    )
			)
		    ),
		    "prach-information",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
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
     * Get the type descriptor (TypeInfo) of 'this' E_RUCCH_Info_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_RUCCH_Info_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_RUCCH_Info_TDD128
