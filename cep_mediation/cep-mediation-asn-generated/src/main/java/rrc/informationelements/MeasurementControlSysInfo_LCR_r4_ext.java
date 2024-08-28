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
 * Define the ASN1 Type MeasurementControlSysInfo_LCR_r4_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementControlSysInfo_LCR_r4_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementControlSysInfo_LCR_r4_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementControlSysInfo_LCR_r4_ext(Use_of_HCS use_of_HCS)
    {
	setUse_of_HCS(use_of_HCS);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Use_of_HCS();
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
		return new Use_of_HCS();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "use_of_HCS"
    public Use_of_HCS getUse_of_HCS()
    {
	return (Use_of_HCS)mComponents[0];
    }
    
    public void setUse_of_HCS(Use_of_HCS use_of_HCS)
    {
	mComponents[0] = use_of_HCS;
    }
    
    
    
    /**
     * Define the ASN1 Type Use_of_HCS from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Use_of_HCS extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Use_of_HCS()
	{
	}
	
	public static final  int  hcs_not_used_chosen = 1;
	public static final  int  hcs_used_chosen = 2;
	
	// Methods for field "hcs_not_used"
	public static Use_of_HCS createUse_of_HCSWithHcs_not_used(Hcs_not_used hcs_not_used)
	{
	    Use_of_HCS __object = new Use_of_HCS();

	    __object.setHcs_not_used(hcs_not_used);
	    return __object;
	}
	
	public boolean hasHcs_not_used()
	{
	    return getChosenFlag() == hcs_not_used_chosen;
	}
	
	public void setHcs_not_used(Hcs_not_used hcs_not_used)
	{
	    setChosenValue(hcs_not_used);
	    setChosenFlag(hcs_not_used_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Hcs_not_used from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Hcs_not_used extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Hcs_not_used()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Hcs_not_used(CellSelectQualityMeasure cellSelectQualityMeasure)
	    {
		setCellSelectQualityMeasure(cellSelectQualityMeasure);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CellSelectQualityMeasure();
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
			return new CellSelectQualityMeasure();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cellSelectQualityMeasure"
	    public CellSelectQualityMeasure getCellSelectQualityMeasure()
	    {
		return (CellSelectQualityMeasure)mComponents[0];
	    }
	    
	    public void setCellSelectQualityMeasure(CellSelectQualityMeasure cellSelectQualityMeasure)
	    {
		mComponents[0] = cellSelectQualityMeasure;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type CellSelectQualityMeasure from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class CellSelectQualityMeasure extends Choice {
		
		/**
		 * The default constructor.
		 */
		public CellSelectQualityMeasure()
		{
		}
		
		public static final  int  cpich_RSCP_chosen = 1;
		public static final  int  cpich_Ec_N0_chosen = 2;
		
		// Methods for field "cpich_RSCP"
		public static CellSelectQualityMeasure createCellSelectQualityMeasureWithCpich_RSCP(Cpich_RSCP cpich_RSCP)
		{
		    CellSelectQualityMeasure __object = new CellSelectQualityMeasure();

		    __object.setCpich_RSCP(cpich_RSCP);
		    return __object;
		}
		
		public boolean hasCpich_RSCP()
		{
		    return getChosenFlag() == cpich_RSCP_chosen;
		}
		
		public void setCpich_RSCP(Cpich_RSCP cpich_RSCP)
		{
		    setChosenValue(cpich_RSCP);
		    setChosenFlag(cpich_RSCP_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Cpich_RSCP from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class Cpich_RSCP extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public Cpich_RSCP()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public Cpich_RSCP(IntraFreqMeasurementSysInfo_RSCP_LCR_r4 intraFreqMeasurementSysInfo, 
				    InterFreqMeasurementSysInfo_RSCP_LCR_r4 interFreqMeasurementSysInfo)
		    {
			setIntraFreqMeasurementSysInfo(intraFreqMeasurementSysInfo);
			setInterFreqMeasurementSysInfo(interFreqMeasurementSysInfo);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new IntraFreqMeasurementSysInfo_RSCP_LCR_r4();
			mComponents[1] = new InterFreqMeasurementSysInfo_RSCP_LCR_r4();
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
				return new IntraFreqMeasurementSysInfo_RSCP_LCR_r4();
			    case 1:
				return new InterFreqMeasurementSysInfo_RSCP_LCR_r4();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "intraFreqMeasurementSysInfo"
		    public IntraFreqMeasurementSysInfo_RSCP_LCR_r4 getIntraFreqMeasurementSysInfo()
		    {
			return (IntraFreqMeasurementSysInfo_RSCP_LCR_r4)mComponents[0];
		    }
		    
		    public void setIntraFreqMeasurementSysInfo(IntraFreqMeasurementSysInfo_RSCP_LCR_r4 intraFreqMeasurementSysInfo)
		    {
			mComponents[0] = intraFreqMeasurementSysInfo;
		    }
		    
		    public boolean hasIntraFreqMeasurementSysInfo()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteIntraFreqMeasurementSysInfo()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "interFreqMeasurementSysInfo"
		    public InterFreqMeasurementSysInfo_RSCP_LCR_r4 getInterFreqMeasurementSysInfo()
		    {
			return (InterFreqMeasurementSysInfo_RSCP_LCR_r4)mComponents[1];
		    }
		    
		    public void setInterFreqMeasurementSysInfo(InterFreqMeasurementSysInfo_RSCP_LCR_r4 interFreqMeasurementSysInfo)
		    {
			mComponents[1] = interFreqMeasurementSysInfo;
		    }
		    
		    public boolean hasInterFreqMeasurementSysInfo()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteInterFreqMeasurementSysInfo()
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
			    "MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure$Cpich_RSCP"
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
						"IntraFreqMeasurementSysInfo_RSCP_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"IntraFreqMeasurementSysInfo-RSCP-LCR-r4"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "IntraFreqMeasurementSysInfo_RSCP_LCR_r4"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "IntraFreqMeasurementSysInfo_RSCP_LCR_r4"
						)
					    ),
					    0
					)
				    ),
				    "intraFreqMeasurementSysInfo",
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
						"InterFreqMeasurementSysInfo_RSCP_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"InterFreqMeasurementSysInfo-RSCP-LCR-r4"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "InterFreqMeasurementSysInfo_RSCP_LCR_r4"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "InterFreqMeasurementSysInfo_RSCP_LCR_r4"
						)
					    ),
					    0
					)
				    ),
				    "interFreqMeasurementSysInfo",
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
		     * Get the type descriptor (TypeInfo) of 'this' Cpich_RSCP object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Cpich_RSCP object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Cpich_RSCP

		// Methods for field "cpich_Ec_N0"
		public static CellSelectQualityMeasure createCellSelectQualityMeasureWithCpich_Ec_N0(Cpich_Ec_N0 cpich_Ec_N0)
		{
		    CellSelectQualityMeasure __object = new CellSelectQualityMeasure();

		    __object.setCpich_Ec_N0(cpich_Ec_N0);
		    return __object;
		}
		
		public boolean hasCpich_Ec_N0()
		{
		    return getChosenFlag() == cpich_Ec_N0_chosen;
		}
		
		public void setCpich_Ec_N0(Cpich_Ec_N0 cpich_Ec_N0)
		{
		    setChosenValue(cpich_Ec_N0);
		    setChosenFlag(cpich_Ec_N0_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Cpich_Ec_N0 from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class Cpich_Ec_N0 extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public Cpich_Ec_N0()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public Cpich_Ec_N0(IntraFreqMeasurementSysInfo_ECN0_LCR_r4 intraFreqMeasurementSysInfo, 
				    InterFreqMeasurementSysInfo_ECN0_LCR_r4 interFreqMeasurementSysInfo)
		    {
			setIntraFreqMeasurementSysInfo(intraFreqMeasurementSysInfo);
			setInterFreqMeasurementSysInfo(interFreqMeasurementSysInfo);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new IntraFreqMeasurementSysInfo_ECN0_LCR_r4();
			mComponents[1] = new InterFreqMeasurementSysInfo_ECN0_LCR_r4();
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
				return new IntraFreqMeasurementSysInfo_ECN0_LCR_r4();
			    case 1:
				return new InterFreqMeasurementSysInfo_ECN0_LCR_r4();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "intraFreqMeasurementSysInfo"
		    public IntraFreqMeasurementSysInfo_ECN0_LCR_r4 getIntraFreqMeasurementSysInfo()
		    {
			return (IntraFreqMeasurementSysInfo_ECN0_LCR_r4)mComponents[0];
		    }
		    
		    public void setIntraFreqMeasurementSysInfo(IntraFreqMeasurementSysInfo_ECN0_LCR_r4 intraFreqMeasurementSysInfo)
		    {
			mComponents[0] = intraFreqMeasurementSysInfo;
		    }
		    
		    public boolean hasIntraFreqMeasurementSysInfo()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteIntraFreqMeasurementSysInfo()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "interFreqMeasurementSysInfo"
		    public InterFreqMeasurementSysInfo_ECN0_LCR_r4 getInterFreqMeasurementSysInfo()
		    {
			return (InterFreqMeasurementSysInfo_ECN0_LCR_r4)mComponents[1];
		    }
		    
		    public void setInterFreqMeasurementSysInfo(InterFreqMeasurementSysInfo_ECN0_LCR_r4 interFreqMeasurementSysInfo)
		    {
			mComponents[1] = interFreqMeasurementSysInfo;
		    }
		    
		    public boolean hasInterFreqMeasurementSysInfo()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteInterFreqMeasurementSysInfo()
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
			    "MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure$Cpich_Ec_N0"
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
						"IntraFreqMeasurementSysInfo_ECN0_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"IntraFreqMeasurementSysInfo-ECN0-LCR-r4"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "IntraFreqMeasurementSysInfo_ECN0_LCR_r4"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "IntraFreqMeasurementSysInfo_ECN0_LCR_r4"
						)
					    ),
					    0
					)
				    ),
				    "intraFreqMeasurementSysInfo",
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
						"InterFreqMeasurementSysInfo_ECN0_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"InterFreqMeasurementSysInfo-ECN0-LCR-r4"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "InterFreqMeasurementSysInfo_ECN0_LCR_r4"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "InterFreqMeasurementSysInfo_ECN0_LCR_r4"
						)
					    ),
					    0
					)
				    ),
				    "interFreqMeasurementSysInfo",
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
		     * Get the type descriptor (TypeInfo) of 'this' Cpich_Ec_N0 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Cpich_Ec_N0 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Cpich_Ec_N0

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case cpich_RSCP_chosen:
			    return new Cpich_RSCP();
			case cpich_Ec_N0_chosen:
			    return new Cpich_Ec_N0();
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
			"MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure"
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
					"MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure$Cpich_RSCP"
				    )
				),
				"cpich-RSCP",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure$Cpich_Ec_N0"
				    )
				),
				"cpich-Ec-N0",
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
		 * Get the type descriptor (TypeInfo) of 'this' CellSelectQualityMeasure object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' CellSelectQualityMeasure object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for CellSelectQualityMeasure

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
		    "MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_not_used"
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
				    "MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure"
				)
			    ),
			    "cellSelectQualityMeasure",
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
	     * Get the type descriptor (TypeInfo) of 'this' Hcs_not_used object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Hcs_not_used object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Hcs_not_used

	// Methods for field "hcs_used"
	public static Use_of_HCS createUse_of_HCSWithHcs_used(Hcs_used hcs_used)
	{
	    Use_of_HCS __object = new Use_of_HCS();

	    __object.setHcs_used(hcs_used);
	    return __object;
	}
	
	public boolean hasHcs_used()
	{
	    return getChosenFlag() == hcs_used_chosen;
	}
	
	public void setHcs_used(Hcs_used hcs_used)
	{
	    setChosenValue(hcs_used);
	    setChosenFlag(hcs_used_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Hcs_used from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Hcs_used extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Hcs_used()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Hcs_used(CellSelectQualityMeasure cellSelectQualityMeasure)
	    {
		setCellSelectQualityMeasure(cellSelectQualityMeasure);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CellSelectQualityMeasure();
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
			return new CellSelectQualityMeasure();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cellSelectQualityMeasure"
	    public CellSelectQualityMeasure getCellSelectQualityMeasure()
	    {
		return (CellSelectQualityMeasure)mComponents[0];
	    }
	    
	    public void setCellSelectQualityMeasure(CellSelectQualityMeasure cellSelectQualityMeasure)
	    {
		mComponents[0] = cellSelectQualityMeasure;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type CellSelectQualityMeasure from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class CellSelectQualityMeasure extends Choice {
		
		/**
		 * The default constructor.
		 */
		public CellSelectQualityMeasure()
		{
		}
		
		public static final  int  cpich_RSCP_chosen = 1;
		public static final  int  cpich_Ec_N0_chosen = 2;
		
		// Methods for field "cpich_RSCP"
		public static CellSelectQualityMeasure createCellSelectQualityMeasureWithCpich_RSCP(Cpich_RSCP cpich_RSCP)
		{
		    CellSelectQualityMeasure __object = new CellSelectQualityMeasure();

		    __object.setCpich_RSCP(cpich_RSCP);
		    return __object;
		}
		
		public boolean hasCpich_RSCP()
		{
		    return getChosenFlag() == cpich_RSCP_chosen;
		}
		
		public void setCpich_RSCP(Cpich_RSCP cpich_RSCP)
		{
		    setChosenValue(cpich_RSCP);
		    setChosenFlag(cpich_RSCP_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Cpich_RSCP from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class Cpich_RSCP extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public Cpich_RSCP()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public Cpich_RSCP(IntraFreqMeasurementSysInfo_HCS_RSCP_LCR_r4 intraFreqMeasurementSysInfo, 
				    InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4 interFreqMeasurementSysInfo)
		    {
			setIntraFreqMeasurementSysInfo(intraFreqMeasurementSysInfo);
			setInterFreqMeasurementSysInfo(interFreqMeasurementSysInfo);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new IntraFreqMeasurementSysInfo_HCS_RSCP_LCR_r4();
			mComponents[1] = new InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4();
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
				return new IntraFreqMeasurementSysInfo_HCS_RSCP_LCR_r4();
			    case 1:
				return new InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "intraFreqMeasurementSysInfo"
		    public IntraFreqMeasurementSysInfo_HCS_RSCP_LCR_r4 getIntraFreqMeasurementSysInfo()
		    {
			return (IntraFreqMeasurementSysInfo_HCS_RSCP_LCR_r4)mComponents[0];
		    }
		    
		    public void setIntraFreqMeasurementSysInfo(IntraFreqMeasurementSysInfo_HCS_RSCP_LCR_r4 intraFreqMeasurementSysInfo)
		    {
			mComponents[0] = intraFreqMeasurementSysInfo;
		    }
		    
		    public boolean hasIntraFreqMeasurementSysInfo()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteIntraFreqMeasurementSysInfo()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "interFreqMeasurementSysInfo"
		    public InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4 getInterFreqMeasurementSysInfo()
		    {
			return (InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4)mComponents[1];
		    }
		    
		    public void setInterFreqMeasurementSysInfo(InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4 interFreqMeasurementSysInfo)
		    {
			mComponents[1] = interFreqMeasurementSysInfo;
		    }
		    
		    public boolean hasInterFreqMeasurementSysInfo()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteInterFreqMeasurementSysInfo()
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
			    "MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_used$CellSelectQualityMeasure$Cpich_RSCP"
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
						"IntraFreqMeasurementSysInfo_HCS_RSCP_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"IntraFreqMeasurementSysInfo-HCS-RSCP-LCR-r4"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "IntraFreqMeasurementSysInfo_HCS_RSCP_LCR_r4"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "IntraFreqMeasurementSysInfo_HCS_RSCP_LCR_r4"
						)
					    ),
					    0
					)
				    ),
				    "intraFreqMeasurementSysInfo",
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
						"InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"InterFreqMeasurementSysInfo-HCS-RSCP-LCR-r4"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "InterFreqMeasurementSysInfo_HCS_RSCP_LCR_r4"
						)
					    ),
					    0
					)
				    ),
				    "interFreqMeasurementSysInfo",
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
		     * Get the type descriptor (TypeInfo) of 'this' Cpich_RSCP object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Cpich_RSCP object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Cpich_RSCP

		// Methods for field "cpich_Ec_N0"
		public static CellSelectQualityMeasure createCellSelectQualityMeasureWithCpich_Ec_N0(Cpich_Ec_N0 cpich_Ec_N0)
		{
		    CellSelectQualityMeasure __object = new CellSelectQualityMeasure();

		    __object.setCpich_Ec_N0(cpich_Ec_N0);
		    return __object;
		}
		
		public boolean hasCpich_Ec_N0()
		{
		    return getChosenFlag() == cpich_Ec_N0_chosen;
		}
		
		public void setCpich_Ec_N0(Cpich_Ec_N0 cpich_Ec_N0)
		{
		    setChosenValue(cpich_Ec_N0);
		    setChosenFlag(cpich_Ec_N0_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Cpich_Ec_N0 from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class Cpich_Ec_N0 extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public Cpich_Ec_N0()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public Cpich_Ec_N0(IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4 intraFreqMeasurementSysInfo, 
				    InterFreqMeasurementSysInfo_HCS_ECN0_LCR_r4 interFreqMeasurementSysInfo)
		    {
			setIntraFreqMeasurementSysInfo(intraFreqMeasurementSysInfo);
			setInterFreqMeasurementSysInfo(interFreqMeasurementSysInfo);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4();
			mComponents[1] = new InterFreqMeasurementSysInfo_HCS_ECN0_LCR_r4();
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
				return new IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4();
			    case 1:
				return new InterFreqMeasurementSysInfo_HCS_ECN0_LCR_r4();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "intraFreqMeasurementSysInfo"
		    public IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4 getIntraFreqMeasurementSysInfo()
		    {
			return (IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4)mComponents[0];
		    }
		    
		    public void setIntraFreqMeasurementSysInfo(IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4 intraFreqMeasurementSysInfo)
		    {
			mComponents[0] = intraFreqMeasurementSysInfo;
		    }
		    
		    public boolean hasIntraFreqMeasurementSysInfo()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteIntraFreqMeasurementSysInfo()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "interFreqMeasurementSysInfo"
		    public InterFreqMeasurementSysInfo_HCS_ECN0_LCR_r4 getInterFreqMeasurementSysInfo()
		    {
			return (InterFreqMeasurementSysInfo_HCS_ECN0_LCR_r4)mComponents[1];
		    }
		    
		    public void setInterFreqMeasurementSysInfo(InterFreqMeasurementSysInfo_HCS_ECN0_LCR_r4 interFreqMeasurementSysInfo)
		    {
			mComponents[1] = interFreqMeasurementSysInfo;
		    }
		    
		    public boolean hasInterFreqMeasurementSysInfo()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteInterFreqMeasurementSysInfo()
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
			    "MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_used$CellSelectQualityMeasure$Cpich_Ec_N0"
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
						"IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"IntraFreqMeasurementSysInfo-HCS-ECN0-LCR-r4"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "IntraFreqMeasurementSysInfo_HCS_ECN0_LCR_r4"
						)
					    ),
					    0
					)
				    ),
				    "intraFreqMeasurementSysInfo",
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
						"InterFreqMeasurementSysInfo_HCS_ECN0_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"InterFreqMeasurementSysInfo-HCS-ECN0-LCR-r4"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "InterFreqMeasurementSysInfo_HCS_ECN0_LCR_r4"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "InterFreqMeasurementSysInfo_HCS_ECN0_LCR_r4"
						)
					    ),
					    0
					)
				    ),
				    "interFreqMeasurementSysInfo",
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
		     * Get the type descriptor (TypeInfo) of 'this' Cpich_Ec_N0 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Cpich_Ec_N0 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Cpich_Ec_N0

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case cpich_RSCP_chosen:
			    return new Cpich_RSCP();
			case cpich_Ec_N0_chosen:
			    return new Cpich_Ec_N0();
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
			"MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_used$CellSelectQualityMeasure"
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
					"MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_used$CellSelectQualityMeasure$Cpich_RSCP"
				    )
				),
				"cpich-RSCP",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_used$CellSelectQualityMeasure$Cpich_Ec_N0"
				    )
				),
				"cpich-Ec-N0",
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
		 * Get the type descriptor (TypeInfo) of 'this' CellSelectQualityMeasure object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' CellSelectQualityMeasure object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for CellSelectQualityMeasure

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
		    "MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_used"
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
				    "MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_used$CellSelectQualityMeasure"
				)
			    ),
			    "cellSelectQualityMeasure",
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
	     * Get the type descriptor (TypeInfo) of 'this' Hcs_used object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Hcs_used object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Hcs_used

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case hcs_not_used_chosen:
		    return new Hcs_not_used();
		case hcs_used_chosen:
		    return new Hcs_used();
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
		"MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS"
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
				"MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_not_used"
			    )
			),
			"hcs-not-used",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS$Hcs_used"
			    )
			),
			"hcs-used",
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
	 * Get the type descriptor (TypeInfo) of 'this' Use_of_HCS object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Use_of_HCS object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Use_of_HCS

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
	    "MeasurementControlSysInfo_LCR_r4_ext"
	),
	new QName (
	    "InformationElements",
	    "MeasurementControlSysInfo-LCR-r4-ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MeasurementControlSysInfo_LCR_r4_ext$Use_of_HCS"
			)
		    ),
		    "use-of-HCS",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementControlSysInfo_LCR_r4_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementControlSysInfo_LCR_r4_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementControlSysInfo_LCR_r4_ext
