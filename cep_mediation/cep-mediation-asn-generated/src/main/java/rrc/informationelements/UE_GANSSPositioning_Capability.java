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
 * Define the ASN1 Type UE_GANSSPositioning_Capability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_GANSSPositioning_Capability extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_GANSSPositioning_Capability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_GANSSPositioning_Capability(NetworkAssistedGANSS_Supported_List networkAssistedGANSS_supportedList)
    {
	setNetworkAssistedGANSS_supportedList(networkAssistedGANSS_supportedList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new NetworkAssistedGANSS_Supported_List();
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
		return new NetworkAssistedGANSS_Supported_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "networkAssistedGANSS_supportedList"
    public NetworkAssistedGANSS_Supported_List getNetworkAssistedGANSS_supportedList()
    {
	return (NetworkAssistedGANSS_Supported_List)mComponents[0];
    }
    
    public void setNetworkAssistedGANSS_supportedList(NetworkAssistedGANSS_Supported_List networkAssistedGANSS_supportedList)
    {
	mComponents[0] = networkAssistedGANSS_supportedList;
    }
    
    public boolean hasNetworkAssistedGANSS_supportedList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteNetworkAssistedGANSS_supportedList()
    {
	setComponentAbsent(0);
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
	    "UE_GANSSPositioning_Capability"
	),
	new QName (
	    "InformationElements",
	    "UE-GANSSPositioning-Capability"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
			)
		    ),
		    "networkAssistedGANSS-supportedList",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_GANSSPositioning_Capability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_GANSSPositioning_Capability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_GANSSPositioning_Capability
