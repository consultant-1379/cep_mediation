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
 * Define the ASN1 Type DGANSSInfo_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DGANSSInfo_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public DGANSSInfo_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DGANSSInfo_v920ext(DGANSSSignalInformationList_v920ext dgansssignalInformationList)
    {
	setDgansssignalInformationList(dgansssignalInformationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DGANSSSignalInformationList_v920ext();
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
		return new DGANSSSignalInformationList_v920ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dgansssignalInformationList"
    public DGANSSSignalInformationList_v920ext getDgansssignalInformationList()
    {
	return (DGANSSSignalInformationList_v920ext)mComponents[0];
    }
    
    public void setDgansssignalInformationList(DGANSSSignalInformationList_v920ext dgansssignalInformationList)
    {
	mComponents[0] = dgansssignalInformationList;
    }
    
    public boolean hasDgansssignalInformationList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDgansssignalInformationList()
    {
	setComponentAbsent(0);
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
	    "DGANSSInfo_v920ext"
	),
	new QName (
	    "InformationElements",
	    "DGANSSInfo-v920ext"
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
				"DGANSSSignalInformationList_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"DGANSSSignalInformationList-v920ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DGANSSSignalInformation_v920ext"
				)
			    )
			)
		    ),
		    "dgansssignalInformationList",
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
     * Get the type descriptor (TypeInfo) of 'this' DGANSSInfo_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DGANSSInfo_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DGANSSInfo_v920ext
