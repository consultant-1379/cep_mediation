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
 * Define the ASN1 Type GanssReqGenericData from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GanssReqGenericData extends Sequence {
    
    /**
     * The default constructor.
     */
    public GanssReqGenericData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GanssReqGenericData(INTEGER ganssId, 
		    BOOLEAN ganssRealTimeIntegrity, 
		    DGANSS_Sig_Id_Req ganssDifferentialCorrection, 
		    BOOLEAN ganssAlmanac, BOOLEAN ganssNavigationModel, 
		    BitString ganssTimeModelGNSS_GNSS, 
		    BOOLEAN ganssReferenceMeasurementInfo, 
		    GanssDataBits ganssDataBits, BOOLEAN ganssUTCModel, 
		    GanssNavigationModelAdditionalData ganssNavigationModelAdditionalData)
    {
	setGanssId(ganssId);
	setGanssRealTimeIntegrity(ganssRealTimeIntegrity);
	setGanssDifferentialCorrection(ganssDifferentialCorrection);
	setGanssAlmanac(ganssAlmanac);
	setGanssNavigationModel(ganssNavigationModel);
	setGanssTimeModelGNSS_GNSS(ganssTimeModelGNSS_GNSS);
	setGanssReferenceMeasurementInfo(ganssReferenceMeasurementInfo);
	setGanssDataBits(ganssDataBits);
	setGanssUTCModel(ganssUTCModel);
	setGanssNavigationModelAdditionalData(ganssNavigationModelAdditionalData);
    }
    
    /**
     * Construct with components.
     */
    public GanssReqGenericData(long ganssId, boolean ganssRealTimeIntegrity, 
		    DGANSS_Sig_Id_Req ganssDifferentialCorrection, 
		    boolean ganssAlmanac, boolean ganssNavigationModel, 
		    BitString ganssTimeModelGNSS_GNSS, 
		    boolean ganssReferenceMeasurementInfo, 
		    GanssDataBits ganssDataBits, boolean ganssUTCModel, 
		    GanssNavigationModelAdditionalData ganssNavigationModelAdditionalData)
    {
	this(new INTEGER(ganssId), new BOOLEAN(ganssRealTimeIntegrity), 
	     ganssDifferentialCorrection, new BOOLEAN(ganssAlmanac), 
	     new BOOLEAN(ganssNavigationModel), ganssTimeModelGNSS_GNSS, 
	     new BOOLEAN(ganssReferenceMeasurementInfo), ganssDataBits, 
	     new BOOLEAN(ganssUTCModel), ganssNavigationModelAdditionalData);
    }
    
    /**
     * Construct with required components.
     */
    public GanssReqGenericData(boolean ganssRealTimeIntegrity, 
		    boolean ganssAlmanac, boolean ganssNavigationModel, 
		    boolean ganssReferenceMeasurementInfo, 
		    boolean ganssUTCModel)
    {
	setGanssRealTimeIntegrity(ganssRealTimeIntegrity);
	setGanssAlmanac(ganssAlmanac);
	setGanssNavigationModel(ganssNavigationModel);
	setGanssReferenceMeasurementInfo(ganssReferenceMeasurementInfo);
	setGanssUTCModel(ganssUTCModel);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new DGANSS_Sig_Id_Req();
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new BOOLEAN();
	mComponents[5] = new BitString();
	mComponents[6] = new BOOLEAN();
	mComponents[7] = new GanssDataBits();
	mComponents[8] = new BOOLEAN();
	mComponents[9] = new GanssNavigationModelAdditionalData();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[10];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new DGANSS_Sig_Id_Req();
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new BOOLEAN();
	    case 5:
		return new BitString();
	    case 6:
		return new BOOLEAN();
	    case 7:
		return new GanssDataBits();
	    case 8:
		return new BOOLEAN();
	    case 9:
		return new GanssNavigationModelAdditionalData();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssId"
    public long getGanssId()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanssId(long ganssId)
    {
	setGanssId(new INTEGER(ganssId));
    }
    
    public void setGanssId(INTEGER ganssId)
    {
	mComponents[0] = ganssId;
    }
    
    public boolean hasGanssId()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGanssId()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ganssRealTimeIntegrity"
    public boolean getGanssRealTimeIntegrity()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setGanssRealTimeIntegrity(boolean ganssRealTimeIntegrity)
    {
	setGanssRealTimeIntegrity(new BOOLEAN(ganssRealTimeIntegrity));
    }
    
    public void setGanssRealTimeIntegrity(BOOLEAN ganssRealTimeIntegrity)
    {
	mComponents[1] = ganssRealTimeIntegrity;
    }
    
    
    // Methods for field "ganssDifferentialCorrection"
    public DGANSS_Sig_Id_Req getGanssDifferentialCorrection()
    {
	return (DGANSS_Sig_Id_Req)mComponents[2];
    }
    
    public void setGanssDifferentialCorrection(DGANSS_Sig_Id_Req ganssDifferentialCorrection)
    {
	mComponents[2] = ganssDifferentialCorrection;
    }
    
    public boolean hasGanssDifferentialCorrection()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGanssDifferentialCorrection()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ganssAlmanac"
    public boolean getGanssAlmanac()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setGanssAlmanac(boolean ganssAlmanac)
    {
	setGanssAlmanac(new BOOLEAN(ganssAlmanac));
    }
    
    public void setGanssAlmanac(BOOLEAN ganssAlmanac)
    {
	mComponents[3] = ganssAlmanac;
    }
    
    
    // Methods for field "ganssNavigationModel"
    public boolean getGanssNavigationModel()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setGanssNavigationModel(boolean ganssNavigationModel)
    {
	setGanssNavigationModel(new BOOLEAN(ganssNavigationModel));
    }
    
    public void setGanssNavigationModel(BOOLEAN ganssNavigationModel)
    {
	mComponents[4] = ganssNavigationModel;
    }
    
    
    // Methods for field "ganssTimeModelGNSS_GNSS"
    public BitString getGanssTimeModelGNSS_GNSS()
    {
	return (BitString)mComponents[5];
    }
    
    public void setGanssTimeModelGNSS_GNSS(BitString ganssTimeModelGNSS_GNSS)
    {
	mComponents[5] = ganssTimeModelGNSS_GNSS;
    }
    
    public boolean hasGanssTimeModelGNSS_GNSS()
    {
	return componentIsPresent(5);
    }
    
    public void deleteGanssTimeModelGNSS_GNSS()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "ganssReferenceMeasurementInfo"
    public boolean getGanssReferenceMeasurementInfo()
    {
	return ((BOOLEAN)mComponents[6]).booleanValue();
    }
    
    public void setGanssReferenceMeasurementInfo(boolean ganssReferenceMeasurementInfo)
    {
	setGanssReferenceMeasurementInfo(new BOOLEAN(ganssReferenceMeasurementInfo));
    }
    
    public void setGanssReferenceMeasurementInfo(BOOLEAN ganssReferenceMeasurementInfo)
    {
	mComponents[6] = ganssReferenceMeasurementInfo;
    }
    
    
    // Methods for field "ganssDataBits"
    public GanssDataBits getGanssDataBits()
    {
	return (GanssDataBits)mComponents[7];
    }
    
    public void setGanssDataBits(GanssDataBits ganssDataBits)
    {
	mComponents[7] = ganssDataBits;
    }
    
    public boolean hasGanssDataBits()
    {
	return componentIsPresent(7);
    }
    
    public void deleteGanssDataBits()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "ganssUTCModel"
    public boolean getGanssUTCModel()
    {
	return ((BOOLEAN)mComponents[8]).booleanValue();
    }
    
    public void setGanssUTCModel(boolean ganssUTCModel)
    {
	setGanssUTCModel(new BOOLEAN(ganssUTCModel));
    }
    
    public void setGanssUTCModel(BOOLEAN ganssUTCModel)
    {
	mComponents[8] = ganssUTCModel;
    }
    
    
    // Methods for field "ganssNavigationModelAdditionalData"
    public GanssNavigationModelAdditionalData getGanssNavigationModelAdditionalData()
    {
	return (GanssNavigationModelAdditionalData)mComponents[9];
    }
    
    public void setGanssNavigationModelAdditionalData(GanssNavigationModelAdditionalData ganssNavigationModelAdditionalData)
    {
	mComponents[9] = ganssNavigationModelAdditionalData;
    }
    
    public boolean hasGanssNavigationModelAdditionalData()
    {
	return componentIsPresent(9);
    }
    
    public void deleteGanssNavigationModelAdditionalData()
    {
	setComponentAbsent(9);
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
	    "rrc.informationelements",
	    "GanssReqGenericData"
	),
	new QName (
	    "InformationElements",
	    "GanssReqGenericData"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "ganssId",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ganssRealTimeIntegrity",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DGANSS_Sig_Id_Req"
			    ),
			    new QName (
				"InformationElements",
				"DGANSS-Sig-Id-Req"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "ganssDifferentialCorrection",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ganssAlmanac",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ganssNavigationModel",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "ganssTimeModelGNSS-GNSS",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ganssReferenceMeasurementInfo",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GanssDataBits"
			    ),
			    new QName (
				"InformationElements",
				"GanssDataBits"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "GanssDataBits"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "GanssDataBits"
				)
			    ),
			    0
			)
		    ),
		    "ganssDataBits",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ganssUTCModel",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GanssNavigationModelAdditionalData"
			    ),
			    new QName (
				"InformationElements",
				"GanssNavigationModelAdditionalData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "GanssNavigationModelAdditionalData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "GanssNavigationModelAdditionalData"
				)
			    ),
			    0
			)
		    ),
		    "ganssNavigationModelAdditionalData",
		    9,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GanssReqGenericData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GanssReqGenericData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GanssReqGenericData
