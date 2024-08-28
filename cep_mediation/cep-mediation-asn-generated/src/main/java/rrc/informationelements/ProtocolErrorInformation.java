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
 * Define the ASN1 Type ProtocolErrorInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ProtocolErrorInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public ProtocolErrorInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ProtocolErrorInformation(DiagnosticsType diagnosticsType)
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
	 * @see Sequence
	 */
	public static class Type1 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Type1()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Type1(ProtocolErrorCause protocolErrorCause)
	    {
		setProtocolErrorCause(protocolErrorCause);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = ProtocolErrorCause.asn1_ViolationOrEncodingError;
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
			return ProtocolErrorCause.asn1_ViolationOrEncodingError;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "protocolErrorCause"
	    public ProtocolErrorCause getProtocolErrorCause()
	    {
		return (ProtocolErrorCause)mComponents[0];
	    }
	    
	    public void setProtocolErrorCause(ProtocolErrorCause protocolErrorCause)
	    {
		mComponents[0] = protocolErrorCause;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "ProtocolErrorInformation$DiagnosticsType$Type1"
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
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"ProtocolErrorCause"
				    ),
				    new QName (
					"InformationElements",
					"ProtocolErrorCause"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"asn1-ViolationOrEncodingError",
						0
					    ),
					    new MemberListElement (
						"messageTypeNonexistent",
						1
					    ),
					    new MemberListElement (
						"messageNotCompatibleWithReceiverState",
						2
					    ),
					    new MemberListElement (
						"ie-ValueNotComprehended",
						3
					    ),
					    new MemberListElement (
						"informationElementMissing",
						4
					    ),
					    new MemberListElement (
						"messageExtensionNotComprehended",
						5
					    ),
					    new MemberListElement (
						"spare2",
						6
					    ),
					    new MemberListElement (
						"spare1",
						7
					    )
					}
				    ),
				    0,
				    ProtocolErrorCause.asn1_ViolationOrEncodingError
				)
			    ),
			    "protocolErrorCause",
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
		"ProtocolErrorInformation$DiagnosticsType"
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
				"ProtocolErrorInformation$DiagnosticsType$Type1"
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
	    "ProtocolErrorInformation"
	),
	new QName (
	    "InformationElements",
	    "ProtocolErrorInformation"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "ProtocolErrorInformation$DiagnosticsType"
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
     * Get the type descriptor (TypeInfo) of 'this' ProtocolErrorInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ProtocolErrorInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ProtocolErrorInformation
