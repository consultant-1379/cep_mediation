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
 * Define the ASN1 Type UE_RadioAccessCapabilityComp from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabilityComp extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabilityComp()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabilityComp(BOOLEAN totalAM_RLCMemoryExceeds10kB, 
		    RF_CapabilityComp rf_CapabilityComp)
    {
	setTotalAM_RLCMemoryExceeds10kB(totalAM_RLCMemoryExceeds10kB);
	setRf_CapabilityComp(rf_CapabilityComp);
    }
    
    /**
     * Construct with components.
     */
    public UE_RadioAccessCapabilityComp(boolean totalAM_RLCMemoryExceeds10kB, 
		    RF_CapabilityComp rf_CapabilityComp)
    {
	this(new BOOLEAN(totalAM_RLCMemoryExceeds10kB), rf_CapabilityComp);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new RF_CapabilityComp();
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
		return new BOOLEAN();
	    case 1:
		return new RF_CapabilityComp();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "totalAM_RLCMemoryExceeds10kB"
    public boolean getTotalAM_RLCMemoryExceeds10kB()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setTotalAM_RLCMemoryExceeds10kB(boolean totalAM_RLCMemoryExceeds10kB)
    {
	setTotalAM_RLCMemoryExceeds10kB(new BOOLEAN(totalAM_RLCMemoryExceeds10kB));
    }
    
    public void setTotalAM_RLCMemoryExceeds10kB(BOOLEAN totalAM_RLCMemoryExceeds10kB)
    {
	mComponents[0] = totalAM_RLCMemoryExceeds10kB;
    }
    
    
    // Methods for field "rf_CapabilityComp"
    public RF_CapabilityComp getRf_CapabilityComp()
    {
	return (RF_CapabilityComp)mComponents[1];
    }
    
    public void setRf_CapabilityComp(RF_CapabilityComp rf_CapabilityComp)
    {
	mComponents[1] = rf_CapabilityComp;
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
	    "UE_RadioAccessCapabilityComp"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabilityComp"
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
		    "totalAM-RLCMemoryExceeds10kB",
		    0,
		    2,
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
				"RF_CapabilityComp"
			    ),
			    new QName (
				"InformationElements",
				"RF-CapabilityComp"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RF_CapabilityComp"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RF_CapabilityComp"
				)
			    ),
			    0
			)
		    ),
		    "rf-CapabilityComp",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabilityComp
