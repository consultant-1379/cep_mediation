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
 * Define the ASN1 Type MBMS_ServiceAccessInfo_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_ServiceAccessInfo_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_ServiceAccessInfo_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_ServiceAccessInfo_r6(MBMS_ShortTransmissionID shortTransmissionID, 
		    MBMS_AccessProbabilityFactor accessprobabilityFactor_Idle, 
		    MBMS_AccessProbabilityFactor accessprobabilityFactor_Connected, 
		    MBMS_ConnectedModeCountingScope mbms_ConnectedModeCountingScope)
    {
	setShortTransmissionID(shortTransmissionID);
	setAccessprobabilityFactor_Idle(accessprobabilityFactor_Idle);
	setAccessprobabilityFactor_Connected(accessprobabilityFactor_Connected);
	setMbms_ConnectedModeCountingScope(mbms_ConnectedModeCountingScope);
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_ServiceAccessInfo_r6(MBMS_ShortTransmissionID shortTransmissionID, 
		    MBMS_AccessProbabilityFactor accessprobabilityFactor_Idle, 
		    MBMS_ConnectedModeCountingScope mbms_ConnectedModeCountingScope)
    {
	setShortTransmissionID(shortTransmissionID);
	setAccessprobabilityFactor_Idle(accessprobabilityFactor_Idle);
	setMbms_ConnectedModeCountingScope(mbms_ConnectedModeCountingScope);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_ShortTransmissionID();
	mComponents[1] = MBMS_AccessProbabilityFactor.apf0;
	mComponents[2] = MBMS_AccessProbabilityFactor.apf0;
	mComponents[3] = new MBMS_ConnectedModeCountingScope();
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
		return new MBMS_ShortTransmissionID();
	    case 1:
		return MBMS_AccessProbabilityFactor.apf0;
	    case 2:
		return MBMS_AccessProbabilityFactor.apf0;
	    case 3:
		return new MBMS_ConnectedModeCountingScope();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "shortTransmissionID"
    public MBMS_ShortTransmissionID getShortTransmissionID()
    {
	return (MBMS_ShortTransmissionID)mComponents[0];
    }
    
    public void setShortTransmissionID(MBMS_ShortTransmissionID shortTransmissionID)
    {
	mComponents[0] = shortTransmissionID;
    }
    
    
    // Methods for field "accessprobabilityFactor_Idle"
    public MBMS_AccessProbabilityFactor getAccessprobabilityFactor_Idle()
    {
	return (MBMS_AccessProbabilityFactor)mComponents[1];
    }
    
    public void setAccessprobabilityFactor_Idle(MBMS_AccessProbabilityFactor accessprobabilityFactor_Idle)
    {
	mComponents[1] = accessprobabilityFactor_Idle;
    }
    
    
    // Methods for field "accessprobabilityFactor_Connected"
    public MBMS_AccessProbabilityFactor getAccessprobabilityFactor_Connected()
    {
	return (MBMS_AccessProbabilityFactor)mComponents[2];
    }
    
    public void setAccessprobabilityFactor_Connected(MBMS_AccessProbabilityFactor accessprobabilityFactor_Connected)
    {
	mComponents[2] = accessprobabilityFactor_Connected;
    }
    
    public boolean hasAccessprobabilityFactor_Connected()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAccessprobabilityFactor_Connected()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "mbms_ConnectedModeCountingScope"
    public MBMS_ConnectedModeCountingScope getMbms_ConnectedModeCountingScope()
    {
	return (MBMS_ConnectedModeCountingScope)mComponents[3];
    }
    
    public void setMbms_ConnectedModeCountingScope(MBMS_ConnectedModeCountingScope mbms_ConnectedModeCountingScope)
    {
	mComponents[3] = mbms_ConnectedModeCountingScope;
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
	    "MBMS_ServiceAccessInfo_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-ServiceAccessInfo-r6"
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
				"MBMS_ShortTransmissionID"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-ShortTransmissionID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_ShortTransmissionID(1), 
				    new MBMS_ShortTransmissionID(64),
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
		    "shortTransmissionID",
		    0,
		    2,
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
				"MBMS_AccessProbabilityFactor"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-AccessProbabilityFactor"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"apf0",
					0
				    ),
				    new MemberListElement (
					"apf32",
					1
				    ),
				    new MemberListElement (
					"apf64",
					2
				    ),
				    new MemberListElement (
					"apf96",
					3
				    ),
				    new MemberListElement (
					"apf128",
					4
				    ),
				    new MemberListElement (
					"apf160",
					5
				    ),
				    new MemberListElement (
					"apf192",
					6
				    ),
				    new MemberListElement (
					"apf224",
					7
				    ),
				    new MemberListElement (
					"apf256",
					8
				    ),
				    new MemberListElement (
					"apf288",
					9
				    ),
				    new MemberListElement (
					"apf320",
					10
				    ),
				    new MemberListElement (
					"apf352",
					11
				    ),
				    new MemberListElement (
					"apf384",
					12
				    ),
				    new MemberListElement (
					"apf416",
					13
				    ),
				    new MemberListElement (
					"apf448",
					14
				    ),
				    new MemberListElement (
					"apf480",
					15
				    ),
				    new MemberListElement (
					"apf512",
					16
				    ),
				    new MemberListElement (
					"apf544",
					17
				    ),
				    new MemberListElement (
					"apf576",
					18
				    ),
				    new MemberListElement (
					"apf608",
					19
				    ),
				    new MemberListElement (
					"apf640",
					20
				    ),
				    new MemberListElement (
					"apf672",
					21
				    ),
				    new MemberListElement (
					"apf704",
					22
				    ),
				    new MemberListElement (
					"apf736",
					23
				    ),
				    new MemberListElement (
					"apf768",
					24
				    ),
				    new MemberListElement (
					"apf800",
					25
				    ),
				    new MemberListElement (
					"apf832",
					26
				    ),
				    new MemberListElement (
					"apf864",
					27
				    ),
				    new MemberListElement (
					"apf896",
					28
				    ),
				    new MemberListElement (
					"apf928",
					29
				    ),
				    new MemberListElement (
					"apf960",
					30
				    ),
				    new MemberListElement (
					"apf1000",
					31
				    )
				}
			    ),
			    0,
			    MBMS_AccessProbabilityFactor.apf0
			)
		    ),
		    "accessprobabilityFactor-Idle",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_AccessProbabilityFactor"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-AccessProbabilityFactor"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"apf0",
					0
				    ),
				    new MemberListElement (
					"apf32",
					1
				    ),
				    new MemberListElement (
					"apf64",
					2
				    ),
				    new MemberListElement (
					"apf96",
					3
				    ),
				    new MemberListElement (
					"apf128",
					4
				    ),
				    new MemberListElement (
					"apf160",
					5
				    ),
				    new MemberListElement (
					"apf192",
					6
				    ),
				    new MemberListElement (
					"apf224",
					7
				    ),
				    new MemberListElement (
					"apf256",
					8
				    ),
				    new MemberListElement (
					"apf288",
					9
				    ),
				    new MemberListElement (
					"apf320",
					10
				    ),
				    new MemberListElement (
					"apf352",
					11
				    ),
				    new MemberListElement (
					"apf384",
					12
				    ),
				    new MemberListElement (
					"apf416",
					13
				    ),
				    new MemberListElement (
					"apf448",
					14
				    ),
				    new MemberListElement (
					"apf480",
					15
				    ),
				    new MemberListElement (
					"apf512",
					16
				    ),
				    new MemberListElement (
					"apf544",
					17
				    ),
				    new MemberListElement (
					"apf576",
					18
				    ),
				    new MemberListElement (
					"apf608",
					19
				    ),
				    new MemberListElement (
					"apf640",
					20
				    ),
				    new MemberListElement (
					"apf672",
					21
				    ),
				    new MemberListElement (
					"apf704",
					22
				    ),
				    new MemberListElement (
					"apf736",
					23
				    ),
				    new MemberListElement (
					"apf768",
					24
				    ),
				    new MemberListElement (
					"apf800",
					25
				    ),
				    new MemberListElement (
					"apf832",
					26
				    ),
				    new MemberListElement (
					"apf864",
					27
				    ),
				    new MemberListElement (
					"apf896",
					28
				    ),
				    new MemberListElement (
					"apf928",
					29
				    ),
				    new MemberListElement (
					"apf960",
					30
				    ),
				    new MemberListElement (
					"apf1000",
					31
				    )
				}
			    ),
			    0,
			    MBMS_AccessProbabilityFactor.apf0
			)
		    ),
		    "accessprobabilityFactor-Connected",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_ConnectedModeCountingScope"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-ConnectedModeCountingScope"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_ConnectedModeCountingScope"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_ConnectedModeCountingScope"
				)
			    ),
			    0
			)
		    ),
		    "mbms-ConnectedModeCountingScope",
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_ServiceAccessInfo_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_ServiceAccessInfo_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_ServiceAccessInfo_r6
