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
 * Define the ASN1 Type UE_Positioning_Capability_r4 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class UE_Positioning_Capability_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_Capability_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_Capability_r4(BOOLEAN standaloneLocMethodsSupported, 
		    BOOLEAN ue_BasedOTDOA_Supported, 
		    rrc.informationelements.NetworkAssistedGPS_Supported networkAssistedGPS_Supported, 
		    BOOLEAN supportForUE_GPS_TimingOfCellFrames, 
		    BOOLEAN supportForIPDL, 
		    BOOLEAN rx_tx_TimeDifferenceType2Capable, 
		    Validity_CellPCH_UraPCH validity_CellPCH_UraPCH, 
		    Sfn_sfnType2Capability sfn_sfnType2Capability)
    {
	setStandaloneLocMethodsSupported(standaloneLocMethodsSupported);
	setUe_BasedOTDOA_Supported(ue_BasedOTDOA_Supported);
	setNetworkAssistedGPS_Supported(networkAssistedGPS_Supported);
	setSupportForUE_GPS_TimingOfCellFrames(supportForUE_GPS_TimingOfCellFrames);
	setSupportForIPDL(supportForIPDL);
	setRx_tx_TimeDifferenceType2Capable(rx_tx_TimeDifferenceType2Capable);
	setValidity_CellPCH_UraPCH(validity_CellPCH_UraPCH);
	setSfn_sfnType2Capability(sfn_sfnType2Capability);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_Capability_r4(boolean standaloneLocMethodsSupported, 
		    boolean ue_BasedOTDOA_Supported, 
		    rrc.informationelements.NetworkAssistedGPS_Supported networkAssistedGPS_Supported, 
		    boolean supportForUE_GPS_TimingOfCellFrames, 
		    boolean supportForIPDL, 
		    boolean rx_tx_TimeDifferenceType2Capable, 
		    Validity_CellPCH_UraPCH validity_CellPCH_UraPCH, 
		    Sfn_sfnType2Capability sfn_sfnType2Capability)
    {
	this(new BOOLEAN(standaloneLocMethodsSupported), 
	     new BOOLEAN(ue_BasedOTDOA_Supported), 
	     networkAssistedGPS_Supported, 
	     new BOOLEAN(supportForUE_GPS_TimingOfCellFrames), 
	     new BOOLEAN(supportForIPDL), 
	     new BOOLEAN(rx_tx_TimeDifferenceType2Capable), 
	     validity_CellPCH_UraPCH, sfn_sfnType2Capability);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_Capability_r4(boolean standaloneLocMethodsSupported, 
		    boolean ue_BasedOTDOA_Supported, 
		    rrc.informationelements.NetworkAssistedGPS_Supported networkAssistedGPS_Supported, 
		    boolean supportForUE_GPS_TimingOfCellFrames, 
		    boolean supportForIPDL, 
		    boolean rx_tx_TimeDifferenceType2Capable)
    {
	setStandaloneLocMethodsSupported(standaloneLocMethodsSupported);
	setUe_BasedOTDOA_Supported(ue_BasedOTDOA_Supported);
	setNetworkAssistedGPS_Supported(networkAssistedGPS_Supported);
	setSupportForUE_GPS_TimingOfCellFrames(supportForUE_GPS_TimingOfCellFrames);
	setSupportForIPDL(supportForIPDL);
	setRx_tx_TimeDifferenceType2Capable(rx_tx_TimeDifferenceType2Capable);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = rrc.informationelements.NetworkAssistedGPS_Supported.networkBased;
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new BOOLEAN();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = Validity_CellPCH_UraPCH._true;
	mComponents[7] = Sfn_sfnType2Capability._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
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
		return rrc.informationelements.NetworkAssistedGPS_Supported.networkBased;
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new BOOLEAN();
	    case 5:
		return new BOOLEAN();
	    case 6:
		return Validity_CellPCH_UraPCH._true;
	    case 7:
		return Sfn_sfnType2Capability._true;
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
    public rrc.informationelements.NetworkAssistedGPS_Supported getNetworkAssistedGPS_Supported()
    {
	return (rrc.informationelements.NetworkAssistedGPS_Supported)mComponents[2];
    }
    
    public void setNetworkAssistedGPS_Supported(rrc.informationelements.NetworkAssistedGPS_Supported networkAssistedGPS_Supported)
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
    
    
    // Methods for field "rx_tx_TimeDifferenceType2Capable"
    public boolean getRx_tx_TimeDifferenceType2Capable()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setRx_tx_TimeDifferenceType2Capable(boolean rx_tx_TimeDifferenceType2Capable)
    {
	setRx_tx_TimeDifferenceType2Capable(new BOOLEAN(rx_tx_TimeDifferenceType2Capable));
    }
    
    public void setRx_tx_TimeDifferenceType2Capable(BOOLEAN rx_tx_TimeDifferenceType2Capable)
    {
	mComponents[5] = rx_tx_TimeDifferenceType2Capable;
    }
    
    
    // Methods for field "validity_CellPCH_UraPCH"
    public Validity_CellPCH_UraPCH getValidity_CellPCH_UraPCH()
    {
	return (Validity_CellPCH_UraPCH)mComponents[6];
    }
    
    public void setValidity_CellPCH_UraPCH(Validity_CellPCH_UraPCH validity_CellPCH_UraPCH)
    {
	mComponents[6] = validity_CellPCH_UraPCH;
    }
    
    public boolean hasValidity_CellPCH_UraPCH()
    {
	return componentIsPresent(6);
    }
    
    public void deleteValidity_CellPCH_UraPCH()
    {
	setComponentAbsent(6);
    }
    
    
    
    /**
     * Define the ASN1 Type Validity_CellPCH_UraPCH from ASN1 Module Internode_definitions.
     * @see Enumerated
     */
    public static final class Validity_CellPCH_UraPCH extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Validity_CellPCH_UraPCH()
	{
	    super(cFirstNumber);
	}
	
	protected Validity_CellPCH_UraPCH(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Validity_CellPCH_UraPCH _true =
	    new Validity_CellPCH_UraPCH(0);
	private final static Validity_CellPCH_UraPCH cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static Validity_CellPCH_UraPCH valueOf(long value)
	{
	    return (Validity_CellPCH_UraPCH)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"UE_Positioning_Capability_r4$Validity_CellPCH_UraPCH"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Validity_CellPCH_UraPCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Validity_CellPCH_UraPCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Validity_CellPCH_UraPCH

    // Methods for field "sfn_sfnType2Capability"
    public Sfn_sfnType2Capability getSfn_sfnType2Capability()
    {
	return (Sfn_sfnType2Capability)mComponents[7];
    }
    
    public void setSfn_sfnType2Capability(Sfn_sfnType2Capability sfn_sfnType2Capability)
    {
	mComponents[7] = sfn_sfnType2Capability;
    }
    
    public boolean hasSfn_sfnType2Capability()
    {
	return componentIsPresent(7);
    }
    
    public void deleteSfn_sfnType2Capability()
    {
	setComponentAbsent(7);
    }
    
    
    
    /**
     * Define the ASN1 Type Sfn_sfnType2Capability from ASN1 Module Internode_definitions.
     * @see Enumerated
     */
    public static final class Sfn_sfnType2Capability extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Sfn_sfnType2Capability()
	{
	    super(cFirstNumber);
	}
	
	protected Sfn_sfnType2Capability(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Sfn_sfnType2Capability _true =
	    new Sfn_sfnType2Capability(0);
	private final static Sfn_sfnType2Capability cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static Sfn_sfnType2Capability valueOf(long value)
	{
	    return (Sfn_sfnType2Capability)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8007
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"UE_Positioning_Capability_r4$Sfn_sfnType2Capability"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Sfn_sfnType2Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sfn_sfnType2Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sfn_sfnType2Capability

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
	    "UE_Positioning_Capability_r4"
	),
	new QName (
	    "Internode-definitions",
	    "UE-Positioning-Capability-r4"
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
			    rrc.informationelements.NetworkAssistedGPS_Supported.networkBased
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
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "rx-tx-TimeDifferenceType2Capable",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "UE_Positioning_Capability_r4$Validity_CellPCH_UraPCH"
			)
		    ),
		    "validity-CellPCH-UraPCH",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "UE_Positioning_Capability_r4$Sfn_sfnType2Capability"
			)
		    ),
		    "sfn-sfnType2Capability",
		    7,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_Capability_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_Capability_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_Capability_r4
