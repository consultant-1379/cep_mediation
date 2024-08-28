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
 * Define the ASN1 Type DL_PhysChCapabilityTDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_PhysChCapabilityTDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityTDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityTDD(MaxTS_PerFrame maxTS_PerFrame, 
		    MaxPhysChPerFrame maxPhysChPerFrame, 
		    MinimumSF_DL minimumSF, BOOLEAN supportOfPDSCH, 
		    MaxPhysChPerTS maxPhysChPerTS)
    {
	setMaxTS_PerFrame(maxTS_PerFrame);
	setMaxPhysChPerFrame(maxPhysChPerFrame);
	setMinimumSF(minimumSF);
	setSupportOfPDSCH(supportOfPDSCH);
	setMaxPhysChPerTS(maxPhysChPerTS);
    }
    
    /**
     * Construct with components.
     */
    public DL_PhysChCapabilityTDD(MaxTS_PerFrame maxTS_PerFrame, 
		    MaxPhysChPerFrame maxPhysChPerFrame, 
		    MinimumSF_DL minimumSF, boolean supportOfPDSCH, 
		    MaxPhysChPerTS maxPhysChPerTS)
    {
	this(maxTS_PerFrame, maxPhysChPerFrame, minimumSF, 
	     new BOOLEAN(supportOfPDSCH), maxPhysChPerTS);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MaxTS_PerFrame();
	mComponents[1] = new MaxPhysChPerFrame();
	mComponents[2] = MinimumSF_DL.sf1;
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new MaxPhysChPerTS();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MaxTS_PerFrame();
	    case 1:
		return new MaxPhysChPerFrame();
	    case 2:
		return MinimumSF_DL.sf1;
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new MaxPhysChPerTS();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxTS_PerFrame"
    public MaxTS_PerFrame getMaxTS_PerFrame()
    {
	return (MaxTS_PerFrame)mComponents[0];
    }
    
    public void setMaxTS_PerFrame(MaxTS_PerFrame maxTS_PerFrame)
    {
	mComponents[0] = maxTS_PerFrame;
    }
    
    
    // Methods for field "maxPhysChPerFrame"
    public MaxPhysChPerFrame getMaxPhysChPerFrame()
    {
	return (MaxPhysChPerFrame)mComponents[1];
    }
    
    public void setMaxPhysChPerFrame(MaxPhysChPerFrame maxPhysChPerFrame)
    {
	mComponents[1] = maxPhysChPerFrame;
    }
    
    
    // Methods for field "minimumSF"
    public MinimumSF_DL getMinimumSF()
    {
	return (MinimumSF_DL)mComponents[2];
    }
    
    public void setMinimumSF(MinimumSF_DL minimumSF)
    {
	mComponents[2] = minimumSF;
    }
    
    
    // Methods for field "supportOfPDSCH"
    public boolean getSupportOfPDSCH()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setSupportOfPDSCH(boolean supportOfPDSCH)
    {
	setSupportOfPDSCH(new BOOLEAN(supportOfPDSCH));
    }
    
    public void setSupportOfPDSCH(BOOLEAN supportOfPDSCH)
    {
	mComponents[3] = supportOfPDSCH;
    }
    
    
    // Methods for field "maxPhysChPerTS"
    public MaxPhysChPerTS getMaxPhysChPerTS()
    {
	return (MaxPhysChPerTS)mComponents[4];
    }
    
    public void setMaxPhysChPerTS(MaxPhysChPerTS maxPhysChPerTS)
    {
	mComponents[4] = maxPhysChPerTS;
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
	    "DL_PhysChCapabilityTDD"
	),
	new QName (
	    "InformationElements",
	    "DL-PhysChCapabilityTDD"
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
				"MaxTS_PerFrame"
			    ),
			    new QName (
				"InformationElements",
				"MaxTS-PerFrame"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxTS_PerFrame(1), 
				    new MaxTS_PerFrame(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "maxTS-PerFrame",
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
				"MaxPhysChPerFrame"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerFrame"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxPhysChPerFrame(1), 
				    new MaxPhysChPerFrame(224),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(224)
			    ),
			    null
			)
		    ),
		    "maxPhysChPerFrame",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MinimumSF_DL"
			    ),
			    new QName (
				"InformationElements",
				"MinimumSF-DL"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sf1",
					0
				    ),
				    new MemberListElement (
					"sf16",
					1
				    )
				}
			    ),
			    0,
			    MinimumSF_DL.sf1
			)
		    ),
		    "minimumSF",
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
		    "supportOfPDSCH",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxPhysChPerTS"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerTS"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxPhysChPerTS(1), 
				    new MaxPhysChPerTS(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "maxPhysChPerTS",
		    4,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityTDD
