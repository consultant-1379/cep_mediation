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
 * Define the ASN1 Type MBMSGeneralInformation_v6b0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSGeneralInformation_v6b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSGeneralInformation_v6b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSGeneralInformation_v6b0ext_IEs(BOOLEAN indicateChangeInSelectedServices)
    {
	setIndicateChangeInSelectedServices(indicateChangeInSelectedServices);
    }
    
    /**
     * Construct with components.
     */
    public MBMSGeneralInformation_v6b0ext_IEs(boolean indicateChangeInSelectedServices)
    {
	this(new BOOLEAN(indicateChangeInSelectedServices));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
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
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "indicateChangeInSelectedServices"
    public boolean getIndicateChangeInSelectedServices()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setIndicateChangeInSelectedServices(boolean indicateChangeInSelectedServices)
    {
	setIndicateChangeInSelectedServices(new BOOLEAN(indicateChangeInSelectedServices));
    }
    
    public void setIndicateChangeInSelectedServices(BOOLEAN indicateChangeInSelectedServices)
    {
	mComponents[0] = indicateChangeInSelectedServices;
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
	    "MBMSGeneralInformation_v6b0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSGeneralInformation-v6b0ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "indicateChangeInSelectedServices",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMSGeneralInformation_v6b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSGeneralInformation_v6b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSGeneralInformation_v6b0ext_IEs
