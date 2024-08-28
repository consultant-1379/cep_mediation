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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CellUpdate_v690ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellUpdate_v690ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellUpdate_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellUpdate_v690ext_IEs(rrc.informationelements.CellUpdateCause_ext cellUpdateCause_ext, 
		    TrafficVolumeIndicator trafficVolumeIndicator, 
		    rrc.informationelements.MeasuredResultsOnRACHinterFreq measuredResultsOnRACHinterFreq, 
		    ReconfigurationStatusIndicator reconfigurationStatusIndicator)
    {
	setCellUpdateCause_ext(cellUpdateCause_ext);
	setTrafficVolumeIndicator(trafficVolumeIndicator);
	setMeasuredResultsOnRACHinterFreq(measuredResultsOnRACHinterFreq);
	setReconfigurationStatusIndicator(reconfigurationStatusIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.CellUpdateCause_ext.mbms_Reception;
	mComponents[1] = TrafficVolumeIndicator._true;
	mComponents[2] = new rrc.informationelements.MeasuredResultsOnRACHinterFreq();
	mComponents[3] = ReconfigurationStatusIndicator._true;
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
		return rrc.informationelements.CellUpdateCause_ext.mbms_Reception;
	    case 1:
		return TrafficVolumeIndicator._true;
	    case 2:
		return new rrc.informationelements.MeasuredResultsOnRACHinterFreq();
	    case 3:
		return ReconfigurationStatusIndicator._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cellUpdateCause_ext"
    public rrc.informationelements.CellUpdateCause_ext getCellUpdateCause_ext()
    {
	return (rrc.informationelements.CellUpdateCause_ext)mComponents[0];
    }
    
    public void setCellUpdateCause_ext(rrc.informationelements.CellUpdateCause_ext cellUpdateCause_ext)
    {
	mComponents[0] = cellUpdateCause_ext;
    }
    
    public boolean hasCellUpdateCause_ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCellUpdateCause_ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "trafficVolumeIndicator"
    public TrafficVolumeIndicator getTrafficVolumeIndicator()
    {
	return (TrafficVolumeIndicator)mComponents[1];
    }
    
    public void setTrafficVolumeIndicator(TrafficVolumeIndicator trafficVolumeIndicator)
    {
	mComponents[1] = trafficVolumeIndicator;
    }
    
    public boolean hasTrafficVolumeIndicator()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTrafficVolumeIndicator()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type TrafficVolumeIndicator from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class TrafficVolumeIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private TrafficVolumeIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected TrafficVolumeIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final TrafficVolumeIndicator _true =
	    new TrafficVolumeIndicator(0);
	private final static TrafficVolumeIndicator cNamedNumbers[] = {
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
	
	public static TrafficVolumeIndicator valueOf(long value)
	{
	    return (TrafficVolumeIndicator)_true.lookupValue(value);
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
		"rrc.pdu_definitions",
		"CellUpdate_v690ext_IEs$TrafficVolumeIndicator"
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
	 * Get the type descriptor (TypeInfo) of 'this' TrafficVolumeIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' TrafficVolumeIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for TrafficVolumeIndicator

    // Methods for field "measuredResultsOnRACHinterFreq"
    public rrc.informationelements.MeasuredResultsOnRACHinterFreq getMeasuredResultsOnRACHinterFreq()
    {
	return (rrc.informationelements.MeasuredResultsOnRACHinterFreq)mComponents[2];
    }
    
    public void setMeasuredResultsOnRACHinterFreq(rrc.informationelements.MeasuredResultsOnRACHinterFreq measuredResultsOnRACHinterFreq)
    {
	mComponents[2] = measuredResultsOnRACHinterFreq;
    }
    
    public boolean hasMeasuredResultsOnRACHinterFreq()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMeasuredResultsOnRACHinterFreq()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "reconfigurationStatusIndicator"
    public ReconfigurationStatusIndicator getReconfigurationStatusIndicator()
    {
	return (ReconfigurationStatusIndicator)mComponents[3];
    }
    
    public void setReconfigurationStatusIndicator(ReconfigurationStatusIndicator reconfigurationStatusIndicator)
    {
	mComponents[3] = reconfigurationStatusIndicator;
    }
    
    public boolean hasReconfigurationStatusIndicator()
    {
	return componentIsPresent(3);
    }
    
    public void deleteReconfigurationStatusIndicator()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type ReconfigurationStatusIndicator from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class ReconfigurationStatusIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private ReconfigurationStatusIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected ReconfigurationStatusIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final ReconfigurationStatusIndicator _true =
	    new ReconfigurationStatusIndicator(0);
	private final static ReconfigurationStatusIndicator cNamedNumbers[] = {
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
	
	public static ReconfigurationStatusIndicator valueOf(long value)
	{
	    return (ReconfigurationStatusIndicator)_true.lookupValue(value);
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
		"rrc.pdu_definitions",
		"CellUpdate_v690ext_IEs$ReconfigurationStatusIndicator"
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
	 * Get the type descriptor (TypeInfo) of 'this' ReconfigurationStatusIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ReconfigurationStatusIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ReconfigurationStatusIndicator

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
	    "rrc.pdu_definitions",
	    "CellUpdate_v690ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdate-v690ext-IEs"
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
				"CellUpdateCause_ext"
			    ),
			    new QName (
				"InformationElements",
				"CellUpdateCause-ext"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mbms-Reception",
					0
				    ),
				    new MemberListElement (
					"mbms-PTP-RB-Request",
					1
				    ),
				    new MemberListElement (
					"dummy",
					2
				    ),
				    new MemberListElement (
					"spare1",
					3
				    )
				}
			    ),
			    0,
			    rrc.informationelements.CellUpdateCause_ext.mbms_Reception
			)
		    ),
		    "cellUpdateCause-ext",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_v690ext_IEs$TrafficVolumeIndicator"
			)
		    ),
		    "trafficVolumeIndicator",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResultsOnRACHinterFreq"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsOnRACHinterFreq"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACHinterFreq"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnRACHinterFreq"
				)
			    ),
			    0
			)
		    ),
		    "measuredResultsOnRACHinterFreq",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdate_v690ext_IEs$ReconfigurationStatusIndicator"
			)
		    ),
		    "reconfigurationStatusIndicator",
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
     * Get the type descriptor (TypeInfo) of 'this' CellUpdate_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdate_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdate_v690ext_IEs
