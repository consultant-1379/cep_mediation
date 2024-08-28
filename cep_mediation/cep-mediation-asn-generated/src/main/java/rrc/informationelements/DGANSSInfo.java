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
 * Define the ASN1 Type DGANSSInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DGANSSInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public DGANSSInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DGANSSInfo(GANSS_Signal_Id ganssSignalId, 
		    GANSS_Status_Health ganssStatusHealth, 
		    DGANSSSignalInformationList dgansssignalInformationList)
    {
	setGanssSignalId(ganssSignalId);
	setGanssStatusHealth(ganssStatusHealth);
	setDgansssignalInformationList(dgansssignalInformationList);
    }
    
    /**
     * Construct with required components.
     */
    public DGANSSInfo(GANSS_Status_Health ganssStatusHealth)
    {
	setGanssStatusHealth(ganssStatusHealth);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GANSS_Signal_Id();
	mComponents[1] = GANSS_Status_Health.udre_scale_1dot0;
	mComponents[2] = new DGANSSSignalInformationList();
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
		return new GANSS_Signal_Id();
	    case 1:
		return GANSS_Status_Health.udre_scale_1dot0;
	    case 2:
		return new DGANSSSignalInformationList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssSignalId"
    public GANSS_Signal_Id getGanssSignalId()
    {
	return (GANSS_Signal_Id)mComponents[0];
    }
    
    public void setGanssSignalId(GANSS_Signal_Id ganssSignalId)
    {
	mComponents[0] = ganssSignalId;
    }
    
    public boolean hasGanssSignalId()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGanssSignalId()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ganssStatusHealth"
    public GANSS_Status_Health getGanssStatusHealth()
    {
	return (GANSS_Status_Health)mComponents[1];
    }
    
    public void setGanssStatusHealth(GANSS_Status_Health ganssStatusHealth)
    {
	mComponents[1] = ganssStatusHealth;
    }
    
    
    // Methods for field "dgansssignalInformationList"
    public DGANSSSignalInformationList getDgansssignalInformationList()
    {
	return (DGANSSSignalInformationList)mComponents[2];
    }
    
    public void setDgansssignalInformationList(DGANSSSignalInformationList dgansssignalInformationList)
    {
	mComponents[2] = dgansssignalInformationList;
    }
    
    public boolean hasDgansssignalInformationList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDgansssignalInformationList()
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
	    "DGANSSInfo"
	),
	new QName (
	    "InformationElements",
	    "DGANSSInfo"
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
				"GANSS_Signal_Id"
			    ),
			    new QName (
				"InformationElements",
				"GANSS-Signal-Id"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new GANSS_Signal_Id(0), 
				    new GANSS_Signal_Id(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "ganssSignalId",
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
				"GANSS_Status_Health"
			    ),
			    new QName (
				"InformationElements",
				"GANSS-Status-Health"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"udre-scale-1dot0",
					0
				    ),
				    new MemberListElement (
					"udre-scale-0dot75",
					1
				    ),
				    new MemberListElement (
					"udre-scale-0dot5",
					2
				    ),
				    new MemberListElement (
					"udre-scale-0dot3",
					3
				    ),
				    new MemberListElement (
					"udre-scale-0dot2",
					4
				    ),
				    new MemberListElement (
					"udre-scale-0dot1",
					5
				    ),
				    new MemberListElement (
					"no-data",
					6
				    ),
				    new MemberListElement (
					"invalid-data",
					7
				    )
				}
			    ),
			    0,
			    GANSS_Status_Health.udre_scale_1dot0
			)
		    ),
		    "ganssStatusHealth",
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
				"DGANSSSignalInformationList"
			    ),
			    new QName (
				"InformationElements",
				"DGANSSSignalInformationList"
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
				    "DGANSSSignalInformation"
				)
			    )
			)
		    ),
		    "dgansssignalInformationList",
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' DGANSSInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DGANSSInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DGANSSInfo
