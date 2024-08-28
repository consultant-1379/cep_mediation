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
 * Define the ASN1 Type InterFreqReportCriteria_r7 from ASN1 Module InformationElements.
 * @see Choice
 */

public class InterFreqReportCriteria_r7 extends Choice {
    
    /**
     * The default constructor.
     */
    public InterFreqReportCriteria_r7()
    {
    }
    
    public static final  int  intraFreqReportingCriteria_chosen = 1;
    public static final  int  interFreqReportingCriteria_chosen = 2;
    public static final  int  periodicalReportingCriteria_chosen = 3;
    public static final  int  noReporting_chosen = 4;
    
    // Methods for field "intraFreqReportingCriteria"
    public static InterFreqReportCriteria_r7 createInterFreqReportCriteria_r7WithIntraFreqReportingCriteria(IntraFreqReportingCriteria_r7 intraFreqReportingCriteria)
    {
	InterFreqReportCriteria_r7 __object = new InterFreqReportCriteria_r7();

	__object.setIntraFreqReportingCriteria(intraFreqReportingCriteria);
	return __object;
    }
    
    public boolean hasIntraFreqReportingCriteria()
    {
	return getChosenFlag() == intraFreqReportingCriteria_chosen;
    }
    
    public void setIntraFreqReportingCriteria(IntraFreqReportingCriteria_r7 intraFreqReportingCriteria)
    {
	setChosenValue(intraFreqReportingCriteria);
	setChosenFlag(intraFreqReportingCriteria_chosen);
    }
    
    
    // Methods for field "interFreqReportingCriteria"
    public static InterFreqReportCriteria_r7 createInterFreqReportCriteria_r7WithInterFreqReportingCriteria(InterFreqReportingCriteria_r6 interFreqReportingCriteria)
    {
	InterFreqReportCriteria_r7 __object = new InterFreqReportCriteria_r7();

	__object.setInterFreqReportingCriteria(interFreqReportingCriteria);
	return __object;
    }
    
    public boolean hasInterFreqReportingCriteria()
    {
	return getChosenFlag() == interFreqReportingCriteria_chosen;
    }
    
    public void setInterFreqReportingCriteria(InterFreqReportingCriteria_r6 interFreqReportingCriteria)
    {
	setChosenValue(interFreqReportingCriteria);
	setChosenFlag(interFreqReportingCriteria_chosen);
    }
    
    
    // Methods for field "periodicalReportingCriteria"
    public static InterFreqReportCriteria_r7 createInterFreqReportCriteria_r7WithPeriodicalReportingCriteria(PeriodicalWithReportingCellStatus periodicalReportingCriteria)
    {
	InterFreqReportCriteria_r7 __object = new InterFreqReportCriteria_r7();

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
    public static InterFreqReportCriteria_r7 createInterFreqReportCriteria_r7WithNoReporting(ReportingCellStatusOpt noReporting)
    {
	InterFreqReportCriteria_r7 __object = new InterFreqReportCriteria_r7();

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
		return new IntraFreqReportingCriteria_r7();
	    case interFreqReportingCriteria_chosen:
		return new InterFreqReportingCriteria_r6();
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
	    "InterFreqReportCriteria_r7"
	),
	new QName (
	    "InformationElements",
	    "InterFreqReportCriteria-r7"
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
				"IntraFreqReportingCriteria_r7"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqReportingCriteria-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_r7"
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
				"InterFreqReportingCriteria_r6"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqReportingCriteria-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqReportingCriteria_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqReportingCriteria_r6"
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
     * Get the type descriptor (TypeInfo) of 'this' InterFreqReportCriteria_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterFreqReportCriteria_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterFreqReportCriteria_r7
