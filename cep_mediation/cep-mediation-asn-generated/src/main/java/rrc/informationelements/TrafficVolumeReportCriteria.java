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
 * Define the ASN1 Type TrafficVolumeReportCriteria from ASN1 Module InformationElements.
 * @see Choice
 */

public class TrafficVolumeReportCriteria extends Choice {
    
    /**
     * The default constructor.
     */
    public TrafficVolumeReportCriteria()
    {
    }
    
    public static final  int  trafficVolumeReportingCriteria_chosen = 1;
    public static final  int  periodicalReportingCriteria_chosen = 2;
    public static final  int  noReporting_chosen = 3;
    
    // Methods for field "trafficVolumeReportingCriteria"
    public static TrafficVolumeReportCriteria createTrafficVolumeReportCriteriaWithTrafficVolumeReportingCriteria(TrafficVolumeReportingCriteria trafficVolumeReportingCriteria)
    {
	TrafficVolumeReportCriteria __object = new TrafficVolumeReportCriteria();

	__object.setTrafficVolumeReportingCriteria(trafficVolumeReportingCriteria);
	return __object;
    }
    
    public boolean hasTrafficVolumeReportingCriteria()
    {
	return getChosenFlag() == trafficVolumeReportingCriteria_chosen;
    }
    
    public void setTrafficVolumeReportingCriteria(TrafficVolumeReportingCriteria trafficVolumeReportingCriteria)
    {
	setChosenValue(trafficVolumeReportingCriteria);
	setChosenFlag(trafficVolumeReportingCriteria_chosen);
    }
    
    
    // Methods for field "periodicalReportingCriteria"
    public static TrafficVolumeReportCriteria createTrafficVolumeReportCriteriaWithPeriodicalReportingCriteria(PeriodicalReportingCriteria periodicalReportingCriteria)
    {
	TrafficVolumeReportCriteria __object = new TrafficVolumeReportCriteria();

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
    public static TrafficVolumeReportCriteria createTrafficVolumeReportCriteriaWithNoReporting(Null noReporting)
    {
	TrafficVolumeReportCriteria __object = new TrafficVolumeReportCriteria();

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
	    case trafficVolumeReportingCriteria_chosen:
		return new TrafficVolumeReportingCriteria();
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
	    "TrafficVolumeReportCriteria"
	),
	new QName (
	    "InformationElements",
	    "TrafficVolumeReportCriteria"
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
				"TrafficVolumeReportingCriteria"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeReportingCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeReportingCriteria"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeReportingCriteria"
				)
			    ),
			    0
			)
		    ),
		    "trafficVolumeReportingCriteria",
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
     * Get the type descriptor (TypeInfo) of 'this' TrafficVolumeReportCriteria object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrafficVolumeReportCriteria object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrafficVolumeReportCriteria
