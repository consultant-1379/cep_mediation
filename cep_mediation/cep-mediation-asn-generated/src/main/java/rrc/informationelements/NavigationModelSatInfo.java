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
 * Define the ASN1 Type NavigationModelSatInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NavigationModelSatInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public NavigationModelSatInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NavigationModelSatInfo(SatID satID, 
		    SatelliteStatus satelliteStatus, 
		    EphemerisParameter ephemerisParameter)
    {
	setSatID(satID);
	setSatelliteStatus(satelliteStatus);
	setEphemerisParameter(ephemerisParameter);
    }
    
    /**
     * Construct with required components.
     */
    public NavigationModelSatInfo(SatID satID, 
		    SatelliteStatus satelliteStatus)
    {
	setSatID(satID);
	setSatelliteStatus(satelliteStatus);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SatID();
	mComponents[1] = SatelliteStatus.ns_NN_U;
	mComponents[2] = new EphemerisParameter();
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
		return new SatID();
	    case 1:
		return SatelliteStatus.ns_NN_U;
	    case 2:
		return new EphemerisParameter();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "satID"
    public SatID getSatID()
    {
	return (SatID)mComponents[0];
    }
    
    public void setSatID(SatID satID)
    {
	mComponents[0] = satID;
    }
    
    
    // Methods for field "satelliteStatus"
    public SatelliteStatus getSatelliteStatus()
    {
	return (SatelliteStatus)mComponents[1];
    }
    
    public void setSatelliteStatus(SatelliteStatus satelliteStatus)
    {
	mComponents[1] = satelliteStatus;
    }
    
    
    // Methods for field "ephemerisParameter"
    public EphemerisParameter getEphemerisParameter()
    {
	return (EphemerisParameter)mComponents[2];
    }
    
    public void setEphemerisParameter(EphemerisParameter ephemerisParameter)
    {
	mComponents[2] = ephemerisParameter;
    }
    
    public boolean hasEphemerisParameter()
    {
	return componentIsPresent(2);
    }
    
    public void deleteEphemerisParameter()
    {
	setComponentAbsent(2);
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
	    "NavigationModelSatInfo"
	),
	new QName (
	    "InformationElements",
	    "NavigationModelSatInfo"
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
				"SatID"
			    ),
			    new QName (
				"InformationElements",
				"SatID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SatID(0), 
				    new SatID(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "satID",
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
				"SatelliteStatus"
			    ),
			    new QName (
				"InformationElements",
				"SatelliteStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ns-NN-U",
					0
				    ),
				    new MemberListElement (
					"es-SN",
					1
				    ),
				    new MemberListElement (
					"es-NN-U",
					2
				    ),
				    new MemberListElement (
					"rev2",
					3
				    ),
				    new MemberListElement (
					"rev",
					4
				    )
				}
			    ),
			    0,
			    SatelliteStatus.ns_NN_U
			)
		    ),
		    "satelliteStatus",
		    1,
		    2,
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
				"EphemerisParameter"
			    ),
			    new QName (
				"InformationElements",
				"EphemerisParameter"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EphemerisParameter"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EphemerisParameter"
				)
			    ),
			    0
			)
		    ),
		    "ephemerisParameter",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NavigationModelSatInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NavigationModelSatInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NavigationModelSatInfo
