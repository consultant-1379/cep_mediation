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
 * Define the ASN1 Type PagingPermissionWithAccessControlForSharedNetwork from ASN1 Module InformationElements.
 * @see Choice
 */

public class PagingPermissionWithAccessControlForSharedNetwork extends Choice {
    
    /**
     * The default constructor.
     */
    public PagingPermissionWithAccessControlForSharedNetwork()
    {
    }
    
    public static final  int  pagingPermissionWithAccessControlList_chosen = 1;
    public static final  int  pagingPermissionWithAccessControlForAll_chosen = 2;
    
    // Methods for field "pagingPermissionWithAccessControlList"
    public static PagingPermissionWithAccessControlForSharedNetwork createPagingPermissionWithAccessControlForSharedNetworkWithPagingPermissionWithAccessControlList(PagingPermissionWithAccessControlList pagingPermissionWithAccessControlList)
    {
	PagingPermissionWithAccessControlForSharedNetwork __object = new PagingPermissionWithAccessControlForSharedNetwork();

	__object.setPagingPermissionWithAccessControlList(pagingPermissionWithAccessControlList);
	return __object;
    }
    
    public boolean hasPagingPermissionWithAccessControlList()
    {
	return getChosenFlag() == pagingPermissionWithAccessControlList_chosen;
    }
    
    public void setPagingPermissionWithAccessControlList(PagingPermissionWithAccessControlList pagingPermissionWithAccessControlList)
    {
	setChosenValue(pagingPermissionWithAccessControlList);
	setChosenFlag(pagingPermissionWithAccessControlList_chosen);
    }
    
    
    // Methods for field "pagingPermissionWithAccessControlForAll"
    public static PagingPermissionWithAccessControlForSharedNetwork createPagingPermissionWithAccessControlForSharedNetworkWithPagingPermissionWithAccessControlForAll(PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlForAll)
    {
	PagingPermissionWithAccessControlForSharedNetwork __object = new PagingPermissionWithAccessControlForSharedNetwork();

	__object.setPagingPermissionWithAccessControlForAll(pagingPermissionWithAccessControlForAll);
	return __object;
    }
    
    public boolean hasPagingPermissionWithAccessControlForAll()
    {
	return getChosenFlag() == pagingPermissionWithAccessControlForAll_chosen;
    }
    
    public void setPagingPermissionWithAccessControlForAll(PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlForAll)
    {
	setChosenValue(pagingPermissionWithAccessControlForAll);
	setChosenFlag(pagingPermissionWithAccessControlForAll_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case pagingPermissionWithAccessControlList_chosen:
		return new PagingPermissionWithAccessControlList();
	    case pagingPermissionWithAccessControlForAll_chosen:
		return new PagingPermissionWithAccessControlParameters();
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
	    "PagingPermissionWithAccessControlForSharedNetwork"
	),
	new QName (
	    "InformationElements",
	    "PagingPermissionWithAccessControlForSharedNetwork"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PagingPermissionWithAccessControlList"
			    ),
			    new QName (
				"InformationElements",
				"PagingPermissionWithAccessControlList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PagingPermissionWithAccessControlList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PagingPermissionWithAccessControlList"
				)
			    ),
			    0
			)
		    ),
		    "pagingPermissionWithAccessControlList",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "pagingPermissionWithAccessControlForAll",
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
     * Get the type descriptor (TypeInfo) of 'this' PagingPermissionWithAccessControlForSharedNetwork object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PagingPermissionWithAccessControlForSharedNetwork object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PagingPermissionWithAccessControlForSharedNetwork
