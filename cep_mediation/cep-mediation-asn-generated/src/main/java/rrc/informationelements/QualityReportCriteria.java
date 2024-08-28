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
 * Define the ASN1 Type QualityReportCriteria from ASN1 Module InformationElements.
 * @see Choice
 */

public class QualityReportCriteria extends Choice {
    
    /**
     * The default constructor.
     */
    public QualityReportCriteria()
    {
    }
    
    public static final  int  qualityReportingCriteria_chosen = 1;
    public static final  int  periodicalReportingCriteria_chosen = 2;
    public static final  int  noReporting_chosen = 3;
    
    // Methods for field "qualityReportingCriteria"
    public static QualityReportCriteria createQualityReportCriteriaWithQualityReportingCriteria(QualityReportingCriteria qualityReportingCriteria)
    {
	QualityReportCriteria __object = new QualityReportCriteria();

	__object.setQualityReportingCriteria(qualityReportingCriteria);
	return __object;
    }
    
    public boolean hasQualityReportingCriteria()
    {
	return getChosenFlag() == qualityReportingCriteria_chosen;
    }
    
    public void setQualityReportingCriteria(QualityReportingCriteria qualityReportingCriteria)
    {
	setChosenValue(qualityReportingCriteria);
	setChosenFlag(qualityReportingCriteria_chosen);
    }
    
    
    // Methods for field "periodicalReportingCriteria"
    public static QualityReportCriteria createQualityReportCriteriaWithPeriodicalReportingCriteria(PeriodicalReportingCriteria periodicalReportingCriteria)
    {
	QualityReportCriteria __object = new QualityReportCriteria();

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
    
    
    // Methods for field "noReporting"
    public static QualityReportCriteria createQualityReportCriteriaWithNoReporting(Null noReporting)
    {
	QualityReportCriteria __object = new QualityReportCriteria();

	__object.setNoReporting(noReporting);
	return __object;
    }
    
    public boolean hasNoReporting()
    {
	return getChosenFlag() == noReporting_chosen;
    }
    
    public void setNoReporting(Null noReporting)
    {
	setChosenValue(noReporting);
	setChosenFlag(noReporting_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case qualityReportingCriteria_chosen:
		return new QualityReportingCriteria();
	    case periodicalReportingCriteria_chosen:
		return new PeriodicalReportingCriteria();
	    case noReporting_chosen:
		return new Null();
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
	    "QualityReportCriteria"
	),
	new QName (
	    "InformationElements",
	    "QualityReportCriteria"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"QualityReportingCriteria"
			    ),
			    new QName (
				"InformationElements",
				"QualityReportingCriteria"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "QualityReportingCriteriaSingle"
				)
			    )
			)
		    ),
		    "qualityReportingCriteria",
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
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
     * Get the type descriptor (TypeInfo) of 'this' QualityReportCriteria object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' QualityReportCriteria object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for QualityReportCriteria
