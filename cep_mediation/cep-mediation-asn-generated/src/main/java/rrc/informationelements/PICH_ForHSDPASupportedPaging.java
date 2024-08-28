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
 * Define the ASN1 Type PICH_ForHSDPASupportedPaging from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PICH_ForHSDPASupportedPaging extends Sequence {
    
    /**
     * The default constructor.
     */
    public PICH_ForHSDPASupportedPaging()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PICH_ForHSDPASupportedPaging(PICH_Info hsdpa_AssociatedPichInfo, 
		    INTEGER hs_pdschChannelisationCode)
    {
	setHsdpa_AssociatedPichInfo(hsdpa_AssociatedPichInfo);
	setHs_pdschChannelisationCode(hs_pdschChannelisationCode);
    }
    
    /**
     * Construct with components.
     */
    public PICH_ForHSDPASupportedPaging(PICH_Info hsdpa_AssociatedPichInfo, 
		    long hs_pdschChannelisationCode)
    {
	this(hsdpa_AssociatedPichInfo, 
	     new INTEGER(hs_pdschChannelisationCode));
    }
    
    public void initComponents()
    {
	mComponents[0] = new PICH_Info();
	mComponents[1] = new INTEGER();
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
		return new PICH_Info();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hsdpa_AssociatedPichInfo"
    public PICH_Info getHsdpa_AssociatedPichInfo()
    {
	return (PICH_Info)mComponents[0];
    }
    
    public void setHsdpa_AssociatedPichInfo(PICH_Info hsdpa_AssociatedPichInfo)
    {
	mComponents[0] = hsdpa_AssociatedPichInfo;
    }
    
    
    // Methods for field "hs_pdschChannelisationCode"
    public long getHs_pdschChannelisationCode()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setHs_pdschChannelisationCode(long hs_pdschChannelisationCode)
    {
	setHs_pdschChannelisationCode(new INTEGER(hs_pdschChannelisationCode));
    }
    
    public void setHs_pdschChannelisationCode(INTEGER hs_pdschChannelisationCode)
    {
	mComponents[1] = hs_pdschChannelisationCode;
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
	    "PICH_ForHSDPASupportedPaging"
	),
	new QName (
	    "InformationElements",
	    "PICH-ForHSDPASupportedPaging"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PICH_Info"
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
		    "hsdpa-AssociatedPichInfo",
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "hs-pdschChannelisationCode",
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
     * Get the type descriptor (TypeInfo) of 'this' PICH_ForHSDPASupportedPaging object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PICH_ForHSDPASupportedPaging object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PICH_ForHSDPASupportedPaging
