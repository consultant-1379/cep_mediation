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
 * Define the ASN1 Type E_DCH_AddReconf_MAC_d_Flow from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DCH_AddReconf_MAC_d_Flow extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DCH_AddReconf_MAC_d_Flow()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DCH_AddReconf_MAC_d_Flow(E_DCH_MAC_d_FlowIdentity mac_d_FlowIdentity, 
		    E_DCH_MAC_d_FlowPowerOffset mac_d_FlowPowerOffset, 
		    E_DCH_MAC_d_FlowMaxRetrans mac_d_FlowMaxRetrans, 
		    E_DCH_MAC_d_FlowMultiplexingList mac_d_FlowMultiplexingList, 
		    TransmissionGrantType transmissionGrantType)
    {
	setMac_d_FlowIdentity(mac_d_FlowIdentity);
	setMac_d_FlowPowerOffset(mac_d_FlowPowerOffset);
	setMac_d_FlowMaxRetrans(mac_d_FlowMaxRetrans);
	setMac_d_FlowMultiplexingList(mac_d_FlowMultiplexingList);
	setTransmissionGrantType(transmissionGrantType);
    }
    
    /**
     * Construct with required components.
     */
    public E_DCH_AddReconf_MAC_d_Flow(E_DCH_MAC_d_FlowIdentity mac_d_FlowIdentity)
    {
	setMac_d_FlowIdentity(mac_d_FlowIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_DCH_MAC_d_FlowIdentity();
	mComponents[1] = new E_DCH_MAC_d_FlowPowerOffset();
	mComponents[2] = new E_DCH_MAC_d_FlowMaxRetrans();
	mComponents[3] = new E_DCH_MAC_d_FlowMultiplexingList();
	mComponents[4] = new TransmissionGrantType();
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
		return new E_DCH_MAC_d_FlowIdentity();
	    case 1:
		return new E_DCH_MAC_d_FlowPowerOffset();
	    case 2:
		return new E_DCH_MAC_d_FlowMaxRetrans();
	    case 3:
		return new E_DCH_MAC_d_FlowMultiplexingList();
	    case 4:
		return new TransmissionGrantType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mac_d_FlowIdentity"
    public E_DCH_MAC_d_FlowIdentity getMac_d_FlowIdentity()
    {
	return (E_DCH_MAC_d_FlowIdentity)mComponents[0];
    }
    
    public void setMac_d_FlowIdentity(E_DCH_MAC_d_FlowIdentity mac_d_FlowIdentity)
    {
	mComponents[0] = mac_d_FlowIdentity;
    }
    
    
    // Methods for field "mac_d_FlowPowerOffset"
    public E_DCH_MAC_d_FlowPowerOffset getMac_d_FlowPowerOffset()
    {
	return (E_DCH_MAC_d_FlowPowerOffset)mComponents[1];
    }
    
    public void setMac_d_FlowPowerOffset(E_DCH_MAC_d_FlowPowerOffset mac_d_FlowPowerOffset)
    {
	mComponents[1] = mac_d_FlowPowerOffset;
    }
    
    public boolean hasMac_d_FlowPowerOffset()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMac_d_FlowPowerOffset()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "mac_d_FlowMaxRetrans"
    public E_DCH_MAC_d_FlowMaxRetrans getMac_d_FlowMaxRetrans()
    {
	return (E_DCH_MAC_d_FlowMaxRetrans)mComponents[2];
    }
    
    public void setMac_d_FlowMaxRetrans(E_DCH_MAC_d_FlowMaxRetrans mac_d_FlowMaxRetrans)
    {
	mComponents[2] = mac_d_FlowMaxRetrans;
    }
    
    public boolean hasMac_d_FlowMaxRetrans()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMac_d_FlowMaxRetrans()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "mac_d_FlowMultiplexingList"
    public E_DCH_MAC_d_FlowMultiplexingList getMac_d_FlowMultiplexingList()
    {
	return (E_DCH_MAC_d_FlowMultiplexingList)mComponents[3];
    }
    
    public void setMac_d_FlowMultiplexingList(E_DCH_MAC_d_FlowMultiplexingList mac_d_FlowMultiplexingList)
    {
	mComponents[3] = mac_d_FlowMultiplexingList;
    }
    
    public boolean hasMac_d_FlowMultiplexingList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMac_d_FlowMultiplexingList()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "transmissionGrantType"
    public TransmissionGrantType getTransmissionGrantType()
    {
	return (TransmissionGrantType)mComponents[4];
    }
    
    public void setTransmissionGrantType(TransmissionGrantType transmissionGrantType)
    {
	mComponents[4] = transmissionGrantType;
    }
    
    public boolean hasTransmissionGrantType()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTransmissionGrantType()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type TransmissionGrantType from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class TransmissionGrantType extends Choice {
	
	/**
	 * The default constructor.
	 */
	public TransmissionGrantType()
	{
	}
	
	public static final  int  non_ScheduledTransGrantInfo_chosen = 1;
	public static final  int  scheduledTransmissionGrantInfo_chosen = 2;
	
	// Methods for field "non_ScheduledTransGrantInfo"
	public static TransmissionGrantType createTransmissionGrantTypeWithNon_ScheduledTransGrantInfo(Non_ScheduledTransGrantInfo non_ScheduledTransGrantInfo)
	{
	    TransmissionGrantType __object = new TransmissionGrantType();

	    __object.setNon_ScheduledTransGrantInfo(non_ScheduledTransGrantInfo);
	    return __object;
	}
	
	public boolean hasNon_ScheduledTransGrantInfo()
	{
	    return getChosenFlag() == non_ScheduledTransGrantInfo_chosen;
	}
	
	public void setNon_ScheduledTransGrantInfo(Non_ScheduledTransGrantInfo non_ScheduledTransGrantInfo)
	{
	    setChosenValue(non_ScheduledTransGrantInfo);
	    setChosenFlag(non_ScheduledTransGrantInfo_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Non_ScheduledTransGrantInfo from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Non_ScheduledTransGrantInfo extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Non_ScheduledTransGrantInfo()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Non_ScheduledTransGrantInfo(INTEGER maxMAC_e_PDUContents, 
			    BitString ms2_NonSchedTransmGrantHARQAlloc)
	    {
		setMaxMAC_e_PDUContents(maxMAC_e_PDUContents);
		setMs2_NonSchedTransmGrantHARQAlloc(ms2_NonSchedTransmGrantHARQAlloc);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Non_ScheduledTransGrantInfo(long maxMAC_e_PDUContents, 
			    BitString ms2_NonSchedTransmGrantHARQAlloc)
	    {
		this(new INTEGER(maxMAC_e_PDUContents), 
		     ms2_NonSchedTransmGrantHARQAlloc);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Non_ScheduledTransGrantInfo(long maxMAC_e_PDUContents)
	    {
		setMaxMAC_e_PDUContents(maxMAC_e_PDUContents);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new INTEGER();
		mComponents[1] = new BitString();
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
			return new INTEGER();
		    case 1:
			return new BitString();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "maxMAC_e_PDUContents"
	    public long getMaxMAC_e_PDUContents()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setMaxMAC_e_PDUContents(long maxMAC_e_PDUContents)
	    {
		setMaxMAC_e_PDUContents(new INTEGER(maxMAC_e_PDUContents));
	    }
	    
	    public void setMaxMAC_e_PDUContents(INTEGER maxMAC_e_PDUContents)
	    {
		mComponents[0] = maxMAC_e_PDUContents;
	    }
	    
	    
	    // Methods for field "ms2_NonSchedTransmGrantHARQAlloc"
	    public BitString getMs2_NonSchedTransmGrantHARQAlloc()
	    {
		return (BitString)mComponents[1];
	    }
	    
	    public void setMs2_NonSchedTransmGrantHARQAlloc(BitString ms2_NonSchedTransmGrantHARQAlloc)
	    {
		mComponents[1] = ms2_NonSchedTransmGrantHARQAlloc;
	    }
	    
	    public boolean hasMs2_NonSchedTransmGrantHARQAlloc()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteMs2_NonSchedTransmGrantHARQAlloc()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "E_DCH_AddReconf_MAC_d_Flow$TransmissionGrantType$Non_ScheduledTransGrantInfo"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
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
					"com.oss.asn1",
					"INTEGER"
				    ),
				    new QName (
					"builtin",
					"INTEGER"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(19982),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(19982)
				    ),
				    null
				)
			    ),
			    "maxMAC-e-PDUContents",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"BitString"
				    ),
				    new QName (
					"builtin",
					"BIT STRING"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(8)
					)
				    ),
				    new Bounds (
					new java.lang.Long(8),
					new java.lang.Long(8)
				    ),
				    null
				)
			    ),
			    "ms2-NonSchedTransmGrantHARQAlloc",
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
				new TagDecoderElement((short)0x8000, 0)
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
	     * Get the type descriptor (TypeInfo) of 'this' Non_ScheduledTransGrantInfo object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Non_ScheduledTransGrantInfo object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Non_ScheduledTransGrantInfo

	// Methods for field "scheduledTransmissionGrantInfo"
	public static TransmissionGrantType createTransmissionGrantTypeWithScheduledTransmissionGrantInfo(Null scheduledTransmissionGrantInfo)
	{
	    TransmissionGrantType __object = new TransmissionGrantType();

	    __object.setScheduledTransmissionGrantInfo(scheduledTransmissionGrantInfo);
	    return __object;
	}
	
	public boolean hasScheduledTransmissionGrantInfo()
	{
	    return getChosenFlag() == scheduledTransmissionGrantInfo_chosen;
	}
	
	public void setScheduledTransmissionGrantInfo(Null scheduledTransmissionGrantInfo)
	{
	    setChosenValue(scheduledTransmissionGrantInfo);
	    setChosenFlag(scheduledTransmissionGrantInfo_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case non_ScheduledTransGrantInfo_chosen:
		    return new Non_ScheduledTransGrantInfo();
		case scheduledTransmissionGrantInfo_chosen:
		    return new Null();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_DCH_AddReconf_MAC_d_Flow$TransmissionGrantType"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"E_DCH_AddReconf_MAC_d_Flow$TransmissionGrantType$Non_ScheduledTransGrantInfo"
			    )
			),
			"non-ScheduledTransGrantInfo",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
			    )
			),
			"scheduledTransmissionGrantInfo",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' TransmissionGrantType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' TransmissionGrantType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for TransmissionGrantType

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
	    "E_DCH_AddReconf_MAC_d_Flow"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-AddReconf-MAC-d-Flow"
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
				"E_DCH_MAC_d_FlowIdentity"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MAC-d-FlowIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DCH_MAC_d_FlowIdentity(0), 
				    new E_DCH_MAC_d_FlowIdentity(7),
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
		    "mac-d-FlowIdentity",
		    0,
		    2,
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
				"E_DCH_MAC_d_FlowPowerOffset"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MAC-d-FlowPowerOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DCH_MAC_d_FlowPowerOffset(0), 
				    new E_DCH_MAC_d_FlowPowerOffset(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "mac-d-FlowPowerOffset",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DCH_MAC_d_FlowMaxRetrans"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MAC-d-FlowMaxRetrans"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DCH_MAC_d_FlowMaxRetrans(0), 
				    new E_DCH_MAC_d_FlowMaxRetrans(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "mac-d-FlowMaxRetrans",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DCH_MAC_d_FlowMultiplexingList"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MAC-d-FlowMultiplexingList"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "mac-d-FlowMultiplexingList",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_DCH_AddReconf_MAC_d_Flow$TransmissionGrantType"
			)
		    ),
		    "transmissionGrantType",
		    4,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_AddReconf_MAC_d_Flow object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_AddReconf_MAC_d_Flow object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_AddReconf_MAC_d_Flow
