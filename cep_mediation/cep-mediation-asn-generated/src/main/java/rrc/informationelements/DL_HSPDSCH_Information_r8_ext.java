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
 * Define the ASN1 Type DL_HSPDSCH_Information_r8_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_HSPDSCH_Information_r8_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_HSPDSCH_Information_r8_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_HSPDSCH_Information_r8_ext(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[0];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[0] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  tdd_chosen = 1;
	public static final  int  fdd_chosen = 2;
	
	// Methods for field "tdd"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Tdd tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd from ASN1 Module InformationElements.
	 * @see Choice
	 */
	public static class Tdd extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    public static final  int  tdd384_chosen = 1;
	    public static final  int  tdd768_chosen = 2;
	    public static final  int  tdd128_chosen = 3;
	    
	    // Methods for field "tdd384"
	    public static Tdd createTddWithTdd384(Null tdd384)
	    {
		Tdd __object = new Tdd();

		__object.setTdd384(tdd384);
		return __object;
	    }
	    
	    public boolean hasTdd384()
	    {
		return getChosenFlag() == tdd384_chosen;
	    }
	    
	    public void setTdd384(Null tdd384)
	    {
		setChosenValue(tdd384);
		setChosenFlag(tdd384_chosen);
	    }
	    
	    
	    // Methods for field "tdd768"
	    public static Tdd createTddWithTdd768(Null tdd768)
	    {
		Tdd __object = new Tdd();

		__object.setTdd768(tdd768);
		return __object;
	    }
	    
	    public boolean hasTdd768()
	    {
		return getChosenFlag() == tdd768_chosen;
	    }
	    
	    public void setTdd768(Null tdd768)
	    {
		setChosenValue(tdd768);
		setChosenFlag(tdd768_chosen);
	    }
	    
	    
	    // Methods for field "tdd128"
	    public static Tdd createTddWithTdd128(Tdd128 tdd128)
	    {
		Tdd __object = new Tdd();

		__object.setTdd128(tdd128);
		return __object;
	    }
	    
	    public boolean hasTdd128()
	    {
		return getChosenFlag() == tdd128_chosen;
	    }
	    
	    public void setTdd128(Tdd128 tdd128)
	    {
		setChosenValue(tdd128);
		setChosenFlag(tdd128_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Tdd128 from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class Tdd128 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Tdd128()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Tdd128(OutofSyncWindow outofSyncWindow)
		{
		    setOutofSyncWindow(outofSyncWindow);
		}
		
		public void initComponents()
		{
		    mComponents[0] = OutofSyncWindow.ms40;
		}
		
		// Instance initializer
		{
		    mComponents = new AbstractData[1];
		}
		
		// Method to create a specific component instance
		public AbstractData createInstance(int index)
		{
		    switch (index) {
			case 0:
			    return OutofSyncWindow.ms40;
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "outofSyncWindow"
		public OutofSyncWindow getOutofSyncWindow()
		{
		    return (OutofSyncWindow)mComponents[0];
		}
		
		public void setOutofSyncWindow(OutofSyncWindow outofSyncWindow)
		{
		    mComponents[0] = outofSyncWindow;
		}
		
		public boolean hasOutofSyncWindow()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteOutofSyncWindow()
		{
		    setComponentAbsent(0);
		}
		
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final SequenceInfo c_typeinfo = new SequenceInfo (
		    new Tags (
			new short[] {
			    (short)0x8002
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"DL_HSPDSCH_Information_r8_ext$ModeSpecificInfo$Tdd$Tdd128"
		    ),
		    new QName (
			"builtin",
			"SEQUENCE"
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
					    "OutofSyncWindow"
					),
					new QName (
					    "InformationElements",
					    "OutofSyncWindow"
					),
					12314,
					null,
					new MemberList (
					    new MemberListElement[] {
						new MemberListElement (
						    "ms40",
						    0
						),
						new MemberListElement (
						    "ms80",
						    1
						),
						new MemberListElement (
						    "ms160",
						    2
						),
						new MemberListElement (
						    "ms320",
						    3
						),
						new MemberListElement (
						    "ms640",
						    4
						),
						new MemberListElement (
						    "spare3",
						    5
						),
						new MemberListElement (
						    "spare2",
						    6
						),
						new MemberListElement (
						    "spare1",
						    7
						)
					    }
					),
					0,
					OutofSyncWindow.ms40
				    )
				),
				"outofSyncWindow",
				0,
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
				    new TagDecoderElement((short)0x8000, 0)
				}
			    )
			}
		    ),
		    0
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' Tdd128 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Tdd128 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Tdd128

	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case tdd384_chosen:
			return new Null();
		    case tdd768_chosen:
			return new Null();
		    case tdd128_chosen:
			return new Tdd128();
		    default:
			throw new InternalError("Choice.createInstance()");
		}
		
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "DL_HSPDSCH_Information_r8_ext$ModeSpecificInfo$Tdd"
		),
		new QName (
		    "builtin",
		    "CHOICE"
		),
		12314,
		null,
		new Fields (
		    new FieldInfo[] {
			new FieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"Null"
				    ),
				    new QName (
					"builtin",
					"NULL"
				    ),
				    12314,
				    null
				)
			    ),
			    "tdd384",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"Null"
				    ),
				    new QName (
					"builtin",
					"NULL"
				    ),
				    12314,
				    null
				)
			    ),
			    "tdd768",
			    1,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r8_ext$ModeSpecificInfo$Tdd$Tdd128"
				)
			    ),
			    "tdd128",
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd

	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Null fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Null fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case tdd_chosen:
		    return new Tdd();
		case fdd_chosen:
		    return new Null();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_HSPDSCH_Information_r8_ext$ModeSpecificInfo"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"DL_HSPDSCH_Information_r8_ext$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
			    )
			),
			"fdd",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

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
	    "DL_HSPDSCH_Information_r8_ext"
	),
	new QName (
	    "InformationElements",
	    "DL-HSPDSCH-Information-r8-ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_HSPDSCH_Information_r8_ext$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_HSPDSCH_Information_r8_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_HSPDSCH_Information_r8_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_HSPDSCH_Information_r8_ext
