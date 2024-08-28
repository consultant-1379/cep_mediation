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
 * Define the ASN1 Type UE_Positioning_Capability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_Capability extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_Capability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_Capability(BOOLEAN standaloneLocMethodsSupported, 
		    BOOLEAN ue_BasedOTDOA_Supported, 
		    NetworkAssistedGPS_Supported networkAssistedGPS_Supported, 
		    BOOLEAN supportForUE_GPS_TimingOfCellFrames, 
		    BOOLEAN supportForIPDL)
    {
	setStandaloneLocMethodsSupported(standaloneLocMethodsSupported);
	setUe_BasedOTDOA_Supported(ue_BasedOTDOA_Supported);
	setNetworkAssistedGPS_Supported(networkAssistedGPS_Supported);
	setSupportForUE_GPS_TimingOfCellFrames(supportForUE_GPS_TimingOfCellFrames);
	setSupportForIPDL(supportForIPDL);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_Capability(boolean standaloneLocMethodsSupported, 
		    boolean ue_BasedOTDOA_Supported, 
		    NetworkAssistedGPS_Supported networkAssistedGPS_Supported, 
		    boolean supportForUE_GPS_TimingOfCellFrames, 
		    boolean supportForIPDL)
    {
	this(new BOOLEAN(standaloneLocMethodsSupported), 
	     new BOOLEAN(ue_BasedOTDOA_Supported), 
	     networkAssistedGPS_Supported, 
	     new BOOLEAN(supportForUE_GPS_TimingOfCellFrames), 
	     new BOOLEAN(supportForIPDL));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = NetworkAssistedGPS_Supported.networkBased;
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return NetworkAssistedGPS_Supported.networkBased;
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "standaloneLocMethodsSupported"
    public boolean getStandaloneLocMethodsSupported()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setStandaloneLocMethodsSupported(boolean standaloneLocMethodsSupported)
    {
	setStandaloneLocMethodsSupported(new BOOLEAN(standaloneLocMethodsSupported));
    }
    
    public void setStandaloneLocMethodsSupported(BOOLEAN standaloneLocMethodsSupported)
    {
	mComponents[0] = standaloneLocMethodsSupported;
    }
    
    
    // Methods for field "ue_BasedOTDOA_Supported"
    public boolean getUe_BasedOTDOA_Supported()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setUe_BasedOTDOA_Supported(boolean ue_BasedOTDOA_Supported)
    {
	setUe_BasedOTDOA_Supported(new BOOLEAN(ue_BasedOTDOA_Supported));
    }
    
    public void setUe_BasedOTDOA_Supported(BOOLEAN ue_BasedOTDOA_Supported)
    {
	mComponents[1] = ue_BasedOTDOA_Supported;
    }
    
    
    // Methods for field "networkAssistedGPS_Supported"
    public NetworkAssistedGPS_Supported getNetworkAssistedGPS_Supported()
    {
	return (NetworkAssistedGPS_Supported)mComponents[2];
    }
    
    public void setNetworkAssistedGPS_Supported(NetworkAssistedGPS_Supported networkAssistedGPS_Supported)
    {
	mComponents[2] = networkAssistedGPS_Supported;
    }
    
    
    // Methods for field "supportForUE_GPS_TimingOfCellFrames"
    public boolean getSupportForUE_GPS_TimingOfCellFrames()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setSupportForUE_GPS_TimingOfCellFrames(boolean supportForUE_GPS_TimingOfCellFrames)
    {
	setSupportForUE_GPS_TimingOfCellFrames(new BOOLEAN(supportForUE_GPS_TimingOfCellFrames));
    }
    
    public void setSupportForUE_GPS_TimingOfCellFrames(BOOLEAN supportForUE_GPS_TimingOfCellFrames)
    {
	mComponents[3] = supportForUE_GPS_TimingOfCellFrames;
    }
    
    
    // Methods for field "supportForIPDL"
    public boolean getSupportForIPDL()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setSupportForIPDL(boolean supportForIPDL)
    {
	setSupportForIPDL(new BOOLEAN(supportForIPDL));
    }
    
    public void setSupportForIPDL(BOOLEAN supportForIPDL)
    {
	mComponents[4] = supportForIPDL;
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
	    "UE_Positioning_Capability"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-Capability"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "standaloneLocMethodsSupported",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ue-BasedOTDOA-Supported",
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
				"NetworkAssistedGPS_Supported"
			    ),
			    new QName (
				"InformationElements",
				"NetworkAssistedGPS-Supported"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"networkBased",
					0
				    ),
				    new MemberListElement (
					"ue-Based",
					1
				    ),
				    new MemberListElement (
					"bothNetworkAndUE-Based",
					2
				    ),
				    new MemberListElement (
					"noNetworkAssistedGPS",
					3
				    )
				}
			    ),
			    0,
			    NetworkAssistedGPS_Supported.networkBased
			)
		    ),
		    "networkAssistedGPS-Supported",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "supportForUE-GPS-TimingOfCellFrames",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "supportForIPDL",
		    4,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_Capability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_Capability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_Capability
