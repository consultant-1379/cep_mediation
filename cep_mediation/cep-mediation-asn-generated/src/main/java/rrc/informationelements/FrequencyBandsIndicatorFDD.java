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
 * Define the ASN1 Type FrequencyBandsIndicatorFDD from ASN1 Module InformationElements.
 * @see Choice
 */

public class FrequencyBandsIndicatorFDD extends Choice {
    
    /**
     * The default constructor.
     */
    public FrequencyBandsIndicatorFDD()
    {
    }
    
    public static final  int  frequencyBandsIndicator1_chosen = 1;
    public static final  int  frequencyBandsIndicator2_chosen = 2;
    public static final  int  frequencyBandsIndicator3_chosen = 3;
    
    // Methods for field "frequencyBandsIndicator1"
    public static FrequencyBandsIndicatorFDD createFrequencyBandsIndicatorFDDWithFrequencyBandsIndicator1(RadioFrequencyBandFDD frequencyBandsIndicator1)
    {
	FrequencyBandsIndicatorFDD __object = new FrequencyBandsIndicatorFDD();

	__object.setFrequencyBandsIndicator1(frequencyBandsIndicator1);
	return __object;
    }
    
    public boolean hasFrequencyBandsIndicator1()
    {
	return getChosenFlag() == frequencyBandsIndicator1_chosen;
    }
    
    public void setFrequencyBandsIndicator1(RadioFrequencyBandFDD frequencyBandsIndicator1)
    {
	setChosenValue(frequencyBandsIndicator1);
	setChosenFlag(frequencyBandsIndicator1_chosen);
    }
    
    
    // Methods for field "frequencyBandsIndicator2"
    public static FrequencyBandsIndicatorFDD createFrequencyBandsIndicatorFDDWithFrequencyBandsIndicator2(RadioFrequencyBandFDD2 frequencyBandsIndicator2)
    {
	FrequencyBandsIndicatorFDD __object = new FrequencyBandsIndicatorFDD();

	__object.setFrequencyBandsIndicator2(frequencyBandsIndicator2);
	return __object;
    }
    
    public boolean hasFrequencyBandsIndicator2()
    {
	return getChosenFlag() == frequencyBandsIndicator2_chosen;
    }
    
    public void setFrequencyBandsIndicator2(RadioFrequencyBandFDD2 frequencyBandsIndicator2)
    {
	setChosenValue(frequencyBandsIndicator2);
	setChosenFlag(frequencyBandsIndicator2_chosen);
    }
    
    
    // Methods for field "frequencyBandsIndicator3"
    public static FrequencyBandsIndicatorFDD createFrequencyBandsIndicatorFDDWithFrequencyBandsIndicator3(RadioFrequencyBandFDD3 frequencyBandsIndicator3)
    {
	FrequencyBandsIndicatorFDD __object = new FrequencyBandsIndicatorFDD();

	__object.setFrequencyBandsIndicator3(frequencyBandsIndicator3);
	return __object;
    }
    
    public boolean hasFrequencyBandsIndicator3()
    {
	return getChosenFlag() == frequencyBandsIndicator3_chosen;
    }
    
    public void setFrequencyBandsIndicator3(RadioFrequencyBandFDD3 frequencyBandsIndicator3)
    {
	setChosenValue(frequencyBandsIndicator3);
	setChosenFlag(frequencyBandsIndicator3_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case frequencyBandsIndicator1_chosen:
		return RadioFrequencyBandFDD.fdd2100;
	    case frequencyBandsIndicator2_chosen:
		return RadioFrequencyBandFDD2.bandVIII;
	    case frequencyBandsIndicator3_chosen:
		return RadioFrequencyBandFDD3.spare64;
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
	    "FrequencyBandsIndicatorFDD"
	),
	new QName (
	    "InformationElements",
	    "FrequencyBandsIndicatorFDD"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
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
		    "frequencyBandsIndicator1",
		    0,
		    2
		),
		new FieldInfo (
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
		    "frequencyBandsIndicator2",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "frequencyBandsIndicator3",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' FrequencyBandsIndicatorFDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FrequencyBandsIndicatorFDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FrequencyBandsIndicatorFDD
