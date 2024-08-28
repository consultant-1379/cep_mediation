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
 * Define the ASN1 Type UE_RadioAccessCapabBandFDD4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabBandFDD4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabBandFDD4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabBandFDD4(RadioFrequencyBandFDD radioFrequencyBandFDD, 
		    RadioFrequencyBandFDD2 radioFrequencyBandFDD2, 
		    RadioFrequencyBandFDD3 radioFrequencyBandFDD3, 
		    AdditionalSecondaryCells additionalSecondaryCells, 
		    NonContiguousMultiCellCombinationList nonContiguousMultiCellCombinationList)
    {
	setRadioFrequencyBandFDD(radioFrequencyBandFDD);
	setRadioFrequencyBandFDD2(radioFrequencyBandFDD2);
	setRadioFrequencyBandFDD3(radioFrequencyBandFDD3);
	setAdditionalSecondaryCells(additionalSecondaryCells);
	setNonContiguousMultiCellCombinationList(nonContiguousMultiCellCombinationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = RadioFrequencyBandFDD.fdd2100;
	mComponents[1] = RadioFrequencyBandFDD2.bandVIII;
	mComponents[2] = RadioFrequencyBandFDD3.spare64;
	mComponents[3] = AdditionalSecondaryCells.a1;
	mComponents[4] = new NonContiguousMultiCellCombinationList();
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
		return RadioFrequencyBandFDD.fdd2100;
	    case 1:
		return RadioFrequencyBandFDD2.bandVIII;
	    case 2:
		return RadioFrequencyBandFDD3.spare64;
	    case 3:
		return AdditionalSecondaryCells.a1;
	    case 4:
		return new NonContiguousMultiCellCombinationList();
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
    
    
    // Methods for field "radioFrequencyBandFDD3"
    public RadioFrequencyBandFDD3 getRadioFrequencyBandFDD3()
    {
	return (RadioFrequencyBandFDD3)mComponents[2];
    }
    
    public void setRadioFrequencyBandFDD3(RadioFrequencyBandFDD3 radioFrequencyBandFDD3)
    {
	mComponents[2] = radioFrequencyBandFDD3;
    }
    
    public boolean hasRadioFrequencyBandFDD3()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRadioFrequencyBandFDD3()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "additionalSecondaryCells"
    public AdditionalSecondaryCells getAdditionalSecondaryCells()
    {
	return (AdditionalSecondaryCells)mComponents[3];
    }
    
    public void setAdditionalSecondaryCells(AdditionalSecondaryCells additionalSecondaryCells)
    {
	mComponents[3] = additionalSecondaryCells;
    }
    
    public boolean hasAdditionalSecondaryCells()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAdditionalSecondaryCells()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type AdditionalSecondaryCells from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class AdditionalSecondaryCells extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private AdditionalSecondaryCells()
	{
	    super(cFirstNumber);
	}
	
	protected AdditionalSecondaryCells(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final AdditionalSecondaryCells a1 =
	    new AdditionalSecondaryCells(0);
	public static final AdditionalSecondaryCells a2 =
	    new AdditionalSecondaryCells(1);
	private final static AdditionalSecondaryCells cNamedNumbers[] = {
	     a1, 
	     a2
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static AdditionalSecondaryCells valueOf(long value)
	{
	    return (AdditionalSecondaryCells)a1.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabBandFDD4$AdditionalSecondaryCells"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"a1",
			0
		    ),
		    new MemberListElement (
			"a2",
			1
		    )
		}
	    ),
	    0,
	    a1
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' AdditionalSecondaryCells object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' AdditionalSecondaryCells object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for AdditionalSecondaryCells

    // Methods for field "nonContiguousMultiCellCombinationList"
    public NonContiguousMultiCellCombinationList getNonContiguousMultiCellCombinationList()
    {
	return (NonContiguousMultiCellCombinationList)mComponents[4];
    }
    
    public void setNonContiguousMultiCellCombinationList(NonContiguousMultiCellCombinationList nonContiguousMultiCellCombinationList)
    {
	mComponents[4] = nonContiguousMultiCellCombinationList;
    }
    
    public boolean hasNonContiguousMultiCellCombinationList()
    {
	return componentIsPresent(4);
    }
    
    public void deleteNonContiguousMultiCellCombinationList()
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
	    "UE_RadioAccessCapabBandFDD4"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabBandFDD4"
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
		    "radioFrequencyBandFDD3",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabBandFDD4$AdditionalSecondaryCells"
			)
		    ),
		    "additionalSecondaryCells",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NonContiguousMultiCellCombinationList"
			    ),
			    new QName (
				"InformationElements",
				"NonContiguousMultiCellCombinationList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(3),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(3)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "NonContiguousMultiCell"
				)
			    )
			)
		    ),
		    "nonContiguousMultiCellCombinationList",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabBandFDD4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabBandFDD4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabBandFDD4
