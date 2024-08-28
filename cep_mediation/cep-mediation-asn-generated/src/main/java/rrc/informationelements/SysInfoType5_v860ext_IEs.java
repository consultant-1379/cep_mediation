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
 * Define the ASN1 Type SysInfoType5_v860ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType5_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType5_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType5_v860ext_IEs(Dummy dummy, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setDummy(dummy);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType5_v860ext_IEs(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Dummy();
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
		return new Dummy();
	    case 1:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dummy"
    public Dummy getDummy()
    {
	return (Dummy)mComponents[0];
    }
    
    public void setDummy(Dummy dummy)
    {
	mComponents[0] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Dummy from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Dummy extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Dummy()
	{
	}
	
	public void initComponents()
	{
	    
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[0];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    return null;
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
		"SysInfoType5_v860ext_IEs$Dummy"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		}
	    ),
	    0,
	    null,
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Dummy object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dummy object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dummy

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
	public static final  int  tdd128_chosen = 2;
	
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
	    public Fdd(HS_DSCH_DrxCellfach_info hs_dsch_DrxCellfach_info)
	    {
		setHs_dsch_DrxCellfach_info(hs_dsch_DrxCellfach_info);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HS_DSCH_DrxCellfach_info();
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
			return new HS_DSCH_DrxCellfach_info();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "hs_dsch_DrxCellfach_info"
	    public HS_DSCH_DrxCellfach_info getHs_dsch_DrxCellfach_info()
	    {
		return (HS_DSCH_DrxCellfach_info)mComponents[0];
	    }
	    
	    public void setHs_dsch_DrxCellfach_info(HS_DSCH_DrxCellfach_info hs_dsch_DrxCellfach_info)
	    {
		mComponents[0] = hs_dsch_DrxCellfach_info;
	    }
	    
	    public boolean hasHs_dsch_DrxCellfach_info()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteHs_dsch_DrxCellfach_info()
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
		    "SysInfoType5_v860ext_IEs$ModeSpecificInfo$Fdd"
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
					"HS_DSCH_DrxCellfach_info"
				    ),
				    new QName (
					"InformationElements",
					"HS-DSCH-DrxCellfach-info"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "HS_DSCH_DrxCellfach_info"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "HS_DSCH_DrxCellfach_info"
					)
				    ),
				    0
				)
			    ),
			    "hs-dsch-DrxCellfach-info",
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

	// Methods for field "tdd128"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd128(Tdd128 tdd128)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Tdd128(Hs_dsch_CommonSysInfo hs_dsch_CommonSysInfo, 
			    HS_DSCH_DrxCellfach_info_TDD128 hs_dsch_DrxCellfach_info)
	    {
		setHs_dsch_CommonSysInfo(hs_dsch_CommonSysInfo);
		setHs_dsch_DrxCellfach_info(hs_dsch_DrxCellfach_info);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Hs_dsch_CommonSysInfo();
		mComponents[1] = new HS_DSCH_DrxCellfach_info_TDD128();
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
			return new Hs_dsch_CommonSysInfo();
		    case 1:
			return new HS_DSCH_DrxCellfach_info_TDD128();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "hs_dsch_CommonSysInfo"
	    public Hs_dsch_CommonSysInfo getHs_dsch_CommonSysInfo()
	    {
		return (Hs_dsch_CommonSysInfo)mComponents[0];
	    }
	    
	    public void setHs_dsch_CommonSysInfo(Hs_dsch_CommonSysInfo hs_dsch_CommonSysInfo)
	    {
		mComponents[0] = hs_dsch_CommonSysInfo;
	    }
	    
	    public boolean hasHs_dsch_CommonSysInfo()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteHs_dsch_CommonSysInfo()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Hs_dsch_CommonSysInfo from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class Hs_dsch_CommonSysInfo extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Hs_dsch_CommonSysInfo()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Hs_dsch_CommonSysInfo(HS_DSCH_CommonSystemInformation_TDD128 hs_dsch_CommonSystemInformation, 
				HS_DSCH_PagingSystemInformation_TDD128 hs_dsch_PagingSystemInformation)
		{
		    setHs_dsch_CommonSystemInformation(hs_dsch_CommonSystemInformation);
		    setHs_dsch_PagingSystemInformation(hs_dsch_PagingSystemInformation);
		}
		
		/**
		 * Construct with required components.
		 */
		public Hs_dsch_CommonSysInfo(HS_DSCH_CommonSystemInformation_TDD128 hs_dsch_CommonSystemInformation)
		{
		    setHs_dsch_CommonSystemInformation(hs_dsch_CommonSystemInformation);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new HS_DSCH_CommonSystemInformation_TDD128();
		    mComponents[1] = new HS_DSCH_PagingSystemInformation_TDD128();
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
			    return new HS_DSCH_CommonSystemInformation_TDD128();
			case 1:
			    return new HS_DSCH_PagingSystemInformation_TDD128();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "hs_dsch_CommonSystemInformation"
		public HS_DSCH_CommonSystemInformation_TDD128 getHs_dsch_CommonSystemInformation()
		{
		    return (HS_DSCH_CommonSystemInformation_TDD128)mComponents[0];
		}
		
		public void setHs_dsch_CommonSystemInformation(HS_DSCH_CommonSystemInformation_TDD128 hs_dsch_CommonSystemInformation)
		{
		    mComponents[0] = hs_dsch_CommonSystemInformation;
		}
		
		
		// Methods for field "hs_dsch_PagingSystemInformation"
		public HS_DSCH_PagingSystemInformation_TDD128 getHs_dsch_PagingSystemInformation()
		{
		    return (HS_DSCH_PagingSystemInformation_TDD128)mComponents[1];
		}
		
		public void setHs_dsch_PagingSystemInformation(HS_DSCH_PagingSystemInformation_TDD128 hs_dsch_PagingSystemInformation)
		{
		    mComponents[1] = hs_dsch_PagingSystemInformation;
		}
		
		public boolean hasHs_dsch_PagingSystemInformation()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteHs_dsch_PagingSystemInformation()
		{
		    setComponentAbsent(1);
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
			"SysInfoType5_v860ext_IEs$ModeSpecificInfo$Tdd128$Hs_dsch_CommonSysInfo"
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
					    "HS_DSCH_CommonSystemInformation_TDD128"
					),
					new QName (
					    "InformationElements",
					    "HS-DSCH-CommonSystemInformation-TDD128"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"HS_DSCH_CommonSystemInformation_TDD128"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"HS_DSCH_CommonSystemInformation_TDD128"
					    )
					),
					0
				    )
				),
				"hs-dsch-CommonSystemInformation",
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
					    "HS_DSCH_PagingSystemInformation_TDD128"
					),
					new QName (
					    "InformationElements",
					    "HS-DSCH-PagingSystemInformation-TDD128"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"HS_DSCH_PagingSystemInformation_TDD128"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"HS_DSCH_PagingSystemInformation_TDD128"
					    )
					),
					0
				    )
				),
				"hs-dsch-PagingSystemInformation",
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
		 * Get the type descriptor (TypeInfo) of 'this' Hs_dsch_CommonSysInfo object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Hs_dsch_CommonSysInfo object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Hs_dsch_CommonSysInfo

	    // Methods for field "hs_dsch_DrxCellfach_info"
	    public HS_DSCH_DrxCellfach_info_TDD128 getHs_dsch_DrxCellfach_info()
	    {
		return (HS_DSCH_DrxCellfach_info_TDD128)mComponents[1];
	    }
	    
	    public void setHs_dsch_DrxCellfach_info(HS_DSCH_DrxCellfach_info_TDD128 hs_dsch_DrxCellfach_info)
	    {
		mComponents[1] = hs_dsch_DrxCellfach_info;
	    }
	    
	    public boolean hasHs_dsch_DrxCellfach_info()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteHs_dsch_DrxCellfach_info()
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
		    "SysInfoType5_v860ext_IEs$ModeSpecificInfo$Tdd128"
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
				    "SysInfoType5_v860ext_IEs$ModeSpecificInfo$Tdd128$Hs_dsch_CommonSysInfo"
				)
			    ),
			    "hs-dsch-CommonSysInfo",
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
					"HS_DSCH_DrxCellfach_info_TDD128"
				    ),
				    new QName (
					"InformationElements",
					"HS-DSCH-DrxCellfach-info-TDD128"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "HS_DSCH_DrxCellfach_info_TDD128"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "HS_DSCH_DrxCellfach_info_TDD128"
					)
				    ),
				    0
				)
			    ),
			    "hs-dsch-DrxCellfach-info",
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
		case fdd_chosen:
		    return new Fdd();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType5_v860ext_IEs$ModeSpecificInfo"
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
				"SysInfoType5_v860ext_IEs$ModeSpecificInfo$Fdd"
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
				"SysInfoType5_v860ext_IEs$ModeSpecificInfo$Tdd128"
			    )
			),
			"tdd128",
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
	    "SysInfoType5_v860ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType5-v860ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5_v860ext_IEs$Dummy"
			)
		    ),
		    "dummy",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5_v860ext_IEs$ModeSpecificInfo"
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType5_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType5_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType5_v860ext_IEs
