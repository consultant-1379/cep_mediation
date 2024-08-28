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
 * Define the ASN1 Type UE_InternalMeasuredResults_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_InternalMeasuredResults_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_InternalMeasuredResults_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_InternalMeasuredResults_LCR_r4(UE_TransmittedPowerTDD_List ue_TransmittedPowerTDD_List, 
		    T_ADVinfo t_ADVinfo)
    {
	setUe_TransmittedPowerTDD_List(ue_TransmittedPowerTDD_List);
	setT_ADVinfo(t_ADVinfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_TransmittedPowerTDD_List();
	mComponents[1] = new T_ADVinfo();
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
		return new UE_TransmittedPowerTDD_List();
	    case 1:
		return new T_ADVinfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_TransmittedPowerTDD_List"
    public UE_TransmittedPowerTDD_List getUe_TransmittedPowerTDD_List()
    {
	return (UE_TransmittedPowerTDD_List)mComponents[0];
    }
    
    public void setUe_TransmittedPowerTDD_List(UE_TransmittedPowerTDD_List ue_TransmittedPowerTDD_List)
    {
	mComponents[0] = ue_TransmittedPowerTDD_List;
    }
    
    public boolean hasUe_TransmittedPowerTDD_List()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_TransmittedPowerTDD_List()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "t_ADVinfo"
    public T_ADVinfo getT_ADVinfo()
    {
	return (T_ADVinfo)mComponents[1];
    }
    
    public void setT_ADVinfo(T_ADVinfo t_ADVinfo)
    {
	mComponents[1] = t_ADVinfo;
    }
    
    public boolean hasT_ADVinfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteT_ADVinfo()
    {
	setComponentAbsent(1);
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
	    "UE_InternalMeasuredResults_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "UE-InternalMeasuredResults-LCR-r4"
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
				"UE_TransmittedPowerTDD_List"
			    ),
			    new QName (
				"InformationElements",
				"UE-TransmittedPowerTDD-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(14),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(14)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_TransmittedPower"
				)
			    )
			)
		    ),
		    "ue-TransmittedPowerTDD-List",
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
				"T_ADVinfo"
			    ),
			    new QName (
				"InformationElements",
				"T-ADVinfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "T_ADVinfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "T_ADVinfo"
				)
			    ),
			    0
			)
		    ),
		    "t-ADVinfo",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_InternalMeasuredResults_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_InternalMeasuredResults_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_InternalMeasuredResults_LCR_r4
