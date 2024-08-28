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
 * Define the ASN1 Type InitialDirectTransfer_v690ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InitialDirectTransfer_v690ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InitialDirectTransfer_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InitialDirectTransfer_v690ext_IEs(rrc.informationelements.PLMN_Identity plmn_Identity, 
		    rrc.informationelements.MeasuredResultsOnRACHinterFreq measuredResultsOnRACHinterFreq, 
		    rrc.informationelements.MBMS_JoinedInformation_r6 mbms_JoinedInformation)
    {
	setPlmn_Identity(plmn_Identity);
	setMeasuredResultsOnRACHinterFreq(measuredResultsOnRACHinterFreq);
	setMbms_JoinedInformation(mbms_JoinedInformation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.PLMN_Identity();
	mComponents[1] = new rrc.informationelements.MeasuredResultsOnRACHinterFreq();
	mComponents[2] = new rrc.informationelements.MBMS_JoinedInformation_r6();
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
		return new rrc.informationelements.PLMN_Identity();
	    case 1:
		return new rrc.informationelements.MeasuredResultsOnRACHinterFreq();
	    case 2:
		return new rrc.informationelements.MBMS_JoinedInformation_r6();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "plmn_Identity"
    public rrc.informationelements.PLMN_Identity getPlmn_Identity()
    {
	return (rrc.informationelements.PLMN_Identity)mComponents[0];
    }
    
    public void setPlmn_Identity(rrc.informationelements.PLMN_Identity plmn_Identity)
    {
	mComponents[0] = plmn_Identity;
    }
    
    public boolean hasPlmn_Identity()
    {
	return componentIsPresent(0);
    }
    
    public void deletePlmn_Identity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "measuredResultsOnRACHinterFreq"
    public rrc.informationelements.MeasuredResultsOnRACHinterFreq getMeasuredResultsOnRACHinterFreq()
    {
	return (rrc.informationelements.MeasuredResultsOnRACHinterFreq)mComponents[1];
    }
    
    public void setMeasuredResultsOnRACHinterFreq(rrc.informationelements.MeasuredResultsOnRACHinterFreq measuredResultsOnRACHinterFreq)
    {
	mComponents[1] = measuredResultsOnRACHinterFreq;
    }
    
    public boolean hasMeasuredResultsOnRACHinterFreq()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMeasuredResultsOnRACHinterFreq()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "mbms_JoinedInformation"
    public rrc.informationelements.MBMS_JoinedInformation_r6 getMbms_JoinedInformation()
    {
	return (rrc.informationelements.MBMS_JoinedInformation_r6)mComponents[2];
    }
    
    public void setMbms_JoinedInformation(rrc.informationelements.MBMS_JoinedInformation_r6 mbms_JoinedInformation)
    {
	mComponents[2] = mbms_JoinedInformation;
    }
    
    public boolean hasMbms_JoinedInformation()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMbms_JoinedInformation()
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
	    "rrc.pdu_definitions",
	    "InitialDirectTransfer_v690ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "InitialDirectTransfer-v690ext-IEs"
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
				"PLMN_Identity"
			    ),
			    new QName (
				"InformationElements",
				"PLMN-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Identity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PLMN_Identity"
				)
			    ),
			    0
			)
		    ),
		    "plmn-Identity",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				"MBMS_JoinedInformation_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-JoinedInformation-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_JoinedInformation_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_JoinedInformation_r6"
				)
			    ),
			    0
			)
		    ),
		    "mbms-JoinedInformation",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' InitialDirectTransfer_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InitialDirectTransfer_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InitialDirectTransfer_v690ext_IEs
