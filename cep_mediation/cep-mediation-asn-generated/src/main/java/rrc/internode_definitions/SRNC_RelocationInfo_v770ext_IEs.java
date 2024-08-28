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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type SRNC_RelocationInfo_v770ext_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_v770ext_IEs(rrc.informationelements.ThresholdSFN_GPS_TOW_us thresholdSFN_GPS_TOW_us, 
		    rrc.informationelements.T_305 srns_t_305)
    {
	setThresholdSFN_GPS_TOW_us(thresholdSFN_GPS_TOW_us);
	setSrns_t_305(srns_t_305);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.ThresholdSFN_GPS_TOW_us.us1;
	mComponents[1] = rrc.informationelements.T_305.noUpdate;
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
		return rrc.informationelements.ThresholdSFN_GPS_TOW_us.us1;
	    case 1:
		return rrc.informationelements.T_305.noUpdate;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "thresholdSFN_GPS_TOW_us"
    public rrc.informationelements.ThresholdSFN_GPS_TOW_us getThresholdSFN_GPS_TOW_us()
    {
	return (rrc.informationelements.ThresholdSFN_GPS_TOW_us)mComponents[0];
    }
    
    public void setThresholdSFN_GPS_TOW_us(rrc.informationelements.ThresholdSFN_GPS_TOW_us thresholdSFN_GPS_TOW_us)
    {
	mComponents[0] = thresholdSFN_GPS_TOW_us;
    }
    
    public boolean hasThresholdSFN_GPS_TOW_us()
    {
	return componentIsPresent(0);
    }
    
    public void deleteThresholdSFN_GPS_TOW_us()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "srns_t_305"
    public rrc.informationelements.T_305 getSrns_t_305()
    {
	return (rrc.informationelements.T_305)mComponents[1];
    }
    
    public void setSrns_t_305(rrc.informationelements.T_305 srns_t_305)
    {
	mComponents[1] = srns_t_305;
    }
    
    public boolean hasSrns_t_305()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSrns_t_305()
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
	    "rrc.internode_definitions",
	    "SRNC_RelocationInfo_v770ext_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-v770ext-IEs"
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
				"ThresholdSFN_GPS_TOW_us"
			    ),
			    new QName (
				"InformationElements",
				"ThresholdSFN-GPS-TOW-us"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"us1",
					0
				    ),
				    new MemberListElement (
					"us2",
					1
				    ),
				    new MemberListElement (
					"us3",
					2
				    ),
				    new MemberListElement (
					"us5",
					3
				    ),
				    new MemberListElement (
					"us10",
					4
				    ),
				    new MemberListElement (
					"us20",
					5
				    ),
				    new MemberListElement (
					"us50",
					6
				    ),
				    new MemberListElement (
					"us100",
					7
				    )
				}
			    ),
			    0,
			    rrc.informationelements.ThresholdSFN_GPS_TOW_us.us1
			)
		    ),
		    "thresholdSFN-GPS-TOW-us",
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
				"T_305"
			    ),
			    new QName (
				"InformationElements",
				"T-305"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"noUpdate",
					0
				    ),
				    new MemberListElement (
					"m5",
					1
				    ),
				    new MemberListElement (
					"m10",
					2
				    ),
				    new MemberListElement (
					"m30",
					3
				    ),
				    new MemberListElement (
					"m60",
					4
				    ),
				    new MemberListElement (
					"m120",
					5
				    ),
				    new MemberListElement (
					"m360",
					6
				    ),
				    new MemberListElement (
					"m720",
					7
				    )
				}
			    ),
			    0,
			    rrc.informationelements.T_305.noUpdate
			)
		    ),
		    "srns-t-305",
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
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_v770ext_IEs
