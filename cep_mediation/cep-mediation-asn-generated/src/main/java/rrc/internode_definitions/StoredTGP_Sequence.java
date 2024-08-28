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
 * Define the ASN1 Type StoredTGP_Sequence from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class StoredTGP_Sequence extends Sequence {
    
    /**
     * The default constructor.
     */
    public StoredTGP_Sequence()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public StoredTGP_Sequence(rrc.informationelements.TGPSI tgpsi, 
		    Current_tgps_Status current_tgps_Status, 
		    rrc.informationelements.TGPS_ConfigurationParams tgps_ConfigurationParams)
    {
	setTgpsi(tgpsi);
	setCurrent_tgps_Status(current_tgps_Status);
	setTgps_ConfigurationParams(tgps_ConfigurationParams);
    }
    
    /**
     * Construct with required components.
     */
    public StoredTGP_Sequence(rrc.informationelements.TGPSI tgpsi, 
		    Current_tgps_Status current_tgps_Status)
    {
	setTgpsi(tgpsi);
	setCurrent_tgps_Status(current_tgps_Status);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.TGPSI();
	mComponents[1] = new Current_tgps_Status();
	mComponents[2] = new rrc.informationelements.TGPS_ConfigurationParams();
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
		return new rrc.informationelements.TGPSI();
	    case 1:
		return new Current_tgps_Status();
	    case 2:
		return new rrc.informationelements.TGPS_ConfigurationParams();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tgpsi"
    public rrc.informationelements.TGPSI getTgpsi()
    {
	return (rrc.informationelements.TGPSI)mComponents[0];
    }
    
    public void setTgpsi(rrc.informationelements.TGPSI tgpsi)
    {
	mComponents[0] = tgpsi;
    }
    
    
    // Methods for field "current_tgps_Status"
    public Current_tgps_Status getCurrent_tgps_Status()
    {
	return (Current_tgps_Status)mComponents[1];
    }
    
    public void setCurrent_tgps_Status(Current_tgps_Status current_tgps_Status)
    {
	mComponents[1] = current_tgps_Status;
    }
    
    
    
    /**
     * Define the ASN1 Type Current_tgps_Status from ASN1 Module Internode_definitions.
     * @see Choice
     */
    public static class Current_tgps_Status extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Current_tgps_Status()
	{
	}
	
	public static final  int  active_chosen = 1;
	public static final  int  inactive_chosen = 2;
	
	// Methods for field "active"
	public static Current_tgps_Status createCurrent_tgps_StatusWithActive(Active active)
	{
	    Current_tgps_Status __object = new Current_tgps_Status();

	    __object.setActive(active);
	    return __object;
	}
	
	public boolean hasActive()
	{
	    return getChosenFlag() == active_chosen;
	}
	
	public void setActive(Active active)
	{
	    setChosenValue(active);
	    setChosenFlag(active_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Active from ASN1 Module Internode_definitions.
	 * @see Sequence
	 */
	public static class Active extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Active()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Active(rrc.informationelements.TGCFN tgcfn)
	    {
		setTgcfn(tgcfn);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.TGCFN();
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
			return new rrc.informationelements.TGCFN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "tgcfn"
	    public rrc.informationelements.TGCFN getTgcfn()
	    {
		return (rrc.informationelements.TGCFN)mComponents[0];
	    }
	    
	    public void setTgcfn(rrc.informationelements.TGCFN tgcfn)
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
		    "rrc.internode_definitions",
		    "StoredTGP_Sequence$Current_tgps_Status$Active"
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
					    new rrc.informationelements.TGCFN(0), 
					    new rrc.informationelements.TGCFN(255),
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
	     * Get the type descriptor (TypeInfo) of 'this' Active object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Active object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Active

	// Methods for field "inactive"
	public static Current_tgps_Status createCurrent_tgps_StatusWithInactive(Null inactive)
	{
	    Current_tgps_Status __object = new Current_tgps_Status();

	    __object.setInactive(inactive);
	    return __object;
	}
	
	public boolean hasInactive()
	{
	    return getChosenFlag() == inactive_chosen;
	}
	
	public void setInactive(Null inactive)
	{
	    setChosenValue(inactive);
	    setChosenFlag(inactive_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case active_chosen:
		    return new Active();
		case inactive_chosen:
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
		"rrc.internode_definitions",
		"StoredTGP_Sequence$Current_tgps_Status"
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
				"rrc.internode_definitions",
				"StoredTGP_Sequence$Current_tgps_Status$Active"
			    )
			),
			"active",
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
			"inactive",
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
	 * Get the type descriptor (TypeInfo) of 'this' Current_tgps_Status object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Current_tgps_Status object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Current_tgps_Status

    // Methods for field "tgps_ConfigurationParams"
    public rrc.informationelements.TGPS_ConfigurationParams getTgps_ConfigurationParams()
    {
	return (rrc.informationelements.TGPS_ConfigurationParams)mComponents[2];
    }
    
    public void setTgps_ConfigurationParams(rrc.informationelements.TGPS_ConfigurationParams tgps_ConfigurationParams)
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
	    "rrc.internode_definitions",
	    "StoredTGP_Sequence"
	),
	new QName (
	    "Internode-definitions",
	    "StoredTGP-Sequence"
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
				    new rrc.informationelements.TGPSI(1), 
				    new rrc.informationelements.TGPSI(6),
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
			    "rrc.internode_definitions",
			    "StoredTGP_Sequence$Current_tgps_Status"
			)
		    ),
		    "current-tgps-Status",
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
     * Get the type descriptor (TypeInfo) of 'this' StoredTGP_Sequence object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' StoredTGP_Sequence object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for StoredTGP_Sequence
