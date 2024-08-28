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
 * Define the ASN1 Type DL_PDSCH_Information from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_PDSCH_Information extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PDSCH_Information()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PDSCH_Information(PDSCH_SHO_DCH_Info dummy1, 
		    PDSCH_CodeMapping dummy2)
    {
	setDummy1(dummy1);
	setDummy2(dummy2);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PDSCH_SHO_DCH_Info();
	mComponents[1] = new PDSCH_CodeMapping();
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
		return new PDSCH_SHO_DCH_Info();
	    case 1:
		return new PDSCH_CodeMapping();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dummy1"
    public PDSCH_SHO_DCH_Info getDummy1()
    {
	return (PDSCH_SHO_DCH_Info)mComponents[0];
    }
    
    public void setDummy1(PDSCH_SHO_DCH_Info dummy1)
    {
	mComponents[0] = dummy1;
    }
    
    public boolean hasDummy1()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDummy1()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dummy2"
    public PDSCH_CodeMapping getDummy2()
    {
	return (PDSCH_CodeMapping)mComponents[1];
    }
    
    public void setDummy2(PDSCH_CodeMapping dummy2)
    {
	mComponents[1] = dummy2;
    }
    
    public boolean hasDummy2()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDummy2()
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
	    "DL_PDSCH_Information"
	),
	new QName (
	    "InformationElements",
	    "DL-PDSCH-Information"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PDSCH_SHO_DCH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PDSCH-SHO-DCH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_SHO_DCH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_SHO_DCH_Info"
				)
			    ),
			    0
			)
		    ),
		    "dummy1",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PDSCH_CodeMapping"
			    ),
			    new QName (
				"InformationElements",
				"PDSCH-CodeMapping"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_CodeMapping"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_CodeMapping"
				)
			    ),
			    0
			)
		    ),
		    "dummy2",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_PDSCH_Information object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PDSCH_Information object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PDSCH_Information
