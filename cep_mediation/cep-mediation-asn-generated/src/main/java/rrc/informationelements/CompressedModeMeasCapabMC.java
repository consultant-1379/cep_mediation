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
 * Define the ASN1 Type CompressedModeMeasCapabMC from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CompressedModeMeasCapabMC extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompressedModeMeasCapabMC()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompressedModeMeasCapabMC(BOOLEAN dl_MeasurementsMC, 
		    BOOLEAN ul_MeasurementsMC)
    {
	setDl_MeasurementsMC(dl_MeasurementsMC);
	setUl_MeasurementsMC(ul_MeasurementsMC);
    }
    
    /**
     * Construct with components.
     */
    public CompressedModeMeasCapabMC(boolean dl_MeasurementsMC, 
		    boolean ul_MeasurementsMC)
    {
	this(new BOOLEAN(dl_MeasurementsMC), new BOOLEAN(ul_MeasurementsMC));
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
    
    
    // Methods for field "dl_MeasurementsMC"
    public boolean getDl_MeasurementsMC()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setDl_MeasurementsMC(boolean dl_MeasurementsMC)
    {
	setDl_MeasurementsMC(new BOOLEAN(dl_MeasurementsMC));
    }
    
    public void setDl_MeasurementsMC(BOOLEAN dl_MeasurementsMC)
    {
	mComponents[0] = dl_MeasurementsMC;
    }
    
    
    // Methods for field "ul_MeasurementsMC"
    public boolean getUl_MeasurementsMC()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setUl_MeasurementsMC(boolean ul_MeasurementsMC)
    {
	setUl_MeasurementsMC(new BOOLEAN(ul_MeasurementsMC));
    }
    
    public void setUl_MeasurementsMC(BOOLEAN ul_MeasurementsMC)
    {
	mComponents[1] = ul_MeasurementsMC;
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
	    "CompressedModeMeasCapabMC"
	),
	new QName (
	    "InformationElements",
	    "CompressedModeMeasCapabMC"
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
		    "dl-MeasurementsMC",
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
		    "ul-MeasurementsMC",
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
     * Get the type descriptor (TypeInfo) of 'this' CompressedModeMeasCapabMC object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompressedModeMeasCapabMC object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompressedModeMeasCapabMC
