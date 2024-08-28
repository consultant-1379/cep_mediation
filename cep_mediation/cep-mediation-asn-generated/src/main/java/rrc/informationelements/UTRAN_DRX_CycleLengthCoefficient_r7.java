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
 * Define the ASN1 Type UTRAN_DRX_CycleLengthCoefficient_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UTRAN_DRX_CycleLengthCoefficient_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UTRAN_DRX_CycleLengthCoefficient_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UTRAN_DRX_CycleLengthCoefficient_r7(INTEGER drx_CycleLengthCoefficient, 
		    INTEGER drx_CycleLengthCoefficient2, 
		    T_319 timeForDRXCycle2)
    {
	setDrx_CycleLengthCoefficient(drx_CycleLengthCoefficient);
	setDrx_CycleLengthCoefficient2(drx_CycleLengthCoefficient2);
	setTimeForDRXCycle2(timeForDRXCycle2);
    }
    
    /**
     * Construct with components.
     */
    public UTRAN_DRX_CycleLengthCoefficient_r7(long drx_CycleLengthCoefficient, 
		    long drx_CycleLengthCoefficient2, T_319 timeForDRXCycle2)
    {
	this(new INTEGER(drx_CycleLengthCoefficient), 
	     new INTEGER(drx_CycleLengthCoefficient2), timeForDRXCycle2);
    }
    
    /**
     * Construct with required components.
     */
    public UTRAN_DRX_CycleLengthCoefficient_r7(long drx_CycleLengthCoefficient)
    {
	setDrx_CycleLengthCoefficient(drx_CycleLengthCoefficient);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = T_319.ms80;
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return T_319.ms80;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "drx_CycleLengthCoefficient"
    public long getDrx_CycleLengthCoefficient()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDrx_CycleLengthCoefficient(long drx_CycleLengthCoefficient)
    {
	setDrx_CycleLengthCoefficient(new INTEGER(drx_CycleLengthCoefficient));
    }
    
    public void setDrx_CycleLengthCoefficient(INTEGER drx_CycleLengthCoefficient)
    {
	mComponents[0] = drx_CycleLengthCoefficient;
    }
    
    
    // Methods for field "drx_CycleLengthCoefficient2"
    public long getDrx_CycleLengthCoefficient2()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setDrx_CycleLengthCoefficient2(long drx_CycleLengthCoefficient2)
    {
	setDrx_CycleLengthCoefficient2(new INTEGER(drx_CycleLengthCoefficient2));
    }
    
    public void setDrx_CycleLengthCoefficient2(INTEGER drx_CycleLengthCoefficient2)
    {
	mComponents[1] = drx_CycleLengthCoefficient2;
    }
    
    public boolean hasDrx_CycleLengthCoefficient2()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDrx_CycleLengthCoefficient2()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "timeForDRXCycle2"
    public T_319 getTimeForDRXCycle2()
    {
	return (T_319)mComponents[2];
    }
    
    public void setTimeForDRXCycle2(T_319 timeForDRXCycle2)
    {
	mComponents[2] = timeForDRXCycle2;
    }
    
    public boolean hasTimeForDRXCycle2()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTimeForDRXCycle2()
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
	    "UTRAN_DRX_CycleLengthCoefficient_r7"
	),
	new QName (
	    "InformationElements",
	    "UTRAN-DRX-CycleLengthCoefficient-r7"
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
				    new com.oss.asn1.INTEGER(3), 
				    new com.oss.asn1.INTEGER(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "drx-CycleLengthCoefficient",
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
				    new com.oss.asn1.INTEGER(3), 
				    new com.oss.asn1.INTEGER(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "drx-CycleLengthCoefficient2",
		    1,
		    3,
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
				"T_319"
			    ),
			    new QName (
				"InformationElements",
				"T-319"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms80",
					0
				    ),
				    new MemberListElement (
					"ms160",
					1
				    ),
				    new MemberListElement (
					"ms320",
					2
				    ),
				    new MemberListElement (
					"ms640",
					3
				    ),
				    new MemberListElement (
					"ms1280",
					4
				    ),
				    new MemberListElement (
					"ms2560",
					5
				    ),
				    new MemberListElement (
					"ms5120",
					6
				    )
				}
			    ),
			    0,
			    T_319.ms80
			)
		    ),
		    "timeForDRXCycle2",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' UTRAN_DRX_CycleLengthCoefficient_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRAN_DRX_CycleLengthCoefficient_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRAN_DRX_CycleLengthCoefficient_r7
