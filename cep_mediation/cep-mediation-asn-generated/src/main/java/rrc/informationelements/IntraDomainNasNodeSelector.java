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
 * Define the ASN1 Type IntraDomainNasNodeSelector from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraDomainNasNodeSelector extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraDomainNasNodeSelector()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraDomainNasNodeSelector(Version version)
    {
	setVersion(version);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Version();
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
		return new Version();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "version"
    public Version getVersion()
    {
	return (Version)mComponents[0];
    }
    
    public void setVersion(Version version)
    {
	mComponents[0] = version;
    }
    
    
    
    /**
     * Define the ASN1 Type Version from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Version extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Version()
	{
	}
	
	public static final  int  release99_chosen = 1;
	public static final  int  later_chosen = 2;
	
	// Methods for field "release99"
	public static Version createVersionWithRelease99(Release99 release99)
	{
	    Version __object = new Version();

	    __object.setRelease99(release99);
	    return __object;
	}
	
	public boolean hasRelease99()
	{
	    return getChosenFlag() == release99_chosen;
	}
	
	public void setRelease99(Release99 release99)
	{
	    setChosenValue(release99);
	    setChosenFlag(release99_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Release99 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Release99 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Release99()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Release99(Cn_Type cn_Type)
	    {
		setCn_Type(cn_Type);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Cn_Type();
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
			return new Cn_Type();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cn_Type"
	    public Cn_Type getCn_Type()
	    {
		return (Cn_Type)mComponents[0];
	    }
	    
	    public void setCn_Type(Cn_Type cn_Type)
	    {
		mComponents[0] = cn_Type;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Cn_Type from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class Cn_Type extends Choice {
		
		/**
		 * The default constructor.
		 */
		public Cn_Type()
		{
		}
		
		public static final  int  gsm_Map_IDNNS_chosen = 1;
		public static final  int  ansi_41_IDNNS_chosen = 2;
		
		// Methods for field "gsm_Map_IDNNS"
		public static Cn_Type createCn_TypeWithGsm_Map_IDNNS(Gsm_map_IDNNS gsm_Map_IDNNS)
		{
		    Cn_Type __object = new Cn_Type();

		    __object.setGsm_Map_IDNNS(gsm_Map_IDNNS);
		    return __object;
		}
		
		public boolean hasGsm_Map_IDNNS()
		{
		    return getChosenFlag() == gsm_Map_IDNNS_chosen;
		}
		
		public void setGsm_Map_IDNNS(Gsm_map_IDNNS gsm_Map_IDNNS)
		{
		    setChosenValue(gsm_Map_IDNNS);
		    setChosenFlag(gsm_Map_IDNNS_chosen);
		}
		
		
		// Methods for field "ansi_41_IDNNS"
		public static Cn_Type createCn_TypeWithAnsi_41_IDNNS(Ansi_41_IDNNS ansi_41_IDNNS)
		{
		    Cn_Type __object = new Cn_Type();

		    __object.setAnsi_41_IDNNS(ansi_41_IDNNS);
		    return __object;
		}
		
		public boolean hasAnsi_41_IDNNS()
		{
		    return getChosenFlag() == ansi_41_IDNNS_chosen;
		}
		
		public void setAnsi_41_IDNNS(Ansi_41_IDNNS ansi_41_IDNNS)
		{
		    setChosenValue(ansi_41_IDNNS);
		    setChosenFlag(ansi_41_IDNNS_chosen);
		}
		
		
		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case gsm_Map_IDNNS_chosen:
			    return new Gsm_map_IDNNS();
			case ansi_41_IDNNS_chosen:
			    return new Ansi_41_IDNNS();
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
			"IntraDomainNasNodeSelector$Version$Release99$Cn_Type"
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
					    "Gsm_map_IDNNS"
					),
					new QName (
					    "InformationElements",
					    "Gsm-map-IDNNS"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"Gsm_map_IDNNS"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"Gsm_map_IDNNS"
					    )
					),
					0
				    )
				),
				"gsm-Map-IDNNS",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new BitStringInfo (
					new Tags (
					    new short[] {
						(short)0x8001
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "Ansi_41_IDNNS"
					),
					new QName (
					    "InformationElements",
					    "Ansi-41-IDNNS"
					),
					12314,
					new SizeConstraint (
					    new SingleValueConstraint (
						new com.oss.asn1.INTEGER(14)
					    )
					),
					new Bounds (
					    new java.lang.Long(14),
					    new java.lang.Long(14)
					),
					null
				    )
				),
				"ansi-41-IDNNS",
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
		 * Get the type descriptor (TypeInfo) of 'this' Cn_Type object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Cn_Type object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Cn_Type

	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "IntraDomainNasNodeSelector$Version$Release99"
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
				new QName (
				    "rrc.informationelements",
				    "IntraDomainNasNodeSelector$Version$Release99$Cn_Type"
				)
			    ),
			    "cn-Type",
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
	     * Get the type descriptor (TypeInfo) of 'this' Release99 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Release99 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Release99

	// Methods for field "later"
	public static Version createVersionWithLater(Later later)
	{
	    Version __object = new Version();

	    __object.setLater(later);
	    return __object;
	}
	
	public boolean hasLater()
	{
	    return getChosenFlag() == later_chosen;
	}
	
	public void setLater(Later later)
	{
	    setChosenValue(later);
	    setChosenFlag(later_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Later from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Later extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Later()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Later(BitString futurecoding)
	    {
		setFuturecoding(futurecoding);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BitString();
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
			return new BitString();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "futurecoding"
	    public BitString getFuturecoding()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setFuturecoding(BitString futurecoding)
	    {
		mComponents[0] = futurecoding;
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
		    "IntraDomainNasNodeSelector$Version$Later"
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
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"BitString"
				    ),
				    new QName (
					"builtin",
					"BIT STRING"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(15)
					)
				    ),
				    new Bounds (
					new java.lang.Long(15),
					new java.lang.Long(15)
				    ),
				    null
				)
			    ),
			    "futurecoding",
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
	     * Get the type descriptor (TypeInfo) of 'this' Later object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Later object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Later

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case release99_chosen:
		    return new Release99();
		case later_chosen:
		    return new Later();
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
		"IntraDomainNasNodeSelector$Version"
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
				"IntraDomainNasNodeSelector$Version$Release99"
			    )
			),
			"release99",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"IntraDomainNasNodeSelector$Version$Later"
			    )
			),
			"later",
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
	 * Get the type descriptor (TypeInfo) of 'this' Version object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Version object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Version

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
	    "IntraDomainNasNodeSelector"
	),
	new QName (
	    "InformationElements",
	    "IntraDomainNasNodeSelector"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "IntraDomainNasNodeSelector$Version"
			)
		    ),
		    "version",
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
     * Get the type descriptor (TypeInfo) of 'this' IntraDomainNasNodeSelector object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraDomainNasNodeSelector object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraDomainNasNodeSelector
