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
 * Define the ASN1 Type ProtocolErrorIndicatorWithMoreInfo from ASN1 Module InformationElements.
 * @see Choice
 */

public class ProtocolErrorIndicatorWithMoreInfo extends Choice {
    
    /**
     * The default constructor.
     */
    public ProtocolErrorIndicatorWithMoreInfo()
    {
    }
    
    public static final  int  noError_chosen = 1;
    public static final  int  errorOccurred_chosen = 2;
    
    // Methods for field "noError"
    public static ProtocolErrorIndicatorWithMoreInfo createProtocolErrorIndicatorWithMoreInfoWithNoError(Null noError)
    {
	ProtocolErrorIndicatorWithMoreInfo __object = new ProtocolErrorIndicatorWithMoreInfo();

	__object.setNoError(noError);
	return __object;
    }
    
    public boolean hasNoError()
    {
	return getChosenFlag() == noError_chosen;
    }
    
    public void setNoError(Null noError)
    {
	setChosenValue(noError);
	setChosenFlag(noError_chosen);
    }
    
    
    // Methods for field "errorOccurred"
    public static ProtocolErrorIndicatorWithMoreInfo createProtocolErrorIndicatorWithMoreInfoWithErrorOccurred(ErrorOccurred errorOccurred)
    {
	ProtocolErrorIndicatorWithMoreInfo __object = new ProtocolErrorIndicatorWithMoreInfo();

	__object.setErrorOccurred(errorOccurred);
	return __object;
    }
    
    public boolean hasErrorOccurred()
    {
	return getChosenFlag() == errorOccurred_chosen;
    }
    
    public void setErrorOccurred(ErrorOccurred errorOccurred)
    {
	setChosenValue(errorOccurred);
	setChosenFlag(errorOccurred_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type ErrorOccurred from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class ErrorOccurred extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public ErrorOccurred()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public ErrorOccurred(RRC_TransactionIdentifier rrc_TransactionIdentifier, 
			ProtocolErrorInformation protocolErrorInformation)
	{
	    setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	    setProtocolErrorInformation(protocolErrorInformation);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new RRC_TransactionIdentifier();
	    mComponents[1] = new ProtocolErrorInformation();
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
		    return new RRC_TransactionIdentifier();
		case 1:
		    return new ProtocolErrorInformation();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "rrc_TransactionIdentifier"
	public RRC_TransactionIdentifier getRrc_TransactionIdentifier()
	{
	    return (RRC_TransactionIdentifier)mComponents[0];
	}
	
	public void setRrc_TransactionIdentifier(RRC_TransactionIdentifier rrc_TransactionIdentifier)
	{
	    mComponents[0] = rrc_TransactionIdentifier;
	}
	
	
	// Methods for field "protocolErrorInformation"
	public ProtocolErrorInformation getProtocolErrorInformation()
	{
	    return (ProtocolErrorInformation)mComponents[1];
	}
	
	public void setProtocolErrorInformation(ProtocolErrorInformation protocolErrorInformation)
	{
	    mComponents[1] = protocolErrorInformation;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"ProtocolErrorIndicatorWithMoreInfo$ErrorOccurred"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
					new RRC_TransactionIdentifier(0), 
					new RRC_TransactionIdentifier(3),
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
				    "ProtocolErrorInformation"
				),
				new QName (
				    "InformationElements",
				    "ProtocolErrorInformation"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"ProtocolErrorInformation"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"ProtocolErrorInformation"
				    )
				),
				0
			    )
			),
			"protocolErrorInformation",
			1,
			2,
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
			    new TagDecoderElement((short)0x8001, 1)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ErrorOccurred object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ErrorOccurred object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ErrorOccurred

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case noError_chosen:
		return new Null();
	    case errorOccurred_chosen:
		return new ErrorOccurred();
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
	    "ProtocolErrorIndicatorWithMoreInfo"
	),
	new QName (
	    "InformationElements",
	    "ProtocolErrorIndicatorWithMoreInfo"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "noError",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "ProtocolErrorIndicatorWithMoreInfo$ErrorOccurred"
			)
		    ),
		    "errorOccurred",
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
     * Get the type descriptor (TypeInfo) of 'this' ProtocolErrorIndicatorWithMoreInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ProtocolErrorIndicatorWithMoreInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ProtocolErrorIndicatorWithMoreInfo
