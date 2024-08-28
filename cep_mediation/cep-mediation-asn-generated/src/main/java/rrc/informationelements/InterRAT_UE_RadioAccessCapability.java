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
 * Define the ASN1 Type InterRAT_UE_RadioAccessCapability from ASN1 Module InformationElements.
 * @see Choice
 */

public class InterRAT_UE_RadioAccessCapability extends Choice {
    
    /**
     * The default constructor.
     */
    public InterRAT_UE_RadioAccessCapability()
    {
    }
    
    public static final  int  gsm_chosen = 1;
    public static final  int  cdma2000_chosen = 2;
    
    // Methods for field "gsm"
    public static InterRAT_UE_RadioAccessCapability createInterRAT_UE_RadioAccessCapabilityWithGsm(Gsm gsm)
    {
	InterRAT_UE_RadioAccessCapability __object = new InterRAT_UE_RadioAccessCapability();

	__object.setGsm(gsm);
	return __object;
    }
    
    public boolean hasGsm()
    {
	return getChosenFlag() == gsm_chosen;
    }
    
    public void setGsm(Gsm gsm)
    {
	setChosenValue(gsm);
	setChosenFlag(gsm_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Gsm from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Gsm extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Gsm()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Gsm(GSM_Classmark2 gsm_Classmark2, 
			GSM_Classmark3 gsm_Classmark3)
	{
	    setGsm_Classmark2(gsm_Classmark2);
	    setGsm_Classmark3(gsm_Classmark3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new GSM_Classmark2();
	    mComponents[1] = new GSM_Classmark3();
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
		    return new GSM_Classmark2();
		case 1:
		    return new GSM_Classmark3();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "gsm_Classmark2"
	public GSM_Classmark2 getGsm_Classmark2()
	{
	    return (GSM_Classmark2)mComponents[0];
	}
	
	public void setGsm_Classmark2(GSM_Classmark2 gsm_Classmark2)
	{
	    mComponents[0] = gsm_Classmark2;
	}
	
	
	// Methods for field "gsm_Classmark3"
	public GSM_Classmark3 getGsm_Classmark3()
	{
	    return (GSM_Classmark3)mComponents[1];
	}
	
	public void setGsm_Classmark3(GSM_Classmark3 gsm_Classmark3)
	{
	    mComponents[1] = gsm_Classmark3;
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
		"InterRAT_UE_RadioAccessCapability$Gsm"
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
			    new VectorInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "GSM_Classmark2"
				),
				new QName (
				    "InformationElements",
				    "GSM-Classmark2"
				),
				12314,
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(5)
				    )
				),
				new Bounds (
				    new java.lang.Long(5),
				    new java.lang.Long(5)
				)
			    )
			),
			"gsm-Classmark2",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new VectorInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "GSM_Classmark3"
				),
				new QName (
				    "InformationElements",
				    "GSM-Classmark3"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(32),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				)
			    )
			),
			"gsm-Classmark3",
			1,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Gsm object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Gsm object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Gsm

    // Methods for field "cdma2000"
    public static InterRAT_UE_RadioAccessCapability createInterRAT_UE_RadioAccessCapabilityWithCdma2000(Cdma2000 cdma2000)
    {
	InterRAT_UE_RadioAccessCapability __object = new InterRAT_UE_RadioAccessCapability();

	__object.setCdma2000(cdma2000);
	return __object;
    }
    
    public boolean hasCdma2000()
    {
	return getChosenFlag() == cdma2000_chosen;
    }
    
    public void setCdma2000(Cdma2000 cdma2000)
    {
	setChosenValue(cdma2000);
	setChosenFlag(cdma2000_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Cdma2000 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Cdma2000 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Cdma2000()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Cdma2000(CDMA2000_MessageList cdma2000_MessageList)
	{
	    setCdma2000_MessageList(cdma2000_MessageList);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new CDMA2000_MessageList();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[1];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new CDMA2000_MessageList();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "cdma2000_MessageList"
	public CDMA2000_MessageList getCdma2000_MessageList()
	{
	    return (CDMA2000_MessageList)mComponents[0];
	}
	
	public void setCdma2000_MessageList(CDMA2000_MessageList cdma2000_MessageList)
	{
	    mComponents[0] = cdma2000_MessageList;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"InterRAT_UE_RadioAccessCapability$Cdma2000"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "CDMA2000_MessageList"
				),
				new QName (
				    "InformationElements",
				    "CDMA2000-MessageList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(4),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(4)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"CDMA2000_Message"
				    )
				)
			    )
			),
			"cdma2000-MessageList",
			0,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Cdma2000 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Cdma2000 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Cdma2000

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case gsm_chosen:
		return new Gsm();
	    case cdma2000_chosen:
		return new Cdma2000();
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
	    "InterRAT_UE_RadioAccessCapability"
	),
	new QName (
	    "InformationElements",
	    "InterRAT-UE-RadioAccessCapability"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "InterRAT_UE_RadioAccessCapability$Gsm"
			)
		    ),
		    "gsm",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "InterRAT_UE_RadioAccessCapability$Cdma2000"
			)
		    ),
		    "cdma2000",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRAT_UE_RadioAccessCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRAT_UE_RadioAccessCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRAT_UE_RadioAccessCapability
