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
 * Define the ASN1 Type BSICReported from ASN1 Module InformationElements.
 * @see Choice
 */

public class BSICReported extends Choice {
    
    /**
     * The default constructor.
     */
    public BSICReported()
    {
    }
    
    public static final  int  verifiedBSIC_chosen = 1;
    public static final  int  nonVerifiedBSIC_chosen = 2;
    
    // Methods for field "verifiedBSIC"
    public static BSICReported createBSICReportedWithVerifiedBSIC(long verifiedBSIC)
    {
	return createBSICReportedWithVerifiedBSIC(new INTEGER(verifiedBSIC));
    }
    
    public static BSICReported createBSICReportedWithVerifiedBSIC(INTEGER verifiedBSIC)
    {
	BSICReported __object = new BSICReported();

	__object.setVerifiedBSIC(verifiedBSIC);
	return __object;
    }
    
    public boolean hasVerifiedBSIC()
    {
	return getChosenFlag() == verifiedBSIC_chosen;
    }
    
    public void setVerifiedBSIC(long verifiedBSIC)
    {
	setVerifiedBSIC(new INTEGER(verifiedBSIC));
    }
    
    public void setVerifiedBSIC(INTEGER verifiedBSIC)
    {
	setChosenValue(verifiedBSIC);
	setChosenFlag(verifiedBSIC_chosen);
    }
    
    
    // Methods for field "nonVerifiedBSIC"
    public static BSICReported createBSICReportedWithNonVerifiedBSIC(long nonVerifiedBSIC)
    {
	return createBSICReportedWithNonVerifiedBSIC(new BCCH_ARFCN(nonVerifiedBSIC));
    }
    
    public static BSICReported createBSICReportedWithNonVerifiedBSIC(BCCH_ARFCN nonVerifiedBSIC)
    {
	BSICReported __object = new BSICReported();

	__object.setNonVerifiedBSIC(nonVerifiedBSIC);
	return __object;
    }
    
    public boolean hasNonVerifiedBSIC()
    {
	return getChosenFlag() == nonVerifiedBSIC_chosen;
    }
    
    public void setNonVerifiedBSIC(long nonVerifiedBSIC)
    {
	setNonVerifiedBSIC(new BCCH_ARFCN(nonVerifiedBSIC));
    }
    
    public void setNonVerifiedBSIC(BCCH_ARFCN nonVerifiedBSIC)
    {
	setChosenValue(nonVerifiedBSIC);
	setChosenFlag(nonVerifiedBSIC_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case verifiedBSIC_chosen:
		return new INTEGER();
	    case nonVerifiedBSIC_chosen:
		return new BCCH_ARFCN();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "BSICReported"
	),
	new QName (
	    "InformationElements",
	    "BSICReported"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "verifiedBSIC",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"BCCH_ARFCN"
			    ),
			    new QName (
				"InformationElements",
				"BCCH-ARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new BCCH_ARFCN(0), 
				    new BCCH_ARFCN(1023),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1023)
			    ),
			    null
			)
		    ),
		    "nonVerifiedBSIC",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BSICReported object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BSICReported object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BSICReported
