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
 * Define the ASN1 Type MultiRAT_Capability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MultiRAT_Capability extends Sequence {
    
    /**
     * The default constructor.
     */
    public MultiRAT_Capability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MultiRAT_Capability(BOOLEAN supportOfGSM, 
		    BOOLEAN supportOfMulticarrier)
    {
	setSupportOfGSM(supportOfGSM);
	setSupportOfMulticarrier(supportOfMulticarrier);
    }
    
    /**
     * Construct with components.
     */
    public MultiRAT_Capability(boolean supportOfGSM, 
		    boolean supportOfMulticarrier)
    {
	this(new BOOLEAN(supportOfGSM), new BOOLEAN(supportOfMulticarrier));
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
    
    
    // Methods for field "supportOfGSM"
    public boolean getSupportOfGSM()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setSupportOfGSM(boolean supportOfGSM)
    {
	setSupportOfGSM(new BOOLEAN(supportOfGSM));
    }
    
    public void setSupportOfGSM(BOOLEAN supportOfGSM)
    {
	mComponents[0] = supportOfGSM;
    }
    
    
    // Methods for field "supportOfMulticarrier"
    public boolean getSupportOfMulticarrier()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setSupportOfMulticarrier(boolean supportOfMulticarrier)
    {
	setSupportOfMulticarrier(new BOOLEAN(supportOfMulticarrier));
    }
    
    public void setSupportOfMulticarrier(BOOLEAN supportOfMulticarrier)
    {
	mComponents[1] = supportOfMulticarrier;
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
	    "MultiRAT_Capability"
	),
	new QName (
	    "InformationElements",
	    "MultiRAT-Capability"
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
		    "supportOfGSM",
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
		    "supportOfMulticarrier",
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
     * Get the type descriptor (TypeInfo) of 'this' MultiRAT_Capability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MultiRAT_Capability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MultiRAT_Capability
