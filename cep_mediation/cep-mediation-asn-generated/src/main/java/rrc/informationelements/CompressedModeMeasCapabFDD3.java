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
 * Define the ASN1 Type CompressedModeMeasCapabFDD3 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CompressedModeMeasCapabFDD3 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompressedModeMeasCapabFDD3()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompressedModeMeasCapabFDD3(RadioFrequencyBandFDD3 radioFrequencyBandFDD3, 
		    BOOLEAN dl_MeasurementsFDD, BOOLEAN ul_MeasurementsFDD)
    {
	setRadioFrequencyBandFDD3(radioFrequencyBandFDD3);
	setDl_MeasurementsFDD(dl_MeasurementsFDD);
	setUl_MeasurementsFDD(ul_MeasurementsFDD);
    }
    
    /**
     * Construct with components.
     */
    public CompressedModeMeasCapabFDD3(RadioFrequencyBandFDD3 radioFrequencyBandFDD3, 
		    boolean dl_MeasurementsFDD, boolean ul_MeasurementsFDD)
    {
	this(radioFrequencyBandFDD3, new BOOLEAN(dl_MeasurementsFDD), 
	     new BOOLEAN(ul_MeasurementsFDD));
    }
    
    /**
     * Construct with required components.
     */
    public CompressedModeMeasCapabFDD3(boolean dl_MeasurementsFDD, 
		    boolean ul_MeasurementsFDD)
    {
	setDl_MeasurementsFDD(dl_MeasurementsFDD);
	setUl_MeasurementsFDD(ul_MeasurementsFDD);
    }
    
    public void initComponents()
    {
	mComponents[0] = RadioFrequencyBandFDD3.spare64;
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
		return RadioFrequencyBandFDD3.spare64;
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "radioFrequencyBandFDD3"
    public RadioFrequencyBandFDD3 getRadioFrequencyBandFDD3()
    {
	return (RadioFrequencyBandFDD3)mComponents[0];
    }
    
    public void setRadioFrequencyBandFDD3(RadioFrequencyBandFDD3 radioFrequencyBandFDD3)
    {
	mComponents[0] = radioFrequencyBandFDD3;
    }
    
    public boolean hasRadioFrequencyBandFDD3()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRadioFrequencyBandFDD3()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dl_MeasurementsFDD"
    public boolean getDl_MeasurementsFDD()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setDl_MeasurementsFDD(boolean dl_MeasurementsFDD)
    {
	setDl_MeasurementsFDD(new BOOLEAN(dl_MeasurementsFDD));
    }
    
    public void setDl_MeasurementsFDD(BOOLEAN dl_MeasurementsFDD)
    {
	mComponents[1] = dl_MeasurementsFDD;
    }
    
    
    // Methods for field "ul_MeasurementsFDD"
    public boolean getUl_MeasurementsFDD()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setUl_MeasurementsFDD(boolean ul_MeasurementsFDD)
    {
	setUl_MeasurementsFDD(new BOOLEAN(ul_MeasurementsFDD));
    }
    
    public void setUl_MeasurementsFDD(BOOLEAN ul_MeasurementsFDD)
    {
	mComponents[2] = ul_MeasurementsFDD;
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
	    "CompressedModeMeasCapabFDD3"
	),
	new QName (
	    "InformationElements",
	    "CompressedModeMeasCapabFDD3"
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
				"RadioFrequencyBandFDD3"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandFDD3"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"spare64",
					0
				    ),
				    new MemberListElement (
					"spare63",
					1
				    ),
				    new MemberListElement (
					"bandXXV",
					2
				    ),
				    new MemberListElement (
					"spare61",
					3
				    ),
				    new MemberListElement (
					"spare60",
					4
				    ),
				    new MemberListElement (
					"spare59",
					5
				    ),
				    new MemberListElement (
					"spare58",
					6
				    ),
				    new MemberListElement (
					"spare57",
					7
				    ),
				    new MemberListElement (
					"spare56",
					8
				    ),
				    new MemberListElement (
					"spare55",
					9
				    ),
				    new MemberListElement (
					"spare54",
					10
				    ),
				    new MemberListElement (
					"spare53",
					11
				    ),
				    new MemberListElement (
					"spare52",
					12
				    ),
				    new MemberListElement (
					"spare51",
					13
				    ),
				    new MemberListElement (
					"spare50",
					14
				    ),
				    new MemberListElement (
					"spare49",
					15
				    ),
				    new MemberListElement (
					"spare48",
					16
				    ),
				    new MemberListElement (
					"spare47",
					17
				    ),
				    new MemberListElement (
					"spare46",
					18
				    ),
				    new MemberListElement (
					"spare45",
					19
				    ),
				    new MemberListElement (
					"spare44",
					20
				    ),
				    new MemberListElement (
					"spare43",
					21
				    ),
				    new MemberListElement (
					"spare42",
					22
				    ),
				    new MemberListElement (
					"spare41",
					23
				    ),
				    new MemberListElement (
					"spare40",
					24
				    ),
				    new MemberListElement (
					"spare39",
					25
				    ),
				    new MemberListElement (
					"spare38",
					26
				    ),
				    new MemberListElement (
					"spare37",
					27
				    ),
				    new MemberListElement (
					"spare36",
					28
				    ),
				    new MemberListElement (
					"spare35",
					29
				    ),
				    new MemberListElement (
					"spare34",
					30
				    ),
				    new MemberListElement (
					"spare33",
					31
				    ),
				    new MemberListElement (
					"spare32",
					32
				    ),
				    new MemberListElement (
					"spare31",
					33
				    ),
				    new MemberListElement (
					"spare30",
					34
				    ),
				    new MemberListElement (
					"spare29",
					35
				    ),
				    new MemberListElement (
					"spare28",
					36
				    ),
				    new MemberListElement (
					"spare27",
					37
				    ),
				    new MemberListElement (
					"spare26",
					38
				    ),
				    new MemberListElement (
					"spare25",
					39
				    ),
				    new MemberListElement (
					"spare24",
					40
				    ),
				    new MemberListElement (
					"spare23",
					41
				    ),
				    new MemberListElement (
					"spare22",
					42
				    ),
				    new MemberListElement (
					"spare21",
					43
				    ),
				    new MemberListElement (
					"spare20",
					44
				    ),
				    new MemberListElement (
					"spare19",
					45
				    ),
				    new MemberListElement (
					"spare18",
					46
				    ),
				    new MemberListElement (
					"spare17",
					47
				    ),
				    new MemberListElement (
					"spare16",
					48
				    ),
				    new MemberListElement (
					"spare15",
					49
				    ),
				    new MemberListElement (
					"spare14",
					50
				    ),
				    new MemberListElement (
					"spare13",
					51
				    ),
				    new MemberListElement (
					"spare12",
					52
				    ),
				    new MemberListElement (
					"spare11",
					53
				    ),
				    new MemberListElement (
					"spare10",
					54
				    ),
				    new MemberListElement (
					"spare9",
					55
				    ),
				    new MemberListElement (
					"spare8",
					56
				    ),
				    new MemberListElement (
					"spare7",
					57
				    ),
				    new MemberListElement (
					"spare6",
					58
				    ),
				    new MemberListElement (
					"spare5",
					59
				    ),
				    new MemberListElement (
					"spare4",
					60
				    ),
				    new MemberListElement (
					"spare3",
					61
				    ),
				    new MemberListElement (
					"spare2",
					62
				    ),
				    new MemberListElement (
					"extension-indicator",
					63
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandFDD3.spare64
			)
		    ),
		    "radioFrequencyBandFDD3",
		    0,
		    3,
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
		    "dl-MeasurementsFDD",
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
		    "ul-MeasurementsFDD",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' CompressedModeMeasCapabFDD3 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompressedModeMeasCapabFDD3 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompressedModeMeasCapabFDD3
