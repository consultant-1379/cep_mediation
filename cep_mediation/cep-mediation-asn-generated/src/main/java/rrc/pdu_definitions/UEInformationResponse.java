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
 * Define the ASN1 Type UEInformationResponse from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UEInformationResponse extends Sequence {
    
    /**
     * The default constructor.
     */
    public UEInformationResponse()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UEInformationResponse(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.LoggedMeasReport loggedMeasReport, 
		    rrc.informationelements.LoggedANRReportInfoList loggedANRReportInfoList, 
		    NonCriticalExtensions nonCriticalExtensions)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setLoggedMeasReport(loggedMeasReport);
	setLoggedANRReportInfoList(loggedANRReportInfoList);
	setNonCriticalExtensions(nonCriticalExtensions);
    }
    
    /**
     * Construct with required components.
     */
    public UEInformationResponse(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.LoggedMeasReport();
	mComponents[2] = new rrc.informationelements.LoggedANRReportInfoList();
	mComponents[3] = new NonCriticalExtensions();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new rrc.informationelements.LoggedMeasReport();
	    case 2:
		return new rrc.informationelements.LoggedANRReportInfoList();
	    case 3:
		return new NonCriticalExtensions();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[0];
    }
    
    public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[0] = rrc_TransactionIdentifier;
    }
    
    
    // Methods for field "loggedMeasReport"
    public rrc.informationelements.LoggedMeasReport getLoggedMeasReport()
    {
	return (rrc.informationelements.LoggedMeasReport)mComponents[1];
    }
    
    public void setLoggedMeasReport(rrc.informationelements.LoggedMeasReport loggedMeasReport)
    {
	mComponents[1] = loggedMeasReport;
    }
    
    public boolean hasLoggedMeasReport()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLoggedMeasReport()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "loggedANRReportInfoList"
    public rrc.informationelements.LoggedANRReportInfoList getLoggedANRReportInfoList()
    {
	return (rrc.informationelements.LoggedANRReportInfoList)mComponents[2];
    }
    
    public void setLoggedANRReportInfoList(rrc.informationelements.LoggedANRReportInfoList loggedANRReportInfoList)
    {
	mComponents[2] = loggedANRReportInfoList;
    }
    
    public boolean hasLoggedANRReportInfoList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteLoggedANRReportInfoList()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "nonCriticalExtensions"
    public NonCriticalExtensions getNonCriticalExtensions()
    {
	return (NonCriticalExtensions)mComponents[3];
    }
    
    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
    {
	mComponents[3] = nonCriticalExtensions;
    }
    
    public boolean hasNonCriticalExtensions()
    {
	return componentIsPresent(3);
    }
    
    public void deleteNonCriticalExtensions()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class NonCriticalExtensions extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public NonCriticalExtensions()
	{
	}
	
	public void initComponents()
	{
	    
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[0];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    return null;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UEInformationResponse$NonCriticalExtensions"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		}
	    ),
	    0,
	    null,
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NonCriticalExtensions

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
	    "UEInformationResponse"
	),
	new QName (
	    "PDU-definitions",
	    "UEInformationResponse"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RRC_TransactionIdentifier"
			    ),
			    new QName (
				"InformationElements",
				"RRC-TransactionIdentifier"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RRC_TransactionIdentifier(0), 
				    new rrc.informationelements.RRC_TransactionIdentifier(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "rrc-TransactionIdentifier",
		    0,
		    2,
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
				"LoggedMeasReport"
			    ),
			    new QName (
				"InformationElements",
				"LoggedMeasReport"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasReport"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedMeasReport"
				)
			    ),
			    0
			)
		    ),
		    "loggedMeasReport",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LoggedANRReportInfoList"
			    ),
			    new QName (
				"InformationElements",
				"LoggedANRReportInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "LoggedANRReportInfo"
				)
			    )
			)
		    ),
		    "loggedANRReportInfoList",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UEInformationResponse$NonCriticalExtensions"
			)
		    ),
		    "nonCriticalExtensions",
		    3,
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UEInformationResponse object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UEInformationResponse object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UEInformationResponse
