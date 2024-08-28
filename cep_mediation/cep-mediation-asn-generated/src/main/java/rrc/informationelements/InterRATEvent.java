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
 * Define the ASN1 Type InterRATEvent from ASN1 Module InformationElements.
 * @see Choice
 */

public class InterRATEvent extends Choice {
    
    /**
     * The default constructor.
     */
    public InterRATEvent()
    {
    }
    
    public static final  int  event3a_chosen = 1;
    public static final  int  event3b_chosen = 2;
    public static final  int  event3c_chosen = 3;
    public static final  int  event3d_chosen = 4;
    
    // Methods for field "event3a"
    public static InterRATEvent createInterRATEventWithEvent3a(Event3a event3a)
    {
	InterRATEvent __object = new InterRATEvent();

	__object.setEvent3a(event3a);
	return __object;
    }
    
    public boolean hasEvent3a()
    {
	return getChosenFlag() == event3a_chosen;
    }
    
    public void setEvent3a(Event3a event3a)
    {
	setChosenValue(event3a);
	setChosenFlag(event3a_chosen);
    }
    
    
    // Methods for field "event3b"
    public static InterRATEvent createInterRATEventWithEvent3b(Event3b event3b)
    {
	InterRATEvent __object = new InterRATEvent();

	__object.setEvent3b(event3b);
	return __object;
    }
    
    public boolean hasEvent3b()
    {
	return getChosenFlag() == event3b_chosen;
    }
    
    public void setEvent3b(Event3b event3b)
    {
	setChosenValue(event3b);
	setChosenFlag(event3b_chosen);
    }
    
    
    // Methods for field "event3c"
    public static InterRATEvent createInterRATEventWithEvent3c(Event3c event3c)
    {
	InterRATEvent __object = new InterRATEvent();

	__object.setEvent3c(event3c);
	return __object;
    }
    
    public boolean hasEvent3c()
    {
	return getChosenFlag() == event3c_chosen;
    }
    
    public void setEvent3c(Event3c event3c)
    {
	setChosenValue(event3c);
	setChosenFlag(event3c_chosen);
    }
    
    
    // Methods for field "event3d"
    public static InterRATEvent createInterRATEventWithEvent3d(Event3d event3d)
    {
	InterRATEvent __object = new InterRATEvent();

	__object.setEvent3d(event3d);
	return __object;
    }
    
    public boolean hasEvent3d()
    {
	return getChosenFlag() == event3d_chosen;
    }
    
    public void setEvent3d(Event3d event3d)
    {
	setChosenValue(event3d);
	setChosenFlag(event3d_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case event3a_chosen:
		return new Event3a();
	    case event3b_chosen:
		return new Event3b();
	    case event3c_chosen:
		return new Event3c();
	    case event3d_chosen:
		return new Event3d();
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
	    "InterRATEvent"
	),
	new QName (
	    "InformationElements",
	    "InterRATEvent"
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
				"Event3a"
			    ),
			    new QName (
				"InformationElements",
				"Event3a"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event3a"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event3a"
				)
			    ),
			    0
			)
		    ),
		    "event3a",
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
				"Event3b"
			    ),
			    new QName (
				"InformationElements",
				"Event3b"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event3b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event3b"
				)
			    ),
			    0
			)
		    ),
		    "event3b",
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
				"Event3c"
			    ),
			    new QName (
				"InformationElements",
				"Event3c"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event3c"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event3c"
				)
			    ),
			    0
			)
		    ),
		    "event3c",
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
				"Event3d"
			    ),
			    new QName (
				"InformationElements",
				"Event3d"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Event3d"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Event3d"
				)
			    ),
			    0
			)
		    ),
		    "event3d",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATEvent object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATEvent object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATEvent
