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
 * Define the ASN1 Type SysInfoType3_v860ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType3_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType3_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType3_v860ext_IEs(CSG_Identity csgIdentity, 
		    CSG_PSCSplitInfo csg_PSCSplitInfo)
    {
	setCsgIdentity(csgIdentity);
	setCsg_PSCSplitInfo(csg_PSCSplitInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CSG_Identity();
	mComponents[1] = new CSG_PSCSplitInfo();
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
		return new CSG_Identity();
	    case 1:
		return new CSG_PSCSplitInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "csgIdentity"
    public CSG_Identity getCsgIdentity()
    {
	return (CSG_Identity)mComponents[0];
    }
    
    public void setCsgIdentity(CSG_Identity csgIdentity)
    {
	mComponents[0] = csgIdentity;
    }
    
    public boolean hasCsgIdentity()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCsgIdentity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "csg_PSCSplitInfo"
    public CSG_PSCSplitInfo getCsg_PSCSplitInfo()
    {
	return (CSG_PSCSplitInfo)mComponents[1];
    }
    
    public void setCsg_PSCSplitInfo(CSG_PSCSplitInfo csg_PSCSplitInfo)
    {
	mComponents[1] = csg_PSCSplitInfo;
    }
    
    public boolean hasCsg_PSCSplitInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCsg_PSCSplitInfo()
    {
	setComponentAbsent(1);
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
	    "SysInfoType3_v860ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType3-v860ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CSG_Identity"
			    ),
			    new QName (
				"InformationElements",
				"CSG-Identity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(27)
				)
			    ),
			    new Bounds (
				new java.lang.Long(27),
				new java.lang.Long(27)
			    ),
			    null
			)
		    ),
		    "csgIdentity",
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
				"CSG_PSCSplitInfo"
			    ),
			    new QName (
				"InformationElements",
				"CSG-PSCSplitInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CSG_PSCSplitInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CSG_PSCSplitInfo"
				)
			    ),
			    0
			)
		    ),
		    "csg-PSCSplitInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType3_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType3_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType3_v860ext_IEs
