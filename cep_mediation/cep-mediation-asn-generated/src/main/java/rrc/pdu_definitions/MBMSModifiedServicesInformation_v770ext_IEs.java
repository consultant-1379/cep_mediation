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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MBMSModifiedServicesInformation_v770ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSModifiedServicesInformation_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSModifiedServicesInformation_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSModifiedServicesInformation_v770ext_IEs(rrc.informationelements.MBMS_ModifiedServiceList_v770ext modifiedServiceList, 
		    rrc.informationelements.MIB_ValueTag mib_ValueTag)
    {
	setModifiedServiceList(modifiedServiceList);
	setMib_ValueTag(mib_ValueTag);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MBMS_ModifiedServiceList_v770ext();
	mComponents[1] = new rrc.informationelements.MIB_ValueTag();
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
		return new rrc.informationelements.MBMS_ModifiedServiceList_v770ext();
	    case 1:
		return new rrc.informationelements.MIB_ValueTag();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modifiedServiceList"
    public rrc.informationelements.MBMS_ModifiedServiceList_v770ext getModifiedServiceList()
    {
	return (rrc.informationelements.MBMS_ModifiedServiceList_v770ext)mComponents[0];
    }
    
    public void setModifiedServiceList(rrc.informationelements.MBMS_ModifiedServiceList_v770ext modifiedServiceList)
    {
	mComponents[0] = modifiedServiceList;
    }
    
    public boolean hasModifiedServiceList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteModifiedServiceList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "mib_ValueTag"
    public rrc.informationelements.MIB_ValueTag getMib_ValueTag()
    {
	return (rrc.informationelements.MIB_ValueTag)mComponents[1];
    }
    
    public void setMib_ValueTag(rrc.informationelements.MIB_ValueTag mib_ValueTag)
    {
	mComponents[1] = mib_ValueTag;
    }
    
    public boolean hasMib_ValueTag()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMib_ValueTag()
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
	    "rrc.pdu_definitions",
	    "MBMSModifiedServicesInformation_v770ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSModifiedServicesInformation-v770ext-IEs"
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
				"MBMS_ModifiedServiceList_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-ModifiedServiceList-v770ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_ModifiedService_v770ext"
				)
			    )
			)
		    ),
		    "modifiedServiceList",
		    0,
		    3,
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
				"rrc.informationelements",
				"MIB_ValueTag"
			    ),
			    new QName (
				"InformationElements",
				"MIB-ValueTag"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MIB_ValueTag(1), 
				    new rrc.informationelements.MIB_ValueTag(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "mib-ValueTag",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMSModifiedServicesInformation_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSModifiedServicesInformation_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSModifiedServicesInformation_v770ext_IEs
