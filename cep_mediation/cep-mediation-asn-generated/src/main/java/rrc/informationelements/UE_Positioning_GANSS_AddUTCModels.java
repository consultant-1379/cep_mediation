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
 * Define the ASN1 Type UE_Positioning_GANSS_AddUTCModels from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_AddUTCModels extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_AddUTCModels()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_AddUTCModels(UTCmodelSet1 utcModel1, 
		    UTCmodelSet2 utcModel2, UTCmodelSet3 utcModel3)
    {
	setUtcModel1(utcModel1);
	setUtcModel2(utcModel2);
	setUtcModel3(utcModel3);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTCmodelSet1();
	mComponents[1] = new UTCmodelSet2();
	mComponents[2] = new UTCmodelSet3();
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
		return new UTCmodelSet1();
	    case 1:
		return new UTCmodelSet2();
	    case 2:
		return new UTCmodelSet3();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "utcModel1"
    public UTCmodelSet1 getUtcModel1()
    {
	return (UTCmodelSet1)mComponents[0];
    }
    
    public void setUtcModel1(UTCmodelSet1 utcModel1)
    {
	mComponents[0] = utcModel1;
    }
    
    public boolean hasUtcModel1()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUtcModel1()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "utcModel2"
    public UTCmodelSet2 getUtcModel2()
    {
	return (UTCmodelSet2)mComponents[1];
    }
    
    public void setUtcModel2(UTCmodelSet2 utcModel2)
    {
	mComponents[1] = utcModel2;
    }
    
    public boolean hasUtcModel2()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUtcModel2()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "utcModel3"
    public UTCmodelSet3 getUtcModel3()
    {
	return (UTCmodelSet3)mComponents[2];
    }
    
    public void setUtcModel3(UTCmodelSet3 utcModel3)
    {
	mComponents[2] = utcModel3;
    }
    
    public boolean hasUtcModel3()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUtcModel3()
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
	    "UE_Positioning_GANSS_AddUTCModels"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-AddUTCModels"
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
				"UTCmodelSet1"
			    ),
			    new QName (
				"InformationElements",
				"UTCmodelSet1"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UTCmodelSet1"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UTCmodelSet1"
				)
			    ),
			    0
			)
		    ),
		    "utcModel1",
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
				"UTCmodelSet2"
			    ),
			    new QName (
				"InformationElements",
				"UTCmodelSet2"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UTCmodelSet2"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UTCmodelSet2"
				)
			    ),
			    0
			)
		    ),
		    "utcModel2",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UTCmodelSet3"
			    ),
			    new QName (
				"InformationElements",
				"UTCmodelSet3"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UTCmodelSet3"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UTCmodelSet3"
				)
			    ),
			    0
			)
		    ),
		    "utcModel3",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AddUTCModels object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AddUTCModels object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_AddUTCModels
