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
 * Define the ASN1 Type UE_RadioAccessCapability_v890ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v890ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v890ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v890ext_IEs(SupportCellSpecificTxDiversityinDC_Operation supportCellSpecificTxDiversityinDC_Operation)
    {
	setSupportCellSpecificTxDiversityinDC_Operation(supportCellSpecificTxDiversityinDC_Operation);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportCellSpecificTxDiversityinDC_Operation._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return SupportCellSpecificTxDiversityinDC_Operation._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportCellSpecificTxDiversityinDC_Operation"
    public SupportCellSpecificTxDiversityinDC_Operation getSupportCellSpecificTxDiversityinDC_Operation()
    {
	return (SupportCellSpecificTxDiversityinDC_Operation)mComponents[0];
    }
    
    public void setSupportCellSpecificTxDiversityinDC_Operation(SupportCellSpecificTxDiversityinDC_Operation supportCellSpecificTxDiversityinDC_Operation)
    {
	mComponents[0] = supportCellSpecificTxDiversityinDC_Operation;
    }
    
    public boolean hasSupportCellSpecificTxDiversityinDC_Operation()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportCellSpecificTxDiversityinDC_Operation()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportCellSpecificTxDiversityinDC_Operation from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportCellSpecificTxDiversityinDC_Operation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportCellSpecificTxDiversityinDC_Operation()
	{
	    super(cFirstNumber);
	}
	
	protected SupportCellSpecificTxDiversityinDC_Operation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportCellSpecificTxDiversityinDC_Operation _true =
	    new SupportCellSpecificTxDiversityinDC_Operation(0);
	private final static SupportCellSpecificTxDiversityinDC_Operation cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static SupportCellSpecificTxDiversityinDC_Operation valueOf(long value)
	{
	    return (SupportCellSpecificTxDiversityinDC_Operation)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_v890ext_IEs$SupportCellSpecificTxDiversityinDC_Operation"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
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
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportCellSpecificTxDiversityinDC_Operation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportCellSpecificTxDiversityinDC_Operation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportCellSpecificTxDiversityinDC_Operation

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
	    "UE_RadioAccessCapability_v890ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v890ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v890ext_IEs$SupportCellSpecificTxDiversityinDC_Operation"
			)
		    ),
		    "supportCellSpecificTxDiversityinDC-Operation",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v890ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v890ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v890ext_IEs
