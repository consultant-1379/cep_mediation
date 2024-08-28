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
 * Define the ASN1 Type InterRAT_ChangeFailureCause from ASN1 Module InformationElements.
 * @see Choice
 */

public class InterRAT_ChangeFailureCause extends Choice {
    
    /**
     * The default constructor.
     */
    public InterRAT_ChangeFailureCause()
    {
    }
    
    public static final  int  configurationUnacceptable_chosen = 1;
    public static final  int  physicalChannelFailure_chosen = 2;
    public static final  int  protocolError_chosen = 3;
    public static final  int  unspecified_chosen = 4;
    public static final  int  spare4_chosen = 5;
    public static final  int  spare3_chosen = 6;
    public static final  int  spare2_chosen = 7;
    public static final  int  spare1_chosen = 8;
    
    // Methods for field "configurationUnacceptable"
    public static InterRAT_ChangeFailureCause createInterRAT_ChangeFailureCauseWithConfigurationUnacceptable(Null configurationUnacceptable)
    {
	InterRAT_ChangeFailureCause __object = new InterRAT_ChangeFailureCause();

	__object.setConfigurationUnacceptable(configurationUnacceptable);
	return __object;
    }
    
    public boolean hasConfigurationUnacceptable()
    {
	return getChosenFlag() == configurationUnacceptable_chosen;
    }
    
    public void setConfigurationUnacceptable(Null configurationUnacceptable)
    {
	setChosenValue(configurationUnacceptable);
	setChosenFlag(configurationUnacceptable_chosen);
    }
    
    
    // Methods for field "physicalChannelFailure"
    public static InterRAT_ChangeFailureCause createInterRAT_ChangeFailureCauseWithPhysicalChannelFailure(Null physicalChannelFailure)
    {
	InterRAT_ChangeFailureCause __object = new InterRAT_ChangeFailureCause();

	__object.setPhysicalChannelFailure(physicalChannelFailure);
	return __object;
    }
    
    public boolean hasPhysicalChannelFailure()
    {
	return getChosenFlag() == physicalChannelFailure_chosen;
    }
    
    public void setPhysicalChannelFailure(Null physicalChannelFailure)
    {
	setChosenValue(physicalChannelFailure);
	setChosenFlag(physicalChannelFailure_chosen);
    }
    
    
    // Methods for field "protocolError"
    public static InterRAT_ChangeFailureCause createInterRAT_ChangeFailureCauseWithProtocolError(ProtocolErrorInformation protocolError)
    {
	InterRAT_ChangeFailureCause __object = new InterRAT_ChangeFailureCause();

	__object.setProtocolError(protocolError);
	return __object;
    }
    
    public boolean hasProtocolError()
    {
	return getChosenFlag() == protocolError_chosen;
    }
    
    public void setProtocolError(ProtocolErrorInformation protocolError)
    {
	setChosenValue(protocolError);
	setChosenFlag(protocolError_chosen);
    }
    
    
    // Methods for field "unspecified"
    public static InterRAT_ChangeFailureCause createInterRAT_ChangeFailureCauseWithUnspecified(Null unspecified)
    {
	InterRAT_ChangeFailureCause __object = new InterRAT_ChangeFailureCause();

	__object.setUnspecified(unspecified);
	return __object;
    }
    
    public boolean hasUnspecified()
    {
	return getChosenFlag() == unspecified_chosen;
    }
    
    public void setUnspecified(Null unspecified)
    {
	setChosenValue(unspecified);
	setChosenFlag(unspecified_chosen);
    }
    
    
    // Methods for field "spare4"
    public static InterRAT_ChangeFailureCause createInterRAT_ChangeFailureCauseWithSpare4(Null spare4)
    {
	InterRAT_ChangeFailureCause __object = new InterRAT_ChangeFailureCause();

	__object.setSpare4(spare4);
	return __object;
    }
    
    public boolean hasSpare4()
    {
	return getChosenFlag() == spare4_chosen;
    }
    
    public void setSpare4(Null spare4)
    {
	setChosenValue(spare4);
	setChosenFlag(spare4_chosen);
    }
    
    
    // Methods for field "spare3"
    public static InterRAT_ChangeFailureCause createInterRAT_ChangeFailureCauseWithSpare3(Null spare3)
    {
	InterRAT_ChangeFailureCause __object = new InterRAT_ChangeFailureCause();

	__object.setSpare3(spare3);
	return __object;
    }
    
    public boolean hasSpare3()
    {
	return getChosenFlag() == spare3_chosen;
    }
    
    public void setSpare3(Null spare3)
    {
	setChosenValue(spare3);
	setChosenFlag(spare3_chosen);
    }
    
    
    // Methods for field "spare2"
    public static InterRAT_ChangeFailureCause createInterRAT_ChangeFailureCauseWithSpare2(Null spare2)
    {
	InterRAT_ChangeFailureCause __object = new InterRAT_ChangeFailureCause();

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
    
    
    // Methods for field "spare1"
    public static InterRAT_ChangeFailureCause createInterRAT_ChangeFailureCauseWithSpare1(Null spare1)
    {
	InterRAT_ChangeFailureCause __object = new InterRAT_ChangeFailureCause();

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
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case configurationUnacceptable_chosen:
		return new Null();
	    case physicalChannelFailure_chosen:
		return new Null();
	    case protocolError_chosen:
		return new ProtocolErrorInformation();
	    case unspecified_chosen:
		return new Null();
	    case spare4_chosen:
		return new Null();
	    case spare3_chosen:
		return new Null();
	    case spare2_chosen:
		return new Null();
	    case spare1_chosen:
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
	    "InterRAT_ChangeFailureCause"
	),
	new QName (
	    "InformationElements",
	    "InterRAT-ChangeFailureCause"
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
		    "configurationUnacceptable",
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
		    "physicalChannelFailure",
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
		    "protocolError",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "unspecified",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "spare4",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "spare3",
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
		    "spare2",
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
		    "spare1",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRAT_ChangeFailureCause object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRAT_ChangeFailureCause object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRAT_ChangeFailureCause
