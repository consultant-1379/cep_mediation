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
 * Define the ASN1 Type MBMS_ConnectedModeCountingScope from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_ConnectedModeCountingScope extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_ConnectedModeCountingScope()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_ConnectedModeCountingScope(BOOLEAN countingForUraPCH, 
		    BOOLEAN countingForCellPCH, BOOLEAN countingForCellFACH)
    {
	setCountingForUraPCH(countingForUraPCH);
	setCountingForCellPCH(countingForCellPCH);
	setCountingForCellFACH(countingForCellFACH);
    }
    
    /**
     * Construct with components.
     */
    public MBMS_ConnectedModeCountingScope(boolean countingForUraPCH, 
		    boolean countingForCellPCH, boolean countingForCellFACH)
    {
	this(new BOOLEAN(countingForUraPCH), 
	     new BOOLEAN(countingForCellPCH), 
	     new BOOLEAN(countingForCellFACH));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "countingForUraPCH"
    public boolean getCountingForUraPCH()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setCountingForUraPCH(boolean countingForUraPCH)
    {
	setCountingForUraPCH(new BOOLEAN(countingForUraPCH));
    }
    
    public void setCountingForUraPCH(BOOLEAN countingForUraPCH)
    {
	mComponents[0] = countingForUraPCH;
    }
    
    
    // Methods for field "countingForCellPCH"
    public boolean getCountingForCellPCH()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setCountingForCellPCH(boolean countingForCellPCH)
    {
	setCountingForCellPCH(new BOOLEAN(countingForCellPCH));
    }
    
    public void setCountingForCellPCH(BOOLEAN countingForCellPCH)
    {
	mComponents[1] = countingForCellPCH;
    }
    
    
    // Methods for field "countingForCellFACH"
    public boolean getCountingForCellFACH()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setCountingForCellFACH(boolean countingForCellFACH)
    {
	setCountingForCellFACH(new BOOLEAN(countingForCellFACH));
    }
    
    public void setCountingForCellFACH(BOOLEAN countingForCellFACH)
    {
	mComponents[2] = countingForCellFACH;
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
	    "MBMS_ConnectedModeCountingScope"
	),
	new QName (
	    "InformationElements",
	    "MBMS-ConnectedModeCountingScope"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "countingForUraPCH",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "countingForCellPCH",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "countingForCellFACH",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_ConnectedModeCountingScope object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_ConnectedModeCountingScope object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_ConnectedModeCountingScope
