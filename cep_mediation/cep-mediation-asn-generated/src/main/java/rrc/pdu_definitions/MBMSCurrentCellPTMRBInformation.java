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
 * Define the ASN1 Type MBMSCurrentCellPTMRBInformation from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSCurrentCellPTMRBInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSCurrentCellPTMRBInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSCurrentCellPTMRBInformation(rrc.informationelements.MBMS_CurrentCell_SCCPCHList_r6 mbms_CurrentCell_SCCPCHList, 
		    rrc.informationelements.MBMS_SIBType5_SCCPCHList_r6 mbms_SIBType5_SCCPCHList, 
		    V770NCEs v770NCEs)
    {
	setMbms_CurrentCell_SCCPCHList(mbms_CurrentCell_SCCPCHList);
	setMbms_SIBType5_SCCPCHList(mbms_SIBType5_SCCPCHList);
	setV770NCEs(v770NCEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MBMS_CurrentCell_SCCPCHList_r6();
	mComponents[1] = new rrc.informationelements.MBMS_SIBType5_SCCPCHList_r6();
	mComponents[2] = new V770NCEs();
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
		return new rrc.informationelements.MBMS_CurrentCell_SCCPCHList_r6();
	    case 1:
		return new rrc.informationelements.MBMS_SIBType5_SCCPCHList_r6();
	    case 2:
		return new V770NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_CurrentCell_SCCPCHList"
    public rrc.informationelements.MBMS_CurrentCell_SCCPCHList_r6 getMbms_CurrentCell_SCCPCHList()
    {
	return (rrc.informationelements.MBMS_CurrentCell_SCCPCHList_r6)mComponents[0];
    }
    
    public void setMbms_CurrentCell_SCCPCHList(rrc.informationelements.MBMS_CurrentCell_SCCPCHList_r6 mbms_CurrentCell_SCCPCHList)
    {
	mComponents[0] = mbms_CurrentCell_SCCPCHList;
    }
    
    public boolean hasMbms_CurrentCell_SCCPCHList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMbms_CurrentCell_SCCPCHList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "mbms_SIBType5_SCCPCHList"
    public rrc.informationelements.MBMS_SIBType5_SCCPCHList_r6 getMbms_SIBType5_SCCPCHList()
    {
	return (rrc.informationelements.MBMS_SIBType5_SCCPCHList_r6)mComponents[1];
    }
    
    public void setMbms_SIBType5_SCCPCHList(rrc.informationelements.MBMS_SIBType5_SCCPCHList_r6 mbms_SIBType5_SCCPCHList)
    {
	mComponents[1] = mbms_SIBType5_SCCPCHList;
    }
    
    public boolean hasMbms_SIBType5_SCCPCHList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMbms_SIBType5_SCCPCHList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "v770NCEs"
    public V770NCEs getV770NCEs()
    {
	return (V770NCEs)mComponents[2];
    }
    
    public void setV770NCEs(V770NCEs v770NCEs)
    {
	mComponents[2] = v770NCEs;
    }
    
    public boolean hasV770NCEs()
    {
	return componentIsPresent(2);
    }
    
    public void deleteV770NCEs()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type V770NCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class V770NCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public V770NCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public V770NCEs(MBMSCurrentCellPTMRBInfo_v770ext_IEs mbmsCurrentCellPTMRBInfo_v770ext, 
			NonCriticalExtensions nonCriticalExtensions)
	{
	    setMbmsCurrentCellPTMRBInfo_v770ext(mbmsCurrentCellPTMRBInfo_v770ext);
	    setNonCriticalExtensions(nonCriticalExtensions);
	}
	
	/**
	 * Construct with required components.
	 */
	public V770NCEs(MBMSCurrentCellPTMRBInfo_v770ext_IEs mbmsCurrentCellPTMRBInfo_v770ext)
	{
	    setMbmsCurrentCellPTMRBInfo_v770ext(mbmsCurrentCellPTMRBInfo_v770ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MBMSCurrentCellPTMRBInfo_v770ext_IEs();
	    mComponents[1] = new NonCriticalExtensions();
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
		    return new MBMSCurrentCellPTMRBInfo_v770ext_IEs();
		case 1:
		    return new NonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "mbmsCurrentCellPTMRBInfo_v770ext"
	public MBMSCurrentCellPTMRBInfo_v770ext_IEs getMbmsCurrentCellPTMRBInfo_v770ext()
	{
	    return (MBMSCurrentCellPTMRBInfo_v770ext_IEs)mComponents[0];
	}
	
	public void setMbmsCurrentCellPTMRBInfo_v770ext(MBMSCurrentCellPTMRBInfo_v770ext_IEs mbmsCurrentCellPTMRBInfo_v770ext)
	{
	    mComponents[0] = mbmsCurrentCellPTMRBInfo_v770ext;
	}
	
	
	// Methods for field "nonCriticalExtensions"
	public NonCriticalExtensions getNonCriticalExtensions()
	{
	    return (NonCriticalExtensions)mComponents[1];
	}
	
	public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
	{
	    mComponents[1] = nonCriticalExtensions;
	}
	
	public boolean hasNonCriticalExtensions()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteNonCriticalExtensions()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class NonCriticalExtensions extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public NonCriticalExtensions()
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "MBMSCurrentCellPTMRBInformation$V770NCEs$NonCriticalExtensions"
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
	     * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for NonCriticalExtensions

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
		"rrc.pdu_definitions",
		"MBMSCurrentCellPTMRBInformation$V770NCEs"
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
				    "rrc.pdu_definitions",
				    "MBMSCurrentCellPTMRBInfo_v770ext_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "MBMSCurrentCellPTMRBInfo-v770ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSCurrentCellPTMRBInfo_v770ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSCurrentCellPTMRBInfo_v770ext_IEs"
				    )
				),
				0
			    )
			),
			"mbmsCurrentCellPTMRBInfo-v770ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"MBMSCurrentCellPTMRBInformation$V770NCEs$NonCriticalExtensions"
			    )
			),
			"nonCriticalExtensions",
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
	 * Get the type descriptor (TypeInfo) of 'this' V770NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V770NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V770NCEs

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
	    "MBMSCurrentCellPTMRBInformation"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSCurrentCellPTMRBInformation"
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
				"MBMS_CurrentCell_SCCPCHList_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CurrentCell-SCCPCHList-r6"
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
				    "MBMS_CurrentCell_SCCPCH_r6"
				)
			    )
			)
		    ),
		    "mbms-CurrentCell-SCCPCHList",
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
				"MBMS_SIBType5_SCCPCHList_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-SIBType5-SCCPCHList-r6"
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
				    "MBMS_SIBType5_SCCPCH_r6"
				)
			    )
			)
		    ),
		    "mbms-SIBType5-SCCPCHList",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MBMSCurrentCellPTMRBInformation$V770NCEs"
			)
		    ),
		    "v770NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMSCurrentCellPTMRBInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSCurrentCellPTMRBInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSCurrentCellPTMRBInformation
