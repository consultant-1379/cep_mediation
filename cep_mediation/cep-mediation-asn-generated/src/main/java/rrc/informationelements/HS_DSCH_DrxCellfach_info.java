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
 * Define the ASN1 Type HS_DSCH_DrxCellfach_info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_DSCH_DrxCellfach_info extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_DSCH_DrxCellfach_info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_DSCH_DrxCellfach_info(T_321 t_321, 
		    HS_DSCH_DrxCycleFach hs_dsch_DrxCycleFach, 
		    HS_DSCH_DrxBurstFach hs_dsch_DrxBurstFach, 
		    BOOLEAN drxInterruption_hs_dsch)
    {
	setT_321(t_321);
	setHs_dsch_DrxCycleFach(hs_dsch_DrxCycleFach);
	setHs_dsch_DrxBurstFach(hs_dsch_DrxBurstFach);
	setDrxInterruption_hs_dsch(drxInterruption_hs_dsch);
    }
    
    /**
     * Construct with components.
     */
    public HS_DSCH_DrxCellfach_info(T_321 t_321, 
		    HS_DSCH_DrxCycleFach hs_dsch_DrxCycleFach, 
		    HS_DSCH_DrxBurstFach hs_dsch_DrxBurstFach, 
		    boolean drxInterruption_hs_dsch)
    {
	this(t_321, hs_dsch_DrxCycleFach, hs_dsch_DrxBurstFach, 
	     new BOOLEAN(drxInterruption_hs_dsch));
    }
    
    public void initComponents()
    {
	mComponents[0] = T_321.ms100;
	mComponents[1] = HS_DSCH_DrxCycleFach.f4;
	mComponents[2] = HS_DSCH_DrxBurstFach.f1;
	mComponents[3] = new BOOLEAN();
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
		return T_321.ms100;
	    case 1:
		return HS_DSCH_DrxCycleFach.f4;
	    case 2:
		return HS_DSCH_DrxBurstFach.f1;
	    case 3:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "t_321"
    public T_321 getT_321()
    {
	return (T_321)mComponents[0];
    }
    
    public void setT_321(T_321 t_321)
    {
	mComponents[0] = t_321;
    }
    
    
    // Methods for field "hs_dsch_DrxCycleFach"
    public HS_DSCH_DrxCycleFach getHs_dsch_DrxCycleFach()
    {
	return (HS_DSCH_DrxCycleFach)mComponents[1];
    }
    
    public void setHs_dsch_DrxCycleFach(HS_DSCH_DrxCycleFach hs_dsch_DrxCycleFach)
    {
	mComponents[1] = hs_dsch_DrxCycleFach;
    }
    
    
    // Methods for field "hs_dsch_DrxBurstFach"
    public HS_DSCH_DrxBurstFach getHs_dsch_DrxBurstFach()
    {
	return (HS_DSCH_DrxBurstFach)mComponents[2];
    }
    
    public void setHs_dsch_DrxBurstFach(HS_DSCH_DrxBurstFach hs_dsch_DrxBurstFach)
    {
	mComponents[2] = hs_dsch_DrxBurstFach;
    }
    
    
    // Methods for field "drxInterruption_hs_dsch"
    public boolean getDrxInterruption_hs_dsch()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setDrxInterruption_hs_dsch(boolean drxInterruption_hs_dsch)
    {
	setDrxInterruption_hs_dsch(new BOOLEAN(drxInterruption_hs_dsch));
    }
    
    public void setDrxInterruption_hs_dsch(BOOLEAN drxInterruption_hs_dsch)
    {
	mComponents[3] = drxInterruption_hs_dsch;
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
	    "HS_DSCH_DrxCellfach_info"
	),
	new QName (
	    "InformationElements",
	    "HS-DSCH-DrxCellfach-info"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_321"
			    ),
			    new QName (
				"InformationElements",
				"T-321"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms100",
					0
				    ),
				    new MemberListElement (
					"ms200",
					1
				    ),
				    new MemberListElement (
					"ms400",
					2
				    ),
				    new MemberListElement (
					"ms800",
					3
				    )
				}
			    ),
			    0,
			    T_321.ms100
			)
		    ),
		    "t-321",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HS_DSCH_DrxCycleFach"
			    ),
			    new QName (
				"InformationElements",
				"HS-DSCH-DrxCycleFach"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"f4",
					0
				    ),
				    new MemberListElement (
					"f8",
					1
				    ),
				    new MemberListElement (
					"f16",
					2
				    ),
				    new MemberListElement (
					"f32",
					3
				    )
				}
			    ),
			    0,
			    HS_DSCH_DrxCycleFach.f4
			)
		    ),
		    "hs-dsch-DrxCycleFach",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HS_DSCH_DrxBurstFach"
			    ),
			    new QName (
				"InformationElements",
				"HS-DSCH-DrxBurstFach"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"f1",
					0
				    ),
				    new MemberListElement (
					"f2",
					1
				    ),
				    new MemberListElement (
					"f4",
					2
				    ),
				    new MemberListElement (
					"f8",
					3
				    ),
				    new MemberListElement (
					"f16",
					4
				    ),
				    new MemberListElement (
					"spare3",
					5
				    ),
				    new MemberListElement (
					"spare2",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    HS_DSCH_DrxBurstFach.f1
			)
		    ),
		    "hs-dsch-DrxBurstFach",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "drxInterruption-hs-dsch",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' HS_DSCH_DrxCellfach_info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_DSCH_DrxCellfach_info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_DSCH_DrxCellfach_info
