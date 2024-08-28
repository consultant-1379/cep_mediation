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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type OngoingMeasRep_v970ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class OngoingMeasRep_v970ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public OngoingMeasRep_v970ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public OngoingMeasRep_v970ext_IEs(rrc.informationelements.MeasurementIdentity_r9 measurementIdentity, 
		    rrc.informationelements.AdditionalMeasurementID_List_r9 additionalMeasurementID_List)
    {
	setMeasurementIdentity(measurementIdentity);
	setAdditionalMeasurementID_List(additionalMeasurementID_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MeasurementIdentity_r9();
	mComponents[1] = new rrc.informationelements.AdditionalMeasurementID_List_r9();
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
		return new rrc.informationelements.MeasurementIdentity_r9();
	    case 1:
		return new rrc.informationelements.AdditionalMeasurementID_List_r9();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measurementIdentity"
    public rrc.informationelements.MeasurementIdentity_r9 getMeasurementIdentity()
    {
	return (rrc.informationelements.MeasurementIdentity_r9)mComponents[0];
    }
    
    public void setMeasurementIdentity(rrc.informationelements.MeasurementIdentity_r9 measurementIdentity)
    {
	mComponents[0] = measurementIdentity;
    }
    
    public boolean hasMeasurementIdentity()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMeasurementIdentity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "additionalMeasurementID_List"
    public rrc.informationelements.AdditionalMeasurementID_List_r9 getAdditionalMeasurementID_List()
    {
	return (rrc.informationelements.AdditionalMeasurementID_List_r9)mComponents[1];
    }
    
    public void setAdditionalMeasurementID_List(rrc.informationelements.AdditionalMeasurementID_List_r9 additionalMeasurementID_List)
    {
	mComponents[1] = additionalMeasurementID_List;
    }
    
    public boolean hasAdditionalMeasurementID_List()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAdditionalMeasurementID_List()
    {
	setComponentAbsent(1);
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
	    "rrc.internode_definitions",
	    "OngoingMeasRep_v970ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "OngoingMeasRep-v970ext-IEs"
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
				"MeasurementIdentity_r9"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementIdentity-r9"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MeasurementIdentity_r9(1), 
				    new rrc.informationelements.MeasurementIdentity_r9(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "measurementIdentity",
		    0,
		    3,
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
				"AdditionalMeasurementID_List_r9"
			    ),
			    new QName (
				"InformationElements",
				"AdditionalMeasurementID-List-r9"
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
				    "MeasurementIdentity_r9"
				)
			    )
			)
		    ),
		    "additionalMeasurementID-List",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' OngoingMeasRep_v970ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OngoingMeasRep_v970ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OngoingMeasRep_v970ext_IEs
