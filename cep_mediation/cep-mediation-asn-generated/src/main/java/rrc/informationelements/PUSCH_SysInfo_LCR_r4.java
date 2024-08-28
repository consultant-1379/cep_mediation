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
 * Define the ASN1 Type PUSCH_SysInfo_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PUSCH_SysInfo_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PUSCH_SysInfo_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PUSCH_SysInfo_LCR_r4(PUSCH_Identity pusch_Identity, 
		    PUSCH_Info_LCR_r4 pusch_Info, TransportFormatSet usch_TFS, 
		    TFCS usch_TFCS)
    {
	setPusch_Identity(pusch_Identity);
	setPusch_Info(pusch_Info);
	setUsch_TFS(usch_TFS);
	setUsch_TFCS(usch_TFCS);
    }
    
    /**
     * Construct with required components.
     */
    public PUSCH_SysInfo_LCR_r4(PUSCH_Identity pusch_Identity, 
		    PUSCH_Info_LCR_r4 pusch_Info)
    {
	setPusch_Identity(pusch_Identity);
	setPusch_Info(pusch_Info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PUSCH_Identity();
	mComponents[1] = new PUSCH_Info_LCR_r4();
	mComponents[2] = new TransportFormatSet();
	mComponents[3] = new TFCS();
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
		return new PUSCH_Identity();
	    case 1:
		return new PUSCH_Info_LCR_r4();
	    case 2:
		return new TransportFormatSet();
	    case 3:
		return new TFCS();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pusch_Identity"
    public PUSCH_Identity getPusch_Identity()
    {
	return (PUSCH_Identity)mComponents[0];
    }
    
    public void setPusch_Identity(PUSCH_Identity pusch_Identity)
    {
	mComponents[0] = pusch_Identity;
    }
    
    
    // Methods for field "pusch_Info"
    public PUSCH_Info_LCR_r4 getPusch_Info()
    {
	return (PUSCH_Info_LCR_r4)mComponents[1];
    }
    
    public void setPusch_Info(PUSCH_Info_LCR_r4 pusch_Info)
    {
	mComponents[1] = pusch_Info;
    }
    
    
    // Methods for field "usch_TFS"
    public TransportFormatSet getUsch_TFS()
    {
	return (TransportFormatSet)mComponents[2];
    }
    
    public void setUsch_TFS(TransportFormatSet usch_TFS)
    {
	mComponents[2] = usch_TFS;
    }
    
    public boolean hasUsch_TFS()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUsch_TFS()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "usch_TFCS"
    public TFCS getUsch_TFCS()
    {
	return (TFCS)mComponents[3];
    }
    
    public void setUsch_TFCS(TFCS usch_TFCS)
    {
	mComponents[3] = usch_TFCS;
    }
    
    public boolean hasUsch_TFCS()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUsch_TFCS()
    {
	setComponentAbsent(3);
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
	    "PUSCH_SysInfo_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "PUSCH-SysInfo-LCR-r4"
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
				"PUSCH_Identity"
			    ),
			    new QName (
				"InformationElements",
				"PUSCH-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PUSCH_Identity(1), 
				    new PUSCH_Identity(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "pusch-Identity",
		    0,
		    2,
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
				"PUSCH_Info_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"PUSCH-Info-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PUSCH_Info_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PUSCH_Info_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "pusch-Info",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportFormatSet"
			    ),
			    new QName (
				"InformationElements",
				"TransportFormatSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TransportFormatSet"
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
		    "usch-TFS",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS"
			    ),
			    new QName (
				"InformationElements",
				"TFCS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS"
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
		    "usch-TFCS",
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' PUSCH_SysInfo_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PUSCH_SysInfo_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PUSCH_SysInfo_LCR_r4
