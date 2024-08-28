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
 * Define the ASN1 Type Pre_RedirectionInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Pre_RedirectionInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public Pre_RedirectionInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Pre_RedirectionInfo(BOOLEAN supportEUTRA_FDD, 
		    BOOLEAN supportEUTRA_TDD)
    {
	setSupportEUTRA_FDD(supportEUTRA_FDD);
	setSupportEUTRA_TDD(supportEUTRA_TDD);
    }
    
    /**
     * Construct with components.
     */
    public Pre_RedirectionInfo(boolean supportEUTRA_FDD, 
		    boolean supportEUTRA_TDD)
    {
	this(new BOOLEAN(supportEUTRA_FDD), new BOOLEAN(supportEUTRA_TDD));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
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
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportEUTRA_FDD"
    public boolean getSupportEUTRA_FDD()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setSupportEUTRA_FDD(boolean supportEUTRA_FDD)
    {
	setSupportEUTRA_FDD(new BOOLEAN(supportEUTRA_FDD));
    }
    
    public void setSupportEUTRA_FDD(BOOLEAN supportEUTRA_FDD)
    {
	mComponents[0] = supportEUTRA_FDD;
    }
    
    
    // Methods for field "supportEUTRA_TDD"
    public boolean getSupportEUTRA_TDD()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setSupportEUTRA_TDD(boolean supportEUTRA_TDD)
    {
	setSupportEUTRA_TDD(new BOOLEAN(supportEUTRA_TDD));
    }
    
    public void setSupportEUTRA_TDD(BOOLEAN supportEUTRA_TDD)
    {
	mComponents[1] = supportEUTRA_TDD;
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
	    "Pre_RedirectionInfo"
	),
	new QName (
	    "InformationElements",
	    "Pre-RedirectionInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "supportEUTRA-FDD",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "supportEUTRA-TDD",
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
     * Get the type descriptor (TypeInfo) of 'this' Pre_RedirectionInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Pre_RedirectionInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Pre_RedirectionInfo
