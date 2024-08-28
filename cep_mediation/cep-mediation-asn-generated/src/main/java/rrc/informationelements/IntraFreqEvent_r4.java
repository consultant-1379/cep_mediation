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
 * Define the ASN1 Type IntraFreqEvent_r4 from ASN1 Module InformationElements.
 * @see Choice
 */

public class IntraFreqEvent_r4 extends Choice {
    
    /**
     * The default constructor.
     */
    public IntraFreqEvent_r4()
    {
    }
    
    public static final  int  e1a_chosen = 1;
    public static final  int  e1b_chosen = 2;
    public static final  int  e1c_chosen = 3;
    public static final  int  e1d_chosen = 4;
    public static final  int  e1e_chosen = 5;
    public static final  int  e1f_chosen = 6;
    public static final  int  e1g_chosen = 7;
    public static final  int  e1h_chosen = 8;
    public static final  int  e1i_chosen = 9;
    
    // Methods for field "e1a"
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1a(Event1a_r4 e1a)
    {
	IntraFreqEvent_r4 __object = new IntraFreqEvent_r4();

	__object.setE1a(e1a);
	return __object;
    }
    
    public boolean hasE1a()
    {
	return getChosenFlag() == e1a_chosen;
    }
    
    public void setE1a(Event1a_r4 e1a)
    {
	setChosenValue(e1a);
	setChosenFlag(e1a_chosen);
    }
    
    
    // Methods for field "e1b"
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1b(Event1b_r4 e1b)
    {
	IntraFreqEvent_r4 __object = new IntraFreqEvent_r4();

	__object.setE1b(e1b);
	return __object;
    }
    
    public boolean hasE1b()
    {
	return getChosenFlag() == e1b_chosen;
    }
    
    public void setE1b(Event1b_r4 e1b)
    {
	setChosenValue(e1b);
	setChosenFlag(e1b_chosen);
    }
    
    
    // Methods for field "e1c"
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1c(Event1c e1c)
    {
	IntraFreqEvent_r4 __object = new IntraFreqEvent_r4();

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
    
    
    // Methods for field "e1d"
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1d(Null e1d)
    {
	IntraFreqEvent_r4 __object = new IntraFreqEvent_r4();

	__object.setE1d(e1d);
	return __object;
    }
    
    public boolean hasE1d()
    {
	return getChosenFlag() == e1d_chosen;
    }
    
    public void setE1d(Null e1d)
    {
	setChosenValue(e1d);
	setChosenFlag(e1d_chosen);
    }
    
    
    // Methods for field "e1e"
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1e(Event1e e1e)
    {
	IntraFreqEvent_r4 __object = new IntraFreqEvent_r4();

	__object.setE1e(e1e);
	return __object;
    }
    
    public boolean hasE1e()
    {
	return getChosenFlag() == e1e_chosen;
    }
    
    public void setE1e(Event1e e1e)
    {
	setChosenValue(e1e);
	setChosenFlag(e1e_chosen);
    }
    
    
    // Methods for field "e1f"
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1f(Event1f e1f)
    {
	IntraFreqEvent_r4 __object = new IntraFreqEvent_r4();

	__object.setE1f(e1f);
	return __object;
    }
    
    public boolean hasE1f()
    {
	return getChosenFlag() == e1f_chosen;
    }
    
    public void setE1f(Event1f e1f)
    {
	setChosenValue(e1f);
	setChosenFlag(e1f_chosen);
    }
    
    
    // Methods for field "e1g"
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1g(Null e1g)
    {
	IntraFreqEvent_r4 __object = new IntraFreqEvent_r4();

	__object.setE1g(e1g);
	return __object;
    }
    
    public boolean hasE1g()
    {
	return getChosenFlag() == e1g_chosen;
    }
    
    public void setE1g(Null e1g)
    {
	setChosenValue(e1g);
	setChosenFlag(e1g_chosen);
    }
    
    
    // Methods for field "e1h"
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1h(long e1h)
    {
	return createIntraFreqEvent_r4WithE1h(new ThresholdUsedFrequency(e1h));
    }
    
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1h(ThresholdUsedFrequency e1h)
    {
	IntraFreqEvent_r4 __object = new IntraFreqEvent_r4();

	__object.setE1h(e1h);
	return __object;
    }
    
    public boolean hasE1h()
    {
	return getChosenFlag() == e1h_chosen;
    }
    
    public void setE1h(long e1h)
    {
	setE1h(new ThresholdUsedFrequency(e1h));
    }
    
    public void setE1h(ThresholdUsedFrequency e1h)
    {
	setChosenValue(e1h);
	setChosenFlag(e1h_chosen);
    }
    
    
    // Methods for field "e1i"
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1i(long e1i)
    {
	return createIntraFreqEvent_r4WithE1i(new ThresholdUsedFrequency(e1i));
    }
    
    public static IntraFreqEvent_r4 createIntraFreqEvent_r4WithE1i(ThresholdUsedFrequency e1i)
    {
	IntraFreqEvent_r4 __object = new IntraFreqEvent_r4();

	__object.setE1i(e1i);
	return __object;
    }
    
    public boolean hasE1i()
    {
	return getChosenFlag() == e1i_chosen;
    }
    
    public void setE1i(long e1i)
    {
	setE1i(new ThresholdUsedFrequency(e1i));
    }
    
    public void setE1i(ThresholdUsedFrequency e1i)
    {
	setChosenValue(e1i);
	setChosenFlag(e1i_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case e1a_chosen:
		return new Event1a_r4();
	    case e1b_chosen:
		return new Event1b_r4();
	    case e1c_chosen:
		return new Event1c();
	    case e1d_chosen:
		return new Null();
	    case e1e_chosen:
		return new Event1e();
	    case e1f_chosen:
		return new Event1f();
	    case e1g_chosen:
		return new Null();
	    case e1h_chosen:
		return new ThresholdUsedFrequency();
	    case e1i_chosen:
		return new ThresholdUsedFrequency();
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
	    "IntraFreqEvent_r4"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqEvent-r4"
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
				"Event1a_r4"
			    ),
			    new QName (
				"InformationElements",
				"Event1a-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event1a_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event1a_r4"
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
				"Event1b_r4"
			    ),
			    new QName (
				"InformationElements",
				"Event1b-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event1b_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event1b_r4"
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
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "e1d",
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
				"Event1e"
			    ),
			    new QName (
				"InformationElements",
				"Event1e"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event1e"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event1e"
				)
			    ),
			    0
			)
		    ),
		    "e1e",
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
				"Event1f"
			    ),
			    new QName (
				"InformationElements",
				"Event1f"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event1f"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event1f"
				)
			    ),
			    0
			)
		    ),
		    "e1f",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "e1g",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ThresholdUsedFrequency"
			    ),
			    new QName (
				"InformationElements",
				"ThresholdUsedFrequency"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ThresholdUsedFrequency(-115), 
				    new ThresholdUsedFrequency(165),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-115),
				new java.lang.Long(165)
			    ),
			    null
			)
		    ),
		    "e1h",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ThresholdUsedFrequency"
			    ),
			    new QName (
				"InformationElements",
				"ThresholdUsedFrequency"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ThresholdUsedFrequency(-115), 
				    new ThresholdUsedFrequency(165),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-115),
				new java.lang.Long(165)
			    ),
			    null
			)
		    ),
		    "e1i",
		    8,
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
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7),
		new TagDecoderElement((short)0x8008, 8)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqEvent_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqEvent_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqEvent_r4
