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
 * Define the ASN1 Type UE_InternalEventResults from ASN1 Module InformationElements.
 * @see Choice
 */

public class UE_InternalEventResults extends Choice {
    
    /**
     * The default constructor.
     */
    public UE_InternalEventResults()
    {
    }
    
    public static final  int  event6a_chosen = 1;
    public static final  int  event6b_chosen = 2;
    public static final  int  event6c_chosen = 3;
    public static final  int  event6d_chosen = 4;
    public static final  int  event6e_chosen = 5;
    public static final  int  event6f_chosen = 6;
    public static final  int  event6g_chosen = 7;
    public static final  int  spare_chosen = 8;
    
    // Methods for field "event6a"
    public static UE_InternalEventResults createUE_InternalEventResultsWithEvent6a(Null event6a)
    {
	UE_InternalEventResults __object = new UE_InternalEventResults();

	__object.setEvent6a(event6a);
	return __object;
    }
    
    public boolean hasEvent6a()
    {
	return getChosenFlag() == event6a_chosen;
    }
    
    public void setEvent6a(Null event6a)
    {
	setChosenValue(event6a);
	setChosenFlag(event6a_chosen);
    }
    
    
    // Methods for field "event6b"
    public static UE_InternalEventResults createUE_InternalEventResultsWithEvent6b(Null event6b)
    {
	UE_InternalEventResults __object = new UE_InternalEventResults();

	__object.setEvent6b(event6b);
	return __object;
    }
    
    public boolean hasEvent6b()
    {
	return getChosenFlag() == event6b_chosen;
    }
    
    public void setEvent6b(Null event6b)
    {
	setChosenValue(event6b);
	setChosenFlag(event6b_chosen);
    }
    
    
    // Methods for field "event6c"
    public static UE_InternalEventResults createUE_InternalEventResultsWithEvent6c(Null event6c)
    {
	UE_InternalEventResults __object = new UE_InternalEventResults();

	__object.setEvent6c(event6c);
	return __object;
    }
    
    public boolean hasEvent6c()
    {
	return getChosenFlag() == event6c_chosen;
    }
    
    public void setEvent6c(Null event6c)
    {
	setChosenValue(event6c);
	setChosenFlag(event6c_chosen);
    }
    
    
    // Methods for field "event6d"
    public static UE_InternalEventResults createUE_InternalEventResultsWithEvent6d(Null event6d)
    {
	UE_InternalEventResults __object = new UE_InternalEventResults();

	__object.setEvent6d(event6d);
	return __object;
    }
    
    public boolean hasEvent6d()
    {
	return getChosenFlag() == event6d_chosen;
    }
    
    public void setEvent6d(Null event6d)
    {
	setChosenValue(event6d);
	setChosenFlag(event6d_chosen);
    }
    
    
    // Methods for field "event6e"
    public static UE_InternalEventResults createUE_InternalEventResultsWithEvent6e(Null event6e)
    {
	UE_InternalEventResults __object = new UE_InternalEventResults();

	__object.setEvent6e(event6e);
	return __object;
    }
    
    public boolean hasEvent6e()
    {
	return getChosenFlag() == event6e_chosen;
    }
    
    public void setEvent6e(Null event6e)
    {
	setChosenValue(event6e);
	setChosenFlag(event6e_chosen);
    }
    
    
    // Methods for field "event6f"
    public static UE_InternalEventResults createUE_InternalEventResultsWithEvent6f(PrimaryCPICH_Info event6f)
    {
	UE_InternalEventResults __object = new UE_InternalEventResults();

	__object.setEvent6f(event6f);
	return __object;
    }
    
    public boolean hasEvent6f()
    {
	return getChosenFlag() == event6f_chosen;
    }
    
    public void setEvent6f(PrimaryCPICH_Info event6f)
    {
	setChosenValue(event6f);
	setChosenFlag(event6f_chosen);
    }
    
    
    // Methods for field "event6g"
    public static UE_InternalEventResults createUE_InternalEventResultsWithEvent6g(PrimaryCPICH_Info event6g)
    {
	UE_InternalEventResults __object = new UE_InternalEventResults();

	__object.setEvent6g(event6g);
	return __object;
    }
    
    public boolean hasEvent6g()
    {
	return getChosenFlag() == event6g_chosen;
    }
    
    public void setEvent6g(PrimaryCPICH_Info event6g)
    {
	setChosenValue(event6g);
	setChosenFlag(event6g_chosen);
    }
    
    
    // Methods for field "spare"
    public static UE_InternalEventResults createUE_InternalEventResultsWithSpare(Null spare)
    {
	UE_InternalEventResults __object = new UE_InternalEventResults();

	__object.setSpare(spare);
	return __object;
    }
    
    public boolean hasSpare()
    {
	return getChosenFlag() == spare_chosen;
    }
    
    public void setSpare(Null spare)
    {
	setChosenValue(spare);
	setChosenFlag(spare_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case event6a_chosen:
		return new Null();
	    case event6b_chosen:
		return new Null();
	    case event6c_chosen:
		return new Null();
	    case event6d_chosen:
		return new Null();
	    case event6e_chosen:
		return new Null();
	    case event6f_chosen:
		return new PrimaryCPICH_Info();
	    case event6g_chosen:
		return new PrimaryCPICH_Info();
	    case spare_chosen:
		return new Null();
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
	    "UE_InternalEventResults"
	),
	new QName (
	    "InformationElements",
	    "UE-InternalEventResults"
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
		    "event6a",
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
		    "event6b",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "event6c",
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
		    "event6d",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "event6e",
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
				"PrimaryCPICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCPICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0
			)
		    ),
		    "event6f",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PrimaryCPICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCPICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0
			)
		    ),
		    "event6g",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "spare",
		    7,
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
		new TagDecoderElement((short)0x8007, 7)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_InternalEventResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_InternalEventResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_InternalEventResults
