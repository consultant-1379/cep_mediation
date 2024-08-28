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
 * Define the ASN1 Type IntraFreqEventOnSecULFreq from ASN1 Module InformationElements.
 * @see Choice
 */

public class IntraFreqEventOnSecULFreq extends Choice {
    
    /**
     * The default constructor.
     */
    public IntraFreqEventOnSecULFreq()
    {
    }
    
    public static final  int  e1a_chosen = 1;
    public static final  int  e1b_chosen = 2;
    public static final  int  e1c_chosen = 3;
    public static final  int  e1e_chosen = 4;
    public static final  int  e1f_chosen = 5;
    
    // Methods for field "e1a"
    public static IntraFreqEventOnSecULFreq createIntraFreqEventOnSecULFreqWithE1a(Event1a_OnSecUlFreq_r9 e1a)
    {
	IntraFreqEventOnSecULFreq __object = new IntraFreqEventOnSecULFreq();

	__object.setE1a(e1a);
	return __object;
    }
    
    public boolean hasE1a()
    {
	return getChosenFlag() == e1a_chosen;
    }
    
    public void setE1a(Event1a_OnSecUlFreq_r9 e1a)
    {
	setChosenValue(e1a);
	setChosenFlag(e1a_chosen);
    }
    
    
    // Methods for field "e1b"
    public static IntraFreqEventOnSecULFreq createIntraFreqEventOnSecULFreqWithE1b(Event1b_OnSecUlFreq_r9 e1b)
    {
	IntraFreqEventOnSecULFreq __object = new IntraFreqEventOnSecULFreq();

	__object.setE1b(e1b);
	return __object;
    }
    
    public boolean hasE1b()
    {
	return getChosenFlag() == e1b_chosen;
    }
    
    public void setE1b(Event1b_OnSecUlFreq_r9 e1b)
    {
	setChosenValue(e1b);
	setChosenFlag(e1b_chosen);
    }
    
    
    // Methods for field "e1c"
    public static IntraFreqEventOnSecULFreq createIntraFreqEventOnSecULFreqWithE1c(Event1c e1c)
    {
	IntraFreqEventOnSecULFreq __object = new IntraFreqEventOnSecULFreq();

	__object.setE1c(e1c);
	return __object;
    }
    
    public boolean hasE1c()
    {
	return getChosenFlag() == e1c_chosen;
    }
    
    public void setE1c(Event1c e1c)
    {
	setChosenValue(e1c);
	setChosenFlag(e1c_chosen);
    }
    
    
    // Methods for field "e1e"
    public static IntraFreqEventOnSecULFreq createIntraFreqEventOnSecULFreqWithE1e(Event1e_r6 e1e)
    {
	IntraFreqEventOnSecULFreq __object = new IntraFreqEventOnSecULFreq();

	__object.setE1e(e1e);
	return __object;
    }
    
    public boolean hasE1e()
    {
	return getChosenFlag() == e1e_chosen;
    }
    
    public void setE1e(Event1e_r6 e1e)
    {
	setChosenValue(e1e);
	setChosenFlag(e1e_chosen);
    }
    
    
    // Methods for field "e1f"
    public static IntraFreqEventOnSecULFreq createIntraFreqEventOnSecULFreqWithE1f(Event1f_r6 e1f)
    {
	IntraFreqEventOnSecULFreq __object = new IntraFreqEventOnSecULFreq();

	__object.setE1f(e1f);
	return __object;
    }
    
    public boolean hasE1f()
    {
	return getChosenFlag() == e1f_chosen;
    }
    
    public void setE1f(Event1f_r6 e1f)
    {
	setChosenValue(e1f);
	setChosenFlag(e1f_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case e1a_chosen:
		return new Event1a_OnSecUlFreq_r9();
	    case e1b_chosen:
		return new Event1b_OnSecUlFreq_r9();
	    case e1c_chosen:
		return new Event1c();
	    case e1e_chosen:
		return new Event1e_r6();
	    case e1f_chosen:
		return new Event1f_r6();
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
	    "IntraFreqEventOnSecULFreq"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqEventOnSecULFreq"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Event1a_OnSecUlFreq_r9"
			    ),
			    new QName (
				"InformationElements",
				"Event1a-OnSecUlFreq-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event1a_OnSecUlFreq_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event1a_OnSecUlFreq_r9"
				)
			    ),
			    0
			)
		    ),
		    "e1a",
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
				"Event1b_OnSecUlFreq_r9"
			    ),
			    new QName (
				"InformationElements",
				"Event1b-OnSecUlFreq-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event1b_OnSecUlFreq_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event1b_OnSecUlFreq_r9"
				)
			    ),
			    0
			)
		    ),
		    "e1b",
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
				"Event1c"
			    ),
			    new QName (
				"InformationElements",
				"Event1c"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event1c"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event1c"
				)
			    ),
			    0
			)
		    ),
		    "e1c",
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
				"Event1e_r6"
			    ),
			    new QName (
				"InformationElements",
				"Event1e-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event1e_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event1e_r6"
				)
			    ),
			    0
			)
		    ),
		    "e1e",
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
				"Event1f_r6"
			    ),
			    new QName (
				"InformationElements",
				"Event1f-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event1f_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event1f_r6"
				)
			    ),
			    0
			)
		    ),
		    "e1f",
		    4,
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
		new TagDecoderElement((short)0x8004, 4)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqEventOnSecULFreq object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqEventOnSecULFreq object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqEventOnSecULFreq
