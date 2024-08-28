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
 * Define the ASN1 Type RAT_FDD_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RAT_FDD_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public RAT_FDD_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RAT_FDD_Info(RAT_Identifier rat_Identifier, 
		    S_SearchQual s_SearchRAT, S_SearchRXLEV s_HCS_RAT, 
		    S_SearchQual s_Limit_SearchRAT)
    {
	setRat_Identifier(rat_Identifier);
	setS_SearchRAT(s_SearchRAT);
	setS_HCS_RAT(s_HCS_RAT);
	setS_Limit_SearchRAT(s_Limit_SearchRAT);
    }
    
    /**
     * Construct with required components.
     */
    public RAT_FDD_Info(RAT_Identifier rat_Identifier, 
		    S_SearchQual s_SearchRAT, S_SearchQual s_Limit_SearchRAT)
    {
	setRat_Identifier(rat_Identifier);
	setS_SearchRAT(s_SearchRAT);
	setS_Limit_SearchRAT(s_Limit_SearchRAT);
    }
    
    public void initComponents()
    {
	mComponents[0] = RAT_Identifier.gsm;
	mComponents[1] = new S_SearchQual();
	mComponents[2] = new S_SearchRXLEV();
	mComponents[3] = new S_SearchQual();
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
		return RAT_Identifier.gsm;
	    case 1:
		return new S_SearchQual();
	    case 2:
		return new S_SearchRXLEV();
	    case 3:
		return new S_SearchQual();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rat_Identifier"
    public RAT_Identifier getRat_Identifier()
    {
	return (RAT_Identifier)mComponents[0];
    }
    
    public void setRat_Identifier(RAT_Identifier rat_Identifier)
    {
	mComponents[0] = rat_Identifier;
    }
    
    
    // Methods for field "s_SearchRAT"
    public S_SearchQual getS_SearchRAT()
    {
	return (S_SearchQual)mComponents[1];
    }
    
    public void setS_SearchRAT(S_SearchQual s_SearchRAT)
    {
	mComponents[1] = s_SearchRAT;
    }
    
    
    // Methods for field "s_HCS_RAT"
    public S_SearchRXLEV getS_HCS_RAT()
    {
	return (S_SearchRXLEV)mComponents[2];
    }
    
    public void setS_HCS_RAT(S_SearchRXLEV s_HCS_RAT)
    {
	mComponents[2] = s_HCS_RAT;
    }
    
    public boolean hasS_HCS_RAT()
    {
	return componentIsPresent(2);
    }
    
    public void deleteS_HCS_RAT()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "s_Limit_SearchRAT"
    public S_SearchQual getS_Limit_SearchRAT()
    {
	return (S_SearchQual)mComponents[3];
    }
    
    public void setS_Limit_SearchRAT(S_SearchQual s_Limit_SearchRAT)
    {
	mComponents[3] = s_Limit_SearchRAT;
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
	    "RAT_FDD_Info"
	),
	new QName (
	    "InformationElements",
	    "RAT-FDD-Info"
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
				"RAT_Identifier"
			    ),
			    new QName (
				"InformationElements",
				"RAT-Identifier"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"gsm",
					0
				    ),
				    new MemberListElement (
					"cdma2000",
					1
				    )
				}
			    ),
			    0,
			    RAT_Identifier.gsm
			)
		    ),
		    "rat-Identifier",
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
				"S_SearchQual"
			    ),
			    new QName (
				"InformationElements",
				"S-SearchQual"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new S_SearchQual(-16), 
				    new S_SearchQual(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-16),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "s-SearchRAT",
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
				"S_SearchRXLEV"
			    ),
			    new QName (
				"InformationElements",
				"S-SearchRXLEV"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new S_SearchRXLEV(-53), 
				    new S_SearchRXLEV(45),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-53),
				new java.lang.Long(45)
			    ),
			    null
			)
		    ),
		    "s-HCS-RAT",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"S_SearchQual"
			    ),
			    new QName (
				"InformationElements",
				"S-SearchQual"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new S_SearchQual(-16), 
				    new S_SearchQual(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-16),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "s-Limit-SearchRAT",
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' RAT_FDD_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RAT_FDD_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RAT_FDD_Info
