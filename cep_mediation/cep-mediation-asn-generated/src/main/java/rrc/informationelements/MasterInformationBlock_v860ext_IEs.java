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
 * Define the ASN1 Type MasterInformationBlock_v860ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MasterInformationBlock_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MasterInformationBlock_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MasterInformationBlock_v860ext_IEs(ExtSIBTypeInfoSchedulingInfo_List2 extSIBTypeInfoSchedulingInfo_List, 
		    ExtGANSS_SIBTypeInfoSchedulingInfoList extGANSS_SIBTypeInfoSchedulingInfoList, 
		    Csg_Indicator csg_Indicator)
    {
	setExtSIBTypeInfoSchedulingInfo_List(extSIBTypeInfoSchedulingInfo_List);
	setExtGANSS_SIBTypeInfoSchedulingInfoList(extGANSS_SIBTypeInfoSchedulingInfoList);
	setCsg_Indicator(csg_Indicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ExtSIBTypeInfoSchedulingInfo_List2();
	mComponents[1] = new ExtGANSS_SIBTypeInfoSchedulingInfoList();
	mComponents[2] = Csg_Indicator._true;
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
		return new ExtSIBTypeInfoSchedulingInfo_List2();
	    case 1:
		return new ExtGANSS_SIBTypeInfoSchedulingInfoList();
	    case 2:
		return Csg_Indicator._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "extSIBTypeInfoSchedulingInfo_List"
    public ExtSIBTypeInfoSchedulingInfo_List2 getExtSIBTypeInfoSchedulingInfo_List()
    {
	return (ExtSIBTypeInfoSchedulingInfo_List2)mComponents[0];
    }
    
    public void setExtSIBTypeInfoSchedulingInfo_List(ExtSIBTypeInfoSchedulingInfo_List2 extSIBTypeInfoSchedulingInfo_List)
    {
	mComponents[0] = extSIBTypeInfoSchedulingInfo_List;
    }
    
    public boolean hasExtSIBTypeInfoSchedulingInfo_List()
    {
	return componentIsPresent(0);
    }
    
    public void deleteExtSIBTypeInfoSchedulingInfo_List()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "extGANSS_SIBTypeInfoSchedulingInfoList"
    public ExtGANSS_SIBTypeInfoSchedulingInfoList getExtGANSS_SIBTypeInfoSchedulingInfoList()
    {
	return (ExtGANSS_SIBTypeInfoSchedulingInfoList)mComponents[1];
    }
    
    public void setExtGANSS_SIBTypeInfoSchedulingInfoList(ExtGANSS_SIBTypeInfoSchedulingInfoList extGANSS_SIBTypeInfoSchedulingInfoList)
    {
	mComponents[1] = extGANSS_SIBTypeInfoSchedulingInfoList;
    }
    
    public boolean hasExtGANSS_SIBTypeInfoSchedulingInfoList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteExtGANSS_SIBTypeInfoSchedulingInfoList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "csg_Indicator"
    public Csg_Indicator getCsg_Indicator()
    {
	return (Csg_Indicator)mComponents[2];
    }
    
    public void setCsg_Indicator(Csg_Indicator csg_Indicator)
    {
	mComponents[2] = csg_Indicator;
    }
    
    public boolean hasCsg_Indicator()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCsg_Indicator()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Csg_Indicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Csg_Indicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Csg_Indicator()
	{
	    super(cFirstNumber);
	}
	
	protected Csg_Indicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Csg_Indicator _true =
	    new Csg_Indicator(0);
	private final static Csg_Indicator cNamedNumbers[] = {
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
	
	public static Csg_Indicator valueOf(long value)
	{
	    return (Csg_Indicator)_true.lookupValue(value);
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
		"MasterInformationBlock_v860ext_IEs$Csg_Indicator"
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
	 * Get the type descriptor (TypeInfo) of 'this' Csg_Indicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Csg_Indicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Csg_Indicator

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
	    "MasterInformationBlock_v860ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "MasterInformationBlock-v860ext-IEs"
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
				"ExtSIBTypeInfoSchedulingInfo_List2"
			    ),
			    new QName (
				"InformationElements",
				"ExtSIBTypeInfoSchedulingInfo-List2"
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
				    "ExtSIBTypeInfoSchedulingInfo2"
				)
			    )
			)
		    ),
		    "extSIBTypeInfoSchedulingInfo-List",
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
				"ExtGANSS_SIBTypeInfoSchedulingInfoList"
			    ),
			    new QName (
				"InformationElements",
				"ExtGANSS-SIBTypeInfoSchedulingInfoList"
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
				    "ExtGANSS_SIBTypeInfoSchedulingInfo"
				)
			    )
			)
		    ),
		    "extGANSS-SIBTypeInfoSchedulingInfoList",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MasterInformationBlock_v860ext_IEs$Csg_Indicator"
			)
		    ),
		    "csg-Indicator",
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
     * Get the type descriptor (TypeInfo) of 'this' MasterInformationBlock_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MasterInformationBlock_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MasterInformationBlock_v860ext_IEs
