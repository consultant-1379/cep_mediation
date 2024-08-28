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
 * Define the ASN1 Type DL_FDPCH_InfoCommon_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_FDPCH_InfoCommon_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_FDPCH_InfoCommon_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_FDPCH_InfoCommon_r6(CfnHandling cfnHandling, 
		    DL_DPCH_PowerControlInfo dl_FDPCH_PowerControlInfo, 
		    INTEGER dl_FDPCH_TPCcommandErrorRate)
    {
	setCfnHandling(cfnHandling);
	setDl_FDPCH_PowerControlInfo(dl_FDPCH_PowerControlInfo);
	setDl_FDPCH_TPCcommandErrorRate(dl_FDPCH_TPCcommandErrorRate);
    }
    
    /**
     * Construct with components.
     */
    public DL_FDPCH_InfoCommon_r6(CfnHandling cfnHandling, 
		    DL_DPCH_PowerControlInfo dl_FDPCH_PowerControlInfo, 
		    long dl_FDPCH_TPCcommandErrorRate)
    {
	this(cfnHandling, dl_FDPCH_PowerControlInfo, 
	     new INTEGER(dl_FDPCH_TPCcommandErrorRate));
    }
    
    /**
     * Construct with required components.
     */
    public DL_FDPCH_InfoCommon_r6(CfnHandling cfnHandling)
    {
	setCfnHandling(cfnHandling);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CfnHandling();
	mComponents[1] = new DL_DPCH_PowerControlInfo();
	mComponents[2] = new INTEGER();
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
		return new CfnHandling();
	    case 1:
		return new DL_DPCH_PowerControlInfo();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cfnHandling"
    public CfnHandling getCfnHandling()
    {
	return (CfnHandling)mComponents[0];
    }
    
    public void setCfnHandling(CfnHandling cfnHandling)
    {
	mComponents[0] = cfnHandling;
    }
    
    
    
    /**
     * Define the ASN1 Type CfnHandling from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class CfnHandling extends Choice {
	
	/**
	 * The default constructor.
	 */
	public CfnHandling()
	{
	}
	
	public static final  int  maintain_chosen = 1;
	public static final  int  initialise_chosen = 2;
	
	// Methods for field "maintain"
	public static CfnHandling createCfnHandlingWithMaintain(Maintain maintain)
	{
	    CfnHandling __object = new CfnHandling();

	    __object.setMaintain(maintain);
	    return __object;
	}
	
	public boolean hasMaintain()
	{
	    return getChosenFlag() == maintain_chosen;
	}
	
	public void setMaintain(Maintain maintain)
	{
	    setChosenValue(maintain);
	    setChosenFlag(maintain_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Maintain from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Maintain extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Maintain()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Maintain(TimingMaintainedSynchInd timingmaintainedsynchind)
	    {
		setTimingmaintainedsynchind(timingmaintainedsynchind);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = TimingMaintainedSynchInd._false;
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
			return TimingMaintainedSynchInd._false;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "timingmaintainedsynchind"
	    public TimingMaintainedSynchInd getTimingmaintainedsynchind()
	    {
		return (TimingMaintainedSynchInd)mComponents[0];
	    }
	    
	    public void setTimingmaintainedsynchind(TimingMaintainedSynchInd timingmaintainedsynchind)
	    {
		mComponents[0] = timingmaintainedsynchind;
	    }
	    
	    public boolean hasTimingmaintainedsynchind()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteTimingmaintainedsynchind()
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
		    "DL_FDPCH_InfoCommon_r6$CfnHandling$Maintain"
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
					"TimingMaintainedSynchInd"
				    ),
				    new QName (
					"InformationElements",
					"TimingMaintainedSynchInd"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"false",
						0
					    )
					}
				    ),
				    0,
				    TimingMaintainedSynchInd._false
				)
			    ),
			    "timingmaintainedsynchind",
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
	     * Get the type descriptor (TypeInfo) of 'this' Maintain object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Maintain object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Maintain

	// Methods for field "initialise"
	public static CfnHandling createCfnHandlingWithInitialise(Null initialise)
	{
	    CfnHandling __object = new CfnHandling();

	    __object.setInitialise(initialise);
	    return __object;
	}
	
	public boolean hasInitialise()
	{
	    return getChosenFlag() == initialise_chosen;
	}
	
	public void setInitialise(Null initialise)
	{
	    setChosenValue(initialise);
	    setChosenFlag(initialise_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case maintain_chosen:
		    return new Maintain();
		case initialise_chosen:
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_FDPCH_InfoCommon_r6$CfnHandling"
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
				"DL_FDPCH_InfoCommon_r6$CfnHandling$Maintain"
			    )
			),
			"maintain",
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
			"initialise",
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
	 * Get the type descriptor (TypeInfo) of 'this' CfnHandling object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CfnHandling object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CfnHandling

    // Methods for field "dl_FDPCH_PowerControlInfo"
    public DL_DPCH_PowerControlInfo getDl_FDPCH_PowerControlInfo()
    {
	return (DL_DPCH_PowerControlInfo)mComponents[1];
    }
    
    public void setDl_FDPCH_PowerControlInfo(DL_DPCH_PowerControlInfo dl_FDPCH_PowerControlInfo)
    {
	mComponents[1] = dl_FDPCH_PowerControlInfo;
    }
    
    public boolean hasDl_FDPCH_PowerControlInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_FDPCH_PowerControlInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dl_FDPCH_TPCcommandErrorRate"
    public long getDl_FDPCH_TPCcommandErrorRate()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setDl_FDPCH_TPCcommandErrorRate(long dl_FDPCH_TPCcommandErrorRate)
    {
	setDl_FDPCH_TPCcommandErrorRate(new INTEGER(dl_FDPCH_TPCcommandErrorRate));
    }
    
    public void setDl_FDPCH_TPCcommandErrorRate(INTEGER dl_FDPCH_TPCcommandErrorRate)
    {
	mComponents[2] = dl_FDPCH_TPCcommandErrorRate;
    }
    
    public boolean hasDl_FDPCH_TPCcommandErrorRate()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDl_FDPCH_TPCcommandErrorRate()
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
	    "DL_FDPCH_InfoCommon_r6"
	),
	new QName (
	    "InformationElements",
	    "DL-FDPCH-InfoCommon-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_FDPCH_InfoCommon_r6$CfnHandling"
			)
		    ),
		    "cfnHandling",
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
				"DL_DPCH_PowerControlInfo"
			    ),
			    new QName (
				"InformationElements",
				"DL-DPCH-PowerControlInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_PowerControlInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_PowerControlInfo"
				)
			    ),
			    0
			)
		    ),
		    "dl-FDPCH-PowerControlInfo",
		    1,
		    3,
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "dl-FDPCH-TPCcommandErrorRate",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_FDPCH_InfoCommon_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_FDPCH_InfoCommon_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_FDPCH_InfoCommon_r6
