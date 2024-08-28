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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type HandoverToUTRANCommand_r3_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class HandoverToUTRANCommand_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public HandoverToUTRANCommand_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HandoverToUTRANCommand_r3_IEs(rrc.informationelements.U_RNTI_Short new_U_RNTI, 
		    rrc.informationelements.ActivationTime dummy, 
		    rrc.informationelements.CipheringAlgorithm cipheringAlgorithm, 
		    SpecificationMode specificationMode, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	setNew_U_RNTI(new_U_RNTI);
	setDummy(dummy);
	setCipheringAlgorithm(cipheringAlgorithm);
	setSpecificationMode(specificationMode);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
    }
    
    /**
     * Construct with required components.
     */
    public HandoverToUTRANCommand_r3_IEs(rrc.informationelements.U_RNTI_Short new_U_RNTI, 
		    SpecificationMode specificationMode, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	setNew_U_RNTI(new_U_RNTI);
	setSpecificationMode(specificationMode);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.U_RNTI_Short();
	mComponents[1] = new rrc.informationelements.ActivationTime();
	mComponents[2] = rrc.informationelements.CipheringAlgorithm.uea0;
	mComponents[3] = new SpecificationMode();
	mComponents[4] = new rrc.informationelements.MaxAllowedUL_TX_Power();
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
		return new rrc.informationelements.U_RNTI_Short();
	    case 1:
		return new rrc.informationelements.ActivationTime();
	    case 2:
		return rrc.informationelements.CipheringAlgorithm.uea0;
	    case 3:
		return new SpecificationMode();
	    case 4:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "new_U_RNTI"
    public rrc.informationelements.U_RNTI_Short getNew_U_RNTI()
    {
	return (rrc.informationelements.U_RNTI_Short)mComponents[0];
    }
    
    public void setNew_U_RNTI(rrc.informationelements.U_RNTI_Short new_U_RNTI)
    {
	mComponents[0] = new_U_RNTI;
    }
    
    
    // Methods for field "dummy"
    public rrc.informationelements.ActivationTime getDummy()
    {
	return (rrc.informationelements.ActivationTime)mComponents[1];
    }
    
    public void setDummy(rrc.informationelements.ActivationTime dummy)
    {
	mComponents[1] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cipheringAlgorithm"
    public rrc.informationelements.CipheringAlgorithm getCipheringAlgorithm()
    {
	return (rrc.informationelements.CipheringAlgorithm)mComponents[2];
    }
    
    public void setCipheringAlgorithm(rrc.informationelements.CipheringAlgorithm cipheringAlgorithm)
    {
	mComponents[2] = cipheringAlgorithm;
    }
    
    public boolean hasCipheringAlgorithm()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCipheringAlgorithm()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "specificationMode"
    public SpecificationMode getSpecificationMode()
    {
	return (SpecificationMode)mComponents[3];
    }
    
    public void setSpecificationMode(SpecificationMode specificationMode)
    {
	mComponents[3] = specificationMode;
    }
    
    
    
    /**
     * Define the ASN1 Type SpecificationMode from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class SpecificationMode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public SpecificationMode()
	{
	}
	
	public static final  int  complete_chosen = 1;
	public static final  int  preconfiguration_chosen = 2;
	
	// Methods for field "complete"
	public static SpecificationMode createSpecificationModeWithComplete(Complete complete)
	{
	    SpecificationMode __object = new SpecificationMode();

	    __object.setComplete(complete);
	    return __object;
	}
	
	public boolean hasComplete()
	{
	    return getChosenFlag() == complete_chosen;
	}
	
	public void setComplete(Complete complete)
	{
	    setChosenValue(complete);
	    setChosenFlag(complete_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Complete from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Complete extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Complete()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Complete(rrc.informationelements.SRB_InformationSetupList srb_InformationSetupList, 
			    rrc.informationelements.RAB_InformationSetupList rab_InformationSetupList, 
			    rrc.informationelements.UL_CommonTransChInfo ul_CommonTransChInfo, 
			    rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList, 
			    rrc.informationelements.DL_CommonTransChInfo dl_CommonTransChInfo, 
			    rrc.informationelements.DL_AddReconfTransChInfoList dl_AddReconfTransChInfoList, 
			    rrc.informationelements.UL_DPCH_Info ul_DPCH_Info, 
			    ModeSpecificInfo modeSpecificInfo, 
			    rrc.informationelements.DL_CommonInformation dl_CommonInformation, 
			    rrc.informationelements.DL_InformationPerRL_List dl_InformationPerRL_List, 
			    rrc.informationelements.FrequencyInfo frequencyInfo)
	    {
		setSrb_InformationSetupList(srb_InformationSetupList);
		setRab_InformationSetupList(rab_InformationSetupList);
		setUl_CommonTransChInfo(ul_CommonTransChInfo);
		setUl_AddReconfTransChInfoList(ul_AddReconfTransChInfoList);
		setDl_CommonTransChInfo(dl_CommonTransChInfo);
		setDl_AddReconfTransChInfoList(dl_AddReconfTransChInfoList);
		setUl_DPCH_Info(ul_DPCH_Info);
		setModeSpecificInfo(modeSpecificInfo);
		setDl_CommonInformation(dl_CommonInformation);
		setDl_InformationPerRL_List(dl_InformationPerRL_List);
		setFrequencyInfo(frequencyInfo);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Complete(rrc.informationelements.SRB_InformationSetupList srb_InformationSetupList, 
			    rrc.informationelements.UL_CommonTransChInfo ul_CommonTransChInfo, 
			    rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList, 
			    rrc.informationelements.DL_CommonTransChInfo dl_CommonTransChInfo, 
			    rrc.informationelements.DL_AddReconfTransChInfoList dl_AddReconfTransChInfoList, 
			    rrc.informationelements.UL_DPCH_Info ul_DPCH_Info, 
			    ModeSpecificInfo modeSpecificInfo, 
			    rrc.informationelements.DL_CommonInformation dl_CommonInformation, 
			    rrc.informationelements.DL_InformationPerRL_List dl_InformationPerRL_List, 
			    rrc.informationelements.FrequencyInfo frequencyInfo)
	    {
		setSrb_InformationSetupList(srb_InformationSetupList);
		setUl_CommonTransChInfo(ul_CommonTransChInfo);
		setUl_AddReconfTransChInfoList(ul_AddReconfTransChInfoList);
		setDl_CommonTransChInfo(dl_CommonTransChInfo);
		setDl_AddReconfTransChInfoList(dl_AddReconfTransChInfoList);
		setUl_DPCH_Info(ul_DPCH_Info);
		setModeSpecificInfo(modeSpecificInfo);
		setDl_CommonInformation(dl_CommonInformation);
		setDl_InformationPerRL_List(dl_InformationPerRL_List);
		setFrequencyInfo(frequencyInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.SRB_InformationSetupList();
		mComponents[1] = new rrc.informationelements.RAB_InformationSetupList();
		mComponents[2] = new rrc.informationelements.UL_CommonTransChInfo();
		mComponents[3] = new rrc.informationelements.UL_AddReconfTransChInfoList();
		mComponents[4] = new rrc.informationelements.DL_CommonTransChInfo();
		mComponents[5] = new rrc.informationelements.DL_AddReconfTransChInfoList();
		mComponents[6] = new rrc.informationelements.UL_DPCH_Info();
		mComponents[7] = new ModeSpecificInfo();
		mComponents[8] = new rrc.informationelements.DL_CommonInformation();
		mComponents[9] = new rrc.informationelements.DL_InformationPerRL_List();
		mComponents[10] = new rrc.informationelements.FrequencyInfo();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[11];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new rrc.informationelements.SRB_InformationSetupList();
		    case 1:
			return new rrc.informationelements.RAB_InformationSetupList();
		    case 2:
			return new rrc.informationelements.UL_CommonTransChInfo();
		    case 3:
			return new rrc.informationelements.UL_AddReconfTransChInfoList();
		    case 4:
			return new rrc.informationelements.DL_CommonTransChInfo();
		    case 5:
			return new rrc.informationelements.DL_AddReconfTransChInfoList();
		    case 6:
			return new rrc.informationelements.UL_DPCH_Info();
		    case 7:
			return new ModeSpecificInfo();
		    case 8:
			return new rrc.informationelements.DL_CommonInformation();
		    case 9:
			return new rrc.informationelements.DL_InformationPerRL_List();
		    case 10:
			return new rrc.informationelements.FrequencyInfo();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "srb_InformationSetupList"
	    public rrc.informationelements.SRB_InformationSetupList getSrb_InformationSetupList()
	    {
		return (rrc.informationelements.SRB_InformationSetupList)mComponents[0];
	    }
	    
	    public void setSrb_InformationSetupList(rrc.informationelements.SRB_InformationSetupList srb_InformationSetupList)
	    {
		mComponents[0] = srb_InformationSetupList;
	    }
	    
	    
	    // Methods for field "rab_InformationSetupList"
	    public rrc.informationelements.RAB_InformationSetupList getRab_InformationSetupList()
	    {
		return (rrc.informationelements.RAB_InformationSetupList)mComponents[1];
	    }
	    
	    public void setRab_InformationSetupList(rrc.informationelements.RAB_InformationSetupList rab_InformationSetupList)
	    {
		mComponents[1] = rab_InformationSetupList;
	    }
	    
	    public boolean hasRab_InformationSetupList()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteRab_InformationSetupList()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "ul_CommonTransChInfo"
	    public rrc.informationelements.UL_CommonTransChInfo getUl_CommonTransChInfo()
	    {
		return (rrc.informationelements.UL_CommonTransChInfo)mComponents[2];
	    }
	    
	    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo ul_CommonTransChInfo)
	    {
		mComponents[2] = ul_CommonTransChInfo;
	    }
	    
	    
	    // Methods for field "ul_AddReconfTransChInfoList"
	    public rrc.informationelements.UL_AddReconfTransChInfoList getUl_AddReconfTransChInfoList()
	    {
		return (rrc.informationelements.UL_AddReconfTransChInfoList)mComponents[3];
	    }
	    
	    public void setUl_AddReconfTransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList)
	    {
		mComponents[3] = ul_AddReconfTransChInfoList;
	    }
	    
	    
	    // Methods for field "dl_CommonTransChInfo"
	    public rrc.informationelements.DL_CommonTransChInfo getDl_CommonTransChInfo()
	    {
		return (rrc.informationelements.DL_CommonTransChInfo)mComponents[4];
	    }
	    
	    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo dl_CommonTransChInfo)
	    {
		mComponents[4] = dl_CommonTransChInfo;
	    }
	    
	    
	    // Methods for field "dl_AddReconfTransChInfoList"
	    public rrc.informationelements.DL_AddReconfTransChInfoList getDl_AddReconfTransChInfoList()
	    {
		return (rrc.informationelements.DL_AddReconfTransChInfoList)mComponents[5];
	    }
	    
	    public void setDl_AddReconfTransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList dl_AddReconfTransChInfoList)
	    {
		mComponents[5] = dl_AddReconfTransChInfoList;
	    }
	    
	    
	    // Methods for field "ul_DPCH_Info"
	    public rrc.informationelements.UL_DPCH_Info getUl_DPCH_Info()
	    {
		return (rrc.informationelements.UL_DPCH_Info)mComponents[6];
	    }
	    
	    public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_Info ul_DPCH_Info)
	    {
		mComponents[6] = ul_DPCH_Info;
	    }
	    
	    
	    // Methods for field "modeSpecificInfo"
	    public ModeSpecificInfo getModeSpecificInfo()
	    {
		return (ModeSpecificInfo)mComponents[7];
	    }
	    
	    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
	    {
		mComponents[7] = modeSpecificInfo;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module PDU_definitions.
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
		 * Define the ASN1 Type Fdd from ASN1 Module PDU_definitions.
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
		    public Fdd(rrc.informationelements.DL_PDSCH_Information dummy, 
				    rrc.informationelements.CPCH_SetInfo dummy2)
		    {
			setDummy(dummy);
			setDummy2(dummy2);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new rrc.informationelements.DL_PDSCH_Information();
			mComponents[1] = new rrc.informationelements.CPCH_SetInfo();
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
				return new rrc.informationelements.DL_PDSCH_Information();
			    case 1:
				return new rrc.informationelements.CPCH_SetInfo();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "dummy"
		    public rrc.informationelements.DL_PDSCH_Information getDummy()
		    {
			return (rrc.informationelements.DL_PDSCH_Information)mComponents[0];
		    }
		    
		    public void setDummy(rrc.informationelements.DL_PDSCH_Information dummy)
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
		    
		    
		    // Methods for field "dummy2"
		    public rrc.informationelements.CPCH_SetInfo getDummy2()
		    {
			return (rrc.informationelements.CPCH_SetInfo)mComponents[1];
		    }
		    
		    public void setDummy2(rrc.informationelements.CPCH_SetInfo dummy2)
		    {
			mComponents[1] = dummy2;
		    }
		    
		    public boolean hasDummy2()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteDummy2()
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
			    "rrc.pdu_definitions",
			    "HandoverToUTRANCommand_r3_IEs$SpecificationMode$Complete$ModeSpecificInfo$Fdd"
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
						"DL_PDSCH_Information"
					    ),
					    new QName (
						"InformationElements",
						"DL-PDSCH-Information"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "DL_PDSCH_Information"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "DL_PDSCH_Information"
						)
					    ),
					    0
					)
				    ),
				    "dummy",
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
						"CPCH_SetInfo"
					    ),
					    new QName (
						"InformationElements",
						"CPCH-SetInfo"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "CPCH_SetInfo"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "CPCH_SetInfo"
						)
					    ),
					    0
					)
				    ),
				    "dummy2",
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

		// Methods for field "tdd"
		public static ModeSpecificInfo createModeSpecificInfoWithTdd(Null tdd)
		{
		    ModeSpecificInfo __object = new ModeSpecificInfo();

		    __object.setTdd(tdd);
		    return __object;
		}
		
		public boolean hasTdd()
		{
		    return getChosenFlag() == tdd_chosen;
		}
		
		public void setTdd(Null tdd)
		{
		    setChosenValue(tdd);
		    setChosenFlag(tdd_chosen);
		}
		
		
		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case fdd_chosen:
			    return new Fdd();
			case tdd_chosen:
			    return new Null();
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
			    (short)0x8007
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"HandoverToUTRANCommand_r3_IEs$SpecificationMode$Complete$ModeSpecificInfo"
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
					"rrc.pdu_definitions",
					"HandoverToUTRANCommand_r3_IEs$SpecificationMode$Complete$ModeSpecificInfo$Fdd"
				    )
				),
				"fdd",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new TypeInfo (
					new Tags (
					    new short[] {
						(short)0x8001
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

	    // Methods for field "dl_CommonInformation"
	    public rrc.informationelements.DL_CommonInformation getDl_CommonInformation()
	    {
		return (rrc.informationelements.DL_CommonInformation)mComponents[8];
	    }
	    
	    public void setDl_CommonInformation(rrc.informationelements.DL_CommonInformation dl_CommonInformation)
	    {
		mComponents[8] = dl_CommonInformation;
	    }
	    
	    
	    // Methods for field "dl_InformationPerRL_List"
	    public rrc.informationelements.DL_InformationPerRL_List getDl_InformationPerRL_List()
	    {
		return (rrc.informationelements.DL_InformationPerRL_List)mComponents[9];
	    }
	    
	    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_List dl_InformationPerRL_List)
	    {
		mComponents[9] = dl_InformationPerRL_List;
	    }
	    
	    
	    // Methods for field "frequencyInfo"
	    public rrc.informationelements.FrequencyInfo getFrequencyInfo()
	    {
		return (rrc.informationelements.FrequencyInfo)mComponents[10];
	    }
	    
	    public void setFrequencyInfo(rrc.informationelements.FrequencyInfo frequencyInfo)
	    {
		mComponents[10] = frequencyInfo;
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
		    "rrc.pdu_definitions",
		    "HandoverToUTRANCommand_r3_IEs$SpecificationMode$Complete"
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
					"SRB_InformationSetupList"
				    ),
				    new QName (
					"InformationElements",
					"SRB-InformationSetupList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(8)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "SRB_InformationSetup"
					)
				    )
				)
			    ),
			    "srb-InformationSetupList",
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
					"RAB_InformationSetupList"
				    ),
				    new QName (
					"InformationElements",
					"RAB-InformationSetupList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(16),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(16)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "RAB_InformationSetup"
					)
				    )
				)
			    ),
			    "rab-InformationSetupList",
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
					"UL_CommonTransChInfo"
				    ),
				    new QName (
					"InformationElements",
					"UL-CommonTransChInfo"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UL_CommonTransChInfo"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "UL_CommonTransChInfo"
					)
				    ),
				    0
				)
			    ),
			    "ul-CommonTransChInfo",
			    2,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UL_AddReconfTransChInfoList"
				    ),
				    new QName (
					"InformationElements",
					"UL-AddReconfTransChInfoList"
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
					    "UL_AddReconfTransChInformation"
					)
				    )
				)
			    ),
			    "ul-AddReconfTransChInfoList",
			    3,
			    2,
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
					"DL_CommonTransChInfo"
				    ),
				    new QName (
					"InformationElements",
					"DL-CommonTransChInfo"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DL_CommonTransChInfo"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DL_CommonTransChInfo"
					)
				    ),
				    0
				)
			    ),
			    "dl-CommonTransChInfo",
			    4,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8005
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DL_AddReconfTransChInfoList"
				    ),
				    new QName (
					"InformationElements",
					"DL-AddReconfTransChInfoList"
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
					    "DL_AddReconfTransChInformation"
					)
				    )
				)
			    ),
			    "dl-AddReconfTransChInfoList",
			    5,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8006
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UL_DPCH_Info"
				    ),
				    new QName (
					"InformationElements",
					"UL-DPCH-Info"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UL_DPCH_Info"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "UL_DPCH_Info"
					)
				    ),
				    0
				)
			    ),
			    "ul-DPCH-Info",
			    6,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverToUTRANCommand_r3_IEs$SpecificationMode$Complete$ModeSpecificInfo"
				)
			    ),
			    "modeSpecificInfo",
			    7,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8008
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DL_CommonInformation"
				    ),
				    new QName (
					"InformationElements",
					"DL-CommonInformation"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DL_CommonInformation"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DL_CommonInformation"
					)
				    ),
				    0
				)
			    ),
			    "dl-CommonInformation",
			    8,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8009
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DL_InformationPerRL_List"
				    ),
				    new QName (
					"InformationElements",
					"DL-InformationPerRL-List"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(8)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "DL_InformationPerRL"
					)
				    )
				)
			    ),
			    "dl-InformationPerRL-List",
			    9,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x800a
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"FrequencyInfo"
				    ),
				    new QName (
					"InformationElements",
					"FrequencyInfo"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "FrequencyInfo"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "FrequencyInfo"
					)
				    ),
				    0
				)
			    ),
			    "frequencyInfo",
			    10,
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3)
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
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8008, 8)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8009, 9)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x800a, 10)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Complete object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Complete object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Complete

	// Methods for field "preconfiguration"
	public static SpecificationMode createSpecificationModeWithPreconfiguration(Preconfiguration preconfiguration)
	{
	    SpecificationMode __object = new SpecificationMode();

	    __object.setPreconfiguration(preconfiguration);
	    return __object;
	}
	
	public boolean hasPreconfiguration()
	{
	    return getChosenFlag() == preconfiguration_chosen;
	}
	
	public void setPreconfiguration(Preconfiguration preconfiguration)
	{
	    setChosenValue(preconfiguration);
	    setChosenFlag(preconfiguration_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Preconfiguration from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Preconfiguration extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Preconfiguration()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Preconfiguration(PreConfigMode preConfigMode, 
			    rrc.informationelements.RAB_Info_Post rab_Info, 
			    ModeSpecificInfo modeSpecificInfo)
	    {
		setPreConfigMode(preConfigMode);
		setRab_Info(rab_Info);
		setModeSpecificInfo(modeSpecificInfo);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Preconfiguration(PreConfigMode preConfigMode, 
			    ModeSpecificInfo modeSpecificInfo)
	    {
		setPreConfigMode(preConfigMode);
		setModeSpecificInfo(modeSpecificInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PreConfigMode();
		mComponents[1] = new rrc.informationelements.RAB_Info_Post();
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
			return new PreConfigMode();
		    case 1:
			return new rrc.informationelements.RAB_Info_Post();
		    case 2:
			return new ModeSpecificInfo();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "preConfigMode"
	    public PreConfigMode getPreConfigMode()
	    {
		return (PreConfigMode)mComponents[0];
	    }
	    
	    public void setPreConfigMode(PreConfigMode preConfigMode)
	    {
		mComponents[0] = preConfigMode;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type PreConfigMode from ASN1 Module PDU_definitions.
	     * @see Choice
	     */
	    public static class PreConfigMode extends Choice {
		
		/**
		 * The default constructor.
		 */
		public PreConfigMode()
		{
		}
		
		public static final  int  predefinedConfigIdentity_chosen = 1;
		public static final  int  defaultConfig_chosen = 2;
		
		// Methods for field "predefinedConfigIdentity"
		public static PreConfigMode createPreConfigModeWithPredefinedConfigIdentity(long predefinedConfigIdentity)
		{
		    return createPreConfigModeWithPredefinedConfigIdentity(new rrc.informationelements.PredefinedConfigIdentity(predefinedConfigIdentity));
		}
		
		public static PreConfigMode createPreConfigModeWithPredefinedConfigIdentity(rrc.informationelements.PredefinedConfigIdentity predefinedConfigIdentity)
		{
		    PreConfigMode __object = new PreConfigMode();

		    __object.setPredefinedConfigIdentity(predefinedConfigIdentity);
		    return __object;
		}
		
		public boolean hasPredefinedConfigIdentity()
		{
		    return getChosenFlag() == predefinedConfigIdentity_chosen;
		}
		
		public void setPredefinedConfigIdentity(long predefinedConfigIdentity)
		{
		    setPredefinedConfigIdentity(new rrc.informationelements.PredefinedConfigIdentity(predefinedConfigIdentity));
		}
		
		public void setPredefinedConfigIdentity(rrc.informationelements.PredefinedConfigIdentity predefinedConfigIdentity)
		{
		    setChosenValue(predefinedConfigIdentity);
		    setChosenFlag(predefinedConfigIdentity_chosen);
		}
		
		
		// Methods for field "defaultConfig"
		public static PreConfigMode createPreConfigModeWithDefaultConfig(DefaultConfig defaultConfig)
		{
		    PreConfigMode __object = new PreConfigMode();

		    __object.setDefaultConfig(defaultConfig);
		    return __object;
		}
		
		public boolean hasDefaultConfig()
		{
		    return getChosenFlag() == defaultConfig_chosen;
		}
		
		public void setDefaultConfig(DefaultConfig defaultConfig)
		{
		    setChosenValue(defaultConfig);
		    setChosenFlag(defaultConfig_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type DefaultConfig from ASN1 Module PDU_definitions.
		 * @see Sequence
		 */
		public static class DefaultConfig extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public DefaultConfig()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public DefaultConfig(rrc.informationelements.DefaultConfigMode defaultConfigMode, 
				    rrc.informationelements.DefaultConfigIdentity defaultConfigIdentity)
		    {
			setDefaultConfigMode(defaultConfigMode);
			setDefaultConfigIdentity(defaultConfigIdentity);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = rrc.informationelements.DefaultConfigMode.fdd;
			mComponents[1] = new rrc.informationelements.DefaultConfigIdentity();
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
				return rrc.informationelements.DefaultConfigMode.fdd;
			    case 1:
				return new rrc.informationelements.DefaultConfigIdentity();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "defaultConfigMode"
		    public rrc.informationelements.DefaultConfigMode getDefaultConfigMode()
		    {
			return (rrc.informationelements.DefaultConfigMode)mComponents[0];
		    }
		    
		    public void setDefaultConfigMode(rrc.informationelements.DefaultConfigMode defaultConfigMode)
		    {
			mComponents[0] = defaultConfigMode;
		    }
		    
		    
		    // Methods for field "defaultConfigIdentity"
		    public rrc.informationelements.DefaultConfigIdentity getDefaultConfigIdentity()
		    {
			return (rrc.informationelements.DefaultConfigIdentity)mComponents[1];
		    }
		    
		    public void setDefaultConfigIdentity(rrc.informationelements.DefaultConfigIdentity defaultConfigIdentity)
		    {
			mComponents[1] = defaultConfigIdentity;
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
			    "rrc.pdu_definitions",
			    "HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration$PreConfigMode$DefaultConfig"
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
					new EnumeratedInfo (
					    new Tags (
						new short[] {
						    (short)0x8000
						}
					    ),
					    new QName (
						"rrc.informationelements",
						"DefaultConfigMode"
					    ),
					    new QName (
						"InformationElements",
						"DefaultConfigMode"
					    ),
					    12314,
					    null,
					    new MemberList (
						new MemberListElement[] {
						    new MemberListElement (
							"fdd",
							0
						    ),
						    new MemberListElement (
							"tdd",
							1
						    )
						}
					    ),
					    0,
					    rrc.informationelements.DefaultConfigMode.fdd
					)
				    ),
				    "defaultConfigMode",
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
						"DefaultConfigIdentity"
					    ),
					    new QName (
						"InformationElements",
						"DefaultConfigIdentity"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new rrc.informationelements.DefaultConfigIdentity(0), 
						    new rrc.informationelements.DefaultConfigIdentity(10),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(0),
						new java.lang.Long(10)
					    ),
					    null
					)
				    ),
				    "defaultConfigIdentity",
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
		     * Get the type descriptor (TypeInfo) of 'this' DefaultConfig object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' DefaultConfig object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for DefaultConfig

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case predefinedConfigIdentity_chosen:
			    return new rrc.informationelements.PredefinedConfigIdentity();
			case defaultConfig_chosen:
			    return new DefaultConfig();
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
			"rrc.pdu_definitions",
			"HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration$PreConfigMode"
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
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "PredefinedConfigIdentity"
					),
					new QName (
					    "InformationElements",
					    "PredefinedConfigIdentity"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new rrc.informationelements.PredefinedConfigIdentity(0), 
						new rrc.informationelements.PredefinedConfigIdentity(15),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(15)
					),
					null
				    )
				),
				"predefinedConfigIdentity",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration$PreConfigMode$DefaultConfig"
				    )
				),
				"defaultConfig",
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
		 * Get the type descriptor (TypeInfo) of 'this' PreConfigMode object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' PreConfigMode object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for PreConfigMode

	    // Methods for field "rab_Info"
	    public rrc.informationelements.RAB_Info_Post getRab_Info()
	    {
		return (rrc.informationelements.RAB_Info_Post)mComponents[1];
	    }
	    
	    public void setRab_Info(rrc.informationelements.RAB_Info_Post rab_Info)
	    {
		mComponents[1] = rab_Info;
	    }
	    
	    public boolean hasRab_Info()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteRab_Info()
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
	     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module PDU_definitions.
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
		 * Define the ASN1 Type Fdd from ASN1 Module PDU_definitions.
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
		    public Fdd(rrc.informationelements.UL_DPCH_InfoPostFDD ul_DPCH_Info, 
				    rrc.informationelements.DL_CommonInformationPost dl_CommonInformationPost, 
				    rrc.informationelements.DL_InformationPerRL_ListPostFDD dl_InformationPerRL_List, 
				    rrc.informationelements.FrequencyInfoFDD frequencyInfo)
		    {
			setUl_DPCH_Info(ul_DPCH_Info);
			setDl_CommonInformationPost(dl_CommonInformationPost);
			setDl_InformationPerRL_List(dl_InformationPerRL_List);
			setFrequencyInfo(frequencyInfo);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new rrc.informationelements.UL_DPCH_InfoPostFDD();
			mComponents[1] = new rrc.informationelements.DL_CommonInformationPost();
			mComponents[2] = new rrc.informationelements.DL_InformationPerRL_ListPostFDD();
			mComponents[3] = new rrc.informationelements.FrequencyInfoFDD();
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
				return new rrc.informationelements.UL_DPCH_InfoPostFDD();
			    case 1:
				return new rrc.informationelements.DL_CommonInformationPost();
			    case 2:
				return new rrc.informationelements.DL_InformationPerRL_ListPostFDD();
			    case 3:
				return new rrc.informationelements.FrequencyInfoFDD();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "ul_DPCH_Info"
		    public rrc.informationelements.UL_DPCH_InfoPostFDD getUl_DPCH_Info()
		    {
			return (rrc.informationelements.UL_DPCH_InfoPostFDD)mComponents[0];
		    }
		    
		    public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_InfoPostFDD ul_DPCH_Info)
		    {
			mComponents[0] = ul_DPCH_Info;
		    }
		    
		    
		    // Methods for field "dl_CommonInformationPost"
		    public rrc.informationelements.DL_CommonInformationPost getDl_CommonInformationPost()
		    {
			return (rrc.informationelements.DL_CommonInformationPost)mComponents[1];
		    }
		    
		    public void setDl_CommonInformationPost(rrc.informationelements.DL_CommonInformationPost dl_CommonInformationPost)
		    {
			mComponents[1] = dl_CommonInformationPost;
		    }
		    
		    
		    // Methods for field "dl_InformationPerRL_List"
		    public rrc.informationelements.DL_InformationPerRL_ListPostFDD getDl_InformationPerRL_List()
		    {
			return (rrc.informationelements.DL_InformationPerRL_ListPostFDD)mComponents[2];
		    }
		    
		    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_ListPostFDD dl_InformationPerRL_List)
		    {
			mComponents[2] = dl_InformationPerRL_List;
		    }
		    
		    
		    // Methods for field "frequencyInfo"
		    public rrc.informationelements.FrequencyInfoFDD getFrequencyInfo()
		    {
			return (rrc.informationelements.FrequencyInfoFDD)mComponents[3];
		    }
		    
		    public void setFrequencyInfo(rrc.informationelements.FrequencyInfoFDD frequencyInfo)
		    {
			mComponents[3] = frequencyInfo;
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
			    "rrc.pdu_definitions",
			    "HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Fdd"
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
						"UL_DPCH_InfoPostFDD"
					    ),
					    new QName (
						"InformationElements",
						"UL-DPCH-InfoPostFDD"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "UL_DPCH_InfoPostFDD"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "UL_DPCH_InfoPostFDD"
						)
					    ),
					    0
					)
				    ),
				    "ul-DPCH-Info",
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
						"DL_CommonInformationPost"
					    ),
					    new QName (
						"InformationElements",
						"DL-CommonInformationPost"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "DL_CommonInformationPost"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "DL_CommonInformationPost"
						)
					    ),
					    0
					)
				    ),
				    "dl-CommonInformationPost",
				    1,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new ContainerInfo (
					    new Tags (
						new short[] {
						    (short)0x8002
						}
					    ),
					    new QName (
						"rrc.informationelements",
						"DL_InformationPerRL_ListPostFDD"
					    ),
					    new QName (
						"InformationElements",
						"DL-InformationPerRL-ListPostFDD"
					    ),
					    12314,
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(8),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(8)
					    ),
					    new TypeInfoRef (
						new QName (
						    "rrc.informationelements",
						    "DL_InformationPerRL_PostFDD"
						)
					    )
					)
				    ),
				    "dl-InformationPerRL-List",
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
						"FrequencyInfoFDD"
					    ),
					    new QName (
						"InformationElements",
						"FrequencyInfoFDD"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "FrequencyInfoFDD"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "FrequencyInfoFDD"
						)
					    ),
					    0
					)
				    ),
				    "frequencyInfo",
				    3,
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
					new TagDecoderElement((short)0x8002, 2)
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
		 * Define the ASN1 Type Tdd from ASN1 Module PDU_definitions.
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
		    public Tdd(rrc.informationelements.UL_DPCH_InfoPostTDD ul_DPCH_Info, 
				    rrc.informationelements.DL_CommonInformationPost dl_CommonInformationPost, 
				    rrc.informationelements.DL_InformationPerRL_PostTDD dl_InformationPerRL, 
				    rrc.informationelements.FrequencyInfoTDD frequencyInfo, 
				    rrc.informationelements.PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
		    {
			setUl_DPCH_Info(ul_DPCH_Info);
			setDl_CommonInformationPost(dl_CommonInformationPost);
			setDl_InformationPerRL(dl_InformationPerRL);
			setFrequencyInfo(frequencyInfo);
			setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new rrc.informationelements.UL_DPCH_InfoPostTDD();
			mComponents[1] = new rrc.informationelements.DL_CommonInformationPost();
			mComponents[2] = new rrc.informationelements.DL_InformationPerRL_PostTDD();
			mComponents[3] = new rrc.informationelements.FrequencyInfoTDD();
			mComponents[4] = new rrc.informationelements.PrimaryCCPCH_TX_Power();
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
				return new rrc.informationelements.UL_DPCH_InfoPostTDD();
			    case 1:
				return new rrc.informationelements.DL_CommonInformationPost();
			    case 2:
				return new rrc.informationelements.DL_InformationPerRL_PostTDD();
			    case 3:
				return new rrc.informationelements.FrequencyInfoTDD();
			    case 4:
				return new rrc.informationelements.PrimaryCCPCH_TX_Power();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "ul_DPCH_Info"
		    public rrc.informationelements.UL_DPCH_InfoPostTDD getUl_DPCH_Info()
		    {
			return (rrc.informationelements.UL_DPCH_InfoPostTDD)mComponents[0];
		    }
		    
		    public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_InfoPostTDD ul_DPCH_Info)
		    {
			mComponents[0] = ul_DPCH_Info;
		    }
		    
		    
		    // Methods for field "dl_CommonInformationPost"
		    public rrc.informationelements.DL_CommonInformationPost getDl_CommonInformationPost()
		    {
			return (rrc.informationelements.DL_CommonInformationPost)mComponents[1];
		    }
		    
		    public void setDl_CommonInformationPost(rrc.informationelements.DL_CommonInformationPost dl_CommonInformationPost)
		    {
			mComponents[1] = dl_CommonInformationPost;
		    }
		    
		    
		    // Methods for field "dl_InformationPerRL"
		    public rrc.informationelements.DL_InformationPerRL_PostTDD getDl_InformationPerRL()
		    {
			return (rrc.informationelements.DL_InformationPerRL_PostTDD)mComponents[2];
		    }
		    
		    public void setDl_InformationPerRL(rrc.informationelements.DL_InformationPerRL_PostTDD dl_InformationPerRL)
		    {
			mComponents[2] = dl_InformationPerRL;
		    }
		    
		    
		    // Methods for field "frequencyInfo"
		    public rrc.informationelements.FrequencyInfoTDD getFrequencyInfo()
		    {
			return (rrc.informationelements.FrequencyInfoTDD)mComponents[3];
		    }
		    
		    public void setFrequencyInfo(rrc.informationelements.FrequencyInfoTDD frequencyInfo)
		    {
			mComponents[3] = frequencyInfo;
		    }
		    
		    
		    // Methods for field "primaryCCPCH_TX_Power"
		    public rrc.informationelements.PrimaryCCPCH_TX_Power getPrimaryCCPCH_TX_Power()
		    {
			return (rrc.informationelements.PrimaryCCPCH_TX_Power)mComponents[4];
		    }
		    
		    public void setPrimaryCCPCH_TX_Power(rrc.informationelements.PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
		    {
			mComponents[4] = primaryCCPCH_TX_Power;
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
			    "rrc.pdu_definitions",
			    "HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Tdd"
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
						"UL_DPCH_InfoPostTDD"
					    ),
					    new QName (
						"InformationElements",
						"UL-DPCH-InfoPostTDD"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "UL_DPCH_InfoPostTDD"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "UL_DPCH_InfoPostTDD"
						)
					    ),
					    0
					)
				    ),
				    "ul-DPCH-Info",
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
						"DL_CommonInformationPost"
					    ),
					    new QName (
						"InformationElements",
						"DL-CommonInformationPost"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "DL_CommonInformationPost"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "DL_CommonInformationPost"
						)
					    ),
					    0
					)
				    ),
				    "dl-CommonInformationPost",
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
						"DL_InformationPerRL_PostTDD"
					    ),
					    new QName (
						"InformationElements",
						"DL-InformationPerRL-PostTDD"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "DL_InformationPerRL_PostTDD"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "DL_InformationPerRL_PostTDD"
						)
					    ),
					    0
					)
				    ),
				    "dl-InformationPerRL",
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
						"FrequencyInfoTDD"
					    ),
					    new QName (
						"InformationElements",
						"FrequencyInfoTDD"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "FrequencyInfoTDD"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "FrequencyInfoTDD"
						)
					    ),
					    0
					)
				    ),
				    "frequencyInfo",
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
						"PrimaryCCPCH_TX_Power"
					    ),
					    new QName (
						"InformationElements",
						"PrimaryCCPCH-TX-Power"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new rrc.informationelements.PrimaryCCPCH_TX_Power(6), 
						    new rrc.informationelements.PrimaryCCPCH_TX_Power(43),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(6),
						new java.lang.Long(43)
					    ),
					    null
					)
				    ),
				    "primaryCCPCH-TX-Power",
				    4,
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
					new TagDecoderElement((short)0x8002, 2)
				    }
				),
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8003, 3)
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
			    (short)0x8002
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo"
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
					"rrc.pdu_definitions",
					"HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Fdd"
				    )
				),
				"fdd",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Tdd"
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration"
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
				    "rrc.pdu_definitions",
				    "HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration$PreConfigMode"
				)
			    ),
			    "preConfigMode",
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
					"RAB_Info_Post"
				    ),
				    new QName (
					"InformationElements",
					"RAB-Info-Post"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "RAB_Info_Post"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "RAB_Info_Post"
					)
				    ),
				    0
				)
			    ),
			    "rab-Info",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo"
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
				new TagDecoderElement((short)0x8000, 0)
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
	     * Get the type descriptor (TypeInfo) of 'this' Preconfiguration object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Preconfiguration object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Preconfiguration

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case complete_chosen:
		    return new Complete();
		case preconfiguration_chosen:
		    return new Preconfiguration();
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"HandoverToUTRANCommand_r3_IEs$SpecificationMode"
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
				"rrc.pdu_definitions",
				"HandoverToUTRANCommand_r3_IEs$SpecificationMode$Complete"
			    )
			),
			"complete",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"HandoverToUTRANCommand_r3_IEs$SpecificationMode$Preconfiguration"
			    )
			),
			"preconfiguration",
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
	 * Get the type descriptor (TypeInfo) of 'this' SpecificationMode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SpecificationMode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SpecificationMode

    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[4];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[4] = maxAllowedUL_TX_Power;
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
	    "rrc.pdu_definitions",
	    "HandoverToUTRANCommand_r3_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverToUTRANCommand-r3-IEs"
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
				"U_RNTI_Short"
			    ),
			    new QName (
				"InformationElements",
				"U-RNTI-Short"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI_Short"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI_Short"
				)
			    ),
			    0
			)
		    ),
		    "new-U-RNTI",
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
				"ActivationTime"
			    ),
			    new QName (
				"InformationElements",
				"ActivationTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.ActivationTime(0), 
				    new rrc.informationelements.ActivationTime(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "dummy",
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
				"CipheringAlgorithm"
			    ),
			    new QName (
				"InformationElements",
				"CipheringAlgorithm"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"uea0",
					0
				    ),
				    new MemberListElement (
					"uea1",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.CipheringAlgorithm.uea0
			)
		    ),
		    "cipheringAlgorithm",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverToUTRANCommand_r3_IEs$SpecificationMode"
			)
		    ),
		    "specificationMode",
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
				"MaxAllowedUL_TX_Power"
			    ),
			    new QName (
				"InformationElements",
				"MaxAllowedUL-TX-Power"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MaxAllowedUL_TX_Power(-50), 
				    new rrc.informationelements.MaxAllowedUL_TX_Power(33),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-50),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "maxAllowedUL-TX-Power",
		    4,
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
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HandoverToUTRANCommand_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverToUTRANCommand_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverToUTRANCommand_r3_IEs
