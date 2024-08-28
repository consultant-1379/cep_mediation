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
 * Define the ASN1 Type MBMS_PreferredFrequencyInfo_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_PreferredFrequencyInfo_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_PreferredFrequencyInfo_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_PreferredFrequencyInfo_r6(INTEGER mbmsPreferredFrequency, 
		    LayerConvergenceInformation layerConvergenceInformation, 
		    MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	setMbmsPreferredFrequency(mbmsPreferredFrequency);
	setLayerConvergenceInformation(layerConvergenceInformation);
	setMbms_PL_ServiceRestrictInfo(mbms_PL_ServiceRestrictInfo);
    }
    
    /**
     * Construct with components.
     */
    public MBMS_PreferredFrequencyInfo_r6(long mbmsPreferredFrequency, 
		    LayerConvergenceInformation layerConvergenceInformation, 
		    MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	this(new INTEGER(mbmsPreferredFrequency), 
	     layerConvergenceInformation, mbms_PL_ServiceRestrictInfo);
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_PreferredFrequencyInfo_r6(LayerConvergenceInformation layerConvergenceInformation)
    {
	setLayerConvergenceInformation(layerConvergenceInformation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new LayerConvergenceInformation();
	mComponents[2] = MBMS_PL_ServiceRestrictInfo_r6._true;
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
		return new LayerConvergenceInformation();
	    case 2:
		return MBMS_PL_ServiceRestrictInfo_r6._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbmsPreferredFrequency"
    public long getMbmsPreferredFrequency()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMbmsPreferredFrequency(long mbmsPreferredFrequency)
    {
	setMbmsPreferredFrequency(new INTEGER(mbmsPreferredFrequency));
    }
    
    public void setMbmsPreferredFrequency(INTEGER mbmsPreferredFrequency)
    {
	mComponents[0] = mbmsPreferredFrequency;
    }
    
    public boolean hasMbmsPreferredFrequency()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMbmsPreferredFrequency()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "layerConvergenceInformation"
    public LayerConvergenceInformation getLayerConvergenceInformation()
    {
	return (LayerConvergenceInformation)mComponents[1];
    }
    
    public void setLayerConvergenceInformation(LayerConvergenceInformation layerConvergenceInformation)
    {
	mComponents[1] = layerConvergenceInformation;
    }
    
    
    
    /**
     * Define the ASN1 Type LayerConvergenceInformation from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class LayerConvergenceInformation extends Choice {
	
	/**
	 * The default constructor.
	 */
	public LayerConvergenceInformation()
	{
	}
	
	public static final  int  mbms_Qoffset_chosen = 1;
	public static final  int  mbms_HCSoffset_chosen = 2;
	
	// Methods for field "mbms_Qoffset"
	public static LayerConvergenceInformation createLayerConvergenceInformationWithMbms_Qoffset(MBMS_Qoffset mbms_Qoffset)
	{
	    LayerConvergenceInformation __object = new LayerConvergenceInformation();

	    __object.setMbms_Qoffset(mbms_Qoffset);
	    return __object;
	}
	
	public boolean hasMbms_Qoffset()
	{
	    return getChosenFlag() == mbms_Qoffset_chosen;
	}
	
	public void setMbms_Qoffset(MBMS_Qoffset mbms_Qoffset)
	{
	    setChosenValue(mbms_Qoffset);
	    setChosenFlag(mbms_Qoffset_chosen);
	}
	
	
	// Methods for field "mbms_HCSoffset"
	public static LayerConvergenceInformation createLayerConvergenceInformationWithMbms_HCSoffset(long mbms_HCSoffset)
	{
	    return createLayerConvergenceInformationWithMbms_HCSoffset(new INTEGER(mbms_HCSoffset));
	}
	
	public static LayerConvergenceInformation createLayerConvergenceInformationWithMbms_HCSoffset(INTEGER mbms_HCSoffset)
	{
	    LayerConvergenceInformation __object = new LayerConvergenceInformation();

	    __object.setMbms_HCSoffset(mbms_HCSoffset);
	    return __object;
	}
	
	public boolean hasMbms_HCSoffset()
	{
	    return getChosenFlag() == mbms_HCSoffset_chosen;
	}
	
	public void setMbms_HCSoffset(long mbms_HCSoffset)
	{
	    setMbms_HCSoffset(new INTEGER(mbms_HCSoffset));
	}
	
	public void setMbms_HCSoffset(INTEGER mbms_HCSoffset)
	{
	    setChosenValue(mbms_HCSoffset);
	    setChosenFlag(mbms_HCSoffset_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case mbms_Qoffset_chosen:
		    return MBMS_Qoffset.q4;
		case mbms_HCSoffset_chosen:
		    return new INTEGER();
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
		"MBMS_PreferredFrequencyInfo_r6$LayerConvergenceInformation"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MBMS_Qoffset"
				),
				new QName (
				    "InformationElements",
				    "MBMS-Qoffset"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "q4",
					    0
					),
					new MemberListElement (
					    "q8",
					    1
					),
					new MemberListElement (
					    "q12",
					    2
					),
					new MemberListElement (
					    "q16",
					    3
					),
					new MemberListElement (
					    "q20",
					    4
					),
					new MemberListElement (
					    "q30",
					    5
					),
					new MemberListElement (
					    "q40",
					    6
					),
					new MemberListElement (
					    "qInfinity",
					    7
					)
				    }
				),
				0,
				MBMS_Qoffset.q4
			    )
			),
			"mbms-Qoffset",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
			"mbms-HCSoffset",
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
	 * Get the type descriptor (TypeInfo) of 'this' LayerConvergenceInformation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LayerConvergenceInformation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LayerConvergenceInformation

    // Methods for field "mbms_PL_ServiceRestrictInfo"
    public MBMS_PL_ServiceRestrictInfo_r6 getMbms_PL_ServiceRestrictInfo()
    {
	return (MBMS_PL_ServiceRestrictInfo_r6)mComponents[2];
    }
    
    public void setMbms_PL_ServiceRestrictInfo(MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	mComponents[2] = mbms_PL_ServiceRestrictInfo;
    }
    
    public boolean hasMbms_PL_ServiceRestrictInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMbms_PL_ServiceRestrictInfo()
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
	    "MBMS_PreferredFrequencyInfo_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-PreferredFrequencyInfo-r6"
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "mbmsPreferredFrequency",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_PreferredFrequencyInfo_r6$LayerConvergenceInformation"
			)
		    ),
		    "layerConvergenceInformation",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_PL_ServiceRestrictInfo_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PL-ServiceRestrictInfo-r6"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"true",
					0
				    )
				}
			    ),
			    0,
			    MBMS_PL_ServiceRestrictInfo_r6._true
			)
		    ),
		    "mbms-PL-ServiceRestrictInfo",
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_PreferredFrequencyInfo_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_PreferredFrequencyInfo_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_PreferredFrequencyInfo_r6
