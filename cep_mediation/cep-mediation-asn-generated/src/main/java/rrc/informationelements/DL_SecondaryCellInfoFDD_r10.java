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
 * Define the ASN1 Type DL_SecondaryCellInfoFDD_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_SecondaryCellInfoFDD_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_SecondaryCellInfoFDD_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_SecondaryCellInfoFDD_r10(ConfigurationInfo configurationInfo, 
		    SecondaryCellMIMOparametersFDD_r10 secondaryCellMIMOparameters)
    {
	setConfigurationInfo(configurationInfo);
	setSecondaryCellMIMOparameters(secondaryCellMIMOparameters);
    }
    
    /**
     * Construct with required components.
     */
    public DL_SecondaryCellInfoFDD_r10(ConfigurationInfo configurationInfo)
    {
	setConfigurationInfo(configurationInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ConfigurationInfo();
	mComponents[1] = new SecondaryCellMIMOparametersFDD_r10();
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
		return new ConfigurationInfo();
	    case 1:
		return new SecondaryCellMIMOparametersFDD_r10();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "configurationInfo"
    public ConfigurationInfo getConfigurationInfo()
    {
	return (ConfigurationInfo)mComponents[0];
    }
    
    public void setConfigurationInfo(ConfigurationInfo configurationInfo)
    {
	mComponents[0] = configurationInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ConfigurationInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ConfigurationInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ConfigurationInfo()
	{
	}
	
	public static final  int  _continue_chosen = 1;
	public static final  int  newConfiguration_chosen = 2;
	
	// Methods for field "_continue"
	public static ConfigurationInfo createConfigurationInfoWith_continue(Null _continue)
	{
	    ConfigurationInfo __object = new ConfigurationInfo();

	    __object.set_continue(_continue);
	    return __object;
	}
	
	public boolean has_continue()
	{
	    return getChosenFlag() == _continue_chosen;
	}
	
	public void set_continue(Null _continue)
	{
	    setChosenValue(_continue);
	    setChosenFlag(_continue_chosen);
	}
	
	
	// Methods for field "newConfiguration"
	public static ConfigurationInfo createConfigurationInfoWithNewConfiguration(NewConfiguration newConfiguration)
	{
	    ConfigurationInfo __object = new ConfigurationInfo();

	    __object.setNewConfiguration(newConfiguration);
	    return __object;
	}
	
	public boolean hasNewConfiguration()
	{
	    return getChosenFlag() == newConfiguration_chosen;
	}
	
	public void setNewConfiguration(NewConfiguration newConfiguration)
	{
	    setChosenValue(newConfiguration);
	    setChosenFlag(newConfiguration_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type NewConfiguration from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class NewConfiguration extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public NewConfiguration()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public NewConfiguration(H_RNTI new_H_RNTI, 
			    Dl_64QAM_Configured dl_64QAM_Configured, 
			    HS_DSCH_TBSizeTable hs_DSCH_TBSizeTable, 
			    PrimaryCPICH_Info primaryCPICH_Info, 
			    SecondaryScramblingCode dl_ScramblingCode, 
			    HS_SCCHChannelisationCodeInfo hS_SCCHChannelisationCodeInfo, 
			    MeasurementPowerOffset measurementPowerOffset, 
			    UARFCN uarfcn_DL, 
			    DifferentTxModeFromServingHS_DSCHCell differentTxModeFromServingHS_DSCHCell)
	    {
		setNew_H_RNTI(new_H_RNTI);
		setDl_64QAM_Configured(dl_64QAM_Configured);
		setHs_DSCH_TBSizeTable(hs_DSCH_TBSizeTable);
		setPrimaryCPICH_Info(primaryCPICH_Info);
		setDl_ScramblingCode(dl_ScramblingCode);
		setHS_SCCHChannelisationCodeInfo(hS_SCCHChannelisationCodeInfo);
		setMeasurementPowerOffset(measurementPowerOffset);
		setUarfcn_DL(uarfcn_DL);
		setDifferentTxModeFromServingHS_DSCHCell(differentTxModeFromServingHS_DSCHCell);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public NewConfiguration(H_RNTI new_H_RNTI, 
			    PrimaryCPICH_Info primaryCPICH_Info, 
			    HS_SCCHChannelisationCodeInfo hS_SCCHChannelisationCodeInfo, 
			    MeasurementPowerOffset measurementPowerOffset, 
			    UARFCN uarfcn_DL)
	    {
		setNew_H_RNTI(new_H_RNTI);
		setPrimaryCPICH_Info(primaryCPICH_Info);
		setHS_SCCHChannelisationCodeInfo(hS_SCCHChannelisationCodeInfo);
		setMeasurementPowerOffset(measurementPowerOffset);
		setUarfcn_DL(uarfcn_DL);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new H_RNTI();
		mComponents[1] = Dl_64QAM_Configured._true;
		mComponents[2] = HS_DSCH_TBSizeTable.octetAligned;
		mComponents[3] = new PrimaryCPICH_Info();
		mComponents[4] = new SecondaryScramblingCode();
		mComponents[5] = new HS_SCCHChannelisationCodeInfo();
		mComponents[6] = new MeasurementPowerOffset();
		mComponents[7] = new UARFCN();
		mComponents[8] = DifferentTxModeFromServingHS_DSCHCell.different;
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[9];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new H_RNTI();
		    case 1:
			return Dl_64QAM_Configured._true;
		    case 2:
			return HS_DSCH_TBSizeTable.octetAligned;
		    case 3:
			return new PrimaryCPICH_Info();
		    case 4:
			return new SecondaryScramblingCode();
		    case 5:
			return new HS_SCCHChannelisationCodeInfo();
		    case 6:
			return new MeasurementPowerOffset();
		    case 7:
			return new UARFCN();
		    case 8:
			return DifferentTxModeFromServingHS_DSCHCell.different;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "new_H_RNTI"
	    public H_RNTI getNew_H_RNTI()
	    {
		return (H_RNTI)mComponents[0];
	    }
	    
	    public void setNew_H_RNTI(H_RNTI new_H_RNTI)
	    {
		mComponents[0] = new_H_RNTI;
	    }
	    
	    
	    // Methods for field "dl_64QAM_Configured"
	    public Dl_64QAM_Configured getDl_64QAM_Configured()
	    {
		return (Dl_64QAM_Configured)mComponents[1];
	    }
	    
	    public void setDl_64QAM_Configured(Dl_64QAM_Configured dl_64QAM_Configured)
	    {
		mComponents[1] = dl_64QAM_Configured;
	    }
	    
	    public boolean hasDl_64QAM_Configured()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteDl_64QAM_Configured()
	    {
		setComponentAbsent(1);
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"DL_SecondaryCellInfoFDD_r10$ConfigurationInfo$NewConfiguration$Dl_64QAM_Configured"
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
		return (HS_DSCH_TBSizeTable)mComponents[2];
	    }
	    
	    public void setHs_DSCH_TBSizeTable(HS_DSCH_TBSizeTable hs_DSCH_TBSizeTable)
	    {
		mComponents[2] = hs_DSCH_TBSizeTable;
	    }
	    
	    public boolean hasHs_DSCH_TBSizeTable()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteHs_DSCH_TBSizeTable()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "primaryCPICH_Info"
	    public PrimaryCPICH_Info getPrimaryCPICH_Info()
	    {
		return (PrimaryCPICH_Info)mComponents[3];
	    }
	    
	    public void setPrimaryCPICH_Info(PrimaryCPICH_Info primaryCPICH_Info)
	    {
		mComponents[3] = primaryCPICH_Info;
	    }
	    
	    
	    // Methods for field "dl_ScramblingCode"
	    public SecondaryScramblingCode getDl_ScramblingCode()
	    {
		return (SecondaryScramblingCode)mComponents[4];
	    }
	    
	    public void setDl_ScramblingCode(SecondaryScramblingCode dl_ScramblingCode)
	    {
		mComponents[4] = dl_ScramblingCode;
	    }
	    
	    public boolean hasDl_ScramblingCode()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteDl_ScramblingCode()
	    {
		setComponentAbsent(4);
	    }
	    
	    
	    // Methods for field "hS_SCCHChannelisationCodeInfo"
	    public HS_SCCHChannelisationCodeInfo getHS_SCCHChannelisationCodeInfo()
	    {
		return (HS_SCCHChannelisationCodeInfo)mComponents[5];
	    }
	    
	    public void setHS_SCCHChannelisationCodeInfo(HS_SCCHChannelisationCodeInfo hS_SCCHChannelisationCodeInfo)
	    {
		mComponents[5] = hS_SCCHChannelisationCodeInfo;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type HS_SCCHChannelisationCodeInfo from ASN1 Module InformationElements.
	     * @see SequenceOf
	     */
	    public static class HS_SCCHChannelisationCodeInfo extends SequenceOf {
		
		/**
		 * The default constructor.
		 */
		public HS_SCCHChannelisationCodeInfo()
		{
		}
		
		/**
		 * Construct from an array of components.
		 */
		public HS_SCCHChannelisationCodeInfo(HS_SCCH_Codes[] elements)
		{
		    super(elements);
		}
		
		/**
		 * Add an Element to the SEQUENCE OF/SET OF.
		 */
		public synchronized void add(HS_SCCH_Codes element)
		{
		    super.addElement(element);
		}
		
		/**
		 * Set an Element in the SEQUENCE OF/SET OF.
		 */
		public synchronized void set(HS_SCCH_Codes element, int atIndex)
		{
		    super.setElement(element, atIndex);
		}
		
		/**
		 * Get an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized HS_SCCH_Codes get(int atIndex)
		{
		    return (HS_SCCH_Codes)super.getElement(atIndex);
		}
		
		/**
		 * Insert an Element into the SEQUENCE OF/SET OF.
		 */
		public synchronized void insert(HS_SCCH_Codes element, int atIndex)
		{
		    super.insertElement(element, atIndex);
		}
		
		/**
		 * Remove an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized void remove(HS_SCCH_Codes element)
		{
		    super.removeElement(element);
		}
		
		/**
		 * Create an instance of  SEQUENCE OF/SET OF.
		 */
		public AbstractData createInstance()
		{
		    return (AbstractData)new HS_SCCH_Codes();
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final ContainerInfo c_typeinfo = new ContainerInfo (
		    new Tags (
			new short[] {
			    (short)0x8005
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"DL_SecondaryCellInfoFDD_r10$ConfigurationInfo$NewConfiguration$HS_SCCHChannelisationCodeInfo"
		    ),
		    new QName (
			"builtin",
			"SEQUENCE OF"
		    ),
		    12314,
		    new SizeConstraint (
			new ValueRangeConstraint (
			    new AbstractBounds(
				new com.oss.asn1.INTEGER(1), 
				new com.oss.asn1.INTEGER(4),
				0
			    )
			)
		    ),
		    new Bounds (
			new java.lang.Long(1),
			new java.lang.Long(4)
		    ),
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_Codes"
			)
		    )
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' HS_SCCHChannelisationCodeInfo object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' HS_SCCHChannelisationCodeInfo object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for HS_SCCHChannelisationCodeInfo

	    // Methods for field "measurementPowerOffset"
	    public MeasurementPowerOffset getMeasurementPowerOffset()
	    {
		return (MeasurementPowerOffset)mComponents[6];
	    }
	    
	    public void setMeasurementPowerOffset(MeasurementPowerOffset measurementPowerOffset)
	    {
		mComponents[6] = measurementPowerOffset;
	    }
	    
	    
	    // Methods for field "uarfcn_DL"
	    public UARFCN getUarfcn_DL()
	    {
		return (UARFCN)mComponents[7];
	    }
	    
	    public void setUarfcn_DL(UARFCN uarfcn_DL)
	    {
		mComponents[7] = uarfcn_DL;
	    }
	    
	    
	    // Methods for field "differentTxModeFromServingHS_DSCHCell"
	    public DifferentTxModeFromServingHS_DSCHCell getDifferentTxModeFromServingHS_DSCHCell()
	    {
		return (DifferentTxModeFromServingHS_DSCHCell)mComponents[8];
	    }
	    
	    public void setDifferentTxModeFromServingHS_DSCHCell(DifferentTxModeFromServingHS_DSCHCell differentTxModeFromServingHS_DSCHCell)
	    {
		mComponents[8] = differentTxModeFromServingHS_DSCHCell;
	    }
	    
	    public boolean hasDifferentTxModeFromServingHS_DSCHCell()
	    {
		return componentIsPresent(8);
	    }
	    
	    public void deleteDifferentTxModeFromServingHS_DSCHCell()
	    {
		setComponentAbsent(8);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type DifferentTxModeFromServingHS_DSCHCell from ASN1 Module InformationElements.
	     * @see Enumerated
	     */
	    public static final class DifferentTxModeFromServingHS_DSCHCell extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private DifferentTxModeFromServingHS_DSCHCell()
		{
		    super(cFirstNumber);
		}
		
		protected DifferentTxModeFromServingHS_DSCHCell(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final DifferentTxModeFromServingHS_DSCHCell different =
		    new DifferentTxModeFromServingHS_DSCHCell(0);
		private final static DifferentTxModeFromServingHS_DSCHCell cNamedNumbers[] = {
		     different
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
		
		public static DifferentTxModeFromServingHS_DSCHCell valueOf(long value)
		{
		    return (DifferentTxModeFromServingHS_DSCHCell)different.lookupValue(value);
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		    new Tags (
			new short[] {
			    (short)0x8008
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"DL_SecondaryCellInfoFDD_r10$ConfigurationInfo$NewConfiguration$DifferentTxModeFromServingHS_DSCHCell"
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
				"different",
				0
			    )
			}
		    ),
		    0,
		    different
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' DifferentTxModeFromServingHS_DSCHCell object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' DifferentTxModeFromServingHS_DSCHCell object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for DifferentTxModeFromServingHS_DSCHCell

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
		    "DL_SecondaryCellInfoFDD_r10$ConfigurationInfo$NewConfiguration"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"H_RNTI"
				    ),
				    new QName (
					"InformationElements",
					"H-RNTI"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(16)
					)
				    ),
				    new Bounds (
					new java.lang.Long(16),
					new java.lang.Long(16)
				    ),
				    null
				)
			    ),
			    "new-H-RNTI",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD_r10$ConfigurationInfo$NewConfiguration$Dl_64QAM_Configured"
				)
			    ),
			    "dl-64QAM-Configured",
			    1,
			    3,
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
					"PrimaryCPICH_Info"
				    ),
				    new QName (
					"InformationElements",
					"PrimaryCPICH-Info"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCPICH_Info"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PrimaryCPICH_Info"
					)
				    ),
				    0
				)
			    ),
			    "primaryCPICH-Info",
			    3,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"SecondaryScramblingCode"
				    ),
				    new QName (
					"InformationElements",
					"SecondaryScramblingCode"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new SecondaryScramblingCode(1), 
					    new SecondaryScramblingCode(15),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(15)
				    ),
				    null
				)
			    ),
			    "dl-ScramblingCode",
			    4,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD_r10$ConfigurationInfo$NewConfiguration$HS_SCCHChannelisationCodeInfo"
				)
			    ),
			    "hS-SCCHChannelisationCodeInfo",
			    5,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8006
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"MeasurementPowerOffset"
				    ),
				    new QName (
					"InformationElements",
					"MeasurementPowerOffset"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new MeasurementPowerOffset(-12), 
					    new MeasurementPowerOffset(26),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-12),
					new java.lang.Long(26)
				    ),
				    null
				)
			    ),
			    "measurementPowerOffset",
			    6,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8007
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UARFCN"
				    ),
				    new QName (
					"InformationElements",
					"UARFCN"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new UARFCN(0), 
					    new UARFCN(16383),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(16383)
				    ),
				    null
				)
			    ),
			    "uarfcn-DL",
			    7,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD_r10$ConfigurationInfo$NewConfiguration$DifferentTxModeFromServingHS_DSCHCell"
				)
			    ),
			    "differentTxModeFromServingHS-DSCHCell",
			    8,
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
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
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
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8008, 8)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' NewConfiguration object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' NewConfiguration object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for NewConfiguration

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case _continue_chosen:
		    return new Null();
		case newConfiguration_chosen:
		    return new NewConfiguration();
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
		"DL_SecondaryCellInfoFDD_r10$ConfigurationInfo"
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
			"continue",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"DL_SecondaryCellInfoFDD_r10$ConfigurationInfo$NewConfiguration"
			    )
			),
			"newConfiguration",
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
	 * Get the type descriptor (TypeInfo) of 'this' ConfigurationInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ConfigurationInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ConfigurationInfo

    // Methods for field "secondaryCellMIMOparameters"
    public SecondaryCellMIMOparametersFDD_r10 getSecondaryCellMIMOparameters()
    {
	return (SecondaryCellMIMOparametersFDD_r10)mComponents[1];
    }
    
    public void setSecondaryCellMIMOparameters(SecondaryCellMIMOparametersFDD_r10 secondaryCellMIMOparameters)
    {
	mComponents[1] = secondaryCellMIMOparameters;
    }
    
    public boolean hasSecondaryCellMIMOparameters()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSecondaryCellMIMOparameters()
    {
	setComponentAbsent(1);
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
	    "DL_SecondaryCellInfoFDD_r10"
	),
	new QName (
	    "InformationElements",
	    "DL-SecondaryCellInfoFDD-r10"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_SecondaryCellInfoFDD_r10$ConfigurationInfo"
			)
		    ),
		    "configurationInfo",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SecondaryCellMIMOparametersFDD_r10"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryCellMIMOparametersFDD-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCellMIMOparametersFDD_r10"
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
		    "secondaryCellMIMOparameters",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_SecondaryCellInfoFDD_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_SecondaryCellInfoFDD_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_SecondaryCellInfoFDD_r10
