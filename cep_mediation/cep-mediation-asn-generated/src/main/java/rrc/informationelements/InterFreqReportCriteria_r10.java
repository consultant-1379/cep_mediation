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
 * Define the ASN1 Type InterFreqReportCriteria_r10 from ASN1 Module InformationElements.
 * @see Choice
 */

public class InterFreqReportCriteria_r10 extends Choice {
    
    /**
     * The default constructor.
     */
    public InterFreqReportCriteria_r10()
    {
    }
    
    public static final  int  intraFreqReportingCriteria_chosen = 1;
    public static final  int  interFreqReportingCriteria_chosen = 2;
    public static final  int  periodicalReportingCriteria_chosen = 3;
    public static final  int  noReporting_chosen = 4;
    
    // Methods for field "intraFreqReportingCriteria"
    public static InterFreqReportCriteria_r10 createInterFreqReportCriteria_r10WithIntraFreqReportingCriteria(IntraFreqReportingCriteria_r9 intraFreqReportingCriteria)
    {
	InterFreqReportCriteria_r10 __object = new InterFreqReportCriteria_r10();

	__object.setIntraFreqReportingCriteria(intraFreqReportingCriteria);
	return __object;
    }
    
    public boolean hasIntraFreqReportingCriteria()
    {
	return getChosenFlag() == intraFreqReportingCriteria_chosen;
    }
    
    public void setIntraFreqReportingCriteria(IntraFreqReportingCriteria_r9 intraFreqReportingCriteria)
    {
	setChosenValue(intraFreqReportingCriteria);
	setChosenFlag(intraFreqReportingCriteria_chosen);
    }
    
    
    // Methods for field "interFreqReportingCriteria"
    public static InterFreqReportCriteria_r10 createInterFreqReportCriteria_r10WithInterFreqReportingCriteria(InterFreqReportingCriteria_r10 interFreqReportingCriteria)
    {
	InterFreqReportCriteria_r10 __object = new InterFreqReportCriteria_r10();

	__object.setInterFreqReportingCriteria(interFreqReportingCriteria);
	return __object;
    }
    
    public boolean hasInterFreqReportingCriteria()
    {
	return getChosenFlag() == interFreqReportingCriteria_chosen;
    }
    
    public void setInterFreqReportingCriteria(InterFreqReportingCriteria_r10 interFreqReportingCriteria)
    {
	setChosenValue(interFreqReportingCriteria);
	setChosenFlag(interFreqReportingCriteria_chosen);
    }
    
    
    // Methods for field "periodicalReportingCriteria"
    public static InterFreqReportCriteria_r10 createInterFreqReportCriteria_r10WithPeriodicalReportingCriteria(PeriodicalWithReportingCellStatus_r10 periodicalReportingCriteria)
    {
	InterFreqReportCriteria_r10 __object = new InterFreqReportCriteria_r10();

	__object.setPeriodicalReportingCriteria(periodicalReportingCriteria);
	return __object;
    }
    
    public boolean hasPeriodicalReportingCriteria()
    {
	return getChosenFlag() == periodicalReportingCriteria_chosen;
    }
    
    public void setPeriodicalReportingCriteria(PeriodicalWithReportingCellStatus_r10 periodicalReportingCriteria)
    {
	setChosenValue(periodicalReportingCriteria);
	setChosenFlag(periodicalReportingCriteria_chosen);
    }
    
    
    // Methods for field "noReporting"
    public static InterFreqReportCriteria_r10 createInterFreqReportCriteria_r10WithNoReporting(ReportingCellStatusOpt_r10 noReporting)
    {
	InterFreqReportCriteria_r10 __object = new InterFreqReportCriteria_r10();

	__object.setNoReporting(noReporting);
	return __object;
    }
    
    public boolean hasNoReporting()
    {
	return getChosenFlag() == noReporting_chosen;
    }
    
    public void setNoReporting(ReportingCellStatusOpt_r10 noReporting)
    {
	setChosenValue(noReporting);
	setChosenFlag(noReporting_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case intraFreqReportingCriteria_chosen:
		return new IntraFreqReportingCriteria_r9();
	    case interFreqReportingCriteria_chosen:
		return new InterFreqReportingCriteria_r10();
	    case periodicalReportingCriteria_chosen:
		return new PeriodicalWithReportingCellStatus_r10();
	    case noReporting_chosen:
		return new ReportingCellStatusOpt_r10();
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
	    "InterFreqReportCriteria_r10"
	),
	new QName (
	    "InformationElements",
	    "InterFreqReportCriteria-r10"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntraFreqReportingCriteria_r9"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqReportingCriteria-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_r9"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqReportingCriteria",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterFreqReportingCriteria_r10"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqReportingCriteria-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqReportingCriteria_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqReportingCriteria_r10"
				)
			    ),
			    0
			)
		    ),
		    "interFreqReportingCriteria",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PeriodicalWithReportingCellStatus_r10"
			    ),
			    new QName (
				"InformationElements",
				"PeriodicalWithReportingCellStatus-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PeriodicalWithReportingCellStatus_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PeriodicalWithReportingCellStatus_r10"
				)
			    ),
			    0
			)
		    ),
		    "periodicalReportingCriteria",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReportingCellStatusOpt_r10"
			    ),
			    new QName (
				"InformationElements",
				"ReportingCellStatusOpt-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReportingCellStatusOpt_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ReportingCellStatusOpt_r10"
				)
			    ),
			    0
			)
		    ),
		    "noReporting",
		    3,
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
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' InterFreqReportCriteria_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterFreqReportCriteria_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterFreqReportCriteria_r10
