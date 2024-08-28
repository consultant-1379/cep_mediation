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
 * Define the ASN1 Type RadioBearerReconfiguration_v6f0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RadioBearerReconfiguration_v6f0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RadioBearerReconfiguration_v6f0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RadioBearerReconfiguration_v6f0ext_IEs(SpecificationMode specificationMode)
    {
	setSpecificationMode(specificationMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SpecificationMode();
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
		return new SpecificationMode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "specificationMode"
    public SpecificationMode getSpecificationMode()
    {
	return (SpecificationMode)mComponents[0];
    }
    
    public void setSpecificationMode(SpecificationMode specificationMode)
    {
	mComponents[0] = specificationMode;
    }
    
    
    
    /**
     * Define the ASN1 Type SpecificationMode from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class SpecificationMode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public SpecificationMode()
	{
	}
	
	public static final  int  complete_chosen = 1;
	
	// Methods for field "complete"
	public static SpecificationMode createSpecificationModeWithComplete(Complete complete)
	{
	    SpecificationMode __object = new SpecificationMode();

	    __object.setComplete(complete);
	    return __object;
	}
	
	public boolean hasComplete()
	{
	    return getChosenFlag() == complete_chosen;
	}
	
	public void setComplete(Complete complete)
	{
	    setChosenValue(complete);
	    setChosenFlag(complete_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Complete from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Complete extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Complete()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Complete(rrc.informationelements.RAB_InformationMBMSPtpList rab_InformationMBMSPtpList)
	    {
		setRab_InformationMBMSPtpList(rab_InformationMBMSPtpList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.RAB_InformationMBMSPtpList();
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
			return new rrc.informationelements.RAB_InformationMBMSPtpList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "rab_InformationMBMSPtpList"
	    public rrc.informationelements.RAB_InformationMBMSPtpList getRab_InformationMBMSPtpList()
	    {
		return (rrc.informationelements.RAB_InformationMBMSPtpList)mComponents[0];
	    }
	    
	    public void setRab_InformationMBMSPtpList(rrc.informationelements.RAB_InformationMBMSPtpList rab_InformationMBMSPtpList)
	    {
		mComponents[0] = rab_InformationMBMSPtpList;
	    }
	    
	    public boolean hasRab_InformationMBMSPtpList()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteRab_InformationMBMSPtpList()
	    {
		setComponentAbsent(0);
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
		    "RadioBearerReconfiguration_v6f0ext_IEs$SpecificationMode$Complete"
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
					"RAB_InformationMBMSPtpList"
				    ),
				    new QName (
					"InformationElements",
					"RAB-InformationMBMSPtpList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(8)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "RAB_InformationMBMSPtp"
					)
				    )
				)
			    ),
			    "rab-InformationMBMSPtpList",
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
	     * Get the type descriptor (TypeInfo) of 'this' Complete object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Complete object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Complete

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case complete_chosen:
		    return new Complete();
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RadioBearerReconfiguration_v6f0ext_IEs$SpecificationMode"
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
				"rrc.pdu_definitions",
				"RadioBearerReconfiguration_v6f0ext_IEs$SpecificationMode$Complete"
			    )
			),
			"complete",
			0,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SpecificationMode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SpecificationMode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SpecificationMode

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
	    "RadioBearerReconfiguration_v6f0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RadioBearerReconfiguration-v6f0ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RadioBearerReconfiguration_v6f0ext_IEs$SpecificationMode"
			)
		    ),
		    "specificationMode",
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
     * Get the type descriptor (TypeInfo) of 'this' RadioBearerReconfiguration_v6f0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioBearerReconfiguration_v6f0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioBearerReconfiguration_v6f0ext_IEs
