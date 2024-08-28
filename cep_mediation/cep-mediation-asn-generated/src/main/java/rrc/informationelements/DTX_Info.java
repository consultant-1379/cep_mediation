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
 * Define the ASN1 Type DTX_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DTX_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public DTX_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DTX_Info(E_dch_TTI_Length e_dch_TTI_Length, 
		    UE_DTX_Cycle2InactivityThreshold ue_dtx_cycle2InactivityThreshold, 
		    INTEGER ue_dtx_cycle2DefaultSG, 
		    UE_DTX_long_preamble_length ue_dtx_long_preamble_length, 
		    MAC_InactivityThreshold mac_InactivityThreshold, 
		    CQI_DTX_Timer cqi_dtx_Timer, 
		    UE_DPCCH_Burst ue_dpcch_Burst1, 
		    UE_DPCCH_Burst ue_dpcch_Burst2)
    {
	setE_dch_TTI_Length(e_dch_TTI_Length);
	setUe_dtx_cycle2InactivityThreshold(ue_dtx_cycle2InactivityThreshold);
	setUe_dtx_cycle2DefaultSG(ue_dtx_cycle2DefaultSG);
	setUe_dtx_long_preamble_length(ue_dtx_long_preamble_length);
	setMac_InactivityThreshold(mac_InactivityThreshold);
	setCqi_dtx_Timer(cqi_dtx_Timer);
	setUe_dpcch_Burst1(ue_dpcch_Burst1);
	setUe_dpcch_Burst2(ue_dpcch_Burst2);
    }
    
    /**
     * Construct with components.
     */
    public DTX_Info(E_dch_TTI_Length e_dch_TTI_Length, 
		    UE_DTX_Cycle2InactivityThreshold ue_dtx_cycle2InactivityThreshold, 
		    long ue_dtx_cycle2DefaultSG, 
		    UE_DTX_long_preamble_length ue_dtx_long_preamble_length, 
		    MAC_InactivityThreshold mac_InactivityThreshold, 
		    CQI_DTX_Timer cqi_dtx_Timer, 
		    UE_DPCCH_Burst ue_dpcch_Burst1, 
		    UE_DPCCH_Burst ue_dpcch_Burst2)
    {
	this(e_dch_TTI_Length, ue_dtx_cycle2InactivityThreshold, 
	     new INTEGER(ue_dtx_cycle2DefaultSG), 
	     ue_dtx_long_preamble_length, mac_InactivityThreshold, 
	     cqi_dtx_Timer, ue_dpcch_Burst1, ue_dpcch_Burst2);
    }
    
    /**
     * Construct with required components.
     */
    public DTX_Info(E_dch_TTI_Length e_dch_TTI_Length, 
		    UE_DTX_Cycle2InactivityThreshold ue_dtx_cycle2InactivityThreshold, 
		    MAC_InactivityThreshold mac_InactivityThreshold, 
		    CQI_DTX_Timer cqi_dtx_Timer, 
		    UE_DPCCH_Burst ue_dpcch_Burst1, 
		    UE_DPCCH_Burst ue_dpcch_Burst2)
    {
	setE_dch_TTI_Length(e_dch_TTI_Length);
	setUe_dtx_cycle2InactivityThreshold(ue_dtx_cycle2InactivityThreshold);
	setMac_InactivityThreshold(mac_InactivityThreshold);
	setCqi_dtx_Timer(cqi_dtx_Timer);
	setUe_dpcch_Burst1(ue_dpcch_Burst1);
	setUe_dpcch_Burst2(ue_dpcch_Burst2);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_dch_TTI_Length();
	mComponents[1] = UE_DTX_Cycle2InactivityThreshold.e_dch_tti_1;
	mComponents[2] = new INTEGER();
	mComponents[3] = UE_DTX_long_preamble_length.slots_4;
	mComponents[4] = MAC_InactivityThreshold.e_dch_tti_1;
	mComponents[5] = CQI_DTX_Timer.sub_frames_0;
	mComponents[6] = UE_DPCCH_Burst.sub_frames_1;
	mComponents[7] = UE_DPCCH_Burst.sub_frames_1;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new E_dch_TTI_Length();
	    case 1:
		return UE_DTX_Cycle2InactivityThreshold.e_dch_tti_1;
	    case 2:
		return new INTEGER();
	    case 3:
		return UE_DTX_long_preamble_length.slots_4;
	    case 4:
		return MAC_InactivityThreshold.e_dch_tti_1;
	    case 5:
		return CQI_DTX_Timer.sub_frames_0;
	    case 6:
		return UE_DPCCH_Burst.sub_frames_1;
	    case 7:
		return UE_DPCCH_Burst.sub_frames_1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_dch_TTI_Length"
    public E_dch_TTI_Length getE_dch_TTI_Length()
    {
	return (E_dch_TTI_Length)mComponents[0];
    }
    
    public void setE_dch_TTI_Length(E_dch_TTI_Length e_dch_TTI_Length)
    {
	mComponents[0] = e_dch_TTI_Length;
    }
    
    
    
    /**
     * Define the ASN1 Type E_dch_TTI_Length from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class E_dch_TTI_Length extends Choice {
	
	/**
	 * The default constructor.
	 */
	public E_dch_TTI_Length()
	{
	}
	
	public static final  int  dtx_e_dch_TTI_10ms_chosen = 1;
	public static final  int  dtx_e_dch_TTI_2ms_chosen = 2;
	
	// Methods for field "dtx_e_dch_TTI_10ms"
	public static E_dch_TTI_Length createE_dch_TTI_LengthWithDtx_e_dch_TTI_10ms(DTX_E_DCH_TTI_10ms dtx_e_dch_TTI_10ms)
	{
	    E_dch_TTI_Length __object = new E_dch_TTI_Length();

	    __object.setDtx_e_dch_TTI_10ms(dtx_e_dch_TTI_10ms);
	    return __object;
	}
	
	public boolean hasDtx_e_dch_TTI_10ms()
	{
	    return getChosenFlag() == dtx_e_dch_TTI_10ms_chosen;
	}
	
	public void setDtx_e_dch_TTI_10ms(DTX_E_DCH_TTI_10ms dtx_e_dch_TTI_10ms)
	{
	    setChosenValue(dtx_e_dch_TTI_10ms);
	    setChosenFlag(dtx_e_dch_TTI_10ms_chosen);
	}
	
	
	// Methods for field "dtx_e_dch_TTI_2ms"
	public static E_dch_TTI_Length createE_dch_TTI_LengthWithDtx_e_dch_TTI_2ms(DTX_E_DCH_TTI_2ms dtx_e_dch_TTI_2ms)
	{
	    E_dch_TTI_Length __object = new E_dch_TTI_Length();

	    __object.setDtx_e_dch_TTI_2ms(dtx_e_dch_TTI_2ms);
	    return __object;
	}
	
	public boolean hasDtx_e_dch_TTI_2ms()
	{
	    return getChosenFlag() == dtx_e_dch_TTI_2ms_chosen;
	}
	
	public void setDtx_e_dch_TTI_2ms(DTX_E_DCH_TTI_2ms dtx_e_dch_TTI_2ms)
	{
	    setChosenValue(dtx_e_dch_TTI_2ms);
	    setChosenFlag(dtx_e_dch_TTI_2ms_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case dtx_e_dch_TTI_10ms_chosen:
		    return new DTX_E_DCH_TTI_10ms();
		case dtx_e_dch_TTI_2ms_chosen:
		    return new DTX_E_DCH_TTI_2ms();
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
		"DTX_Info$E_dch_TTI_Length"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DTX_E_DCH_TTI_10ms"
				),
				new QName (
				    "InformationElements",
				    "DTX-E-DCH-TTI-10ms"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DTX_E_DCH_TTI_10ms"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DTX_E_DCH_TTI_10ms"
				    )
				),
				0
			    )
			),
			"dtx-e-dch-TTI-10ms",
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
				    "DTX_E_DCH_TTI_2ms"
				),
				new QName (
				    "InformationElements",
				    "DTX-E-DCH-TTI-2ms"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DTX_E_DCH_TTI_2ms"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DTX_E_DCH_TTI_2ms"
				    )
				),
				0
			    )
			),
			"dtx-e-dch-TTI-2ms",
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
	 * Get the type descriptor (TypeInfo) of 'this' E_dch_TTI_Length object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' E_dch_TTI_Length object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for E_dch_TTI_Length

    // Methods for field "ue_dtx_cycle2InactivityThreshold"
    public UE_DTX_Cycle2InactivityThreshold getUe_dtx_cycle2InactivityThreshold()
    {
	return (UE_DTX_Cycle2InactivityThreshold)mComponents[1];
    }
    
    public void setUe_dtx_cycle2InactivityThreshold(UE_DTX_Cycle2InactivityThreshold ue_dtx_cycle2InactivityThreshold)
    {
	mComponents[1] = ue_dtx_cycle2InactivityThreshold;
    }
    
    
    // Methods for field "ue_dtx_cycle2DefaultSG"
    public long getUe_dtx_cycle2DefaultSG()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setUe_dtx_cycle2DefaultSG(long ue_dtx_cycle2DefaultSG)
    {
	setUe_dtx_cycle2DefaultSG(new INTEGER(ue_dtx_cycle2DefaultSG));
    }
    
    public void setUe_dtx_cycle2DefaultSG(INTEGER ue_dtx_cycle2DefaultSG)
    {
	mComponents[2] = ue_dtx_cycle2DefaultSG;
    }
    
    public boolean hasUe_dtx_cycle2DefaultSG()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_dtx_cycle2DefaultSG()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ue_dtx_long_preamble_length"
    public UE_DTX_long_preamble_length getUe_dtx_long_preamble_length()
    {
	return (UE_DTX_long_preamble_length)mComponents[3];
    }
    
    public void setUe_dtx_long_preamble_length(UE_DTX_long_preamble_length ue_dtx_long_preamble_length)
    {
	mComponents[3] = ue_dtx_long_preamble_length;
    }
    
    public boolean hasUe_dtx_long_preamble_length()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_dtx_long_preamble_length()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "mac_InactivityThreshold"
    public MAC_InactivityThreshold getMac_InactivityThreshold()
    {
	return (MAC_InactivityThreshold)mComponents[4];
    }
    
    public void setMac_InactivityThreshold(MAC_InactivityThreshold mac_InactivityThreshold)
    {
	mComponents[4] = mac_InactivityThreshold;
    }
    
    
    // Methods for field "cqi_dtx_Timer"
    public CQI_DTX_Timer getCqi_dtx_Timer()
    {
	return (CQI_DTX_Timer)mComponents[5];
    }
    
    public void setCqi_dtx_Timer(CQI_DTX_Timer cqi_dtx_Timer)
    {
	mComponents[5] = cqi_dtx_Timer;
    }
    
    
    // Methods for field "ue_dpcch_Burst1"
    public UE_DPCCH_Burst getUe_dpcch_Burst1()
    {
	return (UE_DPCCH_Burst)mComponents[6];
    }
    
    public void setUe_dpcch_Burst1(UE_DPCCH_Burst ue_dpcch_Burst1)
    {
	mComponents[6] = ue_dpcch_Burst1;
    }
    
    
    // Methods for field "ue_dpcch_Burst2"
    public UE_DPCCH_Burst getUe_dpcch_Burst2()
    {
	return (UE_DPCCH_Burst)mComponents[7];
    }
    
    public void setUe_dpcch_Burst2(UE_DPCCH_Burst ue_dpcch_Burst2)
    {
	mComponents[7] = ue_dpcch_Burst2;
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
	    "DTX_Info"
	),
	new QName (
	    "InformationElements",
	    "DTX-Info"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DTX_Info$E_dch_TTI_Length"
			)
		    ),
		    "e-dch-TTI-Length",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_DTX_Cycle2InactivityThreshold"
			    ),
			    new QName (
				"InformationElements",
				"UE-DTX-Cycle2InactivityThreshold"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e-dch-tti-1",
					0
				    ),
				    new MemberListElement (
					"e-dch-tti-4",
					1
				    ),
				    new MemberListElement (
					"e-dch-tti-8",
					2
				    ),
				    new MemberListElement (
					"e-dch-tti-16",
					3
				    ),
				    new MemberListElement (
					"e-dch-tti-32",
					4
				    ),
				    new MemberListElement (
					"e-dch-tti-64",
					5
				    ),
				    new MemberListElement (
					"e-dch-tti-128",
					6
				    ),
				    new MemberListElement (
					"e-dch-tti-256",
					7
				    ),
				    new MemberListElement (
					"spare8",
					8
				    ),
				    new MemberListElement (
					"spare7",
					9
				    ),
				    new MemberListElement (
					"spare6",
					10
				    ),
				    new MemberListElement (
					"spare5",
					11
				    ),
				    new MemberListElement (
					"spare4",
					12
				    ),
				    new MemberListElement (
					"spare3",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    UE_DTX_Cycle2InactivityThreshold.e_dch_tti_1
			)
		    ),
		    "ue-dtx-cycle2InactivityThreshold",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
				    new com.oss.asn1.INTEGER(38),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(38)
			    ),
			    null
			)
		    ),
		    "ue-dtx-cycle2DefaultSG",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_DTX_long_preamble_length"
			    ),
			    new QName (
				"InformationElements",
				"UE-DTX-long-preamble-length"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"slots-4",
					0
				    ),
				    new MemberListElement (
					"slots-15",
					1
				    )
				}
			    ),
			    0,
			    UE_DTX_long_preamble_length.slots_4
			)
		    ),
		    "ue-dtx-long-preamble-length",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MAC_InactivityThreshold"
			    ),
			    new QName (
				"InformationElements",
				"MAC-InactivityThreshold"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e-dch-tti-1",
					0
				    ),
				    new MemberListElement (
					"e-dch-tti-2",
					1
				    ),
				    new MemberListElement (
					"e-dch-tti-4",
					2
				    ),
				    new MemberListElement (
					"e-dch-tti-8",
					3
				    ),
				    new MemberListElement (
					"e-dch-tti-16",
					4
				    ),
				    new MemberListElement (
					"e-dch-tti-32",
					5
				    ),
				    new MemberListElement (
					"e-dch-tti-64",
					6
				    ),
				    new MemberListElement (
					"e-dch-tti-128",
					7
				    ),
				    new MemberListElement (
					"e-dch-tti-256",
					8
				    ),
				    new MemberListElement (
					"e-dch-tti-512",
					9
				    ),
				    new MemberListElement (
					"e-dch-tti-Infinity",
					10
				    ),
				    new MemberListElement (
					"spare5",
					11
				    ),
				    new MemberListElement (
					"spare4",
					12
				    ),
				    new MemberListElement (
					"spare3",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    MAC_InactivityThreshold.e_dch_tti_1
			)
		    ),
		    "mac-InactivityThreshold",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CQI_DTX_Timer"
			    ),
			    new QName (
				"InformationElements",
				"CQI-DTX-Timer"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-0",
					0
				    ),
				    new MemberListElement (
					"sub-frames-1",
					1
				    ),
				    new MemberListElement (
					"sub-frames-2",
					2
				    ),
				    new MemberListElement (
					"sub-frames-4",
					3
				    ),
				    new MemberListElement (
					"sub-frames-8",
					4
				    ),
				    new MemberListElement (
					"sub-frames-16",
					5
				    ),
				    new MemberListElement (
					"sub-frames-32",
					6
				    ),
				    new MemberListElement (
					"sub-frames-64",
					7
				    ),
				    new MemberListElement (
					"sub-frames-128",
					8
				    ),
				    new MemberListElement (
					"sub-frames-256",
					9
				    ),
				    new MemberListElement (
					"sub-frames-512",
					10
				    ),
				    new MemberListElement (
					"sub-frames-Infinity",
					11
				    ),
				    new MemberListElement (
					"spare4",
					12
				    ),
				    new MemberListElement (
					"spare3",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    CQI_DTX_Timer.sub_frames_0
			)
		    ),
		    "cqi-dtx-Timer",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_DPCCH_Burst"
			    ),
			    new QName (
				"InformationElements",
				"UE-DPCCH-Burst"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-1",
					0
				    ),
				    new MemberListElement (
					"sub-frames-2",
					1
				    ),
				    new MemberListElement (
					"sub-frames-5",
					2
				    ),
				    new MemberListElement (
					"spare1",
					3
				    )
				}
			    ),
			    0,
			    UE_DPCCH_Burst.sub_frames_1
			)
		    ),
		    "ue-dpcch-Burst1",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_DPCCH_Burst"
			    ),
			    new QName (
				"InformationElements",
				"UE-DPCCH-Burst"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-1",
					0
				    ),
				    new MemberListElement (
					"sub-frames-2",
					1
				    ),
				    new MemberListElement (
					"sub-frames-5",
					2
				    ),
				    new MemberListElement (
					"spare1",
					3
				    )
				}
			    ),
			    0,
			    UE_DPCCH_Burst.sub_frames_1
			)
		    ),
		    "ue-dpcch-Burst2",
		    7,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DTX_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DTX_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DTX_Info
