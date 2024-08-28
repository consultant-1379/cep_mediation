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
 * Define the ASN1 Type RLC_Info_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RLC_Info_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RLC_Info_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RLC_Info_r6(UL_RLC_Mode ul_RLC_Mode, DL_RLC_Mode_r6 dl_RLC_Mode, 
		    BOOLEAN rlc_OneSidedReEst, 
		    AltE_bitInterpretation altE_bitInterpretation)
    {
	setUl_RLC_Mode(ul_RLC_Mode);
	setDl_RLC_Mode(dl_RLC_Mode);
	setRlc_OneSidedReEst(rlc_OneSidedReEst);
	setAltE_bitInterpretation(altE_bitInterpretation);
    }
    
    /**
     * Construct with components.
     */
    public RLC_Info_r6(UL_RLC_Mode ul_RLC_Mode, DL_RLC_Mode_r6 dl_RLC_Mode, 
		    boolean rlc_OneSidedReEst, 
		    AltE_bitInterpretation altE_bitInterpretation)
    {
	this(ul_RLC_Mode, dl_RLC_Mode, new BOOLEAN(rlc_OneSidedReEst), 
	     altE_bitInterpretation);
    }
    
    /**
     * Construct with required components.
     */
    public RLC_Info_r6(boolean rlc_OneSidedReEst)
    {
	setRlc_OneSidedReEst(rlc_OneSidedReEst);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_RLC_Mode();
	mComponents[1] = new DL_RLC_Mode_r6();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = AltE_bitInterpretation._true;
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
		return new UL_RLC_Mode();
	    case 1:
		return new DL_RLC_Mode_r6();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return AltE_bitInterpretation._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_RLC_Mode"
    public UL_RLC_Mode getUl_RLC_Mode()
    {
	return (UL_RLC_Mode)mComponents[0];
    }
    
    public void setUl_RLC_Mode(UL_RLC_Mode ul_RLC_Mode)
    {
	mComponents[0] = ul_RLC_Mode;
    }
    
    public boolean hasUl_RLC_Mode()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_RLC_Mode()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dl_RLC_Mode"
    public DL_RLC_Mode_r6 getDl_RLC_Mode()
    {
	return (DL_RLC_Mode_r6)mComponents[1];
    }
    
    public void setDl_RLC_Mode(DL_RLC_Mode_r6 dl_RLC_Mode)
    {
	mComponents[1] = dl_RLC_Mode;
    }
    
    public boolean hasDl_RLC_Mode()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_RLC_Mode()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "rlc_OneSidedReEst"
    public boolean getRlc_OneSidedReEst()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setRlc_OneSidedReEst(boolean rlc_OneSidedReEst)
    {
	setRlc_OneSidedReEst(new BOOLEAN(rlc_OneSidedReEst));
    }
    
    public void setRlc_OneSidedReEst(BOOLEAN rlc_OneSidedReEst)
    {
	mComponents[2] = rlc_OneSidedReEst;
    }
    
    
    // Methods for field "altE_bitInterpretation"
    public AltE_bitInterpretation getAltE_bitInterpretation()
    {
	return (AltE_bitInterpretation)mComponents[3];
    }
    
    public void setAltE_bitInterpretation(AltE_bitInterpretation altE_bitInterpretation)
    {
	mComponents[3] = altE_bitInterpretation;
    }
    
    public boolean hasAltE_bitInterpretation()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAltE_bitInterpretation()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type AltE_bitInterpretation from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class AltE_bitInterpretation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private AltE_bitInterpretation()
	{
	    super(cFirstNumber);
	}
	
	protected AltE_bitInterpretation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final AltE_bitInterpretation _true =
	    new AltE_bitInterpretation(0);
	private final static AltE_bitInterpretation cNamedNumbers[] = {
	     _true
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
	
	public static AltE_bitInterpretation valueOf(long value)
	{
	    return (AltE_bitInterpretation)_true.lookupValue(value);
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
		"RLC_Info_r6$AltE_bitInterpretation"
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
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' AltE_bitInterpretation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' AltE_bitInterpretation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for AltE_bitInterpretation

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
	    "RLC_Info_r6"
	),
	new QName (
	    "InformationElements",
	    "RLC-Info-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_RLC_Mode"
			    ),
			    new QName (
				"InformationElements",
				"UL-RLC-Mode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_RLC_Mode"
				)
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
			)
		    ),
		    "ul-RLC-Mode",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_RLC_Mode_r6"
			    ),
			    new QName (
				"InformationElements",
				"DL-RLC-Mode-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_RLC_Mode_r6"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "dl-RLC-Mode",
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
		    "rlc-OneSidedReEst",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RLC_Info_r6$AltE_bitInterpretation"
			)
		    ),
		    "altE-bitInterpretation",
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' RLC_Info_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RLC_Info_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RLC_Info_r6
