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
 * Define the ASN1 Type SecondaryCCPCH_Info_HCR_VHCR_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SecondaryCCPCH_Info_HCR_VHCR_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecondaryCCPCH_Info_HCR_VHCR_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecondaryCCPCH_Info_HCR_VHCR_r7(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
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
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[0];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[0] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  tdd384_chosen = 1;
	public static final  int  tdd768_chosen = 2;
	
	// Methods for field "tdd384"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd384(Tdd384 tdd384)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd384(tdd384);
	    return __object;
	}
	
	public boolean hasTdd384()
	{
	    return getChosenFlag() == tdd384_chosen;
	}
	
	public void setTdd384(Tdd384 tdd384)
	{
	    setChosenValue(tdd384);
	    setChosenFlag(tdd384_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd384 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd384 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd384()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd384(IndividualTimeslotInfo_r7 individualTimeslotInfo, 
			    SCCPCH_ChannelisationCodeList channelisationCode)
	    {
		setIndividualTimeslotInfo(individualTimeslotInfo);
		setChannelisationCode(channelisationCode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new IndividualTimeslotInfo_r7();
		mComponents[1] = new SCCPCH_ChannelisationCodeList();
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
			return new IndividualTimeslotInfo_r7();
		    case 1:
			return new SCCPCH_ChannelisationCodeList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "individualTimeslotInfo"
	    public IndividualTimeslotInfo_r7 getIndividualTimeslotInfo()
	    {
		return (IndividualTimeslotInfo_r7)mComponents[0];
	    }
	    
	    public void setIndividualTimeslotInfo(IndividualTimeslotInfo_r7 individualTimeslotInfo)
	    {
		mComponents[0] = individualTimeslotInfo;
	    }
	    
	    
	    // Methods for field "channelisationCode"
	    public SCCPCH_ChannelisationCodeList getChannelisationCode()
	    {
		return (SCCPCH_ChannelisationCodeList)mComponents[1];
	    }
	    
	    public void setChannelisationCode(SCCPCH_ChannelisationCodeList channelisationCode)
	    {
		mComponents[1] = channelisationCode;
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
		    "SecondaryCCPCH_Info_HCR_VHCR_r7$ModeSpecificInfo$Tdd384"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"IndividualTimeslotInfo_r7"
				    ),
				    new QName (
					"InformationElements",
					"IndividualTimeslotInfo-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "IndividualTimeslotInfo_r7"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "IndividualTimeslotInfo_r7"
					)
				    ),
				    0
				)
			    ),
			    "individualTimeslotInfo",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"SCCPCH_ChannelisationCodeList"
				    ),
				    new QName (
					"InformationElements",
					"SCCPCH-ChannelisationCodeList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(16),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(16)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "SCCPCH_ChannelisationCode"
					)
				    )
				)
			    ),
			    "channelisationCode",
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd384 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd384 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd384

	// Methods for field "tdd768"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd768(Tdd768 tdd768)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd768(tdd768);
	    return __object;
	}
	
	public boolean hasTdd768()
	{
	    return getChosenFlag() == tdd768_chosen;
	}
	
	public void setTdd768(Tdd768 tdd768)
	{
	    setChosenValue(tdd768);
	    setChosenFlag(tdd768_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd768 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd768 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd768()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd768(IndividualTimeslotInfo_VHCR individualTimeslotInfo, 
			    SCCPCH_ChannelisationCodeList_VHCR channelisationCode)
	    {
		setIndividualTimeslotInfo(individualTimeslotInfo);
		setChannelisationCode(channelisationCode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new IndividualTimeslotInfo_VHCR();
		mComponents[1] = new SCCPCH_ChannelisationCodeList_VHCR();
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
			return new IndividualTimeslotInfo_VHCR();
		    case 1:
			return new SCCPCH_ChannelisationCodeList_VHCR();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "individualTimeslotInfo"
	    public IndividualTimeslotInfo_VHCR getIndividualTimeslotInfo()
	    {
		return (IndividualTimeslotInfo_VHCR)mComponents[0];
	    }
	    
	    public void setIndividualTimeslotInfo(IndividualTimeslotInfo_VHCR individualTimeslotInfo)
	    {
		mComponents[0] = individualTimeslotInfo;
	    }
	    
	    
	    // Methods for field "channelisationCode"
	    public SCCPCH_ChannelisationCodeList_VHCR getChannelisationCode()
	    {
		return (SCCPCH_ChannelisationCodeList_VHCR)mComponents[1];
	    }
	    
	    public void setChannelisationCode(SCCPCH_ChannelisationCodeList_VHCR channelisationCode)
	    {
		mComponents[1] = channelisationCode;
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
		    "SecondaryCCPCH_Info_HCR_VHCR_r7$ModeSpecificInfo$Tdd768"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"IndividualTimeslotInfo_VHCR"
				    ),
				    new QName (
					"InformationElements",
					"IndividualTimeslotInfo-VHCR"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "IndividualTimeslotInfo_VHCR"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "IndividualTimeslotInfo_VHCR"
					)
				    ),
				    0
				)
			    ),
			    "individualTimeslotInfo",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"SCCPCH_ChannelisationCodeList_VHCR"
				    ),
				    new QName (
					"InformationElements",
					"SCCPCH-ChannelisationCodeList-VHCR"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(32),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(32)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "SCCPCH_ChannelisationCode_VHCR"
					)
				    )
				)
			    ),
			    "channelisationCode",
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd768 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd768 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd768

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case tdd384_chosen:
		    return new Tdd384();
		case tdd768_chosen:
		    return new Tdd768();
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
		"SecondaryCCPCH_Info_HCR_VHCR_r7$ModeSpecificInfo"
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
				"SecondaryCCPCH_Info_HCR_VHCR_r7$ModeSpecificInfo$Tdd384"
			    )
			),
			"tdd384",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SecondaryCCPCH_Info_HCR_VHCR_r7$ModeSpecificInfo$Tdd768"
			    )
			),
			"tdd768",
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

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
	    "SecondaryCCPCH_Info_HCR_VHCR_r7"
	),
	new QName (
	    "InformationElements",
	    "SecondaryCCPCH-Info-HCR-VHCR-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SecondaryCCPCH_Info_HCR_VHCR_r7$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' SecondaryCCPCH_Info_HCR_VHCR_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecondaryCCPCH_Info_HCR_VHCR_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecondaryCCPCH_Info_HCR_VHCR_r7
