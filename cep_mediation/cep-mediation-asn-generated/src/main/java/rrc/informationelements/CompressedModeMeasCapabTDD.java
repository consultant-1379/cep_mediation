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
 * Define the ASN1 Type CompressedModeMeasCapabTDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CompressedModeMeasCapabTDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompressedModeMeasCapabTDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompressedModeMeasCapabTDD(RadioFrequencyBandTDD radioFrequencyBandTDD, 
		    BOOLEAN dl_MeasurementsTDD, BOOLEAN ul_MeasurementsTDD)
    {
	setRadioFrequencyBandTDD(radioFrequencyBandTDD);
	setDl_MeasurementsTDD(dl_MeasurementsTDD);
	setUl_MeasurementsTDD(ul_MeasurementsTDD);
    }
    
    /**
     * Construct with components.
     */
    public CompressedModeMeasCapabTDD(RadioFrequencyBandTDD radioFrequencyBandTDD, 
		    boolean dl_MeasurementsTDD, boolean ul_MeasurementsTDD)
    {
	this(radioFrequencyBandTDD, new BOOLEAN(dl_MeasurementsTDD), 
	     new BOOLEAN(ul_MeasurementsTDD));
    }
    
    public void initComponents()
    {
	mComponents[0] = RadioFrequencyBandTDD.a;
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
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
		return RadioFrequencyBandTDD.a;
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "radioFrequencyBandTDD"
    public RadioFrequencyBandTDD getRadioFrequencyBandTDD()
    {
	return (RadioFrequencyBandTDD)mComponents[0];
    }
    
    public void setRadioFrequencyBandTDD(RadioFrequencyBandTDD radioFrequencyBandTDD)
    {
	mComponents[0] = radioFrequencyBandTDD;
    }
    
    
    // Methods for field "dl_MeasurementsTDD"
    public boolean getDl_MeasurementsTDD()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setDl_MeasurementsTDD(boolean dl_MeasurementsTDD)
    {
	setDl_MeasurementsTDD(new BOOLEAN(dl_MeasurementsTDD));
    }
    
    public void setDl_MeasurementsTDD(BOOLEAN dl_MeasurementsTDD)
    {
	mComponents[1] = dl_MeasurementsTDD;
    }
    
    
    // Methods for field "ul_MeasurementsTDD"
    public boolean getUl_MeasurementsTDD()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setUl_MeasurementsTDD(boolean ul_MeasurementsTDD)
    {
	setUl_MeasurementsTDD(new BOOLEAN(ul_MeasurementsTDD));
    }
    
    public void setUl_MeasurementsTDD(BOOLEAN ul_MeasurementsTDD)
    {
	mComponents[2] = ul_MeasurementsTDD;
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
	    "CompressedModeMeasCapabTDD"
	),
	new QName (
	    "InformationElements",
	    "CompressedModeMeasCapabTDD"
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
				"RadioFrequencyBandTDD"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandTDD"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"a",
					0
				    ),
				    new MemberListElement (
					"b",
					1
				    ),
				    new MemberListElement (
					"c",
					2
				    ),
				    new MemberListElement (
					"d",
					3
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandTDD.a
			)
		    ),
		    "radioFrequencyBandTDD",
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
		    "dl-MeasurementsTDD",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "ul-MeasurementsTDD",
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
     * Get the type descriptor (TypeInfo) of 'this' CompressedModeMeasCapabTDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompressedModeMeasCapabTDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompressedModeMeasCapabTDD
