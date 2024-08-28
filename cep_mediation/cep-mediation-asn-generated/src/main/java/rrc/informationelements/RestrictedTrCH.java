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
 * Define the ASN1 Type RestrictedTrCH from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RestrictedTrCH extends Sequence {
    
    /**
     * The default constructor.
     */
    public RestrictedTrCH()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RestrictedTrCH(DL_TrCH_Type dl_restrictedTrCh_Type, 
		    TransportChannelIdentity restrictedDL_TrCH_Identity, 
		    AllowedTFI_List allowedTFIList)
    {
	setDl_restrictedTrCh_Type(dl_restrictedTrCh_Type);
	setRestrictedDL_TrCH_Identity(restrictedDL_TrCH_Identity);
	setAllowedTFIList(allowedTFIList);
    }
    
    public void initComponents()
    {
	mComponents[0] = DL_TrCH_Type.dch;
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
		return DL_TrCH_Type.dch;
	    case 1:
		return new TransportChannelIdentity();
	    case 2:
		return new AllowedTFI_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_restrictedTrCh_Type"
    public DL_TrCH_Type getDl_restrictedTrCh_Type()
    {
	return (DL_TrCH_Type)mComponents[0];
    }
    
    public void setDl_restrictedTrCh_Type(DL_TrCH_Type dl_restrictedTrCh_Type)
    {
	mComponents[0] = dl_restrictedTrCh_Type;
    }
    
    
    // Methods for field "restrictedDL_TrCH_Identity"
    public TransportChannelIdentity getRestrictedDL_TrCH_Identity()
    {
	return (TransportChannelIdentity)mComponents[1];
    }
    
    public void setRestrictedDL_TrCH_Identity(TransportChannelIdentity restrictedDL_TrCH_Identity)
    {
	mComponents[1] = restrictedDL_TrCH_Identity;
    }
    
    
    // Methods for field "allowedTFIList"
    public AllowedTFI_List getAllowedTFIList()
    {
	return (AllowedTFI_List)mComponents[2];
    }
    
    public void setAllowedTFIList(AllowedTFI_List allowedTFIList)
    {
	mComponents[2] = allowedTFIList;
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
	    "RestrictedTrCH"
	),
	new QName (
	    "InformationElements",
	    "RestrictedTrCH"
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
				"DL_TrCH_Type"
			    ),
			    new QName (
				"InformationElements",
				"DL-TrCH-Type"
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
					"dsch",
					1
				    )
				}
			    ),
			    0,
			    DL_TrCH_Type.dch
			)
		    ),
		    "dl-restrictedTrCh-Type",
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
		    "restrictedDL-TrCH-Identity",
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
		    "allowedTFIList",
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
     * Get the type descriptor (TypeInfo) of 'this' RestrictedTrCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RestrictedTrCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RestrictedTrCH
