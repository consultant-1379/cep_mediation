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
 * Define the ASN1 Type PagingPermissionWithAccessControlList from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PagingPermissionWithAccessControlList extends Sequence {
    
    /**
     * The default constructor.
     */
    public PagingPermissionWithAccessControlList()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PagingPermissionWithAccessControlList(PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForOperator1, 
		    PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForOperator2, 
		    PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForOperator3, 
		    PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForOperator4, 
		    PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForOperator5)
    {
	setPagingPermissionWithAccessControlParametersForOperator1(pagingPermissionWithAccessControlParametersForOperator1);
	setPagingPermissionWithAccessControlParametersForOperator2(pagingPermissionWithAccessControlParametersForOperator2);
	setPagingPermissionWithAccessControlParametersForOperator3(pagingPermissionWithAccessControlParametersForOperator3);
	setPagingPermissionWithAccessControlParametersForOperator4(pagingPermissionWithAccessControlParametersForOperator4);
	setPagingPermissionWithAccessControlParametersForOperator5(pagingPermissionWithAccessControlParametersForOperator5);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PagingPermissionWithAccessControlParameters();
	mComponents[1] = new PagingPermissionWithAccessControlParameters();
	mComponents[2] = new PagingPermissionWithAccessControlParameters();
	mComponents[3] = new PagingPermissionWithAccessControlParameters();
	mComponents[4] = new PagingPermissionWithAccessControlParameters();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PagingPermissionWithAccessControlParameters();
	    case 1:
		return new PagingPermissionWithAccessControlParameters();
	    case 2:
		return new PagingPermissionWithAccessControlParameters();
	    case 3:
		return new PagingPermissionWithAccessControlParameters();
	    case 4:
		return new PagingPermissionWithAccessControlParameters();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pagingPermissionWithAccessControlParametersForOperator1"
    public PagingPermissionWithAccessControlParameters getPagingPermissionWithAccessControlParametersForOperator1()
    {
	return (PagingPermissionWithAccessControlParameters)mComponents[0];
    }
    
    public void setPagingPermissionWithAccessControlParametersForOperator1(PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForOperator1)
    {
	mComponents[0] = pagingPermissionWithAccessControlParametersForOperator1;
    }
    
    public boolean hasPagingPermissionWithAccessControlParametersForOperator1()
    {
	return componentIsPresent(0);
    }
    
    public void deletePagingPermissionWithAccessControlParametersForOperator1()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pagingPermissionWithAccessControlParametersForOperator2"
    public PagingPermissionWithAccessControlParameters getPagingPermissionWithAccessControlParametersForOperator2()
    {
	return (PagingPermissionWithAccessControlParameters)mComponents[1];
    }
    
    public void setPagingPermissionWithAccessControlParametersForOperator2(PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForOperator2)
    {
	mComponents[1] = pagingPermissionWithAccessControlParametersForOperator2;
    }
    
    public boolean hasPagingPermissionWithAccessControlParametersForOperator2()
    {
	return componentIsPresent(1);
    }
    
    public void deletePagingPermissionWithAccessControlParametersForOperator2()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "pagingPermissionWithAccessControlParametersForOperator3"
    public PagingPermissionWithAccessControlParameters getPagingPermissionWithAccessControlParametersForOperator3()
    {
	return (PagingPermissionWithAccessControlParameters)mComponents[2];
    }
    
    public void setPagingPermissionWithAccessControlParametersForOperator3(PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForOperator3)
    {
	mComponents[2] = pagingPermissionWithAccessControlParametersForOperator3;
    }
    
    public boolean hasPagingPermissionWithAccessControlParametersForOperator3()
    {
	return componentIsPresent(2);
    }
    
    public void deletePagingPermissionWithAccessControlParametersForOperator3()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "pagingPermissionWithAccessControlParametersForOperator4"
    public PagingPermissionWithAccessControlParameters getPagingPermissionWithAccessControlParametersForOperator4()
    {
	return (PagingPermissionWithAccessControlParameters)mComponents[3];
    }
    
    public void setPagingPermissionWithAccessControlParametersForOperator4(PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForOperator4)
    {
	mComponents[3] = pagingPermissionWithAccessControlParametersForOperator4;
    }
    
    public boolean hasPagingPermissionWithAccessControlParametersForOperator4()
    {
	return componentIsPresent(3);
    }
    
    public void deletePagingPermissionWithAccessControlParametersForOperator4()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "pagingPermissionWithAccessControlParametersForOperator5"
    public PagingPermissionWithAccessControlParameters getPagingPermissionWithAccessControlParametersForOperator5()
    {
	return (PagingPermissionWithAccessControlParameters)mComponents[4];
    }
    
    public void setPagingPermissionWithAccessControlParametersForOperator5(PagingPermissionWithAccessControlParameters pagingPermissionWithAccessControlParametersForOperator5)
    {
	mComponents[4] = pagingPermissionWithAccessControlParametersForOperator5;
    }
    
    public boolean hasPagingPermissionWithAccessControlParametersForOperator5()
    {
	return componentIsPresent(4);
    }
    
    public void deletePagingPermissionWithAccessControlParametersForOperator5()
    {
	setComponentAbsent(4);
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
	    "PagingPermissionWithAccessControlList"
	),
	new QName (
	    "InformationElements",
	    "PagingPermissionWithAccessControlList"
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
		    "pagingPermissionWithAccessControlParametersForOperator1",
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
		    "pagingPermissionWithAccessControlParametersForOperator2",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "pagingPermissionWithAccessControlParametersForOperator3",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "pagingPermissionWithAccessControlParametersForOperator4",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "pagingPermissionWithAccessControlParametersForOperator5",
		    4,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PagingPermissionWithAccessControlList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PagingPermissionWithAccessControlList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PagingPermissionWithAccessControlList
