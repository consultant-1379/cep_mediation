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
 * Define the ASN1 Type UL_EDCH_Information_r9 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_EDCH_Information_r9 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_EDCH_Information_r9()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_EDCH_Information_r9(Mac_es_e_resetIndicator mac_es_e_resetIndicator, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setMac_es_e_resetIndicator(mac_es_e_resetIndicator);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public UL_EDCH_Information_r9(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = Mac_es_e_resetIndicator._true;
	mComponents[1] = new ModeSpecificInfo();
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
		return Mac_es_e_resetIndicator._true;
	    case 1:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mac_es_e_resetIndicator"
    public Mac_es_e_resetIndicator getMac_es_e_resetIndicator()
    {
	return (Mac_es_e_resetIndicator)mComponents[0];
    }
    
    public void setMac_es_e_resetIndicator(Mac_es_e_resetIndicator mac_es_e_resetIndicator)
    {
	mComponents[0] = mac_es_e_resetIndicator;
    }
    
    public boolean hasMac_es_e_resetIndicator()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMac_es_e_resetIndicator()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Mac_es_e_resetIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Mac_es_e_resetIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Mac_es_e_resetIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected Mac_es_e_resetIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Mac_es_e_resetIndicator _true =
	    new Mac_es_e_resetIndicator(0);
	private final static Mac_es_e_resetIndicator cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static Mac_es_e_resetIndicator valueOf(long value)
	{
	    return (Mac_es_e_resetIndicator)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UL_EDCH_Information_r9$Mac_es_e_resetIndicator"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
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
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mac_es_e_resetIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mac_es_e_resetIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mac_es_e_resetIndicator

    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[1];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[1] = modeSpecificInfo;
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
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Fdd fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Fdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Fdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Fdd(E_DPCCH_Info_r7 e_DPCCH_Info, 
			    E_DPDCH_Info_r8 e_DPDCH_Info, 
			    E_DPDCH_SchedulingTransmConfiguration schedulingTransmConfiguration, 
			    UL_16QAM_Settings ul_16QAM_Settings)
	    {
		setE_DPCCH_Info(e_DPCCH_Info);
		setE_DPDCH_Info(e_DPDCH_Info);
		setSchedulingTransmConfiguration(schedulingTransmConfiguration);
		setUl_16QAM_Settings(ul_16QAM_Settings);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new E_DPCCH_Info_r7();
		mComponents[1] = new E_DPDCH_Info_r8();
		mComponents[2] = new E_DPDCH_SchedulingTransmConfiguration();
		mComponents[3] = new UL_16QAM_Settings();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[4];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new E_DPCCH_Info_r7();
		    case 1:
			return new E_DPDCH_Info_r8();
		    case 2:
			return new E_DPDCH_SchedulingTransmConfiguration();
		    case 3:
			return new UL_16QAM_Settings();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "e_DPCCH_Info"
	    public E_DPCCH_Info_r7 getE_DPCCH_Info()
	    {
		return (E_DPCCH_Info_r7)mComponents[0];
	    }
	    
	    public void setE_DPCCH_Info(E_DPCCH_Info_r7 e_DPCCH_Info)
	    {
		mComponents[0] = e_DPCCH_Info;
	    }
	    
	    public boolean hasE_DPCCH_Info()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteE_DPCCH_Info()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "e_DPDCH_Info"
	    public E_DPDCH_Info_r8 getE_DPDCH_Info()
	    {
		return (E_DPDCH_Info_r8)mComponents[1];
	    }
	    
	    public void setE_DPDCH_Info(E_DPDCH_Info_r8 e_DPDCH_Info)
	    {
		mComponents[1] = e_DPDCH_Info;
	    }
	    
	    public boolean hasE_DPDCH_Info()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteE_DPDCH_Info()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "schedulingTransmConfiguration"
	    public E_DPDCH_SchedulingTransmConfiguration getSchedulingTransmConfiguration()
	    {
		return (E_DPDCH_SchedulingTransmConfiguration)mComponents[2];
	    }
	    
	    public void setSchedulingTransmConfiguration(E_DPDCH_SchedulingTransmConfiguration schedulingTransmConfiguration)
	    {
		mComponents[2] = schedulingTransmConfiguration;
	    }
	    
	    public boolean hasSchedulingTransmConfiguration()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteSchedulingTransmConfiguration()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "ul_16QAM_Settings"
	    public UL_16QAM_Settings getUl_16QAM_Settings()
	    {
		return (UL_16QAM_Settings)mComponents[3];
	    }
	    
	    public void setUl_16QAM_Settings(UL_16QAM_Settings ul_16QAM_Settings)
	    {
		mComponents[3] = ul_16QAM_Settings;
	    }
	    
	    public boolean hasUl_16QAM_Settings()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteUl_16QAM_Settings()
	    {
		setComponentAbsent(3);
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
		    "UL_EDCH_Information_r9$ModeSpecificInfo$Fdd"
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
					"E_DPCCH_Info_r7"
				    ),
				    new QName (
					"InformationElements",
					"E-DPCCH-Info-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "E_DPCCH_Info_r7"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "E_DPCCH_Info_r7"
					)
				    ),
				    0
				)
			    ),
			    "e-DPCCH-Info",
			    0,
			    3,
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
					"E_DPDCH_Info_r8"
				    ),
				    new QName (
					"InformationElements",
					"E-DPDCH-Info-r8"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "E_DPDCH_Info_r8"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "E_DPDCH_Info_r8"
					)
				    ),
				    0
				)
			    ),
			    "e-DPDCH-Info",
			    1,
			    3,
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
					"E_DPDCH_SchedulingTransmConfiguration"
				    ),
				    new QName (
					"InformationElements",
					"E-DPDCH-SchedulingTransmConfiguration"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "E_DPDCH_SchedulingTransmConfiguration"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "E_DPDCH_SchedulingTransmConfiguration"
					)
				    ),
				    0
				)
			    ),
			    "schedulingTransmConfiguration",
			    2,
			    3,
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
					"UL_16QAM_Settings"
				    ),
				    new QName (
					"InformationElements",
					"UL-16QAM-Settings"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UL_16QAM_Settings"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "UL_16QAM_Settings"
					)
				    ),
				    0
				)
			    ),
			    "ul-16QAM-Settings",
			    3,
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3)
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Fdd

	// Methods for field "tdd"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Tdd tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd(E_RUCCH_Info e_RUCCH_Info, E_PUCH_Info e_PUCH_Info, 
			    Non_ScheduledTransGrantInfoTDD_r9 non_ScheduledTransGrantInfo)
	    {
		setE_RUCCH_Info(e_RUCCH_Info);
		setE_PUCH_Info(e_PUCH_Info);
		setNon_ScheduledTransGrantInfo(non_ScheduledTransGrantInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new E_RUCCH_Info();
		mComponents[1] = new E_PUCH_Info();
		mComponents[2] = new Non_ScheduledTransGrantInfoTDD_r9();
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
			return new E_RUCCH_Info();
		    case 1:
			return new E_PUCH_Info();
		    case 2:
			return new Non_ScheduledTransGrantInfoTDD_r9();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "e_RUCCH_Info"
	    public E_RUCCH_Info getE_RUCCH_Info()
	    {
		return (E_RUCCH_Info)mComponents[0];
	    }
	    
	    public void setE_RUCCH_Info(E_RUCCH_Info e_RUCCH_Info)
	    {
		mComponents[0] = e_RUCCH_Info;
	    }
	    
	    public boolean hasE_RUCCH_Info()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteE_RUCCH_Info()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "e_PUCH_Info"
	    public E_PUCH_Info getE_PUCH_Info()
	    {
		return (E_PUCH_Info)mComponents[1];
	    }
	    
	    public void setE_PUCH_Info(E_PUCH_Info e_PUCH_Info)
	    {
		mComponents[1] = e_PUCH_Info;
	    }
	    
	    public boolean hasE_PUCH_Info()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteE_PUCH_Info()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "non_ScheduledTransGrantInfo"
	    public Non_ScheduledTransGrantInfoTDD_r9 getNon_ScheduledTransGrantInfo()
	    {
		return (Non_ScheduledTransGrantInfoTDD_r9)mComponents[2];
	    }
	    
	    public void setNon_ScheduledTransGrantInfo(Non_ScheduledTransGrantInfoTDD_r9 non_ScheduledTransGrantInfo)
	    {
		mComponents[2] = non_ScheduledTransGrantInfo;
	    }
	    
	    public boolean hasNon_ScheduledTransGrantInfo()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteNon_ScheduledTransGrantInfo()
	    {
		setComponentAbsent(2);
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
		    "UL_EDCH_Information_r9$ModeSpecificInfo$Tdd"
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
					"E_RUCCH_Info"
				    ),
				    new QName (
					"InformationElements",
					"E-RUCCH-Info"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "E_RUCCH_Info"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "E_RUCCH_Info"
					)
				    ),
				    0
				)
			    ),
			    "e-RUCCH-Info",
			    0,
			    3,
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
					"E_PUCH_Info"
				    ),
				    new QName (
					"InformationElements",
					"E-PUCH-Info"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "E_PUCH_Info"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "E_PUCH_Info"
					)
				    ),
				    0
				)
			    ),
			    "e-PUCH-Info",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ChoiceInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"Non_ScheduledTransGrantInfoTDD_r9"
				    ),
				    new QName (
					"InformationElements",
					"Non-ScheduledTransGrantInfoTDD-r9"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "Non_ScheduledTransGrantInfoTDD_r9"
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
			    "non-ScheduledTransGrantInfo",
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2)
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Tdd();
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
		"UL_EDCH_Information_r9$ModeSpecificInfo"
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
				"UL_EDCH_Information_r9$ModeSpecificInfo$Fdd"
			    )
			),
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UL_EDCH_Information_r9$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
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
	    "UL_EDCH_Information_r9"
	),
	new QName (
	    "InformationElements",
	    "UL-EDCH-Information-r9"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_EDCH_Information_r9$Mac_es_e_resetIndicator"
			)
		    ),
		    "mac-es-e-resetIndicator",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_EDCH_Information_r9$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' UL_EDCH_Information_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_EDCH_Information_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_EDCH_Information_r9
