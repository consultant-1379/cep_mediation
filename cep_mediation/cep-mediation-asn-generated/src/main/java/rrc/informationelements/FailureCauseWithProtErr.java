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
 * Define the ASN1 Type FailureCauseWithProtErr from ASN1 Module InformationElements.
 * @see Choice
 */

public class FailureCauseWithProtErr extends Choice {
    
    /**
     * The default constructor.
     */
    public FailureCauseWithProtErr()
    {
    }
    
    public static final  int  configurationUnsupported_chosen = 1;
    public static final  int  physicalChannelFailure_chosen = 2;
    public static final  int  incompatibleSimultaneousReconfiguration_chosen = 3;
    public static final  int  compressedModeRuntimeError_chosen = 4;
    public static final  int  protocolError_chosen = 5;
    public static final  int  cellUpdateOccurred_chosen = 6;
    public static final  int  invalidConfiguration_chosen = 7;
    public static final  int  configurationIncomplete_chosen = 8;
    public static final  int  unsupportedMeasurement_chosen = 9;
    public static final  int  mbmsSessionAlreadyReceivedCorrectly_chosen = 10;
    public static final  int  lowerPriorityMBMSService_chosen = 11;
    public static final  int  spare5_chosen = 12;
    public static final  int  spare4_chosen = 13;
    public static final  int  spare3_chosen = 14;
    public static final  int  spare2_chosen = 15;
    public static final  int  spare1_chosen = 16;
    
    // Methods for field "configurationUnsupported"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithConfigurationUnsupported(Null configurationUnsupported)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

	__object.setConfigurationUnsupported(configurationUnsupported);
	return __object;
    }
    
    public boolean hasConfigurationUnsupported()
    {
	return getChosenFlag() == configurationUnsupported_chosen;
    }
    
    public void setConfigurationUnsupported(Null configurationUnsupported)
    {
	setChosenValue(configurationUnsupported);
	setChosenFlag(configurationUnsupported_chosen);
    }
    
    
    // Methods for field "physicalChannelFailure"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithPhysicalChannelFailure(Null physicalChannelFailure)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

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
    
    
    // Methods for field "incompatibleSimultaneousReconfiguration"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithIncompatibleSimultaneousReconfiguration(Null incompatibleSimultaneousReconfiguration)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

	__object.setIncompatibleSimultaneousReconfiguration(incompatibleSimultaneousReconfiguration);
	return __object;
    }
    
    public boolean hasIncompatibleSimultaneousReconfiguration()
    {
	return getChosenFlag() == incompatibleSimultaneousReconfiguration_chosen;
    }
    
    public void setIncompatibleSimultaneousReconfiguration(Null incompatibleSimultaneousReconfiguration)
    {
	setChosenValue(incompatibleSimultaneousReconfiguration);
	setChosenFlag(incompatibleSimultaneousReconfiguration_chosen);
    }
    
    
    // Methods for field "compressedModeRuntimeError"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithCompressedModeRuntimeError(long compressedModeRuntimeError)
    {
	return createFailureCauseWithProtErrWithCompressedModeRuntimeError(new TGPSI(compressedModeRuntimeError));
    }
    
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithCompressedModeRuntimeError(TGPSI compressedModeRuntimeError)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

	__object.setCompressedModeRuntimeError(compressedModeRuntimeError);
	return __object;
    }
    
    public boolean hasCompressedModeRuntimeError()
    {
	return getChosenFlag() == compressedModeRuntimeError_chosen;
    }
    
    public void setCompressedModeRuntimeError(long compressedModeRuntimeError)
    {
	setCompressedModeRuntimeError(new TGPSI(compressedModeRuntimeError));
    }
    
    public void setCompressedModeRuntimeError(TGPSI compressedModeRuntimeError)
    {
	setChosenValue(compressedModeRuntimeError);
	setChosenFlag(compressedModeRuntimeError_chosen);
    }
    
    
    // Methods for field "protocolError"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithProtocolError(ProtocolErrorInformation protocolError)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

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
    
    
    // Methods for field "cellUpdateOccurred"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithCellUpdateOccurred(Null cellUpdateOccurred)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

	__object.setCellUpdateOccurred(cellUpdateOccurred);
	return __object;
    }
    
    public boolean hasCellUpdateOccurred()
    {
	return getChosenFlag() == cellUpdateOccurred_chosen;
    }
    
    public void setCellUpdateOccurred(Null cellUpdateOccurred)
    {
	setChosenValue(cellUpdateOccurred);
	setChosenFlag(cellUpdateOccurred_chosen);
    }
    
    
    // Methods for field "invalidConfiguration"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithInvalidConfiguration(Null invalidConfiguration)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

	__object.setInvalidConfiguration(invalidConfiguration);
	return __object;
    }
    
    public boolean hasInvalidConfiguration()
    {
	return getChosenFlag() == invalidConfiguration_chosen;
    }
    
    public void setInvalidConfiguration(Null invalidConfiguration)
    {
	setChosenValue(invalidConfiguration);
	setChosenFlag(invalidConfiguration_chosen);
    }
    
    
    // Methods for field "configurationIncomplete"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithConfigurationIncomplete(Null configurationIncomplete)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

	__object.setConfigurationIncomplete(configurationIncomplete);
	return __object;
    }
    
    public boolean hasConfigurationIncomplete()
    {
	return getChosenFlag() == configurationIncomplete_chosen;
    }
    
    public void setConfigurationIncomplete(Null configurationIncomplete)
    {
	setChosenValue(configurationIncomplete);
	setChosenFlag(configurationIncomplete_chosen);
    }
    
    
    // Methods for field "unsupportedMeasurement"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithUnsupportedMeasurement(Null unsupportedMeasurement)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

	__object.setUnsupportedMeasurement(unsupportedMeasurement);
	return __object;
    }
    
    public boolean hasUnsupportedMeasurement()
    {
	return getChosenFlag() == unsupportedMeasurement_chosen;
    }
    
    public void setUnsupportedMeasurement(Null unsupportedMeasurement)
    {
	setChosenValue(unsupportedMeasurement);
	setChosenFlag(unsupportedMeasurement_chosen);
    }
    
    
    // Methods for field "mbmsSessionAlreadyReceivedCorrectly"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithMbmsSessionAlreadyReceivedCorrectly(Null mbmsSessionAlreadyReceivedCorrectly)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

	__object.setMbmsSessionAlreadyReceivedCorrectly(mbmsSessionAlreadyReceivedCorrectly);
	return __object;
    }
    
    public boolean hasMbmsSessionAlreadyReceivedCorrectly()
    {
	return getChosenFlag() == mbmsSessionAlreadyReceivedCorrectly_chosen;
    }
    
    public void setMbmsSessionAlreadyReceivedCorrectly(Null mbmsSessionAlreadyReceivedCorrectly)
    {
	setChosenValue(mbmsSessionAlreadyReceivedCorrectly);
	setChosenFlag(mbmsSessionAlreadyReceivedCorrectly_chosen);
    }
    
    
    // Methods for field "lowerPriorityMBMSService"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithLowerPriorityMBMSService(Null lowerPriorityMBMSService)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

	__object.setLowerPriorityMBMSService(lowerPriorityMBMSService);
	return __object;
    }
    
    public boolean hasLowerPriorityMBMSService()
    {
	return getChosenFlag() == lowerPriorityMBMSService_chosen;
    }
    
    public void setLowerPriorityMBMSService(Null lowerPriorityMBMSService)
    {
	setChosenValue(lowerPriorityMBMSService);
	setChosenFlag(lowerPriorityMBMSService_chosen);
    }
    
    
    // Methods for field "spare5"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithSpare5(Null spare5)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

	__object.setSpare5(spare5);
	return __object;
    }
    
    public boolean hasSpare5()
    {
	return getChosenFlag() == spare5_chosen;
    }
    
    public void setSpare5(Null spare5)
    {
	setChosenValue(spare5);
	setChosenFlag(spare5_chosen);
    }
    
    
    // Methods for field "spare4"
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithSpare4(Null spare4)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

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
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithSpare3(Null spare3)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

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
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithSpare2(Null spare2)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

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
    public static FailureCauseWithProtErr createFailureCauseWithProtErrWithSpare1(Null spare1)
    {
	FailureCauseWithProtErr __object = new FailureCauseWithProtErr();

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
	    case configurationUnsupported_chosen:
		return new Null();
	    case physicalChannelFailure_chosen:
		return new Null();
	    case incompatibleSimultaneousReconfiguration_chosen:
		return new Null();
	    case compressedModeRuntimeError_chosen:
		return new TGPSI();
	    case protocolError_chosen:
		return new ProtocolErrorInformation();
	    case cellUpdateOccurred_chosen:
		return new Null();
	    case invalidConfiguration_chosen:
		return new Null();
	    case configurationIncomplete_chosen:
		return new Null();
	    case unsupportedMeasurement_chosen:
		return new Null();
	    case mbmsSessionAlreadyReceivedCorrectly_chosen:
		return new Null();
	    case lowerPriorityMBMSService_chosen:
		return new Null();
	    case spare5_chosen:
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
	    "FailureCauseWithProtErr"
	),
	new QName (
	    "InformationElements",
	    "FailureCauseWithProtErr"
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
		    "configurationUnsupported",
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
		    "incompatibleSimultaneousReconfiguration",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TGPSI"
			    ),
			    new QName (
				"InformationElements",
				"TGPSI"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TGPSI(1), 
				    new TGPSI(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "compressedModeRuntimeError",
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
		    "cellUpdateOccurred",
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
		    "invalidConfiguration",
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
		    "configurationIncomplete",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "unsupportedMeasurement",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "mbmsSessionAlreadyReceivedCorrectly",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    "lowerPriorityMBMSService",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    "spare5",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
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
		    14,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
		    15,
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
		new TagDecoderElement((short)0x8007, 7),
		new TagDecoderElement((short)0x8008, 8),
		new TagDecoderElement((short)0x8009, 9),
		new TagDecoderElement((short)0x800a, 10),
		new TagDecoderElement((short)0x800b, 11),
		new TagDecoderElement((short)0x800c, 12),
		new TagDecoderElement((short)0x800d, 13),
		new TagDecoderElement((short)0x800e, 14),
		new TagDecoderElement((short)0x800f, 15)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' FailureCauseWithProtErr object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FailureCauseWithProtErr object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FailureCauseWithProtErr
