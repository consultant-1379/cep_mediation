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
 * Define the ASN1 Type DL_AddReconfTransChInformation_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_AddReconfTransChInformation_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_AddReconfTransChInformation_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_AddReconfTransChInformation_r7(DL_TrCH_TypeId1_r5 dl_TransportChannelType, 
		    Tfs_SignallingMode tfs_SignallingMode, 
		    QualityTarget dch_QualityTarget)
    {
	setDl_TransportChannelType(dl_TransportChannelType);
	setTfs_SignallingMode(tfs_SignallingMode);
	setDch_QualityTarget(dch_QualityTarget);
    }
    
    /**
     * Construct with required components.
     */
    public DL_AddReconfTransChInformation_r7(DL_TrCH_TypeId1_r5 dl_TransportChannelType, 
		    Tfs_SignallingMode tfs_SignallingMode)
    {
	setDl_TransportChannelType(dl_TransportChannelType);
	setTfs_SignallingMode(tfs_SignallingMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DL_TrCH_TypeId1_r5();
	mComponents[1] = new Tfs_SignallingMode();
	mComponents[2] = new QualityTarget();
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
		return new DL_TrCH_TypeId1_r5();
	    case 1:
		return new Tfs_SignallingMode();
	    case 2:
		return new QualityTarget();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_TransportChannelType"
    public DL_TrCH_TypeId1_r5 getDl_TransportChannelType()
    {
	return (DL_TrCH_TypeId1_r5)mComponents[0];
    }
    
    public void setDl_TransportChannelType(DL_TrCH_TypeId1_r5 dl_TransportChannelType)
    {
	mComponents[0] = dl_TransportChannelType;
    }
    
    
    // Methods for field "tfs_SignallingMode"
    public Tfs_SignallingMode getTfs_SignallingMode()
    {
	return (Tfs_SignallingMode)mComponents[1];
    }
    
    public void setTfs_SignallingMode(Tfs_SignallingMode tfs_SignallingMode)
    {
	mComponents[1] = tfs_SignallingMode;
    }
    
    
    
    /**
     * Define the ASN1 Type Tfs_SignallingMode from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tfs_SignallingMode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tfs_SignallingMode()
	{
	}
	
	public static final  int  explicit_config_chosen = 1;
	public static final  int  sameAsULTrCH_chosen = 2;
	public static final  int  hsdsch_chosen = 3;
	
	// Methods for field "explicit_config"
	public static Tfs_SignallingMode createTfs_SignallingModeWithExplicit_config(TransportFormatSet explicit_config)
	{
	    Tfs_SignallingMode __object = new Tfs_SignallingMode();

	    __object.setExplicit_config(explicit_config);
	    return __object;
	}
	
	public boolean hasExplicit_config()
	{
	    return getChosenFlag() == explicit_config_chosen;
	}
	
	public void setExplicit_config(TransportFormatSet explicit_config)
	{
	    setChosenValue(explicit_config);
	    setChosenFlag(explicit_config_chosen);
	}
	
	
	// Methods for field "sameAsULTrCH"
	public static Tfs_SignallingMode createTfs_SignallingModeWithSameAsULTrCH(UL_TransportChannelIdentity sameAsULTrCH)
	{
	    Tfs_SignallingMode __object = new Tfs_SignallingMode();

	    __object.setSameAsULTrCH(sameAsULTrCH);
	    return __object;
	}
	
	public boolean hasSameAsULTrCH()
	{
	    return getChosenFlag() == sameAsULTrCH_chosen;
	}
	
	public void setSameAsULTrCH(UL_TransportChannelIdentity sameAsULTrCH)
	{
	    setChosenValue(sameAsULTrCH);
	    setChosenFlag(sameAsULTrCH_chosen);
	}
	
	
	// Methods for field "hsdsch"
	public static Tfs_SignallingMode createTfs_SignallingModeWithHsdsch(HSDSCH_Info_r7 hsdsch)
	{
	    Tfs_SignallingMode __object = new Tfs_SignallingMode();

	    __object.setHsdsch(hsdsch);
	    return __object;
	}
	
	public boolean hasHsdsch()
	{
	    return getChosenFlag() == hsdsch_chosen;
	}
	
	public void setHsdsch(HSDSCH_Info_r7 hsdsch)
	{
	    setChosenValue(hsdsch);
	    setChosenFlag(hsdsch_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case explicit_config_chosen:
		    return new TransportFormatSet();
		case sameAsULTrCH_chosen:
		    return new UL_TransportChannelIdentity();
		case hsdsch_chosen:
		    return new HSDSCH_Info_r7();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_AddReconfTransChInformation_r7$Tfs_SignallingMode"
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
			"explicit-config",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UL_TransportChannelIdentity"
				),
				new QName (
				    "InformationElements",
				    "UL-TransportChannelIdentity"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UL_TransportChannelIdentity"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UL_TransportChannelIdentity"
				    )
				),
				0
			    )
			),
			"sameAsULTrCH",
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
				    "HSDSCH_Info_r7"
				),
				new QName (
				    "InformationElements",
				    "HSDSCH-Info-r7"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"HSDSCH_Info_r7"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"HSDSCH_Info_r7"
				    )
				),
				0
			    )
			),
			"hsdsch",
			2,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tfs_SignallingMode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tfs_SignallingMode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tfs_SignallingMode

    // Methods for field "dch_QualityTarget"
    public QualityTarget getDch_QualityTarget()
    {
	return (QualityTarget)mComponents[2];
    }
    
    public void setDch_QualityTarget(QualityTarget dch_QualityTarget)
    {
	mComponents[2] = dch_QualityTarget;
    }
    
    public boolean hasDch_QualityTarget()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDch_QualityTarget()
    {
	setComponentAbsent(2);
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
	    "DL_AddReconfTransChInformation_r7"
	),
	new QName (
	    "InformationElements",
	    "DL-AddReconfTransChInformation-r7"
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
				"DL_TrCH_TypeId1_r5"
			    ),
			    new QName (
				"InformationElements",
				"DL-TrCH-TypeId1-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_TrCH_TypeId1_r5"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "dl-TransportChannelType",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_AddReconfTransChInformation_r7$Tfs_SignallingMode"
			)
		    ),
		    "tfs-SignallingMode",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"QualityTarget"
			    ),
			    new QName (
				"InformationElements",
				"QualityTarget"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "QualityTarget"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "QualityTarget"
				)
			    ),
			    0
			)
		    ),
		    "dch-QualityTarget",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_AddReconfTransChInformation_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_AddReconfTransChInformation_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_AddReconfTransChInformation_r7
