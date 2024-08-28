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
 * Define the ASN1 Type RestrictedTrChInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RestrictedTrChInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public RestrictedTrChInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RestrictedTrChInfo(UL_TrCH_Type ul_TransportChannelType, 
		    TransportChannelIdentity restrictedTrChIdentity, 
		    AllowedTFI_List allowedTFI_List)
    {
	setUl_TransportChannelType(ul_TransportChannelType);
	setRestrictedTrChIdentity(restrictedTrChIdentity);
	setAllowedTFI_List(allowedTFI_List);
    }
    
    /**
     * Construct with required components.
     */
    public RestrictedTrChInfo(UL_TrCH_Type ul_TransportChannelType, 
		    TransportChannelIdentity restrictedTrChIdentity)
    {
	setUl_TransportChannelType(ul_TransportChannelType);
	setRestrictedTrChIdentity(restrictedTrChIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = UL_TrCH_Type.dch;
	mComponents[1] = new TransportChannelIdentity();
	mComponents[2] = new AllowedTFI_List();
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
		return UL_TrCH_Type.dch;
	    case 1:
		return new TransportChannelIdentity();
	    case 2:
		return new AllowedTFI_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_TransportChannelType"
    public UL_TrCH_Type getUl_TransportChannelType()
    {
	return (UL_TrCH_Type)mComponents[0];
    }
    
    public void setUl_TransportChannelType(UL_TrCH_Type ul_TransportChannelType)
    {
	mComponents[0] = ul_TransportChannelType;
    }
    
    
    // Methods for field "restrictedTrChIdentity"
    public TransportChannelIdentity getRestrictedTrChIdentity()
    {
	return (TransportChannelIdentity)mComponents[1];
    }
    
    public void setRestrictedTrChIdentity(TransportChannelIdentity restrictedTrChIdentity)
    {
	mComponents[1] = restrictedTrChIdentity;
    }
    
    
    // Methods for field "allowedTFI_List"
    public AllowedTFI_List getAllowedTFI_List()
    {
	return (AllowedTFI_List)mComponents[2];
    }
    
    public void setAllowedTFI_List(AllowedTFI_List allowedTFI_List)
    {
	mComponents[2] = allowedTFI_List;
    }
    
    public boolean hasAllowedTFI_List()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAllowedTFI_List()
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
	    "RestrictedTrChInfo"
	),
	new QName (
	    "InformationElements",
	    "RestrictedTrChInfo"
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
				"UL_TrCH_Type"
			    ),
			    new QName (
				"InformationElements",
				"UL-TrCH-Type"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dch",
					0
				    ),
				    new MemberListElement (
					"usch",
					1
				    )
				}
			    ),
			    0,
			    UL_TrCH_Type.dch
			)
		    ),
		    "ul-TransportChannelType",
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
				"TransportChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransportChannelIdentity(1), 
				    new TransportChannelIdentity(32),
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
		    "restrictedTrChIdentity",
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
				"AllowedTFI_List"
			    ),
			    new QName (
				"InformationElements",
				"AllowedTFI-List"
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
				new IntegerInfo (
				    new Tags (
					new short[] {
					    0x0002
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
					    new com.oss.asn1.INTEGER(0), 
					    new com.oss.asn1.INTEGER(31),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(31)
				    ),
				    null
				)
			    )
			)
		    ),
		    "allowedTFI-List",
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
     * Get the type descriptor (TypeInfo) of 'this' RestrictedTrChInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RestrictedTrChInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RestrictedTrChInfo
