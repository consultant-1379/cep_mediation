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
 * Define the ASN1 Type UL_SecondaryCellInfoFDD from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_SecondaryCellInfoFDD extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_SecondaryCellInfoFDD()
    {
    }
    
    public static final  int  _continue_chosen = 1;
    public static final  int  newConfiguration_chosen = 2;
    
    // Methods for field "_continue"
    public static UL_SecondaryCellInfoFDD createUL_SecondaryCellInfoFDDWith_continue(Null _continue)
    {
	UL_SecondaryCellInfoFDD __object = new UL_SecondaryCellInfoFDD();

	__object.set_continue(_continue);
	return __object;
    }
    
    public boolean has_continue()
    {
	return getChosenFlag() == _continue_chosen;
    }
    
    public void set_continue(Null _continue)
    {
	setChosenValue(_continue);
	setChosenFlag(_continue_chosen);
    }
    
    
    // Methods for field "newConfiguration"
    public static UL_SecondaryCellInfoFDD createUL_SecondaryCellInfoFDDWithNewConfiguration(NewConfiguration newConfiguration)
    {
	UL_SecondaryCellInfoFDD __object = new UL_SecondaryCellInfoFDD();

	__object.setNewConfiguration(newConfiguration);
	return __object;
    }
    
    public boolean hasNewConfiguration()
    {
	return getChosenFlag() == newConfiguration_chosen;
    }
    
    public void setNewConfiguration(NewConfiguration newConfiguration)
    {
	setChosenValue(newConfiguration);
	setChosenFlag(newConfiguration_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type NewConfiguration from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class NewConfiguration extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public NewConfiguration()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public NewConfiguration(SecondaryServingEDCHCell_Info secondaryServingEDCHCell_Info, 
			SecondaryEDCH_Info_Common secondaryEDCH_Info_Common, 
			DL_InformationPerSecondaryRL_List dl_InformationPerSecondaryRL_List)
	{
	    setSecondaryServingEDCHCell_Info(secondaryServingEDCHCell_Info);
	    setSecondaryEDCH_Info_Common(secondaryEDCH_Info_Common);
	    setDl_InformationPerSecondaryRL_List(dl_InformationPerSecondaryRL_List);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SecondaryServingEDCHCell_Info();
	    mComponents[1] = new SecondaryEDCH_Info_Common();
	    mComponents[2] = new DL_InformationPerSecondaryRL_List();
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
		    return new SecondaryServingEDCHCell_Info();
		case 1:
		    return new SecondaryEDCH_Info_Common();
		case 2:
		    return new DL_InformationPerSecondaryRL_List();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "secondaryServingEDCHCell_Info"
	public SecondaryServingEDCHCell_Info getSecondaryServingEDCHCell_Info()
	{
	    return (SecondaryServingEDCHCell_Info)mComponents[0];
	}
	
	public void setSecondaryServingEDCHCell_Info(SecondaryServingEDCHCell_Info secondaryServingEDCHCell_Info)
	{
	    mComponents[0] = secondaryServingEDCHCell_Info;
	}
	
	public boolean hasSecondaryServingEDCHCell_Info()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteSecondaryServingEDCHCell_Info()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "secondaryEDCH_Info_Common"
	public SecondaryEDCH_Info_Common getSecondaryEDCH_Info_Common()
	{
	    return (SecondaryEDCH_Info_Common)mComponents[1];
	}
	
	public void setSecondaryEDCH_Info_Common(SecondaryEDCH_Info_Common secondaryEDCH_Info_Common)
	{
	    mComponents[1] = secondaryEDCH_Info_Common;
	}
	
	public boolean hasSecondaryEDCH_Info_Common()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteSecondaryEDCH_Info_Common()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "dl_InformationPerSecondaryRL_List"
	public DL_InformationPerSecondaryRL_List getDl_InformationPerSecondaryRL_List()
	{
	    return (DL_InformationPerSecondaryRL_List)mComponents[2];
	}
	
	public void setDl_InformationPerSecondaryRL_List(DL_InformationPerSecondaryRL_List dl_InformationPerSecondaryRL_List)
	{
	    mComponents[2] = dl_InformationPerSecondaryRL_List;
	}
	
	public boolean hasDl_InformationPerSecondaryRL_List()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteDl_InformationPerSecondaryRL_List()
	{
	    setComponentAbsent(2);
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
		"UL_SecondaryCellInfoFDD$NewConfiguration"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "SecondaryServingEDCHCell_Info"
				),
				new QName (
				    "InformationElements",
				    "SecondaryServingEDCHCell-Info"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SecondaryServingEDCHCell_Info"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SecondaryServingEDCHCell_Info"
				    )
				),
				0
			    )
			),
			"secondaryServingEDCHCell-Info",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "SecondaryEDCH_Info_Common"
				),
				new QName (
				    "InformationElements",
				    "SecondaryEDCH-Info-Common"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SecondaryEDCH_Info_Common"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SecondaryEDCH_Info_Common"
				    )
				),
				0
			    )
			),
			"secondaryEDCH-Info-Common",
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_InformationPerSecondaryRL_List"
				),
				new QName (
				    "InformationElements",
				    "DL-InformationPerSecondaryRL-List"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(4),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(4)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DL_InformationPerSecondaryRL"
				    )
				)
			    )
			),
			"dl-InformationPerSecondaryRL-List",
			2,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NewConfiguration object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NewConfiguration object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NewConfiguration

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case _continue_chosen:
		return new Null();
	    case newConfiguration_chosen:
		return new NewConfiguration();
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
	    "UL_SecondaryCellInfoFDD"
	),
	new QName (
	    "InformationElements",
	    "UL-SecondaryCellInfoFDD"
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
		    "continue",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_SecondaryCellInfoFDD$NewConfiguration"
			)
		    ),
		    "newConfiguration",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_SecondaryCellInfoFDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_SecondaryCellInfoFDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_SecondaryCellInfoFDD
