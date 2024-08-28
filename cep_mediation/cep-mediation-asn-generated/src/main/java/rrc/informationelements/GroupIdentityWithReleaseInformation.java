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
 * Define the ASN1 Type GroupIdentityWithReleaseInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GroupIdentityWithReleaseInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public GroupIdentityWithReleaseInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GroupIdentityWithReleaseInformation(RRC_ConnectionReleaseInformation rrc_ConnectionReleaseInformation, 
		    GroupReleaseInformation groupReleaseInformation)
    {
	setRrc_ConnectionReleaseInformation(rrc_ConnectionReleaseInformation);
	setGroupReleaseInformation(groupReleaseInformation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RRC_ConnectionReleaseInformation();
	mComponents[1] = new GroupReleaseInformation();
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
		return new RRC_ConnectionReleaseInformation();
	    case 1:
		return new GroupReleaseInformation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_ConnectionReleaseInformation"
    public RRC_ConnectionReleaseInformation getRrc_ConnectionReleaseInformation()
    {
	return (RRC_ConnectionReleaseInformation)mComponents[0];
    }
    
    public void setRrc_ConnectionReleaseInformation(RRC_ConnectionReleaseInformation rrc_ConnectionReleaseInformation)
    {
	mComponents[0] = rrc_ConnectionReleaseInformation;
    }
    
    
    // Methods for field "groupReleaseInformation"
    public GroupReleaseInformation getGroupReleaseInformation()
    {
	return (GroupReleaseInformation)mComponents[1];
    }
    
    public void setGroupReleaseInformation(GroupReleaseInformation groupReleaseInformation)
    {
	mComponents[1] = groupReleaseInformation;
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
	    "GroupIdentityWithReleaseInformation"
	),
	new QName (
	    "InformationElements",
	    "GroupIdentityWithReleaseInformation"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RRC_ConnectionReleaseInformation"
			    ),
			    new QName (
				"InformationElements",
				"RRC-ConnectionReleaseInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RRC_ConnectionReleaseInformation"
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
		    "rrc-ConnectionReleaseInformation",
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
				"GroupReleaseInformation"
			    ),
			    new QName (
				"InformationElements",
				"GroupReleaseInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "GroupReleaseInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "GroupReleaseInformation"
				)
			    ),
			    0
			)
		    ),
		    "groupReleaseInformation",
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
     * Get the type descriptor (TypeInfo) of 'this' GroupIdentityWithReleaseInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GroupIdentityWithReleaseInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GroupIdentityWithReleaseInformation
