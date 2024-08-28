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
 * Define the ASN1 Type RRCConnectionSetup_v4b0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionSetup_v4b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionSetup_v4b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionSetup_v4b0ext_IEs(rrc.informationelements.CapabilityUpdateRequirement_r4_ext capabilityUpdateRequirement_r4_ext, 
		    rrc.informationelements.SSDT_UL dummy, 
		    rrc.informationelements.CellIdentity_PerRL_List cell_id_PerRL_List)
    {
	setCapabilityUpdateRequirement_r4_ext(capabilityUpdateRequirement_r4_ext);
	setDummy(dummy);
	setCell_id_PerRL_List(cell_id_PerRL_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.CapabilityUpdateRequirement_r4_ext();
	mComponents[1] = rrc.informationelements.SSDT_UL.ul;
	mComponents[2] = new rrc.informationelements.CellIdentity_PerRL_List();
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
		return new rrc.informationelements.CapabilityUpdateRequirement_r4_ext();
	    case 1:
		return rrc.informationelements.SSDT_UL.ul;
	    case 2:
		return new rrc.informationelements.CellIdentity_PerRL_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "capabilityUpdateRequirement_r4_ext"
    public rrc.informationelements.CapabilityUpdateRequirement_r4_ext getCapabilityUpdateRequirement_r4_ext()
    {
	return (rrc.informationelements.CapabilityUpdateRequirement_r4_ext)mComponents[0];
    }
    
    public void setCapabilityUpdateRequirement_r4_ext(rrc.informationelements.CapabilityUpdateRequirement_r4_ext capabilityUpdateRequirement_r4_ext)
    {
	mComponents[0] = capabilityUpdateRequirement_r4_ext;
    }
    
    public boolean hasCapabilityUpdateRequirement_r4_ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCapabilityUpdateRequirement_r4_ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dummy"
    public rrc.informationelements.SSDT_UL getDummy()
    {
	return (rrc.informationelements.SSDT_UL)mComponents[1];
    }
    
    public void setDummy(rrc.informationelements.SSDT_UL dummy)
    {
	mComponents[1] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cell_id_PerRL_List"
    public rrc.informationelements.CellIdentity_PerRL_List getCell_id_PerRL_List()
    {
	return (rrc.informationelements.CellIdentity_PerRL_List)mComponents[2];
    }
    
    public void setCell_id_PerRL_List(rrc.informationelements.CellIdentity_PerRL_List cell_id_PerRL_List)
    {
	mComponents[2] = cell_id_PerRL_List;
    }
    
    public boolean hasCell_id_PerRL_List()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCell_id_PerRL_List()
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
	    "rrc.pdu_definitions",
	    "RRCConnectionSetup_v4b0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionSetup-v4b0ext-IEs"
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
				"CapabilityUpdateRequirement_r4_ext"
			    ),
			    new QName (
				"InformationElements",
				"CapabilityUpdateRequirement-r4-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CapabilityUpdateRequirement_r4_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CapabilityUpdateRequirement_r4_ext"
				)
			    ),
			    0
			)
		    ),
		    "capabilityUpdateRequirement-r4-ext",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SSDT_UL"
			    ),
			    new QName (
				"InformationElements",
				"SSDT-UL"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ul",
					0
				    ),
				    new MemberListElement (
					"ul-AndDL",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.SSDT_UL.ul
			)
		    ),
		    "dummy",
		    1,
		    3,
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
				"CellIdentity_PerRL_List"
			    ),
			    new QName (
				"InformationElements",
				"CellIdentity-PerRL-List"
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
				    "CellIdentity"
				)
			    )
			)
		    ),
		    "cell-id-PerRL-List",
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionSetup_v4b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionSetup_v4b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionSetup_v4b0ext_IEs
