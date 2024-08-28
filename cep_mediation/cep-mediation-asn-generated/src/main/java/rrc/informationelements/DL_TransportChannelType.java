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
 * Define the ASN1 Type DL_TransportChannelType from ASN1 Module InformationElements.
 * @see Choice
 */

public class DL_TransportChannelType extends Choice {
    
    /**
     * The default constructor.
     */
    public DL_TransportChannelType()
    {
    }
    
    public static final  int  dch_chosen = 1;
    public static final  int  fach_chosen = 2;
    public static final  int  dsch_chosen = 3;
    public static final  int  dch_and_dsch_chosen = 4;
    
    // Methods for field "dch"
    public static DL_TransportChannelType createDL_TransportChannelTypeWithDch(long dch)
    {
	return createDL_TransportChannelTypeWithDch(new TransportChannelIdentity(dch));
    }
    
    public static DL_TransportChannelType createDL_TransportChannelTypeWithDch(TransportChannelIdentity dch)
    {
	DL_TransportChannelType __object = new DL_TransportChannelType();

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
    public static DL_TransportChannelType createDL_TransportChannelTypeWithFach(Null fach)
    {
	DL_TransportChannelType __object = new DL_TransportChannelType();

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
    public static DL_TransportChannelType createDL_TransportChannelTypeWithDsch(long dsch)
    {
	return createDL_TransportChannelTypeWithDsch(new TransportChannelIdentity(dsch));
    }
    
    public static DL_TransportChannelType createDL_TransportChannelTypeWithDsch(TransportChannelIdentity dsch)
    {
	DL_TransportChannelType __object = new DL_TransportChannelType();

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
    public static DL_TransportChannelType createDL_TransportChannelTypeWithDch_and_dsch(TransportChannelIdentityDCHandDSCH dch_and_dsch)
    {
	DL_TransportChannelType __object = new DL_TransportChannelType();

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
	    "DL_TransportChannelType"
	),
	new QName (
	    "InformationElements",
	    "DL-TransportChannelType"
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
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_TransportChannelType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_TransportChannelType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_TransportChannelType
