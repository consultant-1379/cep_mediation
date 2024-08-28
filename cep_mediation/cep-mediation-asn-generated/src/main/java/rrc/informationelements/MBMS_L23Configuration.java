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
 * Define the ASN1 Type MBMS_L23Configuration from ASN1 Module InformationElements.
 * @see Choice
 */

public class MBMS_L23Configuration extends Choice {
    
    /**
     * The default constructor.
     */
    public MBMS_L23Configuration()
    {
    }
    
    public static final  int  sameAsCurrent_chosen = 1;
    public static final  int  different_chosen = 2;
    
    // Methods for field "sameAsCurrent"
    public static MBMS_L23Configuration createMBMS_L23ConfigurationWithSameAsCurrent(SameAsCurrent sameAsCurrent)
    {
	MBMS_L23Configuration __object = new MBMS_L23Configuration();

	__object.setSameAsCurrent(sameAsCurrent);
	return __object;
    }
    
    public boolean hasSameAsCurrent()
    {
	return getChosenFlag() == sameAsCurrent_chosen;
    }
    
    public void setSameAsCurrent(SameAsCurrent sameAsCurrent)
    {
	setChosenValue(sameAsCurrent);
	setChosenFlag(sameAsCurrent_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type SameAsCurrent from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class SameAsCurrent extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public SameAsCurrent()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public SameAsCurrent(MBMS_SCCPCHIdentity currentCell_SCCPCH, 
			MBMS_MSCH_ConfigurationInfo_r6 msch_ConfigurationInfo)
	{
	    setCurrentCell_SCCPCH(currentCell_SCCPCH);
	    setMsch_ConfigurationInfo(msch_ConfigurationInfo);
	}
	
	/**
	 * Construct with required components.
	 */
	public SameAsCurrent(MBMS_SCCPCHIdentity currentCell_SCCPCH)
	{
	    setCurrentCell_SCCPCH(currentCell_SCCPCH);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MBMS_SCCPCHIdentity();
	    mComponents[1] = new MBMS_MSCH_ConfigurationInfo_r6();
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
		    return new MBMS_SCCPCHIdentity();
		case 1:
		    return new MBMS_MSCH_ConfigurationInfo_r6();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "currentCell_SCCPCH"
	public MBMS_SCCPCHIdentity getCurrentCell_SCCPCH()
	{
	    return (MBMS_SCCPCHIdentity)mComponents[0];
	}
	
	public void setCurrentCell_SCCPCH(MBMS_SCCPCHIdentity currentCell_SCCPCH)
	{
	    mComponents[0] = currentCell_SCCPCH;
	}
	
	
	// Methods for field "msch_ConfigurationInfo"
	public MBMS_MSCH_ConfigurationInfo_r6 getMsch_ConfigurationInfo()
	{
	    return (MBMS_MSCH_ConfigurationInfo_r6)mComponents[1];
	}
	
	public void setMsch_ConfigurationInfo(MBMS_MSCH_ConfigurationInfo_r6 msch_ConfigurationInfo)
	{
	    mComponents[1] = msch_ConfigurationInfo;
	}
	
	public boolean hasMsch_ConfigurationInfo()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteMsch_ConfigurationInfo()
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
		"MBMS_L23Configuration$SameAsCurrent"
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
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MBMS_SCCPCHIdentity"
				),
				new QName (
				    "InformationElements",
				    "MBMS-SCCPCHIdentity"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new MBMS_SCCPCHIdentity(1), 
					new MBMS_SCCPCHIdentity(16),
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
			"currentCell-SCCPCH",
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
				    "MBMS_MSCH_ConfigurationInfo_r6"
				),
				new QName (
				    "InformationElements",
				    "MBMS-MSCH-ConfigurationInfo-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_MSCH_ConfigurationInfo_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_MSCH_ConfigurationInfo_r6"
				    )
				),
				0
			    )
			),
			"msch-ConfigurationInfo",
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
	 * Get the type descriptor (TypeInfo) of 'this' SameAsCurrent object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SameAsCurrent object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SameAsCurrent

    // Methods for field "different"
    public static MBMS_L23Configuration createMBMS_L23ConfigurationWithDifferent(Different different)
    {
	MBMS_L23Configuration __object = new MBMS_L23Configuration();

	__object.setDifferent(different);
	return __object;
    }
    
    public boolean hasDifferent()
    {
	return getChosenFlag() == different_chosen;
    }
    
    public void setDifferent(Different different)
    {
	setChosenValue(different);
	setChosenFlag(different_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Different from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Different extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Different()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Different(MBMS_CommonCCTrChIdentity transpCh_InfoCommonForAllTrCh, 
			MBMS_TrCHInformation_NeighbList transpCHInformation)
	{
	    setTranspCh_InfoCommonForAllTrCh(transpCh_InfoCommonForAllTrCh);
	    setTranspCHInformation(transpCHInformation);
	}
	
	/**
	 * Construct with required components.
	 */
	public Different(MBMS_TrCHInformation_NeighbList transpCHInformation)
	{
	    setTranspCHInformation(transpCHInformation);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MBMS_CommonCCTrChIdentity();
	    mComponents[1] = new MBMS_TrCHInformation_NeighbList();
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
		    return new MBMS_CommonCCTrChIdentity();
		case 1:
		    return new MBMS_TrCHInformation_NeighbList();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "transpCh_InfoCommonForAllTrCh"
	public MBMS_CommonCCTrChIdentity getTranspCh_InfoCommonForAllTrCh()
	{
	    return (MBMS_CommonCCTrChIdentity)mComponents[0];
	}
	
	public void setTranspCh_InfoCommonForAllTrCh(MBMS_CommonCCTrChIdentity transpCh_InfoCommonForAllTrCh)
	{
	    mComponents[0] = transpCh_InfoCommonForAllTrCh;
	}
	
	public boolean hasTranspCh_InfoCommonForAllTrCh()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteTranspCh_InfoCommonForAllTrCh()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "transpCHInformation"
	public MBMS_TrCHInformation_NeighbList getTranspCHInformation()
	{
	    return (MBMS_TrCHInformation_NeighbList)mComponents[1];
	}
	
	public void setTranspCHInformation(MBMS_TrCHInformation_NeighbList transpCHInformation)
	{
	    mComponents[1] = transpCHInformation;
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
		"MBMS_L23Configuration$Different"
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
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MBMS_CommonCCTrChIdentity"
				),
				new QName (
				    "InformationElements",
				    "MBMS-CommonCCTrChIdentity"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new MBMS_CommonCCTrChIdentity(1), 
					new MBMS_CommonCCTrChIdentity(32),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				null
			    )
			),
			"transpCh-InfoCommonForAllTrCh",
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
				    "MBMS_TrCHInformation_NeighbList"
				),
				new QName (
				    "InformationElements",
				    "MBMS-TrCHInformation-NeighbList"
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
					"MBMS_TrCHInformation_Neighb"
				    )
				)
			    )
			),
			"transpCHInformation",
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
	 * Get the type descriptor (TypeInfo) of 'this' Different object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Different object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Different

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case sameAsCurrent_chosen:
		return new SameAsCurrent();
	    case different_chosen:
		return new Different();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "MBMS_L23Configuration"
	),
	new QName (
	    "InformationElements",
	    "MBMS-L23Configuration"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_L23Configuration$SameAsCurrent"
			)
		    ),
		    "sameAsCurrent",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_L23Configuration$Different"
			)
		    ),
		    "different",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_L23Configuration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_L23Configuration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_L23Configuration
