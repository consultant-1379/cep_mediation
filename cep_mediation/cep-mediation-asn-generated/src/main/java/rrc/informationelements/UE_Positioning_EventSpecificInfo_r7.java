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
 * Define the ASN1 Type UE_Positioning_EventSpecificInfo_r7 from ASN1 Module InformationElements.
 * @see Choice
 */

public class UE_Positioning_EventSpecificInfo_r7 extends Choice {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_EventSpecificInfo_r7()
    {
    }
    
    public static final  int  e7a_chosen = 1;
    public static final  int  e7b_chosen = 2;
    public static final  int  e7c_chosen = 3;
    public static final  int  e7d_chosen = 4;
    
    // Methods for field "e7a"
    public static UE_Positioning_EventSpecificInfo_r7 createUE_Positioning_EventSpecificInfo_r7WithE7a(ThresholdPositionChange e7a)
    {
	UE_Positioning_EventSpecificInfo_r7 __object = new UE_Positioning_EventSpecificInfo_r7();

	__object.setE7a(e7a);
	return __object;
    }
    
    public boolean hasE7a()
    {
	return getChosenFlag() == e7a_chosen;
    }
    
    public void setE7a(ThresholdPositionChange e7a)
    {
	setChosenValue(e7a);
	setChosenFlag(e7a_chosen);
    }
    
    
    // Methods for field "e7b"
    public static UE_Positioning_EventSpecificInfo_r7 createUE_Positioning_EventSpecificInfo_r7WithE7b(ThresholdSFN_SFN_Change e7b)
    {
	UE_Positioning_EventSpecificInfo_r7 __object = new UE_Positioning_EventSpecificInfo_r7();

	__object.setE7b(e7b);
	return __object;
    }
    
    public boolean hasE7b()
    {
	return getChosenFlag() == e7b_chosen;
    }
    
    public void setE7b(ThresholdSFN_SFN_Change e7b)
    {
	setChosenValue(e7b);
	setChosenFlag(e7b_chosen);
    }
    
    
    // Methods for field "e7c"
    public static UE_Positioning_EventSpecificInfo_r7 createUE_Positioning_EventSpecificInfo_r7WithE7c(ThresholdSFN_GPS_TOW_us e7c)
    {
	UE_Positioning_EventSpecificInfo_r7 __object = new UE_Positioning_EventSpecificInfo_r7();

	__object.setE7c(e7c);
	return __object;
    }
    
    public boolean hasE7c()
    {
	return getChosenFlag() == e7c_chosen;
    }
    
    public void setE7c(ThresholdSFN_GPS_TOW_us e7c)
    {
	setChosenValue(e7c);
	setChosenFlag(e7c_chosen);
    }
    
    
    // Methods for field "e7d"
    public static UE_Positioning_EventSpecificInfo_r7 createUE_Positioning_EventSpecificInfo_r7WithE7d(ThresholdSFN_GANSS_TOW e7d)
    {
	UE_Positioning_EventSpecificInfo_r7 __object = new UE_Positioning_EventSpecificInfo_r7();

	__object.setE7d(e7d);
	return __object;
    }
    
    public boolean hasE7d()
    {
	return getChosenFlag() == e7d_chosen;
    }
    
    public void setE7d(ThresholdSFN_GANSS_TOW e7d)
    {
	setChosenValue(e7d);
	setChosenFlag(e7d_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case e7a_chosen:
		return ThresholdPositionChange.pc10;
	    case e7b_chosen:
		return ThresholdSFN_SFN_Change.c0_25;
	    case e7c_chosen:
		return ThresholdSFN_GPS_TOW_us.us1;
	    case e7d_chosen:
		return ThresholdSFN_GANSS_TOW.us1;
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
	    "UE_Positioning_EventSpecificInfo_r7"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-EventSpecificInfo-r7"
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
				"ThresholdPositionChange"
			    ),
			    new QName (
				"InformationElements",
				"ThresholdPositionChange"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pc10",
					0
				    ),
				    new MemberListElement (
					"pc20",
					1
				    ),
				    new MemberListElement (
					"pc30",
					2
				    ),
				    new MemberListElement (
					"pc40",
					3
				    ),
				    new MemberListElement (
					"pc50",
					4
				    ),
				    new MemberListElement (
					"pc100",
					5
				    ),
				    new MemberListElement (
					"pc200",
					6
				    ),
				    new MemberListElement (
					"pc300",
					7
				    ),
				    new MemberListElement (
					"pc500",
					8
				    ),
				    new MemberListElement (
					"pc1000",
					9
				    ),
				    new MemberListElement (
					"pc2000",
					10
				    ),
				    new MemberListElement (
					"pc5000",
					11
				    ),
				    new MemberListElement (
					"pc10000",
					12
				    ),
				    new MemberListElement (
					"pc20000",
					13
				    ),
				    new MemberListElement (
					"pc50000",
					14
				    ),
				    new MemberListElement (
					"pc100000",
					15
				    )
				}
			    ),
			    0,
			    ThresholdPositionChange.pc10
			)
		    ),
		    "e7a",
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
				"ThresholdSFN_SFN_Change"
			    ),
			    new QName (
				"InformationElements",
				"ThresholdSFN-SFN-Change"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"c0-25",
					0
				    ),
				    new MemberListElement (
					"c0-5",
					1
				    ),
				    new MemberListElement (
					"c1",
					2
				    ),
				    new MemberListElement (
					"c2",
					3
				    ),
				    new MemberListElement (
					"c3",
					4
				    ),
				    new MemberListElement (
					"c4",
					5
				    ),
				    new MemberListElement (
					"c5",
					6
				    ),
				    new MemberListElement (
					"c10",
					7
				    ),
				    new MemberListElement (
					"c20",
					8
				    ),
				    new MemberListElement (
					"c50",
					9
				    ),
				    new MemberListElement (
					"c100",
					10
				    ),
				    new MemberListElement (
					"c200",
					11
				    ),
				    new MemberListElement (
					"c500",
					12
				    ),
				    new MemberListElement (
					"c1000",
					13
				    ),
				    new MemberListElement (
					"c2000",
					14
				    ),
				    new MemberListElement (
					"c5000",
					15
				    )
				}
			    ),
			    0,
			    ThresholdSFN_SFN_Change.c0_25
			)
		    ),
		    "e7b",
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
				"ThresholdSFN_GPS_TOW_us"
			    ),
			    new QName (
				"InformationElements",
				"ThresholdSFN-GPS-TOW-us"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"us1",
					0
				    ),
				    new MemberListElement (
					"us2",
					1
				    ),
				    new MemberListElement (
					"us3",
					2
				    ),
				    new MemberListElement (
					"us5",
					3
				    ),
				    new MemberListElement (
					"us10",
					4
				    ),
				    new MemberListElement (
					"us20",
					5
				    ),
				    new MemberListElement (
					"us50",
					6
				    ),
				    new MemberListElement (
					"us100",
					7
				    )
				}
			    ),
			    0,
			    ThresholdSFN_GPS_TOW_us.us1
			)
		    ),
		    "e7c",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ThresholdSFN_GANSS_TOW"
			    ),
			    new QName (
				"InformationElements",
				"ThresholdSFN-GANSS-TOW"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"us1",
					0
				    ),
				    new MemberListElement (
					"us2",
					1
				    ),
				    new MemberListElement (
					"us3",
					2
				    ),
				    new MemberListElement (
					"us5",
					3
				    ),
				    new MemberListElement (
					"us10",
					4
				    ),
				    new MemberListElement (
					"us20",
					5
				    ),
				    new MemberListElement (
					"us50",
					6
				    ),
				    new MemberListElement (
					"us100",
					7
				    )
				}
			    ),
			    0,
			    ThresholdSFN_GANSS_TOW.us1
			)
		    ),
		    "e7d",
		    3,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_EventSpecificInfo_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_EventSpecificInfo_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_EventSpecificInfo_r7
