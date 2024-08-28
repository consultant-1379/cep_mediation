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
 * Define the ASN1 Type UL_DPCH_PowerControlInfoPostFDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_DPCH_PowerControlInfoPostFDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_DPCH_PowerControlInfoPostFDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_DPCH_PowerControlInfoPostFDD(DPCCH_PowerOffset2 dpcch_PowerOffset, 
		    PC_Preamble pc_Preamble, SRB_delay sRB_delay)
    {
	setDpcch_PowerOffset(dpcch_PowerOffset);
	setPc_Preamble(pc_Preamble);
	setSRB_delay(sRB_delay);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DPCCH_PowerOffset2();
	mComponents[1] = new PC_Preamble();
	mComponents[2] = new SRB_delay();
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
		return new DPCCH_PowerOffset2();
	    case 1:
		return new PC_Preamble();
	    case 2:
		return new SRB_delay();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dpcch_PowerOffset"
    public DPCCH_PowerOffset2 getDpcch_PowerOffset()
    {
	return (DPCCH_PowerOffset2)mComponents[0];
    }
    
    public void setDpcch_PowerOffset(DPCCH_PowerOffset2 dpcch_PowerOffset)
    {
	mComponents[0] = dpcch_PowerOffset;
    }
    
    
    // Methods for field "pc_Preamble"
    public PC_Preamble getPc_Preamble()
    {
	return (PC_Preamble)mComponents[1];
    }
    
    public void setPc_Preamble(PC_Preamble pc_Preamble)
    {
	mComponents[1] = pc_Preamble;
    }
    
    
    // Methods for field "sRB_delay"
    public SRB_delay getSRB_delay()
    {
	return (SRB_delay)mComponents[2];
    }
    
    public void setSRB_delay(SRB_delay sRB_delay)
    {
	mComponents[2] = sRB_delay;
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
	    "UL_DPCH_PowerControlInfoPostFDD"
	),
	new QName (
	    "InformationElements",
	    "UL-DPCH-PowerControlInfoPostFDD"
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
				"DPCCH_PowerOffset2"
			    ),
			    new QName (
				"InformationElements",
				"DPCCH-PowerOffset2"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DPCCH_PowerOffset2(-28), 
				    new DPCCH_PowerOffset2(-13),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-28),
				new java.lang.Long(-13)
			    ),
			    null
			)
		    ),
		    "dpcch-PowerOffset",
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
				"PC_Preamble"
			    ),
			    new QName (
				"InformationElements",
				"PC-Preamble"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PC_Preamble(0), 
				    new PC_Preamble(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "pc-Preamble",
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
				"SRB_delay"
			    ),
			    new QName (
				"InformationElements",
				"SRB-delay"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SRB_delay(0), 
				    new SRB_delay(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "sRB-delay",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_DPCH_PowerControlInfoPostFDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DPCH_PowerControlInfoPostFDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DPCH_PowerControlInfoPostFDD
