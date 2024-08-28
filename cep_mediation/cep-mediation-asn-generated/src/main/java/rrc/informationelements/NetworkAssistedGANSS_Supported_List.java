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
 * Define the ASN1 Type NetworkAssistedGANSS_Supported_List from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class NetworkAssistedGANSS_Supported_List extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public NetworkAssistedGANSS_Supported_List()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public NetworkAssistedGANSS_Supported_List(Sequence_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the ASN1 Type Sequence_ from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Sequence_ extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Sequence_()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Sequence_(GANSS_Id gANSS_Id, GANSS_Mode gANSS_Mode, 
			GANSS_Signal_Id gANSS_SignalId, 
			BOOLEAN supportForUE_GANSS_TimingOfCellFrames, 
			BOOLEAN supportForUE_GANSS_CarrierPhaseMeasurement)
	{
	    setGANSS_Id(gANSS_Id);
	    setGANSS_Mode(gANSS_Mode);
	    setGANSS_SignalId(gANSS_SignalId);
	    setSupportForUE_GANSS_TimingOfCellFrames(supportForUE_GANSS_TimingOfCellFrames);
	    setSupportForUE_GANSS_CarrierPhaseMeasurement(supportForUE_GANSS_CarrierPhaseMeasurement);
	}
	
	/**
	 * Construct with components.
	 */
	public Sequence_(GANSS_Id gANSS_Id, GANSS_Mode gANSS_Mode, 
			GANSS_Signal_Id gANSS_SignalId, 
			boolean supportForUE_GANSS_TimingOfCellFrames, 
			boolean supportForUE_GANSS_CarrierPhaseMeasurement)
	{
	    this(gANSS_Id, gANSS_Mode, gANSS_SignalId, 
		 new BOOLEAN(supportForUE_GANSS_TimingOfCellFrames), 
		 new BOOLEAN(supportForUE_GANSS_CarrierPhaseMeasurement));
	}
	
	/**
	 * Construct with required components.
	 */
	public Sequence_(GANSS_Mode gANSS_Mode, 
			boolean supportForUE_GANSS_TimingOfCellFrames)
	{
	    setGANSS_Mode(gANSS_Mode);
	    setSupportForUE_GANSS_TimingOfCellFrames(supportForUE_GANSS_TimingOfCellFrames);
	}
	
	public void initComponents()
	{
	    mComponents[0] = GANSS_Id.sbas;
	    mComponents[1] = GANSS_Mode.networkBased;
	    mComponents[2] = new GANSS_Signal_Id();
	    mComponents[3] = new BOOLEAN();
	    mComponents[4] = new BOOLEAN();
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
		    return GANSS_Id.sbas;
		case 1:
		    return GANSS_Mode.networkBased;
		case 2:
		    return new GANSS_Signal_Id();
		case 3:
		    return new BOOLEAN();
		case 4:
		    return new BOOLEAN();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "gANSS_Id"
	public GANSS_Id getGANSS_Id()
	{
	    return (GANSS_Id)mComponents[0];
	}
	
	public void setGANSS_Id(GANSS_Id gANSS_Id)
	{
	    mComponents[0] = gANSS_Id;
	}
	
	public boolean hasGANSS_Id()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteGANSS_Id()
	{
	    setComponentAbsent(0);
	}
	
	
	
	/**
	 * Define the ASN1 Type GANSS_Id from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class GANSS_Id extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private GANSS_Id()
	    {
		super(cFirstNumber);
	    }
	    
	    protected GANSS_Id(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final GANSS_Id sbas =
		new GANSS_Id(0);
	    public static final GANSS_Id modernizedGPS =
		new GANSS_Id(1);
	    public static final GANSS_Id qzss =
		new GANSS_Id(2);
	    public static final GANSS_Id glonass =
		new GANSS_Id(3);
	    public static final GANSS_Id spare4 =
		new GANSS_Id(4);
	    public static final GANSS_Id spare3 =
		new GANSS_Id(5);
	    public static final GANSS_Id spare2 =
		new GANSS_Id(6);
	    public static final GANSS_Id spare1 =
		new GANSS_Id(7);
	    private final static GANSS_Id cNamedNumbers[] = {
		 sbas, 
		 modernizedGPS, 
		 qzss, 
		 glonass, 
		 spare4, 
		 spare3, 
		 spare2, 
		 spare1
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
	    
	    public static GANSS_Id valueOf(long value)
	    {
		return (GANSS_Id)sbas.lookupValue(value);
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
		    "NetworkAssistedGANSS_Supported_List$Sequence_$GANSS_Id"
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
			    "sbas",
			    0
			),
			new MemberListElement (
			    "modernizedGPS",
			    1
			),
			new MemberListElement (
			    "qzss",
			    2
			),
			new MemberListElement (
			    "glonass",
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
		sbas
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' GANSS_Id object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' GANSS_Id object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for GANSS_Id

	// Methods for field "gANSS_Mode"
	public GANSS_Mode getGANSS_Mode()
	{
	    return (GANSS_Mode)mComponents[1];
	}
	
	public void setGANSS_Mode(GANSS_Mode gANSS_Mode)
	{
	    mComponents[1] = gANSS_Mode;
	}
	
	
	// Methods for field "gANSS_SignalId"
	public GANSS_Signal_Id getGANSS_SignalId()
	{
	    return (GANSS_Signal_Id)mComponents[2];
	}
	
	public void setGANSS_SignalId(GANSS_Signal_Id gANSS_SignalId)
	{
	    mComponents[2] = gANSS_SignalId;
	}
	
	public boolean hasGANSS_SignalId()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteGANSS_SignalId()
	{
	    setComponentAbsent(2);
	}
	
	
	// Methods for field "supportForUE_GANSS_TimingOfCellFrames"
	public boolean getSupportForUE_GANSS_TimingOfCellFrames()
	{
	    return ((BOOLEAN)mComponents[3]).booleanValue();
	}
	
	public void setSupportForUE_GANSS_TimingOfCellFrames(boolean supportForUE_GANSS_TimingOfCellFrames)
	{
	    setSupportForUE_GANSS_TimingOfCellFrames(new BOOLEAN(supportForUE_GANSS_TimingOfCellFrames));
	}
	
	public void setSupportForUE_GANSS_TimingOfCellFrames(BOOLEAN supportForUE_GANSS_TimingOfCellFrames)
	{
	    mComponents[3] = supportForUE_GANSS_TimingOfCellFrames;
	}
	
	
	// Methods for field "supportForUE_GANSS_CarrierPhaseMeasurement"
	public boolean getSupportForUE_GANSS_CarrierPhaseMeasurement()
	{
	    return ((BOOLEAN)mComponents[4]).booleanValue();
	}
	
	public void setSupportForUE_GANSS_CarrierPhaseMeasurement(boolean supportForUE_GANSS_CarrierPhaseMeasurement)
	{
	    setSupportForUE_GANSS_CarrierPhaseMeasurement(new BOOLEAN(supportForUE_GANSS_CarrierPhaseMeasurement));
	}
	
	public void setSupportForUE_GANSS_CarrierPhaseMeasurement(BOOLEAN supportForUE_GANSS_CarrierPhaseMeasurement)
	{
	    mComponents[4] = supportForUE_GANSS_CarrierPhaseMeasurement;
	}
	
	public boolean hasSupportForUE_GANSS_CarrierPhaseMeasurement()
	{
	    return componentIsPresent(4);
	}
	
	public void deleteSupportForUE_GANSS_CarrierPhaseMeasurement()
	{
	    setComponentAbsent(4);
	}
	
	
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
		"NetworkAssistedGANSS_Supported_List$Sequence_"
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
				"NetworkAssistedGANSS_Supported_List$Sequence_$GANSS_Id"
			    )
			),
			"gANSS-Id",
			0,
			3,
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
				    "GANSS_Mode"
				),
				new QName (
				    "InformationElements",
				    "GANSS-Mode"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "networkBased",
					    0
					),
					new MemberListElement (
					    "uEBased",
					    1
					),
					new MemberListElement (
					    "both",
					    2
					),
					new MemberListElement (
					    "none",
					    3
					)
				    }
				),
				0,
				GANSS_Mode.networkBased
			    )
			),
			"gANSS-Mode",
			1,
			2,
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
				    "rrc.informationelements",
				    "GANSS_Signal_Id"
				),
				new QName (
				    "InformationElements",
				    "GANSS-Signal-Id"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new GANSS_Signal_Id(0), 
					new GANSS_Signal_Id(7),
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
			"gANSS-SignalId",
			2,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8003
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
			"supportForUE-GANSS-TimingOfCellFrames",
			3,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8004
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
			"supportForUE-GANSS-CarrierPhaseMeasurement",
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
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3)
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
	 * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sequence_

    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(Sequence_ element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(Sequence_ element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized Sequence_ get(int atIndex)
    {
	return (Sequence_)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(Sequence_ element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(Sequence_ element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new Sequence_();
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "NetworkAssistedGANSS_Supported_List"
	),
	new QName (
	    "InformationElements",
	    "NetworkAssistedGANSS-Supported-List"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(8),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(8)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"NetworkAssistedGANSS_Supported_List$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NetworkAssistedGANSS_Supported_List object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NetworkAssistedGANSS_Supported_List object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NetworkAssistedGANSS_Supported_List
