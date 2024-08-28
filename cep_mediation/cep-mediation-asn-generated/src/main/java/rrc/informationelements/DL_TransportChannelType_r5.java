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
 * Define the ASN1 Type DL_TransportChannelType_r5 from ASN1 Module InformationElements.
 * @see Choice
 */

public class DL_TransportChannelType_r5 extends Choice {
    
    /**
     * The default constructor.
     */
    public DL_TransportChannelType_r5()
    {
    }
    
    public static final  int  dch_chosen = 1;
    public static final  int  fach_chosen = 2;
    public static final  int  dsch_chosen = 3;
    public static final  int  dch_and_dsch_chosen = 4;
    public static final  int  hsdsch_chosen = 5;
    public static final  int  dch_and_hsdsch_chosen = 6;
    
    // Methods for field "dch"
    public static DL_TransportChannelType_r5 createDL_TransportChannelType_r5WithDch(long dch)
    {
	return createDL_TransportChannelType_r5WithDch(new TransportChannelIdentity(dch));
    }
    
    public static DL_TransportChannelType_r5 createDL_TransportChannelType_r5WithDch(TransportChannelIdentity dch)
    {
	DL_TransportChannelType_r5 __object = new DL_TransportChannelType_r5();

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
    public static DL_TransportChannelType_r5 createDL_TransportChannelType_r5WithFach(Null fach)
    {
	DL_TransportChannelType_r5 __object = new DL_TransportChannelType_r5();

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
    public static DL_TransportChannelType_r5 createDL_TransportChannelType_r5WithDsch(long dsch)
    {
	return createDL_TransportChannelType_r5WithDsch(new TransportChannelIdentity(dsch));
    }
    
    public static DL_TransportChannelType_r5 createDL_TransportChannelType_r5WithDsch(TransportChannelIdentity dsch)
    {
	DL_TransportChannelType_r5 __object = new DL_TransportChannelType_r5();

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
    public static DL_TransportChannelType_r5 createDL_TransportChannelType_r5WithDch_and_dsch(TransportChannelIdentityDCHandDSCH dch_and_dsch)
    {
	DL_TransportChannelType_r5 __object = new DL_TransportChannelType_r5();

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
    public static DL_TransportChannelType_r5 createDL_TransportChannelType_r5WithHsdsch(long hsdsch)
    {
	return createDL_TransportChannelType_r5WithHsdsch(new MAC_d_FlowIdentity(hsdsch));
    }
    
    public static DL_TransportChannelType_r5 createDL_TransportChannelType_r5WithHsdsch(MAC_d_FlowIdentity hsdsch)
    {
	DL_TransportChannelType_r5 __object = new DL_TransportChannelType_r5();

	__object.setHsdsch(hsdsch);
	return __object;
    }
    
    public boolean hasHsdsch()
    {
	return getChosenFlag() == hsdsch_chosen;
    }
    
    public void setHsdsch(long hsdsch)
    {
	setHsdsch(new MAC_d_FlowIdentity(hsdsch));
    }
    
    public void setHsdsch(MAC_d_FlowIdentity hsdsch)
    {
	setChosenValue(hsdsch);
	setChosenFlag(hsdsch_chosen);
    }
    
    
    // Methods for field "dch_and_hsdsch"
    public static DL_TransportChannelType_r5 createDL_TransportChannelType_r5WithDch_and_hsdsch(MAC_d_FlowIdentityDCHandHSDSCH dch_and_hsdsch)
    {
	DL_TransportChannelType_r5 __object = new DL_TransportChannelType_r5();

	__object.setDch_and_hsdsch(dch_and_hsdsch);
	return __object;
    }
    
    public boolean hasDch_and_hsdsch()
    {
	return getChosenFlag() == dch_and_hsdsch_chosen;
    }
    
    public void setDch_and_hsdsch(MAC_d_FlowIdentityDCHandHSDSCH dch_and_hsdsch)
    {
	setChosenValue(dch_and_hsdsch);
	setChosenFlag(dch_and_hsdsch_chosen);
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
	    case hsdsch_chosen:
		return new MAC_d_FlowIdentity();
	    case dch_and_hsdsch_chosen:
		return new MAC_d_FlowIdentityDCHandHSDSCH();
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
	    "DL_TransportChannelType_r5"
	),
	new QName (
	    "InformationElements",
	    "DL-TransportChannelType-r5"
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "hsdsch",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
     * Get the type descriptor (TypeInfo) of 'this' DL_TransportChannelType_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_TransportChannelType_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_TransportChannelType_r5
