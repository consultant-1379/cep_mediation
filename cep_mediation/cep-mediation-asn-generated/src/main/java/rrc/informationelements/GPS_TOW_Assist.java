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
 * Define the ASN1 Type GPS_TOW_Assist from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GPS_TOW_Assist extends Sequence {
    
    /**
     * The default constructor.
     */
    public GPS_TOW_Assist()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GPS_TOW_Assist(SatID satID, BitString tlm_Message, 
		    BitString tlm_Reserved, BOOLEAN alert, BOOLEAN antiSpoof)
    {
	setSatID(satID);
	setTlm_Message(tlm_Message);
	setTlm_Reserved(tlm_Reserved);
	setAlert(alert);
	setAntiSpoof(antiSpoof);
    }
    
    /**
     * Construct with components.
     */
    public GPS_TOW_Assist(SatID satID, BitString tlm_Message, 
		    BitString tlm_Reserved, boolean alert, boolean antiSpoof)
    {
	this(satID, tlm_Message, tlm_Reserved, new BOOLEAN(alert), 
	     new BOOLEAN(antiSpoof));
    }
    
    public void initComponents()
    {
	mComponents[0] = new SatID();
	mComponents[1] = new BitString();
	mComponents[2] = new BitString();
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new SatID();
	    case 1:
		return new BitString();
	    case 2:
		return new BitString();
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "satID"
    public SatID getSatID()
    {
	return (SatID)mComponents[0];
    }
    
    public void setSatID(SatID satID)
    {
	mComponents[0] = satID;
    }
    
    
    // Methods for field "tlm_Message"
    public BitString getTlm_Message()
    {
	return (BitString)mComponents[1];
    }
    
    public void setTlm_Message(BitString tlm_Message)
    {
	mComponents[1] = tlm_Message;
    }
    
    
    // Methods for field "tlm_Reserved"
    public BitString getTlm_Reserved()
    {
	return (BitString)mComponents[2];
    }
    
    public void setTlm_Reserved(BitString tlm_Reserved)
    {
	mComponents[2] = tlm_Reserved;
    }
    
    
    // Methods for field "alert"
    public boolean getAlert()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setAlert(boolean alert)
    {
	setAlert(new BOOLEAN(alert));
    }
    
    public void setAlert(BOOLEAN alert)
    {
	mComponents[3] = alert;
    }
    
    
    // Methods for field "antiSpoof"
    public boolean getAntiSpoof()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setAntiSpoof(boolean antiSpoof)
    {
	setAntiSpoof(new BOOLEAN(antiSpoof));
    }
    
    public void setAntiSpoof(BOOLEAN antiSpoof)
    {
	mComponents[4] = antiSpoof;
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
	    "GPS_TOW_Assist"
	),
	new QName (
	    "InformationElements",
	    "GPS-TOW-Assist"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SatID"
			    ),
			    new QName (
				"InformationElements",
				"SatID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SatID(0), 
				    new SatID(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "satID",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(14)
				)
			    ),
			    new Bounds (
				new java.lang.Long(14),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "tlm-Message",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BitString"
			    ),
			    new QName (
				"builtin",
				"BIT STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(2)
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(2)
			    ),
			    null
			)
		    ),
		    "tlm-Reserved",
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
		    "alert",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "antiSpoof",
		    4,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GPS_TOW_Assist object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GPS_TOW_Assist object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GPS_TOW_Assist
