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
 * Define the ASN1 Type UL_EDCH_Information_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_EDCH_Information_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_EDCH_Information_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_EDCH_Information_r6(Mac_es_e_resetIndicator mac_es_e_resetIndicator, 
		    E_DPCCH_Info e_DPCCH_Info, E_DPDCH_Info e_DPDCH_Info, 
		    E_DPDCH_SchedulingTransmConfiguration schedulingTransmConfiguration)
    {
	setMac_es_e_resetIndicator(mac_es_e_resetIndicator);
	setE_DPCCH_Info(e_DPCCH_Info);
	setE_DPDCH_Info(e_DPDCH_Info);
	setSchedulingTransmConfiguration(schedulingTransmConfiguration);
    }
    
    public void initComponents()
    {
	mComponents[0] = Mac_es_e_resetIndicator._true;
	mComponents[1] = new E_DPCCH_Info();
	mComponents[2] = new E_DPDCH_Info();
	mComponents[3] = new E_DPDCH_SchedulingTransmConfiguration();
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
		return Mac_es_e_resetIndicator._true;
	    case 1:
		return new E_DPCCH_Info();
	    case 2:
		return new E_DPDCH_Info();
	    case 3:
		return new E_DPDCH_SchedulingTransmConfiguration();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mac_es_e_resetIndicator"
    public Mac_es_e_resetIndicator getMac_es_e_resetIndicator()
    {
	return (Mac_es_e_resetIndicator)mComponents[0];
    }
    
    public void setMac_es_e_resetIndicator(Mac_es_e_resetIndicator mac_es_e_resetIndicator)
    {
	mComponents[0] = mac_es_e_resetIndicator;
    }
    
    public boolean hasMac_es_e_resetIndicator()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMac_es_e_resetIndicator()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Mac_es_e_resetIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Mac_es_e_resetIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Mac_es_e_resetIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected Mac_es_e_resetIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Mac_es_e_resetIndicator _true =
	    new Mac_es_e_resetIndicator(0);
	private final static Mac_es_e_resetIndicator cNamedNumbers[] = {
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
	
	public static Mac_es_e_resetIndicator valueOf(long value)
	{
	    return (Mac_es_e_resetIndicator)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UL_EDCH_Information_r6$Mac_es_e_resetIndicator"
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
	 * Get the type descriptor (TypeInfo) of 'this' Mac_es_e_resetIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mac_es_e_resetIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mac_es_e_resetIndicator

    // Methods for field "e_DPCCH_Info"
    public E_DPCCH_Info getE_DPCCH_Info()
    {
	return (E_DPCCH_Info)mComponents[1];
    }
    
    public void setE_DPCCH_Info(E_DPCCH_Info e_DPCCH_Info)
    {
	mComponents[1] = e_DPCCH_Info;
    }
    
    public boolean hasE_DPCCH_Info()
    {
	return componentIsPresent(1);
    }
    
    public void deleteE_DPCCH_Info()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "e_DPDCH_Info"
    public E_DPDCH_Info getE_DPDCH_Info()
    {
	return (E_DPDCH_Info)mComponents[2];
    }
    
    public void setE_DPDCH_Info(E_DPDCH_Info e_DPDCH_Info)
    {
	mComponents[2] = e_DPDCH_Info;
    }
    
    public boolean hasE_DPDCH_Info()
    {
	return componentIsPresent(2);
    }
    
    public void deleteE_DPDCH_Info()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "schedulingTransmConfiguration"
    public E_DPDCH_SchedulingTransmConfiguration getSchedulingTransmConfiguration()
    {
	return (E_DPDCH_SchedulingTransmConfiguration)mComponents[3];
    }
    
    public void setSchedulingTransmConfiguration(E_DPDCH_SchedulingTransmConfiguration schedulingTransmConfiguration)
    {
	mComponents[3] = schedulingTransmConfiguration;
    }
    
    public boolean hasSchedulingTransmConfiguration()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSchedulingTransmConfiguration()
    {
	setComponentAbsent(3);
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
	    "UL_EDCH_Information_r6"
	),
	new QName (
	    "InformationElements",
	    "UL-EDCH-Information-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_EDCH_Information_r6$Mac_es_e_resetIndicator"
			)
		    ),
		    "mac-es-e-resetIndicator",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DPCCH_Info"
			    ),
			    new QName (
				"InformationElements",
				"E-DPCCH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPCCH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPCCH_Info"
				)
			    ),
			    0
			)
		    ),
		    "e-DPCCH-Info",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DPDCH_Info"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPDCH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPDCH_Info"
				)
			    ),
			    0
			)
		    ),
		    "e-DPDCH-Info",
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
				"E_DPDCH_SchedulingTransmConfiguration"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-SchedulingTransmConfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPDCH_SchedulingTransmConfiguration"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPDCH_SchedulingTransmConfiguration"
				)
			    ),
			    0
			)
		    ),
		    "schedulingTransmConfiguration",
		    3,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' UL_EDCH_Information_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_EDCH_Information_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_EDCH_Information_r6
