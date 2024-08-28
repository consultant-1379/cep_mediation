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
 * Define the ASN1 Type MBMS_TranspChInfoForCCTrCh_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_TranspChInfoForCCTrCh_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_TranspChInfoForCCTrCh_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_TranspChInfoForCCTrCh_r6(MBMS_CommonCCTrChIdentity commonCCTrChIdentity, 
		    TFCS transportFormatCombinationSet)
    {
	setCommonCCTrChIdentity(commonCCTrChIdentity);
	setTransportFormatCombinationSet(transportFormatCombinationSet);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_CommonCCTrChIdentity();
	mComponents[1] = new TFCS();
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
		return new MBMS_CommonCCTrChIdentity();
	    case 1:
		return new TFCS();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "commonCCTrChIdentity"
    public MBMS_CommonCCTrChIdentity getCommonCCTrChIdentity()
    {
	return (MBMS_CommonCCTrChIdentity)mComponents[0];
    }
    
    public void setCommonCCTrChIdentity(MBMS_CommonCCTrChIdentity commonCCTrChIdentity)
    {
	mComponents[0] = commonCCTrChIdentity;
    }
    
    
    // Methods for field "transportFormatCombinationSet"
    public TFCS getTransportFormatCombinationSet()
    {
	return (TFCS)mComponents[1];
    }
    
    public void setTransportFormatCombinationSet(TFCS transportFormatCombinationSet)
    {
	mComponents[1] = transportFormatCombinationSet;
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
	    "MBMS_TranspChInfoForCCTrCh_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-TranspChInfoForCCTrCh-r6"
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
				"MBMS_CommonCCTrChIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CommonCCTrChIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_CommonCCTrChIdentity(1), 
				    new MBMS_CommonCCTrChIdentity(32),
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
		    "commonCCTrChIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS"
			    ),
			    new QName (
				"InformationElements",
				"TFCS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS"
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
		    "transportFormatCombinationSet",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_TranspChInfoForCCTrCh_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_TranspChInfoForCCTrCh_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_TranspChInfoForCCTrCh_r6
