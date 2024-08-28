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
 * Define the ASN1 Type TGP_Sequence from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TGP_Sequence extends Sequence {
    
    /**
     * The default constructor.
     */
    public TGP_Sequence()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TGP_Sequence(TGPSI tgpsi, Tgps_Status tgps_Status, 
		    TGPS_ConfigurationParams tgps_ConfigurationParams)
    {
	setTgpsi(tgpsi);
	setTgps_Status(tgps_Status);
	setTgps_ConfigurationParams(tgps_ConfigurationParams);
    }
    
    /**
     * Construct with required components.
     */
    public TGP_Sequence(TGPSI tgpsi, Tgps_Status tgps_Status)
    {
	setTgpsi(tgpsi);
	setTgps_Status(tgps_Status);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TGPSI();
	mComponents[1] = new Tgps_Status();
	mComponents[2] = new TGPS_ConfigurationParams();
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
		return new TGPSI();
	    case 1:
		return new Tgps_Status();
	    case 2:
		return new TGPS_ConfigurationParams();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tgpsi"
    public TGPSI getTgpsi()
    {
	return (TGPSI)mComponents[0];
    }
    
    public void setTgpsi(TGPSI tgpsi)
    {
	mComponents[0] = tgpsi;
    }
    
    
    // Methods for field "tgps_Status"
    public Tgps_Status getTgps_Status()
    {
	return (Tgps_Status)mComponents[1];
    }
    
    public void setTgps_Status(Tgps_Status tgps_Status)
    {
	mComponents[1] = tgps_Status;
    }
    
    
    
    /**
     * Define the ASN1 Type Tgps_Status from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tgps_Status extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tgps_Status()
	{
	}
	
	public static final  int  activate_chosen = 1;
	public static final  int  deactivate_chosen = 2;
	
	// Methods for field "activate"
	public static Tgps_Status createTgps_StatusWithActivate(Activate activate)
	{
	    Tgps_Status __object = new Tgps_Status();

	    __object.setActivate(activate);
	    return __object;
	}
	
	public boolean hasActivate()
	{
	    return getChosenFlag() == activate_chosen;
	}
	
	public void setActivate(Activate activate)
	{
	    setChosenValue(activate);
	    setChosenFlag(activate_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Activate from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Activate extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Activate()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Activate(TGCFN tgcfn)
	    {
		setTgcfn(tgcfn);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new TGCFN();
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
			return new TGCFN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "tgcfn"
	    public TGCFN getTgcfn()
	    {
		return (TGCFN)mComponents[0];
	    }
	    
	    public void setTgcfn(TGCFN tgcfn)
	    {
		mComponents[0] = tgcfn;
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
		    "TGP_Sequence$Tgps_Status$Activate"
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
					"rrc.informationelements",
					"TGCFN"
				    ),
				    new QName (
					"InformationElements",
					"TGCFN"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new TGCFN(0), 
					    new TGCFN(255),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(255)
				    ),
				    null
				)
			    ),
			    "tgcfn",
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
	     * Get the type descriptor (TypeInfo) of 'this' Activate object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Activate object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Activate

	// Methods for field "deactivate"
	public static Tgps_Status createTgps_StatusWithDeactivate(Null deactivate)
	{
	    Tgps_Status __object = new Tgps_Status();

	    __object.setDeactivate(deactivate);
	    return __object;
	}
	
	public boolean hasDeactivate()
	{
	    return getChosenFlag() == deactivate_chosen;
	}
	
	public void setDeactivate(Null deactivate)
	{
	    setChosenValue(deactivate);
	    setChosenFlag(deactivate_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case activate_chosen:
		    return new Activate();
		case deactivate_chosen:
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"TGP_Sequence$Tgps_Status"
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
				"TGP_Sequence$Tgps_Status$Activate"
			    )
			),
			"activate",
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
			"deactivate",
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
	 * Get the type descriptor (TypeInfo) of 'this' Tgps_Status object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tgps_Status object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tgps_Status

    // Methods for field "tgps_ConfigurationParams"
    public TGPS_ConfigurationParams getTgps_ConfigurationParams()
    {
	return (TGPS_ConfigurationParams)mComponents[2];
    }
    
    public void setTgps_ConfigurationParams(TGPS_ConfigurationParams tgps_ConfigurationParams)
    {
	mComponents[2] = tgps_ConfigurationParams;
    }
    
    public boolean hasTgps_ConfigurationParams()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTgps_ConfigurationParams()
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
	    "TGP_Sequence"
	),
	new QName (
	    "InformationElements",
	    "TGP-Sequence"
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
				"TGPSI"
			    ),
			    new QName (
				"InformationElements",
				"TGPSI"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TGPSI(1), 
				    new TGPSI(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "tgpsi",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "TGP_Sequence$Tgps_Status"
			)
		    ),
		    "tgps-Status",
		    1,
		    2,
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
				"TGPS_ConfigurationParams"
			    ),
			    new QName (
				"InformationElements",
				"TGPS-ConfigurationParams"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TGPS_ConfigurationParams"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TGPS_ConfigurationParams"
				)
			    ),
			    0
			)
		    ),
		    "tgps-ConfigurationParams",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TGP_Sequence object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TGP_Sequence object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TGP_Sequence
