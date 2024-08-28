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
 * Define the ASN1 Type TM_SignallingInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TM_SignallingInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public TM_SignallingInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TM_SignallingInfo(MessType messType, 
		    Tm_SignallingMode tm_SignallingMode)
    {
	setMessType(messType);
	setTm_SignallingMode(tm_SignallingMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = MessType.transportFormatCombinationControl;
	mComponents[1] = new Tm_SignallingMode();
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
		return MessType.transportFormatCombinationControl;
	    case 1:
		return new Tm_SignallingMode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "messType"
    public MessType getMessType()
    {
	return (MessType)mComponents[0];
    }
    
    public void setMessType(MessType messType)
    {
	mComponents[0] = messType;
    }
    
    
    // Methods for field "tm_SignallingMode"
    public Tm_SignallingMode getTm_SignallingMode()
    {
	return (Tm_SignallingMode)mComponents[1];
    }
    
    public void setTm_SignallingMode(Tm_SignallingMode tm_SignallingMode)
    {
	mComponents[1] = tm_SignallingMode;
    }
    
    
    
    /**
     * Define the ASN1 Type Tm_SignallingMode from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tm_SignallingMode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tm_SignallingMode()
	{
	}
	
	public static final  int  mode1_chosen = 1;
	public static final  int  mode2_chosen = 2;
	
	// Methods for field "mode1"
	public static Tm_SignallingMode createTm_SignallingModeWithMode1(Null mode1)
	{
	    Tm_SignallingMode __object = new Tm_SignallingMode();

	    __object.setMode1(mode1);
	    return __object;
	}
	
	public boolean hasMode1()
	{
	    return getChosenFlag() == mode1_chosen;
	}
	
	public void setMode1(Null mode1)
	{
	    setChosenValue(mode1);
	    setChosenFlag(mode1_chosen);
	}
	
	
	// Methods for field "mode2"
	public static Tm_SignallingMode createTm_SignallingModeWithMode2(Mode2 mode2)
	{
	    Tm_SignallingMode __object = new Tm_SignallingMode();

	    __object.setMode2(mode2);
	    return __object;
	}
	
	public boolean hasMode2()
	{
	    return getChosenFlag() == mode2_chosen;
	}
	
	public void setMode2(Mode2 mode2)
	{
	    setChosenValue(mode2);
	    setChosenFlag(mode2_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Mode2 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Mode2 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Mode2()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Mode2(UL_ControlledTrChList ul_controlledTrChList)
	    {
		setUl_controlledTrChList(ul_controlledTrChList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UL_ControlledTrChList();
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
			return new UL_ControlledTrChList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ul_controlledTrChList"
	    public UL_ControlledTrChList getUl_controlledTrChList()
	    {
		return (UL_ControlledTrChList)mComponents[0];
	    }
	    
	    public void setUl_controlledTrChList(UL_ControlledTrChList ul_controlledTrChList)
	    {
		mComponents[0] = ul_controlledTrChList;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "TM_SignallingInfo$Tm_SignallingMode$Mode2"
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
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UL_ControlledTrChList"
				    ),
				    new QName (
					"InformationElements",
					"UL-ControlledTrChList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(32),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(32)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "TransportChannelIdentity"
					)
				    )
				)
			    ),
			    "ul-controlledTrChList",
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
	     * Get the type descriptor (TypeInfo) of 'this' Mode2 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Mode2 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Mode2

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case mode1_chosen:
		    return new Null();
		case mode2_chosen:
		    return new Mode2();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"TM_SignallingInfo$Tm_SignallingMode"
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
			"mode1",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"TM_SignallingInfo$Tm_SignallingMode$Mode2"
			    )
			),
			"mode2",
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
	 * Get the type descriptor (TypeInfo) of 'this' Tm_SignallingMode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tm_SignallingMode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tm_SignallingMode

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
	    "TM_SignallingInfo"
	),
	new QName (
	    "InformationElements",
	    "TM-SignallingInfo"
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
				"MessType"
			    ),
			    new QName (
				"InformationElements",
				"MessType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"transportFormatCombinationControl",
					0
				    )
				}
			    ),
			    0,
			    MessType.transportFormatCombinationControl
			)
		    ),
		    "messType",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "TM_SignallingInfo$Tm_SignallingMode"
			)
		    ),
		    "tm-SignallingMode",
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
     * Get the type descriptor (TypeInfo) of 'this' TM_SignallingInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TM_SignallingInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TM_SignallingInfo
