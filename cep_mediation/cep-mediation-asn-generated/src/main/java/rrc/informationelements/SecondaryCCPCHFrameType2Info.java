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
 * Define the ASN1 Type SecondaryCCPCHFrameType2Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SecondaryCCPCHFrameType2Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecondaryCCPCHFrameType2Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecondaryCCPCHFrameType2Info(INTEGER subFrameNumber, 
		    DL_ChannelCodes_MBSFN_IMB384 dl_ChannelisationCodes, 
		    Modulation modulation)
    {
	setSubFrameNumber(subFrameNumber);
	setDl_ChannelisationCodes(dl_ChannelisationCodes);
	setModulation(modulation);
    }
    
    /**
     * Construct with components.
     */
    public SecondaryCCPCHFrameType2Info(long subFrameNumber, 
		    DL_ChannelCodes_MBSFN_IMB384 dl_ChannelisationCodes, 
		    Modulation modulation)
    {
	this(new INTEGER(subFrameNumber), dl_ChannelisationCodes, 
	     modulation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new DL_ChannelCodes_MBSFN_IMB384();
	mComponents[2] = new Modulation();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new DL_ChannelCodes_MBSFN_IMB384();
	    case 2:
		return new Modulation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "subFrameNumber"
    public long getSubFrameNumber()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSubFrameNumber(long subFrameNumber)
    {
	setSubFrameNumber(new INTEGER(subFrameNumber));
    }
    
    public void setSubFrameNumber(INTEGER subFrameNumber)
    {
	mComponents[0] = subFrameNumber;
    }
    
    
    // Methods for field "dl_ChannelisationCodes"
    public DL_ChannelCodes_MBSFN_IMB384 getDl_ChannelisationCodes()
    {
	return (DL_ChannelCodes_MBSFN_IMB384)mComponents[1];
    }
    
    public void setDl_ChannelisationCodes(DL_ChannelCodes_MBSFN_IMB384 dl_ChannelisationCodes)
    {
	mComponents[1] = dl_ChannelisationCodes;
    }
    
    
    // Methods for field "modulation"
    public Modulation getModulation()
    {
	return (Modulation)mComponents[2];
    }
    
    public void setModulation(Modulation modulation)
    {
	mComponents[2] = modulation;
    }
    
    
    
    /**
     * Define the ASN1 Type Modulation from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Modulation extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Modulation()
	{
	}
	
	public static final  int  modQPSK_chosen = 1;
	public static final  int  mod16QAM_chosen = 2;
	
	// Methods for field "modQPSK"
	public static Modulation createModulationWithModQPSK(Null modQPSK)
	{
	    Modulation __object = new Modulation();

	    __object.setModQPSK(modQPSK);
	    return __object;
	}
	
	public boolean hasModQPSK()
	{
	    return getChosenFlag() == modQPSK_chosen;
	}
	
	public void setModQPSK(Null modQPSK)
	{
	    setChosenValue(modQPSK);
	    setChosenFlag(modQPSK_chosen);
	}
	
	
	// Methods for field "mod16QAM"
	public static Modulation createModulationWithMod16QAM(Mod16QAM mod16QAM)
	{
	    Modulation __object = new Modulation();

	    __object.setMod16QAM(mod16QAM);
	    return __object;
	}
	
	public boolean hasMod16QAM()
	{
	    return getChosenFlag() == mod16QAM_chosen;
	}
	
	public void setMod16QAM(Mod16QAM mod16QAM)
	{
	    setChosenValue(mod16QAM);
	    setChosenFlag(mod16QAM_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Mod16QAM from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Mod16QAM extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Mod16QAM()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Mod16QAM(INTEGER cpich_SecCCPCH_PowerOffset)
	    {
		setCpich_SecCCPCH_PowerOffset(cpich_SecCCPCH_PowerOffset);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Mod16QAM(long cpich_SecCCPCH_PowerOffset)
	    {
		this(new INTEGER(cpich_SecCCPCH_PowerOffset));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new INTEGER();
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
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cpich_SecCCPCH_PowerOffset"
	    public long getCpich_SecCCPCH_PowerOffset()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setCpich_SecCCPCH_PowerOffset(long cpich_SecCCPCH_PowerOffset)
	    {
		setCpich_SecCCPCH_PowerOffset(new INTEGER(cpich_SecCCPCH_PowerOffset));
	    }
	    
	    public void setCpich_SecCCPCH_PowerOffset(INTEGER cpich_SecCCPCH_PowerOffset)
	    {
		mComponents[0] = cpich_SecCCPCH_PowerOffset;
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
		    "SecondaryCCPCHFrameType2Info$Modulation$Mod16QAM"
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
					    new com.oss.asn1.INTEGER(-11), 
					    new com.oss.asn1.INTEGER(4),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-11),
					new java.lang.Long(4)
				    ),
				    null
				)
			    ),
			    "cpich-SecCCPCH-PowerOffset",
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
	     * Get the type descriptor (TypeInfo) of 'this' Mod16QAM object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Mod16QAM object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Mod16QAM

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case modQPSK_chosen:
		    return new Null();
		case mod16QAM_chosen:
		    return new Mod16QAM();
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SecondaryCCPCHFrameType2Info$Modulation"
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
			"modQPSK",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SecondaryCCPCHFrameType2Info$Modulation$Mod16QAM"
			    )
			),
			"mod16QAM",
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
	 * Get the type descriptor (TypeInfo) of 'this' Modulation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Modulation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Modulation

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
	    "SecondaryCCPCHFrameType2Info"
	),
	new QName (
	    "InformationElements",
	    "SecondaryCCPCHFrameType2Info"
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
				    new com.oss.asn1.INTEGER(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "subFrameNumber",
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
				"DL_ChannelCodes_MBSFN_IMB384"
			    ),
			    new QName (
				"InformationElements",
				"DL-ChannelCodes-MBSFN-IMB384"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_ChannelCodes_MBSFN_IMB384"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_ChannelCodes_MBSFN_IMB384"
				)
			    ),
			    0
			)
		    ),
		    "dl-ChannelisationCodes",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SecondaryCCPCHFrameType2Info$Modulation"
			)
		    ),
		    "modulation",
		    2,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SecondaryCCPCHFrameType2Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecondaryCCPCHFrameType2Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecondaryCCPCHFrameType2Info
