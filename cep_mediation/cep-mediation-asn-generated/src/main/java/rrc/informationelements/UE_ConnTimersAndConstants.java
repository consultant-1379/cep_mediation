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
 * Define the ASN1 Type UE_ConnTimersAndConstants from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_ConnTimersAndConstants extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_ConnTimersAndConstants()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_ConnTimersAndConstants(T_301 t_301, N_301 n_301, T_302 t_302, 
		    N_302 n_302, T_304 t_304, N_304 n_304, T_305 t_305, 
		    T_307 t_307, T_308 t_308, T_309 t_309, T_310 t_310, 
		    N_310 n_310, T_311 t_311, T_312 t_312, N_312 n_312, 
		    T_313 t_313, N_313 n_313, T_314 t_314, T_315 t_315, 
		    N_315 n_315, T_316 t_316, T_317 t_317)
    {
	setT_301(t_301);
	setN_301(n_301);
	setT_302(t_302);
	setN_302(n_302);
	setT_304(t_304);
	setN_304(n_304);
	setT_305(t_305);
	setT_307(t_307);
	setT_308(t_308);
	setT_309(t_309);
	setT_310(t_310);
	setN_310(n_310);
	setT_311(t_311);
	setT_312(t_312);
	setN_312(n_312);
	setT_313(t_313);
	setN_313(n_313);
	setT_314(t_314);
	setT_315(t_315);
	setN_315(n_315);
	setT_316(t_316);
	setT_317(t_317);
    }
    
    public void initComponents()
    {
	mComponents[0] = T_301.ms100;
	mComponents[1] = new N_301();
	mComponents[2] = T_302.ms100;
	mComponents[3] = new N_302();
	mComponents[4] = T_304.ms100;
	mComponents[5] = new N_304();
	mComponents[6] = T_305.noUpdate;
	mComponents[7] = T_307.s5;
	mComponents[8] = T_308.ms40;
	mComponents[9] = new T_309();
	mComponents[10] = T_310.ms40;
	mComponents[11] = new N_310();
	mComponents[12] = T_311.ms250;
	mComponents[13] = new T_312();
	mComponents[14] = N_312.s1;
	mComponents[15] = new T_313();
	mComponents[16] = N_313.s1;
	mComponents[17] = T_314.s0;
	mComponents[18] = T_315.s0;
	mComponents[19] = N_315.s1;
	mComponents[20] = T_316.s0;
	mComponents[21] = T_317.infinity0;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[22];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return T_301.ms100;
	    case 1:
		return new N_301();
	    case 2:
		return T_302.ms100;
	    case 3:
		return new N_302();
	    case 4:
		return T_304.ms100;
	    case 5:
		return new N_304();
	    case 6:
		return T_305.noUpdate;
	    case 7:
		return T_307.s5;
	    case 8:
		return T_308.ms40;
	    case 9:
		return new T_309();
	    case 10:
		return T_310.ms40;
	    case 11:
		return new N_310();
	    case 12:
		return T_311.ms250;
	    case 13:
		return new T_312();
	    case 14:
		return N_312.s1;
	    case 15:
		return new T_313();
	    case 16:
		return N_313.s1;
	    case 17:
		return T_314.s0;
	    case 18:
		return T_315.s0;
	    case 19:
		return N_315.s1;
	    case 20:
		return T_316.s0;
	    case 21:
		return T_317.infinity0;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final T_301 t_301__default = 
	T_301.ms2000;
    public static final N_301 n_301__default = 
	new N_301(2);
    public static final T_302 t_302__default = 
	T_302.ms4000;
    public static final N_302 n_302__default = 
	new N_302(3);
    public static final T_304 t_304__default = 
	T_304.ms2000;
    public static final N_304 n_304__default = 
	new N_304(2);
    public static final T_305 t_305__default = 
	T_305.m30;
    public static final T_307 t_307__default = 
	T_307.s30;
    public static final T_308 t_308__default = 
	T_308.ms160;
    public static final T_309 t_309__default = 
	new T_309(5);
    public static final T_310 t_310__default = 
	T_310.ms160;
    public static final N_310 n_310__default = 
	new N_310(4);
    public static final T_311 t_311__default = 
	T_311.ms2000;
    public static final T_312 t_312__default = 
	new T_312(1);
    public static final N_312 n_312__default = 
	N_312.s1;
    public static final T_313 t_313__default = 
	new T_313(3);
    public static final N_313 n_313__default = 
	N_313.s20;
    public static final T_314 t_314__default = 
	T_314.s12;
    public static final T_315 t_315__default = 
	T_315.s180;
    public static final N_315 n_315__default = 
	N_315.s1;
    public static final T_316 t_316__default = 
	T_316.s30;
    public static final T_317 t_317__default = 
	T_317.infinity4;
    
    // Methods for field "t_301"
    public T_301 getT_301()
    {
	if (hasT_301())
	    return (T_301)mComponents[0];
	else
	    return (T_301)t_301__default.clone();
    }
    
    public void setT_301(T_301 t_301)
    {
	mComponents[0] = t_301;
    }
    
    public void setT_301ToDefault()
    {
	setT_301(t_301__default);
    }
    
    public boolean hasDefaultT_301()
    {
	return true;
    }
    
    public boolean hasT_301()
    {
	return componentIsPresent(0);
    }
    
    public void deleteT_301()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "n_301"
    public N_301 getN_301()
    {
	if (hasN_301())
	    return (N_301)mComponents[1];
	else
	    return (N_301)n_301__default.clone();
    }
    
    public void setN_301(N_301 n_301)
    {
	mComponents[1] = n_301;
    }
    
    public void setN_301ToDefault()
    {
	setN_301(n_301__default);
    }
    
    public boolean hasDefaultN_301()
    {
	return true;
    }
    
    public boolean hasN_301()
    {
	return componentIsPresent(1);
    }
    
    public void deleteN_301()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "t_302"
    public T_302 getT_302()
    {
	if (hasT_302())
	    return (T_302)mComponents[2];
	else
	    return (T_302)t_302__default.clone();
    }
    
    public void setT_302(T_302 t_302)
    {
	mComponents[2] = t_302;
    }
    
    public void setT_302ToDefault()
    {
	setT_302(t_302__default);
    }
    
    public boolean hasDefaultT_302()
    {
	return true;
    }
    
    public boolean hasT_302()
    {
	return componentIsPresent(2);
    }
    
    public void deleteT_302()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "n_302"
    public N_302 getN_302()
    {
	if (hasN_302())
	    return (N_302)mComponents[3];
	else
	    return (N_302)n_302__default.clone();
    }
    
    public void setN_302(N_302 n_302)
    {
	mComponents[3] = n_302;
    }
    
    public void setN_302ToDefault()
    {
	setN_302(n_302__default);
    }
    
    public boolean hasDefaultN_302()
    {
	return true;
    }
    
    public boolean hasN_302()
    {
	return componentIsPresent(3);
    }
    
    public void deleteN_302()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "t_304"
    public T_304 getT_304()
    {
	if (hasT_304())
	    return (T_304)mComponents[4];
	else
	    return (T_304)t_304__default.clone();
    }
    
    public void setT_304(T_304 t_304)
    {
	mComponents[4] = t_304;
    }
    
    public void setT_304ToDefault()
    {
	setT_304(t_304__default);
    }
    
    public boolean hasDefaultT_304()
    {
	return true;
    }
    
    public boolean hasT_304()
    {
	return componentIsPresent(4);
    }
    
    public void deleteT_304()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "n_304"
    public N_304 getN_304()
    {
	if (hasN_304())
	    return (N_304)mComponents[5];
	else
	    return (N_304)n_304__default.clone();
    }
    
    public void setN_304(N_304 n_304)
    {
	mComponents[5] = n_304;
    }
    
    public void setN_304ToDefault()
    {
	setN_304(n_304__default);
    }
    
    public boolean hasDefaultN_304()
    {
	return true;
    }
    
    public boolean hasN_304()
    {
	return componentIsPresent(5);
    }
    
    public void deleteN_304()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "t_305"
    public T_305 getT_305()
    {
	if (hasT_305())
	    return (T_305)mComponents[6];
	else
	    return (T_305)t_305__default.clone();
    }
    
    public void setT_305(T_305 t_305)
    {
	mComponents[6] = t_305;
    }
    
    public void setT_305ToDefault()
    {
	setT_305(t_305__default);
    }
    
    public boolean hasDefaultT_305()
    {
	return true;
    }
    
    public boolean hasT_305()
    {
	return componentIsPresent(6);
    }
    
    public void deleteT_305()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "t_307"
    public T_307 getT_307()
    {
	if (hasT_307())
	    return (T_307)mComponents[7];
	else
	    return (T_307)t_307__default.clone();
    }
    
    public void setT_307(T_307 t_307)
    {
	mComponents[7] = t_307;
    }
    
    public void setT_307ToDefault()
    {
	setT_307(t_307__default);
    }
    
    public boolean hasDefaultT_307()
    {
	return true;
    }
    
    public boolean hasT_307()
    {
	return componentIsPresent(7);
    }
    
    public void deleteT_307()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "t_308"
    public T_308 getT_308()
    {
	if (hasT_308())
	    return (T_308)mComponents[8];
	else
	    return (T_308)t_308__default.clone();
    }
    
    public void setT_308(T_308 t_308)
    {
	mComponents[8] = t_308;
    }
    
    public void setT_308ToDefault()
    {
	setT_308(t_308__default);
    }
    
    public boolean hasDefaultT_308()
    {
	return true;
    }
    
    public boolean hasT_308()
    {
	return componentIsPresent(8);
    }
    
    public void deleteT_308()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "t_309"
    public T_309 getT_309()
    {
	if (hasT_309())
	    return (T_309)mComponents[9];
	else
	    return (T_309)t_309__default.clone();
    }
    
    public void setT_309(T_309 t_309)
    {
	mComponents[9] = t_309;
    }
    
    public void setT_309ToDefault()
    {
	setT_309(t_309__default);
    }
    
    public boolean hasDefaultT_309()
    {
	return true;
    }
    
    public boolean hasT_309()
    {
	return componentIsPresent(9);
    }
    
    public void deleteT_309()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "t_310"
    public T_310 getT_310()
    {
	if (hasT_310())
	    return (T_310)mComponents[10];
	else
	    return (T_310)t_310__default.clone();
    }
    
    public void setT_310(T_310 t_310)
    {
	mComponents[10] = t_310;
    }
    
    public void setT_310ToDefault()
    {
	setT_310(t_310__default);
    }
    
    public boolean hasDefaultT_310()
    {
	return true;
    }
    
    public boolean hasT_310()
    {
	return componentIsPresent(10);
    }
    
    public void deleteT_310()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "n_310"
    public N_310 getN_310()
    {
	if (hasN_310())
	    return (N_310)mComponents[11];
	else
	    return (N_310)n_310__default.clone();
    }
    
    public void setN_310(N_310 n_310)
    {
	mComponents[11] = n_310;
    }
    
    public void setN_310ToDefault()
    {
	setN_310(n_310__default);
    }
    
    public boolean hasDefaultN_310()
    {
	return true;
    }
    
    public boolean hasN_310()
    {
	return componentIsPresent(11);
    }
    
    public void deleteN_310()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "t_311"
    public T_311 getT_311()
    {
	if (hasT_311())
	    return (T_311)mComponents[12];
	else
	    return (T_311)t_311__default.clone();
    }
    
    public void setT_311(T_311 t_311)
    {
	mComponents[12] = t_311;
    }
    
    public void setT_311ToDefault()
    {
	setT_311(t_311__default);
    }
    
    public boolean hasDefaultT_311()
    {
	return true;
    }
    
    public boolean hasT_311()
    {
	return componentIsPresent(12);
    }
    
    public void deleteT_311()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "t_312"
    public T_312 getT_312()
    {
	if (hasT_312())
	    return (T_312)mComponents[13];
	else
	    return (T_312)t_312__default.clone();
    }
    
    public void setT_312(T_312 t_312)
    {
	mComponents[13] = t_312;
    }
    
    public void setT_312ToDefault()
    {
	setT_312(t_312__default);
    }
    
    public boolean hasDefaultT_312()
    {
	return true;
    }
    
    public boolean hasT_312()
    {
	return componentIsPresent(13);
    }
    
    public void deleteT_312()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "n_312"
    public N_312 getN_312()
    {
	if (hasN_312())
	    return (N_312)mComponents[14];
	else
	    return (N_312)n_312__default.clone();
    }
    
    public void setN_312(N_312 n_312)
    {
	mComponents[14] = n_312;
    }
    
    public void setN_312ToDefault()
    {
	setN_312(n_312__default);
    }
    
    public boolean hasDefaultN_312()
    {
	return true;
    }
    
    public boolean hasN_312()
    {
	return componentIsPresent(14);
    }
    
    public void deleteN_312()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "t_313"
    public T_313 getT_313()
    {
	if (hasT_313())
	    return (T_313)mComponents[15];
	else
	    return (T_313)t_313__default.clone();
    }
    
    public void setT_313(T_313 t_313)
    {
	mComponents[15] = t_313;
    }
    
    public void setT_313ToDefault()
    {
	setT_313(t_313__default);
    }
    
    public boolean hasDefaultT_313()
    {
	return true;
    }
    
    public boolean hasT_313()
    {
	return componentIsPresent(15);
    }
    
    public void deleteT_313()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "n_313"
    public N_313 getN_313()
    {
	if (hasN_313())
	    return (N_313)mComponents[16];
	else
	    return (N_313)n_313__default.clone();
    }
    
    public void setN_313(N_313 n_313)
    {
	mComponents[16] = n_313;
    }
    
    public void setN_313ToDefault()
    {
	setN_313(n_313__default);
    }
    
    public boolean hasDefaultN_313()
    {
	return true;
    }
    
    public boolean hasN_313()
    {
	return componentIsPresent(16);
    }
    
    public void deleteN_313()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "t_314"
    public T_314 getT_314()
    {
	if (hasT_314())
	    return (T_314)mComponents[17];
	else
	    return (T_314)t_314__default.clone();
    }
    
    public void setT_314(T_314 t_314)
    {
	mComponents[17] = t_314;
    }
    
    public void setT_314ToDefault()
    {
	setT_314(t_314__default);
    }
    
    public boolean hasDefaultT_314()
    {
	return true;
    }
    
    public boolean hasT_314()
    {
	return componentIsPresent(17);
    }
    
    public void deleteT_314()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "t_315"
    public T_315 getT_315()
    {
	if (hasT_315())
	    return (T_315)mComponents[18];
	else
	    return (T_315)t_315__default.clone();
    }
    
    public void setT_315(T_315 t_315)
    {
	mComponents[18] = t_315;
    }
    
    public void setT_315ToDefault()
    {
	setT_315(t_315__default);
    }
    
    public boolean hasDefaultT_315()
    {
	return true;
    }
    
    public boolean hasT_315()
    {
	return componentIsPresent(18);
    }
    
    public void deleteT_315()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "n_315"
    public N_315 getN_315()
    {
	if (hasN_315())
	    return (N_315)mComponents[19];
	else
	    return (N_315)n_315__default.clone();
    }
    
    public void setN_315(N_315 n_315)
    {
	mComponents[19] = n_315;
    }
    
    public void setN_315ToDefault()
    {
	setN_315(n_315__default);
    }
    
    public boolean hasDefaultN_315()
    {
	return true;
    }
    
    public boolean hasN_315()
    {
	return componentIsPresent(19);
    }
    
    public void deleteN_315()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "t_316"
    public T_316 getT_316()
    {
	if (hasT_316())
	    return (T_316)mComponents[20];
	else
	    return (T_316)t_316__default.clone();
    }
    
    public void setT_316(T_316 t_316)
    {
	mComponents[20] = t_316;
    }
    
    public void setT_316ToDefault()
    {
	setT_316(t_316__default);
    }
    
    public boolean hasDefaultT_316()
    {
	return true;
    }
    
    public boolean hasT_316()
    {
	return componentIsPresent(20);
    }
    
    public void deleteT_316()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "t_317"
    public T_317 getT_317()
    {
	if (hasT_317())
	    return (T_317)mComponents[21];
	else
	    return (T_317)t_317__default.clone();
    }
    
    public void setT_317(T_317 t_317)
    {
	mComponents[21] = t_317;
    }
    
    public void setT_317ToDefault()
    {
	setT_317(t_317__default);
    }
    
    public boolean hasDefaultT_317()
    {
	return true;
    }
    
    public boolean hasT_317()
    {
	return componentIsPresent(21);
    }
    
    public void deleteT_317()
    {
	setComponentAbsent(21);
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
	    "UE_ConnTimersAndConstants"
	),
	new QName (
	    "InformationElements",
	    "UE-ConnTimersAndConstants"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_301"
			    ),
			    new QName (
				"InformationElements",
				"T-301"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms100",
					0
				    ),
				    new MemberListElement (
					"ms200",
					1
				    ),
				    new MemberListElement (
					"ms400",
					2
				    ),
				    new MemberListElement (
					"ms600",
					3
				    ),
				    new MemberListElement (
					"ms800",
					4
				    ),
				    new MemberListElement (
					"ms1000",
					5
				    ),
				    new MemberListElement (
					"ms1200",
					6
				    ),
				    new MemberListElement (
					"ms1400",
					7
				    ),
				    new MemberListElement (
					"ms1600",
					8
				    ),
				    new MemberListElement (
					"ms1800",
					9
				    ),
				    new MemberListElement (
					"ms2000",
					10
				    ),
				    new MemberListElement (
					"ms3000",
					11
				    ),
				    new MemberListElement (
					"ms4000",
					12
				    ),
				    new MemberListElement (
					"ms6000",
					13
				    ),
				    new MemberListElement (
					"ms8000",
					14
				    ),
				    new MemberListElement (
					"spare",
					15
				    )
				}
			    ),
			    0,
			    T_301.ms100
			)
		    ),
		    "t-301",
		    0,
		    3,
		    t_301__default
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
				"rrc.informationelements",
				"N_301"
			    ),
			    new QName (
				"InformationElements",
				"N-301"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new N_301(0), 
				    new N_301(7),
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
		    "n-301",
		    1,
		    3,
		    n_301__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_302"
			    ),
			    new QName (
				"InformationElements",
				"T-302"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms100",
					0
				    ),
				    new MemberListElement (
					"ms200",
					1
				    ),
				    new MemberListElement (
					"ms400",
					2
				    ),
				    new MemberListElement (
					"ms600",
					3
				    ),
				    new MemberListElement (
					"ms800",
					4
				    ),
				    new MemberListElement (
					"ms1000",
					5
				    ),
				    new MemberListElement (
					"ms1200",
					6
				    ),
				    new MemberListElement (
					"ms1400",
					7
				    ),
				    new MemberListElement (
					"ms1600",
					8
				    ),
				    new MemberListElement (
					"ms1800",
					9
				    ),
				    new MemberListElement (
					"ms2000",
					10
				    ),
				    new MemberListElement (
					"ms3000",
					11
				    ),
				    new MemberListElement (
					"ms4000",
					12
				    ),
				    new MemberListElement (
					"ms6000",
					13
				    ),
				    new MemberListElement (
					"ms8000",
					14
				    ),
				    new MemberListElement (
					"spare",
					15
				    )
				}
			    ),
			    0,
			    T_302.ms100
			)
		    ),
		    "t-302",
		    2,
		    3,
		    t_302__default
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
				"rrc.informationelements",
				"N_302"
			    ),
			    new QName (
				"InformationElements",
				"N-302"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new N_302(0), 
				    new N_302(7),
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
		    "n-302",
		    3,
		    3,
		    n_302__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_304"
			    ),
			    new QName (
				"InformationElements",
				"T-304"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms100",
					0
				    ),
				    new MemberListElement (
					"ms200",
					1
				    ),
				    new MemberListElement (
					"ms400",
					2
				    ),
				    new MemberListElement (
					"ms1000",
					3
				    ),
				    new MemberListElement (
					"ms2000",
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
			    T_304.ms100
			)
		    ),
		    "t-304",
		    4,
		    3,
		    t_304__default
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
				"rrc.informationelements",
				"N_304"
			    ),
			    new QName (
				"InformationElements",
				"N-304"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new N_304(0), 
				    new N_304(7),
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
		    "n-304",
		    5,
		    3,
		    n_304__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_305"
			    ),
			    new QName (
				"InformationElements",
				"T-305"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"noUpdate",
					0
				    ),
				    new MemberListElement (
					"m5",
					1
				    ),
				    new MemberListElement (
					"m10",
					2
				    ),
				    new MemberListElement (
					"m30",
					3
				    ),
				    new MemberListElement (
					"m60",
					4
				    ),
				    new MemberListElement (
					"m120",
					5
				    ),
				    new MemberListElement (
					"m360",
					6
				    ),
				    new MemberListElement (
					"m720",
					7
				    )
				}
			    ),
			    0,
			    T_305.noUpdate
			)
		    ),
		    "t-305",
		    6,
		    3,
		    t_305__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_307"
			    ),
			    new QName (
				"InformationElements",
				"T-307"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"s5",
					0
				    ),
				    new MemberListElement (
					"s10",
					1
				    ),
				    new MemberListElement (
					"s15",
					2
				    ),
				    new MemberListElement (
					"s20",
					3
				    ),
				    new MemberListElement (
					"s30",
					4
				    ),
				    new MemberListElement (
					"s40",
					5
				    ),
				    new MemberListElement (
					"s50",
					6
				    ),
				    new MemberListElement (
					"spare",
					7
				    )
				}
			    ),
			    0,
			    T_307.s5
			)
		    ),
		    "t-307",
		    7,
		    3,
		    t_307__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_308"
			    ),
			    new QName (
				"InformationElements",
				"T-308"
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
					"ms160",
					2
				    ),
				    new MemberListElement (
					"ms320",
					3
				    )
				}
			    ),
			    0,
			    T_308.ms40
			)
		    ),
		    "t-308",
		    8,
		    3,
		    t_308__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_309"
			    ),
			    new QName (
				"InformationElements",
				"T-309"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new T_309(1), 
				    new T_309(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "t-309",
		    9,
		    3,
		    t_309__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_310"
			    ),
			    new QName (
				"InformationElements",
				"T-310"
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
			    T_310.ms40
			)
		    ),
		    "t-310",
		    10,
		    3,
		    t_310__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_310"
			    ),
			    new QName (
				"InformationElements",
				"N-310"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new N_310(0), 
				    new N_310(7),
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
		    "n-310",
		    11,
		    3,
		    n_310__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_311"
			    ),
			    new QName (
				"InformationElements",
				"T-311"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms250",
					0
				    ),
				    new MemberListElement (
					"ms500",
					1
				    ),
				    new MemberListElement (
					"ms750",
					2
				    ),
				    new MemberListElement (
					"ms1000",
					3
				    ),
				    new MemberListElement (
					"ms1250",
					4
				    ),
				    new MemberListElement (
					"ms1500",
					5
				    ),
				    new MemberListElement (
					"ms1750",
					6
				    ),
				    new MemberListElement (
					"ms2000",
					7
				    )
				}
			    ),
			    0,
			    T_311.ms250
			)
		    ),
		    "t-311",
		    12,
		    3,
		    t_311__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_312"
			    ),
			    new QName (
				"InformationElements",
				"T-312"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new T_312(0), 
				    new T_312(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "t-312",
		    13,
		    3,
		    t_312__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_312"
			    ),
			    new QName (
				"InformationElements",
				"N-312"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"s1",
					0
				    ),
				    new MemberListElement (
					"s50",
					1
				    ),
				    new MemberListElement (
					"s100",
					2
				    ),
				    new MemberListElement (
					"s200",
					3
				    ),
				    new MemberListElement (
					"s400",
					4
				    ),
				    new MemberListElement (
					"s600",
					5
				    ),
				    new MemberListElement (
					"s800",
					6
				    ),
				    new MemberListElement (
					"s1000",
					7
				    )
				}
			    ),
			    0,
			    N_312.s1
			)
		    ),
		    "n-312",
		    14,
		    3,
		    n_312__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_313"
			    ),
			    new QName (
				"InformationElements",
				"T-313"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new T_313(0), 
				    new T_313(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "t-313",
		    15,
		    3,
		    t_313__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_313"
			    ),
			    new QName (
				"InformationElements",
				"N-313"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"s1",
					0
				    ),
				    new MemberListElement (
					"s2",
					1
				    ),
				    new MemberListElement (
					"s4",
					2
				    ),
				    new MemberListElement (
					"s10",
					3
				    ),
				    new MemberListElement (
					"s20",
					4
				    ),
				    new MemberListElement (
					"s50",
					5
				    ),
				    new MemberListElement (
					"s100",
					6
				    ),
				    new MemberListElement (
					"s200",
					7
				    )
				}
			    ),
			    0,
			    N_313.s1
			)
		    ),
		    "n-313",
		    16,
		    3,
		    n_313__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_314"
			    ),
			    new QName (
				"InformationElements",
				"T-314"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"s0",
					0
				    ),
				    new MemberListElement (
					"s2",
					1
				    ),
				    new MemberListElement (
					"s4",
					2
				    ),
				    new MemberListElement (
					"s6",
					3
				    ),
				    new MemberListElement (
					"s8",
					4
				    ),
				    new MemberListElement (
					"s12",
					5
				    ),
				    new MemberListElement (
					"s16",
					6
				    ),
				    new MemberListElement (
					"s20",
					7
				    )
				}
			    ),
			    0,
			    T_314.s0
			)
		    ),
		    "t-314",
		    17,
		    3,
		    t_314__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_315"
			    ),
			    new QName (
				"InformationElements",
				"T-315"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"s0",
					0
				    ),
				    new MemberListElement (
					"s10",
					1
				    ),
				    new MemberListElement (
					"s30",
					2
				    ),
				    new MemberListElement (
					"s60",
					3
				    ),
				    new MemberListElement (
					"s180",
					4
				    ),
				    new MemberListElement (
					"s600",
					5
				    ),
				    new MemberListElement (
					"s1200",
					6
				    ),
				    new MemberListElement (
					"s1800",
					7
				    )
				}
			    ),
			    0,
			    T_315.s0
			)
		    ),
		    "t-315",
		    18,
		    3,
		    t_315__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_315"
			    ),
			    new QName (
				"InformationElements",
				"N-315"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"s1",
					0
				    ),
				    new MemberListElement (
					"s50",
					1
				    ),
				    new MemberListElement (
					"s100",
					2
				    ),
				    new MemberListElement (
					"s200",
					3
				    ),
				    new MemberListElement (
					"s400",
					4
				    ),
				    new MemberListElement (
					"s600",
					5
				    ),
				    new MemberListElement (
					"s800",
					6
				    ),
				    new MemberListElement (
					"s1000",
					7
				    )
				}
			    ),
			    0,
			    N_315.s1
			)
		    ),
		    "n-315",
		    19,
		    3,
		    n_315__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_316"
			    ),
			    new QName (
				"InformationElements",
				"T-316"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"s0",
					0
				    ),
				    new MemberListElement (
					"s10",
					1
				    ),
				    new MemberListElement (
					"s20",
					2
				    ),
				    new MemberListElement (
					"s30",
					3
				    ),
				    new MemberListElement (
					"s40",
					4
				    ),
				    new MemberListElement (
					"s50",
					5
				    ),
				    new MemberListElement (
					"s-inf",
					6
				    ),
				    new MemberListElement (
					"spare",
					7
				    )
				}
			    ),
			    0,
			    T_316.s0
			)
		    ),
		    "t-316",
		    20,
		    3,
		    t_316__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_317"
			    ),
			    new QName (
				"InformationElements",
				"T-317"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"infinity0",
					0
				    ),
				    new MemberListElement (
					"infinity1",
					1
				    ),
				    new MemberListElement (
					"infinity2",
					2
				    ),
				    new MemberListElement (
					"infinity3",
					3
				    ),
				    new MemberListElement (
					"infinity4",
					4
				    ),
				    new MemberListElement (
					"infinity5",
					5
				    ),
				    new MemberListElement (
					"infinity6",
					6
				    ),
				    new MemberListElement (
					"infinity7",
					7
				    )
				}
			    ),
			    0,
			    T_317.infinity0
			)
		    ),
		    "t-317",
		    21,
		    3,
		    t_317__default
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
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
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
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
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
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_ConnTimersAndConstants object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_ConnTimersAndConstants object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_ConnTimersAndConstants
