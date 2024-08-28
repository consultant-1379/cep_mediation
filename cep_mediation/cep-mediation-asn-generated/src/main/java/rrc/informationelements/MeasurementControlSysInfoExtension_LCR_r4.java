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
 * Define the ASN1 Type MeasurementControlSysInfoExtension_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementControlSysInfoExtension_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementControlSysInfoExtension_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementControlSysInfoExtension_LCR_r4(Use_of_HCS use_of_HCS)
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
	    public Hcs_not_used(CellSelectQualityMeasure cellSelectQualityMeasure, 
			    NewInterRATCellList newInterRATCellList)
	    {
		setCellSelectQualityMeasure(cellSelectQualityMeasure);
		setNewInterRATCellList(newInterRATCellList);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Hcs_not_used(CellSelectQualityMeasure cellSelectQualityMeasure)
	    {
		setCellSelectQualityMeasure(cellSelectQualityMeasure);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CellSelectQualityMeasure();
		mComponents[1] = new NewInterRATCellList();
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
			return new CellSelectQualityMeasure();
		    case 1:
			return new NewInterRATCellList();
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
		    public Cpich_RSCP(NewIntraFreqCellSI_List_RSCP_LCR_r4 newIntraFreqCellList, 
				    NewInterFreqCellSI_List_RSCP_LCR_r4 newInterFreqCellList)
		    {
			setNewIntraFreqCellList(newIntraFreqCellList);
			setNewInterFreqCellList(newInterFreqCellList);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new NewIntraFreqCellSI_List_RSCP_LCR_r4();
			mComponents[1] = new NewInterFreqCellSI_List_RSCP_LCR_r4();
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
				return new NewIntraFreqCellSI_List_RSCP_LCR_r4();
			    case 1:
				return new NewInterFreqCellSI_List_RSCP_LCR_r4();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "newIntraFreqCellList"
		    public NewIntraFreqCellSI_List_RSCP_LCR_r4 getNewIntraFreqCellList()
		    {
			return (NewIntraFreqCellSI_List_RSCP_LCR_r4)mComponents[0];
		    }
		    
		    public void setNewIntraFreqCellList(NewIntraFreqCellSI_List_RSCP_LCR_r4 newIntraFreqCellList)
		    {
			mComponents[0] = newIntraFreqCellList;
		    }
		    
		    public boolean hasNewIntraFreqCellList()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteNewIntraFreqCellList()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "newInterFreqCellList"
		    public NewInterFreqCellSI_List_RSCP_LCR_r4 getNewInterFreqCellList()
		    {
			return (NewInterFreqCellSI_List_RSCP_LCR_r4)mComponents[1];
		    }
		    
		    public void setNewInterFreqCellList(NewInterFreqCellSI_List_RSCP_LCR_r4 newInterFreqCellList)
		    {
			mComponents[1] = newInterFreqCellList;
		    }
		    
		    public boolean hasNewInterFreqCellList()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteNewInterFreqCellList()
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
			    "MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure$Cpich_RSCP"
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
						"NewIntraFreqCellSI_List_RSCP_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"NewIntraFreqCellSI-List-RSCP-LCR-r4"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(32),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(32)
					    ),
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "NewIntraFreqCellSI_RSCP_LCR_r4"
						)
					    )
					)
				    ),
				    "newIntraFreqCellList",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new ContainerInfo (
					    new Tags (
						new short[] {
						    (short)0x8001
						}
					    ),
					    new QName (
						"rrc.informationelements",
						"NewInterFreqCellSI_List_RSCP_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"NewInterFreqCellSI-List-RSCP-LCR-r4"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(32),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(32)
					    ),
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "NewInterFreqCellSI_RSCP_LCR_r4"
						)
					    )
					)
				    ),
				    "newInterFreqCellList",
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
		    public Cpich_Ec_N0(NewIntraFreqCellSI_List_ECN0_LCR_r4 newIntraFreqCellList, 
				    NewInterFreqCellSI_List_ECN0_LCR_r4 newInterFreqCellList)
		    {
			setNewIntraFreqCellList(newIntraFreqCellList);
			setNewInterFreqCellList(newInterFreqCellList);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new NewIntraFreqCellSI_List_ECN0_LCR_r4();
			mComponents[1] = new NewInterFreqCellSI_List_ECN0_LCR_r4();
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
				return new NewIntraFreqCellSI_List_ECN0_LCR_r4();
			    case 1:
				return new NewInterFreqCellSI_List_ECN0_LCR_r4();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "newIntraFreqCellList"
		    public NewIntraFreqCellSI_List_ECN0_LCR_r4 getNewIntraFreqCellList()
		    {
			return (NewIntraFreqCellSI_List_ECN0_LCR_r4)mComponents[0];
		    }
		    
		    public void setNewIntraFreqCellList(NewIntraFreqCellSI_List_ECN0_LCR_r4 newIntraFreqCellList)
		    {
			mComponents[0] = newIntraFreqCellList;
		    }
		    
		    public boolean hasNewIntraFreqCellList()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteNewIntraFreqCellList()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "newInterFreqCellList"
		    public NewInterFreqCellSI_List_ECN0_LCR_r4 getNewInterFreqCellList()
		    {
			return (NewInterFreqCellSI_List_ECN0_LCR_r4)mComponents[1];
		    }
		    
		    public void setNewInterFreqCellList(NewInterFreqCellSI_List_ECN0_LCR_r4 newInterFreqCellList)
		    {
			mComponents[1] = newInterFreqCellList;
		    }
		    
		    public boolean hasNewInterFreqCellList()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteNewInterFreqCellList()
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
			    "MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure$Cpich_Ec_N0"
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
						"NewIntraFreqCellSI_List_ECN0_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"NewIntraFreqCellSI-List-ECN0-LCR-r4"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(32),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(32)
					    ),
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "NewIntraFreqCellSI_ECN0_LCR_r4"
						)
					    )
					)
				    ),
				    "newIntraFreqCellList",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new ContainerInfo (
					    new Tags (
						new short[] {
						    (short)0x8001
						}
					    ),
					    new QName (
						"rrc.informationelements",
						"NewInterFreqCellSI_List_ECN0_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"NewInterFreqCellSI-List-ECN0-LCR-r4"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(32),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(32)
					    ),
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "NewInterFreqCellSI_ECN0_LCR_r4"
						)
					    )
					)
				    ),
				    "newInterFreqCellList",
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
			"MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure"
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
					"MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure$Cpich_RSCP"
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
					"MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure$Cpich_Ec_N0"
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

	    // Methods for field "newInterRATCellList"
	    public NewInterRATCellList getNewInterRATCellList()
	    {
		return (NewInterRATCellList)mComponents[1];
	    }
	    
	    public void setNewInterRATCellList(NewInterRATCellList newInterRATCellList)
	    {
		mComponents[1] = newInterRATCellList;
	    }
	    
	    public boolean hasNewInterRATCellList()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteNewInterRATCellList()
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
		    "MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_not_used"
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
				    "MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_not_used$CellSelectQualityMeasure"
				)
			    ),
			    "cellSelectQualityMeasure",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"NewInterRATCellList"
				    ),
				    new QName (
					"InformationElements",
					"NewInterRATCellList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(32),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(32)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "NewInterRATCell"
					)
				    )
				)
			    ),
			    "newInterRATCellList",
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
	    public Hcs_used(CellSelectQualityMeasure cellSelectQualityMeasure, 
			    NewInterRATCellList newInterRATCellList)
	    {
		setCellSelectQualityMeasure(cellSelectQualityMeasure);
		setNewInterRATCellList(newInterRATCellList);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Hcs_used(CellSelectQualityMeasure cellSelectQualityMeasure)
	    {
		setCellSelectQualityMeasure(cellSelectQualityMeasure);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CellSelectQualityMeasure();
		mComponents[1] = new NewInterRATCellList();
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
			return new CellSelectQualityMeasure();
		    case 1:
			return new NewInterRATCellList();
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
		    public Cpich_RSCP(NewIntraFreqCellSI_List_HCS_RSCP_LCR_r4 newIntraFreqCellList, 
				    NewInterFreqCellSI_List_HCS_RSCP_LCR_r4 newInterFreqCellList)
		    {
			setNewIntraFreqCellList(newIntraFreqCellList);
			setNewInterFreqCellList(newInterFreqCellList);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new NewIntraFreqCellSI_List_HCS_RSCP_LCR_r4();
			mComponents[1] = new NewInterFreqCellSI_List_HCS_RSCP_LCR_r4();
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
				return new NewIntraFreqCellSI_List_HCS_RSCP_LCR_r4();
			    case 1:
				return new NewInterFreqCellSI_List_HCS_RSCP_LCR_r4();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "newIntraFreqCellList"
		    public NewIntraFreqCellSI_List_HCS_RSCP_LCR_r4 getNewIntraFreqCellList()
		    {
			return (NewIntraFreqCellSI_List_HCS_RSCP_LCR_r4)mComponents[0];
		    }
		    
		    public void setNewIntraFreqCellList(NewIntraFreqCellSI_List_HCS_RSCP_LCR_r4 newIntraFreqCellList)
		    {
			mComponents[0] = newIntraFreqCellList;
		    }
		    
		    public boolean hasNewIntraFreqCellList()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteNewIntraFreqCellList()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "newInterFreqCellList"
		    public NewInterFreqCellSI_List_HCS_RSCP_LCR_r4 getNewInterFreqCellList()
		    {
			return (NewInterFreqCellSI_List_HCS_RSCP_LCR_r4)mComponents[1];
		    }
		    
		    public void setNewInterFreqCellList(NewInterFreqCellSI_List_HCS_RSCP_LCR_r4 newInterFreqCellList)
		    {
			mComponents[1] = newInterFreqCellList;
		    }
		    
		    public boolean hasNewInterFreqCellList()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteNewInterFreqCellList()
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
			    "MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_used$CellSelectQualityMeasure$Cpich_RSCP"
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
						"NewIntraFreqCellSI_List_HCS_RSCP_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"NewIntraFreqCellSI-List-HCS-RSCP-LCR-r4"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(32),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(32)
					    ),
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "NewIntraFreqCellSI_HCS_RSCP_LCR_r4"
						)
					    )
					)
				    ),
				    "newIntraFreqCellList",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new ContainerInfo (
					    new Tags (
						new short[] {
						    (short)0x8001
						}
					    ),
					    new QName (
						"rrc.informationelements",
						"NewInterFreqCellSI_List_HCS_RSCP_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"NewInterFreqCellSI-List-HCS-RSCP-LCR-r4"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(32),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(32)
					    ),
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "NewInterFreqCellSI_HCS_RSCP_LCR_r4"
						)
					    )
					)
				    ),
				    "newInterFreqCellList",
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
		    public Cpich_Ec_N0(NewIntraFreqCellSI_List_HCS_ECN0_LCR_r4 newIntraFreqCellList, 
				    NewInterFreqCellSI_List_HCS_ECN0_LCR_r4 newInterFreqCellList)
		    {
			setNewIntraFreqCellList(newIntraFreqCellList);
			setNewInterFreqCellList(newInterFreqCellList);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new NewIntraFreqCellSI_List_HCS_ECN0_LCR_r4();
			mComponents[1] = new NewInterFreqCellSI_List_HCS_ECN0_LCR_r4();
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
				return new NewIntraFreqCellSI_List_HCS_ECN0_LCR_r4();
			    case 1:
				return new NewInterFreqCellSI_List_HCS_ECN0_LCR_r4();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "newIntraFreqCellList"
		    public NewIntraFreqCellSI_List_HCS_ECN0_LCR_r4 getNewIntraFreqCellList()
		    {
			return (NewIntraFreqCellSI_List_HCS_ECN0_LCR_r4)mComponents[0];
		    }
		    
		    public void setNewIntraFreqCellList(NewIntraFreqCellSI_List_HCS_ECN0_LCR_r4 newIntraFreqCellList)
		    {
			mComponents[0] = newIntraFreqCellList;
		    }
		    
		    public boolean hasNewIntraFreqCellList()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteNewIntraFreqCellList()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "newInterFreqCellList"
		    public NewInterFreqCellSI_List_HCS_ECN0_LCR_r4 getNewInterFreqCellList()
		    {
			return (NewInterFreqCellSI_List_HCS_ECN0_LCR_r4)mComponents[1];
		    }
		    
		    public void setNewInterFreqCellList(NewInterFreqCellSI_List_HCS_ECN0_LCR_r4 newInterFreqCellList)
		    {
			mComponents[1] = newInterFreqCellList;
		    }
		    
		    public boolean hasNewInterFreqCellList()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteNewInterFreqCellList()
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
			    "MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_used$CellSelectQualityMeasure$Cpich_Ec_N0"
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
						"NewIntraFreqCellSI_List_HCS_ECN0_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"NewIntraFreqCellSI-List-HCS-ECN0-LCR-r4"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(32),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(32)
					    ),
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "NewIntraFreqCellSI_HCS_ECN0_LCR_r4"
						)
					    )
					)
				    ),
				    "newIntraFreqCellList",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new ContainerInfo (
					    new Tags (
						new short[] {
						    (short)0x8001
						}
					    ),
					    new QName (
						"rrc.informationelements",
						"NewInterFreqCellSI_List_HCS_ECN0_LCR_r4"
					    ),
					    new QName (
						"InformationElements",
						"NewInterFreqCellSI-List-HCS-ECN0-LCR-r4"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(32),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(32)
					    ),
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "NewInterFreqCellSI_HCS_ECN0_LCR_r4"
						)
					    )
					)
				    ),
				    "newInterFreqCellList",
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
			"MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_used$CellSelectQualityMeasure"
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
					"MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_used$CellSelectQualityMeasure$Cpich_RSCP"
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
					"MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_used$CellSelectQualityMeasure$Cpich_Ec_N0"
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

	    // Methods for field "newInterRATCellList"
	    public NewInterRATCellList getNewInterRATCellList()
	    {
		return (NewInterRATCellList)mComponents[1];
	    }
	    
	    public void setNewInterRATCellList(NewInterRATCellList newInterRATCellList)
	    {
		mComponents[1] = newInterRATCellList;
	    }
	    
	    public boolean hasNewInterRATCellList()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteNewInterRATCellList()
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
		    "MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_used"
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
				    "MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_used$CellSelectQualityMeasure"
				)
			    ),
			    "cellSelectQualityMeasure",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"NewInterRATCellList"
				    ),
				    new QName (
					"InformationElements",
					"NewInterRATCellList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(32),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(32)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "NewInterRATCell"
					)
				    )
				)
			    ),
			    "newInterRATCellList",
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
		"MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS"
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
				"MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_not_used"
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
				"MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS$Hcs_used"
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
	    "MeasurementControlSysInfoExtension_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "MeasurementControlSysInfoExtension-LCR-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MeasurementControlSysInfoExtension_LCR_r4$Use_of_HCS"
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementControlSysInfoExtension_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementControlSysInfoExtension_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementControlSysInfoExtension_LCR_r4
