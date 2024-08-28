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
 * Define the ASN1 Type ProtocolErrorMoreInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ProtocolErrorMoreInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public ProtocolErrorMoreInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ProtocolErrorMoreInformation(DiagnosticsType diagnosticsType)
    {
	setDiagnosticsType(diagnosticsType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DiagnosticsType();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new DiagnosticsType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "diagnosticsType"
    public DiagnosticsType getDiagnosticsType()
    {
	return (DiagnosticsType)mComponents[0];
    }
    
    public void setDiagnosticsType(DiagnosticsType diagnosticsType)
    {
	mComponents[0] = diagnosticsType;
    }
    
    
    
    /**
     * Define the ASN1 Type DiagnosticsType from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class DiagnosticsType extends Choice {
	
	/**
	 * The default constructor.
	 */
	public DiagnosticsType()
	{
	}
	
	public static final  int  type1_chosen = 1;
	public static final  int  spare_chosen = 2;
	
	// Methods for field "type1"
	public static DiagnosticsType createDiagnosticsTypeWithType1(Type1 type1)
	{
	    DiagnosticsType __object = new DiagnosticsType();

	    __object.setType1(type1);
	    return __object;
	}
	
	public boolean hasType1()
	{
	    return getChosenFlag() == type1_chosen;
	}
	
	public void setType1(Type1 type1)
	{
	    setChosenValue(type1);
	    setChosenFlag(type1_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Type1 from ASN1 Module InformationElements.
	 * @see Choice
	 */
	public static class Type1 extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Type1()
	    {
	    }
	    
	    public static final  int  asn1_ViolationOrEncodingError_chosen = 1;
	    public static final  int  messageTypeNonexistent_chosen = 2;
	    public static final  int  messageNotCompatibleWithReceiverState_chosen = 3;
	    public static final  int  ie_ValueNotComprehended_chosen = 4;
	    public static final  int  conditionalInformationElementError_chosen = 5;
	    public static final  int  messageExtensionNotComprehended_chosen = 6;
	    public static final  int  spare1_chosen = 7;
	    public static final  int  spare2_chosen = 8;
	    
	    // Methods for field "asn1_ViolationOrEncodingError"
	    public static Type1 createType1WithAsn1_ViolationOrEncodingError(Null asn1_ViolationOrEncodingError)
	    {
		Type1 __object = new Type1();

		__object.setAsn1_ViolationOrEncodingError(asn1_ViolationOrEncodingError);
		return __object;
	    }
	    
	    public boolean hasAsn1_ViolationOrEncodingError()
	    {
		return getChosenFlag() == asn1_ViolationOrEncodingError_chosen;
	    }
	    
	    public void setAsn1_ViolationOrEncodingError(Null asn1_ViolationOrEncodingError)
	    {
		setChosenValue(asn1_ViolationOrEncodingError);
		setChosenFlag(asn1_ViolationOrEncodingError_chosen);
	    }
	    
	    
	    // Methods for field "messageTypeNonexistent"
	    public static Type1 createType1WithMessageTypeNonexistent(Null messageTypeNonexistent)
	    {
		Type1 __object = new Type1();

		__object.setMessageTypeNonexistent(messageTypeNonexistent);
		return __object;
	    }
	    
	    public boolean hasMessageTypeNonexistent()
	    {
		return getChosenFlag() == messageTypeNonexistent_chosen;
	    }
	    
	    public void setMessageTypeNonexistent(Null messageTypeNonexistent)
	    {
		setChosenValue(messageTypeNonexistent);
		setChosenFlag(messageTypeNonexistent_chosen);
	    }
	    
	    
	    // Methods for field "messageNotCompatibleWithReceiverState"
	    public static Type1 createType1WithMessageNotCompatibleWithReceiverState(IdentificationOfReceivedMessage messageNotCompatibleWithReceiverState)
	    {
		Type1 __object = new Type1();

		__object.setMessageNotCompatibleWithReceiverState(messageNotCompatibleWithReceiverState);
		return __object;
	    }
	    
	    public boolean hasMessageNotCompatibleWithReceiverState()
	    {
		return getChosenFlag() == messageNotCompatibleWithReceiverState_chosen;
	    }
	    
	    public void setMessageNotCompatibleWithReceiverState(IdentificationOfReceivedMessage messageNotCompatibleWithReceiverState)
	    {
		setChosenValue(messageNotCompatibleWithReceiverState);
		setChosenFlag(messageNotCompatibleWithReceiverState_chosen);
	    }
	    
	    
	    // Methods for field "ie_ValueNotComprehended"
	    public static Type1 createType1WithIe_ValueNotComprehended(IdentificationOfReceivedMessage ie_ValueNotComprehended)
	    {
		Type1 __object = new Type1();

		__object.setIe_ValueNotComprehended(ie_ValueNotComprehended);
		return __object;
	    }
	    
	    public boolean hasIe_ValueNotComprehended()
	    {
		return getChosenFlag() == ie_ValueNotComprehended_chosen;
	    }
	    
	    public void setIe_ValueNotComprehended(IdentificationOfReceivedMessage ie_ValueNotComprehended)
	    {
		setChosenValue(ie_ValueNotComprehended);
		setChosenFlag(ie_ValueNotComprehended_chosen);
	    }
	    
	    
	    // Methods for field "conditionalInformationElementError"
	    public static Type1 createType1WithConditionalInformationElementError(IdentificationOfReceivedMessage conditionalInformationElementError)
	    {
		Type1 __object = new Type1();

		__object.setConditionalInformationElementError(conditionalInformationElementError);
		return __object;
	    }
	    
	    public boolean hasConditionalInformationElementError()
	    {
		return getChosenFlag() == conditionalInformationElementError_chosen;
	    }
	    
	    public void setConditionalInformationElementError(IdentificationOfReceivedMessage conditionalInformationElementError)
	    {
		setChosenValue(conditionalInformationElementError);
		setChosenFlag(conditionalInformationElementError_chosen);
	    }
	    
	    
	    // Methods for field "messageExtensionNotComprehended"
	    public static Type1 createType1WithMessageExtensionNotComprehended(IdentificationOfReceivedMessage messageExtensionNotComprehended)
	    {
		Type1 __object = new Type1();

		__object.setMessageExtensionNotComprehended(messageExtensionNotComprehended);
		return __object;
	    }
	    
	    public boolean hasMessageExtensionNotComprehended()
	    {
		return getChosenFlag() == messageExtensionNotComprehended_chosen;
	    }
	    
	    public void setMessageExtensionNotComprehended(IdentificationOfReceivedMessage messageExtensionNotComprehended)
	    {
		setChosenValue(messageExtensionNotComprehended);
		setChosenFlag(messageExtensionNotComprehended_chosen);
	    }
	    
	    
	    // Methods for field "spare1"
	    public static Type1 createType1WithSpare1(Null spare1)
	    {
		Type1 __object = new Type1();

		__object.setSpare1(spare1);
		return __object;
	    }
	    
	    public boolean hasSpare1()
	    {
		return getChosenFlag() == spare1_chosen;
	    }
	    
	    public void setSpare1(Null spare1)
	    {
		setChosenValue(spare1);
		setChosenFlag(spare1_chosen);
	    }
	    
	    
	    // Methods for field "spare2"
	    public static Type1 createType1WithSpare2(Null spare2)
	    {
		Type1 __object = new Type1();

		__object.setSpare2(spare2);
		return __object;
	    }
	    
	    public boolean hasSpare2()
	    {
		return getChosenFlag() == spare2_chosen;
	    }
	    
	    public void setSpare2(Null spare2)
	    {
		setChosenValue(spare2);
		setChosenFlag(spare2_chosen);
	    }
	    
	    
	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case asn1_ViolationOrEncodingError_chosen:
			return new Null();
		    case messageTypeNonexistent_chosen:
			return new Null();
		    case messageNotCompatibleWithReceiverState_chosen:
			return new IdentificationOfReceivedMessage();
		    case ie_ValueNotComprehended_chosen:
			return new IdentificationOfReceivedMessage();
		    case conditionalInformationElementError_chosen:
			return new IdentificationOfReceivedMessage();
		    case messageExtensionNotComprehended_chosen:
			return new IdentificationOfReceivedMessage();
		    case spare1_chosen:
			return new Null();
		    case spare2_chosen:
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
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "ProtocolErrorMoreInformation$DiagnosticsType$Type1"
		),
		new QName (
		    "builtin",
		    "CHOICE"
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
			    "asn1-ViolationOrEncodingError",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
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
			    "messageTypeNonexistent",
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
					"IdentificationOfReceivedMessage"
				    ),
				    new QName (
					"InformationElements",
					"IdentificationOfReceivedMessage"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "IdentificationOfReceivedMessage"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "IdentificationOfReceivedMessage"
					)
				    ),
				    0
				)
			    ),
			    "messageNotCompatibleWithReceiverState",
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
					"IdentificationOfReceivedMessage"
				    ),
				    new QName (
					"InformationElements",
					"IdentificationOfReceivedMessage"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "IdentificationOfReceivedMessage"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "IdentificationOfReceivedMessage"
					)
				    ),
				    0
				)
			    ),
			    "ie-ValueNotComprehended",
			    3,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"IdentificationOfReceivedMessage"
				    ),
				    new QName (
					"InformationElements",
					"IdentificationOfReceivedMessage"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "IdentificationOfReceivedMessage"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "IdentificationOfReceivedMessage"
					)
				    ),
				    0
				)
			    ),
			    "conditionalInformationElementError",
			    4,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8005
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"IdentificationOfReceivedMessage"
				    ),
				    new QName (
					"InformationElements",
					"IdentificationOfReceivedMessage"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "IdentificationOfReceivedMessage"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "IdentificationOfReceivedMessage"
					)
				    ),
				    0
				)
			    ),
			    "messageExtensionNotComprehended",
			    5,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8006
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
			    "spare1",
			    6,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8007
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
			    "spare2",
			    7,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Type1 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Type1 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Type1

	// Methods for field "spare"
	public static DiagnosticsType createDiagnosticsTypeWithSpare(Null spare)
	{
	    DiagnosticsType __object = new DiagnosticsType();

	    __object.setSpare(spare);
	    return __object;
	}
	
	public boolean hasSpare()
	{
	    return getChosenFlag() == spare_chosen;
	}
	
	public void setSpare(Null spare)
	{
	    setChosenValue(spare);
	    setChosenFlag(spare_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case type1_chosen:
		    return new Type1();
		case spare_chosen:
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
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"ProtocolErrorMoreInformation$DiagnosticsType"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"ProtocolErrorMoreInformation$DiagnosticsType$Type1"
			    )
			),
			"type1",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
			"spare",
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
	 * Get the type descriptor (TypeInfo) of 'this' DiagnosticsType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DiagnosticsType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DiagnosticsType

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
	    "rrc.informationelements",
	    "ProtocolErrorMoreInformation"
	),
	new QName (
	    "InformationElements",
	    "ProtocolErrorMoreInformation"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "ProtocolErrorMoreInformation$DiagnosticsType"
			)
		    ),
		    "diagnosticsType",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ProtocolErrorMoreInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ProtocolErrorMoreInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ProtocolErrorMoreInformation
