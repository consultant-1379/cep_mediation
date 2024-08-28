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
 * Define the ASN1 Type InterFreqEvent from ASN1 Module InformationElements.
 * @see Choice
 */

public class InterFreqEvent extends Choice {
    
    /**
     * The default constructor.
     */
    public InterFreqEvent()
    {
    }
    
    public static final  int  event2a_chosen = 1;
    public static final  int  event2b_chosen = 2;
    public static final  int  event2c_chosen = 3;
    public static final  int  event2d_chosen = 4;
    public static final  int  event2e_chosen = 5;
    public static final  int  event2f_chosen = 6;
    
    // Methods for field "event2a"
    public static InterFreqEvent createInterFreqEventWithEvent2a(Event2a event2a)
    {
	InterFreqEvent __object = new InterFreqEvent();

	__object.setEvent2a(event2a);
	return __object;
    }
    
    public boolean hasEvent2a()
    {
	return getChosenFlag() == event2a_chosen;
    }
    
    public void setEvent2a(Event2a event2a)
    {
	setChosenValue(event2a);
	setChosenFlag(event2a_chosen);
    }
    
    
    // Methods for field "event2b"
    public static InterFreqEvent createInterFreqEventWithEvent2b(Event2b event2b)
    {
	InterFreqEvent __object = new InterFreqEvent();

	__object.setEvent2b(event2b);
	return __object;
    }
    
    public boolean hasEvent2b()
    {
	return getChosenFlag() == event2b_chosen;
    }
    
    public void setEvent2b(Event2b event2b)
    {
	setChosenValue(event2b);
	setChosenFlag(event2b_chosen);
    }
    
    
    // Methods for field "event2c"
    public static InterFreqEvent createInterFreqEventWithEvent2c(Event2c event2c)
    {
	InterFreqEvent __object = new InterFreqEvent();

	__object.setEvent2c(event2c);
	return __object;
    }
    
    public boolean hasEvent2c()
    {
	return getChosenFlag() == event2c_chosen;
    }
    
    public void setEvent2c(Event2c event2c)
    {
	setChosenValue(event2c);
	setChosenFlag(event2c_chosen);
    }
    
    
    // Methods for field "event2d"
    public static InterFreqEvent createInterFreqEventWithEvent2d(Event2d event2d)
    {
	InterFreqEvent __object = new InterFreqEvent();

	__object.setEvent2d(event2d);
	return __object;
    }
    
    public boolean hasEvent2d()
    {
	return getChosenFlag() == event2d_chosen;
    }
    
    public void setEvent2d(Event2d event2d)
    {
	setChosenValue(event2d);
	setChosenFlag(event2d_chosen);
    }
    
    
    // Methods for field "event2e"
    public static InterFreqEvent createInterFreqEventWithEvent2e(Event2e event2e)
    {
	InterFreqEvent __object = new InterFreqEvent();

	__object.setEvent2e(event2e);
	return __object;
    }
    
    public boolean hasEvent2e()
    {
	return getChosenFlag() == event2e_chosen;
    }
    
    public void setEvent2e(Event2e event2e)
    {
	setChosenValue(event2e);
	setChosenFlag(event2e_chosen);
    }
    
    
    // Methods for field "event2f"
    public static InterFreqEvent createInterFreqEventWithEvent2f(Event2f event2f)
    {
	InterFreqEvent __object = new InterFreqEvent();

	__object.setEvent2f(event2f);
	return __object;
    }
    
    public boolean hasEvent2f()
    {
	return getChosenFlag() == event2f_chosen;
    }
    
    public void setEvent2f(Event2f event2f)
    {
	setChosenValue(event2f);
	setChosenFlag(event2f_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case event2a_chosen:
		return new Event2a();
	    case event2b_chosen:
		return new Event2b();
	    case event2c_chosen:
		return new Event2c();
	    case event2d_chosen:
		return new Event2d();
	    case event2e_chosen:
		return new Event2e();
	    case event2f_chosen:
		return new Event2f();
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
	    "InterFreqEvent"
	),
	new QName (
	    "InformationElements",
	    "InterFreqEvent"
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
				"Event2a"
			    ),
			    new QName (
				"InformationElements",
				"Event2a"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event2a"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event2a"
				)
			    ),
			    0
			)
		    ),
		    "event2a",
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
				"Event2b"
			    ),
			    new QName (
				"InformationElements",
				"Event2b"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event2b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event2b"
				)
			    ),
			    0
			)
		    ),
		    "event2b",
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
				"Event2c"
			    ),
			    new QName (
				"InformationElements",
				"Event2c"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event2c"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event2c"
				)
			    ),
			    0
			)
		    ),
		    "event2c",
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
				"Event2d"
			    ),
			    new QName (
				"InformationElements",
				"Event2d"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event2d"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event2d"
				)
			    ),
			    0
			)
		    ),
		    "event2d",
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
				"Event2e"
			    ),
			    new QName (
				"InformationElements",
				"Event2e"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event2e"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event2e"
				)
			    ),
			    0
			)
		    ),
		    "event2e",
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
				"Event2f"
			    ),
			    new QName (
				"InformationElements",
				"Event2f"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event2f"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event2f"
				)
			    ),
			    0
			)
		    ),
		    "event2f",
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
     * Get the type descriptor (TypeInfo) of 'this' InterFreqEvent object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterFreqEvent object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterFreqEvent
