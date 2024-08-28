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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type CellUpdateConfirm_v860ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellUpdateConfirm_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellUpdateConfirm_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellUpdateConfirm_v860ext_IEs(Rab_InformationSetup rab_InformationSetup)
    {
	setRab_InformationSetup(rab_InformationSetup);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Rab_InformationSetup();
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
		return new Rab_InformationSetup();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rab_InformationSetup"
    public Rab_InformationSetup getRab_InformationSetup()
    {
	return (Rab_InformationSetup)mComponents[0];
    }
    
    public void setRab_InformationSetup(Rab_InformationSetup rab_InformationSetup)
    {
	mComponents[0] = rab_InformationSetup;
    }
    
    public boolean hasRab_InformationSetup()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRab_InformationSetup()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Rab_InformationSetup from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class Rab_InformationSetup extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Rab_InformationSetup()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Rab_InformationSetup(rrc.informationelements.RAB_InformationSetup_r7 rab_InformationSetup_r7, 
			rrc.informationelements.RAB_InformationSetup_v820ext rab_InformationSetup_v820ext)
	{
	    setRab_InformationSetup_r7(rab_InformationSetup_r7);
	    setRab_InformationSetup_v820ext(rab_InformationSetup_v820ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new rrc.informationelements.RAB_InformationSetup_r7();
	    mComponents[1] = new rrc.informationelements.RAB_InformationSetup_v820ext();
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
		    return new rrc.informationelements.RAB_InformationSetup_r7();
		case 1:
		    return new rrc.informationelements.RAB_InformationSetup_v820ext();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "rab_InformationSetup_r7"
	public rrc.informationelements.RAB_InformationSetup_r7 getRab_InformationSetup_r7()
	{
	    return (rrc.informationelements.RAB_InformationSetup_r7)mComponents[0];
	}
	
	public void setRab_InformationSetup_r7(rrc.informationelements.RAB_InformationSetup_r7 rab_InformationSetup_r7)
	{
	    mComponents[0] = rab_InformationSetup_r7;
	}
	
	
	// Methods for field "rab_InformationSetup_v820ext"
	public rrc.informationelements.RAB_InformationSetup_v820ext getRab_InformationSetup_v820ext()
	{
	    return (rrc.informationelements.RAB_InformationSetup_v820ext)mComponents[1];
	}
	
	public void setRab_InformationSetup_v820ext(rrc.informationelements.RAB_InformationSetup_v820ext rab_InformationSetup_v820ext)
	{
	    mComponents[1] = rab_InformationSetup_v820ext;
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
		"rrc.pdu_definitions",
		"CellUpdateConfirm_v860ext_IEs$Rab_InformationSetup"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "RAB_InformationSetup_r7"
				),
				new QName (
				    "InformationElements",
				    "RAB-InformationSetup-r7"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"RAB_InformationSetup_r7"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"RAB_InformationSetup_r7"
				    )
				),
				0
			    )
			),
			"rab-InformationSetup-r7",
			0,
			2,
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
				    "RAB_InformationSetup_v820ext"
				),
				new QName (
				    "InformationElements",
				    "RAB-InformationSetup-v820ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"RAB_InformationSetup_v820ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"RAB_InformationSetup_v820ext"
				    )
				),
				0
			    )
			),
			"rab-InformationSetup-v820ext",
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
	 * Get the type descriptor (TypeInfo) of 'this' Rab_InformationSetup object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Rab_InformationSetup object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Rab_InformationSetup

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
	    "rrc.pdu_definitions",
	    "CellUpdateConfirm_v860ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdateConfirm-v860ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdateConfirm_v860ext_IEs$Rab_InformationSetup"
			)
		    ),
		    "rab-InformationSetup",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellUpdateConfirm_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdateConfirm_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdateConfirm_v860ext_IEs
