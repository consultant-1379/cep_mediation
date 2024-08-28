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
 * Define the ASN1 Type PDSCH_CodeMapping from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDSCH_CodeMapping extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDSCH_CodeMapping()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDSCH_CodeMapping(SecondaryScramblingCode dl_ScramblingCode, 
		    SignallingMethod signallingMethod)
    {
	setDl_ScramblingCode(dl_ScramblingCode);
	setSignallingMethod(signallingMethod);
    }
    
    /**
     * Construct with required components.
     */
    public PDSCH_CodeMapping(SignallingMethod signallingMethod)
    {
	setSignallingMethod(signallingMethod);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondaryScramblingCode();
	mComponents[1] = new SignallingMethod();
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
		return new SecondaryScramblingCode();
	    case 1:
		return new SignallingMethod();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_ScramblingCode"
    public SecondaryScramblingCode getDl_ScramblingCode()
    {
	return (SecondaryScramblingCode)mComponents[0];
    }
    
    public void setDl_ScramblingCode(SecondaryScramblingCode dl_ScramblingCode)
    {
	mComponents[0] = dl_ScramblingCode;
    }
    
    public boolean hasDl_ScramblingCode()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDl_ScramblingCode()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "signallingMethod"
    public SignallingMethod getSignallingMethod()
    {
	return (SignallingMethod)mComponents[1];
    }
    
    public void setSignallingMethod(SignallingMethod signallingMethod)
    {
	mComponents[1] = signallingMethod;
    }
    
    
    
    /**
     * Define the ASN1 Type SignallingMethod from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class SignallingMethod extends Choice {
	
	/**
	 * The default constructor.
	 */
	public SignallingMethod()
	{
	}
	
	public static final  int  codeRange_chosen = 1;
	public static final  int  tfci_Range_chosen = 2;
	public static final  int  explicit_config_chosen = 3;
	public static final  int  replace_chosen = 4;
	
	// Methods for field "codeRange"
	public static SignallingMethod createSignallingMethodWithCodeRange(CodeRange codeRange)
	{
	    SignallingMethod __object = new SignallingMethod();

	    __object.setCodeRange(codeRange);
	    return __object;
	}
	
	public boolean hasCodeRange()
	{
	    return getChosenFlag() == codeRange_chosen;
	}
	
	public void setCodeRange(CodeRange codeRange)
	{
	    setChosenValue(codeRange);
	    setChosenFlag(codeRange_chosen);
	}
	
	
	// Methods for field "tfci_Range"
	public static SignallingMethod createSignallingMethodWithTfci_Range(DSCH_MappingList tfci_Range)
	{
	    SignallingMethod __object = new SignallingMethod();

	    __object.setTfci_Range(tfci_Range);
	    return __object;
	}
	
	public boolean hasTfci_Range()
	{
	    return getChosenFlag() == tfci_Range_chosen;
	}
	
	public void setTfci_Range(DSCH_MappingList tfci_Range)
	{
	    setChosenValue(tfci_Range);
	    setChosenFlag(tfci_Range_chosen);
	}
	
	
	// Methods for field "explicit_config"
	public static SignallingMethod createSignallingMethodWithExplicit_config(PDSCH_CodeInfoList explicit_config)
	{
	    SignallingMethod __object = new SignallingMethod();

	    __object.setExplicit_config(explicit_config);
	    return __object;
	}
	
	public boolean hasExplicit_config()
	{
	    return getChosenFlag() == explicit_config_chosen;
	}
	
	public void setExplicit_config(PDSCH_CodeInfoList explicit_config)
	{
	    setChosenValue(explicit_config);
	    setChosenFlag(explicit_config_chosen);
	}
	
	
	// Methods for field "replace"
	public static SignallingMethod createSignallingMethodWithReplace(ReplacedPDSCH_CodeInfoList replace)
	{
	    SignallingMethod __object = new SignallingMethod();

	    __object.setReplace(replace);
	    return __object;
	}
	
	public boolean hasReplace()
	{
	    return getChosenFlag() == replace_chosen;
	}
	
	public void setReplace(ReplacedPDSCH_CodeInfoList replace)
	{
	    setChosenValue(replace);
	    setChosenFlag(replace_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case codeRange_chosen:
		    return new CodeRange();
		case tfci_Range_chosen:
		    return new DSCH_MappingList();
		case explicit_config_chosen:
		    return new PDSCH_CodeInfoList();
		case replace_chosen:
		    return new ReplacedPDSCH_CodeInfoList();
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
		"PDSCH_CodeMapping$SignallingMethod"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "CodeRange"
				),
				new QName (
				    "InformationElements",
				    "CodeRange"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"CodeRange"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"CodeRange"
				    )
				),
				0
			    )
			),
			"codeRange",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DSCH_MappingList"
				),
				new QName (
				    "InformationElements",
				    "DSCH-MappingList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(256),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(256)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DSCH_Mapping"
				    )
				)
			    )
			),
			"tfci-Range",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "PDSCH_CodeInfoList"
				),
				new QName (
				    "InformationElements",
				    "PDSCH-CodeInfoList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(512),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(512)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"PDSCH_CodeInfo"
				    )
				)
			    )
			),
			"explicit-config",
			2,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "ReplacedPDSCH_CodeInfoList"
				),
				new QName (
				    "InformationElements",
				    "ReplacedPDSCH-CodeInfoList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(512),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(512)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"ReplacedPDSCH_CodeInfo"
				    )
				)
			    )
			),
			"replace",
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
	 * Get the type descriptor (TypeInfo) of 'this' SignallingMethod object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SignallingMethod object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SignallingMethod

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
	    "PDSCH_CodeMapping"
	),
	new QName (
	    "InformationElements",
	    "PDSCH-CodeMapping"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SecondaryScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondaryScramblingCode(1), 
				    new SecondaryScramblingCode(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "dl-ScramblingCode",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PDSCH_CodeMapping$SignallingMethod"
			)
		    ),
		    "signallingMethod",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' PDSCH_CodeMapping object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDSCH_CodeMapping object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDSCH_CodeMapping
