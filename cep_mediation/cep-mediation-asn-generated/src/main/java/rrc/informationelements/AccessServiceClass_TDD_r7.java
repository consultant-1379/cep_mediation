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
 * Define the ASN1 Type AccessServiceClass_TDD_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AccessServiceClass_TDD_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public AccessServiceClass_TDD_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AccessServiceClass_TDD_r7(ChannelisationCodeIndices channelisationCodeIndices, 
		    SubchannelSize subchannelSize)
    {
	setChannelisationCodeIndices(channelisationCodeIndices);
	setSubchannelSize(subchannelSize);
    }
    
    /**
     * Construct with required components.
     */
    public AccessServiceClass_TDD_r7(SubchannelSize subchannelSize)
    {
	setSubchannelSize(subchannelSize);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ChannelisationCodeIndices();
	mComponents[1] = new SubchannelSize();
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
		return new ChannelisationCodeIndices();
	    case 1:
		return new SubchannelSize();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "channelisationCodeIndices"
    public ChannelisationCodeIndices getChannelisationCodeIndices()
    {
	return (ChannelisationCodeIndices)mComponents[0];
    }
    
    public void setChannelisationCodeIndices(ChannelisationCodeIndices channelisationCodeIndices)
    {
	mComponents[0] = channelisationCodeIndices;
    }
    
    public boolean hasChannelisationCodeIndices()
    {
	return componentIsPresent(0);
    }
    
    public void deleteChannelisationCodeIndices()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type ChannelisationCodeIndices from ASN1 Module InformationElements.
     * @see BitString
     */
    public static class ChannelisationCodeIndices extends BitString {
	
	/**
	 * The default constructor.
	 */
	public ChannelisationCodeIndices()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public ChannelisationCodeIndices(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public ChannelisationCodeIndices(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	// Named list definitions.
	public static final int chCodeIndex15 = 0;
	public static final int chCodeIndex14 = 1;
	public static final int chCodeIndex13 = 2;
	public static final int chCodeIndex12 = 3;
	public static final int chCodeIndex11 = 4;
	public static final int chCodeIndex10 = 5;
	public static final int chCodeIndex9 = 6;
	public static final int chCodeIndex8 = 7;
	public static final int chCodeIndex7 = 8;
	public static final int chCodeIndex6 = 9;
	public static final int chCodeIndex5 = 10;
	public static final int chCodeIndex4 = 11;
	public static final int chCodeIndex3 = 12;
	public static final int chCodeIndex2 = 13;
	public static final int chCodeIndex1 = 14;
	public static final int chCodeIndex0 = 15;
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final BitStringInfo c_typeinfo = new BitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"AccessServiceClass_TDD_r7$ChannelisationCodeIndices"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    new SizeConstraint (
		new SingleValueConstraint (
		    new com.oss.asn1.INTEGER(16)
		)
	    ),
	    new Bounds (
		new java.lang.Long(16),
		new java.lang.Long(16)
	    ),
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"chCodeIndex15",
			0
		    ),
		    new MemberListElement (
			"chCodeIndex14",
			1
		    ),
		    new MemberListElement (
			"chCodeIndex13",
			2
		    ),
		    new MemberListElement (
			"chCodeIndex12",
			3
		    ),
		    new MemberListElement (
			"chCodeIndex11",
			4
		    ),
		    new MemberListElement (
			"chCodeIndex10",
			5
		    ),
		    new MemberListElement (
			"chCodeIndex9",
			6
		    ),
		    new MemberListElement (
			"chCodeIndex8",
			7
		    ),
		    new MemberListElement (
			"chCodeIndex7",
			8
		    ),
		    new MemberListElement (
			"chCodeIndex6",
			9
		    ),
		    new MemberListElement (
			"chCodeIndex5",
			10
		    ),
		    new MemberListElement (
			"chCodeIndex4",
			11
		    ),
		    new MemberListElement (
			"chCodeIndex3",
			12
		    ),
		    new MemberListElement (
			"chCodeIndex2",
			13
		    ),
		    new MemberListElement (
			"chCodeIndex1",
			14
		    ),
		    new MemberListElement (
			"chCodeIndex0",
			15
		    )
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ChannelisationCodeIndices object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ChannelisationCodeIndices object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ChannelisationCodeIndices

    // Methods for field "subchannelSize"
    public SubchannelSize getSubchannelSize()
    {
	return (SubchannelSize)mComponents[1];
    }
    
    public void setSubchannelSize(SubchannelSize subchannelSize)
    {
	mComponents[1] = subchannelSize;
    }
    
    
    
    /**
     * Define the ASN1 Type SubchannelSize from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class SubchannelSize extends Choice {
	
	/**
	 * The default constructor.
	 */
	public SubchannelSize()
	{
	}
	
	public static final  int  size1_chosen = 1;
	public static final  int  size2_chosen = 2;
	public static final  int  size4_chosen = 3;
	public static final  int  size8_chosen = 4;
	public static final  int  size16_chosen = 5;
	
	// Methods for field "size1"
	public static SubchannelSize createSubchannelSizeWithSize1(Null size1)
	{
	    SubchannelSize __object = new SubchannelSize();

	    __object.setSize1(size1);
	    return __object;
	}
	
	public boolean hasSize1()
	{
	    return getChosenFlag() == size1_chosen;
	}
	
	public void setSize1(Null size1)
	{
	    setChosenValue(size1);
	    setChosenFlag(size1_chosen);
	}
	
	
	// Methods for field "size2"
	public static SubchannelSize createSubchannelSizeWithSize2(Size2 size2)
	{
	    SubchannelSize __object = new SubchannelSize();

	    __object.setSize2(size2);
	    return __object;
	}
	
	public boolean hasSize2()
	{
	    return getChosenFlag() == size2_chosen;
	}
	
	public void setSize2(Size2 size2)
	{
	    setChosenValue(size2);
	    setChosenFlag(size2_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Size2 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Size2 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Size2()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Size2(Subchannels subchannels)
	    {
		setSubchannels(subchannels);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = Subchannels.subch0;
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
			return Subchannels.subch0;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "subchannels"
	    public Subchannels getSubchannels()
	    {
		return (Subchannels)mComponents[0];
	    }
	    
	    public void setSubchannels(Subchannels subchannels)
	    {
		mComponents[0] = subchannels;
	    }
	    
	    public boolean hasSubchannels()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSubchannels()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Subchannels from ASN1 Module InformationElements.
	     * @see Enumerated
	     */
	    public static final class Subchannels extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private Subchannels()
		{
		    super(cFirstNumber);
		}
		
		protected Subchannels(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final Subchannels subch0 =
		    new Subchannels(0);
		public static final Subchannels subch1 =
		    new Subchannels(1);
		private final static Subchannels cNamedNumbers[] = {
		     subch0, 
		     subch1
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
		
		public static Subchannels valueOf(long value)
		{
		    return (Subchannels)subch0.lookupValue(value);
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		    new Tags (
			new short[] {
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"AccessServiceClass_TDD_r7$SubchannelSize$Size2$Subchannels"
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
				"subch0",
				0
			    ),
			    new MemberListElement (
				"subch1",
				1
			    )
			}
		    ),
		    0,
		    subch0
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' Subchannels object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Subchannels object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Subchannels

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
		    "AccessServiceClass_TDD_r7$SubchannelSize$Size2"
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
				    "AccessServiceClass_TDD_r7$SubchannelSize$Size2$Subchannels"
				)
			    ),
			    "subchannels",
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
	     * Get the type descriptor (TypeInfo) of 'this' Size2 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Size2 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Size2

	// Methods for field "size4"
	public static SubchannelSize createSubchannelSizeWithSize4(Size4 size4)
	{
	    SubchannelSize __object = new SubchannelSize();

	    __object.setSize4(size4);
	    return __object;
	}
	
	public boolean hasSize4()
	{
	    return getChosenFlag() == size4_chosen;
	}
	
	public void setSize4(Size4 size4)
	{
	    setChosenValue(size4);
	    setChosenFlag(size4_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Size4 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Size4 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Size4()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Size4(Subchannels subchannels)
	    {
		setSubchannels(subchannels);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Subchannels();
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
			return new Subchannels();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "subchannels"
	    public Subchannels getSubchannels()
	    {
		return (Subchannels)mComponents[0];
	    }
	    
	    public void setSubchannels(Subchannels subchannels)
	    {
		mComponents[0] = subchannels;
	    }
	    
	    public boolean hasSubchannels()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSubchannels()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Subchannels from ASN1 Module InformationElements.
	     * @see BitString
	     */
	    public static class Subchannels extends BitString {
		
		/**
		 * The default constructor.
		 */
		public Subchannels()
		{
		}
		
		/**
		 * Construct Bit String from a byte array.
		 * All bits considered significant.
		 * @param value the byte array to set this object to.
		 */
		public Subchannels(byte[] value)
		{
		    super(value);
		}
		
		
		/**
		 * Construct Bit String from a byte array and significant bits.
		 * @param value the byte array to set this object to.
		 * @param sigBits the number of significant bits.
		 */
		public Subchannels(byte[] value, int sigBits)
		{
		    super(value, sigBits);
		}
		
		// Named list definitions.
		public static final int subCh3 = 0;
		public static final int subCh2 = 1;
		public static final int subCh1 = 2;
		public static final int subCh0 = 3;
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final BitStringInfo c_typeinfo = new BitStringInfo (
		    new Tags (
			new short[] {
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"AccessServiceClass_TDD_r7$SubchannelSize$Size4$Subchannels"
		    ),
		    new QName (
			"builtin",
			"BIT STRING"
		    ),
		    12314,
		    new SizeConstraint (
			new SingleValueConstraint (
			    new com.oss.asn1.INTEGER(4)
			)
		    ),
		    new Bounds (
			new java.lang.Long(4),
			new java.lang.Long(4)
		    ),
		    new MemberList (
			new MemberListElement[] {
			    new MemberListElement (
				"subCh3",
				0
			    ),
			    new MemberListElement (
				"subCh2",
				1
			    ),
			    new MemberListElement (
				"subCh1",
				2
			    ),
			    new MemberListElement (
				"subCh0",
				3
			    )
			}
		    )
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' Subchannels object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Subchannels object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Subchannels

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
		    "AccessServiceClass_TDD_r7$SubchannelSize$Size4"
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
				    "AccessServiceClass_TDD_r7$SubchannelSize$Size4$Subchannels"
				)
			    ),
			    "subchannels",
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
	     * Get the type descriptor (TypeInfo) of 'this' Size4 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Size4 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Size4

	// Methods for field "size8"
	public static SubchannelSize createSubchannelSizeWithSize8(Size8 size8)
	{
	    SubchannelSize __object = new SubchannelSize();

	    __object.setSize8(size8);
	    return __object;
	}
	
	public boolean hasSize8()
	{
	    return getChosenFlag() == size8_chosen;
	}
	
	public void setSize8(Size8 size8)
	{
	    setChosenValue(size8);
	    setChosenFlag(size8_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Size8 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Size8 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Size8()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Size8(Subchannels subchannels)
	    {
		setSubchannels(subchannels);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Subchannels();
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
			return new Subchannels();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "subchannels"
	    public Subchannels getSubchannels()
	    {
		return (Subchannels)mComponents[0];
	    }
	    
	    public void setSubchannels(Subchannels subchannels)
	    {
		mComponents[0] = subchannels;
	    }
	    
	    public boolean hasSubchannels()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSubchannels()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Subchannels from ASN1 Module InformationElements.
	     * @see BitString
	     */
	    public static class Subchannels extends BitString {
		
		/**
		 * The default constructor.
		 */
		public Subchannels()
		{
		}
		
		/**
		 * Construct Bit String from a byte array.
		 * All bits considered significant.
		 * @param value the byte array to set this object to.
		 */
		public Subchannels(byte[] value)
		{
		    super(value);
		}
		
		
		/**
		 * Construct Bit String from a byte array and significant bits.
		 * @param value the byte array to set this object to.
		 * @param sigBits the number of significant bits.
		 */
		public Subchannels(byte[] value, int sigBits)
		{
		    super(value, sigBits);
		}
		
		// Named list definitions.
		public static final int subCh7 = 0;
		public static final int subCh6 = 1;
		public static final int subCh5 = 2;
		public static final int subCh4 = 3;
		public static final int subCh3 = 4;
		public static final int subCh2 = 5;
		public static final int subCh1 = 6;
		public static final int subCh0 = 7;
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final BitStringInfo c_typeinfo = new BitStringInfo (
		    new Tags (
			new short[] {
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"AccessServiceClass_TDD_r7$SubchannelSize$Size8$Subchannels"
		    ),
		    new QName (
			"builtin",
			"BIT STRING"
		    ),
		    12314,
		    new SizeConstraint (
			new SingleValueConstraint (
			    new com.oss.asn1.INTEGER(8)
			)
		    ),
		    new Bounds (
			new java.lang.Long(8),
			new java.lang.Long(8)
		    ),
		    new MemberList (
			new MemberListElement[] {
			    new MemberListElement (
				"subCh7",
				0
			    ),
			    new MemberListElement (
				"subCh6",
				1
			    ),
			    new MemberListElement (
				"subCh5",
				2
			    ),
			    new MemberListElement (
				"subCh4",
				3
			    ),
			    new MemberListElement (
				"subCh3",
				4
			    ),
			    new MemberListElement (
				"subCh2",
				5
			    ),
			    new MemberListElement (
				"subCh1",
				6
			    ),
			    new MemberListElement (
				"subCh0",
				7
			    )
			}
		    )
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' Subchannels object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Subchannels object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Subchannels

	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8003
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "AccessServiceClass_TDD_r7$SubchannelSize$Size8"
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
				    "AccessServiceClass_TDD_r7$SubchannelSize$Size8$Subchannels"
				)
			    ),
			    "subchannels",
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
	     * Get the type descriptor (TypeInfo) of 'this' Size8 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Size8 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Size8

	// Methods for field "size16"
	public static SubchannelSize createSubchannelSizeWithSize16(Size16 size16)
	{
	    SubchannelSize __object = new SubchannelSize();

	    __object.setSize16(size16);
	    return __object;
	}
	
	public boolean hasSize16()
	{
	    return getChosenFlag() == size16_chosen;
	}
	
	public void setSize16(Size16 size16)
	{
	    setChosenValue(size16);
	    setChosenFlag(size16_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Size16 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Size16 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Size16()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Size16(Subchannels subchannels)
	    {
		setSubchannels(subchannels);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Subchannels();
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
			return new Subchannels();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "subchannels"
	    public Subchannels getSubchannels()
	    {
		return (Subchannels)mComponents[0];
	    }
	    
	    public void setSubchannels(Subchannels subchannels)
	    {
		mComponents[0] = subchannels;
	    }
	    
	    public boolean hasSubchannels()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSubchannels()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Subchannels from ASN1 Module InformationElements.
	     * @see BitString
	     */
	    public static class Subchannels extends BitString {
		
		/**
		 * The default constructor.
		 */
		public Subchannels()
		{
		}
		
		/**
		 * Construct Bit String from a byte array.
		 * All bits considered significant.
		 * @param value the byte array to set this object to.
		 */
		public Subchannels(byte[] value)
		{
		    super(value);
		}
		
		
		/**
		 * Construct Bit String from a byte array and significant bits.
		 * @param value the byte array to set this object to.
		 * @param sigBits the number of significant bits.
		 */
		public Subchannels(byte[] value, int sigBits)
		{
		    super(value, sigBits);
		}
		
		// Named list definitions.
		public static final int subCh15 = 0;
		public static final int subCh14 = 1;
		public static final int subCh13 = 2;
		public static final int subCh12 = 3;
		public static final int subCh11 = 4;
		public static final int subCh10 = 5;
		public static final int subCh9 = 6;
		public static final int subCh8 = 7;
		public static final int subCh7 = 8;
		public static final int subCh6 = 9;
		public static final int subCh5 = 10;
		public static final int subCh4 = 11;
		public static final int subCh3 = 12;
		public static final int subCh2 = 13;
		public static final int subCh1 = 14;
		public static final int subCh0 = 15;
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final BitStringInfo c_typeinfo = new BitStringInfo (
		    new Tags (
			new short[] {
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"AccessServiceClass_TDD_r7$SubchannelSize$Size16$Subchannels"
		    ),
		    new QName (
			"builtin",
			"BIT STRING"
		    ),
		    12314,
		    new SizeConstraint (
			new SingleValueConstraint (
			    new com.oss.asn1.INTEGER(16)
			)
		    ),
		    new Bounds (
			new java.lang.Long(16),
			new java.lang.Long(16)
		    ),
		    new MemberList (
			new MemberListElement[] {
			    new MemberListElement (
				"subCh15",
				0
			    ),
			    new MemberListElement (
				"subCh14",
				1
			    ),
			    new MemberListElement (
				"subCh13",
				2
			    ),
			    new MemberListElement (
				"subCh12",
				3
			    ),
			    new MemberListElement (
				"subCh11",
				4
			    ),
			    new MemberListElement (
				"subCh10",
				5
			    ),
			    new MemberListElement (
				"subCh9",
				6
			    ),
			    new MemberListElement (
				"subCh8",
				7
			    ),
			    new MemberListElement (
				"subCh7",
				8
			    ),
			    new MemberListElement (
				"subCh6",
				9
			    ),
			    new MemberListElement (
				"subCh5",
				10
			    ),
			    new MemberListElement (
				"subCh4",
				11
			    ),
			    new MemberListElement (
				"subCh3",
				12
			    ),
			    new MemberListElement (
				"subCh2",
				13
			    ),
			    new MemberListElement (
				"subCh1",
				14
			    ),
			    new MemberListElement (
				"subCh0",
				15
			    )
			}
		    )
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' Subchannels object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Subchannels object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Subchannels

	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8004
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "AccessServiceClass_TDD_r7$SubchannelSize$Size16"
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
				    "AccessServiceClass_TDD_r7$SubchannelSize$Size16$Subchannels"
				)
			    ),
			    "subchannels",
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
	     * Get the type descriptor (TypeInfo) of 'this' Size16 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Size16 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Size16

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case size1_chosen:
		    return new Null();
		case size2_chosen:
		    return new Size2();
		case size4_chosen:
		    return new Size4();
		case size8_chosen:
		    return new Size8();
		case size16_chosen:
		    return new Size16();
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
		"AccessServiceClass_TDD_r7$SubchannelSize"
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
			"size1",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"AccessServiceClass_TDD_r7$SubchannelSize$Size2"
			    )
			),
			"size2",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"AccessServiceClass_TDD_r7$SubchannelSize$Size4"
			    )
			),
			"size4",
			2,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"AccessServiceClass_TDD_r7$SubchannelSize$Size8"
			    )
			),
			"size8",
			3,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"AccessServiceClass_TDD_r7$SubchannelSize$Size16"
			    )
			),
			"size16",
			4,
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
		    new TagDecoderElement((short)0x8003, 3),
		    new TagDecoderElement((short)0x8004, 4)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SubchannelSize object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SubchannelSize object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SubchannelSize

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
	    "AccessServiceClass_TDD_r7"
	),
	new QName (
	    "InformationElements",
	    "AccessServiceClass-TDD-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "AccessServiceClass_TDD_r7$ChannelisationCodeIndices"
			)
		    ),
		    "channelisationCodeIndices",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "AccessServiceClass_TDD_r7$SubchannelSize"
			)
		    ),
		    "subchannelSize",
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
     * Get the type descriptor (TypeInfo) of 'this' AccessServiceClass_TDD_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AccessServiceClass_TDD_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AccessServiceClass_TDD_r7
