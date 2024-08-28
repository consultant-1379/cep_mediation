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
 * Define the ASN1 Type ReportingCellStatus_r10 from ASN1 Module InformationElements.
 * @see Choice
 */

public class ReportingCellStatus_r10 extends Choice {
    
    /**
     * The default constructor.
     */
    public ReportingCellStatus_r10()
    {
    }
    
    public static final  int  withinActiveSet_chosen = 1;
    public static final  int  withinMonitoredSetUsedFreq_chosen = 2;
    public static final  int  withinActiveAndOrMonitoredUsedFreq_chosen = 3;
    public static final  int  withinDetectedSetUsedFreq_chosen = 4;
    public static final  int  withinMonitoredAndOrDetectedUsedFreq_chosen = 5;
    public static final  int  allActiveplusMonitoredSet_chosen = 6;
    public static final  int  allActivePlusDetectedSet_chosen = 7;
    public static final  int  allActivePlusMonitoredAndOrDetectedSet_chosen = 8;
    public static final  int  withinVirtualActSet_chosen = 9;
    public static final  int  withinMonitoredSetNonUsedFreq_chosen = 10;
    public static final  int  withinMonitoredAndOrVirtualActiveSetNonUsedFreq_chosen = 11;
    public static final  int  allVirtualActSetplusMonitoredSetNonUsedFreq_chosen = 12;
    public static final  int  withinActSetOrVirtualActSet_InterRATcells_chosen = 13;
    public static final  int  withinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq_chosen = 14;
    public static final  int  allVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq_chosen = 15;
    
    // Methods for field "withinActiveSet"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithWithinActiveSet(MaxNumberOfReportingCellsType1 withinActiveSet)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setWithinActiveSet(withinActiveSet);
	return __object;
    }
    
    public boolean hasWithinActiveSet()
    {
	return getChosenFlag() == withinActiveSet_chosen;
    }
    
    public void setWithinActiveSet(MaxNumberOfReportingCellsType1 withinActiveSet)
    {
	setChosenValue(withinActiveSet);
	setChosenFlag(withinActiveSet_chosen);
    }
    
    
    // Methods for field "withinMonitoredSetUsedFreq"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithWithinMonitoredSetUsedFreq(MaxNumberOfReportingCellsType1 withinMonitoredSetUsedFreq)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setWithinMonitoredSetUsedFreq(withinMonitoredSetUsedFreq);
	return __object;
    }
    
    public boolean hasWithinMonitoredSetUsedFreq()
    {
	return getChosenFlag() == withinMonitoredSetUsedFreq_chosen;
    }
    
    public void setWithinMonitoredSetUsedFreq(MaxNumberOfReportingCellsType1 withinMonitoredSetUsedFreq)
    {
	setChosenValue(withinMonitoredSetUsedFreq);
	setChosenFlag(withinMonitoredSetUsedFreq_chosen);
    }
    
    
    // Methods for field "withinActiveAndOrMonitoredUsedFreq"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithWithinActiveAndOrMonitoredUsedFreq(MaxNumberOfReportingCellsType1 withinActiveAndOrMonitoredUsedFreq)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setWithinActiveAndOrMonitoredUsedFreq(withinActiveAndOrMonitoredUsedFreq);
	return __object;
    }
    
    public boolean hasWithinActiveAndOrMonitoredUsedFreq()
    {
	return getChosenFlag() == withinActiveAndOrMonitoredUsedFreq_chosen;
    }
    
    public void setWithinActiveAndOrMonitoredUsedFreq(MaxNumberOfReportingCellsType1 withinActiveAndOrMonitoredUsedFreq)
    {
	setChosenValue(withinActiveAndOrMonitoredUsedFreq);
	setChosenFlag(withinActiveAndOrMonitoredUsedFreq_chosen);
    }
    
    
    // Methods for field "withinDetectedSetUsedFreq"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithWithinDetectedSetUsedFreq(MaxNumberOfReportingCellsType1 withinDetectedSetUsedFreq)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setWithinDetectedSetUsedFreq(withinDetectedSetUsedFreq);
	return __object;
    }
    
    public boolean hasWithinDetectedSetUsedFreq()
    {
	return getChosenFlag() == withinDetectedSetUsedFreq_chosen;
    }
    
    public void setWithinDetectedSetUsedFreq(MaxNumberOfReportingCellsType1 withinDetectedSetUsedFreq)
    {
	setChosenValue(withinDetectedSetUsedFreq);
	setChosenFlag(withinDetectedSetUsedFreq_chosen);
    }
    
    
    // Methods for field "withinMonitoredAndOrDetectedUsedFreq"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithWithinMonitoredAndOrDetectedUsedFreq(MaxNumberOfReportingCellsType1 withinMonitoredAndOrDetectedUsedFreq)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setWithinMonitoredAndOrDetectedUsedFreq(withinMonitoredAndOrDetectedUsedFreq);
	return __object;
    }
    
    public boolean hasWithinMonitoredAndOrDetectedUsedFreq()
    {
	return getChosenFlag() == withinMonitoredAndOrDetectedUsedFreq_chosen;
    }
    
    public void setWithinMonitoredAndOrDetectedUsedFreq(MaxNumberOfReportingCellsType1 withinMonitoredAndOrDetectedUsedFreq)
    {
	setChosenValue(withinMonitoredAndOrDetectedUsedFreq);
	setChosenFlag(withinMonitoredAndOrDetectedUsedFreq_chosen);
    }
    
    
    // Methods for field "allActiveplusMonitoredSet"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithAllActiveplusMonitoredSet(MaxNumberOfReportingCellsType3 allActiveplusMonitoredSet)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setAllActiveplusMonitoredSet(allActiveplusMonitoredSet);
	return __object;
    }
    
    public boolean hasAllActiveplusMonitoredSet()
    {
	return getChosenFlag() == allActiveplusMonitoredSet_chosen;
    }
    
    public void setAllActiveplusMonitoredSet(MaxNumberOfReportingCellsType3 allActiveplusMonitoredSet)
    {
	setChosenValue(allActiveplusMonitoredSet);
	setChosenFlag(allActiveplusMonitoredSet_chosen);
    }
    
    
    // Methods for field "allActivePlusDetectedSet"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithAllActivePlusDetectedSet(MaxNumberOfReportingCellsType3 allActivePlusDetectedSet)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setAllActivePlusDetectedSet(allActivePlusDetectedSet);
	return __object;
    }
    
    public boolean hasAllActivePlusDetectedSet()
    {
	return getChosenFlag() == allActivePlusDetectedSet_chosen;
    }
    
    public void setAllActivePlusDetectedSet(MaxNumberOfReportingCellsType3 allActivePlusDetectedSet)
    {
	setChosenValue(allActivePlusDetectedSet);
	setChosenFlag(allActivePlusDetectedSet_chosen);
    }
    
    
    // Methods for field "allActivePlusMonitoredAndOrDetectedSet"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithAllActivePlusMonitoredAndOrDetectedSet(MaxNumberOfReportingCellsType3 allActivePlusMonitoredAndOrDetectedSet)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setAllActivePlusMonitoredAndOrDetectedSet(allActivePlusMonitoredAndOrDetectedSet);
	return __object;
    }
    
    public boolean hasAllActivePlusMonitoredAndOrDetectedSet()
    {
	return getChosenFlag() == allActivePlusMonitoredAndOrDetectedSet_chosen;
    }
    
    public void setAllActivePlusMonitoredAndOrDetectedSet(MaxNumberOfReportingCellsType3 allActivePlusMonitoredAndOrDetectedSet)
    {
	setChosenValue(allActivePlusMonitoredAndOrDetectedSet);
	setChosenFlag(allActivePlusMonitoredAndOrDetectedSet_chosen);
    }
    
    
    // Methods for field "withinVirtualActSet"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithWithinVirtualActSet(MaxNumberOfReportingCellsType1 withinVirtualActSet)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setWithinVirtualActSet(withinVirtualActSet);
	return __object;
    }
    
    public boolean hasWithinVirtualActSet()
    {
	return getChosenFlag() == withinVirtualActSet_chosen;
    }
    
    public void setWithinVirtualActSet(MaxNumberOfReportingCellsType1 withinVirtualActSet)
    {
	setChosenValue(withinVirtualActSet);
	setChosenFlag(withinVirtualActSet_chosen);
    }
    
    
    // Methods for field "withinMonitoredSetNonUsedFreq"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithWithinMonitoredSetNonUsedFreq(MaxNumberOfReportingCellsType1 withinMonitoredSetNonUsedFreq)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setWithinMonitoredSetNonUsedFreq(withinMonitoredSetNonUsedFreq);
	return __object;
    }
    
    public boolean hasWithinMonitoredSetNonUsedFreq()
    {
	return getChosenFlag() == withinMonitoredSetNonUsedFreq_chosen;
    }
    
    public void setWithinMonitoredSetNonUsedFreq(MaxNumberOfReportingCellsType1 withinMonitoredSetNonUsedFreq)
    {
	setChosenValue(withinMonitoredSetNonUsedFreq);
	setChosenFlag(withinMonitoredSetNonUsedFreq_chosen);
    }
    
    
    // Methods for field "withinMonitoredAndOrVirtualActiveSetNonUsedFreq"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithWithinMonitoredAndOrVirtualActiveSetNonUsedFreq(MaxNumberOfReportingCellsType1 withinMonitoredAndOrVirtualActiveSetNonUsedFreq)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setWithinMonitoredAndOrVirtualActiveSetNonUsedFreq(withinMonitoredAndOrVirtualActiveSetNonUsedFreq);
	return __object;
    }
    
    public boolean hasWithinMonitoredAndOrVirtualActiveSetNonUsedFreq()
    {
	return getChosenFlag() == withinMonitoredAndOrVirtualActiveSetNonUsedFreq_chosen;
    }
    
    public void setWithinMonitoredAndOrVirtualActiveSetNonUsedFreq(MaxNumberOfReportingCellsType1 withinMonitoredAndOrVirtualActiveSetNonUsedFreq)
    {
	setChosenValue(withinMonitoredAndOrVirtualActiveSetNonUsedFreq);
	setChosenFlag(withinMonitoredAndOrVirtualActiveSetNonUsedFreq_chosen);
    }
    
    
    // Methods for field "allVirtualActSetplusMonitoredSetNonUsedFreq"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithAllVirtualActSetplusMonitoredSetNonUsedFreq(MaxNumberOfReportingCellsType3 allVirtualActSetplusMonitoredSetNonUsedFreq)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setAllVirtualActSetplusMonitoredSetNonUsedFreq(allVirtualActSetplusMonitoredSetNonUsedFreq);
	return __object;
    }
    
    public boolean hasAllVirtualActSetplusMonitoredSetNonUsedFreq()
    {
	return getChosenFlag() == allVirtualActSetplusMonitoredSetNonUsedFreq_chosen;
    }
    
    public void setAllVirtualActSetplusMonitoredSetNonUsedFreq(MaxNumberOfReportingCellsType3 allVirtualActSetplusMonitoredSetNonUsedFreq)
    {
	setChosenValue(allVirtualActSetplusMonitoredSetNonUsedFreq);
	setChosenFlag(allVirtualActSetplusMonitoredSetNonUsedFreq_chosen);
    }
    
    
    // Methods for field "withinActSetOrVirtualActSet_InterRATcells"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithWithinActSetOrVirtualActSet_InterRATcells(MaxNumberOfReportingCellsType2 withinActSetOrVirtualActSet_InterRATcells)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setWithinActSetOrVirtualActSet_InterRATcells(withinActSetOrVirtualActSet_InterRATcells);
	return __object;
    }
    
    public boolean hasWithinActSetOrVirtualActSet_InterRATcells()
    {
	return getChosenFlag() == withinActSetOrVirtualActSet_InterRATcells_chosen;
    }
    
    public void setWithinActSetOrVirtualActSet_InterRATcells(MaxNumberOfReportingCellsType2 withinActSetOrVirtualActSet_InterRATcells)
    {
	setChosenValue(withinActSetOrVirtualActSet_InterRATcells);
	setChosenFlag(withinActSetOrVirtualActSet_InterRATcells_chosen);
    }
    
    
    // Methods for field "withinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithWithinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq(MaxNumberOfReportingCellsType2 withinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setWithinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq(withinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq);
	return __object;
    }
    
    public boolean hasWithinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq()
    {
	return getChosenFlag() == withinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq_chosen;
    }
    
    public void setWithinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq(MaxNumberOfReportingCellsType2 withinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq)
    {
	setChosenValue(withinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq);
	setChosenFlag(withinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq_chosen);
    }
    
    
    // Methods for field "allVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq"
    public static ReportingCellStatus_r10 createReportingCellStatus_r10WithAllVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq(MaxNumberOfReportingCellsType3 allVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq)
    {
	ReportingCellStatus_r10 __object = new ReportingCellStatus_r10();

	__object.setAllVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq(allVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq);
	return __object;
    }
    
    public boolean hasAllVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq()
    {
	return getChosenFlag() == allVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq_chosen;
    }
    
    public void setAllVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq(MaxNumberOfReportingCellsType3 allVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq)
    {
	setChosenValue(allVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq);
	setChosenFlag(allVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case withinActiveSet_chosen:
		return MaxNumberOfReportingCellsType1.e1;
	    case withinMonitoredSetUsedFreq_chosen:
		return MaxNumberOfReportingCellsType1.e1;
	    case withinActiveAndOrMonitoredUsedFreq_chosen:
		return MaxNumberOfReportingCellsType1.e1;
	    case withinDetectedSetUsedFreq_chosen:
		return MaxNumberOfReportingCellsType1.e1;
	    case withinMonitoredAndOrDetectedUsedFreq_chosen:
		return MaxNumberOfReportingCellsType1.e1;
	    case allActiveplusMonitoredSet_chosen:
		return MaxNumberOfReportingCellsType3.viactCellsPlus1;
	    case allActivePlusDetectedSet_chosen:
		return MaxNumberOfReportingCellsType3.viactCellsPlus1;
	    case allActivePlusMonitoredAndOrDetectedSet_chosen:
		return MaxNumberOfReportingCellsType3.viactCellsPlus1;
	    case withinVirtualActSet_chosen:
		return MaxNumberOfReportingCellsType1.e1;
	    case withinMonitoredSetNonUsedFreq_chosen:
		return MaxNumberOfReportingCellsType1.e1;
	    case withinMonitoredAndOrVirtualActiveSetNonUsedFreq_chosen:
		return MaxNumberOfReportingCellsType1.e1;
	    case allVirtualActSetplusMonitoredSetNonUsedFreq_chosen:
		return MaxNumberOfReportingCellsType3.viactCellsPlus1;
	    case withinActSetOrVirtualActSet_InterRATcells_chosen:
		return MaxNumberOfReportingCellsType2.e1;
	    case withinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq_chosen:
		return MaxNumberOfReportingCellsType2.e1;
	    case allVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq_chosen:
		return MaxNumberOfReportingCellsType3.viactCellsPlus1;
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
	    "ReportingCellStatus_r10"
	),
	new QName (
	    "InformationElements",
	    "ReportingCellStatus-r10"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1",
					0
				    ),
				    new MemberListElement (
					"e2",
					1
				    ),
				    new MemberListElement (
					"e3",
					2
				    ),
				    new MemberListElement (
					"e4",
					3
				    ),
				    new MemberListElement (
					"e5",
					4
				    ),
				    new MemberListElement (
					"e6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType1.e1
			)
		    ),
		    "withinActiveSet",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1",
					0
				    ),
				    new MemberListElement (
					"e2",
					1
				    ),
				    new MemberListElement (
					"e3",
					2
				    ),
				    new MemberListElement (
					"e4",
					3
				    ),
				    new MemberListElement (
					"e5",
					4
				    ),
				    new MemberListElement (
					"e6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType1.e1
			)
		    ),
		    "withinMonitoredSetUsedFreq",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1",
					0
				    ),
				    new MemberListElement (
					"e2",
					1
				    ),
				    new MemberListElement (
					"e3",
					2
				    ),
				    new MemberListElement (
					"e4",
					3
				    ),
				    new MemberListElement (
					"e5",
					4
				    ),
				    new MemberListElement (
					"e6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType1.e1
			)
		    ),
		    "withinActiveAndOrMonitoredUsedFreq",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1",
					0
				    ),
				    new MemberListElement (
					"e2",
					1
				    ),
				    new MemberListElement (
					"e3",
					2
				    ),
				    new MemberListElement (
					"e4",
					3
				    ),
				    new MemberListElement (
					"e5",
					4
				    ),
				    new MemberListElement (
					"e6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType1.e1
			)
		    ),
		    "withinDetectedSetUsedFreq",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1",
					0
				    ),
				    new MemberListElement (
					"e2",
					1
				    ),
				    new MemberListElement (
					"e3",
					2
				    ),
				    new MemberListElement (
					"e4",
					3
				    ),
				    new MemberListElement (
					"e5",
					4
				    ),
				    new MemberListElement (
					"e6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType1.e1
			)
		    ),
		    "withinMonitoredAndOrDetectedUsedFreq",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType3"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType3"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"viactCellsPlus1",
					0
				    ),
				    new MemberListElement (
					"viactCellsPlus2",
					1
				    ),
				    new MemberListElement (
					"viactCellsPlus3",
					2
				    ),
				    new MemberListElement (
					"viactCellsPlus4",
					3
				    ),
				    new MemberListElement (
					"viactCellsPlus5",
					4
				    ),
				    new MemberListElement (
					"viactCellsPlus6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType3.viactCellsPlus1
			)
		    ),
		    "allActiveplusMonitoredSet",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType3"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType3"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"viactCellsPlus1",
					0
				    ),
				    new MemberListElement (
					"viactCellsPlus2",
					1
				    ),
				    new MemberListElement (
					"viactCellsPlus3",
					2
				    ),
				    new MemberListElement (
					"viactCellsPlus4",
					3
				    ),
				    new MemberListElement (
					"viactCellsPlus5",
					4
				    ),
				    new MemberListElement (
					"viactCellsPlus6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType3.viactCellsPlus1
			)
		    ),
		    "allActivePlusDetectedSet",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType3"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType3"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"viactCellsPlus1",
					0
				    ),
				    new MemberListElement (
					"viactCellsPlus2",
					1
				    ),
				    new MemberListElement (
					"viactCellsPlus3",
					2
				    ),
				    new MemberListElement (
					"viactCellsPlus4",
					3
				    ),
				    new MemberListElement (
					"viactCellsPlus5",
					4
				    ),
				    new MemberListElement (
					"viactCellsPlus6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType3.viactCellsPlus1
			)
		    ),
		    "allActivePlusMonitoredAndOrDetectedSet",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1",
					0
				    ),
				    new MemberListElement (
					"e2",
					1
				    ),
				    new MemberListElement (
					"e3",
					2
				    ),
				    new MemberListElement (
					"e4",
					3
				    ),
				    new MemberListElement (
					"e5",
					4
				    ),
				    new MemberListElement (
					"e6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType1.e1
			)
		    ),
		    "withinVirtualActSet",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1",
					0
				    ),
				    new MemberListElement (
					"e2",
					1
				    ),
				    new MemberListElement (
					"e3",
					2
				    ),
				    new MemberListElement (
					"e4",
					3
				    ),
				    new MemberListElement (
					"e5",
					4
				    ),
				    new MemberListElement (
					"e6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType1.e1
			)
		    ),
		    "withinMonitoredSetNonUsedFreq",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType1"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1",
					0
				    ),
				    new MemberListElement (
					"e2",
					1
				    ),
				    new MemberListElement (
					"e3",
					2
				    ),
				    new MemberListElement (
					"e4",
					3
				    ),
				    new MemberListElement (
					"e5",
					4
				    ),
				    new MemberListElement (
					"e6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType1.e1
			)
		    ),
		    "withinMonitoredAndOrVirtualActiveSetNonUsedFreq",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType3"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType3"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"viactCellsPlus1",
					0
				    ),
				    new MemberListElement (
					"viactCellsPlus2",
					1
				    ),
				    new MemberListElement (
					"viactCellsPlus3",
					2
				    ),
				    new MemberListElement (
					"viactCellsPlus4",
					3
				    ),
				    new MemberListElement (
					"viactCellsPlus5",
					4
				    ),
				    new MemberListElement (
					"viactCellsPlus6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType3.viactCellsPlus1
			)
		    ),
		    "allVirtualActSetplusMonitoredSetNonUsedFreq",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType2"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType2"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1",
					0
				    ),
				    new MemberListElement (
					"e2",
					1
				    ),
				    new MemberListElement (
					"e3",
					2
				    ),
				    new MemberListElement (
					"e4",
					3
				    ),
				    new MemberListElement (
					"e5",
					4
				    ),
				    new MemberListElement (
					"e6",
					5
				    ),
				    new MemberListElement (
					"e7",
					6
				    ),
				    new MemberListElement (
					"e8",
					7
				    ),
				    new MemberListElement (
					"e9",
					8
				    ),
				    new MemberListElement (
					"e10",
					9
				    ),
				    new MemberListElement (
					"e11",
					10
				    ),
				    new MemberListElement (
					"e12",
					11
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType2.e1
			)
		    ),
		    "withinActSetOrVirtualActSet-InterRATcells",
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType2"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType2"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1",
					0
				    ),
				    new MemberListElement (
					"e2",
					1
				    ),
				    new MemberListElement (
					"e3",
					2
				    ),
				    new MemberListElement (
					"e4",
					3
				    ),
				    new MemberListElement (
					"e5",
					4
				    ),
				    new MemberListElement (
					"e6",
					5
				    ),
				    new MemberListElement (
					"e7",
					6
				    ),
				    new MemberListElement (
					"e8",
					7
				    ),
				    new MemberListElement (
					"e9",
					8
				    ),
				    new MemberListElement (
					"e10",
					9
				    ),
				    new MemberListElement (
					"e11",
					10
				    ),
				    new MemberListElement (
					"e12",
					11
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType2.e1
			)
		    ),
		    "withinActSetAndOrMonitoredUsedFreqOrVirtualActSetAndOrMonitoredNonUsedFreq",
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNumberOfReportingCellsType3"
			    ),
			    new QName (
				"InformationElements",
				"MaxNumberOfReportingCellsType3"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"viactCellsPlus1",
					0
				    ),
				    new MemberListElement (
					"viactCellsPlus2",
					1
				    ),
				    new MemberListElement (
					"viactCellsPlus3",
					2
				    ),
				    new MemberListElement (
					"viactCellsPlus4",
					3
				    ),
				    new MemberListElement (
					"viactCellsPlus5",
					4
				    ),
				    new MemberListElement (
					"viactCellsPlus6",
					5
				    )
				}
			    ),
			    0,
			    MaxNumberOfReportingCellsType3.viactCellsPlus1
			)
		    ),
		    "allVirtualActSetplusMonitoredSetplusDetectedSetNonUsedFreq",
		    14,
		    2
		)
	    }
	),
	0,
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
		new TagDecoderElement((short)0x800e, 14)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ReportingCellStatus_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReportingCellStatus_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReportingCellStatus_r10
