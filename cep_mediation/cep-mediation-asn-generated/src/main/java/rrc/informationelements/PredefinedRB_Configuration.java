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
 * Define the ASN1 Type PredefinedRB_Configuration from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PredefinedRB_Configuration extends Sequence {
    
    /**
     * The default constructor.
     */
    public PredefinedRB_Configuration()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PredefinedRB_Configuration(Re_EstablishmentTimer re_EstablishmentTimer, 
		    SRB_InformationSetupList srb_InformationList, 
		    RB_InformationSetupList rb_InformationList)
    {
	setRe_EstablishmentTimer(re_EstablishmentTimer);
	setSrb_InformationList(srb_InformationList);
	setRb_InformationList(rb_InformationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = Re_EstablishmentTimer.useT314;
	mComponents[1] = new SRB_InformationSetupList();
	mComponents[2] = new RB_InformationSetupList();
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
		return Re_EstablishmentTimer.useT314;
	    case 1:
		return new SRB_InformationSetupList();
	    case 2:
		return new RB_InformationSetupList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "re_EstablishmentTimer"
    public Re_EstablishmentTimer getRe_EstablishmentTimer()
    {
	return (Re_EstablishmentTimer)mComponents[0];
    }
    
    public void setRe_EstablishmentTimer(Re_EstablishmentTimer re_EstablishmentTimer)
    {
	mComponents[0] = re_EstablishmentTimer;
    }
    
    
    // Methods for field "srb_InformationList"
    public SRB_InformationSetupList getSrb_InformationList()
    {
	return (SRB_InformationSetupList)mComponents[1];
    }
    
    public void setSrb_InformationList(SRB_InformationSetupList srb_InformationList)
    {
	mComponents[1] = srb_InformationList;
    }
    
    
    // Methods for field "rb_InformationList"
    public RB_InformationSetupList getRb_InformationList()
    {
	return (RB_InformationSetupList)mComponents[2];
    }
    
    public void setRb_InformationList(RB_InformationSetupList rb_InformationList)
    {
	mComponents[2] = rb_InformationList;
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
	    "PredefinedRB_Configuration"
	),
	new QName (
	    "InformationElements",
	    "PredefinedRB-Configuration"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Re_EstablishmentTimer"
			    ),
			    new QName (
				"InformationElements",
				"Re-EstablishmentTimer"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"useT314",
					0
				    ),
				    new MemberListElement (
					"useT315",
					1
				    )
				}
			    ),
			    0,
			    Re_EstablishmentTimer.useT314
			)
		    ),
		    "re-EstablishmentTimer",
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
				"SRB_InformationSetupList"
			    ),
			    new QName (
				"InformationElements",
				"SRB-InformationSetupList"
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
				    "SRB_InformationSetup"
				)
			    )
			)
		    ),
		    "srb-InformationList",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_InformationSetupList"
			    ),
			    new QName (
				"InformationElements",
				"RB-InformationSetupList"
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
				    "RB_InformationSetup"
				)
			    )
			)
		    ),
		    "rb-InformationList",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' PredefinedRB_Configuration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PredefinedRB_Configuration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PredefinedRB_Configuration
