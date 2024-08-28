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
 * Define the ASN1 Type DL_AddReconfTransChInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_AddReconfTransChInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_AddReconfTransChInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_AddReconfTransChInformation(DL_TrCH_Type dl_TransportChannelType, 
		    TransportChannelIdentity dl_transportChannelIdentity, 
		    Tfs_SignallingMode tfs_SignallingMode, 
		    QualityTarget dch_QualityTarget, TM_SignallingInfo dummy)
    {
	setDl_TransportChannelType(dl_TransportChannelType);
	setDl_transportChannelIdentity(dl_transportChannelIdentity);
	setTfs_SignallingMode(tfs_SignallingMode);
	setDch_QualityTarget(dch_QualityTarget);
	setDummy(dummy);
    }
    
    /**
     * Construct with required components.
     */
    public DL_AddReconfTransChInformation(DL_TrCH_Type dl_TransportChannelType, 
		    TransportChannelIdentity dl_transportChannelIdentity, 
		    Tfs_SignallingMode tfs_SignallingMode)
    {
	setDl_TransportChannelType(dl_TransportChannelType);
	setDl_transportChannelIdentity(dl_transportChannelIdentity);
	setTfs_SignallingMode(tfs_SignallingMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = DL_TrCH_Type.dch;
	mComponents[1] = new TransportChannelIdentity();
	mComponents[2] = new Tfs_SignallingMode();
	mComponents[3] = new QualityTarget();
	mComponents[4] = new TM_SignallingInfo();
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
		return DL_TrCH_Type.dch;
	    case 1:
		return new TransportChannelIdentity();
	    case 2:
		return new Tfs_SignallingMode();
	    case 3:
		return new QualityTarget();
	    case 4:
		return new TM_SignallingInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_TransportChannelType"
    public DL_TrCH_Type getDl_TransportChannelType()
    {
	return (DL_TrCH_Type)mComponents[0];
    }
    
    public void setDl_TransportChannelType(DL_TrCH_Type dl_TransportChannelType)
    {
	mComponents[0] = dl_TransportChannelType;
    }
    
    
    // Methods for field "dl_transportChannelIdentity"
    public TransportChannelIdentity getDl_transportChannelIdentity()
    {
	return (TransportChannelIdentity)mComponents[1];
    }
    
    public void setDl_transportChannelIdentity(TransportChannelIdentity dl_transportChannelIdentity)
    {
	mComponents[1] = dl_transportChannelIdentity;
    }
    
    
    // Methods for field "tfs_SignallingMode"
    public Tfs_SignallingMode getTfs_SignallingMode()
    {
	return (Tfs_SignallingMode)mComponents[2];
    }
    
    public void setTfs_SignallingMode(Tfs_SignallingMode tfs_SignallingMode)
    {
	mComponents[2] = tfs_SignallingMode;
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
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case explicit_config_chosen:
		    return new TransportFormatSet();
		case sameAsULTrCH_chosen:
		    return new UL_TransportChannelIdentity();
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
		"DL_AddReconfTransChInformation$Tfs_SignallingMode"
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
	return (QualityTarget)mComponents[3];
    }
    
    public void setDch_QualityTarget(QualityTarget dch_QualityTarget)
    {
	mComponents[3] = dch_QualityTarget;
    }
    
    public boolean hasDch_QualityTarget()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDch_QualityTarget()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "dummy"
    public TM_SignallingInfo getDummy()
    {
	return (TM_SignallingInfo)mComponents[4];
    }
    
    public void setDummy(TM_SignallingInfo dummy)
    {
	mComponents[4] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(4);
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
	    "DL_AddReconfTransChInformation"
	),
	new QName (
	    "InformationElements",
	    "DL-AddReconfTransChInformation"
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
				"DL_TrCH_Type"
			    ),
			    new QName (
				"InformationElements",
				"DL-TrCH-Type"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dch",
					0
				    ),
				    new MemberListElement (
					"dsch",
					1
				    )
				}
			    ),
			    0,
			    DL_TrCH_Type.dch
			)
		    ),
		    "dl-TransportChannelType",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransportChannelIdentity(1), 
				    new TransportChannelIdentity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "dl-transportChannelIdentity",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_AddReconfTransChInformation$Tfs_SignallingMode"
			)
		    ),
		    "tfs-SignallingMode",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TM_SignallingInfo"
			    ),
			    new QName (
				"InformationElements",
				"TM-SignallingInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TM_SignallingInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TM_SignallingInfo"
				)
			    ),
			    0
			)
		    ),
		    "dummy",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_AddReconfTransChInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_AddReconfTransChInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_AddReconfTransChInformation
