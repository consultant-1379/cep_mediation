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
 * Define the ASN1 Type SysInfoType3_v830ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType3_v830ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType3_v830ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType3_v830ext_IEs(PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForPLMNOfMIB, 
		    PagingPermissionWithAccessControlForSharedNetwork pagingPermissionWithAccessControlParametersForSharedNetwork)
    {
	setPagingPermissionWithAccessControlParametersForPLMNOfMIB(pagingPermissionWithAccessControlParametersForPLMNOfMIB);
	setPagingPermissionWithAccessControlParametersForSharedNetwork(pagingPermissionWithAccessControlParametersForSharedNetwork);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PagingPermissionWithAccessControlParameters();
	mComponents[1] = new PagingPermissionWithAccessControlForSharedNetwork();
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
		return new PagingPermissionWithAccessControlParameters();
	    case 1:
		return new PagingPermissionWithAccessControlForSharedNetwork();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pagingPermissionWithAccessControlParametersForPLMNOfMIB"
    public PagingPermissionWithAccessControlParameters getPagingPermissionWithAccessControlParametersForPLMNOfMIB()
    {
	return (PagingPermissionWithAccessControlParameters)mComponents[0];
    }
    
    public void setPagingPermissionWithAccessControlParametersForPLMNOfMIB(PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForPLMNOfMIB)
    {
	mComponents[0] = pagingPermissionWithAccessControlParametersForPLMNOfMIB;
    }
    
    public boolean hasPagingPermissionWithAccessControlParametersForPLMNOfMIB()
    {
	return componentIsPresent(0);
    }
    
    public void deletePagingPermissionWithAccessControlParametersForPLMNOfMIB()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pagingPermissionWithAccessControlParametersForSharedNetwork"
    public PagingPermissionWithAccessControlForSharedNetwork getPagingPermissionWithAccessControlParametersForSharedNetwork()
    {
	return (PagingPermissionWithAccessControlForSharedNetwork)mComponents[1];
    }
    
    public void setPagingPermissionWithAccessControlParametersForSharedNetwork(PagingPermissionWithAccessControlForSharedNetwork pagingPermissionWithAccessControlParametersForSharedNetwork)
    {
	mComponents[1] = pagingPermissionWithAccessControlParametersForSharedNetwork;
    }
    
    public boolean hasPagingPermissionWithAccessControlParametersForSharedNetwork()
    {
	return componentIsPresent(1);
    }
    
    public void deletePagingPermissionWithAccessControlParametersForSharedNetwork()
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
	    "SysInfoType3_v830ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType3-v830ext-IEs"
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
				"PagingPermissionWithAccessControlParameters"
			    ),
			    new QName (
				"InformationElements",
				"PagingPermissionWithAccessControlParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PagingPermissionWithAccessControlParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PagingPermissionWithAccessControlParameters"
				)
			    ),
			    0
			)
		    ),
		    "pagingPermissionWithAccessControlParametersForPLMNOfMIB",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PagingPermissionWithAccessControlForSharedNetwork"
			    ),
			    new QName (
				"InformationElements",
				"PagingPermissionWithAccessControlForSharedNetwork"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PagingPermissionWithAccessControlForSharedNetwork"
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
		    "pagingPermissionWithAccessControlParametersForSharedNetwork",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType3_v830ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType3_v830ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType3_v830ext_IEs
