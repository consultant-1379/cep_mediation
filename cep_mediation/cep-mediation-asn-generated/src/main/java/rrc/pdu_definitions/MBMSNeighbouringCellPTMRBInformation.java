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
 * Define the ASN1 Type MBMSNeighbouringCellPTMRBInformation from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSNeighbouringCellPTMRBInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSNeighbouringCellPTMRBInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSNeighbouringCellPTMRBInformation(rrc.informationelements.IntraFreqCellID neighbouringCellIdentity, 
		    rrc.informationelements.MBMS_NeighbouringCellSCCPCHList_r6 neighbouringCellSCCPCHList, 
		    V770NCEs v770NCEs)
    {
	setNeighbouringCellIdentity(neighbouringCellIdentity);
	setNeighbouringCellSCCPCHList(neighbouringCellSCCPCHList);
	setV770NCEs(v770NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public MBMSNeighbouringCellPTMRBInformation(rrc.informationelements.IntraFreqCellID neighbouringCellIdentity, 
		    rrc.informationelements.MBMS_NeighbouringCellSCCPCHList_r6 neighbouringCellSCCPCHList)
    {
	setNeighbouringCellIdentity(neighbouringCellIdentity);
	setNeighbouringCellSCCPCHList(neighbouringCellSCCPCHList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.IntraFreqCellID();
	mComponents[1] = new rrc.informationelements.MBMS_NeighbouringCellSCCPCHList_r6();
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
		return new rrc.informationelements.IntraFreqCellID();
	    case 1:
		return new rrc.informationelements.MBMS_NeighbouringCellSCCPCHList_r6();
	    case 2:
		return new V770NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "neighbouringCellIdentity"
    public rrc.informationelements.IntraFreqCellID getNeighbouringCellIdentity()
    {
	return (rrc.informationelements.IntraFreqCellID)mComponents[0];
    }
    
    public void setNeighbouringCellIdentity(rrc.informationelements.IntraFreqCellID neighbouringCellIdentity)
    {
	mComponents[0] = neighbouringCellIdentity;
    }
    
    
    // Methods for field "neighbouringCellSCCPCHList"
    public rrc.informationelements.MBMS_NeighbouringCellSCCPCHList_r6 getNeighbouringCellSCCPCHList()
    {
	return (rrc.informationelements.MBMS_NeighbouringCellSCCPCHList_r6)mComponents[1];
    }
    
    public void setNeighbouringCellSCCPCHList(rrc.informationelements.MBMS_NeighbouringCellSCCPCHList_r6 neighbouringCellSCCPCHList)
    {
	mComponents[1] = neighbouringCellSCCPCHList;
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
	public V770NCEs(MBMSNeighbouringCellPTMRBInformation_v770ext_IEs mbmsNeighbouringCellPTMRBInformation_v770ext, 
			NonCriticalExtensions nonCriticalExtensions)
	{
	    setMbmsNeighbouringCellPTMRBInformation_v770ext(mbmsNeighbouringCellPTMRBInformation_v770ext);
	    setNonCriticalExtensions(nonCriticalExtensions);
	}
	
	/**
	 * Construct with required components.
	 */
	public V770NCEs(MBMSNeighbouringCellPTMRBInformation_v770ext_IEs mbmsNeighbouringCellPTMRBInformation_v770ext)
	{
	    setMbmsNeighbouringCellPTMRBInformation_v770ext(mbmsNeighbouringCellPTMRBInformation_v770ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MBMSNeighbouringCellPTMRBInformation_v770ext_IEs();
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
		    return new MBMSNeighbouringCellPTMRBInformation_v770ext_IEs();
		case 1:
		    return new NonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "mbmsNeighbouringCellPTMRBInformation_v770ext"
	public MBMSNeighbouringCellPTMRBInformation_v770ext_IEs getMbmsNeighbouringCellPTMRBInformation_v770ext()
	{
	    return (MBMSNeighbouringCellPTMRBInformation_v770ext_IEs)mComponents[0];
	}
	
	public void setMbmsNeighbouringCellPTMRBInformation_v770ext(MBMSNeighbouringCellPTMRBInformation_v770ext_IEs mbmsNeighbouringCellPTMRBInformation_v770ext)
	{
	    mComponents[0] = mbmsNeighbouringCellPTMRBInformation_v770ext;
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
		    "MBMSNeighbouringCellPTMRBInformation$V770NCEs$NonCriticalExtensions"
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
		"MBMSNeighbouringCellPTMRBInformation$V770NCEs"
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
				    "MBMSNeighbouringCellPTMRBInformation_v770ext_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "MBMSNeighbouringCellPTMRBInformation-v770ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSNeighbouringCellPTMRBInformation_v770ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"MBMSNeighbouringCellPTMRBInformation_v770ext_IEs"
				    )
				),
				0
			    )
			),
			"mbmsNeighbouringCellPTMRBInformation-v770ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"MBMSNeighbouringCellPTMRBInformation$V770NCEs$NonCriticalExtensions"
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
	    "MBMSNeighbouringCellPTMRBInformation"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSNeighbouringCellPTMRBInformation"
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
				"IntraFreqCellID"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqCellID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.IntraFreqCellID(0), 
				    new rrc.informationelements.IntraFreqCellID(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "neighbouringCellIdentity",
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
				"MBMS_NeighbouringCellSCCPCHList_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-NeighbouringCellSCCPCHList-r6"
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
				    "MBMS_NeighbouringCellSCCPCH_r6"
				)
			    )
			)
		    ),
		    "neighbouringCellSCCPCHList",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MBMSNeighbouringCellPTMRBInformation$V770NCEs"
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMSNeighbouringCellPTMRBInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSNeighbouringCellPTMRBInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSNeighbouringCellPTMRBInformation
