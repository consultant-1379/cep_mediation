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
 * Define the ASN1 Type AvailableMinimumSF_VCAM from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AvailableMinimumSF_VCAM extends Sequence {
    
    /**
     * The default constructor.
     */
    public AvailableMinimumSF_VCAM()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AvailableMinimumSF_VCAM(MinimumSpreadingFactor minimumSpreadingFactor, 
		    NF_Max nf_Max, 
		    MaxAvailablePCPCH_Number maxAvailablePCPCH_Number, 
		    AvailableAP_Signature_VCAMList availableAP_Signature_VCAMList)
    {
	setMinimumSpreadingFactor(minimumSpreadingFactor);
	setNf_Max(nf_Max);
	setMaxAvailablePCPCH_Number(maxAvailablePCPCH_Number);
	setAvailableAP_Signature_VCAMList(availableAP_Signature_VCAMList);
    }
    
    public void initComponents()
    {
	mComponents[0] = MinimumSpreadingFactor.sf4;
	mComponents[1] = new NF_Max();
	mComponents[2] = new MaxAvailablePCPCH_Number();
	mComponents[3] = new AvailableAP_Signature_VCAMList();
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
		return MinimumSpreadingFactor.sf4;
	    case 1:
		return new NF_Max();
	    case 2:
		return new MaxAvailablePCPCH_Number();
	    case 3:
		return new AvailableAP_Signature_VCAMList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "minimumSpreadingFactor"
    public MinimumSpreadingFactor getMinimumSpreadingFactor()
    {
	return (MinimumSpreadingFactor)mComponents[0];
    }
    
    public void setMinimumSpreadingFactor(MinimumSpreadingFactor minimumSpreadingFactor)
    {
	mComponents[0] = minimumSpreadingFactor;
    }
    
    
    // Methods for field "nf_Max"
    public NF_Max getNf_Max()
    {
	return (NF_Max)mComponents[1];
    }
    
    public void setNf_Max(NF_Max nf_Max)
    {
	mComponents[1] = nf_Max;
    }
    
    
    // Methods for field "maxAvailablePCPCH_Number"
    public MaxAvailablePCPCH_Number getMaxAvailablePCPCH_Number()
    {
	return (MaxAvailablePCPCH_Number)mComponents[2];
    }
    
    public void setMaxAvailablePCPCH_Number(MaxAvailablePCPCH_Number maxAvailablePCPCH_Number)
    {
	mComponents[2] = maxAvailablePCPCH_Number;
    }
    
    
    // Methods for field "availableAP_Signature_VCAMList"
    public AvailableAP_Signature_VCAMList getAvailableAP_Signature_VCAMList()
    {
	return (AvailableAP_Signature_VCAMList)mComponents[3];
    }
    
    public void setAvailableAP_Signature_VCAMList(AvailableAP_Signature_VCAMList availableAP_Signature_VCAMList)
    {
	mComponents[3] = availableAP_Signature_VCAMList;
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
	    "AvailableMinimumSF_VCAM"
	),
	new QName (
	    "InformationElements",
	    "AvailableMinimumSF-VCAM"
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
				"MinimumSpreadingFactor"
			    ),
			    new QName (
				"InformationElements",
				"MinimumSpreadingFactor"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sf4",
					0
				    ),
				    new MemberListElement (
					"sf8",
					1
				    ),
				    new MemberListElement (
					"sf16",
					2
				    ),
				    new MemberListElement (
					"sf32",
					3
				    ),
				    new MemberListElement (
					"sf64",
					4
				    ),
				    new MemberListElement (
					"sf128",
					5
				    ),
				    new MemberListElement (
					"sf256",
					6
				    )
				}
			    ),
			    0,
			    MinimumSpreadingFactor.sf4
			)
		    ),
		    "minimumSpreadingFactor",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NF_Max"
			    ),
			    new QName (
				"InformationElements",
				"NF-Max"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new NF_Max(1), 
				    new NF_Max(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "nf-Max",
		    1,
		    2,
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
				"rrc.informationelements",
				"MaxAvailablePCPCH_Number"
			    ),
			    new QName (
				"InformationElements",
				"MaxAvailablePCPCH-Number"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxAvailablePCPCH_Number(1), 
				    new MaxAvailablePCPCH_Number(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "maxAvailablePCPCH-Number",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AvailableAP_Signature_VCAMList"
			    ),
			    new QName (
				"InformationElements",
				"AvailableAP-Signature-VCAMList"
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
				    "AP_Signature_VCAM"
				)
			    )
			)
		    ),
		    "availableAP-Signature-VCAMList",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' AvailableMinimumSF_VCAM object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AvailableMinimumSF_VCAM object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AvailableMinimumSF_VCAM
