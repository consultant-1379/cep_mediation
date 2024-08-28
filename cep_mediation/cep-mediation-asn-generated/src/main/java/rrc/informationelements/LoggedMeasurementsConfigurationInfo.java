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
 * Define the ASN1 Type LoggedMeasurementsConfigurationInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedMeasurementsConfigurationInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedMeasurementsConfigurationInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedMeasurementsConfigurationInfo(BitString absoluteTimeInfo, 
		    LoggingDuration loggingDuration, 
		    LoggingInterval loggingInterval, 
		    TraceReference traceReference, 
		    TraceRecordingSession traceRecordingSession, 
		    TCE_Id tce_Id, AreaConfiguration areaConfiguration)
    {
	setAbsoluteTimeInfo(absoluteTimeInfo);
	setLoggingDuration(loggingDuration);
	setLoggingInterval(loggingInterval);
	setTraceReference(traceReference);
	setTraceRecordingSession(traceRecordingSession);
	setTce_Id(tce_Id);
	setAreaConfiguration(areaConfiguration);
    }
    
    /**
     * Construct with required components.
     */
    public LoggedMeasurementsConfigurationInfo(BitString absoluteTimeInfo, 
		    LoggingDuration loggingDuration, 
		    LoggingInterval loggingInterval, 
		    TraceReference traceReference, 
		    TraceRecordingSession traceRecordingSession, 
		    TCE_Id tce_Id)
    {
	setAbsoluteTimeInfo(absoluteTimeInfo);
	setLoggingDuration(loggingDuration);
	setLoggingInterval(loggingInterval);
	setTraceReference(traceReference);
	setTraceRecordingSession(traceRecordingSession);
	setTce_Id(tce_Id);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BitString();
	mComponents[1] = LoggingDuration.min10;
	mComponents[2] = LoggingInterval.li128;
	mComponents[3] = new TraceReference();
	mComponents[4] = new TraceRecordingSession();
	mComponents[5] = new TCE_Id();
	mComponents[6] = new AreaConfiguration();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BitString();
	    case 1:
		return LoggingDuration.min10;
	    case 2:
		return LoggingInterval.li128;
	    case 3:
		return new TraceReference();
	    case 4:
		return new TraceRecordingSession();
	    case 5:
		return new TCE_Id();
	    case 6:
		return new AreaConfiguration();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "absoluteTimeInfo"
    public BitString getAbsoluteTimeInfo()
    {
	return (BitString)mComponents[0];
    }
    
    public void setAbsoluteTimeInfo(BitString absoluteTimeInfo)
    {
	mComponents[0] = absoluteTimeInfo;
    }
    
    
    // Methods for field "loggingDuration"
    public LoggingDuration getLoggingDuration()
    {
	return (LoggingDuration)mComponents[1];
    }
    
    public void setLoggingDuration(LoggingDuration loggingDuration)
    {
	mComponents[1] = loggingDuration;
    }
    
    
    
    /**
     * Define the ASN1 Type LoggingDuration from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class LoggingDuration extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LoggingDuration()
	{
	    super(cFirstNumber);
	}
	
	protected LoggingDuration(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LoggingDuration min10 =
	    new LoggingDuration(0);
	public static final LoggingDuration min20 =
	    new LoggingDuration(1);
	public static final LoggingDuration min40 =
	    new LoggingDuration(2);
	public static final LoggingDuration hr1 =
	    new LoggingDuration(3);
	public static final LoggingDuration hr1min30 =
	    new LoggingDuration(4);
	public static final LoggingDuration hr2 =
	    new LoggingDuration(5);
	public static final LoggingDuration spare2 =
	    new LoggingDuration(6);
	public static final LoggingDuration spare1 =
	    new LoggingDuration(7);
	private final static LoggingDuration cNamedNumbers[] = {
	     min10, 
	     min20, 
	     min40, 
	     hr1, 
	     hr1min30, 
	     hr2, 
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
	
	public static LoggingDuration valueOf(long value)
	{
	    return (LoggingDuration)min10.lookupValue(value);
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
		"LoggedMeasurementsConfigurationInfo$LoggingDuration"
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
			"min10",
			0
		    ),
		    new MemberListElement (
			"min20",
			1
		    ),
		    new MemberListElement (
			"min40",
			2
		    ),
		    new MemberListElement (
			"hr1",
			3
		    ),
		    new MemberListElement (
			"hr1min30",
			4
		    ),
		    new MemberListElement (
			"hr2",
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
	    min10
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' LoggingDuration object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LoggingDuration object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LoggingDuration

    // Methods for field "loggingInterval"
    public LoggingInterval getLoggingInterval()
    {
	return (LoggingInterval)mComponents[2];
    }
    
    public void setLoggingInterval(LoggingInterval loggingInterval)
    {
	mComponents[2] = loggingInterval;
    }
    
    
    
    /**
     * Define the ASN1 Type LoggingInterval from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class LoggingInterval extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LoggingInterval()
	{
	    super(cFirstNumber);
	}
	
	protected LoggingInterval(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LoggingInterval li128 =
	    new LoggingInterval(0);
	public static final LoggingInterval li256 =
	    new LoggingInterval(1);
	public static final LoggingInterval li512 =
	    new LoggingInterval(2);
	public static final LoggingInterval li1024 =
	    new LoggingInterval(3);
	public static final LoggingInterval li2048 =
	    new LoggingInterval(4);
	public static final LoggingInterval li3072 =
	    new LoggingInterval(5);
	public static final LoggingInterval li4096 =
	    new LoggingInterval(6);
	public static final LoggingInterval li6144 =
	    new LoggingInterval(7);
	private final static LoggingInterval cNamedNumbers[] = {
	     li128, 
	     li256, 
	     li512, 
	     li1024, 
	     li2048, 
	     li3072, 
	     li4096, 
	     li6144
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
	
	public static LoggingInterval valueOf(long value)
	{
	    return (LoggingInterval)li128.lookupValue(value);
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
		"LoggedMeasurementsConfigurationInfo$LoggingInterval"
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
			"li128",
			0
		    ),
		    new MemberListElement (
			"li256",
			1
		    ),
		    new MemberListElement (
			"li512",
			2
		    ),
		    new MemberListElement (
			"li1024",
			3
		    ),
		    new MemberListElement (
			"li2048",
			4
		    ),
		    new MemberListElement (
			"li3072",
			5
		    ),
		    new MemberListElement (
			"li4096",
			6
		    ),
		    new MemberListElement (
			"li6144",
			7
		    )
		}
	    ),
	    0,
	    li128
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' LoggingInterval object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LoggingInterval object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LoggingInterval

    // Methods for field "traceReference"
    public TraceReference getTraceReference()
    {
	return (TraceReference)mComponents[3];
    }
    
    public void setTraceReference(TraceReference traceReference)
    {
	mComponents[3] = traceReference;
    }
    
    
    // Methods for field "traceRecordingSession"
    public TraceRecordingSession getTraceRecordingSession()
    {
	return (TraceRecordingSession)mComponents[4];
    }
    
    public void setTraceRecordingSession(TraceRecordingSession traceRecordingSession)
    {
	mComponents[4] = traceRecordingSession;
    }
    
    
    // Methods for field "tce_Id"
    public TCE_Id getTce_Id()
    {
	return (TCE_Id)mComponents[5];
    }
    
    public void setTce_Id(TCE_Id tce_Id)
    {
	mComponents[5] = tce_Id;
    }
    
    
    // Methods for field "areaConfiguration"
    public AreaConfiguration getAreaConfiguration()
    {
	return (AreaConfiguration)mComponents[6];
    }
    
    public void setAreaConfiguration(AreaConfiguration areaConfiguration)
    {
	mComponents[6] = areaConfiguration;
    }
    
    public boolean hasAreaConfiguration()
    {
	return componentIsPresent(6);
    }
    
    public void deleteAreaConfiguration()
    {
	setComponentAbsent(6);
    }
    
    
    
    /**
     * Define the ASN1 Type AreaConfiguration from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class AreaConfiguration extends Choice {
	
	/**
	 * The default constructor.
	 */
	public AreaConfiguration()
	{
	}
	
	public static final  int  cellIDList_chosen = 1;
	public static final  int  locationAreaList_chosen = 2;
	public static final  int  routingAreaList_chosen = 3;
	
	// Methods for field "cellIDList"
	public static AreaConfiguration createAreaConfigurationWithCellIDList(CellIDList cellIDList)
	{
	    AreaConfiguration __object = new AreaConfiguration();

	    __object.setCellIDList(cellIDList);
	    return __object;
	}
	
	public boolean hasCellIDList()
	{
	    return getChosenFlag() == cellIDList_chosen;
	}
	
	public void setCellIDList(CellIDList cellIDList)
	{
	    setChosenValue(cellIDList);
	    setChosenFlag(cellIDList_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type CellIDList from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class CellIDList extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public CellIDList()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public CellIDList(CellIdentity[] elements)
	    {
		super(elements);
	    }
	    
	    /**
	     * Add an Element to the SEQUENCE OF/SET OF.
	     */
	    public synchronized void add(CellIdentity element)
	    {
		super.addElement(element);
	    }
	    
	    /**
	     * Set an Element in the SEQUENCE OF/SET OF.
	     */
	    public synchronized void set(CellIdentity element, int atIndex)
	    {
		super.setElement(element, atIndex);
	    }
	    
	    /**
	     * Get an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized CellIdentity get(int atIndex)
	    {
		return (CellIdentity)super.getElement(atIndex);
	    }
	    
	    /**
	     * Insert an Element into the SEQUENCE OF/SET OF.
	     */
	    public synchronized void insert(CellIdentity element, int atIndex)
	    {
		super.insertElement(element, atIndex);
	    }
	    
	    /**
	     * Remove an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized void remove(CellIdentity element)
	    {
		super.removeElement(element);
	    }
	    
	    /**
	     * Create an instance of  SEQUENCE OF/SET OF.
	     */
	    public AbstractData createInstance()
	    {
		return (AbstractData)new CellIdentity();
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final ContainerInfo c_typeinfo = new ContainerInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "LoggedMeasurementsConfigurationInfo$AreaConfiguration$CellIDList"
		),
		new QName (
		    "builtin",
		    "SEQUENCE OF"
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
			"CellIdentity"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' CellIDList object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' CellIDList object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for CellIDList

	// Methods for field "locationAreaList"
	public static AreaConfiguration createAreaConfigurationWithLocationAreaList(LocationAreaList locationAreaList)
	{
	    AreaConfiguration __object = new AreaConfiguration();

	    __object.setLocationAreaList(locationAreaList);
	    return __object;
	}
	
	public boolean hasLocationAreaList()
	{
	    return getChosenFlag() == locationAreaList_chosen;
	}
	
	public void setLocationAreaList(LocationAreaList locationAreaList)
	{
	    setChosenValue(locationAreaList);
	    setChosenFlag(locationAreaList_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type LocationAreaList from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class LocationAreaList extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public LocationAreaList()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public LocationAreaList(LAI[] elements)
	    {
		super(elements);
	    }
	    
	    /**
	     * Add an Element to the SEQUENCE OF/SET OF.
	     */
	    public synchronized void add(LAI element)
	    {
		super.addElement(element);
	    }
	    
	    /**
	     * Set an Element in the SEQUENCE OF/SET OF.
	     */
	    public synchronized void set(LAI element, int atIndex)
	    {
		super.setElement(element, atIndex);
	    }
	    
	    /**
	     * Get an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized LAI get(int atIndex)
	    {
		return (LAI)super.getElement(atIndex);
	    }
	    
	    /**
	     * Insert an Element into the SEQUENCE OF/SET OF.
	     */
	    public synchronized void insert(LAI element, int atIndex)
	    {
		super.insertElement(element, atIndex);
	    }
	    
	    /**
	     * Remove an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized void remove(LAI element)
	    {
		super.removeElement(element);
	    }
	    
	    /**
	     * Create an instance of  SEQUENCE OF/SET OF.
	     */
	    public AbstractData createInstance()
	    {
		return (AbstractData)new LAI();
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final ContainerInfo c_typeinfo = new ContainerInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "LoggedMeasurementsConfigurationInfo$AreaConfiguration$LocationAreaList"
		),
		new QName (
		    "builtin",
		    "SEQUENCE OF"
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
			"LAI"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' LocationAreaList object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' LocationAreaList object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for LocationAreaList

	// Methods for field "routingAreaList"
	public static AreaConfiguration createAreaConfigurationWithRoutingAreaList(RoutingAreaList routingAreaList)
	{
	    AreaConfiguration __object = new AreaConfiguration();

	    __object.setRoutingAreaList(routingAreaList);
	    return __object;
	}
	
	public boolean hasRoutingAreaList()
	{
	    return getChosenFlag() == routingAreaList_chosen;
	}
	
	public void setRoutingAreaList(RoutingAreaList routingAreaList)
	{
	    setChosenValue(routingAreaList);
	    setChosenFlag(routingAreaList_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type RoutingAreaList from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class RoutingAreaList extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public RoutingAreaList()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public RoutingAreaList(RAI[] elements)
	    {
		super(elements);
	    }
	    
	    /**
	     * Add an Element to the SEQUENCE OF/SET OF.
	     */
	    public synchronized void add(RAI element)
	    {
		super.addElement(element);
	    }
	    
	    /**
	     * Set an Element in the SEQUENCE OF/SET OF.
	     */
	    public synchronized void set(RAI element, int atIndex)
	    {
		super.setElement(element, atIndex);
	    }
	    
	    /**
	     * Get an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized RAI get(int atIndex)
	    {
		return (RAI)super.getElement(atIndex);
	    }
	    
	    /**
	     * Insert an Element into the SEQUENCE OF/SET OF.
	     */
	    public synchronized void insert(RAI element, int atIndex)
	    {
		super.insertElement(element, atIndex);
	    }
	    
	    /**
	     * Remove an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized void remove(RAI element)
	    {
		super.removeElement(element);
	    }
	    
	    /**
	     * Create an instance of  SEQUENCE OF/SET OF.
	     */
	    public AbstractData createInstance()
	    {
		return (AbstractData)new RAI();
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final ContainerInfo c_typeinfo = new ContainerInfo (
		new Tags (
		    new short[] {
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "LoggedMeasurementsConfigurationInfo$AreaConfiguration$RoutingAreaList"
		),
		new QName (
		    "builtin",
		    "SEQUENCE OF"
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
			"RAI"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' RoutingAreaList object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' RoutingAreaList object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for RoutingAreaList

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case cellIDList_chosen:
		    return new CellIDList();
		case locationAreaList_chosen:
		    return new LocationAreaList();
		case routingAreaList_chosen:
		    return new RoutingAreaList();
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
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"LoggedMeasurementsConfigurationInfo$AreaConfiguration"
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
				"LoggedMeasurementsConfigurationInfo$AreaConfiguration$CellIDList"
			    )
			),
			"cellIDList",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"LoggedMeasurementsConfigurationInfo$AreaConfiguration$LocationAreaList"
			    )
			),
			"locationAreaList",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"LoggedMeasurementsConfigurationInfo$AreaConfiguration$RoutingAreaList"
			    )
			),
			"routingAreaList",
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
	 * Get the type descriptor (TypeInfo) of 'this' AreaConfiguration object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' AreaConfiguration object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for AreaConfiguration

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
	    "LoggedMeasurementsConfigurationInfo"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasurementsConfigurationInfo"
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
				    new com.oss.asn1.INTEGER(48)
				)
			    ),
			    new Bounds (
				new java.lang.Long(48),
				new java.lang.Long(48)
			    ),
			    null
			)
		    ),
		    "absoluteTimeInfo",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "LoggedMeasurementsConfigurationInfo$LoggingDuration"
			)
		    ),
		    "loggingDuration",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "LoggedMeasurementsConfigurationInfo$LoggingInterval"
			)
		    ),
		    "loggingInterval",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TraceReference"
			    ),
			    new QName (
				"InformationElements",
				"TraceReference"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TraceReference"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TraceReference"
				)
			    ),
			    0
			)
		    ),
		    "traceReference",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TraceRecordingSession"
			    ),
			    new QName (
				"InformationElements",
				"TraceRecordingSession"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TraceRecordingSession"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TraceRecordingSession"
				)
			    ),
			    0
			)
		    ),
		    "traceRecordingSession",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TCE_Id"
			    ),
			    new QName (
				"InformationElements",
				"TCE-Id"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TCE_Id"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TCE_Id"
				)
			    ),
			    0
			)
		    ),
		    "tce-Id",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "LoggedMeasurementsConfigurationInfo$AreaConfiguration"
			)
		    ),
		    "areaConfiguration",
		    6,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasurementsConfigurationInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasurementsConfigurationInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasurementsConfigurationInfo
