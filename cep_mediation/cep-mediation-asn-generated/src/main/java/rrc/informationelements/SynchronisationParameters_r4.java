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
 * Define the ASN1 Type SynchronisationParameters_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SynchronisationParameters_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SynchronisationParameters_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SynchronisationParameters_r4(Sync_UL_CodesBitmap sync_UL_CodesBitmap, 
		    FPACH_Info_r4 fpach_Info, INTEGER prxUpPCHdes, 
		    SYNC_UL_Procedure_r4 sync_UL_Procedure)
    {
	setSync_UL_CodesBitmap(sync_UL_CodesBitmap);
	setFpach_Info(fpach_Info);
	setPrxUpPCHdes(prxUpPCHdes);
	setSync_UL_Procedure(sync_UL_Procedure);
    }
    
    /**
     * Construct with components.
     */
    public SynchronisationParameters_r4(Sync_UL_CodesBitmap sync_UL_CodesBitmap, 
		    FPACH_Info_r4 fpach_Info, long prxUpPCHdes, 
		    SYNC_UL_Procedure_r4 sync_UL_Procedure)
    {
	this(sync_UL_CodesBitmap, fpach_Info, new INTEGER(prxUpPCHdes), 
	     sync_UL_Procedure);
    }
    
    /**
     * Construct with required components.
     */
    public SynchronisationParameters_r4(Sync_UL_CodesBitmap sync_UL_CodesBitmap, 
		    FPACH_Info_r4 fpach_Info, long prxUpPCHdes)
    {
	setSync_UL_CodesBitmap(sync_UL_CodesBitmap);
	setFpach_Info(fpach_Info);
	setPrxUpPCHdes(prxUpPCHdes);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Sync_UL_CodesBitmap();
	mComponents[1] = new FPACH_Info_r4();
	mComponents[2] = new INTEGER();
	mComponents[3] = new SYNC_UL_Procedure_r4();
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
		return new Sync_UL_CodesBitmap();
	    case 1:
		return new FPACH_Info_r4();
	    case 2:
		return new INTEGER();
	    case 3:
		return new SYNC_UL_Procedure_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sync_UL_CodesBitmap"
    public Sync_UL_CodesBitmap getSync_UL_CodesBitmap()
    {
	return (Sync_UL_CodesBitmap)mComponents[0];
    }
    
    public void setSync_UL_CodesBitmap(Sync_UL_CodesBitmap sync_UL_CodesBitmap)
    {
	mComponents[0] = sync_UL_CodesBitmap;
    }
    
    
    
    /**
     * Define the ASN1 Type Sync_UL_CodesBitmap from ASN1 Module InformationElements.
     * @see BitString
     */
    public static class Sync_UL_CodesBitmap extends BitString {
	
	/**
	 * The default constructor.
	 */
	public Sync_UL_CodesBitmap()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public Sync_UL_CodesBitmap(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public Sync_UL_CodesBitmap(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	// Named list definitions.
	public static final int code7 = 0;
	public static final int code6 = 1;
	public static final int code5 = 2;
	public static final int code4 = 3;
	public static final int code3 = 4;
	public static final int code2 = 5;
	public static final int code1 = 6;
	public static final int code0 = 7;
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final BitStringInfo c_typeinfo = new BitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SynchronisationParameters_r4$Sync_UL_CodesBitmap"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    new SizeConstraint (
		new SingleValueConstraint (
		    new com.oss.asn1.INTEGER(8)
		)
	    ),
	    new Bounds (
		new java.lang.Long(8),
		new java.lang.Long(8)
	    ),
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"code7",
			0
		    ),
		    new MemberListElement (
			"code6",
			1
		    ),
		    new MemberListElement (
			"code5",
			2
		    ),
		    new MemberListElement (
			"code4",
			3
		    ),
		    new MemberListElement (
			"code3",
			4
		    ),
		    new MemberListElement (
			"code2",
			5
		    ),
		    new MemberListElement (
			"code1",
			6
		    ),
		    new MemberListElement (
			"code0",
			7
		    )
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Sync_UL_CodesBitmap object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sync_UL_CodesBitmap object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sync_UL_CodesBitmap

    // Methods for field "fpach_Info"
    public FPACH_Info_r4 getFpach_Info()
    {
	return (FPACH_Info_r4)mComponents[1];
    }
    
    public void setFpach_Info(FPACH_Info_r4 fpach_Info)
    {
	mComponents[1] = fpach_Info;
    }
    
    
    // Methods for field "prxUpPCHdes"
    public long getPrxUpPCHdes()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setPrxUpPCHdes(long prxUpPCHdes)
    {
	setPrxUpPCHdes(new INTEGER(prxUpPCHdes));
    }
    
    public void setPrxUpPCHdes(INTEGER prxUpPCHdes)
    {
	mComponents[2] = prxUpPCHdes;
    }
    
    
    // Methods for field "sync_UL_Procedure"
    public SYNC_UL_Procedure_r4 getSync_UL_Procedure()
    {
	return (SYNC_UL_Procedure_r4)mComponents[3];
    }
    
    public void setSync_UL_Procedure(SYNC_UL_Procedure_r4 sync_UL_Procedure)
    {
	mComponents[3] = sync_UL_Procedure;
    }
    
    public boolean hasSync_UL_Procedure()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSync_UL_Procedure()
    {
	setComponentAbsent(3);
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
	    "SynchronisationParameters_r4"
	),
	new QName (
	    "InformationElements",
	    "SynchronisationParameters-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SynchronisationParameters_r4$Sync_UL_CodesBitmap"
			)
		    ),
		    "sync-UL-CodesBitmap",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"FPACH_Info_r4"
			    ),
			    new QName (
				"InformationElements",
				"FPACH-Info-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FPACH_Info_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FPACH_Info_r4"
				)
			    ),
			    0
			)
		    ),
		    "fpach-Info",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(62),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(62)
			    ),
			    null
			)
		    ),
		    "prxUpPCHdes",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SYNC_UL_Procedure_r4"
			    ),
			    new QName (
				"InformationElements",
				"SYNC-UL-Procedure-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SYNC_UL_Procedure_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SYNC_UL_Procedure_r4"
				)
			    ),
			    0
			)
		    ),
		    "sync-UL-Procedure",
		    3,
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' SynchronisationParameters_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SynchronisationParameters_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SynchronisationParameters_r4
