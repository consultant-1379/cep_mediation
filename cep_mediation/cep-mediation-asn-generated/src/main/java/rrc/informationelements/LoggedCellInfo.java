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
 * Define the ASN1 Type LoggedCellInfo from ASN1 Module InformationElements.
 * @see Choice
 */

public class LoggedCellInfo extends Choice {
    
    /**
     * The default constructor.
     */
    public LoggedCellInfo()
    {
    }
    
    public static final  int  loggedUTRACellInfo_chosen = 1;
    public static final  int  loggedEUTRACellInfo_chosen = 2;
    public static final  int  loggedGSMCellInfo_chosen = 3;
    
    // Methods for field "loggedUTRACellInfo"
    public static LoggedCellInfo createLoggedCellInfoWithLoggedUTRACellInfo(LoggedUTRACellInfo loggedUTRACellInfo)
    {
	LoggedCellInfo __object = new LoggedCellInfo();

	__object.setLoggedUTRACellInfo(loggedUTRACellInfo);
	return __object;
    }
    
    public boolean hasLoggedUTRACellInfo()
    {
	return getChosenFlag() == loggedUTRACellInfo_chosen;
    }
    
    public void setLoggedUTRACellInfo(LoggedUTRACellInfo loggedUTRACellInfo)
    {
	setChosenValue(loggedUTRACellInfo);
	setChosenFlag(loggedUTRACellInfo_chosen);
    }
    
    
    // Methods for field "loggedEUTRACellInfo"
    public static LoggedCellInfo createLoggedCellInfoWithLoggedEUTRACellInfo(LoggedEUTRACellInfo loggedEUTRACellInfo)
    {
	LoggedCellInfo __object = new LoggedCellInfo();

	__object.setLoggedEUTRACellInfo(loggedEUTRACellInfo);
	return __object;
    }
    
    public boolean hasLoggedEUTRACellInfo()
    {
	return getChosenFlag() == loggedEUTRACellInfo_chosen;
    }
    
    public void setLoggedEUTRACellInfo(LoggedEUTRACellInfo loggedEUTRACellInfo)
    {
	setChosenValue(loggedEUTRACellInfo);
	setChosenFlag(loggedEUTRACellInfo_chosen);
    }
    
    
    // Methods for field "loggedGSMCellInfo"
    public static LoggedCellInfo createLoggedCellInfoWithLoggedGSMCellInfo(LoggedGSMCellInfo loggedGSMCellInfo)
    {
	LoggedCellInfo __object = new LoggedCellInfo();

	__object.setLoggedGSMCellInfo(loggedGSMCellInfo);
	return __object;
    }
    
    public boolean hasLoggedGSMCellInfo()
    {
	return getChosenFlag() == loggedGSMCellInfo_chosen;
    }
    
    public void setLoggedGSMCellInfo(LoggedGSMCellInfo loggedGSMCellInfo)
    {
	setChosenValue(loggedGSMCellInfo);
	setChosenFlag(loggedGSMCellInfo_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case loggedUTRACellInfo_chosen:
		return new LoggedUTRACellInfo();
	    case loggedEUTRACellInfo_chosen:
		return new LoggedEUTRACellInfo();
	    case loggedGSMCellInfo_chosen:
		return new LoggedGSMCellInfo();
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
	    "LoggedCellInfo"
	),
	new QName (
	    "InformationElements",
	    "LoggedCellInfo"
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
				"LoggedUTRACellInfo"
			    ),
			    new QName (
				"InformationElements",
				"LoggedUTRACellInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedUTRACellInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedUTRACellInfo"
				)
			    ),
			    0
			)
		    ),
		    "loggedUTRACellInfo",
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
				"LoggedEUTRACellInfo"
			    ),
			    new QName (
				"InformationElements",
				"LoggedEUTRACellInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedEUTRACellInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedEUTRACellInfo"
				)
			    ),
			    0
			)
		    ),
		    "loggedEUTRACellInfo",
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
				"LoggedGSMCellInfo"
			    ),
			    new QName (
				"InformationElements",
				"LoggedGSMCellInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedGSMCellInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedGSMCellInfo"
				)
			    ),
			    0
			)
		    ),
		    "loggedGSMCellInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' LoggedCellInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedCellInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedCellInfo
