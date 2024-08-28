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
 * Define the ASN1 Type DL_PhysChCapabilityFDD_r4 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class DL_PhysChCapabilityFDD_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityFDD_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityFDD_r4(INTEGER maxNoDPCH_PDSCH_Codes, 
		    rrc.informationelements.MaxNoPhysChBitsReceived maxNoPhysChBitsReceived, 
		    BOOLEAN supportForSF_512, BOOLEAN dummy, 
		    rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception dummy2, 
		    rrc.informationelements.SupportOfDedicatedPilotsForChEstimation dummy3)
    {
	setMaxNoDPCH_PDSCH_Codes(maxNoDPCH_PDSCH_Codes);
	setMaxNoPhysChBitsReceived(maxNoPhysChBitsReceived);
	setSupportForSF_512(supportForSF_512);
	setDummy(dummy);
	setDummy2(dummy2);
	setDummy3(dummy3);
    }
    
    /**
     * Construct with components.
     */
    public DL_PhysChCapabilityFDD_r4(long maxNoDPCH_PDSCH_Codes, 
		    rrc.informationelements.MaxNoPhysChBitsReceived maxNoPhysChBitsReceived, 
		    boolean supportForSF_512, boolean dummy, 
		    rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception dummy2, 
		    rrc.informationelements.SupportOfDedicatedPilotsForChEstimation dummy3)
    {
	this(new INTEGER(maxNoDPCH_PDSCH_Codes), maxNoPhysChBitsReceived, 
	     new BOOLEAN(supportForSF_512), new BOOLEAN(dummy), dummy2, 
	     dummy3);
    }
    
    /**
     * Construct with required components.
     */
    public DL_PhysChCapabilityFDD_r4(long maxNoDPCH_PDSCH_Codes, 
		    rrc.informationelements.MaxNoPhysChBitsReceived maxNoPhysChBitsReceived, 
		    boolean supportForSF_512, boolean dummy, 
		    rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception dummy2)
    {
	setMaxNoDPCH_PDSCH_Codes(maxNoDPCH_PDSCH_Codes);
	setMaxNoPhysChBitsReceived(maxNoPhysChBitsReceived);
	setSupportForSF_512(supportForSF_512);
	setDummy(dummy);
	setDummy2(dummy2);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = rrc.informationelements.MaxNoPhysChBitsReceived.dummy;
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception();
	mComponents[5] = rrc.informationelements.SupportOfDedicatedPilotsForChEstimation._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return rrc.informationelements.MaxNoPhysChBitsReceived.dummy;
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception();
	    case 5:
		return rrc.informationelements.SupportOfDedicatedPilotsForChEstimation._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxNoDPCH_PDSCH_Codes"
    public long getMaxNoDPCH_PDSCH_Codes()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMaxNoDPCH_PDSCH_Codes(long maxNoDPCH_PDSCH_Codes)
    {
	setMaxNoDPCH_PDSCH_Codes(new INTEGER(maxNoDPCH_PDSCH_Codes));
    }
    
    public void setMaxNoDPCH_PDSCH_Codes(INTEGER maxNoDPCH_PDSCH_Codes)
    {
	mComponents[0] = maxNoDPCH_PDSCH_Codes;
    }
    
    
    // Methods for field "maxNoPhysChBitsReceived"
    public rrc.informationelements.MaxNoPhysChBitsReceived getMaxNoPhysChBitsReceived()
    {
	return (rrc.informationelements.MaxNoPhysChBitsReceived)mComponents[1];
    }
    
    public void setMaxNoPhysChBitsReceived(rrc.informationelements.MaxNoPhysChBitsReceived maxNoPhysChBitsReceived)
    {
	mComponents[1] = maxNoPhysChBitsReceived;
    }
    
    
    // Methods for field "supportForSF_512"
    public boolean getSupportForSF_512()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setSupportForSF_512(boolean supportForSF_512)
    {
	setSupportForSF_512(new BOOLEAN(supportForSF_512));
    }
    
    public void setSupportForSF_512(BOOLEAN supportForSF_512)
    {
	mComponents[2] = supportForSF_512;
    }
    
    
    // Methods for field "dummy"
    public boolean getDummy()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setDummy(boolean dummy)
    {
	setDummy(new BOOLEAN(dummy));
    }
    
    public void setDummy(BOOLEAN dummy)
    {
	mComponents[3] = dummy;
    }
    
    
    // Methods for field "dummy2"
    public rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception getDummy2()
    {
	return (rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception)mComponents[4];
    }
    
    public void setDummy2(rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception dummy2)
    {
	mComponents[4] = dummy2;
    }
    
    
    // Methods for field "dummy3"
    public rrc.informationelements.SupportOfDedicatedPilotsForChEstimation getDummy3()
    {
	return (rrc.informationelements.SupportOfDedicatedPilotsForChEstimation)mComponents[5];
    }
    
    public void setDummy3(rrc.informationelements.SupportOfDedicatedPilotsForChEstimation dummy3)
    {
	mComponents[5] = dummy3;
    }
    
    public boolean hasDummy3()
    {
	return componentIsPresent(5);
    }
    
    public void deleteDummy3()
    {
	setComponentAbsent(5);
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
	    "DL_PhysChCapabilityFDD_r4"
	),
	new QName (
	    "Internode-definitions",
	    "DL-PhysChCapabilityFDD-r4"
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "maxNoDPCH-PDSCH-Codes",
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
				"MaxNoPhysChBitsReceived"
			    ),
			    new QName (
				"InformationElements",
				"MaxNoPhysChBitsReceived"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dummy",
					0
				    ),
				    new MemberListElement (
					"b1200",
					1
				    ),
				    new MemberListElement (
					"b2400",
					2
				    ),
				    new MemberListElement (
					"b3600",
					3
				    ),
				    new MemberListElement (
					"b4800",
					4
				    ),
				    new MemberListElement (
					"b7200",
					5
				    ),
				    new MemberListElement (
					"b9600",
					6
				    ),
				    new MemberListElement (
					"b14400",
					7
				    ),
				    new MemberListElement (
					"b19200",
					8
				    ),
				    new MemberListElement (
					"b28800",
					9
				    ),
				    new MemberListElement (
					"b38400",
					10
				    ),
				    new MemberListElement (
					"b48000",
					11
				    ),
				    new MemberListElement (
					"b57600",
					12
				    ),
				    new MemberListElement (
					"b67200",
					13
				    ),
				    new MemberListElement (
					"b76800",
					14
				    )
				}
			    ),
			    0,
			    rrc.informationelements.MaxNoPhysChBitsReceived.dummy
			)
		    ),
		    "maxNoPhysChBitsReceived",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "supportForSF-512",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "dummy",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SimultaneousSCCPCH_DPCH_Reception"
			    ),
			    new QName (
				"InformationElements",
				"SimultaneousSCCPCH-DPCH-Reception"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SimultaneousSCCPCH_DPCH_Reception"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "dummy2",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SupportOfDedicatedPilotsForChEstimation"
			    ),
			    new QName (
				"InformationElements",
				"SupportOfDedicatedPilotsForChEstimation"
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
			    rrc.informationelements.SupportOfDedicatedPilotsForChEstimation._true
			)
		    ),
		    "dummy3",
		    5,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityFDD_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityFDD_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityFDD_r4
