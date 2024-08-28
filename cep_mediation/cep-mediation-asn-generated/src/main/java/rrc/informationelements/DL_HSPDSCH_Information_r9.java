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
 * Define the ASN1 Type DL_HSPDSCH_Information_r9 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_HSPDSCH_Information_r9 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_HSPDSCH_Information_r9()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_HSPDSCH_Information_r9(HS_SCCH_Info_r9 hs_scch_Info, 
		    Measurement_Feedback_Info_r7 measurement_feedback_Info, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setHs_scch_Info(hs_scch_Info);
	setMeasurement_feedback_Info(measurement_feedback_Info);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public DL_HSPDSCH_Information_r9(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HS_SCCH_Info_r9();
	mComponents[1] = new Measurement_Feedback_Info_r7();
	mComponents[2] = new ModeSpecificInfo();
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
		return new HS_SCCH_Info_r9();
	    case 1:
		return new Measurement_Feedback_Info_r7();
	    case 2:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hs_scch_Info"
    public HS_SCCH_Info_r9 getHs_scch_Info()
    {
	return (HS_SCCH_Info_r9)mComponents[0];
    }
    
    public void setHs_scch_Info(HS_SCCH_Info_r9 hs_scch_Info)
    {
	mComponents[0] = hs_scch_Info;
    }
    
    public boolean hasHs_scch_Info()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHs_scch_Info()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "measurement_feedback_Info"
    public Measurement_Feedback_Info_r7 getMeasurement_feedback_Info()
    {
	return (Measurement_Feedback_Info_r7)mComponents[1];
    }
    
    public void setMeasurement_feedback_Info(Measurement_Feedback_Info_r7 measurement_feedback_Info)
    {
	mComponents[1] = measurement_feedback_Info;
    }
    
    public boolean hasMeasurement_feedback_Info()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMeasurement_feedback_Info()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[2];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[2] = modeSpecificInfo;
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
	
	public static final  int  tdd_chosen = 1;
	public static final  int  fdd_chosen = 2;
	
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
	 * @see Choice
	 */
	public static class Tdd extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    public static final  int  tdd384_chosen = 1;
	    public static final  int  tdd768_chosen = 2;
	    public static final  int  tdd128_chosen = 3;
	    
	    // Methods for field "tdd384"
	    public static Tdd createTddWithTdd384(Tdd384 tdd384)
	    {
		Tdd __object = new Tdd();

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
		public Tdd384(DL_HSPDSCH_TS_Configuration dl_HSPDSCH_TS_Configuration)
		{
		    setDl_HSPDSCH_TS_Configuration(dl_HSPDSCH_TS_Configuration);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new DL_HSPDSCH_TS_Configuration();
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
			    return new DL_HSPDSCH_TS_Configuration();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "dl_HSPDSCH_TS_Configuration"
		public DL_HSPDSCH_TS_Configuration getDl_HSPDSCH_TS_Configuration()
		{
		    return (DL_HSPDSCH_TS_Configuration)mComponents[0];
		}
		
		public void setDl_HSPDSCH_TS_Configuration(DL_HSPDSCH_TS_Configuration dl_HSPDSCH_TS_Configuration)
		{
		    mComponents[0] = dl_HSPDSCH_TS_Configuration;
		}
		
		public boolean hasDl_HSPDSCH_TS_Configuration()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteDl_HSPDSCH_TS_Configuration()
		{
		    setComponentAbsent(0);
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
			"DL_HSPDSCH_Information_r9$ModeSpecificInfo$Tdd$Tdd384"
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
				    new ContainerInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "DL_HSPDSCH_TS_Configuration"
					),
					new QName (
					    "InformationElements",
					    "DL-HSPDSCH-TS-Configuration"
					),
					12314,
					new SizeConstraint (
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new com.oss.asn1.INTEGER(1), 
						    new com.oss.asn1.INTEGER(13),
						    0
						)
					    )
					),
					new Bounds (
					    new java.lang.Long(1),
					    new java.lang.Long(13)
					),
					new TypeInfoRef (
					    new QName (
						"rrc.informationelements",
						"DL_HSPDSCH_TS_Configuration$Sequence_"
					    )
					)
				    )
				),
				"dl-HSPDSCH-TS-Configuration",
				0,
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
	    public static Tdd createTddWithTdd768(Tdd768 tdd768)
	    {
		Tdd __object = new Tdd();

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
		public Tdd768(DL_HSPDSCH_TS_Configuration_VHCR dl_HSPDSCH_TS_Configuration)
		{
		    setDl_HSPDSCH_TS_Configuration(dl_HSPDSCH_TS_Configuration);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new DL_HSPDSCH_TS_Configuration_VHCR();
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
			    return new DL_HSPDSCH_TS_Configuration_VHCR();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "dl_HSPDSCH_TS_Configuration"
		public DL_HSPDSCH_TS_Configuration_VHCR getDl_HSPDSCH_TS_Configuration()
		{
		    return (DL_HSPDSCH_TS_Configuration_VHCR)mComponents[0];
		}
		
		public void setDl_HSPDSCH_TS_Configuration(DL_HSPDSCH_TS_Configuration_VHCR dl_HSPDSCH_TS_Configuration)
		{
		    mComponents[0] = dl_HSPDSCH_TS_Configuration;
		}
		
		public boolean hasDl_HSPDSCH_TS_Configuration()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteDl_HSPDSCH_TS_Configuration()
		{
		    setComponentAbsent(0);
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
			"DL_HSPDSCH_Information_r9$ModeSpecificInfo$Tdd$Tdd768"
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
				    new ContainerInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "DL_HSPDSCH_TS_Configuration_VHCR"
					),
					new QName (
					    "InformationElements",
					    "DL-HSPDSCH-TS-Configuration-VHCR"
					),
					12314,
					new SizeConstraint (
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new com.oss.asn1.INTEGER(1), 
						    new com.oss.asn1.INTEGER(13),
						    0
						)
					    )
					),
					new Bounds (
					    new java.lang.Long(1),
					    new java.lang.Long(13)
					),
					new TypeInfoRef (
					    new QName (
						"rrc.informationelements",
						"DL_HSPDSCH_TS_Configuration_VHCR$Sequence_"
					    )
					)
				    )
				),
				"dl-HSPDSCH-TS-Configuration",
				0,
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

	    // Methods for field "tdd128"
	    public static Tdd createTddWithTdd128(Tdd128 tdd128)
	    {
		Tdd __object = new Tdd();

		__object.setTdd128(tdd128);
		return __object;
	    }
	    
	    public boolean hasTdd128()
	    {
		return getChosenFlag() == tdd128_chosen;
	    }
	    
	    public void setTdd128(Tdd128 tdd128)
	    {
		setChosenValue(tdd128);
		setChosenFlag(tdd128_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Tdd128 from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class Tdd128 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Tdd128()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Tdd128(HS_PDSCH_Midamble_Configuration_TDD128 hs_PDSCH_Midamble_Configuration_tdd128, 
				DL_MultiCarrier_Information dl_MultiCarrier_Information, 
				TS0_Indicator tS0_Indicator, 
				OutofSyncWindow outofSyncWindow)
		{
		    setHs_PDSCH_Midamble_Configuration_tdd128(hs_PDSCH_Midamble_Configuration_tdd128);
		    setDl_MultiCarrier_Information(dl_MultiCarrier_Information);
		    setTS0_Indicator(tS0_Indicator);
		    setOutofSyncWindow(outofSyncWindow);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new HS_PDSCH_Midamble_Configuration_TDD128();
		    mComponents[1] = new DL_MultiCarrier_Information();
		    mComponents[2] = TS0_Indicator._true;
		    mComponents[3] = OutofSyncWindow.ms40;
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
			    return new HS_PDSCH_Midamble_Configuration_TDD128();
			case 1:
			    return new DL_MultiCarrier_Information();
			case 2:
			    return TS0_Indicator._true;
			case 3:
			    return OutofSyncWindow.ms40;
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "hs_PDSCH_Midamble_Configuration_tdd128"
		public HS_PDSCH_Midamble_Configuration_TDD128 getHs_PDSCH_Midamble_Configuration_tdd128()
		{
		    return (HS_PDSCH_Midamble_Configuration_TDD128)mComponents[0];
		}
		
		public void setHs_PDSCH_Midamble_Configuration_tdd128(HS_PDSCH_Midamble_Configuration_TDD128 hs_PDSCH_Midamble_Configuration_tdd128)
		{
		    mComponents[0] = hs_PDSCH_Midamble_Configuration_tdd128;
		}
		
		public boolean hasHs_PDSCH_Midamble_Configuration_tdd128()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteHs_PDSCH_Midamble_Configuration_tdd128()
		{
		    setComponentAbsent(0);
		}
		
		
		// Methods for field "dl_MultiCarrier_Information"
		public DL_MultiCarrier_Information getDl_MultiCarrier_Information()
		{
		    return (DL_MultiCarrier_Information)mComponents[1];
		}
		
		public void setDl_MultiCarrier_Information(DL_MultiCarrier_Information dl_MultiCarrier_Information)
		{
		    mComponents[1] = dl_MultiCarrier_Information;
		}
		
		public boolean hasDl_MultiCarrier_Information()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteDl_MultiCarrier_Information()
		{
		    setComponentAbsent(1);
		}
		
		
		// Methods for field "tS0_Indicator"
		public TS0_Indicator getTS0_Indicator()
		{
		    return (TS0_Indicator)mComponents[2];
		}
		
		public void setTS0_Indicator(TS0_Indicator tS0_Indicator)
		{
		    mComponents[2] = tS0_Indicator;
		}
		
		public boolean hasTS0_Indicator()
		{
		    return componentIsPresent(2);
		}
		
		public void deleteTS0_Indicator()
		{
		    setComponentAbsent(2);
		}
		
		
		
		/**
		 * Define the ASN1 Type TS0_Indicator from ASN1 Module InformationElements.
		 * @see Enumerated
		 */
		public static final class TS0_Indicator extends Enumerated {
		    
		    /**
		     * The default constructor.
		     */
		    private TS0_Indicator()
		    {
			super(cFirstNumber);
		    }
		    
		    protected TS0_Indicator(long value)
		    {
			super(value);
		    }
		    
		    // Named list definitions.
		    public static final TS0_Indicator _true =
			new TS0_Indicator(0);
		    private final static TS0_Indicator cNamedNumbers[] = {
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
		    
		    public static TS0_Indicator valueOf(long value)
		    {
			return (TS0_Indicator)_true.lookupValue(value);
		    }
		    
		    /**
		     * Initialize the type descriptor.
		     */
		    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
			new Tags (
			    new short[] {
				(short)0x8002
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "DL_HSPDSCH_Information_r9$ModeSpecificInfo$Tdd$Tdd128$TS0_Indicator"
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
		     * Get the type descriptor (TypeInfo) of 'this' TS0_Indicator object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' TS0_Indicator object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for TS0_Indicator

		// Methods for field "outofSyncWindow"
		public OutofSyncWindow getOutofSyncWindow()
		{
		    return (OutofSyncWindow)mComponents[3];
		}
		
		public void setOutofSyncWindow(OutofSyncWindow outofSyncWindow)
		{
		    mComponents[3] = outofSyncWindow;
		}
		
		public boolean hasOutofSyncWindow()
		{
		    return componentIsPresent(3);
		}
		
		public void deleteOutofSyncWindow()
		{
		    setComponentAbsent(3);
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
			"DL_HSPDSCH_Information_r9$ModeSpecificInfo$Tdd$Tdd128"
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
					    "HS_PDSCH_Midamble_Configuration_TDD128"
					),
					new QName (
					    "InformationElements",
					    "HS-PDSCH-Midamble-Configuration-TDD128"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"HS_PDSCH_Midamble_Configuration_TDD128"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"HS_PDSCH_Midamble_Configuration_TDD128"
					    )
					),
					0
				    )
				),
				"hs-PDSCH-Midamble-Configuration-tdd128",
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
					    "DL_MultiCarrier_Information"
					),
					new QName (
					    "InformationElements",
					    "DL-MultiCarrier-Information"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"DL_MultiCarrier_Information"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"DL_MultiCarrier_Information"
					    )
					),
					0
				    )
				),
				"dl-MultiCarrier-Information",
				1,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DL_HSPDSCH_Information_r9$ModeSpecificInfo$Tdd$Tdd128$TS0_Indicator"
				    )
				),
				"tS0-Indicator",
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
					    "OutofSyncWindow"
					),
					new QName (
					    "InformationElements",
					    "OutofSyncWindow"
					),
					12314,
					null,
					new MemberList (
					    new MemberListElement[] {
						new MemberListElement (
						    "ms40",
						    0
						),
						new MemberListElement (
						    "ms80",
						    1
						),
						new MemberListElement (
						    "ms160",
						    2
						),
						new MemberListElement (
						    "ms320",
						    3
						),
						new MemberListElement (
						    "ms640",
						    4
						),
						new MemberListElement (
						    "spare3",
						    5
						),
						new MemberListElement (
						    "spare2",
						    6
						),
						new MemberListElement (
						    "spare1",
						    7
						)
					    }
					),
					0,
					OutofSyncWindow.ms40
				    )
				),
				"outofSyncWindow",
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
		 * Get the type descriptor (TypeInfo) of 'this' Tdd128 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Tdd128 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Tdd128

	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case tdd384_chosen:
			return new Tdd384();
		    case tdd768_chosen:
			return new Tdd768();
		    case tdd128_chosen:
			return new Tdd128();
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
		    "DL_HSPDSCH_Information_r9$ModeSpecificInfo$Tdd"
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
				    "DL_HSPDSCH_Information_r9$ModeSpecificInfo$Tdd$Tdd384"
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
				    "DL_HSPDSCH_Information_r9$ModeSpecificInfo$Tdd$Tdd768"
				)
			    ),
			    "tdd768",
			    1,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r9$ModeSpecificInfo$Tdd$Tdd128"
				)
			    ),
			    "tdd128",
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
	    public Fdd(Dl_64QAM_Configured dl_64QAM_Configured, 
			    HS_DSCH_TBSizeTable hs_DSCH_TBSizeTable)
	    {
		setDl_64QAM_Configured(dl_64QAM_Configured);
		setHs_DSCH_TBSizeTable(hs_DSCH_TBSizeTable);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = Dl_64QAM_Configured._true;
		mComponents[1] = HS_DSCH_TBSizeTable.octetAligned;
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
			return Dl_64QAM_Configured._true;
		    case 1:
			return HS_DSCH_TBSizeTable.octetAligned;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dl_64QAM_Configured"
	    public Dl_64QAM_Configured getDl_64QAM_Configured()
	    {
		return (Dl_64QAM_Configured)mComponents[0];
	    }
	    
	    public void setDl_64QAM_Configured(Dl_64QAM_Configured dl_64QAM_Configured)
	    {
		mComponents[0] = dl_64QAM_Configured;
	    }
	    
	    public boolean hasDl_64QAM_Configured()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDl_64QAM_Configured()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Dl_64QAM_Configured from ASN1 Module InformationElements.
	     * @see Enumerated
	     */
	    public static final class Dl_64QAM_Configured extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private Dl_64QAM_Configured()
		{
		    super(cFirstNumber);
		}
		
		protected Dl_64QAM_Configured(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final Dl_64QAM_Configured _true =
		    new Dl_64QAM_Configured(0);
		private final static Dl_64QAM_Configured cNamedNumbers[] = {
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
		
		public static Dl_64QAM_Configured valueOf(long value)
		{
		    return (Dl_64QAM_Configured)_true.lookupValue(value);
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
			"DL_HSPDSCH_Information_r9$ModeSpecificInfo$Fdd$Dl_64QAM_Configured"
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
		 * Get the type descriptor (TypeInfo) of 'this' Dl_64QAM_Configured object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Dl_64QAM_Configured object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Dl_64QAM_Configured

	    // Methods for field "hs_DSCH_TBSizeTable"
	    public HS_DSCH_TBSizeTable getHs_DSCH_TBSizeTable()
	    {
		return (HS_DSCH_TBSizeTable)mComponents[1];
	    }
	    
	    public void setHs_DSCH_TBSizeTable(HS_DSCH_TBSizeTable hs_DSCH_TBSizeTable)
	    {
		mComponents[1] = hs_DSCH_TBSizeTable;
	    }
	    
	    public boolean hasHs_DSCH_TBSizeTable()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteHs_DSCH_TBSizeTable()
	    {
		setComponentAbsent(1);
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
		    "DL_HSPDSCH_Information_r9$ModeSpecificInfo$Fdd"
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
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r9$ModeSpecificInfo$Fdd$Dl_64QAM_Configured"
				)
			    ),
			    "dl-64QAM-Configured",
			    0,
			    3,
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
					"HS_DSCH_TBSizeTable"
				    ),
				    new QName (
					"InformationElements",
					"HS-DSCH-TBSizeTable"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"octetAligned",
						0
					    )
					}
				    ),
				    0,
				    HS_DSCH_TBSizeTable.octetAligned
				)
			    ),
			    "hs-DSCH-TBSizeTable",
			    1,
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

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case tdd_chosen:
		    return new Tdd();
		case fdd_chosen:
		    return new Fdd();
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
		"DL_HSPDSCH_Information_r9$ModeSpecificInfo"
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
				"DL_HSPDSCH_Information_r9$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"DL_HSPDSCH_Information_r9$ModeSpecificInfo$Fdd"
			    )
			),
			"fdd",
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
	    "DL_HSPDSCH_Information_r9"
	),
	new QName (
	    "InformationElements",
	    "DL-HSPDSCH-Information-r9"
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
				"HS_SCCH_Info_r9"
			    ),
			    new QName (
				"InformationElements",
				"HS-SCCH-Info-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_Info_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_Info_r9"
				)
			    ),
			    0
			)
		    ),
		    "hs-scch-Info",
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
				"Measurement_Feedback_Info_r7"
			    ),
			    new QName (
				"InformationElements",
				"Measurement-Feedback-Info-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Measurement_Feedback_Info_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Measurement_Feedback_Info_r7"
				)
			    ),
			    0
			)
		    ),
		    "measurement-feedback-Info",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_HSPDSCH_Information_r9$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_HSPDSCH_Information_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_HSPDSCH_Information_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_HSPDSCH_Information_r9
