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
 * Define the ASN1 Type GanssReqGenericData_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GanssReqGenericData_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public GanssReqGenericData_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GanssReqGenericData_v860ext(UE_Positioning_GANSS_SBAS_ID sbasId, 
		    GanssAddNavigationModel ganssAddNavigationModel, 
		    GanssAddUTCmodel ganssAddUTCmodel, 
		    GanssAuxInfo ganssAuxInfo, 
		    GanssAddADchoices ganssAddADchoices)
    {
	setSbasId(sbasId);
	setGanssAddNavigationModel(ganssAddNavigationModel);
	setGanssAddUTCmodel(ganssAddUTCmodel);
	setGanssAuxInfo(ganssAuxInfo);
	setGanssAddADchoices(ganssAddADchoices);
    }
    
    public void initComponents()
    {
	mComponents[0] = UE_Positioning_GANSS_SBAS_ID.waas;
	mComponents[1] = GanssAddNavigationModel._true;
	mComponents[2] = GanssAddUTCmodel._true;
	mComponents[3] = GanssAuxInfo._true;
	mComponents[4] = new GanssAddADchoices();
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
		return UE_Positioning_GANSS_SBAS_ID.waas;
	    case 1:
		return GanssAddNavigationModel._true;
	    case 2:
		return GanssAddUTCmodel._true;
	    case 3:
		return GanssAuxInfo._true;
	    case 4:
		return new GanssAddADchoices();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sbasId"
    public UE_Positioning_GANSS_SBAS_ID getSbasId()
    {
	return (UE_Positioning_GANSS_SBAS_ID)mComponents[0];
    }
    
    public void setSbasId(UE_Positioning_GANSS_SBAS_ID sbasId)
    {
	mComponents[0] = sbasId;
    }
    
    public boolean hasSbasId()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSbasId()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ganssAddNavigationModel"
    public GanssAddNavigationModel getGanssAddNavigationModel()
    {
	return (GanssAddNavigationModel)mComponents[1];
    }
    
    public void setGanssAddNavigationModel(GanssAddNavigationModel ganssAddNavigationModel)
    {
	mComponents[1] = ganssAddNavigationModel;
    }
    
    public boolean hasGanssAddNavigationModel()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGanssAddNavigationModel()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type GanssAddNavigationModel from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class GanssAddNavigationModel extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private GanssAddNavigationModel()
	{
	    super(cFirstNumber);
	}
	
	protected GanssAddNavigationModel(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final GanssAddNavigationModel _true =
	    new GanssAddNavigationModel(0);
	private final static GanssAddNavigationModel cNamedNumbers[] = {
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
	
	public static GanssAddNavigationModel valueOf(long value)
	{
	    return (GanssAddNavigationModel)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"GanssReqGenericData_v860ext$GanssAddNavigationModel"
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
	 * Get the type descriptor (TypeInfo) of 'this' GanssAddNavigationModel object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GanssAddNavigationModel object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GanssAddNavigationModel

    // Methods for field "ganssAddUTCmodel"
    public GanssAddUTCmodel getGanssAddUTCmodel()
    {
	return (GanssAddUTCmodel)mComponents[2];
    }
    
    public void setGanssAddUTCmodel(GanssAddUTCmodel ganssAddUTCmodel)
    {
	mComponents[2] = ganssAddUTCmodel;
    }
    
    public boolean hasGanssAddUTCmodel()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGanssAddUTCmodel()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type GanssAddUTCmodel from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class GanssAddUTCmodel extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private GanssAddUTCmodel()
	{
	    super(cFirstNumber);
	}
	
	protected GanssAddUTCmodel(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final GanssAddUTCmodel _true =
	    new GanssAddUTCmodel(0);
	private final static GanssAddUTCmodel cNamedNumbers[] = {
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
	
	public static GanssAddUTCmodel valueOf(long value)
	{
	    return (GanssAddUTCmodel)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"GanssReqGenericData_v860ext$GanssAddUTCmodel"
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
	 * Get the type descriptor (TypeInfo) of 'this' GanssAddUTCmodel object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GanssAddUTCmodel object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GanssAddUTCmodel

    // Methods for field "ganssAuxInfo"
    public GanssAuxInfo getGanssAuxInfo()
    {
	return (GanssAuxInfo)mComponents[3];
    }
    
    public void setGanssAuxInfo(GanssAuxInfo ganssAuxInfo)
    {
	mComponents[3] = ganssAuxInfo;
    }
    
    public boolean hasGanssAuxInfo()
    {
	return componentIsPresent(3);
    }
    
    public void deleteGanssAuxInfo()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type GanssAuxInfo from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class GanssAuxInfo extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private GanssAuxInfo()
	{
	    super(cFirstNumber);
	}
	
	protected GanssAuxInfo(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final GanssAuxInfo _true =
	    new GanssAuxInfo(0);
	private final static GanssAuxInfo cNamedNumbers[] = {
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
	
	public static GanssAuxInfo valueOf(long value)
	{
	    return (GanssAuxInfo)_true.lookupValue(value);
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
		"GanssReqGenericData_v860ext$GanssAuxInfo"
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
	 * Get the type descriptor (TypeInfo) of 'this' GanssAuxInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GanssAuxInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GanssAuxInfo

    // Methods for field "ganssAddADchoices"
    public GanssAddADchoices getGanssAddADchoices()
    {
	return (GanssAddADchoices)mComponents[4];
    }
    
    public void setGanssAddADchoices(GanssAddADchoices ganssAddADchoices)
    {
	mComponents[4] = ganssAddADchoices;
    }
    
    public boolean hasGanssAddADchoices()
    {
	return componentIsPresent(4);
    }
    
    public void deleteGanssAddADchoices()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type GanssAddADchoices from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class GanssAddADchoices extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public GanssAddADchoices()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public GanssAddADchoices(INTEGER orbitModelID, INTEGER clockModelID, 
			INTEGER utcModelID, INTEGER almanacModelID)
	{
	    setOrbitModelID(orbitModelID);
	    setClockModelID(clockModelID);
	    setUtcModelID(utcModelID);
	    setAlmanacModelID(almanacModelID);
	}
	
	/**
	 * Construct with components.
	 */
	public GanssAddADchoices(long orbitModelID, long clockModelID, 
			long utcModelID, long almanacModelID)
	{
	    this(new INTEGER(orbitModelID), new INTEGER(clockModelID), 
		 new INTEGER(utcModelID), new INTEGER(almanacModelID));
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new INTEGER();
	    mComponents[2] = new INTEGER();
	    mComponents[3] = new INTEGER();
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
		    return new INTEGER();
		case 1:
		    return new INTEGER();
		case 2:
		    return new INTEGER();
		case 3:
		    return new INTEGER();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "orbitModelID"
	public long getOrbitModelID()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setOrbitModelID(long orbitModelID)
	{
	    setOrbitModelID(new INTEGER(orbitModelID));
	}
	
	public void setOrbitModelID(INTEGER orbitModelID)
	{
	    mComponents[0] = orbitModelID;
	}
	
	public boolean hasOrbitModelID()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteOrbitModelID()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "clockModelID"
	public long getClockModelID()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setClockModelID(long clockModelID)
	{
	    setClockModelID(new INTEGER(clockModelID));
	}
	
	public void setClockModelID(INTEGER clockModelID)
	{
	    mComponents[1] = clockModelID;
	}
	
	public boolean hasClockModelID()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteClockModelID()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "utcModelID"
	public long getUtcModelID()
	{
	    return ((INTEGER)mComponents[2]).longValue();
	}
	
	public void setUtcModelID(long utcModelID)
	{
	    setUtcModelID(new INTEGER(utcModelID));
	}
	
	public void setUtcModelID(INTEGER utcModelID)
	{
	    mComponents[2] = utcModelID;
	}
	
	public boolean hasUtcModelID()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteUtcModelID()
	{
	    setComponentAbsent(2);
	}
	
	
	// Methods for field "almanacModelID"
	public long getAlmanacModelID()
	{
	    return ((INTEGER)mComponents[3]).longValue();
	}
	
	public void setAlmanacModelID(long almanacModelID)
	{
	    setAlmanacModelID(new INTEGER(almanacModelID));
	}
	
	public void setAlmanacModelID(INTEGER almanacModelID)
	{
	    mComponents[3] = almanacModelID;
	}
	
	public boolean hasAlmanacModelID()
	{
	    return componentIsPresent(3);
	}
	
	public void deleteAlmanacModelID()
	{
	    setComponentAbsent(3);
	}
	
	
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
		"GanssReqGenericData_v860ext$GanssAddADchoices"
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
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(7)
				),
				null
			    )
			),
			"orbitModelID",
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
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(7)
				),
				null
			    )
			),
			"clockModelID",
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
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
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(7)
				),
				null
			    )
			),
			"utcModelID",
			2,
			3,
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
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(7)
				),
				null
			    )
			),
			"almanacModelID",
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
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3)
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
	 * Get the type descriptor (TypeInfo) of 'this' GanssAddADchoices object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GanssAddADchoices object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GanssAddADchoices

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
	    "GanssReqGenericData_v860ext"
	),
	new QName (
	    "InformationElements",
	    "GanssReqGenericData-v860ext"
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
				"UE_Positioning_GANSS_SBAS_ID"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-SBAS-ID"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"waas",
					0
				    ),
				    new MemberListElement (
					"egnos",
					1
				    ),
				    new MemberListElement (
					"msas",
					2
				    ),
				    new MemberListElement (
					"gagan",
					3
				    ),
				    new MemberListElement (
					"spare4",
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
			    UE_Positioning_GANSS_SBAS_ID.waas
			)
		    ),
		    "sbasId",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "GanssReqGenericData_v860ext$GanssAddNavigationModel"
			)
		    ),
		    "ganssAddNavigationModel",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "GanssReqGenericData_v860ext$GanssAddUTCmodel"
			)
		    ),
		    "ganssAddUTCmodel",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "GanssReqGenericData_v860ext$GanssAuxInfo"
			)
		    ),
		    "ganssAuxInfo",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "GanssReqGenericData_v860ext$GanssAddADchoices"
			)
		    ),
		    "ganssAddADchoices",
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
     * Get the type descriptor (TypeInfo) of 'this' GanssReqGenericData_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GanssReqGenericData_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GanssReqGenericData_v860ext
