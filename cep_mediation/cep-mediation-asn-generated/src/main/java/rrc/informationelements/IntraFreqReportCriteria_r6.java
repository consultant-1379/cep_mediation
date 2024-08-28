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
 * Define the ASN1 Type IntraFreqReportCriteria_r6 from ASN1 Module InformationElements.
 * @see Choice
 */

public class IntraFreqReportCriteria_r6 extends Choice {
    
    /**
     * The default constructor.
     */
    public IntraFreqReportCriteria_r6()
    {
    }
    
    public static final  int  intraFreqReportingCriteria_chosen = 1;
    public static final  int  periodicalReportingCriteria_chosen = 2;
    public static final  int  noReporting_chosen = 3;
    
    // Methods for field "intraFreqReportingCriteria"
    public static IntraFreqReportCriteria_r6 createIntraFreqReportCriteria_r6WithIntraFreqReportingCriteria(IntraFreqReportingCriteria_r6 intraFreqReportingCriteria)
    {
	IntraFreqReportCriteria_r6 __object = new IntraFreqReportCriteria_r6();

	__object.setIntraFreqReportingCriteria(intraFreqReportingCriteria);
	return __object;
    }
    
    public boolean hasIntraFreqReportingCriteria()
    {
	return getChosenFlag() == intraFreqReportingCriteria_chosen;
    }
    
    public void setIntraFreqReportingCriteria(IntraFreqReportingCriteria_r6 intraFreqReportingCriteria)
    {
	setChosenValue(intraFreqReportingCriteria);
	setChosenFlag(intraFreqReportingCriteria_chosen);
    }
    
    
    // Methods for field "periodicalReportingCriteria"
    public static IntraFreqReportCriteria_r6 createIntraFreqReportCriteria_r6WithPeriodicalReportingCriteria(PeriodicalWithReportingCellStatus periodicalReportingCriteria)
    {
	IntraFreqReportCriteria_r6 __object = new IntraFreqReportCriteria_r6();

	__object.setPeriodicalReportingCriteria(periodicalReportingCriteria);
	return __object;
    }
    
    public boolean hasPeriodicalReportingCriteria()
    {
	return getChosenFlag() == periodicalReportingCriteria_chosen;
    }
    
    public void setPeriodicalReportingCriteria(PeriodicalWithReportingCellStatus periodicalReportingCriteria)
    {
	setChosenValue(periodicalReportingCriteria);
	setChosenFlag(periodicalReportingCriteria_chosen);
    }
    
    
    // Methods for field "noReporting"
    public static IntraFreqReportCriteria_r6 createIntraFreqReportCriteria_r6WithNoReporting(ReportingCellStatusOpt noReporting)
    {
	IntraFreqReportCriteria_r6 __object = new IntraFreqReportCriteria_r6();

	__object.setNoReporting(noReporting);
	return __object;
    }
    
    public boolean hasNoReporting()
    {
	return getChosenFlag() == noReporting_chosen;
    }
    
    public void setNoReporting(ReportingCellStatusOpt noReporting)
    {
	setChosenValue(noReporting);
	setChosenFlag(noReporting_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case intraFreqReportingCriteria_chosen:
		return new IntraFreqReportingCriteria_r6();
	    case periodicalReportingCriteria_chosen:
		return new PeriodicalWithReportingCellStatus();
	    case noReporting_chosen:
		return new ReportingCellStatusOpt();
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
	    "IntraFreqReportCriteria_r6"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqReportCriteria-r6"
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
				"IntraFreqReportingCriteria_r6"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqReportingCriteria-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_r6"
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
				"PeriodicalWithReportingCellStatus"
			    ),
			    new QName (
				"InformationElements",
				"PeriodicalWithReportingCellStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PeriodicalWithReportingCellStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PeriodicalWithReportingCellStatus"
				)
			    ),
			    0
			)
		    ),
		    "periodicalReportingCriteria",
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
				"ReportingCellStatusOpt"
			    ),
			    new QName (
				"InformationElements",
				"ReportingCellStatusOpt"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReportingCellStatusOpt"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ReportingCellStatusOpt"
				)
			    ),
			    0
			)
		    ),
		    "noReporting",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqReportCriteria_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqReportCriteria_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqReportCriteria_r6
