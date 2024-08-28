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
 * Define the ASN1 Type PLMN_IdentityWithOptionalMCC_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PLMN_IdentityWithOptionalMCC_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PLMN_IdentityWithOptionalMCC_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PLMN_IdentityWithOptionalMCC_r6(MCC mcc, MNC mnc)
    {
	setMcc(mcc);
	setMnc(mnc);
    }
    
    /**
     * Construct with required components.
     */
    public PLMN_IdentityWithOptionalMCC_r6(MNC mnc)
    {
	setMnc(mnc);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MCC();
	mComponents[1] = new MNC();
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
		return new MCC();
	    case 1:
		return new MNC();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mcc"
    public MCC getMcc()
    {
	return (MCC)mComponents[0];
    }
    
    public void setMcc(MCC mcc)
    {
	mComponents[0] = mcc;
    }
    
    public boolean hasMcc()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMcc()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "mnc"
    public MNC getMnc()
    {
	return (MNC)mComponents[1];
    }
    
    public void setMnc(MNC mnc)
    {
	mComponents[1] = mnc;
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
	    "PLMN_IdentityWithOptionalMCC_r6"
	),
	new QName (
	    "InformationElements",
	    "PLMN-IdentityWithOptionalMCC-r6"
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
				"MCC"
			    ),
			    new QName (
				"InformationElements",
				"MCC"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(3)
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(3)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "Digit"
				)
			    )
			)
		    ),
		    "mcc",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MNC"
			    ),
			    new QName (
				"InformationElements",
				"MNC"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(2), 
					new com.oss.asn1.INTEGER(3),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(3)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "Digit"
				)
			    )
			)
		    ),
		    "mnc",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' PLMN_IdentityWithOptionalMCC_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PLMN_IdentityWithOptionalMCC_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PLMN_IdentityWithOptionalMCC_r6
