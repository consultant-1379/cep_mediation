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
 * Define the ASN1 Type CompressedModeMeasCapabFDD2 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CompressedModeMeasCapabFDD2 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompressedModeMeasCapabFDD2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompressedModeMeasCapabFDD2(RadioFrequencyBandFDD radioFrequencyBandFDD, 
		    RadioFrequencyBandFDD2 radioFrequencyBandFDD2, 
		    BOOLEAN dl_MeasurementsFDD, BOOLEAN ul_MeasurementsFDD)
    {
	setRadioFrequencyBandFDD(radioFrequencyBandFDD);
	setRadioFrequencyBandFDD2(radioFrequencyBandFDD2);
	setDl_MeasurementsFDD(dl_MeasurementsFDD);
	setUl_MeasurementsFDD(ul_MeasurementsFDD);
    }
    
    /**
     * Construct with components.
     */
    public CompressedModeMeasCapabFDD2(RadioFrequencyBandFDD radioFrequencyBandFDD, 
		    RadioFrequencyBandFDD2 radioFrequencyBandFDD2, 
		    boolean dl_MeasurementsFDD, boolean ul_MeasurementsFDD)
    {
	this(radioFrequencyBandFDD, radioFrequencyBandFDD2, 
	     new BOOLEAN(dl_MeasurementsFDD), 
	     new BOOLEAN(ul_MeasurementsFDD));
    }
    
    /**
     * Construct with required components.
     */
    public CompressedModeMeasCapabFDD2(boolean dl_MeasurementsFDD, 
		    boolean ul_MeasurementsFDD)
    {
	setDl_MeasurementsFDD(dl_MeasurementsFDD);
	setUl_MeasurementsFDD(ul_MeasurementsFDD);
    }
    
    public void initComponents()
    {
	mComponents[0] = RadioFrequencyBandFDD.fdd2100;
	mComponents[1] = RadioFrequencyBandFDD2.bandVIII;
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return RadioFrequencyBandFDD.fdd2100;
	    case 1:
		return RadioFrequencyBandFDD2.bandVIII;
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "radioFrequencyBandFDD"
    public RadioFrequencyBandFDD getRadioFrequencyBandFDD()
    {
	return (RadioFrequencyBandFDD)mComponents[0];
    }
    
    public void setRadioFrequencyBandFDD(RadioFrequencyBandFDD radioFrequencyBandFDD)
    {
	mComponents[0] = radioFrequencyBandFDD;
    }
    
    public boolean hasRadioFrequencyBandFDD()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRadioFrequencyBandFDD()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "radioFrequencyBandFDD2"
    public RadioFrequencyBandFDD2 getRadioFrequencyBandFDD2()
    {
	return (RadioFrequencyBandFDD2)mComponents[1];
    }
    
    public void setRadioFrequencyBandFDD2(RadioFrequencyBandFDD2 radioFrequencyBandFDD2)
    {
	mComponents[1] = radioFrequencyBandFDD2;
    }
    
    public boolean hasRadioFrequencyBandFDD2()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRadioFrequencyBandFDD2()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dl_MeasurementsFDD"
    public boolean getDl_MeasurementsFDD()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setDl_MeasurementsFDD(boolean dl_MeasurementsFDD)
    {
	setDl_MeasurementsFDD(new BOOLEAN(dl_MeasurementsFDD));
    }
    
    public void setDl_MeasurementsFDD(BOOLEAN dl_MeasurementsFDD)
    {
	mComponents[2] = dl_MeasurementsFDD;
    }
    
    
    // Methods for field "ul_MeasurementsFDD"
    public boolean getUl_MeasurementsFDD()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setUl_MeasurementsFDD(boolean ul_MeasurementsFDD)
    {
	setUl_MeasurementsFDD(new BOOLEAN(ul_MeasurementsFDD));
    }
    
    public void setUl_MeasurementsFDD(BOOLEAN ul_MeasurementsFDD)
    {
	mComponents[3] = ul_MeasurementsFDD;
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
	    "CompressedModeMeasCapabFDD2"
	),
	new QName (
	    "InformationElements",
	    "CompressedModeMeasCapabFDD2"
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
				"RadioFrequencyBandFDD"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandFDD"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"fdd2100",
					0
				    ),
				    new MemberListElement (
					"fdd1900",
					1
				    ),
				    new MemberListElement (
					"fdd1800",
					2
				    ),
				    new MemberListElement (
					"bandVI",
					3
				    ),
				    new MemberListElement (
					"bandIV",
					4
				    ),
				    new MemberListElement (
					"bandV",
					5
				    ),
				    new MemberListElement (
					"bandVII",
					6
				    ),
				    new MemberListElement (
					"extension-indicator",
					7
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandFDD.fdd2100
			)
		    ),
		    "radioFrequencyBandFDD",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RadioFrequencyBandFDD2"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandFDD2"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"bandVIII",
					0
				    ),
				    new MemberListElement (
					"bandIX",
					1
				    ),
				    new MemberListElement (
					"bandX",
					2
				    ),
				    new MemberListElement (
					"bandXI",
					3
				    ),
				    new MemberListElement (
					"bandXII",
					4
				    ),
				    new MemberListElement (
					"bandXIII",
					5
				    ),
				    new MemberListElement (
					"bandXIV",
					6
				    ),
				    new MemberListElement (
					"bandXV",
					7
				    ),
				    new MemberListElement (
					"bandXVI",
					8
				    ),
				    new MemberListElement (
					"bandXVII",
					9
				    ),
				    new MemberListElement (
					"bandXVIII",
					10
				    ),
				    new MemberListElement (
					"bandXIX",
					11
				    ),
				    new MemberListElement (
					"bandXX",
					12
				    ),
				    new MemberListElement (
					"bandXXI",
					13
				    ),
				    new MemberListElement (
					"bandXXII",
					14
				    ),
				    new MemberListElement (
					"extension-indicator",
					15
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandFDD2.bandVIII
			)
		    ),
		    "radioFrequencyBandFDD2",
		    1,
		    3,
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
		    "dl-MeasurementsFDD",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "ul-MeasurementsFDD",
		    3,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CompressedModeMeasCapabFDD2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompressedModeMeasCapabFDD2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompressedModeMeasCapabFDD2
