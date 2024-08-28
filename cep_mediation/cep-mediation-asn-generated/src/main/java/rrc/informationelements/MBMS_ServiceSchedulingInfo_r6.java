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
 * Define the ASN1 Type MBMS_ServiceSchedulingInfo_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_ServiceSchedulingInfo_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_ServiceSchedulingInfo_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_ServiceSchedulingInfo_r6(MBMS_TransmissionIdentity mbms_TransmissionIdentity, 
		    MBMS_ServiceTransmInfoList mbms_ServiceTransmInfoList, 
		    INTEGER nextSchedulingperiod)
    {
	setMbms_TransmissionIdentity(mbms_TransmissionIdentity);
	setMbms_ServiceTransmInfoList(mbms_ServiceTransmInfoList);
	setNextSchedulingperiod(nextSchedulingperiod);
    }
    
    /**
     * Construct with components.
     */
    public MBMS_ServiceSchedulingInfo_r6(MBMS_TransmissionIdentity mbms_TransmissionIdentity, 
		    MBMS_ServiceTransmInfoList mbms_ServiceTransmInfoList, 
		    long nextSchedulingperiod)
    {
	this(mbms_TransmissionIdentity, mbms_ServiceTransmInfoList, 
	     new INTEGER(nextSchedulingperiod));
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_ServiceSchedulingInfo_r6(MBMS_TransmissionIdentity mbms_TransmissionIdentity, 
		    long nextSchedulingperiod)
    {
	setMbms_TransmissionIdentity(mbms_TransmissionIdentity);
	setNextSchedulingperiod(nextSchedulingperiod);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_TransmissionIdentity();
	mComponents[1] = new MBMS_ServiceTransmInfoList();
	mComponents[2] = new INTEGER();
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
		return new MBMS_TransmissionIdentity();
	    case 1:
		return new MBMS_ServiceTransmInfoList();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_TransmissionIdentity"
    public MBMS_TransmissionIdentity getMbms_TransmissionIdentity()
    {
	return (MBMS_TransmissionIdentity)mComponents[0];
    }
    
    public void setMbms_TransmissionIdentity(MBMS_TransmissionIdentity mbms_TransmissionIdentity)
    {
	mComponents[0] = mbms_TransmissionIdentity;
    }
    
    
    // Methods for field "mbms_ServiceTransmInfoList"
    public MBMS_ServiceTransmInfoList getMbms_ServiceTransmInfoList()
    {
	return (MBMS_ServiceTransmInfoList)mComponents[1];
    }
    
    public void setMbms_ServiceTransmInfoList(MBMS_ServiceTransmInfoList mbms_ServiceTransmInfoList)
    {
	mComponents[1] = mbms_ServiceTransmInfoList;
    }
    
    public boolean hasMbms_ServiceTransmInfoList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMbms_ServiceTransmInfoList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "nextSchedulingperiod"
    public long getNextSchedulingperiod()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setNextSchedulingperiod(long nextSchedulingperiod)
    {
	setNextSchedulingperiod(new INTEGER(nextSchedulingperiod));
    }
    
    public void setNextSchedulingperiod(INTEGER nextSchedulingperiod)
    {
	mComponents[2] = nextSchedulingperiod;
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
	    "MBMS_ServiceSchedulingInfo_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-ServiceSchedulingInfo-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_TransmissionIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-TransmissionIdentity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TransmissionIdentity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TransmissionIdentity"
				)
			    ),
			    0
			)
		    ),
		    "mbms-TransmissionIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_ServiceTransmInfoList"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-ServiceTransmInfoList"
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
				    "MBMS_ServiceTransmInfo"
				)
			    )
			)
		    ),
		    "mbms-ServiceTransmInfoList",
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
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "nextSchedulingperiod",
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_ServiceSchedulingInfo_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_ServiceSchedulingInfo_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_ServiceSchedulingInfo_r6
