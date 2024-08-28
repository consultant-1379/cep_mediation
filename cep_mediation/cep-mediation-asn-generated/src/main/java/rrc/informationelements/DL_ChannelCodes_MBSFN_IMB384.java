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
 * Define the ASN1 Type DL_ChannelCodes_MBSFN_IMB384 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_ChannelCodes_MBSFN_IMB384 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_ChannelCodes_MBSFN_IMB384()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_ChannelCodes_MBSFN_IMB384(INTEGER firstChannelisationCode, 
		    INTEGER lastChannelisationCode)
    {
	setFirstChannelisationCode(firstChannelisationCode);
	setLastChannelisationCode(lastChannelisationCode);
    }
    
    /**
     * Construct with components.
     */
    public DL_ChannelCodes_MBSFN_IMB384(long firstChannelisationCode, 
		    long lastChannelisationCode)
    {
	this(new INTEGER(firstChannelisationCode), 
	     new INTEGER(lastChannelisationCode));
    }
    
    /**
     * Construct with required components.
     */
    public DL_ChannelCodes_MBSFN_IMB384(long firstChannelisationCode)
    {
	setFirstChannelisationCode(firstChannelisationCode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "firstChannelisationCode"
    public long getFirstChannelisationCode()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setFirstChannelisationCode(long firstChannelisationCode)
    {
	setFirstChannelisationCode(new INTEGER(firstChannelisationCode));
    }
    
    public void setFirstChannelisationCode(INTEGER firstChannelisationCode)
    {
	mComponents[0] = firstChannelisationCode;
    }
    
    
    // Methods for field "lastChannelisationCode"
    public long getLastChannelisationCode()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setLastChannelisationCode(long lastChannelisationCode)
    {
	setLastChannelisationCode(new INTEGER(lastChannelisationCode));
    }
    
    public void setLastChannelisationCode(INTEGER lastChannelisationCode)
    {
	mComponents[1] = lastChannelisationCode;
    }
    
    public boolean hasLastChannelisationCode()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLastChannelisationCode()
    {
	setComponentAbsent(1);
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
	    "DL_ChannelCodes_MBSFN_IMB384"
	),
	new QName (
	    "InformationElements",
	    "DL-ChannelCodes-MBSFN-IMB384"
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
		    "firstChannelisationCode",
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
		    "lastChannelisationCode",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_ChannelCodes_MBSFN_IMB384 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_ChannelCodes_MBSFN_IMB384 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_ChannelCodes_MBSFN_IMB384
