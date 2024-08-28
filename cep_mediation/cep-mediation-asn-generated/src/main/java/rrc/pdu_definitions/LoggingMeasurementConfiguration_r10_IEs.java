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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type LoggingMeasurementConfiguration_r10_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class LoggingMeasurementConfiguration_r10_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggingMeasurementConfiguration_r10_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggingMeasurementConfiguration_r10_IEs(rrc.informationelements.LoggedMeasurementsConfigurationInfo loggedMeasurementsConfigurationInfo, 
		    rrc.informationelements.LoggedANRConfigurationInfo loggedANRConfigurationInfo)
    {
	setLoggedMeasurementsConfigurationInfo(loggedMeasurementsConfigurationInfo);
	setLoggedANRConfigurationInfo(loggedANRConfigurationInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.LoggedMeasurementsConfigurationInfo();
	mComponents[1] = new rrc.informationelements.LoggedANRConfigurationInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.LoggedMeasurementsConfigurationInfo();
	    case 1:
		return new rrc.informationelements.LoggedANRConfigurationInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "loggedMeasurementsConfigurationInfo"
    public rrc.informationelements.LoggedMeasurementsConfigurationInfo getLoggedMeasurementsConfigurationInfo()
    {
	return (rrc.informationelements.LoggedMeasurementsConfigurationInfo)mComponents[0];
    }
    
    public void setLoggedMeasurementsConfigurationInfo(rrc.informationelements.LoggedMeasurementsConfigurationInfo loggedMeasurementsConfigurationInfo)
    {
	mComponents[0] = loggedMeasurementsConfigurationInfo;
    }
    
    public boolean hasLoggedMeasurementsConfigurationInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteLoggedMeasurementsConfigurationInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "loggedANRConfigurationInfo"
    public rrc.informationelements.LoggedANRConfigurationInfo getLoggedANRConfigurationInfo()
    {
	return (rrc.informationelements.LoggedANRConfigurationInfo)mComponents[1];
    }
    
    public void setLoggedANRConfigurationInfo(rrc.informationelements.LoggedANRConfigurationInfo loggedANRConfigurationInfo)
    {
	mComponents[1] = loggedANRConfigurationInfo;
    }
    
    public boolean hasLoggedANRConfigurationInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLoggedANRConfigurationInfo()
    {
	setComponentAbsent(1);
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
	    "rrc.pdu_definitions",
	    "LoggingMeasurementConfiguration_r10_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "LoggingMeasurementConfiguration-r10-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LoggedMeasurementsConfigurationInfo"
			    ),
			    new QName (
				"InformationElements",
				"LoggedMeasurementsConfigurationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasurementsConfigurationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasurementsConfigurationInfo"
				)
			    ),
			    0
			)
		    ),
		    "loggedMeasurementsConfigurationInfo",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LoggedANRConfigurationInfo"
			    ),
			    new QName (
				"InformationElements",
				"LoggedANRConfigurationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedANRConfigurationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedANRConfigurationInfo"
				)
			    ),
			    0
			)
		    ),
		    "loggedANRConfigurationInfo",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LoggingMeasurementConfiguration_r10_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggingMeasurementConfiguration_r10_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggingMeasurementConfiguration_r10_IEs
