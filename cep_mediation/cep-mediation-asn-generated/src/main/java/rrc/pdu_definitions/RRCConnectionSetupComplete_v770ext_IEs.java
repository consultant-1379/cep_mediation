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
 * Define the ASN1 Type RRCConnectionSetupComplete_v770ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionSetupComplete_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionSetupComplete_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionSetupComplete_v770ext_IEs(DeferredMeasurementControlReading deferredMeasurementControlReading)
    {
	setDeferredMeasurementControlReading(deferredMeasurementControlReading);
    }
    
    public void initComponents()
    {
	mComponents[0] = DeferredMeasurementControlReading._true;
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
		return DeferredMeasurementControlReading._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "deferredMeasurementControlReading"
    public DeferredMeasurementControlReading getDeferredMeasurementControlReading()
    {
	return (DeferredMeasurementControlReading)mComponents[0];
    }
    
    public void setDeferredMeasurementControlReading(DeferredMeasurementControlReading deferredMeasurementControlReading)
    {
	mComponents[0] = deferredMeasurementControlReading;
    }
    
    public boolean hasDeferredMeasurementControlReading()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDeferredMeasurementControlReading()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type DeferredMeasurementControlReading from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class DeferredMeasurementControlReading extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DeferredMeasurementControlReading()
	{
	    super(cFirstNumber);
	}
	
	protected DeferredMeasurementControlReading(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final DeferredMeasurementControlReading _true =
	    new DeferredMeasurementControlReading(0);
	private final static DeferredMeasurementControlReading cNamedNumbers[] = {
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
	
	public static DeferredMeasurementControlReading valueOf(long value)
	{
	    return (DeferredMeasurementControlReading)_true.lookupValue(value);
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
		"rrc.pdu_definitions",
		"RRCConnectionSetupComplete_v770ext_IEs$DeferredMeasurementControlReading"
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
	 * Get the type descriptor (TypeInfo) of 'this' DeferredMeasurementControlReading object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DeferredMeasurementControlReading object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DeferredMeasurementControlReading

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
	    "RRCConnectionSetupComplete_v770ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionSetupComplete-v770ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionSetupComplete_v770ext_IEs$DeferredMeasurementControlReading"
			)
		    ),
		    "deferredMeasurementControlReading",
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionSetupComplete_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionSetupComplete_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionSetupComplete_v770ext_IEs
