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
 * Define the ASN1 Type DL_PhysChCapabilityTDD_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_PhysChCapabilityTDD_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityTDD_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityTDD_LCR_r4(MaxTS_PerSubFrame_r4 maxTS_PerSubFrame, 
		    MaxPhysChPerSubFrame_r4 maxPhysChPerFrame, 
		    MinimumSF_DL minimumSF, BOOLEAN supportOfPDSCH, 
		    MaxPhysChPerTS maxPhysChPerTS, BOOLEAN supportOf8PSK)
    {
	setMaxTS_PerSubFrame(maxTS_PerSubFrame);
	setMaxPhysChPerFrame(maxPhysChPerFrame);
	setMinimumSF(minimumSF);
	setSupportOfPDSCH(supportOfPDSCH);
	setMaxPhysChPerTS(maxPhysChPerTS);
	setSupportOf8PSK(supportOf8PSK);
    }
    
    /**
     * Construct with components.
     */
    public DL_PhysChCapabilityTDD_LCR_r4(MaxTS_PerSubFrame_r4 maxTS_PerSubFrame, 
		    MaxPhysChPerSubFrame_r4 maxPhysChPerFrame, 
		    MinimumSF_DL minimumSF, boolean supportOfPDSCH, 
		    MaxPhysChPerTS maxPhysChPerTS, boolean supportOf8PSK)
    {
	this(maxTS_PerSubFrame, maxPhysChPerFrame, minimumSF, 
	     new BOOLEAN(supportOfPDSCH), maxPhysChPerTS, 
	     new BOOLEAN(supportOf8PSK));
    }
    
    public void initComponents()
    {
	mComponents[0] = new MaxTS_PerSubFrame_r4();
	mComponents[1] = new MaxPhysChPerSubFrame_r4();
	mComponents[2] = MinimumSF_DL.sf1;
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new MaxPhysChPerTS();
	mComponents[5] = new BOOLEAN();
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
		return new MaxTS_PerSubFrame_r4();
	    case 1:
		return new MaxPhysChPerSubFrame_r4();
	    case 2:
		return MinimumSF_DL.sf1;
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new MaxPhysChPerTS();
	    case 5:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxTS_PerSubFrame"
    public MaxTS_PerSubFrame_r4 getMaxTS_PerSubFrame()
    {
	return (MaxTS_PerSubFrame_r4)mComponents[0];
    }
    
    public void setMaxTS_PerSubFrame(MaxTS_PerSubFrame_r4 maxTS_PerSubFrame)
    {
	mComponents[0] = maxTS_PerSubFrame;
    }
    
    
    // Methods for field "maxPhysChPerFrame"
    public MaxPhysChPerSubFrame_r4 getMaxPhysChPerFrame()
    {
	return (MaxPhysChPerSubFrame_r4)mComponents[1];
    }
    
    public void setMaxPhysChPerFrame(MaxPhysChPerSubFrame_r4 maxPhysChPerFrame)
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
    
    
    // Methods for field "supportOf8PSK"
    public boolean getSupportOf8PSK()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setSupportOf8PSK(boolean supportOf8PSK)
    {
	setSupportOf8PSK(new BOOLEAN(supportOf8PSK));
    }
    
    public void setSupportOf8PSK(BOOLEAN supportOf8PSK)
    {
	mComponents[5] = supportOf8PSK;
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
	    "DL_PhysChCapabilityTDD_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "DL-PhysChCapabilityTDD-LCR-r4"
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
				"MaxTS_PerSubFrame_r4"
			    ),
			    new QName (
				"InformationElements",
				"MaxTS-PerSubFrame-r4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxTS_PerSubFrame_r4(1), 
				    new MaxTS_PerSubFrame_r4(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "maxTS-PerSubFrame",
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
				"MaxPhysChPerSubFrame_r4"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerSubFrame-r4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxPhysChPerSubFrame_r4(1), 
				    new MaxPhysChPerSubFrame_r4(96),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(96)
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
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "supportOf8PSK",
		    5,
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
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityTDD_LCR_r4
