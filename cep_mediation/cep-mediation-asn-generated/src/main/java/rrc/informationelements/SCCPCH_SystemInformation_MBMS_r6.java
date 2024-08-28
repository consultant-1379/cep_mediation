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
 * Define the ASN1 Type SCCPCH_SystemInformation_MBMS_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SCCPCH_SystemInformation_MBMS_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SCCPCH_SystemInformation_MBMS_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SCCPCH_SystemInformation_MBMS_r6(SecondaryCCPCHInfo_MBMS_r6 secondaryCCPCHInfo_MBMS, 
		    TFCS transportFormatCombinationSet, 
		    FachCarryingMCCH fachCarryingMCCH, 
		    MBMS_FACHCarryingMTCH_List fachCarryingMTCH_List, 
		    FachCarryingMSCH fachCarryingMSCH)
    {
	setSecondaryCCPCHInfo_MBMS(secondaryCCPCHInfo_MBMS);
	setTransportFormatCombinationSet(transportFormatCombinationSet);
	setFachCarryingMCCH(fachCarryingMCCH);
	setFachCarryingMTCH_List(fachCarryingMTCH_List);
	setFachCarryingMSCH(fachCarryingMSCH);
    }
    
    /**
     * Construct with required components.
     */
    public SCCPCH_SystemInformation_MBMS_r6(SecondaryCCPCHInfo_MBMS_r6 secondaryCCPCHInfo_MBMS, 
		    TFCS transportFormatCombinationSet, 
		    FachCarryingMCCH fachCarryingMCCH)
    {
	setSecondaryCCPCHInfo_MBMS(secondaryCCPCHInfo_MBMS);
	setTransportFormatCombinationSet(transportFormatCombinationSet);
	setFachCarryingMCCH(fachCarryingMCCH);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondaryCCPCHInfo_MBMS_r6();
	mComponents[1] = new TFCS();
	mComponents[2] = new FachCarryingMCCH();
	mComponents[3] = new MBMS_FACHCarryingMTCH_List();
	mComponents[4] = new FachCarryingMSCH();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new SecondaryCCPCHInfo_MBMS_r6();
	    case 1:
		return new TFCS();
	    case 2:
		return new FachCarryingMCCH();
	    case 3:
		return new MBMS_FACHCarryingMTCH_List();
	    case 4:
		return new FachCarryingMSCH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondaryCCPCHInfo_MBMS"
    public SecondaryCCPCHInfo_MBMS_r6 getSecondaryCCPCHInfo_MBMS()
    {
	return (SecondaryCCPCHInfo_MBMS_r6)mComponents[0];
    }
    
    public void setSecondaryCCPCHInfo_MBMS(SecondaryCCPCHInfo_MBMS_r6 secondaryCCPCHInfo_MBMS)
    {
	mComponents[0] = secondaryCCPCHInfo_MBMS;
    }
    
    
    // Methods for field "transportFormatCombinationSet"
    public TFCS getTransportFormatCombinationSet()
    {
	return (TFCS)mComponents[1];
    }
    
    public void setTransportFormatCombinationSet(TFCS transportFormatCombinationSet)
    {
	mComponents[1] = transportFormatCombinationSet;
    }
    
    
    // Methods for field "fachCarryingMCCH"
    public FachCarryingMCCH getFachCarryingMCCH()
    {
	return (FachCarryingMCCH)mComponents[2];
    }
    
    public void setFachCarryingMCCH(FachCarryingMCCH fachCarryingMCCH)
    {
	mComponents[2] = fachCarryingMCCH;
    }
    
    
    
    /**
     * Define the ASN1 Type FachCarryingMCCH from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class FachCarryingMCCH extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public FachCarryingMCCH()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public FachCarryingMCCH(TransportFormatSet mcch_transportFormatSet, 
			MBMS_MCCH_ConfigurationInfo_r6 mcch_ConfigurationInfo)
	{
	    setMcch_transportFormatSet(mcch_transportFormatSet);
	    setMcch_ConfigurationInfo(mcch_ConfigurationInfo);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new TransportFormatSet();
	    mComponents[1] = new MBMS_MCCH_ConfigurationInfo_r6();
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
		    return new TransportFormatSet();
		case 1:
		    return new MBMS_MCCH_ConfigurationInfo_r6();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "mcch_transportFormatSet"
	public TransportFormatSet getMcch_transportFormatSet()
	{
	    return (TransportFormatSet)mComponents[0];
	}
	
	public void setMcch_transportFormatSet(TransportFormatSet mcch_transportFormatSet)
	{
	    mComponents[0] = mcch_transportFormatSet;
	}
	
	
	// Methods for field "mcch_ConfigurationInfo"
	public MBMS_MCCH_ConfigurationInfo_r6 getMcch_ConfigurationInfo()
	{
	    return (MBMS_MCCH_ConfigurationInfo_r6)mComponents[1];
	}
	
	public void setMcch_ConfigurationInfo(MBMS_MCCH_ConfigurationInfo_r6 mcch_ConfigurationInfo)
	{
	    mComponents[1] = mcch_ConfigurationInfo;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SCCPCH_SystemInformation_MBMS_r6$FachCarryingMCCH"
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
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "TransportFormatSet"
				),
				new QName (
				    "InformationElements",
				    "TransportFormatSet"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"TransportFormatSet"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1)
				    }
				)
			    )
			),
			"mcch-transportFormatSet",
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
				    "MBMS_MCCH_ConfigurationInfo_r6"
				),
				new QName (
				    "InformationElements",
				    "MBMS-MCCH-ConfigurationInfo-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_MCCH_ConfigurationInfo_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_MCCH_ConfigurationInfo_r6"
				    )
				),
				0
			    )
			),
			"mcch-ConfigurationInfo",
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
	 * Get the type descriptor (TypeInfo) of 'this' FachCarryingMCCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' FachCarryingMCCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for FachCarryingMCCH

    // Methods for field "fachCarryingMTCH_List"
    public MBMS_FACHCarryingMTCH_List getFachCarryingMTCH_List()
    {
	return (MBMS_FACHCarryingMTCH_List)mComponents[3];
    }
    
    public void setFachCarryingMTCH_List(MBMS_FACHCarryingMTCH_List fachCarryingMTCH_List)
    {
	mComponents[3] = fachCarryingMTCH_List;
    }
    
    public boolean hasFachCarryingMTCH_List()
    {
	return componentIsPresent(3);
    }
    
    public void deleteFachCarryingMTCH_List()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "fachCarryingMSCH"
    public FachCarryingMSCH getFachCarryingMSCH()
    {
	return (FachCarryingMSCH)mComponents[4];
    }
    
    public void setFachCarryingMSCH(FachCarryingMSCH fachCarryingMSCH)
    {
	mComponents[4] = fachCarryingMSCH;
    }
    
    public boolean hasFachCarryingMSCH()
    {
	return componentIsPresent(4);
    }
    
    public void deleteFachCarryingMSCH()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type FachCarryingMSCH from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class FachCarryingMSCH extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public FachCarryingMSCH()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public FachCarryingMSCH(TransportFormatSet msch_transportFormatSet, 
			MBMS_MSCH_ConfigurationInfo_r6 dummy)
	{
	    setMsch_transportFormatSet(msch_transportFormatSet);
	    setDummy(dummy);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new TransportFormatSet();
	    mComponents[1] = new MBMS_MSCH_ConfigurationInfo_r6();
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
		    return new TransportFormatSet();
		case 1:
		    return new MBMS_MSCH_ConfigurationInfo_r6();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "msch_transportFormatSet"
	public TransportFormatSet getMsch_transportFormatSet()
	{
	    return (TransportFormatSet)mComponents[0];
	}
	
	public void setMsch_transportFormatSet(TransportFormatSet msch_transportFormatSet)
	{
	    mComponents[0] = msch_transportFormatSet;
	}
	
	
	// Methods for field "dummy"
	public MBMS_MSCH_ConfigurationInfo_r6 getDummy()
	{
	    return (MBMS_MSCH_ConfigurationInfo_r6)mComponents[1];
	}
	
	public void setDummy(MBMS_MSCH_ConfigurationInfo_r6 dummy)
	{
	    mComponents[1] = dummy;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SCCPCH_SystemInformation_MBMS_r6$FachCarryingMSCH"
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
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "TransportFormatSet"
				),
				new QName (
				    "InformationElements",
				    "TransportFormatSet"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"TransportFormatSet"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1)
				    }
				)
			    )
			),
			"msch-transportFormatSet",
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
				    "MBMS_MSCH_ConfigurationInfo_r6"
				),
				new QName (
				    "InformationElements",
				    "MBMS-MSCH-ConfigurationInfo-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_MSCH_ConfigurationInfo_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_MSCH_ConfigurationInfo_r6"
				    )
				),
				0
			    )
			),
			"dummy",
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
	 * Get the type descriptor (TypeInfo) of 'this' FachCarryingMSCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' FachCarryingMSCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for FachCarryingMSCH

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
	    "SCCPCH_SystemInformation_MBMS_r6"
	),
	new QName (
	    "InformationElements",
	    "SCCPCH-SystemInformation-MBMS-r6"
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
				"SecondaryCCPCHInfo_MBMS_r6"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryCCPCHInfo-MBMS-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCHInfo_MBMS_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCHInfo_MBMS_r6"
				)
			    ),
			    0
			)
		    ),
		    "secondaryCCPCHInfo-MBMS",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS"
			    ),
			    new QName (
				"InformationElements",
				"TFCS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "transportFormatCombinationSet",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SCCPCH_SystemInformation_MBMS_r6$FachCarryingMCCH"
			)
		    ),
		    "fachCarryingMCCH",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_FACHCarryingMTCH_List"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-FACHCarryingMTCH-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TransportFormatSet"
				)
			    )
			)
		    ),
		    "fachCarryingMTCH-List",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SCCPCH_SystemInformation_MBMS_r6$FachCarryingMSCH"
			)
		    ),
		    "fachCarryingMSCH",
		    4,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SCCPCH_SystemInformation_MBMS_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SCCPCH_SystemInformation_MBMS_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SCCPCH_SystemInformation_MBMS_r6
