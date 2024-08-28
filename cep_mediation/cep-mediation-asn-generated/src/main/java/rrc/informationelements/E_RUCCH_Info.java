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
 * Define the ASN1 Type E_RUCCH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_RUCCH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_RUCCH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_RUCCH_Info(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
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
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[0];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[0] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  tdd384_tdd768_chosen = 1;
	public static final  int  tdd128_chosen = 2;
	
	// Methods for field "tdd384_tdd768"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd384_tdd768(Tdd384_tdd768 tdd384_tdd768)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd384_tdd768(tdd384_tdd768);
	    return __object;
	}
	
	public boolean hasTdd384_tdd768()
	{
	    return getChosenFlag() == tdd384_tdd768_chosen;
	}
	
	public void setTdd384_tdd768(Tdd384_tdd768 tdd384_tdd768)
	{
	    setChosenValue(tdd384_tdd768);
	    setChosenFlag(tdd384_tdd768_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd384_tdd768 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd384_tdd768 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd384_tdd768()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd384_tdd768(INTEGER e_RUCCH_ConstantValue, 
			    PersistenceScalingFactor e_RUCCH_PersistenceScalingFactor, 
			    T_RUCCH t_RUCCH, INTEGER e_RUCCH_TS_Number, 
			    E_RUCCH_Midamble e_RUCCH_Midamble, T_adv t_adv, 
			    T_SCHED t_SCHED, 
			    ModeSpecificInfo1 modeSpecificInfo)
	    {
		setE_RUCCH_ConstantValue(e_RUCCH_ConstantValue);
		setE_RUCCH_PersistenceScalingFactor(e_RUCCH_PersistenceScalingFactor);
		setT_RUCCH(t_RUCCH);
		setE_RUCCH_TS_Number(e_RUCCH_TS_Number);
		setE_RUCCH_Midamble(e_RUCCH_Midamble);
		setT_adv(t_adv);
		setT_SCHED(t_SCHED);
		setModeSpecificInfo(modeSpecificInfo);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Tdd384_tdd768(long e_RUCCH_ConstantValue, 
			    PersistenceScalingFactor e_RUCCH_PersistenceScalingFactor, 
			    T_RUCCH t_RUCCH, long e_RUCCH_TS_Number, 
			    E_RUCCH_Midamble e_RUCCH_Midamble, T_adv t_adv, 
			    T_SCHED t_SCHED, 
			    ModeSpecificInfo1 modeSpecificInfo)
	    {
		this(new INTEGER(e_RUCCH_ConstantValue), 
		     e_RUCCH_PersistenceScalingFactor, t_RUCCH, 
		     new INTEGER(e_RUCCH_TS_Number), e_RUCCH_Midamble, 
		     t_adv, t_SCHED, modeSpecificInfo);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Tdd384_tdd768(long e_RUCCH_ConstantValue, 
			    PersistenceScalingFactor e_RUCCH_PersistenceScalingFactor, 
			    ModeSpecificInfo1 modeSpecificInfo)
	    {
		setE_RUCCH_ConstantValue(e_RUCCH_ConstantValue);
		setE_RUCCH_PersistenceScalingFactor(e_RUCCH_PersistenceScalingFactor);
		setModeSpecificInfo(modeSpecificInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new INTEGER();
		mComponents[1] = PersistenceScalingFactor.psf0_9;
		mComponents[2] = T_RUCCH.ms40;
		mComponents[3] = new INTEGER();
		mComponents[4] = E_RUCCH_Midamble.direct;
		mComponents[5] = T_adv.sec1;
		mComponents[6] = T_SCHED.zero;
		mComponents[7] = new ModeSpecificInfo1();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[8];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new INTEGER();
		    case 1:
			return PersistenceScalingFactor.psf0_9;
		    case 2:
			return T_RUCCH.ms40;
		    case 3:
			return new INTEGER();
		    case 4:
			return E_RUCCH_Midamble.direct;
		    case 5:
			return T_adv.sec1;
		    case 6:
			return T_SCHED.zero;
		    case 7:
			return new ModeSpecificInfo1();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "e_RUCCH_ConstantValue"
	    public long getE_RUCCH_ConstantValue()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setE_RUCCH_ConstantValue(long e_RUCCH_ConstantValue)
	    {
		setE_RUCCH_ConstantValue(new INTEGER(e_RUCCH_ConstantValue));
	    }
	    
	    public void setE_RUCCH_ConstantValue(INTEGER e_RUCCH_ConstantValue)
	    {
		mComponents[0] = e_RUCCH_ConstantValue;
	    }
	    
	    
	    // Methods for field "e_RUCCH_PersistenceScalingFactor"
	    public PersistenceScalingFactor getE_RUCCH_PersistenceScalingFactor()
	    {
		return (PersistenceScalingFactor)mComponents[1];
	    }
	    
	    public void setE_RUCCH_PersistenceScalingFactor(PersistenceScalingFactor e_RUCCH_PersistenceScalingFactor)
	    {
		mComponents[1] = e_RUCCH_PersistenceScalingFactor;
	    }
	    
	    
	    // Methods for field "t_RUCCH"
	    public T_RUCCH getT_RUCCH()
	    {
		return (T_RUCCH)mComponents[2];
	    }
	    
	    public void setT_RUCCH(T_RUCCH t_RUCCH)
	    {
		mComponents[2] = t_RUCCH;
	    }
	    
	    public boolean hasT_RUCCH()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteT_RUCCH()
	    {
		setComponentAbsent(2);
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
		public static final T_RUCCH ms40 =
		    new T_RUCCH(0);
		public static final T_RUCCH ms80 =
		    new T_RUCCH(1);
		public static final T_RUCCH ms120 =
		    new T_RUCCH(2);
		public static final T_RUCCH ms160 =
		    new T_RUCCH(3);
		public static final T_RUCCH ms200 =
		    new T_RUCCH(4);
		public static final T_RUCCH ms240 =
		    new T_RUCCH(5);
		public static final T_RUCCH ms280 =
		    new T_RUCCH(6);
		public static final T_RUCCH ms320 =
		    new T_RUCCH(7);
		private final static T_RUCCH cNamedNumbers[] = {
		     ms40, 
		     ms80, 
		     ms120, 
		     ms160, 
		     ms200, 
		     ms240, 
		     ms280, 
		     ms320
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
		    return (T_RUCCH)ms40.lookupValue(value);
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
			"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$T_RUCCH"
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
				"ms40",
				0
			    ),
			    new MemberListElement (
				"ms80",
				1
			    ),
			    new MemberListElement (
				"ms120",
				2
			    ),
			    new MemberListElement (
				"ms160",
				3
			    ),
			    new MemberListElement (
				"ms200",
				4
			    ),
			    new MemberListElement (
				"ms240",
				5
			    ),
			    new MemberListElement (
				"ms280",
				6
			    ),
			    new MemberListElement (
				"ms320",
				7
			    )
			}
		    ),
		    0,
		    ms40
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

	    // Methods for field "e_RUCCH_TS_Number"
	    public long getE_RUCCH_TS_Number()
	    {
		return ((INTEGER)mComponents[3]).longValue();
	    }
	    
	    public void setE_RUCCH_TS_Number(long e_RUCCH_TS_Number)
	    {
		setE_RUCCH_TS_Number(new INTEGER(e_RUCCH_TS_Number));
	    }
	    
	    public void setE_RUCCH_TS_Number(INTEGER e_RUCCH_TS_Number)
	    {
		mComponents[3] = e_RUCCH_TS_Number;
	    }
	    
	    public boolean hasE_RUCCH_TS_Number()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteE_RUCCH_TS_Number()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "e_RUCCH_Midamble"
	    public E_RUCCH_Midamble getE_RUCCH_Midamble()
	    {
		return (E_RUCCH_Midamble)mComponents[4];
	    }
	    
	    public void setE_RUCCH_Midamble(E_RUCCH_Midamble e_RUCCH_Midamble)
	    {
		mComponents[4] = e_RUCCH_Midamble;
	    }
	    
	    public boolean hasE_RUCCH_Midamble()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteE_RUCCH_Midamble()
	    {
		setComponentAbsent(4);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type E_RUCCH_Midamble from ASN1 Module InformationElements.
	     * @see Enumerated
	     */
	    public static final class E_RUCCH_Midamble extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private E_RUCCH_Midamble()
		{
		    super(cFirstNumber);
		}
		
		protected E_RUCCH_Midamble(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final E_RUCCH_Midamble direct =
		    new E_RUCCH_Midamble(0);
		public static final E_RUCCH_Midamble direct_Inverted =
		    new E_RUCCH_Midamble(1);
		private final static E_RUCCH_Midamble cNamedNumbers[] = {
		     direct, 
		     direct_Inverted
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
		
		public static E_RUCCH_Midamble valueOf(long value)
		{
		    return (E_RUCCH_Midamble)direct.lookupValue(value);
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		    new Tags (
			new short[] {
			    (short)0x8004
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$E_RUCCH_Midamble"
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
				"direct",
				0
			    ),
			    new MemberListElement (
				"direct-Inverted",
				1
			    )
			}
		    ),
		    0,
		    direct
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' E_RUCCH_Midamble object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' E_RUCCH_Midamble object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for E_RUCCH_Midamble

	    // Methods for field "t_adv"
	    public T_adv getT_adv()
	    {
		return (T_adv)mComponents[5];
	    }
	    
	    public void setT_adv(T_adv t_adv)
	    {
		mComponents[5] = t_adv;
	    }
	    
	    public boolean hasT_adv()
	    {
		return componentIsPresent(5);
	    }
	    
	    public void deleteT_adv()
	    {
		setComponentAbsent(5);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type T_adv from ASN1 Module InformationElements.
	     * @see Enumerated
	     */
	    public static final class T_adv extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private T_adv()
		{
		    super(cFirstNumber);
		}
		
		protected T_adv(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final T_adv sec1 =
		    new T_adv(0);
		public static final T_adv sec2 =
		    new T_adv(1);
		public static final T_adv sec4 =
		    new T_adv(2);
		public static final T_adv sec8 =
		    new T_adv(3);
		public static final T_adv sec16 =
		    new T_adv(4);
		public static final T_adv sec32 =
		    new T_adv(5);
		public static final T_adv sec128 =
		    new T_adv(6);
		public static final T_adv infinity =
		    new T_adv(7);
		private final static T_adv cNamedNumbers[] = {
		     sec1, 
		     sec2, 
		     sec4, 
		     sec8, 
		     sec16, 
		     sec32, 
		     sec128, 
		     infinity
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
		
		public static T_adv valueOf(long value)
		{
		    return (T_adv)sec1.lookupValue(value);
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		    new Tags (
			new short[] {
			    (short)0x8005
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$T_adv"
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
				"sec1",
				0
			    ),
			    new MemberListElement (
				"sec2",
				1
			    ),
			    new MemberListElement (
				"sec4",
				2
			    ),
			    new MemberListElement (
				"sec8",
				3
			    ),
			    new MemberListElement (
				"sec16",
				4
			    ),
			    new MemberListElement (
				"sec32",
				5
			    ),
			    new MemberListElement (
				"sec128",
				6
			    ),
			    new MemberListElement (
				"infinity",
				7
			    )
			}
		    ),
		    0,
		    sec1
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' T_adv object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' T_adv object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for T_adv

	    // Methods for field "t_SCHED"
	    public T_SCHED getT_SCHED()
	    {
		return (T_SCHED)mComponents[6];
	    }
	    
	    public void setT_SCHED(T_SCHED t_SCHED)
	    {
		mComponents[6] = t_SCHED;
	    }
	    
	    public boolean hasT_SCHED()
	    {
		return componentIsPresent(6);
	    }
	    
	    public void deleteT_SCHED()
	    {
		setComponentAbsent(6);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type T_SCHED from ASN1 Module InformationElements.
	     * @see Enumerated
	     */
	    public static final class T_SCHED extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private T_SCHED()
		{
		    super(cFirstNumber);
		}
		
		protected T_SCHED(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final T_SCHED zero =
		    new T_SCHED(0);
		public static final T_SCHED ms40 =
		    new T_SCHED(1);
		public static final T_SCHED ms80 =
		    new T_SCHED(2);
		public static final T_SCHED ms160 =
		    new T_SCHED(3);
		public static final T_SCHED ms250 =
		    new T_SCHED(4);
		public static final T_SCHED sec1 =
		    new T_SCHED(5);
		public static final T_SCHED sec2 =
		    new T_SCHED(6);
		public static final T_SCHED sec4 =
		    new T_SCHED(7);
		private final static T_SCHED cNamedNumbers[] = {
		     zero, 
		     ms40, 
		     ms80, 
		     ms160, 
		     ms250, 
		     sec1, 
		     sec2, 
		     sec4
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
		
		public static T_SCHED valueOf(long value)
		{
		    return (T_SCHED)zero.lookupValue(value);
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		    new Tags (
			new short[] {
			    (short)0x8006
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$T_SCHED"
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
				"zero",
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
				"ms250",
				4
			    ),
			    new MemberListElement (
				"sec1",
				5
			    ),
			    new MemberListElement (
				"sec2",
				6
			    ),
			    new MemberListElement (
				"sec4",
				7
			    )
			}
		    ),
		    0,
		    zero
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' T_SCHED object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' T_SCHED object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for T_SCHED

	    // Methods for field "modeSpecificInfo"
	    public ModeSpecificInfo1 getModeSpecificInfo()
	    {
		return (ModeSpecificInfo1)mComponents[7];
	    }
	    
	    public void setModeSpecificInfo(ModeSpecificInfo1 modeSpecificInfo)
	    {
		mComponents[7] = modeSpecificInfo;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type ModeSpecificInfo1 from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class ModeSpecificInfo1 extends Choice {
		
		/**
		 * The default constructor.
		 */
		public ModeSpecificInfo1()
		{
		}
		
		public static final  int  tdd384_chosen = 1;
		public static final  int  tdd768_chosen = 2;
		
		// Methods for field "tdd384"
		public static ModeSpecificInfo1 createModeSpecificInfo1WithTdd384(Tdd384 tdd384)
		{
		    ModeSpecificInfo1 __object = new ModeSpecificInfo1();

		    __object.setTdd384(tdd384);
		    return __object;
		}
		
		public boolean hasTdd384()
		{
		    return getChosenFlag() == tdd384_chosen;
		}
		
		public void setTdd384(Tdd384 tdd384)
		{
		    setChosenValue(tdd384);
		    setChosenFlag(tdd384_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Tdd384 from ASN1 Module InformationElements.
		 * @see Choice
		 */
		public static class Tdd384 extends Choice {
		    
		    /**
		     * The default constructor.
		     */
		    public Tdd384()
		    {
		    }
		    
		    public static final  int  sF16_chosen = 1;
		    public static final  int  sF8_chosen = 2;
		    
		    // Methods for field "sF16"
		    public static Tdd384 createTdd384WithSF16(SF16 sF16)
		    {
			Tdd384 __object = new Tdd384();

			__object.setSF16(sF16);
			return __object;
		    }
		    
		    public boolean hasSF16()
		    {
			return getChosenFlag() == sF16_chosen;
		    }
		    
		    public void setSF16(SF16 sF16)
		    {
			setChosenValue(sF16);
			setChosenFlag(sF16_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type SF16 from ASN1 Module InformationElements.
		     * @see SequenceOf
		     */
		    public static class SF16 extends SequenceOf {
			
			/**
			 * The default constructor.
			 */
			public SF16()
			{
			}
			
			/**
			 * Construct from an array of components.
			 */
			public SF16(SF16Codes[] elements)
			{
			    super(elements);
			}
			
			/**
			 * Add an Element to the SEQUENCE OF/SET OF.
			 */
			public synchronized void add(SF16Codes element)
			{
			    super.addElement(element);
			}
			
			/**
			 * Set an Element in the SEQUENCE OF/SET OF.
			 */
			public synchronized void set(SF16Codes element, int atIndex)
			{
			    super.setElement(element, atIndex);
			}
			
			/**
			 * Get an Element from the SEQUENCE OF/SET OF.
			 */
			public synchronized SF16Codes get(int atIndex)
			{
			    return (SF16Codes)super.getElement(atIndex);
			}
			
			/**
			 * Insert an Element into the SEQUENCE OF/SET OF.
			 */
			public synchronized void insert(SF16Codes element, int atIndex)
			{
			    super.insertElement(element, atIndex);
			}
			
			/**
			 * Remove an Element from the SEQUENCE OF/SET OF.
			 */
			public synchronized void remove(SF16Codes element)
			{
			    super.removeElement(element);
			}
			
			/**
			 * Create an instance of  SEQUENCE OF/SET OF.
			 */
			public AbstractData createInstance()
			{
			    return SF16Codes.cc16_1;
			}
			
			/**
			 * Initialize the type descriptor.
			 */
			private static final ContainerInfo c_typeinfo = new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd384$SF16"
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
				    "SF16Codes"
				)
			    )
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' SF16 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' SF16 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for SF16

		    // Methods for field "sF8"
		    public static Tdd384 createTdd384WithSF8(SF8 sF8)
		    {
			Tdd384 __object = new Tdd384();

			__object.setSF8(sF8);
			return __object;
		    }
		    
		    public boolean hasSF8()
		    {
			return getChosenFlag() == sF8_chosen;
		    }
		    
		    public void setSF8(SF8 sF8)
		    {
			setChosenValue(sF8);
			setChosenFlag(sF8_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type SF8 from ASN1 Module InformationElements.
		     * @see SequenceOf
		     */
		    public static class SF8 extends SequenceOf {
			
			/**
			 * The default constructor.
			 */
			public SF8()
			{
			}
			
			/**
			 * Construct from an array of components.
			 */
			public SF8(SF8Codes[] elements)
			{
			    super(elements);
			}
			
			/**
			 * Add an Element to the SEQUENCE OF/SET OF.
			 */
			public synchronized void add(SF8Codes element)
			{
			    super.addElement(element);
			}
			
			/**
			 * Set an Element in the SEQUENCE OF/SET OF.
			 */
			public synchronized void set(SF8Codes element, int atIndex)
			{
			    super.setElement(element, atIndex);
			}
			
			/**
			 * Get an Element from the SEQUENCE OF/SET OF.
			 */
			public synchronized SF8Codes get(int atIndex)
			{
			    return (SF8Codes)super.getElement(atIndex);
			}
			
			/**
			 * Insert an Element into the SEQUENCE OF/SET OF.
			 */
			public synchronized void insert(SF8Codes element, int atIndex)
			{
			    super.insertElement(element, atIndex);
			}
			
			/**
			 * Remove an Element from the SEQUENCE OF/SET OF.
			 */
			public synchronized void remove(SF8Codes element)
			{
			    super.removeElement(element);
			}
			
			/**
			 * Create an instance of  SEQUENCE OF/SET OF.
			 */
			public AbstractData createInstance()
			{
			    return SF8Codes.cc8_1;
			}
			
			/**
			 * Initialize the type descriptor.
			 */
			private static final ContainerInfo c_typeinfo = new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd384$SF8"
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
				    "SF8Codes"
				)
			    )
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' SF8 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' SF8 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for SF8

		    // Method to create a specific choice instance
		    public AbstractData createInstance(int chosen)
		    {
			switch (chosen) {
			    case sF16_chosen:
				return new SF16();
			    case sF8_chosen:
				return new SF8();
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
				(short)0x8000
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd384"
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
					    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd384$SF16"
					)
				    ),
				    "sF16",
				    0,
				    2
				),
				new FieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd384$SF8"
					)
				    ),
				    "sF8",
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
		     * Get the type descriptor (TypeInfo) of 'this' Tdd384 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Tdd384 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Tdd384

		// Methods for field "tdd768"
		public static ModeSpecificInfo1 createModeSpecificInfo1WithTdd768(Tdd768 tdd768)
		{
		    ModeSpecificInfo1 __object = new ModeSpecificInfo1();

		    __object.setTdd768(tdd768);
		    return __object;
		}
		
		public boolean hasTdd768()
		{
		    return getChosenFlag() == tdd768_chosen;
		}
		
		public void setTdd768(Tdd768 tdd768)
		{
		    setChosenValue(tdd768);
		    setChosenFlag(tdd768_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Tdd768 from ASN1 Module InformationElements.
		 * @see Choice
		 */
		public static class Tdd768 extends Choice {
		    
		    /**
		     * The default constructor.
		     */
		    public Tdd768()
		    {
		    }
		    
		    public static final  int  sF32_chosen = 1;
		    public static final  int  sF816_chosen = 2;
		    
		    // Methods for field "sF32"
		    public static Tdd768 createTdd768WithSF32(SF32 sF32)
		    {
			Tdd768 __object = new Tdd768();

			__object.setSF32(sF32);
			return __object;
		    }
		    
		    public boolean hasSF32()
		    {
			return getChosenFlag() == sF32_chosen;
		    }
		    
		    public void setSF32(SF32 sF32)
		    {
			setChosenValue(sF32);
			setChosenFlag(sF32_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type SF32 from ASN1 Module InformationElements.
		     * @see SequenceOf
		     */
		    public static class SF32 extends SequenceOf {
			
			/**
			 * The default constructor.
			 */
			public SF32()
			{
			}
			
			/**
			 * Construct from an array of components.
			 */
			public SF32(SF32Codes[] elements)
			{
			    super(elements);
			}
			
			/**
			 * Add an Element to the SEQUENCE OF/SET OF.
			 */
			public synchronized void add(SF32Codes element)
			{
			    super.addElement(element);
			}
			
			/**
			 * Set an Element in the SEQUENCE OF/SET OF.
			 */
			public synchronized void set(SF32Codes element, int atIndex)
			{
			    super.setElement(element, atIndex);
			}
			
			/**
			 * Get an Element from the SEQUENCE OF/SET OF.
			 */
			public synchronized SF32Codes get(int atIndex)
			{
			    return (SF32Codes)super.getElement(atIndex);
			}
			
			/**
			 * Insert an Element into the SEQUENCE OF/SET OF.
			 */
			public synchronized void insert(SF32Codes element, int atIndex)
			{
			    super.insertElement(element, atIndex);
			}
			
			/**
			 * Remove an Element from the SEQUENCE OF/SET OF.
			 */
			public synchronized void remove(SF32Codes element)
			{
			    super.removeElement(element);
			}
			
			/**
			 * Create an instance of  SEQUENCE OF/SET OF.
			 */
			public AbstractData createInstance()
			{
			    return SF32Codes.cc32_1;
			}
			
			/**
			 * Initialize the type descriptor.
			 */
			private static final ContainerInfo c_typeinfo = new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd768$SF32"
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
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SF32Codes"
				)
			    )
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' SF32 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' SF32 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for SF32

		    // Methods for field "sF816"
		    public static Tdd768 createTdd768WithSF816(SF816 sF816)
		    {
			Tdd768 __object = new Tdd768();

			__object.setSF816(sF816);
			return __object;
		    }
		    
		    public boolean hasSF816()
		    {
			return getChosenFlag() == sF816_chosen;
		    }
		    
		    public void setSF816(SF816 sF816)
		    {
			setChosenValue(sF816);
			setChosenFlag(sF816_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type SF816 from ASN1 Module InformationElements.
		     * @see SequenceOf
		     */
		    public static class SF816 extends SequenceOf {
			
			/**
			 * The default constructor.
			 */
			public SF816()
			{
			}
			
			/**
			 * Construct from an array of components.
			 */
			public SF816(SF16Codes2[] elements)
			{
			    super(elements);
			}
			
			/**
			 * Add an Element to the SEQUENCE OF/SET OF.
			 */
			public synchronized void add(SF16Codes2 element)
			{
			    super.addElement(element);
			}
			
			/**
			 * Set an Element in the SEQUENCE OF/SET OF.
			 */
			public synchronized void set(SF16Codes2 element, int atIndex)
			{
			    super.setElement(element, atIndex);
			}
			
			/**
			 * Get an Element from the SEQUENCE OF/SET OF.
			 */
			public synchronized SF16Codes2 get(int atIndex)
			{
			    return (SF16Codes2)super.getElement(atIndex);
			}
			
			/**
			 * Insert an Element into the SEQUENCE OF/SET OF.
			 */
			public synchronized void insert(SF16Codes2 element, int atIndex)
			{
			    super.insertElement(element, atIndex);
			}
			
			/**
			 * Remove an Element from the SEQUENCE OF/SET OF.
			 */
			public synchronized void remove(SF16Codes2 element)
			{
			    super.removeElement(element);
			}
			
			/**
			 * Create an instance of  SEQUENCE OF/SET OF.
			 */
			public AbstractData createInstance()
			{
			    return SF16Codes2.cc16_1;
			}
			
			/**
			 * Initialize the type descriptor.
			 */
			private static final ContainerInfo c_typeinfo = new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd768$SF816"
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
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SF16Codes2"
				)
			    )
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' SF816 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' SF816 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for SF816

		    // Method to create a specific choice instance
		    public AbstractData createInstance(int chosen)
		    {
			switch (chosen) {
			    case sF32_chosen:
				return new SF32();
			    case sF816_chosen:
				return new SF816();
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
			    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd768"
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
					    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd768$SF32"
					)
				    ),
				    "sF32",
				    0,
				    2
				),
				new FieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd768$SF816"
					)
				    ),
				    "sF816",
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
		     * Get the type descriptor (TypeInfo) of 'this' Tdd768 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Tdd768 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Tdd768

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case tdd384_chosen:
			    return new Tdd384();
			case tdd768_chosen:
			    return new Tdd768();
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
			    (short)0x8007
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1"
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
					"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd384"
				    )
				),
				"tdd384",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1$Tdd768"
				    )
				),
				"tdd768",
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
		 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo1 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo1 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for ModeSpecificInfo1

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
		    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768"
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
					    new com.oss.asn1.INTEGER(-35), 
					    new com.oss.asn1.INTEGER(10),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-35),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "e-RUCCH-ConstantValue",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PersistenceScalingFactor"
				    ),
				    new QName (
					"InformationElements",
					"PersistenceScalingFactor"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"psf0-9",
						0
					    ),
					    new MemberListElement (
						"psf0-8",
						1
					    ),
					    new MemberListElement (
						"psf0-7",
						2
					    ),
					    new MemberListElement (
						"psf0-6",
						3
					    ),
					    new MemberListElement (
						"psf0-5",
						4
					    ),
					    new MemberListElement (
						"psf0-4",
						5
					    ),
					    new MemberListElement (
						"psf0-3",
						6
					    ),
					    new MemberListElement (
						"psf0-2",
						7
					    )
					}
				    ),
				    0,
				    PersistenceScalingFactor.psf0_9
				)
			    ),
			    "e-RUCCH-PersistenceScalingFactor",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$T_RUCCH"
				)
			    ),
			    "t-RUCCH",
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
					    new com.oss.asn1.INTEGER(14),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(14)
				    ),
				    null
				)
			    ),
			    "e-RUCCH-TS-Number",
			    3,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$E_RUCCH_Midamble"
				)
			    ),
			    "e-RUCCH-Midamble",
			    4,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$T_adv"
				)
			    ),
			    "t-adv",
			    5,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$T_SCHED"
				)
			    ),
			    "t-SCHED",
			    6,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768$ModeSpecificInfo1"
				)
			    ),
			    "modeSpecificInfo",
			    7,
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
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5),
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5),
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5),
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8005, 5),
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8007, 7)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Tdd384_tdd768 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd384_tdd768 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd384_tdd768

	// Methods for field "tdd128"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd128(Tdd128 tdd128)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Tdd128(T_RUCCH t_RUCCH, INTEGER n_RUCCH, T_WAIT t_WAIT, 
			    T_SI t_SI, INTEGER extendedEstimationWindow, 
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
	    public Tdd128(T_RUCCH t_RUCCH, long n_RUCCH, T_WAIT t_WAIT, 
			    T_SI t_SI, long extendedEstimationWindow, 
			    E_RUCCH_AccessServiceClass e_RUCCH_AccessServiceClass, 
			    PersistenceScalingFactorList e_RUCCH_PersistenceScalingFactor, 
			    SYNC_UL_InfoForE_RUCCH sync_UL_InfoForE_RUCCH, 
			    PRACH_Information_LCR_List prach_information)
	    {
		this(t_RUCCH, new INTEGER(n_RUCCH), t_WAIT, t_SI, 
		     new INTEGER(extendedEstimationWindow), 
		     e_RUCCH_AccessServiceClass, 
		     e_RUCCH_PersistenceScalingFactor, 
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
			"E_RUCCH_Info$ModeSpecificInfo$Tdd128$T_RUCCH"
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
			"E_RUCCH_Info$ModeSpecificInfo$Tdd128$T_WAIT"
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
			"E_RUCCH_Info$ModeSpecificInfo$Tdd128$T_SI"
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "E_RUCCH_Info$ModeSpecificInfo$Tdd128"
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
				    "E_RUCCH_Info$ModeSpecificInfo$Tdd128$T_RUCCH"
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
				    "E_RUCCH_Info$ModeSpecificInfo$Tdd128$T_WAIT"
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
				    "E_RUCCH_Info$ModeSpecificInfo$Tdd128$T_SI"
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
		case tdd384_tdd768_chosen:
		    return new Tdd384_tdd768();
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
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_RUCCH_Info$ModeSpecificInfo"
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
				"E_RUCCH_Info$ModeSpecificInfo$Tdd384_tdd768"
			    )
			),
			"tdd384-tdd768",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"E_RUCCH_Info$ModeSpecificInfo$Tdd128"
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

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
	    "E_RUCCH_Info"
	),
	new QName (
	    "InformationElements",
	    "E-RUCCH-Info"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_RUCCH_Info$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' E_RUCCH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_RUCCH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_RUCCH_Info
