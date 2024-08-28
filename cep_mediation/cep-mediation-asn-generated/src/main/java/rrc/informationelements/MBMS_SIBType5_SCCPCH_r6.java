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
 * Define the ASN1 Type MBMS_SIBType5_SCCPCH_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_SIBType5_SCCPCH_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_SIBType5_SCCPCH_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_SIBType5_SCCPCH_r6(MBMS_SCCPCHIdentity sccpchIdentity, 
		    MBMS_TrCHInformation_SIB5List transpCHInformation)
    {
	setSccpchIdentity(sccpchIdentity);
	setTranspCHInformation(transpCHInformation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_SCCPCHIdentity();
	mComponents[1] = new MBMS_TrCHInformation_SIB5List();
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
		return new MBMS_SCCPCHIdentity();
	    case 1:
		return new MBMS_TrCHInformation_SIB5List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sccpchIdentity"
    public MBMS_SCCPCHIdentity getSccpchIdentity()
    {
	return (MBMS_SCCPCHIdentity)mComponents[0];
    }
    
    public void setSccpchIdentity(MBMS_SCCPCHIdentity sccpchIdentity)
    {
	mComponents[0] = sccpchIdentity;
    }
    
    
    // Methods for field "transpCHInformation"
    public MBMS_TrCHInformation_SIB5List getTranspCHInformation()
    {
	return (MBMS_TrCHInformation_SIB5List)mComponents[1];
    }
    
    public void setTranspCHInformation(MBMS_TrCHInformation_SIB5List transpCHInformation)
    {
	mComponents[1] = transpCHInformation;
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
	    "MBMS_SIBType5_SCCPCH_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-SIBType5-SCCPCH-r6"
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
				"MBMS_SCCPCHIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-SCCPCHIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_SCCPCHIdentity(1), 
				    new MBMS_SCCPCHIdentity(16),
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
		    "sccpchIdentity",
		    0,
		    2,
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
				"MBMS_TrCHInformation_SIB5List"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-TrCHInformation-SIB5List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TrCHInformation_SIB5"
				)
			    )
			)
		    ),
		    "transpCHInformation",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_SIBType5_SCCPCH_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_SIBType5_SCCPCH_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_SIBType5_SCCPCH_r6
