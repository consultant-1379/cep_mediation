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
 * Define the ASN1 Type PDSCH_SysInfo_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDSCH_SysInfo_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDSCH_SysInfo_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDSCH_SysInfo_LCR_r4(PDSCH_Identity pdsch_Identity, 
		    PDSCH_Info_LCR_r4 pdsch_Info, TransportFormatSet dsch_TFS, 
		    TFCS dsch_TFCS)
    {
	setPdsch_Identity(pdsch_Identity);
	setPdsch_Info(pdsch_Info);
	setDsch_TFS(dsch_TFS);
	setDsch_TFCS(dsch_TFCS);
    }
    
    /**
     * Construct with required components.
     */
    public PDSCH_SysInfo_LCR_r4(PDSCH_Identity pdsch_Identity, 
		    PDSCH_Info_LCR_r4 pdsch_Info)
    {
	setPdsch_Identity(pdsch_Identity);
	setPdsch_Info(pdsch_Info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PDSCH_Identity();
	mComponents[1] = new PDSCH_Info_LCR_r4();
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
		return new PDSCH_Identity();
	    case 1:
		return new PDSCH_Info_LCR_r4();
	    case 2:
		return new TransportFormatSet();
	    case 3:
		return new TFCS();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pdsch_Identity"
    public PDSCH_Identity getPdsch_Identity()
    {
	return (PDSCH_Identity)mComponents[0];
    }
    
    public void setPdsch_Identity(PDSCH_Identity pdsch_Identity)
    {
	mComponents[0] = pdsch_Identity;
    }
    
    
    // Methods for field "pdsch_Info"
    public PDSCH_Info_LCR_r4 getPdsch_Info()
    {
	return (PDSCH_Info_LCR_r4)mComponents[1];
    }
    
    public void setPdsch_Info(PDSCH_Info_LCR_r4 pdsch_Info)
    {
	mComponents[1] = pdsch_Info;
    }
    
    
    // Methods for field "dsch_TFS"
    public TransportFormatSet getDsch_TFS()
    {
	return (TransportFormatSet)mComponents[2];
    }
    
    public void setDsch_TFS(TransportFormatSet dsch_TFS)
    {
	mComponents[2] = dsch_TFS;
    }
    
    public boolean hasDsch_TFS()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDsch_TFS()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "dsch_TFCS"
    public TFCS getDsch_TFCS()
    {
	return (TFCS)mComponents[3];
    }
    
    public void setDsch_TFCS(TFCS dsch_TFCS)
    {
	mComponents[3] = dsch_TFCS;
    }
    
    public boolean hasDsch_TFCS()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDsch_TFCS()
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
	    "PDSCH_SysInfo_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "PDSCH-SysInfo-LCR-r4"
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
				"PDSCH_Identity"
			    ),
			    new QName (
				"InformationElements",
				"PDSCH-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PDSCH_Identity(1), 
				    new PDSCH_Identity(64),
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
		    "pdsch-Identity",
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
				"PDSCH_Info_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"PDSCH-Info-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_Info_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_Info_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "pdsch-Info",
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
		    "dsch-TFS",
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
		    "dsch-TFCS",
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
     * Get the type descriptor (TypeInfo) of 'this' PDSCH_SysInfo_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDSCH_SysInfo_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDSCH_SysInfo_LCR_r4
