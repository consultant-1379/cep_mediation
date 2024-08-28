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
 * Define the ASN1 Type E_AGCH_Information_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_AGCH_Information_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_AGCH_Information_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_AGCH_Information_r8(ModeSpecific modeSpecific)
    {
	setModeSpecific(modeSpecific);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecific();
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
		return new ModeSpecific();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modeSpecific"
    public ModeSpecific getModeSpecific()
    {
	return (ModeSpecific)mComponents[0];
    }
    
    public void setModeSpecific(ModeSpecific modeSpecific)
    {
	mComponents[0] = modeSpecific;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecific from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecific extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecific()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecific createModeSpecificWithFdd(Fdd fdd)
	{
	    ModeSpecific __object = new ModeSpecific();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Fdd fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Fdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Fdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Fdd(E_AGCH_ChannelisationCode e_AGCH_ChannelisationCode)
	    {
		setE_AGCH_ChannelisationCode(e_AGCH_ChannelisationCode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new E_AGCH_ChannelisationCode();
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
			return new E_AGCH_ChannelisationCode();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "e_AGCH_ChannelisationCode"
	    public E_AGCH_ChannelisationCode getE_AGCH_ChannelisationCode()
	    {
		return (E_AGCH_ChannelisationCode)mComponents[0];
	    }
	    
	    public void setE_AGCH_ChannelisationCode(E_AGCH_ChannelisationCode e_AGCH_ChannelisationCode)
	    {
		mComponents[0] = e_AGCH_ChannelisationCode;
	    }
	    
	    
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
		    "E_AGCH_Information_r8$ModeSpecific$Fdd"
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
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"E_AGCH_ChannelisationCode"
				    ),
				    new QName (
					"InformationElements",
					"E-AGCH-ChannelisationCode"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new E_AGCH_ChannelisationCode(0), 
					    new E_AGCH_ChannelisationCode(255),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(255)
				    ),
				    null
				)
			    ),
			    "e-AGCH-ChannelisationCode",
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
	     * Get the type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Fdd

	// Methods for field "tdd"
	public static ModeSpecific createModeSpecificWithTdd(Tdd tdd)
	{
	    ModeSpecific __object = new ModeSpecific();

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
	    public static Tdd createTddWithTdd384(Tdd384 tdd384)
	    {
		Tdd __object = new Tdd();

		__object.setTdd384(tdd384);
		return __object;
	    }
	    
	    public boolean hasTdd384()
	    {
		return getChosenFlag() == tdd384_chosen;
	    }
	    
	    public void setTdd384(Tdd384 tdd384)
	    {
		setChosenValue(tdd384);
		setChosenFlag(tdd384_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Tdd384 from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class Tdd384 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Tdd384()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Tdd384(BOOLEAN long_Term_Grant_Indicator, 
				INTEGER length_of_TTRI_field, 
				E_AGCH_Set_Config e_AGCH_Set_Config, 
				Bler_Target e_AGCH_BLER_Target)
		{
		    setLong_Term_Grant_Indicator(long_Term_Grant_Indicator);
		    setLength_of_TTRI_field(length_of_TTRI_field);
		    setE_AGCH_Set_Config(e_AGCH_Set_Config);
		    setE_AGCH_BLER_Target(e_AGCH_BLER_Target);
		}
		
		/**
		 * Construct with components.
		 */
		public Tdd384(boolean long_Term_Grant_Indicator, 
				long length_of_TTRI_field, 
				E_AGCH_Set_Config e_AGCH_Set_Config, 
				Bler_Target e_AGCH_BLER_Target)
		{
		    this(new BOOLEAN(long_Term_Grant_Indicator), 
			 new INTEGER(length_of_TTRI_field), 
			 e_AGCH_Set_Config, e_AGCH_BLER_Target);
		}
		
		/**
		 * Construct with required components.
		 */
		public Tdd384(long length_of_TTRI_field, 
				E_AGCH_Set_Config e_AGCH_Set_Config, 
				Bler_Target e_AGCH_BLER_Target)
		{
		    setLength_of_TTRI_field(length_of_TTRI_field);
		    setE_AGCH_Set_Config(e_AGCH_Set_Config);
		    setE_AGCH_BLER_Target(e_AGCH_BLER_Target);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new BOOLEAN();
		    mComponents[1] = new INTEGER();
		    mComponents[2] = new E_AGCH_Set_Config();
		    mComponents[3] = new Bler_Target();
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
			    return new BOOLEAN();
			case 1:
			    return new INTEGER();
			case 2:
			    return new E_AGCH_Set_Config();
			case 3:
			    return new Bler_Target();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "long_Term_Grant_Indicator"
		public boolean getLong_Term_Grant_Indicator()
		{
		    return ((BOOLEAN)mComponents[0]).booleanValue();
		}
		
		public void setLong_Term_Grant_Indicator(boolean long_Term_Grant_Indicator)
		{
		    setLong_Term_Grant_Indicator(new BOOLEAN(long_Term_Grant_Indicator));
		}
		
		public void setLong_Term_Grant_Indicator(BOOLEAN long_Term_Grant_Indicator)
		{
		    mComponents[0] = long_Term_Grant_Indicator;
		}
		
		public boolean hasLong_Term_Grant_Indicator()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteLong_Term_Grant_Indicator()
		{
		    setComponentAbsent(0);
		}
		
		
		// Methods for field "length_of_TTRI_field"
		public long getLength_of_TTRI_field()
		{
		    return ((INTEGER)mComponents[1]).longValue();
		}
		
		public void setLength_of_TTRI_field(long length_of_TTRI_field)
		{
		    setLength_of_TTRI_field(new INTEGER(length_of_TTRI_field));
		}
		
		public void setLength_of_TTRI_field(INTEGER length_of_TTRI_field)
		{
		    mComponents[1] = length_of_TTRI_field;
		}
		
		
		// Methods for field "e_AGCH_Set_Config"
		public E_AGCH_Set_Config getE_AGCH_Set_Config()
		{
		    return (E_AGCH_Set_Config)mComponents[2];
		}
		
		public void setE_AGCH_Set_Config(E_AGCH_Set_Config e_AGCH_Set_Config)
		{
		    mComponents[2] = e_AGCH_Set_Config;
		}
		
		
		// Methods for field "e_AGCH_BLER_Target"
		public Bler_Target getE_AGCH_BLER_Target()
		{
		    return (Bler_Target)mComponents[3];
		}
		
		public void setE_AGCH_BLER_Target(Bler_Target e_AGCH_BLER_Target)
		{
		    mComponents[3] = e_AGCH_BLER_Target;
		}
		
		
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
			"E_AGCH_Information_r8$ModeSpecific$Tdd$Tdd384"
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
				    new TypeInfo (
					new Tags (
					    new short[] {
						(short)0x8000
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
				"long-Term-Grant-Indicator",
				0,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8001
					    }
					),
					new QName (
					    "com.oss.asn1",
					    "INTEGER"
					),
					new QName (
					    "builtin",
					    "INTEGER"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(12),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(1),
					    new java.lang.Long(12)
					),
					null
				    )
				),
				"length-of-TTRI-field",
				1,
				2,
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
					    "E_AGCH_Set_Config"
					),
					new QName (
					    "InformationElements",
					    "E-AGCH-Set-Config"
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
						"E_AGCH_Individual"
					    )
					)
				    )
				),
				"e-AGCH-Set-Config",
				2,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8003
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "Bler_Target"
					),
					new QName (
					    "InformationElements",
					    "Bler-Target"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new Bler_Target(-63), 
						new Bler_Target(0),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-63),
					    new java.lang.Long(0)
					),
					null
				    )
				),
				"e-AGCH-BLER-Target",
				3,
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
		 * Get the type descriptor (TypeInfo) of 'this' Tdd384 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Tdd384 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Tdd384

	    // Methods for field "tdd768"
	    public static Tdd createTddWithTdd768(Tdd768 tdd768)
	    {
		Tdd __object = new Tdd();

		__object.setTdd768(tdd768);
		return __object;
	    }
	    
	    public boolean hasTdd768()
	    {
		return getChosenFlag() == tdd768_chosen;
	    }
	    
	    public void setTdd768(Tdd768 tdd768)
	    {
		setChosenValue(tdd768);
		setChosenFlag(tdd768_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Tdd768 from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class Tdd768 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Tdd768()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Tdd768(BOOLEAN long_Term_Grant_Indicator, 
				INTEGER length_of_TTRI_field, 
				E_AGCH_Set_Config_VHCR e_AGCH_Set_Config, 
				Bler_Target e_AGCH_BLER_Target)
		{
		    setLong_Term_Grant_Indicator(long_Term_Grant_Indicator);
		    setLength_of_TTRI_field(length_of_TTRI_field);
		    setE_AGCH_Set_Config(e_AGCH_Set_Config);
		    setE_AGCH_BLER_Target(e_AGCH_BLER_Target);
		}
		
		/**
		 * Construct with components.
		 */
		public Tdd768(boolean long_Term_Grant_Indicator, 
				long length_of_TTRI_field, 
				E_AGCH_Set_Config_VHCR e_AGCH_Set_Config, 
				Bler_Target e_AGCH_BLER_Target)
		{
		    this(new BOOLEAN(long_Term_Grant_Indicator), 
			 new INTEGER(length_of_TTRI_field), 
			 e_AGCH_Set_Config, e_AGCH_BLER_Target);
		}
		
		/**
		 * Construct with required components.
		 */
		public Tdd768(long length_of_TTRI_field, 
				E_AGCH_Set_Config_VHCR e_AGCH_Set_Config, 
				Bler_Target e_AGCH_BLER_Target)
		{
		    setLength_of_TTRI_field(length_of_TTRI_field);
		    setE_AGCH_Set_Config(e_AGCH_Set_Config);
		    setE_AGCH_BLER_Target(e_AGCH_BLER_Target);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new BOOLEAN();
		    mComponents[1] = new INTEGER();
		    mComponents[2] = new E_AGCH_Set_Config_VHCR();
		    mComponents[3] = new Bler_Target();
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
			    return new BOOLEAN();
			case 1:
			    return new INTEGER();
			case 2:
			    return new E_AGCH_Set_Config_VHCR();
			case 3:
			    return new Bler_Target();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "long_Term_Grant_Indicator"
		public boolean getLong_Term_Grant_Indicator()
		{
		    return ((BOOLEAN)mComponents[0]).booleanValue();
		}
		
		public void setLong_Term_Grant_Indicator(boolean long_Term_Grant_Indicator)
		{
		    setLong_Term_Grant_Indicator(new BOOLEAN(long_Term_Grant_Indicator));
		}
		
		public void setLong_Term_Grant_Indicator(BOOLEAN long_Term_Grant_Indicator)
		{
		    mComponents[0] = long_Term_Grant_Indicator;
		}
		
		public boolean hasLong_Term_Grant_Indicator()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteLong_Term_Grant_Indicator()
		{
		    setComponentAbsent(0);
		}
		
		
		// Methods for field "length_of_TTRI_field"
		public long getLength_of_TTRI_field()
		{
		    return ((INTEGER)mComponents[1]).longValue();
		}
		
		public void setLength_of_TTRI_field(long length_of_TTRI_field)
		{
		    setLength_of_TTRI_field(new INTEGER(length_of_TTRI_field));
		}
		
		public void setLength_of_TTRI_field(INTEGER length_of_TTRI_field)
		{
		    mComponents[1] = length_of_TTRI_field;
		}
		
		
		// Methods for field "e_AGCH_Set_Config"
		public E_AGCH_Set_Config_VHCR getE_AGCH_Set_Config()
		{
		    return (E_AGCH_Set_Config_VHCR)mComponents[2];
		}
		
		public void setE_AGCH_Set_Config(E_AGCH_Set_Config_VHCR e_AGCH_Set_Config)
		{
		    mComponents[2] = e_AGCH_Set_Config;
		}
		
		
		// Methods for field "e_AGCH_BLER_Target"
		public Bler_Target getE_AGCH_BLER_Target()
		{
		    return (Bler_Target)mComponents[3];
		}
		
		public void setE_AGCH_BLER_Target(Bler_Target e_AGCH_BLER_Target)
		{
		    mComponents[3] = e_AGCH_BLER_Target;
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
			"E_AGCH_Information_r8$ModeSpecific$Tdd$Tdd768"
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
				    new TypeInfo (
					new Tags (
					    new short[] {
						(short)0x8000
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
				"long-Term-Grant-Indicator",
				0,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8001
					    }
					),
					new QName (
					    "com.oss.asn1",
					    "INTEGER"
					),
					new QName (
					    "builtin",
					    "INTEGER"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(12),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(1),
					    new java.lang.Long(12)
					),
					null
				    )
				),
				"length-of-TTRI-field",
				1,
				2,
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
					    "E_AGCH_Set_Config_VHCR"
					),
					new QName (
					    "InformationElements",
					    "E-AGCH-Set-Config-VHCR"
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
						"E_AGCH_Individual_VHCR"
					    )
					)
				    )
				),
				"e-AGCH-Set-Config",
				2,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8003
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "Bler_Target"
					),
					new QName (
					    "InformationElements",
					    "Bler-Target"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new Bler_Target(-63), 
						new Bler_Target(0),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-63),
					    new java.lang.Long(0)
					),
					null
				    )
				),
				"e-AGCH-BLER-Target",
				3,
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
		 * Get the type descriptor (TypeInfo) of 'this' Tdd768 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Tdd768 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Tdd768

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
		public Tdd128(BOOLEAN rdi_Indicator, 
				TPC_StepSizeTDD tpc_StepSize, 
				E_AGCH_Set_Config_LCR e_AGCH_Set_Config, 
				Bler_Target e_AGCH_BLER_Target, 
				E_AGCH_InactivityMonitorThreshold_TDD128 e_AGCH_InactivityMonitorThreshold)
		{
		    setRdi_Indicator(rdi_Indicator);
		    setTpc_StepSize(tpc_StepSize);
		    setE_AGCH_Set_Config(e_AGCH_Set_Config);
		    setE_AGCH_BLER_Target(e_AGCH_BLER_Target);
		    setE_AGCH_InactivityMonitorThreshold(e_AGCH_InactivityMonitorThreshold);
		}
		
		/**
		 * Construct with components.
		 */
		public Tdd128(boolean rdi_Indicator, 
				TPC_StepSizeTDD tpc_StepSize, 
				E_AGCH_Set_Config_LCR e_AGCH_Set_Config, 
				Bler_Target e_AGCH_BLER_Target, 
				E_AGCH_InactivityMonitorThreshold_TDD128 e_AGCH_InactivityMonitorThreshold)
		{
		    this(new BOOLEAN(rdi_Indicator), tpc_StepSize, 
			 e_AGCH_Set_Config, e_AGCH_BLER_Target, 
			 e_AGCH_InactivityMonitorThreshold);
		}
		
		/**
		 * Construct with required components.
		 */
		public Tdd128(boolean rdi_Indicator, 
				TPC_StepSizeTDD tpc_StepSize, 
				E_AGCH_Set_Config_LCR e_AGCH_Set_Config, 
				Bler_Target e_AGCH_BLER_Target)
		{
		    setRdi_Indicator(rdi_Indicator);
		    setTpc_StepSize(tpc_StepSize);
		    setE_AGCH_Set_Config(e_AGCH_Set_Config);
		    setE_AGCH_BLER_Target(e_AGCH_BLER_Target);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new BOOLEAN();
		    mComponents[1] = new TPC_StepSizeTDD();
		    mComponents[2] = new E_AGCH_Set_Config_LCR();
		    mComponents[3] = new Bler_Target();
		    mComponents[4] = E_AGCH_InactivityMonitorThreshold_TDD128.radio_frames_0;
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
			    return new BOOLEAN();
			case 1:
			    return new TPC_StepSizeTDD();
			case 2:
			    return new E_AGCH_Set_Config_LCR();
			case 3:
			    return new Bler_Target();
			case 4:
			    return E_AGCH_InactivityMonitorThreshold_TDD128.radio_frames_0;
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "rdi_Indicator"
		public boolean getRdi_Indicator()
		{
		    return ((BOOLEAN)mComponents[0]).booleanValue();
		}
		
		public void setRdi_Indicator(boolean rdi_Indicator)
		{
		    setRdi_Indicator(new BOOLEAN(rdi_Indicator));
		}
		
		public void setRdi_Indicator(BOOLEAN rdi_Indicator)
		{
		    mComponents[0] = rdi_Indicator;
		}
		
		
		// Methods for field "tpc_StepSize"
		public TPC_StepSizeTDD getTpc_StepSize()
		{
		    return (TPC_StepSizeTDD)mComponents[1];
		}
		
		public void setTpc_StepSize(TPC_StepSizeTDD tpc_StepSize)
		{
		    mComponents[1] = tpc_StepSize;
		}
		
		
		// Methods for field "e_AGCH_Set_Config"
		public E_AGCH_Set_Config_LCR getE_AGCH_Set_Config()
		{
		    return (E_AGCH_Set_Config_LCR)mComponents[2];
		}
		
		public void setE_AGCH_Set_Config(E_AGCH_Set_Config_LCR e_AGCH_Set_Config)
		{
		    mComponents[2] = e_AGCH_Set_Config;
		}
		
		
		// Methods for field "e_AGCH_BLER_Target"
		public Bler_Target getE_AGCH_BLER_Target()
		{
		    return (Bler_Target)mComponents[3];
		}
		
		public void setE_AGCH_BLER_Target(Bler_Target e_AGCH_BLER_Target)
		{
		    mComponents[3] = e_AGCH_BLER_Target;
		}
		
		
		// Methods for field "e_AGCH_InactivityMonitorThreshold"
		public E_AGCH_InactivityMonitorThreshold_TDD128 getE_AGCH_InactivityMonitorThreshold()
		{
		    return (E_AGCH_InactivityMonitorThreshold_TDD128)mComponents[4];
		}
		
		public void setE_AGCH_InactivityMonitorThreshold(E_AGCH_InactivityMonitorThreshold_TDD128 e_AGCH_InactivityMonitorThreshold)
		{
		    mComponents[4] = e_AGCH_InactivityMonitorThreshold;
		}
		
		public boolean hasE_AGCH_InactivityMonitorThreshold()
		{
		    return componentIsPresent(4);
		}
		
		public void deleteE_AGCH_InactivityMonitorThreshold()
		{
		    setComponentAbsent(4);
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
			"E_AGCH_Information_r8$ModeSpecific$Tdd$Tdd128"
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
				    new TypeInfo (
					new Tags (
					    new short[] {
						(short)0x8000
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
				"rdi-Indicator",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8001
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "TPC_StepSizeTDD"
					),
					new QName (
					    "InformationElements",
					    "TPC-StepSizeTDD"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new TPC_StepSizeTDD(1), 
						new TPC_StepSizeTDD(3),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(1),
					    new java.lang.Long(3)
					),
					null
				    )
				),
				"tpc-StepSize",
				1,
				2,
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
					    "E_AGCH_Set_Config_LCR"
					),
					new QName (
					    "InformationElements",
					    "E-AGCH-Set-Config-LCR"
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
						"E_AGCH_Individual_LCR"
					    )
					)
				    )
				),
				"e-AGCH-Set-Config",
				2,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8003
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "Bler_Target"
					),
					new QName (
					    "InformationElements",
					    "Bler-Target"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new Bler_Target(-63), 
						new Bler_Target(0),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-63),
					    new java.lang.Long(0)
					),
					null
				    )
				),
				"e-AGCH-BLER-Target",
				3,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new EnumeratedInfo (
					new Tags (
					    new short[] {
						(short)0x8004
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "E_AGCH_InactivityMonitorThreshold_TDD128"
					),
					new QName (
					    "InformationElements",
					    "E-AGCH-InactivityMonitorThreshold-TDD128"
					),
					12314,
					null,
					new MemberList (
					    new MemberListElement[] {
						new MemberListElement (
						    "radio-frames-0",
						    0
						),
						new MemberListElement (
						    "radio-frames-1",
						    1
						),
						new MemberListElement (
						    "radio-frames-2",
						    2
						),
						new MemberListElement (
						    "radio-frames-4",
						    3
						),
						new MemberListElement (
						    "radio-frames-8",
						    4
						),
						new MemberListElement (
						    "radio-frames-16",
						    5
						),
						new MemberListElement (
						    "radio-frames-32",
						    6
						),
						new MemberListElement (
						    "radio-frames-64",
						    7
						),
						new MemberListElement (
						    "radio-frames-128",
						    8
						),
						new MemberListElement (
						    "radio-frames-256",
						    9
						),
						new MemberListElement (
						    "radio-frames-512",
						    10
						),
						new MemberListElement (
						    "spare5",
						    11
						),
						new MemberListElement (
						    "spare4",
						    12
						),
						new MemberListElement (
						    "spare3",
						    13
						),
						new MemberListElement (
						    "spare2",
						    14
						),
						new MemberListElement (
						    "infinity",
						    15
						)
					    }
					),
					0,
					E_AGCH_InactivityMonitorThreshold_TDD128.radio_frames_0
				    )
				),
				"e-AGCH-InactivityMonitorThreshold",
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
				    new TagDecoderElement((short)0x8000, 0)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8001, 1)
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
			return new Tdd384();
		    case tdd768_chosen:
			return new Tdd768();
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "E_AGCH_Information_r8$ModeSpecific$Tdd"
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
				    "E_AGCH_Information_r8$ModeSpecific$Tdd$Tdd384"
				)
			    ),
			    "tdd384",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information_r8$ModeSpecific$Tdd$Tdd768"
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
				    "E_AGCH_Information_r8$ModeSpecific$Tdd$Tdd128"
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

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Tdd();
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
		"E_AGCH_Information_r8$ModeSpecific"
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
				"E_AGCH_Information_r8$ModeSpecific$Fdd"
			    )
			),
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"E_AGCH_Information_r8$ModeSpecific$Tdd"
			    )
			),
			"tdd",
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecific object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecific object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecific

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
	    "E_AGCH_Information_r8"
	),
	new QName (
	    "InformationElements",
	    "E-AGCH-Information-r8"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_AGCH_Information_r8$ModeSpecific"
			)
		    ),
		    "modeSpecific",
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
     * Get the type descriptor (TypeInfo) of 'this' E_AGCH_Information_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_AGCH_Information_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_AGCH_Information_r8
