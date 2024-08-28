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
 * Define the ASN1 Type UL_DL_Mode from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_DL_Mode extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_DL_Mode()
    {
    }
    
    public static final  int  ul_chosen = 1;
    public static final  int  dl_chosen = 2;
    public static final  int  ul_and_dl_chosen = 3;
    
    // Methods for field "ul"
    public static UL_DL_Mode createUL_DL_ModeWithUl(UL_CompressedModeMethod ul)
    {
	UL_DL_Mode __object = new UL_DL_Mode();

	__object.setUl(ul);
	return __object;
    }
    
    public boolean hasUl()
    {
	return getChosenFlag() == ul_chosen;
    }
    
    public void setUl(UL_CompressedModeMethod ul)
    {
	setChosenValue(ul);
	setChosenFlag(ul_chosen);
    }
    
    
    // Methods for field "dl"
    public static UL_DL_Mode createUL_DL_ModeWithDl(DL_CompressedModeMethod dl)
    {
	UL_DL_Mode __object = new UL_DL_Mode();

	__object.setDl(dl);
	return __object;
    }
    
    public boolean hasDl()
    {
	return getChosenFlag() == dl_chosen;
    }
    
    public void setDl(DL_CompressedModeMethod dl)
    {
	setChosenValue(dl);
	setChosenFlag(dl_chosen);
    }
    
    
    // Methods for field "ul_and_dl"
    public static UL_DL_Mode createUL_DL_ModeWithUl_and_dl(Ul_and_dl ul_and_dl)
    {
	UL_DL_Mode __object = new UL_DL_Mode();

	__object.setUl_and_dl(ul_and_dl);
	return __object;
    }
    
    public boolean hasUl_and_dl()
    {
	return getChosenFlag() == ul_and_dl_chosen;
    }
    
    public void setUl_and_dl(Ul_and_dl ul_and_dl)
    {
	setChosenValue(ul_and_dl);
	setChosenFlag(ul_and_dl_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Ul_and_dl from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Ul_and_dl extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Ul_and_dl()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Ul_and_dl(UL_CompressedModeMethod ul, 
			DL_CompressedModeMethod dl)
	{
	    setUl(ul);
	    setDl(dl);
	}
	
	public void initComponents()
	{
	    mComponents[0] = UL_CompressedModeMethod.sf_2;
	    mComponents[1] = DL_CompressedModeMethod.dummy;
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
		    return UL_CompressedModeMethod.sf_2;
		case 1:
		    return DL_CompressedModeMethod.dummy;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ul"
	public UL_CompressedModeMethod getUl()
	{
	    return (UL_CompressedModeMethod)mComponents[0];
	}
	
	public void setUl(UL_CompressedModeMethod ul)
	{
	    mComponents[0] = ul;
	}
	
	
	// Methods for field "dl"
	public DL_CompressedModeMethod getDl()
	{
	    return (DL_CompressedModeMethod)mComponents[1];
	}
	
	public void setDl(DL_CompressedModeMethod dl)
	{
	    mComponents[1] = dl;
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
		"UL_DL_Mode$Ul_and_dl"
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
				    "UL_CompressedModeMethod"
				),
				new QName (
				    "InformationElements",
				    "UL-CompressedModeMethod"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "sf-2",
					    0
					),
					new MemberListElement (
					    "higherLayerScheduling",
					    1
					)
				    }
				),
				0,
				UL_CompressedModeMethod.sf_2
			    )
			),
			"ul",
			0,
			2,
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
				    "DL_CompressedModeMethod"
				),
				new QName (
				    "InformationElements",
				    "DL-CompressedModeMethod"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "dummy",
					    0
					),
					new MemberListElement (
					    "sf-2",
					    1
					),
					new MemberListElement (
					    "higherLayerScheduling",
					    2
					)
				    }
				),
				0,
				DL_CompressedModeMethod.dummy
			    )
			),
			"dl",
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
	 * Get the type descriptor (TypeInfo) of 'this' Ul_and_dl object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Ul_and_dl object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Ul_and_dl

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case ul_chosen:
		return UL_CompressedModeMethod.sf_2;
	    case dl_chosen:
		return DL_CompressedModeMethod.dummy;
	    case ul_and_dl_chosen:
		return new Ul_and_dl();
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
	    "UL_DL_Mode"
	),
	new QName (
	    "InformationElements",
	    "UL-DL-Mode"
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
				"UL_CompressedModeMethod"
			    ),
			    new QName (
				"InformationElements",
				"UL-CompressedModeMethod"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sf-2",
					0
				    ),
				    new MemberListElement (
					"higherLayerScheduling",
					1
				    )
				}
			    ),
			    0,
			    UL_CompressedModeMethod.sf_2
			)
		    ),
		    "ul",
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
				"DL_CompressedModeMethod"
			    ),
			    new QName (
				"InformationElements",
				"DL-CompressedModeMethod"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dummy",
					0
				    ),
				    new MemberListElement (
					"sf-2",
					1
				    ),
				    new MemberListElement (
					"higherLayerScheduling",
					2
				    )
				}
			    ),
			    0,
			    DL_CompressedModeMethod.dummy
			)
		    ),
		    "dl",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_DL_Mode$Ul_and_dl"
			)
		    ),
		    "ul-and-dl",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_DL_Mode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DL_Mode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DL_Mode
