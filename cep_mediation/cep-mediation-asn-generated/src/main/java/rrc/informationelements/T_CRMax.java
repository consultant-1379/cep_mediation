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
 * Define the ASN1 Type T_CRMax from ASN1 Module InformationElements.
 * @see Choice
 */

public class T_CRMax extends Choice {
    
    /**
     * The default constructor.
     */
    public T_CRMax()
    {
    }
    
    public static final  int  notUsed_chosen = 1;
    public static final  int  t30_chosen = 2;
    public static final  int  t60_chosen = 3;
    public static final  int  t120_chosen = 4;
    public static final  int  t180_chosen = 5;
    public static final  int  t240_chosen = 6;
    
    // Methods for field "notUsed"
    public static T_CRMax createT_CRMaxWithNotUsed(Null notUsed)
    {
	T_CRMax __object = new T_CRMax();

	__object.setNotUsed(notUsed);
	return __object;
    }
    
    public boolean hasNotUsed()
    {
	return getChosenFlag() == notUsed_chosen;
    }
    
    public void setNotUsed(Null notUsed)
    {
	setChosenValue(notUsed);
	setChosenFlag(notUsed_chosen);
    }
    
    
    // Methods for field "t30"
    public static T_CRMax createT_CRMaxWithT30(N_CR_T_CRMaxHyst t30)
    {
	T_CRMax __object = new T_CRMax();

	__object.setT30(t30);
	return __object;
    }
    
    public boolean hasT30()
    {
	return getChosenFlag() == t30_chosen;
    }
    
    public void setT30(N_CR_T_CRMaxHyst t30)
    {
	setChosenValue(t30);
	setChosenFlag(t30_chosen);
    }
    
    
    // Methods for field "t60"
    public static T_CRMax createT_CRMaxWithT60(N_CR_T_CRMaxHyst t60)
    {
	T_CRMax __object = new T_CRMax();

	__object.setT60(t60);
	return __object;
    }
    
    public boolean hasT60()
    {
	return getChosenFlag() == t60_chosen;
    }
    
    public void setT60(N_CR_T_CRMaxHyst t60)
    {
	setChosenValue(t60);
	setChosenFlag(t60_chosen);
    }
    
    
    // Methods for field "t120"
    public static T_CRMax createT_CRMaxWithT120(N_CR_T_CRMaxHyst t120)
    {
	T_CRMax __object = new T_CRMax();

	__object.setT120(t120);
	return __object;
    }
    
    public boolean hasT120()
    {
	return getChosenFlag() == t120_chosen;
    }
    
    public void setT120(N_CR_T_CRMaxHyst t120)
    {
	setChosenValue(t120);
	setChosenFlag(t120_chosen);
    }
    
    
    // Methods for field "t180"
    public static T_CRMax createT_CRMaxWithT180(N_CR_T_CRMaxHyst t180)
    {
	T_CRMax __object = new T_CRMax();

	__object.setT180(t180);
	return __object;
    }
    
    public boolean hasT180()
    {
	return getChosenFlag() == t180_chosen;
    }
    
    public void setT180(N_CR_T_CRMaxHyst t180)
    {
	setChosenValue(t180);
	setChosenFlag(t180_chosen);
    }
    
    
    // Methods for field "t240"
    public static T_CRMax createT_CRMaxWithT240(N_CR_T_CRMaxHyst t240)
    {
	T_CRMax __object = new T_CRMax();

	__object.setT240(t240);
	return __object;
    }
    
    public boolean hasT240()
    {
	return getChosenFlag() == t240_chosen;
    }
    
    public void setT240(N_CR_T_CRMaxHyst t240)
    {
	setChosenValue(t240);
	setChosenFlag(t240_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case notUsed_chosen:
		return new Null();
	    case t30_chosen:
		return new N_CR_T_CRMaxHyst();
	    case t60_chosen:
		return new N_CR_T_CRMaxHyst();
	    case t120_chosen:
		return new N_CR_T_CRMaxHyst();
	    case t180_chosen:
		return new N_CR_T_CRMaxHyst();
	    case t240_chosen:
		return new N_CR_T_CRMaxHyst();
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
	    "T_CRMax"
	),
	new QName (
	    "InformationElements",
	    "T-CRMax"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "notUsed",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_CR_T_CRMaxHyst"
			    ),
			    new QName (
				"InformationElements",
				"N-CR-T-CRMaxHyst"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "N_CR_T_CRMaxHyst"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "N_CR_T_CRMaxHyst"
				)
			    ),
			    0
			)
		    ),
		    "t30",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_CR_T_CRMaxHyst"
			    ),
			    new QName (
				"InformationElements",
				"N-CR-T-CRMaxHyst"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "N_CR_T_CRMaxHyst"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "N_CR_T_CRMaxHyst"
				)
			    ),
			    0
			)
		    ),
		    "t60",
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
				"N_CR_T_CRMaxHyst"
			    ),
			    new QName (
				"InformationElements",
				"N-CR-T-CRMaxHyst"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "N_CR_T_CRMaxHyst"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "N_CR_T_CRMaxHyst"
				)
			    ),
			    0
			)
		    ),
		    "t120",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_CR_T_CRMaxHyst"
			    ),
			    new QName (
				"InformationElements",
				"N-CR-T-CRMaxHyst"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "N_CR_T_CRMaxHyst"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "N_CR_T_CRMaxHyst"
				)
			    ),
			    0
			)
		    ),
		    "t180",
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
				"N_CR_T_CRMaxHyst"
			    ),
			    new QName (
				"InformationElements",
				"N-CR-T-CRMaxHyst"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "N_CR_T_CRMaxHyst"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "N_CR_T_CRMaxHyst"
				)
			    ),
			    0
			)
		    ),
		    "t240",
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
     * Get the type descriptor (TypeInfo) of 'this' T_CRMax object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_CRMax object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_CRMax
