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
 * Define the ASN1 Type DL_TransportChannelType_r7 from ASN1 Module InformationElements.
 * @see Choice
 */

public class DL_TransportChannelType_r7 extends Choice {
    
    /**
     * The default constructor.
     */
    public DL_TransportChannelType_r7()
    {
    }
    
    public static final  int  dch_chosen = 1;
    public static final  int  fach_chosen = 2;
    public static final  int  dsch_chosen = 3;
    public static final  int  dch_and_dsch_chosen = 4;
    public static final  int  hsdsch_chosen = 5;
    public static final  int  dch_and_hsdsch_chosen = 6;
    
    // Methods for field "dch"
    public static DL_TransportChannelType_r7 createDL_TransportChannelType_r7WithDch(long dch)
    {
	return createDL_TransportChannelType_r7WithDch(new TransportChannelIdentity(dch));
    }
    
    public static DL_TransportChannelType_r7 createDL_TransportChannelType_r7WithDch(TransportChannelIdentity dch)
    {
	DL_TransportChannelType_r7 __object = new DL_TransportChannelType_r7();

	__object.setDch(dch);
	return __object;
    }
    
    public boolean hasDch()
    {
	return getChosenFlag() == dch_chosen;
    }
    
    public void setDch(long dch)
    {
	setDch(new TransportChannelIdentity(dch));
    }
    
    public void setDch(TransportChannelIdentity dch)
    {
	setChosenValue(dch);
	setChosenFlag(dch_chosen);
    }
    
    
    // Methods for field "fach"
    public static DL_TransportChannelType_r7 createDL_TransportChannelType_r7WithFach(Null fach)
    {
	DL_TransportChannelType_r7 __object = new DL_TransportChannelType_r7();

	__object.setFach(fach);
	return __object;
    }
    
    public boolean hasFach()
    {
	return getChosenFlag() == fach_chosen;
    }
    
    public void setFach(Null fach)
    {
	setChosenValue(fach);
	setChosenFlag(fach_chosen);
    }
    
    
    // Methods for field "dsch"
    public static DL_TransportChannelType_r7 createDL_TransportChannelType_r7WithDsch(long dsch)
    {
	return createDL_TransportChannelType_r7WithDsch(new TransportChannelIdentity(dsch));
    }
    
    public static DL_TransportChannelType_r7 createDL_TransportChannelType_r7WithDsch(TransportChannelIdentity dsch)
    {
	DL_TransportChannelType_r7 __object = new DL_TransportChannelType_r7();

	__object.setDsch(dsch);
	return __object;
    }
    
    public boolean hasDsch()
    {
	return getChosenFlag() == dsch_chosen;
    }
    
    public void setDsch(long dsch)
    {
	setDsch(new TransportChannelIdentity(dsch));
    }
    
    public void setDsch(TransportChannelIdentity dsch)
    {
	setChosenValue(dsch);
	setChosenFlag(dsch_chosen);
    }
    
    
    // Methods for field "dch_and_dsch"
    public static DL_TransportChannelType_r7 createDL_TransportChannelType_r7WithDch_and_dsch(TransportChannelIdentityDCHandDSCH dch_and_dsch)
    {
	DL_TransportChannelType_r7 __object = new DL_TransportChannelType_r7();

	__object.setDch_and_dsch(dch_and_dsch);
	return __object;
    }
    
    public boolean hasDch_and_dsch()
    {
	return getChosenFlag() == dch_and_dsch_chosen;
    }
    
    public void setDch_and_dsch(TransportChannelIdentityDCHandDSCH dch_and_dsch)
    {
	setChosenValue(dch_and_dsch);
	setChosenFlag(dch_and_dsch_chosen);
    }
    
    
    // Methods for field "hsdsch"
    public static DL_TransportChannelType_r7 createDL_TransportChannelType_r7WithHsdsch(Hsdsch hsdsch)
    {
	DL_TransportChannelType_r7 __object = new DL_TransportChannelType_r7();

	__object.setHsdsch(hsdsch);
	return __object;
    }
    
    public boolean hasHsdsch()
    {
	return getChosenFlag() == hsdsch_chosen;
    }
    
    public void setHsdsch(Hsdsch hsdsch)
    {
	setChosenValue(hsdsch);
	setChosenFlag(hsdsch_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Hsdsch from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Hsdsch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Hsdsch()
	{
	}
	
	public static final  int  mac_hs_chosen = 1;
	public static final  int  mac_ehs_chosen = 2;
	
	// Methods for field "mac_hs"
	public static Hsdsch createHsdschWithMac_hs(long mac_hs)
	{
	    return createHsdschWithMac_hs(new MAC_d_FlowIdentity(mac_hs));
	}
	
	public static Hsdsch createHsdschWithMac_hs(MAC_d_FlowIdentity mac_hs)
	{
	    Hsdsch __object = new Hsdsch();

	    __object.setMac_hs(mac_hs);
	    return __object;
	}
	
	public boolean hasMac_hs()
	{
	    return getChosenFlag() == mac_hs_chosen;
	}
	
	public void setMac_hs(long mac_hs)
	{
	    setMac_hs(new MAC_d_FlowIdentity(mac_hs));
	}
	
	public void setMac_hs(MAC_d_FlowIdentity mac_hs)
	{
	    setChosenValue(mac_hs);
	    setChosenFlag(mac_hs_chosen);
	}
	
	
	// Methods for field "mac_ehs"
	public static Hsdsch createHsdschWithMac_ehs(long mac_ehs)
	{
	    return createHsdschWithMac_ehs(new MAC_ehs_QueueId(mac_ehs));
	}
	
	public static Hsdsch createHsdschWithMac_ehs(MAC_ehs_QueueId mac_ehs)
	{
	    Hsdsch __object = new Hsdsch();

	    __object.setMac_ehs(mac_ehs);
	    return __object;
	}
	
	public boolean hasMac_ehs()
	{
	    return getChosenFlag() == mac_ehs_chosen;
	}
	
	public void setMac_ehs(long mac_ehs)
	{
	    setMac_ehs(new MAC_ehs_QueueId(mac_ehs));
	}
	
	public void setMac_ehs(MAC_ehs_QueueId mac_ehs)
	{
	    setChosenValue(mac_ehs);
	    setChosenFlag(mac_ehs_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case mac_hs_chosen:
		    return new MAC_d_FlowIdentity();
		case mac_ehs_chosen:
		    return new MAC_ehs_QueueId();
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
		"DL_TransportChannelType_r7$Hsdsch"
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
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MAC_d_FlowIdentity"
				),
				new QName (
				    "InformationElements",
				    "MAC-d-FlowIdentity"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new MAC_d_FlowIdentity(0), 
					new MAC_d_FlowIdentity(7),
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
			"mac-hs",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MAC_ehs_QueueId"
				),
				new QName (
				    "InformationElements",
				    "MAC-ehs-QueueId"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new MAC_ehs_QueueId(0), 
					new MAC_ehs_QueueId(7),
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
			"mac-ehs",
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
	 * Get the type descriptor (TypeInfo) of 'this' Hsdsch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Hsdsch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Hsdsch

    // Methods for field "dch_and_hsdsch"
    public static DL_TransportChannelType_r7 createDL_TransportChannelType_r7WithDch_and_hsdsch(Dch_and_hsdsch dch_and_hsdsch)
    {
	DL_TransportChannelType_r7 __object = new DL_TransportChannelType_r7();

	__object.setDch_and_hsdsch(dch_and_hsdsch);
	return __object;
    }
    
    public boolean hasDch_and_hsdsch()
    {
	return getChosenFlag() == dch_and_hsdsch_chosen;
    }
    
    public void setDch_and_hsdsch(Dch_and_hsdsch dch_and_hsdsch)
    {
	setChosenValue(dch_and_hsdsch);
	setChosenFlag(dch_and_hsdsch_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Dch_and_hsdsch from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Dch_and_hsdsch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Dch_and_hsdsch()
	{
	}
	
	public static final  int  mac_hs_chosen = 1;
	public static final  int  mac_ehs_chosen = 2;
	
	// Methods for field "mac_hs"
	public static Dch_and_hsdsch createDch_and_hsdschWithMac_hs(MAC_d_FlowIdentityDCHandHSDSCH mac_hs)
	{
	    Dch_and_hsdsch __object = new Dch_and_hsdsch();

	    __object.setMac_hs(mac_hs);
	    return __object;
	}
	
	public boolean hasMac_hs()
	{
	    return getChosenFlag() == mac_hs_chosen;
	}
	
	public void setMac_hs(MAC_d_FlowIdentityDCHandHSDSCH mac_hs)
	{
	    setChosenValue(mac_hs);
	    setChosenFlag(mac_hs_chosen);
	}
	
	
	// Methods for field "mac_ehs"
	public static Dch_and_hsdsch createDch_and_hsdschWithMac_ehs(MAC_ehs_QueueIdDCHandHSDSCH mac_ehs)
	{
	    Dch_and_hsdsch __object = new Dch_and_hsdsch();

	    __object.setMac_ehs(mac_ehs);
	    return __object;
	}
	
	public boolean hasMac_ehs()
	{
	    return getChosenFlag() == mac_ehs_chosen;
	}
	
	public void setMac_ehs(MAC_ehs_QueueIdDCHandHSDSCH mac_ehs)
	{
	    setChosenValue(mac_ehs);
	    setChosenFlag(mac_ehs_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case mac_hs_chosen:
		    return new MAC_d_FlowIdentityDCHandHSDSCH();
		case mac_ehs_chosen:
		    return new MAC_ehs_QueueIdDCHandHSDSCH();
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
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_TransportChannelType_r7$Dch_and_hsdsch"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MAC_d_FlowIdentityDCHandHSDSCH"
				),
				new QName (
				    "InformationElements",
				    "MAC-d-FlowIdentityDCHandHSDSCH"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MAC_d_FlowIdentityDCHandHSDSCH"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MAC_d_FlowIdentityDCHandHSDSCH"
				    )
				),
				0
			    )
			),
			"mac-hs",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MAC_ehs_QueueIdDCHandHSDSCH"
				),
				new QName (
				    "InformationElements",
				    "MAC-ehs-QueueIdDCHandHSDSCH"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MAC_ehs_QueueIdDCHandHSDSCH"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MAC_ehs_QueueIdDCHandHSDSCH"
				    )
				),
				0
			    )
			),
			"mac-ehs",
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
	 * Get the type descriptor (TypeInfo) of 'this' Dch_and_hsdsch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dch_and_hsdsch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dch_and_hsdsch

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case dch_chosen:
		return new TransportChannelIdentity();
	    case fach_chosen:
		return new Null();
	    case dsch_chosen:
		return new TransportChannelIdentity();
	    case dch_and_dsch_chosen:
		return new TransportChannelIdentityDCHandDSCH();
	    case hsdsch_chosen:
		return new Hsdsch();
	    case dch_and_hsdsch_chosen:
		return new Dch_and_hsdsch();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "DL_TransportChannelType_r7"
	),
	new QName (
	    "InformationElements",
	    "DL-TransportChannelType-r7"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransportChannelIdentity(1), 
				    new TransportChannelIdentity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "dch",
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
		    "fach",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransportChannelIdentity(1), 
				    new TransportChannelIdentity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "dsch",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportChannelIdentityDCHandDSCH"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentityDCHandDSCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TransportChannelIdentityDCHandDSCH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TransportChannelIdentityDCHandDSCH"
				)
			    ),
			    0
			)
		    ),
		    "dch-and-dsch",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_TransportChannelType_r7$Hsdsch"
			)
		    ),
		    "hsdsch",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_TransportChannelType_r7$Dch_and_hsdsch"
			)
		    ),
		    "dch-and-hsdsch",
		    5,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_TransportChannelType_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_TransportChannelType_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_TransportChannelType_r7
