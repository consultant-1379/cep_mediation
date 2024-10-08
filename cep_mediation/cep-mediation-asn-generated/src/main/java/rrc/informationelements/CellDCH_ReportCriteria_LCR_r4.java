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
 * Define the ASN1 Type CellDCH_ReportCriteria_LCR_r4 from ASN1 Module InformationElements.
 * @see Choice
 */

public class CellDCH_ReportCriteria_LCR_r4 extends Choice {
    
    /**
     * The default constructor.
     */
    public CellDCH_ReportCriteria_LCR_r4()
    {
    }
    
    public static final  int  intraFreqReportingCriteria_chosen = 1;
    public static final  int  periodicalReportingCriteria_chosen = 2;
    
    // Methods for field "intraFreqReportingCriteria"
    public static CellDCH_ReportCriteria_LCR_r4 createCellDCH_ReportCriteria_LCR_r4WithIntraFreqReportingCriteria(IntraFreqReportingCriteria_LCR_r4 intraFreqReportingCriteria)
    {
	CellDCH_ReportCriteria_LCR_r4 __object = new CellDCH_ReportCriteria_LCR_r4();

	__object.setIntraFreqReportingCriteria(intraFreqReportingCriteria);
	return __object;
    }
    
    public boolean hasIntraFreqReportingCriteria()
    {
	return getChosenFlag() == intraFreqReportingCriteria_chosen;
    }
    
    public void setIntraFreqReportingCriteria(IntraFreqReportingCriteria_LCR_r4 intraFreqReportingCriteria)
    {
	setChosenValue(intraFreqReportingCriteria);
	setChosenFlag(intraFreqReportingCriteria_chosen);
    }
    
    
    // Methods for field "periodicalReportingCriteria"
    public static CellDCH_ReportCriteria_LCR_r4 createCellDCH_ReportCriteria_LCR_r4WithPeriodicalReportingCriteria(PeriodicalReportingCriteria periodicalReportingCriteria)
    {
	CellDCH_ReportCriteria_LCR_r4 __object = new CellDCH_ReportCriteria_LCR_r4();

	__object.setPeriodicalReportingCriteria(periodicalReportingCriteria);
	return __object;
    }
    
    public boolean hasPeriodicalReportingCriteria()
    {
	return getChosenFlag() == periodicalReportingCriteria_chosen;
    }
    
    public void setPeriodicalReportingCriteria(PeriodicalReportingCriteria periodicalReportingCriteria)
    {
	setChosenValue(periodicalReportingCriteria);
	setChosenFlag(periodicalReportingCriteria_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case intraFreqReportingCriteria_chosen:
		return new IntraFreqReportingCriteria_LCR_r4();
	    case periodicalReportingCriteria_chosen:
		return new PeriodicalReportingCriteria();
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
	    "CellDCH_ReportCriteria_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "CellDCH-ReportCriteria-LCR-r4"
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
				"IntraFreqReportingCriteria_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqReportingCriteria-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_LCR_r4"
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
				"PeriodicalReportingCriteria"
			    ),
			    new QName (
				"InformationElements",
				"PeriodicalReportingCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PeriodicalReportingCriteria"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PeriodicalReportingCriteria"
				)
			    ),
			    0
			)
		    ),
		    "periodicalReportingCriteria",
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
     * Get the type descriptor (TypeInfo) of 'this' CellDCH_ReportCriteria_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellDCH_ReportCriteria_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellDCH_ReportCriteria_LCR_r4
