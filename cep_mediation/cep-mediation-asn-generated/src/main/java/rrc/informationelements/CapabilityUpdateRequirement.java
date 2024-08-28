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
 * Define the ASN1 Type CapabilityUpdateRequirement from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CapabilityUpdateRequirement extends Sequence {
    
    /**
     * The default constructor.
     */
    public CapabilityUpdateRequirement()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CapabilityUpdateRequirement(BOOLEAN ue_RadioCapabilityFDDUpdateRequirement, 
		    BOOLEAN ue_RadioCapabilityTDDUpdateRequirement, 
		    SystemSpecificCapUpdateReqList systemSpecificCapUpdateReqList)
    {
	setUe_RadioCapabilityFDDUpdateRequirement(ue_RadioCapabilityFDDUpdateRequirement);
	setUe_RadioCapabilityTDDUpdateRequirement(ue_RadioCapabilityTDDUpdateRequirement);
	setSystemSpecificCapUpdateReqList(systemSpecificCapUpdateReqList);
    }
    
    /**
     * Construct with components.
     */
    public CapabilityUpdateRequirement(boolean ue_RadioCapabilityFDDUpdateRequirement, 
		    boolean ue_RadioCapabilityTDDUpdateRequirement, 
		    SystemSpecificCapUpdateReqList systemSpecificCapUpdateReqList)
    {
	this(new BOOLEAN(ue_RadioCapabilityFDDUpdateRequirement), 
	     new BOOLEAN(ue_RadioCapabilityTDDUpdateRequirement), 
	     systemSpecificCapUpdateReqList);
    }
    
    /**
     * Construct with required components.
     */
    public CapabilityUpdateRequirement(boolean ue_RadioCapabilityFDDUpdateRequirement, 
		    boolean ue_RadioCapabilityTDDUpdateRequirement)
    {
	setUe_RadioCapabilityFDDUpdateRequirement(ue_RadioCapabilityFDDUpdateRequirement);
	setUe_RadioCapabilityTDDUpdateRequirement(ue_RadioCapabilityTDDUpdateRequirement);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new SystemSpecificCapUpdateReqList();
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
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new SystemSpecificCapUpdateReqList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioCapabilityFDDUpdateRequirement"
    public boolean getUe_RadioCapabilityFDDUpdateRequirement()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setUe_RadioCapabilityFDDUpdateRequirement(boolean ue_RadioCapabilityFDDUpdateRequirement)
    {
	setUe_RadioCapabilityFDDUpdateRequirement(new BOOLEAN(ue_RadioCapabilityFDDUpdateRequirement));
    }
    
    public void setUe_RadioCapabilityFDDUpdateRequirement(BOOLEAN ue_RadioCapabilityFDDUpdateRequirement)
    {
	mComponents[0] = ue_RadioCapabilityFDDUpdateRequirement;
    }
    
    
    // Methods for field "ue_RadioCapabilityTDDUpdateRequirement"
    public boolean getUe_RadioCapabilityTDDUpdateRequirement()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setUe_RadioCapabilityTDDUpdateRequirement(boolean ue_RadioCapabilityTDDUpdateRequirement)
    {
	setUe_RadioCapabilityTDDUpdateRequirement(new BOOLEAN(ue_RadioCapabilityTDDUpdateRequirement));
    }
    
    public void setUe_RadioCapabilityTDDUpdateRequirement(BOOLEAN ue_RadioCapabilityTDDUpdateRequirement)
    {
	mComponents[1] = ue_RadioCapabilityTDDUpdateRequirement;
    }
    
    
    // Methods for field "systemSpecificCapUpdateReqList"
    public SystemSpecificCapUpdateReqList getSystemSpecificCapUpdateReqList()
    {
	return (SystemSpecificCapUpdateReqList)mComponents[2];
    }
    
    public void setSystemSpecificCapUpdateReqList(SystemSpecificCapUpdateReqList systemSpecificCapUpdateReqList)
    {
	mComponents[2] = systemSpecificCapUpdateReqList;
    }
    
    public boolean hasSystemSpecificCapUpdateReqList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSystemSpecificCapUpdateReqList()
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
	    "CapabilityUpdateRequirement"
	),
	new QName (
	    "InformationElements",
	    "CapabilityUpdateRequirement"
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
		    "ue-RadioCapabilityFDDUpdateRequirement",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "ue-RadioCapabilityTDDUpdateRequirement",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SystemSpecificCapUpdateReqList"
			    ),
			    new QName (
				"InformationElements",
				"SystemSpecificCapUpdateReqList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SystemSpecificCapUpdateReq"
				)
			    )
			)
		    ),
		    "systemSpecificCapUpdateReqList",
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
     * Get the type descriptor (TypeInfo) of 'this' CapabilityUpdateRequirement object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CapabilityUpdateRequirement object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CapabilityUpdateRequirement
